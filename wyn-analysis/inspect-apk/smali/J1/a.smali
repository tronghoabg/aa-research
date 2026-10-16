.class public abstract LJ1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/lifecycle/v;)LJ1/d;
    .locals 2

    .line 1
    new-instance v0, LJ1/d;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Landroidx/lifecycle/f0;

    .line 5
    .line 6
    invoke-interface {v1}, Landroidx/lifecycle/f0;->getViewModelStore()Landroidx/lifecycle/e0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, p0, v1}, LJ1/d;-><init>(Landroidx/lifecycle/v;Landroidx/lifecycle/e0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
