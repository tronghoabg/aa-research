.class public final LSe/u;
.super LHe/i;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHe/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LSe/u;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LSe/u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LSe/u;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LSe/u;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(LHe/j;)V
    .locals 3

    .line 1
    iget v0, p0, LSe/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LMe/b;->a:LMe/b;

    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, LSe/u;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 16
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p1, v0}, LHe/j;->a(LJe/b;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, LHe/j;->onComplete()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, LTe/m;

    .line 30
    .line 31
    invoke-direct {v0, p1, v1}, LTe/m;-><init>(LHe/j;Ljava/util/Iterator;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, LHe/j;->a(LJe/b;)V

    .line 35
    .line 36
    .line 37
    iget-boolean p1, v0, LTe/m;->d:Z

    .line 38
    .line 39
    if-nez p1, :cond_4

    .line 40
    .line 41
    :cond_1
    iget-boolean p1, v0, LTe/m;->c:Z

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :try_start_2
    iget-object p1, v0, LTe/m;->b:Ljava/util/Iterator;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v1, "The iterator returned a null value"

    .line 53
    .line 54
    invoke-static {p1, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, LTe/m;->a:LHe/j;

    .line 58
    .line 59
    invoke-interface {v1, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p1, v0, LTe/m;->c:Z

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    :try_start_3
    iget-object p1, v0, LTe/m;->b:Ljava/util/Iterator;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    iget-boolean p1, v0, LTe/m;->c:Z

    .line 76
    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    iget-object p1, v0, LTe/m;->a:LHe/j;

    .line 80
    .line 81
    invoke-interface {p1}, LHe/j;->onComplete()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, LTe/m;->a:LHe/j;

    .line 90
    .line 91
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, LTe/m;->a:LHe/j;

    .line 100
    .line 101
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_2
    move-exception v1

    .line 106
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v0}, LHe/j;->a(LJe/b;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_3
    move-exception v1

    .line 117
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1, v0}, LHe/j;->a(LJe/b;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_0
    return-void

    .line 127
    :pswitch_0
    new-instance v0, LSe/t;

    .line 128
    .line 129
    invoke-direct {v0, p1}, LSe/t;-><init>(LHe/j;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, LSe/u;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, LHe/g;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
