.class public final Lde/a;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LG9/e;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(LG9/e;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lde/a;->b:LG9/e;

    .line 2
    .line 3
    iput-object p2, p0, Lde/a;->c:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lde/a;

    .line 2
    .line 3
    iget-object v0, p0, Lde/a;->b:LG9/e;

    .line 4
    .line 5
    iget-object v1, p0, Lde/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lde/a;-><init>(LG9/e;Ljava/lang/String;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lde/a;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lde/a;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lde/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lde/a;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lde/a;->b:LG9/e;

    .line 28
    .line 29
    iget-object p1, p1, LG9/e;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LCe/a;

    .line 32
    .line 33
    iput v3, p0, Lde/a;->a:I

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "showScreen() -> Fetching the screen with the context key "

    .line 41
    .line 42
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lde/a;->c:Ljava/lang/String;

    .line 46
    .line 47
    const-string v4, " from the API"

    .line 48
    .line 49
    invoke-static {v1, v3, v4}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v4, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Lac/a;

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Lac/a;->O(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p1, LCe/a;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, LDe/a;

    .line 63
    .line 64
    iget-object v1, v1, LDe/a;->a:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Landroid/app/Activity;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move-object v1, v5

    .line 77
    :goto_0
    if-eqz v1, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object v1, p1, LCe/a;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Landroid/app/Application;

    .line 83
    .line 84
    :goto_1
    iget-object p1, p1, LCe/a;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, LC8/i;

    .line 87
    .line 88
    iget-object v6, p1, LC8/i;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 91
    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, LGe/g;

    .line 99
    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    iget-object v6, v6, LGe/g;->a:LGe/h;

    .line 103
    .line 104
    iget-object v7, v6, LGe/h;->b:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-virtual {v7, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Lae/g;

    .line 111
    .line 112
    if-nez v7, :cond_5

    .line 113
    .line 114
    iget-object v7, v6, LGe/h;->a:Lae/g;

    .line 115
    .line 116
    if-nez v7, :cond_5

    .line 117
    .line 118
    new-instance v7, Lae/g;

    .line 119
    .line 120
    invoke-direct {v7}, Lae/g;-><init>()V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    new-instance v7, Lae/g;

    .line 125
    .line 126
    invoke-direct {v7}, Lae/g;-><init>()V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_2
    sget v6, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;->b:I

    .line 130
    .line 131
    const-string v6, "context"

    .line 132
    .line 133
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v6, v7, Lae/g;->a:Lae/h;

    .line 137
    .line 138
    const-string v7, "screenPresentationStyle"

    .line 139
    .line 140
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v8, Landroid/content/Intent;

    .line 144
    .line 145
    const-class v9, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;

    .line 146
    .line 147
    invoke-direct {v8, v1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 148
    .line 149
    .line 150
    const-string v9, "contextKey"

    .line 151
    .line 152
    invoke-virtual {v8, v9, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    instance-of v7, v1, Landroid/app/Activity;

    .line 159
    .line 160
    if-nez v7, :cond_6

    .line 161
    .line 162
    const/high16 v7, 0x10000000

    .line 163
    .line 164
    invoke-virtual {v8, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 165
    .line 166
    .line 167
    iget-object v7, v4, Lac/a;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v7, LC8/i;

    .line 170
    .line 171
    iget-object v7, v7, LC8/i;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v7, Lre/a;

    .line 174
    .line 175
    iget-object v9, v7, Lre/a;->a:Lae/a;

    .line 176
    .line 177
    sget-object v10, Lae/a;->b:Lae/a;

    .line 178
    .line 179
    const/16 v10, 0xa

    .line 180
    .line 181
    iget v9, v9, Lae/a;->a:I

    .line 182
    .line 183
    if-gt v9, v10, :cond_6

    .line 184
    .line 185
    iget-object v7, v7, Lre/a;->b:Ljava/lang/String;

    .line 186
    .line 187
    const-string v9, "showScreen() -> Screen intent will process with a non-activity context"

    .line 188
    .line 189
    invoke-static {v9}, Lac/a;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-static {v7, v9, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 194
    .line 195
    .line 196
    :cond_6
    :try_start_0
    const-string v7, "showScreen() -> Launching the screen activity"

    .line 197
    .line 198
    invoke-virtual {v4, v7}, Lac/a;->O(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v6}, Lff/B;->x(Lae/h;)Lef/k;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    if-eqz v6, :cond_8

    .line 209
    .line 210
    instance-of v7, v1, Landroid/app/Activity;

    .line 211
    .line 212
    if-eqz v7, :cond_7

    .line 213
    .line 214
    iget-object v7, v6, Lef/k;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v7, Ljava/lang/Number;

    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    iget-object v6, v6, Lef/k;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v6, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    check-cast v1, Landroid/app/Activity;

    .line 231
    .line 232
    invoke-virtual {v1, v7, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :catch_0
    move-exception v1

    .line 237
    goto :goto_3

    .line 238
    :cond_7
    const-string v1, "Can\'t use transition animations, cause the provided context is not an activity."

    .line 239
    .line 240
    invoke-static {v4, v1}, LBa/c;->U(Lac/a;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :goto_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v7, "Failed to open the screen with the context key "

    .line 247
    .line 248
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v8, " with exception: "

    .line 255
    .line 256
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    new-instance v6, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v8, "showScreen() -> "

    .line 269
    .line 270
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v4, v1}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, LG9/e;

    .line 284
    .line 285
    sget-object v4, Lbe/a;->b:Lbe/a;

    .line 286
    .line 287
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-direct {v1, v4, v3, v5}, LG9/e;-><init>(Lbe/a;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 292
    .line 293
    .line 294
    iget-object p1, p1, LC8/i;->e:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p1, Lre/c;

    .line 297
    .line 298
    if-eqz p1, :cond_8

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Lre/c;->d(LG9/e;)V

    .line 301
    .line 302
    .line 303
    :cond_8
    :goto_4
    if-ne v2, v0, :cond_9

    .line 304
    .line 305
    return-object v0

    .line 306
    :cond_9
    return-object v2
.end method
