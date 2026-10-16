.class public Lcom/google/firebase/appcheck/safetynet/FirebaseAppCheckSafetyNetRegistrar;
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
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

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
    const-class v4, LI8/b;

    .line 27
    .line 28
    invoke-static {v4}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v6, "fire-app-check-safety-net"

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
    new-instance v7, LL8/l;

    .line 46
    .line 47
    invoke-direct {v7, v2, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 51
    .line 52
    .line 53
    new-instance v7, LL8/l;

    .line 54
    .line 55
    invoke-direct {v7, v3, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, LL8/l;

    .line 62
    .line 63
    invoke-direct {v7, v5, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v7}, LL8/a;->c(LL8/l;)V

    .line 67
    .line 68
    .line 69
    new-instance v7, LA8/a;

    .line 70
    .line 71
    invoke-direct {v7, v2, v3, v5, v1}, LA8/a;-><init>(LL8/t;LL8/t;LL8/t;I)V

    .line 72
    .line 73
    .line 74
    iput-object v7, v4, LL8/a;->g:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const-string v3, "16.1.2"

    .line 81
    .line 82
    invoke-static {v6, v3}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v4, 0x2

    .line 87
    new-array v4, v4, [LL8/b;

    .line 88
    .line 89
    aput-object v2, v4, v0

    .line 90
    .line 91
    aput-object v3, v4, v1

    .line 92
    .line 93
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method
