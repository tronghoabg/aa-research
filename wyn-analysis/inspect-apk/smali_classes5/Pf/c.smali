.class public final LPf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPf/d;


# instance fields
.field public final a:LPf/i;

.field public final b:LPf/a;

.field public c:LPf/g;

.field public d:I

.field public e:Z

.field public f:J


# direct methods
.method public constructor <init>(LPf/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LPf/c;->a:LPf/i;

    .line 5
    .line 6
    invoke-interface {p1}, LPf/i;->getBuffer()LPf/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LPf/c;->b:LPf/a;

    .line 11
    .line 12
    iget-object p1, p1, LPf/a;->a:LPf/g;

    .line 13
    .line 14
    iput-object p1, p0, LPf/c;->c:LPf/g;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget p1, p1, LPf/g;->b:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, -0x1

    .line 22
    :goto_0
    iput p1, p0, LPf/c;->d:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LPf/c;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public final j(LPf/a;J)J
    .locals 11

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LPf/c;->e:Z

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p2, v0

    .line 13
    .line 14
    if-ltz v2, :cond_9

    .line 15
    .line 16
    iget-object v3, p0, LPf/c;->c:LPf/g;

    .line 17
    .line 18
    iget-object v4, p0, LPf/c;->b:LPf/a;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-object v5, v4, LPf/a;->a:LPf/g;

    .line 23
    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    iget v3, p0, LPf/c;->d:I

    .line 27
    .line 28
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget v5, v5, LPf/g;->b:I

    .line 32
    .line 33
    if-ne v3, v5, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Peek source is invalid because upstream source was used"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 45
    .line 46
    return-wide v0

    .line 47
    :cond_2
    iget-wide v2, p0, LPf/c;->f:J

    .line 48
    .line 49
    const-wide/16 v5, 0x1

    .line 50
    .line 51
    add-long/2addr v2, v5

    .line 52
    iget-object v5, p0, LPf/c;->a:LPf/i;

    .line 53
    .line 54
    invoke-interface {v5, v2, v3}, LPf/i;->request(J)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    const-wide/16 p1, -0x1

    .line 61
    .line 62
    return-wide p1

    .line 63
    :cond_3
    iget-object v2, p0, LPf/c;->c:LPf/g;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-object v2, v4, LPf/a;->a:LPf/g;

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    iput-object v2, p0, LPf/c;->c:LPf/g;

    .line 72
    .line 73
    iget v2, v2, LPf/g;->b:I

    .line 74
    .line 75
    iput v2, p0, LPf/c;->d:I

    .line 76
    .line 77
    :cond_4
    iget-wide v2, v4, LPf/a;->c:J

    .line 78
    .line 79
    iget-wide v5, p0, LPf/c;->f:J

    .line 80
    .line 81
    sub-long/2addr v2, v5

    .line 82
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide p2

    .line 86
    iget-wide v7, p0, LPf/c;->f:J

    .line 87
    .line 88
    add-long v9, v7, p2

    .line 89
    .line 90
    iget-wide v5, v4, LPf/a;->c:J

    .line 91
    .line 92
    invoke-static/range {v5 .. v10}, LPf/j;->a(JJJ)V

    .line 93
    .line 94
    .line 95
    cmp-long v2, v7, v9

    .line 96
    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    sub-long/2addr v9, v7

    .line 101
    iget-wide v2, p1, LPf/a;->c:J

    .line 102
    .line 103
    add-long/2addr v2, v9

    .line 104
    iput-wide v2, p1, LPf/a;->c:J

    .line 105
    .line 106
    iget-object v2, v4, LPf/a;->a:LPf/g;

    .line 107
    .line 108
    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget v3, v2, LPf/g;->c:I

    .line 112
    .line 113
    iget v4, v2, LPf/g;->b:I

    .line 114
    .line 115
    sub-int/2addr v3, v4

    .line 116
    int-to-long v3, v3

    .line 117
    cmp-long v5, v7, v3

    .line 118
    .line 119
    if-ltz v5, :cond_6

    .line 120
    .line 121
    sub-long/2addr v7, v3

    .line 122
    iget-object v2, v2, LPf/g;->f:LPf/g;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    :goto_2
    cmp-long v3, v9, v0

    .line 126
    .line 127
    if-lez v3, :cond_8

    .line 128
    .line 129
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, LPf/g;->e()LPf/g;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iget v4, v3, LPf/g;->b:I

    .line 137
    .line 138
    long-to-int v5, v7

    .line 139
    add-int/2addr v4, v5

    .line 140
    iput v4, v3, LPf/g;->b:I

    .line 141
    .line 142
    long-to-int v5, v9

    .line 143
    add-int/2addr v4, v5

    .line 144
    iget v5, v3, LPf/g;->c:I

    .line 145
    .line 146
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    iput v4, v3, LPf/g;->c:I

    .line 151
    .line 152
    iget-object v4, p1, LPf/a;->a:LPf/g;

    .line 153
    .line 154
    if-nez v4, :cond_7

    .line 155
    .line 156
    iput-object v3, p1, LPf/a;->a:LPf/g;

    .line 157
    .line 158
    iput-object v3, p1, LPf/a;->b:LPf/g;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    iget-object v4, p1, LPf/a;->b:LPf/g;

    .line 162
    .line 163
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v3}, LPf/g;->d(LPf/g;)V

    .line 167
    .line 168
    .line 169
    iput-object v3, p1, LPf/a;->b:LPf/g;

    .line 170
    .line 171
    :goto_3
    iget v4, v3, LPf/g;->c:I

    .line 172
    .line 173
    iget v3, v3, LPf/g;->b:I

    .line 174
    .line 175
    sub-int/2addr v4, v3

    .line 176
    int-to-long v3, v4

    .line 177
    sub-long/2addr v9, v3

    .line 178
    iget-object v2, v2, LPf/g;->f:LPf/g;

    .line 179
    .line 180
    move-wide v7, v0

    .line 181
    goto :goto_2

    .line 182
    :cond_8
    :goto_4
    iget-wide v0, p0, LPf/c;->f:J

    .line 183
    .line 184
    add-long/2addr v0, p2

    .line 185
    iput-wide v0, p0, LPf/c;->f:J

    .line 186
    .line 187
    return-wide p2

    .line 188
    :cond_9
    const-string p1, "byteCount ("

    .line 189
    .line 190
    const-string v0, ") < 0"

    .line 191
    .line 192
    invoke-static {p2, p3, p1, v0}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p2

    .line 206
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 207
    .line 208
    const-string p2, "Source is closed."

    .line 209
    .line 210
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1
.end method
