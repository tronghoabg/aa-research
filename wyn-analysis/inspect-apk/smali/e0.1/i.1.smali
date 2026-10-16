.class public abstract Le0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/Bitmap;)Lf0/c;
    .locals 1
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/m;->h(Landroid/graphics/Bitmap;)Landroid/graphics/ColorSpace;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Le0/i;->b(Landroid/graphics/ColorSpace;)Lf0/c;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lf0/e;->c:Lf0/n;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final b(Landroid/graphics/ColorSpace;)Lf0/c;
    .locals 1
    .param p0    # Landroid/graphics/ColorSpace;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Le0/h;->p()Landroid/graphics/ColorSpace$Named;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->u()Landroid/graphics/ColorSpace;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lf0/e;->c:Lf0/n;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->B()Landroid/graphics/ColorSpace$Named;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Le0/h;->n()Landroid/graphics/ColorSpace;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object p0, Lf0/e;->o:Lf0/n;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {}, Le0/h;->m()Landroid/graphics/ColorSpace$Named;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Le0/h;->q()Landroid/graphics/ColorSpace;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    sget-object p0, Lf0/e;->p:Lf0/n;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {}, Le0/h;->s()Landroid/graphics/ColorSpace$Named;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Le0/h;->t()Landroid/graphics/ColorSpace;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    sget-object p0, Lf0/e;->m:Lf0/n;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    invoke-static {}, Le0/h;->v()Landroid/graphics/ColorSpace$Named;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Le0/h;->w()Landroid/graphics/ColorSpace;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    sget-object p0, Lf0/e;->h:Lf0/n;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    invoke-static {}, Le0/h;->x()Landroid/graphics/ColorSpace$Named;

    .line 87
    .line 88
    .line 89
    invoke-static {}, Le0/h;->y()Landroid/graphics/ColorSpace;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    sget-object p0, Lf0/e;->g:Lf0/n;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_5
    invoke-static {}, Le0/h;->z()Landroid/graphics/ColorSpace$Named;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Le0/h;->A()Landroid/graphics/ColorSpace;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    sget-object p0, Lf0/e;->r:Lf0/i;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_6
    invoke-static {}, Le0/h;->B()Landroid/graphics/ColorSpace$Named;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Le0/h;->C()Landroid/graphics/ColorSpace;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    sget-object p0, Lf0/e;->q:Lf0/i;

    .line 132
    .line 133
    return-object p0

    .line 134
    :cond_7
    invoke-static {}, Le0/h;->D()Landroid/graphics/ColorSpace$Named;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->g()Landroid/graphics/ColorSpace;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    sget-object p0, Lf0/e;->i:Lf0/n;

    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->f()Landroid/graphics/ColorSpace$Named;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->r()Landroid/graphics/ColorSpace;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    sget-object p0, Lf0/e;->j:Lf0/n;

    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->q()Landroid/graphics/ColorSpace$Named;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->w()Landroid/graphics/ColorSpace;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    sget-object p0, Lf0/e;->e:Lf0/n;

    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->t()Landroid/graphics/ColorSpace$Named;

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->y()Landroid/graphics/ColorSpace;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_b

    .line 194
    .line 195
    sget-object p0, Lf0/e;->f:Lf0/n;

    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->v()Landroid/graphics/ColorSpace$Named;

    .line 199
    .line 200
    .line 201
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->A()Landroid/graphics/ColorSpace;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_c

    .line 210
    .line 211
    sget-object p0, Lf0/e;->d:Lf0/n;

    .line 212
    .line 213
    return-object p0

    .line 214
    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->x()Landroid/graphics/ColorSpace$Named;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->C()Landroid/graphics/ColorSpace;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_d

    .line 226
    .line 227
    sget-object p0, Lf0/e;->k:Lf0/n;

    .line 228
    .line 229
    return-object p0

    .line 230
    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->z()Landroid/graphics/ColorSpace$Named;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->D()Landroid/graphics/ColorSpace;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_e

    .line 242
    .line 243
    sget-object p0, Lf0/e;->n:Lf0/n;

    .line 244
    .line 245
    return-object p0

    .line 246
    :cond_e
    invoke-static {}, Le0/h;->a()Landroid/graphics/ColorSpace$Named;

    .line 247
    .line 248
    .line 249
    invoke-static {}, Le0/h;->b()Landroid/graphics/ColorSpace;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    if-eqz p0, :cond_f

    .line 258
    .line 259
    sget-object p0, Lf0/e;->l:Lf0/n;

    .line 260
    .line 261
    return-object p0

    .line 262
    :cond_f
    sget-object p0, Lf0/e;->c:Lf0/n;

    .line 263
    .line 264
    return-object p0
.end method

.method public static final c(IIIZLf0/c;)Landroid/graphics/Bitmap;
    .locals 1
    .param p4    # Lf0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "colorSpace"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Le0/z;->t(I)Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p4}, Le0/i;->d(Lf0/c;)Landroid/graphics/ColorSpace;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/m;->e(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "createBitmap(\n          \u2026orkColorSpace()\n        )"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static final d(Lf0/c;)Landroid/graphics/ColorSpace;
    .locals 1
    .param p0    # Lf0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lf0/e;->c:Lf0/n;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Le0/h;->p()Landroid/graphics/ColorSpace$Named;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lf0/e;->o:Lf0/n;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->B()Landroid/graphics/ColorSpace$Named;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :cond_1
    sget-object v0, Lf0/e;->p:Lf0/n;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-static {}, Le0/h;->m()Landroid/graphics/ColorSpace$Named;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_2
    sget-object v0, Lf0/e;->m:Lf0/n;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, Le0/h;->s()Landroid/graphics/ColorSpace$Named;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :cond_3
    sget-object v0, Lf0/e;->h:Lf0/n;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {}, Le0/h;->v()Landroid/graphics/ColorSpace$Named;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_4
    sget-object v0, Lf0/e;->g:Lf0/n;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-static {}, Le0/h;->x()Landroid/graphics/ColorSpace$Named;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_5
    sget-object v0, Lf0/e;->r:Lf0/i;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    invoke-static {}, Le0/h;->z()Landroid/graphics/ColorSpace$Named;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :cond_6
    sget-object v0, Lf0/e;->q:Lf0/i;

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    invoke-static {}, Le0/h;->B()Landroid/graphics/ColorSpace$Named;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :cond_7
    sget-object v0, Lf0/e;->i:Lf0/n;

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    invoke-static {}, Le0/h;->D()Landroid/graphics/ColorSpace$Named;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    goto :goto_0

    .line 131
    :cond_8
    sget-object v0, Lf0/e;->j:Lf0/n;

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->f()Landroid/graphics/ColorSpace$Named;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    goto :goto_0

    .line 144
    :cond_9
    sget-object v0, Lf0/e;->e:Lf0/n;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->q()Landroid/graphics/ColorSpace$Named;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    goto :goto_0

    .line 157
    :cond_a
    sget-object v0, Lf0/e;->f:Lf0/n;

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->t()Landroid/graphics/ColorSpace$Named;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    goto :goto_0

    .line 170
    :cond_b
    sget-object v0, Lf0/e;->d:Lf0/n;

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_c

    .line 177
    .line 178
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->v()Landroid/graphics/ColorSpace$Named;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    goto :goto_0

    .line 183
    :cond_c
    sget-object v0, Lf0/e;->k:Lf0/n;

    .line 184
    .line 185
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_d

    .line 190
    .line 191
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->x()Landroid/graphics/ColorSpace$Named;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    goto :goto_0

    .line 196
    :cond_d
    sget-object v0, Lf0/e;->n:Lf0/n;

    .line 197
    .line 198
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_e

    .line 203
    .line 204
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->z()Landroid/graphics/ColorSpace$Named;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    goto :goto_0

    .line 209
    :cond_e
    sget-object v0, Lf0/e;->l:Lf0/n;

    .line 210
    .line 211
    invoke-virtual {p0, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_f

    .line 216
    .line 217
    invoke-static {}, Le0/h;->a()Landroid/graphics/ColorSpace$Named;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    goto :goto_0

    .line 222
    :cond_f
    invoke-static {}, Le0/h;->p()Landroid/graphics/ColorSpace$Named;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    :goto_0
    invoke-static {p0}, Le0/h;->c(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    const-string v0, "get(frameworkNamedSpace)"

    .line 231
    .line 232
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object p0
.end method
