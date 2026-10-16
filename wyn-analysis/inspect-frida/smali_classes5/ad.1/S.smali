.class public final Lad/S;
.super LS6/b;
.source "SourceFile"

# interfaces
.implements LR6/a;
.implements Lx6/r;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lad/T;)V
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
    iput-object v0, p0, Lad/S;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/S;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/T;

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
    iget-object p1, v0, Lad/T;->b:LG9/e;

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
    check-cast p1, LS6/a;

    .line 2
    .line 3
    iget-object v0, p0, Lad/S;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/T;

    .line 16
    .line 17
    iput-object p1, v0, Lad/T;->g:LS6/a;

    .line 18
    .line 19
    new-instance v1, LS3/e;

    .line 20
    .line 21
    iget-object v2, v0, Lad/T;->b:LG9/e;

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
    invoke-virtual {p1, v1}, LS6/a;->setOnPaidEventListener(Lx6/q;)V

    .line 30
    .line 31
    .line 32
    iget v0, v0, Lad/i;->a:I

    .line 33
    .line 34
    invoke-virtual {p1}, LS6/a;->getResponseInfo()Lx6/t;

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

.method public final onAdMetadataChanged()V
    .locals 4

    .line 1
    iget-object v0, p0, Lad/S;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/T;

    .line 14
    .line 15
    iget-object v1, v0, Lad/T;->b:LG9/e;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v0, v0, Lad/i;->a:I

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v3, "adId"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-string v0, "eventName"

    .line 37
    .line 38
    const-string v3, "onAdMetadataChanged"

    .line 39
    .line 40
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final onUserEarnedReward(LR6/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lad/S;->a:Ljava/lang/ref/WeakReference;

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
    check-cast v0, Lad/T;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lad/P;

    .line 19
    .line 20
    invoke-interface {p1}, LR6/b;->getAmount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {p1}, LR6/b;->getType()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v1, v2, p1}, Lad/P;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v0, Lad/T;->b:LG9/e;

    .line 36
    .line 37
    iget v0, v0, Lad/i;->a:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, LG9/e;->B(ILad/P;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method
