.class Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->oa:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef(Landroid/view/ViewGroup;I)Z
    .locals 2

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->orq()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz;

    .line 19
    .line 20
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->oa:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->setClosedListenerKey(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 35
    .line 36
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 43
    .line 44
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1, p2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 52
    .line 53
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setVastVideoHelper(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/moa/oa;

    .line 67
    .line 68
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->oa:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;->setClosedListenerKey(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 83
    .line 84
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 89
    .line 90
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 91
    .line 92
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, p2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 97
    .line 98
    .line 99
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 100
    .line 101
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;->setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    :goto_0
    const/4 p1, 0x1

    .line 109
    return p1

    .line 110
    :catch_0
    const/4 p1, 0x0

    .line 111
    return p1
.end method
