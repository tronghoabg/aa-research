.class final Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getHtmlPageForScreen(Ljava/lang/String;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screen",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V",
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
.field final synthetic $screenId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->$screenId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/automations/Screen;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->access$getView$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->$screenId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getHtmlPage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openScreen(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
