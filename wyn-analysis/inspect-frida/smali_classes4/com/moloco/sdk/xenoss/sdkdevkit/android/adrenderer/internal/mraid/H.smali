.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p3, Ls6/y;

    .line 9
    .line 10
    iget-object p5, p3, Ls6/y;->a:Ls6/t;

    .line 11
    .line 12
    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p5}, Landroid/view/View;->getPaddingLeft()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v0, v1

    .line 21
    invoke-virtual {p5}, Landroid/view/View;->getPaddingRight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr v0, v1

    .line 26
    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p5}, Landroid/view/View;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 36
    .line 37
    .line 38
    move-result p5

    .line 39
    sub-int/2addr v1, p5

    .line 40
    iget-object p5, p3, Ls6/y;->c:Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-static {p5}, Ls6/y;->c(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz p5, :cond_0

    .line 48
    .line 49
    invoke-virtual {p5}, Landroid/view/View;->getPaddingLeft()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {p5}, Landroid/view/View;->getPaddingRight()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    add-int/2addr v5, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v5, v3

    .line 60
    :goto_0
    sub-int/2addr v2, v5

    .line 61
    if-nez p5, :cond_1

    .line 62
    .line 63
    move v4, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    instance-of v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 74
    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 78
    .line 79
    iget v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 80
    .line 81
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 82
    .line 83
    add-int/2addr v6, v5

    .line 84
    add-int/2addr v4, v6

    .line 85
    :cond_2
    :goto_1
    if-eqz p5, :cond_3

    .line 86
    .line 87
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-virtual {p5}, Landroid/view/View;->getPaddingBottom()I

    .line 92
    .line 93
    .line 94
    move-result p5

    .line 95
    add-int/2addr p5, v5

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move p5, v3

    .line 98
    :goto_2
    sub-int/2addr v4, p5

    .line 99
    iget-object p5, p3, Ls6/y;->i:Landroid/view/ViewGroup;

    .line 100
    .line 101
    invoke-static {p5}, Ls6/y;->c(Landroid/view/View;)I

    .line 102
    .line 103
    .line 104
    move-result p5

    .line 105
    iget-object v5, p3, Ls6/y;->k:Landroid/view/View;

    .line 106
    .line 107
    invoke-static {v5}, Ls6/y;->c(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    add-int/2addr v5, p5

    .line 112
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result p5

    .line 116
    iget-object v2, p3, Ls6/y;->d:Landroid/view/ViewGroup;

    .line 117
    .line 118
    if-nez v2, :cond_4

    .line 119
    .line 120
    move v5, v3

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    instance-of v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 131
    .line 132
    if-eqz v6, :cond_5

    .line 133
    .line 134
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 135
    .line 136
    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 137
    .line 138
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 139
    .line 140
    add-int/2addr v6, v2

    .line 141
    add-int/2addr v5, v6

    .line 142
    :cond_5
    :goto_3
    mul-int/lit8 v5, v5, 0x2

    .line 143
    .line 144
    add-int/2addr v5, v4

    .line 145
    const/4 v2, 0x1

    .line 146
    if-le v0, p5, :cond_7

    .line 147
    .line 148
    if-gt v1, v5, :cond_6

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    move p5, v3

    .line 152
    goto :goto_5

    .line 153
    :cond_7
    :goto_4
    move p5, v2

    .line 154
    :goto_5
    iget-boolean v0, p3, Ls6/y;->A:Z

    .line 155
    .line 156
    if-eq v0, p5, :cond_8

    .line 157
    .line 158
    iput-boolean p5, p3, Ls6/y;->A:Z

    .line 159
    .line 160
    new-instance p5, Ls6/u;

    .line 161
    .line 162
    const/4 v0, 0x1

    .line 163
    invoke-direct {p5, p3, v0}, Ls6/u;-><init>(Ls6/y;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 167
    .line 168
    .line 169
    :cond_8
    sub-int/2addr p4, p2

    .line 170
    sub-int p2, p8, p6

    .line 171
    .line 172
    if-eq p4, p2, :cond_9

    .line 173
    .line 174
    move v3, v2

    .line 175
    :cond_9
    iget-boolean p2, p3, Ls6/y;->A:Z

    .line 176
    .line 177
    if-nez p2, :cond_a

    .line 178
    .line 179
    if-eqz v3, :cond_a

    .line 180
    .line 181
    new-instance p2, Ls6/u;

    .line 182
    .line 183
    const/4 p4, 0x2

    .line 184
    invoke-direct {p2, p3, p4}, Ls6/u;-><init>(Ls6/y;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 188
    .line 189
    .line 190
    :cond_a
    return-void

    .line 191
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Ls6/t;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sub-int/2addr p4, p2

    .line 199
    sub-int/2addr p5, p3

    .line 200
    sub-int p2, p8, p6

    .line 201
    .line 202
    sub-int p3, p9, p7

    .line 203
    .line 204
    if-ne p4, p2, :cond_b

    .line 205
    .line 206
    if-eq p5, p3, :cond_c

    .line 207
    .line 208
    :cond_b
    iget-object v1, v0, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    if-eqz p2, :cond_c

    .line 215
    .line 216
    invoke-virtual {v0}, Ls6/t;->p()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 224
    .line 225
    .line 226
    move-result p3

    .line 227
    sub-int/2addr p2, p3

    .line 228
    iget p3, v0, Ls6/t;->l:I

    .line 229
    .line 230
    sub-int v3, p2, p3

    .line 231
    .line 232
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    neg-int p2, p2

    .line 237
    sub-int v4, p2, p3

    .line 238
    .line 239
    const/4 v5, -0x1

    .line 240
    const/4 v6, -0x1

    .line 241
    move-object v2, p1

    .line 242
    invoke-virtual/range {v1 .. v6}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 243
    .line 244
    .line 245
    :cond_c
    return-void

    .line 246
    :pswitch_1
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;->b:Ljava/lang/Object;

    .line 247
    .line 248
    move-object v1, p1

    .line 249
    check-cast v1, LK3/r;

    .line 250
    .line 251
    iget-object p1, v1, LK3/r;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p1, LEf/H0;

    .line 254
    .line 255
    const/4 v7, 0x0

    .line 256
    if-eqz p1, :cond_d

    .line 257
    .line 258
    invoke-virtual {p1, v7}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 259
    .line 260
    .line 261
    :cond_d
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;

    .line 262
    .line 263
    const/4 v6, 0x0

    .line 264
    move v2, p2

    .line 265
    move v3, p3

    .line 266
    move v4, p4

    .line 267
    move v5, p5

    .line 268
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;-><init>(LK3/r;IIIILjf/c;)V

    .line 269
    .line 270
    .line 271
    const/4 p1, 0x3

    .line 272
    iget-object p2, v1, LK3/r;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p2, LKd/a;

    .line 275
    .line 276
    invoke-static {p2, v7, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iput-object p1, v1, LK3/r;->c:Ljava/lang/Object;

    .line 281
    .line 282
    return-void

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
