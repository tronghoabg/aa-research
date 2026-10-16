.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->a:I

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LZ/k;Ltf/l;I)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;LZ/k;I)V
    .locals 0

    .line 3
    const/4 p3, 0x1

    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ld0/c;

    .line 7
    .line 8
    check-cast p2, Ld0/c;

    .line 9
    .line 10
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Ltf/a;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide p1, p1, Ld0/c;->a:J

    .line 21
    .line 22
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    float-to-int v0, v0

    .line 27
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    int-to-float v0, v0

    .line 36
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 37
    .line 38
    div-float/2addr v0, v1

    .line 39
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    float-to-int p1, p1

    .line 44
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    int-to-float p1, p1

    .line 53
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 54
    .line 55
    div-float/2addr p1, p2

    .line 56
    new-instance p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 57
    .line 58
    invoke-direct {p2, v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-virtual {p1, v0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->b(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    check-cast p1, Ld0/c;

    .line 73
    .line 74
    check-cast p2, Ld0/c;

    .line 75
    .line 76
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, Ltf/a;

    .line 79
    .line 80
    if-eqz p2, :cond_1

    .line 81
    .line 82
    invoke-interface {p2}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    iget-wide p1, p1, Ld0/c;->a:J

    .line 87
    .line 88
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    float-to-int v0, v0

    .line 93
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    int-to-float v0, v0

    .line 102
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 103
    .line 104
    div-float/2addr v0, v1

    .line 105
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    float-to-int p1, p1

    .line 110
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    int-to-float p1, p1

    .line 119
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 120
    .line 121
    div-float/2addr p1, p2

    .line 122
    new-instance p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 123
    .line 124
    invoke-direct {p2, v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 130
    .line 131
    iget-object v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->b:Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    iget-object v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->e:LC6/l;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, LC6/l;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, Ljava/util/List;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    if-eqz v2, :cond_2

    .line 148
    .line 149
    iget-object v4, v1, LC6/l;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->b()Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget-object v5, v1, LC6/l;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v5, Lcom/moloco/sdk/internal/services/events/c;

    .line 160
    .line 161
    iget-object v6, v1, LC6/l;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 164
    .line 165
    invoke-static {v6, v2, v4, v5, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Ljava/util/ArrayList;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 166
    .line 167
    .line 168
    iput-object v3, v1, LC6/l;->b:Ljava/lang/Object;

    .line 169
    .line 170
    :cond_2
    iget-object p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 171
    .line 172
    invoke-interface {p2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/a;

    .line 176
    .line 177
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/b;

    .line 178
    .line 179
    invoke-direct {v0, p1, p2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/a;Ljf/c;)V

    .line 180
    .line 181
    .line 182
    const/4 p2, 0x3

    .line 183
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->c:LKd/a;

    .line 184
    .line 185
    invoke-static {p1, v3, v0, p2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 186
    .line 187
    .line 188
    :cond_3
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 189
    .line 190
    return-object p1

    .line 191
    :pswitch_1
    check-cast p1, Ld0/c;

    .line 192
    .line 193
    check-cast p2, Ld0/c;

    .line 194
    .line 195
    iget-wide v0, p1, Ld0/c;->a:J

    .line 196
    .line 197
    invoke-static {v0, v1}, Ld0/c;->b(J)F

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    float-to-int p2, p2

    .line 202
    invoke-static {p2}, LFe/e;->c(I)F

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    invoke-static {v0, v1}, Ld0/c;->c(J)F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    float-to-int v0, v0

    .line 211
    invoke-static {v0}, LFe/e;->c(I)F

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 216
    .line 217
    invoke-direct {v1, p2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 218
    .line 219
    .line 220
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 223
    .line 224
    iput-object v1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 225
    .line 226
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Ltf/a;

    .line 229
    .line 230
    if-eqz v0, :cond_4

    .line 231
    .line 232
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_4
    iget-wide v0, p1, Ld0/c;->a:J

    .line 237
    .line 238
    invoke-static {v0, v1}, Ld0/c;->b(J)F

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    float-to-int p1, p1

    .line 243
    invoke-static {p1}, LFe/e;->c(I)F

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-static {v0, v1}, Ld0/c;->c(J)F

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    float-to-int v0, v0

    .line 252
    invoke-static {v0}, LFe/e;->c(I)F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 257
    .line 258
    invoke-direct {v1, p1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 259
    .line 260
    .line 261
    iget-object p1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 262
    .line 263
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;->d:Ljava/lang/String;

    .line 264
    .line 265
    if-eqz p1, :cond_5

    .line 266
    .line 267
    iget-object v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->j:LC8/i;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, LC8/i;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;

    .line 273
    .line 274
    invoke-virtual {p2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/e;)LEf/H0;

    .line 275
    .line 276
    .line 277
    iget-object p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 278
    .line 279
    invoke-interface {p2, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_5
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 283
    .line 284
    return-object p1

    .line 285
    :pswitch_2
    check-cast p1, LN/o;

    .line 286
    .line 287
    check-cast p2, Ljava/lang/Integer;

    .line 288
    .line 289
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;

    .line 295
    .line 296
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, LZ/k;

    .line 299
    .line 300
    const/4 v1, 0x1

    .line 301
    invoke-static {p2, v0, p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->N(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;LZ/k;LN/o;I)V

    .line 302
    .line 303
    .line 304
    sget-object p1, Lef/C;->a:Lef/C;

    .line 305
    .line 306
    return-object p1

    .line 307
    :pswitch_3
    check-cast p1, LN/o;

    .line 308
    .line 309
    check-cast p2, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p2, LZ/k;

    .line 317
    .line 318
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;->c:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Ltf/l;

    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    invoke-static {p2, v0, p1, v1}, Lr7/e;->e(LZ/k;Ltf/l;LN/o;I)V

    .line 324
    .line 325
    .line 326
    sget-object p1, Lef/C;->a:Lef/C;

    .line 327
    .line 328
    return-object p1

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
