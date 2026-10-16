.class Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/ab;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "oa"
.end annotation


# instance fields
.field private final moa:I

.field private final oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

.field private final uef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private final yo:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/cq/uef;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->uef:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    .line 12
    .line 13
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->yo:I

    .line 14
    .line 15
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->moa:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/dj;)V
    .locals 9

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->uef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/dj;->oa()Ljava/lang/Object;

    move-result-object v1

    .line 4
    instance-of v2, v1, Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 5
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$1;

    const-string v2, "load_draw_img"

    invoke-direct {p1, p0, v2, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;Ljava/lang/String;Ljava/lang/Object;Landroid/widget/ImageView;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_1

    .line 6
    :cond_1
    instance-of v2, v1, [B

    if-eqz v2, :cond_5

    .line 7
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/dj;->lw()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-gt p1, v2, :cond_2

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    check-cast v1, [B

    invoke-static {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;[BLandroid/widget/ImageView;)V

    return-void

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    check-cast v1, [B

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->yo:I

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->moa:I

    invoke-static {p1, v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Landroid/widget/ImageView;[BII)V

    return-void

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    move-object v2, v1

    check-cast v2, [B

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef([B)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    check-cast v1, [B

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->yo:I

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->moa:I

    invoke-static {p1, v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef;Landroid/widget/ImageView;[BII)V

    return-void

    .line 13
    :cond_4
    new-instance v2, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->yo:I

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->moa:I

    invoke-virtual {v0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v5

    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iget v7, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->yo:I

    iget v8, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;->moa:I

    invoke-direct/range {v2 .. v8}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;-><init>(IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;II)V

    .line 14
    new-instance p1, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    invoke-direct {v4}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;-><init>()V

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->oa()Z

    move-result v5

    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef(Z)Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bytedance/sdk/component/lw/oa/yo/lw$uef;->uef()Lcom/bytedance/sdk/component/lw/oa/yo/lw;

    move-result-object v4

    invoke-direct {p1, v3, v4}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/cq;)V

    .line 15
    check-cast v1, [B

    invoke-virtual {v2, v1, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 16
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$2;

    const-string v2, "load_static_img"

    invoke-direct {v1, p0, v2, v0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;Ljava/lang/String;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    return-void

    .line 17
    :cond_5
    instance-of p1, v1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_6

    .line 18
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$3;

    const-string v2, "ug_load_bitmap"

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef$oa;Ljava/lang/String;Landroid/widget/ImageView;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    :goto_0
    return-void

    .line 19
    :goto_1
    const-string v0, "ImageLoaderProvider"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
