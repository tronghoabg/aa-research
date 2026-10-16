.class public final LC6/i;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LC6/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LC6/i;->a:I

    .line 2
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LC6/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LC6/i;->a:I

    iput-object p1, p0, LC6/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2

    .line 1
    iget v0, p0, LC6/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LC6/i;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LC6/m;

    .line 13
    .line 14
    iget-object p2, p1, LC6/m;->f:LD6/y;

    .line 15
    .line 16
    const-string p3, "#007 Could not call remote method."

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    const/4 v1, 0x0

    .line 22
    :try_start_0
    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzfmi;->zzd(ILjava/lang/String;LD6/K0;)LD6/K0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p2, v0}, LD6/y;->zzd(LD6/K0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p2

    .line 31
    sget v0, LG6/L;->b:I

    .line 32
    .line 33
    invoke-static {p3, p2}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    :goto_0
    iget-object p1, p1, LC6/m;->f:LD6/y;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    :try_start_1
    invoke-interface {p1, p2}, LD6/y;->zzc(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_1
    move-exception p1

    .line 46
    sget p2, LG6/L;->b:I

    .line 47
    .line 48
    invoke-static {p3, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_1
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 2

    .line 1
    iget v0, p0, LC6/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "WebView renderer gone: "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, "for WebView: "

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string v0, "NativeBridge"

    .line 38
    .line 39
    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, LC6/i;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, LQa/c;

    .line 45
    .line 46
    invoke-virtual {p2}, LQa/a;->e()Landroid/webkit/WebView;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-ne v1, p1, :cond_0

    .line 51
    .line 52
    const-string v1, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session."

    .line 53
    .line 54
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    new-instance v0, LN/O0;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p2, LQa/a;->b:LN/O0;

    .line 64
    .line 65
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    iget v0, p0, LC6/i;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1

    .line 1
    :pswitch_0
    iget-object p1, p0, LC6/i;->b:Ljava/lang/Object;

    check-cast p1, Lgd/g;

    iget-object p1, p1, Lgd/g;->a:Lio/flutter/plugins/urllauncher/WebViewActivity;

    iget-object p1, p1, Lio/flutter/plugins/urllauncher/WebViewActivity;->c:Landroid/webkit/WebView;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x1

    iget-object v1, p0, LC6/i;->b:Ljava/lang/Object;

    iget v2, p0, LC6/i;->a:I

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 2
    :pswitch_1
    check-cast v1, Lgd/g;

    iget-object p1, v1, Lgd/g;->a:Lio/flutter/plugins/urllauncher/WebViewActivity;

    iget-object p1, p1, Lio/flutter/plugins/urllauncher/WebViewActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v0

    .line 3
    :pswitch_2
    check-cast v1, LC6/m;

    invoke-virtual {v1}, LC6/m;->S()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v2

    goto/16 :goto_7

    :cond_0
    const-string p1, "gmsg://noAdLoaded"

    .line 4
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v3, 0x0

    const-string v4, "#007 Could not call remote method."

    if-eqz p1, :cond_3

    .line 5
    iget-object p1, v1, LC6/m;->f:LD6/y;

    const/4 p2, 0x3

    if-eqz p1, :cond_1

    .line 6
    :try_start_0
    invoke-static {p2, v3, v3}, Lcom/google/android/gms/internal/ads/zzfmi;->zzd(ILjava/lang/String;LD6/K0;)LD6/K0;

    move-result-object v3

    .line 7
    invoke-interface {p1, v3}, LD6/y;->zzd(LD6/K0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    sget v3, LG6/L;->b:I

    .line 9
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 10
    :cond_1
    :goto_0
    iget-object p1, v1, LC6/m;->f:LD6/y;

    if-eqz p1, :cond_2

    .line 11
    :try_start_1
    invoke-interface {p1, p2}, LD6/y;->zzc(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 12
    sget p2, LG6/L;->b:I

    .line 13
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 14
    :cond_2
    :goto_1
    invoke-virtual {v1, v2}, LC6/m;->R(I)V

    goto/16 :goto_7

    :cond_3
    const-string p1, "gmsg://scriptLoadFailed"

    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 16
    iget-object p1, v1, LC6/m;->f:LD6/y;

    if-eqz p1, :cond_4

    .line 17
    :try_start_2
    invoke-static {v0, v3, v3}, Lcom/google/android/gms/internal/ads/zzfmi;->zzd(ILjava/lang/String;LD6/K0;)LD6/K0;

    move-result-object p2

    .line 18
    invoke-interface {p1, p2}, LD6/y;->zzd(LD6/K0;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 19
    sget p2, LG6/L;->b:I

    .line 20
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    :cond_4
    :goto_2
    iget-object p1, v1, LC6/m;->f:LD6/y;

    if-eqz p1, :cond_5

    .line 22
    :try_start_3
    invoke-interface {p1, v2}, LD6/y;->zzc(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 23
    sget p2, LG6/L;->b:I

    .line 24
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    :cond_5
    :goto_3
    invoke-virtual {v1, v2}, LC6/m;->R(I)V

    goto :goto_7

    :cond_6
    const-string p1, "gmsg://adResized"

    .line 26
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    iget-object v3, v1, LC6/m;->c:Landroid/content/Context;

    if-eqz p1, :cond_9

    .line 27
    iget-object p1, v1, LC6/m;->f:LD6/y;

    if-eqz p1, :cond_7

    .line 28
    :try_start_4
    invoke-interface {p1}, LD6/y;->zzf()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    .line 29
    sget v5, LG6/L;->b:I

    .line 30
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    :cond_7
    :goto_4
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "height"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_5

    .line 33
    :cond_8
    :try_start_5
    sget-object p2, LD6/q;->g:LD6/q;

    iget-object p2, p2, LD6/q;->a:LH6/f;

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v3, p1}, LH6/f;->b(Landroid/content/Context;I)I

    move-result v2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    .line 35
    :catch_5
    :goto_5
    invoke-virtual {v1, v2}, LC6/m;->R(I)V

    goto :goto_7

    :cond_9
    const-string p1, "gmsg://"

    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_7

    .line 37
    :cond_a
    iget-object p1, v1, LC6/m;->f:LD6/y;

    if-eqz p1, :cond_b

    .line 38
    :try_start_6
    invoke-interface {p1}, LD6/y;->zzh()V

    .line 39
    iget-object p1, v1, LC6/m;->f:LD6/y;

    .line 40
    invoke-interface {p1}, LD6/y;->zze()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception p1

    .line 41
    sget v1, LG6/L;->b:I

    .line 42
    invoke-static {v4, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 43
    :cond_b
    :goto_6
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 45
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_7
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
