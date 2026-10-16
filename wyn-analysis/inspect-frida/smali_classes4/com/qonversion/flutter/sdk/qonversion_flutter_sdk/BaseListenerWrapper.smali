.class public final Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;",
        "",
        "binaryMessenger",
        "Lio/flutter/plugin/common/BinaryMessenger;",
        "eventChannelPostfix",
        "",
        "<init>",
        "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V",
        "eventChannel",
        "Lio/flutter/plugin/common/EventChannel;",
        "eventStreamHandler",
        "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;",
        "getEventStreamHandler",
        "()Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;",
        "setEventStreamHandler",
        "(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;)V",
        "register",
        "",
        "unregister",
        "qonversion_flutter_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final binaryMessenger:Luc/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private eventChannel:Luc/j;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final eventChannelPostfix:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luc/f;Ljava/lang/String;)V
    .locals 1
    .param p1    # Luc/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventChannelPostfix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->binaryMessenger:Luc/f;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventChannelPostfix:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getEventStreamHandler()Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public final register()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 7
    .line 8
    new-instance v0, Luc/j;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->binaryMessenger:Luc/f;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "qonversion_flutter_"

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventChannelPostfix:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v0, v1, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Luc/j;->a(Luc/i;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventChannel:Luc/j;

    .line 37
    .line 38
    return-void
.end method

.method public final setEventStreamHandler(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;)V
    .locals 0
    .param p1    # Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 2
    .line 3
    return-void
.end method

.method public final unregister()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventChannel:Luc/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Luc/j;->a(Luc/i;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventStreamHandler:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;

    .line 10
    .line 11
    iput-object v1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseListenerWrapper;->eventChannel:Luc/j;

    .line 12
    .line 13
    return-void
.end method
