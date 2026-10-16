.class public final synthetic Lcom/unity3d/services/core/webview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;


# direct methods
.method public synthetic constructor <init>(Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/unity3d/services/core/webview/a;->a:I

    iput-object p1, p0, Lcom/unity3d/services/core/webview/a;->b:Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPostMessage(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/unity3d/services/core/webview/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v1, p0, Lcom/unity3d/services/core/webview/a;->b:Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;->onHandleCallback(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V

    return-void

    :pswitch_0
    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    iget-object p1, p0, Lcom/unity3d/services/core/webview/a;->b:Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;

    move-object v7, v6

    move v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;->onHandleInvocation(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
