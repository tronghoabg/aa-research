.class final Lcom/unity3d/ads/core/domain/events/AdRevenueObserver$invoke$3;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;->invoke()V
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
        "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Lef/C;",
        "invoke",
        "(Ljava/lang/Throwable;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;


# direct methods
.method public constructor <init>(Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/ads/core/domain/events/AdRevenueObserver$invoke$3;->this$0:Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/unity3d/ads/core/domain/events/AdRevenueObserver$invoke$3;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object p1, p0, Lcom/unity3d/ads/core/domain/events/AdRevenueObserver$invoke$3;->this$0:Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;

    invoke-static {p1}, Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;->access$isRunning$p(Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;)LHf/c0;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast p1, LHf/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v1, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
