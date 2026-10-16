.class public Lcom/bytedance/adsdk/oa/uef/uef/dhk;
.super Lcom/bytedance/adsdk/oa/uef/uef/uef;
.source "SourceFile"


# instance fields
.field private bcc:Lcom/bytedance/adsdk/oa/uef/oa/uef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/adsdk/oa/uef/oa/uef<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field private final ivm:Z

.field private final lw:Ljava/lang/String;

.field private final moa:Lcom/bytedance/adsdk/oa/yo/yo/uef;

.field private final xs:Lcom/bytedance/adsdk/oa/uef/oa/uef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/adsdk/oa/uef/oa/uef<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Lcom/bytedance/adsdk/oa/yo/oa/sy;)V
    .locals 11

    .line 1
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->xs()Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;->uef()Landroid/graphics/Paint$Cap;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->bcc()Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;->uef()Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->cz()F

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->yo()Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->moa()Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->lw()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->ivm()Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    move-object v1, p0

    .line 38
    move-object v2, p1

    .line 39
    move-object v3, p2

    .line 40
    invoke-direct/range {v1 .. v10}, Lcom/bytedance/adsdk/oa/uef/uef/uef;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLcom/bytedance/adsdk/oa/yo/uef/moa;Lcom/bytedance/adsdk/oa/yo/uef/oa;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/uef/oa;)V

    .line 41
    .line 42
    .line 43
    iput-object v3, v1, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->moa:Lcom/bytedance/adsdk/oa/yo/yo/uef;

    .line 44
    .line 45
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->uef()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, v1, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->lw:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->zjm()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, v1, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->ivm:Z

    .line 56
    .line 57
    invoke-virtual {p3}, Lcom/bytedance/adsdk/oa/yo/oa/sy;->oa()Lcom/bytedance/adsdk/oa/yo/uef/uef;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/yo/uef/uef;->uef()Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, v1, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->xs:Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lcom/bytedance/adsdk/oa/uef/oa/uef;->uef(Lcom/bytedance/adsdk/oa/uef/oa/uef$uef;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, p1}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef(Lcom/bytedance/adsdk/oa/uef/oa/uef;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public uef(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->ivm:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef;->oa:Landroid/graphics/Paint;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->xs:Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 9
    .line 10
    check-cast v1, Lcom/bytedance/adsdk/oa/uef/oa/oa;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/uef/oa/oa;->cz()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/uef/dhk;->bcc:Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef;->oa:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/uef/oa/uef;->xs()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/graphics/ColorFilter;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/adsdk/oa/uef/uef/uef;->uef(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
