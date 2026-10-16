.class public final Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "moloco-android-client-metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/moloco/sdk/acm/db/e;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/moloco/sdk/acm/http/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 21
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "params"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct/range {p0 .. p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "DBRequestWorker"

    .line 21
    .line 22
    iput-object v2, v0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v2, Lcom/moloco/sdk/acm/db/MetricsDb;->m:La9/a;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, La9/a;->h(Landroid/content/Context;)Lcom/moloco/sdk/acm/db/MetricsDb;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lcom/moloco/sdk/acm/db/MetricsDb;->p()Lcom/moloco/sdk/acm/db/e;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->b:Lcom/moloco/sdk/acm/db/e;

    .line 35
    .line 36
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "url"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, v0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "AppKey"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v3, Lef/k;

    .line 59
    .line 60
    invoke-direct {v3, v2, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v4, "AppBundle"

    .line 68
    .line 69
    invoke-virtual {v1, v4}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v5, Lef/k;

    .line 74
    .line 75
    invoke-direct {v5, v4, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v6, "AppVersion"

    .line 83
    .line 84
    invoke-virtual {v1, v6}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v7, Lef/k;

    .line 89
    .line 90
    invoke-direct {v7, v6, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v8, "OS"

    .line 98
    .line 99
    invoke-virtual {v1, v8}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-instance v9, Lef/k;

    .line 104
    .line 105
    invoke-direct {v9, v8, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v8, "osv"

    .line 113
    .line 114
    invoke-virtual {v1, v8}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v10, Lef/k;

    .line 119
    .line 120
    invoke-direct {v10, v8, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v11, "SdkVersion"

    .line 128
    .line 129
    invoke-virtual {v1, v11}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-instance v12, Lef/k;

    .line 134
    .line 135
    invoke-direct {v12, v11, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v13, "Mediator"

    .line 143
    .line 144
    invoke-virtual {v1, v13}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v14, Lef/k;

    .line 149
    .line 150
    invoke-direct {v14, v13, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    const/4 v1, 0x7

    .line 154
    new-array v1, v1, [Lef/k;

    .line 155
    .line 156
    const/4 v15, 0x0

    .line 157
    aput-object v3, v1, v15

    .line 158
    .line 159
    const/4 v3, 0x1

    .line 160
    aput-object v5, v1, v3

    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    aput-object v7, v1, v3

    .line 164
    .line 165
    const/4 v3, 0x3

    .line 166
    aput-object v9, v1, v3

    .line 167
    .line 168
    const/4 v3, 0x4

    .line 169
    aput-object v10, v1, v3

    .line 170
    .line 171
    const/4 v3, 0x5

    .line 172
    aput-object v12, v1, v3

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    aput-object v14, v1, v3

    .line 176
    .line 177
    invoke-static {v1}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 182
    .line 183
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_1

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    check-cast v5, Ljava/util/Map$Entry;

    .line 205
    .line 206
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    check-cast v7, Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v7, :cond_0

    .line 213
    .line 214
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v3, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_1
    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    move-object/from16 v18, v1

    .line 231
    .line 232
    check-cast v18, Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    move-object/from16 v20, v1

    .line 239
    .line 240
    check-cast v20, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object/from16 v17, v1

    .line 247
    .line 248
    check-cast v17, Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    move-object v15, v1

    .line 255
    check-cast v15, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    move-object/from16 v16, v1

    .line 262
    .line 263
    check-cast v16, Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v3, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    move-object/from16 v19, v1

    .line 270
    .line 271
    check-cast v19, Ljava/lang/String;

    .line 272
    .line 273
    new-instance v14, Lcom/moloco/sdk/acm/http/a;

    .line 274
    .line 275
    invoke-direct/range {v14 .. v20}, Lcom/moloco/sdk/acm/http/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iput-object v14, v0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->d:Lcom/moloco/sdk/acm/http/a;

    .line 279
    .line 280
    return-void
.end method


# virtual methods
.method public final doWork(Ljf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/moloco/sdk/acm/eventprocessing/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/moloco/sdk/acm/eventprocessing/a;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/eventprocessing/a;

    .line 21
    .line 22
    check-cast p1, Llf/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/moloco/sdk/acm/eventprocessing/a;-><init>(Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;Llf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v2, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->a:Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Lef/n;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->c:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    :try_start_1
    sget-object v2, Lcom/moloco/sdk/acm/http/b;->a:Lwd/c;

    .line 67
    .line 68
    sget-object v2, Lcom/moloco/sdk/acm/http/c;->a:Lef/p;

    .line 69
    .line 70
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Lwd/c;

    .line 75
    .line 76
    const-string v4, "httpClient"

    .line 77
    .line 78
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lcom/moloco/sdk/acm/http/b;->a:Lwd/c;

    .line 82
    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    sput-object v2, Lcom/moloco/sdk/acm/http/b;->a:Lwd/c;

    .line 86
    .line 87
    sput-object p1, Lcom/moloco/sdk/acm/http/b;->b:Ljava/lang/String;

    .line 88
    .line 89
    :cond_3
    new-instance p1, LG9/e;

    .line 90
    .line 91
    sget-object v2, Lcom/moloco/sdk/acm/http/b;->c:Lef/p;

    .line 92
    .line 93
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lcom/moloco/sdk/acm/http/g;

    .line 98
    .line 99
    iget-object v4, p0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->b:Lcom/moloco/sdk/acm/db/e;

    .line 100
    .line 101
    new-instance v5, Lab/b;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object v6, p0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->d:Lcom/moloco/sdk/acm/http/a;

    .line 107
    .line 108
    invoke-direct {p1, v2, v4, v5, v6}, LG9/e;-><init>(Lcom/moloco/sdk/acm/http/g;Lcom/moloco/sdk/acm/db/e;Lab/b;Lcom/moloco/sdk/acm/http/a;)V

    .line 109
    .line 110
    .line 111
    iput-object p0, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->a:Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;

    .line 112
    .line 113
    iput v3, v0, Lcom/moloco/sdk/acm/eventprocessing/a;->d:I

    .line 114
    .line 115
    invoke-virtual {p1, v0}, LG9/e;->j(Llf/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 119
    if-ne p1, v1, :cond_4

    .line 120
    .line 121
    return-object v1

    .line 122
    :goto_1
    move-object v0, p0

    .line 123
    goto :goto_3

    .line 124
    :catch_1
    move-exception p1

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move-object v0, p0

    .line 127
    :goto_2
    :try_start_2
    invoke-static {}, LJ3/p;->a()LJ3/o;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 131
    return-object p1

    .line 132
    :goto_3
    sget-object v1, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 133
    .line 134
    iget-object v0, v0, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;->a:Ljava/lang/String;

    .line 135
    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, "Work Manager failure: "

    .line 139
    .line 140
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const/16 v1, 0xc

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    invoke-static {v1, v2, v0, p1}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance p1, LJ3/m;

    .line 161
    .line 162
    invoke-direct {p1}, LJ3/m;-><init>()V

    .line 163
    .line 164
    .line 165
    return-object p1
.end method
