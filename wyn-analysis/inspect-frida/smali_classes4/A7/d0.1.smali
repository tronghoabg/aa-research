.class public final LA7/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Ly3/j;


# direct methods
.method public constructor <init>(Ly3/j;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA7/d0;->b:Ly3/j;

    .line 5
    .line 6
    iput-object p2, p0, LA7/d0;->a:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object p1, p0, LA7/d0;->b:Ly3/j;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, LA7/n0;

    .line 8
    .line 9
    iget-object p1, p1, LA7/n0;->i:LA7/N;

    .line 10
    .line 11
    invoke-static {p1}, LA7/n0;->d(LA7/D0;)V

    .line 12
    .line 13
    .line 14
    const-string p2, "Install Referrer connection returned with null binder"

    .line 15
    .line 16
    iget-object p1, p1, LA7/N;->i:LA7/P;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzby;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzbz;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, LA7/n0;

    .line 31
    .line 32
    iget-object p2, p2, LA7/n0;->i:LA7/N;

    .line 33
    .line 34
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p2, LA7/N;->i:LA7/P;

    .line 38
    .line 39
    const-string v0, "Install Referrer Service implementation was not found"

    .line 40
    .line 41
    invoke-virtual {p2, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, LA7/n0;

    .line 50
    .line 51
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 52
    .line 53
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 57
    .line 58
    const-string v1, "Install Referrer Service connected"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LA7/n0;

    .line 66
    .line 67
    iget-object v0, v0, LA7/n0;->j:LA7/k0;

    .line 68
    .line 69
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 70
    .line 71
    .line 72
    new-instance v1, LA7/p;

    .line 73
    .line 74
    invoke-direct {v1, p0, p2, p0}, LA7/p;-><init>(LA7/d0;Lcom/google/android/gms/internal/measurement/zzbz;LA7/d0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_0
    iget-object p1, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, LA7/n0;

    .line 84
    .line 85
    iget-object p1, p1, LA7/n0;->i:LA7/N;

    .line 86
    .line 87
    invoke-static {p1}, LA7/n0;->d(LA7/D0;)V

    .line 88
    .line 89
    .line 90
    const-string v0, "Exception occurred while calling Install Referrer API"

    .line 91
    .line 92
    iget-object p1, p1, LA7/N;->i:LA7/P;

    .line 93
    .line 94
    invoke-virtual {p1, v0, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, LA7/d0;->b:Ly3/j;

    .line 2
    .line 3
    iget-object p1, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LA7/n0;

    .line 6
    .line 7
    iget-object p1, p1, LA7/n0;->i:LA7/N;

    .line 8
    .line 9
    invoke-static {p1}, LA7/n0;->d(LA7/D0;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "Install Referrer Service disconnected"

    .line 13
    .line 14
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
