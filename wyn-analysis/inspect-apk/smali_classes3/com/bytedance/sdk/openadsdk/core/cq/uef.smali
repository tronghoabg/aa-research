.class public Lcom/bytedance/sdk/openadsdk/core/cq/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/uef;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/cq/uef$uef;,
        Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private oa([B)Landroid/graphics/drawable/Drawable;
    .locals 6

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    const-string v2, "UGEN_GIF_CACHE"

    const-string v3, "TT_UGEN_GIF_FILE"

    invoke-static {v1, v2, v3}, Lcom/bytedance/sdk/component/utils/xs;->uef(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 6
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 7
    :try_start_1
    array-length v3, p1

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V

    .line 8
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_0

    .line 9
    invoke-static {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->f(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->i(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_0

    .line 12
    :cond_0
    :try_start_3
    array-length v1, p1

    invoke-static {p1, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 13
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 14
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    return-object v1

    :catchall_3
    move-exception p1

    move-object v2, v0

    .line 15
    :goto_0
    :try_start_5
    const-string v1, "ImageLoaderProvider"

    const-string v3, "GifView  getSourceByFile fail : "

    invoke-static {v1, v3, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v2, :cond_1

    .line 16
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :cond_1
    return-object v0

    :catchall_5
    move-exception p1

    if-eqz v2, :cond_2

    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 17
    :catchall_6
    :cond_2
    throw p1
.end method

.method private oa(Landroid/widget/ImageView;[BII)V
    .locals 7

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    move v5, p3

    move v6, p4

    move v1, p3

    move v2, p4

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;-><init>(IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;II)V

    .line 2
    new-instance p3, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p4

    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;-><init>()V

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->oa()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Z)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef()Lcom/bytedance/sdk/component/lw/oa/yo/lw;

    move-result-object v1

    invoke-direct {p3, p4, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/cq;)V

    .line 3
    invoke-virtual {v0, p2, p3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 4
    new-instance p3, Lcom/bytedance/sdk/openadsdk/core/cq/uef$2;

    const-string p4, "loadStaticImage"

    invoke-direct {p3, p0, p4, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Ljava/lang/String;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;[B)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->oa([B)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private uef(Landroid/widget/ImageView;[BII)V
    .locals 3

    .line 8
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    .line 10
    invoke-static {v0}, LA0/j;->g(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p2

    .line 11
    :try_start_0
    invoke-static {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->i(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 12
    new-instance p3, Lcom/bytedance/sdk/openadsdk/core/cq/uef$1;

    const-string p4, "loadAnimatedDrawable"

    invoke-direct {p3, p0, p4, p2, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView;)V

    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 13
    :goto_0
    const-string p2, "ImageLoaderProvider"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->oa(Landroid/widget/ImageView;[BII)V

    return-void
.end method

.method private uef(Lcom/bytedance/adsdk/ugeno/core/dj;Lcom/bytedance/sdk/component/lw/zjm;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 21
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/dj;->oa()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 22
    const-string v0, "image_info"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 23
    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 24
    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 25
    invoke-interface {p2, p3}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    .line 26
    :cond_0
    const-string p3, "cache_dir"

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 27
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 28
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/component/lw/zjm;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    :cond_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Landroid/widget/ImageView;[BII)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Landroid/widget/ImageView;[BII)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;[BLandroid/widget/ImageView;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef([BLandroid/widget/ImageView;)V

    return-void
.end method

.method private uef([BLandroid/widget/ImageView;)V
    .locals 1

    .line 15
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$3;

    invoke-direct {v0, p0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Landroid/widget/ImageView;)V

    invoke-direct {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef([BLcom/bytedance/sdk/openadsdk/core/cq/uef$uef;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 16
    const-string p2, "ImageLoaderProvider"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private uef([BLcom/bytedance/sdk/openadsdk/core/cq/uef$uef;)V
    .locals 2

    .line 17
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$4;

    const-string v1, "pag_animation_drawable"

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Ljava/lang/String;[BLcom/bytedance/sdk/openadsdk/core/cq/uef$uef;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->yo(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public oa(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/uef$uef;)V
    .locals 2

    .line 18
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/zjm;->yo(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/dj;Lcom/bytedance/sdk/component/lw/zjm;Ljava/lang/String;)V

    .line 20
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/uef$5;

    invoke-direct {p1, p0, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$5;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Lcom/bytedance/adsdk/ugeno/uef$uef;)V

    const/4 p2, 0x4

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Lcom/bytedance/sdk/component/lw/ab;I)Lcom/bytedance/sdk/component/lw/cz;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Landroid/widget/ImageView;IILcom/bytedance/adsdk/ugeno/uef$uef;)V
    .locals 1

    .line 4
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/cq/moa;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p6

    const/4 v0, 0x1

    invoke-interface {p6, v0}, Lcom/bytedance/sdk/component/lw/zjm;->yo(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p6

    .line 6
    invoke-direct {p0, p1, p6, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/dj;Lcom/bytedance/sdk/component/lw/zjm;Ljava/lang/String;)V

    .line 7
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;

    invoke-direct {p1, p3, p0, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;-><init>(Landroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/cq/uef;II)V

    const/4 p2, 0x4

    invoke-interface {p6, p1, p2}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Lcom/bytedance/sdk/component/lw/ab;I)Lcom/bytedance/sdk/component/lw/cz;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/uef$uef;)V
    .locals 0

    .line 19
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/cq/moa;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->oa(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/uef$uef;)V

    return-void
.end method

.method public uef([B)Z
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/dj;->uef([BI)Z

    move-result p1

    return p1
.end method
