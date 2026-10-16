.class public Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/bcc$uef;


# instance fields
.field oa:Lcom/bytedance/sdk/component/oa/uef/wrv;

.field uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/bcc;",
            ">;"
        }
    .end annotation
.end field

.field yo:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/bytedance/sdk/component/oa/uef/wrv;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/bcc;",
            ">;",
            "Lcom/bytedance/sdk/component/oa/uef/wrv;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->yo:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->uef:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->oa:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->oa:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 3
    iget p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->yo:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->yo:I

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->uef:Ljava/util/List;

    iget v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->yo:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/component/oa/uef/bcc;

    invoke-interface {p1, p0}, Lcom/bytedance/sdk/component/oa/uef/bcc;->uef(Lcom/bytedance/sdk/component/oa/uef/bcc$uef;)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    return-object p1
.end method

.method public uef()Lcom/bytedance/sdk/component/oa/uef/wrv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;->oa:Lcom/bytedance/sdk/component/oa/uef/wrv;

    return-object v0
.end method
