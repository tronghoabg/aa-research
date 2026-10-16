.class public final Lad/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;
.implements Luc/p;
.implements Luc/i;


# instance fields
.field public a:Luc/h;


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lad/b;->a:Luc/h;

    .line 3
    .line 4
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 0

    .line 1
    check-cast p2, Luc/h;

    .line 2
    .line 3
    iput-object p2, p0, Lad/b;->a:Luc/h;

    .line 4
    .line 5
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 1

    .line 1
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "stop"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "start"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    check-cast p2, Ltc/g;

    .line 23
    .line 24
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object p1, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/u;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object p1, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->c(Landroidx/lifecycle/u;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onStateChanged(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lad/b;->a:Luc/h;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p2, "foreground"

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Luc/h;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object p1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 16
    .line 17
    if-ne p2, p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lad/b;->a:Luc/h;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-string p2, "background"

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Luc/h;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method
