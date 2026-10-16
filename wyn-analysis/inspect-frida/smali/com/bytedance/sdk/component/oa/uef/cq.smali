.class public Lcom/bytedance/sdk/component/oa/uef/cq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/oa/uef/cq$uef;
    }
.end annotation


# instance fields
.field public ivm:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

.field public lw:[B

.field public moa:Ljava/lang/String;

.field public yo:Lcom/bytedance/sdk/component/oa/uef/cz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;Lcom/bytedance/sdk/component/oa/uef/cq$uef;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->yo:Lcom/bytedance/sdk/component/oa/uef/cz;

    .line 4
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->moa:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/cz;[BLcom/bytedance/sdk/component/oa/uef/cq$uef;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->yo:Lcom/bytedance/sdk/component/oa/uef/cz;

    .line 8
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->lw:[B

    .line 9
    iput-object p3, p0, Lcom/bytedance/sdk/component/oa/uef/cq;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cq;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/cq;

    sget-object v1, Lcom/bytedance/sdk/component/oa/uef/cq$uef;->uef:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    invoke-direct {v0, p0, p1, v1}, Lcom/bytedance/sdk/component/oa/uef/cq;-><init>(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;Lcom/bytedance/sdk/component/oa/uef/cq$uef;)V

    return-object v0
.end method

.method public static uef(Lcom/bytedance/sdk/component/oa/uef/cz;[B)Lcom/bytedance/sdk/component/oa/uef/cq;
    .locals 2

    .line 2
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/cq;

    sget-object v1, Lcom/bytedance/sdk/component/oa/uef/cq$uef;->oa:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    invoke-direct {v0, p0, p1, v1}, Lcom/bytedance/sdk/component/oa/uef/cq;-><init>(Lcom/bytedance/sdk/component/oa/uef/cz;[BLcom/bytedance/sdk/component/oa/uef/cq$uef;)V

    return-object v0
.end method
