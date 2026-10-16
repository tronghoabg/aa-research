.class Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;
.super Lcom/bytedance/sdk/component/ivm/uef/lw/lw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;->uef(Ljava/util/List;ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;

.field final synthetic oa:Z

.field final synthetic uef:Ljava/util/List;

.field final synthetic yo:J


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;Ljava/lang/String;Ljava/util/List;ZJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->moa:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->uef:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p4, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->oa:Z

    .line 6
    .line 7
    iput-wide p5, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->yo:J

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/ivm/uef/lw/lw;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->moa:Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->uef:Ljava/util/List;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->oa:Z

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo$1;->yo:J

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;->uef(Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;->uef(Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;Ljava/util/List;ZJI)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
