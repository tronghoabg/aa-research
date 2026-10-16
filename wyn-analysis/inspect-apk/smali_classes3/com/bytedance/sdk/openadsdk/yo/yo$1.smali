.class Lcom/bytedance/sdk/openadsdk/yo/yo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/yo/wrv$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/yo/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/yo/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public uef()V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(ILcom/bytedance/sdk/openadsdk/FilterWord;Ljava/lang/String;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/yo/moa;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;->onSuggestionSubmit(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef()V

    return-void
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
