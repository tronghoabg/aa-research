.class public Lcom/bytedance/adsdk/ugeno/core/bs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Ljava/lang/String;

.field private uef:I

.field private yo:Lcom/bytedance/adsdk/ugeno/oa/yo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/core/bs;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/core/bs;->uef:I

    return v0
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/core/bs;->uef:I

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/bs;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/core/bs;->oa:Ljava/lang/String;

    return-void
.end method
