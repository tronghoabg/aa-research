.class Lcom/bytedance/sdk/openadsdk/yo/wrv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/yo/wrv;->uef(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/yo/wrv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->uef(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/core/ivm/oa;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->oa(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/yo/wrv$uef;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->oa(Lcom/bytedance/sdk/openadsdk/yo/wrv;)Lcom/bytedance/sdk/openadsdk/yo/wrv$uef;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x4

    .line 30
    sget-object v2, Lcom/bytedance/sdk/openadsdk/yo/zjm;->uef:Lcom/bytedance/sdk/openadsdk/FilterWord;

    .line 31
    .line 32
    invoke-interface {v0, v1, v2, p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv$uef;->uef(ILcom/bytedance/sdk/openadsdk/FilterWord;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/wrv$1;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->dismiss()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
