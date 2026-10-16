.class public final Lokhttp3/CipherSuite;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/CipherSuite$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/CipherSuite;",
        "",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lokhttp3/CipherSuite$Companion;

.field public static final c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

.field public static final d:Ljava/util/LinkedHashMap;

.field public static final e:Lokhttp3/CipherSuite;

.field public static final f:Lokhttp3/CipherSuite;

.field public static final g:Lokhttp3/CipherSuite;

.field public static final h:Lokhttp3/CipherSuite;

.field public static final i:Lokhttp3/CipherSuite;

.field public static final j:Lokhttp3/CipherSuite;

.field public static final k:Lokhttp3/CipherSuite;

.field public static final l:Lokhttp3/CipherSuite;

.field public static final m:Lokhttp3/CipherSuite;

.field public static final n:Lokhttp3/CipherSuite;

.field public static final o:Lokhttp3/CipherSuite;

.field public static final p:Lokhttp3/CipherSuite;

.field public static final q:Lokhttp3/CipherSuite;

.field public static final r:Lokhttp3/CipherSuite;

.field public static final s:Lokhttp3/CipherSuite;

.field public static final t:Lokhttp3/CipherSuite;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/CipherSuite$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/CipherSuite$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    .line 8
    .line 9
    new-instance v1, Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 10
    .line 11
    invoke-direct {v1}, Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lokhttp3/CipherSuite;->c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 15
    .line 16
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lokhttp3/CipherSuite;->d:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 26
    .line 27
    .line 28
    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 31
    .line 32
    .line 33
    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 36
    .line 37
    .line 38
    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 41
    .line 42
    .line 43
    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 46
    .line 47
    .line 48
    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 51
    .line 52
    .line 53
    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 56
    .line 57
    .line 58
    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    .line 59
    .line 60
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sput-object v1, Lokhttp3/CipherSuite;->e:Lokhttp3/CipherSuite;

    .line 65
    .line 66
    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 69
    .line 70
    .line 71
    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 74
    .line 75
    .line 76
    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 79
    .line 80
    .line 81
    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    .line 82
    .line 83
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 84
    .line 85
    .line 86
    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 89
    .line 90
    .line 91
    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    .line 92
    .line 93
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 94
    .line 95
    .line 96
    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    .line 97
    .line 98
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 99
    .line 100
    .line 101
    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    .line 102
    .line 103
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 104
    .line 105
    .line 106
    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    .line 107
    .line 108
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 109
    .line 110
    .line 111
    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    .line 112
    .line 113
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 114
    .line 115
    .line 116
    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    .line 117
    .line 118
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 119
    .line 120
    .line 121
    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    .line 122
    .line 123
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 124
    .line 125
    .line 126
    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    .line 127
    .line 128
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 129
    .line 130
    .line 131
    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    .line 132
    .line 133
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 134
    .line 135
    .line 136
    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    .line 137
    .line 138
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 139
    .line 140
    .line 141
    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    .line 142
    .line 143
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 144
    .line 145
    .line 146
    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    .line 147
    .line 148
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 149
    .line 150
    .line 151
    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    .line 152
    .line 153
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 154
    .line 155
    .line 156
    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    .line 157
    .line 158
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 159
    .line 160
    .line 161
    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    .line 162
    .line 163
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 164
    .line 165
    .line 166
    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    .line 167
    .line 168
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 169
    .line 170
    .line 171
    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    .line 172
    .line 173
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    sput-object v1, Lokhttp3/CipherSuite;->f:Lokhttp3/CipherSuite;

    .line 178
    .line 179
    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    .line 180
    .line 181
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 182
    .line 183
    .line 184
    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    .line 185
    .line 186
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 187
    .line 188
    .line 189
    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    .line 190
    .line 191
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 192
    .line 193
    .line 194
    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    .line 195
    .line 196
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    sput-object v1, Lokhttp3/CipherSuite;->g:Lokhttp3/CipherSuite;

    .line 201
    .line 202
    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    .line 203
    .line 204
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 205
    .line 206
    .line 207
    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    .line 208
    .line 209
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 210
    .line 211
    .line 212
    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    .line 213
    .line 214
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 215
    .line 216
    .line 217
    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    .line 218
    .line 219
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 220
    .line 221
    .line 222
    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    .line 223
    .line 224
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 225
    .line 226
    .line 227
    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    .line 228
    .line 229
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 230
    .line 231
    .line 232
    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    .line 233
    .line 234
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 235
    .line 236
    .line 237
    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    .line 238
    .line 239
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 240
    .line 241
    .line 242
    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    .line 243
    .line 244
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 245
    .line 246
    .line 247
    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    .line 248
    .line 249
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 250
    .line 251
    .line 252
    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    .line 253
    .line 254
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 255
    .line 256
    .line 257
    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    .line 258
    .line 259
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 260
    .line 261
    .line 262
    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    .line 263
    .line 264
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 265
    .line 266
    .line 267
    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    .line 268
    .line 269
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 270
    .line 271
    .line 272
    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    .line 273
    .line 274
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 275
    .line 276
    .line 277
    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    .line 278
    .line 279
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 280
    .line 281
    .line 282
    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    .line 283
    .line 284
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 285
    .line 286
    .line 287
    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    .line 288
    .line 289
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 290
    .line 291
    .line 292
    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    .line 293
    .line 294
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 295
    .line 296
    .line 297
    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    .line 298
    .line 299
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 300
    .line 301
    .line 302
    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    .line 303
    .line 304
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 305
    .line 306
    .line 307
    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    .line 308
    .line 309
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 310
    .line 311
    .line 312
    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    .line 313
    .line 314
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 315
    .line 316
    .line 317
    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    .line 318
    .line 319
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    sput-object v1, Lokhttp3/CipherSuite;->h:Lokhttp3/CipherSuite;

    .line 324
    .line 325
    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    .line 326
    .line 327
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    sput-object v1, Lokhttp3/CipherSuite;->i:Lokhttp3/CipherSuite;

    .line 332
    .line 333
    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    .line 334
    .line 335
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 336
    .line 337
    .line 338
    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    .line 339
    .line 340
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 341
    .line 342
    .line 343
    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    .line 344
    .line 345
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 346
    .line 347
    .line 348
    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    .line 349
    .line 350
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 351
    .line 352
    .line 353
    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    .line 354
    .line 355
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 356
    .line 357
    .line 358
    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    .line 359
    .line 360
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 361
    .line 362
    .line 363
    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    .line 364
    .line 365
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 366
    .line 367
    .line 368
    const-string v1, "TLS_FALLBACK_SCSV"

    .line 369
    .line 370
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 371
    .line 372
    .line 373
    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    .line 374
    .line 375
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 376
    .line 377
    .line 378
    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    .line 379
    .line 380
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 381
    .line 382
    .line 383
    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    .line 384
    .line 385
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 386
    .line 387
    .line 388
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    .line 389
    .line 390
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 391
    .line 392
    .line 393
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    .line 394
    .line 395
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 396
    .line 397
    .line 398
    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    .line 399
    .line 400
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 401
    .line 402
    .line 403
    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    .line 404
    .line 405
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 406
    .line 407
    .line 408
    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    .line 409
    .line 410
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 411
    .line 412
    .line 413
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    .line 414
    .line 415
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 416
    .line 417
    .line 418
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    .line 419
    .line 420
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 421
    .line 422
    .line 423
    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    .line 424
    .line 425
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 426
    .line 427
    .line 428
    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    .line 429
    .line 430
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 431
    .line 432
    .line 433
    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    .line 434
    .line 435
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 436
    .line 437
    .line 438
    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    .line 439
    .line 440
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 441
    .line 442
    .line 443
    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    .line 444
    .line 445
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 446
    .line 447
    .line 448
    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    .line 449
    .line 450
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 451
    .line 452
    .line 453
    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    .line 454
    .line 455
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 456
    .line 457
    .line 458
    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    .line 459
    .line 460
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 461
    .line 462
    .line 463
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    .line 464
    .line 465
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    sput-object v1, Lokhttp3/CipherSuite;->j:Lokhttp3/CipherSuite;

    .line 470
    .line 471
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    .line 472
    .line 473
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    sput-object v1, Lokhttp3/CipherSuite;->k:Lokhttp3/CipherSuite;

    .line 478
    .line 479
    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    .line 480
    .line 481
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 482
    .line 483
    .line 484
    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    .line 485
    .line 486
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 487
    .line 488
    .line 489
    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    .line 490
    .line 491
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 492
    .line 493
    .line 494
    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    .line 495
    .line 496
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 497
    .line 498
    .line 499
    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    .line 500
    .line 501
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 502
    .line 503
    .line 504
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    .line 505
    .line 506
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 507
    .line 508
    .line 509
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    .line 510
    .line 511
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 512
    .line 513
    .line 514
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    .line 515
    .line 516
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 517
    .line 518
    .line 519
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    .line 520
    .line 521
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 522
    .line 523
    .line 524
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    .line 525
    .line 526
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 527
    .line 528
    .line 529
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    .line 530
    .line 531
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 532
    .line 533
    .line 534
    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    .line 535
    .line 536
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 537
    .line 538
    .line 539
    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    .line 540
    .line 541
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 542
    .line 543
    .line 544
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    .line 545
    .line 546
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    sput-object v1, Lokhttp3/CipherSuite;->l:Lokhttp3/CipherSuite;

    .line 551
    .line 552
    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    .line 553
    .line 554
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    sput-object v1, Lokhttp3/CipherSuite;->m:Lokhttp3/CipherSuite;

    .line 559
    .line 560
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    .line 561
    .line 562
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 563
    .line 564
    .line 565
    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    .line 566
    .line 567
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 568
    .line 569
    .line 570
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    .line 571
    .line 572
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    sput-object v1, Lokhttp3/CipherSuite;->n:Lokhttp3/CipherSuite;

    .line 577
    .line 578
    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    .line 579
    .line 580
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    sput-object v1, Lokhttp3/CipherSuite;->o:Lokhttp3/CipherSuite;

    .line 585
    .line 586
    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    .line 587
    .line 588
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 589
    .line 590
    .line 591
    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    .line 592
    .line 593
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 594
    .line 595
    .line 596
    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    .line 597
    .line 598
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 599
    .line 600
    .line 601
    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    .line 602
    .line 603
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 604
    .line 605
    .line 606
    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    .line 607
    .line 608
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    sput-object v1, Lokhttp3/CipherSuite;->p:Lokhttp3/CipherSuite;

    .line 613
    .line 614
    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    .line 615
    .line 616
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    sput-object v1, Lokhttp3/CipherSuite;->q:Lokhttp3/CipherSuite;

    .line 621
    .line 622
    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    .line 623
    .line 624
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 625
    .line 626
    .line 627
    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    .line 628
    .line 629
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 630
    .line 631
    .line 632
    const-string v1, "TLS_AES_128_GCM_SHA256"

    .line 633
    .line 634
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    sput-object v1, Lokhttp3/CipherSuite;->r:Lokhttp3/CipherSuite;

    .line 639
    .line 640
    const-string v1, "TLS_AES_256_GCM_SHA384"

    .line 641
    .line 642
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    sput-object v1, Lokhttp3/CipherSuite;->s:Lokhttp3/CipherSuite;

    .line 647
    .line 648
    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    .line 649
    .line 650
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    sput-object v1, Lokhttp3/CipherSuite;->t:Lokhttp3/CipherSuite;

    .line 655
    .line 656
    const-string v1, "TLS_AES_128_CCM_SHA256"

    .line 657
    .line 658
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 659
    .line 660
    .line 661
    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    .line 662
    .line 663
    invoke-static {v0, v1}, Lokhttp3/CipherSuite$Companion;->a(Lokhttp3/CipherSuite$Companion;Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 664
    .line 665
    .line 666
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/CipherSuite;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/CipherSuite;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
