.class public abstract LA7/Y;
.super LA7/B;
.source "SourceFile"


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/B0;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LA7/n0;

    .line 7
    .line 8
    iget v0, p1, LA7/n0;->E:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p1, LA7/n0;->E:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final h0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/Y;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Not initialized"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final i0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/Y;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LA7/Y;->j0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LA7/n0;

    .line 14
    .line 15
    iget-object v0, v0, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, LA7/Y;->b:Z

    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "Can\'t initialize twice"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public abstract j0()Z
.end method
