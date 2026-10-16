.class final Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/ab/oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/fz;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:I

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/fz;

.field final synthetic yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/fz;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->oa:I

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->yo:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/ab/uef/yo;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->cz()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-string v3, "app_running_time"

    .line 13
    .line 14
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    const-string v1, "loaded_app_running_time"

    .line 18
    .line 19
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->oa()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef()Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    const-string v4, "load_time"

    .line 37
    .line 38
    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "load_from"

    .line 42
    .line 43
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->oa:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "load_result"

    .line 49
    .line 50
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->yo:I

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/moa/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->zjm()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const-string v2, "load_index"

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    if-ne v1, v2, :cond_0

    .line 68
    .line 69
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    sget-wide v4, Lcom/bytedance/sdk/openadsdk/core/wk;->yo:J

    .line 74
    .line 75
    sub-long/2addr v1, v4

    .line 76
    const-string v4, "init_to_ad_load_time"

    .line 77
    .line 78
    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/uef/moa;->oa()Lcom/bytedance/sdk/openadsdk/ab/uef/moa;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/ab/uef/moa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/ab/uef/moa;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/ab/uef/moa;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/ab/uef/moa;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method
