.class public final Lu0/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lu0/n;


# direct methods
.method public synthetic constructor <init>(Lu0/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu0/k;->i:I

    iput-object p1, p0, Lu0/k;->j:Lu0/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lu0/k;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ltf/a;

    .line 7
    .line 8
    const-string v0, "command"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lu0/k;->j:Lu0/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v1, v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    new-instance v1, LM0/g;

    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    invoke-direct {v1, p1, v2}, LM0/g;-><init>(Ltf/a;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    check-cast p1, Ln0/b;

    .line 56
    .line 57
    iget-object p1, p1, Ln0/b;->a:Landroid/view/KeyEvent;

    .line 58
    .line 59
    iget-object v0, p0, Lu0/k;->j:Lu0/n;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v1}, Lka/e0;->a(I)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    sget-wide v3, Ln0/a;->g:J

    .line 73
    .line 74
    invoke-static {v1, v2, v3, v4}, Ln0/a;->a(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v4, 0x1

    .line 79
    const/4 v5, 0x2

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    move v1, v5

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move v1, v4

    .line 91
    :goto_2
    new-instance v2, Lc0/a;

    .line 92
    .line 93
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_4
    sget-wide v6, Ln0/a;->e:J

    .line 99
    .line 100
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    new-instance v2, Lc0/a;

    .line 107
    .line 108
    const/4 v1, 0x4

    .line 109
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_5
    sget-wide v6, Ln0/a;->d:J

    .line 115
    .line 116
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    new-instance v2, Lc0/a;

    .line 123
    .line 124
    const/4 v1, 0x3

    .line 125
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_6
    sget-wide v6, Ln0/a;->b:J

    .line 130
    .line 131
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    new-instance v2, Lc0/a;

    .line 138
    .line 139
    const/4 v1, 0x5

    .line 140
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    sget-wide v6, Ln0/a;->c:J

    .line 145
    .line 146
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_8

    .line 151
    .line 152
    new-instance v2, Lc0/a;

    .line 153
    .line 154
    const/4 v1, 0x6

    .line 155
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    sget-wide v6, Ln0/a;->f:J

    .line 160
    .line 161
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_9

    .line 166
    .line 167
    move v3, v4

    .line 168
    goto :goto_3

    .line 169
    :cond_9
    sget-wide v6, Ln0/a;->h:J

    .line 170
    .line 171
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    :goto_3
    if-eqz v3, :cond_a

    .line 176
    .line 177
    move v3, v4

    .line 178
    goto :goto_4

    .line 179
    :cond_a
    sget-wide v6, Ln0/a;->j:J

    .line 180
    .line 181
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    :goto_4
    if-eqz v3, :cond_b

    .line 186
    .line 187
    new-instance v2, Lc0/a;

    .line 188
    .line 189
    const/4 v1, 0x7

    .line 190
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_b
    sget-wide v6, Ln0/a;->a:J

    .line 195
    .line 196
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_c

    .line 201
    .line 202
    move v1, v4

    .line 203
    goto :goto_5

    .line 204
    :cond_c
    sget-wide v6, Ln0/a;->i:J

    .line 205
    .line 206
    invoke-static {v1, v2, v6, v7}, Ln0/a;->a(JJ)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    :goto_5
    if-eqz v1, :cond_d

    .line 211
    .line 212
    new-instance v2, Lc0/a;

    .line 213
    .line 214
    const/16 v1, 0x8

    .line 215
    .line 216
    invoke-direct {v2, v1}, Lc0/a;-><init>(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_d
    const/4 v2, 0x0

    .line 221
    :goto_6
    if-eqz v2, :cond_12

    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    const/4 v1, 0x0

    .line 228
    if-eqz p1, :cond_f

    .line 229
    .line 230
    if-eq p1, v4, :cond_e

    .line 231
    .line 232
    move p1, v1

    .line 233
    goto :goto_7

    .line 234
    :cond_e
    move p1, v4

    .line 235
    goto :goto_7

    .line 236
    :cond_f
    move p1, v5

    .line 237
    :goto_7
    if-ne p1, v5, :cond_10

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_10
    move v4, v1

    .line 241
    :goto_8
    if-nez v4, :cond_11

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_11
    invoke-virtual {v0}, Lu0/n;->getFocusManager()Lc0/e;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Lb7/k;

    .line 249
    .line 250
    iget v0, v2, Lc0/a;->a:I

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Lb7/k;->A(I)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    goto :goto_a

    .line 261
    :cond_12
    :goto_9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    :goto_a
    return-object p1

    .line 264
    :pswitch_1
    check-cast p1, Ll0/a;

    .line 265
    .line 266
    iget p1, p1, Ll0/a;->a:I

    .line 267
    .line 268
    iget-object v0, p0, Lu0/k;->j:Lu0/n;

    .line 269
    .line 270
    const/4 v1, 0x1

    .line 271
    if-ne p1, v1, :cond_13

    .line 272
    .line 273
    invoke-virtual {v0}, Landroid/view/View;->isInTouchMode()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    goto :goto_b

    .line 278
    :cond_13
    const/4 v2, 0x2

    .line 279
    if-ne p1, v2, :cond_14

    .line 280
    .line 281
    invoke-virtual {v0}, Landroid/view/View;->isInTouchMode()Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-eqz p1, :cond_15

    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    goto :goto_b

    .line 292
    :cond_14
    const/4 v1, 0x0

    .line 293
    :cond_15
    :goto_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    return-object p1

    .line 298
    nop

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
