.class public LCg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;
.implements Lrc/a;
.implements Luc/v;


# static fields
.field public static final e:Landroid/net/Uri;

.field public static final f:Landroid/net/Uri;

.field public static final g:Z


# instance fields
.field public a:Luc/r;

.field public b:Lqc/a;

.field public c:Landroid/app/Activity;

.field public d:LA7/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 2
    .line 3
    sput-object v0, LCg/c;->e:Landroid/net/Uri;

    .line 4
    .line 5
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 6
    .line 7
    sput-object v0, LCg/c;->f:Landroid/net/Uri;

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    sput-boolean v0, LCg/c;->g:Z

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ltc/g;)V
    .locals 7

    .line 1
    instance-of v0, p0, Ljava/lang/SecurityException;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Permission denied"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string v0, "NOT_SUPPORTED_FORMAT"

    .line 23
    .line 24
    :goto_0
    move-object v3, v0

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    instance-of v0, p0, Ljava/io/IOException;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "No space left on device"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const-string v0, "NOT_ENOUGH_SPACE"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string v0, "UNEXPECTED"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    :goto_1
    const-string v0, "ACCESS_DENIED"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    array-length v0, p0

    .line 65
    const/4 v1, 0x0

    .line 66
    :goto_3
    if-ge v1, v0, :cond_4

    .line 67
    .line 68
    aget-object v2, p0, v1

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, "\n"

    .line 78
    .line 79
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    new-instance p0, Landroid/os/Handler;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 92
    .line 93
    .line 94
    new-instance v1, LCb/a;

    .line 95
    .line 96
    const/4 v6, 0x2

    .line 97
    move-object v2, p1

    .line 98
    invoke-direct/range {v1 .. v6}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 102
    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final b(Z)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    return v2

    .line 14
    :cond_1
    iget-object p1, p0, LCg/c;->b:Lqc/a;

    .line 15
    .line 16
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 17
    .line 18
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 19
    .line 20
    invoke-static {p1, v0}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    return v2

    .line 27
    :cond_2
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v1, 0x2e

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    new-instance v4, Ljava/io/FileInputStream;

    .line 20
    .line 21
    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    move-object v3, p0

    .line 34
    move-object v8, p2

    .line 35
    move v5, p3

    .line 36
    invoke-virtual/range {v3 .. v8}, LCg/c;->e(Ljava/io/InputStream;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    move-object p2, v0

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    throw p1

    .line 55
    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 56
    .line 57
    const-string p2, "Extension not found."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 8

    .line 1
    new-instance v0, Lab/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Leg/a;->b:Leg/a;

    .line 7
    .line 8
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 9
    .line 10
    invoke-direct {v2, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const-string v5, "Couldn\'t read magic numbers to guess format."

    .line 22
    .line 23
    if-ltz v3, :cond_13

    .line 24
    .line 25
    if-ltz v4, :cond_13

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    and-int/lit16 v4, v4, 0xff

    .line 30
    .line 31
    :try_start_1
    filled-new-array {v3, v4}, [I

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Leg/d;->a:[I

    .line 36
    .line 37
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    sget-object v0, Leg/a;->e:Leg/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    :goto_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_0
    :try_start_2
    sget-object v4, Leg/d;->b:[I

    .line 55
    .line 56
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    sget-object v0, Leg/a;->n:Leg/a;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget-object v4, Leg/d;->c:[I

    .line 66
    .line 67
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    sget-object v0, Leg/a;->h:Leg/a;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    sget-object v4, Leg/d;->d:[I

    .line 77
    .line 78
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    sget-object v0, Leg/a;->c:Leg/a;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object v4, Leg/d;->e:[I

    .line 88
    .line 89
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 90
    .line 91
    .line 92
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    sget-object v6, Leg/a;->p:Leg/a;

    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    :goto_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 98
    .line 99
    .line 100
    move-object v0, v6

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_4
    :try_start_3
    sget-object v4, Leg/d;->f:[I

    .line 104
    .line 105
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    :goto_2
    goto :goto_1

    .line 112
    :cond_5
    sget-object v4, Leg/d;->h:[I

    .line 113
    .line 114
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    sget-object v0, Leg/a;->j:Leg/a;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    sget-object v4, Leg/d;->g:[I

    .line 124
    .line 125
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_7

    .line 130
    .line 131
    sget-object v0, Leg/a;->i:Leg/a;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    sget-object v4, Leg/d;->i:[I

    .line 135
    .line 136
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 137
    .line 138
    .line 139
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    sget-object v6, Leg/a;->k:Leg/a;

    .line 141
    .line 142
    if-eqz v4, :cond_8

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_8
    :try_start_4
    sget-object v4, Leg/d;->j:[I

    .line 146
    .line 147
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_9
    sget-object v4, Leg/d;->k:[I

    .line 155
    .line 156
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 157
    .line 158
    .line 159
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    sget-object v6, Leg/a;->l:Leg/a;

    .line 161
    .line 162
    if-eqz v4, :cond_a

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_a
    :try_start_5
    sget-object v4, Leg/d;->l:[I

    .line 166
    .line 167
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_b
    sget-object v4, Leg/d;->m:[I

    .line 175
    .line 176
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 177
    .line 178
    .line 179
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 180
    sget-object v6, Leg/a;->m:Leg/a;

    .line 181
    .line 182
    if-eqz v4, :cond_c

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_c
    :try_start_6
    sget-object v4, Leg/d;->n:[I

    .line 186
    .line 187
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_d

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_d
    sget-object v4, Leg/d;->o:[I

    .line 195
    .line 196
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_f

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-ltz v3, :cond_e

    .line 211
    .line 212
    if-ltz v4, :cond_e

    .line 213
    .line 214
    and-int/lit16 v3, v3, 0xff

    .line 215
    .line 216
    and-int/lit16 v4, v4, 0xff

    .line 217
    .line 218
    filled-new-array {v3, v4}, [I

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    sget-object v4, Leg/d;->p:[I

    .line 223
    .line 224
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_12

    .line 229
    .line 230
    sget-object v0, Leg/a;->g:Leg/a;

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p1

    .line 240
    :cond_f
    sget-object v4, Leg/d;->q:[I

    .line 241
    .line 242
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_10

    .line 247
    .line 248
    sget-object v0, Leg/a;->f:Leg/a;

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_10
    sget-object v4, Leg/d;->r:[I

    .line 253
    .line 254
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_11

    .line 259
    .line 260
    sget-object v0, Leg/a;->d:Leg/a;

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_11
    sget-object v4, Leg/d;->s:[I

    .line 265
    .line 266
    invoke-static {v4, v3}, Leg/d;->a([I[I)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_12

    .line 271
    .line 272
    sget-object v0, Leg/a;->o:Leg/a;

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_12
    invoke-static {}, Leg/a;->values()[Leg/a;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v3}, Lj$/util/stream/Stream$-CC;->of([Ljava/lang/Object;)Lj$/util/stream/Stream;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    new-instance v4, Leg/b;

    .line 285
    .line 286
    const/4 v5, 0x0

    .line 287
    invoke-direct {v4, v0, v5}, Leg/b;-><init>(Ljava/lang/Object;I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v3, v4}, Lj$/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Lj$/util/stream/Stream;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-interface {v0}, Lj$/util/stream/Stream;->findFirst()Lj$/util/Optional;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0, v1}, Lj$/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Leg/a;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v2, "."

    .line 309
    .line 310
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v0, v0, Leg/a;->a:[Ljava/lang/String;

    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    aget-object v0, v0, v2

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 330
    .line 331
    invoke-direct {v3, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 332
    .line 333
    .line 334
    const/4 v4, 0x1

    .line 335
    move-object v2, p0

    .line 336
    move-object v7, p1

    .line 337
    move-object v5, p2

    .line 338
    :try_start_7
    invoke-virtual/range {v2 .. v7}, LCg/c;->e(Ljava/io/InputStream;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :catchall_1
    move-exception v0

    .line 346
    move-object p1, v0

    .line 347
    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :catchall_2
    move-exception v0

    .line 352
    move-object p2, v0

    .line 353
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 354
    .line 355
    .line 356
    :goto_4
    throw p1

    .line 357
    :cond_13
    :try_start_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 358
    .line 359
    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 363
    :goto_5
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 364
    .line 365
    .line 366
    goto :goto_6

    .line 367
    :catchall_3
    move-exception v0

    .line 368
    move-object p2, v0

    .line 369
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    :goto_6
    throw p1
.end method

.method public final e(Ljava/io/InputStream;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, LCg/c;->b:Lqc/a;

    .line 2
    .line 3
    iget-object v0, v0, Lqc/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroid/content/ContentValues;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 12
    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    if-eqz p5, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    sget-object v2, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 23
    .line 24
    :goto_1
    sget-boolean v3, LCg/c;->g:Z

    .line 25
    .line 26
    const-string v4, ""

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v3, :cond_6

    .line 30
    .line 31
    new-instance v3, Ljava/io/File;

    .line 32
    .line 33
    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz p5, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object p5, v4

    .line 41
    :goto_2
    invoke-direct {v3, v2, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 45
    .line 46
    .line 47
    move-result p5

    .line 48
    if-nez p5, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 51
    .line 52
    .line 53
    :cond_3
    new-instance p5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p5, v2, p3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p5

    .line 71
    move v2, v5

    .line 72
    :goto_3
    new-instance v3, Ljava/io/File;

    .line 73
    .line 74
    invoke-static {p5}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    move-object v7, v4

    .line 81
    goto :goto_4

    .line 82
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    :goto_4
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    const-string p5, "_data"

    .line 109
    .line 110
    invoke-virtual {v1, p5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_6
    invoke-static {v2}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz p5, :cond_7

    .line 119
    .line 120
    new-instance v3, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v3, v6, p5}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p5

    .line 131
    goto :goto_5

    .line 132
    :cond_7
    move-object p5, v4

    .line 133
    :goto_5
    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p5

    .line 140
    const-string v2, "relative_path"

    .line 141
    .line 142
    invoke-virtual {v1, v2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_6
    new-instance p5, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p5

    .line 160
    const-string v2, "_display_name"

    .line 161
    .line 162
    invoke-virtual {v1, v2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    move p5, v5

    .line 166
    :goto_7
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    if-lez p5, :cond_8

    .line 175
    .line 176
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    goto :goto_8

    .line 181
    :catch_0
    move-exception v3

    .line 182
    goto :goto_d

    .line 183
    :cond_8
    move-object v6, v4

    .line 184
    :goto_8
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    if-eqz p2, :cond_9

    .line 198
    .line 199
    sget-object v3, LCg/c;->e:Landroid/net/Uri;

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_9
    sget-object v3, LCg/c;->f:Landroid/net/Uri;

    .line 203
    .line 204
    :goto_9
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    invoke-virtual {v0, p2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    const/16 p3, 0x2000

    .line 213
    .line 214
    :try_start_1
    new-array p3, p3, [B

    .line 215
    .line 216
    :goto_a
    invoke-virtual {p1, p3}, Ljava/io/InputStream;->read([B)I

    .line 217
    .line 218
    .line 219
    move-result p4

    .line 220
    const/4 p5, -0x1

    .line 221
    if-eq p4, p5, :cond_a

    .line 222
    .line 223
    invoke-virtual {p2, p3, v5, p4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    .line 225
    .line 226
    goto :goto_a

    .line 227
    :catchall_0
    move-exception p1

    .line 228
    goto :goto_b

    .line 229
    :cond_a
    if-eqz p2, :cond_b

    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 232
    .line 233
    .line 234
    :cond_b
    return-void

    .line 235
    :goto_b
    if-eqz p2, :cond_c

    .line 236
    .line 237
    :try_start_2
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    .line 239
    .line 240
    goto :goto_c

    .line 241
    :catchall_1
    move-exception p2

    .line 242
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    :cond_c
    :goto_c
    throw p1

    .line 246
    :goto_d
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    const-string v7, "Failed to build unique file"

    .line 251
    .line 252
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-eqz v6, :cond_d

    .line 257
    .line 258
    add-int/lit8 p5, p5, 0x1

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_d
    throw v3
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object v0, p0, LCg/c;->c:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lq/s1;->d(Luc/v;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    new-instance v0, Luc/r;

    .line 2
    .line 3
    iget-object v1, p1, Lqc/a;->c:Luc/f;

    .line 4
    .line 5
    const-string v2, "gal"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LCg/c;->a:Luc/r;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LCg/c;->b:Lqc/a;

    .line 16
    .line 17
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LCg/c;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LCg/c;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LCg/c;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, LCg/c;->b:Lqc/a;

    .line 8
    .line 9
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v3, "toAlbum"

    .line 9
    .line 10
    const/4 v4, -0x1

    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    sparse-switch v5, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v5, "putImageBytes"

    .line 20
    .line 21
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x5

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v5, "putVideo"

    .line 31
    .line 32
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v4, 0x4

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v5, "putImage"

    .line 42
    .line 43
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v4, 0x3

    .line 51
    goto :goto_0

    .line 52
    :sswitch_3
    const-string v5, "requestAccess"

    .line 53
    .line 54
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v4, 0x2

    .line 62
    goto :goto_0

    .line 63
    :sswitch_4
    const-string v5, "open"

    .line 64
    .line 65
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    move v4, v0

    .line 73
    goto :goto_0

    .line 74
    :sswitch_5
    const-string v5, "hasAccess"

    .line 75
    .line 76
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    move v4, v1

    .line 84
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    check-cast p2, Ltc/g;

    .line 88
    .line 89
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_0
    new-instance v1, Ljava/lang/Thread;

    .line 94
    .line 95
    new-instance v2, LCg/a;

    .line 96
    .line 97
    check-cast p2, Ltc/g;

    .line 98
    .line 99
    invoke-direct {v2, p0, p1, p2, v0}, LCg/a;-><init>(LCg/c;Luc/o;Ltc/g;I)V

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_1
    new-instance v0, Ljava/lang/Thread;

    .line 110
    .line 111
    new-instance v2, LCg/a;

    .line 112
    .line 113
    check-cast p2, Ltc/g;

    .line 114
    .line 115
    invoke-direct {v2, p0, p1, p2, v1}, LCg/a;-><init>(LCg/c;Luc/o;Ltc/g;I)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_2
    invoke-virtual {p1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0, v0}, LCg/c;->b(Z)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 142
    .line 143
    check-cast p2, Ltc/g;

    .line 144
    .line 145
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    new-instance v0, LA7/w0;

    .line 150
    .line 151
    check-cast p2, Ltc/g;

    .line 152
    .line 153
    const/16 v1, 0xa

    .line 154
    .line 155
    invoke-direct {v0, p0, p2, p1, v1}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, LCg/c;->d:LA7/w0;

    .line 159
    .line 160
    iget-object p1, p0, LCg/c;->c:Landroid/app/Activity;

    .line 161
    .line 162
    const-string p2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 163
    .line 164
    filled-new-array {p2}, [Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    const v0, 0x1419b2

    .line 169
    .line 170
    .line 171
    invoke-static {p1, p2, v0}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_3
    new-instance p1, Landroid/content/Intent;

    .line 176
    .line 177
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v0, "android.intent.action.VIEW"

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    .line 184
    .line 185
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 186
    .line 187
    const/16 v2, 0x17

    .line 188
    .line 189
    if-gt v0, v2, :cond_7

    .line 190
    .line 191
    const-string v0, "*/*"

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    .line 195
    .line 196
    const-string v0, "image/*"

    .line 197
    .line 198
    const-string v2, "video/*"

    .line 199
    .line 200
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v2, "android.intent.extra.MIME_TYPES"

    .line 205
    .line 206
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_7
    sget-object v0, LCg/c;->e:Landroid/net/Uri;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 213
    .line 214
    .line 215
    :goto_1
    const/high16 v0, 0x10000000

    .line 216
    .line 217
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, LCg/c;->b:Lqc/a;

    .line 221
    .line 222
    iget-object v0, v0, Lqc/a;->a:Landroid/content/Context;

    .line 223
    .line 224
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 225
    .line 226
    .line 227
    new-instance p1, Landroid/os/Handler;

    .line 228
    .line 229
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 234
    .line 235
    .line 236
    new-instance v0, LCg/b;

    .line 237
    .line 238
    check-cast p2, Ltc/g;

    .line 239
    .line 240
    invoke-direct {v0, p2, v1}, LCg/b;-><init>(Ltc/g;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_4
    invoke-virtual {p1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-virtual {p0, p1}, LCg/c;->b(Z)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p2, Ltc/g;

    .line 266
    .line 267
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :sswitch_data_0
    .sparse-switch
        -0x2fe7a762 -> :sswitch_5
        0x34264a -> :sswitch_4
        0x33f92cd3 -> :sswitch_3
        0x69e6978c -> :sswitch_2
        0x6a9c02ac -> :sswitch_1
        0x7461103f -> :sswitch_0
    .end sparse-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object v0, p0, LCg/c;->c:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lq/s1;->d(Luc/v;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    const p2, 0x1419b2

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_1

    .line 5
    .line 6
    array-length p1, p3

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, LCg/c;->d:LA7/w0;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, LCg/c;->d:LA7/w0;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method
