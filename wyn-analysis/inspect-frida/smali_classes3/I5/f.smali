.class public final LI5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lf6/z;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    return-void

    .line 3
    :pswitch_0
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, LI5/f;->a:I

    iput-object p3, p0, LI5/f;->b:Lf6/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 3

    .line 1
    invoke-static {p1, p2}, Lu6/v;->F(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v2, p1, v0

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    return-wide p1
.end method

.method public b(Lf6/u;)V
    .locals 5

    .line 1
    iget-object v0, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lf6/C;

    .line 18
    .line 19
    iget-object v2, v1, Lf6/C;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v3, Lcom/applovin/impl/mediation/ads/f;

    .line 22
    .line 23
    const/16 v4, 0x11

    .line 24
    .line 25
    invoke-direct {v3, p0, v2, p1, v4}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lf6/C;->a:Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lu6/v;->B(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public c(Lf6/p;Lf6/u;)V
    .locals 8

    .line 1
    iget-object v0, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lf6/C;

    .line 18
    .line 19
    iget-object v4, v1, Lf6/C;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v2, Lf6/B;

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    move-object v3, p0

    .line 25
    move-object v5, p1

    .line 26
    move-object v6, p2

    .line 27
    invoke-direct/range {v2 .. v7}, Lf6/B;-><init>(LI5/f;Lf6/D;Lf6/p;Lf6/u;I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lf6/C;->a:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lu6/v;->B(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public d(Lf6/p;Lf6/u;)V
    .locals 8

    .line 1
    iget-object v0, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lf6/C;

    .line 18
    .line 19
    iget-object v4, v1, Lf6/C;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v2, Lf6/B;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    move-object v3, p0

    .line 25
    move-object v5, p1

    .line 26
    move-object v6, p2

    .line 27
    invoke-direct/range {v2 .. v7}, Lf6/B;-><init>(LI5/f;Lf6/D;Lf6/p;Lf6/u;I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lf6/C;->a:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lu6/v;->B(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public e(Lf6/p;Lf6/u;Ljava/io/IOException;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lf6/C;

    .line 18
    .line 19
    iget-object v4, v1, Lf6/C;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v2, LU1/L;

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    move-object v3, p0

    .line 25
    move-object v5, p1

    .line 26
    move-object v6, p2

    .line 27
    move-object v7, p3

    .line 28
    move v8, p4

    .line 29
    invoke-direct/range {v2 .. v9}, LU1/L;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/IOException;ZI)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v1, Lf6/C;->a:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {p1, v2}, Lu6/v;->B(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public f(Lf6/p;Lf6/u;)V
    .locals 8

    .line 1
    iget-object v0, p0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lf6/C;

    .line 18
    .line 19
    iget-object v4, v1, Lf6/C;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v2, Lf6/B;

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    move-object v3, p0

    .line 25
    move-object v5, p1

    .line 26
    move-object v6, p2

    .line 27
    invoke-direct/range {v2 .. v7}, Lf6/B;-><init>(LI5/f;Lf6/D;Lf6/p;Lf6/u;I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lf6/C;->a:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lu6/v;->B(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method
