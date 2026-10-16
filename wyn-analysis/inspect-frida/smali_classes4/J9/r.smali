.class public final LJ9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ldf/a;


# direct methods
.method public synthetic constructor <init>(Ldf/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/r;->a:I

    iput-object p1, p0, LJ9/r;->b:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ldf/a;I)V
    .locals 0

    .line 2
    iput p3, p0, LJ9/r;->a:I

    iput-object p2, p0, LJ9/r;->b:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LJ9/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Lmd/y;->c(Ljava/lang/String;)Lpd/h;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lmd/v;->a()Lmd/S;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 27
    .line 28
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/app/Application;

    .line 33
    .line 34
    new-instance v1, LJ9/p;

    .line 35
    .line 36
    invoke-direct {v1}, LJ9/p;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v2, v1, LJ9/p;->e:Lcf/b;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v3, LRe/m;

    .line 45
    .line 46
    const/4 v4, 0x3

    .line 47
    invoke-direct {v3, v2, v4}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    sget v2, LHe/c;->a:I

    .line 51
    .line 52
    const-string v4, "bufferSize"

    .line 53
    .line 54
    invoke-static {v2, v4}, LNe/b;->b(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, LRe/M;

    .line 58
    .line 59
    invoke-direct {v4, v3, v2}, LRe/M;-><init>(LRe/m;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, LHe/c;->c()LRe/Q;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, LRe/Q;->f()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_1
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 74
    .line 75
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 80
    .line 81
    new-instance v1, LJ9/j;

    .line 82
    .line 83
    invoke-direct {v1, v0}, LJ9/j;-><init>(Ljava/util/concurrent/Executor;)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_2
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 88
    .line 89
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lw8/d;

    .line 94
    .line 95
    new-instance v1, LJ9/b;

    .line 96
    .line 97
    invoke-direct {v1, v0}, LJ9/b;-><init>(Lw8/d;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_3
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 102
    .line 103
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, LJ9/b;

    .line 108
    .line 109
    iget-object v0, v0, LJ9/b;->b:LRe/Q;

    .line 110
    .line 111
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_4
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 116
    .line 117
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Landroid/app/Application;

    .line 122
    .line 123
    new-instance v1, LJ9/J;

    .line 124
    .line 125
    invoke-direct {v1, v0}, LJ9/J;-><init>(Landroid/app/Application;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_5
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 130
    .line 131
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, LJ9/I;

    .line 136
    .line 137
    new-instance v1, LJ9/u;

    .line 138
    .line 139
    invoke-direct {v1, v0}, LJ9/u;-><init>(LJ9/I;)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :pswitch_6
    iget-object v0, p0, LJ9/r;->b:Ldf/a;

    .line 144
    .line 145
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lta/p;

    .line 150
    .line 151
    new-instance v1, LJ9/q;

    .line 152
    .line 153
    invoke-direct {v1, v0}, LJ9/q;-><init>(Lta/p;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
