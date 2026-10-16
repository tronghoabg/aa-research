.class public Lcom/bytedance/adsdk/oa/yo/oa/wrv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/yo/oa/yo;


# instance fields
.field private final lw:Z

.field private final moa:Lcom/bytedance/adsdk/oa/yo/uef/wrv;

.field private final oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

.field private final uef:Ljava/lang/String;

.field private final yo:Lcom/bytedance/adsdk/oa/yo/uef/oa;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/adsdk/oa/yo/uef/oa;Lcom/bytedance/adsdk/oa/yo/uef/oa;Lcom/bytedance/adsdk/oa/yo/uef/wrv;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->uef:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->yo:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->moa:Lcom/bytedance/adsdk/oa/yo/uef/wrv;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->lw:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()Lcom/bytedance/adsdk/oa/yo/uef/wrv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->moa:Lcom/bytedance/adsdk/oa/yo/uef/wrv;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Lcom/bytedance/adsdk/oa/yo/uef/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/xs;Lcom/bytedance/adsdk/oa/yo/yo/uef;)Lcom/bytedance/adsdk/oa/uef/uef/yo;
    .locals 0

    .line 2
    new-instance p2, Lcom/bytedance/adsdk/oa/uef/uef/ab;

    invoke-direct {p2, p1, p3, p0}, Lcom/bytedance/adsdk/oa/uef/uef/ab;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Lcom/bytedance/adsdk/oa/yo/oa/wrv;)V

    return-object p2
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public yo()Lcom/bytedance/adsdk/oa/yo/uef/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wrv;->yo:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 2
    .line 3
    return-object v0
.end method
