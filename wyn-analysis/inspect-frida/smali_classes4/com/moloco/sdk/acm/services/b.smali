.class public final Lcom/moloco/sdk/acm/services/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final a:LY2/B;

.field public final b:LKd/a;

.field public final c:Lba/a;


# direct methods
.method public constructor <init>(LY2/B;LKd/a;Lba/a;)V
    .locals 1

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/acm/services/b;->a:LY2/B;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/acm/services/b;->b:LKd/a;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/acm/services/b;->c:Lba/a;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onPause(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic onResume(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->d(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final synthetic onStart(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->e(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onStop(Landroidx/lifecycle/v;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/moloco/sdk/acm/services/b;->c:Lba/a;

    .line 2
    .line 3
    iget-object v0, p1, Lba/a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lef/p;

    .line 6
    .line 7
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/PowerManager;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/os/PowerManager;->isInteractive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v1, "ApplicationLifecycleObserver"

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Lba/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v2, "android.permission.USE_FULL_SCREEN_INTENT"

    .line 34
    .line 35
    invoke-virtual {v0, v2, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const-string p1, "Application onStop - skipping upload (device not interactive)"

    .line 42
    .line 43
    invoke-static {v1, p1}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p1, "Application onStop"

    .line 48
    .line 49
    invoke-static {v1, p1}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lcom/moloco/sdk/acm/services/a;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-direct {p1, p0, v0}, Lcom/moloco/sdk/acm/services/a;-><init>(Lcom/moloco/sdk/acm/services/b;Ljf/c;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    iget-object v2, p0, Lcom/moloco/sdk/acm/services/b;->b:LKd/a;

    .line 60
    .line 61
    invoke-static {v2, v0, p1, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 62
    .line 63
    .line 64
    return-void
.end method
