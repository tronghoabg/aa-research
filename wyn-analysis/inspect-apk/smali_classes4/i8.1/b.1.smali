.class public final Li8/b;
.super Li8/z;
.source "SourceFile"


# instance fields
.field public final synthetic g:Landroid/os/IBinder;

.field public final synthetic h:Lea/S;


# direct methods
.method public constructor <init>(Lea/S;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li8/b;->h:Lea/S;

    .line 2
    .line 3
    iput-object p2, p0, Li8/b;->g:Landroid/os/IBinder;

    .line 4
    .line 5
    invoke-direct {p0}, Li8/z;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Li8/b;->h:Lea/S;

    .line 2
    .line 3
    iget-object v0, v0, Lea/S;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li8/d;

    .line 6
    .line 7
    iget-object v1, v0, Li8/d;->i:Li8/C;

    .line 8
    .line 9
    iget-object v2, p0, Li8/b;->g:Landroid/os/IBinder;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Li8/C;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/os/IInterface;

    .line 16
    .line 17
    iput-object v1, v0, Li8/d;->n:Landroid/os/IInterface;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v2, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v3, "linkToDeath"

    .line 23
    .line 24
    iget-object v4, v0, Li8/d;->b:Li8/y;

    .line 25
    .line 26
    invoke-virtual {v4, v3, v2}, Li8/y;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v2, v0, Li8/d;->n:Landroid/os/IInterface;

    .line 30
    .line 31
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, v0, Li8/d;->k:Li8/A;

    .line 36
    .line 37
    invoke-interface {v2, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v2

    .line 42
    new-array v3, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v5, "linkToDeath failed"

    .line 45
    .line 46
    invoke-virtual {v4, v2, v5, v3}, Li8/y;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-boolean v1, v0, Li8/d;->g:Z

    .line 50
    .line 51
    iget-object v1, v0, Li8/d;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget-object v0, v0, Li8/d;->d:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
