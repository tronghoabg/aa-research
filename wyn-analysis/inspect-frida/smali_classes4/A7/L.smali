.class public final LA7/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:LA7/L;

.field public static final e:Lj$/time/Duration;


# instance fields
.field public final a:LA7/n0;

.field public final b:Lg7/b;

.field public final c:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x1e

    .line 2
    .line 3
    invoke-static {v0, v1}, Lj$/time/Duration;->ofMinutes(J)Lj$/time/Duration;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LA7/L;->e:Lj$/time/Duration;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA7/n0;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LA7/L;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    new-instance v7, Lcom/google/android/gms/common/internal/A;

    .line 14
    .line 15
    const-string v0, "measurement:api"

    .line 16
    .line 17
    invoke-direct {v7, v0}, Lcom/google/android/gms/common/internal/A;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lg7/b;

    .line 21
    .line 22
    sget-object v8, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    sget-object v6, Lg7/b;->a:Lcom/google/android/gms/common/api/i;

    .line 26
    .line 27
    move-object v4, p1

    .line 28
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, LA7/L;->b:Lg7/b;

    .line 32
    .line 33
    iput-object p2, p0, LA7/L;->a:LA7/n0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(IIJJ)V
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
    iget-object v2, v1, LA7/L;->a:LA7/n0;

    .line 6
    .line 7
    iget-object v2, v2, LA7/n0;->n:Ln7/b;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object v4, v1, LA7/L;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    const-wide/16 v6, -0x1

    .line 23
    .line 24
    cmp-long v4, v4, v6

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v4, v1, LA7/L;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    sub-long v4, v2, v4

    .line 36
    .line 37
    sget-object v6, LA7/L;->e:Lj$/time/Duration;

    .line 38
    .line 39
    invoke-virtual {v6}, Lj$/time/Duration;->toMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v6

    .line 43
    cmp-long v4, v4, v6

    .line 44
    .line 45
    if-lez v4, :cond_1

    .line 46
    .line 47
    :goto_0
    iget-object v4, v1, LA7/L;->b:Lg7/b;

    .line 48
    .line 49
    new-instance v5, Lcom/google/android/gms/common/internal/y;

    .line 50
    .line 51
    new-instance v6, Lcom/google/android/gms/common/internal/t;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const v7, 0x8dcd

    .line 59
    .line 60
    .line 61
    move/from16 v8, p1

    .line 62
    .line 63
    move/from16 v17, p2

    .line 64
    .line 65
    move-wide/from16 v10, p3

    .line 66
    .line 67
    move-wide/from16 v12, p5

    .line 68
    .line 69
    invoke-direct/range {v6 .. v17}, Lcom/google/android/gms/common/internal/t;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 70
    .line 71
    .line 72
    const/4 v7, 0x1

    .line 73
    new-array v7, v7, [Lcom/google/android/gms/common/internal/t;

    .line 74
    .line 75
    aput-object v6, v7, v0

    .line 76
    .line 77
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-direct {v5, v0, v6}, Lcom/google/android/gms/common/internal/y;-><init>(ILjava/util/List;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v5}, Lg7/b;->c(Lcom/google/android/gms/common/internal/y;)Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v4, LA2/d;

    .line 89
    .line 90
    const/4 v5, 0x2

    .line 91
    invoke-direct {v4, v5}, LA2/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v4, LA2/d;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iput-wide v2, v4, LA2/d;->b:J

    .line 97
    .line 98
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    monitor-exit p0

    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    monitor-exit p0

    .line 106
    return-void

    .line 107
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw v0
.end method
