.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


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

.method public static synthetic a(LL8/t;LC6/l;)LZ9/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(LL8/t;LL8/c;)LZ9/k;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LL8/t;LL8/c;)LZ9/k;
    .locals 7

    .line 1
    new-instance v0, LZ9/k;

    .line 2
    .line 3
    const-class v1, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p1, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p1, p0}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    move-object v2, p0

    .line 16
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    const-class p0, Ls8/g;

    .line 19
    .line 20
    invoke-interface {p1, p0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v3, p0

    .line 25
    check-cast v3, Ls8/g;

    .line 26
    .line 27
    const-class p0, LP9/d;

    .line 28
    .line 29
    invoke-interface {p1, p0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object v4, p0

    .line 34
    check-cast v4, LP9/d;

    .line 35
    .line 36
    const-class p0, Lu8/a;

    .line 37
    .line 38
    invoke-interface {p1, p0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lu8/a;

    .line 43
    .line 44
    const-string v5, "frc"

    .line 45
    .line 46
    invoke-virtual {p0, v5}, Lu8/a;->a(Ljava/lang/String;)Lt8/c;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-class p0, Lw8/d;

    .line 51
    .line 52
    invoke-interface {p1, p0}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-direct/range {v0 .. v6}, LZ9/k;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls8/g;LP9/d;Lt8/c;LO9/b;)V

    .line 57
    .line 58
    .line 59
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
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    new-instance v3, LL8/t;

    .line 5
    .line 6
    const-class v4, Ly8/b;

    .line 7
    .line 8
    const-class v5, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    invoke-direct {v3, v4, v5}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    new-array v4, v2, [Ljava/lang/Class;

    .line 14
    .line 15
    const-class v5, Lca/a;

    .line 16
    .line 17
    aput-object v5, v4, v1

    .line 18
    .line 19
    new-instance v5, LL8/a;

    .line 20
    .line 21
    const-class v6, LZ9/k;

    .line 22
    .line 23
    invoke-direct {v5, v6, v4}, LL8/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    const-string v4, "fire-rc"

    .line 27
    .line 28
    iput-object v4, v5, LL8/a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    const-class v6, Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 37
    .line 38
    .line 39
    new-instance v6, LL8/l;

    .line 40
    .line 41
    invoke-direct {v6, v3, v2, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 45
    .line 46
    .line 47
    const-class v6, Ls8/g;

    .line 48
    .line 49
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 54
    .line 55
    .line 56
    const-class v6, LP9/d;

    .line 57
    .line 58
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 63
    .line 64
    .line 65
    const-class v6, Lu8/a;

    .line 66
    .line 67
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 72
    .line 73
    .line 74
    const-class v6, Lw8/d;

    .line 75
    .line 76
    invoke-static {v6}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 81
    .line 82
    .line 83
    new-instance v6, LW9/m;

    .line 84
    .line 85
    invoke-direct {v6, v3, v2}, LW9/m;-><init>(LL8/t;I)V

    .line 86
    .line 87
    .line 88
    iput-object v6, v5, LL8/a;->g:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, LL8/a;->f(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, LL8/a;->d()LL8/b;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v5, "22.0.1"

    .line 98
    .line 99
    invoke-static {v4, v5}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-array v0, v0, [LL8/b;

    .line 104
    .line 105
    aput-object v3, v0, v1

    .line 106
    .line 107
    aput-object v4, v0, v2

    .line 108
    .line 109
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0
.end method
