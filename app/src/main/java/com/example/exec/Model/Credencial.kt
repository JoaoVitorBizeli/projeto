package com.example.exec.Model

import com.fasterxml.jackson.annotation.JsonProperty

class Credencial {
    data class Credencial(
        @JsonProperty("email")
        var email:String,
        @JsonProperty("passoword")
        var pessaword:String
    )
}