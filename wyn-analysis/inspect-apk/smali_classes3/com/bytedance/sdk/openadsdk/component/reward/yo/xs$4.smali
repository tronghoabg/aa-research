.class Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->yo(ZILjava/lang/String;ILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:I

.field final synthetic lw:Ljava/lang/String;

.field final synthetic moa:I

.field final synthetic oa:I

.field final synthetic uef:Z

.field final synthetic xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->uef:Z

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->oa:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->moa:I

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->lw:Ljava/lang/String;

    .line 12
    .line 13
    iput p7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->ivm:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->uef:Z

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->oa:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->moa:I

    .line 10
    .line 11
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->lw:Ljava/lang/String;

    .line 12
    .line 13
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;->ivm:I

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->uef(ZILjava/lang/String;ILjava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
