.class public abstract Li3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lad/r;

.field public static final b:[B

.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B

.field public static final j:[B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-instance v1, Lad/r;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Li3/b;->a:Lad/r;

    .line 8
    .line 9
    new-array v1, v0, [B

    .line 10
    .line 11
    fill-array-data v1, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v1, Li3/b;->b:[B

    .line 15
    .line 16
    new-array v1, v0, [B

    .line 17
    .line 18
    fill-array-data v1, :array_1

    .line 19
    .line 20
    .line 21
    sput-object v1, Li3/b;->c:[B

    .line 22
    .line 23
    new-array v1, v0, [B

    .line 24
    .line 25
    fill-array-data v1, :array_2

    .line 26
    .line 27
    .line 28
    sput-object v1, Li3/b;->d:[B

    .line 29
    .line 30
    new-array v1, v0, [B

    .line 31
    .line 32
    fill-array-data v1, :array_3

    .line 33
    .line 34
    .line 35
    sput-object v1, Li3/b;->e:[B

    .line 36
    .line 37
    new-array v1, v0, [B

    .line 38
    .line 39
    fill-array-data v1, :array_4

    .line 40
    .line 41
    .line 42
    sput-object v1, Li3/b;->f:[B

    .line 43
    .line 44
    new-array v1, v0, [B

    .line 45
    .line 46
    fill-array-data v1, :array_5

    .line 47
    .line 48
    .line 49
    sput-object v1, Li3/b;->g:[B

    .line 50
    .line 51
    new-array v1, v0, [B

    .line 52
    .line 53
    fill-array-data v1, :array_6

    .line 54
    .line 55
    .line 56
    sput-object v1, Li3/b;->h:[B

    .line 57
    .line 58
    new-array v1, v0, [B

    .line 59
    .line 60
    fill-array-data v1, :array_7

    .line 61
    .line 62
    .line 63
    sput-object v1, Li3/b;->i:[B

    .line 64
    .line 65
    new-array v0, v0, [B

    .line 66
    .line 67
    fill-array-data v0, :array_8

    .line 68
    .line 69
    .line 70
    sput-object v0, Li3/b;->j:[B

    .line 71
    .line 72
    return-void

    .line 73
    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    .line 74
    .line 75
    .line 76
    .line 77
    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    :array_3
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    :array_4
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_7
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_8
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method public static a([B)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/util/zip/Deflater;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/zip/Deflater;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/util/zip/DeflaterOutputStream;

    .line 13
    .line 14
    invoke-direct {v2, v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception p0

    .line 34
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_2
    move-exception v1

    .line 39
    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 43
    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public static b([Lh2/e;[B)[B
    .locals 11

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    iget-object v5, v4, Lh2/e;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v5, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v4, Lh2/e;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v5, v6, p1}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    array-length v5, v5

    .line 28
    add-int/lit8 v5, v5, 0x10

    .line 29
    .line 30
    iget v6, v4, Lh2/e;->f:I

    .line 31
    .line 32
    mul-int/lit8 v6, v6, 0x2

    .line 33
    .line 34
    add-int/2addr v6, v5

    .line 35
    iget v5, v4, Lh2/e;->h:I

    .line 36
    .line 37
    add-int/2addr v6, v5

    .line 38
    iget v4, v4, Lh2/e;->i:I

    .line 39
    .line 40
    mul-int/lit8 v4, v4, 0x2

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x7

    .line 43
    .line 44
    and-int/lit8 v4, v4, -0x8

    .line 45
    .line 46
    div-int/lit8 v4, v4, 0x8

    .line 47
    .line 48
    add-int/2addr v4, v6

    .line 49
    add-int/2addr v3, v4

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 54
    .line 55
    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 56
    .line 57
    .line 58
    sget-object v2, Li3/b;->f:[B

    .line 59
    .line 60
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    array-length v2, p0

    .line 67
    move v4, v1

    .line 68
    :goto_1
    if-ge v4, v2, :cond_5

    .line 69
    .line 70
    aget-object v5, p0, v4

    .line 71
    .line 72
    iget-object v6, v5, Lh2/e;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v7, v5, Lh2/e;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v6, v7, p1}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v0, v5, v6}, Li3/b;->p(Ljava/io/ByteArrayOutputStream;Lh2/e;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v5}, Li3/b;->r(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 88
    .line 89
    .line 90
    iget-object v6, v5, Lh2/e;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v6, [I

    .line 93
    .line 94
    array-length v7, v6

    .line 95
    move v8, v1

    .line 96
    move v9, v8

    .line 97
    :goto_2
    if-ge v8, v7, :cond_1

    .line 98
    .line 99
    aget v10, v6, v8

    .line 100
    .line 101
    sub-int v9, v10, v9

    .line 102
    .line 103
    invoke-static {v0, v9}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v8, v8, 0x1

    .line 107
    .line 108
    move v9, v10

    .line 109
    goto :goto_2

    .line 110
    :cond_1
    invoke-static {v0, v5}, Li3/b;->q(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    array-length v2, p0

    .line 117
    move v4, v1

    .line 118
    :goto_3
    if-ge v4, v2, :cond_3

    .line 119
    .line 120
    aget-object v5, p0, v4

    .line 121
    .line 122
    iget-object v6, v5, Lh2/e;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v6, Ljava/lang/String;

    .line 125
    .line 126
    iget-object v7, v5, Lh2/e;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v7, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v6, v7, p1}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v0, v5, v6}, Li3/b;->p(Ljava/io/ByteArrayOutputStream;Lh2/e;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    array-length p1, p0

    .line 141
    move v2, v1

    .line 142
    :goto_4
    if-ge v2, p1, :cond_5

    .line 143
    .line 144
    aget-object v4, p0, v2

    .line 145
    .line 146
    invoke-static {v0, v4}, Li3/b;->r(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, v4, Lh2/e;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, [I

    .line 152
    .line 153
    array-length v6, v5

    .line 154
    move v7, v1

    .line 155
    move v8, v7

    .line 156
    :goto_5
    if-ge v7, v6, :cond_4

    .line 157
    .line 158
    aget v9, v5, v7

    .line 159
    .line 160
    sub-int v8, v9, v8

    .line 161
    .line 162
    invoke-static {v0, v8}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    move v8, v9

    .line 168
    goto :goto_5

    .line 169
    :cond_4
    invoke-static {v0, v4}, Li3/b;->q(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    if-ne p0, v3, :cond_6

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string p1, "The bytes saved do not match expectation. actual="

    .line 189
    .line 190
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string p1, " expected="

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1
.end method

.method public static c(Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    array-length v2, p0

    .line 17
    move v3, v0

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v5, p0, v3

    .line 22
    .line 23
    invoke-static {v5}, Li3/b;->c(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v0

    .line 34
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v4

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    return v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Li3/b;->h:[B

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Li3/b;->g:[B

    .line 8
    .line 9
    const-string v3, "!"

    .line 10
    .line 11
    const-string v4, ":"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p2, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v1, v3

    .line 25
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-gtz v5, :cond_3

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_b

    .line 47
    .line 48
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    const-string v5, "classes.dex"

    .line 54
    .line 55
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_9

    .line 67
    .line 68
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    const-string v1, ".apk"

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    invoke-static {p0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_7
    invoke-static {p2, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_8

    .line 100
    .line 101
    :goto_2
    move-object v3, v4

    .line 102
    :cond_8
    invoke-static {p0, v3, p1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_9
    :goto_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_a

    .line 112
    .line 113
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_a
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_b

    .line 123
    .line 124
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_b
    :goto_4
    return-object p1
.end method

.method public static e(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    .line 9
    .line 10
    new-instance v1, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :catch_0
    return-void
.end method

.method public static f(Ljava/io/InputStream;I)[B
    .locals 3

    .line 1
    new-array v0, p1, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p1, :cond_1

    .line 5
    .line 6
    sub-int v2, p1, v1

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "Not enough bytes to read: "

    .line 17
    .line 18
    invoke-static {p1, p0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    return-object v0
.end method

.method public static g(Ljava/io/ByteArrayInputStream;I)[I
    .locals 5

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-static {p0, v3}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    long-to-int v3, v3

    .line 13
    add-int/2addr v2, v3

    .line 14
    aput v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0
.end method

.method public static h(Ljava/io/FileInputStream;II)[B
    .locals 8

    .line 1
    new-instance v0, Ljava/util/zip/Inflater;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-array v1, p2, [B

    .line 7
    .line 8
    const/16 v2, 0x800

    .line 9
    .line 10
    new-array v2, v2, [B

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    if-ge v4, p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ltz v6, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3, v6}, Ljava/util/zip/Inflater;->setInput([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    sub-int v7, p2, v5

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v0, v1, v5, v7}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 41
    .line 42
    .line 43
    move-result v7
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    add-int/2addr v5, v7

    .line 45
    add-int/2addr v4, v6

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception p0

    .line 50
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p2, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "

    .line 66
    .line 67
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " bytes"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_1
    if-ne v4, p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 91
    .line 92
    .line 93
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    if-eqz p0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_2
    :try_start_3
    const-string p0, "Inflater did not finish"

    .line 101
    .line 102
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string p2, "Didn\'t read enough bytes during decompression. expected="

    .line 114
    .line 115
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " actual="

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 140
    .line 141
    .line 142
    throw p0
.end method

.method public static i(Ljava/io/FileInputStream;[B[B[Lh2/e;)[Lh2/e;
    .locals 6

    .line 1
    sget-object v0, Li3/b;->i:[B

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "Unsupported meta version"

    .line 8
    .line 9
    const-string v3, "Content found after the end of file"

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    sget-object v1, Li3/b;->d:[B

    .line 15
    .line 16
    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_2

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-static {p0, p1}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    long-to-int p2, v4

    .line 43
    long-to-int v0, v0

    .line 44
    invoke-static {p0, p2, v0}, Li3/b;->h(Ljava/io/FileInputStream;II)[B

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-gtz p0, :cond_0

    .line 53
    .line 54
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 55
    .line 56
    invoke-direct {p0, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-static {p0, p1, p3}, Li3/b;->j(Ljava/io/ByteArrayInputStream;I[Lh2/e;)[Lh2/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    throw p1

    .line 77
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string p1, "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"

    .line 92
    .line 93
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_3
    sget-object v0, Li3/b;->j:[B

    .line 98
    .line 99
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    const/4 p1, 0x2

    .line 106
    invoke-static {p0, p1}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    long-to-int p1, v0

    .line 111
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    long-to-int v2, v4

    .line 120
    long-to-int v0, v0

    .line 121
    invoke-static {p0, v2, v0}, Li3/b;->h(Ljava/io/FileInputStream;II)[B

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-gtz p0, :cond_4

    .line 130
    .line 131
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 132
    .line 133
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 134
    .line 135
    .line 136
    :try_start_2
    invoke-static {p0, p2, p1, p3}, Li3/b;->k(Ljava/io/ByteArrayInputStream;[BI[Lh2/e;)[Lh2/e;

    .line 137
    .line 138
    .line 139
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 140
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 141
    .line 142
    .line 143
    return-object p1

    .line 144
    :catchall_2
    move-exception p1

    .line 145
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catchall_3
    move-exception p0

    .line 150
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :goto_1
    throw p1

    .line 154
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0
.end method

.method public static j(Ljava/io/ByteArrayInputStream;I[Lh2/e;)[Lh2/e;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [Lh2/e;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    array-length v0, p2

    .line 12
    if-ne p1, v0, :cond_4

    .line 13
    .line 14
    new-array v0, p1, [Ljava/lang/String;

    .line 15
    .line 16
    new-array v2, p1, [I

    .line 17
    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge v3, p1, :cond_1

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    long-to-int v5, v5

    .line 27
    invoke-static {p0, v4}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    long-to-int v4, v6

    .line 32
    aput v4, v2, v3

    .line 33
    .line 34
    new-instance v4, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0, v5}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 43
    .line 44
    .line 45
    aput-object v4, v0, v3

    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    .line 51
    .line 52
    aget-object v3, p2, v1

    .line 53
    .line 54
    iget-object v4, v3, Lh2/e;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    aget-object v5, v0, v1

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    aget v4, v2, v1

    .line 67
    .line 68
    iput v4, v3, Lh2/e;->f:I

    .line 69
    .line 70
    invoke-static {p0, v4}, Li3/b;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iput-object v4, v3, Lh2/e;->d:Ljava/lang/Object;

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string p1, "Order of dexfiles in metadata did not match baseline"

    .line 82
    .line 83
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_3
    return-object p2

    .line 88
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string p1, "Mismatched number of dex files found in metadata"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0
.end method

.method public static k(Ljava/io/ByteArrayInputStream;[BI[Lh2/e;)[Lh2/e;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [Lh2/e;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    array-length v0, p3

    .line 12
    if-ne p2, v0, :cond_9

    .line 13
    .line 14
    move v0, v1

    .line 15
    :goto_0
    if-ge v0, p2, :cond_8

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {p0, v2}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v2}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    long-to-int v3, v3

    .line 26
    new-instance v4, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, v3}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    invoke-static {p0, v3}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    invoke-static {p0, v2}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    long-to-int v2, v2

    .line 47
    array-length v3, p3

    .line 48
    const/4 v7, 0x0

    .line 49
    if-gtz v3, :cond_1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string v3, "!"

    .line 53
    .line 54
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-gez v3, :cond_2

    .line 59
    .line 60
    const-string v3, ":"

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :cond_2
    if-lez v3, :cond_3

    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v3, v4

    .line 76
    :goto_1
    move v8, v1

    .line 77
    :goto_2
    array-length v9, p3

    .line 78
    if-ge v8, v9, :cond_5

    .line 79
    .line 80
    aget-object v9, p3, v8

    .line 81
    .line 82
    iget-object v9, v9, Lh2/e;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v9, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_4

    .line 91
    .line 92
    aget-object v7, p3, v8

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    :goto_3
    if-eqz v7, :cond_7

    .line 99
    .line 100
    iput-wide v5, v7, Lh2/e;->j:J

    .line 101
    .line 102
    invoke-static {p0, v2}, Li3/b;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    sget-object v4, Li3/b;->h:[B

    .line 107
    .line 108
    invoke-static {p1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    iput v2, v7, Lh2/e;->f:I

    .line 115
    .line 116
    iput-object v3, v7, Lh2/e;->d:Ljava/lang/Object;

    .line 117
    .line 118
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_7
    const-string p0, "Missing profile key: "

    .line 122
    .line 123
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_8
    return-object p3

    .line 134
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    const-string p1, "Mismatched number of dex files found in metadata"

    .line 137
    .line 138
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0
.end method

.method public static l(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh2/e;
    .locals 5

    .line 1
    sget-object v0, Li3/b;->e:[B

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p0, p1}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-int p1, v0

    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-static {p0, v0}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-static {p0, v0}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    long-to-int v0, v3

    .line 25
    long-to-int v1, v1

    .line 26
    invoke-static {p0, v0, v1}, Li3/b;->h(Ljava/io/FileInputStream;II)[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    new-instance p0, Ljava/io/ByteArrayInputStream;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-static {p0, p2, p1}, Li3/b;->n(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Lh2/e;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1

    .line 59
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "Content found after the end of file"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p1, "Unsupported version"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method public static m(Ljava/io/InputStream;I)J
    .locals 6

    .line 1
    invoke-static {p0, p1}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    aget-byte v3, p0, v2

    .line 11
    .line 12
    and-int/lit16 v3, v3, 0xff

    .line 13
    .line 14
    int-to-long v3, v3

    .line 15
    mul-int/lit8 v5, v2, 0x8

    .line 16
    .line 17
    shl-long/2addr v3, v5

    .line 18
    add-long/2addr v0, v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide v0
.end method

.method public static n(Ljava/io/ByteArrayInputStream;Ljava/lang/String;I)[Lh2/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-array v0, v3, [Lh2/e;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-array v2, v1, [Lh2/e;

    .line 16
    .line 17
    move v4, v3

    .line 18
    :goto_0
    const/4 v5, 0x2

    .line 19
    if-ge v4, v1, :cond_1

    .line 20
    .line 21
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    long-to-int v6, v6

    .line 26
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v7

    .line 30
    long-to-int v14, v7

    .line 31
    const/4 v5, 0x4

    .line 32
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v12

    .line 40
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    new-instance v5, Lh2/e;

    .line 45
    .line 46
    new-instance v11, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v6}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    invoke-direct {v11, v6, v15}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 55
    .line 56
    .line 57
    long-to-int v15, v7

    .line 58
    long-to-int v6, v9

    .line 59
    new-array v7, v14, [I

    .line 60
    .line 61
    new-instance v18, Ljava/util/TreeMap;

    .line 62
    .line 63
    invoke-direct/range {v18 .. v18}, Ljava/util/TreeMap;-><init>()V

    .line 64
    .line 65
    .line 66
    move-object/from16 v10, p1

    .line 67
    .line 68
    move-object v9, v5

    .line 69
    move/from16 v16, v6

    .line 70
    .line 71
    move-object/from16 v17, v7

    .line 72
    .line 73
    invoke-direct/range {v9 .. v18}, Lh2/e;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    .line 74
    .line 75
    .line 76
    aput-object v9, v2, v4

    .line 77
    .line 78
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move v4, v3

    .line 82
    :goto_1
    if-ge v4, v1, :cond_e

    .line 83
    .line 84
    aget-object v6, v2, v4

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    iget v8, v6, Lh2/e;->h:I

    .line 91
    .line 92
    sub-int/2addr v7, v8

    .line 93
    move v8, v3

    .line 94
    :cond_2
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    iget-object v10, v6, Lh2/e;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v10, Ljava/util/TreeMap;

    .line 101
    .line 102
    const/4 v11, 0x7

    .line 103
    if-le v9, v7, :cond_7

    .line 104
    .line 105
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    long-to-int v9, v12

    .line 110
    add-int/2addr v8, v9

    .line 111
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    const/4 v12, 0x1

    .line 116
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v10, v9, v13}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v9

    .line 127
    long-to-int v9, v9

    .line 128
    :goto_2
    if-lez v9, :cond_2

    .line 129
    .line 130
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v12}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v13

    .line 137
    long-to-int v10, v13

    .line 138
    const/4 v13, 0x6

    .line 139
    if-ne v10, v13, :cond_3

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_3
    if-ne v10, v11, :cond_4

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_4
    :goto_3
    if-lez v10, :cond_6

    .line 146
    .line 147
    invoke-static {v0, v12}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v12}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v13

    .line 154
    long-to-int v13, v13

    .line 155
    :goto_4
    if-lez v13, :cond_5

    .line 156
    .line 157
    invoke-static {v0, v5}, Li3/b;->m(Ljava/io/InputStream;I)J

    .line 158
    .line 159
    .line 160
    add-int/lit8 v13, v13, -0x1

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_5
    add-int/lit8 v10, v10, -0x1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    :goto_5
    add-int/lit8 v9, v9, -0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_7
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-ne v8, v7, :cond_d

    .line 174
    .line 175
    iget v7, v6, Lh2/e;->f:I

    .line 176
    .line 177
    invoke-static {v0, v7}, Li3/b;->g(Ljava/io/ByteArrayInputStream;I)[I

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    iput-object v7, v6, Lh2/e;->d:Ljava/lang/Object;

    .line 182
    .line 183
    iget v6, v6, Lh2/e;->i:I

    .line 184
    .line 185
    mul-int/lit8 v7, v6, 0x2

    .line 186
    .line 187
    add-int/2addr v7, v11

    .line 188
    and-int/lit8 v7, v7, -0x8

    .line 189
    .line 190
    div-int/lit8 v7, v7, 0x8

    .line 191
    .line 192
    invoke-static {v0, v7}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-static {v7}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    move v8, v3

    .line 201
    :goto_6
    if-ge v8, v6, :cond_c

    .line 202
    .line 203
    invoke-virtual {v7, v8}, Ljava/util/BitSet;->get(I)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_8

    .line 208
    .line 209
    move v9, v5

    .line 210
    goto :goto_7

    .line 211
    :cond_8
    move v9, v3

    .line 212
    :goto_7
    add-int v11, v8, v6

    .line 213
    .line 214
    invoke-virtual {v7, v11}, Ljava/util/BitSet;->get(I)Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_9

    .line 219
    .line 220
    or-int/lit8 v9, v9, 0x4

    .line 221
    .line 222
    :cond_9
    if-eqz v9, :cond_b

    .line 223
    .line 224
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-virtual {v10, v11}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    check-cast v11, Ljava/lang/Integer;

    .line 233
    .line 234
    if-nez v11, :cond_a

    .line 235
    .line 236
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    :cond_a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    or-int/2addr v9, v11

    .line 249
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual {v10, v12, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 264
    .line 265
    const-string v1, "Read too much data during profile line parse"

    .line 266
    .line 267
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_e
    return-object v2
.end method

.method public static o(Ljava/io/ByteArrayOutputStream;[B[Lh2/e;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Li3/b;->d:[B

    .line 8
    .line 9
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v4, :cond_10

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v8, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    .line 30
    .line 31
    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    array-length v10, v2

    .line 35
    invoke-static {v9, v10}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 36
    .line 37
    .line 38
    const/4 v10, 0x2

    .line 39
    move v11, v6

    .line 40
    move v12, v10

    .line 41
    :goto_0
    array-length v13, v2

    .line 42
    if-ge v11, v13, :cond_0

    .line 43
    .line 44
    aget-object v13, v2, v11

    .line 45
    .line 46
    iget-wide v14, v13, Lh2/e;->g:J

    .line 47
    .line 48
    invoke-static {v9, v14, v15, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 49
    .line 50
    .line 51
    iget-wide v14, v13, Lh2/e;->j:J

    .line 52
    .line 53
    invoke-static {v9, v14, v15, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 54
    .line 55
    .line 56
    iget v14, v13, Lh2/e;->i:I

    .line 57
    .line 58
    int-to-long v14, v14

    .line 59
    invoke-static {v9, v14, v15, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 60
    .line 61
    .line 62
    iget-object v14, v13, Lh2/e;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v14, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v13, v13, Lh2/e;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v13, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v14, v13, v3}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    add-int/lit8 v12, v12, 0xe

    .line 75
    .line 76
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 77
    .line 78
    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    array-length v15, v15

    .line 83
    invoke-static {v9, v15}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 84
    .line 85
    .line 86
    add-int/2addr v12, v15

    .line 87
    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    invoke-virtual {v9, v13}, Ljava/io/OutputStream;->write([B)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v11, v11, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :goto_1
    move-object v1, v0

    .line 98
    goto/16 :goto_12

    .line 99
    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    array-length v11, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    const-string v13, ", does not match actual size "

    .line 108
    .line 109
    const-string v14, "Expected size "

    .line 110
    .line 111
    if-ne v12, v11, :cond_f

    .line 112
    .line 113
    :try_start_1
    new-instance v11, Li3/j;

    .line 114
    .line 115
    invoke-direct {v11, v3, v7, v6}, Li3/j;-><init>([BIZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 127
    .line 128
    .line 129
    move v9, v6

    .line 130
    move v11, v9

    .line 131
    :goto_2
    :try_start_2
    array-length v12, v2

    .line 132
    if-ge v9, v12, :cond_2

    .line 133
    .line 134
    aget-object v12, v2, v9

    .line 135
    .line 136
    invoke-static {v3, v9}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v11, v11, 0x4

    .line 140
    .line 141
    iget v15, v12, Lh2/e;->f:I

    .line 142
    .line 143
    invoke-static {v3, v15}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 144
    .line 145
    .line 146
    iget v15, v12, Lh2/e;->f:I

    .line 147
    .line 148
    mul-int/2addr v15, v10

    .line 149
    add-int/2addr v11, v15

    .line 150
    iget-object v12, v12, Lh2/e;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v12, [I

    .line 153
    .line 154
    array-length v15, v12

    .line 155
    move/from16 v16, v6

    .line 156
    .line 157
    move/from16 p1, v10

    .line 158
    .line 159
    move/from16 v10, v16

    .line 160
    .line 161
    :goto_3
    if-ge v10, v15, :cond_1

    .line 162
    .line 163
    aget v17, v12, v10

    .line 164
    .line 165
    sub-int v6, v17, v16

    .line 166
    .line 167
    invoke-static {v3, v6}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    move/from16 v16, v17

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    goto :goto_3

    .line 176
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    move/from16 v10, p1

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    goto :goto_2

    .line 182
    :goto_4
    move-object v1, v0

    .line 183
    goto/16 :goto_10

    .line 184
    .line 185
    :catchall_1
    move-exception v0

    .line 186
    goto :goto_4

    .line 187
    :cond_2
    move/from16 p1, v10

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    array-length v9, v6

    .line 194
    if-ne v11, v9, :cond_e

    .line 195
    .line 196
    new-instance v9, Li3/j;

    .line 197
    .line 198
    invoke-direct {v9, v6, v4, v7}, Li3/j;-><init>([BIZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 208
    .line 209
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 210
    .line 211
    .line 212
    const/4 v4, 0x0

    .line 213
    const/4 v6, 0x0

    .line 214
    :goto_5
    :try_start_3
    array-length v9, v2

    .line 215
    if-ge v4, v9, :cond_4

    .line 216
    .line 217
    aget-object v9, v2, v4

    .line 218
    .line 219
    iget-object v10, v9, Lh2/e;->e:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v10, Ljava/util/TreeMap;

    .line 222
    .line 223
    invoke-virtual {v10}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    const/4 v11, 0x0

    .line 232
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-eqz v12, :cond_3

    .line 237
    .line 238
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    check-cast v12, Ljava/util/Map$Entry;

    .line 243
    .line 244
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    check-cast v12, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    or-int/2addr v11, v12

    .line 255
    goto :goto_6

    .line 256
    :cond_3
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 257
    .line 258
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 259
    .line 260
    .line 261
    :try_start_4
    invoke-static {v10, v9}, Li3/b;->q(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 265
    .line 266
    .line 267
    move-result-object v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 268
    :try_start_5
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 269
    .line 270
    .line 271
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 272
    .line 273
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 274
    .line 275
    .line 276
    :try_start_6
    invoke-static {v10, v9}, Li3/b;->r(Ljava/io/ByteArrayOutputStream;Lh2/e;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 280
    .line 281
    .line 282
    move-result-object v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 283
    :try_start_7
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 284
    .line 285
    .line 286
    invoke-static {v3, v4}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 287
    .line 288
    .line 289
    array-length v10, v12

    .line 290
    add-int/lit8 v10, v10, 0x2

    .line 291
    .line 292
    array-length v15, v9

    .line 293
    add-int/2addr v10, v15

    .line 294
    add-int/lit8 v6, v6, 0x6

    .line 295
    .line 296
    move-object/from16 v16, v8

    .line 297
    .line 298
    int-to-long v7, v10

    .line 299
    invoke-static {v3, v7, v8, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 300
    .line 301
    .line 302
    invoke-static {v3, v11}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v12}, Ljava/io/OutputStream;->write([B)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v9}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 309
    .line 310
    .line 311
    add-int/2addr v6, v10

    .line 312
    add-int/lit8 v4, v4, 0x1

    .line 313
    .line 314
    move-object/from16 v8, v16

    .line 315
    .line 316
    const/4 v7, 0x1

    .line 317
    goto :goto_5

    .line 318
    :catchall_2
    move-exception v0

    .line 319
    move-object v1, v0

    .line 320
    goto/16 :goto_e

    .line 321
    .line 322
    :catchall_3
    move-exception v0

    .line 323
    move-object v1, v0

    .line 324
    :try_start_8
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catchall_4
    move-exception v0

    .line 329
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :goto_7
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 333
    :catchall_5
    move-exception v0

    .line 334
    move-object v1, v0

    .line 335
    :try_start_a
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 336
    .line 337
    .line 338
    goto :goto_8

    .line 339
    :catchall_6
    move-exception v0

    .line 340
    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    :goto_8
    throw v1

    .line 344
    :cond_4
    move-object/from16 v16, v8

    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    array-length v4, v2

    .line 351
    if-ne v6, v4, :cond_d

    .line 352
    .line 353
    new-instance v4, Li3/j;

    .line 354
    .line 355
    const/4 v15, 0x1

    .line 356
    invoke-direct {v4, v2, v5, v15}, Li3/j;-><init>([BIZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    int-to-long v2, v5

    .line 366
    add-long/2addr v2, v2

    .line 367
    const-wide/16 v6, 0x4

    .line 368
    .line 369
    add-long/2addr v2, v6

    .line 370
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    mul-int/lit8 v4, v4, 0x10

    .line 375
    .line 376
    int-to-long v6, v4

    .line 377
    add-long/2addr v2, v6

    .line 378
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    int-to-long v6, v4

    .line 383
    invoke-static {v0, v6, v7, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 384
    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-ge v4, v6, :cond_b

    .line 392
    .line 393
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    check-cast v6, Li3/j;

    .line 398
    .line 399
    iget v7, v6, Li3/j;->a:I

    .line 400
    .line 401
    const/4 v8, 0x1

    .line 402
    if-eq v7, v8, :cond_9

    .line 403
    .line 404
    const/4 v8, 0x2

    .line 405
    if-eq v7, v8, :cond_8

    .line 406
    .line 407
    const/4 v8, 0x3

    .line 408
    if-eq v7, v8, :cond_7

    .line 409
    .line 410
    const/4 v8, 0x4

    .line 411
    if-eq v7, v8, :cond_6

    .line 412
    .line 413
    const/4 v8, 0x5

    .line 414
    if-ne v7, v8, :cond_5

    .line 415
    .line 416
    const-wide/16 v7, 0x4

    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_5
    const/4 v0, 0x0

    .line 420
    throw v0

    .line 421
    :cond_6
    const-wide/16 v7, 0x3

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_7
    const-wide/16 v7, 0x2

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_8
    const-wide/16 v7, 0x1

    .line 428
    .line 429
    goto :goto_a

    .line 430
    :cond_9
    const-wide/16 v7, 0x0

    .line 431
    .line 432
    :goto_a
    invoke-static {v0, v7, v8, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 433
    .line 434
    .line 435
    invoke-static {v0, v2, v3, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 436
    .line 437
    .line 438
    iget-object v7, v6, Li3/j;->b:[B

    .line 439
    .line 440
    iget-boolean v6, v6, Li3/j;->c:Z

    .line 441
    .line 442
    if-eqz v6, :cond_a

    .line 443
    .line 444
    array-length v6, v7

    .line 445
    int-to-long v8, v6

    .line 446
    invoke-static {v7}, Li3/b;->a([B)[B

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    move-object/from16 v10, v16

    .line 451
    .line 452
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    array-length v7, v6

    .line 456
    int-to-long v11, v7

    .line 457
    invoke-static {v0, v11, v12, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 458
    .line 459
    .line 460
    invoke-static {v0, v8, v9, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 461
    .line 462
    .line 463
    array-length v6, v6

    .line 464
    :goto_b
    int-to-long v6, v6

    .line 465
    add-long/2addr v2, v6

    .line 466
    goto :goto_c

    .line 467
    :cond_a
    move-object/from16 v10, v16

    .line 468
    .line 469
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    array-length v6, v7

    .line 473
    int-to-long v8, v6

    .line 474
    invoke-static {v0, v8, v9, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 475
    .line 476
    .line 477
    const-wide/16 v8, 0x0

    .line 478
    .line 479
    invoke-static {v0, v8, v9, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 480
    .line 481
    .line 482
    array-length v6, v7

    .line 483
    goto :goto_b

    .line 484
    :goto_c
    add-int/lit8 v4, v4, 0x1

    .line 485
    .line 486
    move-object/from16 v16, v10

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_b
    move-object/from16 v10, v16

    .line 490
    .line 491
    const/4 v6, 0x0

    .line 492
    :goto_d
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-ge v6, v1, :cond_c

    .line 497
    .line 498
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, [B

    .line 503
    .line 504
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 505
    .line 506
    .line 507
    add-int/lit8 v6, v6, 0x1

    .line 508
    .line 509
    goto :goto_d

    .line 510
    :cond_c
    const/4 v15, 0x1

    .line 511
    goto/16 :goto_1b

    .line 512
    .line 513
    :cond_d
    :try_start_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 514
    .line 515
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    array-length v1, v2

    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 536
    .line 537
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 541
    :goto_e
    :try_start_d
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 542
    .line 543
    .line 544
    goto :goto_f

    .line 545
    :catchall_7
    move-exception v0

    .line 546
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 547
    .line 548
    .line 549
    :goto_f
    throw v1

    .line 550
    :cond_e
    :try_start_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    array-length v1, v6

    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 573
    .line 574
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 578
    :goto_10
    :try_start_f
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 579
    .line 580
    .line 581
    goto :goto_11

    .line 582
    :catchall_8
    move-exception v0

    .line 583
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 584
    .line 585
    .line 586
    :goto_11
    throw v1

    .line 587
    :cond_f
    :try_start_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    array-length v1, v3

    .line 602
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 610
    .line 611
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 615
    :goto_12
    :try_start_11
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 616
    .line 617
    .line 618
    goto :goto_13

    .line 619
    :catchall_9
    move-exception v0

    .line 620
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 621
    .line 622
    .line 623
    :goto_13
    throw v1

    .line 624
    :cond_10
    sget-object v3, Li3/b;->e:[B

    .line 625
    .line 626
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 627
    .line 628
    .line 629
    move-result v4

    .line 630
    if-eqz v4, :cond_11

    .line 631
    .line 632
    invoke-static {v2, v3}, Li3/b;->b([Lh2/e;[B)[B

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    array-length v2, v2

    .line 637
    int-to-long v2, v2

    .line 638
    const/4 v15, 0x1

    .line 639
    invoke-static {v0, v2, v3, v15}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 640
    .line 641
    .line 642
    array-length v2, v1

    .line 643
    int-to-long v2, v2

    .line 644
    invoke-static {v0, v2, v3, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 645
    .line 646
    .line 647
    invoke-static {v1}, Li3/b;->a([B)[B

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    array-length v2, v1

    .line 652
    int-to-long v2, v2

    .line 653
    invoke-static {v0, v2, v3, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 657
    .line 658
    .line 659
    :goto_14
    const/4 v15, 0x1

    .line 660
    return v15

    .line 661
    :cond_11
    const/4 v15, 0x1

    .line 662
    sget-object v3, Li3/b;->g:[B

    .line 663
    .line 664
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    if-eqz v4, :cond_14

    .line 669
    .line 670
    array-length v1, v2

    .line 671
    int-to-long v6, v1

    .line 672
    invoke-static {v0, v6, v7, v15}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 673
    .line 674
    .line 675
    array-length v1, v2

    .line 676
    const/4 v4, 0x0

    .line 677
    :goto_15
    if-ge v4, v1, :cond_c

    .line 678
    .line 679
    aget-object v6, v2, v4

    .line 680
    .line 681
    iget-object v7, v6, Lh2/e;->e:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v7, Ljava/util/TreeMap;

    .line 684
    .line 685
    invoke-virtual {v7}, Ljava/util/TreeMap;->size()I

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    mul-int/2addr v7, v5

    .line 690
    iget-object v8, v6, Lh2/e;->c:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v8, Ljava/lang/String;

    .line 693
    .line 694
    iget-object v9, v6, Lh2/e;->b:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v9, Ljava/lang/String;

    .line 697
    .line 698
    invoke-static {v9, v8, v3}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v8

    .line 702
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 703
    .line 704
    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 705
    .line 706
    .line 707
    move-result-object v10

    .line 708
    array-length v10, v10

    .line 709
    invoke-static {v0, v10}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 710
    .line 711
    .line 712
    iget-object v10, v6, Lh2/e;->d:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v10, [I

    .line 715
    .line 716
    array-length v10, v10

    .line 717
    invoke-static {v0, v10}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 718
    .line 719
    .line 720
    int-to-long v10, v7

    .line 721
    invoke-static {v0, v10, v11, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 722
    .line 723
    .line 724
    iget-wide v10, v6, Lh2/e;->g:J

    .line 725
    .line 726
    invoke-static {v0, v10, v11, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    invoke-virtual {v0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 734
    .line 735
    .line 736
    iget-object v7, v6, Lh2/e;->e:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v7, Ljava/util/TreeMap;

    .line 739
    .line 740
    invoke-virtual {v7}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 741
    .line 742
    .line 743
    move-result-object v7

    .line 744
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    .line 750
    .line 751
    move-result v8

    .line 752
    if-eqz v8, :cond_12

    .line 753
    .line 754
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    check-cast v8, Ljava/lang/Integer;

    .line 759
    .line 760
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 761
    .line 762
    .line 763
    move-result v8

    .line 764
    invoke-static {v0, v8}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 765
    .line 766
    .line 767
    const/4 v8, 0x0

    .line 768
    invoke-static {v0, v8}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_12
    iget-object v6, v6, Lh2/e;->d:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v6, [I

    .line 775
    .line 776
    array-length v7, v6

    .line 777
    const/4 v8, 0x0

    .line 778
    :goto_17
    if-ge v8, v7, :cond_13

    .line 779
    .line 780
    aget v9, v6, v8

    .line 781
    .line 782
    invoke-static {v0, v9}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 783
    .line 784
    .line 785
    add-int/lit8 v8, v8, 0x1

    .line 786
    .line 787
    goto :goto_17

    .line 788
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 789
    .line 790
    goto :goto_15

    .line 791
    :cond_14
    sget-object v3, Li3/b;->f:[B

    .line 792
    .line 793
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    if-eqz v4, :cond_15

    .line 798
    .line 799
    invoke-static {v2, v3}, Li3/b;->b([Lh2/e;[B)[B

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    array-length v2, v2

    .line 804
    int-to-long v2, v2

    .line 805
    const/4 v15, 0x1

    .line 806
    invoke-static {v0, v2, v3, v15}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 807
    .line 808
    .line 809
    array-length v2, v1

    .line 810
    int-to-long v2, v2

    .line 811
    invoke-static {v0, v2, v3, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 812
    .line 813
    .line 814
    invoke-static {v1}, Li3/b;->a([B)[B

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    array-length v2, v1

    .line 819
    int-to-long v2, v2

    .line 820
    invoke-static {v0, v2, v3, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 824
    .line 825
    .line 826
    goto/16 :goto_14

    .line 827
    .line 828
    :cond_15
    sget-object v3, Li3/b;->h:[B

    .line 829
    .line 830
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    if-eqz v1, :cond_18

    .line 835
    .line 836
    array-length v1, v2

    .line 837
    invoke-static {v0, v1}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 838
    .line 839
    .line 840
    array-length v1, v2

    .line 841
    const/4 v8, 0x0

    .line 842
    :goto_18
    if-ge v8, v1, :cond_c

    .line 843
    .line 844
    aget-object v4, v2, v8

    .line 845
    .line 846
    iget-object v6, v4, Lh2/e;->b:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v6, Ljava/lang/String;

    .line 849
    .line 850
    iget-object v7, v4, Lh2/e;->c:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v7, Ljava/lang/String;

    .line 853
    .line 854
    invoke-static {v6, v7, v3}, Li3/b;->d(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v6

    .line 858
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 859
    .line 860
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 861
    .line 862
    .line 863
    move-result-object v9

    .line 864
    array-length v9, v9

    .line 865
    invoke-static {v0, v9}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 866
    .line 867
    .line 868
    iget-object v9, v4, Lh2/e;->e:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v9, Ljava/util/TreeMap;

    .line 871
    .line 872
    invoke-virtual {v9}, Ljava/util/TreeMap;->size()I

    .line 873
    .line 874
    .line 875
    move-result v10

    .line 876
    invoke-static {v0, v10}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 877
    .line 878
    .line 879
    iget-object v10, v4, Lh2/e;->d:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v10, [I

    .line 882
    .line 883
    array-length v10, v10

    .line 884
    invoke-static {v0, v10}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 885
    .line 886
    .line 887
    iget-wide v10, v4, Lh2/e;->g:J

    .line 888
    .line 889
    invoke-static {v0, v10, v11, v5}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 893
    .line 894
    .line 895
    move-result-object v6

    .line 896
    invoke-virtual {v0, v6}, Ljava/io/OutputStream;->write([B)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v9}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 900
    .line 901
    .line 902
    move-result-object v6

    .line 903
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    :goto_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    if-eqz v7, :cond_16

    .line 912
    .line 913
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    check-cast v7, Ljava/lang/Integer;

    .line 918
    .line 919
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 920
    .line 921
    .line 922
    move-result v7

    .line 923
    invoke-static {v0, v7}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 924
    .line 925
    .line 926
    goto :goto_19

    .line 927
    :cond_16
    iget-object v4, v4, Lh2/e;->d:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v4, [I

    .line 930
    .line 931
    array-length v6, v4

    .line 932
    const/4 v7, 0x0

    .line 933
    :goto_1a
    if-ge v7, v6, :cond_17

    .line 934
    .line 935
    aget v9, v4, v7

    .line 936
    .line 937
    invoke-static {v0, v9}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 938
    .line 939
    .line 940
    add-int/lit8 v7, v7, 0x1

    .line 941
    .line 942
    goto :goto_1a

    .line 943
    :cond_17
    add-int/lit8 v8, v8, 0x1

    .line 944
    .line 945
    goto :goto_18

    .line 946
    :goto_1b
    return v15

    .line 947
    :cond_18
    const/16 v18, 0x0

    .line 948
    .line 949
    return v18
.end method

.method public static p(Ljava/io/ByteArrayOutputStream;Lh2/e;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v1, v1

    .line 8
    invoke-static {p0, v1}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 9
    .line 10
    .line 11
    iget v1, p1, Lh2/e;->f:I

    .line 12
    .line 13
    invoke-static {p0, v1}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 14
    .line 15
    .line 16
    iget v1, p1, Lh2/e;->h:I

    .line 17
    .line 18
    int-to-long v1, v1

    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-static {p0, v1, v2, v3}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 21
    .line 22
    .line 23
    iget-wide v1, p1, Lh2/e;->g:J

    .line 24
    .line 25
    invoke-static {p0, v1, v2, v3}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 26
    .line 27
    .line 28
    iget p1, p1, Lh2/e;->i:I

    .line 29
    .line 30
    int-to-long v1, p1

    .line 31
    invoke-static {p0, v1, v2, v3}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static q(Ljava/io/ByteArrayOutputStream;Lh2/e;)V
    .locals 8

    .line 1
    iget v0, p1, Lh2/e;->i:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x7

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x8

    .line 8
    .line 9
    div-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    new-array v0, v0, [B

    .line 12
    .line 13
    iget-object v1, p1, Lh2/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/TreeMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    and-int/lit8 v4, v2, 0x2

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    div-int/lit8 v4, v3, 0x8

    .line 63
    .line 64
    aget-byte v6, v0, v4

    .line 65
    .line 66
    rem-int/lit8 v7, v3, 0x8

    .line 67
    .line 68
    shl-int v7, v5, v7

    .line 69
    .line 70
    or-int/2addr v6, v7

    .line 71
    int-to-byte v6, v6

    .line 72
    aput-byte v6, v0, v4

    .line 73
    .line 74
    :cond_1
    and-int/lit8 v2, v2, 0x4

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget v2, p1, Lh2/e;->i:I

    .line 79
    .line 80
    add-int/2addr v3, v2

    .line 81
    div-int/lit8 v2, v3, 0x8

    .line 82
    .line 83
    aget-byte v4, v0, v2

    .line 84
    .line 85
    rem-int/lit8 v3, v3, 0x8

    .line 86
    .line 87
    shl-int v3, v5, v3

    .line 88
    .line 89
    or-int/2addr v3, v4

    .line 90
    int-to-byte v3, v3

    .line 91
    aput-byte v3, v0, v2

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static r(Ljava/io/ByteArrayOutputStream;Lh2/e;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lh2/e;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    and-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sub-int v1, v3, v1

    .line 53
    .line 54
    invoke-static {p0, v1}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, Li3/b;->u(Ljava/io/ByteArrayOutputStream;I)V

    .line 58
    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-void
.end method

.method public static s(Landroid/content/Context;Ljava/util/concurrent/Executor;Li3/a;Z)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    new-instance v0, Ljava/io/File;

    .line 22
    .line 23
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v6, 0x7

    .line 37
    const/4 v7, 0x0

    .line 38
    :try_start_0
    invoke-virtual {v0, v3, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v8
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_12

    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    const-string v10, "ProfileInstaller"

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    if-nez p3, :cond_4

    .line 50
    .line 51
    new-instance v0, Ljava/io/File;

    .line 52
    .line 53
    const-string v13, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 54
    .line 55
    invoke-direct {v0, v9, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-nez v13, :cond_0

    .line 63
    .line 64
    :catch_0
    move v0, v7

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    :try_start_1
    new-instance v13, Ljava/io/DataInputStream;

    .line 67
    .line 68
    new-instance v14, Ljava/io/FileInputStream;

    .line 69
    .line 70
    invoke-direct {v14, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v13, v14}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    .line 75
    .line 76
    :try_start_2
    invoke-virtual {v13}, Ljava/io/DataInputStream;->readLong()J

    .line 77
    .line 78
    .line 79
    move-result-wide v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    :try_start_3
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 81
    .line 82
    .line 83
    iget-wide v12, v8, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 84
    .line 85
    cmp-long v0, v14, v12

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move v0, v7

    .line 92
    :goto_0
    if-eqz v0, :cond_2

    .line 93
    .line 94
    const/4 v12, 0x2

    .line 95
    invoke-interface {v2, v12, v11}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object v12, v0

    .line 101
    :try_start_4
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    :try_start_5
    invoke-virtual {v12, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    throw v12
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 110
    :cond_2
    :goto_2
    if-nez v0, :cond_3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v2, "Skipping profile installation for "

    .line 116
    .line 117
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v10, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v7}, Li3/i;->c(Landroid/content/Context;Z)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_32

    .line 138
    .line 139
    :cond_4
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v12, "Installing profile for "

    .line 142
    .line 143
    invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v10, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    new-instance v10, Ljava/io/File;

    .line 163
    .line 164
    new-instance v12, Ljava/io/File;

    .line 165
    .line 166
    const-string v13, "/data/misc/profiles/cur/0"

    .line 167
    .line 168
    invoke-direct {v12, v13, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v3, "primary.prof"

    .line 172
    .line 173
    invoke-direct {v10, v12, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    new-instance v3, LK8/A;

    .line 177
    .line 178
    const-string v12, "dexopt/baseline.prof"

    .line 179
    .line 180
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    iput-boolean v13, v3, LK8/A;->b:Z

    .line 185
    .line 186
    move-object/from16 v13, p1

    .line 187
    .line 188
    iput-object v13, v3, LK8/A;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v2, v3, LK8/A;->d:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v4, v3, LK8/A;->a:Ljava/lang/String;

    .line 193
    .line 194
    iput-object v10, v3, LK8/A;->f:Ljava/lang/Object;

    .line 195
    .line 196
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 197
    .line 198
    const/16 v13, 0x18

    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    if-lt v4, v13, :cond_6

    .line 202
    .line 203
    const/16 v13, 0x22

    .line 204
    .line 205
    if-le v4, v13, :cond_5

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_5
    packed-switch v4, :pswitch_data_0

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :pswitch_0
    sget-object v14, Li3/b;->d:[B

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :pswitch_1
    sget-object v14, Li3/b;->e:[B

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :pswitch_2
    sget-object v14, Li3/b;->f:[B

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :pswitch_3
    sget-object v14, Li3/b;->g:[B

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :pswitch_4
    sget-object v14, Li3/b;->h:[B

    .line 225
    .line 226
    :cond_6
    :goto_4
    iput-object v14, v3, LK8/A;->e:Ljava/lang/Object;

    .line 227
    .line 228
    iget-object v4, v3, LK8/A;->e:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v4, [B

    .line 231
    .line 232
    if-nez v4, :cond_7

    .line 233
    .line 234
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const/4 v2, 0x3

    .line 239
    invoke-virtual {v3, v2, v0}, LK8/A;->b(ILjava/io/Serializable;)V

    .line 240
    .line 241
    .line 242
    :goto_5
    const/4 v10, 0x1

    .line 243
    goto/16 :goto_2f

    .line 244
    .line 245
    :cond_7
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    const/4 v13, 0x4

    .line 250
    if-eqz v0, :cond_9

    .line 251
    .line 252
    invoke-virtual {v10}, Ljava/io/File;->canWrite()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_8

    .line 257
    .line 258
    invoke-virtual {v3, v13, v11}, LK8/A;->b(ILjava/io/Serializable;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_8
    :goto_6
    const/4 v10, 0x1

    .line 263
    goto :goto_7

    .line 264
    :cond_9
    :try_start_6
    invoke-virtual {v10}, Ljava/io/File;->createNewFile()Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_11

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :goto_7
    iput-boolean v10, v3, LK8/A;->b:Z

    .line 269
    .line 270
    sget-object v10, Li3/b;->b:[B

    .line 271
    .line 272
    const/4 v14, 0x6

    .line 273
    :try_start_7
    invoke-virtual {v3, v5, v12}, LK8/A;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 274
    .line 275
    .line 276
    move-result-object v0
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 277
    move-object v12, v0

    .line 278
    goto :goto_9

    .line 279
    :catch_1
    move-exception v0

    .line 280
    invoke-interface {v2, v6, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :catch_2
    move-exception v0

    .line 285
    invoke-interface {v2, v14, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 286
    .line 287
    .line 288
    :goto_8
    move-object v12, v11

    .line 289
    :goto_9
    const-string v15, "Invalid magic"

    .line 290
    .line 291
    const/16 v14, 0x8

    .line 292
    .line 293
    if-eqz v12, :cond_b

    .line 294
    .line 295
    :try_start_8
    invoke-static {v12, v13}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v10, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_a

    .line 304
    .line 305
    invoke-static {v12, v13}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    iget-object v7, v3, LK8/A;->a:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v12, v0, v7}, Li3/b;->l(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh2/e;

    .line 312
    .line 313
    .line 314
    move-result-object v7
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 315
    :try_start_9
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 316
    .line 317
    .line 318
    goto :goto_e

    .line 319
    :catch_3
    move-exception v0

    .line 320
    invoke-interface {v2, v6, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 321
    .line 322
    .line 323
    goto :goto_e

    .line 324
    :goto_a
    move-object v1, v0

    .line 325
    goto :goto_f

    .line 326
    :catchall_2
    move-exception v0

    .line 327
    goto :goto_a

    .line 328
    :catch_4
    move-exception v0

    .line 329
    goto :goto_b

    .line 330
    :catch_5
    move-exception v0

    .line 331
    goto :goto_c

    .line 332
    :cond_a
    :try_start_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 338
    :goto_b
    :try_start_b
    invoke-interface {v2, v14, v0}, Li3/a;->a(ILjava/io/Serializable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 339
    .line 340
    .line 341
    :try_start_c
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 342
    .line 343
    .line 344
    goto :goto_d

    .line 345
    :catch_6
    move-exception v0

    .line 346
    invoke-interface {v2, v6, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 347
    .line 348
    .line 349
    goto :goto_d

    .line 350
    :goto_c
    :try_start_d
    invoke-interface {v2, v6, v0}, Li3/a;->a(ILjava/io/Serializable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 351
    .line 352
    .line 353
    :try_start_e
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    .line 354
    .line 355
    .line 356
    :goto_d
    move-object v7, v11

    .line 357
    :goto_e
    iput-object v7, v3, LK8/A;->g:Ljava/lang/Object;

    .line 358
    .line 359
    goto :goto_11

    .line 360
    :goto_f
    :try_start_f
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7

    .line 361
    .line 362
    .line 363
    goto :goto_10

    .line 364
    :catch_7
    move-exception v0

    .line 365
    invoke-interface {v2, v6, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 366
    .line 367
    .line 368
    :goto_10
    throw v1

    .line 369
    :cond_b
    :goto_11
    iget-object v0, v3, LK8/A;->g:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, [Lh2/e;

    .line 372
    .line 373
    if-eqz v0, :cond_11

    .line 374
    .line 375
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 376
    .line 377
    const/16 v12, 0x18

    .line 378
    .line 379
    if-lt v7, v12, :cond_11

    .line 380
    .line 381
    const/16 v6, 0x22

    .line 382
    .line 383
    if-le v7, v6, :cond_c

    .line 384
    .line 385
    goto/16 :goto_19

    .line 386
    .line 387
    :cond_c
    if-eq v7, v12, :cond_d

    .line 388
    .line 389
    const/16 v6, 0x19

    .line 390
    .line 391
    if-eq v7, v6, :cond_d

    .line 392
    .line 393
    packed-switch v7, :pswitch_data_1

    .line 394
    .line 395
    .line 396
    goto :goto_19

    .line 397
    :cond_d
    :pswitch_5
    :try_start_10
    const-string v6, "dexopt/baseline.profm"

    .line 398
    .line 399
    invoke-virtual {v3, v5, v6}, LK8/A;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 400
    .line 401
    .line 402
    move-result-object v5
    :try_end_10
    .catch Ljava/io/FileNotFoundException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_8

    .line 403
    if-eqz v5, :cond_f

    .line 404
    .line 405
    :try_start_11
    sget-object v6, Li3/b;->c:[B

    .line 406
    .line 407
    invoke-static {v5, v13}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    if-eqz v6, :cond_e

    .line 416
    .line 417
    invoke-static {v5, v13}, Li3/b;->f(Ljava/io/InputStream;I)[B

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-static {v5, v6, v4, v0}, Li3/b;->i(Ljava/io/FileInputStream;[B[B[Lh2/e;)[Lh2/e;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    iput-object v0, v3, LK8/A;->g:Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 426
    .line 427
    :try_start_12
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/FileNotFoundException; {:try_start_12 .. :try_end_12} :catch_a
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_12} :catch_8

    .line 428
    .line 429
    .line 430
    move-object v0, v3

    .line 431
    goto :goto_18

    .line 432
    :catch_8
    move-exception v0

    .line 433
    goto :goto_14

    .line 434
    :catch_9
    move-exception v0

    .line 435
    const/4 v4, 0x7

    .line 436
    goto :goto_15

    .line 437
    :catch_a
    move-exception v0

    .line 438
    goto :goto_16

    .line 439
    :catchall_3
    move-exception v0

    .line 440
    move-object v4, v0

    .line 441
    goto :goto_12

    .line 442
    :cond_e
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 443
    .line 444
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 448
    :goto_12
    :try_start_14
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 449
    .line 450
    .line 451
    goto :goto_13

    .line 452
    :catchall_4
    move-exception v0

    .line 453
    :try_start_15
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    :goto_13
    throw v4

    .line 457
    :cond_f
    if-eqz v5, :cond_10

    .line 458
    .line 459
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catch Ljava/io/FileNotFoundException; {:try_start_15 .. :try_end_15} :catch_a
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_15 .. :try_end_15} :catch_8

    .line 460
    .line 461
    .line 462
    goto :goto_17

    .line 463
    :goto_14
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;

    .line 464
    .line 465
    invoke-interface {v2, v14, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 466
    .line 467
    .line 468
    goto :goto_17

    .line 469
    :goto_15
    invoke-interface {v2, v4, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 470
    .line 471
    .line 472
    goto :goto_17

    .line 473
    :goto_16
    const/16 v4, 0x9

    .line 474
    .line 475
    invoke-interface {v2, v4, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 476
    .line 477
    .line 478
    :cond_10
    :goto_17
    move-object v0, v11

    .line 479
    :goto_18
    if-eqz v0, :cond_11

    .line 480
    .line 481
    move-object v3, v0

    .line 482
    :cond_11
    :goto_19
    iget-object v0, v3, LK8/A;->d:Ljava/lang/Object;

    .line 483
    .line 484
    move-object v2, v0

    .line 485
    check-cast v2, Li3/a;

    .line 486
    .line 487
    iget-object v0, v3, LK8/A;->g:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, [Lh2/e;

    .line 490
    .line 491
    const-string v4, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    .line 492
    .line 493
    if-eqz v0, :cond_15

    .line 494
    .line 495
    iget-object v5, v3, LK8/A;->e:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v5, [B

    .line 498
    .line 499
    if-nez v5, :cond_12

    .line 500
    .line 501
    goto :goto_1f

    .line 502
    :cond_12
    iget-boolean v6, v3, LK8/A;->b:Z

    .line 503
    .line 504
    if-eqz v6, :cond_14

    .line 505
    .line 506
    :try_start_16
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 507
    .line 508
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_16 .. :try_end_16} :catch_b

    .line 509
    .line 510
    .line 511
    :try_start_17
    invoke-virtual {v6, v10}, Ljava/io/OutputStream;->write([B)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write([B)V

    .line 515
    .line 516
    .line 517
    invoke-static {v6, v5, v0}, Li3/b;->o(Ljava/io/ByteArrayOutputStream;[B[Lh2/e;)Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-nez v0, :cond_13

    .line 522
    .line 523
    const/4 v0, 0x5

    .line 524
    invoke-interface {v2, v0, v11}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 525
    .line 526
    .line 527
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 528
    .line 529
    :try_start_18
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_18 .. :try_end_18} :catch_b

    .line 530
    .line 531
    .line 532
    goto :goto_1f

    .line 533
    :catch_b
    move-exception v0

    .line 534
    goto :goto_1c

    .line 535
    :catch_c
    move-exception v0

    .line 536
    const/4 v5, 0x7

    .line 537
    goto :goto_1d

    .line 538
    :catchall_5
    move-exception v0

    .line 539
    move-object v5, v0

    .line 540
    goto :goto_1a

    .line 541
    :cond_13
    :try_start_19
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iput-object v0, v3, LK8/A;->h:Ljava/lang/Object;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_5

    .line 546
    .line 547
    :try_start_1a
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_1a .. :try_end_1a} :catch_b

    .line 548
    .line 549
    .line 550
    goto :goto_1e

    .line 551
    :goto_1a
    :try_start_1b
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    .line 552
    .line 553
    .line 554
    goto :goto_1b

    .line 555
    :catchall_6
    move-exception v0

    .line 556
    :try_start_1c
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 557
    .line 558
    .line 559
    :goto_1b
    throw v5
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_1c .. :try_end_1c} :catch_b

    .line 560
    :goto_1c
    invoke-interface {v2, v14, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 561
    .line 562
    .line 563
    goto :goto_1e

    .line 564
    :goto_1d
    invoke-interface {v2, v5, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 565
    .line 566
    .line 567
    :goto_1e
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;

    .line 568
    .line 569
    goto :goto_1f

    .line 570
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 571
    .line 572
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :cond_15
    :goto_1f
    iget-object v0, v3, LK8/A;->h:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, [B

    .line 579
    .line 580
    if-nez v0, :cond_16

    .line 581
    .line 582
    const/4 v0, 0x0

    .line 583
    const/4 v10, 0x1

    .line 584
    goto/16 :goto_2d

    .line 585
    .line 586
    :cond_16
    iget-boolean v2, v3, LK8/A;->b:Z

    .line 587
    .line 588
    if-eqz v2, :cond_19

    .line 589
    .line 590
    :try_start_1d
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 591
    .line 592
    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1d
    .catch Ljava/io/FileNotFoundException; {:try_start_1d .. :try_end_1d} :catch_10
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_f
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    .line 593
    .line 594
    .line 595
    :try_start_1e
    new-instance v4, Ljava/io/FileOutputStream;

    .line 596
    .line 597
    iget-object v0, v3, LK8/A;->f:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Ljava/io/File;

    .line 600
    .line 601
    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_c

    .line 602
    .line 603
    .line 604
    const/16 v0, 0x200

    .line 605
    .line 606
    :try_start_1f
    new-array v0, v0, [B

    .line 607
    .line 608
    :goto_20
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    if-lez v5, :cond_17

    .line 613
    .line 614
    const/4 v6, 0x0

    .line 615
    invoke-virtual {v4, v0, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_a

    .line 616
    .line 617
    .line 618
    goto :goto_20

    .line 619
    :cond_17
    const/4 v10, 0x1

    .line 620
    :try_start_20
    invoke-virtual {v3, v10, v11}, LK8/A;->b(ILjava/io/Serializable;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_9

    .line 621
    .line 622
    .line 623
    :try_start_21
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_8

    .line 624
    .line 625
    .line 626
    :try_start_22
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_22
    .catch Ljava/io/FileNotFoundException; {:try_start_22 .. :try_end_22} :catch_e
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_d
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    .line 627
    .line 628
    .line 629
    iput-object v11, v3, LK8/A;->h:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;

    .line 632
    .line 633
    move v0, v10

    .line 634
    goto :goto_2d

    .line 635
    :catchall_7
    move-exception v0

    .line 636
    goto :goto_2e

    .line 637
    :catch_d
    move-exception v0

    .line 638
    :goto_21
    const/4 v4, 0x7

    .line 639
    goto :goto_29

    .line 640
    :catch_e
    move-exception v0

    .line 641
    :goto_22
    const/4 v2, 0x6

    .line 642
    goto :goto_2b

    .line 643
    :catchall_8
    move-exception v0

    .line 644
    :goto_23
    move-object v4, v0

    .line 645
    goto :goto_27

    .line 646
    :catchall_9
    move-exception v0

    .line 647
    :goto_24
    move-object v5, v0

    .line 648
    goto :goto_25

    .line 649
    :catchall_a
    move-exception v0

    .line 650
    const/4 v10, 0x1

    .line 651
    goto :goto_24

    .line 652
    :goto_25
    :try_start_23
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_b

    .line 653
    .line 654
    .line 655
    goto :goto_26

    .line 656
    :catchall_b
    move-exception v0

    .line 657
    :try_start_24
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 658
    .line 659
    .line 660
    :goto_26
    throw v5
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    .line 661
    :catchall_c
    move-exception v0

    .line 662
    const/4 v10, 0x1

    .line 663
    goto :goto_23

    .line 664
    :goto_27
    :try_start_25
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_d

    .line 665
    .line 666
    .line 667
    goto :goto_28

    .line 668
    :catchall_d
    move-exception v0

    .line 669
    :try_start_26
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 670
    .line 671
    .line 672
    :goto_28
    throw v4
    :try_end_26
    .catch Ljava/io/FileNotFoundException; {:try_start_26 .. :try_end_26} :catch_e
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_d
    .catchall {:try_start_26 .. :try_end_26} :catchall_7

    .line 673
    :catch_f
    move-exception v0

    .line 674
    const/4 v10, 0x1

    .line 675
    goto :goto_21

    .line 676
    :catch_10
    move-exception v0

    .line 677
    const/4 v10, 0x1

    .line 678
    goto :goto_22

    .line 679
    :goto_29
    :try_start_27
    invoke-virtual {v3, v4, v0}, LK8/A;->b(ILjava/io/Serializable;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    .line 680
    .line 681
    .line 682
    :goto_2a
    iput-object v11, v3, LK8/A;->h:Ljava/lang/Object;

    .line 683
    .line 684
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;

    .line 685
    .line 686
    goto :goto_2c

    .line 687
    :goto_2b
    :try_start_28
    invoke-virtual {v3, v2, v0}, LK8/A;->b(ILjava/io/Serializable;)V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_7

    .line 688
    .line 689
    .line 690
    goto :goto_2a

    .line 691
    :goto_2c
    const/4 v0, 0x0

    .line 692
    :goto_2d
    if-eqz v0, :cond_18

    .line 693
    .line 694
    invoke-static {v8, v9}, Li3/b;->e(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 695
    .line 696
    .line 697
    :cond_18
    move v6, v0

    .line 698
    goto :goto_30

    .line 699
    :goto_2e
    iput-object v11, v3, LK8/A;->h:Ljava/lang/Object;

    .line 700
    .line 701
    iput-object v11, v3, LK8/A;->g:Ljava/lang/Object;

    .line 702
    .line 703
    throw v0

    .line 704
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 705
    .line 706
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    throw v0

    .line 710
    :catch_11
    const/4 v10, 0x1

    .line 711
    invoke-virtual {v3, v13, v11}, LK8/A;->b(ILjava/io/Serializable;)V

    .line 712
    .line 713
    .line 714
    :goto_2f
    const/4 v6, 0x0

    .line 715
    :goto_30
    if-eqz v6, :cond_1a

    .line 716
    .line 717
    if-eqz p3, :cond_1a

    .line 718
    .line 719
    move v7, v10

    .line 720
    goto :goto_31

    .line 721
    :cond_1a
    const/4 v7, 0x0

    .line 722
    :goto_31
    invoke-static {v1, v7}, Li3/i;->c(Landroid/content/Context;Z)V

    .line 723
    .line 724
    .line 725
    :goto_32
    return-void

    .line 726
    :catch_12
    move-exception v0

    .line 727
    const/4 v4, 0x7

    .line 728
    invoke-interface {v2, v4, v0}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 729
    .line 730
    .line 731
    const/4 v6, 0x0

    .line 732
    invoke-static {v1, v6}, Li3/i;->c(Landroid/content/Context;Z)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    nop

    .line 737
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    :pswitch_data_1
    .packed-switch 0x1f
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public static t(Ljava/io/ByteArrayOutputStream;JI)V
    .locals 6

    .line 1
    new-array v0, p3, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p3, :cond_0

    .line 5
    .line 6
    mul-int/lit8 v2, v1, 0x8

    .line 7
    .line 8
    shr-long v2, p1, v2

    .line 9
    .line 10
    const-wide/16 v4, 0xff

    .line 11
    .line 12
    and-long/2addr v2, v4

    .line 13
    long-to-int v2, v2

    .line 14
    int-to-byte v2, v2

    .line 15
    aput-byte v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static u(Ljava/io/ByteArrayOutputStream;I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    const/4 p1, 0x2

    .line 3
    invoke-static {p0, v0, v1, p1}, Li3/b;->t(Ljava/io/ByteArrayOutputStream;JI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
