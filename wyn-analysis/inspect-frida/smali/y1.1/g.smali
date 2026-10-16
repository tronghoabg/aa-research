.class public final Ly1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/lang/Object;

.field public static volatile j:Ly1/g;


# instance fields
.field public final a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final b:Lx/f;

.field public volatile c:I

.field public final d:Landroid/os/Handler;

.field public final e:LN8/b;

.field public final f:Ly1/f;

.field public final g:I

.field public final h:Ly1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/g;->i:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ly1/k;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Ly1/g;->c:I

    .line 13
    .line 14
    iget-object v1, p1, Ly1/k;->a:Ly1/f;

    .line 15
    .line 16
    iput-object v1, p0, Ly1/g;->f:Ly1/f;

    .line 17
    .line 18
    iget v2, p1, Ly1/k;->b:I

    .line 19
    .line 20
    iput v2, p0, Ly1/g;->g:I

    .line 21
    .line 22
    iget-object p1, p1, Ly1/k;->c:Ly1/c;

    .line 23
    .line 24
    iput-object p1, p0, Ly1/g;->h:Ly1/c;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly1/g;->d:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance p1, Lx/f;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {p1, v3}, Lx/f;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Ly1/g;->b:Lx/f;

    .line 44
    .line 45
    new-instance p1, LN8/b;

    .line 46
    .line 47
    invoke-direct {p1, p0}, LN8/b;-><init>(Ly1/g;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Ly1/g;->e:LN8/b;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 57
    .line 58
    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    :try_start_0
    iput v3, p0, Ly1/g;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ly1/g;->b()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    :try_start_1
    new-instance v0, Ly1/d;

    .line 89
    .line 90
    invoke-direct {v0, p1}, Ly1/d;-><init>(LN8/b;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v0}, Ly1/f;->a(Ltg/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    invoke-virtual {p0, p1}, Ly1/g;->d(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method public static a()Ly1/g;
    .locals 4

    .line 1
    sget-object v0, Ly1/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ly1/g;->j:Ly1/g;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
.end method


# virtual methods
.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Ly1/g;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Ly1/g;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Ly1/g;->b()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget v0, p0, Ly1/g;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :try_start_1
    iput v1, p0, Ly1/g;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ly1/g;->e:LN8/b;

    .line 54
    .line 55
    iget-object v1, v0, LN8/b;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ly1/g;

    .line 58
    .line 59
    :try_start_2
    new-instance v2, Ly1/d;

    .line 60
    .line 61
    invoke-direct {v2, v0}, Ly1/d;-><init>(LN8/b;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, v1, Ly1/g;->f:Ly1/f;

    .line 65
    .line 66
    invoke-interface {v0, v2}, Ly1/f;->a(Ltg/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    invoke-virtual {v1, v0}, Ly1/g;->d(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-void

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    :try_start_0
    iput v1, p0, Ly1/g;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Ly1/g;->b:Lx/f;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ly1/g;->b:Lx/f;

    .line 24
    .line 25
    invoke-virtual {v1}, Lx/f;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Ly1/g;->d:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, LR3/c;

    .line 40
    .line 41
    iget v3, p0, Ly1/g;->c:I

    .line 42
    .line 43
    invoke-direct {v2, v0, v3, p1}, LR3/c;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final e(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ly1/g;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_1f

    .line 13
    .line 14
    if-ltz p2, :cond_1e

    .line 15
    .line 16
    if-ltz p3, :cond_1d

    .line 17
    .line 18
    if-gt p2, p3, :cond_1

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_1
    const-string v3, "start should be <= than end"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lj1/d;->a(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-gt p2, v3, :cond_3

    .line 37
    .line 38
    move v3, v2

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v3, v1

    .line 41
    :goto_2
    const-string v4, "start should be < than charSequence length"

    .line 42
    .line 43
    invoke-static {v4, v3}, Lj1/d;->a(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-gt p3, v3, :cond_4

    .line 51
    .line 52
    move v3, v2

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move v3, v1

    .line 55
    :goto_3
    const-string v4, "end should be < than charSequence length"

    .line 56
    .line 57
    invoke-static {v4, v3}, Lj1/d;->a(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1c

    .line 65
    .line 66
    if-ne p2, p3, :cond_5

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_5
    iget-object v3, p0, Ly1/g;->e:LN8/b;

    .line 71
    .line 72
    iget-object v3, v3, LN8/b;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lba/a;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v4, p1, Ly1/n;

    .line 80
    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    move-object v5, p1

    .line 84
    check-cast v5, Ly1/n;

    .line 85
    .line 86
    invoke-virtual {v5}, Ly1/n;->a()V

    .line 87
    .line 88
    .line 89
    :cond_6
    const-class v5, Ly1/o;

    .line 90
    .line 91
    if-nez v4, :cond_8

    .line 92
    .line 93
    :try_start_0
    instance-of v6, p1, Landroid/text/Spannable;

    .line 94
    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_7
    instance-of v6, p1, Landroid/text/Spanned;

    .line 99
    .line 100
    if-eqz v6, :cond_9

    .line 101
    .line 102
    move-object v6, p1

    .line 103
    check-cast v6, Landroid/text/Spanned;

    .line 104
    .line 105
    add-int/lit8 v7, p2, -0x1

    .line 106
    .line 107
    add-int/lit8 v8, p3, 0x1

    .line 108
    .line 109
    invoke-interface {v6, v7, v8, v5}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-gt v6, p3, :cond_9

    .line 114
    .line 115
    new-instance v0, Ly1/s;

    .line 116
    .line 117
    invoke-direct {v0, p1}, Ly1/s;-><init>(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :catchall_0
    move-exception p2

    .line 122
    goto/16 :goto_b

    .line 123
    .line 124
    :cond_8
    :goto_4
    new-instance v0, Ly1/s;

    .line 125
    .line 126
    move-object v6, p1

    .line 127
    check-cast v6, Landroid/text/Spannable;

    .line 128
    .line 129
    invoke-direct {v0, v6}, Ly1/s;-><init>(Landroid/text/Spannable;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    :goto_5
    if-eqz v0, :cond_b

    .line 133
    .line 134
    iget-object v6, v0, Ly1/s;->b:Landroid/text/Spannable;

    .line 135
    .line 136
    invoke-interface {v6, p2, p3, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    check-cast v5, [Ly1/o;

    .line 141
    .line 142
    if-eqz v5, :cond_b

    .line 143
    .line 144
    array-length v6, v5

    .line 145
    if-lez v6, :cond_b

    .line 146
    .line 147
    array-length v6, v5

    .line 148
    move v7, v1

    .line 149
    :goto_6
    if-ge v7, v6, :cond_b

    .line 150
    .line 151
    aget-object v8, v5, v7

    .line 152
    .line 153
    iget-object v9, v0, Ly1/s;->b:Landroid/text/Spannable;

    .line 154
    .line 155
    invoke-interface {v9, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    iget-object v10, v0, Ly1/s;->b:Landroid/text/Spannable;

    .line 160
    .line 161
    invoke-interface {v10, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    if-eq v9, p3, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0, v8}, Ly1/s;->removeSpan(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_a
    invoke-static {v9, p2}, Ljava/lang/Math;->min(II)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-static {v10, p3}, Ljava/lang/Math;->max(II)I

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    add-int/lit8 v7, v7, 0x1

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_b
    if-eq p2, p3, :cond_1a

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-lt p2, v5, :cond_c

    .line 188
    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :cond_c
    new-instance v5, LD0/b;

    .line 192
    .line 193
    iget-object v6, v3, Lba/a;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v6, LVa/X7;

    .line 196
    .line 197
    iget-object v6, v6, LVa/X7;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v6, Ly1/l;

    .line 200
    .line 201
    invoke-direct {v5, v6}, LD0/b;-><init>(Ly1/l;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    move v7, v6

    .line 209
    move v6, v1

    .line 210
    move-object v1, v0

    .line 211
    :cond_d
    :goto_7
    move v0, p2

    .line 212
    :cond_e
    :goto_8
    const/16 v8, 0x21

    .line 213
    .line 214
    const v9, 0x7fffffff

    .line 215
    .line 216
    .line 217
    const/4 v10, 0x2

    .line 218
    if-ge p2, p3, :cond_14

    .line 219
    .line 220
    if-ge v6, v9, :cond_14

    .line 221
    .line 222
    invoke-virtual {v5, v7}, LD0/b;->a(I)I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    if-eq v9, v2, :cond_12

    .line 227
    .line 228
    if-eq v9, v10, :cond_11

    .line 229
    .line 230
    const/4 v10, 0x3

    .line 231
    if-eq v9, v10, :cond_f

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_f
    iget-object v9, v5, LD0/b;->g:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v9, Ly1/l;

    .line 237
    .line 238
    iget-object v9, v9, Ly1/l;->b:Ly1/i;

    .line 239
    .line 240
    invoke-virtual {v3, p1, v0, p2, v9}, Lba/a;->z(Ljava/lang/CharSequence;IILy1/i;)Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-nez v9, :cond_d

    .line 245
    .line 246
    if-nez v1, :cond_10

    .line 247
    .line 248
    new-instance v1, Ly1/s;

    .line 249
    .line 250
    new-instance v9, Landroid/text/SpannableString;

    .line 251
    .line 252
    invoke-direct {v9, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, v9}, Ly1/s;-><init>(Landroid/text/Spannable;)V

    .line 256
    .line 257
    .line 258
    :cond_10
    iget-object v9, v5, LD0/b;->g:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v9, Ly1/l;

    .line 261
    .line 262
    iget-object v9, v9, Ly1/l;->b:Ly1/i;

    .line 263
    .line 264
    new-instance v10, Ly1/o;

    .line 265
    .line 266
    invoke-direct {v10, v9}, Ly1/o;-><init>(Ly1/i;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v10, v0, p2, v8}, Ly1/s;->setSpan(Ljava/lang/Object;III)V

    .line 270
    .line 271
    .line 272
    add-int/lit8 v6, v6, 0x1

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_11
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    add-int/2addr p2, v8

    .line 280
    if-ge p2, p3, :cond_e

    .line 281
    .line 282
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    goto :goto_8

    .line 287
    :cond_12
    invoke-static {p1, v0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    add-int/2addr v0, p2

    .line 296
    if-ge v0, p3, :cond_13

    .line 297
    .line 298
    invoke-static {p1, v0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    move v7, p2

    .line 303
    :cond_13
    move p2, v0

    .line 304
    goto :goto_8

    .line 305
    :cond_14
    iget p3, v5, LD0/b;->b:I

    .line 306
    .line 307
    if-ne p3, v10, :cond_17

    .line 308
    .line 309
    iget-object p3, v5, LD0/b;->f:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p3, Ly1/l;

    .line 312
    .line 313
    iget-object p3, p3, Ly1/l;->b:Ly1/i;

    .line 314
    .line 315
    if-eqz p3, :cond_17

    .line 316
    .line 317
    iget p3, v5, LD0/b;->d:I

    .line 318
    .line 319
    if-gt p3, v2, :cond_15

    .line 320
    .line 321
    invoke-virtual {v5}, LD0/b;->g()Z

    .line 322
    .line 323
    .line 324
    move-result p3

    .line 325
    if-eqz p3, :cond_17

    .line 326
    .line 327
    :cond_15
    if-ge v6, v9, :cond_17

    .line 328
    .line 329
    iget-object p3, v5, LD0/b;->f:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p3, Ly1/l;

    .line 332
    .line 333
    iget-object p3, p3, Ly1/l;->b:Ly1/i;

    .line 334
    .line 335
    invoke-virtual {v3, p1, v0, p2, p3}, Lba/a;->z(Ljava/lang/CharSequence;IILy1/i;)Z

    .line 336
    .line 337
    .line 338
    move-result p3

    .line 339
    if-nez p3, :cond_17

    .line 340
    .line 341
    if-nez v1, :cond_16

    .line 342
    .line 343
    new-instance v1, Ly1/s;

    .line 344
    .line 345
    invoke-direct {v1, p1}, Ly1/s;-><init>(Ljava/lang/CharSequence;)V

    .line 346
    .line 347
    .line 348
    :cond_16
    iget-object p3, v5, LD0/b;->f:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p3, Ly1/l;

    .line 351
    .line 352
    iget-object p3, p3, Ly1/l;->b:Ly1/i;

    .line 353
    .line 354
    new-instance v2, Ly1/o;

    .line 355
    .line 356
    invoke-direct {v2, p3}, Ly1/o;-><init>(Ly1/i;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v2, v0, p2, v8}, Ly1/s;->setSpan(Ljava/lang/Object;III)V

    .line 360
    .line 361
    .line 362
    :cond_17
    if-eqz v1, :cond_19

    .line 363
    .line 364
    iget-object p2, v1, Ly1/s;->b:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 365
    .line 366
    if-eqz v4, :cond_18

    .line 367
    .line 368
    check-cast p1, Ly1/n;

    .line 369
    .line 370
    invoke-virtual {p1}, Ly1/n;->b()V

    .line 371
    .line 372
    .line 373
    :cond_18
    return-object p2

    .line 374
    :cond_19
    if-eqz v4, :cond_1c

    .line 375
    .line 376
    :goto_9
    move-object p2, p1

    .line 377
    check-cast p2, Ly1/n;

    .line 378
    .line 379
    invoke-virtual {p2}, Ly1/n;->b()V

    .line 380
    .line 381
    .line 382
    return-object p1

    .line 383
    :cond_1a
    :goto_a
    if-eqz v4, :cond_1c

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :goto_b
    if-eqz v4, :cond_1b

    .line 387
    .line 388
    check-cast p1, Ly1/n;

    .line 389
    .line 390
    invoke-virtual {p1}, Ly1/n;->b()V

    .line 391
    .line 392
    .line 393
    :cond_1b
    throw p2

    .line 394
    :cond_1c
    :goto_c
    return-object p1

    .line 395
    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 396
    .line 397
    const-string p2, "end cannot be negative"

    .line 398
    .line 399
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw p1

    .line 403
    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 404
    .line 405
    const-string p2, "start cannot be negative"

    .line 406
    .line 407
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw p1

    .line 411
    :cond_1f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 412
    .line 413
    const-string p2, "Not initialized yet"

    .line 414
    .line 415
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw p1
.end method

.method public final f(Ly1/e;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "initCallback cannot be null"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lj1/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget v1, p0, Ly1/g;->c:I

    .line 17
    .line 18
    if-eq v1, v0, :cond_1

    .line 19
    .line 20
    iget v1, p0, Ly1/g;->c:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Ly1/g;->b:Lx/f;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lx/f;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    iget-object v1, p0, Ly1/g;->d:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v2, LR3/c;

    .line 37
    .line 38
    iget v3, p0, Ly1/g;->c:I

    .line 39
    .line 40
    new-array v0, v0, [Ly1/e;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    aput-object p1, v0, v4

    .line 44
    .line 45
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {v2, p1, v3, v0}, LR3/c;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-object p1, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_2
    iget-object v0, p0, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 75
    .line 76
    .line 77
    throw p1
.end method
