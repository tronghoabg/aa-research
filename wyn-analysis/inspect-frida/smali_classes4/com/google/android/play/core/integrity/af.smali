.class final Lcom/google/android/play/core/integrity/af;
.super Li8/z;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Ljava/lang/Long;

.field final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

.field final synthetic e:Lcom/google/android/play/core/integrity/aj;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/aj;Lcom/google/android/gms/tasks/TaskCompletionSource;[BLjava/lang/Long;Landroid/os/Parcelable;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/play/core/integrity/af;->e:Lcom/google/android/play/core/integrity/aj;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/play/core/integrity/af;->a:[B

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/play/core/integrity/af;->b:Ljava/lang/Long;

    .line 6
    .line 7
    iput-object p6, p0, Lcom/google/android/play/core/integrity/af;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    iput-object p7, p0, Lcom/google/android/play/core/integrity/af;->d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Li8/z;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Li8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 6
    .line 7
    const/16 v1, -0x9

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, v0}, Li8/z;->a(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Li8/z;->a(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/google/android/play/core/integrity/af;->e:Lcom/google/android/play/core/integrity/aj;

    .line 4
    .line 5
    iget-object v3, v2, Lcom/google/android/play/core/integrity/aj;->a:Li8/d;

    .line 6
    .line 7
    iget-object v3, v3, Li8/d;->n:Landroid/os/IInterface;

    .line 8
    .line 9
    check-cast v3, Li8/t;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/google/android/play/core/integrity/af;->a:[B

    .line 12
    .line 13
    iget-object v5, p0, Lcom/google/android/play/core/integrity/af;->b:Ljava/lang/Long;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-static {v2, v4, v5, v6}, Lcom/google/android/play/core/integrity/aj;->a(Lcom/google/android/play/core/integrity/aj;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v4, Lcom/google/android/play/core/integrity/ai;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/google/android/play/core/integrity/af;->e:Lcom/google/android/play/core/integrity/aj;

    .line 23
    .line 24
    iget-object v6, p0, Lcom/google/android/play/core/integrity/af;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 25
    .line 26
    invoke-direct {v4, v5, v6}, Lcom/google/android/play/core/integrity/ai;-><init>(Lcom/google/android/play/core/integrity/aj;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 27
    .line 28
    .line 29
    check-cast v3, Li8/r;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v3, Li8/a;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget v6, Li8/k;->a:I

    .line 44
    .line 45
    invoke-virtual {v5, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    invoke-virtual {v3, v2, v5}, Li8/a;->R(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception v2

    .line 60
    iget-object v3, p0, Lcom/google/android/play/core/integrity/af;->e:Lcom/google/android/play/core/integrity/aj;

    .line 61
    .line 62
    iget-object v4, p0, Lcom/google/android/play/core/integrity/af;->d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    .line 63
    .line 64
    invoke-static {v3}, Lcom/google/android/play/core/integrity/aj;->f(Lcom/google/android/play/core/integrity/aj;)Li8/y;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object v4, v1, v0

    .line 71
    .line 72
    const-string v0, "requestIntegrityToken(%s)"

    .line 73
    .line 74
    invoke-virtual {v3, v2, v0, v1}, Li8/y;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/google/android/play/core/integrity/af;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 78
    .line 79
    new-instance v1, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 80
    .line 81
    const/16 v3, -0x64

    .line 82
    .line 83
    invoke-direct {v1, v3, v2}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method
