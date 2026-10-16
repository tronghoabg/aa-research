.class public final Lq/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static k:Lq/r1;

.field public static l:Lq/r1;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/CharSequence;

.field public final c:I

.field public final d:Lq/q1;

.field public final e:Lq/q1;

.field public f:I

.field public g:I

.field public h:Lq/s1;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lq/q1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lq/q1;-><init>(Lq/r1;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lq/r1;->d:Lq/q1;

    .line 11
    .line 12
    new-instance v0, Lq/q1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Lq/q1;-><init>(Lq/r1;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lq/r1;->e:Lq/q1;

    .line 19
    .line 20
    iput-object p1, p0, Lq/r1;->a:Landroid/view/View;

    .line 21
    .line 22
    iput-object p2, p0, Lq/r1;->b:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, Lk1/T;->a:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1c

    .line 37
    .line 38
    if-lt v0, v2, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, LY0/c;->l(Landroid/view/ViewConfiguration;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    :goto_0
    iput p2, p0, Lq/r1;->c:I

    .line 52
    .line 53
    iput-boolean v1, p0, Lq/r1;->j:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static b(Lq/r1;)V
    .locals 3

    .line 1
    sget-object v0, Lq/r1;->k:Lq/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lq/r1;->d:Lq/q1;

    .line 6
    .line 7
    iget-object v0, v0, Lq/r1;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    sput-object p0, Lq/r1;->k:Lq/r1;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lq/r1;->d:Lq/q1;

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v1, v1

    .line 23
    iget-object p0, p0, Lq/r1;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, Lq/r1;->l:Lq/r1;

    .line 2
    .line 3
    iget-object v1, p0, Lq/r1;->a:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, p0, :cond_2

    .line 7
    .line 8
    sput-object v2, Lq/r1;->l:Lq/r1;

    .line 9
    .line 10
    iget-object v0, p0, Lq/r1;->h:Lq/s1;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lq/s1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lq/s1;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/content/Context;

    .line 27
    .line 28
    const-string v4, "window"

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/WindowManager;

    .line 35
    .line 36
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object v2, p0, Lq/r1;->h:Lq/s1;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lq/r1;->j:Z

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "TooltipCompatHandler"

    .line 49
    .line 50
    const-string v3, "sActiveHandler.mPopup == null"

    .line 51
    .line 52
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    sget-object v0, Lq/r1;->k:Lq/r1;

    .line 56
    .line 57
    if-ne v0, p0, :cond_3

    .line 58
    .line 59
    invoke-static {v2}, Lq/r1;->b(Lq/r1;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, Lq/r1;->e:Lq/q1;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final c(Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, v0, Lq/r1;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {v2}, Lq/r1;->b(Lq/r1;)V

    .line 17
    .line 18
    .line 19
    sget-object v4, Lq/r1;->l:Lq/r1;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v4}, Lq/r1;->a()V

    .line 24
    .line 25
    .line 26
    :cond_1
    sput-object v0, Lq/r1;->l:Lq/r1;

    .line 27
    .line 28
    move/from16 v4, p1

    .line 29
    .line 30
    iput-boolean v4, v0, Lq/r1;->i:Z

    .line 31
    .line 32
    new-instance v4, Lq/s1;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v6, Landroid/view/WindowManager$LayoutParams;

    .line 42
    .line 43
    invoke-direct {v6}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v6, v4, Lq/s1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance v7, Landroid/graphics/Rect;

    .line 49
    .line 50
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v7, v4, Lq/s1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    new-array v7, v1, [I

    .line 56
    .line 57
    iput-object v7, v4, Lq/s1;->f:Ljava/lang/Object;

    .line 58
    .line 59
    new-array v7, v1, [I

    .line 60
    .line 61
    iput-object v7, v4, Lq/s1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v5, v4, Lq/s1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const v8, 0x7f0d001b

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v8, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v4, Lq/s1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    const v7, 0x7f0a01b6

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/widget/TextView;

    .line 86
    .line 87
    iput-object v2, v4, Lq/s1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    const-class v2, Lq/s1;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v6, v2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iput-object v2, v6, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 103
    .line 104
    const/16 v2, 0x3ea

    .line 105
    .line 106
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 107
    .line 108
    const/4 v2, -0x2

    .line 109
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 110
    .line 111
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 112
    .line 113
    const/4 v2, -0x3

    .line 114
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 115
    .line 116
    const v2, 0x7f140004

    .line 117
    .line 118
    .line 119
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 120
    .line 121
    const/16 v2, 0x18

    .line 122
    .line 123
    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 124
    .line 125
    iput-object v4, v0, Lq/r1;->h:Lq/s1;

    .line 126
    .line 127
    iget v2, v0, Lq/r1;->f:I

    .line 128
    .line 129
    iget v5, v0, Lq/r1;->g:I

    .line 130
    .line 131
    iget-boolean v6, v0, Lq/r1;->i:Z

    .line 132
    .line 133
    iget-object v7, v4, Lq/s1;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v7, Landroid/view/View;

    .line 136
    .line 137
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    const-string v9, "window"

    .line 142
    .line 143
    iget-object v10, v4, Lq/s1;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v10, Landroid/content/Context;

    .line 146
    .line 147
    if-eqz v8, :cond_2

    .line 148
    .line 149
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    if-eqz v8, :cond_2

    .line 154
    .line 155
    invoke-virtual {v10, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    check-cast v8, Landroid/view/WindowManager;

    .line 160
    .line 161
    invoke-interface {v8, v7}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    :cond_2
    iget-object v8, v4, Lq/s1;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v8, Landroid/widget/TextView;

    .line 167
    .line 168
    iget-object v11, v0, Lq/r1;->b:Ljava/lang/CharSequence;

    .line 169
    .line 170
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object v8, v4, Lq/s1;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v8, Landroid/view/WindowManager$LayoutParams;

    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    iput-object v11, v8, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 182
    .line 183
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    const v12, 0x7f07037d

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-lt v12, v11, :cond_3

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    div-int/2addr v2, v1

    .line 206
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-lt v12, v11, :cond_4

    .line 211
    .line 212
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const v12, 0x7f07037c

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    add-int v12, v5, v11

    .line 224
    .line 225
    sub-int/2addr v5, v11

    .line 226
    goto :goto_1

    .line 227
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    const/4 v5, 0x0

    .line 232
    :goto_1
    const/16 v11, 0x31

    .line 233
    .line 234
    iput v11, v8, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 235
    .line 236
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    if-eqz v6, :cond_5

    .line 241
    .line 242
    const v14, 0x7f070380

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_5
    const v14, 0x7f07037f

    .line 247
    .line 248
    .line 249
    :goto_2
    invoke-virtual {v11, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    instance-of v13, v15, Landroid/view/WindowManager$LayoutParams;

    .line 262
    .line 263
    if-eqz v13, :cond_6

    .line 264
    .line 265
    check-cast v15, Landroid/view/WindowManager$LayoutParams;

    .line 266
    .line 267
    iget v13, v15, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 268
    .line 269
    if-ne v13, v1, :cond_6

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    :goto_3
    instance-of v15, v13, Landroid/content/ContextWrapper;

    .line 277
    .line 278
    if-eqz v15, :cond_8

    .line 279
    .line 280
    instance-of v15, v13, Landroid/app/Activity;

    .line 281
    .line 282
    if-eqz v15, :cond_7

    .line 283
    .line 284
    check-cast v13, Landroid/app/Activity;

    .line 285
    .line 286
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    invoke-virtual {v13}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    goto :goto_4

    .line 295
    :cond_7
    check-cast v13, Landroid/content/ContextWrapper;

    .line 296
    .line 297
    invoke-virtual {v13}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    goto :goto_3

    .line 302
    :cond_8
    :goto_4
    if-nez v14, :cond_9

    .line 303
    .line 304
    const-string v1, "TooltipPopup"

    .line 305
    .line 306
    const-string v2, "Cannot find app view"

    .line 307
    .line 308
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    const/16 v17, 0x1

    .line 312
    .line 313
    goto/16 :goto_7

    .line 314
    .line 315
    :cond_9
    iget-object v15, v4, Lq/s1;->e:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v15, Landroid/graphics/Rect;

    .line 318
    .line 319
    invoke-virtual {v14, v15}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 320
    .line 321
    .line 322
    move/from16 v16, v1

    .line 323
    .line 324
    iget v1, v15, Landroid/graphics/Rect;->left:I

    .line 325
    .line 326
    if-gez v1, :cond_b

    .line 327
    .line 328
    iget v1, v15, Landroid/graphics/Rect;->top:I

    .line 329
    .line 330
    if-gez v1, :cond_b

    .line 331
    .line 332
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    const/16 v17, 0x1

    .line 337
    .line 338
    const-string v13, "dimen"

    .line 339
    .line 340
    move/from16 v18, v2

    .line 341
    .line 342
    const-string v2, "android"

    .line 343
    .line 344
    move/from16 v19, v5

    .line 345
    .line 346
    const-string v5, "status_bar_height"

    .line 347
    .line 348
    invoke-virtual {v1, v5, v13, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_a

    .line 353
    .line 354
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    goto :goto_5

    .line 359
    :cond_a
    const/4 v2, 0x0

    .line 360
    :goto_5
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    iget v5, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 365
    .line 366
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    invoke-virtual {v15, v13, v2, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 370
    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_b
    move/from16 v18, v2

    .line 374
    .line 375
    move/from16 v19, v5

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const/16 v17, 0x1

    .line 379
    .line 380
    :goto_6
    iget-object v1, v4, Lq/s1;->g:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, [I

    .line 383
    .line 384
    invoke-virtual {v14, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 385
    .line 386
    .line 387
    iget-object v2, v4, Lq/s1;->f:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v2, [I

    .line 390
    .line 391
    invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 392
    .line 393
    .line 394
    aget v4, v2, v13

    .line 395
    .line 396
    aget v5, v1, v13

    .line 397
    .line 398
    sub-int/2addr v4, v5

    .line 399
    aput v4, v2, v13

    .line 400
    .line 401
    aget v5, v2, v17

    .line 402
    .line 403
    aget v1, v1, v17

    .line 404
    .line 405
    sub-int/2addr v5, v1

    .line 406
    aput v5, v2, v17

    .line 407
    .line 408
    add-int v4, v4, v18

    .line 409
    .line 410
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    div-int/lit8 v1, v1, 0x2

    .line 415
    .line 416
    sub-int/2addr v4, v1

    .line 417
    iput v4, v8, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 418
    .line 419
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    invoke-virtual {v7, v1, v1}, Landroid/view/View;->measure(II)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    aget v2, v2, v17

    .line 431
    .line 432
    add-int v5, v2, v19

    .line 433
    .line 434
    sub-int/2addr v5, v11

    .line 435
    sub-int/2addr v5, v1

    .line 436
    add-int/2addr v2, v12

    .line 437
    add-int/2addr v2, v11

    .line 438
    if-eqz v6, :cond_d

    .line 439
    .line 440
    if-ltz v5, :cond_c

    .line 441
    .line 442
    iput v5, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_c
    iput v2, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_d
    add-int/2addr v1, v2

    .line 449
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    if-gt v1, v4, :cond_e

    .line 454
    .line 455
    iput v2, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_e
    iput v5, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 459
    .line 460
    :goto_7
    invoke-virtual {v10, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    check-cast v1, Landroid/view/WindowManager;

    .line 465
    .line 466
    invoke-interface {v1, v7, v8}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 470
    .line 471
    .line 472
    iget-boolean v1, v0, Lq/r1;->i:Z

    .line 473
    .line 474
    if-eqz v1, :cond_f

    .line 475
    .line 476
    const-wide/16 v1, 0x9c4

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    and-int/lit8 v1, v1, 0x1

    .line 484
    .line 485
    move/from16 v2, v17

    .line 486
    .line 487
    if-ne v1, v2, :cond_10

    .line 488
    .line 489
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    int-to-long v1, v1

    .line 494
    const-wide/16 v4, 0xbb8

    .line 495
    .line 496
    :goto_8
    sub-long v1, v4, v1

    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_10
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    int-to-long v1, v1

    .line 504
    const-wide/16 v4, 0x3a98

    .line 505
    .line 506
    goto :goto_8

    .line 507
    :goto_9
    iget-object v4, v0, Lq/r1;->e:Lq/q1;

    .line 508
    .line 509
    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v4, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 513
    .line 514
    .line 515
    return-void
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lq/r1;->h:Lq/s1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-boolean p1, p0, Lq/r1;->i:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lq/r1;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "accessibility"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x7

    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v1, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lq/r1;->j:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Lq/r1;->a()V

    .line 54
    .line 55
    .line 56
    return v0

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lq/r1;->h:Lq/s1;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    float-to-int p1, p1

    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-int p2, p2

    .line 77
    iget-boolean v1, p0, Lq/r1;->j:Z

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget v1, p0, Lq/r1;->f:I

    .line 82
    .line 83
    sub-int v1, p1, v1

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget v2, p0, Lq/r1;->c:I

    .line 90
    .line 91
    if-gt v1, v2, :cond_4

    .line 92
    .line 93
    iget v1, p0, Lq/r1;->g:I

    .line 94
    .line 95
    sub-int v1, p2, v1

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-le v1, v2, :cond_5

    .line 102
    .line 103
    :cond_4
    iput p1, p0, Lq/r1;->f:I

    .line 104
    .line 105
    iput p2, p0, Lq/r1;->g:I

    .line 106
    .line 107
    iput-boolean v0, p0, Lq/r1;->j:Z

    .line 108
    .line 109
    invoke-static {p0}, Lq/r1;->b(Lq/r1;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_0
    return v0
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Lq/r1;->f:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    div-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    iput p1, p0, Lq/r1;->g:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lq/r1;->c(Z)V

    .line 19
    .line 20
    .line 21
    return p1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lq/r1;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
