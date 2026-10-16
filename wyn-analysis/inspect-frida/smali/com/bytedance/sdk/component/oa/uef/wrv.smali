.class public abstract Lcom/bytedance/sdk/component/oa/uef/wrv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    }
.end annotation


# instance fields
.field private moa:J

.field public oa:Lcom/bytedance/sdk/component/yo/uef/uef;

.field public uef:Lcom/bytedance/sdk/component/oa/uef/dj;

.field private yo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x7530

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa:J

    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/sdk/component/yo/uef/uef;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bytedance/sdk/component/yo/uef/uef;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract bcc()Ljava/lang/String;
.end method

.method public abstract cz()I
.end method

.method public dj()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>(Lcom/bytedance/sdk/component/oa/uef/wrv;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract ivm()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract lw()Ljava/lang/String;
.end method

.method public abstract moa()Lcom/bytedance/sdk/component/oa/uef/xs;
.end method

.method public oa()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public uef()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/wrv;->yo:Ljava/util/List;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/dj;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    return-void
.end method

.method public abstract xs()Lcom/bytedance/sdk/component/oa/uef/uef;
.end method

.method public abstract yo()Ljava/lang/Object;
.end method

.method public zjm()Lcom/bytedance/sdk/component/oa/uef/cq;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
