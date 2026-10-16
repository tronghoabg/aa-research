.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LDd/c;

.field public final b:LVa/X7;

.field public final c:LG4/c;

.field public final d:LKd/a;

.field public final e:Lj$/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/HashSet;

.field public final g:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;LDd/c;LVa/X7;LG4/c;)V
    .locals 1

    .line 1
    const-string v0, "mediaConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->a:LDd/c;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->b:LVa/X7;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->c:LG4/c;

    .line 14
    .line 15
    sget-object p1, LEf/S;->a:LLf/e;

    .line 16
    .line 17
    sget-object p1, LLf/d;->b:LLf/d;

    .line 18
    .line 19
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->d:LKd/a;

    .line 24
    .line 25
    new-instance p2, Lj$/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {p2}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->e:Lj$/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance p2, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->f:Ljava/util/HashSet;

    .line 38
    .line 39
    new-instance p2, Lj$/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {p2}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->g:Lj$/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->b()Lcom/moloco/sdk/internal/A;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lcom/moloco/sdk/internal/y;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/moloco/sdk/internal/y;

    .line 15
    .line 16
    iget-object p1, v0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    instance-of v1, v0, Lcom/moloco/sdk/internal/z;

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    check-cast v0, Lcom/moloco/sdk/internal/z;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/io/File;

    .line 30
    .line 31
    invoke-static {p1}, LU8/v0;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->b:LVa/X7;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, LVa/X7;->j(Ljava/io/File;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;

    .line 55
    .line 56
    invoke-direct {p1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;-><init>(Ljava/io/File;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->g:Lj$/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_2
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 74
    .line 75
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;

    .line 76
    .line 77
    invoke-direct {p1, v2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;-><init>(Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_3
    new-instance p1, LE5/Q;

    .line 82
    .line 83
    const/16 v0, 0x9

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method

.method public final b()Lcom/moloco/sdk/internal/A;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->c()Lcom/moloco/sdk/internal/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/moloco/sdk/internal/y;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Failed to retrieve storageDir with error code: "

    .line 14
    .line 15
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Lcom/moloco/sdk/internal/y;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/moloco/sdk/internal/n;

    .line 23
    .line 24
    iget v3, v0, Lcom/moloco/sdk/internal/n;->b:I

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const-string v3, "MediaCacheRepository"

    .line 36
    .line 37
    const/16 v7, 0xc

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget v0, v0, Lcom/moloco/sdk/internal/n;->b:I

    .line 44
    .line 45
    packed-switch v0, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 49
    .line 50
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 51
    .line 52
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 53
    .line 54
    invoke-direct {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 62
    .line 63
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 64
    .line 65
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 66
    .line 67
    invoke-direct {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_1
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 75
    .line 76
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 77
    .line 78
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 79
    .line 80
    invoke-direct {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_2
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 88
    .line 89
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 90
    .line 91
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 92
    .line 93
    invoke-direct {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_0
    instance-of v1, v0, Lcom/moloco/sdk/internal/z;

    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    new-instance v1, Lcom/moloco/sdk/internal/z;

    .line 105
    .line 106
    check-cast v0, Lcom/moloco/sdk/internal/z;

    .line 107
    .line 108
    iget-object v0, v0, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-direct {v1, v0}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_1
    new-instance v0, LE5/Q;

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 120
    .line 121
    .line 122
    throw v0

    .line 123
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lcom/moloco/sdk/internal/A;
    .locals 15

    .line 1
    const-string v1, "com.moloco.sdk.xenoss.sdkdevkit.android.cache"

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->c:LG4/c;

    .line 4
    .line 5
    iget-object v2, v0, LG4/c;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v3, "Failed to create cache directory in external storage"

    .line 8
    .line 9
    const/16 v4, 0x65

    .line 10
    .line 11
    const/16 v5, 0x64

    .line 12
    .line 13
    const/16 v6, 0xc8

    .line 14
    .line 15
    const/16 v7, 0x66

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v8, Ljava/io/File;

    .line 24
    .line 25
    invoke-direct {v8, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/io/File;->mkdir()Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 38
    .line 39
    invoke-direct {v0, v8}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :catch_0
    move-exception v0

    .line 44
    move-object v11, v0

    .line 45
    goto :goto_0

    .line 46
    :catch_1
    move-exception v0

    .line 47
    move-object v11, v0

    .line 48
    goto :goto_1

    .line 49
    :catch_2
    move-exception v0

    .line 50
    move-object v11, v0

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 53
    .line 54
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 55
    .line 56
    const-string v10, "Failed to create cache directory in external storage"

    .line 57
    .line 58
    const/16 v13, 0xc

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 67
    .line 68
    new-instance v8, Lcom/moloco/sdk/internal/n;

    .line 69
    .line 70
    invoke-direct {v8, v3, v7}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v8}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :goto_0
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 78
    .line 79
    const/16 v13, 0x8

    .line 80
    .line 81
    const/4 v14, 0x0

    .line 82
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 83
    .line 84
    const-string v10, "Failed to create cache directory in external storage"

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 91
    .line 92
    new-instance v8, Lcom/moloco/sdk/internal/n;

    .line 93
    .line 94
    invoke-direct {v8, v3, v6}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, v8}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :goto_1
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 102
    .line 103
    const/16 v13, 0x8

    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 107
    .line 108
    const-string v10, "Failed to create cache directory in external storage"

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 115
    .line 116
    new-instance v8, Lcom/moloco/sdk/internal/n;

    .line 117
    .line 118
    invoke-direct {v8, v3, v5}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v0, v8}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :goto_2
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 126
    .line 127
    const/16 v13, 0x8

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 131
    .line 132
    const-string v10, "Failed to create cache directory in external storage"

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 139
    .line 140
    new-instance v8, Lcom/moloco/sdk/internal/n;

    .line 141
    .line 142
    invoke-direct {v8, v3, v4}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v0, v8}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :goto_3
    instance-of v3, v0, Lcom/moloco/sdk/internal/y;

    .line 149
    .line 150
    if-eqz v3, :cond_2

    .line 151
    .line 152
    const-string v3, "Failed to create cache directory in internal storage"

    .line 153
    .line 154
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    new-instance v0, Ljava/io/File;

    .line 161
    .line 162
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_1

    .line 177
    .line 178
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 179
    .line 180
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 181
    .line 182
    const-string v10, "Able to write to internal storage cache directory"

    .line 183
    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x4

    .line 186
    const/4 v13, 0x0

    .line 187
    invoke-static/range {v8 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    new-instance v1, Lcom/moloco/sdk/internal/z;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object v0, v1

    .line 196
    goto/16 :goto_7

    .line 197
    .line 198
    :catch_3
    move-exception v0

    .line 199
    move-object v10, v0

    .line 200
    goto :goto_4

    .line 201
    :catch_4
    move-exception v0

    .line 202
    move-object v9, v0

    .line 203
    goto :goto_5

    .line 204
    :catch_5
    move-exception v0

    .line 205
    move-object v8, v0

    .line 206
    goto :goto_6

    .line 207
    :cond_1
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 208
    .line 209
    const-string v9, "MediaCacheLocationProviderImpl"

    .line 210
    .line 211
    const-string v10, "Failed to create cache directory in internal storage"

    .line 212
    .line 213
    const/16 v13, 0xc

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 222
    .line 223
    new-instance v1, Lcom/moloco/sdk/internal/n;

    .line 224
    .line 225
    invoke-direct {v1, v3, v7}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :goto_4
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 233
    .line 234
    const/16 v12, 0x8

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const-string v8, "MediaCacheLocationProviderImpl"

    .line 238
    .line 239
    const-string v9, "Failed to create cache directory in external storage"

    .line 240
    .line 241
    const/4 v11, 0x0

    .line 242
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 246
    .line 247
    new-instance v1, Lcom/moloco/sdk/internal/n;

    .line 248
    .line 249
    invoke-direct {v1, v3, v6}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :goto_5
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 257
    .line 258
    const/16 v11, 0x8

    .line 259
    .line 260
    const/4 v12, 0x0

    .line 261
    const-string v7, "MediaCacheLocationProviderImpl"

    .line 262
    .line 263
    const-string v8, "Failed to create cache directory in external storage"

    .line 264
    .line 265
    const/4 v10, 0x0

    .line 266
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 270
    .line 271
    new-instance v1, Lcom/moloco/sdk/internal/n;

    .line 272
    .line 273
    invoke-direct {v1, v3, v5}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :goto_6
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 281
    .line 282
    const/16 v10, 0x8

    .line 283
    .line 284
    const/4 v11, 0x0

    .line 285
    const-string v6, "MediaCacheLocationProviderImpl"

    .line 286
    .line 287
    const-string v7, "Failed to create cache directory in external storage"

    .line 288
    .line 289
    const/4 v9, 0x0

    .line 290
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 294
    .line 295
    new-instance v1, Lcom/moloco/sdk/internal/n;

    .line 296
    .line 297
    invoke-direct {v1, v3, v4}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 298
    .line 299
    .line 300
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_2
    instance-of v1, v0, Lcom/moloco/sdk/internal/z;

    .line 305
    .line 306
    if-eqz v1, :cond_3

    .line 307
    .line 308
    :goto_7
    return-object v0

    .line 309
    :cond_3
    new-instance v0, LE5/Q;

    .line 310
    .line 311
    const/16 v1, 0x9

    .line 312
    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 315
    .line 316
    .line 317
    throw v0
.end method
