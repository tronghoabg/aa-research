.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J=\u0010\u0008\u001a0\u0012,\u0012*\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;",
        "Lcom/google/firebase/components/ComponentRegistrar;",
        "<init>",
        "()V",
        "",
        "LL8/b;",
        "",
        "kotlin.jvm.PlatformType",
        "getComponents",
        "()Ljava/util/List;",
        "Companion",
        "ea/p",
        "com.google.firebase-firebase-sessions"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lea/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final backgroundDispatcher:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final blockingDispatcher:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final firebaseApp:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final firebaseInstallationsApi:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final sessionLifecycleServiceBinder:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final sessionsSettings:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final transportFactory:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lea/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lea/p;

    .line 7
    .line 8
    const-class v0, Ls8/g;

    .line 9
    .line 10
    invoke-static {v0}, LL8/t;->a(Ljava/lang/Class;)LL8/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 15
    .line 16
    const-class v0, LP9/d;

    .line 17
    .line 18
    invoke-static {v0}, LL8/t;->a(Ljava/lang/Class;)LL8/t;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LL8/t;

    .line 23
    .line 24
    new-instance v0, LL8/t;

    .line 25
    .line 26
    const-class v1, Ly8/a;

    .line 27
    .line 28
    const-class v2, LEf/A;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 34
    .line 35
    new-instance v0, LL8/t;

    .line 36
    .line 37
    const-class v1, Ly8/b;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LL8/t;

    .line 43
    .line 44
    const-class v0, Lq5/g;

    .line 45
    .line 46
    invoke-static {v0}, LL8/t;->a(Ljava/lang/Class;)LL8/t;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LL8/t;

    .line 51
    .line 52
    const-class v0, Lga/j;

    .line 53
    .line 54
    invoke-static {v0}, LL8/t;->a(Ljava/lang/Class;)LL8/t;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LL8/t;

    .line 59
    .line 60
    const-class v0, Lea/V;

    .line 61
    .line 62
    invoke-static {v0}, LL8/t;->a(Ljava/lang/Class;)LL8/t;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LL8/t;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(LC6/l;)Lea/v;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$4(LL8/c;)Lea/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LC6/l;)Lea/V;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$5(LL8/c;)Lea/V;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LC6/l;)Lga/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$3(LL8/c;)Lga/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LC6/l;)Lea/H;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$2(LL8/c;)Lea/H;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LC6/l;)Lea/M;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(LL8/c;)Lea/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LC6/l;)Lea/n;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(LL8/c;)Lea/n;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(LL8/c;)Lea/n;
    .locals 5

    .line 1
    new-instance v0, Lea/n;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ls8/g;

    .line 15
    .line 16
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LL8/t;

    .line 17
    .line 18
    invoke-interface {p0, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "container[sessionsSettings]"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v2, Lga/j;

    .line 28
    .line 29
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 30
    .line 31
    invoke-interface {p0, v3}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "container[backgroundDispatcher]"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Ljf/h;

    .line 41
    .line 42
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LL8/t;

    .line 43
    .line 44
    invoke-interface {p0, v4}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v4, "container[sessionLifecycleServiceBinder]"

    .line 49
    .line 50
    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p0, Lea/V;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2, v3, p0}, Lea/n;-><init>(Ls8/g;Lga/j;Ljf/h;Lea/V;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method private static final getComponents$lambda$1(LL8/c;)Lea/M;
    .locals 0

    .line 1
    new-instance p0, Lea/M;

    .line 2
    .line 3
    invoke-direct {p0}, Lea/M;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private static final getComponents$lambda$2(LL8/c;)Lea/H;
    .locals 7

    .line 1
    new-instance v0, Lea/K;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ls8/g;

    .line 15
    .line 16
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LL8/t;

    .line 17
    .line 18
    invoke-interface {p0, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "container[firebaseInstallationsApi]"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v2, LP9/d;

    .line 28
    .line 29
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LL8/t;

    .line 30
    .line 31
    invoke-interface {p0, v3}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "container[sessionsSettings]"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Lga/j;

    .line 41
    .line 42
    new-instance v4, La2/v;

    .line 43
    .line 44
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LL8/t;

    .line 45
    .line 46
    invoke-interface {p0, v5}, LL8/c;->f(LL8/t;)LO9/b;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-string v6, "container.getProvider(transportFactory)"

    .line 51
    .line 52
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v6, 0x7

    .line 56
    invoke-direct {v4, v5, v6}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 60
    .line 61
    invoke-interface {p0, v5}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v5, "container[backgroundDispatcher]"

    .line 66
    .line 67
    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v5, p0

    .line 71
    check-cast v5, Ljf/h;

    .line 72
    .line 73
    invoke-direct/range {v0 .. v5}, Lea/K;-><init>(Ls8/g;LP9/d;Lga/j;La2/v;Ljf/h;)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method

.method private static final getComponents$lambda$3(LL8/c;)Lga/j;
    .locals 5

    .line 1
    new-instance v0, Lga/j;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ls8/g;

    .line 15
    .line 16
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LL8/t;

    .line 17
    .line 18
    invoke-interface {p0, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "container[blockingDispatcher]"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v2, Ljf/h;

    .line 28
    .line 29
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 30
    .line 31
    invoke-interface {p0, v3}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "container[backgroundDispatcher]"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Ljf/h;

    .line 41
    .line 42
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LL8/t;

    .line 43
    .line 44
    invoke-interface {p0, v4}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v4, "container[firebaseInstallationsApi]"

    .line 49
    .line 50
    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p0, LP9/d;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2, v3, p0}, Lga/j;-><init>(Ls8/g;Ljf/h;Ljf/h;LP9/d;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method private static final getComponents$lambda$4(LL8/c;)Lea/v;
    .locals 3

    .line 1
    new-instance v0, Lea/D;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls8/g;

    .line 10
    .line 11
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v1, Ls8/g;->a:Landroid/content/Context;

    .line 15
    .line 16
    const-string v2, "container[firebaseApp].applicationContext"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 22
    .line 23
    invoke-interface {p0, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v2, "container[backgroundDispatcher]"

    .line 28
    .line 29
    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p0, Ljf/h;

    .line 33
    .line 34
    invoke-direct {v0, v1, p0}, Lea/D;-><init>(Landroid/content/Context;Ljf/h;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method private static final getComponents$lambda$5(LL8/c;)Lea/V;
    .locals 2

    .line 1
    new-instance v0, Lea/W;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, Ls8/g;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lea/W;-><init>(Ls8/g;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LL8/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    const-class v3, Lea/n;

    .line 5
    .line 6
    invoke-static {v3}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "fire-sessions"

    .line 11
    .line 12
    iput-object v4, v3, LL8/a;->a:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LL8/t;

    .line 15
    .line 16
    invoke-static {v5}, LL8/l;->c(LL8/t;)LL8/l;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    invoke-virtual {v3, v6}, LL8/a;->c(LL8/l;)V

    .line 21
    .line 22
    .line 23
    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LL8/t;

    .line 24
    .line 25
    invoke-static {v6}, LL8/l;->c(LL8/t;)LL8/l;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v3, v7}, LL8/a;->c(LL8/l;)V

    .line 30
    .line 31
    .line 32
    sget-object v7, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LL8/t;

    .line 33
    .line 34
    invoke-static {v7}, LL8/l;->c(LL8/t;)LL8/l;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v3, v8}, LL8/a;->c(LL8/l;)V

    .line 39
    .line 40
    .line 41
    sget-object v8, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LL8/t;

    .line 42
    .line 43
    invoke-static {v8}, LL8/l;->c(LL8/t;)LL8/l;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual {v3, v8}, LL8/a;->c(LL8/l;)V

    .line 48
    .line 49
    .line 50
    new-instance v8, Lcom/applovin/impl/Z0;

    .line 51
    .line 52
    const/16 v9, 0xb

    .line 53
    .line 54
    invoke-direct {v8, v9}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iput-object v8, v3, LL8/a;->g:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v3, v2}, LL8/a;->f(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, LL8/a;->d()LL8/b;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-class v8, Lea/M;

    .line 67
    .line 68
    invoke-static {v8}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-string v9, "session-generator"

    .line 73
    .line 74
    iput-object v9, v8, LL8/a;->a:Ljava/lang/Object;

    .line 75
    .line 76
    new-instance v9, Lcom/applovin/impl/Z0;

    .line 77
    .line 78
    const/16 v10, 0xc

    .line 79
    .line 80
    invoke-direct {v9, v10}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object v9, v8, LL8/a;->g:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v8}, LL8/a;->d()LL8/b;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    const-class v9, Lea/H;

    .line 90
    .line 91
    invoke-static {v9}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    const-string v10, "session-publisher"

    .line 96
    .line 97
    iput-object v10, v9, LL8/a;->a:Ljava/lang/Object;

    .line 98
    .line 99
    new-instance v10, LL8/l;

    .line 100
    .line 101
    invoke-direct {v10, v5, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v10}, LL8/a;->c(LL8/l;)V

    .line 105
    .line 106
    .line 107
    sget-object v10, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LL8/t;

    .line 108
    .line 109
    invoke-static {v10}, LL8/l;->c(LL8/t;)LL8/l;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 114
    .line 115
    .line 116
    new-instance v11, LL8/l;

    .line 117
    .line 118
    invoke-direct {v11, v6, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 122
    .line 123
    .line 124
    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LL8/t;

    .line 125
    .line 126
    new-instance v11, LL8/l;

    .line 127
    .line 128
    invoke-direct {v11, v6, v1, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 132
    .line 133
    .line 134
    new-instance v6, LL8/l;

    .line 135
    .line 136
    invoke-direct {v6, v7, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v6}, LL8/a;->c(LL8/l;)V

    .line 140
    .line 141
    .line 142
    new-instance v6, Lcom/applovin/impl/Z0;

    .line 143
    .line 144
    const/16 v11, 0xd

    .line 145
    .line 146
    invoke-direct {v6, v11}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 147
    .line 148
    .line 149
    iput-object v6, v9, LL8/a;->g:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v9}, LL8/a;->d()LL8/b;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    const-class v9, Lga/j;

    .line 156
    .line 157
    invoke-static {v9}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    const-string v11, "sessions-settings"

    .line 162
    .line 163
    iput-object v11, v9, LL8/a;->a:Ljava/lang/Object;

    .line 164
    .line 165
    new-instance v11, LL8/l;

    .line 166
    .line 167
    invoke-direct {v11, v5, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 171
    .line 172
    .line 173
    sget-object v11, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LL8/t;

    .line 174
    .line 175
    invoke-static {v11}, LL8/l;->c(LL8/t;)LL8/l;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 180
    .line 181
    .line 182
    new-instance v11, LL8/l;

    .line 183
    .line 184
    invoke-direct {v11, v7, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 188
    .line 189
    .line 190
    new-instance v11, LL8/l;

    .line 191
    .line 192
    invoke-direct {v11, v10, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 196
    .line 197
    .line 198
    new-instance v10, Lcom/applovin/impl/Z0;

    .line 199
    .line 200
    const/16 v11, 0xe

    .line 201
    .line 202
    invoke-direct {v10, v11}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 203
    .line 204
    .line 205
    iput-object v10, v9, LL8/a;->g:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-virtual {v9}, LL8/a;->d()LL8/b;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    const-class v10, Lea/v;

    .line 212
    .line 213
    invoke-static {v10}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    const-string v11, "sessions-datastore"

    .line 218
    .line 219
    iput-object v11, v10, LL8/a;->a:Ljava/lang/Object;

    .line 220
    .line 221
    new-instance v11, LL8/l;

    .line 222
    .line 223
    invoke-direct {v11, v5, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10, v11}, LL8/a;->c(LL8/l;)V

    .line 227
    .line 228
    .line 229
    new-instance v11, LL8/l;

    .line 230
    .line 231
    invoke-direct {v11, v7, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10, v11}, LL8/a;->c(LL8/l;)V

    .line 235
    .line 236
    .line 237
    new-instance v7, Lcom/applovin/impl/Z0;

    .line 238
    .line 239
    const/16 v11, 0xf

    .line 240
    .line 241
    invoke-direct {v7, v11}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 242
    .line 243
    .line 244
    iput-object v7, v10, LL8/a;->g:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual {v10}, LL8/a;->d()LL8/b;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    const-class v10, Lea/V;

    .line 251
    .line 252
    invoke-static {v10}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    const-string v11, "sessions-service-binder"

    .line 257
    .line 258
    iput-object v11, v10, LL8/a;->a:Ljava/lang/Object;

    .line 259
    .line 260
    new-instance v11, LL8/l;

    .line 261
    .line 262
    invoke-direct {v11, v5, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v10, v11}, LL8/a;->c(LL8/l;)V

    .line 266
    .line 267
    .line 268
    new-instance v5, Lcom/applovin/impl/Z0;

    .line 269
    .line 270
    const/16 v11, 0x10

    .line 271
    .line 272
    invoke-direct {v5, v11}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 273
    .line 274
    .line 275
    iput-object v5, v10, LL8/a;->g:Ljava/lang/Object;

    .line 276
    .line 277
    invoke-virtual {v10}, LL8/a;->d()LL8/b;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    const-string v10, "2.0.7"

    .line 282
    .line 283
    invoke-static {v4, v10}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    const/4 v10, 0x7

    .line 288
    new-array v10, v10, [LL8/b;

    .line 289
    .line 290
    aput-object v3, v10, v0

    .line 291
    .line 292
    aput-object v8, v10, v1

    .line 293
    .line 294
    aput-object v6, v10, v2

    .line 295
    .line 296
    const/4 v0, 0x3

    .line 297
    aput-object v9, v10, v0

    .line 298
    .line 299
    const/4 v0, 0x4

    .line 300
    aput-object v7, v10, v0

    .line 301
    .line 302
    const/4 v0, 0x5

    .line 303
    aput-object v5, v10, v0

    .line 304
    .line 305
    const/4 v0, 0x6

    .line 306
    aput-object v4, v10, v0

    .line 307
    .line 308
    invoke-static {v10}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0
.end method
