.class public Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;,
        Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;,
        Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;
    }
.end annotation


# static fields
.field private static final oa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final uef:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private ivm:Z

.field private lw:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

.field private final moa:Z

.field private final yo:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$1;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$1;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/gr;->uef(Lcom/bytedance/sdk/component/utils/gr$uef;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->yo:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->moa:Z

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic ivm()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->xs()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic lw()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static oa(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 8
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 9
    const-string v3, "content"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 10
    const-string v4, "trackingFraction"

    const-wide/16 v5, 0x0

    invoke-virtual {v2, v4, v5, v6}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    double-to-float v2, v4

    .line 11
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;

    invoke-direct {v4, v3, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v7, p6

    .line 1
    invoke-static/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;)Z

    return-void
.end method

.method private static oa(ZLjava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;Z)V
    .locals 10

    if-eqz p3, :cond_2

    .line 2
    iget-object v0, p3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 4
    const-string v0, "dsp_track_link_result"

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_1
    const-string v0, "track_link_result"

    goto :goto_0

    .line 5
    :goto_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$3;

    move-object v8, v1

    move v3, p0

    move-object v6, p1

    move-object v7, p2

    move-object v2, p3

    move-object v4, p4

    move v9, p5

    invoke-direct/range {v0 .. v9}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$3;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->moa()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->yo()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    :cond_2
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->m_()V

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v0

    .line 9
    :cond_4
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;

    invoke-direct {p1, v0, p0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;-><init>(Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 10
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;

    move-result-object p0

    .line 11
    invoke-virtual {p0, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;->uef(J)Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p5}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;

    move-result-object p0

    .line 13
    invoke-virtual {p0, p6}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;

    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/yo;->uef()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 26
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Lorg/json/JSONArray;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    const/4 v1, 0x0

    .line 28
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 31
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;

    invoke-direct {v3, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Z)V
    .locals 2

    .line 22
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->yo()Lcom/bytedance/sdk/component/xs/uef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/xs/uef;->yo()Lcom/bytedance/sdk/component/xs/oa/oa;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/oa;->uef(Z)V

    .line 24
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo(Ljava/lang/String;)V

    .line 25
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$2;

    invoke-direct {v1, p1, p2, p0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;ZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/xs/uef/uef;)V

    return-void
.end method

.method public static uef(Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 19
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 20
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 21
    invoke-static {v2, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Z)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic uef(ZLjava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa(ZLjava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;Z)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;",
            "J",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p7

    .line 15
    invoke-static/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    .line 16
    invoke-static {p0, p6}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)V

    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static xs()V
    .locals 5

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    sget-object v3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-direct {v0, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/util/Map$Entry;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    .line 54
    .line 55
    invoke-static {v4, v3, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public static yo(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 3
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 4
    const-string v3, "content"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    const-string v4, "trackingMilliseconds"

    const-wide/16 v5, 0x0

    invoke-virtual {v2, v4, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 6
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;

    invoke-direct {v2, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public m_()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->ivm:Z

    .line 3
    .line 4
    return-void
.end method

.method public moa()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->ivm:Z

    .line 2
    .line 3
    return v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->yo:Ljava/lang/String;

    return-object v0
.end method

.method public yo()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->moa:Z

    return v0
.end method
