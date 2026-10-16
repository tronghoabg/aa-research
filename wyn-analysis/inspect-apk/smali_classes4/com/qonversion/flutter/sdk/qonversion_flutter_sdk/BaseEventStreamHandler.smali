.class public final Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;",
        "Lio/flutter/plugin/common/EventChannel$StreamHandler;",
        "<init>",
        "()V",
        "eventSink",
        "Lio/flutter/plugin/common/EventChannel$EventSink;",
        "getEventSink",
        "()Lio/flutter/plugin/common/EventChannel$EventSink;",
        "setEventSink",
        "(Lio/flutter/plugin/common/EventChannel$EventSink;)V",
        "onListen",
        "",
        "arguments",
        "",
        "events",
        "onCancel",
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
.field private eventSink:Luc/g;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getEventSink()Luc/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;->eventSink:Luc/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;->eventSink:Luc/g;

    .line 3
    .line 4
    return-void
.end method

.method public onListen(Ljava/lang/Object;Luc/g;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Luc/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p2, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;->eventSink:Luc/g;

    .line 2
    .line 3
    return-void
.end method

.method public final setEventSink(Luc/g;)V
    .locals 0
    .param p1    # Luc/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;->eventSink:Luc/g;

    .line 2
    .line 3
    return-void
.end method
