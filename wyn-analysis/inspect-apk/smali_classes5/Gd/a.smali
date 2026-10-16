.class public final LGd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJd/q;
.implements LEf/E;


# instance fields
.field public final synthetic a:I

.field public final b:LJd/v;

.field public final c:LJd/u;

.field public final d:LQd/d;

.field public final e:LQd/d;

.field public final f:Ljf/h;

.field public final g:Lxd/c;

.field public final h:Ljava/lang/Object;

.field public final i:LJd/m;


# direct methods
.method public constructor <init>(Lxd/c;LFd/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LGd/a;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LGd/a;->g:Lxd/c;

    .line 3
    iget-object p1, p2, LFd/g;->f:Ljf/h;

    iput-object p1, p0, LGd/a;->f:Ljf/h;

    .line 4
    iget-object p1, p2, LFd/g;->a:LJd/v;

    iput-object p1, p0, LGd/a;->b:LJd/v;

    .line 5
    iget-object p1, p2, LFd/g;->d:LJd/u;

    iput-object p1, p0, LGd/a;->c:LJd/u;

    .line 6
    iget-object p1, p2, LFd/g;->b:LQd/d;

    iput-object p1, p0, LGd/a;->d:LQd/d;

    .line 7
    iget-object p1, p2, LFd/g;->g:LQd/d;

    iput-object p1, p0, LGd/a;->e:LQd/d;

    .line 8
    iget-object p1, p2, LFd/g;->e:Lio/ktor/utils/io/t;

    instance-of v0, p1, Lio/ktor/utils/io/t;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 9
    sget-object p1, Lio/ktor/utils/io/t;->a:Lio/ktor/utils/io/s;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    sget-object p1, Lio/ktor/utils/io/s;->b:Lio/ktor/utils/io/r;

    .line 11
    :cond_1
    iput-object p1, p0, LGd/a;->h:Ljava/lang/Object;

    .line 12
    iget-object p1, p2, LFd/g;->c:LJd/o;

    iput-object p1, p0, LGd/a;->i:LJd/m;

    return-void
.end method

.method public constructor <init>(Lxd/e;[BLGd/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LGd/a;->a:I

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LGd/a;->g:Lxd/c;

    .line 15
    iput-object p2, p0, LGd/a;->h:Ljava/lang/Object;

    .line 16
    invoke-virtual {p3}, LGd/a;->e()LJd/v;

    move-result-object p1

    iput-object p1, p0, LGd/a;->b:LJd/v;

    .line 17
    iget p1, p3, LGd/a;->a:I

    packed-switch p1, :pswitch_data_0

    .line 18
    iget-object p1, p3, LGd/a;->c:LJd/u;

    goto :goto_0

    .line 19
    :pswitch_0
    iget-object p1, p3, LGd/a;->c:LJd/u;

    .line 20
    :goto_0
    iput-object p1, p0, LGd/a;->c:LJd/u;

    .line 21
    iget p1, p3, LGd/a;->a:I

    packed-switch p1, :pswitch_data_1

    .line 22
    iget-object p1, p3, LGd/a;->d:LQd/d;

    goto :goto_1

    .line 23
    :pswitch_1
    iget-object p1, p3, LGd/a;->d:LQd/d;

    .line 24
    :goto_1
    iput-object p1, p0, LGd/a;->d:LQd/d;

    .line 25
    iget p1, p3, LGd/a;->a:I

    packed-switch p1, :pswitch_data_2

    .line 26
    iget-object p1, p3, LGd/a;->e:LQd/d;

    goto :goto_2

    .line 27
    :pswitch_2
    iget-object p1, p3, LGd/a;->e:LQd/d;

    .line 28
    :goto_2
    iput-object p1, p0, LGd/a;->e:LQd/d;

    .line 29
    invoke-interface {p3}, LJd/q;->a()LJd/m;

    move-result-object p1

    iput-object p1, p0, LGd/a;->i:LJd/m;

    .line 30
    invoke-interface {p3}, LEf/E;->getCoroutineContext()Ljf/h;

    move-result-object p1

    iput-object p1, p0, LGd/a;->f:Ljf/h;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public final a()LJd/m;
    .locals 1

    .line 1
    iget v0, p0, LGd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGd/a;->i:LJd/m;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LGd/a;->i:LJd/m;

    .line 10
    .line 11
    check-cast v0, LJd/o;

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lxd/c;
    .locals 1

    .line 1
    iget v0, p0, LGd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGd/a;->g:Lxd/c;

    .line 7
    .line 8
    check-cast v0, Lxd/e;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LGd/a;->g:Lxd/c;

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lio/ktor/utils/io/t;
    .locals 1

    .line 1
    iget v0, p0, LGd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGd/a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [B

    .line 9
    .line 10
    invoke-static {v0}, Lio/ktor/utils/io/N;->a([B)Lio/ktor/utils/io/a0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, LGd/a;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/ktor/utils/io/t;

    .line 18
    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()LJd/v;
    .locals 1

    .line 1
    iget v0, p0, LGd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGd/a;->b:LJd/v;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LGd/a;->b:LJd/v;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget v0, p0, LGd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGd/a;->f:Ljf/h;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LGd/a;->f:Ljf/h;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpResponse["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lgc/b;->u(LGd/a;)LFd/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, LFd/b;->getUrl()LJd/H;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LGd/a;->e()LJd/v;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x5d

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method
