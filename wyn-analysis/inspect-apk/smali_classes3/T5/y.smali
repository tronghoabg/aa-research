.class public final LT5/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/C;


# instance fields
.field public final a:LT5/x;

.field public final b:LY4/b;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(LT5/x;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/y;->a:LT5/x;

    .line 5
    .line 6
    new-instance p1, LY4/b;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LT5/y;->b:LY4/b;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LT5/y;->f:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b(ILY4/b;)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v1

    .line 9
    :goto_0
    const/4 v2, -0x1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2}, LY4/b;->q()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget v4, p2, LY4/b;->b:I

    .line 17
    .line 18
    add-int/2addr v4, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v4, v2

    .line 21
    :goto_1
    iget-boolean v3, p0, LT5/y;->f:Z

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_2
    iput-boolean v1, p0, LT5/y;->f:Z

    .line 30
    .line 31
    invoke-virtual {p2, v4}, LY4/b;->A(I)V

    .line 32
    .line 33
    .line 34
    iput v1, p0, LT5/y;->d:I

    .line 35
    .line 36
    :cond_3
    :goto_2
    invoke-virtual {p2}, LY4/b;->a()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-lez p1, :cond_a

    .line 41
    .line 42
    iget p1, p0, LT5/y;->d:I

    .line 43
    .line 44
    iget-object v3, p0, LT5/y;->b:LY4/b;

    .line 45
    .line 46
    const/16 v4, 0xff

    .line 47
    .line 48
    const/4 v5, 0x3

    .line 49
    if-ge p1, v5, :cond_6

    .line 50
    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p2}, LY4/b;->q()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget v6, p2, LY4/b;->b:I

    .line 58
    .line 59
    sub-int/2addr v6, v0

    .line 60
    invoke-virtual {p2, v6}, LY4/b;->A(I)V

    .line 61
    .line 62
    .line 63
    if-ne p1, v4, :cond_4

    .line 64
    .line 65
    iput-boolean v0, p0, LT5/y;->f:Z

    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    invoke-virtual {p2}, LY4/b;->a()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v4, p0, LT5/y;->d:I

    .line 73
    .line 74
    rsub-int/lit8 v4, v4, 0x3

    .line 75
    .line 76
    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-object v4, v3, LY4/b;->a:[B

    .line 81
    .line 82
    iget v6, p0, LT5/y;->d:I

    .line 83
    .line 84
    invoke-virtual {p2, v6, p1, v4}, LY4/b;->c(II[B)V

    .line 85
    .line 86
    .line 87
    iget v4, p0, LT5/y;->d:I

    .line 88
    .line 89
    add-int/2addr v4, p1

    .line 90
    iput v4, p0, LT5/y;->d:I

    .line 91
    .line 92
    if-ne v4, v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v5}, LY4/b;->z(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v0}, LY4/b;->B(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, LY4/b;->q()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {v3}, LY4/b;->q()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    and-int/lit16 v6, p1, 0x80

    .line 112
    .line 113
    if-eqz v6, :cond_5

    .line 114
    .line 115
    move v6, v0

    .line 116
    goto :goto_3

    .line 117
    :cond_5
    move v6, v1

    .line 118
    :goto_3
    iput-boolean v6, p0, LT5/y;->e:Z

    .line 119
    .line 120
    and-int/lit8 p1, p1, 0xf

    .line 121
    .line 122
    shl-int/lit8 p1, p1, 0x8

    .line 123
    .line 124
    or-int/2addr p1, v4

    .line 125
    add-int/2addr p1, v5

    .line 126
    iput p1, p0, LT5/y;->c:I

    .line 127
    .line 128
    iget-object v4, v3, LY4/b;->a:[B

    .line 129
    .line 130
    array-length v5, v4

    .line 131
    if-ge v5, p1, :cond_3

    .line 132
    .line 133
    array-length v4, v4

    .line 134
    mul-int/lit8 v4, v4, 0x2

    .line 135
    .line 136
    invoke-static {p1, v4}, Ljava/lang/Math;->max(II)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    const/16 v4, 0x1002

    .line 141
    .line 142
    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-virtual {v3, p1}, LY4/b;->b(I)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    invoke-virtual {p2}, LY4/b;->a()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget v5, p0, LT5/y;->c:I

    .line 155
    .line 156
    iget v6, p0, LT5/y;->d:I

    .line 157
    .line 158
    sub-int/2addr v5, v6

    .line 159
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    iget-object v5, v3, LY4/b;->a:[B

    .line 164
    .line 165
    iget v6, p0, LT5/y;->d:I

    .line 166
    .line 167
    invoke-virtual {p2, v6, p1, v5}, LY4/b;->c(II[B)V

    .line 168
    .line 169
    .line 170
    iget v5, p0, LT5/y;->d:I

    .line 171
    .line 172
    add-int/2addr v5, p1

    .line 173
    iput v5, p0, LT5/y;->d:I

    .line 174
    .line 175
    iget p1, p0, LT5/y;->c:I

    .line 176
    .line 177
    if-ne v5, p1, :cond_3

    .line 178
    .line 179
    iget-boolean v5, p0, LT5/y;->e:Z

    .line 180
    .line 181
    if-eqz v5, :cond_9

    .line 182
    .line 183
    iget-object v5, v3, LY4/b;->a:[B

    .line 184
    .line 185
    sget v6, Lu6/v;->a:I

    .line 186
    .line 187
    move v6, v1

    .line 188
    move v7, v2

    .line 189
    :goto_4
    if-ge v6, p1, :cond_7

    .line 190
    .line 191
    shl-int/lit8 v8, v7, 0x8

    .line 192
    .line 193
    ushr-int/lit8 v7, v7, 0x18

    .line 194
    .line 195
    aget-byte v9, v5, v6

    .line 196
    .line 197
    and-int/2addr v9, v4

    .line 198
    xor-int/2addr v7, v9

    .line 199
    and-int/2addr v7, v4

    .line 200
    sget-object v9, Lu6/v;->k:[I

    .line 201
    .line 202
    aget v7, v9, v7

    .line 203
    .line 204
    xor-int/2addr v7, v8

    .line 205
    add-int/2addr v6, v0

    .line 206
    goto :goto_4

    .line 207
    :cond_7
    if-eqz v7, :cond_8

    .line 208
    .line 209
    iput-boolean v0, p0, LT5/y;->f:Z

    .line 210
    .line 211
    return-void

    .line 212
    :cond_8
    iget p1, p0, LT5/y;->c:I

    .line 213
    .line 214
    add-int/lit8 p1, p1, -0x4

    .line 215
    .line 216
    invoke-virtual {v3, p1}, LY4/b;->z(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_9
    invoke-virtual {v3, p1}, LY4/b;->z(I)V

    .line 221
    .line 222
    .line 223
    :goto_5
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, LT5/y;->a:LT5/x;

    .line 227
    .line 228
    invoke-interface {p1, v3}, LT5/x;->c(LY4/b;)V

    .line 229
    .line 230
    .line 231
    iput v1, p0, LT5/y;->d:I

    .line 232
    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :cond_a
    :goto_6
    return-void
.end method

.method public final d(Lu6/t;LJ5/m;LT5/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, LT5/y;->a:LT5/x;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LT5/x;->d(Lu6/t;LJ5/m;LT5/B;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, LT5/y;->f:Z

    .line 8
    .line 9
    return-void
.end method
