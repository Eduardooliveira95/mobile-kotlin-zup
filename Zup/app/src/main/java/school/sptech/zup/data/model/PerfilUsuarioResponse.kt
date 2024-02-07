package school.sptech.zup.data.model

import java.io.Serializable

data class PerfilUsuarioResponse(
    val nome: String,
    val idPerfil: Long,
    val linkYoutube: String,
    val linkInstagram: String,
    val linkTikTok: String,
    val descPerfil: String,
    val foto: String?

) : Serializable
