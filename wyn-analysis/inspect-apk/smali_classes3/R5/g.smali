.class public final LR5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJ5/w;

.field public final b:LM2/u;

.field public final c:LY4/b;

.field public d:LR5/p;

.field public e:LR5/e;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:LY4/b;

.field public final k:LY4/b;

.field public l:Z


# direct methods
.method public constructor <init>(LJ5/w;LR5/p;LR5/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR5/g;->a:LJ5/w;

    .line 5
    .line 6
    iput-object p2, p0, LR5/g;->d:LR5/p;

    .line 7
    .line 8
    iput-object p3, p0, LR5/g;->e:LR5/e;

    .line 9
    .line 10
    new-instance v0, LM2/u;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, LM2/u;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LR5/g;->b:LM2/u;

    .line 17
    .line 18
    new-instance v0, LY4/b;

    .line 19
    .line 20
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LR5/g;->c:LY4/b;

    .line 24
    .line 25
    new-instance v0, LY4/b;

    .line 26
    .line 27
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LR5/g;->j:LY4/b;

    .line 31
    .line 32
    new-instance v0, LY4/b;

    .line 33
    .line 34
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, LR5/g;->k:LY4/b;

    .line 38
    .line 39
    iput-object p2, p0, LR5/g;->d:LR5/p;

    .line 40
    .line 41
    iput-object p3, p0, LR5/g;->e:LR5/e;

    .line 42
    .line 43
    iget-object p2, p2, LR5/p;->a:LR5/n;

    .line 44
    .line 45
    iget-object p2, p2, LR5/n;->f:LE5/T;

    .line 46
    .line 47
    invoke-interface {p1, p2}, LJ5/w;->a(LE5/T;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LR5/g;->d()V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()LR5/o;
    .locals 3

    .line 1
    iget-boolean v0, p0, LR5/g;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, LR5/g;->b:LM2/u;

    .line 7
    .line 8
    iget-object v1, v0, LM2/u;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LR5/e;

    .line 11
    .line 12
    sget v2, Lu6/v;->a:I

    .line 13
    .line 14
    iget v1, v1, LR5/e;->a:I

    .line 15
    .line 16
    iget-object v0, v0, LM2/u;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LR5/o;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, LR5/g;->d:LR5/p;

    .line 24
    .line 25
    iget-object v0, v0, LR5/p;->a:LR5/n;

    .line 26
    .line 27
    iget-object v0, v0, LR5/n;->k:[LR5/o;

    .line 28
    .line 29
    aget-object v0, v0, v1

    .line 30
    .line 31
    :goto_0
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-boolean v1, v0, LR5/o;->a:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final b()Z
    .locals 5

    .line 1
    iget v0, p0, LR5/g;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, LR5/g;->f:I

    .line 6
    .line 7
    iget-boolean v0, p0, LR5/g;->l:Z

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
    iget v0, p0, LR5/g;->g:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p0, LR5/g;->g:I

    .line 17
    .line 18
    iget-object v3, p0, LR5/g;->b:LM2/u;

    .line 19
    .line 20
    iget-object v3, v3, LM2/u;->f:[I

    .line 21
    .line 22
    iget v4, p0, LR5/g;->h:I

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
    iput v4, p0, LR5/g;->h:I

    .line 30
    .line 31
    iput v2, p0, LR5/g;->g:I

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    return v1
.end method

.method public final c(II)I
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0}, LR5/g;->a()LR5/o;

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
    iget-object v3, p0, LR5/g;->b:LM2/u;

    .line 12
    .line 13
    iget v4, v1, LR5/o;->d:I

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-object v1, v3, LM2/u;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LY4/b;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget v4, Lu6/v;->a:I

    .line 23
    .line 24
    iget-object v1, v1, LR5/o;->e:[B

    .line 25
    .line 26
    array-length v4, v1

    .line 27
    iget-object v5, p0, LR5/g;->k:LY4/b;

    .line 28
    .line 29
    invoke-virtual {v5, v4, v1}, LY4/b;->y(I[B)V

    .line 30
    .line 31
    .line 32
    array-length v4, v1

    .line 33
    move-object v1, v5

    .line 34
    :goto_0
    iget v5, p0, LR5/g;->f:I

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
    iget-object v8, p0, LR5/g;->j:LY4/b;

    .line 59
    .line 60
    iget-object v9, v8, LY4/b;->a:[B

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
    invoke-virtual {v8, v2}, LY4/b;->A(I)V

    .line 73
    .line 74
    .line 75
    iget-object v9, p0, LR5/g;->a:LJ5/w;

    .line 76
    .line 77
    invoke-interface {v9, v7, v8}, LJ5/w;->e(ILY4/b;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v9, v4, v1}, LJ5/w;->e(ILY4/b;)V

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
    iget-object v10, p0, LR5/g;->c:LY4/b;

    .line 91
    .line 92
    if-nez v5, :cond_7

    .line 93
    .line 94
    invoke-virtual {v10, v0}, LY4/b;->x(I)V

    .line 95
    .line 96
    .line 97
    iget-object v3, v10, LY4/b;->a:[B

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
    invoke-interface {v9, v0, v10}, LJ5/w;->e(ILY4/b;)V

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
    check-cast p1, LY4/b;

    .line 149
    .line 150
    invoke-virtual {p1}, LY4/b;->v()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const/4 v5, -0x2

    .line 155
    invoke-virtual {p1, v5}, LY4/b;->B(I)V

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
    invoke-virtual {v10, v3}, LY4/b;->x(I)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v10, LY4/b;->a:[B

    .line 166
    .line 167
    invoke-virtual {p1, v2, v3, v1}, LY4/b;->c(II[B)V

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
    invoke-interface {v9, v3, v10}, LJ5/w;->e(ILY4/b;)V

    .line 196
    .line 197
    .line 198
    add-int/2addr v4, v7

    .line 199
    add-int/2addr v4, v3

    .line 200
    return v4
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LR5/g;->b:LM2/u;

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
    iput v1, p0, LR5/g;->f:I

    .line 20
    .line 21
    iput v1, p0, LR5/g;->h:I

    .line 22
    .line 23
    iput v1, p0, LR5/g;->g:I

    .line 24
    .line 25
    iput v1, p0, LR5/g;->i:I

    .line 26
    .line 27
    iput-boolean v1, p0, LR5/g;->l:Z

    .line 28
    .line 29
    return-void
.end method
