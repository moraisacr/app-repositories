package me.dio.gitrepositoriesapp.data.repository

import kotlinx.coroutines.flow.Flow
import me.dio.gitrepositoriesapp.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}