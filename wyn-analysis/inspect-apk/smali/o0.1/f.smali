.class public final Lo0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Ls0/b;


# instance fields
.field public final a:Lo0/c;

.field public final b:LM0/n;

.field public final c:LN/Y;


# direct methods
.method public constructor <init>(Lo0/c;LM0/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/f;->a:Lo0/c;

    .line 5
    .line 6
    iput-object p2, p0, Lo0/f;->b:LM0/n;

    .line 7
    .line 8
    new-instance p2, LA0/p;

    .line 9
    .line 10
    const/16 v0, 0x1b

    .line 11
    .line 12
    invoke-direct {p2, p0, v0}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p1, Lo0/c;->a:Lkotlin/jvm/internal/n;

    .line 16
    .line 17
    sget-object p1, LN/P;->f:LN/P;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lo0/f;->c:LN/Y;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()LEf/E;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo0/f;->b()Lo0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lo0/f;->a()LEf/E;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lo0/f;->a:Lo0/c;

    .line 13
    .line 14
    iget-object v0, v0, Lo0/c;->b:LKd/a;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public final b()Lo0/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/f;->c:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lo0/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(JJLlf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lo0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lo0/d;

    .line 7
    .line 8
    iget v1, v0, Lo0/d;->f:I

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
    iput v1, v0, Lo0/d;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lo0/d;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lo0/d;-><init>(Lo0/f;Llf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Lo0/d;->d:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v1, v6, Lo0/d;->f:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-wide p1, v6, Lo0/d;->b:J

    .line 42
    .line 43
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-wide p3, v6, Lo0/d;->c:J

    .line 57
    .line 58
    iget-wide p1, v6, Lo0/d;->b:J

    .line 59
    .line 60
    iget-object v1, v6, Lo0/d;->a:Lo0/f;

    .line 61
    .line 62
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-object p0, v6, Lo0/d;->a:Lo0/f;

    .line 70
    .line 71
    iput-wide p1, v6, Lo0/d;->b:J

    .line 72
    .line 73
    iput-wide p3, v6, Lo0/d;->c:J

    .line 74
    .line 75
    iput v3, v6, Lo0/d;->f:I

    .line 76
    .line 77
    iget-object p5, p0, Lo0/f;->b:LM0/n;

    .line 78
    .line 79
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-wide v3, LL0/l;->b:J

    .line 83
    .line 84
    new-instance p5, LL0/l;

    .line 85
    .line 86
    invoke-direct {p5, v3, v4}, LL0/l;-><init>(J)V

    .line 87
    .line 88
    .line 89
    if-ne p5, v0, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    move-object v1, p0

    .line 93
    :goto_2
    check-cast p5, LL0/l;

    .line 94
    .line 95
    iget-wide v7, p5, LL0/l;->a:J

    .line 96
    .line 97
    invoke-virtual {v1}, Lo0/f;->b()Lo0/f;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    invoke-static {p1, p2, v7, v8}, LL0/l;->a(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide p1

    .line 107
    const/16 p5, 0x20

    .line 108
    .line 109
    shr-long v3, p3, p5

    .line 110
    .line 111
    long-to-int v3, v3

    .line 112
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    shr-long v4, v7, p5

    .line 117
    .line 118
    long-to-int p5, v4

    .line 119
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result p5

    .line 123
    sub-float/2addr v3, p5

    .line 124
    const-wide v4, 0xffffffffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    and-long/2addr p3, v4

    .line 130
    long-to-int p3, p3

    .line 131
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    and-long p4, v7, v4

    .line 136
    .line 137
    long-to-int p4, p4

    .line 138
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result p4

    .line 142
    sub-float/2addr p3, p4

    .line 143
    invoke-static {v3, p3}, LFe/c;->d(FF)J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    const/4 p3, 0x0

    .line 148
    iput-object p3, v6, Lo0/d;->a:Lo0/f;

    .line 149
    .line 150
    iput-wide v7, v6, Lo0/d;->b:J

    .line 151
    .line 152
    iput v2, v6, Lo0/d;->f:I

    .line 153
    .line 154
    move-wide v2, p1

    .line 155
    invoke-virtual/range {v1 .. v6}, Lo0/f;->c(JJLlf/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p5

    .line 159
    if-ne p5, v0, :cond_5

    .line 160
    .line 161
    :goto_3
    return-object v0

    .line 162
    :cond_5
    move-wide p1, v7

    .line 163
    :goto_4
    check-cast p5, LL0/l;

    .line 164
    .line 165
    iget-wide p3, p5, LL0/l;->a:J

    .line 166
    .line 167
    move-wide v7, p1

    .line 168
    goto :goto_5

    .line 169
    :cond_6
    sget-wide p3, LL0/l;->b:J

    .line 170
    .line 171
    :goto_5
    invoke-static {v7, v8, p3, p4}, LL0/l;->a(JJ)J

    .line 172
    .line 173
    .line 174
    move-result-wide p1

    .line 175
    new-instance p3, LL0/l;

    .line 176
    .line 177
    invoke-direct {p3, p1, p2}, LL0/l;-><init>(J)V

    .line 178
    .line 179
    .line 180
    return-object p3
.end method

.method public final d(IJJ)J
    .locals 8

    .line 1
    sget-wide v0, Ld0/c;->b:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lo0/f;->b()Lo0/f;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-static {p2, p3, v0, v1}, Ld0/c;->f(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-static {p4, p5, v0, v1}, Ld0/c;->e(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    move v3, p1

    .line 18
    invoke-virtual/range {v2 .. v7}, Lo0/f;->d(IJJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide p1, v0

    .line 24
    :goto_0
    invoke-static {v0, v1, p1, p2}, Ld0/c;->f(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final f(JLlf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lo0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo0/e;

    .line 7
    .line 8
    iget v1, v0, Lo0/e;->e:I

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
    iput v1, v0, Lo0/e;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo0/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo0/e;-><init>(Lo0/f;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo0/e;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lo0/e;->e:I

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
    iget-wide p1, v0, Lo0/e;->b:J

    .line 40
    .line 41
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-wide p1, v0, Lo0/e;->b:J

    .line 55
    .line 56
    iget-object v2, v0, Lo0/e;->a:Lo0/f;

    .line 57
    .line 58
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lo0/f;->b()Lo0/f;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    if-eqz p3, :cond_5

    .line 70
    .line 71
    iput-object p0, v0, Lo0/e;->a:Lo0/f;

    .line 72
    .line 73
    iput-wide p1, v0, Lo0/e;->b:J

    .line 74
    .line 75
    iput v4, v0, Lo0/e;->e:I

    .line 76
    .line 77
    invoke-virtual {p3, p1, p2, v0}, Lo0/f;->f(JLlf/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    if-ne p3, v1, :cond_4

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    move-object v2, p0

    .line 85
    :goto_1
    check-cast p3, LL0/l;

    .line 86
    .line 87
    iget-wide v4, p3, LL0/l;->a:J

    .line 88
    .line 89
    :goto_2
    move-wide v9, v4

    .line 90
    move-wide v4, p1

    .line 91
    move-wide p1, v9

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    sget-wide v4, LL0/l;->b:J

    .line 94
    .line 95
    move-object v2, p0

    .line 96
    goto :goto_2

    .line 97
    :goto_3
    iget-object p3, v2, Lo0/f;->b:LM0/n;

    .line 98
    .line 99
    sget v2, LL0/l;->c:I

    .line 100
    .line 101
    const/16 v2, 0x20

    .line 102
    .line 103
    shr-long v6, v4, v2

    .line 104
    .line 105
    long-to-int v6, v6

    .line 106
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    shr-long v7, p1, v2

    .line 111
    .line 112
    long-to-int v2, v7

    .line 113
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    sub-float/2addr v6, v2

    .line 118
    const-wide v7, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    and-long/2addr v4, v7

    .line 124
    long-to-int v2, v4

    .line 125
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    and-long v4, p1, v7

    .line 130
    .line 131
    long-to-int v4, v4

    .line 132
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    sub-float/2addr v2, v4

    .line 137
    invoke-static {v6, v2}, LFe/c;->d(FF)J

    .line 138
    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    iput-object v2, v0, Lo0/e;->a:Lo0/f;

    .line 142
    .line 143
    iput-wide p1, v0, Lo0/e;->b:J

    .line 144
    .line 145
    iput v3, v0, Lo0/e;->e:I

    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-wide v2, LL0/l;->b:J

    .line 151
    .line 152
    new-instance p3, LL0/l;

    .line 153
    .line 154
    invoke-direct {p3, v2, v3}, LL0/l;-><init>(J)V

    .line 155
    .line 156
    .line 157
    if-ne p3, v1, :cond_6

    .line 158
    .line 159
    :goto_4
    return-object v1

    .line 160
    :cond_6
    :goto_5
    check-cast p3, LL0/l;

    .line 161
    .line 162
    iget-wide v0, p3, LL0/l;->a:J

    .line 163
    .line 164
    invoke-static {p1, p2, v0, v1}, LL0/l;->a(JJ)J

    .line 165
    .line 166
    .line 167
    move-result-wide p1

    .line 168
    new-instance p3, LL0/l;

    .line 169
    .line 170
    invoke-direct {p3, p1, p2}, LL0/l;-><init>(J)V

    .line 171
    .line 172
    .line 173
    return-object p3
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()La2/v;
    .locals 1

    .line 1
    sget-object v0, Lo0/h;->a:La2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final i(IJ)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo0/f;->b()Lo0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lo0/f;->i(IJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-wide v0, Ld0/c;->b:J

    .line 13
    .line 14
    :goto_0
    invoke-static {p2, p3, v0, v1}, Ld0/c;->e(JJ)J

    .line 15
    .line 16
    .line 17
    sget-wide p1, Ld0/c;->b:J

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2}, Ld0/c;->f(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
.end method

.method public final o(Ls0/c;)V
    .locals 1

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lo0/h;->a:La2/v;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lo0/f;

    .line 13
    .line 14
    iget-object v0, p0, Lo0/f;->c:LN/Y;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lo0/f;->b()Lo0/f;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lo0/f;->a:Lo0/c;

    .line 24
    .line 25
    iput-object p1, v0, Lo0/c;->c:Lo0/f;

    .line 26
    .line 27
    return-void
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
