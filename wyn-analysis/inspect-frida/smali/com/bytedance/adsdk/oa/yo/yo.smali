.class public Lcom/bytedance/adsdk/oa/yo/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private lw:Landroid/graphics/Typeface;

.field private final moa:F

.field private final oa:Ljava/lang/String;

.field private final uef:Ljava/lang/String;

.field private final yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/yo;->uef:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/adsdk/oa/yo/yo;->oa:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/yo/yo;->yo:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lcom/bytedance/adsdk/oa/yo/yo;->moa:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public moa()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo;->lw:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public uef(Landroid/graphics/Typeface;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/yo;->lw:Landroid/graphics/Typeface;

    return-void
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
