.class public final Lokhttp3/internal/connection/ConnectionSpecSelector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/connection/ConnectionSpecSelector;",
        "",
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


# instance fields
.field public final a:Ljava/util/List;

.field public b:I

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "connectionSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->a:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->b:I

    .line 3
    .line 4
    iget-object v2, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    :goto_0
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    add-int/lit8 v4, v1, 0x1

    .line 13
    .line 14
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lokhttp3/ConnectionSpec;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lokhttp3/ConnectionSpec;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iput v4, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->b:I

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_1
    if-eqz v1, :cond_b

    .line 33
    .line 34
    iget v3, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->b:I

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    :goto_2
    const/4 v5, 0x0

    .line 41
    if-ge v3, v4, :cond_3

    .line 42
    .line 43
    add-int/lit8 v6, v3, 0x1

    .line 44
    .line 45
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lokhttp3/ConnectionSpec;

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Lokhttp3/ConnectionSpec;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    move v2, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    move v3, v6

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move v2, v5

    .line 62
    :goto_3
    iput-boolean v2, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->c:Z

    .line 63
    .line 64
    iget-boolean v2, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->d:Z

    .line 65
    .line 66
    iget-object v3, v1, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v6, "sslSocket.enabledCipherSuites"

    .line 75
    .line 76
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sget-object v6, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v6, Lokhttp3/CipherSuite;->c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 85
    .line 86
    invoke-static {v4, v3, v6}, Lokhttp3/internal/Util;->o([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :goto_4
    iget-object v6, v1, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v6, :cond_5

    .line 98
    .line 99
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v8, "sslSocket.enabledProtocols"

    .line 104
    .line 105
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object v8, Lhf/a;->b:Lhf/a;

    .line 109
    .line 110
    invoke-static {v7, v6, v8}, Lokhttp3/internal/Util;->o([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    goto :goto_5

    .line 115
    :cond_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :goto_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    const-string v9, "supportedCipherSuites"

    .line 124
    .line 125
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget-object v9, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v9, Lokhttp3/CipherSuite;->c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 134
    .line 135
    sget-object v10, Lokhttp3/internal/Util;->a:[B

    .line 136
    .line 137
    const-string v10, "comparator"

    .line 138
    .line 139
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    array-length v10, v8

    .line 143
    :goto_6
    const/4 v11, -0x1

    .line 144
    if-ge v5, v10, :cond_7

    .line 145
    .line 146
    aget-object v12, v8, v5

    .line 147
    .line 148
    const-string v13, "TLS_FALLBACK_SCSV"

    .line 149
    .line 150
    invoke-virtual {v9, v12, v13}, Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-nez v12, :cond_6

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_6
    add-int/2addr v5, v0

    .line 158
    goto :goto_6

    .line 159
    :cond_7
    move v5, v11

    .line 160
    :goto_7
    const-string v9, "cipherSuitesIntersection"

    .line 161
    .line 162
    if-eqz v2, :cond_8

    .line 163
    .line 164
    if-eq v5, v11, :cond_8

    .line 165
    .line 166
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    aget-object v2, v8, v5

    .line 170
    .line 171
    const-string v5, "supportedCipherSuites[indexOfFallbackScsv]"

    .line 172
    .line 173
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    array-length v5, v4

    .line 177
    add-int/2addr v5, v0

    .line 178
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    const-string v5, "copyOf(this, newSize)"

    .line 183
    .line 184
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    check-cast v4, [Ljava/lang/String;

    .line 188
    .line 189
    array-length v5, v4

    .line 190
    sub-int/2addr v5, v0

    .line 191
    aput-object v2, v4, v5

    .line 192
    .line 193
    :cond_8
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    iget-boolean v2, v1, Lokhttp3/ConnectionSpec;->a:Z

    .line 199
    .line 200
    iput-boolean v2, v0, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 201
    .line 202
    iput-object v3, v0, Lokhttp3/ConnectionSpec$Builder;->b:[Ljava/lang/String;

    .line 203
    .line 204
    iput-object v6, v0, Lokhttp3/ConnectionSpec$Builder;->c:[Ljava/lang/String;

    .line 205
    .line 206
    iget-boolean v2, v1, Lokhttp3/ConnectionSpec;->b:Z

    .line 207
    .line 208
    iput-boolean v2, v0, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 209
    .line 210
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    array-length v2, v4

    .line 214
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, [Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v0, v2}, Lokhttp3/ConnectionSpec$Builder;->b([Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const-string v2, "tlsVersionsIntersection"

    .line 224
    .line 225
    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    array-length v2, v7

    .line 229
    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, [Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v0, v2}, Lokhttp3/ConnectionSpec$Builder;->d([Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec$Builder;->a()Lokhttp3/ConnectionSpec;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec;->c()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    if-eqz v2, :cond_9

    .line 247
    .line 248
    iget-object v2, v0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_9
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec;->a()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    if-eqz v2, :cond_a

    .line 258
    .line 259
    iget-object v0, v0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :cond_a
    return-object v1

    .line 265
    :cond_b
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 266
    .line 267
    new-instance v1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v3, "Unable to find acceptable protocols. isFallback="

    .line 270
    .line 271
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget-boolean v3, p0, Lokhttp3/internal/connection/ConnectionSpecSelector;->d:Z

    .line 275
    .line 276
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v3, ", modes="

    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v2, ", supported protocols="

    .line 288
    .line 289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    const-string v2, "toString(this)"

    .line 304
    .line 305
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0
.end method
