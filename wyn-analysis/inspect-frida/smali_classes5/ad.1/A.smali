.class public final Lad/A;
.super Lz6/a;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lad/B;)V
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
    iput-object v0, p0, Lad/A;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/A;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/B;

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
    iget-object p1, v0, Lad/B;->b:LG9/e;

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
    check-cast p1, Lz6/b;

    .line 2
    .line 3
    iget-object v0, p0, Lad/A;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/B;

    .line 16
    .line 17
    iput-object p1, v0, Lad/B;->c:Lz6/b;

    .line 18
    .line 19
    new-instance v1, LS3/e;

    .line 20
    .line 21
    iget-object v2, v0, Lad/B;->b:LG9/e;

    .line 22
    .line 23
    const/16 v3, 0x1c

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v1, v2, v4, v0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lz6/b;->setOnPaidEventListener(Lx6/q;)V

    .line 30
    .line 31
    .line 32
    iget v0, v0, Lad/i;->a:I

    .line 33
    .line 34
    invoke-virtual {p1}, Lz6/b;->getResponseInfo()Lx6/t;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v2, v0, p1}, LG9/e;->z(ILx6/t;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method
