.class public Lcom/bytedance/adsdk/oa/zjm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/oa/zjm$uef;
    }
.end annotation


# instance fields
.field private final bcc:Ljava/lang/String;

.field private final cz:[[I

.field private dj:Landroid/graphics/Bitmap;

.field private final ivm:Ljava/lang/String;

.field private final lw:Ljava/lang/String;

.field private final moa:Ljava/lang/String;

.field private final oa:I

.field private final uef:I

.field private final xs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/zjm$uef;",
            ">;"
        }
    .end annotation
.end field

.field private final yo:Ljava/lang/String;

.field private final zjm:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;[[ILorg/json/JSONArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/zjm$uef;",
            ">;",
            "Ljava/lang/String;",
            "[[I",
            "Lorg/json/JSONArray;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/bytedance/adsdk/oa/zjm;->uef:I

    .line 5
    .line 6
    iput p2, p0, Lcom/bytedance/adsdk/oa/zjm;->oa:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/zjm;->yo:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/adsdk/oa/zjm;->moa:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/bytedance/adsdk/oa/zjm;->lw:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/bytedance/adsdk/oa/zjm;->ivm:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/bytedance/adsdk/oa/zjm;->xs:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/bytedance/adsdk/oa/zjm;->bcc:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/bytedance/adsdk/oa/zjm;->cz:[[I

    .line 21
    .line 22
    iput-object p10, p0, Lcom/bytedance/adsdk/oa/zjm;->zjm:Lorg/json/JSONArray;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public bcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->dj:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()[[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->cz:[[I

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->bcc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/zjm;->oa:I

    .line 2
    .line 3
    return v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/zjm;->uef:I

    return v0
.end method

.method public uef(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/zjm;->dj:Landroid/graphics/Bitmap;

    return-void
.end method

.method public xs()Lorg/json/JSONArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->zjm:Lorg/json/JSONArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/zjm$uef;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->xs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public zjm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/zjm;->lw:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
