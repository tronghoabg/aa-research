.class public final LEa/a;
.super LE9/c;
.source "SourceFile"


# static fields
.field public static final h:LA7/b0;

.field public static i:Z = true

.field public static final j:LBa/a;


# instance fields
.field public final d:LEa/e;

.field public final e:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

.field public final f:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

.field public final g:LCa/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LBa/a;->b:LBa/a;

    .line 2
    .line 3
    sput-object v0, LEa/a;->j:LBa/a;

    .line 4
    .line 5
    new-instance v0, LA7/b0;

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v2, v1}, LA7/b0;-><init>(BI)V

    .line 11
    .line 12
    .line 13
    sput-object v0, LEa/a;->h:LA7/b0;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;LEa/e;LCa/h;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, LEa/a;->h:LA7/b0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, LE9/c;-><init>(LA7/b0;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LEa/a;->e:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    .line 10
    .line 11
    iput-object p2, p0, LEa/a;->d:LEa/e;

    .line 12
    .line 13
    invoke-static {}, Lya/g;->c()Lya/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lya/g;->b()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, LEa/a;->f:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    .line 26
    .line 27
    iput-object p3, p0, LEa/a;->g:LCa/h;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final w(LAa/a;)LCa/f;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    iget-object v2, p0, LEa/a;->d:LEa/e;

    .line 7
    .line 8
    invoke-interface {v2, p1}, LEa/e;->c(LAa/a;)LCa/f;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 13
    .line 14
    invoke-virtual {p0, v3, v0, v1, p1}, LEa/a;->x(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLAa/a;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    sput-boolean v3, LEa/a;->i:Z
    :try_end_1
    .catch Lua/a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v2

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :catch_0
    move-exception v2

    .line 25
    :try_start_2
    iget v3, v2, Lua/a;->a:I

    .line 26
    .line 27
    const/16 v4, 0xe

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzk:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzab:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 35
    .line 36
    :goto_0
    invoke-virtual {p0, v3, v0, v1, p1}, LEa/a;->x(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLAa/a;)V

    .line 37
    .line 38
    .line 39
    throw v2

    .line 40
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1
.end method

.method public final x(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLAa/a;)V
    .locals 18

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long v2, v0, p2

    .line 6
    .line 7
    new-instance v0, LA7/S;

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    move-object/from16 v5, p4

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, LA7/S;-><init>(LEa/a;JLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;LAa/a;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, v1, LEa/a;->e:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    .line 19
    .line 20
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 21
    .line 22
    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;-><init>()V

    .line 28
    .line 29
    .line 30
    move-object/from16 v9, p1

    .line 31
    .line 32
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    .line 33
    .line 34
    .line 35
    sget-boolean v4, LEa/a;->i:Z

    .line 36
    .line 37
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzb(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    .line 42
    .line 43
    .line 44
    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 45
    .line 46
    invoke-direct {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v10, v1, LEa/a;->g:LCa/h;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-static {v5}, LA6/c;->P(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzd()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    new-instance v8, LEa/i;

    .line 74
    .line 75
    invoke-direct {v8, v1}, LEa/i;-><init>(LEa/a;)V

    .line 76
    .line 77
    .line 78
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzbi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 79
    .line 80
    sget-object v0, Lya/n;->a:Lya/n;

    .line 81
    .line 82
    move-wide v6, v2

    .line 83
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;

    .line 84
    .line 85
    iget-object v3, v1, LEa/a;->e:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    .line 86
    .line 87
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/Object;JLEa/i;)V

    .line 88
    .line 89
    .line 90
    move-object v4, v2

    .line 91
    move-wide v2, v6

    .line 92
    invoke-virtual {v0, v4}, Lya/n;->execute(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v16

    .line 99
    sub-long v14, v16, v2

    .line 100
    .line 101
    invoke-interface {v10}, LCa/h;->d()I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    iget-object v11, v1, LEa/a;->f:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    .line 110
    .line 111
    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzc(IIJJ)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
