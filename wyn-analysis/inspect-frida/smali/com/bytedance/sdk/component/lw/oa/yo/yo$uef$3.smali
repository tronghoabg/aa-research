.class Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;->uef(Lcom/bytedance/sdk/component/lw/dj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;

.field final synthetic uef:Lcom/bytedance/sdk/component/lw/dj;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;Lcom/bytedance/sdk/component/lw/dj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;->uef:Lcom/bytedance/sdk/component/lw/dj;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;)Lcom/bytedance/sdk/component/lw/ab;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;->oa:Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;)Lcom/bytedance/sdk/component/lw/ab;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef$3;->uef:Lcom/bytedance/sdk/component/lw/dj;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/lw/ab;->uef(Lcom/bytedance/sdk/component/lw/dj;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
