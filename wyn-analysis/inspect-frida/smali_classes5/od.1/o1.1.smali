.class public final Lod/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/logging/Logger;

.field public static final e:Lod/Y1;

.field public static final f:Lod/Y;


# instance fields
.field public final a:Lod/Y;

.field public final b:Lod/Y1;

.field public final c:Ljava/net/InetSocketAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lod/o1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lod/o1;->d:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, Lod/Y1;

    .line 14
    .line 15
    const/16 v1, 0xe

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lod/Y1;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lod/o1;->e:Lod/Y1;

    .line 21
    .line 22
    new-instance v0, Lod/Y;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, v1}, Lod/Y;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lod/o1;->f:Lod/Y;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "GRPC_PROXY_EXP"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lod/o1;->f:Lod/Y;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lod/o1;->a:Lod/Y;

    .line 16
    .line 17
    sget-object v1, Lod/o1;->e:Lod/Y1;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lod/o1;->b:Lod/Y1;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string v1, ":"

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    array-length v1, v0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-le v1, v2, :cond_0

    .line 36
    .line 37
    aget-object v1, v0, v2

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v1, 0x50

    .line 45
    .line 46
    :goto_0
    sget-object v2, Lod/o1;->d:Ljava/util/logging/Logger;

    .line 47
    .line 48
    const-string v3, "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM."

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    aget-object v0, v0, v3

    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lod/o1;->c:Ljava/net/InetSocketAddress;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lod/o1;->c:Ljava/net/InetSocketAddress;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/InetSocketAddress;)Lmd/z;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    instance-of v2, p1, Ljava/net/InetSocketAddress;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v2, p0, Lod/o1;->c:Ljava/net/InetSocketAddress;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    sget v0, Lmd/z;->e:I

    .line 14
    .line 15
    const-string v0, "targetAddress"

    .line 16
    .line 17
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lmd/z;

    .line 21
    .line 22
    invoke-direct {v0, v2, p1, v3, v3}, Lmd/z;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    sget-object v2, Lod/o1;->d:Ljava/util/logging/Logger;

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lod/a0;->d(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :try_start_1
    new-instance v4, Ljava/net/URI;

    .line 33
    .line 34
    const-string v5, "https"

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-direct/range {v4 .. v11}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    .line 46
    .line 47
    iget-object v5, p0, Lod/o1;->a:Lod/Y;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 59
    .line 60
    const-string v0, "proxy selector is null, so continuing without proxy lookup"

    .line 61
    .line 62
    invoke-virtual {v2, p1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_2
    invoke-virtual {v5, v4}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-le v5, v1, :cond_3

    .line 75
    .line 76
    const-string v5, "More than 1 proxy detected, gRPC will select the first one"

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Ljava/net/Proxy;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    sget-object v6, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 92
    .line 93
    if-ne v5, v6, :cond_4

    .line 94
    .line 95
    :goto_0
    return-object v3

    .line 96
    :cond_4
    invoke-virtual {v4}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/net/InetSocketAddress;

    .line 101
    .line 102
    invoke-static {v4}, Lod/a0;->d(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    const-string v8, "https"

    .line 115
    .line 116
    iget-object v9, p0, Lod/o1;->b:Lod/Y1;

    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    :try_start_2
    new-instance v9, Ljava/net/URL;

    .line 122
    .line 123
    const-string v10, ""

    .line 124
    .line 125
    invoke-direct {v9, v8, v5, v7, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 126
    .line 127
    .line 128
    move-object v11, v9

    .line 129
    goto :goto_1

    .line 130
    :catch_0
    sget-object v9, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 131
    .line 132
    const-string v10, "failed to create URL for Authenticator: {0} {1}"

    .line 133
    .line 134
    const/4 v11, 0x2

    .line 135
    new-array v11, v11, [Ljava/lang/Object;

    .line 136
    .line 137
    aput-object v8, v11, v0

    .line 138
    .line 139
    aput-object v5, v11, v1

    .line 140
    .line 141
    invoke-virtual {v2, v9, v10, v11}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    move-object v11, v3

    .line 145
    :goto_1
    sget-object v12, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    .line 146
    .line 147
    const-string v9, ""

    .line 148
    .line 149
    const/4 v10, 0x0

    .line 150
    invoke-static/range {v5 .. v12}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->isUnresolved()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_5

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-direct {v2, v1, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 175
    .line 176
    .line 177
    move-object v4, v2

    .line 178
    :cond_5
    sget v1, Lmd/z;->e:I

    .line 179
    .line 180
    if-nez v0, :cond_6

    .line 181
    .line 182
    new-instance v0, Lmd/z;

    .line 183
    .line 184
    invoke-direct {v0, v4, p1, v3, v3}, Lmd/z;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_2
    move-object v3, v0

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-nez v2, :cond_7

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    new-instance v3, Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([C)V

    .line 207
    .line 208
    .line 209
    :goto_3
    new-instance v0, Lmd/z;

    .line 210
    .line 211
    invoke-direct {v0, v4, p1, v1, v3}, Lmd/z;-><init>(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :catch_1
    move-exception v0

    .line 216
    move-object p1, v0

    .line 217
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 218
    .line 219
    const-string v1, "Failed to construct URI for proxy lookup, proceeding without proxy"

    .line 220
    .line 221
    invoke-virtual {v2, v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    move-object p1, v0

    .line 227
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 228
    .line 229
    const-string v1, "Failed to get host for proxy lookup, proceeding without proxy"

    .line 230
    .line 231
    invoke-virtual {v2, v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    :goto_4
    return-object v3
.end method
