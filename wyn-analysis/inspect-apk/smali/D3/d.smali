.class public final LD3/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LD3/e;


# direct methods
.method public synthetic constructor <init>(LD3/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LD3/d;->i:I

    iput-object p1, p0, LD3/d;->j:LD3/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "removeListenerMethod"

    .line 2
    .line 3
    const-string v1, "addListenerMethod"

    .line 4
    .line 5
    const-string v2, "removeWindowLayoutInfoListener"

    .line 6
    .line 7
    const-string v3, "addWindowLayoutInfoListener"

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const-string v5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)"

    .line 11
    .line 12
    const-string v6, "androidx.window.extensions.layout.WindowLayoutComponent"

    .line 13
    .line 14
    iget-object v7, p0, LD3/d;->j:LD3/e;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    iget v10, p0, LD3/d;->i:I

    .line 19
    .line 20
    packed-switch v10, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v0, v7, LD3/e;->c:Lv6/l;

    .line 24
    .line 25
    iget-object v0, v0, Lv6/l;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/ClassLoader;

    .line 28
    .line 29
    const-string v1, "androidx.window.extensions.WindowExtensions"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "loader.loadClass(WindowE\u2026.WINDOW_EXTENSIONS_CLASS)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-array v1, v9, [Ljava/lang/Class;

    .line 41
    .line 42
    const-string v2, "getWindowLayoutComponent"

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, v7, LD3/e;->a:Ljava/lang/ClassLoader;

    .line 49
    .line 50
    invoke-virtual {v1, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v2, "getWindowLayoutComponentMethod"

    .line 58
    .line 59
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v8, v9

    .line 84
    :goto_0
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_0
    iget-object v7, v7, LD3/e;->a:Ljava/lang/ClassLoader;

    .line 90
    .line 91
    invoke-virtual {v7, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-class v5, Landroidx/window/extensions/core/util/function/Consumer;

    .line 99
    .line 100
    new-array v4, v4, [Ljava/lang/Class;

    .line 101
    .line 102
    const-class v7, Landroid/content/Context;

    .line 103
    .line 104
    aput-object v7, v4, v9

    .line 105
    .line 106
    aput-object v5, v4, v8

    .line 107
    .line 108
    invoke-virtual {v6, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-array v4, v8, [Ljava/lang/Class;

    .line 113
    .line 114
    aput-object v5, v4, v9

    .line 115
    .line 116
    invoke-virtual {v6, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_1

    .line 132
    .line 133
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    move v8, v9

    .line 148
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_1
    iget-object v10, v7, LD3/e;->b:LY9/c;

    .line 154
    .line 155
    :try_start_0
    invoke-virtual {v10}, LY9/c;->q()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    goto :goto_2

    .line 160
    :catch_0
    const/4 v10, 0x0

    .line 161
    :goto_2
    if-nez v10, :cond_2

    .line 162
    .line 163
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_2
    iget-object v7, v7, LD3/e;->a:Ljava/lang/ClassLoader;

    .line 167
    .line 168
    invoke-virtual {v7, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-array v4, v4, [Ljava/lang/Class;

    .line 176
    .line 177
    const-class v5, Landroid/app/Activity;

    .line 178
    .line 179
    aput-object v5, v4, v9

    .line 180
    .line 181
    aput-object v10, v4, v8

    .line 182
    .line 183
    invoke-virtual {v6, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    new-array v4, v8, [Ljava/lang/Class;

    .line 188
    .line 189
    aput-object v10, v4, v9

    .line 190
    .line 191
    invoke-virtual {v6, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_3

    .line 207
    .line 208
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_3

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_3
    move v8, v9

    .line 223
    :goto_3
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :goto_4
    return-object v0

    .line 228
    :pswitch_2
    iget-object v0, v7, LD3/e;->a:Ljava/lang/ClassLoader;

    .line 229
    .line 230
    const-string v1, "androidx.window.extensions.layout.FoldingFeature"

    .line 231
    .line 232
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v1, "loader.loadClass(FOLDING_FEATURE_CLASS)"

    .line 237
    .line 238
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    new-array v1, v9, [Ljava/lang/Class;

    .line 242
    .line 243
    const-string v2, "getBounds"

    .line 244
    .line 245
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    const-string v2, "getType"

    .line 250
    .line 251
    new-array v3, v9, [Ljava/lang/Class;

    .line 252
    .line 253
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const-string v3, "getState"

    .line 258
    .line 259
    new-array v4, v9, [Ljava/lang/Class;

    .line 260
    .line 261
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v3, "getBoundsMethod"

    .line 266
    .line 267
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    sget-object v3, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 271
    .line 272
    const-class v4, Landroid/graphics/Rect;

    .line 273
    .line 274
    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-static {v1, v4}, LA6/h;->u(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-eqz v4, :cond_4

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_4

    .line 293
    .line 294
    const-string v1, "getTypeMethod"

    .line 295
    .line 296
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 300
    .line 301
    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-static {v2, v4}, LA6/h;->u(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_4

    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_4

    .line 320
    .line 321
    const-string v2, "getStateMethod"

    .line 322
    .line 323
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v0, v1}, LA6/h;->u(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_4

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_4

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_4
    move v8, v9

    .line 348
    :goto_5
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
