.class final Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;
.super Lcom/bytedance/sdk/openadsdk/ab/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lorg/json/JSONObject;

.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/moa/xs;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/xs;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->oa:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->moa:Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/ab/oa/uef;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public oa()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->moa:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->xs()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa()Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->yo()Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->lw()Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->lw()Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;->uef(Lorg/json/JSONObject;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const-string v1, "feed_play"

    .line 25
    .line 26
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->oa:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    const-string v1, "feed_over"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->oa:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    const-string v1, "feed_break"

    .line 45
    .line 46
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->oa:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/xs;->uef(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_2
    return-object v0

    .line 62
    :catchall_0
    const/4 v0, 0x0

    .line 63
    return-object v0
.end method
