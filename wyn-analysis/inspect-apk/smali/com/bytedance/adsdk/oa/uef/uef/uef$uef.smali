.class final Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/oa/uef/uef/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "uef"
.end annotation


# instance fields
.field private final oa:Lcom/bytedance/adsdk/oa/uef/uef/tpx;

.field private final uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/uef/uef/cq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/bytedance/adsdk/oa/uef/uef/tpx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;->uef:Ljava/util/List;

    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;->oa:Lcom/bytedance/adsdk/oa/uef/uef/tpx;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/adsdk/oa/uef/uef/tpx;Lcom/bytedance/adsdk/oa/uef/uef/uef$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;-><init>(Lcom/bytedance/adsdk/oa/uef/uef/tpx;)V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;)Lcom/bytedance/adsdk/oa/uef/uef/tpx;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;->oa:Lcom/bytedance/adsdk/oa/uef/uef/tpx;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/oa/uef/uef/uef$uef;->uef:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
