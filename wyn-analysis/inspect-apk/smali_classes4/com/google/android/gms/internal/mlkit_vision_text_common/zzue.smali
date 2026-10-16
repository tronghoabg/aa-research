.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/common/internal/z;

.field private final zzb:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzb:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    new-instance v6, Lcom/google/android/gms/common/internal/A;

    .line 14
    .line 15
    const-string p2, "mlkit:vision"

    .line 16
    .line 17
    invoke-direct {v6, p2}, Lcom/google/android/gms/common/internal/A;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lg7/b;

    .line 21
    .line 22
    sget-object v7, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    sget-object v5, Lg7/b;->a:Lcom/google/android/gms/common/api/i;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zza:Lcom/google/android/gms/common/internal/z;

    .line 32
    .line 33
    return-void
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    .line 2
    .line 3
    const-string v1, "mlkit:vision"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final synthetic zzb(JLjava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzb:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized zzc(IIJJ)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzb:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    const-wide/16 v7, -0x1

    .line 16
    .line 17
    cmp-long v2, v5, v7

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzb:Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    sub-long v5, v3, v5

    .line 29
    .line 30
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    const-wide/16 v7, 0x1e

    .line 33
    .line 34
    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    cmp-long v2, v5, v7

    .line 39
    .line 40
    if-gtz v2, :cond_1

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :cond_1
    :goto_0
    :try_start_1
    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zza:Lcom/google/android/gms/common/internal/z;

    .line 45
    .line 46
    new-instance v5, Lcom/google/android/gms/common/internal/y;

    .line 47
    .line 48
    new-instance v6, Lcom/google/android/gms/common/internal/t;

    .line 49
    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    const/16 v17, -0x1

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    move/from16 v7, p1

    .line 58
    .line 59
    move/from16 v8, p2

    .line 60
    .line 61
    move-wide/from16 v10, p3

    .line 62
    .line 63
    move-wide/from16 v12, p5

    .line 64
    .line 65
    invoke-direct/range {v6 .. v17}, Lcom/google/android/gms/common/internal/t;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 66
    .line 67
    .line 68
    const/4 v7, 0x1

    .line 69
    new-array v7, v7, [Lcom/google/android/gms/common/internal/t;

    .line 70
    .line 71
    aput-object v6, v7, v0

    .line 72
    .line 73
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-direct {v5, v0, v6}, Lcom/google/android/gms/common/internal/y;-><init>(ILjava/util/List;)V

    .line 78
    .line 79
    .line 80
    check-cast v2, Lg7/b;

    .line 81
    .line 82
    invoke-virtual {v2, v5}, Lg7/b;->c(Lcom/google/android/gms/common/internal/y;)Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;

    .line 87
    .line 88
    invoke-direct {v2, v1, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzud;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    monitor-exit p0

    .line 95
    return-void

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    throw v0
.end method
