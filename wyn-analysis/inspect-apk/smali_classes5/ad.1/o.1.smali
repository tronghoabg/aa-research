.class public final Lad/o;
.super Ly6/e;
.source "SourceFile"

# interfaces
.implements Ly6/f;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lad/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lad/o;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/o;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lad/p;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lad/f;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lad/f;-><init>(Lx6/l;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lad/p;->b:LG9/e;

    .line 24
    .line 25
    iget v0, v0, Lad/i;->a:I

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, LG9/e;->y(ILad/f;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onAdLoaded(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Ly6/d;

    .line 2
    .line 3
    iget-object v0, p0, Lad/o;->a:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lad/p;

    .line 16
    .line 17
    iput-object p1, v0, Lad/p;->c:Ly6/d;

    .line 18
    .line 19
    new-instance v1, Lad/o;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lad/o;-><init>(Lad/p;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ly6/d;->setAppEventListener(Ly6/f;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LS3/e;

    .line 28
    .line 29
    iget-object v2, v0, Lad/p;->b:LG9/e;

    .line 30
    .line 31
    const/16 v3, 0x1c

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v1, v2, v4, v0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, LI6/a;->setOnPaidEventListener(Lx6/q;)V

    .line 38
    .line 39
    .line 40
    iget v0, v0, Lad/i;->a:I

    .line 41
    .line 42
    invoke-virtual {p1}, LI6/a;->getResponseInfo()Lx6/t;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v2, v0, p1}, LG9/e;->z(ILx6/t;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/o;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lad/p;

    .line 14
    .line 15
    iget-object v1, v0, Lad/p;->b:LG9/e;

    .line 16
    .line 17
    iget v0, v0, Lad/i;->a:I

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1, p2}, LG9/e;->A(ILjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
