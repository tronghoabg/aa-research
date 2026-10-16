.class public Lcom/bytedance/sdk/openadsdk/core/oyt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/lw/oa;
.implements Lcom/bytedance/sdk/component/utils/ue$uef;
.implements Lcom/bytedance/sdk/openadsdk/dj/oa;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/oyt$yo;,
        Lcom/bytedance/sdk/openadsdk/core/oyt$uef;,
        Lcom/bytedance/sdk/openadsdk/core/oyt$oa;
    }
.end annotation


# static fields
.field private static final bcc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private ab:Z

.field private af:Z

.field private au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

.field private bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private cop:Landroid/content/Context;

.field private cp:Z

.field private cq:I

.field private cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

.field private dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

.field private dj:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private dor:Landroid/app/Activity;

.field private dv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;

.field private dxx:Z

.field private dz:Ljava/lang/String;

.field private etd:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

.field private fz:Z

.field private gb:Ljava/lang/String;

.field private gem:Z

.field private gr:Lcom/bytedance/sdk/openadsdk/core/yo/moa;

.field private gsd:Lcom/bytedance/sdk/openadsdk/cq/lw;

.field private gzw:Lcom/bytedance/sdk/openadsdk/cq/uef;

.field private hts:Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

.field private ivm:Ljava/lang/String;

.field private km:Lcom/bytedance/sdk/component/uef/wk;

.field private ku:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/openadsdk/core/dj;",
            ">;"
        }
    .end annotation
.end field

.field private final lw:Lcom/bytedance/sdk/component/utils/ue;

.field private lz:Z

.field private moa:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/bytedance/sdk/component/cz/ivm;",
            ">;"
        }
    .end annotation
.end field

.field private nkh:Lcom/bytedance/sdk/openadsdk/core/oyt$uef;

.field oa:Z

.field private oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

.field private orq:Lcom/bytedance/sdk/openadsdk/dj/moa;

.field private oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

.field private pu:Lcom/bytedance/sdk/openadsdk/cq/oa;

.field private pz:Lcom/bytedance/sdk/openadsdk/cq/dj;

.field private rj:Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;

.field private rl:Lcom/bytedance/sdk/openadsdk/cq/bcc;

.field private rt:Lorg/json/JSONObject;

.field private sk:Lcom/bytedance/sdk/openadsdk/core/widget/uef/uef;

.field private swd:Z

.field private sy:Lorg/json/JSONObject;

.field private tpx:Lorg/json/JSONObject;

.field private ue:Lcom/bytedance/sdk/openadsdk/cq/yo;

.field protected uef:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

.field private wk:I

.field private wrv:Ljava/lang/String;

.field private xs:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

.field yo:Z

.field private zjm:Ljava/lang/String;

.field private zou:Lcom/bytedance/sdk/openadsdk/core/ue;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bcc:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    const-string v2, "log_event"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string v2, "private"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v2, "dispatch_message"

    .line 21
    .line 22
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const-string v2, "custom_event"

    .line 26
    .line 27
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v2, "log_event_v3"

    .line 31
    .line 32
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ab:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cp:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->fz:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dxx:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lz:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->af:Z

    .line 21
    .line 22
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    .line 23
    .line 24
    new-instance p1, Lcom/bytedance/sdk/component/utils/ue;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p1, v0, p0}, Lcom/bytedance/sdk/component/utils/ue;-><init>(Landroid/os/Looper;Lcom/bytedance/sdk/component/utils/ue$uef;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw:Lcom/bytedance/sdk/component/utils/ue;

    .line 34
    .line 35
    return-void
.end method

.method private ab(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ue:Lcom/bytedance/sdk/openadsdk/cq/yo;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    const-string v1, "isRenderSuc"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v2, "code"

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "msg"

    const-string v4, ""

    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lcom/bytedance/sdk/openadsdk/cq/yo;->uef(ZILjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private bcc(Ljava/lang/String;)Z
    .locals 2

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 4
    :cond_0
    const-string v0, "click_other"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->zjm()Z

    move-result p1

    return p1
.end method

.method private bs(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    const-string v0, "stateType"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method private cp()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->swd()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method private cq(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method private cz(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    const-string v0, "bytedance://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    const-string v0, "bytedance://dispatch_message/"

    .line 4
    const-string v1, "bytedance://private/setresult/"

    .line 5
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq()Landroid/webkit/WebView;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 7
    const-string v0, "javascript:ToutiaoJSBridge._fetchQueue()"

    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/dz;->uef(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x26

    const/16 v1, 0x1e

    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-gtz v0, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    const-string v0, "SCENE_FETCHQUEUE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 13
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    :goto_0
    return-void
.end method

.method private dhk(Lorg/json/JSONObject;)Z
    .locals 1

    .line 1
    const-string v0, "borderRadiusTopLeft"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "borderRadiusBottomLeft"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "borderRadiusTopRight"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "borderRadiusBottomRight"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private dxx()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/dj/uef;->uef(Lcom/bytedance/sdk/openadsdk/dj/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/dj/uef;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private dz(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playable_style"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method private fz()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kn()Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->fz:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kn()Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "parent_type"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v2, 0x2

    .line 38
    if-eq v0, v2, :cond_1

    .line 39
    .line 40
    return v1

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dqw()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/16 v2, 0x8

    .line 48
    .line 49
    if-eq v0, v2, :cond_3

    .line 50
    .line 51
    const/4 v2, 0x7

    .line 52
    if-ne v0, v2, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return v1

    .line 56
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->fz:Z

    .line 58
    .line 59
    return v0

    .line 60
    :cond_4
    :goto_1
    return v1
.end method

.method private gr()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->pz:Lcom/bytedance/sdk/openadsdk/cq/dj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/cq/dj;->uef()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static gsd()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "getTemplateInfo"

    const-string v1, "getTeMaiAds"

    const-string v2, "appInfo"

    const-string v3, "adInfo"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private gsd(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 5

    .line 2
    const-string v0, "ad_extra_data"

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef:Ljava/util/Map;

    if-eqz v1, :cond_3

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 4
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const/4 v2, 0x0

    .line 5
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 6
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    .line 7
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 8
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 9
    :cond_2
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 10
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_3
    return-object p1
.end method

.method private gzw()Lorg/json/JSONObject;
    .locals 9

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dj:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v1, :cond_3

    if-nez v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/view/View;)[I

    move-result-object v3

    .line 5
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/view/View;)[I

    move-result-object v2

    if-eqz v3, :cond_3

    if-nez v2, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 7
    const-string v5, "x"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x0

    aget v8, v3, v7

    aget v7, v2, v7

    sub-int/2addr v8, v7

    int-to-float v7, v8

    invoke-static {v6, v7}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;F)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 8
    const-string v5, "y"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x1

    aget v3, v3, v7

    aget v2, v2, v7

    sub-int/2addr v3, v2

    int-to-float v2, v3

    invoke-static {v6, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 9
    const-string v2, "w"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-static {v3, v5}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    const-string v2, "h"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v3, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 11
    const-string v1, "isExist"

    invoke-virtual {v4, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v4

    :catchall_0
    :cond_3
    :goto_0
    return-object v0
.end method

.method private gzw(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:ToutiaoJSBridge._handleMessageFromToutiao("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dz;->uef(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ku()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/oyt;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->sk:Lcom/bytedance/sdk/openadsdk/core/widget/uef/uef;

    return-object p0
.end method

.method public static oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;
    .locals 11

    .line 32
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 33
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 34
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz p0, :cond_2

    .line 35
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dqw()I

    move-result v3

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    if-eqz p0, :cond_3

    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ho()I

    move-result v4

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_2
    if-eqz p0, :cond_4

    .line 37
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qe()I

    move-result v5

    goto :goto_3

    :cond_4
    move v5, v1

    .line 38
    :goto_3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->ivm(Ljava/lang/String;)Z

    move-result v6

    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v7

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dz(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_5

    move v9, v8

    goto :goto_4

    :cond_5
    move v9, v1

    :goto_4
    const/4 v10, 0x7

    if-eq v3, v10, :cond_7

    const/16 v10, 0x8

    if-ne v3, v10, :cond_6

    goto :goto_5

    .line 40
    :cond_6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->yo(Ljava/lang/String;)Z

    move-result v3

    goto :goto_6

    .line 41
    :cond_7
    :goto_5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->sy(Ljava/lang/String;)Z

    move-result v3

    .line 42
    :goto_6
    const-string v10, "voice_control"

    invoke-virtual {v0, v10, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 43
    const-string v3, "rv_skip_time"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 44
    const-string v3, "fv_skip_show"

    invoke-virtual {v0, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 45
    const-string v3, "iv_skip_time"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    const-string v3, "show_dislike"

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lox()Z

    move-result v4

    if-eqz v4, :cond_8

    move v4, v8

    goto :goto_7

    :cond_8
    move v4, v1

    :goto_7
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 47
    const-string v3, "video_adaptation"

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aos()I

    move-result v4

    goto :goto_8

    :cond_9
    move v4, v1

    :goto_8
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 48
    const-string v3, "splash_image_count_down_time"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->gsd(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz p0, :cond_a

    .line 49
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 50
    const-string v3, "dynamic_configs"

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    :cond_a
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "skip_change_to_close"

    if-eqz v3, :cond_b

    .line 52
    :try_start_1
    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_9

    .line 53
    :cond_b
    invoke-virtual {v0, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :goto_9
    if-eqz p0, :cond_c

    .line 54
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    move-result p0

    if-eqz p0, :cond_c

    move v1, v8

    .line 55
    :cond_c
    const-string p0, "bar_render_platform"

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 56
    const-string p0, "os_version"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    const-string p0, "endcard_close_time"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef(I)I

    move-result v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    const-string p0, "video_skip_result"

    invoke-virtual {v0, p0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    const-string p0, "if_show_win"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->cz(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dj(Ljava/lang/String;)I

    move-result p0

    .line 61
    const-string v1, "origin_rv_skip_time"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dhk(Ljava/lang/String;)I

    move-result p0

    .line 63
    const-string v1, "origin_iv_skip_time"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_a
    return-object v0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gsd(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private static oa(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;Lorg/json/JSONObject;)V
    .locals 2

    .line 28
    const-string v0, "mute"

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 29
    :try_start_0
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 31
    const-string p1, "jsb_def"

    goto :goto_0

    :cond_1
    const-string p1, "jsb_web"

    :goto_0
    invoke-interface {p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(ZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    return-void
.end method

.method private oa(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 64
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 65
    const-string v1, "__msg_type"

    const-string v2, "callback"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v1, "__callback_id"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    .line 67
    const-string p1, "__params"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    :cond_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static oa(Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gsd()Ljava/util/List;

    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "appName"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->uef()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    const-string v1, "innerAppName"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->xs()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    const-string v1, "aid"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->oa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    const-string v1, "sdkEdition"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->yo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    const-string v1, "formatSdkEdition"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->moa()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    const-string v1, "fullSdkEdition"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->lw()J

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 19
    const-string v1, "appVersion"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->ivm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    const-string v1, "netType"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->bcc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    const-string v1, "supportList"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/yo;->uef(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v1, "os_version"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->oa(Landroid/content/Context;)Z

    move-result v1

    const-string v2, "device_platform"

    if-eqz v1, :cond_1

    .line 25
    const-string v1, "Android_Pad"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 26
    :cond_1
    const-string v1, "Android"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    :goto_1
    const-string v1, "device_type"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)Z
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->bcc(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private oib(Lorg/json/JSONObject;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    if-eqz v2, :cond_5

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v2, :cond_1

    .line 3
    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->wk()V

    .line 4
    :cond_1
    new-instance v2, Lcom/bytedance/sdk/component/adexpress/oa/dz;

    invoke-direct {v2}, Lcom/bytedance/sdk/component/adexpress/oa/dz;-><init>()V

    const/4 v3, 0x1

    .line 5
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(I)V

    .line 6
    :try_start_0
    const-string v4, "isRenderSuc"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 7
    const-string v5, "engineType"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 8
    const-string v6, "AdSize"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    const-string v7, "height"

    const-string v8, "width"

    if-eqz v6, :cond_2

    .line 10
    :try_start_1
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 11
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v11

    goto :goto_0

    :catch_0
    const/16 v6, 0x65

    goto/16 :goto_3

    :cond_2
    const-wide/16 v9, 0x0

    move-wide v11, v9

    .line 12
    :goto_0
    const-string v6, "videoInfo"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 13
    const-string v13, "x"

    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v13

    .line 14
    const-string v15, "y"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move/from16 v17, v4

    const/16 v16, 0x65

    :try_start_2
    invoke-virtual {v6, v15}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v3

    move-wide/from16 v18, v11

    .line 15
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 16
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 17
    invoke-direct {v0, v6}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk(Lorg/json/JSONObject;)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 18
    const-string v15, "borderRadiusTopLeft"

    move-wide/from16 v20, v9

    invoke-virtual {v6, v15}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v2, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(F)V

    .line 19
    const-string v9, "borderRadiusTopRight"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v2, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(F)V

    .line 20
    const-string v9, "borderRadiusBottomLeft"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v2, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo(F)V

    .line 21
    const-string v9, "borderRadiusBottomRight"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-float v6, v9

    invoke-virtual {v2, v6}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa(F)V

    goto :goto_1

    :catch_1
    move/from16 v6, v16

    goto :goto_3

    :cond_3
    move-wide/from16 v20, v9

    .line 22
    :goto_1
    invoke-virtual {v2, v13, v14}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo(D)V

    .line 23
    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa(D)V

    .line 24
    invoke-virtual {v2, v11, v12}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->lw(D)V

    .line 25
    invoke-virtual {v2, v7, v8}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->ivm(D)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :cond_4
    move/from16 v17, v4

    move-wide/from16 v20, v9

    move-wide/from16 v18, v11

    const/16 v16, 0x65

    .line 26
    :goto_2
    :try_start_3
    const-string v3, "msg"

    invoke-static/range {v16 .. v16}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 27
    const-string v4, "code"
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move/from16 v6, v16

    :try_start_4
    invoke-virtual {v1, v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move/from16 v4, v17

    .line 28
    :try_start_5
    invoke-virtual {v2, v4}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(Z)V

    move-wide/from16 v9, v20

    .line 29
    invoke-virtual {v2, v9, v10}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(D)V

    move-wide/from16 v9, v18

    .line 30
    invoke-virtual {v2, v9, v10}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(D)V

    .line 31
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(I)V

    .line 33
    invoke-virtual {v2, v5}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(Ljava/lang/String;)V

    .line 34
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/dj;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    return-void

    .line 35
    :catch_2
    :goto_3
    invoke-virtual {v2, v6}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(I)V

    .line 36
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(Ljava/lang/String;)V

    .line 37
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/dj;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    :cond_5
    :goto_4
    return-void
.end method

.method private orq()Landroid/webkit/WebView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/cz/ivm;

    if-nez v0, :cond_1

    return-object v1

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method private orq(Lorg/json/JSONObject;)V
    .locals 4

    if-eqz p1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq:Lcom/bytedance/sdk/openadsdk/dj/moa;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    :try_start_0
    const-string v2, "temaiProductIds"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq:Lcom/bytedance/sdk/openadsdk/dj/moa;

    const/4 v3, 0x1

    invoke-interface {v2, v3, p1}, Lcom/bytedance/sdk/openadsdk/dj/moa;->uef(ZLorg/json/JSONArray;)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq:Lcom/bytedance/sdk/openadsdk/dj/moa;

    invoke-interface {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/dj/moa;->uef(ZLorg/json/JSONArray;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 9
    :catch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq:Lcom/bytedance/sdk/openadsdk/dj/moa;

    invoke-interface {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/dj/moa;->uef(ZLorg/json/JSONArray;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private pz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private rt()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/view/View;)Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    .line 28
    .line 29
    :cond_1
    return-object v0
.end method

.method private sy(Lorg/json/JSONObject;)Z
    .locals 13

    .line 1
    const-string v0, "state"

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->yo()J

    move-result-wide v4

    long-to-double v4, v4

    .line 3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->moa()J

    move-result-wide v6

    long-to-double v6, v6

    .line 4
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->lw()I

    move-result v2

    .line 5
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    const/4 v11, 0x6

    new-array v11, v11, [Ljava/lang/Object;

    const-string v12, "current:"

    aput-object v12, v11, v3

    aput-object v8, v11, v1

    const/4 v8, 0x2

    aput-object v0, v11, v8

    const/4 v8, 0x3

    aput-object v9, v11, v8

    const-string v8, "countdownTime"

    const/4 v9, 0x4

    aput-object v8, v11, v9

    const/4 v8, 0x5

    aput-object v10, v11, v8

    const-string v8, "TTAD.TopLayoutHelper"

    invoke-static {v8, v11}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    :try_start_0
    const-string v8, "currentTime"

    const-wide v9, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v9

    invoke-virtual {p1, v8, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-wide/16 v4, 0x0

    cmpl-double v4, v6, v4

    if-lez v4, :cond_1

    .line 7
    const-string v4, "countDownTime"

    div-double/2addr v6, v9

    invoke-virtual {p1, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 8
    :cond_1
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_2
    :goto_0
    return v3
.end method

.method private tpx(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    :try_start_0
    const-string v0, "trackData"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 4
    const-string v1, "bytedance"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/utils/dhk;->uef(Landroid/net/Uri;Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method private ue()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->pz:Lcom/bytedance/sdk/openadsdk/cq/dj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/cq/dj;->oa()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    const-string p1, "show"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 263
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 264
    :cond_0
    const-string p1, "aggregate_page"

    return-object p1

    .line 265
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 266
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm:Ljava/lang/String;

    return-object p1

    .line 267
    :cond_2
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ue:Lcom/bytedance/sdk/openadsdk/cq/yo;

    if-eqz p2, :cond_3

    .line 268
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 269
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    if-nez p2, :cond_4

    .line 270
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa(I)Ljava/lang/String;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Lorg/json/JSONArray;
    .locals 1

    if-eqz p0, :cond_0

    .line 253
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->ivm()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 255
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 256
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cd()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 257
    const-string p0, "creatives"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)V
    .locals 3

    .line 275
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    invoke-direct {v0, v1, p1, p2, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 276
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 277
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 278
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Landroid/view/View;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
    .locals 2

    .line 245
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 246
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p2, :cond_0

    .line 247
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kn()Lorg/json/JSONObject;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy:Lorg/json/JSONObject;

    :cond_0
    const/4 p2, 0x1

    .line 248
    invoke-interface {p3, p2, p1}, Lcom/bytedance/sdk/openadsdk/cq/moa;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 249
    invoke-interface {p3, v1, p1}, Lcom/bytedance/sdk/openadsdk/cq/moa;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    const/4 p1, -0x3

    .line 250
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(I)V

    const/4 p1, 0x7

    .line 251
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->yo(I)V

    .line 252
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/yo;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->pz()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/cq/moa;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;Lorg/json/JSONObject;)V
    .locals 0

    .line 7
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;Lorg/json/JSONObject;)V

    return-void
.end method

.method private uef(Ljava/lang/String;Z)V
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 203
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/ivm;->uef(Ljava/lang/String;)V

    return-void

    .line 204
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/ivm;->oa(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 58
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 60
    const-string v1, "cid"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 63
    const-string v1, "log_extra"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kid()Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    const-string v0, "download_url"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->au()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->au()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string p1, "TX"

    :goto_0
    const-string v0, "dc"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    const-string p1, "language"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cq;->oa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->vj()Z

    move-result p1

    const-string v0, "isRTL"

    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-void
.end method

.method private uef(Lorg/json/JSONObject;ZLjava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    .line 182
    :cond_0
    :try_start_0
    const-string p2, "ad_extra_data"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 183
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 184
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 185
    const-string p1, "agg_request_type"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 186
    const-string p1, "click"

    .line 187
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

    if-eqz p1, :cond_1

    .line 188
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/lw;->uef()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 189
    :goto_1
    const-string p2, "TTAD.AndroidObject"

    const-string p3, "callAggClickListener faile"

    invoke-static {p2, p3, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private uef(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/ab;)Z
    .locals 0

    .line 213
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ku:Ljava/util/HashMap;

    if-nez p2, :cond_0

    goto :goto_0

    .line 214
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/dj;

    if-nez p1, :cond_1

    return p3

    :cond_1
    const/4 p1, 0x0

    .line 215
    throw p1

    :cond_2
    :goto_0
    return p3
.end method

.method private uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z
    .locals 7

    if-eqz p1, :cond_0

    .line 190
    const-string v0, "landingStyle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 191
    const-string v1, "url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 192
    const-string v2, "fallback_url"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v0, -0x1

    move-object p1, v1

    .line 193
    :goto_0
    const-string v2, "TTAD.AndroidObject"

    const-string v3, "invalid_url"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    .line 194
    invoke-static {v1}, Lcom/bytedance/sdk/component/utils/sy;->uef(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 195
    :try_start_0
    invoke-virtual {p2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 196
    const-string p2, "handleUrl, EX1->: "

    invoke-static {v2, p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_1
    const/4 v6, 0x2

    if-ne v0, v6, :cond_3

    .line 197
    :try_start_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 198
    const-string p1, "empty_url"

    invoke-virtual {p2, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return v4

    :catch_1
    move-exception p1

    goto :goto_1

    .line 199
    :cond_2
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/sy;->uef(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 200
    invoke-virtual {p2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return v4

    .line 201
    :goto_1
    const-string p2, "handleUrl, EX2->: "

    invoke-static {v2, p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return v4

    :cond_3
    return v5
.end method

.method private wk(Lorg/json/JSONObject;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/ivm;->oa(Lorg/json/JSONObject;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private xs(Ljava/lang/String;)V
    .locals 6

    .line 7
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 8
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 10
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;

    invoke-direct {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 12
    const-string v4, "__msg_type"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->uef:Ljava/lang/String;

    .line 13
    const-string v4, "__callback_id"

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->oa:Ljava/lang/String;

    .line 14
    const-string v4, "func"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->yo:Ljava/lang/String;

    .line 15
    const-string v4, "params"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    iput-object v4, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    .line 16
    const-string v4, "JSSDK"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    iput v3, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->lw:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :catchall_0
    :cond_0
    :try_start_2
    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->uef:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->yo:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 18
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw:Lcom/bytedance/sdk/component/utils/ue;

    const/16 v4, 0xb

    invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 19
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 20
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/oyt;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wk:I

    return p0
.end method

.method private yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 20
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 21
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 22
    const-string v2, "is_ad_event"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->au()Ljava/lang/String;

    move-result-object v2

    const-string v3, "cid"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    const-string v2, "req_id"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ofp()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    const-string v2, "ad_id"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    const-string v2, "log_extra"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->vj()Z

    move-result v2

    const-string v3, "isRTL"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 28
    const-string v2, "ad_info"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    const-string v1, "endcard_creative"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    const-string v1, "dynamic_creative"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lo()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    const-string v1, "title"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lorg/json/JSONObject;)V

    .line 33
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lorg/json/JSONObject;)V

    .line 34
    const-string v1, "source"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    const-string v1, "button_text"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->up()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->agr()Lcom/bytedance/sdk/openadsdk/core/model/cq;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 37
    const-string v2, "deeplink_url"

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/cq;->uef()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    :cond_0
    const-string v1, "app_name"

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wf()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->swd()Z

    move-result v1

    const-string v2, "has_show"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 40
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    move-result p1

    const-string v1, "has_click"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-object v0
.end method

.method private yo(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 12
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 14
    const-string v1, "__msg_type"

    const-string v2, "event"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    const-string v1, "__event_id"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    .line 16
    const-string p1, "__params"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    :cond_1
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method


# virtual methods
.method public ab()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ue;->o_()V

    :cond_0
    return-void
.end method

.method public adInfo()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public appInfo()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bcc(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 6
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v1, :cond_0

    .line 8
    :try_start_0
    invoke-interface {v1, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(Lorg/json/JSONObject;)Z

    move-result p1

    .line 9
    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method public bcc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->oa()V

    :cond_0
    return-void
.end method

.method public bs()Lorg/json/JSONObject;
    .locals 3

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    if-eqz v1, :cond_0

    .line 6
    const-string v2, "leftTime"

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/core/ue;->p_()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public changeVideoState(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/oyt$3;

    .line 7
    .line 8
    invoke-direct {p1, p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method public clickEvent(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/oyt$4;

    .line 7
    .line 8
    invoke-direct {p1, p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method public cq()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->nkh:Lcom/bytedance/sdk/openadsdk/core/oyt$uef;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt$uef;->uef()V

    :cond_0
    return-void
.end method

.method public cz(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 14
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 15
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v1, :cond_0

    .line 17
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->zou()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 19
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    invoke-direct {p0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    :cond_0
    const-string v1, "creatives"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method

.method public cz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->af:Z

    return v0
.end method

.method public dhk()V
    .locals 3

    .line 5
    :try_start_0
    const-string v0, "requestHeartBeat"

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 6
    const-string v1, "TTAD.AndroidObject"

    const-string v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public dj()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->fz()Z

    return-void
.end method

.method public dj(Lorg/json/JSONObject;)V
    .locals 2

    .line 2
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ue;->q_()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ue;->r_()V

    :cond_1
    return-void
.end method

.method public dynamicTrack(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    return-void
.end method

.method public dz()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    return-object v0
.end method

.method public getCurrentVideoState()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy(Lorg/json/JSONObject;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getData(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa/yo;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object p1

    .line 39
    :catch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public getTemplateInfo()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "getTemplateInfo"

    .line 3
    .line 4
    invoke-direct {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string v2, "setting"

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ku()Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 31
    .line 32
    const-string v2, "dynamic_configs"

    .line 33
    .line 34
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 48
    .line 49
    const-string v3, "extension"

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ht()Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-object v0

    .line 69
    :catch_0
    const-string v0, ""

    .line 70
    .line 71
    return-object v0
.end method

.method public initRenderFinish()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$6;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/oyt$6;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public ivm(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    return-void
.end method

.method public ivm(Lorg/json/JSONObject;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v0, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oa;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;Lcom/bytedance/sdk/openadsdk/core/model/uef;I)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    .line 6
    :goto_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/bcc;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    const/4 v1, 0x1

    .line 7
    :cond_2
    :goto_1
    invoke-direct {p0, p1, v2, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public ivm(Z)V
    .locals 2

    .line 8
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    const-string v1, "endcard_mute"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 10
    const-string p1, "volumeChange"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa:Z

    return v0
.end method

.method public lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz:Ljava/lang/String;

    return-object p0
.end method

.method public lw(I)V
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    if-eqz p1, :cond_1

    .line 43
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;->uef()V

    :cond_1
    :goto_0
    return-void
.end method

.method public lw(Lorg/json/JSONObject;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 4
    :cond_0
    const-string v2, "TTAD.AndroidObject"

    const-string v3, "trigger Class1 method1"

    invoke-static {v2, v3}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, -0x1

    .line 5
    :try_start_0
    const-string v4, "adId"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    const-string v5, "areaType"

    const/4 v6, 0x1

    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 7
    const-string v7, "clickAreaType"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 8
    const-string v8, "clickInfo"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    if-eqz v8, :cond_1

    .line 9
    const-string v12, "down_x"

    invoke-virtual {v8, v12, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v12

    .line 10
    const-string v14, "down_y"

    invoke-virtual {v8, v14, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v14

    .line 11
    const-string v6, "up_x"

    invoke-virtual {v8, v6, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v16

    .line 12
    const-string v6, "up_y"

    invoke-virtual {v8, v6, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v18

    .line 13
    const-string v6, "down_time"

    invoke-virtual {v8, v6, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v20

    .line 14
    const-string v6, "up_time"

    invoke-virtual {v8, v6, v10, v11}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v10

    .line 15
    const-string v6, "rectInfo"

    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 16
    const-string v3, "duration"

    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    move-wide/from16 v26, v10

    move-wide v10, v12

    move-wide/from16 v12, v16

    move-wide/from16 v22, v18

    move-wide/from16 v24, v20

    goto :goto_0

    :cond_1
    move-wide v12, v10

    move-wide v14, v12

    move-wide/from16 v22, v14

    move-wide/from16 v24, v22

    move-wide/from16 v26, v24

    const/4 v6, 0x0

    .line 17
    :goto_0
    const-string v3, "dislike_source"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v4

    .line 18
    const-string v4, "clickAreaCategory"

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    .line 19
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    invoke-direct {v4}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;-><init>()V

    double-to-float v10, v10

    .line 20
    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    double-to-float v10, v14

    .line 21
    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    double-to-float v10, v12

    .line 22
    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    move-wide/from16 v10, v22

    double-to-float v10, v10

    .line 23
    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    move-wide/from16 v10, v24

    double-to-long v10, v10

    .line 24
    invoke-virtual {v4, v10, v11}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    move-wide/from16 v10, v26

    double-to-long v10, v10

    .line 25
    invoke-virtual {v4, v10, v11}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    .line 26
    invoke-virtual {v4, v7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    const/4 v7, 0x0

    .line 27
    invoke-virtual {v4, v7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    const/4 v7, 0x1

    .line 28
    invoke-virtual {v4, v7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    .line 29
    invoke-virtual {v4, v9}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(I)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    .line 30
    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(I)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    .line 31
    invoke-virtual {v4, v6}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v4

    .line 32
    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(I)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v1

    .line 33
    invoke-virtual {v1, v8}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v1

    .line 34
    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/ab;

    move-result-object v1

    .line 36
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    if-eqz v3, :cond_2

    const/4 v7, 0x0

    .line 37
    invoke-interface {v3, v7, v5, v1}, Lcom/bytedance/sdk/component/adexpress/oa/dj;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    :cond_2
    move-object/from16 v3, v16

    .line 38
    invoke-direct {v0, v3, v5, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/ab;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 39
    :catch_0
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    if-eqz v1, :cond_3

    const/4 v7, 0x0

    .line 40
    invoke-interface {v1, v7, v2, v7}, Lcom/bytedance/sdk/component/adexpress/oa/dj;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public lw(Z)V
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gem:Z

    return-void
.end method

.method public lw()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xvp()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object v0
.end method

.method public moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv:Ljava/lang/String;

    return-object p0
.end method

.method public moa(I)V
    .locals 2

    .line 18
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 19
    const-string v1, "netType"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 20
    const-string p1, "netTypeChange"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public moa(Lorg/json/JSONObject;)V
    .locals 10

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "zoom_type"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 5
    const-string v1, "videoInfo"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 6
    new-instance v1, Lcom/bytedance/sdk/component/adexpress/oa/dz;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;-><init>()V

    if-eqz p1, :cond_1

    .line 7
    const-string v2, "x"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 8
    const-string v4, "y"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 9
    const-string v6, "width"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 10
    const-string v8, "height"

    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 11
    invoke-virtual {v1, v2, v3}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo(D)V

    .line 12
    invoke-virtual {v1, v4, v5}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa(D)V

    .line 13
    invoke-virtual {v1, v6, v7}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->lw(D)V

    .line 14
    invoke-virtual {v1, v8, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->ivm(D)V

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz p1, :cond_2

    .line 16
    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(ILcom/bytedance/sdk/component/adexpress/oa/dz;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public moa(Z)V
    .locals 0

    .line 17
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->swd:Z

    return-void
.end method

.method public muteVideo(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->hts:Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    .line 16
    .line 17
    invoke-direct {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt$yo;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;Lorg/json/JSONObject;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->hts:Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    const-string p1, "TTAD.AndroidObject"

    .line 27
    .line 28
    const-string v0, ""

    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public oa()Lcom/bytedance/sdk/component/uef/wk;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    return-object v0
.end method

.method public oa(I)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 8
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    return-object p0
.end method

.method public oa(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 1

    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm:Ljava/lang/String;

    return-object p0
.end method

.method public oa(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lz:Z

    return-object p0
.end method

.method public oa(Landroid/net/Uri;)V
    .locals 2

    .line 69
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 70
    const-string v1, "log_event"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "custom_event"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "log_event_v3"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    const-string v1, "private"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "dispatch_message"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz(Ljava/lang/String;)V

    return-void

    .line 73
    :cond_2
    :goto_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;

    const-string v1, "log_event_handleUri"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt$10;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public oib()V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v0, :cond_0

    .line 39
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->ku()V

    :cond_0
    return-void
.end method

.method public renderDidFinish(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    return-void
.end method

.method public skipVideo()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/oyt$5;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public sy()V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ue;->s_()V

    :cond_0
    return-void
.end method

.method public tpx()V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;->uef()V

    :cond_0
    return-void
.end method

.method public uef(I)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 46
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wk:I

    return-object p0
.end method

.method public uef(Landroid/app/Activity;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dor:Landroid/app/Activity;

    return-object p0
.end method

.method public uef(Landroid/view/View;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 1

    .line 45
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dj:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 2

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 13
    :cond_1
    :try_start_0
    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Landroid/webkit/WebView;)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/wrv/uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef;-><init>()V

    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/cz;->uef(Lcom/bytedance/sdk/component/uef/uef;)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    const-string v1, "ToutiaoJSBridge"

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/cz;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/oyt$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/oyt$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/cz;->uef(Lcom/bytedance/sdk/component/uef/zjm;)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    .line 17
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm;->wk()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/cz;->uef(Z)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/uef/cz;->oa(Z)Lcom/bytedance/sdk/component/uef/cz;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/uef/cz;->uef()Lcom/bytedance/sdk/component/uef/wk;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->xs()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/bcc;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/zjm;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, p1, p0, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, p1, p0, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/tpx;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 27
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/uef;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/oa;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/yo;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/dj;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/ab;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cq;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 34
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/lw;->uef(Lcom/bytedance/sdk/component/uef/wk;Lorg/json/JSONObject;)V

    .line 35
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/moa;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 36
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, p0, v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wk;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 37
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/bs;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 38
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/sy;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 39
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 40
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/dhk;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 41
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    .line 42
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, p0, v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/oib;->uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :catch_0
    :goto_1
    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->etd:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p1, :cond_0

    .line 48
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kn()Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy:Lorg/json/JSONObject;

    :cond_0
    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/widget/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/widget/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->sk:Lcom/bytedance/sdk/openadsdk/core/widget/uef/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/bcc;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rl:Lcom/bytedance/sdk/openadsdk/cq/bcc;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->pz:Lcom/bytedance/sdk/openadsdk/cq/dj;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gsd:Lcom/bytedance/sdk/openadsdk/cq/lw;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw:Lcom/bytedance/sdk/openadsdk/cq/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/yo;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ue:Lcom/bytedance/sdk/openadsdk/cq/yo;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oyt:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    return-object p0
.end method

.method public uef(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/bytedance/sdk/openadsdk/core/oyt;"
        }
    .end annotation

    .line 51
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef:Ljava/util/Map;

    return-object p0
.end method

.method public uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    return-object p0
.end method

.method public uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dxx:Z

    return-object p0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/cq/oa;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->pu:Lcom/bytedance/sdk/openadsdk/cq/oa;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/oyt$oa;I)Lorg/json/JSONObject;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    .line 70
    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->uef:Ljava/lang/String;

    const-string v8, "call"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_0

    return-object v8

    .line 71
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v7

    invoke-virtual {v7}, Lcom/bytedance/sdk/openadsdk/core/zjm;->wk()Z

    move-result v7

    const-string v9, "TTAD.AndroidObject"

    if-eqz v7, :cond_1

    .line 72
    const-string v7, "[JSB-REQ] version:"

    const-string v10, " method:"

    .line 73
    invoke-static {v2, v7, v10}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 74
    iget-object v10, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->yo:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v9, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    :cond_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 76
    iget-object v10, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->yo:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v11, 0x0

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_0

    :goto_0
    move v10, v6

    goto/16 :goto_1

    :sswitch_0
    const-string v13, "landscape_click"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    const/16 v10, 0x21

    goto/16 :goto_1

    :sswitch_1
    const-string v13, "skipVideo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_0

    :cond_3
    const/16 v10, 0x20

    goto/16 :goto_1

    :sswitch_2
    const-string v13, "sendLog"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_0

    :cond_4
    const/16 v10, 0x1f

    goto/16 :goto_1

    :sswitch_3
    const-string v13, "playable_style"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_0

    :cond_5
    const/16 v10, 0x1e

    goto/16 :goto_1

    :sswitch_4
    const-string v13, "getNetworkData"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_0

    :cond_6
    const/16 v10, 0x1d

    goto/16 :goto_1

    :sswitch_5
    const-string v13, "endcard_load"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    goto :goto_0

    :cond_7
    const/16 v10, 0x1c

    goto/16 :goto_1

    :sswitch_6
    const-string v13, "removeLoading"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    goto :goto_0

    :cond_8
    const/16 v10, 0x1b

    goto/16 :goto_1

    :sswitch_7
    const-string v13, "renderDidFinish"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_0

    :cond_9
    const/16 v10, 0x1a

    goto/16 :goto_1

    :sswitch_8
    const-string v13, "muteVideo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    goto :goto_0

    :cond_a
    const/16 v10, 0x19

    goto/16 :goto_1

    :sswitch_9
    const-string v13, "pauseWebViewTimers"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v10, 0x18

    goto/16 :goto_1

    :sswitch_a
    const-string v13, "getVolume"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v10, 0x17

    goto/16 :goto_1

    :sswitch_b
    const-string v13, "getCurrentVideoState"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v10, 0x16

    goto/16 :goto_1

    :sswitch_c
    const-string v13, "cancel_download_app_ad"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v10, 0x15

    goto/16 :goto_1

    :sswitch_d
    const-string v13, "getTemplateInfo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v10, 0x14

    goto/16 :goto_1

    :sswitch_e
    const-string v13, "dynamicTrack"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v10, 0x13

    goto/16 :goto_1

    :sswitch_f
    const-string v13, "sendReward"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v10, 0x12

    goto/16 :goto_1

    :sswitch_10
    const-string v13, "getNativeSiteCustomData"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v10, 0x11

    goto/16 :goto_1

    :sswitch_11
    const-string v13, "isViewable"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v10, 0x10

    goto/16 :goto_1

    :sswitch_12
    const-string v13, "getCloseButtonInfo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v10, 0xf

    goto/16 :goto_1

    :sswitch_13
    const-string v13, "unsubscribe_app_ad"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v10, 0xe

    goto/16 :goto_1

    :sswitch_14
    const-string v13, "close"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v10, 0xd

    goto/16 :goto_1

    :sswitch_15
    const-string v13, "download_app_ad"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v10, 0xc

    goto/16 :goto_1

    :sswitch_16
    const-string v13, "getTeMaiAds"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v10, 0xb

    goto/16 :goto_1

    :sswitch_17
    const-string v13, "send_temai_product_ids"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v10, 0xa

    goto/16 :goto_1

    :sswitch_18
    const-string v13, "openPrivacy"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v10, 0x9

    goto/16 :goto_1

    :sswitch_19
    const-string v13, "getScreenSize"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v10, 0x8

    goto/16 :goto_1

    :sswitch_1a
    const-string v13, "appInfo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/4 v10, 0x7

    goto :goto_1

    :sswitch_1b
    const-string v13, "clickEvent"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/4 v10, 0x6

    goto :goto_1

    :sswitch_1c
    const-string v13, "webview_time_track"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/4 v10, 0x5

    goto :goto_1

    :sswitch_1d
    const-string v13, "openAdLandPageLinks"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/4 v10, 0x4

    goto :goto_1

    :sswitch_1e
    const-string v13, "changeVideoState"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_20

    goto/16 :goto_0

    :cond_20
    move v10, v3

    goto :goto_1

    :sswitch_1f
    const-string v13, "pauseWebView"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_21

    goto/16 :goto_0

    :cond_21
    const/4 v10, 0x2

    goto :goto_1

    :sswitch_20
    const-string v13, "adInfo"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_22

    goto/16 :goto_0

    :cond_22
    move v10, v4

    goto :goto_1

    :sswitch_21
    const-string v13, "subscribe_app_ad"

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_23

    goto/16 :goto_0

    :cond_23
    move v10, v5

    :goto_1
    packed-switch v10, :pswitch_data_0

    goto/16 :goto_4

    .line 77
    :pswitch_0
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    instance-of v5, v3, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v5, :cond_24

    .line 78
    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->hts()V

    .line 79
    :cond_24
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    if-eqz v3, :cond_33

    .line 80
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;->uef()V

    goto/16 :goto_4

    .line 81
    :pswitch_1
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->pz()V

    goto/16 :goto_4

    .line 82
    :pswitch_2
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    if-eqz v3, :cond_33

    .line 83
    const-string v5, "extJson"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_33

    .line 84
    const-string v6, "category"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_33

    .line 85
    const-string v8, "tag"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_33

    .line 86
    const-string v10, "label"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_33

    .line 87
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 88
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 89
    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 90
    const-string v10, "value"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v18

    .line 91
    const-string v10, "extValue"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v20

    .line 92
    :try_start_0
    const-string v3, "ua_policy"

    iget v10, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wk:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v3, v10}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :catch_0
    const-string v3, "click"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 94
    invoke-direct {v0, v5}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gsd(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v5

    .line 95
    :cond_25
    const-string v3, "insight_log"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v3, :cond_28

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xg()Z

    move-result v3

    if-eqz v3, :cond_28

    .line 96
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ql()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v10, "page_visible"

    invoke-virtual {v5, v10, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rw()J

    move-result-wide v13

    cmp-long v3, v13, v11

    const-wide/16 v13, -0x1

    if-lez v3, :cond_26

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v16

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rw()J

    move-result-wide v22

    sub-long v16, v16, v22

    goto :goto_2

    :cond_26
    move-wide/from16 v16, v13

    .line 98
    :goto_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v10, "time_to_leave"

    invoke-virtual {v5, v10, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dos()J

    move-result-wide v16

    cmp-long v3, v16, v11

    if-lez v3, :cond_27

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dos()J

    move-result-wide v12

    sub-long/2addr v10, v12

    move-wide v13, v10

    .line 100
    :cond_27
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v10, "time_to_click"

    invoke-virtual {v5, v10, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    :cond_28
    invoke-direct {v0, v6, v8}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 102
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    .line 103
    invoke-direct {v0, v5, v3, v8}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;ZLjava/lang/String;)V

    .line 104
    iget-object v14, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move/from16 v23, v3

    move-object/from16 v22, v5

    move-object/from16 v17, v8

    invoke-static/range {v14 .. v23}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLorg/json/JSONObject;Z)V

    goto/16 :goto_4

    .line 105
    :pswitch_3
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 106
    :pswitch_4
    invoke-virtual {v0, v1, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt$oa;Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 107
    :pswitch_5
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ab(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 108
    :pswitch_6
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gsd:Lcom/bytedance/sdk/openadsdk/cq/lw;

    if-eqz v3, :cond_33

    .line 109
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/cq/lw;->uef()V

    goto/16 :goto_4

    .line 110
    :pswitch_7
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oib(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 111
    :pswitch_8
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-static {v3, v5}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 112
    :pswitch_9
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ue()V

    goto/16 :goto_4

    .line 113
    :pswitch_a
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v8

    const-string v10, "audio"

    invoke-virtual {v8, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/media/AudioManager;

    if-eqz v8, :cond_29

    .line 114
    invoke-virtual {v8, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v6

    :cond_29
    if-gtz v6, :cond_2a

    move v5, v4

    .line 115
    :cond_2a
    const-string v3, "endcard_mute"

    invoke-virtual {v7, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 116
    :pswitch_b
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy(Lorg/json/JSONObject;)Z

    goto/16 :goto_4

    .line 117
    :pswitch_c
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    if-eqz v3, :cond_2c

    .line 118
    const-string v5, "setting"

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ku()Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v3, :cond_2b

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_2b

    .line 120
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->rwy()Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "dynamic_configs"

    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    :cond_2b
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v3, :cond_2c

    .line 122
    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    const-string v6, "extension"

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ht()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    :cond_2c
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx:Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 124
    :pswitch_d
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->tpx(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 125
    :pswitch_e
    iput-boolean v4, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa:Z

    .line 126
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v3, :cond_2d

    .line 127
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->oyt()V

    .line 128
    :cond_2d
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->etd:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    if-eqz v3, :cond_33

    .line 129
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    if-eqz v3, :cond_2e

    .line 130
    const-string v5, "play_start_ts"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 131
    const-string v5, "user_watched_time"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    .line 132
    :cond_2e
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->etd:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    invoke-interface {v3, v11, v12, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;->uef(JI)V

    goto/16 :goto_4

    .line 133
    :pswitch_f
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v3, :cond_33

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tam()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_33

    .line 134
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tam()Ljava/lang/String;

    move-result-object v3

    const-string v5, "data"

    invoke-virtual {v7, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 135
    :pswitch_10
    iget-boolean v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dxx:Z

    const-string v5, "viewStatus"

    invoke-virtual {v7, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 136
    iget-boolean v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->lz:Z

    const-string v5, "adFirstShow"

    invoke-virtual {v7, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 137
    :pswitch_11
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_33

    :goto_3
    move-object v7, v3

    goto/16 :goto_4

    .line 138
    :pswitch_12
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    if-eqz v3, :cond_33

    .line 139
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-interface {v3, v5}, Lcom/bytedance/sdk/openadsdk/dj/yo;->uef(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 140
    :pswitch_13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs()V

    goto/16 :goto_4

    .line 141
    :pswitch_14
    iput-boolean v4, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->af:Z

    .line 142
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    invoke-static {v3, v5, v4, v8}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    .line 143
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gr:Lcom/bytedance/sdk/openadsdk/core/yo/moa;

    if-eqz v3, :cond_2f

    .line 144
    iget-boolean v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cp:Z

    invoke-interface {v3, v5}, Lcom/bytedance/sdk/openadsdk/core/yo/moa;->lw(Z)V

    goto/16 :goto_4

    .line 145
    :cond_2f
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    if-eqz v3, :cond_31

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    if-eqz v5, :cond_31

    .line 146
    iget-object v6, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    iget-object v8, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    invoke-interface {v3, v5, v6, v8}, Lcom/bytedance/sdk/openadsdk/dj/yo;->uef(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 147
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v3, :cond_30

    .line 148
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->hts()V

    .line 149
    :cond_30
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    if-eqz v3, :cond_33

    .line 150
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;->uef()V

    goto/16 :goto_4

    .line 151
    :cond_31
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    const/4 v6, -0x2

    invoke-static {v3, v5, v6, v8}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 152
    :pswitch_15
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rt:Lorg/json/JSONObject;

    if-eqz v3, :cond_33

    goto :goto_3

    .line 153
    :pswitch_16
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq(Lorg/json/JSONObject;)V

    goto/16 :goto_4

    .line 154
    :pswitch_17
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cp()V

    goto/16 :goto_4

    .line 155
    :pswitch_18
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw:Lcom/bytedance/sdk/openadsdk/cq/uef;

    if-eqz v3, :cond_33

    .line 156
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/cq/uef;->oa()I

    move-result v3

    .line 157
    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gzw:Lcom/bytedance/sdk/openadsdk/cq/uef;

    invoke-interface {v5}, Lcom/bytedance/sdk/openadsdk/cq/uef;->uef()I

    move-result v5

    .line 158
    const-string v6, "width"

    invoke-virtual {v7, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 159
    const-string v3, "height"

    invoke-virtual {v7, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_4

    .line 160
    :pswitch_19
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 161
    :pswitch_1a
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 162
    :pswitch_1b
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->wk(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 163
    :pswitch_1c
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    .line 164
    invoke-direct {v0, v3, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z

    move-result v5

    if-eqz v5, :cond_33

    .line 165
    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 166
    :pswitch_1d
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 167
    :pswitch_1e
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->gr()V

    goto :goto_4

    .line 168
    :pswitch_1f
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq(Lorg/json/JSONObject;)V

    goto :goto_4

    .line 169
    :pswitch_20
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dxx()V

    .line 170
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v10, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    invoke-static {v3, v10, v5, v8}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    .line 171
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    if-eqz v12, :cond_32

    .line 172
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    iget-object v13, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    iget-object v14, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv:Ljava/lang/String;

    iget v15, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    iget-boolean v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ab:Z

    move/from16 v16, v3

    invoke-interface/range {v11 .. v16}, Lcom/bytedance/sdk/openadsdk/dj/yo;->uef(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;IZ)V

    goto :goto_4

    .line 173
    :cond_32
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    invoke-static {v3, v5, v6, v8}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    :cond_33
    :goto_4
    :pswitch_21
    if-ne v2, v4, :cond_34

    .line 174
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->oa:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_34

    .line 175
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->oa:Ljava/lang/String;

    invoke-direct {v0, v1, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 176
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm;->wk()Z

    move-result v1

    if-eqz v1, :cond_34

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "[JSB-RSP] version:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_34
    return-object v7

    :sswitch_data_0
    .sparse-switch
        -0x7966d06a -> :sswitch_21
        -0x54d5e48f -> :sswitch_20
        -0x4f555ebd -> :sswitch_1f
        -0x45af975a -> :sswitch_1e
        -0x3d07124e -> :sswitch_1d
        -0x325352a1 -> :sswitch_1c
        -0x2fbc0e0e -> :sswitch_1b
        -0x2f57a591 -> :sswitch_1a
        -0x2aa0497d -> :sswitch_19
        -0x1e7a3222 -> :sswitch_18
        -0x1097c80a -> :sswitch_17
        -0xa5b419e -> :sswitch_16
        0x1a8c298 -> :sswitch_15
        0x5a5ddf8 -> :sswitch_14
        0x642ec2f -> :sswitch_13
        0x17d08ce2 -> :sswitch_12
        0x18049cc9 -> :sswitch_11
        0x195bc1cf -> :sswitch_10
        0x1a6244d7 -> :sswitch_f
        0x220cf04c -> :sswitch_e
        0x26c16abe -> :sswitch_d
        0x281c12d3 -> :sswitch_c
        0x2a6ab279 -> :sswitch_b
        0x34c20a10 -> :sswitch_a
        0x420130f1 -> :sswitch_9
        0x44a639e2 -> :sswitch_8
        0x49bca8fc -> :sswitch_7
        0x5b52a418 -> :sswitch_6
        0x616caa3a -> :sswitch_5
        0x66233dc2 -> :sswitch_4
        0x673944c0 -> :sswitch_3
        0x7602ce9c -> :sswitch_2
        0x7c55d63c -> :sswitch_1
        0x7d77e304 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_21
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public uef(II)V
    .locals 2

    .line 286
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 287
    const-string v1, "width"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 288
    const-string p1, "height"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 289
    const-string p1, "resize"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 290
    const-string p2, "TTAD.AndroidObject"

    const-string v0, ""

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public uef(ILorg/json/JSONObject;)V
    .locals 1

    .line 295
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rj:Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;

    if-eqz v0, :cond_0

    .line 296
    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;->uef(ILorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 272
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;

    if-eqz v0, :cond_1

    .line 273
    :try_start_0
    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt$oa;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rj:Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/oyt$oa;Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    :try_start_0
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/oyt$7;

    invoke-direct {v1, p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt$7;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/oyt$oa;)V

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/oyt$uef;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->nkh:Lcom/bytedance/sdk/openadsdk/core/oyt$uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/ue;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/oa;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->pu:Lcom/bytedance/sdk/openadsdk/cq/oa;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 2

    .line 205
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 206
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 207
    const-string p1, "time"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 208
    const-string v1, "flag"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 209
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v1, :cond_1

    .line 210
    invoke-interface {v1, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(ILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    .line 211
    :catch_0
    const-string p1, "TTAD.AndroidObject"

    const-string v0, "requestPauseVideo json exception"

    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 274
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
    .locals 9

    .line 216
    const-string v0, "common_params"

    const-string v1, "session_params"

    if-nez p2, :cond_0

    return-void

    .line 217
    :cond_0
    :try_start_0
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/oyt$8;

    invoke-direct {v2, p0, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt$8;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/cq/moa;)V

    .line 218
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p2, :cond_8

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto/16 :goto_3

    .line 219
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dqw()I

    move-result p2

    .line 220
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v3

    .line 221
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;

    invoke-direct {v4}, Lcom/bytedance/sdk/openadsdk/core/model/ue;-><init>()V

    const/4 v5, 0x1

    .line 222
    iput-boolean v5, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->ivm:Z

    .line 223
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vep()Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

    move-result-object v5

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aje()Lcom/bytedance/sdk/openadsdk/core/model/dxx;

    move-result-object v5

    if-eqz v5, :cond_3

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    :goto_0
    const/4 v5, 0x2

    .line 224
    iput v5, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->cz:I

    .line 225
    :cond_3
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy:Lorg/json/JSONObject;

    if-nez v5, :cond_4

    .line 226
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :cond_4
    if-eqz p1, :cond_5

    .line 227
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 228
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 229
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    .line 230
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 231
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 232
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 233
    :cond_5
    iput-object v5, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->xs:Lorg/json/JSONObject;

    if-eqz p1, :cond_7

    .line 234
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 235
    iget-object v1, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->bcc:Lorg/json/JSONObject;

    if-nez v1, :cond_6

    .line 236
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iput-object v1, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->bcc:Lorg/json/JSONObject;

    .line 237
    :cond_6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 238
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 239
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 240
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 241
    iget-object v5, v4, Lcom/bytedance/sdk/openadsdk/core/model/ue;->bcc:Lorg/json/JSONObject;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 242
    :cond_7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->yo()Lcom/bytedance/sdk/openadsdk/core/gzw;

    move-result-object p1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;

    invoke-direct {v0, p0, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt$9;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/cq/moa;)V

    invoke-interface {p1, v3, v4, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/tpx;)V

    return-void

    :cond_8
    :goto_3
    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 243
    invoke-interface {v2, p1, p2}, Lcom/bytedance/sdk/openadsdk/cq/moa;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 244
    :goto_4
    const-string p2, "TTAD.AndroidObject"

    const-string v0, "get ads error"

    invoke-static {p2, v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v0, :cond_0

    .line 280
    invoke-interface {v0, p2, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v0, :cond_1

    .line 282
    invoke-interface {v0, p2, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public uef(Landroid/net/Uri;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 258
    :cond_0
    :try_start_0
    const-string v1, "bytedance"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 259
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    .line 260
    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/oyt;->bcc:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_2
    return v0
.end method

.method public videoFrameChanged(Ljava/lang/String;)V
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rl:Lcom/bytedance/sdk/openadsdk/cq/bcc;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lcom/bytedance/sdk/component/adexpress/oa/dz;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "videoInfo"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const-string v1, "x"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    const-string v3, "y"

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    const-string v5, "width"

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    const-string v7, "height"

    .line 43
    .line 44
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk(Lorg/json/JSONObject;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_1

    .line 53
    .line 54
    const-string v9, "borderRadiusTopLeft"

    .line 55
    .line 56
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    double-to-float v9, v9

    .line 61
    invoke-virtual {p1, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->uef(F)V

    .line 62
    .line 63
    .line 64
    const-string v9, "borderRadiusTopRight"

    .line 65
    .line 66
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    double-to-float v9, v9

    .line 71
    invoke-virtual {p1, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa(F)V

    .line 72
    .line 73
    .line 74
    const-string v9, "borderRadiusBottomLeft"

    .line 75
    .line 76
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    double-to-float v9, v9

    .line 81
    invoke-virtual {p1, v9}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo(F)V

    .line 82
    .line 83
    .line 84
    const-string v9, "borderRadiusBottomRight"

    .line 85
    .line 86
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 87
    .line 88
    .line 89
    move-result-wide v9

    .line 90
    double-to-float v0, v9

    .line 91
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa(F)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-virtual {p1, v1, v2}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo(D)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v3, v4}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa(D)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v5, v6}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->lw(D)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v7, v8}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->ivm(D)V

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->rl:Lcom/bytedance/sdk/openadsdk/cq/bcc;

    .line 107
    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/cq/bcc;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public wk()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zou:Lcom/bytedance/sdk/openadsdk/core/ue;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ue;->n_()V

    :cond_0
    return-void
.end method

.method public wrv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz:Lcom/bytedance/sdk/openadsdk/dj/yo;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/dj/yo;->uef()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->hts:Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Ljava/lang/Runnable;)V

    .line 5
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->hts:Lcom/bytedance/sdk/openadsdk/core/oyt$yo;

    .line 6
    :cond_1
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    .line 7
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    return-void
.end method

.method public wrv(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;

    const-string v1, "sendLogV3"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    return-void
.end method

.method public xs(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 21
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v1, :cond_0

    .line 23
    :try_start_0
    invoke-interface {v1, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->oa(Lorg/json/JSONObject;)Z

    move-result p1

    .line 24
    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method public xs()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gem:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->ue:Lcom/bytedance/sdk/openadsdk/cq/yo;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/cq/yo;->uef()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dor:Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dor:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method

.method public xs(Z)V
    .locals 2

    .line 25
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 26
    const-string v1, "viewStatus"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 27
    const-string p1, "viewableChange"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->zjm:Ljava/lang/String;

    return-object p0
.end method

.method public yo()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/uef/wk;->uef()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->km:Lcom/bytedance/sdk/component/uef/wk;

    return-void
.end method

.method public yo(I)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz v0, :cond_0

    .line 19
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->oa(I)V

    :cond_0
    return-void
.end method

.method public yo(Lorg/json/JSONObject;)V
    .locals 8

    .line 6
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->rt()Landroid/content/Context;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cop:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    .line 8
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->cq:I

    .line 9
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->orq()Landroid/webkit/WebView;

    move-result-object v6

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

    move-object v2, p1

    .line 10
    invoke-static/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/oib;->uef(Landroid/content/Context;ZLorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILandroid/webkit/WebView;Lcom/bytedance/sdk/openadsdk/core/widget/lw;)V

    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 11
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa:Z

    return-void
.end method

.method public zjm(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v0, "index"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    if-ltz p1, :cond_2

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zou(I)V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->gb:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->au:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz p1, :cond_1

    .line 12
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->hts()V

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->uqx:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    if-eqz p1, :cond_2

    .line 14
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;->uef()V

    :cond_2
    :goto_0
    return-void
.end method

.method public zjm()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uf()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    return v1
.end method
