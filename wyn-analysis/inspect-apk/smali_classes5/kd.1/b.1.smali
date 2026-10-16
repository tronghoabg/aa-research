.class public Lkd/b;
.super Luc/w;
.source "SourceFile"


# virtual methods
.method public f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/16 v0, -0x7f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/Long;

    .line 11
    .line 12
    if-eqz p1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-object v0, Lkd/p;->b:Lae/d;

    .line 19
    .line 20
    long-to-int p1, p1

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkd/p;->values()[Lkd/p;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    array-length v0, p2

    .line 29
    :goto_0
    if-ge v1, v0, :cond_9

    .line 30
    .line 31
    aget-object v2, p2, v1

    .line 32
    .line 33
    iget v3, v2, Lkd/p;->a:I

    .line 34
    .line 35
    if-ne v3, p1, :cond_0

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/16 v0, -0x7e

    .line 42
    .line 43
    if-ne p1, v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz p1, :cond_9

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    sget-object v0, Lkd/j;->b:Lad/I;

    .line 58
    .line 59
    long-to-int p1, p1

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkd/j;->values()[Lkd/j;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    array-length v0, p2

    .line 68
    :goto_1
    if-ge v1, v0, :cond_9

    .line 69
    .line 70
    aget-object v2, p2, v1

    .line 71
    .line 72
    iget v3, v2, Lkd/j;->a:I

    .line 73
    .line 74
    if-ne v3, p1, :cond_2

    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/16 v0, -0x7d

    .line 81
    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Long;

    .line 89
    .line 90
    if-eqz p1, :cond_9

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    sget-object v0, Lkd/v;->b:La9/b;

    .line 97
    .line 98
    long-to-int p1, p1

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lkd/v;->values()[Lkd/v;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    array-length v0, p2

    .line 107
    :goto_2
    if-ge v1, v0, :cond_9

    .line 108
    .line 109
    aget-object v2, p2, v1

    .line 110
    .line 111
    iget v3, v2, Lkd/v;->a:I

    .line 112
    .line 113
    if-ne v3, p1, :cond_4

    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const/16 v0, -0x7c

    .line 120
    .line 121
    if-ne p1, v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide p1

    .line 135
    sget-object v0, Lkd/L;->b:Lad/I;

    .line 136
    .line 137
    long-to-int p1, p1

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lkd/L;->values()[Lkd/L;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    array-length v0, p2

    .line 146
    :goto_3
    if-ge v1, v0, :cond_9

    .line 147
    .line 148
    aget-object v2, p2, v1

    .line 149
    .line 150
    iget v3, v2, Lkd/L;->a:I

    .line 151
    .line 152
    if-ne v3, p1, :cond_6

    .line 153
    .line 154
    return-object v2

    .line 155
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    const/16 v0, -0x7b

    .line 159
    .line 160
    if-ne p1, v0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Ljava/lang/Long;

    .line 167
    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide p1

    .line 174
    sget-object v0, Lkd/u;->b:La9/a;

    .line 175
    .line 176
    long-to-int p1, p1

    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lkd/u;->values()[Lkd/u;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    array-length v0, p2

    .line 185
    :goto_4
    if-ge v1, v0, :cond_9

    .line 186
    .line 187
    aget-object v2, p2, v1

    .line 188
    .line 189
    iget v3, v2, Lkd/u;->a:I

    .line 190
    .line 191
    if-ne v3, p1, :cond_8

    .line 192
    .line 193
    return-object v2

    .line 194
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_9
    const/4 p1, 0x0

    .line 198
    return-object p1

    .line 199
    :cond_a
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    return-object p1
.end method

.method public k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "stream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lkd/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x81

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    check-cast p2, Lkd/p;

    .line 16
    .line 17
    iget p2, p2, Lkd/p;->a:I

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p0, p1, p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    instance-of v0, p2, Lkd/j;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/16 v0, 0x82

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 34
    .line 35
    .line 36
    check-cast p2, Lkd/j;

    .line 37
    .line 38
    iget p2, p2, Lkd/j;->a:I

    .line 39
    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p0, p1, p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    instance-of v0, p2, Lkd/v;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const/16 v0, 0x83

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 55
    .line 56
    .line 57
    check-cast p2, Lkd/v;

    .line 58
    .line 59
    iget p2, p2, Lkd/v;->a:I

    .line 60
    .line 61
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p0, p1, p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    instance-of v0, p2, Lkd/L;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    const/16 v0, 0x84

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 76
    .line 77
    .line 78
    check-cast p2, Lkd/L;

    .line 79
    .line 80
    iget p2, p2, Lkd/L;->a:I

    .line 81
    .line 82
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p0, p1, p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    instance-of v0, p2, Lkd/u;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    const/16 v0, 0x85

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 97
    .line 98
    .line 99
    check-cast p2, Lkd/u;

    .line 100
    .line 101
    iget p2, p2, Lkd/u;->a:I

    .line 102
    .line 103
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    throw p1

    .line 113
    :cond_4
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
