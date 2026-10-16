.class public final LM/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/Q;


# instance fields
.field public final a:Z

.field public final b:LN/V;


# direct methods
.method public constructor <init>(ZLN/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LM/e;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, LM/e;->b:LN/V;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LD/i;LN/o;)LB/S;
    .locals 11

    .line 1
    const-string v0, "interactionSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x3aef0613

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, LM/v;->a:LN/L0;

    .line 13
    .line 14
    invoke-virtual {p2, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LM/t;

    .line 19
    .line 20
    const v1, -0x5adb992e

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LM/e;->b:LN/V;

    .line 27
    .line 28
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Le0/q;

    .line 33
    .line 34
    iget-wide v2, v2, Le0/q;->a:J

    .line 35
    .line 36
    sget-wide v4, Le0/q;->i:J

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Le0/q;

    .line 47
    .line 48
    iget-wide v1, v1, Le0/q;->a:J

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {v0, p2}, LM/t;->a(LN/o;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    :goto_0
    const/4 v3, 0x0

    .line 56
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Le0/q;

    .line 60
    .line 61
    invoke-direct {v4, v1, v2}, Le0/q;-><init>(J)V

    .line 62
    .line 63
    .line 64
    invoke-static {v4, p2}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0, p2}, LM/t;->b(LN/o;)LM/g;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, p2}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const v2, 0x13be9e37

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 80
    .line 81
    .line 82
    const v2, -0x67961d31

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 89
    .line 90
    invoke-virtual {p2, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :goto_1
    instance-of v4, v2, Landroid/view/ViewGroup;

    .line 95
    .line 96
    if-nez v4, :cond_2

    .line 97
    .line 98
    move-object v4, v2

    .line 99
    check-cast v4, Landroid/view/View;

    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    instance-of v5, v4, Landroid/view/View;

    .line 106
    .line 107
    if-eqz v5, :cond_1

    .line 108
    .line 109
    const-string v2, "parent"

    .line 110
    .line 111
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v4

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string p2, "Couldn\'t find a valid parent for "

    .line 119
    .line 120
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p2, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p2

    .line 145
    :cond_2
    check-cast v2, Landroid/view/ViewGroup;

    .line 146
    .line 147
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 148
    .line 149
    .line 150
    const v4, 0x61f244d6

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v4}, LN/o;->M(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/view/View;->isInEditMode()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    sget-object v5, LN/k;->a:LN/P;

    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    iget-boolean v7, p0, LM/e;->a:Z

    .line 164
    .line 165
    if-eqz v4, :cond_5

    .line 166
    .line 167
    const v2, -0x384098

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    or-int/2addr v2, v4

    .line 182
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    if-nez v2, :cond_3

    .line 187
    .line 188
    if-ne v4, v5, :cond_4

    .line 189
    .line 190
    :cond_3
    new-instance v4, LM/c;

    .line 191
    .line 192
    invoke-direct {v4, v7, v1, v0}, LM/c;-><init>(ZLN/V;LN/V;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_4
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 199
    .line 200
    .line 201
    check-cast v4, LM/c;

    .line 202
    .line 203
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_5
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    move v8, v3

    .line 218
    :goto_2
    if-ge v8, v4, :cond_7

    .line 219
    .line 220
    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    instance-of v10, v9, LM/q;

    .line 225
    .line 226
    if-eqz v10, :cond_6

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_7
    move-object v9, v6

    .line 233
    :goto_3
    if-nez v9, :cond_8

    .line 234
    .line 235
    new-instance v9, LM/q;

    .line 236
    .line 237
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const-string v8, "view.context"

    .line 242
    .line 243
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v9, v4}, LM/q;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    :cond_8
    const v2, -0x383ecf

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    or-int/2addr v2, v4

    .line 267
    invoke-virtual {p2, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    or-int/2addr v2, v4

    .line 272
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-nez v2, :cond_9

    .line 277
    .line 278
    if-ne v4, v5, :cond_a

    .line 279
    .line 280
    :cond_9
    new-instance v4, LM/a;

    .line 281
    .line 282
    check-cast v9, LM/q;

    .line 283
    .line 284
    invoke-direct {v4, v7, v1, v0, v9}, LM/a;-><init>(ZLN/V;LN/V;LM/q;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p2, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_a
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 291
    .line 292
    .line 293
    check-cast v4, LM/a;

    .line 294
    .line 295
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 296
    .line 297
    .line 298
    :goto_4
    new-instance v0, LM/f;

    .line 299
    .line 300
    invoke-direct {v0, p1, v4, v6}, LM/f;-><init>(LD/i;LA7/B0;Ljf/c;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v4, p1, v0, p2}, LN/d;->f(Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, v3}, LN/o;->p(Z)V

    .line 307
    .line 308
    .line 309
    return-object v4
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, LM/e;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, LM/e;

    .line 10
    .line 11
    iget-boolean v0, p1, LM/e;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p0, LM/e;->a:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    invoke-static {v0, v0}, LL0/d;->a(FF)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget-object v0, p0, LM/e;->b:LN/V;

    .line 28
    .line 29
    iget-object p1, p1, LM/e;->b:LN/V;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    :goto_0
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, LM/e;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x4cf

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x4d5

    .line 9
    .line 10
    :goto_0
    const/16 v1, 0x1f

    .line 11
    .line 12
    mul-int/2addr v0, v1

    .line 13
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, LM/e;->b:LN/V;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v0

    .line 26
    return v1
.end method
