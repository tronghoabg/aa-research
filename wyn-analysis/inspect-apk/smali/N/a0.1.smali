.class public final LN/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/Q;


# instance fields
.field public final a:LN/Q;

.field public final b:LA7/b0;


# direct methods
.method public constructor <init>(LN/Q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/a0;->a:LN/Q;

    .line 5
    .line 6
    new-instance p1, LA7/b0;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v1, v0}, LA7/b0;-><init>(BI)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LN/a0;->b:LA7/b0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LN/a0;->b:LA7/b0;

    .line 2
    .line 3
    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    iput-boolean v2, v0, LA7/b0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v1

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    monitor-exit v1

    .line 13
    throw v0
.end method

.method public final d(Ltf/l;Llf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LN/Z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN/Z;

    .line 7
    .line 8
    iget v1, v0, LN/Z;->e:I

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
    iput v1, v0, LN/Z;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN/Z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LN/Z;-><init>(LN/a0;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN/Z;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LN/Z;->e:I

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
    return-object p2

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object p1, v0, LN/Z;->b:Ltf/l;

    .line 52
    .line 53
    iget-object v2, v0, LN/Z;->a:LN/a0;

    .line 54
    .line 55
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, LN/a0;->b:LA7/b0;

    .line 63
    .line 64
    iput-object p0, v0, LN/Z;->a:LN/a0;

    .line 65
    .line 66
    iput-object p1, v0, LN/Z;->b:Ltf/l;

    .line 67
    .line 68
    iput v4, v0, LN/Z;->e:I

    .line 69
    .line 70
    invoke-virtual {p2}, LA7/b0;->q()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    sget-object p2, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    new-instance v2, LEf/n;

    .line 80
    .line 81
    invoke-static {v0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-direct {v2, v4, v5}, LEf/n;-><init>(ILjf/c;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, LEf/n;->t()V

    .line 89
    .line 90
    .line 91
    iget-object v4, p2, LA7/b0;->c:Ljava/lang/Object;

    .line 92
    .line 93
    monitor-enter v4

    .line 94
    :try_start_0
    iget-object v5, p2, LA7/b0;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    monitor-exit v4

    .line 102
    new-instance v4, LA/W;

    .line 103
    .line 104
    const/16 v5, 0xd

    .line 105
    .line 106
    invoke-direct {v4, v5, p2, v2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4}, LEf/n;->v(Ltf/l;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, LEf/n;->s()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v1, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    sget-object p2, Lef/C;->a:Lef/C;

    .line 120
    .line 121
    :goto_1
    if-ne p2, v1, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    move-object v2, p0

    .line 125
    :goto_2
    iget-object p2, v2, LN/a0;->a:LN/Q;

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    iput-object v2, v0, LN/Z;->a:LN/a0;

    .line 129
    .line 130
    iput-object v2, v0, LN/Z;->b:Ltf/l;

    .line 131
    .line 132
    iput v3, v0, LN/Z;->e:I

    .line 133
    .line 134
    invoke-interface {p2, p1, v0}, LN/Q;->d(Ltf/l;Llf/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v1, :cond_7

    .line 139
    .line 140
    :goto_3
    return-object v1

    .line 141
    :cond_7
    return-object p1

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    monitor-exit v4

    .line 144
    throw p1
.end method

.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
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

.method public final get(Ljf/g;)Ljf/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->C(Ljf/f;Ljf/g;)Ljf/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Ljf/g;
    .locals 1

    .line 1
    sget-object v0, LN/P;->b:LN/P;

    return-object v0
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->N(Ljf/f;Ljf/g;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
