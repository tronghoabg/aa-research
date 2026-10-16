.class final Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/zjm/moa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "uef"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$uef;
    }
.end annotation


# static fields
.field private static lw:I

.field private static moa:I

.field private static final oa:Lcom/bytedance/sdk/component/lw/wk;

.field public static uef:Z

.field private static yo:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/component/lw/wk;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    .line 10
    .line 11
    const/16 v0, 0xa

    .line 12
    .line 13
    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->yo:I

    .line 14
    .line 15
    const/16 v0, 0xf

    .line 16
    .line 17
    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->moa:I

    .line 18
    .line 19
    const/16 v0, 0x1e

    .line 20
    .line 21
    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->lw:I

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef:Z

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic oa()Lcom/bytedance/sdk/component/lw/wk;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    return-object v0
.end method

.method private static oa(Lcom/bytedance/sdk/openadsdk/core/model/sy;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 2

    .line 6
    sget-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->oa()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/zjm;->uef(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->yo()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/zjm;->oa(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/content/Context;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/zjm;->lw(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/zjm;->moa(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->xs()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    .line 12
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef(Lcom/bytedance/sdk/component/lw/zjm;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    return-object p0
.end method

.method private static oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 1

    .line 2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    invoke-interface {v0, p0}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/content/Context;)I

    move-result v0

    invoke-interface {p0, v0}, Lcom/bytedance/sdk/component/lw/zjm;->lw(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result v0

    invoke-interface {p0, v0}, Lcom/bytedance/sdk/component/lw/zjm;->moa(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef(Lcom/bytedance/sdk/component/lw/zjm;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    return-object p0
.end method

.method private static oa(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 13
    sget-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    invoke-interface {v0, p0, p1}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method private static oa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 14
    sget-object v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa:Lcom/bytedance/sdk/component/lw/wk;

    invoke-interface {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static uef(Landroid/content/Context;)Lcom/bytedance/sdk/component/lw/wk;
    .locals 7

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef()V

    .line 10
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;

    sget v2, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->yo:I

    sget v3, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->moa:I

    sget v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->lw:I

    int-to-long v4, v1

    new-instance v6, Ljava/io/File;

    const-string v1, "image_p"

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/CacheDirFactory;->getImageCacheDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;-><init>(IIIJLjava/io/File;)V

    .line 11
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;-><init>()V

    .line 12
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v0

    sget-boolean v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef:Z

    .line 13
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Z)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$2;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$2;-><init>()V

    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Lcom/bytedance/sdk/component/lw/dhk;)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$1;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$1;-><init>()V

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Lcom/bytedance/sdk/component/lw/tpx;)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$uef;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef$uef;-><init>(Lcom/bytedance/sdk/openadsdk/zjm/moa$1;)V

    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Lcom/bytedance/sdk/component/lw/moa;)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef()Lcom/bytedance/sdk/component/lw/oa/yo/lw;

    move-result-object v0

    .line 18
    invoke-static {p0, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/oa;->uef(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/cq;)Lcom/bytedance/sdk/component/lw/wk;

    move-result-object p0

    return-object p0
.end method

.method private static uef(Lcom/bytedance/sdk/component/lw/zjm;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 1

    .line 19
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oyt;->uef()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Lcom/bytedance/sdk/openadsdk/zjm/lw;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/zjm/lw;-><init>()V

    invoke-interface {p0, v0}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Lcom/bytedance/sdk/component/lw/oib;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/model/sy;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/sy;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static uef()V
    .locals 3

    .line 5
    const-string v0, "bitmap_cache_count"

    const/16 v1, 0xa

    const-string v2, "image_config"

    invoke-static {v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->yo:I

    .line 6
    const-string v0, "data_cache_count"

    const/16 v1, 0xf

    invoke-static {v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->moa:I

    .line 7
    const-string v0, "disk_cache_count"

    const/16 v1, 0x1e

    invoke-static {v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->lw:I

    .line 8
    const-string v0, "img_need_scale"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    sput-boolean v1, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->uef:Z

    return-void
.end method

.method public static synthetic uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/zjm/moa$uef;->oa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
