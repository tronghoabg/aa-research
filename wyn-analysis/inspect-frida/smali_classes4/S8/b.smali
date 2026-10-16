.class public final synthetic LS8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements LQ1/g;
.implements LV5/x;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LR1/p;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lokhttp3/EventListener$Factory;
.implements Luc/p;
.implements Lcom/applovin/sdk/AppLovinCmpService$OnCompletedListener;
.implements Lt/a;
.implements Lcom/applovin/impl/sdk/c$b;
.implements Lg/b;
.implements Lk1/r;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LV1/a;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LS8/b;->a:I

    iput-object p2, p0, LS8/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LV1/a;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V
    .locals 0

    .line 2
    const/16 p1, 0x9

    iput p1, p0, LS8/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LS8/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, LS8/b;->a:I

    iput-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltf/p;)V
    .locals 1

    .line 4
    const/16 v0, 0x10

    iput v0, p0, LS8/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/n;

    iput-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, LE5/T;

    check-cast p1, LV5/n;

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, LV5/n;->c(LE5/T;)Z

    move-result p1
    :try_end_0
    .catch LV5/u; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, -0x1

    return p1
.end method

.method public a(Lcom/applovin/impl/sdk/c$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/sdk/d;

    invoke-static {v0, p1}, Lcom/applovin/impl/sdk/d;->b(Lcom/applovin/impl/sdk/d;Lcom/applovin/impl/sdk/c$a;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/sdk/ad/d;

    check-cast p1, Lcom/applovin/impl/i5;

    invoke-static {v0, p1}, Lcom/applovin/impl/sdk/ad/b;->M(Lcom/applovin/impl/sdk/ad/d;Lcom/applovin/impl/i5;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(JLQ1/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lb7/k;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [Ls2/C;

    .line 8
    .line 9
    invoke-static {p1, p2, p3, v0}, Ls2/a;->f(JLQ1/o;[Ls2/C;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 4
    .line 5
    sget-object v1, LX/m;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v2, LX/m;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lff/o;->A0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, LX/m;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit v1

    .line 22
    throw v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LS8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, LV1/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lh2/g;

    .line 14
    .line 15
    iget v0, v0, Lh2/g;->a:I

    .line 16
    .line 17
    iput v0, p1, LV1/i;->v:I

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, LV1/i;

    .line 21
    .line 22
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LN1/E;

    .line 25
    .line 26
    iput-object v0, p1, LV1/i;->n:LN1/E;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    check-cast p1, LV1/i;

    .line 30
    .line 31
    iget v0, p1, LV1/i;->x:I

    .line 32
    .line 33
    iget-object v1, p0, LS8/b;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LH5/e;

    .line 36
    .line 37
    iget v2, v1, LH5/e;->h:I

    .line 38
    .line 39
    add-int/2addr v0, v2

    .line 40
    iput v0, p1, LV1/i;->x:I

    .line 41
    .line 42
    iget v0, p1, LV1/i;->y:I

    .line 43
    .line 44
    iget v1, v1, LH5/e;->f:I

    .line 45
    .line 46
    add-int/2addr v0, v1

    .line 47
    iput v0, p1, LV1/i;->y:I

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    check-cast p1, LN1/H;

    .line 51
    .line 52
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LN1/B;

    .line 55
    .line 56
    invoke-interface {p1, v0}, LN1/H;->o(LN1/B;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_4
    check-cast p1, LN1/H;

    .line 61
    .line 62
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LU1/r;

    .line 65
    .line 66
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 67
    .line 68
    iget-object v0, v0, LU1/u;->L:LN1/z;

    .line 69
    .line 70
    invoke-interface {p1, v0}, LN1/H;->w(LN1/z;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_5
    check-cast p1, LN1/H;

    .line 75
    .line 76
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, LP1/c;

    .line 79
    .line 80
    invoke-interface {p1, v0}, LN1/H;->u(LP1/c;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_6
    check-cast p1, LN1/H;

    .line 85
    .line 86
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LN1/c;

    .line 89
    .line 90
    invoke-interface {p1, v0}, LN1/H;->v(LN1/c;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_7
    check-cast p1, LN1/H;

    .line 95
    .line 96
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LN1/z;

    .line 99
    .line 100
    invoke-interface {p1, v0}, LN1/H;->w(LN1/z;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onActivityResult(Ljava/lang/Object;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "storeInstallerImpl"

    .line 3
    .line 4
    iget-object v2, p0, LS8/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, LS8/b;->a:I

    .line 7
    .line 8
    check-cast p1, Lg/a;

    .line 9
    .line 10
    packed-switch v3, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->e:LHf/j0;

    .line 14
    .line 15
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v5, "Activity result received: resultCode="

    .line 20
    .line 21
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v5, p1, Lg/a;->a:I

    .line 25
    .line 26
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const/16 v9, 0xc

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const-string v5, "VastActivity"

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v5, "Activity result received: resultData="

    .line 46
    .line 47
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Lg/a;->b:Landroid/content/Intent;

    .line 51
    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const/16 v9, 0xc

    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    const-string v5, "VastActivity"

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;

    .line 70
    .line 71
    iget-object p1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;

    .line 72
    .line 73
    if-eqz p1, :cond_0

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;->a()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :pswitch_0
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;

    .line 84
    .line 85
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    iget p1, p1, Lg/a;->a:I

    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;->a()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget p1, p0, LS8/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, LW9/F;

    .line 18
    .line 19
    iget-object p1, p1, LW9/F;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/content/Intent;

    .line 29
    .line 30
    invoke-static {p1}, LW9/D;->b(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCompleted(Lcom/applovin/sdk/AppLovinCmpError;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, Luc/q;

    invoke-static {v0, p1}, Lcom/applovin/applovin_max/AppLovinMAX;->a(Luc/q;Lcom/applovin/sdk/AppLovinCmpError;)V

    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 6

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LS8/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast v0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 9
    .line 10
    check-cast p2, Ltc/g;

    .line 11
    .line 12
    invoke-static {v0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->a(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Luc/o;Ltc/g;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;

    .line 17
    .line 18
    check-cast p2, Ltc/g;

    .line 19
    .line 20
    invoke-static {v0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXAdView;->a(Lcom/applovin/applovin_max/AppLovinMAXAdView;Luc/o;Ltc/g;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    sget-object v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 25
    .line 26
    check-cast v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 27
    .line 28
    iget-object v1, p1, Luc/o;->a:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "updateFlag"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const-string v1, "flag"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {p1}, LS3/f;->G(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    .line 62
    .line 63
    sget v1, LS3/f;->d:I

    .line 64
    .line 65
    const v2, 0x1010380

    .line 66
    .line 67
    .line 68
    or-int/2addr v1, v2

    .line 69
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 70
    .line 71
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v2, 0x1f

    .line 74
    .line 75
    if-lt v1, v2, :cond_0

    .line 76
    .line 77
    sget v1, LS3/f;->d:I

    .line 78
    .line 79
    iget v2, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->h:I

    .line 80
    .line 81
    if-ne v1, v2, :cond_0

    .line 82
    .line 83
    const v1, 0x3f4ccccd    # 0.8f

    .line 84
    .line 85
    .line 86
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 90
    .line 91
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 92
    .line 93
    :goto_0
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 94
    .line 95
    iget-object v0, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 96
    .line 97
    invoke-interface {v1, v0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 101
    .line 102
    check-cast p2, Ltc/g;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_3

    .line 108
    .line 109
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    check-cast p2, Ltc/g;

    .line 112
    .line 113
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_2
    iget-object v1, p1, Luc/o;->a:Ljava/lang/String;

    .line 119
    .line 120
    const-string v2, "updateOverlayPosition"

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    const-string v1, "x"

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    const-string v2, "y"

    .line 141
    .line 142
    invoke-virtual {p1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    check-cast p2, Ltc/g;

    .line 153
    .line 154
    invoke-virtual {v0, v1, p1, p2}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b(IILtc/g;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    const-string v2, "resizeOverlay"

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    const-string v1, "width"

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    const-string v2, "height"

    .line 179
    .line 180
    invoke-virtual {p1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    const-string v3, "enableDrag"

    .line 191
    .line 192
    invoke-virtual {p1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    iget-object v3, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 203
    .line 204
    if-eqz v3, :cond_8

    .line 205
    .line 206
    iget-object v3, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 207
    .line 208
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Landroid/view/WindowManager$LayoutParams;

    .line 213
    .line 214
    const/16 v4, -0x7cf

    .line 215
    .line 216
    const/4 v5, -0x1

    .line 217
    if-eq v1, v4, :cond_5

    .line 218
    .line 219
    if-ne v1, v5, :cond_4

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_4
    invoke-virtual {v0, v1}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    goto :goto_2

    .line 227
    :cond_5
    :goto_1
    move v1, v5

    .line 228
    :goto_2
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 229
    .line 230
    const/16 v1, 0x7cf

    .line 231
    .line 232
    if-ne v2, v1, :cond_6

    .line 233
    .line 234
    if-eq v2, v5, :cond_7

    .line 235
    .line 236
    :cond_6
    invoke-virtual {v0, v2}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    :cond_7
    iput v2, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 241
    .line 242
    sput-boolean p1, LS3/f;->k:Z

    .line 243
    .line 244
    iget-object p1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 245
    .line 246
    iget-object v0, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 247
    .line 248
    invoke-interface {p1, v0, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    check-cast p2, Ltc/g;

    .line 254
    .line 255
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 260
    .line 261
    check-cast p2, Ltc/g;

    .line 262
    .line 263
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_9
    :goto_3
    return-void

    .line 267
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Laa/e;

    .line 16
    iget-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast p1, Laa/g;

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LS8/b;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 1
    iget-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/p;

    return-object p1

    .line 2
    :sswitch_0
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, LC6/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 4
    const-string v0, "SERVICE_NOT_AVAILABLE"

    if-eqz p1, :cond_4

    .line 5
    const-string v1, "registration_id"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    const-string v1, "unregistered"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :goto_0
    return-object v1

    .line 7
    :cond_1
    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    const-string v2, "RST"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    .line 9
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "FirebaseMessaging"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "INSTANCE_ID_RESET"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :sswitch_1
    iget-object p1, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x0

    .line 15
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LS8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;

    invoke-static {v0, p1, p2}, Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;->b(Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Landroid/view/View;Lk1/v0;)Lk1/v0;

    move-result-object p1

    return-object p1
.end method
