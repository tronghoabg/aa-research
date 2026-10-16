.class public final Lcom/unity3d/ads/adplayer/CommonWebViewBridge;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unity3d/ads/adplayer/WebViewBridge;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0016\u0010\u001e\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001b\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J=\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0012\u0010\u001e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010 J\'\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010/R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00101R\u0017\u00102\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R8\u0010:\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c090807068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R \u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00150?8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR7\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020F0E0D8\u0016@\u0016X\u0096\u000e\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010L\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006M"
    }
    d2 = {
        "Lcom/unity3d/ads/adplayer/CommonWebViewBridge;",
        "Lcom/unity3d/ads/adplayer/WebViewBridge;",
        "LEf/A;",
        "dispatcher",
        "Lcom/unity3d/ads/adplayer/WebViewContainer;",
        "webViewContainer",
        "LEf/E;",
        "adPlayerScope",
        "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;",
        "sendDiagnosticEvent",
        "Lcom/unity3d/ads/core/log/Logger;",
        "logger",
        "<init>",
        "(LEf/A;Lcom/unity3d/ads/adplayer/WebViewContainer;LEf/E;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V",
        "Lcom/unity3d/ads/adplayer/HandlerType;",
        "handlerType",
        "Lorg/json/JSONArray;",
        "arguments",
        "Lef/C;",
        "execute",
        "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;",
        "Lcom/unity3d/ads/adplayer/Invocation;",
        "invocation",
        "",
        "callbackId",
        "handleInvocationResult",
        "(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;",
        "status",
        "",
        "",
        "params",
        "respond",
        "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;",
        "Lcom/unity3d/ads/adplayer/model/WebViewEvent;",
        "event",
        "sendEvent",
        "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Ljf/c;)Ljava/lang/Object;",
        "className",
        "method",
        "request",
        "callbackStatus",
        "rawParameters",
        "handleCallback",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "message",
        "handleInvocation",
        "(Ljava/lang/String;)V",
        "Lcom/unity3d/ads/adplayer/WebViewContainer;",
        "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;",
        "Lcom/unity3d/ads/core/log/Logger;",
        "scope",
        "LEf/E;",
        "getScope",
        "()LEf/E;",
        "LHf/c0;",
        "",
        "Lef/k;",
        "LEf/t;",
        "callbacks",
        "LHf/c0;",
        "LHf/b0;",
        "_onInvocation",
        "LHf/b0;",
        "LHf/g0;",
        "onInvocation",
        "LHf/g0;",
        "getOnInvocation",
        "()LHf/g0;",
        "",
        "Lkotlin/Function0;",
        "Lcom/unity3d/ads/adplayer/ExposedFunction;",
        "exposedFunctions",
        "Ljava/util/Map;",
        "getExposedFunctions",
        "()Ljava/util/Map;",
        "setExposedFunctions",
        "(Ljava/util/Map;)V",
        "unity-ads_defaultRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _onInvocation:LHf/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHf/b0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final callbacks:LHf/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHf/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private exposedFunctions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ltf/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/unity3d/ads/core/log/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onInvocation:LHf/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHf/g0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final scope:LEf/E;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final webViewContainer:Lcom/unity3d/ads/adplayer/WebViewContainer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEf/A;Lcom/unity3d/ads/adplayer/WebViewContainer;LEf/E;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V
    .locals 1
    .param p1    # LEf/A;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/unity3d/ads/adplayer/WebViewContainer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # LEf/E;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/unity3d/ads/core/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "webViewContainer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "adPlayerScope"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sendDiagnosticEvent"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "logger"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->webViewContainer:Lcom/unity3d/ads/adplayer/WebViewContainer;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 32
    .line 33
    iput-object p5, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 34
    .line 35
    invoke-static {p3, p1}, LEf/H;->F(LEf/E;Ljf/f;)LKd/a;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, LEf/D;

    .line 40
    .line 41
    const-string p3, "CommonWebViewBridge"

    .line 42
    .line 43
    invoke-direct {p2, p3}, LEf/D;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2}, LEf/H;->F(LEf/E;Ljf/f;)LKd/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->scope:LEf/E;

    .line 51
    .line 52
    sget-object p2, Lff/x;->a:Lff/x;

    .line 53
    .line 54
    invoke-static {p2}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iput-object p2, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->callbacks:LHf/c0;

    .line 59
    .line 60
    const/4 p2, 0x0

    .line 61
    const/16 p3, 0x40

    .line 62
    .line 63
    const/4 p4, 0x5

    .line 64
    invoke-static {p2, p3, p4}, LHf/k0;->b(III)LHf/j0;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->_onInvocation:LHf/b0;

    .line 69
    .line 70
    new-instance p3, LHf/d0;

    .line 71
    .line 72
    invoke-direct {p3, p2}, LHf/d0;-><init>(LHf/b0;)V

    .line 73
    .line 74
    .line 75
    iput-object p3, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->onInvocation:LHf/g0;

    .line 76
    .line 77
    sget-object p2, Lff/w;->a:Lff/w;

    .line 78
    .line 79
    iput-object p2, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->exposedFunctions:Ljava/util/Map;

    .line 80
    .line 81
    new-instance p2, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$1;

    .line 82
    .line 83
    const/4 p3, 0x0

    .line 84
    invoke-direct {p2, p0, p3}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$1;-><init>(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Ljf/c;)V

    .line 85
    .line 86
    .line 87
    const/4 p4, 0x3

    .line 88
    invoke-static {p1, p3, p2, p4}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static final synthetic access$execute(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->execute(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;)Lcom/unity3d/ads/core/log/Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSendDiagnosticEvent$p(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;)Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getWebViewContainer$p(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;)Lcom/unity3d/ads/adplayer/WebViewContainer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->webViewContainer:Lcom/unity3d/ads/adplayer/WebViewContainer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_onInvocation$p(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;)LHf/b0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->_onInvocation:LHf/b0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handleInvocationResult(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->handleInvocationResult(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$respond(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final execute(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/ads/adplayer/HandlerType;",
            "Lorg/json/JSONArray;",
            "Ljf/c<",
            "-",
            "Lef/C;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->webViewContainer:Lcom/unity3d/ads/adplayer/WebViewContainer;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/unity3d/ads/adplayer/WebViewContainer;->evaluateJavascript(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 13
    .line 14
    return-object p1
.end method

.method private final handleInvocationResult(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/ads/adplayer/Invocation;",
            "Ljava/lang/String;",
            "Ljf/c<",
            "-",
            "Lef/C;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "Invocation("

    .line 13
    .line 14
    instance-of v8, v0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;

    .line 15
    .line 16
    if-eqz v8, :cond_0

    .line 17
    .line 18
    move-object v8, v0

    .line 19
    check-cast v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;

    .line 20
    .line 21
    iget v9, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 22
    .line 23
    const/high16 v10, -0x80000000

    .line 24
    .line 25
    and-int v11, v9, v10

    .line 26
    .line 27
    if-eqz v11, :cond_0

    .line 28
    .line 29
    sub-int/2addr v9, v10

    .line 30
    iput v9, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;

    .line 34
    .line 35
    invoke-direct {v8, v1, v0}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;-><init>(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Ljf/c;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->result:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object v9, Lkf/a;->a:Lkf/a;

    .line 41
    .line 42
    iget v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 43
    .line 44
    sget-object v11, Lef/C;->a:Lef/C;

    .line 45
    .line 46
    const-string v12, "OK"

    .line 47
    .line 48
    const/4 v13, 0x0

    .line 49
    packed-switch v10, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :pswitch_0
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lcom/unity3d/ads/adplayer/Invocation;

    .line 63
    .line 64
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto/16 :goto_7

    .line 72
    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto/16 :goto_8

    .line 75
    .line 76
    :pswitch_1
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v3, Lcom/unity3d/ads/adplayer/Invocation;

    .line 83
    .line 84
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 87
    .line 88
    :goto_1
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    .line 91
    return-object v11

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    move-object v10, v3

    .line 94
    move-object v3, v2

    .line 95
    move-object v2, v10

    .line 96
    move-object v10, v7

    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :pswitch_2
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Lcom/unity3d/ads/adplayer/Invocation;

    .line 108
    .line 109
    iget-object v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 112
    .line 113
    :try_start_2
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 114
    .line 115
    .line 116
    move-object v0, v2

    .line 117
    move-object v2, v7

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :catchall_2
    move-exception v0

    .line 121
    move-object v2, v7

    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :pswitch_3
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Ljava/lang/String;

    .line 127
    .line 128
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, Lcom/unity3d/ads/adplayer/Invocation;

    .line 131
    .line 132
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :pswitch_4
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v3, Lcom/unity3d/ads/adplayer/Invocation;

    .line 144
    .line 145
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 148
    .line 149
    :try_start_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    .line 151
    .line 152
    move-object v10, v3

    .line 153
    move-object v3, v2

    .line 154
    move-object v2, v10

    .line 155
    :goto_2
    move-object v10, v7

    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :pswitch_5
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, Ljava/lang/String;

    .line 161
    .line 162
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Lcom/unity3d/ads/adplayer/Invocation;

    .line 165
    .line 166
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 169
    .line 170
    :try_start_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 171
    .line 172
    .line 173
    move-object/from16 v21, v3

    .line 174
    .line 175
    move-object v3, v2

    .line 176
    move-object/from16 v2, v21

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :pswitch_6
    iget-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Ljava/lang/String;

    .line 182
    .line 183
    iget-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Lcom/unity3d/ads/adplayer/Invocation;

    .line 186
    .line 187
    iget-object v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :pswitch_7
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :try_start_5
    sget-object v0, Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;->INSTANCE:Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;

    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;->getEVENT_LOCATIONS()Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getLocation()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    invoke-interface {v10, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-eqz v10, :cond_1

    .line 210
    .line 211
    new-array v0, v6, [Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v1, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    iput v5, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 220
    .line 221
    invoke-direct {v1, v3, v12, v0, v8}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-ne v0, v9, :cond_c

    .line 226
    .line 227
    goto/16 :goto_6

    .line 228
    .line 229
    :catchall_3
    move-exception v0

    .line 230
    move-object v10, v1

    .line 231
    goto/16 :goto_5

    .line 232
    .line 233
    :cond_1
    invoke-virtual {v1}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->getExposedFunctions()Ljava/util/Map;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getLocation()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    check-cast v10, Ltf/a;

    .line 246
    .line 247
    if-eqz v10, :cond_8

    .line 248
    .line 249
    invoke-interface {v10}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    check-cast v10, Lcom/unity3d/ads/adplayer/ExposedFunction;

    .line 254
    .line 255
    if-eqz v10, :cond_8

    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/unity3d/ads/adplayer/ExposedFunctionLocation;->getNON_CANCELLABLE_LOCATIONS()Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getLocation()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_3

    .line 270
    .line 271
    sget-object v0, LEf/D0;->a:LEf/D0;

    .line 272
    .line 273
    new-instance v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$result$1;

    .line 274
    .line 275
    invoke-direct {v7, v10, v2, v13}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$result$1;-><init>(Lcom/unity3d/ads/adplayer/ExposedFunction;Lcom/unity3d/ads/adplayer/Invocation;Ljf/c;)V

    .line 276
    .line 277
    .line 278
    iput-object v1, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 283
    .line 284
    iput v4, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 285
    .line 286
    invoke-static {v0, v7, v8}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-ne v0, v9, :cond_2

    .line 291
    .line 292
    goto/16 :goto_6

    .line 293
    .line 294
    :cond_2
    move-object v7, v1

    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :cond_3
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getParameters()[Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iput-object v1, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 306
    .line 307
    const/4 v7, 0x3

    .line 308
    iput v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 309
    .line 310
    invoke-interface {v10, v0, v8}, Lcom/unity3d/ads/adplayer/ExposedFunction;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 314
    if-ne v0, v9, :cond_4

    .line 315
    .line 316
    goto/16 :goto_6

    .line 317
    .line 318
    :cond_4
    move-object v10, v1

    .line 319
    :goto_3
    :try_start_6
    instance-of v7, v0, Lcom/unity3d/ads/adplayer/model/WebViewEvent;

    .line 320
    .line 321
    if-eqz v7, :cond_5

    .line 322
    .line 323
    check-cast v0, Lcom/unity3d/ads/adplayer/model/WebViewEvent;

    .line 324
    .line 325
    iput-object v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 330
    .line 331
    const/4 v7, 0x4

    .line 332
    iput v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 333
    .line 334
    invoke-virtual {v10, v0, v8}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Ljf/c;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-ne v0, v9, :cond_c

    .line 339
    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :catchall_4
    move-exception v0

    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :cond_5
    instance-of v7, v0, Lef/k;

    .line 346
    .line 347
    if-eqz v7, :cond_7

    .line 348
    .line 349
    move-object v7, v0

    .line 350
    check-cast v7, Lef/k;

    .line 351
    .line 352
    iget-object v7, v7, Lef/k;->a:Ljava/lang/Object;

    .line 353
    .line 354
    new-array v14, v5, [Ljava/lang/Object;

    .line 355
    .line 356
    aput-object v7, v14, v6

    .line 357
    .line 358
    iput-object v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 359
    .line 360
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 361
    .line 362
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v0, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$3:Ljava/lang/Object;

    .line 365
    .line 366
    const/4 v7, 0x5

    .line 367
    iput v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 368
    .line 369
    invoke-direct {v10, v3, v12, v14, v8}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    if-ne v7, v9, :cond_6

    .line 374
    .line 375
    goto/16 :goto_6

    .line 376
    .line 377
    :cond_6
    :goto_4
    check-cast v0, Lef/k;

    .line 378
    .line 379
    iget-object v0, v0, Lef/k;->b:Ljava/lang/Object;

    .line 380
    .line 381
    instance-of v7, v0, LHf/l;

    .line 382
    .line 383
    if-eqz v7, :cond_c

    .line 384
    .line 385
    check-cast v0, LHf/l;

    .line 386
    .line 387
    new-instance v7, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1;

    .line 388
    .line 389
    invoke-direct {v7, v0}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1;-><init>(LHf/l;)V

    .line 390
    .line 391
    .line 392
    new-instance v0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$2;

    .line 393
    .line 394
    invoke-direct {v0, v10}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$2;-><init>(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    new-instance v12, LHf/Z;

    .line 398
    .line 399
    invoke-direct {v12, v7, v0, v6}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$3;

    .line 403
    .line 404
    invoke-direct {v0, v10, v2, v13}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$3;-><init>(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Lcom/unity3d/ads/adplayer/Invocation;Ljf/c;)V

    .line 405
    .line 406
    .line 407
    new-instance v7, LHf/v;

    .line 408
    .line 409
    invoke-direct {v7, v12, v0}, LHf/v;-><init>(LHf/l;Ltf/q;)V

    .line 410
    .line 411
    .line 412
    iget-object v0, v10, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->scope:LEf/E;

    .line 413
    .line 414
    invoke-static {v7, v0}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 415
    .line 416
    .line 417
    return-object v11

    .line 418
    :cond_7
    new-array v7, v5, [Ljava/lang/Object;

    .line 419
    .line 420
    aput-object v0, v7, v6

    .line 421
    .line 422
    iput-object v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v3, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 427
    .line 428
    const/4 v0, 0x6

    .line 429
    iput v0, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 430
    .line 431
    invoke-direct {v10, v3, v12, v7, v8}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 435
    if-ne v0, v9, :cond_c

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_8
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getLocation()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    const-string v7, ") is not handled"

    .line 451
    .line 452
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v7, Ljava/lang/IllegalStateException;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-direct {v7, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 469
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    if-nez v7, :cond_9

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    :cond_9
    :try_start_8
    const-string v0, "ERROR"

    .line 484
    .line 485
    new-array v12, v5, [Ljava/lang/Object;

    .line 486
    .line 487
    aput-object v7, v12, v6

    .line 488
    .line 489
    iput-object v10, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$0:Ljava/lang/Object;

    .line 490
    .line 491
    iput-object v2, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$1:Ljava/lang/Object;

    .line 492
    .line 493
    iput-object v13, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$2:Ljava/lang/Object;

    .line 494
    .line 495
    iput-object v13, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->L$3:Ljava/lang/Object;

    .line 496
    .line 497
    const/4 v7, 0x7

    .line 498
    iput v7, v8, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocationResult$1;->label:I

    .line 499
    .line 500
    invoke-direct {v10, v3, v0, v12, v8}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 504
    if-ne v0, v9, :cond_a

    .line 505
    .line 506
    :goto_6
    return-object v9

    .line 507
    :cond_a
    move-object v3, v10

    .line 508
    :goto_7
    move-object v0, v11

    .line 509
    goto :goto_9

    .line 510
    :catchall_5
    move-exception v0

    .line 511
    move-object v3, v10

    .line 512
    :goto_8
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    :goto_9
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    if-eqz v0, :cond_c

    .line 521
    .line 522
    iget-object v12, v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    if-nez v3, :cond_b

    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    :cond_b
    new-instance v0, Lef/k;

    .line 539
    .line 540
    const-string v7, "reason_debug"

    .line 541
    .line 542
    invoke-direct {v0, v7, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Lcom/unity3d/ads/adplayer/Invocation;->getLocation()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    new-instance v3, Lef/k;

    .line 550
    .line 551
    const-string v7, "webview_invocation"

    .line 552
    .line 553
    invoke-direct {v3, v7, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    new-array v2, v4, [Lef/k;

    .line 557
    .line 558
    aput-object v0, v2, v6

    .line 559
    .line 560
    aput-object v3, v2, v5

    .line 561
    .line 562
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 563
    .line 564
    .line 565
    move-result-object v15

    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const/16 v18, 0x0

    .line 569
    .line 570
    const-string v13, "native_webview_invocation_error"

    .line 571
    .line 572
    const/4 v14, 0x0

    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const/16 v19, 0x3a

    .line 576
    .line 577
    const/16 v20, 0x0

    .line 578
    .line 579
    invoke-static/range {v12 .. v20}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    :cond_c
    return-object v11

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final respond(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "Ljf/c<",
            "-",
            "Lef/C;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 10
    .line 11
    .line 12
    new-instance p1, Lorg/json/JSONArray;

    .line 13
    .line 14
    invoke-direct {p1, p3}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Collection;

    .line 25
    .line 26
    new-instance p2, Lorg/json/JSONArray;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lcom/unity3d/ads/adplayer/HandlerType;->CALLBACK:Lcom/unity3d/ads/adplayer/HandlerType;

    .line 32
    .line 33
    invoke-direct {p0, p1, p2, p4}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->execute(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    if-ne p1, p2, :cond_0

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 43
    .line 44
    return-object p1
.end method


# virtual methods
.method public getExposedFunctions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltf/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->exposedFunctions:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOnInvocation()LHf/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LHf/g0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->onInvocation:LHf/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScope()LEf/E;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->scope:LEf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public handleCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callbackId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callbackStatus"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rawParameters"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-direct {v0, p3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/unity3d/ads/core/extensions/JSONArrayExtensionsKt;->toTypedArray(Lorg/json/JSONArray;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    iget-object v0, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->callbacks:LHf/c0;

    .line 26
    .line 27
    check-cast v0, LHf/x0;

    .line 28
    .line 29
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, Lef/k;

    .line 51
    .line 52
    iget-object v2, v2, Lef/k;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v1, 0x0

    .line 64
    :goto_0
    check-cast v1, Lef/k;

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_2
    iget-object p1, v1, Lef/k;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, LEf/t;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const v2, -0x6f4abffd

    .line 79
    .line 80
    .line 81
    if-eq v0, v2, :cond_7

    .line 82
    .line 83
    const/16 v2, 0x9dc

    .line 84
    .line 85
    if-eq v0, v2, :cond_6

    .line 86
    .line 87
    const v2, 0x3f2d9e8

    .line 88
    .line 89
    .line 90
    if-eq v0, v2, :cond_4

    .line 91
    .line 92
    const v2, 0x5c4d208

    .line 93
    .line 94
    .line 95
    if-eq v0, v2, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const-string v0, "error"

    .line 99
    .line 100
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    const-string v0, "ERROR"

    .line 108
    .line 109
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    new-instance p2, Ljava/lang/Exception;

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    aget-object p3, p3, v0

    .line 120
    .line 121
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 122
    .line 123
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    check-cast p3, Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    check-cast p1, LEf/u;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, LEf/u;->Y(Ljava/lang/Throwable;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    const-string v0, "OK"

    .line 138
    .line 139
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_8

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    const-string v0, "success"

    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-nez p2, :cond_8

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_8
    check-cast p1, LEf/u;

    .line 156
    .line 157
    invoke-virtual {p1, p3}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_1
    iget-object p1, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->callbacks:LHf/c0;

    .line 161
    .line 162
    :cond_9
    move-object p2, p1

    .line 163
    check-cast p2, LHf/x0;

    .line 164
    .line 165
    invoke-virtual {p2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    move-object v0, p3

    .line 170
    check-cast v0, Ljava/util/Set;

    .line 171
    .line 172
    invoke-static {v0, v1}, Lff/F;->Y(Ljava/util/Set;Ljava/io/Serializable;)Ljava/util/LinkedHashSet;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p2, p3, v0}, LHf/x0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_9

    .line 181
    .line 182
    :goto_2
    return-void
.end method

.method public handleInvocation(Ljava/lang/String;)V
    .locals 26
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/4 v7, 0x2

    .line 6
    const/4 v8, 0x0

    .line 7
    const/4 v9, 0x1

    .line 8
    const-string v1, "Invalid JSON array passed to CommonWebViewBridge: "

    .line 9
    .line 10
    const-string v0, "message"

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 v10, 0x29

    .line 16
    .line 17
    :try_start_0
    new-instance v11, Lorg/json/JSONArray;

    .line 18
    .line 19
    invoke-direct {v11, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_1
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result v12

    .line 26
    move v13, v8

    .line 27
    :goto_0
    if-ge v13, v12, :cond_b

    .line 28
    .line 29
    invoke-virtual {v11, v13}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v1, v0, Lorg/json/JSONArray;

    .line 34
    .line 35
    const/4 v14, 0x0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Lorg/json/JSONArray;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move/from16 v16, v8

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_0
    move-object v0, v14

    .line 47
    :goto_1
    if-eqz v0, :cond_a

    .line 48
    .line 49
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x4

    .line 54
    if-ne v1, v2, :cond_9

    .line 55
    .line 56
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    instance-of v2, v1, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    move-object v1, v14

    .line 68
    :goto_2
    if-eqz v1, :cond_8

    .line 69
    .line 70
    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    instance-of v4, v2, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    move-object v2, v14

    .line 82
    :goto_3
    if-eqz v2, :cond_7

    .line 83
    .line 84
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    instance-of v5, v4, Lorg/json/JSONArray;

    .line 89
    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    check-cast v4, Lorg/json/JSONArray;

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_3
    move-object v4, v14

    .line 96
    :goto_4
    if-eqz v4, :cond_6

    .line 97
    .line 98
    const/4 v15, 0x3

    .line 99
    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    instance-of v5, v0, Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    check-cast v0, Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_4
    move-object v0, v14

    .line 111
    :goto_5
    if-eqz v0, :cond_5

    .line 112
    .line 113
    new-instance v5, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const/16 v1, 0x2e

    .line 122
    .line 123
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 134
    .line 135
    new-instance v5, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    .line 139
    .line 140
    move/from16 v16, v8

    .line 141
    .line 142
    :try_start_2
    const-string v8, "Unity Ads WebView calling for: "

    .line 143
    .line 144
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const/16 v8, 0x28

    .line 151
    .line 152
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-interface {v2, v5}, Lcom/unity3d/ads/core/log/Logger;->debug(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v8, v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->scope:LEf/E;

    .line 169
    .line 170
    move-object v2, v4

    .line 171
    move-object v4, v0

    .line 172
    new-instance v0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocation$7;

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    invoke-direct/range {v0 .. v5}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$handleInvocation$7;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Ljava/lang/String;Ljf/c;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v8, v14, v0, v15}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 179
    .line 180
    .line 181
    add-int/2addr v13, v9

    .line 182
    move/from16 v8, v16

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :catchall_1
    move-exception v0

    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :cond_5
    move/from16 v16, v8

    .line 190
    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v1, "Invalid callback id passed to CommonWebViewBridge: "

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v1

    .line 218
    :cond_6
    move/from16 v16, v8

    .line 219
    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v1, "Invalid parameters passed to CommonWebViewBridge: "

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v1

    .line 247
    :cond_7
    move/from16 v16, v8

    .line 248
    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const-string v1, "Invalid method name passed to CommonWebViewBridge: "

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_8
    move/from16 v16, v8

    .line 277
    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const-string v1, "Invalid class name passed to CommonWebViewBridge: "

    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v1

    .line 305
    :cond_9
    move/from16 v16, v8

    .line 306
    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const-string v2, "Invocation must have 4 elements: "

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v1

    .line 334
    :cond_a
    move/from16 v16, v8

    .line 335
    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 339
    .line 340
    .line 341
    const-string v1, "Invalid invocation passed to CommonWebViewBridge: "

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v1

    .line 363
    :cond_b
    return-void

    .line 364
    :catch_0
    move-exception v0

    .line 365
    move/from16 v16, v8

    .line 366
    .line 367
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    invoke-virtual {v1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 377
    :goto_6
    iget-object v1, v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 378
    .line 379
    new-instance v2, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    const-string v4, "Error handling invocation from webview ("

    .line 382
    .line 383
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-interface {v1, v2, v0}, Lcom/unity3d/ads/core/log/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    iget-object v1, v3, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    if-nez v2, :cond_c

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    :cond_c
    new-instance v4, Lef/k;

    .line 416
    .line 417
    const-string v5, "reason_debug"

    .line 418
    .line 419
    invoke-direct {v4, v5, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    new-instance v2, Lef/k;

    .line 423
    .line 424
    const-string v5, "webview_invocation"

    .line 425
    .line 426
    invoke-direct {v2, v5, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    new-array v5, v7, [Lef/k;

    .line 430
    .line 431
    aput-object v4, v5, v16

    .line 432
    .line 433
    aput-object v2, v5, v9

    .line 434
    .line 435
    invoke-static {v5}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 436
    .line 437
    .line 438
    move-result-object v20

    .line 439
    const/16 v22, 0x0

    .line 440
    .line 441
    const/16 v23, 0x0

    .line 442
    .line 443
    const-string v18, "native_webview_invocation_error"

    .line 444
    .line 445
    const/16 v19, 0x0

    .line 446
    .line 447
    const/16 v21, 0x0

    .line 448
    .line 449
    const/16 v24, 0x3a

    .line 450
    .line 451
    const/16 v25, 0x0

    .line 452
    .line 453
    move-object/from16 v17, v1

    .line 454
    .line 455
    invoke-static/range {v17 .. v25}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 459
    .line 460
    const-string v2, "Invalid message passed to CommonWebViewBridge: "

    .line 461
    .line 462
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 467
    .line 468
    .line 469
    throw v1
.end method

.method public request(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "Ljf/c<",
            "-[",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    instance-of v1, p4, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, p4

    .line 7
    check-cast v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;

    .line 8
    .line 9
    iget v2, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->label:I

    .line 10
    .line 11
    const/high16 v3, -0x80000000

    .line 12
    .line 13
    and-int v4, v2, v3

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    iput v2, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->label:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;

    .line 22
    .line 23
    invoke-direct {v1, p0, p4}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;-><init>(Lcom/unity3d/ads/adplayer/CommonWebViewBridge;Ljf/c;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p4, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 29
    .line 30
    iget v3, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->label:I

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    if-eq v3, v0, :cond_2

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p4

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object p1, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, LEf/t;

    .line 54
    .line 55
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, LEf/H;->b()LEf/u;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v5, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->callbacks:LHf/c0;

    .line 75
    .line 76
    :cond_4
    move-object v6, v5

    .line 77
    check-cast v6, LHf/x0;

    .line 78
    .line 79
    invoke-virtual {v6}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    move-object v8, v7

    .line 84
    check-cast v8, Ljava/util/Set;

    .line 85
    .line 86
    new-instance v9, Lef/k;

    .line 87
    .line 88
    invoke-direct {v9, v3, p4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8, v9}, Lff/F;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v6, v7, v8}, LHf/x0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    new-instance v5, Lorg/json/JSONArray;

    .line 102
    .line 103
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 113
    .line 114
    .line 115
    array-length p1, p3

    .line 116
    const/4 p2, 0x0

    .line 117
    :goto_1
    if-ge p2, p1, :cond_5

    .line 118
    .line 119
    aget-object v3, p3, p2

    .line 120
    .line 121
    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 122
    .line 123
    .line 124
    add-int/2addr p2, v0

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    sget-object p1, Lcom/unity3d/ads/adplayer/HandlerType;->INVOCATION:Lcom/unity3d/ads/adplayer/HandlerType;

    .line 127
    .line 128
    iput-object p4, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput v0, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->label:I

    .line 131
    .line 132
    invoke-direct {p0, p1, v5, v1}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->execute(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v2, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move-object p1, p4

    .line 140
    :goto_2
    const/4 p2, 0x0

    .line 141
    iput-object p2, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->L$0:Ljava/lang/Object;

    .line 142
    .line 143
    iput v4, v1, Lcom/unity3d/ads/adplayer/CommonWebViewBridge$request$1;->label:I

    .line 144
    .line 145
    check-cast p1, LEf/u;

    .line 146
    .line 147
    invoke-virtual {p1, v1}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 152
    .line 153
    if-ne p1, v2, :cond_7

    .line 154
    .line 155
    :goto_3
    return-object v2

    .line 156
    :cond_7
    return-object p1
.end method

.method public sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Ljf/c;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/unity3d/ads/adplayer/model/WebViewEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/unity3d/ads/adplayer/model/WebViewEvent;",
            "Ljf/c<",
            "-",
            "Lef/C;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/unity3d/ads/adplayer/model/WebViewEvent;->getCategory()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/unity3d/ads/adplayer/model/WebViewEvent;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lcom/unity3d/ads/adplayer/model/WebViewEvent;->getParameters()[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length v1, p1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_0

    .line 27
    .line 28
    aget-object v3, p1, v2

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object p1, Lcom/unity3d/ads/adplayer/HandlerType;->EVENT:Lcom/unity3d/ads/adplayer/HandlerType;

    .line 37
    .line 38
    invoke-direct {p0, p1, v0, p2}, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->execute(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Ljf/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 43
    .line 44
    if-ne p1, p2, :cond_1

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 48
    .line 49
    return-object p1
.end method

.method public setExposedFunctions(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ltf/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/unity3d/ads/adplayer/CommonWebViewBridge;->exposedFunctions:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method
