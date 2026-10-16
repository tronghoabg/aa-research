.class public final LE9/a;
.super LE9/c;
.source "SourceFile"


# instance fields
.field public d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

.field public e:Landroid/view/ViewGroup;

.field public f:Landroid/widget/TextView;

.field public g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

.field public h:Landroid/widget/TextView;

.field public i:LB9/a;


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
    iget-object v0, p0, LE9/a;->e:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/a;->i:LB9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/a;->g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/a;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ljava/util/HashMap;LB9/a;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 7

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    const v1, 0x7f0d001f

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f0a007f

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 21
    .line 22
    iput-object v1, p0, LE9/a;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 23
    .line 24
    const v1, 0x7f0a007a

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    iput-object v1, p0, LE9/a;->e:Landroid/view/ViewGroup;

    .line 34
    .line 35
    const v1, 0x7f0a0079

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/widget/TextView;

    .line 43
    .line 44
    iput-object v1, p0, LE9/a;->f:Landroid/widget/TextView;

    .line 45
    .line 46
    const v1, 0x7f0a007d

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 54
    .line 55
    iput-object v1, p0, LE9/a;->g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 56
    .line 57
    const v1, 0x7f0a0080

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroid/widget/TextView;

    .line 65
    .line 66
    iput-object v0, p0, LE9/a;->h:Landroid/widget/TextView;

    .line 67
    .line 68
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LN9/h;

    .line 71
    .line 72
    iget-object v1, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 73
    .line 74
    sget-object v3, Lcom/google/firebase/inappmessaging/model/MessageType;->BANNER:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_8

    .line 81
    .line 82
    check-cast v0, LN9/c;

    .line 83
    .line 84
    iget-object v1, v0, LN9/c;->g:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_0

    .line 91
    .line 92
    iget-object v3, p0, LE9/a;->e:Landroid/view/ViewGroup;

    .line 93
    .line 94
    invoke-static {v3, v1}, LE9/c;->s(Landroid/view/View;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v1, p0, LE9/a;->g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 98
    .line 99
    iget-object v3, v0, LN9/c;->e:LN9/f;

    .line 100
    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    iget-object v3, v3, LN9/f;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    const/4 v3, 0x0

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    :goto_0
    const/16 v3, 0x8

    .line 115
    .line 116
    :goto_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v0, LN9/c;->c:LN9/l;

    .line 120
    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    iget-object v3, v1, LN9/l;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_3

    .line 130
    .line 131
    iget-object v4, p0, LE9/a;->h:Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    iget-object v1, v1, LN9/l;->b:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_4

    .line 143
    .line 144
    iget-object v3, p0, LE9/a;->h:Landroid/widget/TextView;

    .line 145
    .line 146
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    :cond_4
    iget-object v1, v0, LN9/c;->d:LN9/l;

    .line 154
    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    iget-object v3, v1, LN9/l;->a:Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_5

    .line 164
    .line 165
    iget-object v4, p0, LE9/a;->f:Landroid/widget/TextView;

    .line 166
    .line 167
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    iget-object v1, v1, LN9/l;->b:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    iget-object v3, p0, LE9/a;->f:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 185
    .line 186
    .line 187
    :cond_6
    iget-object v1, p0, LE9/c;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, LD9/k;

    .line 190
    .line 191
    iget-object v3, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    iget-object v4, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    iget-object v4, p0, LE9/a;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 208
    .line 209
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    if-nez v4, :cond_7

    .line 214
    .line 215
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 216
    .line 217
    const/4 v5, -0x1

    .line 218
    const/4 v6, -0x2

    .line 219
    invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 220
    .line 221
    .line 222
    :cond_7
    iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 223
    .line 224
    iget-object v3, p0, LE9/a;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 225
    .line 226
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    iget-object v3, p0, LE9/a;->g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 230
    .line 231
    invoke-virtual {v1}, LD9/k;->a()I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 236
    .line 237
    .line 238
    iget-object v3, p0, LE9/a;->g:Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;

    .line 239
    .line 240
    invoke-virtual {v1}, LD9/k;->b()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 245
    .line 246
    .line 247
    iput-object p2, p0, LE9/a;->i:LB9/a;

    .line 248
    .line 249
    iget-object v1, p0, LE9/a;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 250
    .line 251
    invoke-virtual {v1, p2}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;->setDismissListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    iget-object p2, v0, LN9/c;->f:LN9/a;

    .line 255
    .line 256
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    check-cast p1, Landroid/view/View$OnClickListener;

    .line 261
    .line 262
    iget-object p2, p0, LE9/a;->e:Landroid/view/ViewGroup;

    .line 263
    .line 264
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    return-object v2
.end method
