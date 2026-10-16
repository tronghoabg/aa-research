.class public final LL4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:LB4/f;

.field public static final g:LB4/f;

.field public static final h:LB4/f;

.field public static final i:LB4/f;

.field public static final j:Ljava/util/Set;

.field public static final k:Lc8/e;

.field public static final l:Ljava/util/ArrayDeque;


# instance fields
.field public final a:LF4/a;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:LF4/f;

.field public final d:Ljava/util/ArrayList;

.field public final e:LL4/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LB4/a;->c:LB4/a;

    .line 2
    .line 3
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    .line 4
    .line 5
    invoke-static {v0, v1}, LB4/f;->a(Ljava/lang/Object;Ljava/lang/String;)LB4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LL4/m;->f:LB4/f;

    .line 10
    .line 11
    sget-object v0, LB4/h;->a:LB4/h;

    .line 12
    .line 13
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    .line 14
    .line 15
    invoke-static {v0, v1}, LB4/f;->a(Ljava/lang/Object;Ljava/lang/String;)LB4/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LL4/m;->g:LB4/f;

    .line 20
    .line 21
    sget-object v0, LL4/k;->a:LL4/i;

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    .line 26
    .line 27
    invoke-static {v0, v1}, LB4/f;->a(Ljava/lang/Object;Ljava/lang/String;)LB4/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, LL4/m;->h:LB4/f;

    .line 32
    .line 33
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    .line 34
    .line 35
    invoke-static {v0, v1}, LB4/f;->a(Ljava/lang/Object;Ljava/lang/String;)LB4/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LL4/m;->i:LB4/f;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashSet;

    .line 42
    .line 43
    const-string v1, "image/vnd.wap.wbmp"

    .line 44
    .line 45
    const-string v2, "image/x-ico"

    .line 46
    .line 47
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LL4/m;->j:Ljava/util/Set;

    .line 63
    .line 64
    new-instance v0, Lc8/e;

    .line 65
    .line 66
    const/16 v1, 0x15

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 69
    .line 70
    .line 71
    sput-object v0, LL4/m;->k:Lc8/e;

    .line 72
    .line 73
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 74
    .line 75
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 76
    .line 77
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 78
    .line 79
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    sget-object v0, LY4/m;->a:[C

    .line 87
    .line 88
    new-instance v0, Ljava/util/ArrayDeque;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 92
    .line 93
    .line 94
    sput-object v0, LL4/m;->l:Ljava/util/ArrayDeque;

    .line 95
    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;LF4/a;LF4/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LL4/r;->a()LL4/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LL4/m;->e:LL4/r;

    .line 9
    .line 10
    iput-object p1, p0, LL4/m;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string p1, "Argument must not be null"

    .line 13
    .line 14
    invoke-static {p2, p1}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LL4/m;->b:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    iput-object p3, p0, LL4/m;->a:LF4/a;

    .line 20
    .line 21
    iput-object p4, p0, LL4/m;->c:LF4/f;

    .line 22
    .line 23
    return-void
.end method

.method public static c(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/l;LF4/a;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "Downsampler"

    .line 2
    .line 3
    iget-boolean v1, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, LL4/l;->h()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, LL4/s;->h()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 14
    .line 15
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 16
    .line 17
    iget-object v3, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v4, LL4/v;->b:Ljava/util/concurrent/locks/Lock;

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-interface {p0, p1}, LL4/s;->f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception v4

    .line 33
    :try_start_1
    new-instance v5, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v6, "Exception decoding bitmap, outWidth: "

    .line 36
    .line 37
    const-string v7, ", outHeight: "

    .line 38
    .line 39
    const-string v8, ", outMimeType: "

    .line 40
    .line 41
    invoke-static {v6, v1, v7, v2, v8}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ", inBitmap: "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-static {v2}, LL4/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    const-string v1, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    .line 77
    .line 78
    invoke-static {v0, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    :try_start_2
    invoke-interface {p3, v0}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    invoke-static {p0, p1, p2, p3}, LL4/m;->c(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/l;LF4/a;)Landroid/graphics/Bitmap;

    .line 92
    .line 93
    .line 94
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    sget-object p1, LL4/v;->b:Ljava/util/concurrent/locks/Lock;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :catch_1
    :try_start_3
    throw v5

    .line 102
    :cond_2
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    sget-object p1, LL4/v;->b:Ljava/util/concurrent/locks/Lock;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 107
    .line 108
    .line 109
    throw p0
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, " ("

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "["

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "x"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, "] "

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static e(Landroid/graphics/BitmapFactory$Options;)V
    .locals 1

    .line 1
    invoke-static {p0}, LL4/m;->f(Landroid/graphics/BitmapFactory$Options;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, LL4/m;->l:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method public static f(Landroid/graphics/BitmapFactory$Options;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    .line 12
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 17
    .line 18
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 19
    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-lt v3, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, LA0/h;->s(Landroid/graphics/BitmapFactory$Options;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, LA0/h;->C(Landroid/graphics/BitmapFactory$Options;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, LA0/h;->D(Landroid/graphics/BitmapFactory$Options;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(LL4/s;IILB4/g;LL4/l;)LL4/c;
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, LL4/m;->c:LF4/f;

    .line 4
    .line 5
    const/high16 v3, 0x10000

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v12, v2

    .line 14
    check-cast v12, [B

    .line 15
    .line 16
    const-class v2, LL4/m;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v3, LL4/m;->l:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Landroid/graphics/BitmapFactory$Options;

    .line 27
    .line 28
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    :try_start_2
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v4}, LL4/m;->f(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_0
    move-object v3, v4

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :goto_0
    monitor-exit v2

    .line 45
    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 46
    .line 47
    sget-object v2, LL4/m;->f:LB4/f;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v5, v2

    .line 54
    check-cast v5, LB4/a;

    .line 55
    .line 56
    sget-object v2, LL4/m;->g:LB4/f;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    move-object v6, v2

    .line 63
    check-cast v6, LB4/h;

    .line 64
    .line 65
    sget-object v2, LL4/k;->c:LB4/f;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v4, v2

    .line 72
    check-cast v4, LL4/k;

    .line 73
    .line 74
    sget-object v2, LL4/m;->h:LB4/f;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    sget-object v2, LL4/m;->i:LB4/f;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-eqz v7, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0, v2}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    :goto_1
    move-object v1, p0

    .line 108
    move-object v2, p1

    .line 109
    move v8, p2

    .line 110
    move/from16 v9, p3

    .line 111
    .line 112
    move-object/from16 v11, p5

    .line 113
    .line 114
    move v7, v0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    const/4 v0, 0x0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, LL4/m;->b(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/k;LB4/a;LB4/h;ZIIZLL4/l;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, LL4/m;->a:LF4/a;

    .line 123
    .line 124
    if-nez v0, :cond_2

    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    goto :goto_3

    .line 128
    :cond_2
    new-instance v4, LL4/c;

    .line 129
    .line 130
    invoke-direct {v4, v2, v0}, LL4/c;-><init>(LF4/a;Landroid/graphics/Bitmap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 131
    .line 132
    .line 133
    move-object v0, v4

    .line 134
    :goto_3
    invoke-static {v3}, LL4/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, LL4/m;->c:LF4/f;

    .line 138
    .line 139
    invoke-virtual {v2, v12}, LF4/f;->i(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    invoke-static {v3}, LL4/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 145
    .line 146
    .line 147
    iget-object v2, p0, LL4/m;->c:LF4/f;

    .line 148
    .line 149
    invoke-virtual {v2, v12}, LF4/f;->i(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :catchall_2
    move-exception v0

    .line 154
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 155
    :try_start_5
    throw v0

    .line 156
    :goto_4
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 157
    throw v0
.end method

.method public final b(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/k;LB4/a;LB4/h;ZIIZLL4/l;)Landroid/graphics/Bitmap;
    .locals 40

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v5, p7

    move/from16 v6, p8

    move-object/from16 v7, p10

    const/4 v10, 0x0

    const/4 v11, 0x1

    .line 1
    sget v12, LY4/i;->b:I

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v12

    .line 3
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    iget-object v14, v1, LL4/m;->a:LF4/a;

    invoke-static {v2, v3, v7, v14}, LL4/m;->c(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/l;LF4/a;)Landroid/graphics/Bitmap;

    .line 5
    iput-boolean v10, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 6
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v15, v8}, [I

    move-result-object v8

    .line 7
    aget v15, v8, v10

    .line 8
    aget v8, v8, v11

    .line 9
    iget-object v10, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const/4 v9, -0x1

    if-eq v15, v9, :cond_1

    if-ne v8, v9, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v9, p6

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v9, 0x0

    .line 10
    :goto_1
    invoke-interface {v2}, LL4/s;->i()I

    move-result v17

    packed-switch v17, :pswitch_data_0

    const/4 v11, 0x0

    goto :goto_2

    :pswitch_0
    const/16 v11, 0x10e

    goto :goto_2

    :pswitch_1
    const/16 v11, 0x5a

    goto :goto_2

    :pswitch_2
    const/16 v19, 0xb4

    move/from16 v11, v19

    :goto_2
    packed-switch v17, :pswitch_data_1

    const/16 v19, 0x0

    :goto_3
    move/from16 v21, v9

    goto :goto_4

    :pswitch_3
    const/16 v19, 0x1

    goto :goto_3

    :goto_4
    const/high16 v9, -0x80000000

    if-ne v5, v9, :cond_4

    const/16 v9, 0x5a

    if-eq v11, v9, :cond_3

    const/16 v9, 0x10e

    if-ne v11, v9, :cond_2

    goto :goto_5

    :cond_2
    move-wide/from16 v22, v12

    move v12, v15

    const/high16 v9, -0x80000000

    goto :goto_6

    :cond_3
    const/16 v9, 0x10e

    :goto_5
    move-wide/from16 v22, v12

    const/high16 v9, -0x80000000

    move v12, v8

    goto :goto_6

    :cond_4
    move-wide/from16 v22, v12

    move v12, v5

    :goto_6
    if-ne v6, v9, :cond_7

    const/16 v9, 0x5a

    if-eq v11, v9, :cond_6

    const/16 v9, 0x10e

    if-ne v11, v9, :cond_5

    goto :goto_7

    :cond_5
    move v9, v8

    goto :goto_8

    :cond_6
    :goto_7
    move v9, v15

    goto :goto_8

    :cond_7
    move v9, v6

    .line 11
    :goto_8
    invoke-interface {v2}, LL4/s;->l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v13

    .line 12
    const-string v6, ", target density: "

    const/16 v24, 0x0

    const-string v5, ", density: "

    move-object/from16 v25, v10

    const/high16 v26, 0x3f800000    # 1.0f

    const-string v10, "x"

    const-string v4, "Downsampler"

    const-string v1, "]"

    if-lez v15, :cond_8

    if-gtz v8, :cond_9

    :cond_8
    move-object v0, v1

    move-object v1, v6

    move-object v7, v10

    move-object v11, v14

    const/4 v6, 0x3

    goto/16 :goto_19

    :cond_9
    move-object/from16 p6, v1

    const/16 v1, 0x5a

    if-eq v11, v1, :cond_b

    const/16 v1, 0x10e

    if-ne v11, v1, :cond_a

    goto :goto_a

    :cond_a
    move-object/from16 v20, v5

    move v5, v8

    move v1, v15

    :goto_9
    move-object/from16 v27, v6

    goto :goto_b

    :cond_b
    :goto_a
    move-object/from16 v20, v5

    move v1, v8

    move v5, v15

    goto :goto_9

    .line 13
    :goto_b
    invoke-virtual {v0, v1, v5, v12, v9}, LL4/k;->b(IIII)F

    move-result v6

    cmpg-float v28, v6, v24

    if-lez v28, :cond_1f

    move/from16 v28, v6

    .line 14
    invoke-virtual {v0, v1, v5, v12, v9}, LL4/k;->a(IIII)I

    move-result v6

    if-eqz v6, :cond_1e

    move/from16 v29, v11

    int-to-float v11, v1

    move/from16 v30, v1

    mul-float v1, v28, v11

    move-object/from16 v31, v10

    move/from16 p6, v11

    float-to-double v10, v1

    const-wide/high16 v32, 0x3fe0000000000000L    # 0.5

    add-double v10, v10, v32

    double-to-int v1, v10

    int-to-float v10, v5

    mul-float v11, v28, v10

    move/from16 v34, v10

    float-to-double v10, v11

    add-double v10, v10, v32

    double-to-int v10, v10

    .line 15
    div-int v1, v30, v1

    .line 16
    div-int v10, v5, v10

    const/4 v11, 0x1

    if-ne v6, v11, :cond_c

    .line 17
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_c

    .line 18
    :cond_c
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 19
    :goto_c
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x17

    if-gt v10, v11, :cond_d

    sget-object v11, LL4/m;->j:Ljava/util/Set;

    move/from16 v35, v1

    iget-object v1, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 20
    invoke-interface {v11, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    goto :goto_d

    :cond_d
    move/from16 v35, v1

    .line 21
    :cond_e
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    const/4 v11, 0x1

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v6, v11, :cond_f

    int-to-float v6, v1

    div-float v18, v26, v28

    cmpg-float v6, v6, v18

    if-gez v6, :cond_f

    shl-int/2addr v1, v11

    .line 22
    :cond_f
    :goto_d
    iput v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 23
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v13, v6, :cond_11

    const/16 v6, 0x8

    .line 24
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    int-to-float v5, v5

    div-float v11, p6, v5

    float-to-double v10, v11

    .line 25
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    div-float v5, v34, v5

    move/from16 v16, v6

    float-to-double v6, v5

    .line 26
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    .line 27
    div-int/lit8 v6, v1, 0x8

    if-lez v6, :cond_10

    .line 28
    div-int/2addr v10, v6

    .line 29
    div-int/2addr v5, v6

    :cond_10
    :goto_e
    move-object/from16 v7, p10

    goto/16 :goto_13

    .line 30
    :cond_11
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v13, v6, :cond_12

    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v13, v6, :cond_13

    :cond_12
    move-object/from16 v7, p10

    goto :goto_12

    .line 31
    :cond_13
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v13, v6, :cond_14

    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v13, v6, :cond_15

    :cond_14
    move-object/from16 v7, p10

    goto :goto_10

    .line 32
    :cond_15
    rem-int v6, v30, v1

    if-nez v6, :cond_16

    rem-int v6, v5, v1

    if-eqz v6, :cond_17

    :cond_16
    const/4 v11, 0x1

    goto :goto_f

    .line 33
    :cond_17
    div-int v10, v30, v1

    .line 34
    div-int/2addr v5, v1

    goto :goto_e

    .line 35
    :goto_f
    iput-boolean v11, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    move-object/from16 v7, p10

    .line 36
    invoke-static {v2, v3, v7, v14}, LL4/m;->c(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/l;LF4/a;)Landroid/graphics/Bitmap;

    const/4 v5, 0x0

    .line 37
    iput-boolean v5, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 38
    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v10, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v6, v10}, [I

    move-result-object v6

    .line 39
    aget v10, v6, v5

    .line 40
    aget v5, v6, v11

    goto :goto_13

    :goto_10
    const/16 v5, 0x18

    if-lt v10, v5, :cond_18

    int-to-float v5, v1

    div-float v11, p6, v5

    .line 41
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v10

    div-float v5, v34, v5

    .line 42
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    goto :goto_13

    :cond_18
    int-to-float v5, v1

    div-float v11, p6, v5

    float-to-double v10, v11

    .line 43
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    double-to-int v10, v10

    div-float v5, v34, v5

    float-to-double v5, v5

    .line 44
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    :goto_11
    double-to-int v5, v5

    goto :goto_13

    :goto_12
    int-to-float v5, v1

    div-float v11, p6, v5

    float-to-double v10, v11

    .line 45
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    double-to-int v10, v10

    div-float v5, v34, v5

    float-to-double v5, v5

    .line 46
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    goto :goto_11

    .line 47
    :goto_13
    invoke-virtual {v0, v10, v5, v12, v9}, LL4/k;->b(IIII)F

    move-result v0

    float-to-double v6, v0

    const-wide/high16 v34, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v6, v34

    if-gtz v0, :cond_19

    move-wide/from16 v36, v6

    goto :goto_14

    :cond_19
    div-double v36, v34, v6

    :goto_14
    const-wide v38, 0x41dfffffffc00000L    # 2.147483647E9

    mul-double v36, v36, v38

    move-object v11, v14

    .line 48
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v13, v13

    move-wide/from16 v36, v6

    int-to-double v6, v13

    mul-double v6, v6, v36

    add-double v6, v6, v32

    double-to-int v6, v6

    int-to-float v7, v6

    int-to-float v13, v13

    div-float/2addr v7, v13

    float-to-double v13, v7

    div-double v13, v36, v13

    int-to-double v6, v6

    mul-double/2addr v13, v6

    add-double v13, v13, v32

    double-to-int v6, v13

    .line 49
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-gtz v0, :cond_1a

    move-wide/from16 v34, v36

    goto :goto_15

    :cond_1a
    div-double v34, v34, v36

    :goto_15
    mul-double v34, v34, v38

    .line 50
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v0, v6

    .line 51
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 52
    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v6, :cond_1b

    if-lez v0, :cond_1b

    if-eq v6, v0, :cond_1b

    const/4 v6, 0x1

    .line 53
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    :goto_16
    const/4 v6, 0x2

    goto :goto_17

    :cond_1b
    const/4 v6, 0x0

    .line 54
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    goto :goto_16

    .line 55
    :goto_17
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 56
    const-string v0, "Calculate scaling, source: ["

    const-string v6, "], degreesToRotate: "

    move-object/from16 v7, v31

    .line 57
    invoke-static {v0, v15, v7, v8, v6}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 58
    const-string v6, ", target: ["

    move/from16 v13, v29

    .line 59
    invoke-static {v13, v12, v6, v7, v0}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 60
    const-string v6, "], power of two scaled: ["

    .line 61
    invoke-static {v9, v10, v6, v7, v0}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 62
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "], exact scale factor: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, v28

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ", power of 2 sample size: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", adjusted scale factor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v5, v36

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v5, v20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1c
    :goto_18
    move-object/from16 v6, p0

    goto :goto_1a

    :cond_1d
    move-object/from16 v5, v20

    move-object/from16 v1, v27

    move-object/from16 v7, v31

    goto :goto_18

    .line 63
    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot round with null rounding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    move v5, v6

    move-object v7, v10

    .line 64
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot scale with factor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " from: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source: ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "], target: ["

    .line 65
    invoke-static {v15, v8, v7, v0, v2}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 66
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v0, p6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 67
    :goto_19
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_1c

    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "Unable to determine dimensions for: "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " with target ["

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_18

    .line 69
    :goto_1a
    iget-object v10, v6, LL4/m;->e:LL4/r;

    if-eqz v21, :cond_25

    .line 70
    iget-boolean v0, v10, LL4/r;->a:Z

    if-eqz v0, :cond_20

    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x1a

    if-lt v0, v13, :cond_20

    if-eqz v19, :cond_21

    :cond_20
    move/from16 v16, v9

    goto :goto_1e

    .line 72
    :cond_21
    iget v0, v10, LL4/r;->c:I

    if-lt v12, v0, :cond_20

    if-lt v9, v0, :cond_20

    .line 73
    const-string v0, "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors "

    monitor-enter v10

    .line 74
    :try_start_0
    iget v13, v10, LL4/r;->d:I

    const/16 v18, 0x1

    add-int/lit8 v13, v13, 0x1

    iput v13, v10, LL4/r;->d:I

    const/16 v14, 0x32

    if-lt v13, v14, :cond_23

    const/4 v13, 0x0

    .line 75
    iput v13, v10, LL4/r;->d:I

    .line 76
    sget-object v13, LL4/r;->f:Ljava/io/File;

    invoke-virtual {v13}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v13

    array-length v13, v13

    .line 77
    iget v14, v10, LL4/r;->b:I

    if-ge v13, v14, :cond_22

    const/4 v14, 0x1

    goto :goto_1b

    :cond_22
    const/4 v14, 0x0

    :goto_1b
    iput-boolean v14, v10, LL4/r;->e:Z

    if-nez v14, :cond_23

    .line 78
    const-string v14, "Downsampler"

    move/from16 v16, v9

    const/4 v9, 0x5

    invoke-static {v14, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_24

    .line 79
    const-string v9, "Downsampler"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v10, LL4/r;->b:I

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1c

    :catchall_0
    move-exception v0

    goto :goto_1d

    :cond_23
    move/from16 v16, v9

    .line 80
    :cond_24
    :goto_1c
    iget-boolean v0, v10, LL4/r;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v10

    if-eqz v0, :cond_26

    const/4 v0, 0x1

    goto :goto_1f

    :goto_1d
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_25
    move/from16 v16, v9

    .line 81
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_26
    :goto_1e
    const/4 v0, 0x0

    :goto_1f
    if-eqz v0, :cond_27

    .line 82
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    move-result-object v9

    iput-object v9, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v13, 0x0

    .line 83
    iput-boolean v13, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    goto :goto_20

    :cond_27
    const/4 v13, 0x0

    :goto_20
    if-eqz v0, :cond_29

    :cond_28
    const/4 v9, 0x1

    goto :goto_23

    .line 84
    :cond_29
    sget-object v0, LB4/a;->a:LB4/a;

    move-object/from16 v9, p4

    if-eq v9, v0, :cond_2c

    .line 85
    :try_start_2
    invoke-interface {v2}, LL4/s;->l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_21

    :catch_0
    move-exception v0

    const/4 v10, 0x3

    .line 86
    invoke-static {v4, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_2a

    .line 87
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v14, "Cannot determine whether the image has alpha or not from header, format "

    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2a
    move v0, v13

    :goto_21
    if-eqz v0, :cond_2b

    .line 88
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_22

    :cond_2b
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_22
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 89
    sget-object v9, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne v0, v9, :cond_28

    const/4 v9, 0x1

    .line 90
    iput-boolean v9, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    goto :goto_23

    :cond_2c
    const/4 v9, 0x1

    .line 91
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 92
    :goto_23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ltz v15, :cond_2d

    if-ltz v8, :cond_2d

    if-eqz p9, :cond_2d

    move-object/from16 v27, v1

    move/from16 v9, v16

    goto/16 :goto_26

    .line 93
    :cond_2d
    iget v10, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v10, :cond_2e

    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    if-lez v12, :cond_2e

    if-eq v10, v12, :cond_2e

    move v12, v9

    goto :goto_24

    :cond_2e
    move v12, v13

    :goto_24
    if-eqz v12, :cond_2f

    int-to-float v10, v10

    .line 94
    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-float v12, v12

    div-float/2addr v10, v12

    goto :goto_25

    :cond_2f
    move/from16 v10, v26

    .line 95
    :goto_25
    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-float v14, v15

    int-to-float v9, v12

    div-float/2addr v14, v9

    float-to-double v13, v14

    .line 96
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v13, v13

    int-to-float v14, v8

    div-float/2addr v14, v9

    move-object/from16 v27, v1

    float-to-double v1, v14

    .line 97
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    int-to-float v2, v13

    mul-float/2addr v2, v10

    .line 98
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v1, v1

    mul-float/2addr v1, v10

    .line 99
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v9

    const/4 v1, 0x2

    .line 100
    invoke-static {v4, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v13

    if-eqz v13, :cond_30

    .line 101
    const-string v1, "Calculated target ["

    const-string v13, "] for source ["

    .line 102
    invoke-static {v1, v2, v7, v9, v13}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 103
    const-string v13, "], sampleSize: "

    .line 104
    invoke-static {v15, v8, v7, v13, v1}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 105
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ", targetDensity: "

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ", density multiplier: "

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_30
    move v12, v2

    :goto_26
    const/4 v1, 0x0

    if-lez v12, :cond_34

    if-lez v9, :cond_34

    const/16 v13, 0x1a

    if-lt v0, v13, :cond_32

    .line 106
    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    move-result-object v10

    if-ne v2, v10, :cond_31

    goto :goto_28

    .line 107
    :cond_31
    invoke-static {v3}, LU1/b;->f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    move-result-object v2

    goto :goto_27

    :cond_32
    move-object v2, v1

    :goto_27
    if-nez v2, :cond_33

    .line 108
    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 109
    :cond_33
    invoke-interface {v11, v12, v9, v2}, LF4/a;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    :cond_34
    :goto_28
    const/16 v2, 0x1c

    if-lt v0, v2, :cond_38

    .line 110
    sget-object v0, LB4/h;->b:LB4/h;

    move-object/from16 v2, p5

    if-ne v2, v0, :cond_35

    invoke-static {v3}, LA0/h;->e(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    move-result-object v0

    if-eqz v0, :cond_35

    invoke-static {v3}, LA0/h;->e(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    move-result-object v0

    .line 111
    invoke-static {v0}, LA0/h;->y(Landroid/graphics/ColorSpace;)Z

    move-result v0

    if-eqz v0, :cond_35

    const/4 v10, 0x1

    goto :goto_29

    :cond_35
    const/4 v10, 0x0

    :goto_29
    if-eqz v10, :cond_36

    .line 112
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->f()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_2a

    :cond_36
    invoke-static {}, Le0/h;->p()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    :goto_2a
    invoke-static {v0}, Le0/h;->c(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {v3, v0}, LA0/h;->t(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    :cond_37
    :goto_2b
    move-object/from16 v2, p1

    move-object/from16 v9, p10

    goto :goto_2c

    :cond_38
    const/16 v13, 0x1a

    if-lt v0, v13, :cond_37

    .line 113
    invoke-static {}, Le0/h;->p()Landroid/graphics/ColorSpace$Named;

    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->u()Landroid/graphics/ColorSpace;

    move-result-object v0

    invoke-static {v3, v0}, LA0/h;->t(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    goto :goto_2b

    .line 114
    :goto_2c
    invoke-static {v2, v3, v9, v11}, LL4/m;->c(LL4/s;Landroid/graphics/BitmapFactory$Options;LL4/l;LF4/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 115
    invoke-interface {v9, v11, v0}, LL4/l;->d(LF4/a;Landroid/graphics/Bitmap;)V

    const/4 v2, 0x2

    .line 116
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_39

    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "Decoded "

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    invoke-static {v0}, LL4/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " from ["

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "] "

    const-string v10, " with inBitmap "

    move-object/from16 v12, v25

    .line 119
    invoke-static {v2, v8, v9, v12, v10}, LA7/p0;->v(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    iget-object v8, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {v8}, LL4/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v8

    .line 121
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " for ["

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v8, p7

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, p8

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "], sample size: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v5, v27

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", thread: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    invoke-static/range {v22 .. v23}, LY4/i;->a(J)D

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 124
    invoke-static {v4, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_39
    if-eqz v0, :cond_3b

    .line 125
    iget-object v2, v6, LL4/m;->b:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    packed-switch v17, :pswitch_data_2

    move-object v1, v0

    goto/16 :goto_2f

    .line 126
    :pswitch_4
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v3, 0x43340000    # 180.0f

    const/high16 v4, 0x42b40000    # 90.0f

    const/high16 v5, -0x3d4c0000    # -90.0f

    const/high16 v7, -0x40800000    # -1.0f

    packed-switch v17, :pswitch_data_3

    goto :goto_2d

    .line 127
    :pswitch_5
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_2d

    .line 128
    :pswitch_6
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->setRotate(F)V

    move/from16 v5, v26

    .line 129
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_2d

    .line 130
    :pswitch_7
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_2d

    :pswitch_8
    move/from16 v5, v26

    .line 131
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 132
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_2d

    :pswitch_9
    move/from16 v5, v26

    .line 133
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 134
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_2d

    .line 135
    :pswitch_a
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_2d

    :pswitch_b
    move/from16 v5, v26

    .line 136
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 137
    :goto_2d
    new-instance v3, Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    move/from16 v7, v24

    invoke-direct {v3, v7, v7, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 138
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 139
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 140
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 141
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    if-eqz v7, :cond_3a

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    goto :goto_2e

    :cond_3a
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 142
    :goto_2e
    invoke-interface {v11, v4, v5, v7}, LF4/a;->t(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 143
    iget v5, v3, Landroid/graphics/RectF;->left:F

    neg-float v5, v5

    iget v3, v3, Landroid/graphics/RectF;->top:F

    neg-float v3, v3

    invoke-virtual {v2, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 144
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 145
    sget-object v3, LL4/v;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 146
    :try_start_3
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 147
    sget-object v7, LL4/v;->a:Landroid/graphics/Paint;

    invoke-virtual {v5, v0, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 148
    invoke-virtual {v5, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object v1, v4

    .line 150
    :goto_2f
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3b

    .line 151
    invoke-interface {v11, v0}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    goto :goto_30

    :catchall_1
    move-exception v0

    .line 152
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_3b
    :goto_30
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
