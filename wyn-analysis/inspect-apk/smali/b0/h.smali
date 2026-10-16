.class public final Lb0/h;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;
.implements Lb0/e;


# instance fields
.field public final b:Lh0/c;

.field public final c:Z

.field public final d:LZ/d;

.field public final e:Lr0/h;

.field public final f:F

.field public final g:Le0/r;


# direct methods
.method public constructor <init>(Lh0/c;LZ/d;Lr0/h;Le0/r;)V
    .locals 2

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    const-string v1, "painter"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lb0/h;->b:Lh0/c;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lb0/h;->c:Z

    .line 15
    .line 16
    iput-object p2, p0, Lb0/h;->d:LZ/d;

    .line 17
    .line 18
    iput-object p3, p0, Lb0/h;->e:Lr0/h;

    .line 19
    .line 20
    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput p1, p0, Lb0/h;->f:F

    .line 23
    .line 24
    iput-object p4, p0, Lb0/h;->g:Le0/r;

    .line 25
    .line 26
    return-void
.end method

.method public static e0(J)Z
    .locals 2

    .line 1
    sget-wide v0, Ld0/f;->c:J

    .line 2
    .line 3
    invoke-static {p0, p1, v0, v1}, Ld0/f;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1}, Ld0/f;->b(J)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static f0(J)Z
    .locals 2

    .line 1
    sget-wide v0, Ld0/f;->c:J

    .line 2
    .line 3
    invoke-static {p0, p1, v0, v1}, Ld0/f;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1}, Ld0/f;->d(J)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method


# virtual methods
.method public final e(Lt0/v;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb0/h;->b:Lh0/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lh0/c;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Lb0/h;->f0(J)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    move-object/from16 v5, p1

    .line 14
    .line 15
    iget-object v10, v5, Lt0/v;->a:Lg0/b;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v3, v10, Lg0/b;->b:Lba/a;

    .line 25
    .line 26
    invoke-virtual {v3}, Lba/a;->y()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-static {v3, v4}, Ld0/f;->d(J)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    :goto_0
    invoke-static {v1, v2}, Lb0/h;->e0(J)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object v1, v10, Lg0/b;->b:Lba/a;

    .line 46
    .line 47
    invoke-virtual {v1}, Lba/a;->y()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_1
    invoke-static {v3, v1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    iget-object v3, v10, Lg0/b;->b:Lba/a;

    .line 60
    .line 61
    invoke-virtual {v3}, Lba/a;->y()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-static {v3, v4}, Ld0/f;->d(J)F

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v4, 0x0

    .line 70
    cmpg-float v3, v3, v4

    .line 71
    .line 72
    iget-object v6, v10, Lg0/b;->b:Lba/a;

    .line 73
    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {v6}, Lba/a;->y()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    invoke-static {v7, v8}, Ld0/f;->b(J)F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    cmpg-float v3, v3, v4

    .line 86
    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    :goto_2
    sget-wide v1, Ld0/f;->b:J

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {v6}, Lba/a;->y()J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    iget-object v7, v0, Lb0/h;->e:Lr0/h;

    .line 97
    .line 98
    invoke-interface {v7, v1, v2, v3, v4}, Lr0/h;->a(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    invoke-static {v1, v2, v3, v4}, La/a;->L(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    :goto_3
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {v3}, Lvf/a;->H(F)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static {v4}, Lvf/a;->H(F)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-static {v3, v4}, LBa/c;->a(II)J

    .line 123
    .line 124
    .line 125
    move-result-wide v12

    .line 126
    invoke-virtual {v6}, Lba/a;->y()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-static {v3, v4}, Ld0/f;->d(J)F

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-static {v3}, Lvf/a;->H(F)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-virtual {v6}, Lba/a;->y()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    invoke-static {v6, v7}, Ld0/f;->b(J)F

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v4}, Lvf/a;->H(F)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-static {v3, v4}, LBa/c;->a(II)J

    .line 151
    .line 152
    .line 153
    move-result-wide v14

    .line 154
    invoke-virtual {v5}, Lt0/v;->getLayoutDirection()LL0/i;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    iget-object v11, v0, Lb0/h;->d:LZ/d;

    .line 159
    .line 160
    invoke-virtual/range {v11 .. v16}, LZ/d;->a(JJLL0/i;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    sget v6, LL0/g;->c:I

    .line 165
    .line 166
    const/16 v6, 0x20

    .line 167
    .line 168
    shr-long v6, v3, v6

    .line 169
    .line 170
    long-to-int v6, v6

    .line 171
    int-to-float v11, v6

    .line 172
    const-wide v6, 0xffffffffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    and-long/2addr v3, v6

    .line 178
    long-to-int v3, v3

    .line 179
    int-to-float v3, v3

    .line 180
    iget-object v4, v10, Lg0/b;->b:Lba/a;

    .line 181
    .line 182
    iget-object v4, v4, Lba/a;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v4, Lad/L;

    .line 185
    .line 186
    invoke-virtual {v4, v11, v3}, Lad/L;->v(FF)V

    .line 187
    .line 188
    .line 189
    iget-object v9, v0, Lb0/h;->g:Le0/r;

    .line 190
    .line 191
    iget-object v4, v0, Lb0/h;->b:Lh0/c;

    .line 192
    .line 193
    iget v8, v0, Lb0/h;->f:F

    .line 194
    .line 195
    move-wide v6, v1

    .line 196
    invoke-virtual/range {v4 .. v9}, Lh0/c;->e(Lg0/d;JFLe0/r;)V

    .line 197
    .line 198
    .line 199
    iget-object v1, v10, Lg0/b;->b:Lba/a;

    .line 200
    .line 201
    iget-object v1, v1, Lba/a;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, Lad/L;

    .line 204
    .line 205
    neg-float v2, v11

    .line 206
    neg-float v3, v3

    .line 207
    invoke-virtual {v1, v2, v3}, Lad/L;->v(FF)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {p1 .. p1}, Lt0/v;->a()V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lb0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lb0/h;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget-object v0, p0, Lb0/h;->b:Lh0/c;

    .line 13
    .line 14
    iget-object v1, p1, Lb0/h;->b:Lh0/c;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-boolean v0, p0, Lb0/h;->c:Z

    .line 23
    .line 24
    iget-boolean v1, p1, Lb0/h;->c:Z

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lb0/h;->d:LZ/d;

    .line 29
    .line 30
    iget-object v1, p1, Lb0/h;->d:LZ/d;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lb0/h;->e:Lr0/h;

    .line 39
    .line 40
    iget-object v1, p1, Lb0/h;->e:Lr0/h;

    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget v0, p0, Lb0/h;->f:F

    .line 49
    .line 50
    iget v1, p1, Lb0/h;->f:F

    .line 51
    .line 52
    cmpg-float v0, v0, v1

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iget-object v0, p0, Lb0/h;->g:Le0/r;

    .line 57
    .line 58
    iget-object p1, p1, Lb0/h;->g:Le0/r;

    .line 59
    .line 60
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 69
    return p1
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/h;->b:Lh0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lb0/h;->c:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/16 v2, 0x4cf

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v2, 0x4d5

    .line 18
    .line 19
    :goto_0
    add-int/2addr v0, v2

    .line 20
    mul-int/2addr v0, v1

    .line 21
    iget-object v2, p0, Lb0/h;->d:LZ/d;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int/2addr v2, v0

    .line 28
    mul-int/2addr v2, v1

    .line 29
    iget-object v0, p0, Lb0/h;->e:Lr0/h;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/2addr v0, v2

    .line 36
    mul-int/2addr v0, v1

    .line 37
    iget v2, p0, Lb0/h;->f:F

    .line 38
    .line 39
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lb0/h;->g:Le0/r;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    add-int/2addr v0, v1

    .line 54
    return v0
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 8

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measurable"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p4}, LL0/a;->c(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p3, p4}, LL0/a;->b(J)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v1

    .line 28
    :goto_0
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-ne v3, v4, :cond_1

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_1
    iget-boolean v2, p0, Lb0/h;->c:Z

    .line 50
    .line 51
    iget-object v3, p0, Lb0/h;->b:Lh0/c;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    sget-wide v6, Ld0/f;->c:J

    .line 60
    .line 61
    cmp-long v4, v4, v6

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    if-nez v0, :cond_b

    .line 67
    .line 68
    :goto_1
    if-eqz v1, :cond_3

    .line 69
    .line 70
    goto/16 :goto_8

    .line 71
    .line 72
    :cond_3
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-static {v0, v1}, Lb0/h;->f0(J)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-static {v4}, Lvf/a;->H(F)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    :goto_2
    invoke-static {v0, v1}, Lb0/h;->e0(J)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :goto_3
    invoke-static {v4, p3, p4}, Lxg/g;->u(IJ)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-static {v0, p3, p4}, Lxg/g;->t(IJ)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    int-to-float v1, v1

    .line 123
    int-to-float v0, v0

    .line 124
    invoke-static {v1, v0}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    if-eqz v2, :cond_a

    .line 129
    .line 130
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    sget-wide v6, Ld0/f;->c:J

    .line 135
    .line 136
    cmp-long v2, v4, v6

    .line 137
    .line 138
    if-eqz v2, :cond_a

    .line 139
    .line 140
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    invoke-static {v4, v5}, Lb0/h;->f0(J)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_6

    .line 149
    .line 150
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    invoke-static {v4, v5}, Ld0/f;->d(J)F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    :goto_4
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    invoke-static {v4, v5}, Lb0/h;->e0(J)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_7

    .line 172
    .line 173
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    goto :goto_5

    .line 178
    :cond_7
    invoke-virtual {v3}, Lh0/c;->f()J

    .line 179
    .line 180
    .line 181
    move-result-wide v3

    .line 182
    invoke-static {v3, v4}, Ld0/f;->b(J)F

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    :goto_5
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 187
    .line 188
    .line 189
    move-result-wide v2

    .line 190
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const/4 v5, 0x0

    .line 195
    cmpg-float v4, v4, v5

    .line 196
    .line 197
    if-nez v4, :cond_8

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_8
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    cmpg-float v4, v4, v5

    .line 205
    .line 206
    if-nez v4, :cond_9

    .line 207
    .line 208
    :goto_6
    sget-wide v0, Ld0/f;->b:J

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_9
    iget-object v4, p0, Lb0/h;->e:Lr0/h;

    .line 212
    .line 213
    invoke-interface {v4, v2, v3, v0, v1}, Lr0/h;->a(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    invoke-static {v2, v3, v0, v1}, La/a;->L(JJ)J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    :cond_a
    :goto_7
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-static {v2, p3, p4}, Lxg/g;->u(IJ)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v0, p3, p4}, Lxg/g;->t(IJ)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-static {v2, v0, p3, p4}, LL0/a;->a(IIJ)J

    .line 246
    .line 247
    .line 248
    move-result-wide p3

    .line 249
    goto :goto_9

    .line 250
    :cond_b
    :goto_8
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    invoke-static {v0, v1, p3, p4}, LL0/a;->a(IIJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide p3

    .line 262
    :goto_9
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    iget p3, p2, Lr0/t;->a:I

    .line 267
    .line 268
    iget p4, p2, Lr0/t;->b:I

    .line 269
    .line 270
    new-instance v0, LE/w;

    .line 271
    .line 272
    const/4 v1, 0x5

    .line 273
    invoke-direct {v0, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {p1, p3, p4, v0}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PainterModifier(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lb0/h;->b:Lh0/c;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sizeToIntrinsics="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lb0/h;->c:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", alignment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lb0/h;->d:LZ/d;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", alpha="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lb0/h;->f:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", colorFilter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lb0/h;->g:Le0/r;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v1, 0x29

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
