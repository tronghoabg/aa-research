.class public Lcom/bytedance/sdk/openadsdk/core/dz/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:D

.field private cz:I

.field private dj:Ljava/lang/String;

.field private ivm:Ljava/lang/String;

.field private lw:Ljava/lang/String;

.field private moa:Ljava/lang/String;

.field oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

.field final uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

.field private wrv:Ljava/lang/String;

.field private xs:Ljava/lang/String;

.field yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

.field private zjm:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/moa;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    .line 10
    .line 11
    const-string v0, "VAST_ACTION_BUTTON"

    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->dj:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/dz/uef;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;-><init>()V

    .line 9
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v1

    if-nez v1, :cond_1

    .line 10
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;-><init>()V

    .line 11
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/moa;)V

    .line 12
    :cond_1
    const-string v2, "videoTrackers"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lorg/json/JSONObject;)V

    .line 13
    const-string v1, "vastIcon"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    .line 14
    const-string v1, "endCard"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->oa(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    .line 15
    const-string v1, "title"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->moa:Ljava/lang/String;

    .line 16
    const-string v1, "description"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->lw:Ljava/lang/String;

    .line 17
    const-string v1, "clickThroughUrl"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->ivm:Ljava/lang/String;

    .line 18
    const-string v1, "videoUrl"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs:Ljava/lang/String;

    .line 19
    const-string v1, "videDuration"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->bcc:D

    .line 20
    const-string v1, "videoWidth"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->cz:I

    .line 21
    const-string v1, "videoHeight"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->cz:I

    .line 22
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_2

    .line 23
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 24
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef(Ljava/util/Set;)V

    .line 25
    :cond_2
    const-string v2, "viewabilityVendor"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/zjm;->uef(Lorg/json/JSONArray;)Ljava/util/HashSet;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method


# virtual methods
.method public bcc()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->bcc:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public cq()Lcom/bytedance/sdk/openadsdk/core/model/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->wrv:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->wrv:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->wrv:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->dj:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v2, "VAST_ICON"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    const-string v2, "VAST_END_CARD"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->bcc:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->bcc:Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->bcc:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->bcc:Ljava/lang/String;

    .line 71
    .line 72
    :cond_3
    :goto_0
    const-string v1, "VAST_ACTION_BUTTON"

    .line 73
    .line 74
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->dj:Ljava/lang/String;

    .line 75
    .line 76
    return-object v0
.end method

.method public dj()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->zjm:I

    .line 2
    .line 3
    return v0
.end method

.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->ivm:Ljava/lang/String;

    return-object v0
.end method

.method public ivm(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->wrv:Ljava/lang/String;

    return-void
.end method

.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->lw:Ljava/lang/String;

    return-object v0
.end method

.method public lw(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->dj:Ljava/lang/String;

    return-void
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->moa:Ljava/lang/String;

    return-object v0
.end method

.method public moa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs:Ljava/lang/String;

    return-void
.end method

.method public oa()Lcom/bytedance/sdk/openadsdk/core/dz/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    return-object v0
.end method

.method public oa(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->zjm:I

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->lw:Ljava/lang/String;

    return-void
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v0

    return-object v0
.end method

.method public uef(D)V
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->bcc:D

    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->cz:I

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dz/oa;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(Ljava/lang/String;)V

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dz/yo;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(Ljava/lang/String;)V

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :cond_1
    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->moa:Ljava/lang/String;

    return-void
.end method

.method public uef(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;)V"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa(Ljava/util/Set;)V

    return-void
.end method

.method public wrv()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/moa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public xs()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/core/dz/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->ivm:Ljava/lang/String;

    return-void
.end method

.method public zjm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->cz:I

    .line 2
    .line 3
    return v0
.end method
