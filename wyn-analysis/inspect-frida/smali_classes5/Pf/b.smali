.class public final LPf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPf/d;


# instance fields
.field public final a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LPf/b;->a:Ljava/io/InputStream;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, LPf/b;->a:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(LPf/a;J)J
    .locals 8

    .line 1
    const-string v0, "Invalid number of bytes written: "

    .line 2
    .line 3
    const-string v1, "sink"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    cmp-long v3, p2, v1

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return-wide v1

    .line 15
    :cond_0
    if-ltz v3, :cond_b

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p1}, LPf/a;->o()LPf/g;

    .line 20
    .line 21
    .line 22
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    iget-object v4, v3, LPf/g;->a:[B

    .line 24
    .line 25
    :try_start_1
    iget v5, v3, LPf/g;->c:I

    .line 26
    .line 27
    array-length v6, v4

    .line 28
    sub-int/2addr v6, v5

    .line 29
    int-to-long v6, v6

    .line 30
    invoke-static {p2, p3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p2

    .line 34
    long-to-int p2, p2

    .line 35
    iget-object p3, p0, LPf/b;->a:Ljava/io/InputStream;

    .line 36
    .line 37
    invoke-virtual {p3, v4, v5, p2}, Ljava/io/InputStream;->read([BII)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    int-to-long p2, p2

    .line 42
    const-wide/16 v5, -0x1

    .line 43
    .line 44
    cmp-long v5, p2, v5

    .line 45
    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    move v5, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    long-to-int v5, p2

    .line 51
    :goto_0
    if-ne v5, v1, :cond_2

    .line 52
    .line 53
    iget v0, v3, LPf/g;->c:I

    .line 54
    .line 55
    add-int/2addr v0, v5

    .line 56
    iput v0, v3, LPf/g;->c:I

    .line 57
    .line 58
    iget-wide v3, p1, LPf/a;->c:J

    .line 59
    .line 60
    int-to-long v5, v5

    .line 61
    add-long/2addr v3, v5

    .line 62
    iput-wide v3, p1, LPf/a;->c:J

    .line 63
    .line 64
    return-wide p2

    .line 65
    :cond_2
    if-ltz v5, :cond_7

    .line 66
    .line 67
    array-length v6, v4

    .line 68
    iget v7, v3, LPf/g;->c:I

    .line 69
    .line 70
    sub-int/2addr v6, v7

    .line 71
    if-gt v5, v6, :cond_7

    .line 72
    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    add-int/2addr v7, v5

    .line 76
    iput v7, v3, LPf/g;->c:I

    .line 77
    .line 78
    iget-wide v3, p1, LPf/a;->c:J

    .line 79
    .line 80
    int-to-long v5, v5

    .line 81
    add-long/2addr v3, v5

    .line 82
    iput-wide v3, p1, LPf/a;->c:J

    .line 83
    .line 84
    return-wide p2

    .line 85
    :cond_3
    invoke-virtual {v3}, LPf/g;->a()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    move v0, v1

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move v0, v2

    .line 94
    :goto_1
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget-object v0, p1, LPf/a;->b:LPf/g;

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v0, LPf/g;->g:LPf/g;

    .line 102
    .line 103
    iput-object v3, p1, LPf/a;->b:LPf/g;

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    iput-object v4, p1, LPf/a;->a:LPf/g;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    iput-object v4, v3, LPf/g;->f:LPf/g;

    .line 112
    .line 113
    :goto_2
    iput-object v4, v0, LPf/g;->g:LPf/g;

    .line 114
    .line 115
    invoke-static {v0}, LPf/h;->a(LPf/g;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-wide p2

    .line 119
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p2, ". Should be in 0.."

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    array-length p2, v4

    .line 133
    iget p3, v3, LPf/g;->c:I

    .line 134
    .line 135
    sub-int/2addr p2, p3

    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    :catch_0
    move-exception p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    if-eqz p2, :cond_8

    .line 165
    .line 166
    const-string p3, "getsockname failed"

    .line 167
    .line 168
    invoke-static {p2, p3, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    goto :goto_3

    .line 173
    :cond_8
    move p2, v2

    .line 174
    :goto_3
    if-eqz p2, :cond_9

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    move v1, v2

    .line 178
    :goto_4
    if-eqz v1, :cond_a

    .line 179
    .line 180
    new-instance p2, Ljava/io/IOException;

    .line 181
    .line 182
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p2

    .line 186
    :cond_a
    throw p1

    .line 187
    :cond_b
    const-string p1, "byteCount ("

    .line 188
    .line 189
    const-string v0, ") < 0"

    .line 190
    .line 191
    invoke-static {p2, p3, p1, v0}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RawSource("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LPf/b;->a:Ljava/io/InputStream;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
