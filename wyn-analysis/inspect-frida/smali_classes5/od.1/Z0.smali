.class public final Lod/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/W;


# instance fields
.field public final a:Lod/b;

.field public b:I

.field public c:Lpd/t;

.field public d:Lmd/k;

.field public final e:Lod/Y0;

.field public final f:Ljava/nio/ByteBuffer;

.field public final g:Lad/I;

.field public final h:Lod/W1;

.field public i:Z

.field public j:I

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>(Lod/b;Lad/I;Lod/W1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lod/Z0;->b:I

    .line 6
    .line 7
    sget-object v1, Lmd/j;->b:Lmd/j;

    .line 8
    .line 9
    iput-object v1, p0, Lod/Z0;->d:Lmd/k;

    .line 10
    .line 11
    new-instance v1, Lod/Y0;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lod/Y0;-><init>(Lod/Z0;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lod/Z0;->e:Lod/Y0;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lod/Z0;->f:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iput v0, p0, Lod/Z0;->k:I

    .line 26
    .line 27
    iput-object p1, p0, Lod/Z0;->a:Lod/b;

    .line 28
    .line 29
    iput-object p2, p0, Lod/Z0;->g:Lad/I;

    .line 30
    .line 31
    iput-object p3, p0, Lod/Z0;->h:Lod/W1;

    .line 32
    .line 33
    return-void
.end method

.method public static h(Ltd/a;Ljava/io/OutputStream;)I
    .locals 8

    .line 1
    iget-object v0, p0, Ltd/a;->a:Lcom/google/protobuf/MessageLite;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->getSerializedSize()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v2, p0, Ltd/a;->a:Lcom/google/protobuf/MessageLite;

    .line 11
    .line 12
    invoke-interface {v2, p1}, Lcom/google/protobuf/MessageLite;->writeTo(Ljava/io/OutputStream;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Ltd/a;->a:Lcom/google/protobuf/MessageLite;

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    iget-object v0, p0, Ltd/a;->c:Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object v3, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 24
    .line 25
    const-string v3, "outputStream cannot be null!"

    .line 26
    .line 27
    invoke-static {p1, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x2000

    .line 31
    .line 32
    new-array v3, v3, [B

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, -0x1

    .line 41
    if-ne v6, v7, :cond_1

    .line 42
    .line 43
    long-to-int p1, v4

    .line 44
    iput-object v1, p0, Ltd/a;->c:Ljava/io/ByteArrayInputStream;

    .line 45
    .line 46
    return p1

    .line 47
    :cond_1
    invoke-virtual {p1, v3, v2, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 48
    .line 49
    .line 50
    int-to-long v6, v6

    .line 51
    add-long/2addr v4, v6

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return v2
.end method


# virtual methods
.method public final a(Lmd/k;)Lod/W;
    .locals 0

    .line 1
    iput-object p1, p0, Lod/Z0;->d:Lmd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(I)V
    .locals 2

    .line 1
    iget v0, p0, Lod/Z0;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v1, "max size already set"

    .line 10
    .line 11
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lod/Z0;->b:I

    .line 15
    .line 16
    return-void
.end method

.method public final c(Ltd/a;)V
    .locals 9

    .line 1
    const-string v1, "Failed to frame message"

    .line 2
    .line 3
    iget-boolean v0, p0, Lod/Z0;->i:Z

    .line 4
    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    iget v0, p0, Lod/Z0;->j:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    add-int/2addr v0, v2

    .line 11
    iput v0, p0, Lod/Z0;->j:I

    .line 12
    .line 13
    iget v0, p0, Lod/Z0;->k:I

    .line 14
    .line 15
    add-int/2addr v0, v2

    .line 16
    iput v0, p0, Lod/Z0;->k:I

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    iput-wide v3, p0, Lod/Z0;->l:J

    .line 21
    .line 22
    iget-object v3, p0, Lod/Z0;->h:Lod/W1;

    .line 23
    .line 24
    iget-object v4, v3, Lod/W1;->a:[Lmd/i;

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    const/4 v6, 0x0

    .line 28
    move v7, v6

    .line 29
    :goto_0
    if-ge v7, v5, :cond_0

    .line 30
    .line 31
    aget-object v8, v4, v7

    .line 32
    .line 33
    invoke-virtual {v8, v0}, Lmd/i;->i(I)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v7, v7, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lod/Z0;->d:Lmd/k;

    .line 40
    .line 41
    sget-object v4, Lmd/j;->b:Lmd/j;

    .line 42
    .line 43
    if-eq v0, v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v2, v6

    .line 47
    :goto_1
    :try_start_0
    invoke-virtual {p1}, Ltd/a;->available()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lod/Z0;->f(Ltd/a;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    goto :goto_7

    .line 63
    :catch_1
    move-exception v0

    .line 64
    move-object p1, v0

    .line 65
    goto :goto_8

    .line 66
    :catch_2
    move-exception v0

    .line 67
    move-object p1, v0

    .line 68
    goto :goto_9

    .line 69
    :cond_2
    invoke-virtual {p0, p1, v0}, Lod/Z0;->i(Ltd/a;I)I

    .line 70
    .line 71
    .line 72
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lmd/m0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :goto_2
    const/4 v1, -0x1

    .line 74
    if-eq v0, v1, :cond_4

    .line 75
    .line 76
    if-ne p1, v0, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    const-string v1, "Message length inaccurate "

    .line 80
    .line 81
    const-string v2, " != "

    .line 82
    .line 83
    invoke-static {p1, v0, v1, v2}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, Lmd/k0;->m:Lmd/k0;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    throw p1

    .line 98
    :cond_4
    :goto_3
    int-to-long v4, p1

    .line 99
    iget-object p1, v3, Lod/W1;->a:[Lmd/i;

    .line 100
    .line 101
    array-length v0, p1

    .line 102
    move v1, v6

    .line 103
    :goto_4
    if-ge v1, v0, :cond_5

    .line 104
    .line 105
    aget-object v2, p1, v1

    .line 106
    .line 107
    invoke-virtual {v2, v4, v5}, Lmd/i;->k(J)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    iget-wide v0, p0, Lod/Z0;->l:J

    .line 114
    .line 115
    array-length v2, p1

    .line 116
    move v7, v6

    .line 117
    :goto_5
    if-ge v7, v2, :cond_6

    .line 118
    .line 119
    aget-object v8, p1, v7

    .line 120
    .line 121
    invoke-virtual {v8, v0, v1}, Lmd/i;->l(J)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_6
    iget v1, p0, Lod/Z0;->k:I

    .line 128
    .line 129
    move-object p1, v3

    .line 130
    iget-wide v2, p0, Lod/Z0;->l:J

    .line 131
    .line 132
    iget-object p1, p1, Lod/W1;->a:[Lmd/i;

    .line 133
    .line 134
    array-length v7, p1

    .line 135
    :goto_6
    if-ge v6, v7, :cond_7

    .line 136
    .line 137
    aget-object v0, p1, v6

    .line 138
    .line 139
    invoke-virtual/range {v0 .. v5}, Lmd/i;->j(IJJ)V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v6, v6, 0x1

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    return-void

    .line 146
    :goto_7
    sget-object v0, Lmd/k0;->m:Lmd/k0;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    throw p1

    .line 161
    :goto_8
    throw p1

    .line 162
    :goto_9
    sget-object v0, Lmd/k0;->m:Lmd/k0;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    throw p1

    .line 177
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string v0, "Framer already closed"

    .line 180
    .line 181
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lod/Z0;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lod/Z0;->i:Z

    .line 7
    .line 8
    iget-object v1, p0, Lod/Z0;->c:Lpd/t;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget v1, v1, Lpd/t;->c:I

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lod/Z0;->c:Lpd/t;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v0, v0}, Lod/Z0;->d(ZZ)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final d(ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lod/Z0;->c:Lpd/t;

    .line 5
    .line 6
    iget v1, p0, Lod/Z0;->j:I

    .line 7
    .line 8
    iget-object v2, p0, Lod/Z0;->a:Lod/b;

    .line 9
    .line 10
    invoke-virtual {v2, v0, p1, p2, v1}, Lod/b;->u(Lpd/t;ZZI)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lod/Z0;->j:I

    .line 15
    .line 16
    return-void
.end method

.method public final e(Lod/X0;Z)V
    .locals 5

    .line 1
    iget-object p1, p1, Lod/X0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lpd/t;

    .line 20
    .line 21
    iget v3, v3, Lpd/t;->c:I

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget v0, p0, Lod/Z0;->b:I

    .line 26
    .line 27
    if-ltz v0, :cond_2

    .line 28
    .line 29
    if-gt v2, v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object p1, Lmd/k0;->k:Lmd/k0;

    .line 33
    .line 34
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 35
    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "message too large "

    .line 39
    .line 40
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, " > "

    .line 47
    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    throw p1

    .line 67
    :cond_2
    :goto_1
    iget-object v0, p0, Lod/Z0;->f:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, Lod/Z0;->g:Lad/I;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 p2, 0x5

    .line 85
    invoke-static {p2}, Lad/I;->h(I)Lpd/t;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p2, v3, v1, v0}, Lpd/t;->a([BII)V

    .line 98
    .line 99
    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    iput-object p2, p0, Lod/Z0;->c:Lpd/t;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    iget v0, p0, Lod/Z0;->j:I

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    sub-int/2addr v0, v3

    .line 109
    iget-object v4, p0, Lod/Z0;->a:Lod/b;

    .line 110
    .line 111
    invoke-virtual {v4, p2, v1, v1, v0}, Lod/b;->u(Lpd/t;ZZI)V

    .line 112
    .line 113
    .line 114
    iput v3, p0, Lod/Z0;->j:I

    .line 115
    .line 116
    move p2, v1

    .line 117
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sub-int/2addr v0, v3

    .line 122
    if-ge p2, v0, :cond_4

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lpd/t;

    .line 129
    .line 130
    invoke-virtual {v4, v0, v1, v1, v1}, Lod/b;->u(Lpd/t;ZZI)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 p2, p2, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    invoke-static {p1, v3}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Lpd/t;

    .line 141
    .line 142
    iput-object p1, p0, Lod/Z0;->c:Lpd/t;

    .line 143
    .line 144
    int-to-long p1, v2

    .line 145
    iput-wide p1, p0, Lod/Z0;->l:J

    .line 146
    .line 147
    return-void
.end method

.method public final f(Ltd/a;)I
    .locals 4

    .line 1
    new-instance v0, Lod/X0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lod/X0;-><init>(Lod/Z0;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lod/Z0;->d:Lmd/k;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lmd/k;->h(Lod/X0;)Ljava/io/OutputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :try_start_0
    invoke-static {p1, v1}, Lod/Z0;->h(Ltd/a;Ljava/io/OutputStream;)I

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lod/Z0;->b:I

    .line 20
    .line 21
    if-ltz v1, :cond_1

    .line 22
    .line 23
    if-gt p1, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lmd/k0;->k:Lmd/k0;

    .line 27
    .line 28
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "message too large "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " > "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 62
    invoke-virtual {p0, v0, v1}, Lod/Z0;->e(Lod/X0;Z)V

    .line 63
    .line 64
    .line 65
    return p1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lpd/t;->c:I

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, v0, v1}, Lod/Z0;->d(ZZ)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final g(II[B)V
    .locals 2

    .line 1
    :goto_0
    if-lez p2, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lpd/t;->b:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, v0}, Lod/Z0;->d(ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lod/Z0;->g:Lad/I;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lad/I;->h(I)Lpd/t;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lod/Z0;->c:Lpd/t;

    .line 31
    .line 32
    iget v0, v0, Lpd/t;->b:I

    .line 33
    .line 34
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v1, p0, Lod/Z0;->c:Lpd/t;

    .line 39
    .line 40
    invoke-virtual {v1, p3, p1, v0}, Lpd/t;->a([BII)V

    .line 41
    .line 42
    .line 43
    add-int/2addr p1, v0

    .line 44
    sub-int/2addr p2, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
.end method

.method public final i(Ltd/a;I)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p2, v0, :cond_3

    .line 4
    .line 5
    int-to-long v2, p2

    .line 6
    iput-wide v2, p0, Lod/Z0;->l:J

    .line 7
    .line 8
    iget v0, p0, Lod/Z0;->b:I

    .line 9
    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    if-gt p2, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object p1, Lmd/k0;->k:Lmd/k0;

    .line 16
    .line 17
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "message too large "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, " > "

    .line 30
    .line 31
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_0
    iget-object v0, p0, Lod/Z0;->f:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lod/Z0;->c:Lpd/t;

    .line 63
    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, p2

    .line 71
    iget-object p2, p0, Lod/Z0;->g:Lad/I;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lad/I;->h(I)Lpd/t;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, p0, Lod/Z0;->c:Lpd/t;

    .line 81
    .line 82
    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p0, v1, v0, p2}, Lod/Z0;->g(II[B)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lod/Z0;->e:Lod/Y0;

    .line 94
    .line 95
    invoke-static {p1, p2}, Lod/Z0;->h(Ltd/a;Ljava/io/OutputStream;)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_3
    new-instance p2, Lod/X0;

    .line 101
    .line 102
    invoke-direct {p2, p0}, Lod/X0;-><init>(Lod/Z0;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, p2}, Lod/Z0;->h(Ltd/a;Ljava/io/OutputStream;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-virtual {p0, p2, v1}, Lod/Z0;->e(Lod/X0;Z)V

    .line 110
    .line 111
    .line 112
    return p1
.end method

.method public final isClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lod/Z0;->i:Z

    .line 2
    .line 3
    return v0
.end method
