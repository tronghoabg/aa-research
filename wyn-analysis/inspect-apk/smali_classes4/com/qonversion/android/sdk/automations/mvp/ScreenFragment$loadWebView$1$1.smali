.class final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->loadWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "macrosHtml",
        "Lef/C;",
        "invoke",
        "(Ljava/lang/String;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "macrosHtml"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->access$getBinding$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->webView:Landroid/webkit/WebView;

    if-eqz v1, :cond_0

    .line 3
    const-string v5, "UTF-8"

    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 4
    const-string v4, "text/html"

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
