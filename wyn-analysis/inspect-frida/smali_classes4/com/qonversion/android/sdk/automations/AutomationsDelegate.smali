.class public interface abstract Lcom/qonversion/android/sdk/automations/AutomationsDelegate;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract automationsDidShowScreen(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract automationsFinished()V
.end method

.method public abstract shouldHandleEvent(Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;Ljava/util/Map;)Ljava/lang/Boolean;
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation
.end method
