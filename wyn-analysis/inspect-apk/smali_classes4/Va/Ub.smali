.class public final LVa/Ub;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final h:[C


# instance fields
.field public final synthetic c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public synthetic f:Z

.field public synthetic g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x35

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Ub;->h:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x37s
        0x69s
        0x6ds
        0x6ds
        0x6cs
        0x73s
        0x20s
        0x57s
        0x67s
        0x66s
        0x72s
        0x76s
        0x6es
        0x66s
        0x6bs
        0x5cs
        0x5ds
        0x6ds
        0x69s
        0x71s
        0x5ds
        0x56s
        0x69s
        0x69s
        0x6bs
        0x69s
        0x6as
        0x71s
        0x70s
        0x30s
        0x6as
        0x6cs
        0x59s
        0x60s
        0x71s
        0x69s
        0x6ds
        0x6ds
        0x42s
        0x43s
        0x6as
        0x6bs
        0x6es
        0x6as
        0x63s
        0x6bs
        0x6as
        0x41s
        0x49s
        0x70s
        0x70s
        0x72s
        0x5bs
    .end array-data
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LVa/Ub;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVa/Ub;->c:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LVa/Ub;->g:Ljava/lang/Object;

    iput-object p2, p0, LVa/Ub;->d:Ljava/lang/Object;

    iput-object p3, p0, LVa/Ub;->e:Ljava/lang/Object;

    iput-boolean p4, p0, LVa/Ub;->f:Z

    return-void
.end method

.method public constructor <init>(LVa/n;ZLorg/json/JSONArray;LS3/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LVa/Ub;->c:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVa/Ub;->g:Ljava/lang/Object;

    iput-boolean p2, p0, LVa/Ub;->f:Z

    iput-object p3, p0, LVa/Ub;->d:Ljava/lang/Object;

    iput-object p4, p0, LVa/Ub;->e:Ljava/lang/Object;

    return-void
.end method

.method public static d(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [B

    .line 8
    .line 9
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    aget v2, p1, v1

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget v6, p1, v5

    .line 20
    .line 21
    const/4 v7, 0x3

    .line 22
    aget v7, p1, v7

    .line 23
    .line 24
    sget-object v8, LVa/Ub;->h:[C

    .line 25
    .line 26
    new-array v9, v4, [C

    .line 27
    .line 28
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    new-array v2, v4, [C

    .line 34
    .line 35
    sput v1, LVa/Ab;->y:I

    .line 36
    .line 37
    move v8, v1

    .line 38
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 39
    .line 40
    if-ge v10, v4, :cond_1

    .line 41
    .line 42
    aget-byte v11, p0, v10

    .line 43
    .line 44
    if-ne v11, v3, :cond_0

    .line 45
    .line 46
    aget-char v11, v9, v10

    .line 47
    .line 48
    shl-int/2addr v11, v3

    .line 49
    add-int/2addr v11, v3

    .line 50
    sub-int/2addr v11, v8

    .line 51
    int-to-char v8, v11

    .line 52
    aput-char v8, v2, v10

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_0
    aget-char v11, v9, v10

    .line 58
    .line 59
    shl-int/2addr v11, v3

    .line 60
    sub-int/2addr v11, v8

    .line 61
    int-to-char v8, v11

    .line 62
    aput-char v8, v2, v10

    .line 63
    .line 64
    :goto_1
    aget-char v8, v2, v10

    .line 65
    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    sput v10, LVa/Ab;->y:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v9, v2

    .line 72
    :cond_2
    if-lez v7, :cond_3

    .line 73
    .line 74
    new-array p0, v4, [C

    .line 75
    .line 76
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    sub-int v2, v4, v7

    .line 80
    .line 81
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-eqz p2, :cond_5

    .line 88
    .line 89
    new-array p0, v4, [C

    .line 90
    .line 91
    sput v1, LVa/Ab;->y:I

    .line 92
    .line 93
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 94
    .line 95
    if-ge p2, v4, :cond_4

    .line 96
    .line 97
    sub-int v2, v4, p2

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    aget-char v2, v9, v2

    .line 101
    .line 102
    aput-char v2, p0, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    sput p2, LVa/Ab;->y:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v9, p0

    .line 110
    :cond_5
    if-lez v6, :cond_6

    .line 111
    .line 112
    sput v1, LVa/Ab;->y:I

    .line 113
    .line 114
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 115
    .line 116
    if-ge p0, v4, :cond_6

    .line 117
    .line 118
    aget-char p2, v9, p0

    .line 119
    .line 120
    aget v1, p1, v5

    .line 121
    .line 122
    sub-int/2addr p2, v1

    .line 123
    int-to-char p2, p2

    .line 124
    aput-char p2, v9, p0

    .line 125
    .line 126
    add-int/lit8 p0, p0, 0x1

    .line 127
    .line 128
    sput p0, LVa/Ab;->y:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    return-object p0

    .line 138
    :goto_4
    monitor-exit v0

    .line 139
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 7

    .line 1
    iget v0, p0, LVa/Ub;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-boolean v1, p0, LVa/Ub;->f:Z

    .line 8
    .line 9
    iget-object v2, p0, LVa/Ub;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LVa/n;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v2, v0, v1, v3, v3}, LVa/n;->c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x6

    .line 20
    :try_start_0
    const-string v4, "\u0000\u0001\u0001\u0001\u0000\u0001"

    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    filled-new-array {v3, v2, v3, v5}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v4, v5, v1}, LVa/Ub;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, p0, LVa/Ub;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lorg/json/JSONArray;

    .line 38
    .line 39
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v4

    .line 44
    const/16 v5, 0x17

    .line 45
    .line 46
    filled-new-array {v2, v5, v3, v3}, [I

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v5, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"

    .line 51
    .line 52
    invoke-static {v5, v2, v3}, LVa/Ub;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/16 v5, 0x1d

    .line 61
    .line 62
    const/16 v6, 0x18

    .line 63
    .line 64
    filled-new-array {v5, v6, v3, v6}, [I

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v5, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001"

    .line 69
    .line 70
    invoke-static {v5, v3, v1}, LVa/Ub;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v2, v1, v4}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    new-instance v1, LVa/y;

    .line 82
    .line 83
    const/4 v2, 0x6

    .line 84
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iput-object p0, v1, LVa/y;->e:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v0, v1, LVa/y;->d:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {v1}, LVa/Cb;->j(LVa/Ba;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_0
    iget-object v0, p0, LVa/Ub;->g:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, LVa/Vb;

    .line 98
    .line 99
    iget-object v1, v0, LVa/Vb;->a:LVa/b;

    .line 100
    .line 101
    sget v2, LVa/b;->p:I

    .line 102
    .line 103
    add-int/lit8 v3, v2, 0x67

    .line 104
    .line 105
    rem-int/lit16 v3, v3, 0x80

    .line 106
    .line 107
    sput v3, LVa/b;->q:I

    .line 108
    .line 109
    iget-boolean v3, v1, LVa/b;->j:Z

    .line 110
    .line 111
    add-int/lit8 v2, v2, 0xd

    .line 112
    .line 113
    rem-int/lit16 v4, v2, 0x80

    .line 114
    .line 115
    sput v4, LVa/b;->q:I

    .line 116
    .line 117
    rem-int/lit8 v2, v2, 0x2

    .line 118
    .line 119
    if-nez v2, :cond_0

    .line 120
    .line 121
    const/16 v2, 0x40

    .line 122
    .line 123
    div-int/lit8 v2, v2, 0x0

    .line 124
    .line 125
    :cond_0
    if-eqz v3, :cond_4

    .line 126
    .line 127
    invoke-static {v1}, LVa/b;->E(LVa/b;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-boolean v2, p0, LVa/Ub;->f:Z

    .line 132
    .line 133
    iget-object v3, p0, LVa/Ub;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v3, Landroid/webkit/WebView;

    .line 136
    .line 137
    iget-object v4, p0, LVa/Ub;->e:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v1, :cond_3

    .line 142
    .line 143
    iget-object v1, v0, LVa/Vb;->a:LVa/b;

    .line 144
    .line 145
    invoke-static {v1}, LVa/b;->E(LVa/b;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    iget-object v1, v0, LVa/Vb;->a:LVa/b;

    .line 157
    .line 158
    invoke-static {v1}, LVa/b;->E(LVa/b;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_4

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_2

    .line 183
    .line 184
    invoke-static {v0, v3, v4, v2}, LVa/Vb;->e(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    :goto_1
    invoke-static {v0, v3, v4, v2}, LVa/Vb;->e(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 189
    .line 190
    .line 191
    :cond_4
    :goto_2
    return-void

    .line 192
    :pswitch_1
    iget-object v0, p0, LVa/Ub;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Landroid/webkit/WebView;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget-object v2, p0, LVa/Ub;->g:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v2, LVa/Vb;

    .line 203
    .line 204
    iget-object v2, v2, LVa/Vb;->a:LVa/b;

    .line 205
    .line 206
    invoke-virtual {v2, v0}, LVa/b;->t(Landroid/webkit/WebView;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-instance v2, LVa/Da;

    .line 211
    .line 212
    const/16 v3, 0x19

    .line 213
    .line 214
    invoke-direct {v2, v3}, LVa/Da;-><init>(I)V

    .line 215
    .line 216
    .line 217
    iput-object p0, v2, LVa/Da;->f:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v1, v2, LVa/Da;->d:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v0, v2, LVa/Da;->e:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {v2}, LVa/Cb;->e(LVa/Ba;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
