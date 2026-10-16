.class public Lcom/bytedance/sdk/openadsdk/core/zjm/rt;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/ue;
.source "SourceFile"


# instance fields
.field protected final bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final oib:Lcom/bytedance/sdk/component/utils/gr$uef;

.field private sy:Landroid/app/Activity;

.field protected xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;Lcom/bytedance/sdk/openadsdk/moa/moa/lw;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;Lcom/bytedance/sdk/openadsdk/moa/moa/lw;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/zjm/rt$1;

    .line 14
    .line 15
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/rt$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/rt;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->oib:Lcom/bytedance/sdk/component/utils/gr$uef;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bs()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public ab()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->ab()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->lw()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public bcc()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->ivm()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public bs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->oib:Lcom/bytedance/sdk/component/utils/gr$uef;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cz:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/gr;->uef(Lcom/bytedance/sdk/component/utils/gr$uef;Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public dz()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public oa()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void
.end method

.method public oa(Landroid/app/Activity;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->sy:Landroid/app/Activity;

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/component/adexpress/oa/dz;)Z
    .locals 1

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->wk()Ljava/lang/String;

    move-result-object p1

    const-string v0, "v4"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public sy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->bcc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->oib:Lcom/bytedance/sdk/component/utils/gr$uef;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/gr;->uef(Lcom/bytedance/sdk/component/utils/gr$uef;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    :goto_0
    return-void
.end method

.method public uef()Lcom/bytedance/sdk/component/cz/ivm$yo;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->yo:Lcom/bytedance/sdk/component/cz/ivm$yo;

    return-object v0
.end method

.method public uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    return-void
.end method

.method public wk()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 21
    .line 22
    invoke-direct {v1, v0, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->moa()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->oa()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->sy:Landroid/app/Activity;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Landroid/app/Activity;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cq:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->ab:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->zjm:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wrv:Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wk:Lcom/bytedance/sdk/openadsdk/core/zjm/dj;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;)Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->uef()V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    return-void
.end method

.method public xs()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->xs()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->xs:Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/oa;->yo()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/rt;->sy()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
