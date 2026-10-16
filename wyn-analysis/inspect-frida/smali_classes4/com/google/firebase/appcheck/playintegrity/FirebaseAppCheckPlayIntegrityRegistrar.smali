.class public Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;
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
    const-class v5, Ly8/b;

    .line 15
    .line 16
    invoke-direct {v3, v5, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    const-class v4, LG8/d;

    .line 20
    .line 21
    invoke-static {v4}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "fire-app-check-play-integrity"

    .line 26
    .line 27
    iput-object v5, v4, LL8/a;->a:Ljava/lang/Object;

    .line 28
    .line 29
    const-class v6, Ls8/g;

    .line 30
    .line 31
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v4, v6}, LL8/a;->c(LL8/l;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, LL8/l;

    .line 39
    .line 40
    invoke-direct {v6, v2, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v6}, LL8/a;->c(LL8/l;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, LL8/l;

    .line 47
    .line 48
    invoke-direct {v6, v3, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v6}, LL8/a;->c(LL8/l;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, LA5/h;

    .line 55
    .line 56
    const/4 v7, 0x4

    .line 57
    invoke-direct {v6, v7, v2, v3}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v4, LL8/a;->g:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "18.0.0"

    .line 67
    .line 68
    invoke-static {v5, v3}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/4 v4, 0x2

    .line 73
    new-array v4, v4, [LL8/b;

    .line 74
    .line 75
    aput-object v2, v4, v0

    .line 76
    .line 77
    aput-object v3, v4, v1

    .line 78
    .line 79
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method
