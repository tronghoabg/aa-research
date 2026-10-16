.class public final Lkd/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC8/i;


# direct methods
.method public constructor <init>(LC8/i;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p2, "pigeonRegistrar"

    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lkd/r;->a:LC8/i;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-string p2, "pigeonRegistrar"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lkd/r;->a:LC8/i;

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    const-string p2, "pigeonRegistrar"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lkd/r;->a:LC8/i;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;ZLtf/l;)V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "webViewArg"

    .line 3
    .line 4
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "urlArg"

    .line 8
    .line 9
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lkd/r;->a:LC8/i;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, LVa/X7;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory"

    .line 25
    .line 26
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Luc/f;

    .line 29
    .line 30
    invoke-direct {v3, v1, v2, v4, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    const/4 v1, 0x4

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    aput-object p1, v1, v2

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p2, v1, p1

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    aput-object p3, v1, p1

    .line 48
    .line 49
    aput-object p4, v1, v0

    .line 50
    .line 51
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 56
    .line 57
    invoke-direct {p2, p5, v0}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public b(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dontResendArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "resendArg"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, LVa/X7;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission"

    .line 29
    .line 30
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Luc/f;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aput-object p1, v0, v1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p2, v0, p1

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    aput-object p3, v0, p1

    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    aput-object p4, v0, p1

    .line 51
    .line 52
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 57
    .line 58
    const/16 p3, 0xe

    .line 59
    .line 60
    invoke-direct {p2, p5, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public c(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urlArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/4 p3, 0x5

    .line 51
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public d(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urlArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/16 p3, 0xa

    .line 51
    .line 52
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public e(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "webViewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urlArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/16 p3, 0xb

    .line 51
    .line 52
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public f(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "webViewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urlArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/4 p3, 0x7

    .line 51
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public g(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/16 p3, 0x8

    .line 51
    .line 52
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public h(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;JLjava/lang/String;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "webViewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptionArg"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "failingUrlArg"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, LVa/X7;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError"

    .line 29
    .line 30
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Luc/f;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    const/4 p4, 0x5

    .line 42
    new-array p4, p4, [Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    aput-object p1, p4, v0

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    aput-object p2, p4, p1

    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    aput-object p3, p4, p1

    .line 52
    .line 53
    const/4 p1, 0x3

    .line 54
    aput-object p5, p4, p1

    .line 55
    .line 56
    const/4 p1, 0x4

    .line 57
    aput-object p6, p4, p1

    .line 58
    .line 59
    invoke-static {p4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 64
    .line 65
    const/16 p3, 0xc

    .line 66
    .line 67
    invoke-direct {p2, p7, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public i(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "webViewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handlerArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "hostArg"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "realmArg"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, LVa/X7;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest"

    .line 34
    .line 35
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Luc/f;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    new-array v0, v0, [Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    aput-object p1, v0, v1

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    aput-object p2, v0, p1

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    aput-object p3, v0, p1

    .line 53
    .line 54
    const/4 p1, 0x3

    .line 55
    aput-object p4, v0, p1

    .line 56
    .line 57
    const/4 p1, 0x4

    .line 58
    aput-object p5, v0, p1

    .line 59
    .line 60
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 65
    .line 66
    const/16 p3, 0xd

    .line 67
    .line 68
    invoke-direct {p2, p6, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public j(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Ltf/l;)V
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const-string v1, "webViewArg"

    .line 3
    .line 4
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "requestArg"

    .line 8
    .line 9
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "responseArg"

    .line 13
    .line 14
    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lkd/r;->a:LC8/i;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, LVa/X7;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError"

    .line 30
    .line 31
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Luc/f;

    .line 34
    .line 35
    invoke-direct {v3, v1, v2, v4, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-array v1, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    aput-object p1, v1, v2

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p2, v1, p1

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    aput-object p3, v1, p1

    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    aput-object p4, v1, p1

    .line 51
    .line 52
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 57
    .line 58
    invoke-direct {p2, p5, v0}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public k(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "realmArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "argsArg"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, LVa/X7;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest"

    .line 29
    .line 30
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Luc/f;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aput-object p1, v0, v1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p2, v0, p1

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    aput-object p3, v0, p1

    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    aput-object p4, v0, p1

    .line 51
    .line 52
    const/4 p1, 0x4

    .line 53
    aput-object p5, v0, p1

    .line 54
    .line 55
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 60
    .line 61
    const/4 p3, 0x6

    .line 62
    invoke-direct {p2, p6, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public l(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "viewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handlerArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "errorArg"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, LVa/X7;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError"

    .line 29
    .line 30
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Luc/f;

    .line 33
    .line 34
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aput-object p1, v0, v1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p2, v0, p1

    .line 45
    .line 46
    const/4 p1, 0x2

    .line 47
    aput-object p3, v0, p1

    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    aput-object p4, v0, p1

    .line 51
    .line 52
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 57
    .line 58
    const/16 p3, 0xf

    .line 59
    .line 60
    invoke-direct {p2, p5, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public m(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;DDLtf/l;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "viewArg"

    .line 3
    .line 4
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lkd/r;->a:LC8/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, LVa/X7;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged"

    .line 20
    .line 21
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Luc/f;

    .line 24
    .line 25
    invoke-direct {v3, v1, v2, v4, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-static {p5, p6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    const/4 p5, 0x4

    .line 37
    new-array p5, p5, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 p6, 0x0

    .line 40
    aput-object p1, p5, p6

    .line 41
    .line 42
    aput-object p2, p5, v0

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    aput-object p3, p5, p1

    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    aput-object p4, p5, p1

    .line 49
    .line 50
    invoke-static {p5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 55
    .line 56
    invoke-direct {p2, p7, v0}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public n(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Ltf/l;)V
    .locals 5

    .line 1
    const-string v0, "webViewArg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestArg"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkd/r;->a:LC8/i;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading"

    .line 24
    .line 25
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Luc/f;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-object p1, v0, v1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aput-object p2, v0, p1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aput-object p3, v0, p1

    .line 43
    .line 44
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    const/16 p3, 0x9

    .line 51
    .line 52
    invoke-direct {p2, p4, p3}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public o(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const-string v1, "webViewArg"

    .line 3
    .line 4
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "urlArg"

    .line 8
    .line 9
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lkd/r;->a:LC8/i;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, LC8/i;->q()Luc/n;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, LVa/X7;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading"

    .line 25
    .line 26
    iget-object v1, v1, LC8/i;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Luc/f;

    .line 29
    .line 30
    invoke-direct {v3, v1, v2, v4, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object p1, v1, v2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    aput-object p2, v1, p1

    .line 41
    .line 42
    aput-object p3, v1, v0

    .line 43
    .line 44
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Lcom/unity3d/ads/core/data/datasource/a;

    .line 49
    .line 50
    invoke-direct {p2, p4, v0}, Lcom/unity3d/ads/core/data/datasource/a;-><init>(Ltf/l;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
