.class public final LRe/m;
.super LHe/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LRe/m;->b:I

    iput-object p1, p0, LRe/m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(LHe/f;Ljava/util/Iterator;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LYe/d;->a(LHe/f;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, LOe/a;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, LRe/E;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    check-cast v1, LOe/a;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v0, v1, p1, v2}, LRe/E;-><init>(LHe/f;Ljava/util/Iterator;I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v0}, LHe/f;->e(Lug/b;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    new-instance v0, LRe/E;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, p1, v1}, LRe/E;-><init>(LHe/f;Ljava/util/Iterator;I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v0}, LHe/f;->e(Lug/b;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p0}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 4

    .line 1
    iget v0, p0, LRe/m;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/s;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LYe/c;-><init>(LHe/f;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LRe/m;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LHe/g;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, LRe/F;

    .line 20
    .line 21
    invoke-direct {v0, p1}, LRe/F;-><init>(LHe/f;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LRe/m;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lcf/b;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    :try_start_0
    iget-object v0, p0, LRe/m;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/google/protobuf/Internal$ProtobufList;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-static {p1, v0}, LRe/m;->f(LHe/f;Ljava/util/Iterator;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_2
    instance-of v0, p1, LOe/a;

    .line 53
    .line 54
    iget-object v1, p0, LRe/m;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, [Ljava/lang/Object;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    new-instance v0, LRe/D;

    .line 61
    .line 62
    move-object v2, p1

    .line 63
    check-cast v2, LOe/a;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v0, v2, v1, v3}, LRe/D;-><init>(LHe/f;[Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0}, LHe/f;->e(Lug/b;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    new-instance v0, LRe/D;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-direct {v0, p1, v1, v2}, LRe/D;-><init>(LHe/f;[Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0}, LHe/f;->e(Lug/b;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    return-void

    .line 83
    :pswitch_3
    const/4 v0, 0x3

    .line 84
    invoke-static {v0}, LA/f;->f(I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    if-eq v1, v2, :cond_3

    .line 92
    .line 93
    if-eq v1, v0, :cond_2

    .line 94
    .line 95
    const/4 v0, 0x4

    .line 96
    if-eq v1, v0, :cond_1

    .line 97
    .line 98
    new-instance v0, LRe/j;

    .line 99
    .line 100
    sget v1, LHe/c;->a:I

    .line 101
    .line 102
    invoke-direct {v0, p1, v1}, LRe/j;-><init>(LHe/f;I)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    new-instance v0, LRe/j;

    .line 107
    .line 108
    invoke-direct {v0, p1}, LRe/j;-><init>(LHe/f;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    new-instance v0, LRe/k;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-direct {v0, p1, v1}, LRe/k;-><init>(LHe/f;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    new-instance v0, LRe/k;

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-direct {v0, p1, v1}, LRe/k;-><init>(LHe/f;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    new-instance v0, LRe/l;

    .line 127
    .line 128
    invoke-direct {v0, p1}, LRe/i;-><init>(LHe/f;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-interface {p1, v0}, LHe/f;->e(Lug/b;)V

    .line 132
    .line 133
    .line 134
    :try_start_1
    iget-object p1, p0, LRe/m;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, LHe/e;

    .line 137
    .line 138
    invoke-interface {p1, v0}, LHe/e;->g(LRe/i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :catchall_1
    move-exception p1

    .line 143
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p1}, LRe/i;->d(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
