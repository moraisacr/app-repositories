package me.dio.gitrepositoriesapp.domain

import kotlinx.coroutines.flow.Flow
import me.dio.gitrepositoriesapp.core.UseCase
import me.dio.gitrepositoriesapp.data.model.Repo
import me.dio.gitrepositoriesapp.data.repository.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}