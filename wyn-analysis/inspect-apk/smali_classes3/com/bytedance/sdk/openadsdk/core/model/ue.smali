.class public Lcom/bytedance/sdk/openadsdk/core/model/ue;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public bcc:Lorg/json/JSONObject;

.field public cq:Lcom/bytedance/sdk/openadsdk/core/tpx;

.field public cz:I
    .annotation build Lcom/bytedance/sdk/openadsdk/core/model/NetExtParams$RenderType;
    .end annotation
.end field

.field public dj:Lcom/bytedance/sdk/openadsdk/core/model/fz;

.field public ivm:Z

.field public lw:Lorg/json/JSONArray;

.field public moa:I

.field public oa:I

.field public final uef:Ljava/lang/String;

.field public wrv:Ljava/lang/String;

.field public xs:Lorg/json/JSONObject;

.field public yo:I

.field public final zjm:Lcom/bytedance/sdk/openadsdk/utils/pu;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->lw()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->uef:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->oa:I

    .line 12
    .line 13
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->yo:I

    .line 14
    .line 15
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->moa:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->lw:Lorg/json/JSONArray;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->xs:Lorg/json/JSONObject;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->bcc:Lorg/json/JSONObject;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->cz:I

    .line 26
    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->oa()Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ue;->zjm:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 32
    .line 33
    return-void
.end method
