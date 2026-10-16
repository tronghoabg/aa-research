.class public final Lu1/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/i;


# static fields
.field public static final j:Ljava/util/LinkedHashSet;

.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Ltf/a;

.field public final b:Lu1/m;

.field public final c:Lu1/b;

.field public final d:LHf/f0;

.field public final e:Ljava/lang/String;

.field public final f:Lef/p;

.field public final g:LHf/x0;

.field public h:Ljava/util/List;

.field public final i:LS3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu1/G;->j:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lu1/G;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ltf/a;Lu1/m;Ljava/util/List;Lu1/b;LEf/E;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lu1/G;->a:Ltf/a;

    .line 15
    .line 16
    iput-object p2, p0, Lu1/G;->b:Lu1/m;

    .line 17
    .line 18
    iput-object p4, p0, Lu1/G;->c:Lu1/b;

    .line 19
    .line 20
    new-instance p1, Lu1/u;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p0, p2}, Lu1/u;-><init>(Lu1/G;Ljf/c;)V

    .line 24
    .line 25
    .line 26
    new-instance p4, LHf/f0;

    .line 27
    .line 28
    invoke-direct {p4, p1}, LHf/f0;-><init>(Ltf/p;)V

    .line 29
    .line 30
    .line 31
    iput-object p4, p0, Lu1/G;->d:LHf/f0;

    .line 32
    .line 33
    const-string p1, ".tmp"

    .line 34
    .line 35
    iput-object p1, p0, Lu1/G;->e:Ljava/lang/String;

    .line 36
    .line 37
    new-instance p1, Lt0/p;

    .line 38
    .line 39
    const/4 p4, 0x6

    .line 40
    invoke-direct {p1, p0, p4}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lu1/G;->f:Lef/p;

    .line 48
    .line 49
    sget-object p1, Lu1/I;->a:Lu1/I;

    .line 50
    .line 51
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lu1/G;->g:LHf/x0;

    .line 56
    .line 57
    check-cast p3, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-static {p3}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lu1/G;->h:Ljava/util/List;

    .line 64
    .line 65
    new-instance p1, LS3/n;

    .line 66
    .line 67
    new-instance p3, LB/F;

    .line 68
    .line 69
    const/16 p4, 0x15

    .line 70
    .line 71
    invoke-direct {p3, p0, p4}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    new-instance p4, Lu1/r;

    .line 75
    .line 76
    invoke-direct {p4, p0, p2}, Lu1/r;-><init>(Lu1/G;Ljf/c;)V

    .line 77
    .line 78
    .line 79
    const-string p2, "scope"

    .line 80
    .line 81
    invoke-static {p5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p5, p1, LS3/n;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p4, p1, LS3/n;->b:Ljava/lang/Object;

    .line 90
    .line 91
    const/4 p2, 0x6

    .line 92
    const p4, 0x7fffffff

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-static {p4, p2, v0}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, p1, LS3/n;->c:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    .line 104
    const/4 p4, 0x0

    .line 105
    invoke-direct {p2, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-object p2, p1, LS3/n;->d:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-interface {p5}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    sget-object p4, LEf/l0;->a:LEf/l0;

    .line 115
    .line 116
    invoke-interface {p2, p4}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, LEf/m0;

    .line 121
    .line 122
    if-nez p2, :cond_0

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    new-instance p4, LA/W;

    .line 126
    .line 127
    const/16 p5, 0x1a

    .line 128
    .line 129
    invoke-direct {p4, p5, p3, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p2, p4}, LEf/m0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 133
    .line 134
    .line 135
    :goto_0
    iput-object p1, p0, Lu1/G;->i:LS3/n;

    .line 136
    .line 137
    return-void
.end method

.method public static final b(Lu1/G;Lu1/p;Llf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lu1/v;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lu1/v;

    .line 10
    .line 11
    iget v1, v0, Lu1/v;->f:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lu1/v;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lu1/v;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lu1/v;-><init>(Lu1/G;Llf/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lu1/v;->d:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    iget v2, v0, Lu1/v;->f:I

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, LEf/t;

    .line 48
    .line 49
    :goto_1
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, Lu1/v;->c:LEf/u;

    .line 66
    .line 67
    iget-object p1, v0, Lu1/v;->b:Lu1/G;

    .line 68
    .line 69
    iget-object v2, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lu1/p;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    move-object p2, p0

    .line 77
    move-object p0, p1

    .line 78
    move-object p1, v2

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    iget-object p0, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, LEf/t;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p2, p1, Lu1/p;->b:LEf/u;

    .line 89
    .line 90
    :try_start_2
    iget-object v2, p0, Lu1/G;->g:LHf/x0;

    .line 91
    .line 92
    invoke-virtual {v2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lu1/H;

    .line 97
    .line 98
    instance-of v6, v2, Lu1/c;

    .line 99
    .line 100
    if-eqz v6, :cond_6

    .line 101
    .line 102
    iget-object v2, p1, Lu1/p;->a:Llf/j;

    .line 103
    .line 104
    iget-object p1, p1, Lu1/p;->d:Ljf/h;

    .line 105
    .line 106
    iput-object p2, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 107
    .line 108
    iput v5, v0, Lu1/v;->f:I

    .line 109
    .line 110
    invoke-virtual {p0, v2, p1, v0}, Lu1/G;->i(Ltf/p;Ljf/h;Llf/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v1, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    move-object v7, p2

    .line 118
    move-object p2, p0

    .line 119
    move-object p0, v7

    .line 120
    goto :goto_7

    .line 121
    :goto_2
    move-object p0, p2

    .line 122
    goto :goto_6

    .line 123
    :catchall_1
    move-exception p1

    .line 124
    goto :goto_2

    .line 125
    :cond_6
    instance-of v6, v2, Lu1/l;

    .line 126
    .line 127
    if-eqz v6, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    instance-of v5, v2, Lu1/I;

    .line 131
    .line 132
    :goto_3
    if-eqz v5, :cond_a

    .line 133
    .line 134
    iget-object v5, p1, Lu1/p;->c:Lu1/H;

    .line 135
    .line 136
    if-ne v2, v5, :cond_9

    .line 137
    .line 138
    iput-object p1, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object p0, v0, Lu1/v;->b:Lu1/G;

    .line 141
    .line 142
    iput-object p2, v0, Lu1/v;->c:LEf/u;

    .line 143
    .line 144
    iput v4, v0, Lu1/v;->f:I

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lu1/G;->e(Llf/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-ne v2, v1, :cond_8

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    :goto_4
    iget-object v2, p1, Lu1/p;->a:Llf/j;

    .line 154
    .line 155
    iget-object p1, p1, Lu1/p;->d:Ljf/h;

    .line 156
    .line 157
    iput-object p2, v0, Lu1/v;->a:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    iput-object v4, v0, Lu1/v;->b:Lu1/G;

    .line 161
    .line 162
    iput-object v4, v0, Lu1/v;->c:LEf/u;

    .line 163
    .line 164
    iput v3, v0, Lu1/v;->f:I

    .line 165
    .line 166
    invoke-virtual {p0, v2, p1, v0}, Lu1/G;->i(Ltf/p;Ljf/h;Llf/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v1, :cond_5

    .line 171
    .line 172
    :goto_5
    return-object v1

    .line 173
    :cond_9
    check-cast v2, Lu1/l;

    .line 174
    .line 175
    iget-object p0, v2, Lu1/l;->a:Ljava/lang/Throwable;

    .line 176
    .line 177
    throw p0

    .line 178
    :cond_a
    instance-of p0, v2, Lu1/k;

    .line 179
    .line 180
    if-eqz p0, :cond_b

    .line 181
    .line 182
    check-cast v2, Lu1/k;

    .line 183
    .line 184
    iget-object p0, v2, Lu1/k;->a:Ljava/lang/Throwable;

    .line 185
    .line 186
    throw p0

    .line 187
    :cond_b
    new-instance p0, LE5/Q;

    .line 188
    .line 189
    const/16 p1, 0x9

    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-direct {p0, v0, p1}, LE5/Q;-><init>(BI)V

    .line 193
    .line 194
    .line 195
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 196
    :goto_6
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    :goto_7
    invoke-static {p2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    check-cast p0, LEf/u;

    .line 205
    .line 206
    if-nez p1, :cond_c

    .line 207
    .line 208
    invoke-virtual {p0, p2}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_c
    invoke-virtual {p0, p1}, LEf/u;->Y(Ljava/lang/Throwable;)Z

    .line 213
    .line 214
    .line 215
    :goto_8
    sget-object p0, Lef/C;->a:Lef/C;

    .line 216
    .line 217
    return-object p0
.end method


# virtual methods
.method public final a(Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, LEf/H;->b()LEf/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lu1/G;->g:LHf/x0;

    .line 6
    .line 7
    invoke-virtual {v1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lu1/H;

    .line 12
    .line 13
    new-instance v2, Lu1/p;

    .line 14
    .line 15
    invoke-interface {p2}, Ljf/c;->getContext()Ljf/h;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v2, p1, v0, v1, v3}, Lu1/p;-><init>(Ltf/p;LEf/u;Lu1/H;Ljf/h;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lu1/G;->i:LS3/n;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, LS3/n;->b(Lu1/q;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    return-object p1
.end method

.method public final c()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/G;->f:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d(Llf/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lu1/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu1/w;

    .line 7
    .line 8
    iget v1, v0, Lu1/w;->i:I

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
    iput v1, v0, Lu1/w;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu1/w;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu1/w;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/w;->i:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object v1, v0, Lu1/w;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LNf/a;

    .line 46
    .line 47
    iget-object v2, v0, Lu1/w;->c:Ljava/io/Serializable;

    .line 48
    .line 49
    check-cast v2, Lkotlin/jvm/internal/C;

    .line 50
    .line 51
    iget-object v3, v0, Lu1/w;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lkotlin/jvm/internal/G;

    .line 54
    .line 55
    iget-object v0, v0, Lu1/w;->a:Lu1/G;

    .line 56
    .line 57
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    iget-object v2, v0, Lu1/w;->f:Ljava/util/Iterator;

    .line 71
    .line 72
    check-cast v2, Ljava/util/Iterator;

    .line 73
    .line 74
    iget-object v7, v0, Lu1/w;->e:Lu1/y;

    .line 75
    .line 76
    iget-object v8, v0, Lu1/w;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Lkotlin/jvm/internal/C;

    .line 79
    .line 80
    iget-object v9, v0, Lu1/w;->c:Ljava/io/Serializable;

    .line 81
    .line 82
    check-cast v9, Lkotlin/jvm/internal/G;

    .line 83
    .line 84
    iget-object v10, v0, Lu1/w;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v10, LNf/a;

    .line 87
    .line 88
    iget-object v11, v0, Lu1/w;->a:Lu1/G;

    .line 89
    .line 90
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_3
    iget-object v2, v0, Lu1/w;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Lkotlin/jvm/internal/G;

    .line 98
    .line 99
    iget-object v7, v0, Lu1/w;->c:Ljava/io/Serializable;

    .line 100
    .line 101
    check-cast v7, Lkotlin/jvm/internal/G;

    .line 102
    .line 103
    iget-object v8, v0, Lu1/w;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, LNf/a;

    .line 106
    .line 107
    iget-object v9, v0, Lu1/w;->a:Lu1/G;

    .line 108
    .line 109
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lu1/G;->g:LHf/x0;

    .line 117
    .line 118
    invoke-virtual {p1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v7, Lu1/I;->a:Lu1/I;

    .line 123
    .line 124
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_6

    .line 129
    .line 130
    invoke-virtual {p1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    instance-of p1, p1, Lu1/l;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string v0, "Check failed."

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_6
    :goto_1
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    new-instance v2, Lkotlin/jvm/internal/G;

    .line 152
    .line 153
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object p0, v0, Lu1/w;->a:Lu1/G;

    .line 157
    .line 158
    iput-object v8, v0, Lu1/w;->b:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v2, v0, Lu1/w;->c:Ljava/io/Serializable;

    .line 161
    .line 162
    iput-object v2, v0, Lu1/w;->d:Ljava/lang/Object;

    .line 163
    .line 164
    iput v5, v0, Lu1/w;->i:I

    .line 165
    .line 166
    invoke-virtual {p0, v0}, Lu1/G;->h(Llf/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-ne p1, v1, :cond_7

    .line 171
    .line 172
    goto/16 :goto_5

    .line 173
    .line 174
    :cond_7
    move-object v9, p0

    .line 175
    move-object v7, v2

    .line 176
    :goto_2
    iput-object p1, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 177
    .line 178
    new-instance p1, Lkotlin/jvm/internal/C;

    .line 179
    .line 180
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    new-instance v2, Lu1/y;

    .line 184
    .line 185
    invoke-direct {v2, v8, p1, v7, v9}, Lu1/y;-><init>(LNf/a;Lkotlin/jvm/internal/C;Lkotlin/jvm/internal/G;Lu1/G;)V

    .line 186
    .line 187
    .line 188
    iget-object v10, v9, Lu1/G;->h:Ljava/util/List;

    .line 189
    .line 190
    if-nez v10, :cond_8

    .line 191
    .line 192
    move-object v2, p1

    .line 193
    move-object p1, v0

    .line 194
    move-object v0, v9

    .line 195
    goto :goto_4

    .line 196
    :cond_8
    check-cast v10, Ljava/lang/Iterable;

    .line 197
    .line 198
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    move-object v11, v9

    .line 203
    move-object v9, v7

    .line 204
    move-object v7, v2

    .line 205
    move-object v2, v10

    .line 206
    move-object v10, v8

    .line 207
    move-object v8, p1

    .line 208
    :cond_9
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eqz p1, :cond_a

    .line 213
    .line 214
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Ltf/p;

    .line 219
    .line 220
    iput-object v11, v0, Lu1/w;->a:Lu1/G;

    .line 221
    .line 222
    iput-object v10, v0, Lu1/w;->b:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object v9, v0, Lu1/w;->c:Ljava/io/Serializable;

    .line 225
    .line 226
    iput-object v8, v0, Lu1/w;->d:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object v7, v0, Lu1/w;->e:Lu1/y;

    .line 229
    .line 230
    move-object v12, v2

    .line 231
    check-cast v12, Ljava/util/Iterator;

    .line 232
    .line 233
    iput-object v12, v0, Lu1/w;->f:Ljava/util/Iterator;

    .line 234
    .line 235
    iput v4, v0, Lu1/w;->i:I

    .line 236
    .line 237
    invoke-interface {p1, v7, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-ne p1, v1, :cond_9

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    move-object p1, v0

    .line 245
    move-object v2, v8

    .line 246
    move-object v7, v9

    .line 247
    move-object v8, v10

    .line 248
    move-object v0, v11

    .line 249
    :goto_4
    iput-object v6, v0, Lu1/G;->h:Ljava/util/List;

    .line 250
    .line 251
    iput-object v0, p1, Lu1/w;->a:Lu1/G;

    .line 252
    .line 253
    iput-object v7, p1, Lu1/w;->b:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v2, p1, Lu1/w;->c:Ljava/io/Serializable;

    .line 256
    .line 257
    iput-object v8, p1, Lu1/w;->d:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v6, p1, Lu1/w;->e:Lu1/y;

    .line 260
    .line 261
    iput-object v6, p1, Lu1/w;->f:Ljava/util/Iterator;

    .line 262
    .line 263
    iput v3, p1, Lu1/w;->i:I

    .line 264
    .line 265
    invoke-interface {v8, p1}, LNf/a;->b(Ljf/c;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    if-ne p1, v1, :cond_b

    .line 270
    .line 271
    :goto_5
    return-object v1

    .line 272
    :cond_b
    move-object v3, v7

    .line 273
    move-object v1, v8

    .line 274
    :goto_6
    :try_start_0
    iput-boolean v5, v2, Lkotlin/jvm/internal/C;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    .line 276
    invoke-interface {v1, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    iget-object p1, v0, Lu1/G;->g:LHf/x0;

    .line 280
    .line 281
    new-instance v0, Lu1/c;

    .line 282
    .line 283
    iget-object v1, v3, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 284
    .line 285
    if-eqz v1, :cond_c

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    goto :goto_7

    .line 292
    :cond_c
    const/4 v2, 0x0

    .line 293
    :goto_7
    invoke-direct {v0, v1, v2}, Lu1/c;-><init>(Ljava/lang/Object;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v6, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    sget-object p1, Lef/C;->a:Lef/C;

    .line 303
    .line 304
    return-object p1

    .line 305
    :catchall_0
    move-exception p1

    .line 306
    invoke-interface {v1, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    throw p1
.end method

.method public final e(Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lu1/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu1/z;

    .line 7
    .line 8
    iget v1, v0, Lu1/z;->d:I

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
    iput v1, v0, Lu1/z;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu1/z;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu1/z;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/z;->d:I

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
    iget-object v0, v0, Lu1/z;->a:Lu1/G;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p0, v0, Lu1/z;->a:Lu1/G;

    .line 56
    .line 57
    iput v3, v0, Lu1/z;->d:I

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lu1/G;->d(Llf/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 67
    .line 68
    return-object p1

    .line 69
    :goto_2
    move-object v0, p0

    .line 70
    goto :goto_3

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    goto :goto_2

    .line 73
    :goto_3
    iget-object v0, v0, Lu1/G;->g:LHf/x0;

    .line 74
    .line 75
    new-instance v1, Lu1/l;

    .line 76
    .line 77
    invoke-direct {v1, p1}, Lu1/l;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-virtual {v0, v2, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final f(Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lu1/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu1/A;

    .line 7
    .line 8
    iget v1, v0, Lu1/A;->d:I

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
    iput v1, v0, Lu1/A;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/A;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu1/A;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu1/A;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/A;->d:I

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
    iget-object v0, v0, Lu1/A;->a:Lu1/G;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p0, v0, Lu1/A;->a:Lu1/G;

    .line 56
    .line 57
    iput v3, v0, Lu1/A;->d:I

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lu1/G;->d(Llf/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :goto_1
    move-object v0, p0

    .line 67
    goto :goto_2

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    :goto_2
    iget-object v0, v0, Lu1/G;->g:LHf/x0;

    .line 71
    .line 72
    new-instance v1, Lu1/l;

    .line 73
    .line 74
    invoke-direct {v1, p1}, Lu1/l;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-virtual {v0, p1, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 85
    .line 86
    return-object p1
.end method

.method public final g(Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lu1/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu1/B;

    .line 7
    .line 8
    iget v1, v0, Lu1/B;->e:I

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
    iput v1, v0, Lu1/B;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/B;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu1/B;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu1/B;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/B;->e:I

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
    iget-object v1, v0, Lu1/B;->b:Ljava/io/FileInputStream;

    .line 37
    .line 38
    iget-object v0, v0, Lu1/B;->a:Lu1/G;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 58
    .line 59
    invoke-virtual {p0}, Lu1/G;->c()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    .line 65
    .line 66
    :try_start_2
    iget-object v2, p0, Lu1/G;->b:Lu1/m;

    .line 67
    .line 68
    iput-object p0, v0, Lu1/B;->a:Lu1/G;

    .line 69
    .line 70
    iput-object p1, v0, Lu1/B;->b:Ljava/io/FileInputStream;

    .line 71
    .line 72
    iput v3, v0, Lu1/B;->e:I

    .line 73
    .line 74
    invoke-interface {v2, p1, v0}, Lu1/m;->readFrom(Ljava/io/InputStream;Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v1, p1

    .line 82
    move-object p1, v0

    .line 83
    move-object v0, p0

    .line 84
    :goto_1
    const/4 v2, 0x0

    .line 85
    :try_start_3
    invoke-static {v1, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :catch_0
    move-exception p1

    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object v1, p1

    .line 93
    move-object p1, v0

    .line 94
    move-object v0, p0

    .line 95
    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 96
    :catchall_2
    move-exception v2

    .line 97
    :try_start_5
    invoke-static {v1, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v2
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 101
    :catch_1
    move-exception p1

    .line 102
    move-object v0, p0

    .line 103
    :goto_3
    invoke-virtual {v0}, Lu1/G;->c()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    iget-object p1, v0, Lu1/G;->b:Lu1/m;

    .line 114
    .line 115
    invoke-interface {p1}, Lu1/m;->getDefaultValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_4
    throw p1
.end method

.method public final getData()LHf/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/G;->d:LHf/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lu1/C;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu1/C;

    .line 7
    .line 8
    iget v1, v0, Lu1/C;->e:I

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
    iput v1, v0, Lu1/C;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/C;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu1/C;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu1/C;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/C;->e:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Lu1/C;->b:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lu1/a;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_6

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    iget-object v2, v0, Lu1/C;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lu1/a;

    .line 65
    .line 66
    iget-object v4, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Lu1/G;

    .line 69
    .line 70
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    iget-object v2, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lu1/G;

    .line 77
    .line 78
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Lu1/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :catch_1
    move-exception p1

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_2
    iput-object p0, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iput v5, v0, Lu1/C;->e:I

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lu1/G;->g(Llf/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_2
    .catch Lu1/a; {:try_start_2 .. :try_end_2} :catch_2

    .line 95
    if-ne p1, v1, :cond_5

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    return-object p1

    .line 99
    :goto_1
    move-object v2, p0

    .line 100
    goto :goto_2

    .line 101
    :catch_2
    move-exception p1

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    iget-object v5, v2, Lu1/G;->c:Lu1/b;

    .line 104
    .line 105
    iput-object v2, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p1, v0, Lu1/C;->b:Ljava/lang/Object;

    .line 108
    .line 109
    iput v4, v0, Lu1/C;->e:I

    .line 110
    .line 111
    invoke-interface {v5, p1}, Lu1/b;->u(Lu1/a;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-ne v4, v1, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v6, v2

    .line 119
    move-object v2, p1

    .line 120
    move-object p1, v4

    .line 121
    move-object v4, v6

    .line 122
    :goto_3
    :try_start_3
    iput-object v2, v0, Lu1/C;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, v0, Lu1/C;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iput v3, v0, Lu1/C;->e:I

    .line 127
    .line 128
    invoke-virtual {v4, p1, v0}, Lu1/G;->j(Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 132
    if-ne v0, v1, :cond_7

    .line 133
    .line 134
    :goto_4
    return-object v1

    .line 135
    :cond_7
    return-object p1

    .line 136
    :goto_5
    move-object v0, v2

    .line 137
    goto :goto_6

    .line 138
    :catch_3
    move-exception p1

    .line 139
    goto :goto_5

    .line 140
    :goto_6
    invoke-static {v0, p1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v0
.end method

.method public final i(Ltf/p;Ljf/h;Llf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lu1/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lu1/D;

    .line 7
    .line 8
    iget v1, v0, Lu1/D;->f:I

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
    iput v1, v0, Lu1/D;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu1/D;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lu1/D;-><init>(Lu1/G;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lu1/D;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu1/D;->f:I

    .line 30
    .line 31
    const-string v3, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v6, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lu1/D;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p2, v0, Lu1/D;->a:Lu1/G;

    .line 46
    .line 47
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, Lu1/D;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p2, v0, Lu1/D;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lu1/c;

    .line 65
    .line 66
    iget-object v2, v0, Lu1/D;->a:Lu1/G;

    .line 67
    .line 68
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p3, p0, Lu1/G;->g:LHf/x0;

    .line 76
    .line 77
    invoke-virtual {p3}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, Lu1/c;

    .line 82
    .line 83
    iget-object v2, p3, Lu1/c;->a:Ljava/lang/Object;

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move v2, v4

    .line 93
    :goto_1
    iget v8, p3, Lu1/c;->b:I

    .line 94
    .line 95
    if-ne v2, v8, :cond_b

    .line 96
    .line 97
    new-instance v2, Lu1/E;

    .line 98
    .line 99
    iget-object v8, p3, Lu1/c;->a:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-direct {v2, p1, v8, v7}, Lu1/E;-><init>(Ltf/p;Ljava/lang/Object;Ljf/c;)V

    .line 102
    .line 103
    .line 104
    iput-object p0, v0, Lu1/D;->a:Lu1/G;

    .line 105
    .line 106
    iput-object p3, v0, Lu1/D;->b:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v8, v0, Lu1/D;->c:Ljava/lang/Object;

    .line 109
    .line 110
    iput v6, v0, Lu1/D;->f:I

    .line 111
    .line 112
    invoke-static {p2, v2, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v1, :cond_5

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    move-object v2, p0

    .line 120
    move-object p2, p3

    .line 121
    move-object p3, p1

    .line 122
    move-object p1, v8

    .line 123
    :goto_2
    iget-object v6, p2, Lu1/c;->a:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v6, v4

    .line 133
    :goto_3
    iget p2, p2, Lu1/c;->b:I

    .line 134
    .line 135
    if-ne v6, p2, :cond_a

    .line 136
    .line 137
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_7
    iput-object v2, v0, Lu1/D;->a:Lu1/G;

    .line 145
    .line 146
    iput-object p3, v0, Lu1/D;->b:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v7, v0, Lu1/D;->c:Ljava/lang/Object;

    .line 149
    .line 150
    iput v5, v0, Lu1/D;->f:I

    .line 151
    .line 152
    invoke-virtual {v2, p3, v0}, Lu1/G;->j(Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne p1, v1, :cond_8

    .line 157
    .line 158
    :goto_4
    return-object v1

    .line 159
    :cond_8
    move-object p1, p3

    .line 160
    move-object p2, v2

    .line 161
    :goto_5
    iget-object p2, p2, Lu1/G;->g:LHf/x0;

    .line 162
    .line 163
    new-instance p3, Lu1/c;

    .line 164
    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    :cond_9
    invoke-direct {p3, p1, v4}, Lu1/c;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v7, p3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1
.end method

.method public final j(Ljava/lang/Object;Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "Unable to rename "

    .line 2
    .line 3
    instance-of v1, p2, Lu1/F;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lu1/F;

    .line 9
    .line 10
    iget v2, v1, Lu1/F;->g:I

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
    iput v2, v1, Lu1/F;->g:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lu1/F;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lu1/F;-><init>(Lu1/G;Llf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lu1/F;->e:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v3, v1, Lu1/F;->g:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget-object p1, v1, Lu1/F;->d:Ljava/io/FileOutputStream;

    .line 39
    .line 40
    iget-object v2, v1, Lu1/F;->c:Ljava/io/FileOutputStream;

    .line 41
    .line 42
    iget-object v3, v1, Lu1/F;->b:Ljava/io/File;

    .line 43
    .line 44
    iget-object v1, v1, Lu1/F;->a:Lu1/G;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lu1/G;->c()Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    :goto_1
    new-instance v3, Ljava/io/File;

    .line 89
    .line 90
    invoke-virtual {p0}, Lu1/G;->c()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget-object v5, p0, Lu1/G;->e:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    .line 108
    .line 109
    invoke-direct {p2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    .line 111
    .line 112
    :try_start_2
    iget-object v5, p0, Lu1/G;->b:Lu1/m;

    .line 113
    .line 114
    new-instance v6, Lod/Y0;

    .line 115
    .line 116
    invoke-direct {v6, p2}, Lod/Y0;-><init>(Ljava/io/FileOutputStream;)V

    .line 117
    .line 118
    .line 119
    iput-object p0, v1, Lu1/F;->a:Lu1/G;

    .line 120
    .line 121
    iput-object v3, v1, Lu1/F;->b:Ljava/io/File;

    .line 122
    .line 123
    iput-object p2, v1, Lu1/F;->c:Ljava/io/FileOutputStream;

    .line 124
    .line 125
    iput-object p2, v1, Lu1/F;->d:Ljava/io/FileOutputStream;

    .line 126
    .line 127
    iput v4, v1, Lu1/F;->g:I

    .line 128
    .line 129
    invoke-interface {v5, p1, v6, v1}, Lu1/m;->writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Ljf/c;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    if-ne p1, v2, :cond_4

    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_4
    move-object v1, p0

    .line 137
    move-object p1, p2

    .line 138
    move-object v2, p1

    .line 139
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    :try_start_4
    invoke-static {v2, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Lu1/G;->c()Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v3, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 155
    .line 156
    .line 157
    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    sget-object p1, Lef/C;->a:Lef/C;

    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_5
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    .line 164
    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 174
    .line 175
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 186
    :catch_0
    move-exception p1

    .line 187
    goto :goto_4

    .line 188
    :catchall_1
    move-exception p1

    .line 189
    move-object v2, p2

    .line 190
    :goto_3
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 191
    :catchall_2
    move-exception p2

    .line 192
    :try_start_7
    invoke-static {v2, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    throw p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 196
    :goto_4
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-eqz p2, :cond_6

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 203
    .line 204
    .line 205
    :cond_6
    throw p1

    .line 206
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 207
    .line 208
    const-string v0, "Unable to create parent directories of "

    .line 209
    .line 210
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1
.end method
