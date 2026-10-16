.class public La2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/dexterous/flutterlocalnotifications/i;
.implements Lcom/google/android/gms/internal/ads/zzblx;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;
.implements Lo2/h;
.implements Lh1/a;
.implements Lp/w;
.implements Lcom/google/android/gms/common/api/internal/w;
.implements Lq/W;
.implements Lh6/f;
.implements Luc/b;
.implements Luc/p;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, La2/v;->a:I

    packed-switch p1, :pswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void

    .line 11
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void

    .line 13
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, LP/d;

    const/16 v0, 0x10

    new-array v0, v0, [Lp0/e;

    invoke-direct {p1, v0}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 15
    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, La2/v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, La2/v;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p1

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, La2/v;->a:I

    const-string v0, "externalLinkHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lj7/g;Lj7/a;)V
    .locals 0

    const/16 p1, 0xd

    iput p1, p0, La2/v;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, La2/v;->a:I

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, La2/v;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x1d

    iput v0, p0, La2/v;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 20
    new-instance v1, Luc/r;

    sget-object v2, Luc/m;->a:Luc/m;

    const/4 v3, 0x0

    .line 21
    const-string v4, "flutter/scribe"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 22
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public constructor <init>(Ltf/a;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, La2/v;->a:I

    const-string v0, "defaultFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwd/c;Lcom/moloco/sdk/internal/services/bidtoken/l;Lcom/moloco/sdk/internal/services/bidtoken/h;)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, La2/v;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final i(La2/v;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/internal/services/bidtoken/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/bidtoken/e;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/internal/services/bidtoken/e;-><init>(La2/v;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const-class v5, [B

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_3

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object p0, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->a:La2/v;

    .line 56
    .line 57
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch LCd/c0; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    move-object v3, p1

    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :catch_1
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    move-object v3, p1

    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :catch_2
    move-exception v0

    .line 73
    move-object p1, v0

    .line 74
    move-object v3, p1

    .line 75
    goto/16 :goto_a

    .line 76
    .line 77
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :try_start_2
    iget-object p2, p0, La2/v;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lwd/c;

    .line 83
    .line 84
    new-instance v2, LFd/c;

    .line 85
    .line 86
    invoke-direct {v2}, LFd/c;-><init>()V

    .line 87
    .line 88
    .line 89
    sget-object v7, LJd/s;->c:LJd/s;

    .line 90
    .line 91
    invoke-virtual {v2, v7}, LFd/c;->c(LJd/s;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v2, p1}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, Lcom/moloco/sdk/internal/publisher/d;

    .line 98
    .line 99
    const/4 v7, 0x4

    .line 100
    invoke-direct {p1, p0, v7}, Lcom/moloco/sdk/internal/publisher/d;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v2, p1}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 104
    .line 105
    .line 106
    sget-object p1, LJd/c;->b:LJd/f;

    .line 107
    .line 108
    invoke-static {v2, p1}, Lff/B;->j(LFd/c;LJd/f;)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, La2/v;->j()[B

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    instance-of v7, p1, LMd/c;

    .line 116
    .line 117
    if-eqz v7, :cond_4

    .line 118
    .line 119
    iput-object p1, v2, LFd/c;->d:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-virtual {v2, v6}, LFd/c;->b(LSd/a;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    iput-object p1, v2, LFd/c;->d:Ljava/lang/Object;

    .line 126
    .line 127
    sget-object p1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 128
    .line 129
    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 130
    .line 131
    .line 132
    move-result-object p1
    :try_end_2
    .catch LCd/c0; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 133
    :try_start_3
    invoke-static {v5}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 134
    .line 135
    .line 136
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    goto :goto_1

    .line 138
    :catchall_0
    move-object v7, v6

    .line 139
    :goto_1
    :try_start_4
    new-instance v8, LSd/a;

    .line 140
    .line 141
    invoke-direct {v8, p1, v7}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v8}, LFd/c;->b(LSd/a;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    const-wide/16 v7, 0xaf0

    .line 148
    .line 149
    invoke-static {v2, v7, v8}, LA6/h;->d(LFd/c;J)V

    .line 150
    .line 151
    .line 152
    sget-object p1, LJd/s;->c:LJd/s;

    .line 153
    .line 154
    invoke-virtual {v2, p1}, LFd/c;->c(LJd/s;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, LS3/s;

    .line 158
    .line 159
    invoke-direct {p1, v2, p2}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 160
    .line 161
    .line 162
    iput-object p0, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->a:La2/v;

    .line 163
    .line 164
    iput v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    .line 165
    .line 166
    invoke-virtual {p1, v0}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    if-ne p2, v1, :cond_5

    .line 171
    .line 172
    goto/16 :goto_b

    .line 173
    .line 174
    :cond_5
    :goto_3
    check-cast p2, LGd/a;
    :try_end_4
    .catch LCd/c0; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 175
    .line 176
    invoke-virtual {p2}, LGd/a;->e()LJd/v;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    sget-object p1, LJd/v;->c:LJd/v;

    .line 181
    .line 182
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-eqz p0, :cond_9

    .line 187
    .line 188
    :try_start_5
    invoke-virtual {p2}, LGd/a;->c()Lxd/c;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    sget-object p1, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 193
    .line 194
    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 195
    .line 196
    .line 197
    move-result-object p1
    :try_end_5
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_5 .. :try_end_5} :catch_3

    .line 198
    :try_start_6
    invoke-static {v5}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 199
    .line 200
    .line 201
    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 202
    goto :goto_4

    .line 203
    :catchall_1
    move-object p2, v6

    .line 204
    :goto_4
    :try_start_7
    new-instance v2, LSd/a;

    .line 205
    .line 206
    invoke-direct {v2, p1, p2}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 207
    .line 208
    .line 209
    iput-object v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->a:La2/v;

    .line 210
    .line 211
    iput v3, v0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    .line 212
    .line 213
    invoke-virtual {p0, v2, v0}, Lxd/c;->a(LSd/a;Llf/c;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    if-ne p2, v1, :cond_6

    .line 218
    .line 219
    goto/16 :goto_b

    .line 220
    .line 221
    :cond_6
    :goto_5
    if-eqz p2, :cond_8

    .line 222
    .line 223
    check-cast p2, [B

    .line 224
    .line 225
    invoke-static {p2}, Lcom/moloco/sdk/g;->f([B)Lcom/moloco/sdk/g;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    new-instance p1, Lcom/moloco/sdk/internal/z;

    .line 230
    .line 231
    new-instance p2, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 232
    .line 233
    invoke-virtual {p0}, Lcom/moloco/sdk/g;->b()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-string v1, "getBidToken(...)"

    .line 238
    .line 239
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Lcom/moloco/sdk/g;->d()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    const-string v2, "getPk(...)"

    .line 247
    .line 248
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    sget-object v2, Lcom/moloco/sdk/internal/services/bidtoken/f;->a:Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/moloco/sdk/g;->e()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_7

    .line 258
    .line 259
    new-instance v2, Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/moloco/sdk/g;->c()Lcom/moloco/sdk/f;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {p0}, Lcom/moloco/sdk/f;->c()Z

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    invoke-direct {v2, p0}, Lcom/moloco/sdk/internal/services/bidtoken/g;-><init>(Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_7
    sget-object v2, Lcom/moloco/sdk/internal/services/bidtoken/f;->a:Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 274
    .line 275
    :goto_6
    invoke-direct {p2, v0, v1, v2}, Lcom/moloco/sdk/internal/services/bidtoken/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;)V

    .line 276
    .line 277
    .line 278
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :goto_7
    move-object v1, p1

    .line 282
    goto/16 :goto_b

    .line 283
    .line 284
    :cond_8
    new-instance p0, Ljava/lang/NullPointerException;

    .line 285
    .line 286
    const-string p1, "null cannot be cast to non-null type kotlin.ByteArray"

    .line 287
    .line 288
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p0
    :try_end_7
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_7 .. :try_end_7} :catch_3

    .line 292
    :catch_3
    move-exception v0

    .line 293
    move-object p0, v0

    .line 294
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 295
    .line 296
    new-instance p2, Lcom/moloco/sdk/internal/n;

    .line 297
    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v1, "Bidtoken parsing failed. Reason: "

    .line 301
    .line 302
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    sget-object v0, LJd/v;->k:LJd/v;

    .line 313
    .line 314
    iget v0, v0, LJd/v;->a:I

    .line 315
    .line 316
    invoke-direct {p2, p0, v0}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_9
    new-instance p0, Lcom/moloco/sdk/internal/y;

    .line 324
    .line 325
    new-instance p1, Lcom/moloco/sdk/internal/n;

    .line 326
    .line 327
    invoke-virtual {p2}, LGd/a;->e()LJd/v;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    iget p2, p2, LJd/v;->a:I

    .line 332
    .line 333
    const-string v0, "bidtoken request failed"

    .line 334
    .line 335
    invoke-direct {p1, v0, p2}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 336
    .line 337
    .line 338
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    move-object v1, p0

    .line 342
    goto :goto_b

    .line 343
    :goto_8
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    const/16 v5, 0x8

    .line 349
    .line 350
    const/4 v6, 0x0

    .line 351
    const-string v1, "BidTokenApi"

    .line 352
    .line 353
    const-string v2, "Bid Token API Request exception"

    .line 354
    .line 355
    const/4 v4, 0x0

    .line 356
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 360
    .line 361
    new-instance p0, Lcom/moloco/sdk/internal/n;

    .line 362
    .line 363
    sget-object p1, Lcom/moloco/sdk/internal/services/bidtoken/c;->a:[Lcom/moloco/sdk/internal/services/bidtoken/c;

    .line 364
    .line 365
    const-string p1, "bidtoken request failed due to unknown exception"

    .line 366
    .line 367
    const/16 p2, -0x64

    .line 368
    .line 369
    invoke-direct {p0, p1, p2}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 370
    .line 371
    .line 372
    invoke-direct {v1, p0}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    goto :goto_b

    .line 376
    :goto_9
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 377
    .line 378
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    const/16 v5, 0x8

    .line 382
    .line 383
    const/4 v6, 0x0

    .line 384
    const-string v1, "BidTokenApi"

    .line 385
    .line 386
    const-string v2, "Unknown Host Request exception"

    .line 387
    .line 388
    const/4 v4, 0x0

    .line 389
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 393
    .line 394
    new-instance p0, Lcom/moloco/sdk/internal/n;

    .line 395
    .line 396
    sget-object p1, Lcom/moloco/sdk/internal/services/bidtoken/c;->a:[Lcom/moloco/sdk/internal/services/bidtoken/c;

    .line 397
    .line 398
    const-string p1, "bidtoken request failed due to not being able to connect to host"

    .line 399
    .line 400
    const/16 p2, -0x66

    .line 401
    .line 402
    invoke-direct {p0, p1, p2}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 403
    .line 404
    .line 405
    invoke-direct {v1, p0}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    goto :goto_b

    .line 409
    :goto_a
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 410
    .line 411
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    const/16 v5, 0x8

    .line 415
    .line 416
    const/4 v6, 0x0

    .line 417
    const-string v1, "BidTokenApi"

    .line 418
    .line 419
    const-string v2, "Request timeout exception"

    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 426
    .line 427
    new-instance p0, Lcom/moloco/sdk/internal/n;

    .line 428
    .line 429
    sget-object p1, Lcom/moloco/sdk/internal/services/bidtoken/c;->a:[Lcom/moloco/sdk/internal/services/bidtoken/c;

    .line 430
    .line 431
    const-string p1, "bidtoken request failed due to timeout"

    .line 432
    .line 433
    const/16 p2, -0x65

    .line 434
    .line 435
    invoke-direct {p0, p1, p2}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v1, p0}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :goto_b
    return-object v1
.end method

.method public static j()[B
    .locals 2

    .line 1
    invoke-static {}, Lcom/moloco/sdk/c;->b()Lcom/moloco/sdk/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/moloco/sdk/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "toByteArray(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static q(Lia/h;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lia/h;->getFieldsList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lia/f;

    .line 25
    .line 26
    invoke-virtual {v1}, Lia/f;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1}, Lia/f;->g()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-static {v3, v4}, LA/f;->b(II)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v1}, Lia/f;->f()Lia/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v3, Lia/e;->c:Lia/e;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    :cond_1
    :goto_1
    new-instance v1, Ls9/d;

    .line 61
    .line 62
    invoke-direct {v1, v4, v2}, Ls9/d;-><init>(ILs9/j;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-object v0
.end method

.method public static v(Landroid/content/Intent;)La2/v;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "trace-startup"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "--trace-startup"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v1, "start-paused"

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v1, "--start-paused"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string v1, "vm-service-port"

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const-string v3, "--vm-service-port="

    .line 40
    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const-string v1, "observatory-port"

    .line 64
    .line 65
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-lez v1, :cond_3

    .line 70
    .line 71
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    const-string v1, "disable-service-auth-codes"

    .line 91
    .line 92
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    const-string v1, "--disable-service-auth-codes"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_4
    const-string v1, "endless-trace-buffer"

    .line 104
    .line 105
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    const-string v1, "--endless-trace-buffer"

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_5
    const-string v1, "use-test-fonts"

    .line 117
    .line 118
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    const-string v1, "--use-test-fonts"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_6
    const-string v1, "enable-dart-profiling"

    .line 130
    .line 131
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    const-string v1, "--enable-dart-profiling"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_7
    const-string v1, "enable-software-rendering"

    .line 143
    .line 144
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    const-string v1, "--enable-software-rendering"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_8
    const-string v1, "skia-deterministic-rendering"

    .line 156
    .line 157
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    const-string v1, "--skia-deterministic-rendering"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    :cond_9
    const-string v1, "trace-skia"

    .line 169
    .line 170
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    const-string v1, "--trace-skia"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_a
    const-string v1, "trace-skia-allowlist"

    .line 182
    .line 183
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_b

    .line 188
    .line 189
    const-string v3, "--trace-skia-allowlist="

    .line 190
    .line 191
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_b
    const-string v1, "trace-systrace"

    .line 199
    .line 200
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_c

    .line 205
    .line 206
    const-string v1, "--trace-systrace"

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    :cond_c
    const-string v1, "trace-to-file"

    .line 212
    .line 213
    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_d

    .line 218
    .line 219
    new-instance v3, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v4, "--trace-to-file="

    .line 222
    .line 223
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    :cond_d
    const-string v1, "enable-impeller"

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_f

    .line 247
    .line 248
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_e

    .line 253
    .line 254
    const-string v1, "--enable-impeller=true"

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_e
    const-string v1, "--enable-impeller=false"

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_f
    :goto_1
    const-string v1, "enable-vulkan-validation"

    .line 266
    .line 267
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_10

    .line 272
    .line 273
    const-string v1, "--enable-vulkan-validation"

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    :cond_10
    const-string v1, "dump-skp-on-shader-compilation"

    .line 279
    .line 280
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_11

    .line 285
    .line 286
    const-string v1, "--dump-skp-on-shader-compilation"

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_11
    const-string v1, "cache-sksl"

    .line 292
    .line 293
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_12

    .line 298
    .line 299
    const-string v1, "--cache-sksl"

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_12
    const-string v1, "purge-persistent-cache"

    .line 305
    .line 306
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_13

    .line 311
    .line 312
    const-string v1, "--purge-persistent-cache"

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_13
    const-string v1, "verbose-logging"

    .line 318
    .line 319
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_14

    .line 324
    .line 325
    const-string v1, "--verbose-logging"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_14
    const-string v1, "dart-flags"

    .line 331
    .line 332
    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-eqz v2, :cond_15

    .line 337
    .line 338
    new-instance v2, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    const-string v3, "--dart-flags="

    .line 341
    .line 342
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    :cond_15
    new-instance p0, La2/v;

    .line 360
    .line 361
    const/16 v1, 0xf

    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    invoke-direct {p0, v1, v2}, La2/v;-><init>(IZ)V

    .line 365
    .line 366
    .line 367
    new-instance v1, Ljava/util/HashSet;

    .line 368
    .line 369
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 370
    .line 371
    .line 372
    iput-object v1, p0, La2/v;->b:Ljava/lang/Object;

    .line 373
    .line 374
    return-object p0
.end method


# virtual methods
.method public bridge synthetic A(Lo2/j;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lg2/x;

    .line 2
    .line 3
    return-void
.end method

.method public B(Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Luc/q;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 0

    .line 1
    check-cast p1, Lg2/x;

    .line 2
    .line 3
    iget-object p1, p0, La2/v;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lg2/z;

    .line 6
    .line 7
    iget-boolean p1, p1, Lg2/z;->f:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, La2/v;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lg2/z;

    .line 14
    .line 15
    iget-object p1, p1, Lg2/z;->a:LY2/B;

    .line 16
    .line 17
    :cond_0
    sget-object p1, Lo2/m;->e:LU5/f;

    .line 18
    .line 19
    return-object p1
.end method

.method public F(Lp/k;)Z
    .locals 2

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj/w;

    .line 4
    .line 5
    iget-object v0, v0, Lj/w;->l:Landroid/view/Window;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x6c

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method public a(J)I
    .locals 2

    .line 2
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    invoke-virtual {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;->a(Ljava/lang/String;)Z

    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lj7/h;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    new-instance v0, Lj7/f;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lj7/f;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lj7/e;

    .line 15
    .line 16
    iget-object p2, p0, La2/v;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lj7/a;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/base/zac;->zad(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/base/zac;->zad(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x2

    .line 35
    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/internal/base/zaa;->zac(ILandroid/os/Parcel;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroid/net/Uri;[Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 1
    const-string v3, "query = ?"

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/ContentProviderClient;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v7

    .line 11
    :cond_0
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v4, p3

    .line 16
    :try_start_0
    invoke-virtual/range {v0 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    const-string p2, "FontsProvider"

    .line 24
    .line 25
    const-string p3, "Unable to query the content provider"

    .line 26
    .line 27
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    return-object v7
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ContentProviderClient;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, La2/v;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v3, Lme/a;

    .line 7
    .line 8
    iget-object v4, v3, Lme/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v4, Lio/flutter/view/a;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v5}, Lba/a;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    check-cast p1, Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v4, "type"

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    const-string v6, "data"

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v7, "message"

    .line 41
    .line 42
    const-string v8, "nodeId"

    .line 43
    .line 44
    const/4 v9, -0x1

    .line 45
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    sparse-switch v10, :sswitch_data_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_0
    const-string v10, "longPress"

    .line 54
    .line 55
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v9, 0x4

    .line 63
    goto :goto_0

    .line 64
    :sswitch_1
    const-string v10, "focus"

    .line 65
    .line 66
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const/4 v9, 0x3

    .line 74
    goto :goto_0

    .line 75
    :sswitch_2
    const-string v10, "tap"

    .line 76
    .line 77
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move v9, v0

    .line 85
    goto :goto_0

    .line 86
    :sswitch_3
    const-string v10, "announce"

    .line 87
    .line 88
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    move v9, v1

    .line 96
    goto :goto_0

    .line 97
    :sswitch_4
    const-string v10, "tooltip"

    .line 98
    .line 99
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    move v9, v2

    .line 107
    :goto_0
    packed-switch v9, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :pswitch_0
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_8

    .line 119
    .line 120
    iget-object v1, v3, Lme/a;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lio/flutter/view/a;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iget-object v1, v1, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lio/flutter/view/l;

    .line 131
    .line 132
    invoke-virtual {v1, p1, v0}, Lio/flutter/view/l;->g(II)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_1
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    iget-object v0, v3, Lme/a;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lio/flutter/view/a;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lio/flutter/view/l;

    .line 156
    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/l;->g(II)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_2
    invoke-virtual {p1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    iget-object v0, v3, Lme/a;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lio/flutter/view/a;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lio/flutter/view/l;

    .line 182
    .line 183
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/l;->g(II)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_3
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    iget-object v0, v3, Lme/a;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lio/flutter/view/a;

    .line 198
    .line 199
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    const/16 v2, 0x24

    .line 202
    .line 203
    if-lt v1, v2, :cond_6

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const-string v1, "AccessibilityBridge"

    .line 209
    .line 210
    const-string v2, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)"

    .line 211
    .line 212
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_6
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lio/flutter/view/l;

    .line 218
    .line 219
    iget-object v0, v0, Lio/flutter/view/l;->a:Lkc/r;

    .line 220
    .line 221
    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_4
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Ljava/lang/String;

    .line 230
    .line 231
    if-eqz p1, :cond_8

    .line 232
    .line 233
    iget-object v0, v3, Lme/a;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lio/flutter/view/a;

    .line 236
    .line 237
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 238
    .line 239
    const/16 v3, 0x1c

    .line 240
    .line 241
    if-lt v1, v3, :cond_7

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_7
    iget-object v0, v0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lio/flutter/view/l;

    .line 250
    .line 251
    const/16 v1, 0x20

    .line 252
    .line 253
    invoke-virtual {v0, v2, v1}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    :goto_1
    invoke-virtual {p2, v5}, Lba/a;->c(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :sswitch_data_0
    .sparse-switch
        -0x43f42ffd -> :sswitch_4
        -0x26b86b97 -> :sswitch_3
        0x1bfa3 -> :sswitch_2
        0x5d154d8 -> :sswitch_1
        0x6ce9b27 -> :sswitch_0
    .end sparse-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(J)Ljava/util/List;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La2/v;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public h(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(I)J
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {p1}, Lu6/a;->e(Z)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0
.end method

.method public l(Lp/k;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lj/w;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lj/w;->q(Lp/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m(Lp9/f;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lp9/f;->b:Ls9/k;

    .line 2
    .line 3
    iget-object v1, v0, Ls9/k;->a:Ls9/h;

    .line 4
    .line 5
    iget-object v2, p0, La2/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lp9/f;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v4, Lp9/e;->b:Lp9/e;

    .line 22
    .line 23
    sget-object v5, Lp9/e;->d:Lp9/e;

    .line 24
    .line 25
    iget-object v6, v3, Lp9/f;->a:Lp9/e;

    .line 26
    .line 27
    iget-object v7, p1, Lp9/f;->a:Lp9/e;

    .line 28
    .line 29
    if-eq v7, v4, :cond_1

    .line 30
    .line 31
    if-ne v6, v5, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    sget-object p1, Lp9/e;->a:Lp9/e;

    .line 38
    .line 39
    if-ne v7, v5, :cond_2

    .line 40
    .line 41
    if-eq v6, p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Lp9/f;

    .line 44
    .line 45
    invoke-direct {p1, v6, v0}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    sget-object v5, Lp9/e;->c:Lp9/e;

    .line 53
    .line 54
    if-ne v7, v5, :cond_3

    .line 55
    .line 56
    if-ne v6, v5, :cond_3

    .line 57
    .line 58
    new-instance p1, Lp9/f;

    .line 59
    .line 60
    invoke-direct {p1, v5, v0}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    if-ne v7, v5, :cond_4

    .line 68
    .line 69
    if-ne v6, v4, :cond_4

    .line 70
    .line 71
    new-instance p1, Lp9/f;

    .line 72
    .line 73
    invoke-direct {p1, v4, v0}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    if-ne v7, p1, :cond_5

    .line 81
    .line 82
    if-ne v6, v4, :cond_5

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    if-ne v7, p1, :cond_6

    .line 89
    .line 90
    if-ne v6, v5, :cond_6

    .line 91
    .line 92
    new-instance v0, Lp9/f;

    .line 93
    .line 94
    iget-object v3, v3, Lp9/f;->b:Ls9/k;

    .line 95
    .line 96
    invoke-direct {v0, p1, v3}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_6
    if-ne v7, v4, :cond_7

    .line 104
    .line 105
    if-ne v6, p1, :cond_7

    .line 106
    .line 107
    new-instance p1, Lp9/f;

    .line 108
    .line 109
    invoke-direct {p1, v5, v0}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    const-string p1, "Unsupported combination of changes %s after %s"

    .line 117
    .line 118
    const/4 v0, 0x2

    .line 119
    new-array v0, v0, [Ljava/lang/Object;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    aput-object v7, v0, v1

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    aput-object v6, v0, v1

    .line 126
    .line 127
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    throw p1
.end method

.method public n(Ljava/util/LinkedHashMap;Lt0/i;LE5/b;Z)Z
    .locals 6

    .line 1
    const-string v0, "parentCoordinates"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LP/d;

    .line 9
    .line 10
    iget v1, v0, LP/d;->c:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-lez v1, :cond_3

    .line 14
    .line 15
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 16
    .line 17
    move v3, v2

    .line 18
    move v4, v3

    .line 19
    :cond_0
    aget-object v5, v0, v3

    .line 20
    .line 21
    check-cast v5, Lp0/e;

    .line 22
    .line 23
    invoke-virtual {v5, p1, p2, p3, p4}, Lp0/e;->n(Ljava/util/LinkedHashMap;Lt0/i;LE5/b;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_2

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v4, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    const/4 v4, 0x1

    .line 35
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    if-lt v3, v1, :cond_0

    .line 38
    .line 39
    return v4

    .line 40
    :cond_3
    return v2
.end method

.method public o(LE5/b;)V
    .locals 2

    .line 1
    iget-object p1, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LP/d;

    .line 4
    .line 5
    iget v0, p1, LP/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    const/4 v1, -0x1

    .line 10
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p1, LP/d;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    aget-object v1, v1, v0

    .line 15
    .line 16
    check-cast v1, Lp0/e;

    .line 17
    .line 18
    iget-object v1, v1, Lp0/e;->d:LP/d;

    .line 19
    .line 20
    invoke-virtual {v1}, LP/d;->i()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LP/d;->m(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const-string v7, "error"

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v10, 0x2

    .line 11
    iget v12, v1, La2/v;->a:I

    .line 12
    .line 13
    packed-switch v12, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v12, v1, La2/v;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v12, Lt6/q;

    .line 19
    .line 20
    iget-object v13, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v13, Lio/flutter/plugin/platform/n;

    .line 23
    .line 24
    if-nez v13, :cond_0

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_0
    iget-object v13, v0, Luc/o;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v14, "left"

    .line 34
    .line 35
    const-string v15, "top"

    .line 36
    .line 37
    const-string v2, "height"

    .line 38
    .line 39
    const-string v3, "width"

    .line 40
    .line 41
    const-string v11, "direction"

    .line 42
    .line 43
    const-string v4, "id"

    .line 44
    .line 45
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 46
    .line 47
    const/16 v20, -0x1

    .line 48
    .line 49
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v21

    .line 53
    sparse-switch v21, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_0
    const-string v5, "dispose"

    .line 59
    .line 60
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-nez v5, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/16 v20, 0x7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :sswitch_1
    const-string v5, "setDirection"

    .line 71
    .line 72
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const/16 v20, 0x6

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :sswitch_2
    const-string v5, "touch"

    .line 83
    .line 84
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    const/16 v20, 0x5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :sswitch_3
    const-string v5, "synchronizeToNativeViewHierarchy"

    .line 95
    .line 96
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    const/16 v20, 0x4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :sswitch_4
    const-string v5, "clearFocus"

    .line 107
    .line 108
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-nez v5, :cond_5

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    const/16 v20, 0x3

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :sswitch_5
    const-string v5, "resize"

    .line 119
    .line 120
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_6

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    move/from16 v20, v10

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :sswitch_6
    const-string v5, "offset"

    .line 131
    .line 132
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-nez v5, :cond_7

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    move/from16 v20, v9

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :sswitch_7
    const-string v5, "create"

    .line 143
    .line 144
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_8

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_8
    move/from16 v20, v8

    .line 152
    .line 153
    :goto_0
    packed-switch v20, :pswitch_data_1

    .line 154
    .line 155
    .line 156
    move-object/from16 v0, p2

    .line 157
    .line 158
    check-cast v0, Ltc/g;

    .line 159
    .line 160
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :pswitch_0
    check-cast v0, Ljava/util/Map;

    .line 166
    .line 167
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    :try_start_0
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 180
    .line 181
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v0, p2

    .line 185
    .line 186
    check-cast v0, Ltc/g;

    .line 187
    .line 188
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    goto/16 :goto_6

    .line 192
    .line 193
    :catch_0
    move-exception v0

    .line 194
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v2, p2

    .line 199
    .line 200
    check-cast v2, Ltc/g;

    .line 201
    .line 202
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_6

    .line 206
    .line 207
    :pswitch_1
    check-cast v0, Ljava/util/Map;

    .line 208
    .line 209
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Ljava/lang/Integer;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    :try_start_1
    iget-object v3, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 232
    .line 233
    invoke-virtual {v3, v2, v0}, Lio/flutter/plugin/platform/n;->l(II)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v0, p2

    .line 237
    .line 238
    check-cast v0, Ltc/g;

    .line 239
    .line 240
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 241
    .line 242
    .line 243
    goto/16 :goto_6

    .line 244
    .line 245
    :catch_1
    move-exception v0

    .line 246
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object/from16 v2, p2

    .line 251
    .line 252
    check-cast v2, Ltc/g;

    .line 253
    .line 254
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_6

    .line 258
    .line 259
    :pswitch_2
    check-cast v0, Ljava/util/List;

    .line 260
    .line 261
    new-instance v22, Ltc/f;

    .line 262
    .line 263
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, Ljava/lang/Integer;

    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v23

    .line 273
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    move-object/from16 v24, v2

    .line 278
    .line 279
    check-cast v24, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    move-object/from16 v25, v2

    .line 286
    .line 287
    check-cast v25, Ljava/lang/Number;

    .line 288
    .line 289
    const/4 v2, 0x3

    .line 290
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    check-cast v2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v26

    .line 300
    const/4 v2, 0x4

    .line 301
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    check-cast v2, Ljava/lang/Integer;

    .line 306
    .line 307
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v27

    .line 311
    const/4 v2, 0x5

    .line 312
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v28

    .line 316
    const/4 v2, 0x6

    .line 317
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v29

    .line 321
    const/4 v2, 0x7

    .line 322
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result v30

    .line 332
    const/16 v2, 0x8

    .line 333
    .line 334
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    check-cast v2, Ljava/lang/Integer;

    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result v31

    .line 344
    const/16 v2, 0x9

    .line 345
    .line 346
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Ljava/lang/Double;

    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 353
    .line 354
    .line 355
    move-result-wide v2

    .line 356
    double-to-float v2, v2

    .line 357
    const/16 v3, 0xa

    .line 358
    .line 359
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, Ljava/lang/Double;

    .line 364
    .line 365
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 366
    .line 367
    .line 368
    move-result-wide v3

    .line 369
    double-to-float v3, v3

    .line 370
    const/16 v4, 0xb

    .line 371
    .line 372
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    check-cast v4, Ljava/lang/Integer;

    .line 377
    .line 378
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result v34

    .line 382
    const/16 v4, 0xc

    .line 383
    .line 384
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    check-cast v4, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v35

    .line 394
    const/16 v4, 0xd

    .line 395
    .line 396
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    check-cast v4, Ljava/lang/Integer;

    .line 401
    .line 402
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v36

    .line 406
    const/16 v4, 0xe

    .line 407
    .line 408
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    check-cast v4, Ljava/lang/Integer;

    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result v37

    .line 418
    const/16 v4, 0xf

    .line 419
    .line 420
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v0, Ljava/lang/Number;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 427
    .line 428
    .line 429
    move-result-wide v38

    .line 430
    move/from16 v32, v2

    .line 431
    .line 432
    move/from16 v33, v3

    .line 433
    .line 434
    invoke-direct/range {v22 .. v39}, Ltc/f;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 435
    .line 436
    .line 437
    move-object/from16 v0, v22

    .line 438
    .line 439
    :try_start_2
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 442
    .line 443
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->h(Ltc/f;)V

    .line 444
    .line 445
    .line 446
    move-object/from16 v0, p2

    .line 447
    .line 448
    check-cast v0, Ltc/g;

    .line 449
    .line 450
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 451
    .line 452
    .line 453
    goto/16 :goto_6

    .line 454
    .line 455
    :catch_2
    move-exception v0

    .line 456
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    move-object/from16 v2, p2

    .line 461
    .line 462
    check-cast v2, Ltc/g;

    .line 463
    .line 464
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_6

    .line 468
    .line 469
    :pswitch_3
    check-cast v0, Ljava/lang/Boolean;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    :try_start_3
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 478
    .line 479
    iget-object v2, v2, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v2, Lio/flutter/plugin/platform/q;

    .line 482
    .line 483
    iput-boolean v0, v2, Lio/flutter/plugin/platform/q;->q:Z

    .line 484
    .line 485
    move-object/from16 v0, p2

    .line 486
    .line 487
    check-cast v0, Ltc/g;

    .line 488
    .line 489
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 490
    .line 491
    .line 492
    goto/16 :goto_6

    .line 493
    .line 494
    :catch_3
    move-exception v0

    .line 495
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    move-object/from16 v2, p2

    .line 500
    .line 501
    check-cast v2, Ltc/g;

    .line 502
    .line 503
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_6

    .line 507
    .line 508
    :pswitch_4
    check-cast v0, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    :try_start_4
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 517
    .line 518
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->b(I)V

    .line 519
    .line 520
    .line 521
    move-object/from16 v0, p2

    .line 522
    .line 523
    check-cast v0, Ltc/g;

    .line 524
    .line 525
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 526
    .line 527
    .line 528
    goto/16 :goto_6

    .line 529
    .line 530
    :catch_4
    move-exception v0

    .line 531
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    move-object/from16 v2, p2

    .line 536
    .line 537
    check-cast v2, Ltc/g;

    .line 538
    .line 539
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_6

    .line 543
    .line 544
    :pswitch_5
    check-cast v0, Ljava/util/Map;

    .line 545
    .line 546
    new-instance v19, Ltc/e;

    .line 547
    .line 548
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    check-cast v4, Ljava/lang/Integer;

    .line 553
    .line 554
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 555
    .line 556
    .line 557
    move-result v20

    .line 558
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    check-cast v3, Ljava/lang/Double;

    .line 563
    .line 564
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 565
    .line 566
    .line 567
    move-result-wide v21

    .line 568
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    check-cast v0, Ljava/lang/Double;

    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 575
    .line 576
    .line 577
    move-result-wide v23

    .line 578
    invoke-direct/range {v19 .. v24}, Ltc/e;-><init>(IDD)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v0, v19

    .line 582
    .line 583
    :try_start_5
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 586
    .line 587
    new-instance v3, LKa/b;

    .line 588
    .line 589
    move-object/from16 v4, p2

    .line 590
    .line 591
    check-cast v4, Ltc/g;

    .line 592
    .line 593
    const/4 v5, 0x5

    .line 594
    invoke-direct {v3, v4, v5}, LKa/b;-><init>(Ltc/g;I)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v0, v3}, Lio/flutter/plugin/platform/n;->k(Ltc/e;LKa/b;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 598
    .line 599
    .line 600
    goto/16 :goto_6

    .line 601
    .line 602
    :catch_5
    move-exception v0

    .line 603
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    move-object/from16 v2, p2

    .line 608
    .line 609
    check-cast v2, Ltc/g;

    .line 610
    .line 611
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto/16 :goto_6

    .line 615
    .line 616
    :pswitch_6
    check-cast v0, Ljava/util/Map;

    .line 617
    .line 618
    :try_start_6
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 619
    .line 620
    move-object v8, v2

    .line 621
    check-cast v8, Lio/flutter/plugin/platform/n;

    .line 622
    .line 623
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Ljava/lang/Integer;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Ljava/lang/Double;

    .line 638
    .line 639
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 640
    .line 641
    .line 642
    move-result-wide v10

    .line 643
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    check-cast v0, Ljava/lang/Double;

    .line 648
    .line 649
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 650
    .line 651
    .line 652
    move-result-wide v12

    .line 653
    invoke-virtual/range {v8 .. v13}, Lio/flutter/plugin/platform/n;->g(IDD)V

    .line 654
    .line 655
    .line 656
    move-object/from16 v0, p2

    .line 657
    .line 658
    check-cast v0, Ltc/g;

    .line 659
    .line 660
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6

    .line 661
    .line 662
    .line 663
    goto/16 :goto_6

    .line 664
    .line 665
    :catch_6
    move-exception v0

    .line 666
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    move-object/from16 v2, p2

    .line 671
    .line 672
    check-cast v2, Ltc/g;

    .line 673
    .line 674
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    goto/16 :goto_6

    .line 678
    .line 679
    :pswitch_7
    const-string v5, "hybridFallback"

    .line 680
    .line 681
    check-cast v0, Ljava/util/Map;

    .line 682
    .line 683
    const-string v13, "hybrid"

    .line 684
    .line 685
    invoke-interface {v0, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v16

    .line 689
    if-eqz v16, :cond_9

    .line 690
    .line 691
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v13

    .line 695
    check-cast v13, Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result v13

    .line 701
    if-eqz v13, :cond_9

    .line 702
    .line 703
    move v13, v9

    .line 704
    goto :goto_1

    .line 705
    :cond_9
    move v13, v8

    .line 706
    :goto_1
    const-string v9, "params"

    .line 707
    .line 708
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v17

    .line 712
    if-eqz v17, :cond_a

    .line 713
    .line 714
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v9

    .line 718
    check-cast v9, [B

    .line 719
    .line 720
    invoke-static {v9}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 721
    .line 722
    .line 723
    move-result-object v9

    .line 724
    move-object/from16 v30, v9

    .line 725
    .line 726
    goto :goto_2

    .line 727
    :cond_a
    move-object/from16 v30, v6

    .line 728
    .line 729
    :goto_2
    const-string v9, "viewType"

    .line 730
    .line 731
    if-eqz v13, :cond_b

    .line 732
    .line 733
    :try_start_7
    new-instance v17, Ltc/d;

    .line 734
    .line 735
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    check-cast v2, Ljava/lang/Integer;

    .line 740
    .line 741
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v18

    .line 745
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    move-object/from16 v19, v2

    .line 750
    .line 751
    check-cast v19, Ljava/lang/String;

    .line 752
    .line 753
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    check-cast v0, Ljava/lang/Integer;

    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 760
    .line 761
    .line 762
    move-result v28

    .line 763
    const-wide/16 v20, 0x0

    .line 764
    .line 765
    const-wide/16 v22, 0x0

    .line 766
    .line 767
    const/16 v29, 0x3

    .line 768
    .line 769
    const-wide/16 v24, 0x0

    .line 770
    .line 771
    const-wide/16 v26, 0x0

    .line 772
    .line 773
    invoke-direct/range {v17 .. v30}, Ltc/d;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 774
    .line 775
    .line 776
    move-object/from16 v0, v17

    .line 777
    .line 778
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 781
    .line 782
    iget-object v2, v2, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v2, Lio/flutter/plugin/platform/q;

    .line 785
    .line 786
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    const/16 v3, 0x13

    .line 790
    .line 791
    invoke-static {v3}, Lio/flutter/plugin/platform/q;->h(I)V

    .line 792
    .line 793
    .line 794
    invoke-static {v2, v0}, Lio/flutter/plugin/platform/q;->e(Lio/flutter/plugin/platform/q;Ltc/d;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v0, v8}, Lio/flutter/plugin/platform/q;->f(Ltc/d;Z)Lio/flutter/plugin/platform/e;

    .line 798
    .line 799
    .line 800
    invoke-static {v3}, Lio/flutter/plugin/platform/q;->h(I)V

    .line 801
    .line 802
    .line 803
    move-object/from16 v0, p2

    .line 804
    .line 805
    check-cast v0, Ltc/g;

    .line 806
    .line 807
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    goto/16 :goto_6

    .line 811
    .line 812
    :catch_7
    move-exception v0

    .line 813
    goto/16 :goto_5

    .line 814
    .line 815
    :cond_b
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v13

    .line 819
    if-eqz v13, :cond_c

    .line 820
    .line 821
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    check-cast v5, Ljava/lang/Boolean;

    .line 826
    .line 827
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 828
    .line 829
    .line 830
    move-result v5

    .line 831
    if-eqz v5, :cond_c

    .line 832
    .line 833
    const/4 v8, 0x1

    .line 834
    :cond_c
    if-eqz v8, :cond_d

    .line 835
    .line 836
    move/from16 v29, v10

    .line 837
    .line 838
    goto :goto_3

    .line 839
    :cond_d
    const/16 v29, 0x1

    .line 840
    .line 841
    :goto_3
    new-instance v17, Ltc/d;

    .line 842
    .line 843
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    check-cast v4, Ljava/lang/Integer;

    .line 848
    .line 849
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 850
    .line 851
    .line 852
    move-result v18

    .line 853
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    move-object/from16 v19, v4

    .line 858
    .line 859
    check-cast v19, Ljava/lang/String;

    .line 860
    .line 861
    invoke-interface {v0, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v4

    .line 865
    const-wide/16 v9, 0x0

    .line 866
    .line 867
    if-eqz v4, :cond_e

    .line 868
    .line 869
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    check-cast v4, Ljava/lang/Double;

    .line 874
    .line 875
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 876
    .line 877
    .line 878
    move-result-wide v4

    .line 879
    move-wide/from16 v20, v4

    .line 880
    .line 881
    goto :goto_4

    .line 882
    :cond_e
    move-wide/from16 v20, v9

    .line 883
    .line 884
    :goto_4
    invoke-interface {v0, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v4

    .line 888
    if-eqz v4, :cond_f

    .line 889
    .line 890
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    check-cast v4, Ljava/lang/Double;

    .line 895
    .line 896
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 897
    .line 898
    .line 899
    move-result-wide v9

    .line 900
    :cond_f
    move-wide/from16 v22, v9

    .line 901
    .line 902
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    check-cast v3, Ljava/lang/Double;

    .line 907
    .line 908
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 909
    .line 910
    .line 911
    move-result-wide v24

    .line 912
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    check-cast v2, Ljava/lang/Double;

    .line 917
    .line 918
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 919
    .line 920
    .line 921
    move-result-wide v26

    .line 922
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    check-cast v0, Ljava/lang/Integer;

    .line 927
    .line 928
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 929
    .line 930
    .line 931
    move-result v28

    .line 932
    invoke-direct/range {v17 .. v30}, Ltc/d;-><init>(ILjava/lang/String;DDDDIILjava/nio/ByteBuffer;)V

    .line 933
    .line 934
    .line 935
    move-object/from16 v0, v17

    .line 936
    .line 937
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 940
    .line 941
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->c(Ltc/d;)J

    .line 942
    .line 943
    .line 944
    move-result-wide v2

    .line 945
    const-wide/16 v4, -0x2

    .line 946
    .line 947
    cmp-long v0, v2, v4

    .line 948
    .line 949
    if-nez v0, :cond_11

    .line 950
    .line 951
    if-eqz v8, :cond_10

    .line 952
    .line 953
    move-object/from16 v0, p2

    .line 954
    .line 955
    check-cast v0, Ltc/g;

    .line 956
    .line 957
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 958
    .line 959
    .line 960
    goto :goto_6

    .line 961
    :cond_10
    new-instance v0, Ljava/lang/AssertionError;

    .line 962
    .line 963
    const-string v2, "Platform view attempted to fall back to hybrid mode when not requested."

    .line 964
    .line 965
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    throw v0

    .line 969
    :cond_11
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    move-object/from16 v2, p2

    .line 974
    .line 975
    check-cast v2, Ltc/g;

    .line 976
    .line 977
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7

    .line 978
    .line 979
    .line 980
    goto :goto_6

    .line 981
    :goto_5
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    move-object/from16 v2, p2

    .line 986
    .line 987
    check-cast v2, Ltc/g;

    .line 988
    .line 989
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 990
    .line 991
    .line 992
    :goto_6
    return-void

    .line 993
    :pswitch_8
    const-string v2, "locale"

    .line 994
    .line 995
    iget-object v3, v1, La2/v;->b:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v3, Lt6/q;

    .line 998
    .line 999
    iget-object v4, v3, Lt6/q;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v4, Ltc/j;

    .line 1002
    .line 1003
    if-nez v4, :cond_12

    .line 1004
    .line 1005
    goto :goto_9

    .line 1006
    :cond_12
    iget-object v4, v0, Luc/o;->a:Ljava/lang/String;

    .line 1007
    .line 1008
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    const-string v5, "Localization.getStringResource"

    .line 1012
    .line 1013
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    if-nez v4, :cond_13

    .line 1018
    .line 1019
    move-object/from16 v0, p2

    .line 1020
    .line 1021
    check-cast v0, Ltc/g;

    .line 1022
    .line 1023
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 1024
    .line 1025
    .line 1026
    goto :goto_9

    .line 1027
    :cond_13
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v0, Lorg/json/JSONObject;

    .line 1030
    .line 1031
    :try_start_8
    const-string v4, "key"

    .line 1032
    .line 1033
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v4

    .line 1037
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v5

    .line 1041
    if-eqz v5, :cond_14

    .line 1042
    .line 1043
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    goto :goto_7

    .line 1048
    :catch_8
    move-exception v0

    .line 1049
    goto :goto_8

    .line 1050
    :cond_14
    move-object v0, v6

    .line 1051
    :goto_7
    iget-object v2, v3, Lt6/q;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v2, Ltc/j;

    .line 1054
    .line 1055
    invoke-virtual {v2, v4, v0}, Ltc/j;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    move-object/from16 v2, p2

    .line 1060
    .line 1061
    check-cast v2, Ltc/g;

    .line 1062
    .line 1063
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1064
    .line 1065
    .line 1066
    goto :goto_9

    .line 1067
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    move-object/from16 v2, p2

    .line 1072
    .line 1073
    check-cast v2, Ltc/g;

    .line 1074
    .line 1075
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    :goto_9
    return-void

    .line 1079
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_8
    .end packed-switch

    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    :sswitch_data_0
    .sparse-switch
        -0x509a5f04 -> :sswitch_7
        -0x3cc89b6d -> :sswitch_6
        -0x37b2634c -> :sswitch_5
        -0x2d106975 -> :sswitch_4
        -0x126acbb2 -> :sswitch_3
        0x696df3f -> :sswitch_2
        0x2261393d -> :sswitch_1
        0x63a5261f -> :sswitch_0
    .end sparse-switch

    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public r(Lu9/c;)Ls9/k;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1}, Lu9/c;->g()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {v1}, LA/f;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, La2/v;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lv9/o;

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v0, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lu9/c;->j()Lu9/m;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lu9/m;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v2, v0}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lu9/m;->e()Lcom/google/protobuf/Timestamp;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v1, Ls9/k;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ls9/k;-><init>(Ls9/h;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v1, Ls9/k;->c:Ls9/o;

    .line 47
    .line 48
    const/4 p1, 0x4

    .line 49
    iput p1, v1, Ls9/k;->b:I

    .line 50
    .line 51
    new-instance p1, Ls9/l;

    .line 52
    .line 53
    invoke-direct {p1}, Ls9/l;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, v1, Ls9/k;->e:Ls9/l;

    .line 57
    .line 58
    iput v3, v1, Ls9/k;->f:I

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_0
    const-string v1, "Unknown MaybeDocument %s"

    .line 62
    .line 63
    new-array v0, v0, [Ljava/lang/Object;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    aput-object p1, v0, v2

    .line 67
    .line 68
    invoke-static {v1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    throw p1

    .line 73
    :cond_1
    invoke-virtual {p1}, Lu9/c;->f()Lka/H;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1}, Lu9/c;->h()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {v0}, Lka/H;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v2, v1}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0}, Lka/H;->f()Lcom/google/protobuf/Timestamp;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0}, Lka/H;->getFieldsMap()Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Ls9/l;->e(Ljava/util/Map;)Ls9/l;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v4, Ls9/k;

    .line 106
    .line 107
    invoke-direct {v4, v1}, Ls9/k;-><init>(Ls9/h;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v2, v0}, Ls9/k;->a(Ls9/o;Ls9/l;)V

    .line 111
    .line 112
    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    iput v3, v4, Ls9/k;->f:I

    .line 116
    .line 117
    :cond_2
    return-object v4

    .line 118
    :cond_3
    invoke-virtual {p1}, Lu9/c;->i()Lu9/f;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1}, Lu9/c;->h()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {v0}, Lu9/f;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v2, v1}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0}, Lu9/f;->e()Lcom/google/protobuf/Timestamp;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v1, v0}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    iput v3, v0, Ls9/k;->f:I

    .line 149
    .line 150
    :cond_4
    return-object v0
.end method

.method public s()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La2/v;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Luc/q;

    .line 5
    .line 6
    const-string v2, "permissionRequestInProgress"

    .line 7
    .line 8
    const-string v3, "Another permission request is already in progress"

    .line 9
    .line 10
    invoke-interface {v1, v2, v3, v0}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t(Lu9/p;)Lt9/i;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lu9/p;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lu9/p;->i()Lcom/google/protobuf/Timestamp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, La2/v;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lv9/o;

    .line 12
    .line 13
    new-instance v3, Ls8/q;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    invoke-virtual {v1}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v3, v4, v5, v1}, Ls8/q;-><init>(JI)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lu9/p;->g()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    if-ge v6, v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1, v6}, Lu9/p;->f(I)Lka/G1;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v2, v7}, Lv9/o;->c(Lka/G1;)Lt9/h;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p1}, Lu9/p;->k()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    move v6, v5

    .line 63
    :goto_1
    invoke-virtual {p1}, Lu9/p;->k()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-ge v6, v7, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1, v6}, Lu9/p;->j(I)Lka/G1;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    add-int/lit8 v8, v6, 0x1

    .line 74
    .line 75
    invoke-virtual {p1}, Lu9/p;->k()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-ge v8, v9, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1, v8}, Lu9/p;->j(I)Lka/G1;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v9}, Lka/G1;->q()Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_2

    .line 90
    .line 91
    invoke-virtual {p1, v6}, Lu9/p;->j(I)Lka/G1;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Lka/G1;->r()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const-string v9, "TransformMutation should be preceded by a patch or set mutation"

    .line 100
    .line 101
    new-array v10, v5, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {v6, v9, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v7}, Lka/G1;->u(Lka/G1;)Lka/E1;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {p1, v8}, Lu9/p;->j(I)Lka/G1;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v7}, Lka/G1;->k()Lka/a0;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Lka/a0;->c()Lcom/google/protobuf/Internal$ProtobufList;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_1

    .line 131
    .line 132
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    check-cast v9, Lka/Z;

    .line 137
    .line 138
    invoke-virtual {v6, v9}, Lka/E1;->a(Lka/Z;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_1
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, Lka/G1;

    .line 147
    .line 148
    invoke-virtual {v2, v6}, Lv9/o;->c(Lka/G1;)Lt9/h;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move v6, v8

    .line 156
    goto :goto_3

    .line 157
    :cond_2
    invoke-virtual {v2, v7}, Lv9/o;->c(Lka/G1;)Lt9/h;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    new-instance p1, Lt9/i;

    .line 168
    .line 169
    invoke-direct {p1, v0, v3, v4, v1}, Lt9/i;-><init>(ILs8/q;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    return-object p1
.end method

.method public u(Lu9/j;)Lr9/S;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1}, Lu9/j;->p()I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    invoke-virtual {p1}, Lu9/j;->o()Lcom/google/protobuf/Timestamp;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    invoke-virtual {p1}, Lu9/j;->k()Lcom/google/protobuf/Timestamp;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {p1}, Lu9/j;->n()Lcom/google/protobuf/ByteString;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    invoke-virtual {p1}, Lu9/j;->l()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    invoke-virtual {p1}, Lu9/j;->q()Lu9/i;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-ne v2, v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lu9/j;->j()Lka/l1;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lka/l1;->e()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-ne v2, v1, :cond_0

    .line 53
    .line 54
    move v7, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v7, v0

    .line 57
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-array v11, v1, [Ljava/lang/Object;

    .line 62
    .line 63
    aput-object v2, v11, v0

    .line 64
    .line 65
    const-string v2, "DocumentsTarget contained other than 1 document %d"

    .line 66
    .line 67
    invoke-static {v7, v2, v11}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lka/l1;->d()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lv9/o;->n(Ls9/m;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    const-string v7, "Tried to deserialize invalid key %s"

    .line 83
    .line 84
    new-array v1, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    aput-object p1, v1, v0

    .line 87
    .line 88
    invoke-static {v2, v7, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p1, Ls9/e;->a:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/4 v1, 0x4

    .line 98
    if-ne v0, v1, :cond_1

    .line 99
    .line 100
    sget-object p1, Ls9/m;->b:Ls9/m;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-static {p1}, Lv9/o;->m(Ls9/m;)Ls9/m;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_1
    new-instance v0, Lp9/u;

    .line 108
    .line 109
    invoke-direct {v0, p1, v3}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lp9/u;->i()Lp9/A;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_2
    move-object v3, p1

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    invoke-virtual {p1}, Lu9/j;->q()Lu9/i;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-array v1, v1, [Ljava/lang/Object;

    .line 123
    .line 124
    aput-object p1, v1, v0

    .line 125
    .line 126
    const-string p1, "Unknown targetType %d"

    .line 127
    .line 128
    invoke-static {p1, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    throw v3

    .line 132
    :cond_3
    invoke-virtual {p1}, Lu9/j;->m()Lka/n1;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Lka/n1;->e()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p1}, Lka/n1;->f()Lka/h1;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {v0, p1}, Lv9/o;->e(Ljava/lang/String;Lka/h1;)Lp9/A;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_2

    .line 149
    :goto_3
    new-instance v2, Lr9/S;

    .line 150
    .line 151
    sget-object v7, Lr9/y;->a:Lr9/y;

    .line 152
    .line 153
    const/4 v11, 0x0

    .line 154
    invoke-direct/range {v2 .. v11}, Lr9/S;-><init>(Lp9/A;IJLr9/y;Ls9/o;Ls9/o;Lcom/google/protobuf/ByteString;Ljava/lang/Integer;)V

    .line 155
    .line 156
    .line 157
    return-object v2
.end method

.method public bridge synthetic w(Lo2/j;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lg2/x;

    .line 2
    .line 3
    return-void
.end method

.method public x(Lea/F;)V
    .locals 4

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO9/b;

    .line 4
    .line 5
    invoke-interface {v0}, LO9/b;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lq5/g;

    .line 10
    .line 11
    new-instance v1, Lq5/c;

    .line 12
    .line 13
    const-string v2, "json"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lcom/unity3d/services/core/webview/b;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    invoke-direct {v2, p0, v3}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    check-cast v0, Lt5/p;

    .line 25
    .line 26
    const-string v3, "FIREBASE_APPQUALITY_SESSION"

    .line 27
    .line 28
    invoke-virtual {v0, v3, v1, v2}, Lt5/p;->a(Ljava/lang/String;Lq5/c;Lq5/f;)Lt5/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lq5/a;

    .line 33
    .line 34
    sget-object v2, Lq5/e;->a:Lq5/e;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v1, p1, v2, v3}, Lq5/a;-><init>(Ljava/lang/Object;Lq5/e;Lq5/b;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lm9/B;

    .line 41
    .line 42
    const/16 v2, 0x17

    .line 43
    .line 44
    invoke-direct {p1, v2}, Lm9/B;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, p1}, Lt5/q;->a(Lq5/d;Lq5/h;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public y()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, La2/v;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, LP/d;

    .line 5
    .line 6
    iget v2, v1, LP/d;->c:I

    .line 7
    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    iget-object v2, v1, LP/d;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    aget-object v2, v2, v0

    .line 13
    .line 14
    check-cast v2, Lp0/e;

    .line 15
    .line 16
    iget-object v3, v2, Lp0/e;->c:Lp0/n;

    .line 17
    .line 18
    iget-boolean v3, v3, Lp0/n;->b:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LP/d;->m(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lp0/e;->C()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    invoke-virtual {v2}, La2/v;->y()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public z()[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v1, v1, [Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Ljava/lang/String;

    .line 16
    .line 17
    return-object v0
.end method

.method public zza(Lx6/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/NativeAdView;->b:Lcom/google/android/gms/internal/ads/zzbmp;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :try_start_0
    instance-of v1, p1, LD6/e1;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p1, LD6/e1;

    .line 15
    .line 16
    iget-object p1, p1, LD6/e1;->a:Lcom/google/android/gms/internal/ads/zzbmi;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbmp;->zzdE(Lcom/google/android/gms/internal/ads/zzbmi;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-nez p1, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbmp;->zzdE(Lcom/google/android/gms/internal/ads/zzbmi;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    const-string p1, "Use MediaContent provided by NativeAd.getMediaContent"

    .line 32
    .line 33
    invoke-static {p1}, LH6/l;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_0
    const-string v0, "Unable to call setMediaContent on delegate"

    .line 38
    .line 39
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    return-void
.end method
