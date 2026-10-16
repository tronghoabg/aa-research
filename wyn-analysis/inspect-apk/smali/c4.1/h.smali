.class public final Lc4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LX3/k;

.field public final b:Lba/a;

.field public final c:La2/c;


# direct methods
.method public constructor <init>(LX3/k;Lba/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc4/h;->a:LX3/k;

    .line 5
    .line 6
    iput-object p2, p0, Lc4/h;->b:Lba/a;

    .line 7
    .line 8
    new-instance v0, La2/c;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {v0, v1, p1, p2}, La2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lc4/h;->c:La2/c;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lc4/h;Lb4/m;LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p7, Lc4/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p7

    .line 9
    check-cast v0, Lc4/b;

    .line 10
    .line 11
    iget v1, v0, Lc4/b;->k:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lc4/b;->k:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lc4/b;

    .line 24
    .line 25
    invoke-direct {v0, p0, p7}, Lc4/b;-><init>(Lc4/h;Llf/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p7, v0, Lc4/b;->i:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    iget v2, v0, Lc4/b;->k:I

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget p0, v0, Lc4/b;->h:I

    .line 41
    .line 42
    iget-object p1, v0, Lc4/b;->g:LX3/c;

    .line 43
    .line 44
    iget-object p2, v0, Lc4/b;->f:Lh4/l;

    .line 45
    .line 46
    iget-object p3, v0, Lc4/b;->e:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object p4, v0, Lc4/b;->d:Lh4/h;

    .line 49
    .line 50
    iget-object p5, v0, Lc4/b;->c:LX3/b;

    .line 51
    .line 52
    iget-object p6, v0, Lc4/b;->b:Lb4/m;

    .line 53
    .line 54
    iget-object v2, v0, Lc4/b;->a:Lc4/h;

    .line 55
    .line 56
    invoke-static {p7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v7, v2

    .line 60
    move v2, p0

    .line 61
    move-object p0, v7

    .line 62
    move-object v7, p6

    .line 63
    move-object p6, p1

    .line 64
    move-object p1, v7

    .line 65
    move-object v7, p5

    .line 66
    move-object p5, p2

    .line 67
    move-object p2, v7

    .line 68
    move-object v7, p4

    .line 69
    move-object p4, p3

    .line 70
    move-object p3, v7

    .line 71
    goto :goto_3

    .line 72
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_2
    invoke-static {p7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/4 p7, 0x0

    .line 84
    :goto_1
    iget-object v2, p0, Lc4/h;->a:LX3/k;

    .line 85
    .line 86
    iget-object v2, p2, LX3/b;->e:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-ge p7, v5, :cond_3

    .line 93
    .line 94
    invoke-interface {v2, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, LZ3/c;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v5, LZ3/e;

    .line 104
    .line 105
    iget-object v6, p1, Lb4/m;->a:LZ3/k;

    .line 106
    .line 107
    iget-object v2, v2, LZ3/c;->a:LNf/j;

    .line 108
    .line 109
    invoke-direct {v5, v6, p5, v2}, LZ3/e;-><init>(LZ3/k;Lh4/l;LNf/j;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p7

    .line 116
    new-instance v2, Lef/k;

    .line 117
    .line 118
    invoke-direct {v2, v5, p7}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move-object v2, v3

    .line 123
    :goto_2
    if-eqz v2, :cond_8

    .line 124
    .line 125
    iget-object p7, v2, Lef/k;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p7, LZ3/e;

    .line 128
    .line 129
    iget-object v2, v2, Lef/k;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    add-int/2addr v2, v4

    .line 138
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iput-object p0, v0, Lc4/b;->a:Lc4/h;

    .line 142
    .line 143
    iput-object p1, v0, Lc4/b;->b:Lb4/m;

    .line 144
    .line 145
    iput-object p2, v0, Lc4/b;->c:LX3/b;

    .line 146
    .line 147
    iput-object p3, v0, Lc4/b;->d:Lh4/h;

    .line 148
    .line 149
    iput-object p4, v0, Lc4/b;->e:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p5, v0, Lc4/b;->f:Lh4/l;

    .line 152
    .line 153
    iput-object p6, v0, Lc4/b;->g:LX3/c;

    .line 154
    .line 155
    iput v2, v0, Lc4/b;->h:I

    .line 156
    .line 157
    iput v4, v0, Lc4/b;->k:I

    .line 158
    .line 159
    invoke-virtual {p7, v0}, LZ3/e;->a(Llf/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p7

    .line 163
    if-ne p7, v1, :cond_4

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_4
    :goto_3
    check-cast p7, LZ3/f;

    .line 167
    .line 168
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    if-eqz p7, :cond_7

    .line 172
    .line 173
    new-instance p0, Lc4/a;

    .line 174
    .line 175
    iget p2, p1, Lb4/m;->c:I

    .line 176
    .line 177
    iget-object p1, p1, Lb4/m;->a:LZ3/k;

    .line 178
    .line 179
    instance-of p3, p1, LZ3/j;

    .line 180
    .line 181
    if-eqz p3, :cond_5

    .line 182
    .line 183
    check-cast p1, LZ3/j;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    move-object p1, v3

    .line 187
    :goto_4
    if-eqz p1, :cond_6

    .line 188
    .line 189
    iget-object v3, p1, LZ3/j;->c:Ljava/lang/String;

    .line 190
    .line 191
    :cond_6
    iget-object p1, p7, LZ3/f;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 192
    .line 193
    iget-boolean p3, p7, LZ3/f;->b:Z

    .line 194
    .line 195
    invoke-direct {p0, p1, p3, p2, v3}, Lc4/a;-><init>(Landroid/graphics/drawable/Drawable;ZILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object p0

    .line 199
    :cond_7
    move p7, v2

    .line 200
    goto :goto_1

    .line 201
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string p1, "Unable to create a decoder that supports: "

    .line 204
    .line 205
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1
.end method

.method public static final b(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v2, v1, Lc4/c;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lc4/c;

    .line 14
    .line 15
    iget v3, v2, Lc4/c;->k:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    sub-int/2addr v3, v4

    .line 24
    iput v3, v2, Lc4/c;->k:I

    .line 25
    .line 26
    :goto_0
    move-object v6, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Lc4/c;

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Lc4/c;-><init>(Lc4/h;Llf/c;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object v1, v6, Lc4/c;->i:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 37
    .line 38
    iget v2, v6, Lc4/c;->k:I

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x0

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    if-eq v2, v3, :cond_3

    .line 47
    .line 48
    if-eq v2, v9, :cond_2

    .line 49
    .line 50
    if-ne v2, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    iget-object v2, v6, Lc4/c;->e:Lkotlin/jvm/internal/G;

    .line 66
    .line 67
    iget-object v0, v6, Lc4/c;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 70
    .line 71
    iget-object v3, v6, Lc4/c;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, LX3/c;

    .line 74
    .line 75
    iget-object v3, v6, Lc4/c;->b:Lh4/h;

    .line 76
    .line 77
    iget-object v4, v6, Lc4/c;->a:Lc4/h;

    .line 78
    .line 79
    :try_start_0
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto/16 :goto_b

    .line 86
    .line 87
    :cond_3
    iget-object v0, v6, Lc4/c;->h:Lkotlin/jvm/internal/G;

    .line 88
    .line 89
    iget-object v2, v6, Lc4/c;->g:Lkotlin/jvm/internal/G;

    .line 90
    .line 91
    iget-object v3, v6, Lc4/c;->f:Lkotlin/jvm/internal/G;

    .line 92
    .line 93
    iget-object v4, v6, Lc4/c;->e:Lkotlin/jvm/internal/G;

    .line 94
    .line 95
    iget-object v5, v6, Lc4/c;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, LX3/c;

    .line 98
    .line 99
    iget-object v11, v6, Lc4/c;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v12, v6, Lc4/c;->b:Lh4/h;

    .line 102
    .line 103
    iget-object v13, v6, Lc4/c;->a:Lc4/h;

    .line 104
    .line 105
    :try_start_1
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    move-object/from16 v17, v3

    .line 109
    .line 110
    move-object/from16 v20, v4

    .line 111
    .line 112
    move-object/from16 v21, v5

    .line 113
    .line 114
    move-object/from16 v19, v11

    .line 115
    .line 116
    move-object v15, v13

    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_4
    invoke-static {v1}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    move-object/from16 v1, p3

    .line 124
    .line 125
    iput-object v1, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v12, Lkotlin/jvm/internal/G;

    .line 128
    .line 129
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Lc4/h;->a:LX3/k;

    .line 133
    .line 134
    iget-object v1, v1, LX3/k;->f:LX3/b;

    .line 135
    .line 136
    iput-object v1, v12, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance v13, Lkotlin/jvm/internal/G;

    .line 139
    .line 140
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    :try_start_2
    iget-object v1, v0, Lc4/h;->b:Lba/a;

    .line 144
    .line 145
    iget-object v2, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lh4/l;

    .line 148
    .line 149
    iget-object v2, v2, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 150
    .line 151
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 152
    .line 153
    const/16 v5, 0x1a

    .line 154
    .line 155
    if-lt v4, v5, :cond_5

    .line 156
    .line 157
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-ne v2, v4, :cond_5

    .line 162
    .line 163
    move v2, v3

    .line 164
    goto :goto_2

    .line 165
    :cond_5
    const/4 v2, 0x0

    .line 166
    :goto_2
    if-eqz v2, :cond_7

    .line 167
    .line 168
    iget-object v1, v1, Lba/a;->c:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, Lxg/g;

    .line 171
    .line 172
    invoke-virtual {v1}, Lxg/g;->k()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    iget-object v1, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Lh4/l;

    .line 182
    .line 183
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 184
    .line 185
    invoke-static {v1}, Lh4/l;->a(Lh4/l;)Lh4/l;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iput-object v1, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :catchall_1
    move-exception v0

    .line 193
    move-object v2, v13

    .line 194
    goto/16 :goto_b

    .line 195
    .line 196
    :cond_7
    :goto_3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v1, v12, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, LX3/b;

    .line 202
    .line 203
    iget-object v2, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 204
    .line 205
    move-object v4, v2

    .line 206
    check-cast v4, Lh4/l;

    .line 207
    .line 208
    iput-object v0, v6, Lc4/c;->a:Lc4/h;

    .line 209
    .line 210
    move-object/from16 v2, p1

    .line 211
    .line 212
    iput-object v2, v6, Lc4/c;->b:Lh4/h;

    .line 213
    .line 214
    move-object/from16 v5, p2

    .line 215
    .line 216
    iput-object v5, v6, Lc4/c;->c:Ljava/lang/Object;

    .line 217
    .line 218
    move-object/from16 v14, p4

    .line 219
    .line 220
    iput-object v14, v6, Lc4/c;->d:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v11, v6, Lc4/c;->e:Lkotlin/jvm/internal/G;

    .line 223
    .line 224
    iput-object v12, v6, Lc4/c;->f:Lkotlin/jvm/internal/G;

    .line 225
    .line 226
    iput-object v13, v6, Lc4/c;->g:Lkotlin/jvm/internal/G;

    .line 227
    .line 228
    iput-object v13, v6, Lc4/c;->h:Lkotlin/jvm/internal/G;

    .line 229
    .line 230
    iput v3, v6, Lc4/c;->k:I

    .line 231
    .line 232
    move-object v3, v5

    .line 233
    move-object v5, v14

    .line 234
    invoke-virtual/range {v0 .. v6}, Lc4/h;->c(LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    if-ne v1, v7, :cond_8

    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_8
    move-object/from16 v15, p0

    .line 243
    .line 244
    move-object/from16 v19, p2

    .line 245
    .line 246
    move-object/from16 v21, p4

    .line 247
    .line 248
    move-object/from16 v20, v11

    .line 249
    .line 250
    move-object/from16 v17, v12

    .line 251
    .line 252
    move-object v0, v13

    .line 253
    move-object v2, v0

    .line 254
    move-object/from16 v12, p1

    .line 255
    .line 256
    :goto_4
    :try_start_3
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 257
    .line 258
    iget-object v0, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v1, v0

    .line 261
    check-cast v1, Lb4/e;

    .line 262
    .line 263
    instance-of v3, v1, Lb4/m;

    .line 264
    .line 265
    if-eqz v3, :cond_a

    .line 266
    .line 267
    iget-object v0, v12, Lh4/h;->o:LEf/A;

    .line 268
    .line 269
    new-instance v14, Lc4/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 270
    .line 271
    const/16 v22, 0x0

    .line 272
    .line 273
    move-object/from16 v16, v2

    .line 274
    .line 275
    move-object/from16 v18, v12

    .line 276
    .line 277
    :try_start_4
    invoke-direct/range {v14 .. v22}, Lc4/d;-><init>(Lc4/h;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lh4/h;Ljava/lang/Object;Lkotlin/jvm/internal/G;LX3/c;Ljf/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 278
    .line 279
    .line 280
    move-object/from16 v3, v18

    .line 281
    .line 282
    move-object/from16 v11, v20

    .line 283
    .line 284
    move-object/from16 v5, v21

    .line 285
    .line 286
    :try_start_5
    iput-object v15, v6, Lc4/c;->a:Lc4/h;

    .line 287
    .line 288
    iput-object v3, v6, Lc4/c;->b:Lh4/h;

    .line 289
    .line 290
    iput-object v5, v6, Lc4/c;->c:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v11, v6, Lc4/c;->d:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v2, v6, Lc4/c;->e:Lkotlin/jvm/internal/G;

    .line 295
    .line 296
    iput-object v10, v6, Lc4/c;->f:Lkotlin/jvm/internal/G;

    .line 297
    .line 298
    iput-object v10, v6, Lc4/c;->g:Lkotlin/jvm/internal/G;

    .line 299
    .line 300
    iput-object v10, v6, Lc4/c;->h:Lkotlin/jvm/internal/G;

    .line 301
    .line 302
    iput v9, v6, Lc4/c;->k:I

    .line 303
    .line 304
    invoke-static {v0, v14, v6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    if-ne v1, v7, :cond_9

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_9
    move-object v0, v11

    .line 312
    move-object v4, v15

    .line 313
    :goto_5
    check-cast v1, Lc4/a;

    .line 314
    .line 315
    move-object v11, v0

    .line 316
    move-object v15, v4

    .line 317
    :goto_6
    move-object v12, v3

    .line 318
    goto :goto_7

    .line 319
    :catchall_2
    move-exception v0

    .line 320
    move-object/from16 v2, v16

    .line 321
    .line 322
    goto/16 :goto_b

    .line 323
    .line 324
    :cond_a
    move-object v3, v12

    .line 325
    move-object/from16 v11, v20

    .line 326
    .line 327
    instance-of v1, v1, Lb4/d;

    .line 328
    .line 329
    if-eqz v1, :cond_10

    .line 330
    .line 331
    new-instance v1, Lc4/a;

    .line 332
    .line 333
    move-object v4, v0

    .line 334
    check-cast v4, Lb4/d;

    .line 335
    .line 336
    iget-object v4, v4, Lb4/d;->a:Landroid/graphics/drawable/Drawable;

    .line 337
    .line 338
    move-object v5, v0

    .line 339
    check-cast v5, Lb4/d;

    .line 340
    .line 341
    iget-boolean v5, v5, Lb4/d;->b:Z

    .line 342
    .line 343
    check-cast v0, Lb4/d;

    .line 344
    .line 345
    iget v0, v0, Lb4/d;->c:I

    .line 346
    .line 347
    invoke-direct {v1, v4, v5, v0, v10}, Lc4/a;-><init>(Landroid/graphics/drawable/Drawable;ZILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :goto_7
    iget-object v0, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 352
    .line 353
    instance-of v2, v0, Lb4/m;

    .line 354
    .line 355
    if-eqz v2, :cond_b

    .line 356
    .line 357
    check-cast v0, Lb4/m;

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_b
    move-object v0, v10

    .line 361
    :goto_8
    if-eqz v0, :cond_c

    .line 362
    .line 363
    iget-object v0, v0, Lb4/m;->a:LZ3/k;

    .line 364
    .line 365
    invoke-static {v0}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 366
    .line 367
    .line 368
    :cond_c
    iget-object v0, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Lh4/l;

    .line 371
    .line 372
    iput-object v10, v6, Lc4/c;->a:Lc4/h;

    .line 373
    .line 374
    iput-object v10, v6, Lc4/c;->b:Lh4/h;

    .line 375
    .line 376
    iput-object v10, v6, Lc4/c;->c:Ljava/lang/Object;

    .line 377
    .line 378
    iput-object v10, v6, Lc4/c;->d:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v10, v6, Lc4/c;->e:Lkotlin/jvm/internal/G;

    .line 381
    .line 382
    iput-object v10, v6, Lc4/c;->f:Lkotlin/jvm/internal/G;

    .line 383
    .line 384
    iput-object v10, v6, Lc4/c;->g:Lkotlin/jvm/internal/G;

    .line 385
    .line 386
    iput-object v10, v6, Lc4/c;->h:Lkotlin/jvm/internal/G;

    .line 387
    .line 388
    iput v8, v6, Lc4/c;->k:I

    .line 389
    .line 390
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iget-object v0, v12, Lh4/h;->e:Lff/v;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    if-ne v1, v7, :cond_d

    .line 399
    .line 400
    :goto_9
    return-object v7

    .line 401
    :cond_d
    :goto_a
    check-cast v1, Lc4/a;

    .line 402
    .line 403
    iget-object v0, v1, Lc4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 404
    .line 405
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 406
    .line 407
    if-eqz v2, :cond_e

    .line 408
    .line 409
    move-object v10, v0

    .line 410
    check-cast v10, Landroid/graphics/drawable/BitmapDrawable;

    .line 411
    .line 412
    :cond_e
    if-eqz v10, :cond_f

    .line 413
    .line 414
    invoke-virtual {v10}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    if-eqz v0, :cond_f

    .line 419
    .line 420
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 421
    .line 422
    .line 423
    :cond_f
    return-object v1

    .line 424
    :cond_10
    :try_start_6
    new-instance v0, LE5/Q;

    .line 425
    .line 426
    const/16 v1, 0x9

    .line 427
    .line 428
    const/4 v3, 0x0

    .line 429
    invoke-direct {v0, v3, v1}, LE5/Q;-><init>(BI)V

    .line 430
    .line 431
    .line 432
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 433
    :goto_b
    iget-object v1, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 434
    .line 435
    instance-of v2, v1, Lb4/m;

    .line 436
    .line 437
    if-eqz v2, :cond_11

    .line 438
    .line 439
    move-object v10, v1

    .line 440
    check-cast v10, Lb4/m;

    .line 441
    .line 442
    :cond_11
    if-eqz v10, :cond_12

    .line 443
    .line 444
    iget-object v1, v10, Lb4/m;->a:LZ3/k;

    .line 445
    .line 446
    invoke-static {v1}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 447
    .line 448
    .line 449
    :cond_12
    throw v0
.end method


# virtual methods
.method public final c(LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Lc4/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lc4/e;

    .line 9
    .line 10
    iget v2, v1, Lc4/e;->j:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lc4/e;->j:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lc4/e;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lc4/e;-><init>(Lc4/h;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lc4/e;->h:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v4, v1, Lc4/e;->j:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    iget v4, v1, Lc4/e;->g:I

    .line 43
    .line 44
    iget-object v7, v1, Lc4/e;->f:LX3/c;

    .line 45
    .line 46
    iget-object v8, v1, Lc4/e;->e:Lh4/l;

    .line 47
    .line 48
    iget-object v9, v1, Lc4/e;->d:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v10, v1, Lc4/e;->c:Lh4/h;

    .line 51
    .line 52
    iget-object v11, v1, Lc4/e;->b:LX3/b;

    .line 53
    .line 54
    iget-object v12, v1, Lc4/e;->a:Lc4/h;

    .line 55
    .line 56
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v16, v10

    .line 60
    .line 61
    move-object v10, v1

    .line 62
    move-object/from16 v1, v16

    .line 63
    .line 64
    move-object/from16 v16, v9

    .line 65
    .line 66
    move v9, v4

    .line 67
    move-object/from16 v4, v16

    .line 68
    .line 69
    move-object/from16 v16, v8

    .line 70
    .line 71
    move-object v8, v7

    .line 72
    move-object/from16 v7, v16

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    move-object/from16 v4, p3

    .line 89
    .line 90
    move-object/from16 v7, p4

    .line 91
    .line 92
    move-object/from16 v8, p5

    .line 93
    .line 94
    move v9, v0

    .line 95
    move-object v10, v1

    .line 96
    move-object v12, v2

    .line 97
    move-object/from16 v0, p1

    .line 98
    .line 99
    move-object/from16 v1, p2

    .line 100
    .line 101
    :goto_1
    iget-object v11, v12, Lc4/h;->a:LX3/k;

    .line 102
    .line 103
    iget-object v11, v0, LX3/b;->d:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    :goto_2
    if-ge v9, v13, :cond_4

    .line 110
    .line 111
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v14

    .line 115
    check-cast v14, Lef/k;

    .line 116
    .line 117
    iget-object v15, v14, Lef/k;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v15, Lb4/f;

    .line 120
    .line 121
    iget-object v14, v14, Lef/k;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Ljava/lang/Class;

    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v14, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_3

    .line 134
    .line 135
    const-string v6, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"

    .line 136
    .line 137
    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v15, v4, v7}, Lb4/f;->a(Ljava/lang/Object;Lh4/l;)Lb4/g;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    if-eqz v6, :cond_3

    .line 145
    .line 146
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    new-instance v11, Lef/k;

    .line 151
    .line 152
    invoke-direct {v11, v6, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    const/4 v11, 0x0

    .line 160
    :goto_3
    if-eqz v11, :cond_9

    .line 161
    .line 162
    iget-object v6, v11, Lef/k;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v6, Lb4/g;

    .line 165
    .line 166
    iget-object v9, v11, Lef/k;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v9, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    add-int/2addr v9, v5

    .line 175
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iput-object v12, v10, Lc4/e;->a:Lc4/h;

    .line 179
    .line 180
    iput-object v0, v10, Lc4/e;->b:LX3/b;

    .line 181
    .line 182
    iput-object v1, v10, Lc4/e;->c:Lh4/h;

    .line 183
    .line 184
    iput-object v4, v10, Lc4/e;->d:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v7, v10, Lc4/e;->e:Lh4/l;

    .line 187
    .line 188
    iput-object v8, v10, Lc4/e;->f:LX3/c;

    .line 189
    .line 190
    iput v9, v10, Lc4/e;->g:I

    .line 191
    .line 192
    iput v5, v10, Lc4/e;->j:I

    .line 193
    .line 194
    invoke-interface {v6, v10}, Lb4/g;->a(Ljf/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-ne v6, v3, :cond_5

    .line 199
    .line 200
    return-object v3

    .line 201
    :cond_5
    move-object v11, v0

    .line 202
    move-object v0, v6

    .line 203
    :goto_4
    move-object v6, v0

    .line 204
    check-cast v6, Lb4/e;

    .line 205
    .line 206
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    .line 208
    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    return-object v6

    .line 212
    :cond_6
    move-object v0, v11

    .line 213
    goto :goto_1

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    instance-of v1, v6, Lb4/m;

    .line 216
    .line 217
    if-eqz v1, :cond_7

    .line 218
    .line 219
    check-cast v6, Lb4/m;

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    const/4 v6, 0x0

    .line 223
    :goto_5
    if-eqz v6, :cond_8

    .line 224
    .line 225
    iget-object v1, v6, Lb4/m;->a:LZ3/k;

    .line 226
    .line 227
    invoke-static {v1}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 228
    .line 229
    .line 230
    :cond_8
    throw v0

    .line 231
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v1, "Unable to create a fetcher that supports: "

    .line 234
    .line 235
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v1
.end method

.method public final d(Lc4/j;Llf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    iget-object v2, v1, Lc4/h;->c:La2/c;

    .line 9
    .line 10
    instance-of v3, v0, Lc4/f;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    move-object v3, v0

    .line 15
    check-cast v3, Lc4/f;

    .line 16
    .line 17
    iget v4, v3, Lc4/f;->e:I

    .line 18
    .line 19
    const/high16 v5, -0x80000000

    .line 20
    .line 21
    and-int v6, v4, v5

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    sub-int/2addr v4, v5

    .line 26
    iput v4, v3, Lc4/f;->e:I

    .line 27
    .line 28
    :goto_0
    move-object v10, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v3, Lc4/f;

    .line 31
    .line 32
    invoke-direct {v3, v1, v0}, Lc4/f;-><init>(Lc4/h;Llf/c;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iget-object v0, v10, Lc4/f;->c:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v11, Lkf/a;->a:Lkf/a;

    .line 39
    .line 40
    iget v3, v10, Lc4/f;->e:I

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-ne v3, v9, :cond_1

    .line 45
    .line 46
    iget-object v2, v10, Lc4/f;->b:Lc4/j;

    .line 47
    .line 48
    iget-object v3, v10, Lc4/f;->a:Lc4/h;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object v7, v2

    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    iget-object v0, v7, Lc4/j;->d:Lh4/h;

    .line 70
    .line 71
    iget-object v3, v0, Lh4/h;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v4, v7, Lc4/j;->e:Li4/f;

    .line 74
    .line 75
    sget-object v5, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 76
    .line 77
    iget-object v5, v7, Lc4/j;->f:LX3/c;

    .line 78
    .line 79
    iget-object v6, v1, Lc4/h;->b:Lba/a;

    .line 80
    .line 81
    invoke-virtual {v6, v0, v4}, Lba/a;->H(Lh4/h;Li4/f;)Lh4/l;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget v8, v6, Lh4/l;->d:I

    .line 86
    .line 87
    iget-object v12, v1, Lc4/h;->a:LX3/k;

    .line 88
    .line 89
    iget-object v12, v12, LX3/k;->f:LX3/b;

    .line 90
    .line 91
    iget-object v12, v12, LX3/b;->b:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 97
    const/4 v14, 0x0

    .line 98
    :goto_2
    if-ge v14, v13, :cond_4

    .line 99
    .line 100
    :try_start_2
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    check-cast v15, Lef/k;

    .line 105
    .line 106
    move/from16 v16, v9

    .line 107
    .line 108
    iget-object v9, v15, Lef/k;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v9, Le4/a;

    .line 111
    .line 112
    iget-object v15, v15, Lef/k;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v15, Ljava/lang/Class;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v15, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    const-string v1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"

    .line 127
    .line 128
    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v3, v6}, Le4/a;->a(Ljava/lang/Object;Lh4/l;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    move-object v3, v1

    .line 138
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    move-object/from16 v1, p0

    .line 141
    .line 142
    move/from16 v9, v16

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    move-object v1, v6

    .line 148
    move/from16 v16, v9

    .line 149
    .line 150
    :try_start_3
    invoke-virtual {v2, v0, v3, v1, v5}, La2/c;->H(Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;)Lf4/c;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-eqz v6, :cond_5

    .line 155
    .line 156
    invoke-virtual {v2, v0, v6, v4, v8}, La2/c;->G(Lh4/h;Lf4/c;Li4/f;I)Lf4/d;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_5

    .line 161
    :catchall_2
    move-exception v0

    .line 162
    :goto_3
    move-object/from16 v1, p0

    .line 163
    .line 164
    :goto_4
    move-object v3, v1

    .line 165
    goto :goto_6

    .line 166
    :cond_5
    const/4 v2, 0x0

    .line 167
    :goto_5
    if-eqz v2, :cond_6

    .line 168
    .line 169
    invoke-static {v7, v0, v6, v2}, La2/c;->I(Lc4/j;Lh4/h;Lf4/c;Lf4/d;)Lh4/o;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 173
    return-object v0

    .line 174
    :cond_6
    :try_start_4
    iget-object v9, v0, Lh4/h;->n:LEf/A;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 175
    .line 176
    move-object v2, v0

    .line 177
    :try_start_5
    new-instance v0, Lc4/g;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    move-object v4, v1

    .line 181
    move-object/from16 v1, p0

    .line 182
    .line 183
    :try_start_6
    invoke-direct/range {v0 .. v8}, Lc4/g;-><init>(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Lf4/c;Lc4/j;Ljf/c;)V

    .line 184
    .line 185
    .line 186
    iput-object v1, v10, Lc4/f;->a:Lc4/h;

    .line 187
    .line 188
    iput-object v7, v10, Lc4/f;->b:Lc4/j;

    .line 189
    .line 190
    move/from16 v2, v16

    .line 191
    .line 192
    iput v2, v10, Lc4/f;->e:I

    .line 193
    .line 194
    invoke-static {v9, v0, v10}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 198
    if-ne v0, v11, :cond_7

    .line 199
    .line 200
    return-object v11

    .line 201
    :cond_7
    return-object v0

    .line 202
    :catchall_3
    move-exception v0

    .line 203
    goto :goto_4

    .line 204
    :catchall_4
    move-exception v0

    .line 205
    goto :goto_3

    .line 206
    :goto_6
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 207
    .line 208
    if-nez v2, :cond_8

    .line 209
    .line 210
    iget-object v2, v3, Lc4/h;->b:Lba/a;

    .line 211
    .line 212
    iget-object v2, v7, Lc4/j;->d:Lh4/h;

    .line 213
    .line 214
    invoke-static {v2, v0}, Lba/a;->r(Lh4/h;Ljava/lang/Throwable;)Lh4/d;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :cond_8
    throw v0
.end method
