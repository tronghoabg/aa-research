.class public final synthetic LT3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LT3/r;->a:I

    iput-object p2, p0, LT3/r;->b:Ljava/lang/Object;

    iput-object p3, p0, LT3/r;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 6

    .line 1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LUc/f;

    .line 4
    .line 5
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    sget-object v2, LUc/f;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    sget-object v2, LUc/f;->h:Ljava/util/HashMap;

    .line 15
    .line 16
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :try_start_1
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->j()Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-static {v4}, LUc/f;->a(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    :try_start_2
    invoke-virtual {v0}, LUc/f;->h()V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto :goto_2

    .line 67
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    :goto_2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LUc/n;

    .line 4
    .line 5
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LPc/o;

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 14
    .line 15
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    invoke-virtual {v0}, LDd/c;->C()V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, LDd/c;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lp9/n;

    .line 22
    .line 23
    invoke-virtual {v2}, Lp9/n;->e()V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lp9/l;

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    invoke-direct {v3, v2, v4}, Lp9/l;-><init>(Lp9/n;I)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v2, Lp9/n;->d:Lw9/e;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    monitor-exit v0

    .line 39
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {v1, v0}, LPc/o;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v2

    .line 50
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    :try_start_4
    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 52
    :goto_0
    invoke-static {v1, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private final c()V
    .locals 5

    .line 1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LUc/n;

    .line 4
    .line 5
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LPc/p;

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 14
    .line 15
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    invoke-virtual {v0}, LDd/c;->C()V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, LDd/c;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lp9/n;

    .line 22
    .line 23
    invoke-virtual {v2}, Lp9/n;->e()V

    .line 24
    .line 25
    .line 26
    new-instance v3, Lp9/l;

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-direct {v3, v2, v4}, Lp9/l;-><init>(Lp9/n;I)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v2, Lp9/n;->d:Lw9/e;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    monitor-exit v0

    .line 39
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {v1, v0}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v2

    .line 50
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    :try_start_4
    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 52
    :goto_0
    invoke-static {v1, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/s;

    .line 4
    .line 5
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LH5/e;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    monitor-enter v1

    .line 13
    monitor-exit v1

    .line 14
    iget-object v0, v0, LS3/s;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LU1/r;

    .line 17
    .line 18
    sget v1, LQ1/x;->a:I

    .line 19
    .line 20
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 21
    .line 22
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 23
    .line 24
    iget-object v1, v0, LV1/d;->d:LC6/l;

    .line 25
    .line 26
    iget-object v1, v1, LC6/l;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lk2/H;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, LV1/b;

    .line 35
    .line 36
    const/4 v3, 0x5

    .line 37
    invoke-direct {v2, v3}, LV1/b;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/16 v3, 0x3f5

    .line 41
    .line 42
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final e()V
    .locals 4

    .line 1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 4
    .line 5
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lp8/p;

    .line 8
    .line 9
    const-string v2, "this$0"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-boolean v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->c:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 22
    .line 23
    const-string v1, "future"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, LW3/a;->a:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v1, LJ3/n;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, LU3/j;->k(Lp8/p;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :goto_0
    monitor-exit v2

    .line 47
    return-void

    .line 48
    :goto_1
    monitor-exit v2

    .line 49
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget v4, p0, LT3/r;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/applovin/impl/adview/a;

    .line 13
    .line 14
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/applovin/sdk/AppLovinAd;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/applovin/impl/adview/a;->p(Lcom/applovin/impl/adview/a;Lcom/applovin/sdk/AppLovinAd;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/applovin/impl/adview/a;

    .line 25
    .line 26
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/webkit/WebView;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/applovin/impl/adview/a;->t(Lcom/applovin/impl/adview/a;Landroid/webkit/WebView;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lcom/applovin/impl/adview/a;

    .line 37
    .line 38
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Landroid/view/MotionEvent;

    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/applovin/impl/adview/a;->a(Lcom/applovin/impl/adview/a;Landroid/view/MotionEvent;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcom/applovin/adview/AppLovinFullscreenActivity;

    .line 49
    .line 50
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lcom/applovin/impl/n2;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/applovin/adview/AppLovinFullscreenActivity;->a(Lcom/applovin/adview/AppLovinFullscreenActivity;Lcom/applovin/impl/n2;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_3
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lcom/applovin/adview/AppLovinFullscreenActivity;

    .line 61
    .line 62
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lcom/applovin/adview/AppLovinFullscreenActivity;->c(Lcom/applovin/adview/AppLovinFullscreenActivity;Ljava/lang/Long;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lb2/b;

    .line 73
    .line 74
    iput-boolean v1, v0, Lb2/b;->i:Z

    .line 75
    .line 76
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Landroid/net/Uri;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lb2/b;->d(Landroid/net/Uri;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_5
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La2/s;

    .line 87
    .line 88
    iget-object v0, v0, La2/s;->c:LA/e0;

    .line 89
    .line 90
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, La2/l;

    .line 93
    .line 94
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La2/m;

    .line 97
    .line 98
    iget-object v0, v0, La2/m;->b:Lb2/c;

    .line 99
    .line 100
    iget-object v0, v0, Lb2/c;->d:Ljava/util/HashMap;

    .line 101
    .line 102
    iget-object v1, v1, La2/l;->m:Landroid/net/Uri;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Lb2/b;

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Lb2/b;->c(Z)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_6
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La1/b;

    .line 117
    .line 118
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Landroid/graphics/Typeface;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, La1/b;->k(Landroid/graphics/Typeface;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_7
    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->i:LDd/c;

    .line 127
    .line 128
    iget-object v1, p0, LT3/r;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Landroid/content/Intent;

    .line 131
    .line 132
    iget-object v2, p0, LT3/r;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 135
    .line 136
    invoke-virtual {v0, v1, v2}, LDd/c;->D(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_8
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, LY8/c;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    :try_start_0
    iget-object v0, v0, LY8/c;->h:Lt5/q;

    .line 148
    .line 149
    sget-object v1, Lq5/e;->c:Lq5/e;

    .line 150
    .line 151
    iget-object v0, v0, Lt5/q;->a:Lt5/i;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lt5/i;->b(Lq5/e;)Lt5/i;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {}, Lt5/r;->a()Lt5/r;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object v1, v1, Lt5/r;->d:Lz5/f;

    .line 162
    .line 163
    invoke-virtual {v1, v0, v3}, Lz5/f;->a(Lt5/i;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    .line 165
    .line 166
    :catch_0
    iget-object v0, p0, LT3/r;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_9
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, LWb/a;

    .line 177
    .line 178
    iget-object v0, v0, LWb/a;->c:Luc/h;

    .line 179
    .line 180
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_a
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, LWa/h;

    .line 191
    .line 192
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 193
    .line 194
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_b
    iget-object v0, p0, LT3/r;->c:Ljava/lang/Object;

    .line 201
    .line 202
    move-object v1, v0

    .line 203
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 204
    .line 205
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, LW9/n;

    .line 208
    .line 209
    :try_start_1
    invoke-virtual {v0}, LW9/n;->a()Landroid/graphics/Bitmap;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 214
    .line 215
    .line 216
    goto :goto_0

    .line 217
    :catch_1
    move-exception v0

    .line 218
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 219
    .line 220
    .line 221
    :goto_0
    return-void

    .line 222
    :pswitch_c
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, LA7/c1;

    .line 225
    .line 226
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, Landroid/content/Intent;

    .line 229
    .line 230
    invoke-virtual {v0, v1}, LA7/c1;->a(Landroid/content/Intent;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_d
    invoke-direct {p0}, LT3/r;->e()V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_e
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, LW1/g;

    .line 241
    .line 242
    iget-object v2, p0, LT3/r;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v2, Lxa/d;

    .line 245
    .line 246
    iget-object v2, v2, Lxa/d;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v2, LW1/v;

    .line 249
    .line 250
    iget-object v2, v2, LW1/v;->D0:LS3/s;

    .line 251
    .line 252
    iget-object v3, v2, LS3/s;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Landroid/os/Handler;

    .line 255
    .line 256
    if-eqz v3, :cond_0

    .line 257
    .line 258
    new-instance v4, LW1/f;

    .line 259
    .line 260
    invoke-direct {v4, v2, v1, v0}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 264
    .line 265
    .line 266
    :cond_0
    return-void

    .line 267
    :pswitch_f
    invoke-direct {p0}, LT3/r;->d()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_10
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, LUc/n;

    .line 274
    .line 275
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, LPc/q;

    .line 278
    .line 279
    :try_start_2
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->j()Lcom/google/android/gms/tasks/Task;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-static {v3}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    invoke-static {v0}, LUc/f;->a(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v2}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 294
    .line 295
    .line 296
    goto :goto_1

    .line 297
    :catch_2
    move-exception v0

    .line 298
    invoke-static {v1, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 299
    .line 300
    .line 301
    :goto_1
    return-void

    .line 302
    :pswitch_11
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LUc/n;

    .line 305
    .line 306
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, LPc/o;

    .line 309
    .line 310
    :try_start_3
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->l()Lcom/google/android/gms/tasks/Task;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v2}, LPc/o;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :catch_3
    move-exception v0

    .line 326
    invoke-static {v1, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 327
    .line 328
    .line 329
    :goto_2
    return-void

    .line 330
    :pswitch_12
    invoke-direct {p0}, LT3/r;->c()V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_13
    invoke-direct {p0}, LT3/r;->a()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_14
    iget-object v1, p0, LT3/r;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v1, Ljava/lang/Boolean;

    .line 341
    .line 342
    iget-object v4, p0, LT3/r;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v4, LPc/q;

    .line 345
    .line 346
    sget-object v5, LUc/f;->h:Ljava/util/HashMap;

    .line 347
    .line 348
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_1

    .line 353
    .line 354
    sput v3, LBa/c;->i:I

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_1
    sput v0, LBa/c;->i:I

    .line 358
    .line 359
    :goto_3
    invoke-virtual {v4, v2}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :catch_4
    move-exception v0

    .line 364
    invoke-static {v4, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 365
    .line 366
    .line 367
    :goto_4
    return-void

    .line 368
    :pswitch_15
    invoke-direct {p0}, LT3/r;->b()V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :pswitch_16
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, LUc/n;

    .line 375
    .line 376
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v1, LPc/q;

    .line 379
    .line 380
    :try_start_5
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->a()Lcom/google/android/gms/tasks/Task;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v2}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 392
    .line 393
    .line 394
    goto :goto_5

    .line 395
    :catch_5
    move-exception v0

    .line 396
    invoke-static {v1, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 397
    .line 398
    .line 399
    :goto_5
    return-void

    .line 400
    :pswitch_17
    iget-object v0, p0, LT3/r;->c:Ljava/lang/Object;

    .line 401
    .line 402
    move-object v1, v0

    .line 403
    check-cast v1, LU1/T;

    .line 404
    .line 405
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, LU1/z;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    :try_start_6
    monitor-enter v1

    .line 413
    monitor-exit v1
    :try_end_6
    .catch LU1/j; {:try_start_6 .. :try_end_6} :catch_6

    .line 414
    :try_start_7
    iget-object v0, v1, LU1/T;->a:LU1/W;

    .line 415
    .line 416
    iget v2, v1, LU1/T;->d:I

    .line 417
    .line 418
    iget-object v4, v1, LU1/T;->e:Ljava/lang/Object;

    .line 419
    .line 420
    invoke-interface {v0, v2, v4}, LU1/S;->c(ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 421
    .line 422
    .line 423
    :try_start_8
    invoke-virtual {v1, v3}, LU1/T;->b(Z)V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :catchall_0
    move-exception v0

    .line 428
    invoke-virtual {v1, v3}, LU1/T;->b(Z)V

    .line 429
    .line 430
    .line 431
    throw v0
    :try_end_8
    .catch LU1/j; {:try_start_8 .. :try_end_8} :catch_6

    .line 432
    :catch_6
    move-exception v0

    .line 433
    const-string v1, "ExoPlayerImplInternal"

    .line 434
    .line 435
    const-string v2, "Unexpected error delivering message on external thread."

    .line 436
    .line 437
    invoke-static {v1, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 438
    .line 439
    .line 440
    new-instance v1, Ljava/lang/RuntimeException;

    .line 441
    .line 442
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :pswitch_18
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 447
    .line 448
    move-object v4, v0

    .line 449
    check-cast v4, LU1/u;

    .line 450
    .line 451
    iget-object v0, p0, LT3/r;->c:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, LT5/s;

    .line 454
    .line 455
    iget v2, v4, LU1/u;->E:I

    .line 456
    .line 457
    iget v5, v0, LT5/s;->b:I

    .line 458
    .line 459
    sub-int/2addr v2, v5

    .line 460
    iput v2, v4, LU1/u;->E:I

    .line 461
    .line 462
    iget-boolean v5, v0, LT5/s;->d:Z

    .line 463
    .line 464
    if-eqz v5, :cond_2

    .line 465
    .line 466
    iget v5, v0, LT5/s;->f:I

    .line 467
    .line 468
    iput v5, v4, LU1/u;->F:I

    .line 469
    .line 470
    iput-boolean v3, v4, LU1/u;->G:Z

    .line 471
    .line 472
    :cond_2
    if-nez v2, :cond_c

    .line 473
    .line 474
    iget-object v2, v0, LT5/s;->e:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v2, LU1/P;

    .line 477
    .line 478
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 479
    .line 480
    iget-object v5, v4, LU1/u;->d0:LU1/P;

    .line 481
    .line 482
    iget-object v5, v5, LU1/P;->a:LN1/N;

    .line 483
    .line 484
    invoke-virtual {v5}, LN1/N;->p()Z

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    if-nez v5, :cond_3

    .line 489
    .line 490
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    if-eqz v5, :cond_3

    .line 495
    .line 496
    const/4 v5, -0x1

    .line 497
    iput v5, v4, LU1/u;->e0:I

    .line 498
    .line 499
    const-wide/16 v5, 0x0

    .line 500
    .line 501
    iput-wide v5, v4, LU1/u;->f0:J

    .line 502
    .line 503
    :cond_3
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-nez v5, :cond_5

    .line 508
    .line 509
    move-object v5, v2

    .line 510
    check-cast v5, LU1/V;

    .line 511
    .line 512
    iget-object v5, v5, LU1/V;->i:[LN1/N;

    .line 513
    .line 514
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    iget-object v7, v4, LU1/u;->o:Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v7

    .line 528
    if-ne v6, v7, :cond_4

    .line 529
    .line 530
    move v6, v3

    .line 531
    goto :goto_6

    .line 532
    :cond_4
    move v6, v1

    .line 533
    :goto_6
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 534
    .line 535
    .line 536
    move v6, v1

    .line 537
    :goto_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    if-ge v6, v7, :cond_5

    .line 542
    .line 543
    iget-object v7, v4, LU1/u;->o:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    check-cast v7, LU1/t;

    .line 550
    .line 551
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    check-cast v8, LN1/N;

    .line 556
    .line 557
    iput-object v8, v7, LU1/t;->b:LN1/N;

    .line 558
    .line 559
    add-int/2addr v6, v3

    .line 560
    goto :goto_7

    .line 561
    :cond_5
    iget-boolean v5, v4, LU1/u;->G:Z

    .line 562
    .line 563
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    if-eqz v5, :cond_b

    .line 569
    .line 570
    iget-object v5, v0, LT5/s;->e:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v5, LU1/P;

    .line 573
    .line 574
    iget-object v5, v5, LU1/P;->b:Lk2/H;

    .line 575
    .line 576
    iget-object v8, v4, LU1/u;->d0:LU1/P;

    .line 577
    .line 578
    iget-object v8, v8, LU1/P;->b:Lk2/H;

    .line 579
    .line 580
    invoke-virtual {v5, v8}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v5

    .line 584
    if-eqz v5, :cond_7

    .line 585
    .line 586
    iget-object v5, v0, LT5/s;->e:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v5, LU1/P;

    .line 589
    .line 590
    iget-wide v8, v5, LU1/P;->d:J

    .line 591
    .line 592
    iget-object v5, v4, LU1/u;->d0:LU1/P;

    .line 593
    .line 594
    iget-wide v10, v5, LU1/P;->s:J

    .line 595
    .line 596
    cmp-long v5, v8, v10

    .line 597
    .line 598
    if-eqz v5, :cond_6

    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_6
    move v3, v1

    .line 602
    :cond_7
    :goto_8
    if-eqz v3, :cond_a

    .line 603
    .line 604
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    if-nez v5, :cond_9

    .line 609
    .line 610
    iget-object v5, v0, LT5/s;->e:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v5, LU1/P;

    .line 613
    .line 614
    iget-object v5, v5, LU1/P;->b:Lk2/H;

    .line 615
    .line 616
    invoke-virtual {v5}, Lk2/H;->b()Z

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    if-eqz v5, :cond_8

    .line 621
    .line 622
    goto :goto_9

    .line 623
    :cond_8
    iget-object v5, v0, LT5/s;->e:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v5, LU1/P;

    .line 626
    .line 627
    iget-object v6, v5, LU1/P;->b:Lk2/H;

    .line 628
    .line 629
    iget-wide v7, v5, LU1/P;->d:J

    .line 630
    .line 631
    iget-object v5, v6, Lk2/H;->a:Ljava/lang/Object;

    .line 632
    .line 633
    iget-object v6, v4, LU1/u;->n:LN1/L;

    .line 634
    .line 635
    invoke-virtual {v2, v5, v6}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 636
    .line 637
    .line 638
    iget-wide v5, v6, LN1/L;->e:J

    .line 639
    .line 640
    add-long/2addr v7, v5

    .line 641
    move-wide v6, v7

    .line 642
    goto :goto_a

    .line 643
    :cond_9
    :goto_9
    iget-object v2, v0, LT5/s;->e:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v2, LU1/P;

    .line 646
    .line 647
    iget-wide v5, v2, LU1/P;->d:J

    .line 648
    .line 649
    move-wide v6, v5

    .line 650
    :cond_a
    :goto_a
    move-wide v9, v6

    .line 651
    move v7, v3

    .line 652
    goto :goto_b

    .line 653
    :cond_b
    move-wide v9, v6

    .line 654
    move v7, v1

    .line 655
    :goto_b
    iput-boolean v1, v4, LU1/u;->G:Z

    .line 656
    .line 657
    iget-object v0, v0, LT5/s;->e:Ljava/lang/Object;

    .line 658
    .line 659
    move-object v5, v0

    .line 660
    check-cast v5, LU1/P;

    .line 661
    .line 662
    iget v8, v4, LU1/u;->F:I

    .line 663
    .line 664
    const/4 v12, 0x0

    .line 665
    const/4 v6, 0x1

    .line 666
    const/4 v11, -0x1

    .line 667
    invoke-virtual/range {v4 .. v12}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 668
    .line 669
    .line 670
    :cond_c
    return-void

    .line 671
    :pswitch_19
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Luc/h;

    .line 674
    .line 675
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v1, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-virtual {v0, v1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :pswitch_1a
    iget-object v0, p0, LT3/r;->c:Ljava/lang/Object;

    .line 684
    .line 685
    move-object v1, v0

    .line 686
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 687
    .line 688
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v0, LTc/b;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    :try_start_9
    invoke-virtual {v0}, LTc/b;->c()V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 699
    .line 700
    .line 701
    goto :goto_c

    .line 702
    :catch_7
    move-exception v0

    .line 703
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 704
    .line 705
    .line 706
    :goto_c
    return-void

    .line 707
    :pswitch_1b
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, LX8/c;

    .line 710
    .line 711
    iget-object v1, v0, LX8/c;->b:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v1, LT8/g;

    .line 714
    .line 715
    iget-object v0, v0, LX8/c;->a:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v0, Ljava/lang/String;

    .line 718
    .line 719
    iget-object v2, p0, LT3/r;->c:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v2, Ljava/util/List;

    .line 722
    .line 723
    invoke-virtual {v1, v0, v2}, LT8/g;->i(Ljava/lang/String;Ljava/util/List;)V

    .line 724
    .line 725
    .line 726
    return-void

    .line 727
    :pswitch_1c
    iget-object v0, p0, LT3/r;->b:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, LT3/s;

    .line 730
    .line 731
    iget-object v1, p0, LT3/r;->c:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v1, LU3/j;

    .line 734
    .line 735
    iget-object v2, v0, LT3/s;->a:LU3/j;

    .line 736
    .line 737
    iget-object v2, v2, LU3/h;->a:Ljava/lang/Object;

    .line 738
    .line 739
    instance-of v2, v2, LU3/a;

    .line 740
    .line 741
    if-nez v2, :cond_d

    .line 742
    .line 743
    iget-object v0, v0, LT3/s;->d:LJ3/q;

    .line 744
    .line 745
    invoke-virtual {v0}, LJ3/q;->getForegroundInfoAsync()Lp8/p;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v1, v0}, LU3/j;->k(Lp8/p;)Z

    .line 750
    .line 751
    .line 752
    goto :goto_d

    .line 753
    :cond_d
    invoke-virtual {v1, v3}, LU3/h;->cancel(Z)Z

    .line 754
    .line 755
    .line 756
    :goto_d
    return-void

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
