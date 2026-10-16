.class public final Lokhttp3/ConnectionSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/ConnectionSpec$Builder;,
        Lokhttp3/ConnectionSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lokhttp3/ConnectionSpec;",
        "",
        "Builder",
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
.field public static final e:Lokhttp3/ConnectionSpec;

.field public static final f:Lokhttp3/ConnectionSpec;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lokhttp3/ConnectionSpec$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/ConnectionSpec$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lokhttp3/CipherSuite;->r:Lokhttp3/CipherSuite;

    .line 8
    .line 9
    sget-object v2, Lokhttp3/CipherSuite;->s:Lokhttp3/CipherSuite;

    .line 10
    .line 11
    sget-object v3, Lokhttp3/CipherSuite;->t:Lokhttp3/CipherSuite;

    .line 12
    .line 13
    sget-object v4, Lokhttp3/CipherSuite;->l:Lokhttp3/CipherSuite;

    .line 14
    .line 15
    sget-object v5, Lokhttp3/CipherSuite;->n:Lokhttp3/CipherSuite;

    .line 16
    .line 17
    sget-object v6, Lokhttp3/CipherSuite;->m:Lokhttp3/CipherSuite;

    .line 18
    .line 19
    sget-object v7, Lokhttp3/CipherSuite;->o:Lokhttp3/CipherSuite;

    .line 20
    .line 21
    sget-object v8, Lokhttp3/CipherSuite;->q:Lokhttp3/CipherSuite;

    .line 22
    .line 23
    sget-object v9, Lokhttp3/CipherSuite;->p:Lokhttp3/CipherSuite;

    .line 24
    .line 25
    const/16 v10, 0x9

    .line 26
    .line 27
    new-array v11, v10, [Lokhttp3/CipherSuite;

    .line 28
    .line 29
    aput-object v0, v11, v1

    .line 30
    .line 31
    const/4 v12, 0x1

    .line 32
    aput-object v2, v11, v12

    .line 33
    .line 34
    const/4 v13, 0x2

    .line 35
    aput-object v3, v11, v13

    .line 36
    .line 37
    const/4 v14, 0x3

    .line 38
    aput-object v4, v11, v14

    .line 39
    .line 40
    const/4 v15, 0x4

    .line 41
    aput-object v5, v11, v15

    .line 42
    .line 43
    const/16 v16, 0x5

    .line 44
    .line 45
    aput-object v6, v11, v16

    .line 46
    .line 47
    const/16 v17, 0x6

    .line 48
    .line 49
    aput-object v7, v11, v17

    .line 50
    .line 51
    const/16 v18, 0x7

    .line 52
    .line 53
    aput-object v8, v11, v18

    .line 54
    .line 55
    const/16 v19, 0x8

    .line 56
    .line 57
    aput-object v9, v11, v19

    .line 58
    .line 59
    move/from16 v20, v14

    .line 60
    .line 61
    const/16 v14, 0x10

    .line 62
    .line 63
    move/from16 v21, v1

    .line 64
    .line 65
    new-array v1, v14, [Lokhttp3/CipherSuite;

    .line 66
    .line 67
    aput-object v0, v1, v21

    .line 68
    .line 69
    aput-object v2, v1, v12

    .line 70
    .line 71
    aput-object v3, v1, v13

    .line 72
    .line 73
    aput-object v4, v1, v20

    .line 74
    .line 75
    aput-object v5, v1, v15

    .line 76
    .line 77
    aput-object v6, v1, v16

    .line 78
    .line 79
    aput-object v7, v1, v17

    .line 80
    .line 81
    aput-object v8, v1, v18

    .line 82
    .line 83
    aput-object v9, v1, v19

    .line 84
    .line 85
    sget-object v0, Lokhttp3/CipherSuite;->j:Lokhttp3/CipherSuite;

    .line 86
    .line 87
    aput-object v0, v1, v10

    .line 88
    .line 89
    sget-object v0, Lokhttp3/CipherSuite;->k:Lokhttp3/CipherSuite;

    .line 90
    .line 91
    const/16 v2, 0xa

    .line 92
    .line 93
    aput-object v0, v1, v2

    .line 94
    .line 95
    sget-object v0, Lokhttp3/CipherSuite;->h:Lokhttp3/CipherSuite;

    .line 96
    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    aput-object v0, v1, v2

    .line 100
    .line 101
    sget-object v0, Lokhttp3/CipherSuite;->i:Lokhttp3/CipherSuite;

    .line 102
    .line 103
    const/16 v2, 0xc

    .line 104
    .line 105
    aput-object v0, v1, v2

    .line 106
    .line 107
    sget-object v0, Lokhttp3/CipherSuite;->f:Lokhttp3/CipherSuite;

    .line 108
    .line 109
    const/16 v2, 0xd

    .line 110
    .line 111
    aput-object v0, v1, v2

    .line 112
    .line 113
    sget-object v0, Lokhttp3/CipherSuite;->g:Lokhttp3/CipherSuite;

    .line 114
    .line 115
    const/16 v2, 0xe

    .line 116
    .line 117
    aput-object v0, v1, v2

    .line 118
    .line 119
    sget-object v0, Lokhttp3/CipherSuite;->e:Lokhttp3/CipherSuite;

    .line 120
    .line 121
    const/16 v2, 0xf

    .line 122
    .line 123
    aput-object v0, v1, v2

    .line 124
    .line 125
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 126
    .line 127
    invoke-direct {v0, v12}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 128
    .line 129
    .line 130
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, [Lokhttp3/CipherSuite;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lokhttp3/ConnectionSpec$Builder;->c([Lokhttp3/CipherSuite;)V

    .line 137
    .line 138
    .line 139
    sget-object v2, Lokhttp3/TlsVersion;->c:Lokhttp3/TlsVersion;

    .line 140
    .line 141
    sget-object v3, Lokhttp3/TlsVersion;->d:Lokhttp3/TlsVersion;

    .line 142
    .line 143
    new-array v4, v13, [Lokhttp3/TlsVersion;

    .line 144
    .line 145
    aput-object v2, v4, v21

    .line 146
    .line 147
    aput-object v3, v4, v12

    .line 148
    .line 149
    invoke-virtual {v0, v4}, Lokhttp3/ConnectionSpec$Builder;->e([Lokhttp3/TlsVersion;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v4, v0, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 153
    .line 154
    const-string v5, "no TLS extensions for cleartext connections"

    .line 155
    .line 156
    if-eqz v4, :cond_2

    .line 157
    .line 158
    iput-boolean v12, v0, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 159
    .line 160
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec$Builder;->a()Lokhttp3/ConnectionSpec;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 164
    .line 165
    invoke-direct {v0, v12}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, [Lokhttp3/CipherSuite;

    .line 173
    .line 174
    invoke-virtual {v0, v4}, Lokhttp3/ConnectionSpec$Builder;->c([Lokhttp3/CipherSuite;)V

    .line 175
    .line 176
    .line 177
    new-array v4, v13, [Lokhttp3/TlsVersion;

    .line 178
    .line 179
    aput-object v2, v4, v21

    .line 180
    .line 181
    aput-object v3, v4, v12

    .line 182
    .line 183
    invoke-virtual {v0, v4}, Lokhttp3/ConnectionSpec$Builder;->e([Lokhttp3/TlsVersion;)V

    .line 184
    .line 185
    .line 186
    iget-boolean v4, v0, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 187
    .line 188
    if-eqz v4, :cond_1

    .line 189
    .line 190
    iput-boolean v12, v0, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 191
    .line 192
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec$Builder;->a()Lokhttp3/ConnectionSpec;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sput-object v0, Lokhttp3/ConnectionSpec;->e:Lokhttp3/ConnectionSpec;

    .line 197
    .line 198
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 199
    .line 200
    invoke-direct {v0, v12}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, [Lokhttp3/CipherSuite;

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Lokhttp3/ConnectionSpec$Builder;->c([Lokhttp3/CipherSuite;)V

    .line 210
    .line 211
    .line 212
    new-array v1, v15, [Lokhttp3/TlsVersion;

    .line 213
    .line 214
    aput-object v2, v1, v21

    .line 215
    .line 216
    aput-object v3, v1, v12

    .line 217
    .line 218
    sget-object v2, Lokhttp3/TlsVersion;->e:Lokhttp3/TlsVersion;

    .line 219
    .line 220
    aput-object v2, v1, v13

    .line 221
    .line 222
    sget-object v2, Lokhttp3/TlsVersion;->f:Lokhttp3/TlsVersion;

    .line 223
    .line 224
    aput-object v2, v1, v20

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Lokhttp3/ConnectionSpec$Builder;->e([Lokhttp3/TlsVersion;)V

    .line 227
    .line 228
    .line 229
    iget-boolean v1, v0, Lokhttp3/ConnectionSpec$Builder;->a:Z

    .line 230
    .line 231
    if-eqz v1, :cond_0

    .line 232
    .line 233
    iput-boolean v12, v0, Lokhttp3/ConnectionSpec$Builder;->d:Z

    .line 234
    .line 235
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec$Builder;->a()Lokhttp3/ConnectionSpec;

    .line 236
    .line 237
    .line 238
    new-instance v0, Lokhttp3/ConnectionSpec$Builder;

    .line 239
    .line 240
    move/from16 v1, v21

    .line 241
    .line 242
    invoke-direct {v0, v1}, Lokhttp3/ConnectionSpec$Builder;-><init>(Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lokhttp3/ConnectionSpec$Builder;->a()Lokhttp3/ConnectionSpec;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sput-object v0, Lokhttp3/ConnectionSpec;->f:Lokhttp3/ConnectionSpec;

    .line 250
    .line 251
    return-void

    .line 252
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 253
    .line 254
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lokhttp3/ConnectionSpec;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    array-length v2, v0

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    sget-object v5, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    .line 20
    .line 21
    invoke-virtual {v5, v4}, Lokhttp3/CipherSuite$Companion;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lhf/a;->b:Lhf/a;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lokhttp3/internal/Util;->i([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v1, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lokhttp3/CipherSuite;->c:Lokhttp3/CipherSuite$Companion$ORDER_BY_NAME$1;

    .line 37
    .line 38
    invoke-static {v0, p1, v1}, Lokhttp3/internal/Util;->i([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :cond_2
    const/4 p1, 0x1

    .line 47
    return p1
.end method

.method public final c()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    array-length v2, v0

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    sget-object v5, Lokhttp3/TlsVersion;->b:Lokhttp3/TlsVersion$Companion;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v4}, Lokhttp3/TlsVersion$Companion;->a(Ljava/lang/String;)Lokhttp3/TlsVersion;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {v1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lokhttp3/ConnectionSpec;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lokhttp3/ConnectionSpec;

    .line 10
    .line 11
    iget-boolean v0, p1, Lokhttp3/ConnectionSpec;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    if-eqz v1, :cond_5

    .line 19
    .line 20
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->b:Z

    .line 43
    .line 44
    iget-boolean p1, p1, Lokhttp3/ConnectionSpec;->b:Z

    .line 45
    .line 46
    if-eq v0, p1, :cond_5

    .line 47
    .line 48
    :goto_0
    const/4 p1, 0x0

    .line 49
    return p1

    .line 50
    :cond_5
    :goto_1
    const/4 p1, 0x1

    .line 51
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, Lokhttp3/ConnectionSpec;->c:[Ljava/lang/String;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move v1, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    const/16 v2, 0x20f

    .line 17
    .line 18
    add-int/2addr v2, v1

    .line 19
    mul-int/lit8 v2, v2, 0x1f

    .line 20
    .line 21
    iget-object v1, p0, Lokhttp3/ConnectionSpec;->d:[Ljava/lang/String;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :goto_1
    add-int/2addr v2, v0

    .line 31
    mul-int/lit8 v2, v2, 0x1f

    .line 32
    .line 33
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->b:Z

    .line 34
    .line 35
    xor-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    add-int/2addr v2, v0

    .line 38
    return v2

    .line 39
    :cond_2
    const/16 v0, 0x11

    .line 40
    .line 41
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/ConnectionSpec;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "ConnectionSpec()"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "ConnectionSpec(cipherSuites="

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lokhttp3/ConnectionSpec;->a()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "[all enabled]"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lj$/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", tlsVersions="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lokhttp3/ConnectionSpec;->c()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1, v2}, Lj$/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", supportsTlsExtensions="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, Lokhttp3/ConnectionSpec;->b:Z

    .line 50
    .line 51
    const/16 v2, 0x29

    .line 52
    .line 53
    invoke-static {v0, v1, v2}, LA7/p0;->p(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
