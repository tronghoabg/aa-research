.class public Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    new-instance v2, LL8/t;

    .line 4
    .line 5
    const-class v3, Ly8/d;

    .line 6
    .line 7
    const-class v4, Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    invoke-direct {v2, v3, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, LL8/t;

    .line 13
    .line 14
    const-class v5, Ly8/c;

    .line 15
    .line 16
    invoke-direct {v3, v5, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, LL8/t;

    .line 20
    .line 21
    const-class v6, Ly8/a;

    .line 22
    .line 23
    invoke-direct {v5, v6, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, LL8/t;

    .line 27
    .line 28
    const-class v6, Ly8/b;

    .line 29
    .line 30
    const-class v7, Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    invoke-direct {v4, v6, v7}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    new-array v6, v0, [Ljava/lang/Class;

    .line 36
    .line 37
    const-class v7, LE8/a;

    .line 38
    .line 39
    aput-object v7, v6, v1

    .line 40
    .line 41
    new-instance v7, LL8/a;

    .line 42
    .line 43
    const-class v8, LC8/f;

    .line 44
    .line 45
    invoke-direct {v7, v8, v6}, LL8/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    const-string v6, "fire-app-check"

    .line 49
    .line 50
    iput-object v6, v7, LL8/a;->a:Ljava/lang/Object;

    .line 51
    .line 52
    const-class v8, Ls8/g;

    .line 53
    .line 54
    invoke-static {v8}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 59
    .line 60
    .line 61
    new-instance v8, LL8/l;

    .line 62
    .line 63
    invoke-direct {v8, v2, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 67
    .line 68
    .line 69
    new-instance v8, LL8/l;

    .line 70
    .line 71
    invoke-direct {v8, v3, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 75
    .line 76
    .line 77
    new-instance v8, LL8/l;

    .line 78
    .line 79
    invoke-direct {v8, v5, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 83
    .line 84
    .line 85
    new-instance v8, LL8/l;

    .line 86
    .line 87
    invoke-direct {v8, v4, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 91
    .line 92
    .line 93
    const-class v8, Lx9/e;

    .line 94
    .line 95
    invoke-static {v8}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v7, v8}, LL8/a;->c(LL8/l;)V

    .line 100
    .line 101
    .line 102
    new-instance v8, Lcom/applovin/impl/Y;

    .line 103
    .line 104
    invoke-direct {v8, v2, v3, v5, v4}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-object v8, v7, LL8/a;->g:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {v7, v0}, LL8/a;->f(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7}, LL8/a;->d()LL8/b;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    new-instance v3, Lx9/d;

    .line 117
    .line 118
    invoke-direct {v3, v1}, Lx9/d;-><init>(I)V

    .line 119
    .line 120
    .line 121
    const-class v4, Lx9/d;

    .line 122
    .line 123
    invoke-static {v4}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iput v0, v4, LL8/a;->c:I

    .line 128
    .line 129
    new-instance v5, LF5/c;

    .line 130
    .line 131
    invoke-direct {v5, v3}, LF5/c;-><init>(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iput-object v5, v4, LL8/a;->g:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const-string v4, "18.0.0"

    .line 141
    .line 142
    invoke-static {v6, v4}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    const/4 v5, 0x3

    .line 147
    new-array v5, v5, [LL8/b;

    .line 148
    .line 149
    aput-object v2, v5, v1

    .line 150
    .line 151
    aput-object v3, v5, v0

    .line 152
    .line 153
    const/4 v0, 0x2

    .line 154
    aput-object v4, v5, v0

    .line 155
    .line 156
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    return-object v0
.end method
