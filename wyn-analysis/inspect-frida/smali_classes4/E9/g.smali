.class public final LE9/g;
.super LE9/c;
.source "SourceFile"


# instance fields
.field public d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

.field public e:Landroid/view/ViewGroup;

.field public f:Landroid/widget/ScrollView;

.field public g:Landroid/widget/Button;

.field public h:Landroid/view/View;

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field public l:LN9/i;

.field public m:LE9/d;


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
    iget-object v0, p0, LE9/g;->e:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/g;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

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
    const v2, 0x7f0d0087

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
    iput-object v1, p0, LE9/g;->f:Landroid/widget/ScrollView;

    .line 23
    .line 24
    const v1, 0x7f0a0094

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
    iput-object v1, p0, LE9/g;->g:Landroid/widget/Button;

    .line 34
    .line 35
    const v1, 0x7f0a00b1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, LE9/g;->h:Landroid/view/View;

    .line 43
    .line 44
    const v1, 0x7f0a015b

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroid/widget/ImageView;

    .line 52
    .line 53
    iput-object v1, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 54
    .line 55
    const v1, 0x7f0a01b7

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Landroid/widget/TextView;

    .line 63
    .line 64
    iput-object v1, p0, LE9/g;->j:Landroid/widget/TextView;

    .line 65
    .line 66
    const v1, 0x7f0a01b8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Landroid/widget/TextView;

    .line 74
    .line 75
    iput-object v1, p0, LE9/g;->k:Landroid/widget/TextView;

    .line 76
    .line 77
    const v1, 0x7f0a01bc

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    .line 85
    .line 86
    iput-object v1, p0, LE9/g;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    .line 87
    .line 88
    const v1, 0x7f0a01bb

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Landroid/view/ViewGroup;

    .line 96
    .line 97
    iput-object v0, p0, LE9/g;->e:Landroid/view/ViewGroup;

    .line 98
    .line 99
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, LN9/h;

    .line 102
    .line 103
    iget-object v1, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 104
    .line 105
    sget-object v2, Lcom/google/firebase/inappmessaging/model/MessageType;->MODAL:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    check-cast v0, LN9/i;

    .line 114
    .line 115
    iput-object v0, p0, LE9/g;->l:LN9/i;

    .line 116
    .line 117
    iget-object v1, v0, LN9/i;->e:LN9/f;

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    const/16 v3, 0x8

    .line 121
    .line 122
    if-eqz v1, :cond_1

    .line 123
    .line 124
    iget-object v1, v1, LN9/f;->a:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_0

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    iget-object v1, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    :goto_0
    iget-object v1, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 142
    .line 143
    .line 144
    :goto_1
    iget-object v1, v0, LN9/i;->c:LN9/l;

    .line 145
    .line 146
    if-eqz v1, :cond_3

    .line 147
    .line 148
    iget-object v4, v1, LN9/l;->a:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_2

    .line 155
    .line 156
    iget-object v5, p0, LE9/g;->k:Landroid/widget/TextView;

    .line 157
    .line 158
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    iget-object v5, p0, LE9/g;->k:Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_2
    iget-object v4, p0, LE9/g;->k:Landroid/widget/TextView;

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    :goto_2
    iget-object v1, v1, LN9/l;->b:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-nez v4, :cond_3

    .line 179
    .line 180
    iget-object v4, p0, LE9/g;->k:Landroid/widget/TextView;

    .line 181
    .line 182
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 187
    .line 188
    .line 189
    :cond_3
    iget-object v0, v0, LN9/i;->d:LN9/l;

    .line 190
    .line 191
    if-eqz v0, :cond_4

    .line 192
    .line 193
    iget-object v1, v0, LN9/l;->a:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-nez v4, :cond_4

    .line 200
    .line 201
    iget-object v4, p0, LE9/g;->f:Landroid/widget/ScrollView;

    .line 202
    .line 203
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 204
    .line 205
    .line 206
    iget-object v4, p0, LE9/g;->j:Landroid/widget/TextView;

    .line 207
    .line 208
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    iget-object v4, p0, LE9/g;->j:Landroid/widget/TextView;

    .line 212
    .line 213
    iget-object v0, v0, LN9/l;->b:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, LE9/g;->j:Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_4
    iget-object v0, p0, LE9/g;->f:Landroid/widget/ScrollView;

    .line 229
    .line 230
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 231
    .line 232
    .line 233
    iget-object v0, p0, LE9/g;->j:Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 236
    .line 237
    .line 238
    :goto_3
    iget-object v0, p0, LE9/g;->l:LN9/i;

    .line 239
    .line 240
    iget-object v0, v0, LN9/i;->f:LN9/a;

    .line 241
    .line 242
    if-eqz v0, :cond_6

    .line 243
    .line 244
    iget-object v0, v0, LN9/a;->b:LN9/d;

    .line 245
    .line 246
    if-eqz v0, :cond_6

    .line 247
    .line 248
    iget-object v1, v0, LN9/d;->a:LN9/l;

    .line 249
    .line 250
    iget-object v1, v1, LN9/l;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-nez v1, :cond_6

    .line 257
    .line 258
    iget-object v1, p0, LE9/g;->g:Landroid/widget/Button;

    .line 259
    .line 260
    invoke-static {v1, v0}, LE9/c;->t(Landroid/widget/Button;LN9/d;)V

    .line 261
    .line 262
    .line 263
    iget-object v0, p0, LE9/g;->g:Landroid/widget/Button;

    .line 264
    .line 265
    iget-object v1, p0, LE9/g;->l:LN9/i;

    .line 266
    .line 267
    iget-object v1, v1, LN9/i;->f:LN9/a;

    .line 268
    .line 269
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    check-cast p1, Landroid/view/View$OnClickListener;

    .line 274
    .line 275
    if-eqz v0, :cond_5

    .line 276
    .line 277
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    .line 279
    .line 280
    :cond_5
    iget-object p1, p0, LE9/g;->g:Landroid/widget/Button;

    .line 281
    .line 282
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_6
    iget-object p1, p0, LE9/g;->g:Landroid/widget/Button;

    .line 287
    .line 288
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 289
    .line 290
    .line 291
    :goto_4
    iget-object p1, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 292
    .line 293
    iget-object v0, p0, LE9/c;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, LD9/k;

    .line 296
    .line 297
    invoke-virtual {v0}, LD9/k;->a()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, LE9/g;->i:Landroid/widget/ImageView;

    .line 305
    .line 306
    invoke-virtual {v0}, LD9/k;->b()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, LE9/g;->h:Landroid/view/View;

    .line 314
    .line 315
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    .line 317
    .line 318
    iget-object p1, p0, LE9/g;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;

    .line 319
    .line 320
    invoke-virtual {p1, p2}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamRelativeLayout;->setDismissListener(Landroid/view/View$OnClickListener;)V

    .line 321
    .line 322
    .line 323
    iget-object p1, p0, LE9/g;->e:Landroid/view/ViewGroup;

    .line 324
    .line 325
    iget-object p2, p0, LE9/g;->l:LN9/i;

    .line 326
    .line 327
    iget-object p2, p2, LN9/i;->g:Ljava/lang/String;

    .line 328
    .line 329
    invoke-static {p1, p2}, LE9/c;->s(Landroid/view/View;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_7
    iget-object p1, p0, LE9/g;->m:LE9/d;

    .line 333
    .line 334
    return-object p1
.end method
