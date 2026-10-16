.class Lcom/bytedance/adsdk/oa/uef$1;
.super Lcom/bytedance/adsdk/oa/wk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/adsdk/oa/uef;->oa()Lcom/bytedance/adsdk/oa/wk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/adsdk/oa/wk<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/oa/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/wk;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "not a map"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    iget v0, v0, Lcom/bytedance/adsdk/oa/uef;->oa:I

    return v0
.end method

.method public uef(Ljava/lang/Object;)I
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/uef;->uef(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public uef(II)Ljava/lang/Object;
    .locals 0

    .line 2
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    iget-object p2, p2, Lcom/bytedance/adsdk/oa/uef;->uef:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public uef(I)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/uef;->yo(I)Ljava/lang/Object;

    return-void
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef$1;->uef:Lcom/bytedance/adsdk/oa/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/uef;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
