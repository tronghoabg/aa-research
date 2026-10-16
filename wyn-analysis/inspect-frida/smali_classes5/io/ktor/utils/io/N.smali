.class public abstract Lio/ktor/utils/io/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/ktor/utils/io/L;

.field public static final b:Lio/ktor/utils/io/S;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/ktor/utils/io/L;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/utils/io/N;->a:Lio/ktor/utils/io/L;

    .line 7
    .line 8
    new-instance v0, Lio/ktor/utils/io/S;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lio/ktor/utils/io/S;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lio/ktor/utils/io/N;->b:Lio/ktor/utils/io/S;

    .line 15
    .line 16
    return-void
.end method

.method public static a([B)Lio/ktor/utils/io/a0;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    const-string v1, "content"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LPf/a;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0, p0}, LPf/a;->w(I[B)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lio/ktor/utils/io/a0;

    .line 16
    .line 17
    invoke-direct {p0, v1}, Lio/ktor/utils/io/a0;-><init>(LPf/a;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static final b(Lio/ktor/utils/io/t;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/IOException;

    .line 7
    .line 8
    const-string v1, "Channel was cancelled"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Lio/ktor/utils/io/t;->a(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final c(Lio/ktor/utils/io/J;Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance v1, LEf/p0;

    .line 9
    .line 10
    const-class v4, Lio/ktor/utils/io/J;

    .line 11
    .line 12
    const-string v5, "flushAndClose"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const-string v6, "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/16 v8, 0xc

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    invoke-direct/range {v1 .. v8}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lio/ktor/utils/io/N;->a:Lio/ktor/utils/io/L;

    .line 25
    .line 26
    :try_start_0
    new-instance p1, Lkf/b;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Lkf/b;-><init>(LEf/p0;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v0, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    invoke-static {v0, p1}, LJf/b;->h(Ljava/lang/Object;Ljf/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    invoke-static {p0, p1}, Lr7/e;->v(Ljf/c;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_0
    move-object v3, p0

    .line 49
    invoke-interface {v3, p1}, Lio/ktor/utils/io/J;->a(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final d(Lio/ktor/utils/io/t;Lio/ktor/utils/io/P;Llf/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/utils/io/u;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/utils/io/u;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/utils/io/u;->e:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/utils/io/u;->e:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/utils/io/u;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Llf/c;-><init>(Ljf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/u;->d:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/utils/io/u;->e:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x4

    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x2

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v3, :cond_6

    .line 39
    .line 40
    if-eq v3, v4, :cond_5

    .line 41
    .line 42
    if-eq v3, v7, :cond_3

    .line 43
    .line 44
    if-eq v3, v6, :cond_2

    .line 45
    .line 46
    if-eq v3, v5, :cond_1

    .line 47
    .line 48
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_1
    iget-object p0, v1, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_2
    iget-wide v1, v1, Lio/ktor/utils/io/u;->c:J

    .line 66
    .line 67
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    iget-wide v9, v1, Lio/ktor/utils/io/u;->c:J

    .line 73
    .line 74
    iget-object p0, v1, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 75
    .line 76
    iget-object v3, v1, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lio/ktor/utils/io/t;

    .line 79
    .line 80
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :cond_4
    move-object v13, v1

    .line 84
    move-object v1, p0

    .line 85
    move-object p0, v3

    .line 86
    move-object v3, v13

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_5
    iget-wide v9, v1, Lio/ktor/utils/io/u;->c:J

    .line 92
    .line 93
    iget-object p0, v1, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 94
    .line 95
    iget-object v3, v1, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lio/ktor/utils/io/t;

    .line 98
    .line 99
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const-wide/16 v9, 0x0

    .line 107
    .line 108
    move-object v3, v1

    .line 109
    move-object v1, p1

    .line 110
    :goto_1
    :try_start_2
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_8

    .line 115
    .line 116
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v1}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    invoke-virtual {v0, v11}, LPf/a;->i(LPf/a;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v11

    .line 128
    add-long/2addr v9, v11

    .line 129
    iput-object p0, v3, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v1, v3, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 132
    .line 133
    iput-wide v9, v3, Lio/ktor/utils/io/u;->c:J

    .line 134
    .line 135
    iput v4, v3, Lio/ktor/utils/io/u;->e:I

    .line 136
    .line 137
    invoke-interface {v1, v3}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    if-ne v0, v2, :cond_7

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    move-object v13, v3

    .line 145
    move-object v3, p0

    .line 146
    move-object p0, v1

    .line 147
    move-object v1, v13

    .line 148
    :goto_2
    :try_start_3
    iput-object v3, v1, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object p0, v1, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 151
    .line 152
    iput-wide v9, v1, Lio/ktor/utils/io/u;->c:J

    .line 153
    .line 154
    iput v7, v1, Lio/ktor/utils/io/u;->e:I

    .line 155
    .line 156
    invoke-interface {v3, v4, v1}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 160
    if-ne v0, v2, :cond_4

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :goto_3
    move-object v13, v3

    .line 164
    move-object v3, p0

    .line 165
    move-object p0, v1

    .line 166
    move-object v1, v13

    .line 167
    goto :goto_5

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    goto :goto_3

    .line 170
    :cond_8
    :try_start_4
    invoke-interface {p0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 174
    if-nez v0, :cond_a

    .line 175
    .line 176
    iput-object v8, v3, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v8, v3, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 179
    .line 180
    iput-wide v9, v3, Lio/ktor/utils/io/u;->c:J

    .line 181
    .line 182
    iput v6, v3, Lio/ktor/utils/io/u;->e:I

    .line 183
    .line 184
    invoke-interface {v1, v3}, Lio/ktor/utils/io/J;->f(Ljf/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    if-ne p0, v2, :cond_9

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_9
    move-wide v1, v9

    .line 192
    :goto_4
    new-instance p0, Ljava/lang/Long;

    .line 193
    .line 194
    invoke-direct {p0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_a
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 199
    :goto_5
    :try_start_6
    invoke-interface {v3, v0}, Lio/ktor/utils/io/t;->a(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p0, v0}, Lio/ktor/utils/io/N;->c(Lio/ktor/utils/io/J;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 206
    :catchall_2
    move-exception v0

    .line 207
    iput-object v0, v1, Lio/ktor/utils/io/u;->a:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object v8, v1, Lio/ktor/utils/io/u;->b:Lio/ktor/utils/io/J;

    .line 210
    .line 211
    iput v5, v1, Lio/ktor/utils/io/u;->e:I

    .line 212
    .line 213
    invoke-interface {p0, v1}, Lio/ktor/utils/io/J;->f(Ljf/c;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-ne p0, v2, :cond_b

    .line 218
    .line 219
    :goto_6
    return-object v2

    .line 220
    :cond_b
    move-object p0, v0

    .line 221
    :goto_7
    throw p0
.end method

.method public static final e(Lio/ktor/utils/io/t;Lio/ktor/utils/io/J;JLlf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/utils/io/v;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/utils/io/v;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/utils/io/v;->f:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/utils/io/v;->f:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/utils/io/v;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Llf/c;-><init>(Ljf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/v;->e:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/utils/io/v;->f:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x4

    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x2

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v3, :cond_6

    .line 39
    .line 40
    if-eq v3, v4, :cond_5

    .line 41
    .line 42
    if-eq v3, v7, :cond_3

    .line 43
    .line 44
    if-eq v3, v6, :cond_2

    .line 45
    .line 46
    if-eq v3, v5, :cond_1

    .line 47
    .line 48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_1
    iget-object v1, v1, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :cond_2
    iget-wide v2, v1, Lio/ktor/utils/io/v;->d:J

    .line 66
    .line 67
    iget-wide v4, v1, Lio/ktor/utils/io/v;->c:J

    .line 68
    .line 69
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    iget-wide v9, v1, Lio/ktor/utils/io/v;->d:J

    .line 75
    .line 76
    iget-wide v11, v1, Lio/ktor/utils/io/v;->c:J

    .line 77
    .line 78
    iget-object v3, v1, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 79
    .line 80
    iget-object v13, v1, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v13, Lio/ktor/utils/io/t;

    .line 83
    .line 84
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :cond_4
    move-object/from16 v16, v13

    .line 88
    .line 89
    move-object v13, v1

    .line 90
    move-object/from16 v1, v16

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_5
    iget-wide v9, v1, Lio/ktor/utils/io/v;->d:J

    .line 98
    .line 99
    iget-wide v11, v1, Lio/ktor/utils/io/v;->c:J

    .line 100
    .line 101
    iget-object v3, v1, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 102
    .line 103
    iget-object v13, v1, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v13, Lio/ktor/utils/io/t;

    .line 106
    .line 107
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object/from16 v3, p1

    .line 115
    .line 116
    move-wide/from16 v9, p2

    .line 117
    .line 118
    move-wide v11, v9

    .line 119
    move-object v13, v1

    .line 120
    move-object/from16 v1, p0

    .line 121
    .line 122
    :goto_1
    :try_start_2
    invoke-interface {v1}, Lio/ktor/utils/io/t;->h()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    const-wide/16 v14, 0x0

    .line 129
    .line 130
    cmp-long v0, v9, v14

    .line 131
    .line 132
    if-lez v0, :cond_8

    .line 133
    .line 134
    invoke-interface {v1}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_7

    .line 143
    .line 144
    iput-object v1, v13, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v3, v13, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 147
    .line 148
    iput-wide v11, v13, Lio/ktor/utils/io/v;->c:J

    .line 149
    .line 150
    iput-wide v9, v13, Lio/ktor/utils/io/v;->d:J

    .line 151
    .line 152
    iput v4, v13, Lio/ktor/utils/io/v;->f:I

    .line 153
    .line 154
    invoke-interface {v1, v4, v13}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    if-ne v0, v2, :cond_7

    .line 159
    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :goto_2
    move-object/from16 v16, v13

    .line 163
    .line 164
    move-object v13, v1

    .line 165
    move-object/from16 v1, v16

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    goto :goto_2

    .line 170
    :cond_7
    move-object/from16 v16, v13

    .line 171
    .line 172
    move-object v13, v1

    .line 173
    move-object/from16 v1, v16

    .line 174
    .line 175
    :goto_3
    :try_start_3
    invoke-interface {v13}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, LFe/b;->C(LPf/i;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v14

    .line 183
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 184
    .line 185
    .line 186
    move-result-wide v14

    .line 187
    invoke-interface {v13}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v3}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v0, v4, v14, v15}, LPf/a;->b(LPf/a;J)V

    .line 196
    .line 197
    .line 198
    sub-long/2addr v9, v14

    .line 199
    iput-object v13, v1, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v3, v1, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 202
    .line 203
    iput-wide v11, v1, Lio/ktor/utils/io/v;->c:J

    .line 204
    .line 205
    iput-wide v9, v1, Lio/ktor/utils/io/v;->d:J

    .line 206
    .line 207
    iput v7, v1, Lio/ktor/utils/io/v;->f:I

    .line 208
    .line 209
    invoke-interface {v3, v1}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 213
    if-ne v0, v2, :cond_4

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :goto_4
    const/4 v4, 0x1

    .line 217
    goto :goto_1

    .line 218
    :cond_8
    iput-object v8, v13, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v8, v13, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 221
    .line 222
    iput-wide v11, v13, Lio/ktor/utils/io/v;->c:J

    .line 223
    .line 224
    iput-wide v9, v13, Lio/ktor/utils/io/v;->d:J

    .line 225
    .line 226
    iput v6, v13, Lio/ktor/utils/io/v;->f:I

    .line 227
    .line 228
    invoke-interface {v3, v13}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-ne v0, v2, :cond_9

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_9
    move-wide v2, v9

    .line 236
    move-wide v4, v11

    .line 237
    :goto_5
    sub-long/2addr v4, v2

    .line 238
    new-instance v0, Ljava/lang/Long;

    .line 239
    .line 240
    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :goto_6
    :try_start_4
    invoke-interface {v13, v0}, Lio/ktor/utils/io/t;->a(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v0}, Lio/ktor/utils/io/N;->c(Lio/ktor/utils/io/J;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 251
    :catchall_2
    move-exception v0

    .line 252
    iput-object v0, v1, Lio/ktor/utils/io/v;->a:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v8, v1, Lio/ktor/utils/io/v;->b:Lio/ktor/utils/io/J;

    .line 255
    .line 256
    iput v5, v1, Lio/ktor/utils/io/v;->f:I

    .line 257
    .line 258
    invoke-interface {v3, v1}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-ne v1, v2, :cond_a

    .line 263
    .line 264
    :goto_7
    return-object v2

    .line 265
    :cond_a
    move-object v1, v0

    .line 266
    :goto_8
    throw v1
.end method

.method public static final f(Lio/ktor/utils/io/t;Ljava/nio/channels/FileChannel;JLlf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lio/ktor/utils/io/I;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/utils/io/I;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/I;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/I;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/I;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/utils/io/I;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/I;->g:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    if-eq v2, v3, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-wide p0, v0, Lio/ktor/utils/io/I;->e:J

    .line 40
    .line 41
    iget-object p2, v0, Lio/ktor/utils/io/I;->d:Lio/ktor/utils/io/t;

    .line 42
    .line 43
    iget-object p3, v0, Lio/ktor/utils/io/I;->c:Ltf/l;

    .line 44
    .line 45
    iget-object v2, v0, Lio/ktor/utils/io/I;->b:Lkotlin/jvm/internal/F;

    .line 46
    .line 47
    iget-object v5, v0, Lio/ktor/utils/io/I;->a:Lio/ktor/utils/io/t;

    .line 48
    .line 49
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    iget-wide p0, v0, Lio/ktor/utils/io/I;->e:J

    .line 63
    .line 64
    iget-object p2, v0, Lio/ktor/utils/io/I;->d:Lio/ktor/utils/io/t;

    .line 65
    .line 66
    iget-object p3, v0, Lio/ktor/utils/io/I;->c:Ltf/l;

    .line 67
    .line 68
    iget-object v2, v0, Lio/ktor/utils/io/I;->b:Lkotlin/jvm/internal/F;

    .line 69
    .line 70
    iget-object v5, v0, Lio/ktor/utils/io/I;->a:Lio/ktor/utils/io/t;

    .line 71
    .line 72
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast p4, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    if-eqz p4, :cond_4

    .line 82
    .line 83
    invoke-interface {p2}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {p2, p3}, LBa/c;->I(LPf/i;Ltf/l;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_1
    move-object p4, v2

    .line 91
    move-object v2, p3

    .line 92
    move-wide p2, p0

    .line 93
    move-object p0, v5

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance p0, Ljava/io/EOFException;

    .line 96
    .line 97
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string p3, "Not enough bytes available: required 0 but "

    .line 100
    .line 101
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p3, "<this>"

    .line 105
    .line 106
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p2}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-wide p2, p2, LPf/a;->c:J

    .line 117
    .line 118
    long-to-int p2, p2

    .line 119
    const-string p3, " available"

    .line 120
    .line 121
    invoke-static {p2, p3, p1}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_5
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const-wide/16 v5, 0x0

    .line 133
    .line 134
    cmp-long p4, p2, v5

    .line 135
    .line 136
    if-ltz p4, :cond_b

    .line 137
    .line 138
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 139
    .line 140
    .line 141
    move-result p4

    .line 142
    if-eqz p4, :cond_7

    .line 143
    .line 144
    invoke-interface {p0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-nez p0, :cond_6

    .line 149
    .line 150
    new-instance p0, Ljava/lang/Long;

    .line 151
    .line 152
    invoke-direct {p0, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_6
    throw p0

    .line 157
    :cond_7
    new-instance p4, Lkotlin/jvm/internal/F;

    .line 158
    .line 159
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v2, Lio/ktor/utils/io/H;

    .line 163
    .line 164
    invoke-direct {v2, p2, p3, p4, p1}, Lio/ktor/utils/io/H;-><init>(JLkotlin/jvm/internal/F;Ljava/nio/channels/FileChannel;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    iget-wide v5, p4, Lkotlin/jvm/internal/F;->a:J

    .line 168
    .line 169
    cmp-long p1, v5, p2

    .line 170
    .line 171
    if-gez p1, :cond_9

    .line 172
    .line 173
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_9

    .line 178
    .line 179
    iput-object p0, v0, Lio/ktor/utils/io/I;->a:Lio/ktor/utils/io/t;

    .line 180
    .line 181
    iput-object p4, v0, Lio/ktor/utils/io/I;->b:Lkotlin/jvm/internal/F;

    .line 182
    .line 183
    iput-object v2, v0, Lio/ktor/utils/io/I;->c:Ltf/l;

    .line 184
    .line 185
    iput-object p0, v0, Lio/ktor/utils/io/I;->d:Lio/ktor/utils/io/t;

    .line 186
    .line 187
    iput-wide p2, v0, Lio/ktor/utils/io/I;->e:J

    .line 188
    .line 189
    iput v4, v0, Lio/ktor/utils/io/I;->g:I

    .line 190
    .line 191
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v1, :cond_8

    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_8
    move-object v5, p0

    .line 199
    move-wide v7, p2

    .line 200
    move-object p2, v5

    .line 201
    move-object p3, v2

    .line 202
    move-object v2, p4

    .line 203
    move-object p4, p1

    .line 204
    move-wide p0, v7

    .line 205
    :goto_3
    check-cast p4, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result p4

    .line 211
    if-eqz p4, :cond_3

    .line 212
    .line 213
    invoke-interface {p2}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-static {p2, p3}, LBa/c;->I(LPf/i;Ltf/l;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :cond_9
    invoke-interface {p0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    if-nez p0, :cond_a

    .line 227
    .line 228
    iget-wide p0, p4, Lkotlin/jvm/internal/F;->a:J

    .line 229
    .line 230
    new-instance p2, Ljava/lang/Long;

    .line 231
    .line 232
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 233
    .line 234
    .line 235
    return-object p2

    .line 236
    :cond_a
    throw p0

    .line 237
    :cond_b
    const-string p0, "Limit shouldn\'t be negative: "

    .line 238
    .line 239
    invoke-static {p2, p3, p0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p1
.end method

.method public static final g(Lio/ktor/utils/io/t;JLlf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/w;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/w;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/w;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/w;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/w;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/w;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p0, v0, Lio/ktor/utils/io/w;->c:J

    .line 37
    .line 38
    iget-wide v4, v0, Lio/ktor/utils/io/w;->b:J

    .line 39
    .line 40
    iget-object p2, v0, Lio/ktor/utils/io/w;->a:Lio/ktor/utils/io/t;

    .line 41
    .line 42
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-wide v4, p1

    .line 58
    :goto_1
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    cmp-long p3, p1, v6

    .line 61
    .line 62
    if-lez p3, :cond_5

    .line 63
    .line 64
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_5

    .line 69
    .line 70
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-wide v6, p3, LPf/a;->c:J

    .line 78
    .line 79
    long-to-int p3, v6

    .line 80
    if-nez p3, :cond_4

    .line 81
    .line 82
    iput-object p0, v0, Lio/ktor/utils/io/w;->a:Lio/ktor/utils/io/t;

    .line 83
    .line 84
    iput-wide v4, v0, Lio/ktor/utils/io/w;->b:J

    .line 85
    .line 86
    iput-wide p1, v0, Lio/ktor/utils/io/w;->c:J

    .line 87
    .line 88
    iput v3, v0, Lio/ktor/utils/io/w;->e:I

    .line 89
    .line 90
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    if-ne p3, v1, :cond_3

    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_3
    move-wide v10, p1

    .line 98
    move-object p2, p0

    .line 99
    move-wide p0, v10

    .line 100
    :goto_2
    move-wide v10, p0

    .line 101
    move-object p0, p2

    .line 102
    move-wide p1, v10

    .line 103
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-static {p3}, LFe/b;->C(LPf/i;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    invoke-static {p1, p2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    const-string v2, "<this>"

    .line 120
    .line 121
    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, v6, v7}, LPf/a;->request(J)Z

    .line 125
    .line 126
    .line 127
    invoke-static {p3}, LFe/b;->C(LPf/i;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v8

    .line 131
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v8

    .line 135
    invoke-virtual {p3, v8, v9}, LPf/a;->skip(J)V

    .line 136
    .line 137
    .line 138
    sub-long/2addr p1, v6

    .line 139
    goto :goto_1

    .line 140
    :cond_5
    sub-long/2addr v4, p1

    .line 141
    new-instance p0, Ljava/lang/Long;

    .line 142
    .line 143
    invoke-direct {p0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 144
    .line 145
    .line 146
    return-object p0
.end method

.method public static final h(Lio/ktor/utils/io/J;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lio/ktor/utils/io/J;->b()Ljava/lang/Throwable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    instance-of v1, p0, Lio/ktor/utils/io/m;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Lio/ktor/utils/io/m;

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lef/C;->a:Lef/C;

    .line 20
    .line 21
    invoke-interface {p0}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-wide v2, v2, LPf/a;->c:J

    .line 29
    .line 30
    long-to-int v0, v2

    .line 31
    const/high16 v2, 0x100000

    .line 32
    .line 33
    if-lt v0, v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p0, p1}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 40
    .line 41
    if-ne p0, p1, :cond_1

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    return-object v1

    .line 45
    :cond_2
    throw v1
.end method

.method public static final i(Lio/ktor/utils/io/t;ILlf/c;)Ljava/lang/Comparable;
    .locals 4

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/x;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/x;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/x;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/x;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/x;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/x;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p1, v0, Lio/ktor/utils/io/x;->b:I

    .line 37
    .line 38
    iget-object p0, v0, Lio/ktor/utils/io/x;->a:Lio/ktor/utils/io/t;

    .line 39
    .line 40
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iput-object p0, v0, Lio/ktor/utils/io/x;->a:Lio/ktor/utils/io/t;

    .line 63
    .line 64
    iput p1, v0, Lio/ktor/utils/io/x;->b:I

    .line 65
    .line 66
    iput v3, v0, Lio/ktor/utils/io/x;->d:I

    .line 67
    .line 68
    invoke-interface {p0, p1, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-ne p2, v1, :cond_4

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_5

    .line 82
    .line 83
    :goto_2
    const/4 p0, 0x0

    .line 84
    return-object p0

    .line 85
    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance p2, LPf/c;

    .line 93
    .line 94
    invoke-direct {p2, p0}, LPf/c;-><init>(LPf/i;)V

    .line 95
    .line 96
    .line 97
    new-instance p0, LPf/e;

    .line 98
    .line 99
    invoke-direct {p0, p2}, LPf/e;-><init>(LPf/c;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, p1}, LPf/j;->e(LPf/i;I)[B

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p1, LQf/a;

    .line 107
    .line 108
    invoke-direct {p1, p0}, LQf/a;-><init>([B)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public static final j(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/y;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/y;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/y;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/y;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/y;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/y;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/y;->b:LPf/a;

    .line 37
    .line 38
    iget-object v2, v0, Lio/ktor/utils/io/y;->a:Lio/ktor/utils/io/t;

    .line 39
    .line 40
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, LPf/a;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_4

    .line 67
    .line 68
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p1, v2}, LPf/a;->h(LPf/d;)J

    .line 73
    .line 74
    .line 75
    iput-object p0, v0, Lio/ktor/utils/io/y;->a:Lio/ktor/utils/io/t;

    .line 76
    .line 77
    iput-object p1, v0, Lio/ktor/utils/io/y;->b:LPf/a;

    .line 78
    .line 79
    iput v3, v0, Lio/ktor/utils/io/y;->d:I

    .line 80
    .line 81
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-ne v2, v1, :cond_3

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-nez p0, :cond_5

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_5
    throw p0
.end method

.method public static final k(Lio/ktor/utils/io/X;ILlf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/z;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/z;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/z;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/z;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/z;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/z;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p0, v0, Lio/ktor/utils/io/z;->c:I

    .line 37
    .line 38
    iget-object p1, v0, Lio/ktor/utils/io/z;->b:LPf/a;

    .line 39
    .line 40
    iget-object v2, v0, Lio/ktor/utils/io/z;->a:Lio/ktor/utils/io/t;

    .line 41
    .line 42
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, LPf/a;

    .line 58
    .line 59
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    move-object v10, p2

    .line 63
    move p2, p1

    .line 64
    move-object p1, v10

    .line 65
    :goto_1
    iget-wide v4, p1, LPf/a;->c:J

    .line 66
    .line 67
    int-to-long v6, p2

    .line 68
    cmp-long v2, v4, v6

    .line 69
    .line 70
    if-gez v2, :cond_6

    .line 71
    .line 72
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, LPf/a;->exhausted()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    iput-object p0, v0, Lio/ktor/utils/io/z;->a:Lio/ktor/utils/io/t;

    .line 83
    .line 84
    iput-object p1, v0, Lio/ktor/utils/io/z;->b:LPf/a;

    .line 85
    .line 86
    iput p2, v0, Lio/ktor/utils/io/z;->c:I

    .line 87
    .line 88
    iput v3, v0, Lio/ktor/utils/io/z;->e:I

    .line 89
    .line 90
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-ne v2, v1, :cond_3

    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_3
    move-object v2, p0

    .line 98
    move p0, p2

    .line 99
    :goto_2
    move p2, p0

    .line 100
    move-object p0, v2

    .line 101
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_6

    .line 106
    .line 107
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, LFe/b;->C(LPf/i;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    int-to-long v6, p2

    .line 116
    iget-wide v8, p1, LPf/a;->c:J

    .line 117
    .line 118
    sub-long v8, v6, v8

    .line 119
    .line 120
    cmp-long v2, v4, v8

    .line 121
    .line 122
    if-lez v2, :cond_5

    .line 123
    .line 124
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-wide v4, p1, LPf/a;->c:J

    .line 129
    .line 130
    sub-long/2addr v6, v4

    .line 131
    invoke-virtual {v2, p1, v6, v7}, LPf/a;->b(LPf/a;J)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2, p1}, LPf/a;->i(LPf/a;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    new-instance v2, Ljava/lang/Long;

    .line 144
    .line 145
    invoke-direct {v2, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    iget-wide v0, p1, LPf/a;->c:J

    .line 150
    .line 151
    int-to-long v2, p2

    .line 152
    cmp-long p0, v0, v2

    .line 153
    .line 154
    if-ltz p0, :cond_7

    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_7
    new-instance p0, Ljava/io/EOFException;

    .line 158
    .line 159
    const-string v0, "Not enough data available, required "

    .line 160
    .line 161
    const-string v1, " bytes but only "

    .line 162
    .line 163
    invoke-static {p2, v0, v1}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    iget-wide v0, p1, LPf/a;->c:J

    .line 168
    .line 169
    const-string p1, " available"

    .line 170
    .line 171
    invoke-static {p2, v0, v1, p1}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p0
.end method

.method public static final l(Lio/ktor/utils/io/t;JLlf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lio/ktor/utils/io/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/utils/io/B;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/B;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/B;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/B;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/utils/io/B;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/B;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p0, v0, Lio/ktor/utils/io/B;->c:J

    .line 37
    .line 38
    iget-object p2, v0, Lio/ktor/utils/io/B;->b:LPf/a;

    .line 39
    .line 40
    iget-object v2, v0, Lio/ktor/utils/io/B;->a:Lio/ktor/utils/io/t;

    .line 41
    .line 42
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p3, p2

    .line 46
    move-wide p1, p0

    .line 47
    move-object p0, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p3, LPf/a;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_5

    .line 70
    .line 71
    const-wide/16 v4, 0x0

    .line 72
    .line 73
    cmp-long v2, p1, v4

    .line 74
    .line 75
    if-lez v2, :cond_5

    .line 76
    .line 77
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2}, LFe/b;->C(LPf/i;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    cmp-long v2, p1, v6

    .line 86
    .line 87
    if-ltz v2, :cond_3

    .line 88
    .line 89
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, LFe/b;->C(LPf/i;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    sub-long v4, p1, v4

    .line 98
    .line 99
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, p3}, LPf/a;->i(LPf/a;)J

    .line 104
    .line 105
    .line 106
    move-result-wide p1

    .line 107
    new-instance v2, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2, p3, p1, p2}, LPf/a;->b(LPf/a;J)V

    .line 118
    .line 119
    .line 120
    :goto_2
    iput-object p0, v0, Lio/ktor/utils/io/B;->a:Lio/ktor/utils/io/t;

    .line 121
    .line 122
    iput-object p3, v0, Lio/ktor/utils/io/B;->b:LPf/a;

    .line 123
    .line 124
    iput-wide v4, v0, Lio/ktor/utils/io/B;->c:J

    .line 125
    .line 126
    iput v3, v0, Lio/ktor/utils/io/B;->e:I

    .line 127
    .line 128
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_4

    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_4
    move-wide p1, v4

    .line 136
    goto :goto_1

    .line 137
    :cond_5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    return-object p3
.end method

.method public static final m(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/A;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/A;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/A;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/A;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/A;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/A;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/utils/io/A;->b:LPf/a;

    .line 37
    .line 38
    iget-object v2, v0, Lio/ktor/utils/io/A;->a:Lio/ktor/utils/io/t;

    .line 39
    .line 40
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, LPf/a;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/t;->h()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_4

    .line 67
    .line 68
    invoke-interface {p0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {p1, v2}, LPf/a;->h(LPf/d;)J

    .line 73
    .line 74
    .line 75
    iput-object p0, v0, Lio/ktor/utils/io/A;->a:Lio/ktor/utils/io/t;

    .line 76
    .line 77
    iput-object p1, v0, Lio/ktor/utils/io/A;->b:LPf/a;

    .line 78
    .line 79
    iput v3, v0, Lio/ktor/utils/io/A;->d:I

    .line 80
    .line 81
    invoke-interface {p0, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-ne v2, v1, :cond_3

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-nez p0, :cond_5

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_5
    throw p0
.end method

.method public static final n(Lio/ktor/utils/io/t;LLd/c;IILlf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    instance-of v5, v1, Lio/ktor/utils/io/C;

    .line 7
    .line 8
    if-eqz v5, :cond_0

    .line 9
    .line 10
    move-object v5, v1

    .line 11
    check-cast v5, Lio/ktor/utils/io/C;

    .line 12
    .line 13
    iget v6, v5, Lio/ktor/utils/io/C;->h:I

    .line 14
    .line 15
    const/high16 v7, -0x80000000

    .line 16
    .line 17
    and-int v8, v6, v7

    .line 18
    .line 19
    if-eqz v8, :cond_0

    .line 20
    .line 21
    sub-int/2addr v6, v7

    .line 22
    iput v6, v5, Lio/ktor/utils/io/C;->h:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v5, Lio/ktor/utils/io/C;

    .line 26
    .line 27
    invoke-direct {v5, v1}, Llf/c;-><init>(Ljf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v1, v5, Lio/ktor/utils/io/C;->g:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v7, v5, Lio/ktor/utils/io/C;->h:I

    .line 35
    .line 36
    const-string v8, "<this>"

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    const/16 v10, 0xa

    .line 40
    .line 41
    const/4 v11, 0x3

    .line 42
    const/4 v12, 0x2

    .line 43
    const/4 v13, 0x0

    .line 44
    if-eqz v7, :cond_4

    .line 45
    .line 46
    if-eq v7, v9, :cond_3

    .line 47
    .line 48
    if-eq v7, v12, :cond_2

    .line 49
    .line 50
    if-ne v7, v11, :cond_1

    .line 51
    .line 52
    iget v0, v5, Lio/ktor/utils/io/C;->f:I

    .line 53
    .line 54
    iget v7, v5, Lio/ktor/utils/io/C;->e:I

    .line 55
    .line 56
    iget-object v14, v5, Lio/ktor/utils/io/C;->d:LPf/a;

    .line 57
    .line 58
    iget-object v15, v5, Lio/ktor/utils/io/C;->c:Ljava/lang/AutoCloseable;

    .line 59
    .line 60
    check-cast v15, Ljava/lang/AutoCloseable;

    .line 61
    .line 62
    const-wide/16 v16, 0x0

    .line 63
    .line 64
    iget-object v3, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 65
    .line 66
    iget-object v4, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    move v1, v11

    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object v1, v0

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    const-wide/16 v16, 0x0

    .line 87
    .line 88
    iget v0, v5, Lio/ktor/utils/io/C;->e:I

    .line 89
    .line 90
    iget-object v3, v5, Lio/ktor/utils/io/C;->d:LPf/a;

    .line 91
    .line 92
    iget-object v4, v5, Lio/ktor/utils/io/C;->c:Ljava/lang/AutoCloseable;

    .line 93
    .line 94
    move-object v15, v4

    .line 95
    check-cast v15, Ljava/lang/AutoCloseable;

    .line 96
    .line 97
    iget-object v4, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 98
    .line 99
    iget-object v5, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 100
    .line 101
    :try_start_1
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    goto/16 :goto_4

    .line 105
    .line 106
    :cond_3
    const-wide/16 v16, 0x0

    .line 107
    .line 108
    iget v0, v5, Lio/ktor/utils/io/C;->f:I

    .line 109
    .line 110
    iget v3, v5, Lio/ktor/utils/io/C;->e:I

    .line 111
    .line 112
    iget-object v4, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 113
    .line 114
    iget-object v7, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 115
    .line 116
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v1, v4

    .line 120
    move v4, v0

    .line 121
    move-object v0, v7

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const-wide/16 v16, 0x0

    .line 124
    .line 125
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, LPf/a;->exhausted()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    iput-object v0, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 139
    .line 140
    move-object/from16 v1, p1

    .line 141
    .line 142
    iput-object v1, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 143
    .line 144
    move/from16 v3, p2

    .line 145
    .line 146
    iput v3, v5, Lio/ktor/utils/io/C;->e:I

    .line 147
    .line 148
    move/from16 v4, p3

    .line 149
    .line 150
    iput v4, v5, Lio/ktor/utils/io/C;->f:I

    .line 151
    .line 152
    iput v9, v5, Lio/ktor/utils/io/C;->h:I

    .line 153
    .line 154
    invoke-interface {v0, v9, v5}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    if-ne v7, v6, :cond_6

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_5
    move-object/from16 v1, p1

    .line 163
    .line 164
    move/from16 v3, p2

    .line 165
    .line 166
    move/from16 v4, p3

    .line 167
    .line 168
    :cond_6
    :goto_1
    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-eqz v7, :cond_7

    .line 173
    .line 174
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_7
    new-instance v7, LPf/a;

    .line 178
    .line 179
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    move v14, v4

    .line 183
    move-object v4, v0

    .line 184
    move v0, v14

    .line 185
    move-object v14, v7

    .line 186
    move-object v15, v14

    .line 187
    move v7, v3

    .line 188
    move-object v3, v1

    .line 189
    :goto_2
    :try_start_2
    invoke-interface {v4}, Lio/ktor/utils/io/t;->h()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_11

    .line 194
    .line 195
    :goto_3
    invoke-interface {v4}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, LPf/a;->exhausted()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_e

    .line 204
    .line 205
    invoke-interface {v4}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, LPf/a;->readByte()B

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    const/16 v11, 0xd

    .line 214
    .line 215
    if-ne v1, v11, :cond_c

    .line 216
    .line 217
    invoke-interface {v4}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v1}, LPf/a;->exhausted()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_9

    .line 226
    .line 227
    iput-object v4, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 228
    .line 229
    iput-object v3, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 230
    .line 231
    move-object v1, v15

    .line 232
    check-cast v1, Ljava/lang/AutoCloseable;

    .line 233
    .line 234
    iput-object v1, v5, Lio/ktor/utils/io/C;->c:Ljava/lang/AutoCloseable;

    .line 235
    .line 236
    iput-object v14, v5, Lio/ktor/utils/io/C;->d:LPf/a;

    .line 237
    .line 238
    iput v0, v5, Lio/ktor/utils/io/C;->e:I

    .line 239
    .line 240
    iput v12, v5, Lio/ktor/utils/io/C;->h:I

    .line 241
    .line 242
    invoke-interface {v4, v9, v5}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    if-ne v1, v6, :cond_8

    .line 247
    .line 248
    goto/16 :goto_6

    .line 249
    .line 250
    :cond_8
    move-object v5, v4

    .line 251
    move-object v4, v3

    .line 252
    move-object v3, v14

    .line 253
    :goto_4
    move-object v14, v3

    .line 254
    move-object v3, v4

    .line 255
    move-object v4, v5

    .line 256
    :cond_9
    invoke-interface {v4}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-wide v5, v1, LPf/a;->c:J

    .line 264
    .line 265
    cmp-long v5, v16, v5

    .line 266
    .line 267
    if-gez v5, :cond_b

    .line 268
    .line 269
    iget-object v1, v1, LPf/a;->a:LPf/g;

    .line 270
    .line 271
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2}, LPf/g;->b(I)B

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-ne v1, v10, :cond_a

    .line 279
    .line 280
    sget-object v1, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 281
    .line 282
    const/4 v1, 0x4

    .line 283
    invoke-static {v0, v1}, Lio/ktor/utils/io/N;->o(II)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v4}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-wide/16 v1, 0x1

    .line 294
    .line 295
    invoke-virtual {v0, v1, v2}, LPf/a;->request(J)Z

    .line 296
    .line 297
    .line 298
    invoke-static {v0}, LFe/b;->C(LPf/i;)J

    .line 299
    .line 300
    .line 301
    move-result-wide v4

    .line 302
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    invoke-virtual {v0, v1, v2}, LPf/a;->skip(J)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Ljava/lang/Long;

    .line 310
    .line 311
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_a
    sget-object v1, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 316
    .line 317
    invoke-static {v0, v9}, Lio/ktor/utils/io/N;->o(II)V

    .line 318
    .line 319
    .line 320
    :goto_5
    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    iget-wide v0, v14, LPf/a;->c:J

    .line 324
    .line 325
    invoke-static {v14, v0, v1}, LPf/j;->c(LPf/a;J)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-interface {v3, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 330
    .line 331
    .line 332
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 333
    .line 334
    invoke-static {v15, v13}, Lr7/e;->m(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    return-object v0

    .line 338
    :cond_b
    :try_start_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 339
    .line 340
    new-instance v2, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v3, "position (0) is not within the range [0..size("

    .line 343
    .line 344
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-wide v3, v1, LPf/a;->c:J

    .line 348
    .line 349
    const-string v1, "))"

    .line 350
    .line 351
    invoke-static {v2, v3, v4, v1}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0

    .line 359
    :cond_c
    if-ne v1, v10, :cond_d

    .line 360
    .line 361
    sget-object v1, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 362
    .line 363
    invoke-static {v0, v12}, Lio/ktor/utils/io/N;->o(II)V

    .line 364
    .line 365
    .line 366
    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    iget-wide v0, v14, LPf/a;->c:J

    .line 370
    .line 371
    invoke-static {v14, v0, v1}, LPf/j;->c(LPf/a;J)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-interface {v3, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 376
    .line 377
    .line 378
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 379
    .line 380
    invoke-static {v15, v13}, Lr7/e;->m(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    return-object v0

    .line 384
    :cond_d
    int-to-byte v1, v1

    .line 385
    :try_start_4
    invoke-virtual {v14, v1}, LPf/a;->z(B)V

    .line 386
    .line 387
    .line 388
    const/4 v11, 0x3

    .line 389
    goto/16 :goto_3

    .line 390
    .line 391
    :cond_e
    iget-wide v10, v14, LPf/a;->c:J

    .line 392
    .line 393
    int-to-long v1, v7

    .line 394
    cmp-long v1, v10, v1

    .line 395
    .line 396
    if-gez v1, :cond_10

    .line 397
    .line 398
    iput-object v4, v5, Lio/ktor/utils/io/C;->a:Lio/ktor/utils/io/t;

    .line 399
    .line 400
    iput-object v3, v5, Lio/ktor/utils/io/C;->b:Ljava/lang/Appendable;

    .line 401
    .line 402
    move-object v1, v15

    .line 403
    check-cast v1, Ljava/lang/AutoCloseable;

    .line 404
    .line 405
    iput-object v1, v5, Lio/ktor/utils/io/C;->c:Ljava/lang/AutoCloseable;

    .line 406
    .line 407
    iput-object v14, v5, Lio/ktor/utils/io/C;->d:LPf/a;

    .line 408
    .line 409
    iput v7, v5, Lio/ktor/utils/io/C;->e:I

    .line 410
    .line 411
    iput v0, v5, Lio/ktor/utils/io/C;->f:I

    .line 412
    .line 413
    const/4 v1, 0x3

    .line 414
    iput v1, v5, Lio/ktor/utils/io/C;->h:I

    .line 415
    .line 416
    invoke-interface {v4, v9, v5}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    if-ne v2, v6, :cond_f

    .line 421
    .line 422
    :goto_6
    return-object v6

    .line 423
    :cond_f
    :goto_7
    move v11, v1

    .line 424
    const/4 v2, 0x0

    .line 425
    const/16 v10, 0xa

    .line 426
    .line 427
    goto/16 :goto_2

    .line 428
    .line 429
    :cond_10
    new-instance v0, LTd/a;

    .line 430
    .line 431
    new-instance v1, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    .line 435
    .line 436
    const-string v2, "Line exceeds limit of "

    .line 437
    .line 438
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    const-string v2, " characters"

    .line 445
    .line 446
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-direct {v0, v1}, LTd/a;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v0

    .line 457
    :cond_11
    iget-wide v0, v14, LPf/a;->c:J

    .line 458
    .line 459
    cmp-long v0, v0, v16

    .line 460
    .line 461
    if-lez v0, :cond_12

    .line 462
    .line 463
    move v2, v9

    .line 464
    goto :goto_8

    .line 465
    :cond_12
    const/4 v2, 0x0

    .line 466
    :goto_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-eqz v2, :cond_13

    .line 471
    .line 472
    iget-wide v1, v14, LPf/a;->c:J

    .line 473
    .line 474
    invoke-static {v14, v1, v2}, LPf/j;->c(LPf/a;J)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-interface {v3, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 479
    .line 480
    .line 481
    :cond_13
    invoke-static {v15, v13}, Lr7/e;->m(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 482
    .line 483
    .line 484
    return-object v0

    .line 485
    :goto_9
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 486
    :catchall_1
    move-exception v0

    .line 487
    invoke-static {v15, v1}, Lr7/e;->m(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    throw v0
.end method

.method public static final o(II)V
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 2
    .line 3
    or-int v0, p0, p1

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Unexpected line ending "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lio/ktor/utils/io/Y;->a(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, ", while expected "

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lio/ktor/utils/io/Y;->a(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method public static final p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/F;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/F;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/F;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/F;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/F;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/F;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    iget-object p1, v0, Lio/ktor/utils/io/F;->b:LQf/a;

    .line 52
    .line 53
    iget-object p0, v0, Lio/ktor/utils/io/F;->a:Lio/ktor/utils/io/t;

    .line 54
    .line 55
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p1, LQf/a;->a:[B

    .line 63
    .line 64
    array-length p2, p2

    .line 65
    iput-object p0, v0, Lio/ktor/utils/io/F;->a:Lio/ktor/utils/io/t;

    .line 66
    .line 67
    iput-object p1, v0, Lio/ktor/utils/io/F;->b:LQf/a;

    .line 68
    .line 69
    iput v4, v0, Lio/ktor/utils/io/F;->d:I

    .line 70
    .line 71
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/N;->i(Lio/ktor/utils/io/t;ILlf/c;)Ljava/lang/Comparable;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-ne p2, v1, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    iget-object p1, p1, LQf/a;->a:[B

    .line 85
    .line 86
    array-length p1, p1

    .line 87
    int-to-long p1, p1

    .line 88
    const/4 v2, 0x0

    .line 89
    iput-object v2, v0, Lio/ktor/utils/io/F;->a:Lio/ktor/utils/io/t;

    .line 90
    .line 91
    iput-object v2, v0, Lio/ktor/utils/io/F;->b:LQf/a;

    .line 92
    .line 93
    iput v3, v0, Lio/ktor/utils/io/F;->d:I

    .line 94
    .line 95
    invoke-static {p0, p1, p2, v0}, Lio/ktor/utils/io/N;->g(Lio/ktor/utils/io/t;JLlf/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v1, :cond_5

    .line 100
    .line 101
    :goto_2
    return-object v1

    .line 102
    :cond_5
    :goto_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    return-object p0
.end method

.method public static final q(Lio/ktor/utils/io/t;Llf/c;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/G;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/G;->b:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/G;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/G;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/G;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/G;->b:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput v3, v0, Lio/ktor/utils/io/G;->b:I

    .line 52
    .line 53
    invoke-static {p0, v0}, Lio/ktor/utils/io/N;->j(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v1, :cond_3

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3
    :goto_1
    check-cast p1, LPf/a;

    .line 61
    .line 62
    iget-wide v0, p1, LPf/a;->c:J

    .line 63
    .line 64
    long-to-int p0, v0

    .line 65
    invoke-static {p1, p0}, LPf/j;->e(LPf/i;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
