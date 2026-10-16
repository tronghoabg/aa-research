.class public Lcom/bytedance/adsdk/ugeno/core/xs$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/ugeno/core/xs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private bcc:Ljava/lang/String;

.field private cz:Z

.field private dj:Z

.field private ivm:Lcom/bytedance/adsdk/ugeno/core/xs$uef;

.field private lw:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/bytedance/adsdk/ugeno/core/xs$uef;",
            ">;"
        }
    .end annotation
.end field

.field private moa:Lorg/json/JSONObject;

.field private oa:Ljava/lang/String;

.field private uef:Ljava/lang/String;

.field private xs:Ljava/lang/String;

.field private yo:Lorg/json/JSONObject;

.field private zjm:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->bcc:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->uef:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->moa:Lorg/json/JSONObject;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Lcom/bytedance/adsdk/ugeno/core/xs$uef;)Lcom/bytedance/adsdk/ugeno/core/xs$uef;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->ivm:Lcom/bytedance/adsdk/ugeno/core/xs$uef;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->oa:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->yo:Lorg/json/JSONObject;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->cz:Z

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/adsdk/ugeno/core/xs$uef;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->xs:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic yo(Lcom/bytedance/adsdk/ugeno/core/xs$uef;)Lorg/json/JSONObject;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->yo:Lorg/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public ivm()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/core/xs$uef;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->yo:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->oa:Ljava/lang/String;

    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->xs:Ljava/lang/String;

    return-object v0
.end method

.method public oa(Lcom/bytedance/adsdk/ugeno/core/xs$uef;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public oa(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->dj:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UGNode{id=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->uef:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', name=\'"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->oa:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "\'}"

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public uef(ILcom/bytedance/adsdk/ugeno/core/xs$uef;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    invoke-virtual {v0, p1, p2}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/xs$uef;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->lw:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->oa:Ljava/lang/String;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->zjm:Z

    return-void
.end method

.method public xs()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->moa:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Z
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/core/xs$uef;->cz:Z

    return v0
.end method
