package me.dio.gitrepositoriesapp.data.repository

import kotlinx.coroutines.flow.flow
import me.dio.gitrepositoriesapp.core.RemoteException
import me.dio.gitrepositoriesapp.data.service.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Failed to search! Please, try again later.")
        }
    }
}