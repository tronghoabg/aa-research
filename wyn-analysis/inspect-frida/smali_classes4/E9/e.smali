.class public final LE9/e;
.super LE9/c;
.source "SourceFile"


# instance fields
.field public d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

.field public e:LH9/a;

.field public f:Landroid/widget/ScrollView;

.field public g:Landroid/widget/Button;

.field public h:Landroid/widget/Button;

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field public l:LN9/e;

.field public m:LB9/a;

.field public n:LE9/d;


# virtual methods
.method public final f()LD9/k;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD9/k;

    .line 4
    .line 5
    return-object v0
.end method

.method public final g()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/e;->e:LH9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/e;->m:LB9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/e;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ljava/util/HashMap;LB9/a;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LE9/c;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Landroid/view/LayoutInflater;

    .line 5
    .line 6
    const v2, 0x7f0d0022

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f0a0088

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/widget/ScrollView;

    .line 21
    .line 22
    iput-object v1, p0, LE9/e;->f:Landroid/widget/ScrollView;

    .line 23
    .line 24
    const v1, 0x7f0a0216

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/widget/Button;

    .line 32
    .line 33
    iput-object v1, p0, LE9/e;->g:Landroid/widget/Button;

    .line 34
    .line 35
    const v1, 0x7f0a0250

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/widget/Button;

    .line 43
    .line 44
    iput-object v1, p0, LE9/e;->h:Landroid/widget/Button;

    .line 45
    .line 46
    const v1, 0x7f0a015b

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroid/widget/ImageView;

    .line 54
    .line 55
    iput-object v1, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 56
    .line 57
    const v1, 0x7f0a01b7

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroid/widget/TextView;

    .line 65
    .line 66
    iput-object v1, p0, LE9/e;->j:Landroid/widget/TextView;

    .line 67
    .line 68
    const v1, 0x7f0a01b8

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Landroid/widget/TextView;

    .line 76
    .line 77
    iput-object v1, p0, LE9/e;->k:Landroid/widget/TextView;

    .line 78
    .line 79
    const v1, 0x7f0a009b

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    .line 87
    .line 88
    iput-object v1, p0, LE9/e;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    .line 89
    .line 90
    const v1, 0x7f0a009a

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, LH9/a;

    .line 98
    .line 99
    iput-object v0, p0, LE9/e;->e:LH9/a;

    .line 100
    .line 101
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, LN9/h;

    .line 104
    .line 105
    iget-object v1, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 106
    .line 107
    sget-object v2, Lcom/google/firebase/inappmessaging/model/MessageType;->CARD:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, LN9/e;

    .line 116
    .line 117
    iput-object v0, p0, LE9/e;->l:LN9/e;

    .line 118
    .line 119
    iget-object v1, p0, LE9/e;->k:Landroid/widget/TextView;

    .line 120
    .line 121
    iget-object v2, v0, LN9/e;->c:LN9/l;

    .line 122
    .line 123
    iget-object v3, v2, LN9/l;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, LE9/e;->k:Landroid/widget/TextView;

    .line 129
    .line 130
    iget-object v2, v2, LN9/l;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    .line 138
    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    iget-object v0, v0, LN9/e;->d:LN9/l;

    .line 143
    .line 144
    if-eqz v0, :cond_0

    .line 145
    .line 146
    iget-object v3, v0, LN9/l;->a:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v3, :cond_0

    .line 149
    .line 150
    iget-object v4, p0, LE9/e;->f:Landroid/widget/ScrollView;

    .line 151
    .line 152
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    iget-object v4, p0, LE9/e;->j:Landroid/widget/TextView;

    .line 156
    .line 157
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    iget-object v4, p0, LE9/e;->j:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    iget-object v3, p0, LE9/e;->j:Landroid/widget/TextView;

    .line 166
    .line 167
    iget-object v0, v0, LN9/l;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, LE9/e;->f:Landroid/widget/ScrollView;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, LE9/e;->j:Landroid/widget/TextView;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    :goto_0
    iget-object v0, p0, LE9/e;->l:LN9/e;

    .line 188
    .line 189
    iget-object v3, v0, LN9/e;->h:LN9/f;

    .line 190
    .line 191
    if-nez v3, :cond_2

    .line 192
    .line 193
    iget-object v0, v0, LN9/e;->i:LN9/f;

    .line 194
    .line 195
    if-eqz v0, :cond_1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_1
    iget-object v0, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    :goto_1
    iget-object v0, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    :goto_2
    iget-object v0, p0, LE9/e;->l:LN9/e;

    .line 210
    .line 211
    iget-object v3, v0, LN9/e;->f:LN9/a;

    .line 212
    .line 213
    iget-object v4, p0, LE9/e;->g:Landroid/widget/Button;

    .line 214
    .line 215
    iget-object v5, v3, LN9/a;->b:LN9/d;

    .line 216
    .line 217
    invoke-static {v4, v5}, LE9/c;->t(Landroid/widget/Button;LN9/d;)V

    .line 218
    .line 219
    .line 220
    iget-object v4, p0, LE9/e;->g:Landroid/widget/Button;

    .line 221
    .line 222
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Landroid/view/View$OnClickListener;

    .line 227
    .line 228
    if-eqz v4, :cond_3

    .line 229
    .line 230
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 231
    .line 232
    .line 233
    :cond_3
    iget-object v3, p0, LE9/e;->g:Landroid/widget/Button;

    .line 234
    .line 235
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 236
    .line 237
    .line 238
    iget-object v0, v0, LN9/e;->g:LN9/a;

    .line 239
    .line 240
    if-eqz v0, :cond_5

    .line 241
    .line 242
    iget-object v3, v0, LN9/a;->b:LN9/d;

    .line 243
    .line 244
    if-eqz v3, :cond_5

    .line 245
    .line 246
    iget-object v1, p0, LE9/e;->h:Landroid/widget/Button;

    .line 247
    .line 248
    invoke-static {v1, v3}, LE9/c;->t(Landroid/widget/Button;LN9/d;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, LE9/e;->h:Landroid/widget/Button;

    .line 252
    .line 253
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, Landroid/view/View$OnClickListener;

    .line 258
    .line 259
    if-eqz v1, :cond_4

    .line 260
    .line 261
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 262
    .line 263
    .line 264
    :cond_4
    iget-object p1, p0, LE9/e;->h:Landroid/widget/Button;

    .line 265
    .line 266
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_5
    iget-object p1, p0, LE9/e;->h:Landroid/widget/Button;

    .line 271
    .line 272
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 273
    .line 274
    .line 275
    :goto_3
    iget-object p1, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 276
    .line 277
    iget-object v0, p0, LE9/c;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, LD9/k;

    .line 280
    .line 281
    invoke-virtual {v0}, LD9/k;->a()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 286
    .line 287
    .line 288
    iget-object p1, p0, LE9/e;->i:Landroid/widget/ImageView;

    .line 289
    .line 290
    invoke-virtual {v0}, LD9/k;->b()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 295
    .line 296
    .line 297
    iput-object p2, p0, LE9/e;->m:LB9/a;

    .line 298
    .line 299
    iget-object p1, p0, LE9/e;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;

    .line 300
    .line 301
    invoke-virtual {p1, p2}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamCardView;->setDismissListener(Landroid/view/View$OnClickListener;)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, LE9/e;->e:LH9/a;

    .line 305
    .line 306
    iget-object p2, p0, LE9/e;->l:LN9/e;

    .line 307
    .line 308
    iget-object p2, p2, LN9/e;->e:Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {p1, p2}, LE9/c;->s(Landroid/view/View;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :cond_6
    iget-object p1, p0, LE9/e;->n:LE9/d;

    .line 314
    .line 315
    return-object p1
.end method
