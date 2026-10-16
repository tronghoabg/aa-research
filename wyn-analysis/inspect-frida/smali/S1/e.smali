.class public final LS1/e;
.super LS1/c;
.source "SourceFile"


# instance fields
.field public final e:Landroid/content/ContentResolver;

.field public f:Landroid/net/Uri;

.field public g:Landroid/content/res/AssetFileDescriptor;

.field public h:Ljava/io/FileInputStream;

.field public i:J

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LS1/c;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LS1/e;->e:Landroid/content/ContentResolver;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LS1/e;->f:Landroid/net/Uri;

    .line 3
    .line 4
    const/16 v1, 0x7d0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    iget-object v3, p0, LS1/e;->h:Ljava/io/FileInputStream;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v3

    .line 16
    goto :goto_5

    .line 17
    :catch_0
    move-exception v3

    .line 18
    goto :goto_4

    .line 19
    :cond_0
    :goto_0
    iput-object v0, p0, LS1/e;->h:Ljava/io/FileInputStream;

    .line 20
    .line 21
    :try_start_1
    iget-object v3, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_1
    move-exception v1

    .line 30
    goto :goto_3

    .line 31
    :catch_1
    move-exception v3

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_1
    iput-object v0, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 34
    .line 35
    iget-boolean v0, p0, LS1/e;->j:Z

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iput-boolean v2, p0, LS1/e;->j:Z

    .line 40
    .line 41
    invoke-virtual {p0}, LS1/c;->l()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void

    .line 45
    :goto_2
    :try_start_2
    new-instance v4, LS1/d;

    .line 46
    .line 47
    invoke-direct {v4, v3, v1}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 48
    .line 49
    .line 50
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :goto_3
    iput-object v0, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 52
    .line 53
    iget-boolean v0, p0, LS1/e;->j:Z

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iput-boolean v2, p0, LS1/e;->j:Z

    .line 58
    .line 59
    invoke-virtual {p0}, LS1/c;->l()V

    .line 60
    .line 61
    .line 62
    :cond_3
    throw v1

    .line 63
    :goto_4
    :try_start_3
    new-instance v4, LS1/d;

    .line 64
    .line 65
    invoke-direct {v4, v3, v1}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 66
    .line 67
    .line 68
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    :goto_5
    iput-object v0, p0, LS1/e;->h:Ljava/io/FileInputStream;

    .line 70
    .line 71
    :try_start_4
    iget-object v4, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 76
    .line 77
    .line 78
    goto :goto_6

    .line 79
    :catchall_2
    move-exception v1

    .line 80
    goto :goto_8

    .line 81
    :catch_2
    move-exception v3

    .line 82
    goto :goto_7

    .line 83
    :cond_4
    :goto_6
    iput-object v0, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 84
    .line 85
    iget-boolean v0, p0, LS1/e;->j:Z

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iput-boolean v2, p0, LS1/e;->j:Z

    .line 90
    .line 91
    invoke-virtual {p0}, LS1/c;->l()V

    .line 92
    .line 93
    .line 94
    :cond_5
    throw v3

    .line 95
    :goto_7
    :try_start_5
    new-instance v4, LS1/d;

    .line 96
    .line 97
    invoke-direct {v4, v3, v1}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 98
    .line 99
    .line 100
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 101
    :goto_8
    iput-object v0, p0, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 102
    .line 103
    iget-boolean v0, p0, LS1/e;->j:Z

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    iput-boolean v2, p0, LS1/e;->j:Z

    .line 108
    .line 109
    invoke-virtual {p0}, LS1/c;->l()V

    .line 110
    .line 111
    .line 112
    :cond_6
    throw v1
.end method

.method public final k()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LS1/e;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final read([BII)I
    .locals 8

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-wide v0, p0, LS1/e;->i:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    cmp-long v2, v0, v4

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    int-to-long v6, p3

    .line 23
    :try_start_0
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    long-to-int p3, v0

    .line 28
    :goto_0
    iget-object v0, p0, LS1/e;->h:Ljava/io/FileInputStream;

    .line 29
    .line 30
    sget v1, LQ1/x;->a:I

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    if-ne p1, v3, :cond_3

    .line 37
    .line 38
    :goto_1
    return v3

    .line 39
    :cond_3
    iget-wide p2, p0, LS1/e;->i:J

    .line 40
    .line 41
    cmp-long v0, p2, v4

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    int-to-long v0, p1

    .line 46
    sub-long/2addr p2, v0

    .line 47
    iput-wide p2, p0, LS1/e;->i:J

    .line 48
    .line 49
    :cond_4
    invoke-virtual {p0, p1}, LS1/c;->b(I)V

    .line 50
    .line 51
    .line 52
    return p1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    new-instance p2, LS1/d;

    .line 55
    .line 56
    const/16 p3, 0x7d0

    .line 57
    .line 58
    invoke-direct {p2, p1, p3}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 59
    .line 60
    .line 61
    throw p2
.end method

.method public final y(LS1/k;)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "Could not open file descriptor for: "

    .line 6
    .line 7
    :try_start_0
    iget-object v4, v0, LS1/k;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v4}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iput-object v4, v1, LS1/e;->f:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-virtual {v1}, LS1/c;->m()V

    .line 16
    .line 17
    .line 18
    const-string v5, "content"

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5
    :try_end_0
    .catch LS1/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    iget-object v6, v1, LS1/e;->e:Landroid/content/ContentResolver;

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    :try_start_1
    new-instance v5, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v8, "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"

    .line 39
    .line 40
    invoke-virtual {v5, v8, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v8, "*/*"

    .line 44
    .line 45
    invoke-virtual {v6, v4, v8, v5}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    const/16 v2, 0x7d0

    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catch_1
    move-exception v0

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_0
    const-string v5, "r"

    .line 59
    .line 60
    invoke-virtual {v6, v4, v5}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :goto_0
    iput-object v5, v1, LS1/e;->g:Landroid/content/res/AssetFileDescriptor;

    .line 65
    .line 66
    if-eqz v5, :cond_b

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    new-instance v2, Ljava/io/FileInputStream;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v1, LS1/e;->h:Ljava/io/FileInputStream;
    :try_end_1
    .catch LS1/d; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    .line 83
    const-wide/16 v10, -0x1

    .line 84
    .line 85
    cmp-long v4, v8, v10

    .line 86
    .line 87
    const/16 v6, 0x7d8

    .line 88
    .line 89
    const/4 v12, 0x0

    .line 90
    iget-wide v13, v0, LS1/k;->e:J

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    cmp-long v15, v13, v8

    .line 95
    .line 96
    if-gtz v15, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :try_start_2
    new-instance v0, LS1/d;

    .line 100
    .line 101
    invoke-direct {v0, v12, v6}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_2
    :goto_1
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 106
    .line 107
    .line 108
    move-result-wide v15

    .line 109
    move v5, v4

    .line 110
    add-long v3, v15, v13

    .line 111
    .line 112
    invoke-virtual {v2, v3, v4}, Ljava/io/FileInputStream;->skip(J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    sub-long/2addr v3, v15

    .line 117
    cmp-long v13, v3, v13

    .line 118
    .line 119
    if-nez v13, :cond_a

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    if-nez v5, :cond_5

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 130
    .line 131
    .line 132
    move-result-wide v3

    .line 133
    cmp-long v5, v3, v13

    .line 134
    .line 135
    if-nez v5, :cond_3

    .line 136
    .line 137
    iput-wide v10, v1, LS1/e;->i:J

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    .line 141
    .line 142
    .line 143
    move-result-wide v8

    .line 144
    sub-long/2addr v3, v8

    .line 145
    iput-wide v3, v1, LS1/e;->i:J

    .line 146
    .line 147
    cmp-long v2, v3, v13

    .line 148
    .line 149
    if-ltz v2, :cond_4

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    new-instance v0, LS1/d;

    .line 153
    .line 154
    invoke-direct {v0, v12, v6}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_5
    sub-long/2addr v8, v3

    .line 159
    iput-wide v8, v1, LS1/e;->i:J
    :try_end_2
    .catch LS1/d; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 160
    .line 161
    cmp-long v2, v8, v13

    .line 162
    .line 163
    if-ltz v2, :cond_9

    .line 164
    .line 165
    :goto_2
    iget-wide v2, v0, LS1/k;->f:J

    .line 166
    .line 167
    cmp-long v4, v2, v10

    .line 168
    .line 169
    if-eqz v4, :cond_7

    .line 170
    .line 171
    iget-wide v5, v1, LS1/e;->i:J

    .line 172
    .line 173
    cmp-long v8, v5, v10

    .line 174
    .line 175
    if-nez v8, :cond_6

    .line 176
    .line 177
    move-wide v5, v2

    .line 178
    goto :goto_3

    .line 179
    :cond_6
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v5

    .line 183
    :goto_3
    iput-wide v5, v1, LS1/e;->i:J

    .line 184
    .line 185
    :cond_7
    iput-boolean v7, v1, LS1/e;->j:Z

    .line 186
    .line 187
    invoke-virtual/range {p0 .. p1}, LS1/c;->o(LS1/k;)V

    .line 188
    .line 189
    .line 190
    if-eqz v4, :cond_8

    .line 191
    .line 192
    return-wide v2

    .line 193
    :cond_8
    iget-wide v2, v1, LS1/e;->i:J

    .line 194
    .line 195
    return-wide v2

    .line 196
    :cond_9
    :try_start_3
    new-instance v0, LS1/d;

    .line 197
    .line 198
    invoke-direct {v0, v12, v6}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_a
    new-instance v0, LS1/d;

    .line 203
    .line 204
    invoke-direct {v0, v12, v6}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :cond_b
    new-instance v0, LS1/d;

    .line 209
    .line 210
    new-instance v3, Ljava/io/IOException;

    .line 211
    .line 212
    new-instance v5, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch LS1/d; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 225
    .line 226
    .line 227
    const/16 v2, 0x7d0

    .line 228
    .line 229
    :try_start_4
    invoke-direct {v0, v3, v2}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 230
    .line 231
    .line 232
    throw v0
    :try_end_4
    .catch LS1/d; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 233
    :catch_2
    move-exception v0

    .line 234
    :goto_4
    new-instance v3, LS1/d;

    .line 235
    .line 236
    instance-of v4, v0, Ljava/io/FileNotFoundException;

    .line 237
    .line 238
    if-eqz v4, :cond_c

    .line 239
    .line 240
    const/16 v2, 0x7d5

    .line 241
    .line 242
    :cond_c
    invoke-direct {v3, v0, v2}, LS1/i;-><init>(Ljava/lang/Exception;I)V

    .line 243
    .line 244
    .line 245
    throw v3

    .line 246
    :goto_5
    throw v0
.end method
