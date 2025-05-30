package org.example.message

sealed interface Message

open class MyMessage(val userId: Int) : Message

open class OtherMessage(val userId: Int, val profileImage: String) : Message

class MyImageMessage(
    userId: Int,
    val imageUrl: String
) : MyMessage(userId)


class OtherImageMessage(
    userId: Int,
    profileImage: String,
    val imageUrl: String
) : OtherMessage(userId, profileImage)

class Some()
class Some2()
