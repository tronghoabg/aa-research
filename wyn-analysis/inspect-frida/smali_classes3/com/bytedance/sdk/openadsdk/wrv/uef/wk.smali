.class public Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;
.super Lcom/bytedance/sdk/component/uef/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/component/uef/yo<",
        "Lorg/json/JSONObject;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private moa:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private uef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/bytedance/sdk/openadsdk/core/oyt;",
            ">;"
        }
    .end annotation
.end field

.field private yo:J


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/yo;-><init>()V

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
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->uef:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->moa:Ljava/util/HashSet;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->yo:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->moa:Ljava/util/HashSet;

    return-object p0
.end method

.method public static uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk$1;

    invoke-direct {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    const-string p1, "requestDelayCallback"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)Lcom/bytedance/sdk/component/uef/wk;

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/uef/yo;->uef(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic uef(Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 5
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->uef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz p2, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk$2;-><init>(Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;)V

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/oa;)V

    .line 7
    const-string p2, "delay"

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-gez p1, :cond_1

    return-void

    .line 8
    :cond_1
    div-int/lit16 p1, p1, 0x3e8

    int-to-long p1, p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->yo:J

    return-void

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/uef/yo;->yo()V

    return-void
.end method
