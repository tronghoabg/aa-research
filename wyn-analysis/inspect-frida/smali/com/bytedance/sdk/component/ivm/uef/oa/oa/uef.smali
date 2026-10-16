.class public Lcom/bytedance/sdk/component/ivm/uef/oa/oa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/ivm/uef/moa/uef;",
            ">;"
        }
    .end annotation
.end field

.field private final uef:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/ivm/uef/moa/uef;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/uef;->oa:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public oa()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/ivm/uef/moa/uef;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/uef;->oa:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/oa;

    .line 2
    .line 3
    return-object v0
.end method
