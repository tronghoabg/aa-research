.class public final Lt0/Q;
.super LE9/c;
.source "SourceFile"


# virtual methods
.method public final l(ILjava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Lt0/t;

    .line 2
    .line 3
    const-string v0, "instance"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lt0/t;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p2, Lt0/t;->f:Lt0/t;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const-string v3, " Other tree: "

    .line 19
    .line 20
    const-string v4, "Cannot insert "

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v1, :cond_8

    .line 24
    .line 25
    iget-object v1, p2, Lt0/t;->g:Lu0/n;

    .line 26
    .line 27
    if-nez v1, :cond_7

    .line 28
    .line 29
    iput-object v0, p2, Lt0/t;->f:Lt0/t;

    .line 30
    .line 31
    iget-object v1, v0, Lt0/t;->c:LP/d;

    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, LP/d;->a(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lt0/t;->x()V

    .line 37
    .line 38
    .line 39
    iget-boolean p1, v0, Lt0/t;->a:Z

    .line 40
    .line 41
    iget-boolean v1, p2, Lt0/t;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    iget v3, v0, Lt0/t;->b:I

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v0, Lt0/t;->b:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    const-string p2, "Virtual LayoutNode can\'t be added into a virtual parent"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lt0/t;->q()V

    .line 63
    .line 64
    .line 65
    iget-object v3, p2, Lt0/t;->y:Lt0/F;

    .line 66
    .line 67
    iget-object v3, v3, Lt0/F;->f:Lt0/y;

    .line 68
    .line 69
    iget-object v4, v0, Lt0/t;->x:Lt0/i;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object p1, v0, Lt0/t;->f:Lt0/t;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    iget-object v5, p1, Lt0/t;->x:Lt0/i;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move-object v5, v4

    .line 81
    :cond_3
    :goto_1
    iput-object v5, v3, Lt0/y;->f:Lt0/y;

    .line 82
    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    iget-object p1, p2, Lt0/t;->c:LP/d;

    .line 86
    .line 87
    iget v1, p1, LP/d;->c:I

    .line 88
    .line 89
    if-lez v1, :cond_5

    .line 90
    .line 91
    iget-object p1, p1, LP/d;->a:[Ljava/lang/Object;

    .line 92
    .line 93
    :cond_4
    aget-object v3, p1, v2

    .line 94
    .line 95
    check-cast v3, Lt0/t;

    .line 96
    .line 97
    iget-object v3, v3, Lt0/t;->y:Lt0/F;

    .line 98
    .line 99
    iget-object v3, v3, Lt0/F;->f:Lt0/y;

    .line 100
    .line 101
    iput-object v4, v3, Lt0/y;->f:Lt0/y;

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    if-lt v2, v1, :cond_4

    .line 106
    .line 107
    :cond_5
    iget-object p1, v0, Lt0/t;->g:Lu0/n;

    .line 108
    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Lt0/t;->b(Lu0/n;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    return-void

    .line 115
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, " because it already has an owner. This tree: "

    .line 124
    .line 125
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lt0/t;->f(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v2}, Lt0/t;->f(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p2

    .line 159
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, " because it already has a parent. This tree: "

    .line 168
    .line 169
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v2}, Lt0/t;->f(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object p2, p2, Lt0/t;->f:Lt0/t;

    .line 183
    .line 184
    if-eqz p2, :cond_9

    .line 185
    .line 186
    invoke-virtual {p2, v2}, Lt0/t;->f(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    :cond_9
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p2
.end method

.method public final m(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lt0/t;

    .line 2
    .line 3
    const-string p1, "instance"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(III)V
    .locals 6

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-ne p1, p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, p3, :cond_3

    .line 14
    .line 15
    if-le p1, p2, :cond_1

    .line 16
    .line 17
    add-int v3, p1, v2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v3, p1

    .line 21
    :goto_1
    if-le p1, p2, :cond_2

    .line 22
    .line 23
    add-int v4, p2, v2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    add-int v4, p2, p3

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x2

    .line 29
    .line 30
    :goto_2
    iget-object v5, v0, Lt0/t;->c:LP/d;

    .line 31
    .line 32
    invoke-virtual {v5, v3}, LP/d;->m(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lt0/t;

    .line 37
    .line 38
    invoke-virtual {v5, v4, v3}, LP/d;->a(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {v0}, Lt0/t;->x()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lt0/t;->q()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lt0/t;->z(Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/t;

    .line 4
    .line 5
    iget-object v1, v0, Lt0/t;->c:LP/d;

    .line 6
    .line 7
    iget v2, v1, LP/d;->c:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    :goto_0
    const/4 v3, -0x1

    .line 12
    if-ge v3, v2, :cond_0

    .line 13
    .line 14
    iget-object v3, v1, LP/d;->a:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v3, v3, v2

    .line 17
    .line 18
    check-cast v3, Lt0/t;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lt0/t;->w(Lt0/t;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1}, LP/d;->e()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/t;

    .line 4
    .line 5
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lu0/n;->m()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final r(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-ltz p2, :cond_1

    .line 9
    .line 10
    add-int/2addr p2, p1

    .line 11
    add-int/lit8 p2, p2, -0x1

    .line 12
    .line 13
    if-gt p1, p2, :cond_0

    .line 14
    .line 15
    :goto_0
    iget-object v1, v0, Lt0/t;->c:LP/d;

    .line 16
    .line 17
    invoke-virtual {v1, p2}, LP/d;->m(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lt0/t;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lt0/t;->w(Lt0/t;)V

    .line 24
    .line 25
    .line 26
    if-eq p2, p1, :cond_0

    .line 27
    .line 28
    add-int/lit8 p2, p2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    const-string p1, "count ("

    .line 33
    .line 34
    const-string v0, ") must be greater than 0"

    .line 35
    .line 36
    invoke-static {p2, p1, v0}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p2
.end method
