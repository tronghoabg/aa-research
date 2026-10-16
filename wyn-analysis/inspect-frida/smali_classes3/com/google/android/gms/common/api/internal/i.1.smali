.class public final Lcom/google/android/gms/common/api/internal/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Lcom/google/android/gms/common/api/Status;

.field public static final r:Ljava/lang/Object;

.field public static s:Lcom/google/android/gms/common/api/internal/i;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lcom/google/android/gms/common/internal/y;

.field public d:Lg7/b;

.field public final e:Landroid/content/Context;

.field public final f:Ld7/e;

.field public final g:Lba/a;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Lj$/util/concurrent/ConcurrentHashMap;

.field public k:Lcom/google/android/gms/common/api/internal/E;

.field public final l:Lx/f;

.field public final m:Lx/f;

.field public final n:Lcom/google/android/gms/internal/base/zau;

.field public volatile o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/common/api/internal/i;->p:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/common/api/internal/i;->q:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/common/api/internal/i;->r:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Ld7/e;->d:Ld7/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lcom/google/android/gms/common/api/internal/i;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/i;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Lj$/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Lj$/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->k:Lcom/google/android/gms/common/api/internal/E;

    .line 40
    .line 41
    new-instance v2, Lx/f;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lx/f;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->l:Lx/f;

    .line 47
    .line 48
    new-instance v2, Lx/f;

    .line 49
    .line 50
    invoke-direct {v2, v1}, Lx/f;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->m:Lx/f;

    .line 54
    .line 55
    iput-boolean v3, p0, Lcom/google/android/gms/common/api/internal/i;->o:Z

    .line 56
    .line 57
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 58
    .line 59
    new-instance v2, Lcom/google/android/gms/internal/base/zau;

    .line 60
    .line 61
    invoke-direct {v2, p2, p0}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->f:Ld7/e;

    .line 67
    .line 68
    new-instance p2, Lba/a;

    .line 69
    .line 70
    const/4 v0, 0x2

    .line 71
    invoke-direct {p2, v0}, Lba/a;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/i;->g:Lba/a;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object p2, Ln7/c;->g:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-nez p2, :cond_1

    .line 83
    .line 84
    invoke-static {}, Ln7/c;->h()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_0

    .line 89
    .line 90
    const-string p2, "android.hardware.type.automotive"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move v3, v1

    .line 100
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    sput-object p1, Ln7/c;->g:Ljava/lang/Boolean;

    .line 105
    .line 106
    :cond_1
    sget-object p1, Ln7/c;->g:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/i;->o:Z

    .line 115
    .line 116
    :cond_2
    const/4 p1, 0x6

    .line 117
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/i;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/i;->s:Lcom/google/android/gms/common/api/internal/i;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/i;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public static e(Lcom/google/android/gms/common/api/internal/b;Ld7/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/b;->b:Lcom/google/android/gms/common/api/i;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/common/api/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "API: "

    .line 12
    .line 13
    const-string v3, " is not available on this device. Connection failed with: "

    .line 14
    .line 15
    invoke-static {v2, p0, v3, v1}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object v1, p1, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 20
    .line 21
    const/16 v2, 0x11

    .line 22
    .line 23
    invoke-direct {v0, v2, p0, v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static h(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/i;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/i;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/i;->s:Lcom/google/android/gms/common/api/internal/i;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/common/internal/m;->b()Landroid/os/HandlerThread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lcom/google/android/gms/common/api/internal/i;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v3, Ld7/e;->c:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/common/api/internal/i;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lcom/google/android/gms/common/api/internal/i;->s:Lcom/google/android/gms/common/api/internal/i;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/common/api/internal/i;->s:Lcom/google/android/gms/common/api/internal/i;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object p0

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/internal/E;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/i;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->k:Lcom/google/android/gms/common/api/internal/E;

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->k:Lcom/google/android/gms/common/api/internal/E;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->l:Lx/f;

    .line 11
    .line 12
    invoke-virtual {v1}, Lx/f;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->l:Lx/f;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/E;->e:Lx/f;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lx/f;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/i;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/w;->c()Lcom/google/android/gms/common/internal/w;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lcom/google/android/gms/common/internal/w;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/common/internal/x;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/x;->b:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->g:Lba/a;

    .line 21
    .line 22
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v1, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final d(Ld7/b;I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->f:Ld7/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1}, Lp7/b;->H(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v2, p1, Ld7/b;->b:I

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    iget-object p1, p1, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move v5, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v5, v3

    .line 28
    :goto_0
    if-eqz v5, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, v1, v2, p1}, Ld7/f;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/high16 p1, 0xc000000

    .line 40
    .line 41
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget v5, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 48
    .line 49
    new-instance v5, Landroid/content/Intent;

    .line 50
    .line 51
    const-class v6, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 52
    .line 53
    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-string v6, "pending_intent"

    .line 57
    .line 58
    invoke-virtual {v5, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    const-string p1, "failing_client_id"

    .line 62
    .line 63
    invoke-virtual {v5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const-string p1, "notify_manager"

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    sget p1, Lcom/google/android/gms/internal/base/zap;->zaa:I

    .line 72
    .line 73
    const/high16 p2, 0x8000000

    .line 74
    .line 75
    or-int/2addr p1, p2

    .line 76
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, v1, v2, p1}, Ld7/e;->h(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 81
    .line 82
    .line 83
    return v4

    .line 84
    :cond_4
    :goto_2
    return v3
.end method

.method public final f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/H;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lcom/google/android/gms/common/api/internal/H;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/internal/H;

    .line 16
    .line 17
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/common/api/internal/H;-><init>(Lcom/google/android/gms/common/api/internal/i;Lcom/google/android/gms/common/api/l;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->m:Lx/f;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lx/f;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/H;->k()V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public final g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILcom/google/android/gms/common/api/l;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/b;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/i;->c()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/w;->c()Lcom/google/android/gms/common/internal/w;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iget-object p3, p3, Lcom/google/android/gms/common/internal/w;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p3, Lcom/google/android/gms/common/internal/x;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    iget-boolean v1, p3, Lcom/google/android/gms/common/internal/x;->b:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/google/android/gms/common/api/internal/H;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 40
    .line 41
    instance-of v4, v2, Lcom/google/android/gms/common/internal/f;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    check-cast v2, Lcom/google/android/gms/common/internal/f;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-static {v1, v2, p2}, Lcom/google/android/gms/common/api/internal/M;->e(Lcom/google/android/gms/common/api/internal/H;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    iget v2, v1, Lcom/google/android/gms/common/api/internal/H;->l:I

    .line 66
    .line 67
    add-int/2addr v2, v0

    .line 68
    iput v2, v1, Lcom/google/android/gms/common/api/internal/H;->l:I

    .line 69
    .line 70
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/j;->c:Z

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/x;->c:Z

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 77
    move-object v1, p0

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    :goto_1
    new-instance p3, Lcom/google/android/gms/common/api/internal/M;

    .line 80
    .line 81
    const-wide/16 v1, 0x0

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-wide v4, v1

    .line 91
    :goto_2
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    :cond_5
    move-object v0, p3

    .line 98
    move-wide v6, v1

    .line 99
    move-object v1, p0

    .line 100
    move v2, p2

    .line 101
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/api/internal/M;-><init>(Lcom/google/android/gms/common/api/internal/i;ILcom/google/android/gms/common/api/internal/b;JJ)V

    .line 102
    .line 103
    .line 104
    move-object p2, v0

    .line 105
    :goto_3
    if-eqz p2, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p3, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, LA7/V0;

    .line 117
    .line 118
    const/4 v2, 0x2

    .line 119
    invoke-direct {v0, p3, v2}, LA7/V0;-><init>(Ljava/lang/Object;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_6
    move-object v1, p0

    .line 127
    :cond_7
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 13

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    sget-object v7, Lcom/google/android/gms/common/internal/A;->b:Lcom/google/android/gms/common/internal/A;

    .line 8
    .line 9
    const-wide/32 v3, 0x493e0

    .line 10
    .line 11
    .line 12
    const-string v5, "GoogleApiManager"

    .line 13
    .line 14
    const/16 v9, 0x11

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v11, 0x1

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "Unknown message id: "

    .line 25
    .line 26
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v5, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    return v6

    .line 40
    :pswitch_0
    iput-boolean v6, p0, Lcom/google/android/gms/common/api/internal/i;->b:Z

    .line 41
    .line 42
    return v11

    .line 43
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/google/android/gms/common/api/internal/N;

    .line 46
    .line 47
    iget-wide v2, p1, Lcom/google/android/gms/common/api/internal/N;->c:J

    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    cmp-long v0, v2, v4

    .line 52
    .line 53
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/N;->a:Lcom/google/android/gms/common/internal/t;

    .line 54
    .line 55
    iget v12, p1, Lcom/google/android/gms/common/api/internal/N;->b:I

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    new-instance p1, Lcom/google/android/gms/common/internal/y;

    .line 60
    .line 61
    new-array v0, v11, [Lcom/google/android/gms/common/internal/t;

    .line 62
    .line 63
    aput-object v2, v0, v6

    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p1, v12, v0}, Lcom/google/android/gms/common/internal/y;-><init>(ILjava/util/List;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 73
    .line 74
    if-nez v0, :cond_0

    .line 75
    .line 76
    new-instance v3, Lg7/b;

    .line 77
    .line 78
    sget-object v8, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 79
    .line 80
    sget-object v6, Lg7/b;->a:Lcom/google/android/gms/common/api/i;

    .line 81
    .line 82
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 86
    .line 87
    .line 88
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 89
    .line 90
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lg7/b;->c(Lcom/google/android/gms/common/internal/y;)Lcom/google/android/gms/tasks/Task;

    .line 93
    .line 94
    .line 95
    return v11

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    iget-object v3, v0, Lcom/google/android/gms/common/internal/y;->b:Ljava/util/List;

    .line 101
    .line 102
    iget v0, v0, Lcom/google/android/gms/common/internal/y;->a:I

    .line 103
    .line 104
    if-ne v0, v12, :cond_4

    .line 105
    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v3, p1, Lcom/google/android/gms/common/api/internal/N;->d:I

    .line 113
    .line 114
    if-lt v0, v3, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 118
    .line 119
    iget-object v3, v0, Lcom/google/android/gms/common/internal/y;->b:Ljava/util/List;

    .line 120
    .line 121
    if-nez v3, :cond_3

    .line 122
    .line 123
    new-instance v3, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object v3, v0, Lcom/google/android/gms/common/internal/y;->b:Ljava/util/List;

    .line 129
    .line 130
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/internal/y;->b:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    :goto_0
    invoke-virtual {v1, v9}, Landroid/os/Handler;->removeMessages(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget v3, v0, Lcom/google/android/gms/common/internal/y;->a:I

    .line 144
    .line 145
    if-gtz v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/i;->c()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_7

    .line 152
    .line 153
    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 154
    .line 155
    if-nez v3, :cond_6

    .line 156
    .line 157
    new-instance v3, Lg7/b;

    .line 158
    .line 159
    sget-object v8, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 160
    .line 161
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 162
    .line 163
    const/4 v5, 0x0

    .line 164
    sget-object v6, Lg7/b;->a:Lcom/google/android/gms/common/api/i;

    .line 165
    .line 166
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 167
    .line 168
    .line 169
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 170
    .line 171
    :cond_6
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 172
    .line 173
    invoke-virtual {v3, v0}, Lg7/b;->c(Lcom/google/android/gms/common/internal/y;)Lcom/google/android/gms/tasks/Task;

    .line 174
    .line 175
    .line 176
    :cond_7
    iput-object v10, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 177
    .line 178
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 179
    .line 180
    if-nez v0, :cond_22

    .line 181
    .line 182
    new-instance v0, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    new-instance v2, Lcom/google/android/gms/common/internal/y;

    .line 191
    .line 192
    invoke-direct {v2, v12, v0}, Lcom/google/android/gms/common/internal/y;-><init>(ILjava/util/List;)V

    .line 193
    .line 194
    .line 195
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 196
    .line 197
    invoke-virtual {v1, v9}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-wide v2, p1, Lcom/google/android/gms/common/api/internal/N;->c:J

    .line 202
    .line 203
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 204
    .line 205
    .line 206
    return v11

    .line 207
    :pswitch_2
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 208
    .line 209
    if-eqz p1, :cond_22

    .line 210
    .line 211
    iget v0, p1, Lcom/google/android/gms/common/internal/y;->a:I

    .line 212
    .line 213
    if-gtz v0, :cond_9

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/i;->c()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 222
    .line 223
    if-nez v0, :cond_a

    .line 224
    .line 225
    new-instance v3, Lg7/b;

    .line 226
    .line 227
    sget-object v8, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 228
    .line 229
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    sget-object v6, Lg7/b;->a:Lcom/google/android/gms/common/api/i;

    .line 233
    .line 234
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 235
    .line 236
    .line 237
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 238
    .line 239
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->d:Lg7/b;

    .line 240
    .line 241
    invoke-virtual {v0, p1}, Lg7/b;->c(Lcom/google/android/gms/common/internal/y;)Lcom/google/android/gms/tasks/Task;

    .line 242
    .line 243
    .line 244
    :cond_b
    iput-object v10, p0, Lcom/google/android/gms/common/api/internal/i;->c:Lcom/google/android/gms/common/internal/y;

    .line 245
    .line 246
    return v11

    .line 247
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, Lcom/google/android/gms/common/api/internal/I;

    .line 250
    .line 251
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/I;->a:Lcom/google/android/gms/common/api/internal/b;

    .line 252
    .line 253
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_22

    .line 258
    .line 259
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/I;->a:Lcom/google/android/gms/common/api/internal/b;

    .line 260
    .line 261
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 266
    .line 267
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->j:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_22

    .line 274
    .line 275
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->m:Lcom/google/android/gms/common/api/internal/i;

    .line 276
    .line 277
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 278
    .line 279
    const/16 v3, 0xf

    .line 280
    .line 281
    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 285
    .line 286
    const/16 v2, 0x10

    .line 287
    .line 288
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->a:Ljava/util/LinkedList;

    .line 292
    .line 293
    new-instance v2, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    :cond_c
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    iget-object v5, p1, Lcom/google/android/gms/common/api/internal/I;->b:Ld7/d;

    .line 311
    .line 312
    if-eqz v4, :cond_e

    .line 313
    .line 314
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    check-cast v4, Lcom/google/android/gms/common/api/internal/c0;

    .line 319
    .line 320
    instance-of v7, v4, Lcom/google/android/gms/common/api/internal/L;

    .line 321
    .line 322
    if-eqz v7, :cond_c

    .line 323
    .line 324
    move-object v7, v4

    .line 325
    check-cast v7, Lcom/google/android/gms/common/api/internal/L;

    .line 326
    .line 327
    invoke-virtual {v7, v0}, Lcom/google/android/gms/common/api/internal/L;->g(Lcom/google/android/gms/common/api/internal/H;)[Ld7/d;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    if-eqz v7, :cond_c

    .line 332
    .line 333
    array-length v8, v7

    .line 334
    move v9, v6

    .line 335
    :goto_3
    if-ge v9, v8, :cond_c

    .line 336
    .line 337
    aget-object v10, v7, v9

    .line 338
    .line 339
    invoke-static {v10, v5}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-eqz v10, :cond_d

    .line 344
    .line 345
    if-ltz v9, :cond_c

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :cond_d
    add-int/2addr v9, v11

    .line 352
    goto :goto_3

    .line 353
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    :goto_4
    if-ge v6, p1, :cond_22

    .line 358
    .line 359
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    check-cast v0, Lcom/google/android/gms/common/api/internal/c0;

    .line 364
    .line 365
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    new-instance v3, Lcom/google/android/gms/common/api/x;

    .line 369
    .line 370
    invoke-direct {v3, v5}, Lcom/google/android/gms/common/api/x;-><init>(Ld7/d;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/c0;->b(Ljava/lang/RuntimeException;)V

    .line 374
    .line 375
    .line 376
    add-int/2addr v6, v11

    .line 377
    goto :goto_4

    .line 378
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p1, Lcom/google/android/gms/common/api/internal/I;

    .line 381
    .line 382
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/I;->a:Lcom/google/android/gms/common/api/internal/b;

    .line 383
    .line 384
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_22

    .line 389
    .line 390
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/I;->a:Lcom/google/android/gms/common/api/internal/b;

    .line 391
    .line 392
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 397
    .line 398
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->j:Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    if-nez p1, :cond_f

    .line 405
    .line 406
    goto/16 :goto_e

    .line 407
    .line 408
    :cond_f
    iget-boolean p1, v0, Lcom/google/android/gms/common/api/internal/H;->i:Z

    .line 409
    .line 410
    if-nez p1, :cond_22

    .line 411
    .line 412
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 413
    .line 414
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    if-nez p1, :cond_10

    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/H;->k()V

    .line 421
    .line 422
    .line 423
    return v11

    .line 424
    :cond_10
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/H;->d()V

    .line 425
    .line 426
    .line 427
    return v11

    .line 428
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p1, Lcom/google/android/gms/common/api/internal/F;

    .line 431
    .line 432
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/F;->a:Lcom/google/android/gms/common/api/internal/b;

    .line 433
    .line 434
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/F;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 439
    .line 440
    if-nez v1, :cond_11

    .line 441
    .line 442
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 443
    .line 444
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return v11

    .line 448
    :cond_11
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 453
    .line 454
    invoke-virtual {v0, v6}, Lcom/google/android/gms/common/api/internal/H;->j(Z)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return v11

    .line 466
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 467
    .line 468
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_22

    .line 473
    .line 474
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 475
    .line 476
    invoke-virtual {v2, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    check-cast p1, Lcom/google/android/gms/common/api/internal/H;

    .line 481
    .line 482
    invoke-virtual {p1, v11}, Lcom/google/android/gms/common/api/internal/H;->j(Z)Z

    .line 483
    .line 484
    .line 485
    return v11

    .line 486
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 487
    .line 488
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_22

    .line 493
    .line 494
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 495
    .line 496
    invoke-virtual {v2, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    check-cast p1, Lcom/google/android/gms/common/api/internal/H;

    .line 501
    .line 502
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/H;->m:Lcom/google/android/gms/common/api/internal/i;

    .line 503
    .line 504
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 505
    .line 506
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->d(Landroid/os/Handler;)V

    .line 507
    .line 508
    .line 509
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/H;->i:Z

    .line 510
    .line 511
    if-eqz v1, :cond_22

    .line 512
    .line 513
    if-eqz v1, :cond_12

    .line 514
    .line 515
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/H;->m:Lcom/google/android/gms/common/api/internal/i;

    .line 516
    .line 517
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 518
    .line 519
    const/16 v3, 0xb

    .line 520
    .line 521
    iget-object v4, p1, Lcom/google/android/gms/common/api/internal/H;->c:Lcom/google/android/gms/common/api/internal/b;

    .line 522
    .line 523
    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 527
    .line 528
    const/16 v2, 0x9

    .line 529
    .line 530
    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    iput-boolean v6, p1, Lcom/google/android/gms/common/api/internal/H;->i:Z

    .line 534
    .line 535
    :cond_12
    sget v1, Ld7/f;->a:I

    .line 536
    .line 537
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 538
    .line 539
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/i;->f:Ld7/e;

    .line 540
    .line 541
    invoke-virtual {v0, v2, v1}, Ld7/f;->d(Landroid/content/Context;I)I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    const/16 v1, 0x12

    .line 546
    .line 547
    if-ne v0, v1, :cond_13

    .line 548
    .line 549
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 550
    .line 551
    const/16 v1, 0x15

    .line 552
    .line 553
    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    .line 554
    .line 555
    invoke-direct {v0, v1, v2, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 556
    .line 557
    .line 558
    goto :goto_5

    .line 559
    :cond_13
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 560
    .line 561
    const/16 v1, 0x16

    .line 562
    .line 563
    const-string v2, "API failed to connect while resuming due to an unknown error."

    .line 564
    .line 565
    invoke-direct {v0, v1, v2, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 566
    .line 567
    .line 568
    :goto_5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/H;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 569
    .line 570
    .line 571
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 572
    .line 573
    const-string v0, "Timing out connection while resuming."

    .line 574
    .line 575
    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    return v11

    .line 579
    :pswitch_8
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->m:Lx/f;

    .line 580
    .line 581
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    new-instance v0, Lx/a;

    .line 585
    .line 586
    invoke-direct {v0, p1}, Lx/a;-><init>(Lx/f;)V

    .line 587
    .line 588
    .line 589
    :cond_14
    :goto_6
    invoke-virtual {v0}, Lx/a;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_15

    .line 594
    .line 595
    invoke-virtual {v0}, Lx/a;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    check-cast v1, Lcom/google/android/gms/common/api/internal/b;

    .line 600
    .line 601
    invoke-virtual {v2, v1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    check-cast v1, Lcom/google/android/gms/common/api/internal/H;

    .line 606
    .line 607
    if-eqz v1, :cond_14

    .line 608
    .line 609
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/H;->o()V

    .line 610
    .line 611
    .line 612
    goto :goto_6

    .line 613
    :cond_15
    invoke-virtual {p1}, Lx/f;->clear()V

    .line 614
    .line 615
    .line 616
    return v11

    .line 617
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 618
    .line 619
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_22

    .line 624
    .line 625
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 626
    .line 627
    invoke-virtual {v2, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    check-cast p1, Lcom/google/android/gms/common/api/internal/H;

    .line 632
    .line 633
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/H;->m:Lcom/google/android/gms/common/api/internal/i;

    .line 634
    .line 635
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 636
    .line 637
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->d(Landroid/os/Handler;)V

    .line 638
    .line 639
    .line 640
    iget-boolean v0, p1, Lcom/google/android/gms/common/api/internal/H;->i:Z

    .line 641
    .line 642
    if-eqz v0, :cond_22

    .line 643
    .line 644
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/H;->k()V

    .line 645
    .line 646
    .line 647
    return v11

    .line 648
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast p1, Lcom/google/android/gms/common/api/l;

    .line 651
    .line 652
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/i;->f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/H;

    .line 653
    .line 654
    .line 655
    return v11

    .line 656
    :pswitch_b
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->e:Landroid/content/Context;

    .line 657
    .line 658
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    instance-of v0, v0, Landroid/app/Application;

    .line 663
    .line 664
    if-eqz v0, :cond_22

    .line 665
    .line 666
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    check-cast p1, Landroid/app/Application;

    .line 671
    .line 672
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/d;->c(Landroid/app/Application;)V

    .line 673
    .line 674
    .line 675
    sget-object p1, Lcom/google/android/gms/common/api/internal/d;->e:Lcom/google/android/gms/common/api/internal/d;

    .line 676
    .line 677
    new-instance v0, Lcom/google/android/gms/common/api/internal/G;

    .line 678
    .line 679
    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/internal/G;-><init>(Lcom/google/android/gms/common/api/internal/i;)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d;->a(Lcom/google/android/gms/common/api/internal/c;)V

    .line 683
    .line 684
    .line 685
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 692
    .line 693
    if-nez v1, :cond_1a

    .line 694
    .line 695
    sget-object v1, Ln7/c;->k:Ljava/lang/Boolean;

    .line 696
    .line 697
    if-nez v1, :cond_18

    .line 698
    .line 699
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 700
    .line 701
    const/16 v2, 0x1c

    .line 702
    .line 703
    if-lt v1, v2, :cond_16

    .line 704
    .line 705
    invoke-static {}, Llc/f;->l()Z

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    goto :goto_7

    .line 714
    :cond_16
    :try_start_0
    const-class v1, Landroid/os/Process;

    .line 715
    .line 716
    const-string v2, "isIsolated"

    .line 717
    .line 718
    new-array v5, v6, [Lcom/google/android/gms/internal/common/zzi;

    .line 719
    .line 720
    invoke-static {v1, v2, v5}, Lcom/google/android/gms/internal/common/zzj;->zza(Ljava/lang/Class;Ljava/lang/String;[Lcom/google/android/gms/internal/common/zzi;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    new-array v2, v6, [Ljava/lang/Object;

    .line 725
    .line 726
    const-string v5, "expected a non-null reference"

    .line 727
    .line 728
    if-eqz v1, :cond_17

    .line 729
    .line 730
    check-cast v1, Ljava/lang/Boolean;

    .line 731
    .line 732
    goto :goto_7

    .line 733
    :cond_17
    new-instance v1, Lcom/google/android/gms/internal/common/zzy;

    .line 734
    .line 735
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/common/zzx;->zza(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/common/zzy;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    throw v1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 743
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 744
    .line 745
    :goto_7
    sput-object v1, Ln7/c;->k:Ljava/lang/Boolean;

    .line 746
    .line 747
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-nez v1, :cond_19

    .line 752
    .line 753
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 754
    .line 755
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-nez v0, :cond_1a

    .line 766
    .line 767
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 768
    .line 769
    const/16 v1, 0x64

    .line 770
    .line 771
    if-le v0, v1, :cond_1a

    .line 772
    .line 773
    invoke-virtual {p1, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 774
    .line 775
    .line 776
    goto :goto_8

    .line 777
    :cond_19
    move p1, v11

    .line 778
    goto :goto_9

    .line 779
    :cond_1a
    :goto_8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 780
    .line 781
    .line 782
    move-result p1

    .line 783
    :goto_9
    if-nez p1, :cond_22

    .line 784
    .line 785
    iput-wide v3, p0, Lcom/google/android/gms/common/api/internal/i;->a:J

    .line 786
    .line 787
    goto/16 :goto_e

    .line 788
    .line 789
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 790
    .line 791
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast p1, Ld7/b;

    .line 794
    .line 795
    invoke-virtual {v2}, Lj$/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    if-eqz v2, :cond_1c

    .line 808
    .line 809
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    check-cast v2, Lcom/google/android/gms/common/api/internal/H;

    .line 814
    .line 815
    iget v3, v2, Lcom/google/android/gms/common/api/internal/H;->g:I

    .line 816
    .line 817
    if-ne v3, v0, :cond_1b

    .line 818
    .line 819
    goto :goto_a

    .line 820
    :cond_1c
    move-object v2, v10

    .line 821
    :goto_a
    if-eqz v2, :cond_1e

    .line 822
    .line 823
    iget v0, p1, Ld7/b;->b:I

    .line 824
    .line 825
    const/16 v1, 0xd

    .line 826
    .line 827
    if-ne v0, v1, :cond_1d

    .line 828
    .line 829
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 830
    .line 831
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/i;->f:Ld7/e;

    .line 832
    .line 833
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    sget v3, Ld7/i;->e:I

    .line 837
    .line 838
    invoke-static {v0}, Ld7/b;->W(I)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    const-string v3, "Error resolution was canceled by the user, original error message: "

    .line 843
    .line 844
    const-string v4, ": "

    .line 845
    .line 846
    invoke-static {v3, v0, v4}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    iget-object p1, p1, Ld7/b;->d:Ljava/lang/String;

    .line 851
    .line 852
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object p1

    .line 859
    invoke-direct {v1, v9, p1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/H;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 863
    .line 864
    .line 865
    return v11

    .line 866
    :cond_1d
    iget-object v0, v2, Lcom/google/android/gms/common/api/internal/H;->c:Lcom/google/android/gms/common/api/internal/b;

    .line 867
    .line 868
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/i;->e(Lcom/google/android/gms/common/api/internal/b;Ld7/b;)Lcom/google/android/gms/common/api/Status;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/H;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 873
    .line 874
    .line 875
    return v11

    .line 876
    :cond_1e
    const-string p1, "Could not find API instance "

    .line 877
    .line 878
    const-string v1, " while trying to fail enqueued calls."

    .line 879
    .line 880
    invoke-static {v0, p1, v1}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object p1

    .line 884
    new-instance v0, Ljava/lang/Exception;

    .line 885
    .line 886
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 887
    .line 888
    .line 889
    invoke-static {v5, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 890
    .line 891
    .line 892
    return v11

    .line 893
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast p1, Lcom/google/android/gms/common/api/internal/O;

    .line 896
    .line 897
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/O;->c:Lcom/google/android/gms/common/api/l;

    .line 898
    .line 899
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/b;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 908
    .line 909
    if-nez v0, :cond_1f

    .line 910
    .line 911
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/O;->c:Lcom/google/android/gms/common/api/l;

    .line 912
    .line 913
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/i;->f(Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/internal/H;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    :cond_1f
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 918
    .line 919
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/O;->a:Lcom/google/android/gms/common/api/internal/c0;

    .line 924
    .line 925
    if-eqz v1, :cond_20

    .line 926
    .line 927
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/i;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    iget p1, p1, Lcom/google/android/gms/common/api/internal/O;->b:I

    .line 934
    .line 935
    if-eq v1, p1, :cond_20

    .line 936
    .line 937
    sget-object p1, Lcom/google/android/gms/common/api/internal/i;->p:Lcom/google/android/gms/common/api/Status;

    .line 938
    .line 939
    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/c0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/H;->o()V

    .line 943
    .line 944
    .line 945
    return v11

    .line 946
    :cond_20
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/H;->l(Lcom/google/android/gms/common/api/internal/c0;)V

    .line 947
    .line 948
    .line 949
    return v11

    .line 950
    :pswitch_e
    invoke-virtual {v2}, Lj$/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 951
    .line 952
    .line 953
    move-result-object p1

    .line 954
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 955
    .line 956
    .line 957
    move-result-object p1

    .line 958
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 959
    .line 960
    .line 961
    move-result v0

    .line 962
    if-eqz v0, :cond_22

    .line 963
    .line 964
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 969
    .line 970
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->m:Lcom/google/android/gms/common/api/internal/i;

    .line 971
    .line 972
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 973
    .line 974
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->d(Landroid/os/Handler;)V

    .line 975
    .line 976
    .line 977
    iput-object v10, v0, Lcom/google/android/gms/common/api/internal/H;->k:Ld7/b;

    .line 978
    .line 979
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/H;->k()V

    .line 980
    .line 981
    .line 982
    goto :goto_b

    .line 983
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 984
    .line 985
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    new-instance p1, Ljava/lang/ClassCastException;

    .line 989
    .line 990
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 991
    .line 992
    .line 993
    throw p1

    .line 994
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 995
    .line 996
    check-cast p1, Ljava/lang/Boolean;

    .line 997
    .line 998
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 999
    .line 1000
    .line 1001
    move-result p1

    .line 1002
    if-eq v11, p1, :cond_21

    .line 1003
    .line 1004
    goto :goto_c

    .line 1005
    :cond_21
    const-wide/16 v3, 0x2710

    .line 1006
    .line 1007
    :goto_c
    iput-wide v3, p0, Lcom/google/android/gms/common/api/internal/i;->a:J

    .line 1008
    .line 1009
    const/16 p1, 0xc

    .line 1010
    .line 1011
    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v2}, Lj$/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    if-eqz v2, :cond_22

    .line 1027
    .line 1028
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    check-cast v2, Lcom/google/android/gms/common/api/internal/b;

    .line 1033
    .line 1034
    invoke-virtual {v1, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/i;->a:J

    .line 1039
    .line 1040
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1041
    .line 1042
    .line 1043
    goto :goto_d

    .line 1044
    :cond_22
    :goto_e
    return v11

    .line 1045
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcom/google/android/gms/common/api/l;Lcom/google/android/gms/common/api/internal/u;Lcom/google/android/gms/common/api/internal/B;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p2, Lcom/google/android/gms/common/api/internal/u;->c:I

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/common/api/internal/i;->g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILcom/google/android/gms/common/api/l;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/common/api/internal/P;

    .line 14
    .line 15
    invoke-direct {v2, p2, p3, p4}, Lcom/google/android/gms/common/api/internal/P;-><init>(Lcom/google/android/gms/common/api/internal/u;Lcom/google/android/gms/common/api/internal/B;Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/api/internal/a0;-><init>(Lcom/google/android/gms/common/api/internal/P;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/i;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    new-instance p3, Lcom/google/android/gms/common/api/internal/O;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-direct {p3, v1, p2, p1}, Lcom/google/android/gms/common/api/internal/O;-><init>(Lcom/google/android/gms/common/api/internal/c0;ILcom/google/android/gms/common/api/l;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 33
    .line 34
    const/16 p2, 0x8

    .line 35
    .line 36
    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final j(Ld7/b;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/api/internal/i;->d(Ld7/b;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
