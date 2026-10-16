.class public Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/cq/cz;


# instance fields
.field private bcc:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

.field private cz:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

.field private dj:Landroid/app/Activity;

.field private ivm:Lorg/json/JSONObject;

.field private lw:Lcom/bytedance/sdk/component/adexpress/oa/dj;

.field private moa:Ljava/lang/String;

.field private final oa:Lcom/bytedance/sdk/component/cz/ivm;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field private xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

.field private final yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private zjm:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->zjm:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    return-object p0
.end method


# virtual methods
.method public ivm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs(Z)V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    return-void
.end method

.method public lw()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public moa()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils$AudioInfoReceiver;->uef(Lcom/bytedance/sdk/openadsdk/cq/cz;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public uef(Landroid/app/Activity;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->dj:Landroid/app/Activity;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->lw:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->bcc:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->cz:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->moa:Ljava/lang/String;

    return-object p0
.end method

.method public uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->ivm:Lorg/json/JSONObject;

    return-object p0
.end method

.method public uef()V
    .locals 3

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-nez v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 11
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->moa:Ljava/lang/String;

    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(I)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 15
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/yo;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/yo;-><init>(Landroid/view/View;)V

    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->lw:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    .line 17
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->ivm:Lorg/json/JSONObject;

    .line 18
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->moa:Ljava/lang/String;

    .line 19
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->us()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(I)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->dj:Landroid/app/Activity;

    .line 21
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Landroid/app/Activity;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 22
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 23
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/moa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/moa;-><init>(Lcom/bytedance/sdk/component/cz/ivm;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    :cond_1
    :goto_0
    return-void
.end method

.method public yo()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils$AudioInfoReceiver;->uef(Lcom/bytedance/sdk/openadsdk/cq/cz;)V

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->xs()I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->zjm:I

    return-void
.end method

.method public yo(I)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->zjm:I

    if-gtz v1, :cond_1

    if-lez p1, :cond_1

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm(Z)V

    goto :goto_0

    :cond_1
    if-lez v1, :cond_2

    if-nez p1, :cond_2

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm(Z)V

    .line 7
    :cond_2
    :goto_0
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->zjm:I

    return-void
.end method
