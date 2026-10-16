.class public final Lcg/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg/H;


# instance fields
.field public final a:Lcg/B;

.field public final b:Ljava/util/zip/Inflater;

.field public c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lcg/B;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcg/s;->a:Lcg/B;

    .line 5
    .line 6
    iput-object p2, p0, Lcg/s;->b:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcg/s;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcg/s;->b:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcg/s;->d:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcg/s;->a:Lcg/B;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcg/B;->close()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final read(Lcg/g;J)J
    .locals 10

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v0, p0, Lcg/s;->b:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    cmp-long v3, p2, v1

    .line 11
    .line 12
    if-ltz v3, :cond_b

    .line 13
    .line 14
    iget-boolean v4, p0, Lcg/s;->d:Z

    .line 15
    .line 16
    if-nez v4, :cond_a

    .line 17
    .line 18
    iget-object v4, p0, Lcg/s;->a:Lcg/B;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const/4 v3, 0x1

    .line 24
    :try_start_0
    invoke-virtual {p1, v3}, Lcg/g;->P(I)Lcg/C;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget v5, v3, Lcg/C;->c:I

    .line 29
    .line 30
    rsub-int v5, v5, 0x2000

    .line 31
    .line 32
    int-to-long v5, v5

    .line 33
    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    long-to-int v5, v5

    .line 38
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v4}, Lcg/B;->exhausted()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object v6, v4, Lcg/B;->b:Lcg/g;

    .line 53
    .line 54
    iget-object v6, v6, Lcg/g;->a:Lcg/C;

    .line 55
    .line 56
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget v7, v6, Lcg/C;->c:I

    .line 60
    .line 61
    iget v8, v6, Lcg/C;->b:I

    .line 62
    .line 63
    sub-int/2addr v7, v8

    .line 64
    iput v7, p0, Lcg/s;->c:I

    .line 65
    .line 66
    iget-object v6, v6, Lcg/C;->a:[B

    .line 67
    .line 68
    invoke-virtual {v0, v6, v8, v7}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 69
    .line 70
    .line 71
    :goto_1
    iget-object v6, v3, Lcg/C;->a:[B

    .line 72
    .line 73
    iget v7, v3, Lcg/C;->c:I

    .line 74
    .line 75
    invoke-virtual {v0, v6, v7, v5}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iget v6, p0, Lcg/s;->c:I

    .line 80
    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    sub-int/2addr v6, v7

    .line 89
    iget v7, p0, Lcg/s;->c:I

    .line 90
    .line 91
    sub-int/2addr v7, v6

    .line 92
    iput v7, p0, Lcg/s;->c:I

    .line 93
    .line 94
    int-to-long v6, v6

    .line 95
    invoke-virtual {v4, v6, v7}, Lcg/B;->skip(J)V

    .line 96
    .line 97
    .line 98
    :goto_2
    if-lez v5, :cond_4

    .line 99
    .line 100
    iget v6, v3, Lcg/C;->c:I

    .line 101
    .line 102
    add-int/2addr v6, v5

    .line 103
    iput v6, v3, Lcg/C;->c:I

    .line 104
    .line 105
    iget-wide v6, p1, Lcg/g;->b:J

    .line 106
    .line 107
    int-to-long v8, v5

    .line 108
    add-long/2addr v6, v8

    .line 109
    iput-wide v6, p1, Lcg/g;->b:J

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :catch_0
    move-exception p1

    .line 113
    goto :goto_6

    .line 114
    :cond_4
    iget v5, v3, Lcg/C;->b:I

    .line 115
    .line 116
    iget v6, v3, Lcg/C;->c:I

    .line 117
    .line 118
    if-ne v5, v6, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, Lcg/C;->a()Lcg/C;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iput-object v5, p1, Lcg/g;->a:Lcg/C;

    .line 125
    .line 126
    invoke-static {v3}, Lcg/D;->a(Lcg/C;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_3
    move-wide v8, v1

    .line 130
    :goto_4
    cmp-long v1, v8, v1

    .line 131
    .line 132
    if-lez v1, :cond_6

    .line 133
    .line 134
    return-wide v8

    .line 135
    :cond_6
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_9

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    invoke-virtual {v4}, Lcg/B;->exhausted()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_8

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    .line 157
    .line 158
    const-string p2, "source exhausted prematurely"

    .line 159
    .line 160
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_9
    :goto_5
    const-wide/16 p1, -0x1

    .line 165
    .line 166
    return-wide p1

    .line 167
    :goto_6
    new-instance p2, Ljava/io/IOException;

    .line 168
    .line 169
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    throw p2

    .line 173
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 174
    .line 175
    const-string p2, "closed"

    .line 176
    .line 177
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_b
    const-string p1, "byteCount < 0: "

    .line 182
    .line 183
    invoke-static {p2, p3, p1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p2
.end method

.method public final timeout()Lcg/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/s;->a:Lcg/B;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/B;->a:Lcg/H;

    .line 4
    .line 5
    invoke-interface {v0}, Lcg/H;->timeout()Lcg/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
