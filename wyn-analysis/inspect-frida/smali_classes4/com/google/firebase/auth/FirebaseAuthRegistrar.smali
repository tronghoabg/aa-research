.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static lambda$getComponents$0(LL8/t;LL8/t;LL8/t;LL8/t;LL8/t;LL8/c;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 9

    .line 1
    const-class v0, Ls8/g;

    .line 2
    .line 3
    invoke-interface {p5, v0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Ls8/g;

    .line 9
    .line 10
    const-class v0, LE8/a;

    .line 11
    .line 12
    invoke-interface {p5, v0}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-class v0, Lx9/e;

    .line 17
    .line 18
    invoke-interface {p5, v0}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    new-instance v1, LK8/d;

    .line 23
    .line 24
    invoke-interface {p5, p0}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    invoke-interface {p5, p1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    move-object v5, p0

    .line 35
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    invoke-interface {p5, p2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move-object v6, p0

    .line 42
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    invoke-interface {p5, p3}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object v7, p0

    .line 49
    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    invoke-interface {p5, p4}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    move-object v8, p0

    .line 56
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v8}, Lcom/google/firebase/auth/FirebaseAuth;-><init>(Ls8/g;LO9/b;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 10
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LL8/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    new-instance v2, LL8/t;

    .line 4
    .line 5
    const-class v3, Ly8/a;

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
    const-class v5, Ly8/b;

    .line 15
    .line 16
    invoke-direct {v3, v5, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, LL8/t;

    .line 20
    .line 21
    const-class v6, Ly8/c;

    .line 22
    .line 23
    invoke-direct {v5, v6, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    new-instance v7, LL8/t;

    .line 27
    .line 28
    const-class v8, Ljava/util/concurrent/ScheduledExecutorService;

    .line 29
    .line 30
    invoke-direct {v7, v6, v8}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, LL8/t;

    .line 34
    .line 35
    const-class v8, Ly8/d;

    .line 36
    .line 37
    invoke-direct {v6, v8, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    new-array v4, v0, [Ljava/lang/Class;

    .line 41
    .line 42
    const-class v8, LK8/a;

    .line 43
    .line 44
    aput-object v8, v4, v1

    .line 45
    .line 46
    new-instance v8, LL8/a;

    .line 47
    .line 48
    const-class v9, Lcom/google/firebase/auth/FirebaseAuth;

    .line 49
    .line 50
    invoke-direct {v8, v9, v4}, LL8/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    const-class v4, Ls8/g;

    .line 54
    .line 55
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, LL8/l;

    .line 63
    .line 64
    const-class v9, Lx9/e;

    .line 65
    .line 66
    invoke-direct {v4, v0, v0, v9}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 70
    .line 71
    .line 72
    new-instance v4, LL8/l;

    .line 73
    .line 74
    invoke-direct {v4, v2, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 78
    .line 79
    .line 80
    new-instance v4, LL8/l;

    .line 81
    .line 82
    invoke-direct {v4, v3, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 86
    .line 87
    .line 88
    new-instance v4, LL8/l;

    .line 89
    .line 90
    invoke-direct {v4, v5, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 94
    .line 95
    .line 96
    new-instance v4, LL8/l;

    .line 97
    .line 98
    invoke-direct {v4, v7, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 102
    .line 103
    .line 104
    new-instance v4, LL8/l;

    .line 105
    .line 106
    invoke-direct {v4, v6, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 110
    .line 111
    .line 112
    const-class v4, LE8/a;

    .line 113
    .line 114
    invoke-static {v4}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v8, v4}, LL8/a;->c(LL8/l;)V

    .line 119
    .line 120
    .line 121
    new-instance v4, LC8/i;

    .line 122
    .line 123
    invoke-direct {v4, v0, v1}, LC8/i;-><init>(IZ)V

    .line 124
    .line 125
    .line 126
    iput-object v2, v4, LC8/i;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v3, v4, LC8/i;->c:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v5, v4, LC8/i;->d:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v7, v4, LC8/i;->e:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v6, v4, LC8/i;->f:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v4, v8, LL8/a;->g:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-virtual {v8}, LL8/a;->d()LL8/b;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    new-instance v3, Lx9/d;

    .line 143
    .line 144
    invoke-direct {v3, v1}, Lx9/d;-><init>(I)V

    .line 145
    .line 146
    .line 147
    const-class v4, Lx9/d;

    .line 148
    .line 149
    invoke-static {v4}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    iput v0, v4, LL8/a;->c:I

    .line 154
    .line 155
    new-instance v5, LF5/c;

    .line 156
    .line 157
    invoke-direct {v5, v3}, LF5/c;-><init>(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-object v5, v4, LL8/a;->g:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v4, "fire-auth"

    .line 167
    .line 168
    const-string v5, "23.1.0"

    .line 169
    .line 170
    invoke-static {v4, v5}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    const/4 v5, 0x3

    .line 175
    new-array v5, v5, [LL8/b;

    .line 176
    .line 177
    aput-object v2, v5, v1

    .line 178
    .line 179
    aput-object v3, v5, v0

    .line 180
    .line 181
    const/4 v0, 0x2

    .line 182
    aput-object v4, v5, v0

    .line 183
    .line 184
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0
.end method
