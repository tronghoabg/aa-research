.class public abstract Lcom/bytedance/sdk/component/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bcc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/ivm;",
            ">;"
        }
    .end annotation
.end field

.field protected volatile ivm:Z

.field protected lw:Ljava/lang/String;

.field protected moa:Landroid/os/Handler;

.field protected oa:Lcom/bytedance/sdk/component/uef/dj;

.field protected uef:Landroid/content/Context;

.field xs:Lcom/bytedance/sdk/component/uef/ivm;

.field protected yo:Lcom/bytedance/sdk/component/uef/xs;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->moa:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->bcc:Ljava/util/Map;

    .line 24
    .line 25
    return-void
.end method

.method private oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/ivm;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->lw:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->bcc:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/component/uef/ivm;

    return-object p1

    .line 20
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/uef/uef;Lorg/json/JSONObject;)Lcom/bytedance/sdk/component/uef/dz;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/uef/uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/component/uef/dz;

    move-result-object p0

    return-object p0
.end method

.method private uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/component/uef/dz;
    .locals 7

    .line 30
    const-string v0, "params"

    iget-boolean v1, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 31
    :cond_0
    const-string v1, "__callback_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 32
    const-string v3, "func"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 33
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/uef;->uef()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    return-object v2

    .line 34
    :cond_1
    :try_start_0
    const-string v2, "__msg_type"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 35
    const-string v4, ""
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 37
    instance-of v4, v5, Lorg/json/JSONObject;

    if-eqz v4, :cond_2

    .line 38
    check-cast v5, Lorg/json/JSONObject;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 39
    :cond_2
    instance-of v4, v5, Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 40
    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    :cond_3
    :goto_0
    move-object v0, v4

    goto :goto_1

    .line 41
    :cond_4
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 42
    :catchall_0
    :try_start_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    :goto_1
    const-string v4, "JSSDK"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 44
    const-string v5, "namespace"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 45
    const-string v6, "__iframe_url"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-static {}, Lcom/bytedance/sdk/component/uef/dz;->uef()Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v6

    .line 47
    invoke-virtual {v6, v4}, Lcom/bytedance/sdk/component/uef/dz$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v4

    .line 48
    invoke-virtual {v4, v2}, Lcom/bytedance/sdk/component/uef/dz$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v2

    .line 49
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/component/uef/dz$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v2

    .line 50
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/uef/dz$uef;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/dz$uef;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v0

    .line 52
    invoke-virtual {v0, v5}, Lcom/bytedance/sdk/component/uef/dz$uef;->ivm(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object v0

    .line 53
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/uef/dz$uef;->xs(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/dz$uef;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz$uef;->uef()Lcom/bytedance/sdk/component/uef/dz;

    move-result-object p1
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    const/4 p1, -0x1

    .line 55
    invoke-static {v1, p1}, Lcom/bytedance/sdk/component/uef/dz;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/component/uef/dz;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public invokeMethod(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->moa:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v1, Lcom/bytedance/sdk/component/uef/uef$1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/component/uef/uef$1;-><init>(Lcom/bytedance/sdk/component/uef/uef;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public oa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/uef/ivm;->uef()V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->bcc:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/uef/ivm;

    .line 3
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/uef/ivm;->uef()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->moa:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    return-void
.end method

.method public abstract oa(Lcom/bytedance/sdk/component/uef/cz;)V
.end method

.method public final oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V
    .locals 3

    .line 6
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p2, Lcom/bytedance/sdk/component/uef/dz;->ivm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 8
    :cond_1
    const-string v0, "{"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal callback data: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/bcc;->uef(Ljava/lang/RuntimeException;)V

    .line 10
    :cond_3
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 11
    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    :goto_1
    invoke-static {}, Lcom/bytedance/sdk/component/uef/cq;->uef()Lcom/bytedance/sdk/component/uef/cq;

    move-result-object p1

    const-string v1, "__msg_type"

    const-string v2, "callback"

    .line 13
    invoke-virtual {p1, v1, v2}, Lcom/bytedance/sdk/component/uef/cq;->uef(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/component/uef/cq;

    move-result-object p1

    const-string v1, "__callback_id"

    iget-object v2, p2, Lcom/bytedance/sdk/component/uef/dz;->ivm:Ljava/lang/String;

    .line 14
    invoke-virtual {p1, v1, v2}, Lcom/bytedance/sdk/component/uef/cq;->uef(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/component/uef/cq;

    move-result-object p1

    const-string v1, "__params"

    .line 15
    invoke-virtual {p1, v1, v0}, Lcom/bytedance/sdk/component/uef/cq;->uef(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/component/uef/cq;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/cq;->oa()Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/component/uef/uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    return-void
.end method

.method public abstract uef(Lcom/bytedance/sdk/component/uef/cz;)Landroid/content/Context;
.end method

.method public abstract uef()Ljava/lang/String;
.end method

.method public final uef(Lcom/bytedance/sdk/component/uef/dz;)V
    .locals 4

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/uef;->ivm:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/uef;->uef()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 5
    :cond_1
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/dz;->xs:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/ivm;

    move-result-object v1

    if-nez v1, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->oa:Lcom/bytedance/sdk/component/uef/dj;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/uef;->uef()Ljava/lang/String;

    .line 9
    :cond_2
    new-instance v0, Lcom/bytedance/sdk/component/uef/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Namespace "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/bytedance/sdk/component/uef/dz;->xs:Ljava/lang/String;

    const-string v3, " unknown."

    .line 10
    invoke-static {v1, v2, v3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x4

    .line 11
    invoke-direct {v0, v2, v1}, Lcom/bytedance/sdk/component/uef/ab;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    return-void

    .line 12
    :cond_3
    new-instance v2, Lcom/bytedance/sdk/component/uef/lw;

    invoke-direct {v2}, Lcom/bytedance/sdk/component/uef/lw;-><init>()V

    .line 13
    iput-object v0, v2, Lcom/bytedance/sdk/component/uef/lw;->oa:Ljava/lang/String;

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->uef:Landroid/content/Context;

    iput-object v0, v2, Lcom/bytedance/sdk/component/uef/lw;->uef:Landroid/content/Context;

    .line 15
    iput-object v1, v2, Lcom/bytedance/sdk/component/uef/lw;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    .line 16
    :try_start_0
    invoke-virtual {v1, p1, v2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;

    move-result-object v0

    if-nez v0, :cond_5

    .line 17
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->oa:Lcom/bytedance/sdk/component/uef/dj;

    if-eqz v0, :cond_4

    .line 19
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/uef;->uef()Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    .line 20
    :cond_4
    :goto_0
    new-instance v0, Lcom/bytedance/sdk/component/uef/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Function "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is not registered."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x2

    invoke-direct {v0, v2, v1}, Lcom/bytedance/sdk/component/uef/ab;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    return-void

    .line 21
    :cond_5
    iget-boolean v1, v0, Lcom/bytedance/sdk/component/uef/ivm$uef;->uef:Z

    if-eqz v1, :cond_6

    .line 22
    iget-object v0, v0, Lcom/bytedance/sdk/component/uef/ivm$uef;->oa:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    .line 23
    :cond_6
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->oa:Lcom/bytedance/sdk/component/uef/dj;

    if-eqz v0, :cond_7

    .line 24
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/uef;->uef()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_1
    return-void

    .line 25
    :goto_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 26
    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    return-void
.end method

.method public abstract uef(Ljava/lang/String;)V
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/uef/uef;->uef(Ljava/lang/String;)V

    return-void
.end method

.method public final yo(Lcom/bytedance/sdk/component/uef/cz;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/uef/uef;->uef(Lcom/bytedance/sdk/component/uef/cz;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->uef:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p1, Lcom/bytedance/sdk/component/uef/cz;->moa:Lcom/bytedance/sdk/component/uef/xs;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->yo:Lcom/bytedance/sdk/component/uef/xs;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/bytedance/sdk/component/uef/cz;->bcc:Lcom/bytedance/sdk/component/uef/dj;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->oa:Lcom/bytedance/sdk/component/uef/dj;

    .line 14
    .line 15
    new-instance v0, Lcom/bytedance/sdk/component/uef/ivm;

    .line 16
    .line 17
    invoke-direct {v0, p1, p0}, Lcom/bytedance/sdk/component/uef/ivm;-><init>(Lcom/bytedance/sdk/component/uef/cz;Lcom/bytedance/sdk/component/uef/uef;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    .line 21
    .line 22
    iget-object v0, p1, Lcom/bytedance/sdk/component/uef/cz;->zjm:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/uef;->lw:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Lcom/bytedance/sdk/component/uef/cz;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
