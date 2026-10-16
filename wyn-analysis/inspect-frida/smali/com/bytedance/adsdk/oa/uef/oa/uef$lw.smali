.class final Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/uef/oa/uef$yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/oa/uef/oa/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "lw"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bytedance/adsdk/oa/uef/oa/uef$yo<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private oa:F

.field private final uef:Lcom/bytedance/adsdk/oa/xs/uef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->oa:F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->uef:Lcom/bytedance/adsdk/oa/xs/uef;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public moa()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->uef:Lcom/bytedance/adsdk/oa/xs/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs/uef;->moa()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public oa()Lcom/bytedance/adsdk/oa/xs/uef;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->uef:Lcom/bytedance/adsdk/oa/xs/uef;

    return-object v0
.end method

.method public oa(F)Z
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->oa:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    iput p1, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->oa:F

    const/4 p1, 0x0

    return p1
.end method

.method public uef()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public uef(F)Z
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->uef:Lcom/bytedance/adsdk/oa/xs/uef;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/xs/uef;->lw()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public yo()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef$lw;->uef:Lcom/bytedance/adsdk/oa/xs/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs/uef;->yo()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
