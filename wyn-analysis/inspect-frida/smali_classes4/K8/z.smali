.class public final LK8/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:I

.field public final b:LK8/l;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Ls8/g;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ls8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v1, LK8/l;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v4, LK8/l;->f:Lh7/a;

    .line 15
    .line 16
    const-string v5, "Initializing TokenRefresher"

    .line 17
    .line 18
    invoke-virtual {v4, v5, v3}, Lh7/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Landroid/os/HandlerThread;

    .line 22
    .line 23
    const-string v4, "TokenRefresher"

    .line 24
    .line 25
    const/16 v5, 0xa

    .line 26
    .line 27
    invoke-direct {v3, v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzg;-><init>(Landroid/os/Looper;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, v1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 43
    .line 44
    new-instance v3, LA7/p;

    .line 45
    .line 46
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, Ls8/g;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v3, v1, p1}, LA7/p;-><init>(LK8/l;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v1, LK8/l;->e:LA7/p;

    .line 55
    .line 56
    const-wide/32 v3, 0x493e0

    .line 57
    .line 58
    .line 59
    iput-wide v3, v1, LK8/l;->c:J

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-boolean v2, p0, LK8/z;->c:Z

    .line 65
    .line 66
    iput v2, p0, LK8/z;->a:I

    .line 67
    .line 68
    iput-object v1, p0, LK8/z;->b:LK8/l;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Landroid/app/Application;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/d;->c(Landroid/app/Application;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lcom/google/android/gms/common/api/internal/d;->e:Lcom/google/android/gms/common/api/internal/d;

    .line 80
    .line 81
    new-instance v0, LK8/C;

    .line 82
    .line 83
    invoke-direct {v0, p0}, LK8/C;-><init>(LK8/z;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d;->a(Lcom/google/android/gms/common/api/internal/c;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, LK8/z;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, LK8/z;->a:I

    .line 8
    .line 9
    iget v0, p0, LK8/z;->a:I

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, LK8/z;->c:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LK8/z;->b:LK8/l;

    .line 18
    .line 19
    invoke-virtual {v0}, LK8/l;->a()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget v0, p0, LK8/z;->a:I

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LK8/z;->b:LK8/l;

    .line 30
    .line 31
    iget-object v1, v0, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 32
    .line 33
    iget-object v0, v0, LK8/l;->e:LA7/p;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    iput p1, p0, LK8/z;->a:I

    .line 39
    .line 40
    return-void
.end method
