.class public Lcom/bytedance/adsdk/ugeno/moa/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/moa/dj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/ugeno/moa/cz$uef;
    }
.end annotation


# instance fields
.field private bcc:Lcom/bytedance/adsdk/ugeno/moa/cq;

.field private cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

.field private dj:Z

.field private ivm:Lcom/bytedance/adsdk/ugeno/core/lw;

.field private lw:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private moa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/moa/yo;",
            ">;>;"
        }
    .end annotation
.end field

.field private oa:Lcom/bytedance/adsdk/ugeno/moa/cz$uef;

.field uef:Landroid/os/Handler;

.field private wrv:Z

.field private xs:Lcom/bytedance/adsdk/ugeno/moa/dz;

.field private yo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/moa/yo;",
            ">;>;"
        }
    .end annotation
.end field

.field private zjm:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Lcom/bytedance/adsdk/ugeno/moa/cz$uef;)V
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
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->lw:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->oa:Lcom/bytedance/adsdk/ugeno/moa/cz$uef;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object v0, p2, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->yo:Ljava/util/Map;

    .line 24
    .line 25
    iget-object p2, p2, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->oa:Ljava/util/Map;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    .line 28
    .line 29
    :cond_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->rj()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    new-instance p1, Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    .line 42
    .line 43
    invoke-direct {p1}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/moa/cz;)Lcom/bytedance/adsdk/ugeno/core/lw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->ivm:Lcom/bytedance/adsdk/ugeno/core/lw;

    return-object p0
.end method

.method public static uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/moa/cz;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 89
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 90
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-gtz p1, :cond_1

    return-object v0

    .line 92
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 93
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 94
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 95
    new-instance v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;

    invoke-direct {v4, p1, v2, v3}, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    const/4 p1, 0x0

    .line 96
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge p1, v2, :cond_5

    .line 97
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 98
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 99
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->wrv()Lorg/json/JSONObject;

    move-result-object v5

    .line 100
    invoke-static {v3, p0, v2, v5}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo$uef;->uef(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/oa/yo;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 101
    iget-object v3, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 102
    iget-object v3, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_2

    .line 103
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 104
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v5, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object v5, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->oa:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 107
    :cond_2
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 108
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    iget-object v5, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-object v5, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->oa:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    :goto_1
    iget-object v3, v4, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->yo:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->lw()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 113
    :cond_5
    new-instance p1, Lcom/bytedance/adsdk/ugeno/moa/cz;

    invoke-direct {p1, p0, v4}, Lcom/bytedance/adsdk/ugeno/moa/cz;-><init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Lcom/bytedance/adsdk/ugeno/moa/cz$uef;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_6
    :goto_2
    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/moa/cz;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private uef(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_2

    .line 58
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 59
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    if-eqz v0, :cond_1

    .line 60
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->lw:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-static {v1, p1, v0}, Lcom/bytedance/adsdk/ugeno/moa/oa/uef$uef;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;)Lcom/bytedance/adsdk/ugeno/moa/oa/uef;

    move-result-object v1

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "trigger action.name is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GesThrough_UGEveFacade"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_1

    .line 62
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;->uef()V

    .line 63
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;->oa()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public lw()V
    .locals 3

    .line 1
    const-string v0, "timer"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public moa()V
    .locals 3

    .line 1
    const-string v0, "animateState"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public oa(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/moa/yo;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public oa()V
    .locals 3

    .line 1
    const-string v0, "twist"

    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    const/4 v2, 0x0

    .line 5
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/moa/yo;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->yo:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 65
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v1

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->yo:Ljava/util/Map;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 68
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->yo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 69
    :cond_3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->moa:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public uef()V
    .locals 3

    .line 6
    const-string v0, "shake"

    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    const/4 v2, 0x0

    .line 10
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/lw;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->ivm:Lcom/bytedance/adsdk/ugeno/core/lw;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/cq;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->bcc:Lcom/bytedance/adsdk/ugeno/moa/cq;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/dz;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->xs:Lcom/bytedance/adsdk/ugeno/moa/dz;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/ugeno/moa/ivm;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/adsdk/ugeno/oa/yo;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;",
            ">;",
            "Lcom/bytedance/adsdk/ugeno/moa/ivm;",
            ")V"
        }
    .end annotation

    .line 76
    const-string v0, "trigger on.name is "

    const-string v1, " handlers disable is "

    .line 77
    invoke-static {v0, p2, v1}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 78
    invoke-virtual {p4}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->yo()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " delay is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->moa()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GesThrough_UGEveFacade"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    invoke-virtual {p4}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->yo()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 80
    :cond_0
    invoke-virtual {p4}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->moa()I

    move-result v4

    if-lez v4, :cond_1

    .line 81
    iget-object p4, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef:Landroid/os/Handler;

    new-instance v0, Lcom/bytedance/adsdk/ugeno/xs/zjm;

    new-instance v1, Lcom/bytedance/adsdk/ugeno/moa/cz$1;

    move-object v2, p0

    move-object v5, p1

    move-object v3, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/adsdk/ugeno/moa/cz$1;-><init>(Lcom/bytedance/adsdk/ugeno/moa/cz;Ljava/lang/String;ILcom/bytedance/adsdk/ugeno/oa/yo;Ljava/util/List;)V

    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/ugeno/xs/zjm;-><init>(Ljava/lang/Runnable;)V

    int-to-long p1, v4

    invoke-virtual {p4, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    move-object v2, p0

    move-object v5, p1

    move-object v3, p2

    move-object v6, p3

    .line 82
    iget-object p1, v2, Lcom/bytedance/adsdk/ugeno/moa/cz;->ivm:Lcom/bytedance/adsdk/ugeno/core/lw;

    if-eqz p1, :cond_2

    .line 83
    invoke-interface {p1, v5, v3, v6}, Lcom/bytedance/adsdk/ugeno/core/lw;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;)V

    .line 84
    :cond_2
    invoke-direct {p0, v3, v6}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public varargs uef(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 71
    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/ugeno/moa/cz;->oa(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 72
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 74
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 75
    invoke-virtual {v0, p2}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public uef(Landroid/view/MotionEvent;)Z
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 11
    const-string v2, "touchStart"

    invoke-virtual {p0, v2}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 12
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 13
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 14
    instance-of v4, v3, Lcom/bytedance/adsdk/ugeno/moa/moa/wrv;

    if-eqz v4, :cond_0

    .line 15
    invoke-virtual {v3, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 16
    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v0

    invoke-virtual {v3, v4}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    goto :goto_0

    .line 17
    :cond_1
    const-string v2, "touchEnd"

    invoke-virtual {p0, v2}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 18
    const-string v3, "tap"

    invoke-virtual {p0, v3}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 19
    const-string v4, "slide"

    invoke-virtual {p0, v4}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    if-eqz v2, :cond_3

    .line 20
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    .line 21
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 22
    instance-of v6, v5, Lcom/bytedance/adsdk/ugeno/moa/moa/dj;

    if-eqz v6, :cond_2

    .line 23
    invoke-virtual {v5, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 24
    new-array v6, v1, [Ljava/lang/Object;

    aput-object p1, v6, v0

    invoke-virtual {v5, v6}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    move-result v5

    iput-boolean v5, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->wrv:Z

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 25
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    if-eqz v4, :cond_16

    .line 26
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_5

    .line 27
    :cond_5
    iget-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->wrv:Z

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v1, :cond_6

    return v1

    .line 28
    :cond_6
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    const-string v5, "GesThrough_UGEveFacade"

    if-eqz v2, :cond_8

    .line 29
    invoke-virtual {v2, p1}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;->uef(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 30
    const-string p1, "mockEvent\uff0cskip"

    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    .line 31
    :cond_7
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    iget-object v6, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->lw:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2, v6, p1}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;)V

    :cond_8
    if-eqz v3, :cond_a

    .line 32
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    .line 33
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 34
    instance-of v6, v3, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;

    if-eqz v6, :cond_9

    .line 35
    move-object v6, v3

    check-cast v6, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;

    iget-object v7, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->xs:Lcom/bytedance/adsdk/ugeno/moa/dz;

    invoke-virtual {v6, v7}, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/moa/dz;)V

    .line 36
    invoke-virtual {v3, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 37
    new-array v6, v1, [Ljava/lang/Object;

    aput-object p1, v6, v0

    invoke-virtual {v3, v6}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->zjm:Z

    goto :goto_2

    .line 38
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v1, :cond_b

    if-ne v2, v3, :cond_d

    .line 39
    :cond_b
    iget-boolean v6, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->zjm:Z

    if-eqz v6, :cond_d

    .line 40
    const-string p1, "tap event handled"

    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    if-eqz p1, :cond_c

    .line 42
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;->uef()V

    :cond_c
    return v1

    :cond_d
    if-eqz v4, :cond_f

    .line 43
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_f

    .line 44
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_e
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 45
    instance-of v7, v6, Lcom/bytedance/adsdk/ugeno/moa/moa/lw;

    if-eqz v7, :cond_e

    .line 46
    move-object v7, v6

    check-cast v7, Lcom/bytedance/adsdk/ugeno/moa/moa/lw;

    iget-object v8, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->bcc:Lcom/bytedance/adsdk/ugeno/moa/cq;

    invoke-virtual {v7, v8}, Lcom/bytedance/adsdk/ugeno/moa/moa/lw;->uef(Lcom/bytedance/adsdk/ugeno/moa/cq;)V

    .line 47
    invoke-virtual {v6, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 48
    new-array v7, v1, [Ljava/lang/Object;

    aput-object p1, v7, v0

    invoke-virtual {v6, v7}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->dj:Z

    goto :goto_3

    :cond_f
    if-eq v2, v1, :cond_10

    if-ne v2, v3, :cond_13

    .line 49
    :cond_10
    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->dj:Z

    if-eqz p1, :cond_12

    .line 50
    const-string p1, "slide event handled"

    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    if-eqz p1, :cond_11

    .line 52
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;->uef()V

    :cond_11
    return v1

    .line 53
    :cond_12
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    if-eqz p1, :cond_13

    .line 54
    const-string p1, "Non-tap event & not satisfy slide requirements, need gesture through"

    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->cz:Lcom/bytedance/adsdk/ugeno/core/oa/uef;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->lw:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p1, v2}, Lcom/bytedance/adsdk/ugeno/core/oa/uef;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;)V

    .line 56
    :cond_13
    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->zjm:Z

    if-nez p1, :cond_15

    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->dj:Z

    if-eqz p1, :cond_14

    goto :goto_4

    :cond_14
    return v0

    :cond_15
    :goto_4
    return v1

    .line 57
    :cond_16
    :goto_5
    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->wrv:Z

    return p1
.end method

.method public yo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz;->oa:Lcom/bytedance/adsdk/ugeno/moa/cz$uef;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, v0, Lcom/bytedance/adsdk/ugeno/moa/cz$uef;->uef:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/List;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;

    .line 59
    .line 60
    instance-of v3, v2, Lcom/bytedance/adsdk/ugeno/moa/moa/moa;

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2, p0}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    new-array v3, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef([Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    :goto_1
    return-void
.end method
