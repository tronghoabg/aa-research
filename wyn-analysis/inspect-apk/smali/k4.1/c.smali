.class public final Lk4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic a:LEf/n;


# direct methods
.method public constructor <init>(LEf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk4/c;->a:LEf/n;

    .line 5
    .line 6
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

.method public final onStart(Landroidx/lifecycle/v;)V
    .locals 1

    .line 1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v0, p0, Lk4/c;->a:LEf/n;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic onStop(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method
