.class public final synthetic LN6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN6/v;


# direct methods
.method public synthetic constructor <init>(LN6/v;I)V
    .locals 0

    .line 1
    iput p2, p0, LN6/u;->a:I

    iput-object p1, p0, LN6/u;->b:LN6/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LN6/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN6/u;->b:LN6/v;

    .line 7
    .line 8
    new-instance v1, LN6/u;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, LN6/u;-><init>(LN6/v;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, LN6/v;->b:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, LN6/u;->b:LN6/v;

    .line 21
    .line 22
    iget-object v1, v0, LN6/v;->c:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget-object v2, v0, LN6/v;->f:Landroid/webkit/WebView;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    :try_start_1
    sget-object v3, LC6/n;->D:LC6/n;

    .line 34
    .line 35
    iget-object v3, v3, LC6/n;->c:LG6/U;

    .line 36
    .line 37
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x1a

    .line 40
    .line 41
    if-lt v3, v4, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, Lx4/g;->d(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v3, "GET_WEB_VIEW_CLIENT"

    .line 49
    .line 50
    invoke-static {v3}, Lcom/moloco/sdk/internal/publisher/H;->b0(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    :try_start_2
    invoke-static {v2}, Lx3/j;->e(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    .line 57
    .line 58
    .line 59
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    :goto_0
    if-ne v3, v0, :cond_2

    .line 61
    .line 62
    :try_start_3
    monitor-exit v1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    if-eqz v3, :cond_3

    .line 65
    .line 66
    iput-object v3, v0, LN6/v;->e:Landroid/webkit/WebViewClient;

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, LN6/v;->a()V

    .line 72
    .line 73
    .line 74
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    :try_start_4
    sget-object v2, LC6/n;->D:LC6/n;

    .line 78
    .line 79
    iget-object v2, v2, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 80
    .line 81
    const-string v3, "AdUtil.getWebViewClient"

    .line 82
    .line 83
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "getWebViewClient not supported"

    .line 89
    .line 90
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    :catch_1
    :try_start_5
    monitor-exit v1

    .line 95
    :goto_1
    return-void

    .line 96
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    throw v0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
