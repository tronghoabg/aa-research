.class Lcom/bytedance/sdk/component/uef/ivm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/uef/ivm$uef;
    }
.end annotation


# instance fields
.field private final bcc:Lcom/bytedance/sdk/component/uef/uef;

.field private final ivm:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/component/uef/yo;",
            ">;"
        }
    .end annotation
.end field

.field private final lw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/uef/dz;",
            ">;"
        }
    .end annotation
.end field

.field private final moa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/yo$oa;",
            ">;"
        }
    .end annotation
.end field

.field private final oa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/oa;",
            ">;"
        }
    .end annotation
.end field

.field private final uef:Lcom/bytedance/sdk/component/uef/xs;

.field private final xs:Lcom/bytedance/sdk/component/uef/dj;

.field private final yo:Lcom/bytedance/sdk/component/uef/bs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/component/uef/bs<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/sy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/uef/cz;Lcom/bytedance/sdk/component/uef/uef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->oa:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lcom/bytedance/sdk/component/uef/bs;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/bytedance/sdk/component/uef/bs;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->yo:Lcom/bytedance/sdk/component/uef/bs;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->moa:Ljava/util/Map;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->lw:Ljava/util/List;

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->ivm:Ljava/util/Set;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/bytedance/sdk/component/uef/ivm;->bcc:Lcom/bytedance/sdk/component/uef/uef;

    .line 40
    .line 41
    iget-object p2, p1, Lcom/bytedance/sdk/component/uef/cz;->moa:Lcom/bytedance/sdk/component/uef/xs;

    .line 42
    .line 43
    iput-object p2, p0, Lcom/bytedance/sdk/component/uef/ivm;->uef:Lcom/bytedance/sdk/component/uef/xs;

    .line 44
    .line 45
    iget-object p1, p1, Lcom/bytedance/sdk/component/uef/cz;->bcc:Lcom/bytedance/sdk/component/uef/dj;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/ivm;->xs:Lcom/bytedance/sdk/component/uef/dj;

    .line 48
    .line 49
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/uef/ivm;->uef:Lcom/bytedance/sdk/component/uef/xs;

    .line 2
    .line 3
    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/moa;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 30
    iget-object v0, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    iget-object p1, p1, Lcom/bytedance/sdk/component/uef/dz;->lw:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/oa;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, v0, p1, p3}, Lcom/bytedance/sdk/component/uef/moa;->uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;)Ljava/lang/Object;

    move-result-object p1

    .line 31
    new-instance p3, Lcom/bytedance/sdk/component/uef/ivm$uef;

    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->uef:Lcom/bytedance/sdk/component/uef/xs;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/uef/xs;->uef(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/uef/oa;->oa()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p3, v0, p1, p2}, Lcom/bytedance/sdk/component/uef/ivm$uef;-><init>(ZLjava/lang/String;Lcom/bytedance/sdk/component/uef/ivm$1;)V

    return-object p3
.end method

.method private uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/yo;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->ivm:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    iget-object v0, p1, Lcom/bytedance/sdk/component/uef/dz;->lw:Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/oa;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/component/uef/ivm$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/bytedance/sdk/component/uef/ivm$1;-><init>(Lcom/bytedance/sdk/component/uef/ivm;Lcom/bytedance/sdk/component/uef/yo;Lcom/bytedance/sdk/component/uef/dz;)V

    invoke-virtual {p2, v0, p3, v1}, Lcom/bytedance/sdk/component/uef/yo;->uef(Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;Lcom/bytedance/sdk/component/uef/yo$uef;)V

    .line 34
    new-instance p1, Lcom/bytedance/sdk/component/uef/ivm$uef;

    invoke-static {}, Lcom/bytedance/sdk/component/uef/oib;->uef()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2, p3}, Lcom/bytedance/sdk/component/uef/ivm$uef;-><init>(ZLjava/lang/String;Lcom/bytedance/sdk/component/uef/ivm$1;)V

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/uef/ivm;->bcc:Lcom/bytedance/sdk/component/uef/uef;

    return-object p0
.end method

.method private uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/oa;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->uef:Lcom/bytedance/sdk/component/uef/xs;

    invoke-static {p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/lang/Object;)[Ljava/lang/reflect/Type;

    move-result-object p2

    const/4 v1, 0x0

    aget-object p2, p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/uef/xs;->uef(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static uef(Ljava/lang/Object;)[Ljava/lang/reflect/Type;
    .locals 1

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 37
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Method is not parameterized?!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/component/uef/ivm;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/uef/ivm;->ivm:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->oa:Ljava/util/Map;

    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/uef/oa;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    instance-of v2, v0, Lcom/bytedance/sdk/component/uef/moa;

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 5
    check-cast v0, Lcom/bytedance/sdk/component/uef/moa;

    invoke-direct {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/moa;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->yo:Lcom/bytedance/sdk/component/uef/bs;

    iget-object v2, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/uef/bs;->uef(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/uef/oa;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 8
    check-cast v0, Lcom/bytedance/sdk/component/uef/moa;

    invoke-direct {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/moa;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;

    move-result-object p1

    return-object p1

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->moa:Ljava/util/Map;

    iget-object v2, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/uef/yo$oa;

    if-eqz v0, :cond_2

    .line 10
    invoke-interface {v0}, Lcom/bytedance/sdk/component/uef/yo$oa;->uef()Lcom/bytedance/sdk/component/uef/yo;

    move-result-object v0

    .line 11
    iget-object v2, p1, Lcom/bytedance/sdk/component/uef/dz;->moa:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/uef/oa;->uef(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/yo;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 14
    :cond_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    return-object v1

    .line 15
    :catch_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/uef/dz;->toString()Ljava/lang/String;

    .line 16
    iget-object p2, p0, Lcom/bytedance/sdk/component/uef/ivm;->lw:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance p1, Lcom/bytedance/sdk/component/uef/ivm$uef;

    const/4 p2, 0x0

    invoke-static {}, Lcom/bytedance/sdk/component/uef/oib;->uef()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0, v1}, Lcom/bytedance/sdk/component/uef/ivm$uef;-><init>(ZLjava/lang/String;Lcom/bytedance/sdk/component/uef/ivm$1;)V

    return-object p1
.end method

.method public uef()V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->ivm:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/uef/yo;

    .line 25
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/uef/yo;->lw()V

    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->ivm:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->oa:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->moa:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->yo:Lcom/bytedance/sdk/component/uef/bs;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/uef/bs;->uef()V

    return-void
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/moa<",
            "**>;)V"
        }
    .end annotation

    .line 18
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/uef/oa;->uef(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->oa:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->moa:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public uef(Ljava/util/Set;Lcom/bytedance/sdk/component/uef/sy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bytedance/sdk/component/uef/sy<",
            "**>;)V"
        }
    .end annotation

    .line 20
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/uef/sy;->uef(Ljava/util/Set;)V

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm;->yo:Lcom/bytedance/sdk/component/uef/bs;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/uef/bs;->uef(Ljava/util/Set;Ljava/lang/Object;)V

    .line 22
    invoke-static {p1}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method
