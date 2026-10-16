.class Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;->uef(Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;

.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;

.field final synthetic yo:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->moa:Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->uef:Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->oa:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->yo:Ljava/util/Map;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->moa:Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;->uef(Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;)Lcom/bytedance/sdk/component/ivm/uef/ivm/lw;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->uef:Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;->uef()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/ivm/lw;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$uef;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->moa:Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->uef:Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->oa:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;->yo:Ljava/util/Map;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$uef;-><init>(Lcom/bytedance/sdk/component/ivm/uef/ivm/yo;Lcom/bytedance/sdk/component/ivm/uef/ivm/moa;Ljava/lang/String;Ljava/util/Map;Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/ivm/yo$uef;->run()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
