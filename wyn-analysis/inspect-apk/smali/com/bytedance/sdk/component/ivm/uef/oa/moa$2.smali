.class Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;
.super Lcom/bytedance/sdk/component/ivm/uef/lw/lw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef(Lcom/bytedance/sdk/component/ivm/uef/lw;Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:J

.field final synthetic uef:Lcom/bytedance/sdk/component/ivm/uef/lw;

.field final synthetic yo:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/ivm/uef/oa/moa;Ljava/lang/String;Lcom/bytedance/sdk/component/ivm/uef/lw;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->yo:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->uef:Lcom/bytedance/sdk/component/ivm/uef/lw;

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->oa:J

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/ivm/uef/lw/lw;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->yo:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->uef:Lcom/bytedance/sdk/component/ivm/uef/lw;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa$2;->oa:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef(Lcom/bytedance/sdk/component/ivm/uef/oa/moa;Lcom/bytedance/sdk/component/ivm/uef/lw;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
