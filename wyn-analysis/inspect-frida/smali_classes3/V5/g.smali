.class public final LV5/g;
.super LH5/h;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:I

.field public k:I


# virtual methods
.method public final o()V
    .locals 1

    .line 1
    invoke-super {p0}, LH5/h;->o()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LV5/g;->j:I

    .line 6
    .line 7
    return-void
.end method

.method public final t(LH5/h;)Z
    .locals 5

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 10
    .line 11
    .line 12
    const/high16 v0, 0x10000000

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    xor-int/2addr v0, v1

    .line 19
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    xor-int/2addr v0, v1

    .line 28
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, LV5/g;->j:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    move v3, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v2

    .line 39
    :goto_0
    const/high16 v4, -0x80000000

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    iget v3, p0, LV5/g;->k:I

    .line 45
    .line 46
    if-lt v0, v3, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p1, v4}, LH5/a;->h(I)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p0, v4}, LH5/a;->h(I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v0, v3, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iget-object v0, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v3, p0, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v0, v3

    .line 77
    const v3, 0x2ee000

    .line 78
    .line 79
    .line 80
    if-le v0, v3, :cond_4

    .line 81
    .line 82
    :goto_1
    return v2

    .line 83
    :cond_4
    :goto_2
    iget v0, p0, LV5/g;->j:I

    .line 84
    .line 85
    add-int/lit8 v2, v0, 0x1

    .line 86
    .line 87
    iput v2, p0, LV5/g;->j:I

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-wide v2, p1, LH5/h;->f:J

    .line 92
    .line 93
    iput-wide v2, p0, LH5/h;->f:J

    .line 94
    .line 95
    invoke-virtual {p1, v1}, LH5/a;->h(I)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    iput v1, p0, LH5/a;->b:I

    .line 102
    .line 103
    :cond_5
    invoke-virtual {p1, v4}, LH5/a;->h(I)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    iput v4, p0, LH5/a;->b:I

    .line 110
    .line 111
    :cond_6
    iget-object v0, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-virtual {p0, v2}, LH5/h;->r(I)V

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    .line 127
    :cond_7
    iget-wide v2, p1, LH5/h;->f:J

    .line 128
    .line 129
    iput-wide v2, p0, LV5/g;->i:J

    .line 130
    .line 131
    return v1
.end method
