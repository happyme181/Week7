package com.example.week7

interface ItemService {
    @Get ("items")
    suspend fun getAllItems (): List <Item>

}