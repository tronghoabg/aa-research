.class public Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private oa([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->uef()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    const-string v1, "P_GIF_CACHE"

    .line 7
    .line 8
    const-string v2, "P_U_GIF_FILE"

    .line 9
    .line 10
    invoke-static {p2, v1, v2}, Lcom/bytedance/sdk/component/utils/xs;->uef(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    new-instance v1, Ljava/io/FileOutputStream;

    .line 15
    .line 16
    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    :try_start_1
    array-length v0, p1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, p1, v2, v0}, Ljava/io/FileOutputStream;->write([BII)V

    .line 22
    .line 23
    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v2, 0x1c

    .line 27
    .line 28
    if-lt v0, v2, :cond_1

    .line 29
    .line 30
    invoke-static {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->f(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->i(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p3, :cond_0

    .line 39
    .line 40
    invoke-interface {p3, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    move-object v0, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    if-eqz p3, :cond_0

    .line 52
    .line 53
    :try_start_3
    invoke-interface {p3, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_1
    move-exception p1

    .line 58
    :goto_1
    :try_start_4
    const-string p2, "PAGGifDefaultDecoder"

    .line 59
    .line 60
    const-string v1, "Gif  getSourceByFile fail : "

    .line 61
    .line 62
    invoke-static {p2, v1, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 63
    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 68
    .line 69
    .line 70
    :catchall_2
    :cond_2
    if-eqz p3, :cond_3

    .line 71
    .line 72
    invoke-interface {p3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef()V

    .line 73
    .line 74
    .line 75
    :catchall_3
    :cond_3
    return-void

    .line 76
    :catchall_4
    move-exception p1

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 80
    .line 81
    .line 82
    :catchall_5
    :cond_4
    throw p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;[BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;->oa([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V

    return-void
.end method

.method private uef([BLcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;)V
    .locals 2

    .line 13
    :try_start_0
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->bcc()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$1;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$1;-><init>(Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;[BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 14
    const-string p3, "PAGGifDefaultDecoder"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 15
    invoke-interface {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef()V

    :cond_0
    return-void
.end method


# virtual methods
.method public uef([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    .locals 2

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-gt v0, v1, :cond_0

    .line 3
    invoke-direct {p0, p1, p3, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V

    return-void
.end method

.method public uef([BLcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    .locals 3

    .line 5
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    .line 7
    invoke-static {v0}, LA0/j;->g(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    .line 8
    :try_start_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->i(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p2, :cond_1

    .line 9
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 10
    const-string v0, "PAGGifDefaultDecoder"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 11
    invoke-interface {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef()V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 12
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;->uef([B)V

    :cond_1
    :goto_0
    return-void
.end method
