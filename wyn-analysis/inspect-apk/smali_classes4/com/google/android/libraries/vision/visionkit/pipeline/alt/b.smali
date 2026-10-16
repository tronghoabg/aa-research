.class public abstract Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA/x;

.field public final b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

.field public c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;


# direct methods
.method public constructor <init>(LH7/u;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;->zbb()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, LH7/u;->f()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Landroidx/fragment/app/X;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v2, v3}, Landroidx/fragment/app/X;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual/range {p1 .. p1}, LH7/u;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    new-instance v2, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;

    .line 38
    .line 39
    invoke-direct {v2, v0, v0, v0, v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;-><init>(Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v2, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;

    .line 46
    .line 47
    invoke-direct {v2, v0, v0, v0, v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/NativePipelineImpl;-><init>(Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;)V

    .line 48
    .line 49
    .line 50
    const-string v3, "mlkit_google_ocr_pipeline"

    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 56
    .line 57
    :goto_0
    invoke-virtual/range {p1 .. p1}, LH7/u;->zbi()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    new-instance v2, LA/x;

    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, LH7/u;->a()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-direct {v2, v3}, LA/x;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v2, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->a:LA/x;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    new-instance v2, LA/x;

    .line 76
    .line 77
    const/16 v3, 0xa

    .line 78
    .line 79
    invoke-direct {v2, v3}, LA/x;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object v2, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->a:LA/x;

    .line 83
    .line 84
    :goto_1
    iput-object v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->h:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 85
    .line 86
    iget-object v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 87
    .line 88
    invoke-interface {v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->initializeFrameManager()J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    iput-wide v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->d:J

    .line 93
    .line 94
    iget-object v3, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 95
    .line 96
    invoke-interface {v3, v1, v2}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->initializeFrameBufferReleaseCallback(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v6

    .line 100
    iput-wide v6, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->e:J

    .line 101
    .line 102
    iget-object v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 103
    .line 104
    invoke-interface {v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->initializeResultsCallback()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    iput-wide v8, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->f:J

    .line 109
    .line 110
    iget-object v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 111
    .line 112
    invoke-interface {v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->initializeIsolationCallback()J

    .line 113
    .line 114
    .line 115
    move-result-wide v10

    .line 116
    iput-wide v10, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->g:J

    .line 117
    .line 118
    iget-object v4, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 119
    .line 120
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbsj;->zbl()[B

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-wide/16 v12, 0x0

    .line 125
    .line 126
    const-wide/16 v14, 0x0

    .line 127
    .line 128
    invoke-interface/range {v4 .. v15}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->initialize([BJJJJJ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    iput-wide v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final a(LH7/n;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->a:LA/x;

    .line 14
    .line 15
    iget-wide v3, v0, LH7/n;->b:J

    .line 16
    .line 17
    const-string v5, "Buffer is full. Drop frame "

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    iget-object v6, v2, LA/x;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/util/HashMap;->size()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget v7, v2, LA/x;->b:I

    .line 29
    .line 30
    if-ne v6, v7, :cond_0

    .line 31
    .line 32
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcq;->zba:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcq;

    .line 33
    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x0

    .line 47
    new-array v4, v4, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v0, v2, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcq;->zbc(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v2

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :try_start_1
    iget-object v5, v2, LA/x;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v5, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit v2

    .line 68
    iget-object v6, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 69
    .line 70
    iget-wide v7, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 71
    .line 72
    iget-wide v9, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->d:J

    .line 73
    .line 74
    iget-wide v11, v0, LH7/n;->b:J

    .line 75
    .line 76
    iget-object v13, v0, LH7/n;->a:[B

    .line 77
    .line 78
    iget-object v2, v0, LH7/n;->c:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcr;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcr;->zbb()I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    iget-object v2, v0, LH7/n;->c:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcr;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcr;->zba()I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    iget v0, v0, LH7/n;->d:I

    .line 91
    .line 92
    add-int/lit8 v17, v0, -0x1

    .line 93
    .line 94
    const/16 v16, 0x1

    .line 95
    .line 96
    invoke-interface/range {v6 .. v17}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->process(JJJ[BIIII)[B

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez v0, :cond_1

    .line 101
    .line 102
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbd()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :cond_1
    :try_start_2
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->h:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 108
    .line 109
    invoke-static {v0, v2}, LH7/E;->b([BLcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;)LH7/E;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbe(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_2
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuq; {:try_start_2 .. :try_end_2} :catch_0

    .line 117
    return-object v0

    .line 118
    :catch_0
    move-exception v0

    .line 119
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    const-string v3, "Could not parse results"

    .line 122
    .line 123
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw v2

    .line 127
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    throw v0

    .line 129
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v2, "Pipeline has been closed or was not initialized"

    .line 132
    .line 133
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0
.end method

.method public final b(JLandroid/graphics/Bitmap;I)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;
    .locals 12

    .line 1
    iget-wide v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-wide v3, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    add-int/lit8 v11, p4, -0x1

    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    move-wide v5, p1

    .line 33
    move-object v7, p3

    .line 34
    invoke-interface/range {v2 .. v11}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->processBitmap(JJLandroid/graphics/Bitmap;IIII)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbd()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    :try_start_0
    iget-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->h:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 46
    .line 47
    invoke-static {p1, p2}, LH7/E;->b([BLcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;)LH7/E;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbe(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuq; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    return-object p1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p3, "Could not parse results"

    .line 61
    .line 62
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p2

    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const-string p3, "Unsupported bitmap config "

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string p2, "Pipeline has been closed or was not initialized"

    .line 89
    .line 90
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method

.method public final c(JLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-wide v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 4
    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    cmp-long v0, v2, v4

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual/range {p5 .. p5}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-wide v3, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 30
    .line 31
    add-int/lit8 v15, p11, -0x1

    .line 32
    .line 33
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 34
    .line 35
    move-wide/from16 v5, p1

    .line 36
    .line 37
    move-object/from16 v7, p3

    .line 38
    .line 39
    move-object/from16 v8, p4

    .line 40
    .line 41
    move-object/from16 v9, p5

    .line 42
    .line 43
    move/from16 v10, p6

    .line 44
    .line 45
    move/from16 v11, p7

    .line 46
    .line 47
    move/from16 v12, p8

    .line 48
    .line 49
    move/from16 v13, p9

    .line 50
    .line 51
    move/from16 v14, p10

    .line 52
    .line 53
    invoke-interface/range {v2 .. v15}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->processYuvFrame(JJLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)[B

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbd()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_0
    :try_start_0
    iget-object v2, v1, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->h:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;

    .line 65
    .line 66
    invoke-static {v0, v2}, LH7/E;->b([BLcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtp;)LH7/E;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbe(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuq; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object v0

    .line 75
    :catch_0
    move-exception v0

    .line 76
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v3, "Could not parse results"

    .line 79
    .line 80
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v2

    .line 84
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v2, "Byte buffers are not direct."

    .line 87
    .line 88
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v2, "Pipeline has been closed or was not initialized"

    .line 95
    .line 96
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method
