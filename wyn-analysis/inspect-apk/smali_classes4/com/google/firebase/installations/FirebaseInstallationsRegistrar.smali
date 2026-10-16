.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


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

.method public static synthetic a(LC6/l;)LP9/d;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(LL8/c;)LP9/d;

    move-result-object p0

    return-object p0
.end method

.method private static lambda$getComponents$0(LL8/c;)LP9/d;
    .locals 7

    .line 1
    new-instance v0, LP9/c;

    .line 2
    .line 3
    const-class v1, Ls8/g;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls8/g;

    .line 10
    .line 11
    const-class v2, Lx9/e;

    .line 12
    .line 13
    invoke-interface {p0, v2}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, LL8/t;

    .line 18
    .line 19
    const-class v4, Ly8/a;

    .line 20
    .line 21
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v3}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    new-instance v4, LL8/t;

    .line 33
    .line 34
    const-class v5, Ly8/b;

    .line 35
    .line 36
    const-class v6, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-direct {v4, v5, v6}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v4}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v4, LM8/j;

    .line 48
    .line 49
    invoke-direct {v4, p0}, LM8/j;-><init>(Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3, v4}, LP9/c;-><init>(Ls8/g;LO9/b;Ljava/util/concurrent/ExecutorService;LM8/j;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
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
    const-class v2, LP9/d;

    .line 4
    .line 5
    invoke-static {v2}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fire-installations"

    .line 10
    .line 11
    iput-object v3, v2, LL8/a;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const-class v4, Ls8/g;

    .line 14
    .line 15
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 20
    .line 21
    .line 22
    const-class v4, Lx9/e;

    .line 23
    .line 24
    invoke-static {v4}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, LL8/t;

    .line 32
    .line 33
    const-class v5, Ly8/a;

    .line 34
    .line 35
    const-class v6, Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    invoke-direct {v4, v5, v6}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, LL8/l;

    .line 41
    .line 42
    invoke-direct {v5, v4, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v5}, LL8/a;->c(LL8/l;)V

    .line 46
    .line 47
    .line 48
    new-instance v4, LL8/t;

    .line 49
    .line 50
    const-class v5, Ly8/b;

    .line 51
    .line 52
    const-class v6, Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    invoke-direct {v4, v5, v6}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    new-instance v5, LL8/l;

    .line 58
    .line 59
    invoke-direct {v5, v4, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v5}, LL8/a;->c(LL8/l;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, LJ9/x;

    .line 66
    .line 67
    const/16 v5, 0x14

    .line 68
    .line 69
    invoke-direct {v4, v5}, LJ9/x;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v4, v2, LL8/a;->g:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v2}, LL8/a;->d()LL8/b;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-instance v4, Lx9/d;

    .line 79
    .line 80
    invoke-direct {v4, v1}, Lx9/d;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const-class v5, Lx9/d;

    .line 84
    .line 85
    invoke-static {v5}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iput v0, v5, LL8/a;->c:I

    .line 90
    .line 91
    new-instance v6, LF5/c;

    .line 92
    .line 93
    invoke-direct {v6, v4}, LF5/c;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v6, v5, LL8/a;->g:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v5}, LL8/a;->d()LL8/b;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const-string v5, "18.0.0"

    .line 103
    .line 104
    invoke-static {v3, v5}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const/4 v5, 0x3

    .line 109
    new-array v5, v5, [LL8/b;

    .line 110
    .line 111
    aput-object v2, v5, v1

    .line 112
    .line 113
    aput-object v4, v5, v0

    .line 114
    .line 115
    const/4 v0, 0x2

    .line 116
    aput-object v3, v5, v0

    .line 117
    .line 118
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0
.end method
