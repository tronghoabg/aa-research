.class public final Li6/f;
.super Li6/h;
.source "SourceFile"


# instance fields
.field public final g:LY4/b;

.field public final h:LJ5/y;

.field public i:I

.field public final j:I

.field public final k:[Li6/e;

.field public l:Li6/e;

.field public m:Ljava/util/List;

.field public n:Ljava/util/List;

.field public o:LJ5/y;

.field public p:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Li6/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li6/f;->g:LY4/b;

    .line 10
    .line 11
    new-instance v0, LJ5/y;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1}, LJ5/y;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Li6/f;->h:LJ5/y;

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Li6/f;->i:I

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    move p1, v1

    .line 26
    :cond_0
    iput p1, p0, Li6/f;->j:I

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [B

    .line 42
    .line 43
    array-length v0, v0

    .line 44
    if-ne v0, v1, :cond_1

    .line 45
    .line 46
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, [B

    .line 51
    .line 52
    aget-byte p2, p2, p1

    .line 53
    .line 54
    :cond_1
    const/16 p2, 0x8

    .line 55
    .line 56
    new-array v0, p2, [Li6/e;

    .line 57
    .line 58
    iput-object v0, p0, Li6/f;->k:[Li6/e;

    .line 59
    .line 60
    move v0, p1

    .line 61
    :goto_0
    if-ge v0, p2, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Li6/f;->k:[Li6/e;

    .line 64
    .line 65
    new-instance v2, Li6/e;

    .line 66
    .line 67
    invoke-direct {v2}, Li6/e;-><init>()V

    .line 68
    .line 69
    .line 70
    aput-object v2, v1, v0

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object p2, p0, Li6/f;->k:[Li6/e;

    .line 76
    .line 77
    aget-object p1, p2, p1

    .line 78
    .line 79
    iput-object p1, p0, Li6/f;->l:Li6/e;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final e()Li6/i;
    .locals 3

    .line 1
    iget-object v0, p0, Li6/f;->m:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Li6/f;->n:Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Li6/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/util/List;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, v0}, Li6/i;-><init>(ILjava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public final f(Li6/g;)V
    .locals 10

    .line 1
    iget-object p1, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v1, p0, Li6/f;->g:LY4/b;

    .line 15
    .line 16
    invoke-virtual {v1, p1, v0}, LY4/b;->y(I[B)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x3

    .line 24
    if-lt p1, v0, :cond_9

    .line 25
    .line 26
    invoke-virtual {v1}, LY4/b;->q()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    and-int/lit8 v2, p1, 0x3

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    and-int/2addr p1, v3

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-ne p1, v3, :cond_1

    .line 37
    .line 38
    move p1, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p1, v5

    .line 41
    :goto_1
    invoke-virtual {v1}, LY4/b;->q()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    int-to-byte v6, v6

    .line 46
    invoke-virtual {v1}, LY4/b;->q()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    int-to-byte v7, v7

    .line 51
    const/4 v8, 0x2

    .line 52
    if-eq v2, v8, :cond_2

    .line 53
    .line 54
    if-eq v2, v0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string p1, "Cea708Decoder"

    .line 61
    .line 62
    if-ne v2, v0, :cond_6

    .line 63
    .line 64
    invoke-virtual {p0}, Li6/f;->i()V

    .line 65
    .line 66
    .line 67
    and-int/lit16 v0, v6, 0xc0

    .line 68
    .line 69
    shr-int/lit8 v0, v0, 0x6

    .line 70
    .line 71
    iget v2, p0, Li6/f;->i:I

    .line 72
    .line 73
    const/4 v9, -0x1

    .line 74
    if-eq v2, v9, :cond_4

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    rem-int/2addr v2, v3

    .line 79
    if-eq v0, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Li6/f;->k()V

    .line 82
    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v3, "Sequence number discontinuity. previous="

    .line 87
    .line 88
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget v3, p0, Li6/f;->i:I

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v3, " current="

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {p1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iput v0, p0, Li6/f;->i:I

    .line 112
    .line 113
    and-int/lit8 p1, v6, 0x3f

    .line 114
    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    const/16 p1, 0x40

    .line 118
    .line 119
    :cond_5
    new-instance v2, LJ5/y;

    .line 120
    .line 121
    const/4 v3, 0x4

    .line 122
    invoke-direct {v2, v0, p1, v3}, LJ5/y;-><init>(III)V

    .line 123
    .line 124
    .line 125
    iput-object v2, p0, Li6/f;->o:LJ5/y;

    .line 126
    .line 127
    iput v4, v2, LJ5/y;->e:I

    .line 128
    .line 129
    iget-object p1, v2, LJ5/y;->b:[B

    .line 130
    .line 131
    aput-byte v7, p1, v5

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    if-ne v2, v8, :cond_7

    .line 135
    .line 136
    move v5, v4

    .line 137
    :cond_7
    invoke-static {v5}, Lu6/a;->e(Z)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Li6/f;->o:LJ5/y;

    .line 141
    .line 142
    if-nez v0, :cond_8

    .line 143
    .line 144
    const-string v0, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"

    .line 145
    .line 146
    invoke-static {p1, v0}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_8
    iget-object p1, v0, LJ5/y;->b:[B

    .line 152
    .line 153
    iget v2, v0, LJ5/y;->e:I

    .line 154
    .line 155
    add-int/lit8 v3, v2, 0x1

    .line 156
    .line 157
    iput v3, v0, LJ5/y;->e:I

    .line 158
    .line 159
    aput-byte v6, p1, v2

    .line 160
    .line 161
    add-int/2addr v2, v8

    .line 162
    iput v2, v0, LJ5/y;->e:I

    .line 163
    .line 164
    aput-byte v7, p1, v3

    .line 165
    .line 166
    :goto_2
    iget-object p1, p0, Li6/f;->o:LJ5/y;

    .line 167
    .line 168
    iget v0, p1, LJ5/y;->e:I

    .line 169
    .line 170
    iget p1, p1, LJ5/y;->d:I

    .line 171
    .line 172
    mul-int/2addr p1, v8

    .line 173
    sub-int/2addr p1, v4

    .line 174
    if-ne v0, p1, :cond_0

    .line 175
    .line 176
    invoke-virtual {p0}, Li6/f;->i()V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_9
    return-void
.end method

.method public final flush()V
    .locals 3

    .line 1
    invoke-super {p0}, Li6/h;->flush()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Li6/f;->m:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Li6/f;->n:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, p0, Li6/f;->p:I

    .line 11
    .line 12
    iget-object v2, p0, Li6/f;->k:[Li6/e;

    .line 13
    .line 14
    aget-object v1, v2, v1

    .line 15
    .line 16
    iput-object v1, p0, Li6/f;->l:Li6/e;

    .line 17
    .line 18
    invoke-virtual {p0}, Li6/f;->k()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Li6/f;->o:LJ5/y;

    .line 22
    .line 23
    return-void
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li6/f;->m:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Li6/f;->n:Ljava/util/List;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final i()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li6/f;->o:LJ5/y;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v2, v1, LJ5/y;->e:I

    .line 9
    .line 10
    iget v1, v1, LJ5/y;->d:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    mul-int/2addr v1, v3

    .line 14
    const/4 v4, 0x1

    .line 15
    sub-int/2addr v1, v4

    .line 16
    const-string v5, "Cea708Decoder"

    .line 17
    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "DtvCcPacket ended prematurely; size is "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Li6/f;->o:LJ5/y;

    .line 28
    .line 29
    iget v2, v2, LJ5/y;->d:I

    .line 30
    .line 31
    mul-int/2addr v2, v3

    .line 32
    sub-int/2addr v2, v4

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ", but current index is "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Li6/f;->o:LJ5/y;

    .line 42
    .line 43
    iget v2, v2, LJ5/y;->e:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " (sequence number "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, Li6/f;->o:LJ5/y;

    .line 54
    .line 55
    iget v2, v2, LJ5/y;->c:I

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ");"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v5, v1}, Lu6/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v1, v0, Li6/f;->o:LJ5/y;

    .line 73
    .line 74
    iget-object v2, v1, LJ5/y;->b:[B

    .line 75
    .line 76
    iget v1, v1, LJ5/y;->e:I

    .line 77
    .line 78
    iget-object v6, v0, Li6/f;->h:LJ5/y;

    .line 79
    .line 80
    invoke-virtual {v6, v1, v2}, LJ5/y;->o(I[B)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    :cond_2
    :goto_0
    invoke-virtual {v6}, LJ5/y;->b()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-lez v7, :cond_39

    .line 89
    .line 90
    const/4 v7, 0x3

    .line 91
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v9, 0x5

    .line 96
    invoke-virtual {v6, v9}, LJ5/y;->i(I)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    const/4 v10, 0x6

    .line 101
    const/4 v11, 0x7

    .line 102
    if-ne v8, v11, :cond_3

    .line 103
    .line 104
    invoke-virtual {v6, v3}, LJ5/y;->t(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v10}, LJ5/y;->i(I)I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-ge v8, v11, :cond_3

    .line 112
    .line 113
    const-string v12, "Invalid extended service number: "

    .line 114
    .line 115
    invoke-static {v8, v12, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    if-nez v9, :cond_4

    .line 119
    .line 120
    if-eqz v8, :cond_39

    .line 121
    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v3, "serviceNumber is non-zero ("

    .line 125
    .line 126
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v3, ") when blockSize is 0"

    .line 133
    .line 134
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v5, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_19

    .line 145
    .line 146
    :cond_4
    iget v12, v0, Li6/f;->j:I

    .line 147
    .line 148
    if-eq v8, v12, :cond_5

    .line 149
    .line 150
    invoke-virtual {v6, v9}, LJ5/y;->u(I)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_5
    invoke-virtual {v6}, LJ5/y;->g()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    mul-int/lit8 v9, v9, 0x8

    .line 159
    .line 160
    add-int/2addr v9, v8

    .line 161
    :goto_1
    invoke-virtual {v6}, LJ5/y;->g()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-ge v8, v9, :cond_2

    .line 166
    .line 167
    const/16 v8, 0x8

    .line 168
    .line 169
    invoke-virtual {v6, v8}, LJ5/y;->i(I)I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    const/16 v15, 0x17

    .line 174
    .line 175
    const/16 v13, 0x9f

    .line 176
    .line 177
    const/16 v1, 0x7f

    .line 178
    .line 179
    const/16 v14, 0x18

    .line 180
    .line 181
    const/16 v4, 0x1f

    .line 182
    .line 183
    const/16 v10, 0x10

    .line 184
    .line 185
    if-eq v12, v10, :cond_23

    .line 186
    .line 187
    const/16 v11, 0xa

    .line 188
    .line 189
    if-gt v12, v4, :cond_b

    .line 190
    .line 191
    if-eqz v12, :cond_a

    .line 192
    .line 193
    if-eq v12, v7, :cond_9

    .line 194
    .line 195
    if-eq v12, v8, :cond_8

    .line 196
    .line 197
    packed-switch v12, :pswitch_data_0

    .line 198
    .line 199
    .line 200
    const/16 v1, 0x11

    .line 201
    .line 202
    if-lt v12, v1, :cond_6

    .line 203
    .line 204
    if-gt v12, v15, :cond_6

    .line 205
    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v4, "Currently unsupported COMMAND_EXT1 Command: "

    .line 209
    .line 210
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v5, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_6
    if-lt v12, v14, :cond_7

    .line 228
    .line 229
    if-gt v12, v4, :cond_7

    .line 230
    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v4, "Currently unsupported COMMAND_P16 Command: "

    .line 234
    .line 235
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v5, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_7
    const-string v1, "Invalid C0 command: "

    .line 253
    .line 254
    invoke-static {v12, v1, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :pswitch_0
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 259
    .line 260
    invoke-virtual {v1, v11}, Li6/e;->a(C)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :pswitch_1
    invoke-virtual {v0}, Li6/f;->k()V

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_8
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 269
    .line 270
    iget-object v1, v1, Li6/e;->b:Landroid/text/SpannableStringBuilder;

    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-lez v4, :cond_a

    .line 277
    .line 278
    add-int/lit8 v8, v4, -0x1

    .line 279
    .line 280
    invoke-virtual {v1, v8, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_9
    invoke-virtual {v0}, Li6/f;->j()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    iput-object v1, v0, Li6/f;->m:Ljava/util/List;

    .line 289
    .line 290
    :cond_a
    :goto_2
    :pswitch_2
    move v1, v3

    .line 291
    goto :goto_4

    .line 292
    :cond_b
    if-gt v12, v1, :cond_d

    .line 293
    .line 294
    if-ne v12, v1, :cond_c

    .line 295
    .line 296
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 297
    .line 298
    const/16 v2, 0x266b

    .line 299
    .line 300
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 301
    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_c
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 305
    .line 306
    and-int/lit16 v2, v12, 0xff

    .line 307
    .line 308
    int-to-char v2, v2

    .line 309
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 310
    .line 311
    .line 312
    :goto_3
    move v1, v3

    .line 313
    const/4 v2, 0x1

    .line 314
    :goto_4
    const/4 v3, 0x7

    .line 315
    const/4 v7, 0x1

    .line 316
    const/4 v10, 0x6

    .line 317
    const/4 v11, 0x0

    .line 318
    goto/16 :goto_18

    .line 319
    .line 320
    :cond_d
    if-gt v12, v13, :cond_21

    .line 321
    .line 322
    const/4 v1, 0x4

    .line 323
    iget-object v2, v0, Li6/f;->k:[Li6/e;

    .line 324
    .line 325
    packed-switch v12, :pswitch_data_1

    .line 326
    .line 327
    .line 328
    :pswitch_3
    const-string v1, "Invalid C1 command: "

    .line 329
    .line 330
    invoke-static {v12, v1, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :pswitch_4
    move v3, v7

    .line 334
    :cond_e
    :goto_5
    const/4 v7, 0x1

    .line 335
    :cond_f
    const/4 v11, 0x0

    .line 336
    goto/16 :goto_12

    .line 337
    .line 338
    :pswitch_5
    add-int/lit16 v12, v12, -0x98

    .line 339
    .line 340
    aget-object v4, v2, v12

    .line 341
    .line 342
    invoke-virtual {v6, v3}, LJ5/y;->t(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 354
    .line 355
    .line 356
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    const/4 v15, 0x7

    .line 365
    invoke-virtual {v6, v15}, LJ5/y;->i(I)I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    invoke-virtual {v6, v8}, LJ5/y;->i(I)I

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 374
    .line 375
    .line 376
    move-result v15

    .line 377
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    invoke-virtual {v6, v3}, LJ5/y;->t(I)V

    .line 382
    .line 383
    .line 384
    move/from16 v16, v1

    .line 385
    .line 386
    const/4 v1, 0x6

    .line 387
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6, v3}, LJ5/y;->t(I)V

    .line 391
    .line 392
    .line 393
    const/4 v1, 0x3

    .line 394
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    move-object/from16 v18, v2

    .line 399
    .line 400
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    const/4 v1, 0x1

    .line 405
    iput-boolean v1, v4, Li6/e;->c:Z

    .line 406
    .line 407
    iput-boolean v10, v4, Li6/e;->d:Z

    .line 408
    .line 409
    iput-boolean v11, v4, Li6/e;->k:Z

    .line 410
    .line 411
    iput v13, v4, Li6/e;->e:I

    .line 412
    .line 413
    iput-boolean v14, v4, Li6/e;->f:Z

    .line 414
    .line 415
    iput v7, v4, Li6/e;->g:I

    .line 416
    .line 417
    iput v8, v4, Li6/e;->h:I

    .line 418
    .line 419
    iput v15, v4, Li6/e;->i:I

    .line 420
    .line 421
    iget v7, v4, Li6/e;->j:I

    .line 422
    .line 423
    add-int/lit8 v8, v16, 0x1

    .line 424
    .line 425
    if-eq v7, v8, :cond_12

    .line 426
    .line 427
    iput v8, v4, Li6/e;->j:I

    .line 428
    .line 429
    :goto_6
    iget-object v1, v4, Li6/e;->a:Ljava/util/ArrayList;

    .line 430
    .line 431
    if-eqz v11, :cond_11

    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    iget v8, v4, Li6/e;->j:I

    .line 438
    .line 439
    if-ge v7, v8, :cond_10

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_10
    :goto_7
    const/4 v7, 0x0

    .line 443
    goto :goto_9

    .line 444
    :cond_11
    :goto_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    const/16 v8, 0xf

    .line 449
    .line 450
    if-lt v7, v8, :cond_12

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :goto_9
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_12
    if-eqz v3, :cond_13

    .line 458
    .line 459
    iget v1, v4, Li6/e;->m:I

    .line 460
    .line 461
    if-eq v1, v3, :cond_13

    .line 462
    .line 463
    iput v3, v4, Li6/e;->m:I

    .line 464
    .line 465
    add-int/lit8 v3, v3, -0x1

    .line 466
    .line 467
    sget-object v1, Li6/e;->C:[I

    .line 468
    .line 469
    aget v1, v1, v3

    .line 470
    .line 471
    sget-object v7, Li6/e;->B:[Z

    .line 472
    .line 473
    aget-boolean v7, v7, v3

    .line 474
    .line 475
    sget-object v7, Li6/e;->z:[I

    .line 476
    .line 477
    aget v7, v7, v3

    .line 478
    .line 479
    sget-object v7, Li6/e;->A:[I

    .line 480
    .line 481
    aget v7, v7, v3

    .line 482
    .line 483
    sget-object v7, Li6/e;->y:[I

    .line 484
    .line 485
    aget v3, v7, v3

    .line 486
    .line 487
    iput v1, v4, Li6/e;->o:I

    .line 488
    .line 489
    iput v3, v4, Li6/e;->l:I

    .line 490
    .line 491
    :cond_13
    if-eqz v2, :cond_14

    .line 492
    .line 493
    iget v1, v4, Li6/e;->n:I

    .line 494
    .line 495
    if-eq v1, v2, :cond_14

    .line 496
    .line 497
    iput v2, v4, Li6/e;->n:I

    .line 498
    .line 499
    add-int/lit8 v2, v2, -0x1

    .line 500
    .line 501
    sget-object v1, Li6/e;->E:[I

    .line 502
    .line 503
    aget v1, v1, v2

    .line 504
    .line 505
    sget-object v1, Li6/e;->D:[I

    .line 506
    .line 507
    aget v1, v1, v2

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    invoke-virtual {v4, v7, v7}, Li6/e;->e(ZZ)V

    .line 511
    .line 512
    .line 513
    sget-object v1, Li6/e;->F:[I

    .line 514
    .line 515
    aget v1, v1, v2

    .line 516
    .line 517
    sget v2, Li6/e;->w:I

    .line 518
    .line 519
    invoke-virtual {v4, v2, v1}, Li6/e;->f(II)V

    .line 520
    .line 521
    .line 522
    :cond_14
    iget v1, v0, Li6/f;->p:I

    .line 523
    .line 524
    if-eq v1, v12, :cond_15

    .line 525
    .line 526
    iput v12, v0, Li6/f;->p:I

    .line 527
    .line 528
    aget-object v1, v18, v12

    .line 529
    .line 530
    iput-object v1, v0, Li6/f;->l:Li6/e;

    .line 531
    .line 532
    :cond_15
    :goto_a
    const/4 v3, 0x3

    .line 533
    goto/16 :goto_5

    .line 534
    .line 535
    :pswitch_6
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 536
    .line 537
    iget-boolean v1, v1, Li6/e;->c:Z

    .line 538
    .line 539
    if-nez v1, :cond_16

    .line 540
    .line 541
    const/16 v1, 0x20

    .line 542
    .line 543
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 544
    .line 545
    .line 546
    goto :goto_a

    .line 547
    :cond_16
    const/4 v1, 0x2

    .line 548
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    invoke-static {v3, v4, v7, v2}, Li6/e;->c(IIII)I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 569
    .line 570
    .line 571
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 580
    .line 581
    .line 582
    move-result v7

    .line 583
    const/4 v10, 0x0

    .line 584
    invoke-static {v3, v4, v7, v10}, Li6/e;->c(IIII)I

    .line 585
    .line 586
    .line 587
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 588
    .line 589
    .line 590
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 591
    .line 592
    .line 593
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 597
    .line 598
    .line 599
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 604
    .line 605
    .line 606
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 607
    .line 608
    iput v2, v1, Li6/e;->o:I

    .line 609
    .line 610
    iput v3, v1, Li6/e;->l:I

    .line 611
    .line 612
    goto :goto_a

    .line 613
    :pswitch_7
    iget-object v2, v0, Li6/f;->l:Li6/e;

    .line 614
    .line 615
    iget-boolean v2, v2, Li6/e;->c:Z

    .line 616
    .line 617
    if-nez v2, :cond_17

    .line 618
    .line 619
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 620
    .line 621
    .line 622
    goto :goto_a

    .line 623
    :cond_17
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    const/4 v2, 0x2

    .line 631
    invoke-virtual {v6, v2}, LJ5/y;->t(I)V

    .line 632
    .line 633
    .line 634
    const/4 v2, 0x6

    .line 635
    invoke-virtual {v6, v2}, LJ5/y;->i(I)I

    .line 636
    .line 637
    .line 638
    iget-object v2, v0, Li6/f;->l:Li6/e;

    .line 639
    .line 640
    iget v3, v2, Li6/e;->v:I

    .line 641
    .line 642
    if-eq v3, v1, :cond_18

    .line 643
    .line 644
    invoke-virtual {v2, v11}, Li6/e;->a(C)V

    .line 645
    .line 646
    .line 647
    :cond_18
    iput v1, v2, Li6/e;->v:I

    .line 648
    .line 649
    goto :goto_a

    .line 650
    :pswitch_8
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 651
    .line 652
    iget-boolean v1, v1, Li6/e;->c:Z

    .line 653
    .line 654
    if-nez v1, :cond_19

    .line 655
    .line 656
    invoke-virtual {v6, v14}, LJ5/y;->t(I)V

    .line 657
    .line 658
    .line 659
    goto :goto_a

    .line 660
    :cond_19
    const/4 v1, 0x2

    .line 661
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    invoke-static {v3, v4, v7, v2}, Li6/e;->c(IIII)I

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 686
    .line 687
    .line 688
    move-result v4

    .line 689
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 694
    .line 695
    .line 696
    move-result v8

    .line 697
    invoke-static {v4, v7, v8, v3}, Li6/e;->c(IIII)I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    const/4 v10, 0x0

    .line 717
    invoke-static {v4, v7, v8, v10}, Li6/e;->c(IIII)I

    .line 718
    .line 719
    .line 720
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 721
    .line 722
    invoke-virtual {v1, v2, v3}, Li6/e;->f(II)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_a

    .line 726
    .line 727
    :pswitch_9
    iget-object v2, v0, Li6/f;->l:Li6/e;

    .line 728
    .line 729
    iget-boolean v2, v2, Li6/e;->c:Z

    .line 730
    .line 731
    if-nez v2, :cond_1a

    .line 732
    .line 733
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_a

    .line 737
    .line 738
    :cond_1a
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 739
    .line 740
    .line 741
    const/4 v1, 0x2

    .line 742
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 743
    .line 744
    .line 745
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 746
    .line 747
    .line 748
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    const/4 v3, 0x3

    .line 757
    invoke-virtual {v6, v3}, LJ5/y;->i(I)I

    .line 758
    .line 759
    .line 760
    invoke-virtual {v6, v3}, LJ5/y;->i(I)I

    .line 761
    .line 762
    .line 763
    iget-object v4, v0, Li6/f;->l:Li6/e;

    .line 764
    .line 765
    invoke-virtual {v4, v1, v2}, Li6/e;->e(ZZ)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_5

    .line 769
    .line 770
    :pswitch_a
    move v3, v7

    .line 771
    invoke-virtual {v0}, Li6/f;->k()V

    .line 772
    .line 773
    .line 774
    goto/16 :goto_5

    .line 775
    .line 776
    :pswitch_b
    move v3, v7

    .line 777
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 778
    .line 779
    .line 780
    goto/16 :goto_5

    .line 781
    .line 782
    :pswitch_c
    move-object/from16 v18, v2

    .line 783
    .line 784
    move v3, v7

    .line 785
    const/4 v1, 0x1

    .line 786
    :goto_b
    if-gt v1, v8, :cond_e

    .line 787
    .line 788
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    if-eqz v2, :cond_1b

    .line 793
    .line 794
    rsub-int/lit8 v2, v1, 0x8

    .line 795
    .line 796
    aget-object v2, v18, v2

    .line 797
    .line 798
    invoke-virtual {v2}, Li6/e;->d()V

    .line 799
    .line 800
    .line 801
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 802
    .line 803
    goto :goto_b

    .line 804
    :pswitch_d
    move-object/from16 v18, v2

    .line 805
    .line 806
    move v3, v7

    .line 807
    const/4 v1, 0x1

    .line 808
    :goto_c
    if-gt v1, v8, :cond_e

    .line 809
    .line 810
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    if-eqz v2, :cond_1c

    .line 815
    .line 816
    rsub-int/lit8 v2, v1, 0x8

    .line 817
    .line 818
    aget-object v2, v18, v2

    .line 819
    .line 820
    iget-boolean v4, v2, Li6/e;->d:Z

    .line 821
    .line 822
    const/16 v17, 0x1

    .line 823
    .line 824
    xor-int/lit8 v4, v4, 0x1

    .line 825
    .line 826
    iput-boolean v4, v2, Li6/e;->d:Z

    .line 827
    .line 828
    :cond_1c
    add-int/lit8 v1, v1, 0x1

    .line 829
    .line 830
    goto :goto_c

    .line 831
    :pswitch_e
    move-object/from16 v18, v2

    .line 832
    .line 833
    move v3, v7

    .line 834
    const/4 v1, 0x1

    .line 835
    :goto_d
    if-gt v1, v8, :cond_e

    .line 836
    .line 837
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    if-eqz v2, :cond_1d

    .line 842
    .line 843
    rsub-int/lit8 v2, v1, 0x8

    .line 844
    .line 845
    aget-object v2, v18, v2

    .line 846
    .line 847
    const/4 v7, 0x0

    .line 848
    iput-boolean v7, v2, Li6/e;->d:Z

    .line 849
    .line 850
    :cond_1d
    add-int/lit8 v1, v1, 0x1

    .line 851
    .line 852
    goto :goto_d

    .line 853
    :pswitch_f
    move-object/from16 v18, v2

    .line 854
    .line 855
    move v3, v7

    .line 856
    const/4 v1, 0x1

    .line 857
    :goto_e
    if-gt v1, v8, :cond_e

    .line 858
    .line 859
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-eqz v2, :cond_1e

    .line 864
    .line 865
    rsub-int/lit8 v2, v1, 0x8

    .line 866
    .line 867
    aget-object v2, v18, v2

    .line 868
    .line 869
    const/4 v7, 0x1

    .line 870
    iput-boolean v7, v2, Li6/e;->d:Z

    .line 871
    .line 872
    goto :goto_f

    .line 873
    :cond_1e
    const/4 v7, 0x1

    .line 874
    :goto_f
    add-int/lit8 v1, v1, 0x1

    .line 875
    .line 876
    goto :goto_e

    .line 877
    :pswitch_10
    move-object/from16 v18, v2

    .line 878
    .line 879
    move v3, v7

    .line 880
    const/4 v7, 0x1

    .line 881
    move v1, v7

    .line 882
    :goto_10
    if-gt v1, v8, :cond_f

    .line 883
    .line 884
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    if-eqz v2, :cond_1f

    .line 889
    .line 890
    rsub-int/lit8 v2, v1, 0x8

    .line 891
    .line 892
    aget-object v2, v18, v2

    .line 893
    .line 894
    iget-object v4, v2, Li6/e;->a:Ljava/util/ArrayList;

    .line 895
    .line 896
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 897
    .line 898
    .line 899
    iget-object v4, v2, Li6/e;->b:Landroid/text/SpannableStringBuilder;

    .line 900
    .line 901
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 902
    .line 903
    .line 904
    const/4 v4, -0x1

    .line 905
    iput v4, v2, Li6/e;->p:I

    .line 906
    .line 907
    iput v4, v2, Li6/e;->q:I

    .line 908
    .line 909
    iput v4, v2, Li6/e;->r:I

    .line 910
    .line 911
    iput v4, v2, Li6/e;->t:I

    .line 912
    .line 913
    const/4 v11, 0x0

    .line 914
    iput v11, v2, Li6/e;->v:I

    .line 915
    .line 916
    goto :goto_11

    .line 917
    :cond_1f
    const/4 v11, 0x0

    .line 918
    :goto_11
    add-int/lit8 v1, v1, 0x1

    .line 919
    .line 920
    goto :goto_10

    .line 921
    :pswitch_11
    move-object/from16 v18, v2

    .line 922
    .line 923
    move v3, v7

    .line 924
    const/4 v7, 0x1

    .line 925
    const/4 v11, 0x0

    .line 926
    add-int/lit8 v12, v12, -0x80

    .line 927
    .line 928
    iget v1, v0, Li6/f;->p:I

    .line 929
    .line 930
    if-eq v1, v12, :cond_20

    .line 931
    .line 932
    iput v12, v0, Li6/f;->p:I

    .line 933
    .line 934
    aget-object v1, v18, v12

    .line 935
    .line 936
    iput-object v1, v0, Li6/f;->l:Li6/e;

    .line 937
    .line 938
    :cond_20
    :goto_12
    move v2, v7

    .line 939
    :goto_13
    const/4 v1, 0x2

    .line 940
    const/4 v3, 0x7

    .line 941
    :goto_14
    const/4 v10, 0x6

    .line 942
    goto/16 :goto_18

    .line 943
    .line 944
    :cond_21
    move v3, v7

    .line 945
    const/16 v1, 0xff

    .line 946
    .line 947
    const/4 v7, 0x1

    .line 948
    const/4 v11, 0x0

    .line 949
    if-gt v12, v1, :cond_22

    .line 950
    .line 951
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 952
    .line 953
    and-int/lit16 v2, v12, 0xff

    .line 954
    .line 955
    int-to-char v2, v2

    .line 956
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 957
    .line 958
    .line 959
    goto :goto_12

    .line 960
    :cond_22
    const-string v1, "Invalid base command: "

    .line 961
    .line 962
    invoke-static {v12, v1, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    goto :goto_13

    .line 966
    :cond_23
    move v3, v7

    .line 967
    const/4 v7, 0x1

    .line 968
    const/4 v11, 0x0

    .line 969
    invoke-virtual {v6, v8}, LJ5/y;->i(I)I

    .line 970
    .line 971
    .line 972
    move-result v12

    .line 973
    if-gt v12, v4, :cond_27

    .line 974
    .line 975
    const/4 v3, 0x7

    .line 976
    if-gt v12, v3, :cond_24

    .line 977
    .line 978
    goto/16 :goto_16

    .line 979
    .line 980
    :cond_24
    const/16 v1, 0xf

    .line 981
    .line 982
    if-gt v12, v1, :cond_25

    .line 983
    .line 984
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 985
    .line 986
    .line 987
    goto/16 :goto_16

    .line 988
    .line 989
    :cond_25
    if-gt v12, v15, :cond_26

    .line 990
    .line 991
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 992
    .line 993
    .line 994
    goto/16 :goto_16

    .line 995
    .line 996
    :cond_26
    if-gt v12, v4, :cond_32

    .line 997
    .line 998
    invoke-virtual {v6, v14}, LJ5/y;->t(I)V

    .line 999
    .line 1000
    .line 1001
    goto/16 :goto_16

    .line 1002
    .line 1003
    :cond_27
    const/4 v3, 0x7

    .line 1004
    const/16 v4, 0xa0

    .line 1005
    .line 1006
    if-gt v12, v1, :cond_33

    .line 1007
    .line 1008
    const/16 v1, 0x20

    .line 1009
    .line 1010
    if-eq v12, v1, :cond_31

    .line 1011
    .line 1012
    const/16 v1, 0x21

    .line 1013
    .line 1014
    if-eq v12, v1, :cond_30

    .line 1015
    .line 1016
    const/16 v1, 0x25

    .line 1017
    .line 1018
    if-eq v12, v1, :cond_2f

    .line 1019
    .line 1020
    const/16 v1, 0x2a

    .line 1021
    .line 1022
    if-eq v12, v1, :cond_2e

    .line 1023
    .line 1024
    const/16 v1, 0x2c

    .line 1025
    .line 1026
    if-eq v12, v1, :cond_2d

    .line 1027
    .line 1028
    const/16 v1, 0x3f

    .line 1029
    .line 1030
    if-eq v12, v1, :cond_2c

    .line 1031
    .line 1032
    const/16 v1, 0x39

    .line 1033
    .line 1034
    if-eq v12, v1, :cond_2b

    .line 1035
    .line 1036
    const/16 v1, 0x3a

    .line 1037
    .line 1038
    if-eq v12, v1, :cond_2a

    .line 1039
    .line 1040
    const/16 v1, 0x3c

    .line 1041
    .line 1042
    if-eq v12, v1, :cond_29

    .line 1043
    .line 1044
    const/16 v1, 0x3d

    .line 1045
    .line 1046
    if-eq v12, v1, :cond_28

    .line 1047
    .line 1048
    packed-switch v12, :pswitch_data_2

    .line 1049
    .line 1050
    .line 1051
    packed-switch v12, :pswitch_data_3

    .line 1052
    .line 1053
    .line 1054
    const-string v1, "Invalid G2 character: "

    .line 1055
    .line 1056
    invoke-static {v12, v1, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    goto/16 :goto_15

    .line 1060
    .line 1061
    :pswitch_12
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1062
    .line 1063
    const/16 v2, 0x250c

    .line 1064
    .line 1065
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1066
    .line 1067
    .line 1068
    goto/16 :goto_15

    .line 1069
    .line 1070
    :pswitch_13
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1071
    .line 1072
    const/16 v2, 0x2518

    .line 1073
    .line 1074
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1075
    .line 1076
    .line 1077
    goto/16 :goto_15

    .line 1078
    .line 1079
    :pswitch_14
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1080
    .line 1081
    const/16 v2, 0x2500

    .line 1082
    .line 1083
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1084
    .line 1085
    .line 1086
    goto/16 :goto_15

    .line 1087
    .line 1088
    :pswitch_15
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1089
    .line 1090
    const/16 v2, 0x2514

    .line 1091
    .line 1092
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1093
    .line 1094
    .line 1095
    goto/16 :goto_15

    .line 1096
    .line 1097
    :pswitch_16
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1098
    .line 1099
    const/16 v2, 0x2510

    .line 1100
    .line 1101
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1102
    .line 1103
    .line 1104
    goto/16 :goto_15

    .line 1105
    .line 1106
    :pswitch_17
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1107
    .line 1108
    const/16 v2, 0x2502

    .line 1109
    .line 1110
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_15

    .line 1114
    .line 1115
    :pswitch_18
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1116
    .line 1117
    const/16 v2, 0x215e

    .line 1118
    .line 1119
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1120
    .line 1121
    .line 1122
    goto/16 :goto_15

    .line 1123
    .line 1124
    :pswitch_19
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1125
    .line 1126
    const/16 v2, 0x215d

    .line 1127
    .line 1128
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1129
    .line 1130
    .line 1131
    goto/16 :goto_15

    .line 1132
    .line 1133
    :pswitch_1a
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1134
    .line 1135
    const/16 v2, 0x215c

    .line 1136
    .line 1137
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1138
    .line 1139
    .line 1140
    goto/16 :goto_15

    .line 1141
    .line 1142
    :pswitch_1b
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1143
    .line 1144
    const/16 v2, 0x215b

    .line 1145
    .line 1146
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1147
    .line 1148
    .line 1149
    goto/16 :goto_15

    .line 1150
    .line 1151
    :pswitch_1c
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1152
    .line 1153
    const/16 v2, 0x2022

    .line 1154
    .line 1155
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1156
    .line 1157
    .line 1158
    goto/16 :goto_15

    .line 1159
    .line 1160
    :pswitch_1d
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1161
    .line 1162
    const/16 v2, 0x201d

    .line 1163
    .line 1164
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1165
    .line 1166
    .line 1167
    goto/16 :goto_15

    .line 1168
    .line 1169
    :pswitch_1e
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1170
    .line 1171
    const/16 v2, 0x201c

    .line 1172
    .line 1173
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1174
    .line 1175
    .line 1176
    goto/16 :goto_15

    .line 1177
    .line 1178
    :pswitch_1f
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1179
    .line 1180
    const/16 v2, 0x2019

    .line 1181
    .line 1182
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1183
    .line 1184
    .line 1185
    goto :goto_15

    .line 1186
    :pswitch_20
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1187
    .line 1188
    const/16 v2, 0x2018

    .line 1189
    .line 1190
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1191
    .line 1192
    .line 1193
    goto :goto_15

    .line 1194
    :pswitch_21
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1195
    .line 1196
    const/16 v2, 0x2588

    .line 1197
    .line 1198
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1199
    .line 1200
    .line 1201
    goto :goto_15

    .line 1202
    :cond_28
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1203
    .line 1204
    const/16 v2, 0x2120

    .line 1205
    .line 1206
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1207
    .line 1208
    .line 1209
    goto :goto_15

    .line 1210
    :cond_29
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1211
    .line 1212
    const/16 v2, 0x153

    .line 1213
    .line 1214
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1215
    .line 1216
    .line 1217
    goto :goto_15

    .line 1218
    :cond_2a
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1219
    .line 1220
    const/16 v2, 0x161

    .line 1221
    .line 1222
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1223
    .line 1224
    .line 1225
    goto :goto_15

    .line 1226
    :cond_2b
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1227
    .line 1228
    const/16 v2, 0x2122

    .line 1229
    .line 1230
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1231
    .line 1232
    .line 1233
    goto :goto_15

    .line 1234
    :cond_2c
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1235
    .line 1236
    const/16 v2, 0x178

    .line 1237
    .line 1238
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_15

    .line 1242
    :cond_2d
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1243
    .line 1244
    const/16 v2, 0x152

    .line 1245
    .line 1246
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_15

    .line 1250
    :cond_2e
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1251
    .line 1252
    const/16 v2, 0x160

    .line 1253
    .line 1254
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_15

    .line 1258
    :cond_2f
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1259
    .line 1260
    const/16 v2, 0x2026

    .line 1261
    .line 1262
    invoke-virtual {v1, v2}, Li6/e;->a(C)V

    .line 1263
    .line 1264
    .line 1265
    goto :goto_15

    .line 1266
    :cond_30
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1267
    .line 1268
    invoke-virtual {v1, v4}, Li6/e;->a(C)V

    .line 1269
    .line 1270
    .line 1271
    goto :goto_15

    .line 1272
    :cond_31
    iget-object v1, v0, Li6/f;->l:Li6/e;

    .line 1273
    .line 1274
    const/16 v10, 0x20

    .line 1275
    .line 1276
    invoke-virtual {v1, v10}, Li6/e;->a(C)V

    .line 1277
    .line 1278
    .line 1279
    :goto_15
    move v2, v7

    .line 1280
    :cond_32
    :goto_16
    const/4 v1, 0x2

    .line 1281
    goto/16 :goto_14

    .line 1282
    .line 1283
    :cond_33
    const/16 v10, 0x20

    .line 1284
    .line 1285
    if-gt v12, v13, :cond_36

    .line 1286
    .line 1287
    const/16 v1, 0x87

    .line 1288
    .line 1289
    if-gt v12, v1, :cond_34

    .line 1290
    .line 1291
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 1292
    .line 1293
    .line 1294
    goto :goto_16

    .line 1295
    :cond_34
    const/16 v1, 0x8f

    .line 1296
    .line 1297
    if-gt v12, v1, :cond_35

    .line 1298
    .line 1299
    const/16 v1, 0x28

    .line 1300
    .line 1301
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_16

    .line 1305
    :cond_35
    if-gt v12, v13, :cond_32

    .line 1306
    .line 1307
    const/4 v1, 0x2

    .line 1308
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 1309
    .line 1310
    .line 1311
    const/4 v10, 0x6

    .line 1312
    invoke-virtual {v6, v10}, LJ5/y;->i(I)I

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    mul-int/2addr v4, v8

    .line 1317
    invoke-virtual {v6, v4}, LJ5/y;->t(I)V

    .line 1318
    .line 1319
    .line 1320
    goto :goto_18

    .line 1321
    :cond_36
    const/4 v1, 0x2

    .line 1322
    const/16 v8, 0xff

    .line 1323
    .line 1324
    const/4 v10, 0x6

    .line 1325
    if-gt v12, v8, :cond_38

    .line 1326
    .line 1327
    if-ne v12, v4, :cond_37

    .line 1328
    .line 1329
    iget-object v2, v0, Li6/f;->l:Li6/e;

    .line 1330
    .line 1331
    const/16 v4, 0x33c4

    .line 1332
    .line 1333
    invoke-virtual {v2, v4}, Li6/e;->a(C)V

    .line 1334
    .line 1335
    .line 1336
    goto :goto_17

    .line 1337
    :cond_37
    const-string v2, "Invalid G3 character: "

    .line 1338
    .line 1339
    invoke-static {v12, v2, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    iget-object v2, v0, Li6/f;->l:Li6/e;

    .line 1343
    .line 1344
    const/16 v4, 0x5f

    .line 1345
    .line 1346
    invoke-virtual {v2, v4}, Li6/e;->a(C)V

    .line 1347
    .line 1348
    .line 1349
    :goto_17
    move v2, v7

    .line 1350
    goto :goto_18

    .line 1351
    :cond_38
    const-string v4, "Invalid extended command: "

    .line 1352
    .line 1353
    invoke-static {v12, v4, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    :goto_18
    move v11, v3

    .line 1357
    move v4, v7

    .line 1358
    const/4 v7, 0x3

    .line 1359
    move v3, v1

    .line 1360
    goto/16 :goto_1

    .line 1361
    .line 1362
    :cond_39
    :goto_19
    if-eqz v2, :cond_3a

    .line 1363
    .line 1364
    invoke-virtual {v0}, Li6/f;->j()Ljava/util/List;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    iput-object v1, v0, Li6/f;->m:Ljava/util/List;

    .line 1369
    .line 1370
    :cond_3a
    const/4 v1, 0x0

    .line 1371
    iput-object v1, v0, Li6/f;->o:LJ5/y;

    .line 1372
    .line 1373
    return-void

    .line 1374
    nop

    .line 1375
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_4
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    :pswitch_data_3
    .packed-switch 0x76
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final j()Ljava/util/List;
    .locals 17

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    if-ge v2, v3, :cond_f

    .line 11
    .line 12
    move-object/from16 v3, p0

    .line 13
    .line 14
    iget-object v4, v3, Li6/f;->k:[Li6/e;

    .line 15
    .line 16
    aget-object v5, v4, v2

    .line 17
    .line 18
    iget-boolean v6, v5, Li6/e;->c:Z

    .line 19
    .line 20
    if-eqz v6, :cond_e

    .line 21
    .line 22
    iget-object v6, v5, Li6/e;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    iget-object v5, v5, Li6/e;->b:Landroid/text/SpannableStringBuilder;

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :cond_0
    aget-object v4, v4, v2

    .line 41
    .line 42
    iget-boolean v5, v4, Li6/e;->d:Z

    .line 43
    .line 44
    if-eqz v5, :cond_e

    .line 45
    .line 46
    iget-boolean v5, v4, Li6/e;->c:Z

    .line 47
    .line 48
    if-eqz v5, :cond_d

    .line 49
    .line 50
    iget-object v5, v4, Li6/e;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    iget-object v6, v4, Li6/e;->b:Landroid/text/SpannableStringBuilder;

    .line 59
    .line 60
    invoke-virtual {v6}, Landroid/text/SpannableStringBuilder;->length()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_1
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    invoke-direct {v8}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    move v6, v1

    .line 74
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-ge v6, v7, :cond_2

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/CharSequence;

    .line 85
    .line 86
    invoke-virtual {v8, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v7, 0xa

    .line 90
    .line 91
    invoke-virtual {v8, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v4}, Li6/e;->b()Landroid/text/SpannableString;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v8, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 102
    .line 103
    .line 104
    iget v5, v4, Li6/e;->l:I

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    const/4 v7, 0x2

    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    if-eq v5, v6, :cond_5

    .line 111
    .line 112
    if-eq v5, v7, :cond_4

    .line 113
    .line 114
    const/4 v9, 0x3

    .line 115
    if-ne v5, v9, :cond_3

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v2, "Unexpected justification value: "

    .line 123
    .line 124
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget v2, v4, Li6/e;->l:I

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :cond_4
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 141
    .line 142
    :goto_2
    move-object v9, v5

    .line 143
    goto :goto_4

    .line 144
    :cond_5
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    :goto_3
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :goto_4
    iget-boolean v5, v4, Li6/e;->f:Z

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    iget v5, v4, Li6/e;->h:I

    .line 155
    .line 156
    int-to-float v5, v5

    .line 157
    const/high16 v10, 0x42c60000    # 99.0f

    .line 158
    .line 159
    div-float/2addr v5, v10

    .line 160
    iget v11, v4, Li6/e;->g:I

    .line 161
    .line 162
    int-to-float v11, v11

    .line 163
    div-float/2addr v11, v10

    .line 164
    goto :goto_5

    .line 165
    :cond_7
    iget v5, v4, Li6/e;->h:I

    .line 166
    .line 167
    int-to-float v5, v5

    .line 168
    const/high16 v10, 0x43510000    # 209.0f

    .line 169
    .line 170
    div-float/2addr v5, v10

    .line 171
    iget v10, v4, Li6/e;->g:I

    .line 172
    .line 173
    int-to-float v10, v10

    .line 174
    const/high16 v11, 0x42940000    # 74.0f

    .line 175
    .line 176
    div-float v11, v10, v11

    .line 177
    .line 178
    :goto_5
    const v10, 0x3f666666    # 0.9f

    .line 179
    .line 180
    .line 181
    mul-float/2addr v5, v10

    .line 182
    const v12, 0x3d4ccccd    # 0.05f

    .line 183
    .line 184
    .line 185
    add-float/2addr v5, v12

    .line 186
    mul-float/2addr v11, v10

    .line 187
    add-float v10, v11, v12

    .line 188
    .line 189
    iget v11, v4, Li6/e;->i:I

    .line 190
    .line 191
    div-int/lit8 v12, v11, 0x3

    .line 192
    .line 193
    if-nez v12, :cond_8

    .line 194
    .line 195
    move v12, v11

    .line 196
    move v11, v1

    .line 197
    goto :goto_6

    .line 198
    :cond_8
    if-ne v12, v6, :cond_9

    .line 199
    .line 200
    move v12, v11

    .line 201
    move v11, v6

    .line 202
    goto :goto_6

    .line 203
    :cond_9
    move v12, v11

    .line 204
    move v11, v7

    .line 205
    :goto_6
    rem-int/lit8 v12, v12, 0x3

    .line 206
    .line 207
    if-nez v12, :cond_a

    .line 208
    .line 209
    move v13, v1

    .line 210
    goto :goto_7

    .line 211
    :cond_a
    if-ne v12, v6, :cond_b

    .line 212
    .line 213
    move v13, v6

    .line 214
    goto :goto_7

    .line 215
    :cond_b
    move v13, v7

    .line 216
    :goto_7
    iget v15, v4, Li6/e;->o:I

    .line 217
    .line 218
    sget v7, Li6/e;->x:I

    .line 219
    .line 220
    if-eq v15, v7, :cond_c

    .line 221
    .line 222
    move v14, v6

    .line 223
    goto :goto_8

    .line 224
    :cond_c
    move v14, v1

    .line 225
    :goto_8
    new-instance v7, Li6/d;

    .line 226
    .line 227
    iget v4, v4, Li6/e;->e:I

    .line 228
    .line 229
    move/from16 v16, v4

    .line 230
    .line 231
    move v12, v5

    .line 232
    invoke-direct/range {v7 .. v16}, Li6/d;-><init>(Landroid/text/SpannableStringBuilder;Landroid/text/Layout$Alignment;FIFIZII)V

    .line 233
    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_d
    :goto_9
    const/4 v7, 0x0

    .line 237
    :goto_a
    if-eqz v7, :cond_e

    .line 238
    .line 239
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :cond_e
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_f
    move-object/from16 v3, p0

    .line 247
    .line 248
    sget-object v2, Li6/d;->c:LA0/f;

    .line 249
    .line 250
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    :goto_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-ge v1, v4, :cond_10

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, Li6/d;

    .line 273
    .line 274
    iget-object v4, v4, Li6/d;->a:Lh6/b;

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    add-int/lit8 v1, v1, 0x1

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_10
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0
.end method

.method public final k()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x8

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Li6/f;->k:[Li6/e;

    .line 7
    .line 8
    aget-object v1, v1, v0

    .line 9
    .line 10
    invoke-virtual {v1}, Li6/e;->d()V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method
