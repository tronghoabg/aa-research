.class public Lcom/bytedance/sdk/openadsdk/core/zjm/orq;
.super Lcom/bytedance/sdk/component/adexpress/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/component/adexpress/oa/uef<",
        "Lcom/bytedance/sdk/openadsdk/core/zjm/uef;",
        ">;"
    }
.end annotation


# instance fields
.field private final ivm:Lcom/bytedance/sdk/component/adexpress/oa/cq;

.field private lw:Lcom/bytedance/sdk/component/adexpress/oa/xs;

.field private moa:Lcom/bytedance/sdk/component/adexpress/oa/yo;

.field private oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

.field uef:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final yo:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;Lcom/bytedance/sdk/component/adexpress/oa/cq;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/adexpress/oa/uef;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->yo:Landroid/view/View;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->ivm:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 15
    .line 16
    return-void
.end method

.method private oa()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->moa:Lcom/bytedance/sdk/component/adexpress/oa/yo;

    .line 11
    .line 12
    const/16 v1, 0x6b

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->yo:Landroid/view/View;

    .line 17
    .line 18
    check-cast v2, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v2, v3}, Lcom/bytedance/sdk/component/adexpress/oa/yo;->uef(Landroid/view/ViewGroup;I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->ivm:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->ivm()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->yo:Landroid/view/View;

    .line 37
    .line 38
    const-string v2, "tt_express_backup_fl_tag_26"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/oa/dz;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/bytedance/sdk/component/adexpress/oa/dz;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    move v1, v2

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->getRealWidth()F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    :goto_0
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->getRealHeight()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    :goto_1
    const/4 v3, 0x1

    .line 76
    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(Z)V

    .line 77
    .line 78
    .line 79
    float-to-double v3, v1

    .line 80
    invoke-virtual {v0, v3, v4}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(D)V

    .line 81
    .line 82
    .line 83
    float-to-double v1, v2

    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(D)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->lw:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 88
    .line 89
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 90
    .line 91
    invoke-interface {v1, v2, v0}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(Landroid/view/View;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->lw:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 96
    .line 97
    const-string v2, "backupview is null"

    .line 98
    .line 99
    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->lw:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 104
    .line 105
    const-string v2, "backup false"

    .line 106
    .line 107
    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/orq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa()V

    return-void
.end method


# virtual methods
.method public synthetic lw()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->uef()Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/zjm/uef;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/uef;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->lw:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/zjm/orq$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/orq$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/orq;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/yo;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/orq;->moa:Lcom/bytedance/sdk/component/adexpress/oa/yo;

    return-void
.end method
