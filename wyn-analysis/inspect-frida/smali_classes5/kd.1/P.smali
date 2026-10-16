.class public final Lkd/P;
.super Lkd/N;
.source "SourceFile"


# static fields
.field public static final synthetic h:I


# instance fields
.field public final b:Lkd/i;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Lkd/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lkd/P;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lkd/P;->d:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lkd/P;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lkd/P;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lkd/P;->g:Z

    .line 14
    .line 15
    iput-object p1, p0, Lkd/P;->b:Lkd/i;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v2, "messageArg"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, LVa/X7;

    .line 28
    .line 29
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Luc/f;

    .line 35
    .line 36
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    aput-object p0, v1, v2

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aput-object p1, v1, v2

    .line 47
    .line 48
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, Lkd/D;

    .line 53
    .line 54
    const/4 v2, 0x6

    .line 55
    invoke-direct {v1, v0, v2}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, p1, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 59
    .line 60
    .line 61
    iget-boolean p1, p0, Lkd/P;->d:Z

    .line 62
    .line 63
    return p1
.end method

.method public final onGeolocationPermissionsHidePrompt()V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, LVa/X7;

    .line 23
    .line 24
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Luc/f;

    .line 30
    .line 31
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lkd/D;

    .line 39
    .line 40
    const/16 v4, 0x8

    .line 41
    .line 42
    invoke-direct {v2, v0, v4}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1, v2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v2, "originArg"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v2, "callbackArg"

    .line 19
    .line 20
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, LVa/X7;

    .line 33
    .line 34
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Luc/f;

    .line 40
    .line 41
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    aput-object p0, v1, v2

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    aput-object p1, v1, v2

    .line 52
    .line 53
    const/4 p1, 0x2

    .line 54
    aput-object p2, v1, p1

    .line 55
    .line 56
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Lkd/D;

    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    invoke-direct {p2, v0, v1}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final onHideCustomView()V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, LVa/X7;

    .line 23
    .line 24
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Luc/f;

    .line 30
    .line 31
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lkd/D;

    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    invoke-direct {v2, v0, v4}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1, v2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lkd/P;->e:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v2, Lkd/O;

    .line 8
    .line 9
    invoke-direct {v2, p0, p4, v1}, Lkd/O;-><init>(Lkd/P;Landroid/webkit/JsResult;I)V

    .line 10
    .line 11
    .line 12
    new-instance p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 13
    .line 14
    invoke-direct {p4, v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;-><init>(Ltf/l;I)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lkd/P;->b:Lkd/i;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v3, "webViewArg"

    .line 23
    .line 24
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v3, "urlArg"

    .line 28
    .line 29
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v3, "messageArg"

    .line 33
    .line 34
    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, Lkd/i;->a:LC8/i;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, LC8/i;->q()Luc/n;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, LVa/X7;

    .line 47
    .line 48
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Luc/f;

    .line 54
    .line 55
    invoke-direct {v4, v2, v3, v6, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    new-array v2, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p0, v2, v0

    .line 62
    .line 63
    aput-object p1, v2, v1

    .line 64
    .line 65
    const/4 p1, 0x2

    .line 66
    aput-object p2, v2, p1

    .line 67
    .line 68
    const/4 p1, 0x3

    .line 69
    aput-object p3, v2, p1

    .line 70
    .line 71
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p2, Lkd/F;

    .line 76
    .line 77
    invoke-direct {p2, p4, v1}, Lkd/F;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 81
    .line 82
    .line 83
    return v1

    .line 84
    :cond_0
    return v0
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-boolean v3, p0, Lkd/P;->f:Z

    .line 5
    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    new-instance v3, Lkd/O;

    .line 9
    .line 10
    invoke-direct {v3, p0, p4, v2}, Lkd/O;-><init>(Lkd/P;Landroid/webkit/JsResult;I)V

    .line 11
    .line 12
    .line 13
    new-instance p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 14
    .line 15
    invoke-direct {p4, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;-><init>(Ltf/l;I)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lkd/P;->b:Lkd/i;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v4, "webViewArg"

    .line 24
    .line 25
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "urlArg"

    .line 29
    .line 30
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "messageArg"

    .line 34
    .line 35
    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, v3, Lkd/i;->a:LC8/i;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, LC8/i;->q()Luc/n;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, LVa/X7;

    .line 48
    .line 49
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    iget-object v3, v3, LC8/i;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Luc/f;

    .line 55
    .line 56
    invoke-direct {v5, v3, v4, v7, v6}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    new-array v3, v3, [Ljava/lang/Object;

    .line 61
    .line 62
    aput-object p0, v3, v2

    .line 63
    .line 64
    aput-object p1, v3, v1

    .line 65
    .line 66
    const/4 p1, 0x2

    .line 67
    aput-object p2, v3, p1

    .line 68
    .line 69
    aput-object p3, v3, v0

    .line 70
    .line 71
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p2, Lkd/F;

    .line 76
    .line 77
    invoke-direct {p2, p4, v0}, Lkd/F;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 81
    .line 82
    .line 83
    return v1

    .line 84
    :cond_0
    return v2
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lkd/P;->g:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v2, LFf/d;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-direct {v2, v3, p0, p5}, LFf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 15
    .line 16
    invoke-direct {p5, v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;-><init>(Ltf/l;I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lkd/P;->b:Lkd/i;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v3, "webViewArg"

    .line 25
    .line 26
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "urlArg"

    .line 30
    .line 31
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v3, "messageArg"

    .line 35
    .line 36
    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "defaultValueArg"

    .line 40
    .line 41
    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v2, Lkd/i;->a:LC8/i;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, LC8/i;->q()Luc/n;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, LVa/X7;

    .line 54
    .line 55
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Luc/f;

    .line 61
    .line 62
    invoke-direct {v4, v2, v3, v6, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x5

    .line 66
    new-array v2, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    aput-object p0, v2, v0

    .line 69
    .line 70
    aput-object p1, v2, v1

    .line 71
    .line 72
    const/4 p1, 0x2

    .line 73
    aput-object p2, v2, p1

    .line 74
    .line 75
    const/4 p1, 0x3

    .line 76
    aput-object p3, v2, p1

    .line 77
    .line 78
    const/4 p1, 0x4

    .line 79
    aput-object p4, v2, p1

    .line 80
    .line 81
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance p2, Lkd/F;

    .line 86
    .line 87
    invoke-direct {p2, p5, v0}, Lkd/F;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 91
    .line 92
    .line 93
    return v1

    .line 94
    :cond_0
    return v0
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v2, "requestArg"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, LVa/X7;

    .line 28
    .line 29
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Luc/f;

    .line 35
    .line 36
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    aput-object p0, v1, v2

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aput-object p1, v1, v2

    .line 47
    .line 48
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, Lkd/D;

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    invoke-direct {v1, v0, v2}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, p1, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    int-to-long v1, p2

    .line 3
    new-instance p2, Lcom/moloco/sdk/internal/publisher/d;

    .line 4
    .line 5
    const/16 v3, 0x17

    .line 6
    .line 7
    invoke-direct {p2, v3}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lkd/P;->b:Lkd/i;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v4, "webViewArg"

    .line 16
    .line 17
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v3, Lkd/i;->a:LC8/i;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, LC8/i;->q()Luc/n;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, LVa/X7;

    .line 30
    .line 31
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    iget-object v3, v3, LC8/i;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Luc/f;

    .line 37
    .line 38
    invoke-direct {v5, v3, v4, v7, v6}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-array v2, v0, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    aput-object p0, v2, v3

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    aput-object p1, v2, v3

    .line 52
    .line 53
    const/4 p1, 0x2

    .line 54
    aput-object v1, v2, p1

    .line 55
    .line 56
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v1, Lkd/D;

    .line 61
    .line 62
    invoke-direct {v1, p2, v0}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, p1, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/P;->b:Lkd/i;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v2, "viewArg"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v2, "callbackArg"

    .line 19
    .line 20
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v1, Lkd/i;->a:LC8/i;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, LVa/X7;

    .line 33
    .line 34
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Luc/f;

    .line 40
    .line 41
    invoke-direct {v3, v1, v2, v5, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    aput-object p0, v1, v2

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    aput-object p1, v1, v2

    .line 52
    .line 53
    const/4 p1, 0x2

    .line 54
    aput-object p2, v1, p1

    .line 55
    .line 56
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Lkd/D;

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    invoke-direct {p2, v0, v1}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-boolean v1, p0, Lkd/P;->c:Z

    .line 3
    .line 4
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/L;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v2, p0, v1, p2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/L;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 11
    .line 12
    invoke-direct {p2, v2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;-><init>(Ltf/l;I)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lkd/P;->b:Lkd/i;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v4, "webViewArg"

    .line 21
    .line 22
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v4, "paramsArg"

    .line 26
    .line 27
    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, Lkd/i;->a:LC8/i;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, LC8/i;->q()Luc/n;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v5, LVa/X7;

    .line 40
    .line 41
    const-string v6, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Luc/f;

    .line 47
    .line 48
    invoke-direct {v5, v2, v4, v7, v6}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x3

    .line 52
    new-array v2, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    aput-object p0, v2, v4

    .line 56
    .line 57
    aput-object p1, v2, v3

    .line 58
    .line 59
    aput-object p3, v2, v0

    .line 60
    .line 61
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p3, Lkd/F;

    .line 66
    .line 67
    invoke-direct {p3, p2, v0}, Lkd/F;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, p1, p3}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 71
    .line 72
    .line 73
    return v1
.end method
