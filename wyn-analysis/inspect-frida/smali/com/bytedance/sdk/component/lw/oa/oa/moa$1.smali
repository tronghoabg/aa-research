.class Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BLcom/bytedance/sdk/component/lw/oa/yo/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/component/lw/oa/oa/moa;

.field final synthetic oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo;

.field final synthetic uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

.field final synthetic yo:[B


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/lw/oa/oa/moa;Lcom/bytedance/sdk/component/lw/oa/yo/uef;Lcom/bytedance/sdk/component/lw/oa/yo/yo;[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->moa:Lcom/bytedance/sdk/component/lw/oa/oa/moa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->yo:[B

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "decode webp animate fail"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x3ea

    invoke-virtual {v0, v3, v2, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public uef(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;-><init>()V

    iget-object v2, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, p1, v3, v4}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;Ljava/util/Map;Z)Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(Lcom/bytedance/sdk/component/lw/dj;)V

    return-void
.end method

.method public uef([B)V
    .locals 4

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->yo:[B

    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/ivm;->uef([B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->moa:Lcom/bytedance/sdk/component/lw/oa/oa/moa;

    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo;

    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->yo:[B

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/oa/moa;Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    return-void

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/uef;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "webp animated not image format"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x3e9

    const-string v2, "result type is webp animated but data not image"

    invoke-virtual {p1, v1, v2, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
