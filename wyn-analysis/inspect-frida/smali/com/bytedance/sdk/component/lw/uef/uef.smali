.class public Lcom/bytedance/sdk/component/lw/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/moa;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/lw/moa<",
        "Lcom/bytedance/sdk/component/lw/uef/yo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private uef(Ljava/net/HttpURLConnection;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p1

    .line 4
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_0

    .line 6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    const/4 v4, 0x0

    .line 7
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public oa(Lcom/bytedance/sdk/component/lw/lw;)Lcom/bytedance/sdk/component/lw/uef/yo;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/lw/lw;",
            ")",
            "Lcom/bytedance/sdk/component/lw/uef/yo<",
            "[B>;"
        }
    .end annotation

    .line 1
    const-string v0, "InternalHttpClient"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 6
    .line 7
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/lw;->uef()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    const-string v4, "GET"

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/16 v4, 0x1388

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 37
    .line 38
    .line 39
    move-result-object v4
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 40
    const/16 v5, 0x400

    .line 41
    .line 42
    :try_start_1
    new-array v5, v5, [B

    .line 43
    .line 44
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    :goto_0
    :try_start_2
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    const/4 v8, -0x1

    .line 54
    if-eq v7, v8, :cond_0

    .line 55
    .line 56
    invoke-virtual {v6, v5, v2, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    :goto_1
    move-object v1, v4

    .line 62
    goto/16 :goto_9

    .line 63
    .line 64
    :catch_0
    move-exception p1

    .line 65
    move-object v5, v1

    .line 66
    goto :goto_5

    .line 67
    :catch_1
    move-exception p1

    .line 68
    move-object v5, v1

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_0
    const/16 v2, 0xc8

    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 74
    .line 75
    .line 76
    move-result-object v5
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    :try_start_3
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/lw;->oa()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-direct {p0, v3}, Lcom/bytedance/sdk/component/lw/uef/uef;->uef(Ljava/net/HttpURLConnection;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v1
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 87
    goto :goto_2

    .line 88
    :catch_2
    move-exception p1

    .line 89
    goto :goto_5

    .line 90
    :catch_3
    move-exception p1

    .line 91
    goto :goto_7

    .line 92
    :cond_1
    :goto_2
    invoke-static {v4}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v6}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 96
    .line 97
    .line 98
    const-string p1, "success"

    .line 99
    .line 100
    goto :goto_8

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    move-object v6, v1

    .line 103
    goto :goto_1

    .line 104
    :catch_4
    move-exception p1

    .line 105
    move-object v5, v1

    .line 106
    :goto_3
    move-object v6, v5

    .line 107
    goto :goto_5

    .line 108
    :catch_5
    move-exception p1

    .line 109
    move-object v5, v1

    .line 110
    :goto_4
    move-object v6, v5

    .line 111
    goto :goto_7

    .line 112
    :catchall_2
    move-exception p1

    .line 113
    move-object v6, v1

    .line 114
    goto :goto_9

    .line 115
    :catch_6
    move-exception p1

    .line 116
    move-object v4, v1

    .line 117
    move-object v5, v4

    .line 118
    goto :goto_3

    .line 119
    :catch_7
    move-exception p1

    .line 120
    move-object v4, v1

    .line 121
    move-object v5, v4

    .line 122
    goto :goto_4

    .line 123
    :goto_5
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v7, "IOException:"

    .line 126
    .line 127
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    :goto_6
    invoke-static {v4}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v6}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 152
    .line 153
    .line 154
    goto :goto_8

    .line 155
    :goto_7
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v7, "MalformedURLException:"

    .line 158
    .line 159
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 180
    goto :goto_6

    .line 181
    :goto_8
    new-instance v0, Lcom/bytedance/sdk/component/lw/uef/yo;

    .line 182
    .line 183
    invoke-direct {v0, v2, v5, p1, v1}, Lcom/bytedance/sdk/component/lw/uef/yo;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :goto_9
    invoke-static {v1}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v6}, Lcom/bytedance/sdk/component/utils/zjm;->uef(Ljava/io/Closeable;)V

    .line 191
    .line 192
    .line 193
    throw p1
.end method

.method public synthetic uef(Lcom/bytedance/sdk/component/lw/lw;)Lcom/bytedance/sdk/component/lw/ivm;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/lw/uef/uef;->oa(Lcom/bytedance/sdk/component/lw/lw;)Lcom/bytedance/sdk/component/lw/uef/yo;

    move-result-object p1

    return-object p1
.end method
