.class public abstract LR0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR0/h;->a:LR0/b;

    .line 7
    .line 8
    return-void
.end method

.method public static a(LQ0/d;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget v0, v0, v3

    .line 8
    .line 9
    iget-object v4, p0, LQ0/d;->T:LQ0/d;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    check-cast v4, LQ0/e;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v5, v4, LQ0/d;->p0:[I

    .line 20
    .line 21
    aget v5, v5, v1

    .line 22
    .line 23
    :cond_1
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, LQ0/d;->p0:[I

    .line 26
    .line 27
    aget v4, v4, v3

    .line 28
    .line 29
    :cond_2
    const/4 v4, 0x3

    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eq v2, v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0}, LQ0/d;->A()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_5

    .line 41
    .line 42
    if-ne v2, v4, :cond_3

    .line 43
    .line 44
    iget v7, p0, LQ0/d;->r:I

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    iget v7, p0, LQ0/d;->W:F

    .line 49
    .line 50
    cmpl-float v7, v7, v6

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v1}, LQ0/d;->t(I)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_5

    .line 59
    .line 60
    :cond_3
    if-ne v2, v4, :cond_4

    .line 61
    .line 62
    iget v2, p0, LQ0/d;->r:I

    .line 63
    .line 64
    if-ne v2, v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, LQ0/d;->q()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0, v1, v2}, LQ0/d;->u(II)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v2, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    :goto_1
    move v2, v3

    .line 80
    :goto_2
    if-eq v0, v3, :cond_8

    .line 81
    .line 82
    invoke-virtual {p0}, LQ0/d;->B()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_8

    .line 87
    .line 88
    if-eq v0, v5, :cond_8

    .line 89
    .line 90
    if-ne v0, v4, :cond_6

    .line 91
    .line 92
    iget v5, p0, LQ0/d;->s:I

    .line 93
    .line 94
    if-nez v5, :cond_6

    .line 95
    .line 96
    iget v5, p0, LQ0/d;->W:F

    .line 97
    .line 98
    cmpl-float v5, v5, v6

    .line 99
    .line 100
    if-nez v5, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0, v3}, LQ0/d;->t(I)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_8

    .line 107
    .line 108
    :cond_6
    if-ne v0, v4, :cond_7

    .line 109
    .line 110
    iget v0, p0, LQ0/d;->s:I

    .line 111
    .line 112
    if-ne v0, v3, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0}, LQ0/d;->k()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0, v3, v0}, LQ0/d;->u(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move v0, v1

    .line 126
    goto :goto_4

    .line 127
    :cond_8
    :goto_3
    move v0, v3

    .line 128
    :goto_4
    iget p0, p0, LQ0/d;->W:F

    .line 129
    .line 130
    cmpl-float p0, p0, v6

    .line 131
    .line 132
    if-lez p0, :cond_9

    .line 133
    .line 134
    if-nez v2, :cond_a

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    if-eqz v2, :cond_b

    .line 140
    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    :cond_a
    :goto_5
    return v3

    .line 144
    :cond_b
    return v1
.end method

.method public static b(LQ0/d;ILjava/util/ArrayList;LR0/n;)LR0/n;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, LQ0/d;->n0:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, LQ0/d;->o0:I

    .line 7
    .line 8
    :goto_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v0, v2, :cond_4

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    iget v3, p3, LR0/n;->b:I

    .line 15
    .line 16
    if-eq v0, v3, :cond_4

    .line 17
    .line 18
    :cond_1
    move v3, v1

    .line 19
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v3, v4, :cond_5

    .line 24
    .line 25
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, LR0/n;

    .line 30
    .line 31
    iget v5, v4, LR0/n;->b:I

    .line 32
    .line 33
    if-ne v5, v0, :cond_3

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p3, p1, v4}, LR0/n;->c(ILR0/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    move-object p3, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    if-eq v0, v2, :cond_5

    .line 49
    .line 50
    return-object p3

    .line 51
    :cond_5
    :goto_2
    const/4 v0, 0x1

    .line 52
    if-nez p3, :cond_c

    .line 53
    .line 54
    instance-of v3, p0, LQ0/i;

    .line 55
    .line 56
    if-eqz v3, :cond_a

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    check-cast v3, LQ0/i;

    .line 60
    .line 61
    move v4, v1

    .line 62
    :goto_3
    iget v5, v3, LQ0/i;->r0:I

    .line 63
    .line 64
    if-ge v4, v5, :cond_8

    .line 65
    .line 66
    iget-object v5, v3, LQ0/i;->q0:[LQ0/d;

    .line 67
    .line 68
    aget-object v5, v5, v4

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    iget v6, v5, LQ0/d;->n0:I

    .line 73
    .line 74
    if-eq v6, v2, :cond_6

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_6
    if-ne p1, v0, :cond_7

    .line 78
    .line 79
    iget v6, v5, LQ0/d;->o0:I

    .line 80
    .line 81
    if-eq v6, v2, :cond_7

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_8
    move v6, v2

    .line 88
    :goto_4
    if-eq v6, v2, :cond_a

    .line 89
    .line 90
    move v3, v1

    .line 91
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ge v3, v4, :cond_a

    .line 96
    .line 97
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, LR0/n;

    .line 102
    .line 103
    iget v5, v4, LR0/n;->b:I

    .line 104
    .line 105
    if-ne v5, v6, :cond_9

    .line 106
    .line 107
    move-object p3, v4

    .line 108
    goto :goto_6

    .line 109
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_a
    :goto_6
    if-nez p3, :cond_b

    .line 113
    .line 114
    new-instance p3, LR0/n;

    .line 115
    .line 116
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v3, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v3, p3, LR0/n;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    iput-object v3, p3, LR0/n;->d:Ljava/util/ArrayList;

    .line 128
    .line 129
    iput v2, p3, LR0/n;->e:I

    .line 130
    .line 131
    sget v2, LR0/n;->f:I

    .line 132
    .line 133
    add-int/lit8 v3, v2, 0x1

    .line 134
    .line 135
    sput v3, LR0/n;->f:I

    .line 136
    .line 137
    iput v2, p3, LR0/n;->b:I

    .line 138
    .line 139
    iput p1, p3, LR0/n;->c:I

    .line 140
    .line 141
    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_c
    iget-object v2, p3, LR0/n;->a:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_d

    .line 151
    .line 152
    return-object p3

    .line 153
    :cond_d
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    instance-of v2, p0, LQ0/h;

    .line 157
    .line 158
    if-eqz v2, :cond_f

    .line 159
    .line 160
    move-object v2, p0

    .line 161
    check-cast v2, LQ0/h;

    .line 162
    .line 163
    iget-object v3, v2, LQ0/h;->t0:LQ0/c;

    .line 164
    .line 165
    iget v2, v2, LQ0/h;->u0:I

    .line 166
    .line 167
    if-nez v2, :cond_e

    .line 168
    .line 169
    move v1, v0

    .line 170
    :cond_e
    invoke-virtual {v3, v1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    :cond_f
    iget v0, p3, LR0/n;->b:I

    .line 174
    .line 175
    if-nez p1, :cond_10

    .line 176
    .line 177
    iput v0, p0, LQ0/d;->n0:I

    .line 178
    .line 179
    iget-object v0, p0, LQ0/d;->I:LQ0/c;

    .line 180
    .line 181
    invoke-virtual {v0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, LQ0/d;->K:LQ0/c;

    .line 185
    .line 186
    invoke-virtual {v0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_10
    iput v0, p0, LQ0/d;->o0:I

    .line 191
    .line 192
    iget-object v0, p0, LQ0/d;->J:LQ0/c;

    .line 193
    .line 194
    invoke-virtual {v0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, LQ0/d;->M:LQ0/c;

    .line 198
    .line 199
    invoke-virtual {v0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, LQ0/d;->L:LQ0/c;

    .line 203
    .line 204
    invoke-virtual {v0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 205
    .line 206
    .line 207
    :goto_7
    iget-object p0, p0, LQ0/d;->P:LQ0/c;

    .line 208
    .line 209
    invoke-virtual {p0, p1, p3, p2}, LQ0/c;->c(ILR0/n;Ljava/util/ArrayList;)V

    .line 210
    .line 211
    .line 212
    return-object p3
.end method

.method public static c(ILQ0/d;LT0/e;Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-boolean v3, v0, LQ0/d;->m:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    instance-of v3, v0, LQ0/e;

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, LQ0/d;->z()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, LR0/h;->a(LQ0/d;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    new-instance v3, LR0/b;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v3}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v3, 0x2

    .line 37
    invoke-virtual {v0, v3}, LQ0/d;->i(I)LQ0/c;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x4

    .line 42
    invoke-virtual {v0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3}, LQ0/c;->d()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v4}, LQ0/c;->d()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-object v7, v3, LQ0/c;->a:Ljava/util/HashSet;

    .line 55
    .line 56
    const/4 v12, 0x3

    .line 57
    if-eqz v7, :cond_d

    .line 58
    .line 59
    iget-boolean v3, v3, LQ0/c;->c:Z

    .line 60
    .line 61
    if-eqz v3, :cond_d

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_d

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, LQ0/c;

    .line 78
    .line 79
    iget-object v13, v7, LQ0/c;->d:LQ0/d;

    .line 80
    .line 81
    add-int/lit8 v14, p0, 0x1

    .line 82
    .line 83
    invoke-static {v13}, LR0/h;->a(LQ0/d;)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    invoke-virtual {v13}, LQ0/d;->z()Z

    .line 88
    .line 89
    .line 90
    move-result v16

    .line 91
    if-eqz v16, :cond_3

    .line 92
    .line 93
    if-eqz v15, :cond_3

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    new-instance v9, LR0/b;

    .line 98
    .line 99
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-static {v13, v1, v9}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/16 v16, 0x0

    .line 107
    .line 108
    :goto_1
    iget-object v9, v13, LQ0/d;->I:LQ0/c;

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    iget-object v10, v13, LQ0/d;->K:LQ0/c;

    .line 113
    .line 114
    const/16 v18, 0x1

    .line 115
    .line 116
    if-ne v7, v9, :cond_4

    .line 117
    .line 118
    iget-object v8, v10, LQ0/c;->f:LQ0/c;

    .line 119
    .line 120
    if-eqz v8, :cond_4

    .line 121
    .line 122
    iget-boolean v8, v8, LQ0/c;->c:Z

    .line 123
    .line 124
    if-nez v8, :cond_5

    .line 125
    .line 126
    :cond_4
    if-ne v7, v10, :cond_6

    .line 127
    .line 128
    iget-object v8, v9, LQ0/c;->f:LQ0/c;

    .line 129
    .line 130
    if-eqz v8, :cond_6

    .line 131
    .line 132
    iget-boolean v8, v8, LQ0/c;->c:Z

    .line 133
    .line 134
    if-eqz v8, :cond_6

    .line 135
    .line 136
    :cond_5
    move/from16 v8, v18

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move/from16 v8, v16

    .line 140
    .line 141
    :goto_2
    iget-object v11, v13, LQ0/d;->p0:[I

    .line 142
    .line 143
    aget v11, v11, v16

    .line 144
    .line 145
    if-ne v11, v12, :cond_9

    .line 146
    .line 147
    if-eqz v15, :cond_7

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    if-ne v11, v12, :cond_2

    .line 151
    .line 152
    iget v7, v13, LQ0/d;->v:I

    .line 153
    .line 154
    if-ltz v7, :cond_2

    .line 155
    .line 156
    iget v7, v13, LQ0/d;->u:I

    .line 157
    .line 158
    if-ltz v7, :cond_2

    .line 159
    .line 160
    iget v7, v13, LQ0/d;->g0:I

    .line 161
    .line 162
    const/16 v9, 0x8

    .line 163
    .line 164
    if-eq v7, v9, :cond_8

    .line 165
    .line 166
    iget v7, v13, LQ0/d;->r:I

    .line 167
    .line 168
    if-nez v7, :cond_2

    .line 169
    .line 170
    iget v7, v13, LQ0/d;->W:F

    .line 171
    .line 172
    cmpl-float v7, v7, v17

    .line 173
    .line 174
    if-nez v7, :cond_2

    .line 175
    .line 176
    :cond_8
    invoke-virtual {v13}, LQ0/d;->x()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-nez v7, :cond_2

    .line 181
    .line 182
    iget-boolean v7, v13, LQ0/d;->F:Z

    .line 183
    .line 184
    if-nez v7, :cond_2

    .line 185
    .line 186
    if-eqz v8, :cond_2

    .line 187
    .line 188
    invoke-virtual {v13}, LQ0/d;->x()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-nez v7, :cond_2

    .line 193
    .line 194
    invoke-static {v14, v0, v1, v13, v2}, LR0/h;->e(ILQ0/d;LT0/e;LQ0/d;Z)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_9
    :goto_3
    invoke-virtual {v13}, LQ0/d;->z()Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-eqz v11, :cond_a

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_a
    if-ne v7, v9, :cond_b

    .line 208
    .line 209
    iget-object v11, v10, LQ0/c;->f:LQ0/c;

    .line 210
    .line 211
    if-nez v11, :cond_b

    .line 212
    .line 213
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    add-int/2addr v7, v5

    .line 218
    invoke-virtual {v13}, LQ0/d;->q()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    add-int/2addr v8, v7

    .line 223
    invoke-virtual {v13, v7, v8}, LQ0/d;->J(II)V

    .line 224
    .line 225
    .line 226
    invoke-static {v14, v13, v1, v2}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_b
    if-ne v7, v10, :cond_c

    .line 232
    .line 233
    iget-object v7, v9, LQ0/c;->f:LQ0/c;

    .line 234
    .line 235
    if-nez v7, :cond_c

    .line 236
    .line 237
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    sub-int v7, v5, v7

    .line 242
    .line 243
    invoke-virtual {v13}, LQ0/d;->q()I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    sub-int v8, v7, v8

    .line 248
    .line 249
    invoke-virtual {v13, v8, v7}, LQ0/d;->J(II)V

    .line 250
    .line 251
    .line 252
    invoke-static {v14, v13, v1, v2}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_c
    if-eqz v8, :cond_2

    .line 258
    .line 259
    invoke-virtual {v13}, LQ0/d;->x()Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-nez v7, :cond_2

    .line 264
    .line 265
    invoke-static {v14, v13, v1, v2}, LR0/h;->d(ILQ0/d;LT0/e;Z)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_d
    const/16 v16, 0x0

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const/16 v18, 0x1

    .line 275
    .line 276
    instance-of v3, v0, LQ0/h;

    .line 277
    .line 278
    if-eqz v3, :cond_e

    .line 279
    .line 280
    return-void

    .line 281
    :cond_e
    iget-object v3, v4, LQ0/c;->a:Ljava/util/HashSet;

    .line 282
    .line 283
    if-eqz v3, :cond_1b

    .line 284
    .line 285
    iget-boolean v4, v4, LQ0/c;->c:Z

    .line 286
    .line 287
    if-eqz v4, :cond_1b

    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    :cond_f
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-eqz v4, :cond_1b

    .line 298
    .line 299
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    check-cast v4, LQ0/c;

    .line 304
    .line 305
    iget-object v5, v4, LQ0/c;->d:LQ0/d;

    .line 306
    .line 307
    add-int/lit8 v8, p0, 0x1

    .line 308
    .line 309
    invoke-static {v5}, LR0/h;->a(LQ0/d;)Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    invoke-virtual {v5}, LQ0/d;->z()Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_10

    .line 318
    .line 319
    if-eqz v7, :cond_10

    .line 320
    .line 321
    new-instance v9, LR0/b;

    .line 322
    .line 323
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-static {v5, v1, v9}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 327
    .line 328
    .line 329
    :cond_10
    iget-object v9, v5, LQ0/d;->I:LQ0/c;

    .line 330
    .line 331
    iget-object v10, v5, LQ0/d;->K:LQ0/c;

    .line 332
    .line 333
    if-ne v4, v9, :cond_11

    .line 334
    .line 335
    iget-object v11, v10, LQ0/c;->f:LQ0/c;

    .line 336
    .line 337
    if-eqz v11, :cond_11

    .line 338
    .line 339
    iget-boolean v11, v11, LQ0/c;->c:Z

    .line 340
    .line 341
    if-nez v11, :cond_12

    .line 342
    .line 343
    :cond_11
    if-ne v4, v10, :cond_13

    .line 344
    .line 345
    iget-object v11, v9, LQ0/c;->f:LQ0/c;

    .line 346
    .line 347
    if-eqz v11, :cond_13

    .line 348
    .line 349
    iget-boolean v11, v11, LQ0/c;->c:Z

    .line 350
    .line 351
    if-eqz v11, :cond_13

    .line 352
    .line 353
    :cond_12
    move/from16 v11, v18

    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_13
    move/from16 v11, v16

    .line 357
    .line 358
    :goto_5
    iget-object v13, v5, LQ0/d;->p0:[I

    .line 359
    .line 360
    aget v13, v13, v16

    .line 361
    .line 362
    if-ne v13, v12, :cond_14

    .line 363
    .line 364
    if-eqz v7, :cond_15

    .line 365
    .line 366
    :cond_14
    const/16 v7, 0x8

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :cond_15
    if-ne v13, v12, :cond_17

    .line 370
    .line 371
    iget v4, v5, LQ0/d;->v:I

    .line 372
    .line 373
    if-ltz v4, :cond_17

    .line 374
    .line 375
    iget v4, v5, LQ0/d;->u:I

    .line 376
    .line 377
    if-ltz v4, :cond_17

    .line 378
    .line 379
    iget v4, v5, LQ0/d;->g0:I

    .line 380
    .line 381
    const/16 v7, 0x8

    .line 382
    .line 383
    if-eq v4, v7, :cond_16

    .line 384
    .line 385
    iget v4, v5, LQ0/d;->r:I

    .line 386
    .line 387
    if-nez v4, :cond_f

    .line 388
    .line 389
    iget v4, v5, LQ0/d;->W:F

    .line 390
    .line 391
    cmpl-float v4, v4, v17

    .line 392
    .line 393
    if-nez v4, :cond_f

    .line 394
    .line 395
    :cond_16
    invoke-virtual {v5}, LQ0/d;->x()Z

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    if-nez v4, :cond_f

    .line 400
    .line 401
    iget-boolean v4, v5, LQ0/d;->F:Z

    .line 402
    .line 403
    if-nez v4, :cond_f

    .line 404
    .line 405
    if-eqz v11, :cond_f

    .line 406
    .line 407
    invoke-virtual {v5}, LQ0/d;->x()Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    if-nez v4, :cond_f

    .line 412
    .line 413
    invoke-static {v8, v0, v1, v5, v2}, LR0/h;->e(ILQ0/d;LT0/e;LQ0/d;Z)V

    .line 414
    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_17
    const/16 v7, 0x8

    .line 418
    .line 419
    goto :goto_4

    .line 420
    :goto_6
    invoke-virtual {v5}, LQ0/d;->z()Z

    .line 421
    .line 422
    .line 423
    move-result v13

    .line 424
    if-eqz v13, :cond_18

    .line 425
    .line 426
    goto/16 :goto_4

    .line 427
    .line 428
    :cond_18
    if-ne v4, v9, :cond_19

    .line 429
    .line 430
    iget-object v13, v10, LQ0/c;->f:LQ0/c;

    .line 431
    .line 432
    if-nez v13, :cond_19

    .line 433
    .line 434
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    add-int/2addr v4, v6

    .line 439
    invoke-virtual {v5}, LQ0/d;->q()I

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    add-int/2addr v9, v4

    .line 444
    invoke-virtual {v5, v4, v9}, LQ0/d;->J(II)V

    .line 445
    .line 446
    .line 447
    invoke-static {v8, v5, v1, v2}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_4

    .line 451
    .line 452
    :cond_19
    if-ne v4, v10, :cond_1a

    .line 453
    .line 454
    iget-object v4, v9, LQ0/c;->f:LQ0/c;

    .line 455
    .line 456
    if-nez v4, :cond_1a

    .line 457
    .line 458
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    sub-int v4, v6, v4

    .line 463
    .line 464
    invoke-virtual {v5}, LQ0/d;->q()I

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    sub-int v9, v4, v9

    .line 469
    .line 470
    invoke-virtual {v5, v9, v4}, LQ0/d;->J(II)V

    .line 471
    .line 472
    .line 473
    invoke-static {v8, v5, v1, v2}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_4

    .line 477
    .line 478
    :cond_1a
    if-eqz v11, :cond_f

    .line 479
    .line 480
    invoke-virtual {v5}, LQ0/d;->x()Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-nez v4, :cond_f

    .line 485
    .line 486
    invoke-static {v8, v5, v1, v2}, LR0/h;->d(ILQ0/d;LT0/e;Z)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_4

    .line 490
    .line 491
    :cond_1b
    move/from16 v1, v18

    .line 492
    .line 493
    iput-boolean v1, v0, LQ0/d;->m:Z

    .line 494
    .line 495
    return-void
.end method

.method public static d(ILQ0/d;LT0/e;Z)V
    .locals 6

    .line 1
    iget v0, p1, LQ0/d;->d0:F

    .line 2
    .line 3
    iget-object v1, p1, LQ0/d;->I:LQ0/c;

    .line 4
    .line 5
    iget-object v2, v1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    invoke-virtual {v2}, LQ0/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, LQ0/d;->K:LQ0/c;

    .line 12
    .line 13
    iget-object v4, v3, LQ0/c;->f:LQ0/c;

    .line 14
    .line 15
    invoke-virtual {v4}, LQ0/c;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, LQ0/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p1}, LQ0/d;->q()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int/2addr v0, v2

    .line 61
    add-int v3, v0, v1

    .line 62
    .line 63
    if-le v2, v4, :cond_3

    .line 64
    .line 65
    sub-int v3, v0, v1

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p1, v0, v3}, LQ0/d;->J(II)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    invoke-static {p0, p1, p2, p3}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static e(ILQ0/d;LT0/e;LQ0/d;Z)V
    .locals 7

    .line 1
    iget v0, p3, LQ0/d;->d0:F

    .line 2
    .line 3
    iget-object v1, p3, LQ0/d;->I:LQ0/c;

    .line 4
    .line 5
    iget-object v2, v1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    invoke-virtual {v2}, LQ0/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, LQ0/d;->K:LQ0/c;

    .line 17
    .line 18
    iget-object v3, v2, LQ0/c;->f:LQ0/c;

    .line 19
    .line 20
    invoke-virtual {v3}, LQ0/c;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, LQ0/d;->q()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, LQ0/d;->g0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, LQ0/d;->r:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, LQ0/e;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, LQ0/d;->q()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, LQ0/d;->T:LQ0/d;

    .line 58
    .line 59
    invoke-virtual {p1}, LQ0/d;->q()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    iget v2, p3, LQ0/d;->d0:F

    .line 64
    .line 65
    mul-float/2addr v2, v6

    .line 66
    int-to-float p1, p1

    .line 67
    mul-float/2addr v2, p1

    .line 68
    float-to-int v2, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    sub-int v2, v3, v1

    .line 73
    .line 74
    :cond_2
    :goto_1
    iget p1, p3, LQ0/d;->u:I

    .line 75
    .line 76
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget p1, p3, LQ0/d;->v:I

    .line 81
    .line 82
    if-lez p1, :cond_3

    .line 83
    .line 84
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :cond_3
    sub-int/2addr v3, v1

    .line 89
    sub-int/2addr v3, v2

    .line 90
    int-to-float p1, v3

    .line 91
    mul-float/2addr v0, p1

    .line 92
    add-float/2addr v0, v6

    .line 93
    float-to-int p1, v0

    .line 94
    add-int/2addr v1, p1

    .line 95
    add-int/2addr v2, v1

    .line 96
    invoke-virtual {p3, v1, v2}, LQ0/d;->J(II)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 p0, p0, 0x1

    .line 100
    .line 101
    invoke-static {p0, p3, p2, p4}, LR0/h;->c(ILQ0/d;LT0/e;Z)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public static f(ILQ0/d;LT0/e;)V
    .locals 6

    .line 1
    iget v0, p1, LQ0/d;->e0:F

    .line 2
    .line 3
    iget-object v1, p1, LQ0/d;->J:LQ0/c;

    .line 4
    .line 5
    iget-object v2, v1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    invoke-virtual {v2}, LQ0/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p1, LQ0/d;->L:LQ0/c;

    .line 12
    .line 13
    iget-object v4, v3, LQ0/c;->f:LQ0/c;

    .line 14
    .line 15
    invoke-virtual {v4}, LQ0/c;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, LQ0/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p1}, LQ0/d;->k()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int v3, v2, v0

    .line 61
    .line 62
    add-int v5, v3, v1

    .line 63
    .line 64
    if-le v2, v4, :cond_3

    .line 65
    .line 66
    sub-int v3, v2, v0

    .line 67
    .line 68
    sub-int v5, v3, v1

    .line 69
    .line 70
    :cond_3
    invoke-virtual {p1, v3, v5}, LQ0/d;->K(II)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p0, p0, 0x1

    .line 74
    .line 75
    invoke-static {p0, p1, p2}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static g(ILQ0/d;LT0/e;LQ0/d;)V
    .locals 7

    .line 1
    iget v0, p3, LQ0/d;->e0:F

    .line 2
    .line 3
    iget-object v1, p3, LQ0/d;->J:LQ0/c;

    .line 4
    .line 5
    iget-object v2, v1, LQ0/c;->f:LQ0/c;

    .line 6
    .line 7
    invoke-virtual {v2}, LQ0/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, LQ0/d;->L:LQ0/c;

    .line 17
    .line 18
    iget-object v3, v2, LQ0/c;->f:LQ0/c;

    .line 19
    .line 20
    invoke-virtual {v3}, LQ0/c;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, LQ0/d;->k()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, LQ0/d;->g0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, LQ0/d;->s:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, LQ0/e;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, LQ0/d;->k()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, LQ0/d;->T:LQ0/d;

    .line 58
    .line 59
    invoke-virtual {p1}, LQ0/d;->k()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    mul-float v2, v0, v6

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    mul-float/2addr v2, p1

    .line 67
    float-to-int v2, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    if-nez v4, :cond_2

    .line 70
    .line 71
    sub-int v2, v3, v1

    .line 72
    .line 73
    :cond_2
    :goto_1
    iget p1, p3, LQ0/d;->x:I

    .line 74
    .line 75
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget p1, p3, LQ0/d;->y:I

    .line 80
    .line 81
    if-lez p1, :cond_3

    .line 82
    .line 83
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :cond_3
    sub-int/2addr v3, v1

    .line 88
    sub-int/2addr v3, v2

    .line 89
    int-to-float p1, v3

    .line 90
    mul-float/2addr v0, p1

    .line 91
    add-float/2addr v0, v6

    .line 92
    float-to-int p1, v0

    .line 93
    add-int/2addr v1, p1

    .line 94
    add-int/2addr v2, v1

    .line 95
    invoke-virtual {p3, v1, v2}, LQ0/d;->K(II)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 p0, p0, 0x1

    .line 99
    .line 100
    invoke-static {p0, p3, p2}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void
.end method

.method public static h(IIII)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    if-eq p2, v2, :cond_1

    .line 8
    .line 9
    if-ne p2, v1, :cond_0

    .line 10
    .line 11
    if-eq p0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p0, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move p0, v0

    .line 17
    :goto_1
    if-eq p3, v0, :cond_3

    .line 18
    .line 19
    if-eq p3, v2, :cond_3

    .line 20
    .line 21
    if-ne p3, v1, :cond_2

    .line 22
    .line 23
    if-eq p1, v2, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move p1, v3

    .line 27
    goto :goto_3

    .line 28
    :cond_3
    :goto_2
    move p1, v0

    .line 29
    :goto_3
    if-nez p0, :cond_5

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_4
    return v3

    .line 35
    :cond_5
    :goto_4
    return v0
.end method

.method public static i(ILQ0/d;LT0/e;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-boolean v2, v0, LQ0/d;->n:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    instance-of v2, v0, LQ0/e;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, LQ0/d;->z()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, LR0/h;->a(LQ0/d;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    new-instance v2, LR0/b;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1, v2}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v2, 0x3

    .line 35
    invoke-virtual {v0, v2}, LQ0/d;->i(I)LQ0/c;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x5

    .line 40
    invoke-virtual {v0, v4}, LQ0/d;->i(I)LQ0/c;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3}, LQ0/c;->d()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v4}, LQ0/c;->d()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v7, v3, LQ0/c;->a:Ljava/util/HashSet;

    .line 53
    .line 54
    const/16 v11, 0x8

    .line 55
    .line 56
    if-eqz v7, :cond_d

    .line 57
    .line 58
    iget-boolean v3, v3, LQ0/c;->c:Z

    .line 59
    .line 60
    if-eqz v3, :cond_d

    .line 61
    .line 62
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_d

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, LQ0/c;

    .line 77
    .line 78
    iget-object v12, v7, LQ0/c;->d:LQ0/d;

    .line 79
    .line 80
    add-int/lit8 v13, p0, 0x1

    .line 81
    .line 82
    invoke-static {v12}, LR0/h;->a(LQ0/d;)Z

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    invoke-virtual {v12}, LQ0/d;->z()Z

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    if-eqz v15, :cond_3

    .line 91
    .line 92
    if-eqz v14, :cond_3

    .line 93
    .line 94
    new-instance v15, LR0/b;

    .line 95
    .line 96
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {v12, v1, v15}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    iget-object v15, v12, LQ0/d;->J:LQ0/c;

    .line 103
    .line 104
    iget-object v9, v12, LQ0/d;->L:LQ0/c;

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    if-ne v7, v15, :cond_4

    .line 109
    .line 110
    iget-object v10, v9, LQ0/c;->f:LQ0/c;

    .line 111
    .line 112
    if-eqz v10, :cond_4

    .line 113
    .line 114
    iget-boolean v10, v10, LQ0/c;->c:Z

    .line 115
    .line 116
    if-nez v10, :cond_5

    .line 117
    .line 118
    :cond_4
    if-ne v7, v9, :cond_6

    .line 119
    .line 120
    iget-object v10, v15, LQ0/c;->f:LQ0/c;

    .line 121
    .line 122
    if-eqz v10, :cond_6

    .line 123
    .line 124
    iget-boolean v10, v10, LQ0/c;->c:Z

    .line 125
    .line 126
    if-eqz v10, :cond_6

    .line 127
    .line 128
    :cond_5
    const/4 v10, 0x1

    .line 129
    :goto_1
    const/16 v17, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    const/4 v10, 0x0

    .line 133
    goto :goto_1

    .line 134
    :goto_2
    iget-object v8, v12, LQ0/d;->p0:[I

    .line 135
    .line 136
    aget v8, v8, v17

    .line 137
    .line 138
    if-ne v8, v2, :cond_9

    .line 139
    .line 140
    if-eqz v14, :cond_7

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_7
    if-ne v8, v2, :cond_2

    .line 144
    .line 145
    iget v7, v12, LQ0/d;->y:I

    .line 146
    .line 147
    if-ltz v7, :cond_2

    .line 148
    .line 149
    iget v7, v12, LQ0/d;->x:I

    .line 150
    .line 151
    if-ltz v7, :cond_2

    .line 152
    .line 153
    iget v7, v12, LQ0/d;->g0:I

    .line 154
    .line 155
    if-eq v7, v11, :cond_8

    .line 156
    .line 157
    iget v7, v12, LQ0/d;->s:I

    .line 158
    .line 159
    if-nez v7, :cond_2

    .line 160
    .line 161
    iget v7, v12, LQ0/d;->W:F

    .line 162
    .line 163
    cmpl-float v7, v7, v16

    .line 164
    .line 165
    if-nez v7, :cond_2

    .line 166
    .line 167
    :cond_8
    invoke-virtual {v12}, LQ0/d;->y()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_2

    .line 172
    .line 173
    iget-boolean v7, v12, LQ0/d;->F:Z

    .line 174
    .line 175
    if-nez v7, :cond_2

    .line 176
    .line 177
    if-eqz v10, :cond_2

    .line 178
    .line 179
    invoke-virtual {v12}, LQ0/d;->y()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-nez v7, :cond_2

    .line 184
    .line 185
    invoke-static {v13, v0, v1, v12}, LR0/h;->g(ILQ0/d;LT0/e;LQ0/d;)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_9
    :goto_3
    invoke-virtual {v12}, LQ0/d;->z()Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-eqz v8, :cond_a

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_a
    if-ne v7, v15, :cond_b

    .line 198
    .line 199
    iget-object v8, v9, LQ0/c;->f:LQ0/c;

    .line 200
    .line 201
    if-nez v8, :cond_b

    .line 202
    .line 203
    invoke-virtual {v15}, LQ0/c;->e()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    add-int/2addr v7, v5

    .line 208
    invoke-virtual {v12}, LQ0/d;->k()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    add-int/2addr v8, v7

    .line 213
    invoke-virtual {v12, v7, v8}, LQ0/d;->K(II)V

    .line 214
    .line 215
    .line 216
    invoke-static {v13, v12, v1}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_b
    if-ne v7, v9, :cond_c

    .line 222
    .line 223
    iget-object v7, v15, LQ0/c;->f:LQ0/c;

    .line 224
    .line 225
    if-nez v7, :cond_c

    .line 226
    .line 227
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    sub-int v7, v5, v7

    .line 232
    .line 233
    invoke-virtual {v12}, LQ0/d;->k()I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    sub-int v8, v7, v8

    .line 238
    .line 239
    invoke-virtual {v12, v8, v7}, LQ0/d;->K(II)V

    .line 240
    .line 241
    .line 242
    invoke-static {v13, v12, v1}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_c
    if-eqz v10, :cond_2

    .line 248
    .line 249
    invoke-virtual {v12}, LQ0/d;->y()Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-nez v7, :cond_2

    .line 254
    .line 255
    invoke-static {v13, v12, v1}, LR0/h;->f(ILQ0/d;LT0/e;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_d
    const/16 v16, 0x0

    .line 261
    .line 262
    const/16 v17, 0x1

    .line 263
    .line 264
    instance-of v3, v0, LQ0/h;

    .line 265
    .line 266
    if-eqz v3, :cond_e

    .line 267
    .line 268
    return-void

    .line 269
    :cond_e
    iget-object v3, v4, LQ0/c;->a:Ljava/util/HashSet;

    .line 270
    .line 271
    if-eqz v3, :cond_1a

    .line 272
    .line 273
    iget-boolean v4, v4, LQ0/c;->c:Z

    .line 274
    .line 275
    if-eqz v4, :cond_1a

    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :cond_f
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_1a

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    check-cast v4, LQ0/c;

    .line 292
    .line 293
    iget-object v5, v4, LQ0/c;->d:LQ0/d;

    .line 294
    .line 295
    add-int/lit8 v7, p0, 0x1

    .line 296
    .line 297
    invoke-static {v5}, LR0/h;->a(LQ0/d;)Z

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    invoke-virtual {v5}, LQ0/d;->z()Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-eqz v9, :cond_10

    .line 306
    .line 307
    if-eqz v8, :cond_10

    .line 308
    .line 309
    new-instance v9, LR0/b;

    .line 310
    .line 311
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-static {v5, v1, v9}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 315
    .line 316
    .line 317
    :cond_10
    iget-object v9, v5, LQ0/d;->J:LQ0/c;

    .line 318
    .line 319
    iget-object v10, v5, LQ0/d;->L:LQ0/c;

    .line 320
    .line 321
    if-ne v4, v9, :cond_11

    .line 322
    .line 323
    iget-object v12, v10, LQ0/c;->f:LQ0/c;

    .line 324
    .line 325
    if-eqz v12, :cond_11

    .line 326
    .line 327
    iget-boolean v12, v12, LQ0/c;->c:Z

    .line 328
    .line 329
    if-nez v12, :cond_12

    .line 330
    .line 331
    :cond_11
    if-ne v4, v10, :cond_13

    .line 332
    .line 333
    iget-object v12, v9, LQ0/c;->f:LQ0/c;

    .line 334
    .line 335
    if-eqz v12, :cond_13

    .line 336
    .line 337
    iget-boolean v12, v12, LQ0/c;->c:Z

    .line 338
    .line 339
    if-eqz v12, :cond_13

    .line 340
    .line 341
    :cond_12
    move/from16 v12, v17

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_13
    const/4 v12, 0x0

    .line 345
    :goto_5
    iget-object v13, v5, LQ0/d;->p0:[I

    .line 346
    .line 347
    aget v13, v13, v17

    .line 348
    .line 349
    if-ne v13, v2, :cond_16

    .line 350
    .line 351
    if-eqz v8, :cond_14

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_14
    if-ne v13, v2, :cond_f

    .line 355
    .line 356
    iget v4, v5, LQ0/d;->y:I

    .line 357
    .line 358
    if-ltz v4, :cond_f

    .line 359
    .line 360
    iget v4, v5, LQ0/d;->x:I

    .line 361
    .line 362
    if-ltz v4, :cond_f

    .line 363
    .line 364
    iget v4, v5, LQ0/d;->g0:I

    .line 365
    .line 366
    if-eq v4, v11, :cond_15

    .line 367
    .line 368
    iget v4, v5, LQ0/d;->s:I

    .line 369
    .line 370
    if-nez v4, :cond_f

    .line 371
    .line 372
    iget v4, v5, LQ0/d;->W:F

    .line 373
    .line 374
    cmpl-float v4, v4, v16

    .line 375
    .line 376
    if-nez v4, :cond_f

    .line 377
    .line 378
    :cond_15
    invoke-virtual {v5}, LQ0/d;->y()Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-nez v4, :cond_f

    .line 383
    .line 384
    iget-boolean v4, v5, LQ0/d;->F:Z

    .line 385
    .line 386
    if-nez v4, :cond_f

    .line 387
    .line 388
    if-eqz v12, :cond_f

    .line 389
    .line 390
    invoke-virtual {v5}, LQ0/d;->y()Z

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-nez v4, :cond_f

    .line 395
    .line 396
    invoke-static {v7, v0, v1, v5}, LR0/h;->g(ILQ0/d;LT0/e;LQ0/d;)V

    .line 397
    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_16
    :goto_6
    invoke-virtual {v5}, LQ0/d;->z()Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-eqz v8, :cond_17

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_17
    if-ne v4, v9, :cond_18

    .line 408
    .line 409
    iget-object v8, v10, LQ0/c;->f:LQ0/c;

    .line 410
    .line 411
    if-nez v8, :cond_18

    .line 412
    .line 413
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    add-int/2addr v4, v6

    .line 418
    invoke-virtual {v5}, LQ0/d;->k()I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    add-int/2addr v8, v4

    .line 423
    invoke-virtual {v5, v4, v8}, LQ0/d;->K(II)V

    .line 424
    .line 425
    .line 426
    invoke-static {v7, v5, v1}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 427
    .line 428
    .line 429
    goto/16 :goto_4

    .line 430
    .line 431
    :cond_18
    if-ne v4, v10, :cond_19

    .line 432
    .line 433
    iget-object v4, v9, LQ0/c;->f:LQ0/c;

    .line 434
    .line 435
    if-nez v4, :cond_19

    .line 436
    .line 437
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    sub-int v4, v6, v4

    .line 442
    .line 443
    invoke-virtual {v5}, LQ0/d;->k()I

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    sub-int v8, v4, v8

    .line 448
    .line 449
    invoke-virtual {v5, v8, v4}, LQ0/d;->K(II)V

    .line 450
    .line 451
    .line 452
    invoke-static {v7, v5, v1}, LR0/h;->i(ILQ0/d;LT0/e;)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_4

    .line 456
    .line 457
    :cond_19
    if-eqz v12, :cond_f

    .line 458
    .line 459
    invoke-virtual {v5}, LQ0/d;->y()Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-nez v4, :cond_f

    .line 464
    .line 465
    invoke-static {v7, v5, v1}, LR0/h;->f(ILQ0/d;LT0/e;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_4

    .line 469
    .line 470
    :cond_1a
    const/4 v3, 0x6

    .line 471
    invoke-virtual {v0, v3}, LQ0/d;->i(I)LQ0/c;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    iget-object v4, v3, LQ0/c;->a:Ljava/util/HashSet;

    .line 476
    .line 477
    if-eqz v4, :cond_20

    .line 478
    .line 479
    iget-boolean v4, v3, LQ0/c;->c:Z

    .line 480
    .line 481
    if-eqz v4, :cond_20

    .line 482
    .line 483
    invoke-virtual {v3}, LQ0/c;->d()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    iget-object v3, v3, LQ0/c;->a:Ljava/util/HashSet;

    .line 488
    .line 489
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    if-eqz v5, :cond_20

    .line 498
    .line 499
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    check-cast v5, LQ0/c;

    .line 504
    .line 505
    iget-object v6, v5, LQ0/c;->d:LQ0/d;

    .line 506
    .line 507
    add-int/lit8 v8, p0, 0x1

    .line 508
    .line 509
    invoke-static {v6}, LR0/h;->a(LQ0/d;)Z

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    invoke-virtual {v6}, LQ0/d;->z()Z

    .line 514
    .line 515
    .line 516
    move-result v9

    .line 517
    if-eqz v9, :cond_1b

    .line 518
    .line 519
    if-eqz v7, :cond_1b

    .line 520
    .line 521
    new-instance v9, LR0/b;

    .line 522
    .line 523
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 524
    .line 525
    .line 526
    invoke-static {v6, v1, v9}, LQ0/e;->V(LQ0/d;LT0/e;LR0/b;)V

    .line 527
    .line 528
    .line 529
    :cond_1b
    iget-object v9, v6, LQ0/d;->p0:[I

    .line 530
    .line 531
    aget v9, v9, v17

    .line 532
    .line 533
    if-ne v9, v2, :cond_1c

    .line 534
    .line 535
    if-eqz v7, :cond_1f

    .line 536
    .line 537
    :cond_1c
    invoke-virtual {v6}, LQ0/d;->z()Z

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    if-eqz v7, :cond_1d

    .line 542
    .line 543
    goto :goto_7

    .line 544
    :cond_1d
    iget-object v7, v6, LQ0/d;->M:LQ0/c;

    .line 545
    .line 546
    if-ne v5, v7, :cond_1f

    .line 547
    .line 548
    invoke-virtual {v5}, LQ0/c;->e()I

    .line 549
    .line 550
    .line 551
    move-result v5

    .line 552
    add-int/2addr v5, v4

    .line 553
    iget-boolean v9, v6, LQ0/d;->E:Z

    .line 554
    .line 555
    if-nez v9, :cond_1e

    .line 556
    .line 557
    goto :goto_8

    .line 558
    :cond_1e
    iget v9, v6, LQ0/d;->a0:I

    .line 559
    .line 560
    sub-int v9, v5, v9

    .line 561
    .line 562
    iget v10, v6, LQ0/d;->V:I

    .line 563
    .line 564
    add-int/2addr v10, v9

    .line 565
    iput v9, v6, LQ0/d;->Z:I

    .line 566
    .line 567
    iget-object v11, v6, LQ0/d;->J:LQ0/c;

    .line 568
    .line 569
    invoke-virtual {v11, v9}, LQ0/c;->l(I)V

    .line 570
    .line 571
    .line 572
    iget-object v9, v6, LQ0/d;->L:LQ0/c;

    .line 573
    .line 574
    invoke-virtual {v9, v10}, LQ0/c;->l(I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v7, v5}, LQ0/c;->l(I)V

    .line 578
    .line 579
    .line 580
    move/from16 v5, v17

    .line 581
    .line 582
    iput-boolean v5, v6, LQ0/d;->l:Z

    .line 583
    .line 584
    :goto_8
    :try_start_0
    invoke-static {v8, v6, v1}, LR0/h;->i(ILQ0/d;LT0/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 585
    .line 586
    .line 587
    goto :goto_9

    .line 588
    :catchall_0
    move-exception v0

    .line 589
    throw v0

    .line 590
    :cond_1f
    :goto_9
    const/16 v17, 0x1

    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_20
    const/4 v5, 0x1

    .line 594
    iput-boolean v5, v0, LQ0/d;->n:Z

    .line 595
    .line 596
    return-void
.end method
