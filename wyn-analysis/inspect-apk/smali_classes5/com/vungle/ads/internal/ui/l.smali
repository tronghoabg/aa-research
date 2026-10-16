.class public abstract Lcom/vungle/ads/internal/ui/l;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static volatile h:Lcom/vungle/ads/internal/y0;

.field public static volatile i:Lcom/vungle/ads/internal/presenter/a;


# instance fields
.field public a:Lcom/vungle/ads/internal/presenter/r;

.field public b:Lcom/vungle/ads/internal/model/r3;

.field public c:Ljava/lang/Object;

.field public final d:Lcom/vungle/ads/internal/util/w;

.field public e:Lcom/vungle/ads/internal/util/s;

.field public final f:Lcom/vungle/ads/internal/ui/b;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/ui/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/vungle/ads/internal/ui/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/vungle/ads/internal/util/w;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/vungle/ads/internal/util/w;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/vungle/ads/internal/ui/l;->d:Lcom/vungle/ads/internal/util/w;

    .line 10
    .line 11
    new-instance v0, Lcom/vungle/ads/internal/ui/b;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/vungle/ads/internal/ui/b;-><init>(Lcom/vungle/ads/internal/ui/l;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/vungle/ads/internal/ui/l;->f:Lcom/vungle/ads/internal/ui/b;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/vungle/ads/internal/ui/l;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Lef/i;)Lcom/vungle/ads/internal/signals/j;
    .locals 0

    .line 2
    invoke-interface {p0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/internal/signals/j;

    return-object p0
.end method

.method public static final synthetic a(Lcom/vungle/ads/internal/ui/l;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/ui/l;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final a(Lcom/vungle/ads/internal/ui/l;Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object p0, p0, Lcom/vungle/ads/internal/ui/l;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_0

    .line 4
    iget-object p0, p2, Lk1/v0;->a:Lk1/s0;

    const/16 v0, 0x287

    invoke-virtual {p0, v0}, Lk1/s0;->f(I)Lb1/c;

    move-result-object p0

    .line 5
    const-string v0, "insets.getInsets(\n      \u2026t()\n                    )"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget v0, p0, Lb1/c;->c:I

    .line 7
    iget v1, p0, Lb1/c;->d:I

    .line 8
    iget v2, p0, Lb1/c;->a:I

    iget p0, p0, Lb1/c;->b:I

    invoke-virtual {p1, v2, p0, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    return-object p2
.end method

.method public static final b(Lcom/vungle/ads/internal/ui/l;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/vungle/ads/internal/presenter/r;->d()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 9
    new-instance v0, LKb/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LKb/a;-><init>(Ljava/lang/Object;I)V

    .line 10
    iput-object v0, p0, Lcom/vungle/ads/internal/ui/l;->c:Ljava/lang/Object;

    .line 11
    invoke-static {p0}, LG6/T;->n(Lcom/vungle/ads/internal/ui/l;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v1

    invoke-static {v1, v0}, LG6/T;->v(Landroid/window/OnBackInvokedDispatcher;LKb/a;)V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 5
    .line 6
    new-instance v0, Lcom/vungle/ads/internal/ui/c;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, Lcom/vungle/ads/internal/ui/c;-><init>(IILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "AdActivity"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 14
    .line 15
    .line 16
    const/16 p3, 0x2711

    .line 17
    .line 18
    if-ne p1, p3, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/l;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-string p3, "onActivityResultCode="

    .line 31
    .line 32
    invoke-static {p2, p3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p3, Lcom/vungle/ads/internal/m2;

    .line 37
    .line 38
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->INLINE_INSTALL_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 39
    .line 40
    invoke-direct {p3, v0}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v0, 0x1

    .line 44
    .line 45
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p3, Lcom/vungle/ads/internal/m2;->c:Ljava/lang/Long;

    .line 50
    .line 51
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/vungle/ads/internal/presenter/r;->b()Lcom/vungle/ads/internal/util/s;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, p3, p1, p2}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/vungle/ads/internal/presenter/r;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    const-string v0, "AdActivity"

    .line 2
    .line 3
    const-string v1, "newConfig"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 9
    .line 10
    .line 11
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    sget-boolean p1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 17
    .line 18
    const-string p1, "landscape"

    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v1, 0x1

    .line 27
    if-ne p1, v1, :cond_1

    .line 28
    .line 29
    sget-boolean p1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 30
    .line 31
    const-string p1, "portrait"

    .line 32
    .line 33
    invoke-static {v0, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/vungle/ads/internal/presenter/r;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 45
    .line 46
    const-string v1, "onConfigurationChanged: "

    .line 47
    .line 48
    invoke-static {v1}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v0, p1}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    const/4 v1, 0x0

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/high16 v2, 0x1000000

    .line 14
    .line 15
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/vungle/ads/internal/ui/l;->h:Lcom/vungle/ads/internal/y0;

    .line 19
    .line 20
    sget-object v2, Lcom/vungle/ads/internal/ui/l;->i:Lcom/vungle/ads/internal/presenter/a;

    .line 21
    .line 22
    const-string v3, "intent"

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/vungle/ads/internal/ui/a;->b(Landroid/content/Intent;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    const-string p1, ""

    .line 40
    .line 41
    :cond_0
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Lcom/vungle/ads/AdNotLoadedCantPlay;

    .line 44
    .line 45
    const-string v1, "Can not play fullscreen ad. placement="

    .line 46
    .line 47
    const-string v3, " pendingData is null"

    .line 48
    .line 49
    invoke-static {v1, p1, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Lcom/vungle/ads/AdNotLoadedCantPlay;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/vungle/ads/internal/ui/l;->e:Lcom/vungle/ads/internal/util/s;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v2, v0, p1}, Lcom/vungle/ads/internal/presenter/a;->a(Lcom/vungle/ads/VungleError;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {v0}, Lcom/vungle/ads/internal/y0;->a()Lcom/vungle/ads/internal/model/h0;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v0}, Lcom/vungle/ads/internal/y0;->b()Lcom/vungle/ads/internal/model/i3;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v0}, Lcom/vungle/ads/internal/y0;->c()Lcom/vungle/ads/internal/presenter/z;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v5}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iput-object v4, p0, Lcom/vungle/ads/internal/ui/l;->e:Lcom/vungle/ads/internal/util/s;

    .line 90
    .line 91
    :try_start_0
    new-instance v4, Lcom/vungle/ads/internal/ui/view/k;

    .line 92
    .line 93
    invoke-virtual {v5}, Lcom/vungle/ads/internal/model/h0;->h()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-direct {v4, p0, v7}, Lcom/vungle/ads/internal/ui/view/k;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-static {v7, v1}, La/a;->I(Landroid/view/Window;Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const-string v8, "ad_invisible_logged"

    .line 112
    .line 113
    invoke-virtual {v7, v8, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_3

    .line 118
    .line 119
    const-wide/16 v7, 0x3

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    const-wide/16 v7, 0x2

    .line 123
    .line 124
    :goto_0
    sget-object v9, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 125
    .line 126
    new-instance v10, Lcom/vungle/ads/internal/m2;

    .line 127
    .line 128
    sget-object v11, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_VISIBILITY:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 129
    .line 130
    invoke-direct {v10, v11}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v10, v11}, Lcom/vungle/ads/internal/m2;->a(Ljava/lang/Long;)V

    .line 138
    .line 139
    .line 140
    iget-object v11, p0, Lcom/vungle/ads/internal/ui/l;->e:Lcom/vungle/ads/internal/util/s;

    .line 141
    .line 142
    const/4 v12, 0x4

    .line 143
    invoke-static {v9, v10, v11, v12}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;I)V

    .line 144
    .line 145
    .line 146
    sget-boolean v9, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 147
    .line 148
    new-instance v9, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v10, "Log metric AD_VISIBILITY: "

    .line 151
    .line 152
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    const-string v8, "AdActivity"

    .line 163
    .line 164
    invoke-static {v8, v7}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    sget-object v7, Lef/j;->a:Lef/j;

    .line 168
    .line 169
    new-instance v8, Lcom/vungle/ads/internal/ui/d;

    .line 170
    .line 171
    invoke-direct {v8, p0}, Lcom/vungle/ads/internal/ui/d;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v7, v8}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v9}, Lcom/vungle/ads/internal/ui/a;->a(Landroid/content/Intent;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const/4 v11, 0x0

    .line 190
    if-eqz v3, :cond_4

    .line 191
    .line 192
    new-instance v9, Lcom/vungle/ads/internal/model/r3;

    .line 193
    .line 194
    invoke-direct {v9, v3}, Lcom/vungle/ads/internal/model/r3;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_4
    move-object v9, v11

    .line 199
    :goto_1
    iput-object v9, p0, Lcom/vungle/ads/internal/ui/l;->b:Lcom/vungle/ads/internal/model/r3;

    .line 200
    .line 201
    if-eqz v9, :cond_5

    .line 202
    .line 203
    invoke-interface {v8}, Lef/i;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Lcom/vungle/ads/internal/signals/j;

    .line 208
    .line 209
    invoke-virtual {v3, v9}, Lcom/vungle/ads/internal/signals/j;->a(Lcom/vungle/ads/internal/model/r3;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    new-instance v3, Lcom/vungle/ads/internal/ui/h;

    .line 213
    .line 214
    invoke-direct {v3, p0, v8}, Lcom/vungle/ads/internal/ui/h;-><init>(Lcom/vungle/ads/internal/ui/l;Lef/i;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v3}, Lcom/vungle/ads/internal/ui/view/k;->setCloseDelegate(Lcom/vungle/ads/internal/ui/view/f;)V

    .line 218
    .line 219
    .line 220
    new-instance v3, Lcom/vungle/ads/internal/ui/i;

    .line 221
    .line 222
    invoke-direct {v3, p0}, Lcom/vungle/ads/internal/ui/i;-><init>(Lcom/vungle/ads/internal/ui/l;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v3}, Lcom/vungle/ads/internal/ui/view/k;->setOnViewTouchListener(Lcom/vungle/ads/internal/ui/view/h;)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Lcom/vungle/ads/internal/ui/j;

    .line 229
    .line 230
    invoke-direct {v3, p0}, Lcom/vungle/ads/internal/ui/j;-><init>(Lcom/vungle/ads/internal/ui/l;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v3}, Lcom/vungle/ads/internal/ui/view/k;->setOrientationDelegate(Lcom/vungle/ads/internal/ui/view/i;)V

    .line 234
    .line 235
    .line 236
    new-instance v3, Lcom/vungle/ads/internal/ui/e;

    .line 237
    .line 238
    invoke-direct {v3, p0}, Lcom/vungle/ads/internal/ui/e;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v7, v3}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    new-instance v8, Lcom/vungle/ads/internal/ui/f;

    .line 246
    .line 247
    invoke-direct {v8, p0}, Lcom/vungle/ads/internal/ui/f;-><init>(Landroid/content/Context;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v7, v8}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-interface {v3}, Lef/i;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Lcom/vungle/ads/internal/executor/a;

    .line 259
    .line 260
    check-cast v9, Lcom/vungle/ads/internal/executor/d;

    .line 261
    .line 262
    invoke-virtual {v9}, Lcom/vungle/ads/internal/executor/d;->f()Lcom/vungle/ads/internal/executor/j;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    sget-object v10, Lcom/vungle/ads/internal/presenter/e0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 267
    .line 268
    invoke-interface {v8}, Lef/i;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    check-cast v10, Lcom/vungle/ads/internal/platform/f;

    .line 273
    .line 274
    invoke-static {v5, v6, v9, v10}, Lcom/vungle/ads/internal/presenter/e0;->a(Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Lcom/vungle/ads/internal/executor/j;Lcom/vungle/ads/internal/platform/f;)Lcom/vungle/ads/internal/ui/z;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    new-instance v10, Lcom/vungle/ads/internal/ui/g;

    .line 279
    .line 280
    invoke-direct {v10, p0}, Lcom/vungle/ads/internal/ui/g;-><init>(Landroid/content/Context;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v7, v10}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-interface {v7}, Lef/i;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    check-cast v7, Lcom/vungle/ads/internal/omsdk/d;

    .line 292
    .line 293
    invoke-virtual {v5}, Lcom/vungle/ads/internal/model/h0;->C()Z

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v10}, Lcom/vungle/ads/internal/omsdk/d;->a(Z)Lcom/vungle/ads/internal/omsdk/e;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-interface {v3}, Lef/i;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    check-cast v3, Lcom/vungle/ads/internal/executor/a;

    .line 309
    .line 310
    check-cast v3, Lcom/vungle/ads/internal/executor/d;

    .line 311
    .line 312
    invoke-virtual {v3}, Lcom/vungle/ads/internal/executor/d;->d()Lcom/vungle/ads/internal/executor/j;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-virtual {v9, v7}, Lcom/vungle/ads/internal/ui/z;->a(Lcom/vungle/ads/internal/omsdk/e;)V

    .line 317
    .line 318
    .line 319
    iget-object v10, p0, Lcom/vungle/ads/internal/ui/l;->d:Lcom/vungle/ads/internal/util/w;

    .line 320
    .line 321
    invoke-virtual {v10, v9}, Lcom/vungle/ads/internal/util/w;->a(Lcom/vungle/ads/internal/util/v;)V

    .line 322
    .line 323
    .line 324
    move-object v10, v8

    .line 325
    move-object v8, v3

    .line 326
    new-instance v3, Lcom/vungle/ads/internal/presenter/r;

    .line 327
    .line 328
    invoke-interface {v10}, Lef/i;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    check-cast v10, Lcom/vungle/ads/internal/platform/f;

    .line 333
    .line 334
    move-object v13, v9

    .line 335
    move-object v9, v7

    .line 336
    move-object v7, v13

    .line 337
    invoke-direct/range {v3 .. v10}, Lcom/vungle/ads/internal/presenter/r;-><init>(Lcom/vungle/ads/internal/ui/view/k;Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Lcom/vungle/ads/internal/ui/z;Lcom/vungle/ads/internal/executor/j;Lcom/vungle/ads/internal/omsdk/e;Lcom/vungle/ads/internal/platform/f;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v2}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/internal/presenter/a;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3, v0}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/internal/presenter/z;)V

    .line 344
    .line 345
    .line 346
    new-instance v0, Lcom/vungle/ads/internal/ui/k;

    .line 347
    .line 348
    invoke-direct {v0, p0}, Lcom/vungle/ads/internal/ui/k;-><init>(Lcom/vungle/ads/internal/ui/l;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3, v0}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/internal/ui/k;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3}, Lcom/vungle/ads/internal/presenter/r;->g()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {p0, v4, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 362
    .line 363
    .line 364
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    const/high16 v2, -0x1000000

    .line 373
    .line 374
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 375
    .line 376
    .line 377
    goto :goto_2

    .line 378
    :catchall_0
    move-exception v0

    .line 379
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 380
    .line 381
    .line 382
    :goto_2
    new-instance v0, LB8/b;

    .line 383
    .line 384
    const/16 v2, 0x11

    .line 385
    .line 386
    invoke-direct {v0, p0, v2}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 387
    .line 388
    .line 389
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 390
    .line 391
    invoke-static {v4, v0}, Lk1/J;->l(Landroid/view/View;Lk1/r;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    new-instance v4, Lad/L;

    .line 407
    .line 408
    invoke-direct {v4, v2}, Lad/L;-><init>(Landroid/view/View;)V

    .line 409
    .line 410
    .line 411
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 412
    .line 413
    const/16 v6, 0x23

    .line 414
    .line 415
    if-lt v2, v6, :cond_6

    .line 416
    .line 417
    new-instance v1, Lk1/y0;

    .line 418
    .line 419
    invoke-direct {v1, v0, v4, p1}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 420
    .line 421
    .line 422
    goto :goto_4

    .line 423
    :cond_6
    const/16 v6, 0x1e

    .line 424
    .line 425
    if-lt v2, v6, :cond_7

    .line 426
    .line 427
    new-instance v1, Lk1/w0;

    .line 428
    .line 429
    invoke-direct {v1, v0, v4, p1}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 430
    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_7
    const/16 p1, 0x1a

    .line 434
    .line 435
    if-lt v2, p1, :cond_8

    .line 436
    .line 437
    new-instance p1, Lk1/x0;

    .line 438
    .line 439
    invoke-direct {p1, v0, v4, v1}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 440
    .line 441
    .line 442
    :goto_3
    move-object v1, p1

    .line 443
    goto :goto_4

    .line 444
    :cond_8
    new-instance p1, Lk1/w0;

    .line 445
    .line 446
    invoke-direct {p1, v0, v4, v1}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 447
    .line 448
    .line 449
    goto :goto_3

    .line 450
    :goto_4
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/publisher/H;->s0()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/publisher/H;->Z()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5}, Lcom/vungle/ads/internal/model/h0;->j()Lcom/vungle/ads/AdConfig;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    if-eqz p1, :cond_a

    .line 461
    .line 462
    invoke-virtual {p1}, Lcom/vungle/ads/AdConfig;->getWatermark$vungle_ads_release()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    if-eqz p1, :cond_a

    .line 467
    .line 468
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    if-eqz v0, :cond_9

    .line 473
    .line 474
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-eqz v0, :cond_9

    .line 479
    .line 480
    const v1, 0x1020002

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    move-object v11, v0

    .line 488
    check-cast v11, Landroid/widget/FrameLayout;

    .line 489
    .line 490
    :cond_9
    if-eqz v11, :cond_a

    .line 491
    .line 492
    new-instance v0, Lcom/vungle/ads/internal/ui/a0;

    .line 493
    .line 494
    invoke-direct {v0, p0, p1}, Lcom/vungle/ads/internal/ui/a0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 501
    .line 502
    .line 503
    :cond_a
    iput-object v3, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 504
    .line 505
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 506
    .line 507
    const/16 v0, 0x21

    .line 508
    .line 509
    if-lt p1, v0, :cond_b

    .line 510
    .line 511
    invoke-virtual {p0}, Lcom/vungle/ads/internal/ui/l;->a()V

    .line 512
    .line 513
    .line 514
    :cond_b
    sget-object p1, Lcom/vungle/ads/internal/util/d;->f:Lcom/vungle/ads/internal/util/d;

    .line 515
    .line 516
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/l;->f:Lcom/vungle/ads/internal/ui/b;

    .line 517
    .line 518
    invoke-static {p1}, Lcom/vungle/ads/internal/util/a;->a(Lcom/vungle/ads/internal/util/b;)V

    .line 519
    .line 520
    .line 521
    :try_start_2
    new-instance p1, Landroid/content/IntentFilter;

    .line 522
    .line 523
    const-string v0, "android.media.RINGER_MODE_CHANGED"

    .line 524
    .line 525
    invoke-direct {p1, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->d:Lcom/vungle/ads/internal/util/w;

    .line 529
    .line 530
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 531
    .line 532
    .line 533
    goto :goto_5

    .line 534
    :catchall_1
    move-exception v0

    .line 535
    move-object p1, v0

    .line 536
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 537
    .line 538
    .line 539
    :goto_5
    return-void

    .line 540
    :catch_0
    move-exception v0

    .line 541
    move-object p1, v0

    .line 542
    if-eqz v2, :cond_c

    .line 543
    .line 544
    new-instance v0, Lcom/vungle/ads/AdCantPlayWithoutWebView;

    .line 545
    .line 546
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    invoke-direct {v0, p1}, Lcom/vungle/ads/AdCantPlayWithoutWebView;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/l;->e:Lcom/vungle/ads/internal/util/s;

    .line 554
    .line 555
    invoke-virtual {v0, p1}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    invoke-virtual {v6}, Lcom/vungle/ads/internal/model/i3;->b()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v2, p1, v0}, Lcom/vungle/ads/internal/presenter/a;->a(Lcom/vungle/ads/VungleError;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    :cond_c
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 571
    .line 572
    .line 573
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v0}, LG6/T;->y(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Lea/T;->i(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {p0}, LG6/T;->n(Lcom/vungle/ads/internal/ui/l;)Landroid/window/OnBackInvokedDispatcher;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1, v0}, Lea/T;->w(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, p0, Lcom/vungle/ads/internal/ui/l;->c:Ljava/lang/Object;

    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    or-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/presenter/r;->a(I)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/internal/ui/k;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    sget-object v0, Lcom/vungle/ads/internal/util/d;->f:Lcom/vungle/ads/internal/util/d;

    .line 54
    .line 55
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->f:Lcom/vungle/ads/internal/ui/b;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/vungle/ads/internal/util/a;->b(Lcom/vungle/ads/internal/util/b;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->d:Lcom/vungle/ads/internal/util/w;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 68
    .line 69
    .line 70
    :goto_1
    iput-object v2, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 71
    .line 72
    sput-object v2, Lcom/vungle/ads/internal/ui/l;->i:Lcom/vungle/ads/internal/presenter/a;

    .line 73
    .line 74
    sput-object v2, Lcom/vungle/ads/internal/ui/l;->h:Lcom/vungle/ads/internal/y0;

    .line 75
    .line 76
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 6

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getIntent()"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/vungle/ads/internal/ui/a;->b(Landroid/content/Intent;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p1}, Lcom/vungle/ads/internal/ui/a;->b(Landroid/content/Intent;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Lcom/vungle/ads/internal/ui/a;->a(Landroid/content/Intent;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p1}, Lcom/vungle/ads/internal/ui/a;->a(Landroid/content/Intent;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    :cond_0
    if-eqz v1, :cond_3

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_3

    .line 60
    .line 61
    :cond_1
    sget-boolean p1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 62
    .line 63
    new-instance p1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v1, "Tried to play another placement "

    .line 66
    .line 67
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " while playing "

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string v1, "AdActivity"

    .line 86
    .line 87
    invoke-static {v1, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    new-instance p1, Lcom/vungle/ads/ConcurrentPlaybackUnsupported;

    .line 91
    .line 92
    const-string v3, "Trying to show "

    .line 93
    .line 94
    const-string v4, " but "

    .line 95
    .line 96
    const-string v5, " is already showing"

    .line 97
    .line 98
    invoke-static {v3, v2, v4, v0, v5}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p1, v0}, Lcom/vungle/ads/ConcurrentPlaybackUnsupported;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->e:Lcom/vungle/ads/internal/util/s;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object v0, Lcom/vungle/ads/internal/ui/l;->i:Lcom/vungle/ads/internal/presenter/a;

    .line 116
    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-virtual {v0, p1, v2}, Lcom/vungle/ads/internal/presenter/a;->a(Lcom/vungle/ads/VungleError;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    const-string v0, "onConcurrentPlaybackError: "

    .line 123
    .line 124
    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->getLocalizedMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v1, p1}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    return-void
.end method

.method public final onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 9
    .line 10
    const-string v1, "MRAIDPresenter"

    .line 11
    .line 12
    const-string v2, "stop()"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/vungle/ads/internal/presenter/r;->a:Lcom/vungle/ads/internal/ui/view/k;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/vungle/ads/internal/ui/view/k;->b()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lcom/vungle/ads/internal/presenter/r;->d:Lcom/vungle/ads/internal/ui/z;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/ui/z;->b(Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 9
    .line 10
    const-string v1, "MRAIDPresenter"

    .line 11
    .line 12
    const-string v2, "start()"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/vungle/ads/internal/presenter/r;->a:Lcom/vungle/ads/internal/ui/view/k;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/vungle/ads/internal/ui/view/k;->d()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lcom/vungle/ads/internal/presenter/r;->d:Lcom/vungle/ads/internal/ui/z;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/ui/z;->b(Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lad/L;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lad/L;-><init>(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x23

    .line 26
    .line 27
    if-lt v0, v2, :cond_0

    .line 28
    .line 29
    new-instance v0, Lk1/y0;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, p1, v1, v2}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 v2, 0x1e

    .line 37
    .line 38
    if-lt v0, v2, :cond_1

    .line 39
    .line 40
    new-instance v0, Lk1/w0;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, p1, v1, v2}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v2, 0x1a

    .line 48
    .line 49
    if-lt v0, v2, :cond_2

    .line 50
    .line 51
    new-instance v0, Lk1/x0;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, p1, v1, v2}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v0, Lk1/w0;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-direct {v0, p1, v1, v2}, Lk1/w0;-><init>(Landroid/view/Window;Lad/L;I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/H;->s0()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/H;->Z()V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void
.end method

.method public final setRequestedOrientation(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
