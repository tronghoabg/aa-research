.class public final LL4/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/i;


# static fields
.field public static final d:LB4/f;

.field public static final e:LB4/f;

.field public static final f:Lx4/d;


# instance fields
.field public final a:LL4/A;

.field public final b:LF4/a;

.field public final c:Lx4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LL4/y;

    .line 8
    .line 9
    invoke-direct {v1}, LL4/y;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, LB4/f;

    .line 13
    .line 14
    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    .line 15
    .line 16
    invoke-direct {v2, v3, v0, v1}, LB4/f;-><init>(Ljava/lang/String;Ljava/lang/Object;LB4/e;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LL4/B;->d:LB4/f;

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lxa/d;

    .line 27
    .line 28
    const/16 v2, 0xf

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lxa/d;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v2, LB4/f;

    .line 34
    .line 35
    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    .line 36
    .line 37
    invoke-direct {v2, v3, v0, v1}, LB4/f;-><init>(Ljava/lang/String;Ljava/lang/Object;LB4/e;)V

    .line 38
    .line 39
    .line 40
    sput-object v2, LL4/B;->e:LB4/f;

    .line 41
    .line 42
    new-instance v0, Lx4/d;

    .line 43
    .line 44
    const/16 v1, 0x15

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lx4/d;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LL4/B;->f:Lx4/d;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(LF4/a;LL4/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL4/B;->b:LF4/a;

    .line 5
    .line 6
    iput-object p2, p0, LL4/B;->a:LL4/A;

    .line 7
    .line 8
    sget-object p1, LL4/B;->f:Lx4/d;

    .line 9
    .line 10
    iput-object p1, p0, LL4/B;->c:Lx4/d;

    .line 11
    .line 12
    return-void
.end method

.method public static c(Landroid/media/MediaMetadataRetriever;JIIILL4/k;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    move-object/from16 v3, p6

    .line 2
    .line 3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v5, 0x1b

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-lt v4, v5, :cond_2

    .line 9
    .line 10
    const/high16 v4, -0x80000000

    .line 11
    .line 12
    if-eq p4, v4, :cond_2

    .line 13
    .line 14
    if-eq p5, v4, :cond_2

    .line 15
    .line 16
    sget-object v4, LL4/k;->a:LL4/i;

    .line 17
    .line 18
    if-eq v3, v4, :cond_2

    .line 19
    .line 20
    const/16 v4, 0x12

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x13

    .line 31
    .line 32
    invoke-virtual {p0, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/16 v6, 0x18

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 v8, 0x5a

    .line 51
    .line 52
    if-eq v6, v8, :cond_0

    .line 53
    .line 54
    const/16 v8, 0x10e

    .line 55
    .line 56
    if-ne v6, v8, :cond_1

    .line 57
    .line 58
    :cond_0
    move v9, v5

    .line 59
    move v5, v4

    .line 60
    move v4, v9

    .line 61
    :cond_1
    invoke-virtual {v3, v4, v5, p4, p5}, LL4/k;->b(IIII)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    int-to-float v2, v4

    .line 66
    mul-float/2addr v2, v0

    .line 67
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    int-to-float v3, v5

    .line 72
    mul-float/2addr v0, v3

    .line 73
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    move-object v1, p0

    .line 78
    move v4, p3

    .line 79
    move v5, v2

    .line 80
    move-wide v2, p1

    .line 81
    invoke-static/range {v1 .. v6}, LF6/k;->a(Landroid/media/MediaMetadataRetriever;JIII)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    const/4 v1, 0x3

    .line 88
    const-string v2, "VideoDecoder"

    .line 89
    .line 90
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const-string v1, "Exception trying to decode frame on oreo+"

    .line 97
    .line 98
    invoke-static {v2, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_0
    if-nez v7, :cond_3

    .line 102
    .line 103
    invoke-virtual/range {p0 .. p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :cond_3
    return-object v7
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILB4/g;)LE4/B;
    .locals 8

    .line 1
    sget-object v0, LL4/B;->d:LB4/f;

    .line 2
    .line 3
    invoke-virtual {p4, v0}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    cmp-long v0, v2, v0

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    .line 19
    const-wide/16 v0, -0x1

    .line 20
    .line 21
    cmp-long v0, v2, v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string p2, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    .line 29
    .line 30
    invoke-static {v2, v3, p2}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :goto_0
    sget-object v0, LL4/B;->e:LB4/f;

    .line 39
    .line 40
    invoke-virtual {p4, v0}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Integer;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    sget-object v1, LL4/k;->c:LB4/f;

    .line 54
    .line 55
    invoke-virtual {p4, v1}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    check-cast p4, LL4/k;

    .line 60
    .line 61
    if-nez p4, :cond_3

    .line 62
    .line 63
    sget-object p4, LL4/k;->b:LL4/i;

    .line 64
    .line 65
    :cond_3
    move-object v7, p4

    .line 66
    iget-object p4, p0, LL4/B;->c:Lx4/d;

    .line 67
    .line 68
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 72
    .line 73
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 74
    .line 75
    .line 76
    :try_start_0
    iget-object p4, p0, LL4/B;->a:LL4/A;

    .line 77
    .line 78
    invoke-interface {p4, v1, p1}, LL4/A;->j(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    move v5, p2

    .line 86
    move v6, p3

    .line 87
    invoke-static/range {v1 .. v7}, LL4/B;->c(Landroid/media/MediaMetadataRetriever;JIIILL4/k;)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, LL4/B;->b:LF4/a;

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    return-object p1

    .line 100
    :cond_4
    new-instance p3, LL4/c;

    .line 101
    .line 102
    invoke-direct {p3, p2, p1}, LL4/c;-><init>(LF4/a;Landroid/graphics/Bitmap;)V

    .line 103
    .line 104
    .line 105
    return-object p3

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    move-object p1, v0

    .line 108
    goto :goto_1

    .line 109
    :catch_0
    move-exception v0

    .line 110
    move-object p1, v0

    .line 111
    :try_start_1
    new-instance p2, Ljava/io/IOException;

    .line 112
    .line 113
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    :goto_1
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 118
    .line 119
    .line 120
    throw p1
.end method

.method public final b(Ljava/lang/Object;LB4/g;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
