.class public final LA4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[I

.field public final b:[I

.field public final c:LS3/c;

.field public d:Ljava/nio/ByteBuffer;

.field public e:[B

.field public f:[S

.field public g:[B

.field public h:[B

.field public i:[B

.field public final j:[I

.field public k:I

.field public l:LA4/b;

.field public m:Landroid/graphics/Bitmap;

.field public final n:Z

.field public o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:Ljava/lang/Boolean;

.field public t:Landroid/graphics/Bitmap$Config;


# direct methods
.method public constructor <init>(LS3/c;LA4/b;Ljava/nio/ByteBuffer;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x100

    .line 5
    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, LA4/d;->b:[I

    .line 9
    .line 10
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 11
    .line 12
    iput-object v0, p0, LA4/d;->t:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-object p1, p0, LA4/d;->c:LS3/c;

    .line 15
    .line 16
    new-instance p1, LA4/b;

    .line 17
    .line 18
    invoke-direct {p1}, LA4/b;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LA4/d;->l:LA4/b;

    .line 22
    .line 23
    const-string p1, "Sample size must be >=0, not: "

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    if-lez p4, :cond_2

    .line 27
    .line 28
    :try_start_0
    invoke-static {p4}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p4, 0x0

    .line 33
    iput p4, p0, LA4/d;->o:I

    .line 34
    .line 35
    iput-object p2, p0, LA4/d;->l:LA4/b;

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, LA4/d;->k:I

    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    iput-object p3, p0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    invoke-virtual {p3, p4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 47
    .line 48
    .line 49
    iget-object p3, p0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 52
    .line 53
    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    iput-boolean p4, p0, LA4/d;->n:Z

    .line 57
    .line 58
    iget-object p3, p2, LA4/b;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p4

    .line 68
    if-eqz p4, :cond_1

    .line 69
    .line 70
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    check-cast p4, LA4/a;

    .line 75
    .line 76
    iget p4, p4, LA4/a;->g:I

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    if-ne p4, v0, :cond_0

    .line 80
    .line 81
    const/4 p3, 0x1

    .line 82
    iput-boolean p3, p0, LA4/d;->n:Z

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    :goto_0
    iput p1, p0, LA4/d;->p:I

    .line 88
    .line 89
    iget p3, p2, LA4/b;->f:I

    .line 90
    .line 91
    div-int p4, p3, p1

    .line 92
    .line 93
    iput p4, p0, LA4/d;->r:I

    .line 94
    .line 95
    iget p2, p2, LA4/b;->g:I

    .line 96
    .line 97
    div-int p1, p2, p1

    .line 98
    .line 99
    iput p1, p0, LA4/d;->q:I

    .line 100
    .line 101
    iget-object p1, p0, LA4/d;->c:LS3/c;

    .line 102
    .line 103
    mul-int/2addr p3, p2

    .line 104
    iget-object p1, p1, LS3/c;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, LF4/f;

    .line 107
    .line 108
    const-class p2, [B

    .line 109
    .line 110
    invoke-virtual {p1, p3, p2}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, [B

    .line 115
    .line 116
    iput-object p1, p0, LA4/d;->i:[B

    .line 117
    .line 118
    iget-object p1, p0, LA4/d;->c:LS3/c;

    .line 119
    .line 120
    iget p2, p0, LA4/d;->r:I

    .line 121
    .line 122
    iget p3, p0, LA4/d;->q:I

    .line 123
    .line 124
    mul-int/2addr p2, p3

    .line 125
    iget-object p1, p1, LS3/c;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, LF4/f;

    .line 128
    .line 129
    const-class p3, [I

    .line 130
    .line 131
    invoke-virtual {p1, p2, p3}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, [I

    .line 136
    .line 137
    iput-object p1, p0, LA4/d;->j:[I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return-void

    .line 141
    :cond_2
    :try_start_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    new-instance p3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p2

    .line 159
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    throw p1
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget-object v0, p0, LA4/d;->s:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, LA4/d;->t:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    :goto_1
    iget v1, p0, LA4/d;->r:I

    .line 18
    .line 19
    iget v2, p0, LA4/d;->q:I

    .line 20
    .line 21
    iget-object v3, p0, LA4/d;->c:LS3/c;

    .line 22
    .line 23
    iget-object v3, v3, LS3/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, LF4/a;

    .line 26
    .line 27
    invoke-interface {v3, v1, v2, v0}, LF4/a;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final declared-synchronized b()Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "Unable to decode frame, status="

    .line 2
    .line 3
    const-string v1, "No valid color table found for frame #"

    .line 4
    .line 5
    const-string v2, "Unable to decode frame, frameCount="

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v3, p0, LA4/d;->l:LA4/b;

    .line 9
    .line 10
    iget v3, v3, LA4/b;->c:I

    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x1

    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    iget v3, p0, LA4/d;->k:I

    .line 17
    .line 18
    if-gez v3, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    :goto_0
    const-string v3, "d"

    .line 25
    .line 26
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const-string v3, "d"

    .line 33
    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, LA4/d;->l:LA4/b;

    .line 40
    .line 41
    iget v2, v2, LA4/b;->c:I

    .line 42
    .line 43
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ", framePointer="

    .line 47
    .line 48
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v2, p0, LA4/d;->k:I

    .line 52
    .line 53
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_1
    iput v5, p0, LA4/d;->o:I

    .line 64
    .line 65
    :cond_2
    iget v2, p0, LA4/d;->o:I

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    if-eq v2, v5, :cond_a

    .line 69
    .line 70
    const/4 v6, 0x2

    .line 71
    if-ne v2, v6, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    const/4 v0, 0x0

    .line 76
    iput v0, p0, LA4/d;->o:I

    .line 77
    .line 78
    iget-object v2, p0, LA4/d;->e:[B

    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    iget-object v2, p0, LA4/d;->c:LS3/c;

    .line 83
    .line 84
    iget-object v2, v2, LS3/c;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, LF4/f;

    .line 87
    .line 88
    const-class v7, [B

    .line 89
    .line 90
    const/16 v8, 0xff

    .line 91
    .line 92
    invoke-virtual {v2, v8, v7}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, [B

    .line 97
    .line 98
    iput-object v2, p0, LA4/d;->e:[B

    .line 99
    .line 100
    :cond_4
    iget-object v2, p0, LA4/d;->l:LA4/b;

    .line 101
    .line 102
    iget-object v2, v2, LA4/b;->e:Ljava/util/ArrayList;

    .line 103
    .line 104
    iget v7, p0, LA4/d;->k:I

    .line 105
    .line 106
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, LA4/a;

    .line 111
    .line 112
    iget v7, p0, LA4/d;->k:I

    .line 113
    .line 114
    sub-int/2addr v7, v5

    .line 115
    if-ltz v7, :cond_5

    .line 116
    .line 117
    iget-object v8, p0, LA4/d;->l:LA4/b;

    .line 118
    .line 119
    iget-object v8, v8, LA4/b;->e:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, LA4/a;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move-object v7, v3

    .line 129
    :goto_1
    iget-object v8, v2, LA4/a;->k:[I

    .line 130
    .line 131
    if-eqz v8, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iget-object v8, p0, LA4/d;->l:LA4/b;

    .line 135
    .line 136
    iget-object v8, v8, LA4/b;->a:[I

    .line 137
    .line 138
    :goto_2
    iput-object v8, p0, LA4/d;->a:[I

    .line 139
    .line 140
    if-nez v8, :cond_8

    .line 141
    .line 142
    const-string v0, "d"

    .line 143
    .line 144
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    const-string v0, "d"

    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget v1, p0, LA4/d;->k:I

    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    :cond_7
    iput v5, p0, LA4/d;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    .line 171
    monitor-exit p0

    .line 172
    return-object v3

    .line 173
    :cond_8
    :try_start_1
    iget-boolean v1, v2, LA4/a;->f:Z

    .line 174
    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    iget-object v1, p0, LA4/d;->b:[I

    .line 178
    .line 179
    array-length v3, v8

    .line 180
    invoke-static {v8, v0, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, LA4/d;->b:[I

    .line 184
    .line 185
    iput-object v1, p0, LA4/d;->a:[I

    .line 186
    .line 187
    iget v3, v2, LA4/a;->h:I

    .line 188
    .line 189
    aput v0, v1, v3

    .line 190
    .line 191
    iget v0, v2, LA4/a;->g:I

    .line 192
    .line 193
    if-ne v0, v6, :cond_9

    .line 194
    .line 195
    iget v0, p0, LA4/d;->k:I

    .line 196
    .line 197
    if-nez v0, :cond_9

    .line 198
    .line 199
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 200
    .line 201
    iput-object v0, p0, LA4/d;->s:Ljava/lang/Boolean;

    .line 202
    .line 203
    :cond_9
    invoke-virtual {p0, v2, v7}, LA4/d;->d(LA4/a;LA4/a;)Landroid/graphics/Bitmap;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    monitor-exit p0

    .line 208
    return-object v0

    .line 209
    :cond_a
    :goto_3
    :try_start_2
    const-string v1, "d"

    .line 210
    .line 211
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    const-string v1, "d"

    .line 218
    .line 219
    new-instance v2, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget v0, p0, LA4/d;->o:I

    .line 225
    .line 226
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 234
    .line 235
    .line 236
    :cond_b
    monitor-exit p0

    .line 237
    return-object v3

    .line 238
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 239
    throw v0
.end method

.method public final c(Landroid/graphics/Bitmap$Config;)V
    .locals 5

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "Unsupported format: "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, ", must be one of "

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " or "

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_1
    :goto_0
    iput-object p1, p0, LA4/d;->t:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    return-void
.end method

.method public final d(LA4/a;LA4/a;)Landroid/graphics/Bitmap;
    .locals 35

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
    iget-object v3, v0, LA4/d;->j:[I

    .line 8
    .line 9
    iget-object v10, v0, LA4/d;->c:LS3/c;

    .line 10
    .line 11
    const/4 v11, 0x0

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget-object v4, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v5, v10, LS3/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, LF4/a;

    .line 21
    .line 22
    invoke-interface {v5, v4}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v4, 0x0

    .line 26
    iput-object v4, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v12, 0x3

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget v4, v2, LA4/a;->g:I

    .line 35
    .line 36
    if-ne v4, v12, :cond_2

    .line 37
    .line 38
    iget-object v4, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([II)V

    .line 43
    .line 44
    .line 45
    :cond_2
    const/4 v13, 0x2

    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    iget v4, v2, LA4/a;->g:I

    .line 49
    .line 50
    if-lez v4, :cond_6

    .line 51
    .line 52
    if-ne v4, v13, :cond_7

    .line 53
    .line 54
    iget-boolean v4, v1, LA4/a;->f:Z

    .line 55
    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v4, v0, LA4/d;->l:LA4/b;

    .line 59
    .line 60
    iget v5, v4, LA4/b;->k:I

    .line 61
    .line 62
    iget-object v6, v1, LA4/a;->k:[I

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    iget v4, v4, LA4/b;->j:I

    .line 67
    .line 68
    iget v6, v1, LA4/a;->h:I

    .line 69
    .line 70
    if-ne v4, v6, :cond_4

    .line 71
    .line 72
    :cond_3
    move v5, v11

    .line 73
    :cond_4
    iget v4, v2, LA4/a;->d:I

    .line 74
    .line 75
    iget v6, v0, LA4/d;->p:I

    .line 76
    .line 77
    div-int/2addr v4, v6

    .line 78
    iget v7, v2, LA4/a;->b:I

    .line 79
    .line 80
    div-int/2addr v7, v6

    .line 81
    iget v8, v2, LA4/a;->c:I

    .line 82
    .line 83
    div-int/2addr v8, v6

    .line 84
    iget v2, v2, LA4/a;->a:I

    .line 85
    .line 86
    div-int/2addr v2, v6

    .line 87
    iget v6, v0, LA4/d;->r:I

    .line 88
    .line 89
    mul-int/2addr v7, v6

    .line 90
    add-int/2addr v7, v2

    .line 91
    mul-int/2addr v4, v6

    .line 92
    add-int/2addr v4, v7

    .line 93
    :goto_0
    if-ge v7, v4, :cond_6

    .line 94
    .line 95
    add-int v2, v7, v8

    .line 96
    .line 97
    move v6, v7

    .line 98
    :goto_1
    if-ge v6, v2, :cond_5

    .line 99
    .line 100
    aput v5, v3, v6

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    iget v2, v0, LA4/d;->r:I

    .line 106
    .line 107
    add-int/2addr v7, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_6
    :goto_2
    move-object v2, v3

    .line 110
    goto :goto_3

    .line 111
    :cond_7
    if-ne v4, v12, :cond_6

    .line 112
    .line 113
    iget-object v2, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    iget v5, v0, LA4/d;->r:I

    .line 118
    .line 119
    iget v9, v0, LA4/d;->q:I

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    move v8, v5

    .line 125
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :goto_3
    iget-object v3, v0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    iget v4, v1, LA4/a;->j:I

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 134
    .line 135
    .line 136
    iget v3, v1, LA4/a;->c:I

    .line 137
    .line 138
    iget v4, v1, LA4/a;->d:I

    .line 139
    .line 140
    mul-int/2addr v3, v4

    .line 141
    iget-object v4, v0, LA4/d;->i:[B

    .line 142
    .line 143
    if-eqz v4, :cond_8

    .line 144
    .line 145
    array-length v4, v4

    .line 146
    if-ge v4, v3, :cond_9

    .line 147
    .line 148
    :cond_8
    iget-object v4, v10, LS3/c;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v4, LF4/f;

    .line 151
    .line 152
    const-class v5, [B

    .line 153
    .line 154
    invoke-virtual {v4, v3, v5}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, [B

    .line 159
    .line 160
    iput-object v4, v0, LA4/d;->i:[B

    .line 161
    .line 162
    :cond_9
    iget-object v4, v0, LA4/d;->i:[B

    .line 163
    .line 164
    iget-object v5, v0, LA4/d;->f:[S

    .line 165
    .line 166
    const/16 v6, 0x1000

    .line 167
    .line 168
    if-nez v5, :cond_a

    .line 169
    .line 170
    new-array v5, v6, [S

    .line 171
    .line 172
    iput-object v5, v0, LA4/d;->f:[S

    .line 173
    .line 174
    :cond_a
    iget-object v5, v0, LA4/d;->f:[S

    .line 175
    .line 176
    iget-object v7, v0, LA4/d;->g:[B

    .line 177
    .line 178
    if-nez v7, :cond_b

    .line 179
    .line 180
    new-array v7, v6, [B

    .line 181
    .line 182
    iput-object v7, v0, LA4/d;->g:[B

    .line 183
    .line 184
    :cond_b
    iget-object v7, v0, LA4/d;->g:[B

    .line 185
    .line 186
    iget-object v8, v0, LA4/d;->h:[B

    .line 187
    .line 188
    if-nez v8, :cond_c

    .line 189
    .line 190
    const/16 v8, 0x1001

    .line 191
    .line 192
    new-array v8, v8, [B

    .line 193
    .line 194
    iput-object v8, v0, LA4/d;->h:[B

    .line 195
    .line 196
    :cond_c
    iget-object v8, v0, LA4/d;->h:[B

    .line 197
    .line 198
    iget-object v9, v0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 199
    .line 200
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->get()B

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    and-int/lit16 v9, v9, 0xff

    .line 205
    .line 206
    const/4 v10, 0x1

    .line 207
    shl-int v14, v10, v9

    .line 208
    .line 209
    add-int/lit8 v15, v14, 0x1

    .line 210
    .line 211
    add-int/lit8 v16, v14, 0x2

    .line 212
    .line 213
    add-int/2addr v9, v10

    .line 214
    shl-int v17, v10, v9

    .line 215
    .line 216
    add-int/lit8 v17, v17, -0x1

    .line 217
    .line 218
    move v13, v11

    .line 219
    :goto_4
    if-ge v13, v14, :cond_d

    .line 220
    .line 221
    aput-short v11, v5, v13

    .line 222
    .line 223
    move/from16 p2, v10

    .line 224
    .line 225
    int-to-byte v10, v13

    .line 226
    aput-byte v10, v7, v13

    .line 227
    .line 228
    add-int/lit8 v13, v13, 0x1

    .line 229
    .line 230
    move/from16 v10, p2

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_d
    move/from16 p2, v10

    .line 234
    .line 235
    iget-object v10, v0, LA4/d;->e:[B

    .line 236
    .line 237
    move/from16 v26, v9

    .line 238
    .line 239
    move v6, v11

    .line 240
    move/from16 v19, v6

    .line 241
    .line 242
    move/from16 v20, v19

    .line 243
    .line 244
    move/from16 v21, v20

    .line 245
    .line 246
    move/from16 v22, v21

    .line 247
    .line 248
    move/from16 v23, v22

    .line 249
    .line 250
    move/from16 v28, v23

    .line 251
    .line 252
    move/from16 v29, v28

    .line 253
    .line 254
    move/from16 v24, v16

    .line 255
    .line 256
    move/from16 v25, v17

    .line 257
    .line 258
    const/16 v27, -0x1

    .line 259
    .line 260
    :goto_5
    const/16 v30, 0x8

    .line 261
    .line 262
    if-ge v6, v3, :cond_19

    .line 263
    .line 264
    if-nez v19, :cond_10

    .line 265
    .line 266
    const/16 v31, -0x1

    .line 267
    .line 268
    iget-object v13, v0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 269
    .line 270
    invoke-virtual {v13}, Ljava/nio/ByteBuffer;->get()B

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    and-int/lit16 v13, v13, 0xff

    .line 275
    .line 276
    if-gtz v13, :cond_e

    .line 277
    .line 278
    move-object/from16 v32, v2

    .line 279
    .line 280
    move-object/from16 v33, v5

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_e
    iget-object v12, v0, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    iget-object v11, v0, LA4/d;->e:[B

    .line 286
    .line 287
    move-object/from16 v32, v2

    .line 288
    .line 289
    invoke-virtual {v12}, Ljava/nio/Buffer;->remaining()I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    invoke-static {v13, v2}, Ljava/lang/Math;->min(II)I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    move-object/from16 v33, v5

    .line 298
    .line 299
    const/4 v5, 0x0

    .line 300
    invoke-virtual {v12, v11, v5, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 301
    .line 302
    .line 303
    :goto_6
    if-gtz v13, :cond_f

    .line 304
    .line 305
    const/4 v2, 0x3

    .line 306
    iput v2, v0, LA4/d;->o:I

    .line 307
    .line 308
    const/4 v5, 0x0

    .line 309
    :goto_7
    move/from16 v11, v23

    .line 310
    .line 311
    goto/16 :goto_d

    .line 312
    .line 313
    :cond_f
    move/from16 v19, v13

    .line 314
    .line 315
    const/16 v20, 0x0

    .line 316
    .line 317
    goto :goto_8

    .line 318
    :cond_10
    move-object/from16 v32, v2

    .line 319
    .line 320
    move-object/from16 v33, v5

    .line 321
    .line 322
    const/16 v31, -0x1

    .line 323
    .line 324
    :goto_8
    aget-byte v2, v10, v20

    .line 325
    .line 326
    and-int/lit16 v2, v2, 0xff

    .line 327
    .line 328
    shl-int v2, v2, v21

    .line 329
    .line 330
    add-int v22, v22, v2

    .line 331
    .line 332
    add-int/lit8 v21, v21, 0x8

    .line 333
    .line 334
    add-int/lit8 v20, v20, 0x1

    .line 335
    .line 336
    add-int/lit8 v19, v19, -0x1

    .line 337
    .line 338
    move/from16 v2, v21

    .line 339
    .line 340
    move/from16 v5, v24

    .line 341
    .line 342
    move/from16 v11, v26

    .line 343
    .line 344
    move/from16 v12, v27

    .line 345
    .line 346
    move/from16 v13, v28

    .line 347
    .line 348
    :goto_9
    move/from16 v21, v2

    .line 349
    .line 350
    if-lt v2, v11, :cond_18

    .line 351
    .line 352
    and-int v2, v22, v25

    .line 353
    .line 354
    shr-int v22, v22, v11

    .line 355
    .line 356
    sub-int v21, v21, v11

    .line 357
    .line 358
    if-ne v2, v14, :cond_11

    .line 359
    .line 360
    move v11, v9

    .line 361
    move/from16 v5, v16

    .line 362
    .line 363
    move/from16 v25, v17

    .line 364
    .line 365
    move/from16 v2, v21

    .line 366
    .line 367
    move/from16 v12, v31

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_11
    if-ne v2, v15, :cond_12

    .line 371
    .line 372
    move/from16 v24, v5

    .line 373
    .line 374
    move/from16 v26, v11

    .line 375
    .line 376
    move/from16 v27, v12

    .line 377
    .line 378
    move/from16 v28, v13

    .line 379
    .line 380
    move-object/from16 v2, v32

    .line 381
    .line 382
    move-object/from16 v5, v33

    .line 383
    .line 384
    const/4 v11, 0x0

    .line 385
    const/4 v12, 0x3

    .line 386
    goto :goto_5

    .line 387
    :cond_12
    move/from16 v24, v6

    .line 388
    .line 389
    move/from16 v6, v31

    .line 390
    .line 391
    if-ne v12, v6, :cond_13

    .line 392
    .line 393
    aget-byte v6, v7, v2

    .line 394
    .line 395
    aput-byte v6, v4, v23

    .line 396
    .line 397
    add-int/lit8 v23, v23, 0x1

    .line 398
    .line 399
    add-int/lit8 v6, v24, 0x1

    .line 400
    .line 401
    move v12, v2

    .line 402
    move v13, v12

    .line 403
    move/from16 v2, v21

    .line 404
    .line 405
    :goto_a
    const/16 v31, -0x1

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_13
    if-lt v2, v5, :cond_14

    .line 409
    .line 410
    int-to-byte v6, v13

    .line 411
    aput-byte v6, v8, v29

    .line 412
    .line 413
    add-int/lit8 v29, v29, 0x1

    .line 414
    .line 415
    move v6, v12

    .line 416
    goto :goto_b

    .line 417
    :cond_14
    move v6, v2

    .line 418
    :goto_b
    if-lt v6, v14, :cond_15

    .line 419
    .line 420
    aget-byte v13, v7, v6

    .line 421
    .line 422
    aput-byte v13, v8, v29

    .line 423
    .line 424
    add-int/lit8 v29, v29, 0x1

    .line 425
    .line 426
    aget-short v6, v33, v6

    .line 427
    .line 428
    goto :goto_b

    .line 429
    :cond_15
    aget-byte v6, v7, v6

    .line 430
    .line 431
    and-int/lit16 v13, v6, 0xff

    .line 432
    .line 433
    int-to-byte v6, v13

    .line 434
    aput-byte v6, v4, v23

    .line 435
    .line 436
    :goto_c
    add-int/lit8 v23, v23, 0x1

    .line 437
    .line 438
    add-int/lit8 v24, v24, 0x1

    .line 439
    .line 440
    if-lez v29, :cond_16

    .line 441
    .line 442
    add-int/lit8 v29, v29, -0x1

    .line 443
    .line 444
    aget-byte v26, v8, v29

    .line 445
    .line 446
    aput-byte v26, v4, v23

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_16
    move/from16 v26, v2

    .line 450
    .line 451
    const/16 v2, 0x1000

    .line 452
    .line 453
    if-ge v5, v2, :cond_17

    .line 454
    .line 455
    int-to-short v12, v12

    .line 456
    aput-short v12, v33, v5

    .line 457
    .line 458
    aput-byte v6, v7, v5

    .line 459
    .line 460
    add-int/lit8 v5, v5, 0x1

    .line 461
    .line 462
    and-int v6, v5, v25

    .line 463
    .line 464
    if-nez v6, :cond_17

    .line 465
    .line 466
    if-ge v5, v2, :cond_17

    .line 467
    .line 468
    add-int/lit8 v11, v11, 0x1

    .line 469
    .line 470
    add-int v25, v25, v5

    .line 471
    .line 472
    :cond_17
    move/from16 v2, v21

    .line 473
    .line 474
    move/from16 v6, v24

    .line 475
    .line 476
    move/from16 v12, v26

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_18
    move/from16 v24, v6

    .line 480
    .line 481
    move/from16 v26, v11

    .line 482
    .line 483
    move/from16 v27, v12

    .line 484
    .line 485
    move/from16 v28, v13

    .line 486
    .line 487
    move-object/from16 v2, v32

    .line 488
    .line 489
    const/4 v11, 0x0

    .line 490
    const/4 v12, 0x3

    .line 491
    move/from16 v24, v5

    .line 492
    .line 493
    move-object/from16 v5, v33

    .line 494
    .line 495
    goto/16 :goto_5

    .line 496
    .line 497
    :cond_19
    move-object/from16 v32, v2

    .line 498
    .line 499
    move v5, v11

    .line 500
    goto/16 :goto_7

    .line 501
    .line 502
    :goto_d
    invoke-static {v4, v11, v3, v5}, Ljava/util/Arrays;->fill([BIIB)V

    .line 503
    .line 504
    .line 505
    iget-boolean v2, v1, LA4/a;->e:Z

    .line 506
    .line 507
    if-nez v2, :cond_24

    .line 508
    .line 509
    iget v2, v0, LA4/d;->p:I

    .line 510
    .line 511
    move/from16 v3, p2

    .line 512
    .line 513
    if-eq v2, v3, :cond_1a

    .line 514
    .line 515
    goto/16 :goto_13

    .line 516
    .line 517
    :cond_1a
    iget-object v2, v0, LA4/d;->j:[I

    .line 518
    .line 519
    iget v3, v1, LA4/a;->d:I

    .line 520
    .line 521
    iget v4, v1, LA4/a;->b:I

    .line 522
    .line 523
    iget v6, v1, LA4/a;->c:I

    .line 524
    .line 525
    iget v7, v1, LA4/a;->a:I

    .line 526
    .line 527
    iget v8, v0, LA4/d;->k:I

    .line 528
    .line 529
    if-nez v8, :cond_1b

    .line 530
    .line 531
    const/4 v8, 0x1

    .line 532
    goto :goto_e

    .line 533
    :cond_1b
    move v8, v5

    .line 534
    :goto_e
    iget v9, v0, LA4/d;->r:I

    .line 535
    .line 536
    iget-object v10, v0, LA4/d;->i:[B

    .line 537
    .line 538
    iget-object v11, v0, LA4/d;->a:[I

    .line 539
    .line 540
    move v12, v5

    .line 541
    const/4 v13, -0x1

    .line 542
    :goto_f
    if-ge v12, v3, :cond_20

    .line 543
    .line 544
    add-int v14, v12, v4

    .line 545
    .line 546
    mul-int/2addr v14, v9

    .line 547
    add-int v15, v14, v7

    .line 548
    .line 549
    add-int v5, v15, v6

    .line 550
    .line 551
    add-int/2addr v14, v9

    .line 552
    if-ge v14, v5, :cond_1c

    .line 553
    .line 554
    move v5, v14

    .line 555
    :cond_1c
    iget v14, v1, LA4/a;->c:I

    .line 556
    .line 557
    mul-int/2addr v14, v12

    .line 558
    :goto_10
    if-ge v15, v5, :cond_1f

    .line 559
    .line 560
    move-object/from16 v16, v2

    .line 561
    .line 562
    aget-byte v2, v10, v14

    .line 563
    .line 564
    move/from16 v17, v3

    .line 565
    .line 566
    and-int/lit16 v3, v2, 0xff

    .line 567
    .line 568
    if-eq v3, v13, :cond_1e

    .line 569
    .line 570
    aget v3, v11, v3

    .line 571
    .line 572
    if-eqz v3, :cond_1d

    .line 573
    .line 574
    aput v3, v16, v15

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_1d
    move v13, v2

    .line 578
    :cond_1e
    :goto_11
    add-int/lit8 v14, v14, 0x1

    .line 579
    .line 580
    add-int/lit8 v15, v15, 0x1

    .line 581
    .line 582
    move-object/from16 v2, v16

    .line 583
    .line 584
    move/from16 v3, v17

    .line 585
    .line 586
    goto :goto_10

    .line 587
    :cond_1f
    move-object/from16 v16, v2

    .line 588
    .line 589
    move/from16 v17, v3

    .line 590
    .line 591
    add-int/lit8 v12, v12, 0x1

    .line 592
    .line 593
    const/4 v5, 0x0

    .line 594
    goto :goto_f

    .line 595
    :cond_20
    iget-object v2, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 596
    .line 597
    if-eqz v2, :cond_21

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-nez v2, :cond_22

    .line 604
    .line 605
    :cond_21
    iget-object v2, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 606
    .line 607
    if-nez v2, :cond_23

    .line 608
    .line 609
    if-eqz v8, :cond_23

    .line 610
    .line 611
    const/4 v6, -0x1

    .line 612
    if-eq v13, v6, :cond_23

    .line 613
    .line 614
    :cond_22
    const/4 v11, 0x1

    .line 615
    goto :goto_12

    .line 616
    :cond_23
    const/4 v11, 0x0

    .line 617
    :goto_12
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    iput-object v2, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 622
    .line 623
    goto/16 :goto_23

    .line 624
    .line 625
    :cond_24
    :goto_13
    iget-object v2, v0, LA4/d;->j:[I

    .line 626
    .line 627
    iget v3, v1, LA4/a;->d:I

    .line 628
    .line 629
    iget v4, v0, LA4/d;->p:I

    .line 630
    .line 631
    div-int/2addr v3, v4

    .line 632
    iget v5, v1, LA4/a;->b:I

    .line 633
    .line 634
    div-int/2addr v5, v4

    .line 635
    iget v6, v1, LA4/a;->c:I

    .line 636
    .line 637
    div-int/2addr v6, v4

    .line 638
    iget v7, v1, LA4/a;->a:I

    .line 639
    .line 640
    div-int/2addr v7, v4

    .line 641
    iget v8, v0, LA4/d;->k:I

    .line 642
    .line 643
    if-nez v8, :cond_25

    .line 644
    .line 645
    const/4 v8, 0x1

    .line 646
    goto :goto_14

    .line 647
    :cond_25
    const/4 v8, 0x0

    .line 648
    :goto_14
    iget v9, v0, LA4/d;->r:I

    .line 649
    .line 650
    iget v10, v0, LA4/d;->q:I

    .line 651
    .line 652
    iget-object v11, v0, LA4/d;->i:[B

    .line 653
    .line 654
    iget-object v12, v0, LA4/d;->a:[I

    .line 655
    .line 656
    iget-object v13, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 657
    .line 658
    move-object/from16 v16, v13

    .line 659
    .line 660
    move/from16 v17, v30

    .line 661
    .line 662
    const/4 v13, 0x0

    .line 663
    const/4 v14, 0x1

    .line 664
    const/4 v15, 0x0

    .line 665
    :goto_15
    if-ge v15, v3, :cond_3b

    .line 666
    .line 667
    move-object/from16 v18, v2

    .line 668
    .line 669
    iget-boolean v2, v1, LA4/a;->e:Z

    .line 670
    .line 671
    if-eqz v2, :cond_2a

    .line 672
    .line 673
    if-lt v13, v3, :cond_29

    .line 674
    .line 675
    add-int/lit8 v14, v14, 0x1

    .line 676
    .line 677
    const/4 v2, 0x2

    .line 678
    if-eq v14, v2, :cond_28

    .line 679
    .line 680
    const/4 v2, 0x3

    .line 681
    if-eq v14, v2, :cond_27

    .line 682
    .line 683
    const/4 v2, 0x4

    .line 684
    if-eq v14, v2, :cond_26

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_26
    const/4 v13, 0x1

    .line 688
    const/16 v17, 0x2

    .line 689
    .line 690
    goto :goto_16

    .line 691
    :cond_27
    const/4 v2, 0x4

    .line 692
    move/from16 v17, v2

    .line 693
    .line 694
    const/4 v13, 0x2

    .line 695
    goto :goto_16

    .line 696
    :cond_28
    const/4 v2, 0x4

    .line 697
    move v13, v2

    .line 698
    :cond_29
    :goto_16
    add-int v2, v13, v17

    .line 699
    .line 700
    goto :goto_17

    .line 701
    :cond_2a
    move v2, v13

    .line 702
    move v13, v15

    .line 703
    :goto_17
    add-int/2addr v13, v5

    .line 704
    move/from16 v19, v2

    .line 705
    .line 706
    const/4 v2, 0x1

    .line 707
    if-ne v4, v2, :cond_2b

    .line 708
    .line 709
    const/4 v2, 0x1

    .line 710
    goto :goto_18

    .line 711
    :cond_2b
    const/4 v2, 0x0

    .line 712
    :goto_18
    if-ge v13, v10, :cond_3a

    .line 713
    .line 714
    mul-int/2addr v13, v9

    .line 715
    add-int v20, v13, v7

    .line 716
    .line 717
    move/from16 v21, v2

    .line 718
    .line 719
    add-int v2, v20, v6

    .line 720
    .line 721
    add-int/2addr v13, v9

    .line 722
    if-ge v13, v2, :cond_2c

    .line 723
    .line 724
    move v2, v13

    .line 725
    :cond_2c
    mul-int v13, v15, v4

    .line 726
    .line 727
    move/from16 v22, v3

    .line 728
    .line 729
    iget v3, v1, LA4/a;->c:I

    .line 730
    .line 731
    mul-int/2addr v13, v3

    .line 732
    if-eqz v21, :cond_31

    .line 733
    .line 734
    move/from16 v3, v20

    .line 735
    .line 736
    :goto_19
    if-ge v3, v2, :cond_2f

    .line 737
    .line 738
    move/from16 v20, v3

    .line 739
    .line 740
    aget-byte v3, v11, v13

    .line 741
    .line 742
    and-int/lit16 v3, v3, 0xff

    .line 743
    .line 744
    aget v3, v12, v3

    .line 745
    .line 746
    if-eqz v3, :cond_2d

    .line 747
    .line 748
    aput v3, v18, v20

    .line 749
    .line 750
    goto :goto_1a

    .line 751
    :cond_2d
    if-eqz v8, :cond_2e

    .line 752
    .line 753
    if-nez v16, :cond_2e

    .line 754
    .line 755
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 756
    .line 757
    move-object/from16 v16, v3

    .line 758
    .line 759
    :cond_2e
    :goto_1a
    add-int/2addr v13, v4

    .line 760
    add-int/lit8 v3, v20, 0x1

    .line 761
    .line 762
    goto :goto_19

    .line 763
    :cond_2f
    :goto_1b
    move/from16 v20, v4

    .line 764
    .line 765
    :cond_30
    move/from16 v31, v5

    .line 766
    .line 767
    goto/16 :goto_21

    .line 768
    .line 769
    :cond_31
    sub-int v3, v2, v20

    .line 770
    .line 771
    mul-int/2addr v3, v4

    .line 772
    add-int/2addr v3, v13

    .line 773
    move/from16 v34, v20

    .line 774
    .line 775
    move/from16 v20, v4

    .line 776
    .line 777
    move/from16 v4, v34

    .line 778
    .line 779
    :goto_1c
    if-ge v4, v2, :cond_30

    .line 780
    .line 781
    move/from16 v21, v2

    .line 782
    .line 783
    iget v2, v1, LA4/a;->c:I

    .line 784
    .line 785
    move/from16 v28, v2

    .line 786
    .line 787
    move/from16 v29, v4

    .line 788
    .line 789
    move v2, v13

    .line 790
    const/16 v23, 0x0

    .line 791
    .line 792
    const/16 v24, 0x0

    .line 793
    .line 794
    const/16 v25, 0x0

    .line 795
    .line 796
    const/16 v26, 0x0

    .line 797
    .line 798
    const/16 v27, 0x0

    .line 799
    .line 800
    :goto_1d
    iget v4, v0, LA4/d;->p:I

    .line 801
    .line 802
    add-int/2addr v4, v13

    .line 803
    if-ge v2, v4, :cond_33

    .line 804
    .line 805
    iget-object v4, v0, LA4/d;->i:[B

    .line 806
    .line 807
    move/from16 v31, v5

    .line 808
    .line 809
    array-length v5, v4

    .line 810
    if-ge v2, v5, :cond_34

    .line 811
    .line 812
    if-ge v2, v3, :cond_34

    .line 813
    .line 814
    aget-byte v4, v4, v2

    .line 815
    .line 816
    and-int/lit16 v4, v4, 0xff

    .line 817
    .line 818
    iget-object v5, v0, LA4/d;->a:[I

    .line 819
    .line 820
    aget v4, v5, v4

    .line 821
    .line 822
    if-eqz v4, :cond_32

    .line 823
    .line 824
    shr-int/lit8 v5, v4, 0x18

    .line 825
    .line 826
    and-int/lit16 v5, v5, 0xff

    .line 827
    .line 828
    add-int v23, v23, v5

    .line 829
    .line 830
    shr-int/lit8 v5, v4, 0x10

    .line 831
    .line 832
    and-int/lit16 v5, v5, 0xff

    .line 833
    .line 834
    add-int v24, v24, v5

    .line 835
    .line 836
    shr-int/lit8 v5, v4, 0x8

    .line 837
    .line 838
    and-int/lit16 v5, v5, 0xff

    .line 839
    .line 840
    add-int v25, v25, v5

    .line 841
    .line 842
    and-int/lit16 v4, v4, 0xff

    .line 843
    .line 844
    add-int v26, v26, v4

    .line 845
    .line 846
    add-int/lit8 v27, v27, 0x1

    .line 847
    .line 848
    :cond_32
    add-int/lit8 v2, v2, 0x1

    .line 849
    .line 850
    move/from16 v5, v31

    .line 851
    .line 852
    goto :goto_1d

    .line 853
    :cond_33
    move/from16 v31, v5

    .line 854
    .line 855
    :cond_34
    add-int v2, v13, v28

    .line 856
    .line 857
    move v4, v2

    .line 858
    :goto_1e
    iget v5, v0, LA4/d;->p:I

    .line 859
    .line 860
    add-int/2addr v5, v2

    .line 861
    if-ge v4, v5, :cond_36

    .line 862
    .line 863
    iget-object v5, v0, LA4/d;->i:[B

    .line 864
    .line 865
    move/from16 v28, v2

    .line 866
    .line 867
    array-length v2, v5

    .line 868
    if-ge v4, v2, :cond_36

    .line 869
    .line 870
    if-ge v4, v3, :cond_36

    .line 871
    .line 872
    aget-byte v2, v5, v4

    .line 873
    .line 874
    and-int/lit16 v2, v2, 0xff

    .line 875
    .line 876
    iget-object v5, v0, LA4/d;->a:[I

    .line 877
    .line 878
    aget v2, v5, v2

    .line 879
    .line 880
    if-eqz v2, :cond_35

    .line 881
    .line 882
    shr-int/lit8 v5, v2, 0x18

    .line 883
    .line 884
    and-int/lit16 v5, v5, 0xff

    .line 885
    .line 886
    add-int v23, v23, v5

    .line 887
    .line 888
    shr-int/lit8 v5, v2, 0x10

    .line 889
    .line 890
    and-int/lit16 v5, v5, 0xff

    .line 891
    .line 892
    add-int v24, v24, v5

    .line 893
    .line 894
    shr-int/lit8 v5, v2, 0x8

    .line 895
    .line 896
    and-int/lit16 v5, v5, 0xff

    .line 897
    .line 898
    add-int v25, v25, v5

    .line 899
    .line 900
    and-int/lit16 v2, v2, 0xff

    .line 901
    .line 902
    add-int v26, v26, v2

    .line 903
    .line 904
    add-int/lit8 v27, v27, 0x1

    .line 905
    .line 906
    :cond_35
    add-int/lit8 v4, v4, 0x1

    .line 907
    .line 908
    move/from16 v2, v28

    .line 909
    .line 910
    goto :goto_1e

    .line 911
    :cond_36
    if-nez v27, :cond_37

    .line 912
    .line 913
    const/4 v5, 0x0

    .line 914
    goto :goto_1f

    .line 915
    :cond_37
    div-int v23, v23, v27

    .line 916
    .line 917
    shl-int/lit8 v2, v23, 0x18

    .line 918
    .line 919
    div-int v24, v24, v27

    .line 920
    .line 921
    shl-int/lit8 v4, v24, 0x10

    .line 922
    .line 923
    or-int/2addr v2, v4

    .line 924
    div-int v25, v25, v27

    .line 925
    .line 926
    shl-int/lit8 v4, v25, 0x8

    .line 927
    .line 928
    or-int/2addr v2, v4

    .line 929
    div-int v26, v26, v27

    .line 930
    .line 931
    or-int v5, v2, v26

    .line 932
    .line 933
    :goto_1f
    if-eqz v5, :cond_38

    .line 934
    .line 935
    aput v5, v18, v29

    .line 936
    .line 937
    goto :goto_20

    .line 938
    :cond_38
    if-eqz v8, :cond_39

    .line 939
    .line 940
    if-nez v16, :cond_39

    .line 941
    .line 942
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 943
    .line 944
    move-object/from16 v16, v2

    .line 945
    .line 946
    :cond_39
    :goto_20
    add-int v13, v13, v20

    .line 947
    .line 948
    add-int/lit8 v4, v29, 0x1

    .line 949
    .line 950
    move/from16 v2, v21

    .line 951
    .line 952
    move/from16 v5, v31

    .line 953
    .line 954
    goto/16 :goto_1c

    .line 955
    .line 956
    :cond_3a
    move/from16 v22, v3

    .line 957
    .line 958
    goto/16 :goto_1b

    .line 959
    .line 960
    :goto_21
    add-int/lit8 v15, v15, 0x1

    .line 961
    .line 962
    move-object/from16 v2, v18

    .line 963
    .line 964
    move/from16 v13, v19

    .line 965
    .line 966
    move/from16 v4, v20

    .line 967
    .line 968
    move/from16 v3, v22

    .line 969
    .line 970
    move/from16 v5, v31

    .line 971
    .line 972
    goto/16 :goto_15

    .line 973
    .line 974
    :cond_3b
    iget-object v2, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 975
    .line 976
    if-nez v2, :cond_3d

    .line 977
    .line 978
    if-nez v16, :cond_3c

    .line 979
    .line 980
    const/4 v11, 0x0

    .line 981
    goto :goto_22

    .line 982
    :cond_3c
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 983
    .line 984
    .line 985
    move-result v11

    .line 986
    :goto_22
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    iput-object v2, v0, LA4/d;->s:Ljava/lang/Boolean;

    .line 991
    .line 992
    :cond_3d
    :goto_23
    iget-boolean v2, v0, LA4/d;->n:Z

    .line 993
    .line 994
    if-eqz v2, :cond_3e

    .line 995
    .line 996
    iget v1, v1, LA4/a;->g:I

    .line 997
    .line 998
    if-eqz v1, :cond_3f

    .line 999
    .line 1000
    const/4 v2, 0x1

    .line 1001
    if-ne v1, v2, :cond_3e

    .line 1002
    .line 1003
    goto :goto_24

    .line 1004
    :cond_3e
    move-object/from16 v2, v32

    .line 1005
    .line 1006
    goto :goto_25

    .line 1007
    :cond_3f
    :goto_24
    iget-object v1, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 1008
    .line 1009
    if-nez v1, :cond_40

    .line 1010
    .line 1011
    invoke-virtual {v0}, LA4/d;->a()Landroid/graphics/Bitmap;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    iput-object v1, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 1016
    .line 1017
    :cond_40
    iget-object v1, v0, LA4/d;->m:Landroid/graphics/Bitmap;

    .line 1018
    .line 1019
    iget v4, v0, LA4/d;->r:I

    .line 1020
    .line 1021
    iget v8, v0, LA4/d;->q:I

    .line 1022
    .line 1023
    const/4 v3, 0x0

    .line 1024
    const/4 v5, 0x0

    .line 1025
    const/4 v6, 0x0

    .line 1026
    move v7, v4

    .line 1027
    move-object/from16 v2, v32

    .line 1028
    .line 1029
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 1030
    .line 1031
    .line 1032
    :goto_25
    invoke-virtual {v0}, LA4/d;->a()Landroid/graphics/Bitmap;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    iget v4, v0, LA4/d;->r:I

    .line 1037
    .line 1038
    iget v8, v0, LA4/d;->q:I

    .line 1039
    .line 1040
    const/4 v3, 0x0

    .line 1041
    const/4 v5, 0x0

    .line 1042
    const/4 v6, 0x0

    .line 1043
    move v7, v4

    .line 1044
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 1045
    .line 1046
    .line 1047
    return-object v1
.end method
