.class public final LA7/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/u;->a:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-wide p1, p0, LA7/u;->b:J

    .line 51
    iput-object p3, p0, LA7/u;->e:Ljava/lang/Object;

    .line 52
    iput-object p4, p0, LA7/u;->f:Ljava/lang/Object;

    .line 53
    iput-wide p6, p0, LA7/u;->c:J

    .line 54
    iput-object p5, p0, LA7/u;->d:Ljava/lang/Object;

    .line 55
    iput-object p8, p0, LA7/u;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLA7/w;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA7/u;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 36
    invoke-static {p4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 37
    invoke-static {p9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 38
    iput-object p3, p0, LA7/u;->d:Ljava/lang/Object;

    .line 39
    iput-object p4, p0, LA7/u;->e:Ljava/lang/Object;

    .line 40
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, LA7/u;->f:Ljava/lang/Object;

    .line 41
    iput-wide p5, p0, LA7/u;->b:J

    .line 42
    iput-wide p7, p0, LA7/u;->c:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    .line 43
    iget-object p1, p1, LA7/n0;->i:LA7/N;

    .line 44
    invoke-static {p1}, LA7/n0;->d(LA7/D0;)V

    .line 45
    invoke-static {p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object p2

    .line 46
    invoke-static {p4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object p3

    .line 47
    iget-object p1, p1, LA7/N;->i:LA7/P;

    const-string p4, "Event created with reverse previous/current timestamps. appId, name"

    invoke-virtual {p1, p2, p4, p3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    :cond_1
    iput-object p9, p0, LA7/u;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA7/u;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 3
    invoke-static {p4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 4
    iput-object p3, p0, LA7/u;->d:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, LA7/u;->e:Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, LA7/u;->f:Ljava/lang/Object;

    .line 7
    iput-wide p5, p0, LA7/u;->b:J

    .line 8
    iput-wide p7, p0, LA7/u;->c:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    .line 9
    iget-object p2, p1, LA7/n0;->i:LA7/N;

    .line 10
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 11
    invoke-static {p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object p3

    .line 12
    iget-object p2, p2, LA7/N;->i:LA7/P;

    const-string p4, "Event created with reverse previous/current timestamps. appId"

    invoke-virtual {p2, p4, p3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    if-eqz p9, :cond_5

    .line 13
    invoke-virtual {p9}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    .line 14
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2, p9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 15
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 16
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    .line 17
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-nez p4, :cond_2

    .line 18
    iget-object p4, p1, LA7/n0;->i:LA7/N;

    .line 19
    invoke-static {p4}, LA7/n0;->d(LA7/D0;)V

    .line 20
    const-string p5, "Param name can\'t be null"

    iget-object p4, p4, LA7/N;->f:LA7/P;

    invoke-virtual {p4, p5}, LA7/P;->c(Ljava/lang/String;)V

    .line 21
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 22
    :cond_2
    iget-object p5, p1, LA7/n0;->l:LA7/U1;

    .line 23
    invoke-static {p5}, LA7/n0;->c(LA7/B0;)V

    .line 24
    invoke-virtual {p2, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p5, p6, p4}, LA7/U1;->X0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    if-nez p5, :cond_3

    .line 25
    iget-object p5, p1, LA7/n0;->i:LA7/N;

    invoke-static {p5}, LA7/n0;->d(LA7/D0;)V

    .line 26
    iget-object p6, p1, LA7/n0;->m:LA7/J;

    invoke-virtual {p6, p4}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 27
    iget-object p5, p5, LA7/N;->i:LA7/P;

    const-string p6, "Param value can\'t be null"

    invoke-virtual {p5, p6, p4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 29
    :cond_3
    iget-object p6, p1, LA7/n0;->l:LA7/U1;

    invoke-static {p6}, LA7/n0;->c(LA7/B0;)V

    .line 30
    invoke-virtual {p6, p4, p5, p2}, LA7/U1;->F0(Ljava/lang/String;Ljava/lang/Object;Landroid/os/Bundle;)V

    goto :goto_0

    .line 31
    :cond_4
    new-instance p1, LA7/w;

    invoke-direct {p1, p2}, LA7/w;-><init>(Landroid/os/Bundle;)V

    goto :goto_1

    .line 32
    :cond_5
    new-instance p1, LA7/w;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, LA7/w;-><init>(Landroid/os/Bundle;)V

    .line 33
    :goto_1
    iput-object p1, p0, LA7/u;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(JLY1/m;)LA7/u;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LA7/u;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LY1/m;

    .line 6
    .line 7
    invoke-virtual {v1}, LY1/m;->c()LX1/g;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    move-object v1, v9

    .line 12
    invoke-virtual/range {p3 .. p3}, LY1/m;->c()LX1/g;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move-object v9, v1

    .line 19
    new-instance v1, LA7/u;

    .line 20
    .line 21
    iget-wide v7, v0, LA7/u;->c:J

    .line 22
    .line 23
    iget-object v2, v0, LA7/u;->f:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v2

    .line 26
    check-cast v5, LY1/b;

    .line 27
    .line 28
    iget-object v2, v0, LA7/u;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v2

    .line 31
    check-cast v6, Ll2/d;

    .line 32
    .line 33
    move-wide/from16 v2, p1

    .line 34
    .line 35
    move-object/from16 v4, p3

    .line 36
    .line 37
    invoke-direct/range {v1 .. v9}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_0
    move-object/from16 v18, v9

    .line 42
    .line 43
    move-object v9, v1

    .line 44
    move-object/from16 v1, v18

    .line 45
    .line 46
    invoke-interface {v9}, LX1/g;->D()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    move-object v9, v1

    .line 53
    new-instance v1, LA7/u;

    .line 54
    .line 55
    iget-wide v7, v0, LA7/u;->c:J

    .line 56
    .line 57
    iget-object v2, v0, LA7/u;->f:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v5, v2

    .line 60
    check-cast v5, LY1/b;

    .line 61
    .line 62
    iget-object v2, v0, LA7/u;->d:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v6, v2

    .line 65
    check-cast v6, Ll2/d;

    .line 66
    .line 67
    move-wide/from16 v2, p1

    .line 68
    .line 69
    move-object/from16 v4, p3

    .line 70
    .line 71
    invoke-direct/range {v1 .. v9}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_1
    move-object v2, v9

    .line 76
    move-object v9, v1

    .line 77
    move-object v1, v2

    .line 78
    move-wide/from16 v2, p1

    .line 79
    .line 80
    invoke-interface {v1, v2, v3}, LX1/g;->w(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    cmp-long v6, v4, v6

    .line 87
    .line 88
    if-nez v6, :cond_2

    .line 89
    .line 90
    new-instance v1, LA7/u;

    .line 91
    .line 92
    iget-wide v7, v0, LA7/u;->c:J

    .line 93
    .line 94
    iget-object v4, v0, LA7/u;->f:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v5, v4

    .line 97
    check-cast v5, LY1/b;

    .line 98
    .line 99
    iget-object v4, v0, LA7/u;->d:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, v4

    .line 102
    check-cast v6, Ll2/d;

    .line 103
    .line 104
    move-object/from16 v4, p3

    .line 105
    .line 106
    invoke-direct/range {v1 .. v9}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_2
    invoke-static {v9}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, LX1/g;->E()J

    .line 114
    .line 115
    .line 116
    move-result-wide v6

    .line 117
    invoke-interface {v1, v6, v7}, LX1/g;->b(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    add-long/2addr v4, v6

    .line 122
    const-wide/16 v12, 0x1

    .line 123
    .line 124
    sub-long v12, v4, v12

    .line 125
    .line 126
    invoke-interface {v1, v12, v13}, LX1/g;->b(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v14

    .line 130
    invoke-interface {v1, v12, v13, v2, v3}, LX1/g;->o(JJ)J

    .line 131
    .line 132
    .line 133
    move-result-wide v12

    .line 134
    add-long/2addr v12, v14

    .line 135
    invoke-interface {v9}, LX1/g;->E()J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    move-wide/from16 v16, v4

    .line 140
    .line 141
    invoke-interface {v9, v14, v15}, LX1/g;->b(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    cmp-long v8, v12, v4

    .line 146
    .line 147
    iget-wide v12, v0, LA7/u;->c:J

    .line 148
    .line 149
    if-nez v8, :cond_3

    .line 150
    .line 151
    sub-long v4, v16, v14

    .line 152
    .line 153
    :goto_0
    add-long/2addr v4, v12

    .line 154
    :goto_1
    move-wide v7, v4

    .line 155
    goto :goto_2

    .line 156
    :cond_3
    if-ltz v8, :cond_5

    .line 157
    .line 158
    cmp-long v8, v4, v10

    .line 159
    .line 160
    if-gez v8, :cond_4

    .line 161
    .line 162
    invoke-interface {v9, v10, v11, v2, v3}, LX1/g;->v(JJ)J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    sub-long/2addr v4, v6

    .line 167
    sub-long v4, v12, v4

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    invoke-interface {v1, v4, v5, v2, v3}, LX1/g;->v(JJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v4

    .line 174
    sub-long/2addr v4, v14

    .line 175
    goto :goto_0

    .line 176
    :goto_2
    new-instance v1, LA7/u;

    .line 177
    .line 178
    iget-object v4, v0, LA7/u;->f:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v5, v4

    .line 181
    check-cast v5, LY1/b;

    .line 182
    .line 183
    iget-object v4, v0, LA7/u;->d:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v6, v4

    .line 186
    check-cast v6, Ll2/d;

    .line 187
    .line 188
    move-object/from16 v4, p3

    .line 189
    .line 190
    invoke-direct/range {v1 .. v9}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :cond_5
    new-instance v1, Lk2/b;

    .line 195
    .line 196
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 197
    .line 198
    .line 199
    throw v1
.end method

.method public b(J)J
    .locals 3

    .line 1
    iget-object v0, p0, LA7/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX1/g;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, LA7/u;->b:J

    .line 9
    .line 10
    invoke-interface {v0, v1, v2, p1, p2}, LX1/g;->q(JJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iget-wide v0, p0, LA7/u;->c:J

    .line 15
    .line 16
    add-long/2addr p1, v0

    .line 17
    return-wide p1
.end method

.method public c(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, LA7/u;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LA7/u;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LX1/g;

    .line 8
    .line 9
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v3, p0, LA7/u;->b:J

    .line 13
    .line 14
    invoke-interface {v2, v3, v4, p1, p2}, LX1/g;->F(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    add-long/2addr p1, v0

    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    sub-long/2addr p1, v0

    .line 22
    return-wide p1
.end method

.method public d()J
    .locals 3

    .line 1
    iget-object v0, p0, LA7/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX1/g;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, LA7/u;->b:J

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, LX1/g;->w(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public e(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, LA7/u;->f(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LA7/u;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LX1/g;

    .line 8
    .line 9
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v3, p0, LA7/u;->c:J

    .line 13
    .line 14
    sub-long/2addr p1, v3

    .line 15
    iget-wide v3, p0, LA7/u;->b:J

    .line 16
    .line 17
    invoke-interface {v2, p1, p2, v3, v4}, LX1/g;->o(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    add-long/2addr p1, v0

    .line 22
    return-wide p1
.end method

.method public f(J)J
    .locals 3

    .line 1
    iget-object v0, p0, LA7/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX1/g;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, LA7/u;->c:J

    .line 9
    .line 10
    sub-long/2addr p1, v1

    .line 11
    invoke-interface {v0, p1, p2}, LX1/g;->b(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1
.end method

.method public g(JJ)Z
    .locals 2

    .line 1
    iget-object v0, p0, LA7/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX1/g;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, LX1/g;->D()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, p3, v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, LA7/u;->e(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    cmp-long p1, p1, p3

    .line 29
    .line 30
    if-gtz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 36
    return p1
.end method

.method public h(LA7/n0;J)LA7/u;
    .locals 10

    .line 1
    new-instance v0, LA7/u;

    .line 2
    .line 3
    iget-object v1, p0, LA7/u;->d:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, LA7/u;->e:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, LA7/u;->f:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v5, p0, LA7/u;->b:J

    .line 19
    .line 20
    iget-object v1, p0, LA7/u;->g:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v9, v1

    .line 23
    check-cast v9, LA7/w;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-wide v7, p2

    .line 27
    invoke-direct/range {v0 .. v9}, LA7/u;-><init>(LA7/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLA7/w;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, LA7/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LA7/u;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LA7/w;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Event{appId=\'"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LA7/u;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, "\', name=\'"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LA7/u;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    const-string v3, "\', params="

    .line 43
    .line 44
    const-string v4, "}"

    .line 45
    .line 46
    invoke-static {v1, v2, v3, v0, v4}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
