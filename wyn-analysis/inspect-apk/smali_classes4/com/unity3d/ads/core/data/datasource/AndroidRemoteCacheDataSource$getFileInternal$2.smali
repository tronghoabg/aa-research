.class final Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->getFileInternal(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILtf/q;Ljf/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llf/j;",
        "Ltf/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LEf/E;",
        "Lcom/unity3d/ads/core/data/model/CacheResult;",
        "<anonymous>",
        "(LEf/E;)Lcom/unity3d/ads/core/data/model/CacheResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Llf/e;
    c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2"
    f = "AndroidRemoteCacheDataSource.kt"
    l = {
        0x4e,
        0x4f,
        0x84
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cachePath:Ljava/io/File;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $intervalMs:I

.field final synthetic $onProgress:Ltf/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/q;"
        }
    .end annotation
.end field

.field final synthetic $priority:Ljava/lang/Integer;

.field final synthetic $url:Ljava/lang/String;

.field I$0:I

.field J$0:J

.field J$1:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;Ljava/io/File;Ljava/lang/String;Ljava/lang/Integer;ILtf/q;Ljf/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "I",
            "Ltf/q;",
            "Ljf/c<",
            "-",
            "Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$priority:Ljava/lang/Integer;

    .line 10
    .line 11
    iput p6, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$intervalMs:I

    .line 12
    .line 13
    iput-object p7, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$onProgress:Ltf/q;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Llf/j;-><init>(ILjf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljf/c<",
            "*>;)",
            "Ljf/c<",
            "Lef/C;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$priority:Ljava/lang/Integer;

    .line 12
    .line 13
    iget v6, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$intervalMs:I

    .line 14
    .line 15
    iget-object v7, p0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$onProgress:Ltf/q;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;-><init>(Ljava/lang/String;Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;Ljava/io/File;Ljava/lang/String;Ljava/lang/Integer;ILtf/q;Ljf/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(LEf/E;Ljf/c;)Ljava/lang/Object;
    .locals 0
    .param p1    # LEf/E;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEf/E;",
            "Ljf/c<",
            "-",
            "Lcom/unity3d/ads/core/data/model/CacheResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    move-result-object p1

    check-cast p1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;

    sget-object p2, Lef/C;->a:Lef/C;

    invoke-virtual {p1, p2}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LEf/E;

    check-cast p2, Ljf/c;

    invoke-virtual {p0, p1, p2}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->invoke(LEf/E;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    iget v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->label:I

    .line 7
    .line 8
    sget-object v5, Lef/C;->a:Lef/C;

    .line 9
    .line 10
    const-string v9, ""

    .line 11
    .line 12
    const/16 v11, 0x22

    .line 13
    .line 14
    const/4 v12, 0x3

    .line 15
    const/4 v13, 0x2

    .line 16
    if-eqz v4, :cond_3

    .line 17
    .line 18
    if-eq v4, v2, :cond_2

    .line 19
    .line 20
    if-eq v4, v13, :cond_1

    .line 21
    .line 22
    if-ne v4, v12, :cond_0

    .line 23
    .line 24
    iget v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->I$0:I

    .line 25
    .line 26
    const-wide/16 v15, 0x0

    .line 27
    .line 28
    iget-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$1:J

    .line 29
    .line 30
    iget-wide v10, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 31
    .line 32
    iget-object v13, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$13:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v13, Lcg/h;

    .line 35
    .line 36
    move-wide/from16 v17, v15

    .line 37
    .line 38
    iget-object v15, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$12:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v15, Ljava/io/Closeable;

    .line 41
    .line 42
    iget-object v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$11:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v12, Ljava/io/Closeable;

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$10:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lkotlin/jvm/internal/E;

    .line 51
    .line 52
    iget-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$9:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v8, [B

    .line 55
    .line 56
    iget-object v14, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$8:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v14, Ljava/io/InputStream;

    .line 59
    .line 60
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$7:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Ljava/io/Closeable;

    .line 63
    .line 64
    move-object/from16 v20, v0

    .line 65
    .line 66
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$6:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ltf/q;

    .line 69
    .line 70
    move-object/from16 v21, v0

    .line 71
    .line 72
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$5:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lkotlin/jvm/internal/F;

    .line 75
    .line 76
    move-object/from16 v22, v0

    .line 77
    .line 78
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$4:Ljava/lang/Object;

    .line 79
    .line 80
    move-object/from16 v23, v0

    .line 81
    .line 82
    check-cast v23, Lkotlin/jvm/internal/E;

    .line 83
    .line 84
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$3:Ljava/lang/Object;

    .line 85
    .line 86
    move-object/from16 v24, v0

    .line 87
    .line 88
    check-cast v24, Lcom/unity3d/services/core/network/model/HttpResponse;

    .line 89
    .line 90
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    move-object/from16 v25, v0

    .line 93
    .line 94
    check-cast v25, Ljava/io/File;

    .line 95
    .line 96
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    move-object/from16 v26, v0

    .line 99
    .line 100
    check-cast v26, Ljava/io/File;

    .line 101
    .line 102
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LEf/E;

    .line 105
    .line 106
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    move-object/from16 p1, v23

    .line 110
    .line 111
    move-object/from16 v23, v5

    .line 112
    .line 113
    move-object/from16 v5, p1

    .line 114
    .line 115
    move-object/from16 v27, v12

    .line 116
    .line 117
    move-object/from16 p1, v21

    .line 118
    .line 119
    move-object/from16 v12, v24

    .line 120
    .line 121
    move-object/from16 v21, v15

    .line 122
    .line 123
    move-object v15, v13

    .line 124
    move-object/from16 v13, v25

    .line 125
    .line 126
    move-wide/from16 v24, v10

    .line 127
    .line 128
    move-object v11, v2

    .line 129
    move-object v10, v8

    .line 130
    move-object v8, v0

    .line 131
    move v0, v4

    .line 132
    move-object/from16 v4, v22

    .line 133
    .line 134
    move-object/from16 v22, v26

    .line 135
    .line 136
    move-object/from16 v26, v20

    .line 137
    .line 138
    move-object/from16 v20, v9

    .line 139
    .line 140
    move-object v9, v14

    .line 141
    move-object v14, v3

    .line 142
    goto/16 :goto_d

    .line 143
    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object/from16 v3, v23

    .line 146
    .line 147
    move-object/from16 v23, v5

    .line 148
    .line 149
    move-object v5, v3

    .line 150
    move-object/from16 v20, v9

    .line 151
    .line 152
    move-object v3, v12

    .line 153
    move-wide v12, v10

    .line 154
    move-object v11, v2

    .line 155
    move-object v2, v0

    .line 156
    goto/16 :goto_14

    .line 157
    .line 158
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 159
    .line 160
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 161
    .line 162
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_1
    const-wide/16 v17, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    iget-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 171
    .line 172
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/io/File;

    .line 175
    .line 176
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Ljava/io/File;

    .line 179
    .line 180
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v4, LEf/E;

    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object v8, v4

    .line 188
    move-object v4, v2

    .line 189
    move-object v2, v0

    .line 190
    move-object/from16 v0, p1

    .line 191
    .line 192
    goto/16 :goto_5

    .line 193
    .line 194
    :cond_2
    const-wide/16 v17, 0x0

    .line 195
    .line 196
    const/16 v19, 0x0

    .line 197
    .line 198
    iget-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 199
    .line 200
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$3:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lcom/unity3d/services/core/network/model/HttpRequest;

    .line 203
    .line 204
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v2, Ljava/io/File;

    .line 207
    .line 208
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, Ljava/io/File;

    .line 211
    .line 212
    iget-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v8, LEf/E;

    .line 215
    .line 216
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v10, p1

    .line 220
    .line 221
    goto/16 :goto_4

    .line 222
    .line 223
    :cond_3
    const-wide/16 v17, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, LEf/E;

    .line 233
    .line 234
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 235
    .line 236
    if-eqz v2, :cond_29

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_4

    .line 243
    .line 244
    goto/16 :goto_21

    .line 245
    .line 246
    :cond_4
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 247
    .line 248
    invoke-static {v2}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->access$getSessionRepository$p(Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-interface {v2}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->getFeatureFlags()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v2}, Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;->getEnsureCacheFolderExistences()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_6

    .line 261
    .line 262
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_5

    .line 269
    .line 270
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-nez v2, :cond_6

    .line 277
    .line 278
    new-instance v20, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 279
    .line 280
    sget-object v21, Lcom/unity3d/ads/core/data/model/CacheError;->FILE_IO_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 281
    .line 282
    sget-object v22, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 283
    .line 284
    const/16 v25, 0x0

    .line 285
    .line 286
    const/16 v23, 0x0

    .line 287
    .line 288
    const/16 v24, 0x4

    .line 289
    .line 290
    invoke-direct/range {v20 .. v25}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 291
    .line 292
    .line 293
    return-object v20

    .line 294
    :cond_5
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-nez v2, :cond_6

    .line 301
    .line 302
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 303
    .line 304
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-nez v2, :cond_6

    .line 309
    .line 310
    new-instance v20, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 311
    .line 312
    sget-object v21, Lcom/unity3d/ads/core/data/model/CacheError;->FILE_IO_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 313
    .line 314
    sget-object v22, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 315
    .line 316
    const/16 v25, 0x0

    .line 317
    .line 318
    const/16 v23, 0x0

    .line 319
    .line 320
    const/16 v24, 0x4

    .line 321
    .line 322
    invoke-direct/range {v20 .. v25}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 323
    .line 324
    .line 325
    return-object v20

    .line 326
    :cond_6
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 327
    .line 328
    invoke-static {v2}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->access$getCreateFile$p(Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;)Lcom/unity3d/ads/core/domain/CreateFile;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 333
    .line 334
    new-instance v6, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 337
    .line 338
    .line 339
    iget-object v7, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string v7, ".part"

    .line 345
    .line 346
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-interface {v2, v4, v6}, Lcom/unity3d/ads/core/domain/CreateFile;->invoke(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-nez v4, :cond_7

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 364
    .line 365
    .line 366
    :cond_7
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 367
    .line 368
    .line 369
    move-result-wide v6

    .line 370
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 371
    .line 372
    invoke-static {v4}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->access$getCreateFile$p(Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;)Lcom/unity3d/ads/core/domain/CreateFile;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    iget-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 377
    .line 378
    new-instance v10, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 381
    .line 382
    .line 383
    iget-object v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v12, ".etag"

    .line 389
    .line 390
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    invoke-interface {v4, v8, v10}, Lcom/unity3d/ads/core/domain/CreateFile;->invoke(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-eqz v8, :cond_8

    .line 406
    .line 407
    move-object v8, v4

    .line 408
    goto :goto_0

    .line 409
    :cond_8
    const/4 v8, 0x0

    .line 410
    :goto_0
    if-eqz v8, :cond_9

    .line 411
    .line 412
    invoke-static {v8}, Lqf/i;->W(Ljava/io/File;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    goto :goto_1

    .line 417
    :cond_9
    const/4 v8, 0x0

    .line 418
    :goto_1
    new-instance v10, Lgf/f;

    .line 419
    .line 420
    invoke-direct {v10}, Lgf/f;-><init>()V

    .line 421
    .line 422
    .line 423
    cmp-long v12, v6, v17

    .line 424
    .line 425
    if-lez v12, :cond_a

    .line 426
    .line 427
    new-instance v12, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v14, "bytes="

    .line 430
    .line 431
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    const/16 v14, 0x2d

    .line 438
    .line 439
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    invoke-static {v12}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    const-string v14, "Range"

    .line 451
    .line 452
    invoke-virtual {v10, v14, v12}, Lgf/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    :cond_a
    if-eqz v8, :cond_b

    .line 456
    .line 457
    new-instance v12, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    const-string v14, "\""

    .line 460
    .line 461
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    invoke-static {v8}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    const-string v12, "If-Range"

    .line 479
    .line 480
    invoke-virtual {v10, v12, v8}, Lgf/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    :cond_b
    invoke-virtual {v10}, Lgf/f;->c()Lgf/f;

    .line 484
    .line 485
    .line 486
    move-result-object v25

    .line 487
    iget-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$priority:Ljava/lang/Integer;

    .line 488
    .line 489
    if-eqz v8, :cond_c

    .line 490
    .line 491
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    move/from16 v37, v8

    .line 496
    .line 497
    goto :goto_2

    .line 498
    :cond_c
    const v37, 0x7fffffff

    .line 499
    .line 500
    .line 501
    :goto_2
    new-instance v20, Lcom/unity3d/services/core/network/model/HttpRequest;

    .line 502
    .line 503
    iget-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 504
    .line 505
    const/16 v35, 0x0

    .line 506
    .line 507
    const/16 v36, 0x0

    .line 508
    .line 509
    const/16 v22, 0x0

    .line 510
    .line 511
    const/16 v23, 0x0

    .line 512
    .line 513
    const/16 v24, 0x0

    .line 514
    .line 515
    const/16 v26, 0x0

    .line 516
    .line 517
    const/16 v27, 0x0

    .line 518
    .line 519
    const/16 v28, 0x0

    .line 520
    .line 521
    const/16 v29, 0x0

    .line 522
    .line 523
    const/16 v30, 0x0

    .line 524
    .line 525
    const/16 v31, 0x0

    .line 526
    .line 527
    const/16 v32, 0x0

    .line 528
    .line 529
    const/16 v33, 0x0

    .line 530
    .line 531
    const/16 v34, 0x0

    .line 532
    .line 533
    const v38, 0xffee

    .line 534
    .line 535
    .line 536
    const/16 v39, 0x0

    .line 537
    .line 538
    move-object/from16 v21, v8

    .line 539
    .line 540
    invoke-direct/range {v20 .. v39}, Lcom/unity3d/services/core/network/model/HttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 541
    .line 542
    .line 543
    move-object/from16 v8, v20

    .line 544
    .line 545
    iget-object v10, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 546
    .line 547
    invoke-static {v10}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->access$getHttpClientProvider$p(Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;)Lcom/unity3d/ads/core/domain/HttpClientProvider;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    iput-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 552
    .line 553
    iput-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 554
    .line 555
    iput-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 556
    .line 557
    iput-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$3:Ljava/lang/Object;

    .line 558
    .line 559
    iput-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 560
    .line 561
    const/4 v12, 0x1

    .line 562
    iput v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->label:I

    .line 563
    .line 564
    invoke-interface {v10, v1}, Lcom/unity3d/ads/core/domain/HttpClientProvider;->invoke(Ljf/c;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v10

    .line 568
    if-ne v10, v3, :cond_d

    .line 569
    .line 570
    :goto_3
    move-object v14, v3

    .line 571
    goto/16 :goto_c

    .line 572
    .line 573
    :cond_d
    move-object/from16 v40, v8

    .line 574
    .line 575
    move-object v8, v0

    .line 576
    move-object/from16 v0, v40

    .line 577
    .line 578
    move-object/from16 v40, v4

    .line 579
    .line 580
    move-object v4, v2

    .line 581
    move-object/from16 v2, v40

    .line 582
    .line 583
    :goto_4
    check-cast v10, Lcom/unity3d/services/core/network/core/HttpClient;

    .line 584
    .line 585
    iput-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 586
    .line 587
    iput-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 588
    .line 589
    iput-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 590
    .line 591
    const/4 v12, 0x0

    .line 592
    iput-object v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$3:Ljava/lang/Object;

    .line 593
    .line 594
    iput-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 595
    .line 596
    iput v13, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->label:I

    .line 597
    .line 598
    const/4 v12, 0x1

    .line 599
    invoke-interface {v10, v0, v12, v1}, Lcom/unity3d/services/core/network/core/HttpClient;->execute(Lcom/unity3d/services/core/network/model/HttpRequest;ZLjf/c;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    if-ne v0, v3, :cond_e

    .line 604
    .line 605
    goto :goto_3

    .line 606
    :cond_e
    :goto_5
    move-object v10, v0

    .line 607
    check-cast v10, Lcom/unity3d/services/core/network/model/HttpResponse;

    .line 608
    .line 609
    invoke-static {v10}, Lcom/unity3d/services/core/network/model/HttpResponseKt;->isSuccessful(Lcom/unity3d/services/core/network/model/HttpResponse;)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-nez v0, :cond_f

    .line 614
    .line 615
    new-instance v0, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 616
    .line 617
    sget-object v2, Lcom/unity3d/ads/core/data/model/CacheError;->NETWORK_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 618
    .line 619
    sget-object v3, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 620
    .line 621
    new-instance v4, Ljava/lang/Exception;

    .line 622
    .line 623
    new-instance v5, Ljava/lang/StringBuilder;

    .line 624
    .line 625
    const-string v6, "Request failed with status code "

    .line 626
    .line 627
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getStatusCode()I

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    invoke-direct {v4, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-direct {v0, v2, v3, v4}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V

    .line 645
    .line 646
    .line 647
    return-object v0

    .line 648
    :cond_f
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getHeaders()Ljava/util/Map;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    const-string v12, "ETag"

    .line 653
    .line 654
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, Ljava/util/List;

    .line 659
    .line 660
    if-eqz v0, :cond_10

    .line 661
    .line 662
    invoke-static {v0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    check-cast v0, Ljava/lang/String;

    .line 667
    .line 668
    if-eqz v0, :cond_10

    .line 669
    .line 670
    const/4 v12, 0x1

    .line 671
    new-array v13, v12, [C

    .line 672
    .line 673
    aput-char v11, v13, v19

    .line 674
    .line 675
    invoke-static {v0, v13}, LBf/k;->W0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    if-nez v0, :cond_11

    .line 680
    .line 681
    goto :goto_6

    .line 682
    :cond_10
    const/4 v12, 0x1

    .line 683
    :goto_6
    move-object v0, v9

    .line 684
    :cond_11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 685
    .line 686
    .line 687
    move-result v11

    .line 688
    if-lez v11, :cond_12

    .line 689
    .line 690
    goto :goto_7

    .line 691
    :cond_12
    const/4 v0, 0x0

    .line 692
    :goto_7
    if-eqz v0, :cond_13

    .line 693
    .line 694
    sget-object v11, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 695
    .line 696
    invoke-static {v2, v0, v11}, Lqf/i;->Y(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 697
    .line 698
    .line 699
    :cond_13
    cmp-long v0, v6, v17

    .line 700
    .line 701
    if-lez v0, :cond_14

    .line 702
    .line 703
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getStatusCode()I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    const/16 v11, 0xc8

    .line 708
    .line 709
    if-ne v0, v11, :cond_14

    .line 710
    .line 711
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 712
    .line 713
    .line 714
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 715
    .line 716
    .line 717
    move-wide/from16 v6, v17

    .line 718
    .line 719
    :cond_14
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getBody()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    instance-of v11, v0, Ljava/io/InputStream;

    .line 724
    .line 725
    if-eqz v11, :cond_15

    .line 726
    .line 727
    check-cast v0, Ljava/io/InputStream;

    .line 728
    .line 729
    move-object v11, v0

    .line 730
    goto :goto_8

    .line 731
    :cond_15
    const/4 v11, 0x0

    .line 732
    :goto_8
    if-nez v11, :cond_16

    .line 733
    .line 734
    new-instance v0, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 735
    .line 736
    sget-object v2, Lcom/unity3d/ads/core/data/model/CacheError;->NETWORK_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 737
    .line 738
    sget-object v3, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 739
    .line 740
    new-instance v4, Ljava/lang/Exception;

    .line 741
    .line 742
    const-string v5, "Response body is not an InputStream"

    .line 743
    .line 744
    invoke-direct {v4, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-direct {v0, v2, v3, v4}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V

    .line 748
    .line 749
    .line 750
    return-object v0

    .line 751
    :cond_16
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getStatusCode()I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    const/16 v13, 0xce

    .line 756
    .line 757
    if-ne v0, v13, :cond_17

    .line 758
    .line 759
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 760
    .line 761
    .line 762
    move-result-wide v13

    .line 763
    cmp-long v0, v13, v17

    .line 764
    .line 765
    if-lez v0, :cond_17

    .line 766
    .line 767
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 768
    .line 769
    .line 770
    move-result-wide v13

    .line 771
    add-long/2addr v13, v6

    .line 772
    goto :goto_9

    .line 773
    :cond_17
    invoke-virtual {v10}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 774
    .line 775
    .line 776
    move-result-wide v13

    .line 777
    :goto_9
    new-instance v15, Lkotlin/jvm/internal/E;

    .line 778
    .line 779
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 780
    .line 781
    .line 782
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 783
    .line 784
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 785
    .line 786
    .line 787
    move-wide/from16 v20, v13

    .line 788
    .line 789
    invoke-static {}, LCf/e;->b()J

    .line 790
    .line 791
    .line 792
    move-result-wide v12

    .line 793
    sget-object v14, LCf/a;->b:LCf/h;

    .line 794
    .line 795
    iget v14, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$intervalMs:I

    .line 796
    .line 797
    move-object/from16 v22, v2

    .line 798
    .line 799
    sget-object v2, LCf/c;->c:LCf/c;

    .line 800
    .line 801
    move-object/from16 p1, v4

    .line 802
    .line 803
    move-object/from16 v23, v5

    .line 804
    .line 805
    invoke-static {v14, v2}, LFe/b;->S(ILCf/c;)J

    .line 806
    .line 807
    .line 808
    move-result-wide v4

    .line 809
    sget-object v2, LCf/c;->b:LCf/c;

    .line 810
    .line 811
    invoke-static {v12, v13, v4, v5, v2}, LFe/e;->R(JJLCf/c;)J

    .line 812
    .line 813
    .line 814
    move-result-wide v4

    .line 815
    iput-wide v4, v0, Lkotlin/jvm/internal/F;->a:J

    .line 816
    .line 817
    iget-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$onProgress:Ltf/q;

    .line 818
    .line 819
    iget v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$intervalMs:I

    .line 820
    .line 821
    const/16 v5, 0x2000

    .line 822
    .line 823
    :try_start_1
    new-array v5, v5, [B

    .line 824
    .line 825
    new-instance v12, Lkotlin/jvm/internal/E;

    .line 826
    .line 827
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 828
    .line 829
    .line 830
    invoke-static/range {p1 .. p1}, Lcg/b;->a(Ljava/io/File;)Lcg/c;

    .line 831
    .line 832
    .line 833
    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_10

    .line 834
    :try_start_2
    invoke-static {v13}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 835
    .line 836
    .line 837
    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_d

    .line 838
    move-wide/from16 v24, v6

    .line 839
    .line 840
    move-object/from16 v27, v13

    .line 841
    .line 842
    move-object/from16 v26, v14

    .line 843
    .line 844
    move-wide/from16 v6, v20

    .line 845
    .line 846
    move-object/from16 v13, v22

    .line 847
    .line 848
    move-object/from16 v21, v3

    .line 849
    .line 850
    move/from16 v22, v4

    .line 851
    .line 852
    move-object/from16 v20, v9

    .line 853
    .line 854
    move-object v9, v11

    .line 855
    move-object/from16 v3, p1

    .line 856
    .line 857
    move-object v4, v0

    .line 858
    move-object v0, v12

    .line 859
    move-object v12, v10

    .line 860
    move-object v10, v5

    .line 861
    move-object v5, v15

    .line 862
    move-object/from16 v15, v26

    .line 863
    .line 864
    :goto_a
    :try_start_3
    invoke-virtual {v9, v10}, Ljava/io/InputStream;->read([B)I

    .line 865
    .line 866
    .line 867
    move-result v14

    .line 868
    iput v14, v0, Lkotlin/jvm/internal/E;->a:I

    .line 869
    .line 870
    move-object/from16 v28, v9

    .line 871
    .line 872
    const/4 v9, -0x1

    .line 873
    if-eq v14, v9, :cond_1c

    .line 874
    .line 875
    move/from16 v9, v19

    .line 876
    .line 877
    invoke-interface {v15, v9, v14, v10}, Lcg/h;->T(II[B)Lcg/h;

    .line 878
    .line 879
    .line 880
    invoke-interface {v15}, Lcg/h;->flush()V

    .line 881
    .line 882
    .line 883
    iget v14, v5, Lkotlin/jvm/internal/E;->a:I

    .line 884
    .line 885
    iget v9, v0, Lkotlin/jvm/internal/E;->a:I

    .line 886
    .line 887
    add-int/2addr v14, v9

    .line 888
    iput v14, v5, Lkotlin/jvm/internal/E;->a:I

    .line 889
    .line 890
    if-eqz v2, :cond_1b

    .line 891
    .line 892
    move-object v9, v15

    .line 893
    iget-wide v14, v4, Lkotlin/jvm/internal/F;->a:J

    .line 894
    .line 895
    invoke-static {v14, v15}, LCf/g;->a(J)J

    .line 896
    .line 897
    .line 898
    move-result-wide v14

    .line 899
    sget-object v29, LCf/a;->b:LCf/h;

    .line 900
    .line 901
    cmp-long v14, v14, v17

    .line 902
    .line 903
    if-gez v14, :cond_18

    .line 904
    .line 905
    const/4 v14, 0x1

    .line 906
    goto :goto_b

    .line 907
    :cond_18
    const/4 v14, 0x0

    .line 908
    :goto_b
    if-nez v14, :cond_1a

    .line 909
    .line 910
    iget v14, v5, Lkotlin/jvm/internal/E;->a:I

    .line 911
    .line 912
    int-to-long v14, v14

    .line 913
    add-long v14, v24, v14

    .line 914
    .line 915
    move-object/from16 p1, v9

    .line 916
    .line 917
    new-instance v9, Ljava/lang/Long;

    .line 918
    .line 919
    invoke-direct {v9, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 920
    .line 921
    .line 922
    new-instance v14, Ljava/lang/Long;

    .line 923
    .line 924
    invoke-direct {v14, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 925
    .line 926
    .line 927
    iput-object v8, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$0:Ljava/lang/Object;

    .line 928
    .line 929
    iput-object v3, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$1:Ljava/lang/Object;

    .line 930
    .line 931
    iput-object v13, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$2:Ljava/lang/Object;

    .line 932
    .line 933
    iput-object v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$3:Ljava/lang/Object;

    .line 934
    .line 935
    iput-object v5, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$4:Ljava/lang/Object;

    .line 936
    .line 937
    iput-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$5:Ljava/lang/Object;

    .line 938
    .line 939
    iput-object v2, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$6:Ljava/lang/Object;

    .line 940
    .line 941
    iput-object v11, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$7:Ljava/lang/Object;

    .line 942
    .line 943
    move-object/from16 v15, v28

    .line 944
    .line 945
    iput-object v15, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$8:Ljava/lang/Object;

    .line 946
    .line 947
    iput-object v10, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$9:Ljava/lang/Object;

    .line 948
    .line 949
    iput-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$10:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 950
    .line 951
    move-object/from16 v28, v3

    .line 952
    .line 953
    move-object/from16 v3, v27

    .line 954
    .line 955
    :try_start_4
    iput-object v3, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$11:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 956
    .line 957
    move-object/from16 v27, v4

    .line 958
    .line 959
    move-object/from16 v4, v26

    .line 960
    .line 961
    :try_start_5
    iput-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$12:Ljava/lang/Object;

    .line 962
    .line 963
    move-object/from16 v26, v0

    .line 964
    .line 965
    move-object/from16 v0, p1

    .line 966
    .line 967
    iput-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->L$13:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 968
    .line 969
    move-object/from16 v29, v12

    .line 970
    .line 971
    move-object/from16 v30, v13

    .line 972
    .line 973
    move-wide/from16 v12, v24

    .line 974
    .line 975
    :try_start_6
    iput-wide v12, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$0:J

    .line 976
    .line 977
    iput-wide v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->J$1:J

    .line 978
    .line 979
    move-object/from16 p1, v0

    .line 980
    .line 981
    move/from16 v0, v22

    .line 982
    .line 983
    iput v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->I$0:I

    .line 984
    .line 985
    move/from16 v22, v0

    .line 986
    .line 987
    const/4 v0, 0x3

    .line 988
    iput v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->label:I

    .line 989
    .line 990
    invoke-interface {v2, v9, v14, v1}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 994
    move-object/from16 v14, v21

    .line 995
    .line 996
    if-ne v9, v14, :cond_19

    .line 997
    .line 998
    :goto_c
    return-object v14

    .line 999
    :cond_19
    move-object/from16 v21, v4

    .line 1000
    .line 1001
    move-wide/from16 v24, v12

    .line 1002
    .line 1003
    move-object v9, v15

    .line 1004
    move/from16 v0, v22

    .line 1005
    .line 1006
    move-object/from16 v4, v27

    .line 1007
    .line 1008
    move-object/from16 v22, v28

    .line 1009
    .line 1010
    move-object/from16 v12, v29

    .line 1011
    .line 1012
    move-object/from16 v13, v30

    .line 1013
    .line 1014
    move-object/from16 v15, p1

    .line 1015
    .line 1016
    move-object/from16 p1, v2

    .line 1017
    .line 1018
    move-object/from16 v27, v3

    .line 1019
    .line 1020
    :goto_d
    :try_start_7
    invoke-static {}, LCf/e;->b()J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1024
    :try_start_8
    sget-object v28, LCf/a;->b:LCf/h;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 1025
    .line 1026
    move-object/from16 v28, v5

    .line 1027
    .line 1028
    :try_start_9
    sget-object v5, LCf/c;->c:LCf/c;

    .line 1029
    .line 1030
    move-wide/from16 v29, v6

    .line 1031
    .line 1032
    invoke-static {v0, v5}, LFe/b;->S(ILCf/c;)J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v5

    .line 1036
    sget-object v7, LCf/c;->b:LCf/c;

    .line 1037
    .line 1038
    invoke-static {v2, v3, v5, v6, v7}, LFe/e;->R(JJLCf/c;)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v2

    .line 1042
    iput-wide v2, v4, Lkotlin/jvm/internal/F;->a:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1043
    .line 1044
    move-object/from16 v2, p1

    .line 1045
    .line 1046
    move-object/from16 v3, v22

    .line 1047
    .line 1048
    move-object/from16 v5, v28

    .line 1049
    .line 1050
    move-wide/from16 v6, v29

    .line 1051
    .line 1052
    const/16 v19, 0x0

    .line 1053
    .line 1054
    move/from16 v22, v0

    .line 1055
    .line 1056
    move-object/from16 v0, v26

    .line 1057
    .line 1058
    move-object/from16 v26, v21

    .line 1059
    .line 1060
    move-object/from16 v21, v14

    .line 1061
    .line 1062
    goto/16 :goto_a

    .line 1063
    .line 1064
    :catchall_1
    move-exception v0

    .line 1065
    :goto_e
    move-object v2, v0

    .line 1066
    move-object/from16 v15, v21

    .line 1067
    .line 1068
    move-object/from16 v26, v22

    .line 1069
    .line 1070
    move-object/from16 v3, v27

    .line 1071
    .line 1072
    move-object/from16 v5, v28

    .line 1073
    .line 1074
    :goto_f
    move-wide/from16 v40, v24

    .line 1075
    .line 1076
    move-object/from16 v24, v12

    .line 1077
    .line 1078
    move-object/from16 v25, v13

    .line 1079
    .line 1080
    move-wide/from16 v12, v40

    .line 1081
    .line 1082
    goto/16 :goto_14

    .line 1083
    .line 1084
    :catchall_2
    move-exception v0

    .line 1085
    move-object/from16 v28, v5

    .line 1086
    .line 1087
    move-object v2, v0

    .line 1088
    move-object/from16 v15, v21

    .line 1089
    .line 1090
    move-object/from16 v26, v22

    .line 1091
    .line 1092
    move-object/from16 v3, v27

    .line 1093
    .line 1094
    goto :goto_f

    .line 1095
    :catchall_3
    move-exception v0

    .line 1096
    move-object/from16 v28, v5

    .line 1097
    .line 1098
    goto :goto_e

    .line 1099
    :catchall_4
    move-exception v0

    .line 1100
    :goto_10
    move-object v2, v0

    .line 1101
    move-object v15, v4

    .line 1102
    move-object/from16 v26, v28

    .line 1103
    .line 1104
    move-object/from16 v24, v29

    .line 1105
    .line 1106
    move-object/from16 v25, v30

    .line 1107
    .line 1108
    goto/16 :goto_14

    .line 1109
    .line 1110
    :catchall_5
    move-exception v0

    .line 1111
    move-object/from16 v29, v12

    .line 1112
    .line 1113
    move-object/from16 v30, v13

    .line 1114
    .line 1115
    move-wide/from16 v12, v24

    .line 1116
    .line 1117
    goto :goto_10

    .line 1118
    :catchall_6
    move-exception v0

    .line 1119
    move-object/from16 v29, v12

    .line 1120
    .line 1121
    move-object/from16 v30, v13

    .line 1122
    .line 1123
    move-wide/from16 v12, v24

    .line 1124
    .line 1125
    move-object/from16 v4, v26

    .line 1126
    .line 1127
    goto :goto_10

    .line 1128
    :catchall_7
    move-exception v0

    .line 1129
    move-object/from16 v28, v3

    .line 1130
    .line 1131
    move-object/from16 v29, v12

    .line 1132
    .line 1133
    move-object/from16 v30, v13

    .line 1134
    .line 1135
    move-wide/from16 v12, v24

    .line 1136
    .line 1137
    move-object/from16 v4, v26

    .line 1138
    .line 1139
    move-object/from16 v3, v27

    .line 1140
    .line 1141
    goto :goto_10

    .line 1142
    :cond_1a
    move-object/from16 p1, v9

    .line 1143
    .line 1144
    :goto_11
    move-object/from16 v29, v12

    .line 1145
    .line 1146
    move-object/from16 v30, v13

    .line 1147
    .line 1148
    move-object/from16 v14, v21

    .line 1149
    .line 1150
    move-wide/from16 v12, v24

    .line 1151
    .line 1152
    move-object/from16 v15, v28

    .line 1153
    .line 1154
    move-object/from16 v28, v3

    .line 1155
    .line 1156
    move-object/from16 v3, v27

    .line 1157
    .line 1158
    move-object/from16 v27, v4

    .line 1159
    .line 1160
    move-object/from16 v4, v26

    .line 1161
    .line 1162
    move-object/from16 v26, v0

    .line 1163
    .line 1164
    goto :goto_12

    .line 1165
    :cond_1b
    move-object/from16 p1, v15

    .line 1166
    .line 1167
    goto :goto_11

    .line 1168
    :goto_12
    move-wide/from16 v24, v12

    .line 1169
    .line 1170
    move-object/from16 v21, v14

    .line 1171
    .line 1172
    move-object v9, v15

    .line 1173
    move-object/from16 v0, v26

    .line 1174
    .line 1175
    move-object/from16 v12, v29

    .line 1176
    .line 1177
    move-object/from16 v13, v30

    .line 1178
    .line 1179
    const/16 v19, 0x0

    .line 1180
    .line 1181
    move-object/from16 v15, p1

    .line 1182
    .line 1183
    move-object/from16 v26, v4

    .line 1184
    .line 1185
    move-object/from16 v4, v27

    .line 1186
    .line 1187
    move-object/from16 v27, v3

    .line 1188
    .line 1189
    move-object/from16 v3, v28

    .line 1190
    .line 1191
    goto/16 :goto_a

    .line 1192
    .line 1193
    :cond_1c
    move-object/from16 v28, v3

    .line 1194
    .line 1195
    move-object/from16 v29, v12

    .line 1196
    .line 1197
    move-object/from16 v30, v13

    .line 1198
    .line 1199
    move-wide/from16 v12, v24

    .line 1200
    .line 1201
    move-object/from16 v4, v26

    .line 1202
    .line 1203
    move-object/from16 v3, v27

    .line 1204
    .line 1205
    const/4 v0, 0x0

    .line 1206
    :try_start_a
    invoke-static {v4, v0}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1207
    .line 1208
    .line 1209
    :try_start_b
    invoke-static {v3, v0}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1210
    .line 1211
    .line 1212
    :try_start_c
    invoke-static {v11, v0}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1213
    .line 1214
    .line 1215
    move-wide v6, v12

    .line 1216
    move-object/from16 v0, v23

    .line 1217
    .line 1218
    move-object/from16 v3, v28

    .line 1219
    .line 1220
    move-object/from16 v12, v29

    .line 1221
    .line 1222
    move-object/from16 v13, v30

    .line 1223
    .line 1224
    goto/16 :goto_18

    .line 1225
    .line 1226
    :catchall_8
    move-exception v0

    .line 1227
    move-wide v6, v12

    .line 1228
    move-object/from16 v3, v28

    .line 1229
    .line 1230
    move-object/from16 v12, v29

    .line 1231
    .line 1232
    move-object/from16 v13, v30

    .line 1233
    .line 1234
    goto/16 :goto_17

    .line 1235
    .line 1236
    :catchall_9
    move-exception v0

    .line 1237
    move-object v2, v0

    .line 1238
    move-object v15, v5

    .line 1239
    move-wide v6, v12

    .line 1240
    move-object/from16 v4, v28

    .line 1241
    .line 1242
    move-object/from16 v10, v29

    .line 1243
    .line 1244
    move-object/from16 v22, v30

    .line 1245
    .line 1246
    goto :goto_16

    .line 1247
    :catchall_a
    move-exception v0

    .line 1248
    move-object v2, v0

    .line 1249
    move-object v15, v5

    .line 1250
    move-wide v6, v12

    .line 1251
    move-object/from16 v4, v28

    .line 1252
    .line 1253
    move-object/from16 v10, v29

    .line 1254
    .line 1255
    move-object/from16 v25, v30

    .line 1256
    .line 1257
    :goto_13
    move-object v13, v3

    .line 1258
    goto :goto_15

    .line 1259
    :goto_14
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 1260
    :catchall_b
    move-exception v0

    .line 1261
    :try_start_e
    invoke-static {v15, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1262
    .line 1263
    .line 1264
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 1265
    :catchall_c
    move-exception v0

    .line 1266
    move-object v2, v0

    .line 1267
    move-object v15, v5

    .line 1268
    move-wide v6, v12

    .line 1269
    move-object/from16 v10, v24

    .line 1270
    .line 1271
    move-object/from16 v4, v26

    .line 1272
    .line 1273
    goto :goto_13

    .line 1274
    :catchall_d
    move-exception v0

    .line 1275
    move-object/from16 v20, v9

    .line 1276
    .line 1277
    move-object/from16 v4, p1

    .line 1278
    .line 1279
    move-object v2, v0

    .line 1280
    move-object/from16 v25, v22

    .line 1281
    .line 1282
    :goto_15
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1283
    :catchall_e
    move-exception v0

    .line 1284
    :try_start_10
    invoke-static {v13, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1285
    .line 1286
    .line 1287
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 1288
    :catchall_f
    move-exception v0

    .line 1289
    move-object v2, v0

    .line 1290
    move-object/from16 v22, v25

    .line 1291
    .line 1292
    goto :goto_16

    .line 1293
    :catchall_10
    move-exception v0

    .line 1294
    move-object/from16 v20, v9

    .line 1295
    .line 1296
    move-object/from16 v4, p1

    .line 1297
    .line 1298
    move-object v2, v0

    .line 1299
    :goto_16
    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 1300
    :catchall_11
    move-exception v0

    .line 1301
    :try_start_12
    invoke-static {v11, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1302
    .line 1303
    .line 1304
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 1305
    :catchall_12
    move-exception v0

    .line 1306
    move-object v3, v4

    .line 1307
    move-object v12, v10

    .line 1308
    move-object v5, v15

    .line 1309
    move-object/from16 v13, v22

    .line 1310
    .line 1311
    :goto_17
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    :goto_18
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    if-eqz v0, :cond_1d

    .line 1320
    .line 1321
    new-instance v2, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 1322
    .line 1323
    sget-object v3, Lcom/unity3d/ads/core/data/model/CacheError;->NETWORK_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 1324
    .line 1325
    sget-object v4, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 1326
    .line 1327
    invoke-direct {v2, v3, v4, v0}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V

    .line 1328
    .line 1329
    .line 1330
    return-object v2

    .line 1331
    :cond_1d
    invoke-virtual {v12}, Lcom/unity3d/services/core/network/model/HttpResponse;->getStatusCode()I

    .line 1332
    .line 1333
    .line 1334
    move-result v0

    .line 1335
    const/16 v2, 0xce

    .line 1336
    .line 1337
    if-ne v0, v2, :cond_1e

    .line 1338
    .line 1339
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v8

    .line 1343
    invoke-virtual {v12}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v10

    .line 1347
    add-long/2addr v10, v6

    .line 1348
    cmp-long v0, v8, v10

    .line 1349
    .line 1350
    if-nez v0, :cond_28

    .line 1351
    .line 1352
    goto :goto_19

    .line 1353
    :cond_1e
    invoke-virtual {v12}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 1354
    .line 1355
    .line 1356
    move-result-wide v6

    .line 1357
    const-wide/16 v8, -0x1

    .line 1358
    .line 1359
    cmp-long v0, v6, v8

    .line 1360
    .line 1361
    if-eqz v0, :cond_1f

    .line 1362
    .line 1363
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 1364
    .line 1365
    .line 1366
    move-result-wide v6

    .line 1367
    invoke-virtual {v12}, Lcom/unity3d/services/core/network/model/HttpResponse;->getContentSize()J

    .line 1368
    .line 1369
    .line 1370
    move-result-wide v8

    .line 1371
    cmp-long v0, v6, v8

    .line 1372
    .line 1373
    if-nez v0, :cond_28

    .line 1374
    .line 1375
    goto :goto_19

    .line 1376
    :cond_1f
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v6

    .line 1380
    cmp-long v0, v6, v17

    .line 1381
    .line 1382
    if-lez v0, :cond_28

    .line 1383
    .line 1384
    :goto_19
    new-instance v2, Ljava/io/File;

    .line 1385
    .line 1386
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$cachePath:Ljava/io/File;

    .line 1387
    .line 1388
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 1389
    .line 1390
    invoke-direct {v2, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1391
    .line 1392
    .line 1393
    :try_start_13
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1394
    .line 1395
    .line 1396
    move-result v0

    .line 1397
    if-eqz v0, :cond_21

    .line 1398
    .line 1399
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    if-eqz v0, :cond_20

    .line 1404
    .line 1405
    goto :goto_1a

    .line 1406
    :cond_20
    const-string v0, "Final file exists and could not be deleted before overwriting"

    .line 1407
    .line 1408
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 1409
    .line 1410
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1411
    .line 1412
    .line 1413
    throw v3

    .line 1414
    :catchall_13
    move-exception v0

    .line 1415
    goto :goto_1c

    .line 1416
    :cond_21
    :goto_1a
    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v0

    .line 1420
    if-eqz v0, :cond_24

    .line 1421
    .line 1422
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 1423
    .line 1424
    .line 1425
    move-result v0

    .line 1426
    if-eqz v0, :cond_23

    .line 1427
    .line 1428
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v0

    .line 1432
    if-eqz v0, :cond_22

    .line 1433
    .line 1434
    goto :goto_1b

    .line 1435
    :cond_22
    const-string v0, "Could not delete Etag file after successful download"

    .line 1436
    .line 1437
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 1438
    .line 1439
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    throw v3

    .line 1443
    :cond_23
    :goto_1b
    move-object/from16 v0, v23

    .line 1444
    .line 1445
    goto :goto_1d

    .line 1446
    :cond_24
    const-string v0, "Could not rename temporary file to final file"

    .line 1447
    .line 1448
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 1449
    .line 1450
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1451
    .line 1452
    .line 1453
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 1454
    :goto_1c
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v0

    .line 1458
    :goto_1d
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    if-eqz v0, :cond_25

    .line 1463
    .line 1464
    new-instance v2, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 1465
    .line 1466
    sget-object v3, Lcom/unity3d/ads/core/data/model/CacheError;->FILE_STATE_WRONG:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 1467
    .line 1468
    sget-object v4, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 1469
    .line 1470
    invoke-direct {v2, v3, v4, v0}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v2

    .line 1474
    :cond_25
    new-instance v24, Lcom/unity3d/ads/core/data/model/CachedFile;

    .line 1475
    .line 1476
    iget-object v0, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 1477
    .line 1478
    iget-object v3, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$fileName:Ljava/lang/String;

    .line 1479
    .line 1480
    iget-object v4, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->this$0:Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;

    .line 1481
    .line 1482
    invoke-static {v4}, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;->access$getGetFileExtensionFromUrl$p(Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;)Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v4

    .line 1486
    iget-object v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$url:Ljava/lang/String;

    .line 1487
    .line 1488
    invoke-interface {v4, v6}, Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;->invoke(Ljava/lang/String;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v4

    .line 1492
    if-nez v4, :cond_26

    .line 1493
    .line 1494
    move-object/from16 v28, v20

    .line 1495
    .line 1496
    goto :goto_1e

    .line 1497
    :cond_26
    move-object/from16 v28, v4

    .line 1498
    .line 1499
    :goto_1e
    iget v4, v5, Lkotlin/jvm/internal/E;->a:I

    .line 1500
    .line 1501
    int-to-long v4, v4

    .line 1502
    invoke-virtual {v12}, Lcom/unity3d/services/core/network/model/HttpResponse;->getProtocol()Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v31

    .line 1506
    iget-object v6, v1, Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource$getFileInternal$2;->$priority:Ljava/lang/Integer;

    .line 1507
    .line 1508
    if-eqz v6, :cond_27

    .line 1509
    .line 1510
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1511
    .line 1512
    .line 1513
    move-result v10

    .line 1514
    move/from16 v32, v10

    .line 1515
    .line 1516
    :goto_1f
    move-object/from16 v25, v0

    .line 1517
    .line 1518
    move-object/from16 v27, v2

    .line 1519
    .line 1520
    move-object/from16 v26, v3

    .line 1521
    .line 1522
    move-wide/from16 v29, v4

    .line 1523
    .line 1524
    goto :goto_20

    .line 1525
    :cond_27
    const v32, 0x7fffffff

    .line 1526
    .line 1527
    .line 1528
    goto :goto_1f

    .line 1529
    :goto_20
    invoke-direct/range {v24 .. v32}, Lcom/unity3d/ads/core/data/model/CachedFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;I)V

    .line 1530
    .line 1531
    .line 1532
    move-object/from16 v0, v24

    .line 1533
    .line 1534
    new-instance v2, Lcom/unity3d/ads/core/data/model/CacheResult$Success;

    .line 1535
    .line 1536
    sget-object v3, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 1537
    .line 1538
    invoke-direct {v2, v0, v3}, Lcom/unity3d/ads/core/data/model/CacheResult$Success;-><init>(Lcom/unity3d/ads/core/data/model/CachedFile;Lcom/unity3d/ads/core/data/model/CacheSource;)V

    .line 1539
    .line 1540
    .line 1541
    return-object v2

    .line 1542
    :cond_28
    new-instance v4, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 1543
    .line 1544
    sget-object v5, Lcom/unity3d/ads/core/data/model/CacheError;->NETWORK_ERROR:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 1545
    .line 1546
    sget-object v6, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 1547
    .line 1548
    const/4 v9, 0x0

    .line 1549
    const/4 v7, 0x0

    .line 1550
    const/4 v8, 0x4

    .line 1551
    invoke-direct/range {v4 .. v9}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1552
    .line 1553
    .line 1554
    return-object v4

    .line 1555
    :cond_29
    :goto_21
    new-instance v5, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;

    .line 1556
    .line 1557
    sget-object v6, Lcom/unity3d/ads/core/data/model/CacheError;->MALFORMED_URL:Lcom/unity3d/ads/core/data/model/CacheError;

    .line 1558
    .line 1559
    sget-object v7, Lcom/unity3d/ads/core/data/model/CacheSource;->REMOTE:Lcom/unity3d/ads/core/data/model/CacheSource;

    .line 1560
    .line 1561
    const/4 v10, 0x0

    .line 1562
    const/4 v8, 0x0

    .line 1563
    const/4 v9, 0x4

    .line 1564
    invoke-direct/range {v5 .. v10}, Lcom/unity3d/ads/core/data/model/CacheResult$Failure;-><init>(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1565
    .line 1566
    .line 1567
    return-object v5
.end method
