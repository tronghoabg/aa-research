.class public Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;
.super Lcom/bytedance/adsdk/ugeno/moa/moa/yo;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/xs/cz$uef;


# instance fields
.field private cq:Landroid/os/Handler;

.field private dj:I

.field private dz:I

.field private wrv:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    .line 6
    .line 7
    new-instance v0, Lcom/bytedance/adsdk/ugeno/xs/cz;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1, p0}, Lcom/bytedance/adsdk/ugeno/xs/cz;-><init>(Landroid/os/Looper;Lcom/bytedance/adsdk/ugeno/xs/cz$uef;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->cq:Landroid/os/Handler;

    .line 17
    .line 18
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public uef(Landroid/os/Message;)V
    .locals 5

    .line 12
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e9

    if-eq p1, v0, :cond_0

    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "handleMsg: execute timer event"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UGBaseEventMonitor"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm:Ljava/lang/String;

    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->oa()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    invoke-interface {p1, v1, v2, v3, v4}, Lcom/bytedance/adsdk/ugeno/moa/dj;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/ugeno/moa/ivm;)V

    .line 15
    iget p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    if-gez p1, :cond_1

    .line 16
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    if-eqz v1, :cond_1

    .line 17
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->cq:Landroid/os/Handler;

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_1
    if-lez p1, :cond_2

    .line 18
    iget p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    if-eqz p1, :cond_2

    .line 19
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->cq:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 20
    :cond_2
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->cq:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public varargs uef([Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->lw:Ljava/util/Map;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 2
    const-string v1, "loop"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dj:I

    goto :goto_0

    .line 4
    :cond_0
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dj:I

    .line 5
    :goto_0
    iget p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dj:I

    if-gtz p1, :cond_1

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    goto :goto_1

    .line 7
    :cond_1
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->dz:I

    .line 8
    :goto_1
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->lw:Ljava/util/Map;

    const-string v1, "duration"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 9
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    goto :goto_2

    .line 10
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    .line 11
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->cq:Landroid/os/Handler;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/zjm;->wrv:I

    int-to-long v1, v1

    const/16 v3, 0x3e9

    invoke-virtual {p1, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v0
.end method
