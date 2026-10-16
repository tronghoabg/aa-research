.class public final LM2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls2/C;

.field public final b:LM2/u;

.field public final c:LQ1/o;

.field public d:LM2/v;

.field public e:LM2/h;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:LQ1/o;

.field public final k:LQ1/o;

.field public l:Z


# direct methods
.method public constructor <init>(Ls2/C;LM2/v;LM2/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/k;->a:Ls2/C;

    .line 5
    .line 6
    iput-object p2, p0, LM2/k;->d:LM2/v;

    .line 7
    .line 8
    iput-object p3, p0, LM2/k;->e:LM2/h;

    .line 9
    .line 10
    new-instance v0, LM2/u;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, LM2/u;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LM2/k;->b:LM2/u;

    .line 17
    .line 18
    new-instance v0, LQ1/o;

    .line 19
    .line 20
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LM2/k;->c:LQ1/o;

    .line 24
    .line 25
    new-instance v0, LQ1/o;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LM2/k;->j:LQ1/o;

    .line 32
    .line 33
    new-instance v0, LQ1/o;

    .line 34
    .line 35
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LM2/k;->k:LQ1/o;

    .line 39
    .line 40
    iput-object p2, p0, LM2/k;->d:LM2/v;

    .line 41
    .line 42
    iput-object p3, p0, LM2/k;->e:LM2/h;

    .line 43
    .line 44
    iget-object p2, p2, LM2/v;->a:LM2/s;

    .line 45
    .line 46
    iget-object p2, p2, LM2/s;->g:LN1/n;

    .line 47
    .line 48
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, LM2/k;->e()V

    .line 52
    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    iget-boolean v0, p0, LM2/k;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LM2/k;->d:LM2/v;

    .line 6
    .line 7
    iget-object v0, v0, LM2/v;->g:[I

    .line 8
    .line 9
    iget v1, p0, LM2/k;->f:I

    .line 10
    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LM2/k;->b:LM2/u;

    .line 15
    .line 16
    iget-object v0, v0, LM2/u;->i:[Z

    .line 17
    .line 18
    iget v1, p0, LM2/k;->f:I

    .line 19
    .line 20
    aget-boolean v0, v0, v1

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, LM2/k;->b()LM2/t;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/high16 v1, 0x40000000    # 2.0f

    .line 34
    .line 35
    or-int/2addr v0, v1

    .line 36
    :cond_2
    return v0
.end method

.method public final b()LM2/t;
    .locals 4

    .line 1
    iget-boolean v0, p0, LM2/k;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, LM2/k;->b:LM2/u;

    .line 8
    .line 9
    iget-object v2, v0, LM2/u;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LM2/h;

    .line 12
    .line 13
    sget v3, LQ1/x;->a:I

    .line 14
    .line 15
    iget v2, v2, LM2/h;->a:I

    .line 16
    .line 17
    iget-object v0, v0, LM2/u;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LM2/t;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, LM2/k;->d:LM2/v;

    .line 25
    .line 26
    iget-object v0, v0, LM2/v;->a:LM2/s;

    .line 27
    .line 28
    iget-object v0, v0, LM2/s;->l:[LM2/t;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    move-object v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    aget-object v0, v0, v2

    .line 35
    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-boolean v2, v0, LM2/t;->a:Z

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final c()Z
    .locals 5

    .line 1
    iget v0, p0, LM2/k;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, LM2/k;->f:I

    .line 6
    .line 7
    iget-boolean v0, p0, LM2/k;->l:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget v0, p0, LM2/k;->g:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p0, LM2/k;->g:I

    .line 17
    .line 18
    iget-object v3, p0, LM2/k;->b:LM2/u;

    .line 19
    .line 20
    iget-object v3, v3, LM2/u;->f:[I

    .line 21
    .line 22
    iget v4, p0, LM2/k;->h:I

    .line 23
    .line 24
    aget v3, v3, v4

    .line 25
    .line 26
    if-ne v0, v3, :cond_1

    .line 27
    .line 28
    add-int/2addr v4, v1

    .line 29
    iput v4, p0, LM2/k;->h:I

    .line 30
    .line 31
    iput v2, p0, LM2/k;->g:I

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    return v1
.end method

.method public final d(II)I
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0}, LM2/k;->b()LM2/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget-object v3, p0, LM2/k;->b:LM2/u;

    .line 12
    .line 13
    iget v4, v1, LM2/t;->d:I

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-object v1, v3, LM2/u;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LQ1/o;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget v4, LQ1/x;->a:I

    .line 23
    .line 24
    iget-object v1, v1, LM2/t;->e:[B

    .line 25
    .line 26
    array-length v4, v1

    .line 27
    iget-object v5, p0, LM2/k;->k:LQ1/o;

    .line 28
    .line 29
    invoke-virtual {v5, v4, v1}, LQ1/o;->E(I[B)V

    .line 30
    .line 31
    .line 32
    array-length v4, v1

    .line 33
    move-object v1, v5

    .line 34
    :goto_0
    iget v5, p0, LM2/k;->f:I

    .line 35
    .line 36
    iget-boolean v6, v3, LM2/u;->j:Z

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    iget-object v6, v3, LM2/u;->k:[Z

    .line 42
    .line 43
    aget-boolean v5, v6, v5

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    move v5, v7

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v5, v2

    .line 50
    :goto_1
    if-nez v5, :cond_4

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move v6, v2

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :goto_2
    move v6, v7

    .line 58
    :goto_3
    iget-object v8, p0, LM2/k;->j:LQ1/o;

    .line 59
    .line 60
    iget-object v9, v8, LQ1/o;->a:[B

    .line 61
    .line 62
    if-eqz v6, :cond_5

    .line 63
    .line 64
    const/16 v10, 0x80

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    move v10, v2

    .line 68
    :goto_4
    or-int/2addr v10, v4

    .line 69
    int-to-byte v10, v10

    .line 70
    aput-byte v10, v9, v2

    .line 71
    .line 72
    invoke-virtual {v8, v2}, LQ1/o;->G(I)V

    .line 73
    .line 74
    .line 75
    iget-object v9, p0, LM2/k;->a:Ls2/C;

    .line 76
    .line 77
    invoke-interface {v9, v8, v7, v7}, Ls2/C;->f(LQ1/o;II)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v9, v1, v4, v7}, Ls2/C;->f(LQ1/o;II)V

    .line 81
    .line 82
    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    add-int/2addr v4, v7

    .line 86
    return v4

    .line 87
    :cond_6
    const/4 v1, 0x6

    .line 88
    const/4 v6, 0x3

    .line 89
    const/4 v8, 0x2

    .line 90
    iget-object v10, p0, LM2/k;->c:LQ1/o;

    .line 91
    .line 92
    if-nez v5, :cond_7

    .line 93
    .line 94
    invoke-virtual {v10, v0}, LQ1/o;->D(I)V

    .line 95
    .line 96
    .line 97
    iget-object v3, v10, LQ1/o;->a:[B

    .line 98
    .line 99
    aput-byte v2, v3, v2

    .line 100
    .line 101
    aput-byte v7, v3, v7

    .line 102
    .line 103
    int-to-byte v2, v2

    .line 104
    aput-byte v2, v3, v8

    .line 105
    .line 106
    and-int/lit16 p2, p2, 0xff

    .line 107
    .line 108
    int-to-byte p2, p2

    .line 109
    aput-byte p2, v3, v6

    .line 110
    .line 111
    shr-int/lit8 p2, p1, 0x18

    .line 112
    .line 113
    and-int/lit16 p2, p2, 0xff

    .line 114
    .line 115
    int-to-byte p2, p2

    .line 116
    const/4 v2, 0x4

    .line 117
    aput-byte p2, v3, v2

    .line 118
    .line 119
    shr-int/lit8 p2, p1, 0x10

    .line 120
    .line 121
    and-int/lit16 p2, p2, 0xff

    .line 122
    .line 123
    int-to-byte p2, p2

    .line 124
    const/4 v2, 0x5

    .line 125
    aput-byte p2, v3, v2

    .line 126
    .line 127
    shr-int/lit8 p2, p1, 0x8

    .line 128
    .line 129
    and-int/lit16 p2, p2, 0xff

    .line 130
    .line 131
    int-to-byte p2, p2

    .line 132
    aput-byte p2, v3, v1

    .line 133
    .line 134
    and-int/lit16 p1, p1, 0xff

    .line 135
    .line 136
    int-to-byte p1, p1

    .line 137
    const/4 p2, 0x7

    .line 138
    aput-byte p1, v3, p2

    .line 139
    .line 140
    invoke-interface {v9, v10, v0, v7}, Ls2/C;->f(LQ1/o;II)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v4, v4, 0x9

    .line 144
    .line 145
    return v4

    .line 146
    :cond_7
    iget-object p1, v3, LM2/u;->q:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p1, LQ1/o;

    .line 149
    .line 150
    invoke-virtual {p1}, LQ1/o;->A()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const/4 v5, -0x2

    .line 155
    invoke-virtual {p1, v5}, LQ1/o;->H(I)V

    .line 156
    .line 157
    .line 158
    mul-int/2addr v3, v1

    .line 159
    add-int/2addr v3, v8

    .line 160
    if-eqz p2, :cond_8

    .line 161
    .line 162
    invoke-virtual {v10, v3}, LQ1/o;->D(I)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v10, LQ1/o;->a:[B

    .line 166
    .line 167
    invoke-virtual {p1, v2, v3, v1}, LQ1/o;->f(II[B)V

    .line 168
    .line 169
    .line 170
    aget-byte p1, v1, v8

    .line 171
    .line 172
    and-int/lit16 p1, p1, 0xff

    .line 173
    .line 174
    shl-int/2addr p1, v0

    .line 175
    aget-byte v2, v1, v6

    .line 176
    .line 177
    and-int/lit16 v2, v2, 0xff

    .line 178
    .line 179
    or-int/2addr p1, v2

    .line 180
    add-int/2addr p1, p2

    .line 181
    shr-int/lit8 p2, p1, 0x8

    .line 182
    .line 183
    and-int/lit16 p2, p2, 0xff

    .line 184
    .line 185
    int-to-byte p2, p2

    .line 186
    aput-byte p2, v1, v8

    .line 187
    .line 188
    and-int/lit16 p1, p1, 0xff

    .line 189
    .line 190
    int-to-byte p1, p1

    .line 191
    aput-byte p1, v1, v6

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    move-object v10, p1

    .line 195
    :goto_5
    invoke-interface {v9, v10, v3, v7}, Ls2/C;->f(LQ1/o;II)V

    .line 196
    .line 197
    .line 198
    add-int/2addr v4, v7

    .line 199
    add-int/2addr v4, v3

    .line 200
    return v4
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, LM2/k;->b:LM2/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, LM2/u;->c:I

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    iput-wide v2, v0, LM2/u;->m:J

    .line 9
    .line 10
    iput-boolean v1, v0, LM2/u;->n:Z

    .line 11
    .line 12
    iput-boolean v1, v0, LM2/u;->j:Z

    .line 13
    .line 14
    iput-boolean v1, v0, LM2/u;->l:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v0, LM2/u;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iput v1, p0, LM2/k;->f:I

    .line 20
    .line 21
    iput v1, p0, LM2/k;->h:I

    .line 22
    .line 23
    iput v1, p0, LM2/k;->g:I

    .line 24
    .line 25
    iput v1, p0, LM2/k;->i:I

    .line 26
    .line 27
    iput-boolean v1, p0, LM2/k;->l:Z

    .line 28
    .line 29
    return-void
.end method
