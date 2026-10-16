.class Lcom/bytedance/sdk/openadsdk/orq/bcc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/orq/yo;Lcom/bytedance/sdk/openadsdk/orq/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/orq/bcc;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/orq/bcc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/bcc$4;->uef:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/bcc$4;->uef:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const-string v2, "webview is null"

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
