.class Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/dz/ivm;->uef(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Z

.field final synthetic uef:J

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/dz/ivm;JZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->uef:J

    .line 4
    .line 5
    iput-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->oa:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->uef:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/ivm$9;->oa:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/ivm;->oa(JZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
