.class public final Lu0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LL0/b;

.field public b:Z

.field public final c:Landroid/graphics/Outline;

.field public d:J

.field public e:Le0/E;

.field public f:Le0/f;

.field public g:Le0/x;

.field public h:Z

.field public i:Z

.field public j:Le0/x;

.field public k:Ld0/e;

.field public l:F

.field public m:J

.field public n:J

.field public o:Z

.field public p:LL0/i;

.field public q:Le0/z;


# direct methods
.method public constructor <init>(LL0/b;)V
    .locals 4

    .line 1
    const-string v0, "density"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lu0/c0;->a:LL0/b;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lu0/c0;->b:Z

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Outline;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Outline;-><init>()V

    .line 17
    .line 18
    .line 19
    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lu0/c0;->c:Landroid/graphics/Outline;

    .line 25
    .line 26
    sget-wide v0, Ld0/f;->b:J

    .line 27
    .line 28
    iput-wide v0, p0, Lu0/c0;->d:J

    .line 29
    .line 30
    sget-object p1, Le0/z;->a:Lad/I;

    .line 31
    .line 32
    iput-object p1, p0, Lu0/c0;->e:Le0/E;

    .line 33
    .line 34
    sget-wide v2, Ld0/c;->b:J

    .line 35
    .line 36
    iput-wide v2, p0, Lu0/c0;->m:J

    .line 37
    .line 38
    iput-wide v0, p0, Lu0/c0;->n:J

    .line 39
    .line 40
    sget-object p1, LL0/i;->a:LL0/i;

    .line 41
    .line 42
    iput-object p1, p0, Lu0/c0;->p:LL0/i;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Le0/o;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "canvas"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lu0/c0;->e()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lu0/c0;->g:Le0/x;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, v2}, Le0/o;->l(Le0/x;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v2, v0, Lu0/c0;->l:F

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    cmpl-float v3, v2, v3

    .line 25
    .line 26
    if-lez v3, :cond_4

    .line 27
    .line 28
    iget-object v3, v0, Lu0/c0;->j:Le0/x;

    .line 29
    .line 30
    iget-object v4, v0, Lu0/c0;->k:Ld0/e;

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    iget-wide v5, v0, Lu0/c0;->m:J

    .line 35
    .line 36
    iget-wide v7, v0, Lu0/c0;->n:J

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-static {v4}, Landroid/support/v4/media/session/b;->l0(Ld0/e;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-nez v9, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {v5, v6}, Ld0/c;->b(J)F

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    iget v10, v4, Ld0/e;->a:F

    .line 52
    .line 53
    cmpg-float v9, v10, v9

    .line 54
    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    iget v10, v4, Ld0/e;->b:F

    .line 62
    .line 63
    cmpg-float v9, v10, v9

    .line 64
    .line 65
    if-nez v9, :cond_2

    .line 66
    .line 67
    invoke-static {v5, v6}, Ld0/c;->b(J)F

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-static {v7, v8}, Ld0/f;->d(J)F

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    add-float/2addr v10, v9

    .line 76
    iget v9, v4, Ld0/e;->c:F

    .line 77
    .line 78
    cmpg-float v9, v9, v10

    .line 79
    .line 80
    if-nez v9, :cond_2

    .line 81
    .line 82
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {v7, v8}, Ld0/f;->b(J)F

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    add-float/2addr v6, v5

    .line 91
    iget v5, v4, Ld0/e;->d:F

    .line 92
    .line 93
    cmpg-float v5, v5, v6

    .line 94
    .line 95
    if-nez v5, :cond_2

    .line 96
    .line 97
    iget-wide v4, v4, Ld0/e;->e:J

    .line 98
    .line 99
    invoke-static {v4, v5}, Ld0/a;->b(J)F

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    cmpg-float v2, v4, v2

    .line 104
    .line 105
    if-nez v2, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    :goto_0
    iget-wide v4, v0, Lu0/c0;->m:J

    .line 109
    .line 110
    invoke-static {v4, v5}, Ld0/c;->b(J)F

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-wide v4, v0, Lu0/c0;->m:J

    .line 115
    .line 116
    invoke-static {v4, v5}, Ld0/c;->c(J)F

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    iget-wide v4, v0, Lu0/c0;->m:J

    .line 121
    .line 122
    invoke-static {v4, v5}, Ld0/c;->b(J)F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    iget-wide v4, v0, Lu0/c0;->n:J

    .line 127
    .line 128
    invoke-static {v4, v5}, Ld0/f;->d(J)F

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    add-float v9, v4, v2

    .line 133
    .line 134
    iget-wide v4, v0, Lu0/c0;->m:J

    .line 135
    .line 136
    invoke-static {v4, v5}, Ld0/c;->c(J)F

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget-wide v4, v0, Lu0/c0;->n:J

    .line 141
    .line 142
    invoke-static {v4, v5}, Ld0/f;->b(J)F

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    add-float v10, v4, v2

    .line 147
    .line 148
    iget v2, v0, Lu0/c0;->l:F

    .line 149
    .line 150
    invoke-static {v2, v2}, LFe/g;->a(FF)J

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    invoke-static {v4, v5}, Ld0/a;->b(J)F

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-static {v4, v5}, Ld0/a;->c(J)F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-static {v2, v4}, LFe/g;->a(FF)J

    .line 163
    .line 164
    .line 165
    move-result-wide v11

    .line 166
    new-instance v6, Ld0/e;

    .line 167
    .line 168
    move-wide v13, v11

    .line 169
    move-wide v15, v11

    .line 170
    move-wide/from16 v17, v11

    .line 171
    .line 172
    invoke-direct/range {v6 .. v18}, Ld0/e;-><init>(FFFFJJJJ)V

    .line 173
    .line 174
    .line 175
    if-nez v3, :cond_3

    .line 176
    .line 177
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    goto :goto_1

    .line 182
    :cond_3
    move-object v2, v3

    .line 183
    check-cast v2, Le0/f;

    .line 184
    .line 185
    invoke-virtual {v2}, Le0/f;->c()V

    .line 186
    .line 187
    .line 188
    :goto_1
    move-object v2, v3

    .line 189
    check-cast v2, Le0/f;

    .line 190
    .line 191
    invoke-virtual {v2, v6}, Le0/f;->a(Ld0/e;)V

    .line 192
    .line 193
    .line 194
    iput-object v6, v0, Lu0/c0;->k:Ld0/e;

    .line 195
    .line 196
    iput-object v3, v0, Lu0/c0;->j:Le0/x;

    .line 197
    .line 198
    :goto_2
    invoke-interface {v1, v3}, Le0/o;->l(Le0/x;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_4
    iget-wide v2, v0, Lu0/c0;->m:J

    .line 203
    .line 204
    invoke-static {v2, v3}, Ld0/c;->b(J)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    iget-wide v3, v0, Lu0/c0;->m:J

    .line 209
    .line 210
    invoke-static {v3, v4}, Ld0/c;->c(J)F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    iget-wide v4, v0, Lu0/c0;->m:J

    .line 215
    .line 216
    invoke-static {v4, v5}, Ld0/c;->b(J)F

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    iget-wide v5, v0, Lu0/c0;->n:J

    .line 221
    .line 222
    invoke-static {v5, v6}, Ld0/f;->d(J)F

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    add-float/2addr v4, v5

    .line 227
    iget-wide v5, v0, Lu0/c0;->m:J

    .line 228
    .line 229
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    iget-wide v6, v0, Lu0/c0;->n:J

    .line 234
    .line 235
    invoke-static {v6, v7}, Ld0/f;->b(J)F

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    add-float/2addr v5, v6

    .line 240
    const/4 v6, 0x1

    .line 241
    invoke-interface/range {v1 .. v6}, Le0/o;->e(FFFFI)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public final b()Landroid/graphics/Outline;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu0/c0;->e()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lu0/c0;->o:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lu0/c0;->b:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lu0/c0;->c:Landroid/graphics/Outline;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final c(J)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lu0/c0;->o:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    :goto_0
    const/16 v16, 0x1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v1, v0, Lu0/c0;->q:Le0/z;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-static/range {p1 .. p2}, Ld0/c;->b(J)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static/range {p1 .. p2}, Ld0/c;->c(J)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    instance-of v5, v1, Le0/v;

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    check-cast v1, Le0/v;

    .line 29
    .line 30
    iget-object v1, v1, Le0/v;->e:Ld0/d;

    .line 31
    .line 32
    iget v5, v1, Ld0/d;->a:F

    .line 33
    .line 34
    cmpg-float v5, v5, v3

    .line 35
    .line 36
    if-gtz v5, :cond_e

    .line 37
    .line 38
    iget v5, v1, Ld0/d;->c:F

    .line 39
    .line 40
    cmpg-float v3, v3, v5

    .line 41
    .line 42
    if-gez v3, :cond_e

    .line 43
    .line 44
    iget v3, v1, Ld0/d;->b:F

    .line 45
    .line 46
    cmpg-float v3, v3, v4

    .line 47
    .line 48
    if-gtz v3, :cond_e

    .line 49
    .line 50
    iget v1, v1, Ld0/d;->d:F

    .line 51
    .line 52
    cmpg-float v1, v4, v1

    .line 53
    .line 54
    if-gez v1, :cond_e

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    instance-of v5, v1, Le0/w;

    .line 58
    .line 59
    if-eqz v5, :cond_f

    .line 60
    .line 61
    check-cast v1, Le0/w;

    .line 62
    .line 63
    iget-object v1, v1, Le0/w;->e:Ld0/e;

    .line 64
    .line 65
    iget v5, v1, Ld0/e;->a:F

    .line 66
    .line 67
    cmpg-float v6, v3, v5

    .line 68
    .line 69
    if-ltz v6, :cond_e

    .line 70
    .line 71
    iget v6, v1, Ld0/e;->c:F

    .line 72
    .line 73
    cmpl-float v7, v3, v6

    .line 74
    .line 75
    if-gez v7, :cond_e

    .line 76
    .line 77
    iget v7, v1, Ld0/e;->b:F

    .line 78
    .line 79
    cmpg-float v8, v4, v7

    .line 80
    .line 81
    if-ltz v8, :cond_e

    .line 82
    .line 83
    iget v8, v1, Ld0/e;->d:F

    .line 84
    .line 85
    cmpl-float v9, v4, v8

    .line 86
    .line 87
    if-ltz v9, :cond_3

    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_3
    iget-wide v9, v1, Ld0/e;->e:J

    .line 92
    .line 93
    invoke-static {v9, v10}, Ld0/a;->b(J)F

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    iget-wide v12, v1, Ld0/e;->f:J

    .line 98
    .line 99
    invoke-static {v12, v13}, Ld0/a;->b(J)F

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    add-float/2addr v14, v11

    .line 104
    invoke-virtual {v1}, Ld0/e;->b()F

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    cmpg-float v11, v14, v11

    .line 109
    .line 110
    if-gtz v11, :cond_9

    .line 111
    .line 112
    iget-wide v14, v1, Ld0/e;->h:J

    .line 113
    .line 114
    invoke-static {v14, v15}, Ld0/a;->b(J)F

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    move/from16 v17, v3

    .line 119
    .line 120
    const/16 v16, 0x1

    .line 121
    .line 122
    iget-wide v2, v1, Ld0/e;->g:J

    .line 123
    .line 124
    invoke-static {v2, v3}, Ld0/a;->b(J)F

    .line 125
    .line 126
    .line 127
    move-result v18

    .line 128
    add-float v18, v18, v11

    .line 129
    .line 130
    invoke-virtual {v1}, Ld0/e;->b()F

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    cmpg-float v11, v18, v11

    .line 135
    .line 136
    if-gtz v11, :cond_8

    .line 137
    .line 138
    invoke-static {v9, v10}, Ld0/a;->c(J)F

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    invoke-static {v14, v15}, Ld0/a;->c(J)F

    .line 143
    .line 144
    .line 145
    move-result v18

    .line 146
    add-float v18, v18, v11

    .line 147
    .line 148
    invoke-virtual {v1}, Ld0/e;->a()F

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    cmpg-float v11, v18, v11

    .line 153
    .line 154
    if-gtz v11, :cond_8

    .line 155
    .line 156
    invoke-static {v12, v13}, Ld0/a;->c(J)F

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    invoke-static {v2, v3}, Ld0/a;->c(J)F

    .line 161
    .line 162
    .line 163
    move-result v18

    .line 164
    add-float v18, v18, v11

    .line 165
    .line 166
    invoke-virtual {v1}, Ld0/e;->a()F

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    cmpg-float v11, v18, v11

    .line 171
    .line 172
    if-gtz v11, :cond_8

    .line 173
    .line 174
    invoke-static {v9, v10}, Ld0/a;->b(J)F

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    add-float/2addr v11, v5

    .line 179
    invoke-static {v9, v10}, Ld0/a;->c(J)F

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    add-float/2addr v9, v7

    .line 184
    invoke-static {v12, v13}, Ld0/a;->b(J)F

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    sub-float v10, v6, v10

    .line 189
    .line 190
    invoke-static {v12, v13}, Ld0/a;->c(J)F

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    add-float/2addr v12, v7

    .line 195
    invoke-static {v2, v3}, Ld0/a;->b(J)F

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    sub-float v7, v6, v7

    .line 200
    .line 201
    invoke-static {v2, v3}, Ld0/a;->c(J)F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    sub-float v2, v8, v2

    .line 206
    .line 207
    invoke-static {v14, v15}, Ld0/a;->c(J)F

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    sub-float/2addr v8, v3

    .line 212
    invoke-static {v14, v15}, Ld0/a;->b(J)F

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    add-float/2addr v3, v5

    .line 217
    cmpg-float v5, v17, v11

    .line 218
    .line 219
    if-gez v5, :cond_4

    .line 220
    .line 221
    cmpg-float v5, v4, v9

    .line 222
    .line 223
    if-gez v5, :cond_4

    .line 224
    .line 225
    iget-wide v5, v1, Ld0/e;->e:J

    .line 226
    .line 227
    move v8, v9

    .line 228
    move v7, v11

    .line 229
    move/from16 v3, v17

    .line 230
    .line 231
    invoke-static/range {v3 .. v8}, Lu0/Q;->i(FFJFF)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    return v1

    .line 236
    :cond_4
    cmpg-float v5, v17, v3

    .line 237
    .line 238
    if-gez v5, :cond_5

    .line 239
    .line 240
    cmpl-float v5, v4, v8

    .line 241
    .line 242
    if-lez v5, :cond_5

    .line 243
    .line 244
    iget-wide v5, v1, Ld0/e;->h:J

    .line 245
    .line 246
    move v7, v3

    .line 247
    move/from16 v3, v17

    .line 248
    .line 249
    invoke-static/range {v3 .. v8}, Lu0/Q;->i(FFJFF)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    return v1

    .line 254
    :cond_5
    move/from16 v3, v17

    .line 255
    .line 256
    cmpl-float v5, v3, v10

    .line 257
    .line 258
    if-lez v5, :cond_6

    .line 259
    .line 260
    cmpg-float v5, v4, v12

    .line 261
    .line 262
    if-gez v5, :cond_6

    .line 263
    .line 264
    iget-wide v5, v1, Ld0/e;->f:J

    .line 265
    .line 266
    move v7, v10

    .line 267
    move v8, v12

    .line 268
    invoke-static/range {v3 .. v8}, Lu0/Q;->i(FFJFF)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    return v1

    .line 273
    :cond_6
    cmpl-float v5, v3, v7

    .line 274
    .line 275
    if-lez v5, :cond_7

    .line 276
    .line 277
    cmpl-float v5, v4, v2

    .line 278
    .line 279
    if-lez v5, :cond_7

    .line 280
    .line 281
    iget-wide v5, v1, Ld0/e;->g:J

    .line 282
    .line 283
    move v8, v2

    .line 284
    invoke-static/range {v3 .. v8}, Lu0/Q;->i(FFJFF)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    return v1

    .line 289
    :cond_7
    :goto_1
    return v16

    .line 290
    :cond_8
    move/from16 v3, v17

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_9
    const/16 v16, 0x1

    .line 294
    .line 295
    :goto_2
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v2, v1}, Le0/f;->a(Ld0/e;)V

    .line 300
    .line 301
    .line 302
    const v1, 0x3ba3d70a    # 0.005f

    .line 303
    .line 304
    .line 305
    sub-float v5, v3, v1

    .line 306
    .line 307
    sub-float v6, v4, v1

    .line 308
    .line 309
    add-float/2addr v3, v1

    .line 310
    add-float/2addr v4, v1

    .line 311
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-nez v7, :cond_d

    .line 320
    .line 321
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    if-nez v7, :cond_c

    .line 326
    .line 327
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-nez v7, :cond_b

    .line 332
    .line 333
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-nez v7, :cond_a

    .line 338
    .line 339
    iget-object v7, v1, Le0/f;->b:Landroid/graphics/RectF;

    .line 340
    .line 341
    new-instance v8, Landroid/graphics/RectF;

    .line 342
    .line 343
    invoke-direct {v8, v5, v6, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7, v8}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 347
    .line 348
    .line 349
    sget-object v3, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 350
    .line 351
    iget-object v4, v1, Le0/f;->a:Landroid/graphics/Path;

    .line 352
    .line 353
    invoke-virtual {v4, v7, v3}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 354
    .line 355
    .line 356
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    move/from16 v4, v16

    .line 361
    .line 362
    invoke-virtual {v3, v2, v1, v4}, Le0/f;->b(Le0/x;Le0/x;I)Z

    .line 363
    .line 364
    .line 365
    iget-object v2, v3, Le0/f;->a:Landroid/graphics/Path;

    .line 366
    .line 367
    invoke-virtual {v2}, Landroid/graphics/Path;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    invoke-virtual {v3}, Le0/f;->c()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Le0/f;->c()V

    .line 375
    .line 376
    .line 377
    xor-int/lit8 v1, v2, 0x1

    .line 378
    .line 379
    return v1

    .line 380
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 381
    .line 382
    const-string v2, "Rect.bottom is NaN"

    .line 383
    .line 384
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v1

    .line 388
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 389
    .line 390
    const-string v2, "Rect.right is NaN"

    .line 391
    .line 392
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v1

    .line 396
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    const-string v2, "Rect.top is NaN"

    .line 399
    .line 400
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v1

    .line 404
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 405
    .line 406
    const-string v2, "Rect.left is NaN"

    .line 407
    .line 408
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_e
    :goto_3
    const/4 v1, 0x0

    .line 413
    return v1

    .line 414
    :cond_f
    new-instance v1, LE5/Q;

    .line 415
    .line 416
    const/16 v2, 0x9

    .line 417
    .line 418
    const/4 v3, 0x0

    .line 419
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 420
    .line 421
    .line 422
    throw v1
.end method

.method public final d(Le0/E;FZFLL0/i;LL0/b;)Z
    .locals 2

    .line 1
    const-string v0, "shape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "layoutDirection"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "density"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lu0/c0;->c:Landroid/graphics/Outline;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lu0/c0;->e:Le0/E;

    .line 22
    .line 23
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    xor-int/lit8 v0, p2, 0x1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    iput-object p1, p0, Lu0/c0;->e:Le0/E;

    .line 33
    .line 34
    iput-boolean v1, p0, Lu0/c0;->h:Z

    .line 35
    .line 36
    :cond_0
    if-nez p3, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    cmpl-float p1, p4, p1

    .line 40
    .line 41
    if-lez p1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    move p1, v1

    .line 47
    :goto_1
    iget-boolean p2, p0, Lu0/c0;->o:Z

    .line 48
    .line 49
    if-eq p2, p1, :cond_3

    .line 50
    .line 51
    iput-boolean p1, p0, Lu0/c0;->o:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lu0/c0;->h:Z

    .line 54
    .line 55
    :cond_3
    iget-object p1, p0, Lu0/c0;->p:LL0/i;

    .line 56
    .line 57
    if-eq p1, p5, :cond_4

    .line 58
    .line 59
    iput-object p5, p0, Lu0/c0;->p:LL0/i;

    .line 60
    .line 61
    iput-boolean v1, p0, Lu0/c0;->h:Z

    .line 62
    .line 63
    :cond_4
    iget-object p1, p0, Lu0/c0;->a:LL0/b;

    .line 64
    .line 65
    invoke-static {p1, p6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_5

    .line 70
    .line 71
    iput-object p6, p0, Lu0/c0;->a:LL0/b;

    .line 72
    .line 73
    iput-boolean v1, p0, Lu0/c0;->h:Z

    .line 74
    .line 75
    :cond_5
    return v0
.end method

.method public final e()V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lu0/c0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    sget-wide v0, Ld0/c;->b:J

    .line 6
    .line 7
    iput-wide v0, p0, Lu0/c0;->m:J

    .line 8
    .line 9
    iget-wide v0, p0, Lu0/c0;->d:J

    .line 10
    .line 11
    iput-wide v0, p0, Lu0/c0;->n:J

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput v2, p0, Lu0/c0;->l:F

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-object v3, p0, Lu0/c0;->g:Le0/x;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iput-boolean v3, p0, Lu0/c0;->h:Z

    .line 21
    .line 22
    iput-boolean v3, p0, Lu0/c0;->i:Z

    .line 23
    .line 24
    iget-boolean v4, p0, Lu0/c0;->o:Z

    .line 25
    .line 26
    iget-object v5, p0, Lu0/c0;->c:Landroid/graphics/Outline;

    .line 27
    .line 28
    if-eqz v4, :cond_5

    .line 29
    .line 30
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    cmpl-float v0, v0, v2

    .line 35
    .line 36
    if-lez v0, :cond_5

    .line 37
    .line 38
    iget-wide v0, p0, Lu0/c0;->d:J

    .line 39
    .line 40
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    cmpl-float v0, v0, v2

    .line 45
    .line 46
    if-lez v0, :cond_5

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lu0/c0;->b:Z

    .line 50
    .line 51
    iget-object v1, p0, Lu0/c0;->e:Le0/E;

    .line 52
    .line 53
    iget-wide v6, p0, Lu0/c0;->d:J

    .line 54
    .line 55
    iget-object v2, p0, Lu0/c0;->p:LL0/i;

    .line 56
    .line 57
    iget-object v4, p0, Lu0/c0;->a:LL0/b;

    .line 58
    .line 59
    invoke-interface {v1, v6, v7, v2, v4}, Le0/E;->b(JLL0/i;LL0/b;)Le0/z;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Lu0/c0;->q:Le0/z;

    .line 64
    .line 65
    instance-of v2, v1, Le0/v;

    .line 66
    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    check-cast v1, Le0/v;

    .line 70
    .line 71
    iget-object v0, v1, Le0/v;->e:Ld0/d;

    .line 72
    .line 73
    iget v1, v0, Ld0/d;->a:F

    .line 74
    .line 75
    iget v2, v0, Ld0/d;->b:F

    .line 76
    .line 77
    invoke-static {v1, v2}, LU8/v0;->f(FF)J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    iput-wide v3, p0, Lu0/c0;->m:J

    .line 82
    .line 83
    invoke-virtual {v0}, Ld0/d;->c()F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v0}, Ld0/d;->b()F

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-static {v3, v4}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    iput-wide v3, p0, Lu0/c0;->n:J

    .line 96
    .line 97
    invoke-static {v1}, Lvf/a;->H(F)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iget v3, v0, Ld0/d;->c:F

    .line 106
    .line 107
    invoke-static {v3}, Lvf/a;->H(F)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iget v0, v0, Ld0/d;->d:F

    .line 112
    .line 113
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {v5, v1, v2, v3, v0}, Landroid/graphics/Outline;->setRect(IIII)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_0
    instance-of v2, v1, Le0/w;

    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    check-cast v1, Le0/w;

    .line 126
    .line 127
    iget-object v1, v1, Le0/w;->e:Ld0/e;

    .line 128
    .line 129
    iget-wide v6, v1, Ld0/e;->e:J

    .line 130
    .line 131
    invoke-static {v6, v7}, Ld0/a;->b(J)F

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    iget v2, v1, Ld0/e;->a:F

    .line 136
    .line 137
    iget v4, v1, Ld0/e;->b:F

    .line 138
    .line 139
    invoke-static {v2, v4}, LU8/v0;->f(FF)J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    iput-wide v6, p0, Lu0/c0;->m:J

    .line 144
    .line 145
    invoke-virtual {v1}, Ld0/e;->b()F

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-virtual {v1}, Ld0/e;->a()F

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-static {v6, v7}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    iput-wide v6, p0, Lu0/c0;->n:J

    .line 158
    .line 159
    invoke-static {v1}, Landroid/support/v4/media/session/b;->l0(Ld0/e;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_1

    .line 164
    .line 165
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    invoke-static {v4}, Lvf/a;->H(F)I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    iget v0, v1, Ld0/e;->c:F

    .line 174
    .line 175
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    iget v0, v1, Ld0/e;->d:F

    .line 180
    .line 181
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    iget-object v8, p0, Lu0/c0;->c:Landroid/graphics/Outline;

    .line 186
    .line 187
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 188
    .line 189
    .line 190
    iput v13, p0, Lu0/c0;->l:F

    .line 191
    .line 192
    return-void

    .line 193
    :cond_1
    iget-object v2, p0, Lu0/c0;->f:Le0/f;

    .line 194
    .line 195
    if-nez v2, :cond_2

    .line 196
    .line 197
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iput-object v2, p0, Lu0/c0;->f:Le0/f;

    .line 202
    .line 203
    :cond_2
    invoke-virtual {v2}, Le0/f;->c()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Le0/f;->a(Ld0/e;)V

    .line 207
    .line 208
    .line 209
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 210
    .line 211
    const/16 v4, 0x1c

    .line 212
    .line 213
    iget-object v6, v2, Le0/f;->a:Landroid/graphics/Path;

    .line 214
    .line 215
    if-gt v1, v4, :cond_4

    .line 216
    .line 217
    invoke-virtual {v6}, Landroid/graphics/Path;->isConvex()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_3

    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_3
    iput-boolean v3, p0, Lu0/c0;->b:Z

    .line 225
    .line 226
    invoke-virtual {v5}, Landroid/graphics/Outline;->setEmpty()V

    .line 227
    .line 228
    .line 229
    iput-boolean v0, p0, Lu0/c0;->i:Z

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_4
    :goto_0
    invoke-virtual {v5, v6}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Landroid/graphics/Outline;->canClip()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    xor-int/2addr v0, v1

    .line 240
    iput-boolean v0, p0, Lu0/c0;->i:Z

    .line 241
    .line 242
    :goto_1
    iput-object v2, p0, Lu0/c0;->g:Le0/x;

    .line 243
    .line 244
    return-void

    .line 245
    :cond_5
    invoke-virtual {v5}, Landroid/graphics/Outline;->setEmpty()V

    .line 246
    .line 247
    .line 248
    :cond_6
    return-void
.end method
