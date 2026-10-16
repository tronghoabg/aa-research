.class public final Lcom/google/android/gms/common/api/internal/V;
.super Lcom/google/android/gms/common/api/internal/A;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN7/e;[Ld7/d;ZI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/common/api/internal/V;->d:I

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/V;->e:Ljava/lang/Object;

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/common/api/internal/A;-><init>([Ld7/d;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/common/api/internal/V;->d:I

    const/4 v0, 0x0

    const/16 v1, 0x3392

    const/4 v2, 0x0

    .line 2
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/A;-><init>([Ld7/d;ZI)V

    .line 3
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/V;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/internal/V;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lf9/c;

    .line 7
    .line 8
    new-instance v0, Lf9/e;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lf9/e;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/V;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lf9/l;

    .line 25
    .line 26
    check-cast p1, Lf9/j;

    .line 27
    .line 28
    invoke-virtual {p1, v0, p2}, Lf9/j;->R(Lf9/e;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    :catch_0
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/V;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LN7/e;

    .line 35
    .line 36
    iget-object v0, v0, LN7/e;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcom/google/android/gms/common/api/internal/w;

    .line 39
    .line 40
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/common/api/internal/w;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
