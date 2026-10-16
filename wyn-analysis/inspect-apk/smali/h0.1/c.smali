.class public abstract Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc7/l;

.field public b:Z

.field public c:Le0/r;

.field public d:F

.field public e:LL0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lh0/c;->d:F

    .line 7
    .line 8
    sget-object v0, LL0/i;->a:LL0/i;

    .line 9
    .line 10
    iput-object v0, p0, Lh0/c;->e:LL0/i;

    .line 11
    .line 12
    new-instance v0, LB/F;

    .line 13
    .line 14
    const/16 v1, 0xe

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a(F)Z
.end method

.method public abstract b(Le0/r;)Z
.end method

.method public d(LL0/i;)V
    .locals 1

    .line 1
    const-string v0, "layoutDirection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lg0/d;JFLe0/r;)V
    .locals 3

    .line 1
    const-string v0, "$this$draw"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh0/c;->d:F

    .line 7
    .line 8
    cmpg-float v0, v0, p4

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0, p4}, Lh0/c;->a(F)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    const/high16 v0, 0x3f800000    # 1.0f

    .line 22
    .line 23
    cmpg-float v0, p4, v0

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p4}, Lc7/l;->c(F)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iput-boolean v2, p0, Lh0/c;->b:Z

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 47
    .line 48
    :cond_3
    invoke-virtual {v0, p4}, Lc7/l;->c(F)V

    .line 49
    .line 50
    .line 51
    iput-boolean v1, p0, Lh0/c;->b:Z

    .line 52
    .line 53
    :cond_4
    :goto_1
    iput p4, p0, Lh0/c;->d:F

    .line 54
    .line 55
    :goto_2
    iget-object v0, p0, Lh0/c;->c:Le0/r;

    .line 56
    .line 57
    invoke-static {v0, p5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_9

    .line 62
    .line 63
    invoke-virtual {p0, p5}, Lh0/c;->b(Le0/r;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    if-nez p5, :cond_6

    .line 70
    .line 71
    iget-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    const/4 v1, 0x0

    .line 77
    invoke-virtual {v0, v1}, Lc7/l;->f(Le0/r;)V

    .line 78
    .line 79
    .line 80
    :goto_3
    iput-boolean v2, p0, Lh0/c;->b:Z

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    iget-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 84
    .line 85
    if-nez v0, :cond_7

    .line 86
    .line 87
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lh0/c;->a:Lc7/l;

    .line 92
    .line 93
    :cond_7
    invoke-virtual {v0, p5}, Lc7/l;->f(Le0/r;)V

    .line 94
    .line 95
    .line 96
    iput-boolean v1, p0, Lh0/c;->b:Z

    .line 97
    .line 98
    :cond_8
    :goto_4
    iput-object p5, p0, Lh0/c;->c:Le0/r;

    .line 99
    .line 100
    :cond_9
    invoke-interface {p1}, Lg0/d;->getLayoutDirection()LL0/i;

    .line 101
    .line 102
    .line 103
    move-result-object p5

    .line 104
    iget-object v0, p0, Lh0/c;->e:LL0/i;

    .line 105
    .line 106
    if-eq v0, p5, :cond_a

    .line 107
    .line 108
    invoke-virtual {p0, p5}, Lh0/c;->d(LL0/i;)V

    .line 109
    .line 110
    .line 111
    iput-object p5, p0, Lh0/c;->e:LL0/i;

    .line 112
    .line 113
    :cond_a
    invoke-interface {p1}, Lg0/d;->c()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 118
    .line 119
    .line 120
    move-result p5

    .line 121
    invoke-static {p2, p3}, Ld0/f;->d(J)F

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    sub-float/2addr p5, v0

    .line 126
    invoke-interface {p1}, Lg0/d;->c()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {p2, p3}, Ld0/f;->b(J)F

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    sub-float/2addr v0, v1

    .line 139
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v1, v1, Lba/a;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Lad/L;

    .line 146
    .line 147
    const/4 v2, 0x0

    .line 148
    invoke-virtual {v1, v2, v2, p5, v0}, Lad/L;->q(FFFF)V

    .line 149
    .line 150
    .line 151
    cmpl-float p4, p4, v2

    .line 152
    .line 153
    if-lez p4, :cond_d

    .line 154
    .line 155
    invoke-static {p2, p3}, Ld0/f;->d(J)F

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    cmpl-float p4, p4, v2

    .line 160
    .line 161
    if-lez p4, :cond_d

    .line 162
    .line 163
    invoke-static {p2, p3}, Ld0/f;->b(J)F

    .line 164
    .line 165
    .line 166
    move-result p4

    .line 167
    cmpl-float p4, p4, v2

    .line 168
    .line 169
    if-lez p4, :cond_d

    .line 170
    .line 171
    iget-boolean p4, p0, Lh0/c;->b:Z

    .line 172
    .line 173
    if-eqz p4, :cond_c

    .line 174
    .line 175
    sget-wide v1, Ld0/c;->b:J

    .line 176
    .line 177
    invoke-static {p2, p3}, Ld0/f;->d(J)F

    .line 178
    .line 179
    .line 180
    move-result p4

    .line 181
    invoke-static {p2, p3}, Ld0/f;->b(J)F

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    invoke-static {p4, p2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 186
    .line 187
    .line 188
    move-result-wide p2

    .line 189
    invoke-static {v1, v2, p2, p3}, La/a;->f(JJ)Ld0/d;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    invoke-virtual {p3}, Lba/a;->v()Le0/o;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    iget-object p4, p0, Lh0/c;->a:Lc7/l;

    .line 202
    .line 203
    if-nez p4, :cond_b

    .line 204
    .line 205
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 206
    .line 207
    .line 208
    move-result-object p4

    .line 209
    iput-object p4, p0, Lh0/c;->a:Lc7/l;

    .line 210
    .line 211
    :cond_b
    :try_start_0
    invoke-interface {p3, p2, p4}, Le0/o;->q(Ld0/d;Lc7/l;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, p1}, Lh0/c;->g(Lg0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    .line 217
    invoke-interface {p3}, Le0/o;->restore()V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :catchall_0
    move-exception p1

    .line 222
    invoke-interface {p3}, Le0/o;->restore()V

    .line 223
    .line 224
    .line 225
    throw p1

    .line 226
    :cond_c
    invoke-virtual {p0, p1}, Lh0/c;->g(Lg0/d;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    :goto_5
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iget-object p1, p1, Lba/a;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p1, Lad/L;

    .line 236
    .line 237
    neg-float p2, p5

    .line 238
    neg-float p3, v0

    .line 239
    const/high16 p4, -0x80000000

    .line 240
    .line 241
    invoke-virtual {p1, p4, p4, p2, p3}, Lad/L;->q(FFFF)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public abstract f()J
.end method

.method public abstract g(Lg0/d;)V
.end method
