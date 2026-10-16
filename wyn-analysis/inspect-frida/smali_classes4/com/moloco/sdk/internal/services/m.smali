.class public final Lcom/moloco/sdk/internal/services/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/analytics/c;

.field public final b:Lcom/moloco/sdk/internal/services/k;

.field public c:Ljava/lang/Long;

.field public d:Z


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/analytics/c;Lcom/moloco/sdk/internal/services/k;)V
    .locals 1

    .line 1
    const-string v0, "analyticsService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeProviderService"

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
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/m;->a:Lcom/moloco/sdk/internal/services/analytics/c;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/m;->b:Lcom/moloco/sdk/internal/services/k;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onPause(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic onResume(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->d(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onStart(Landroidx/lifecycle/v;)V
    .locals 12

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 7
    .line 8
    const-string v3, "Application onStart"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const-string v2, "SingleObserverBackgroundThenForegroundAnalyticsListener"

    .line 12
    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/m;->c:Ljava/lang/Long;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-string v3, "Background event has been recorded, recording foreground"

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const-string v2, "SingleObserverBackgroundThenForegroundAnalyticsListener"

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/m;->b:Lcom/moloco/sdk/internal/services/k;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v9

    .line 45
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/m;->a:Lcom/moloco/sdk/internal/services/analytics/c;

    .line 46
    .line 47
    iget-object v0, p1, Lcom/moloco/sdk/internal/services/analytics/c;->c:Lcom/moloco/sdk/internal/services/events/e;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/events/e;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 50
    .line 51
    iget-boolean v2, v0, Lcom/moloco/sdk/internal/services/events/g;->a:Z

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/events/g;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-lez v0, :cond_0

    .line 63
    .line 64
    const-string v0, "Recording applicationForeground with timestamp: "

    .line 65
    .line 66
    const-string v2, ", lastBgTimestamp: "

    .line 67
    .line 68
    invoke-static {v7, v8, v0, v2}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const/4 v5, 0x4

    .line 80
    const/4 v6, 0x0

    .line 81
    const-string v2, "AnalyticsService"

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lcom/moloco/sdk/internal/scheduling/a;->a:LKd/a;

    .line 88
    .line 89
    new-instance v2, Lcom/moloco/sdk/internal/services/analytics/b;

    .line 90
    .line 91
    move-wide v4, v7

    .line 92
    const/4 v8, 0x0

    .line 93
    move-object v3, p1

    .line 94
    move-wide v6, v9

    .line 95
    invoke-direct/range {v2 .. v8}, Lcom/moloco/sdk/internal/services/analytics/b;-><init>(Lcom/moloco/sdk/internal/services/analytics/c;JJLjf/c;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x3

    .line 99
    invoke-static {v0, v11, v2, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 100
    .line 101
    .line 102
    :cond_0
    iput-object v11, p0, Lcom/moloco/sdk/internal/services/m;->c:Ljava/lang/Long;

    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    iput-boolean p1, p0, Lcom/moloco/sdk/internal/services/m;->d:Z

    .line 106
    .line 107
    :cond_1
    return-void
.end method

.method public final onStop(Landroidx/lifecycle/v;)V
    .locals 8

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    const-string v2, "Application onStop"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v1, "SingleObserverBackgroundThenForegroundAnalyticsListener"

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/services/m;->d:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string v2, "Tracking of event is true. Recording background"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const-string v1, "SingleObserverBackgroundThenForegroundAnalyticsListener"

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/m;->b:Lcom/moloco/sdk/internal/services/k;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/m;->c:Ljava/lang/Long;

    .line 41
    .line 42
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/m;->a:Lcom/moloco/sdk/internal/services/analytics/c;

    .line 43
    .line 44
    iget-object v1, p1, Lcom/moloco/sdk/internal/services/analytics/c;->c:Lcom/moloco/sdk/internal/services/events/e;

    .line 45
    .line 46
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/events/e;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 47
    .line 48
    iget-boolean v2, v1, Lcom/moloco/sdk/internal/services/events/g;->a:Z

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/events/g;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-lez v1, :cond_0

    .line 59
    .line 60
    const-string v1, "Recording applicationBackground with timestamp: "

    .line 61
    .line 62
    invoke-static {v6, v7, v1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v4, 0x4

    .line 67
    const/4 v5, 0x0

    .line 68
    const-string v1, "AnalyticsService"

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lcom/moloco/sdk/internal/scheduling/a;->a:LKd/a;

    .line 75
    .line 76
    new-instance v1, Lcom/moloco/sdk/internal/services/analytics/a;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v1, p1, v6, v7, v2}, Lcom/moloco/sdk/internal/services/analytics/a;-><init>(Lcom/moloco/sdk/internal/services/analytics/c;JLjf/c;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x3

    .line 83
    invoke-static {v0, v2, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void
.end method
