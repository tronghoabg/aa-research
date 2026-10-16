.class public final LCe/a;
.super LA7/B0;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LC8/i;LDe/a;Landroid/app/Application;Lac/a;)V
    .locals 1

    const-string v0, "activityProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p4}, LA7/B0;-><init>(Lac/a;)V

    .line 6
    iput-object p1, p0, LCe/a;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, LCe/a;->c:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, LCe/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lba/a;LC8/i;Lge/a;Lac/a;)V
    .locals 1

    const-string v0, "requestConfigurator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, LA7/B0;-><init>(Lac/a;)V

    .line 2
    iput-object p1, p0, LCe/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LCe/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LCe/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e0(Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    instance-of v1, p2, LEe/a;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, p2

    .line 7
    check-cast v1, LEe/a;

    .line 8
    .line 9
    iget v2, v1, LEe/a;->e:I

    .line 10
    .line 11
    const/high16 v3, -0x80000000

    .line 12
    .line 13
    and-int v4, v2, v3

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    iput v2, v1, LEe/a;->e:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, LEe/a;

    .line 22
    .line 23
    invoke-direct {v1, p0, p2}, LEe/a;-><init>(LCe/a;Llf/c;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p2, v1, LEe/a;->c:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 29
    .line 30
    iget v3, v1, LEe/a;->e:I

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v1, LEe/a;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, v1, LEe/a;->a:LCe/a;

    .line 40
    .line 41
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, LCe/a;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, Lba/a;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v3, "contextKey"

    .line 64
    .line 65
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, p2, Lba/a;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, LC8/i;

    .line 71
    .line 72
    invoke-virtual {v3}, LC8/i;->j()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    sget-object v5, Lye/a;->a:[Lye/a;

    .line 77
    .line 78
    new-instance v5, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object p2, p2, Lba/a;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, Ljava/lang/String;

    .line 86
    .line 87
    const-string v6, "v3/contexts/"

    .line 88
    .line 89
    const-string v7, "/screens"

    .line 90
    .line 91
    invoke-static {v5, p2, v6, p1, v7}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const-string v5, "url"

    .line 96
    .line 97
    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v8, Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 101
    .line 102
    sget-object v5, Lve/b;->a:[Lve/b;

    .line 103
    .line 104
    invoke-direct {v8, p2, v3}, Lcom/moloco/sdk/internal/publisher/nativead/model/g;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    iput-object p0, v1, LEe/a;->a:LCe/a;

    .line 108
    .line 109
    iput-object p1, v1, LEe/a;->b:Ljava/lang/String;

    .line 110
    .line 111
    iput v4, v1, LEe/a;->e:I

    .line 112
    .line 113
    iget-object p2, p0, LCe/a;->c:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v7, p2

    .line 116
    check-cast v7, LC8/i;

    .line 117
    .line 118
    iget-object p2, v7, LC8/i;->f:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v9, p2

    .line 121
    check-cast v9, La9/b;

    .line 122
    .line 123
    sget-object p2, LEf/S;->a:LLf/e;

    .line 124
    .line 125
    sget-object p2, LLf/d;->b:LLf/d;

    .line 126
    .line 127
    new-instance v6, Lue/a;

    .line 128
    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    invoke-direct/range {v6 .. v11}, Lue/a;-><init>(LC8/i;Lcom/moloco/sdk/internal/publisher/nativead/model/g;La9/b;ILjf/c;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p2, v6, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-ne p2, v2, :cond_3

    .line 139
    .line 140
    return-object v2

    .line 141
    :cond_3
    move-object v1, p0

    .line 142
    :goto_1
    check-cast p2, Lve/e;

    .line 143
    .line 144
    instance-of v2, p2, Lve/d;

    .line 145
    .line 146
    const/4 v3, 0x4

    .line 147
    const/4 v4, 0x0

    .line 148
    if-eqz v2, :cond_7

    .line 149
    .line 150
    check-cast p2, Lve/d;

    .line 151
    .line 152
    iget-object p2, p2, Lve/d;->b:Ljava/lang/Object;

    .line 153
    .line 154
    instance-of v2, p2, Ljava/util/List;

    .line 155
    .line 156
    if-eqz v2, :cond_6

    .line 157
    .line 158
    check-cast p2, Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_5

    .line 165
    .line 166
    iget-object p1, v1, LCe/a;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Lge/a;

    .line 169
    .line 170
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    const-string v0, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    .line 175
    .line 176
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    check-cast p2, Ljava/util/Map;

    .line 180
    .line 181
    invoke-interface {p1, p2}, Lge/a;->i(Ljava/util/Map;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Lqe/a;

    .line 186
    .line 187
    if-eqz p1, :cond_4

    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_4
    new-instance p1, Lbe/b;

    .line 191
    .line 192
    sget-object p2, Lbe/a;->h:Lbe/a;

    .line 193
    .line 194
    const/4 v0, 0x6

    .line 195
    invoke-direct {p1, p2, v4, v4, v0}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_5
    new-instance p2, Lbe/b;

    .line 200
    .line 201
    sget-object v0, Lbe/a;->k:Lbe/a;

    .line 202
    .line 203
    const-string v1, "Context key: "

    .line 204
    .line 205
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-direct {p2, v0, p1, v4, v3}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 210
    .line 211
    .line 212
    throw p2

    .line 213
    :cond_6
    new-instance p1, Lbe/b;

    .line 214
    .line 215
    sget-object p2, Lbe/a;->h:Lbe/a;

    .line 216
    .line 217
    const-string v0, "Unexpected data type."

    .line 218
    .line 219
    invoke-direct {p1, p2, v0, v4, v3}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_7
    instance-of v1, p2, Lve/c;

    .line 224
    .line 225
    if-eqz v1, :cond_9

    .line 226
    .line 227
    iget v0, p2, Lve/e;->a:I

    .line 228
    .line 229
    const/16 v1, 0x194

    .line 230
    .line 231
    if-ne v0, v1, :cond_8

    .line 232
    .line 233
    new-instance p2, Lbe/b;

    .line 234
    .line 235
    sget-object v0, Lbe/a;->k:Lbe/a;

    .line 236
    .line 237
    const-string v1, "Context Key: "

    .line 238
    .line 239
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-direct {p2, v0, p1, v4, v3}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 244
    .line 245
    .line 246
    throw p2

    .line 247
    :cond_8
    new-instance p1, Lbe/b;

    .line 248
    .line 249
    sget-object v0, Lbe/a;->j:Lbe/a;

    .line 250
    .line 251
    move-object v1, p2

    .line 252
    check-cast v1, Lve/c;

    .line 253
    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v5, "Response code "

    .line 257
    .line 258
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget p2, p2, Lve/e;->a:I

    .line 262
    .line 263
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string p2, ", message: "

    .line 267
    .line 268
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget-object p2, v1, Lve/c;->b:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-direct {p1, v0, p2, v4, v3}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_9
    new-instance p1, LE5/Q;

    .line 285
    .line 286
    const/16 p2, 0x9

    .line 287
    .line 288
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 289
    .line 290
    .line 291
    throw p1
.end method

.method public f0(Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, LEe/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LEe/b;

    .line 7
    .line 8
    iget v1, v0, LEe/b;->e:I

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
    iput v1, v0, LEe/b;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LEe/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LEe/b;-><init>(LCe/a;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LEe/b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LEe/b;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, LEe/b;->b:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v0, v0, LEe/b;->a:LCe/a;

    .line 39
    .line 40
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, LCe/a;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, Lba/a;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v2, "screenId"

    .line 63
    .line 64
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p2, Lba/a;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, LC8/i;

    .line 70
    .line 71
    invoke-virtual {v2}, LC8/i;->j()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v4, Lye/a;->a:[Lye/a;

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object p2, p2, Lba/a;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p2, "v3/screens/"

    .line 90
    .line 91
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    const-string v4, "url"

    .line 102
    .line 103
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v7, Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 107
    .line 108
    sget-object v4, Lve/b;->a:[Lve/b;

    .line 109
    .line 110
    invoke-direct {v7, p2, v2}, Lcom/moloco/sdk/internal/publisher/nativead/model/g;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    iput-object p0, v0, LEe/b;->a:LCe/a;

    .line 114
    .line 115
    iput-object p1, v0, LEe/b;->b:Ljava/lang/String;

    .line 116
    .line 117
    iput v3, v0, LEe/b;->e:I

    .line 118
    .line 119
    iget-object p2, p0, LCe/a;->c:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v6, p2

    .line 122
    check-cast v6, LC8/i;

    .line 123
    .line 124
    iget-object p2, v6, LC8/i;->f:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v8, p2

    .line 127
    check-cast v8, La9/b;

    .line 128
    .line 129
    sget-object p2, LEf/S;->a:LLf/e;

    .line 130
    .line 131
    sget-object p2, LLf/d;->b:LLf/d;

    .line 132
    .line 133
    new-instance v5, Lue/a;

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    const/4 v9, 0x0

    .line 137
    invoke-direct/range {v5 .. v10}, Lue/a;-><init>(LC8/i;Lcom/moloco/sdk/internal/publisher/nativead/model/g;La9/b;ILjf/c;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p2, v5, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    if-ne p2, v1, :cond_3

    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_3
    move-object v0, p0

    .line 148
    :goto_1
    check-cast p2, Lve/e;

    .line 149
    .line 150
    instance-of v1, p2, Lve/d;

    .line 151
    .line 152
    const/4 v2, 0x4

    .line 153
    const/4 v3, 0x0

    .line 154
    if-eqz v1, :cond_6

    .line 155
    .line 156
    iget-object p1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Lac/a;

    .line 159
    .line 160
    const-string v1, "getScreenById -> mapping the screen from the API"

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Lac/a;->O(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    check-cast p2, Lve/d;

    .line 166
    .line 167
    iget-object p1, p2, Lve/d;->b:Ljava/lang/Object;

    .line 168
    .line 169
    instance-of p2, p1, Ljava/util/Map;

    .line 170
    .line 171
    if-eqz p2, :cond_5

    .line 172
    .line 173
    check-cast p1, Ljava/util/Map;

    .line 174
    .line 175
    iget-object p2, v0, LCe/a;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p2, Lge/a;

    .line 178
    .line 179
    invoke-interface {p2, p1}, Lge/a;->i(Ljava/util/Map;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Lqe/a;

    .line 184
    .line 185
    if-eqz p1, :cond_4

    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_4
    new-instance p1, Lbe/b;

    .line 189
    .line 190
    sget-object p2, Lbe/a;->h:Lbe/a;

    .line 191
    .line 192
    const/4 v0, 0x6

    .line 193
    invoke-direct {p1, p2, v3, v3, v0}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_5
    new-instance p1, Lbe/b;

    .line 198
    .line 199
    sget-object p2, Lbe/a;->h:Lbe/a;

    .line 200
    .line 201
    const-string v0, "Unexpected data type."

    .line 202
    .line 203
    invoke-direct {p1, p2, v0, v3, v2}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 204
    .line 205
    .line 206
    throw p1

    .line 207
    :cond_6
    instance-of v0, p2, Lve/c;

    .line 208
    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    iget v0, p2, Lve/e;->a:I

    .line 212
    .line 213
    const/16 v1, 0x194

    .line 214
    .line 215
    if-ne v0, v1, :cond_7

    .line 216
    .line 217
    new-instance p2, Lbe/b;

    .line 218
    .line 219
    sget-object v0, Lbe/a;->k:Lbe/a;

    .line 220
    .line 221
    const-string v1, "Screen Id: "

    .line 222
    .line 223
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p2, v0, p1, v3, v2}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 228
    .line 229
    .line 230
    throw p2

    .line 231
    :cond_7
    new-instance p1, Lbe/b;

    .line 232
    .line 233
    sget-object v0, Lbe/a;->j:Lbe/a;

    .line 234
    .line 235
    move-object v1, p2

    .line 236
    check-cast v1, Lve/c;

    .line 237
    .line 238
    new-instance v4, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v5, "Response code "

    .line 241
    .line 242
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget p2, p2, Lve/e;->a:I

    .line 246
    .line 247
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string p2, ", message: "

    .line 251
    .line 252
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    iget-object p2, v1, Lve/c;->b:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-direct {p1, v0, p2, v3, v2}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :cond_8
    new-instance p1, LE5/Q;

    .line 269
    .line 270
    const/16 p2, 0x9

    .line 271
    .line 272
    const/4 v0, 0x0

    .line 273
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 274
    .line 275
    .line 276
    throw p1
.end method
