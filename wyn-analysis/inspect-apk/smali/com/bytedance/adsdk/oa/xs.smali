.class public Lcom/bytedance/adsdk/oa/xs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/oa/xs$uef;,
        Lcom/bytedance/adsdk/oa/xs$oa;,
        Lcom/bytedance/adsdk/oa/xs$yo;
    }
.end annotation


# instance fields
.field private ab:Lcom/bytedance/adsdk/oa/xs$yo;

.field private bcc:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;"
        }
    .end annotation
.end field

.field private bs:Ljava/lang/String;

.field private cq:F

.field private cz:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;"
        }
    .end annotation
.end field

.field private dj:F

.field private dz:Z

.field private ivm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/ivm;",
            ">;"
        }
    .end annotation
.end field

.field private lw:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/yo/yo;",
            ">;"
        }
    .end annotation
.end field

.field private moa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/zjm;",
            ">;"
        }
    .end annotation
.end field

.field private final oa:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private oib:Lcom/bytedance/adsdk/oa/xs$oa;

.field private sy:Lcom/bytedance/adsdk/oa/xs$uef;

.field private final uef:Lcom/bytedance/adsdk/oa/sy;

.field private wk:I

.field private wrv:F

.field private xs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/adsdk/oa/yo/moa;",
            ">;"
        }
    .end annotation
.end field

.field private yo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;>;"
        }
    .end annotation
.end field

.field private zjm:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/adsdk/oa/sy;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/adsdk/oa/sy;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->uef:Lcom/bytedance/adsdk/oa/sy;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->oa:Ljava/util/HashSet;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/bytedance/adsdk/oa/xs;->wk:I

    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->bs:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public ab()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/zjm;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->moa:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public bcc()Lcom/bytedance/adsdk/oa/xs$yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->ab:Lcom/bytedance/adsdk/oa/xs$yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public bs()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->wrv:F

    .line 2
    .line 3
    iget v1, p0, Lcom/bytedance/adsdk/oa/xs;->dj:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    return v0
.end method

.method public cq()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->cz:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->bs:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()Lcom/bytedance/adsdk/oa/xs$uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->sy:Lcom/bytedance/adsdk/oa/xs$uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/adsdk/oa/yo/moa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->xs:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->dj:F

    .line 2
    .line 3
    return v0
.end method

.method public lw()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/xs;->bs()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/bytedance/adsdk/oa/xs;->cq:F

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 9
    .line 10
    mul-float/2addr v0, v1

    .line 11
    float-to-long v0, v0

    .line 12
    long-to-float v0, v0

    .line 13
    return v0
.end method

.method public moa()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->zjm:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->wk:I

    return v0
.end method

.method public oa(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->yo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public oa(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->uef:Lcom/bytedance/adsdk/oa/sy;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/sy;->uef(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LottieComposition:\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/xs;->cz:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/bytedance/adsdk/oa/yo/yo/lw;

    .line 25
    .line 26
    const-string v3, "\t"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lcom/bytedance/adsdk/oa/yo/yo/lw;->uef(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public uef(F)F
    .locals 2

    .line 21
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->dj:F

    iget v1, p0, Lcom/bytedance/adsdk/oa/xs;->wrv:F

    invoke-static {v0, v1, p1}, Lcom/bytedance/adsdk/oa/ivm/lw;->uef(FFF)F

    move-result p1

    return p1
.end method

.method public uef(J)Lcom/bytedance/adsdk/oa/yo/yo/lw;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->bcc:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/adsdk/oa/yo/yo/lw;

    return-object p1
.end method

.method public uef(I)V
    .locals 1

    .line 18
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->wk:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/bytedance/adsdk/oa/xs;->wk:I

    return-void
.end method

.method public uef(Landroid/graphics/Rect;FFFLjava/util/List;Landroid/util/LongSparseArray;Ljava/util/Map;Ljava/util/Map;Landroid/util/SparseArray;Ljava/util/Map;Ljava/util/List;Lcom/bytedance/adsdk/oa/xs$yo;Ljava/lang/String;Lcom/bytedance/adsdk/oa/xs$uef;Lcom/bytedance/adsdk/oa/xs$oa;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "FFF",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;",
            "Landroid/util/LongSparseArray<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/yo/lw;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/zjm;",
            ">;",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/adsdk/oa/yo/moa;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/yo/yo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/yo/ivm;",
            ">;",
            "Lcom/bytedance/adsdk/oa/xs$yo;",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/xs$uef;",
            "Lcom/bytedance/adsdk/oa/xs$oa;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/xs;->zjm:Landroid/graphics/Rect;

    .line 2
    iput p2, p0, Lcom/bytedance/adsdk/oa/xs;->dj:F

    .line 3
    iput p3, p0, Lcom/bytedance/adsdk/oa/xs;->wrv:F

    .line 4
    iput p4, p0, Lcom/bytedance/adsdk/oa/xs;->cq:F

    .line 5
    iput-object p5, p0, Lcom/bytedance/adsdk/oa/xs;->cz:Ljava/util/List;

    .line 6
    iput-object p6, p0, Lcom/bytedance/adsdk/oa/xs;->bcc:Landroid/util/LongSparseArray;

    .line 7
    iput-object p7, p0, Lcom/bytedance/adsdk/oa/xs;->yo:Ljava/util/Map;

    .line 8
    iput-object p8, p0, Lcom/bytedance/adsdk/oa/xs;->moa:Ljava/util/Map;

    .line 9
    iput-object p9, p0, Lcom/bytedance/adsdk/oa/xs;->xs:Landroid/util/SparseArray;

    .line 10
    iput-object p10, p0, Lcom/bytedance/adsdk/oa/xs;->lw:Ljava/util/Map;

    .line 11
    iput-object p11, p0, Lcom/bytedance/adsdk/oa/xs;->ivm:Ljava/util/List;

    .line 12
    iput-object p12, p0, Lcom/bytedance/adsdk/oa/xs;->ab:Lcom/bytedance/adsdk/oa/xs$yo;

    .line 13
    iput-object p13, p0, Lcom/bytedance/adsdk/oa/xs;->bs:Ljava/lang/String;

    .line 14
    iput-object p14, p0, Lcom/bytedance/adsdk/oa/xs;->sy:Lcom/bytedance/adsdk/oa/xs$uef;

    .line 15
    iput-object p15, p0, Lcom/bytedance/adsdk/oa/xs;->oib:Lcom/bytedance/adsdk/oa/xs$oa;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->oa:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 17
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/xs;->dz:Z

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/xs;->dz:Z

    return v0
.end method

.method public wk()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/yo/yo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->lw:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public wrv()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->cq:F

    .line 2
    .line 3
    return v0
.end method

.method public xs()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/xs;->wrv:F

    .line 2
    .line 3
    return v0
.end method

.method public yo()Lcom/bytedance/adsdk/oa/sy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->uef:Lcom/bytedance/adsdk/oa/sy;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)Lcom/bytedance/adsdk/oa/yo/ivm;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->ivm:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/bytedance/adsdk/oa/xs;->ivm:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/adsdk/oa/yo/ivm;

    .line 4
    invoke-virtual {v2, p1}, Lcom/bytedance/adsdk/oa/yo/ivm;->uef(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public zjm()Lcom/bytedance/adsdk/oa/xs$oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/xs;->oib:Lcom/bytedance/adsdk/oa/xs$oa;

    .line 2
    .line 3
    return-object v0
.end method
