.class public Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/component/oa/uef/wrv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field bcc:Ljava/lang/String;

.field private cz:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field ivm:Lcom/bytedance/sdk/component/oa/uef/cq;

.field lw:Ljava/lang/Object;

.field moa:Ljava/lang/String;

.field oa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field uef:Lcom/bytedance/sdk/component/oa/uef/uef;

.field xs:I

.field yo:Lcom/bytedance/sdk/component/oa/uef/xs;

.field private zjm:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x7530

    .line 2
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->zjm:J

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/wrv;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x7530

    .line 5
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->zjm:J

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->yo:Lcom/bytedance/sdk/component/oa/uef/xs;

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->lw()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->moa:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa:Ljava/util/Map;

    .line 9
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->yo()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->lw:Ljava/lang/Object;

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 11
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->xs()Lcom/bytedance/sdk/component/oa/uef/uef;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->cz()I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->xs:I

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->bcc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->bcc:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->cz:Ljava/util/List;

    .line 15
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->zjm:J

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->zjm:J

    return-wide v0
.end method

.method private uef(Ljava/lang/String;Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->moa:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->cz:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/bytedance/sdk/component/oa/uef/xs;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/xs;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    return-object p1
.end method

.method public oa(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public oa()Lcom/bytedance/sdk/component/oa/uef/wrv;
    .locals 1

    .line 6
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef$1;-><init>(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 2

    .line 8
    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    return-object v0
.end method

.method public uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->xs:I

    return-object p0
.end method

.method public uef(J)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 13
    iput-wide p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->zjm:J

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 1

    .line 11
    const-string v0, "POST"

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    return-object p1
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/uef;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/xs;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->yo:Lcom/bytedance/sdk/component/oa/uef/xs;

    return-object p0
.end method

.method public uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->lw:Ljava/lang/Object;

    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->bcc:Ljava/lang/String;

    return-object p0
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/util/List;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/bytedance/sdk/component/oa/uef/wrv$uef;"
        }
    .end annotation

    .line 12
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->cz:Ljava/util/List;

    return-object p0
.end method
