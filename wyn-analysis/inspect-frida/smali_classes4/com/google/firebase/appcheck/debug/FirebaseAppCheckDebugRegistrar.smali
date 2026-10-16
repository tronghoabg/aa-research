.class public Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;
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
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    new-instance v2, LL8/t;

    .line 4
    .line 5
    const-class v3, Ly8/c;

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
    const-class v5, Ly8/a;

    .line 15
    .line 16
    invoke-direct {v3, v5, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, LL8/t;

    .line 20
    .line 21
    const-class v6, Ly8/b;

    .line 22
    .line 23
    invoke-direct {v5, v6, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    const-class v4, LB8/d;

    .line 27
    .line 28
    invoke-static {v4}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v6, "fire-app-check-debug"

    .line 33
    .line 34
    iput-object v6, v4, LL8/a;->a:Ljava/lang/Object;

    .line 35
    .line 36
    const-class v7, Ls8/g;

    .line 37
    .line 38
    invoke-static {v7}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 43
    .line 44
    .line 45
    const-class v7, LA8/b;

    .line 46
    .line 47
    invoke-static {v7}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, LL8/l;

    .line 55
    .line 56
    invoke-direct {v7, v2, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, LL8/l;

    .line 63
    .line 64
    invoke-direct {v7, v3, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 68
    .line 69
    .line 70
    new-instance v7, LL8/l;

    .line 71
    .line 72
    invoke-direct {v7, v5, v0, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 76
    .line 77
    .line 78
    new-instance v7, LA8/a;

    .line 79
    .line 80
    invoke-direct {v7, v2, v3, v5, v1}, LA8/a;-><init>(LL8/t;LL8/t;LL8/t;I)V

    .line 81
    .line 82
    .line 83
    iput-object v7, v4, LL8/a;->g:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v3, "18.0.0"

    .line 90
    .line 91
    invoke-static {v6, v3}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const/4 v4, 0x2

    .line 96
    new-array v4, v4, [LL8/b;

    .line 97
    .line 98
    aput-object v2, v4, v1

    .line 99
    .line 100
    aput-object v3, v4, v0

    .line 101
    .line 102
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0
.end method
