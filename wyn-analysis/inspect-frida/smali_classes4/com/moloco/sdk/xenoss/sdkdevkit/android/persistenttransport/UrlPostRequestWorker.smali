.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "url",
        "moloco-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:[Lkotlin/reflect/KProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/w;

    .line 2
    .line 3
    const-class v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/I;->property0(Lkotlin/jvm/internal/v;)Lkotlin/reflect/KProperty0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    sput-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;->a:[Lkotlin/reflect/KProperty;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final c(Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;->a:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-interface {v0}, Lkotlin/reflect/KCallable;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p0}, Lff/B;->v(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public final doWork(Ljf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;

    .line 12
    .line 13
    iget v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->e:I

    .line 14
    .line 15
    const/high16 v5, -0x80000000

    .line 16
    .line 17
    and-int v6, v4, v5

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    sub-int/2addr v4, v5

    .line 22
    iput v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->e:I

    .line 23
    .line 24
    :goto_0
    move-object v9, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;

    .line 27
    .line 28
    check-cast v1, Llf/c;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;Llf/c;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object v1, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->c:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 37
    .line 38
    iget v4, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->e:I

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v2, :cond_1

    .line 43
    .line 44
    iget-object v2, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->b:Ljava/util/Map;

    .line 45
    .line 46
    check-cast v2, Ljava/util/Map;

    .line 47
    .line 48
    iget-object v3, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;

    .line 49
    .line 50
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->a()Lwd/c;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v1, v1, LJ3/h;->a:Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 81
    .line 82
    new-instance v5, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v6, "Sending request to "

    .line 85
    .line 86
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;->c(Ljava/util/Map;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    const/4 v13, 0x0

    .line 101
    const/4 v14, 0x0

    .line 102
    const-string v11, "PersistentHttpRequest"

    .line 103
    .line 104
    const/16 v15, 0xc

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-object v5, v5, LJ3/h;->a:Ljava/util/HashMap;

    .line 116
    .line 117
    const-string v6, "body"

    .line 118
    .line 119
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    instance-of v6, v5, [Ljava/lang/Byte;

    .line 124
    .line 125
    if-eqz v6, :cond_3

    .line 126
    .line 127
    check-cast v5, [Ljava/lang/Byte;

    .line 128
    .line 129
    array-length v6, v5

    .line 130
    new-array v6, v6, [B

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    :goto_2
    array-length v8, v5

    .line 134
    if-ge v7, v8, :cond_4

    .line 135
    .line 136
    aget-object v8, v5, v7

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/lang/Byte;->byteValue()B

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    aput-byte v8, v6, v7

    .line 143
    .line 144
    add-int/2addr v7, v2

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    const/4 v6, 0x0

    .line 147
    :cond_4
    if-nez v6, :cond_5

    .line 148
    .line 149
    new-instance v1, LJ3/m;

    .line 150
    .line 151
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 152
    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_5
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const-string v7, "contentType"

    .line 160
    .line 161
    invoke-virtual {v5, v7}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    sget-object v7, LJd/f;->f:LJd/f;

    .line 168
    .line 169
    invoke-static {v5}, Lka/e0;->u(Ljava/lang/String;)LJd/f;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    if-nez v7, :cond_6

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_6
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    const-string v8, "contentEncoding"

    .line 181
    .line 182
    invoke-virtual {v5, v8}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-static {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;->c(Ljava/util/Map;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    iput-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;

    .line 191
    .line 192
    move-object v10, v1

    .line 193
    check-cast v10, Ljava/util/Map;

    .line 194
    .line 195
    iput-object v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->b:Ljava/util/Map;

    .line 196
    .line 197
    iput v2, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/b;->e:I

    .line 198
    .line 199
    invoke-static/range {v4 .. v9}, LFe/c;->f(Lwd/c;Ljava/lang/String;[BLJd/f;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-ne v2, v3, :cond_7

    .line 204
    .line 205
    return-object v3

    .line 206
    :cond_7
    move-object v3, v2

    .line 207
    move-object v2, v1

    .line 208
    move-object v1, v3

    .line 209
    move-object v3, v0

    .line 210
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 217
    .line 218
    new-instance v5, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v6, "Request to "

    .line 221
    .line 222
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;->c(Ljava/util/Map;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v2, " was successful: "

    .line 233
    .line 234
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    const/4 v7, 0x0

    .line 245
    const/4 v8, 0x0

    .line 246
    const-string v5, "PersistentHttpRequest"

    .line 247
    .line 248
    const/16 v9, 0xc

    .line 249
    .line 250
    const/4 v10, 0x0

    .line 251
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    if-eqz v1, :cond_8

    .line 255
    .line 256
    invoke-static {}, LJ3/p;->a()LJ3/o;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    return-object v1

    .line 261
    :cond_8
    invoke-virtual {v3}, LJ3/q;->getRunAttemptCount()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    const/4 v2, 0x5

    .line 266
    if-lt v1, v2, :cond_9

    .line 267
    .line 268
    new-instance v1, LJ3/m;

    .line 269
    .line 270
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 271
    .line 272
    .line 273
    return-object v1

    .line 274
    :cond_9
    new-instance v1, LJ3/n;

    .line 275
    .line 276
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 277
    .line 278
    .line 279
    return-object v1

    .line 280
    :cond_a
    :goto_4
    new-instance v1, LJ3/m;

    .line 281
    .line 282
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 283
    .line 284
    .line 285
    return-object v1
.end method
