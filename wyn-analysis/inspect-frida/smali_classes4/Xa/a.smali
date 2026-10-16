.class public final LXa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;
.implements Luc/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000cH\u0016J\u0008\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000cH\u0016J\u0008\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u0008H\u0016J\u0008\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/pravera/flutter_foreground_task/FlutterForegroundTaskPlugin;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;",
        "Lcom/pravera/flutter_foreground_task/service/ServiceProvider;",
        "Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;",
        "<init>",
        "()V",
        "notificationPermissionManager",
        "Lcom/pravera/flutter_foreground_task/service/NotificationPermissionManager;",
        "foregroundServiceManager",
        "Lcom/pravera/flutter_foreground_task/service/ForegroundServiceManager;",
        "activityBinding",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;",
        "methodCallHandler",
        "Lcom/pravera/flutter_foreground_task/MethodCallHandlerImpl;",
        "onAttachedToEngine",
        "",
        "binding",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "onDetachedFromEngine",
        "onAttachedToActivity",
        "onDetachedFromActivityForConfigChanges",
        "onReattachedToActivityForConfigChanges",
        "onDetachedFromActivity",
        "onNewIntent",
        "",
        "intent",
        "Landroid/content/Intent;",
        "getNotificationPermissionManager",
        "getForegroundServiceManager",
        "Companion",
        "flutter_foreground_task_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lab/c;

.field public b:Lab/b;

.field public c:Lrc/b;

.field public d:LXa/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lab/b;
    .locals 1

    .line 1
    iget-object v0, p0, LXa/a;->b:Lab/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "foregroundServiceManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 5

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXa/a;->d:LXa/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, "methodCallHandler"

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    check-cast v3, Lq/s1;

    .line 15
    .line 16
    iget-object v4, v3, Lq/s1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Landroid/app/Activity;

    .line 19
    .line 20
    iput-object v4, v0, LXa/b;->d:Landroid/app/Activity;

    .line 21
    .line 22
    iget-object v0, p0, LXa/a;->a:Lab/c;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Lq/s1;->d(Luc/v;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LXa/a;->d:LXa/b;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Lq/s1;->b(Luc/t;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0}, Lq/s1;->c(Luc/u;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, LXa/a;->c:Lrc/b;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lab/a;->a:LHf/e0;

    .line 46
    .line 47
    invoke-static {p1}, LFe/g;->C(Landroid/content/Intent;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    const-string p1, "notificationPermissionManager"

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lab/c;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LXa/a;->a:Lab/c;

    .line 12
    .line 13
    new-instance v0, Lab/b;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LXa/a;->b:Lab/b;

    .line 19
    .line 20
    new-instance v0, LXa/b;

    .line 21
    .line 22
    iget-object v1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string v2, "getApplicationContext(...)"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, p0}, LXa/b;-><init>(Landroid/content/Context;LXa/a;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LXa/a;->d:LXa/b;

    .line 33
    .line 34
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 35
    .line 36
    const-string v1, "getBinaryMessenger(...)"

    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Luc/r;

    .line 42
    .line 43
    const-string v2, "flutter_foreground_task/methods"

    .line 44
    .line 45
    invoke-direct {v1, p1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, LXa/b;->c:Luc/r;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 4

    .line 1
    iget-object v0, p0, LXa/a;->c:Lrc/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, LXa/a;->a:Lab/c;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v0, Lq/s1;

    .line 11
    .line 12
    iget-object v0, v0, Lq/s1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "notificationPermissionManager"

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, LXa/a;->c:Lrc/b;

    .line 27
    .line 28
    const-string v2, "methodCallHandler"

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v3, p0, LXa/a;->d:LXa/b;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    check-cast v0, Lq/s1;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lq/s1;->m(Luc/t;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_3
    :goto_1
    iget-object v0, p0, LXa/a;->c:Lrc/b;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    check-cast v0, Lq/s1;

    .line 51
    .line 52
    iget-object v0, v0, Lq/s1;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :cond_4
    iput-object v1, p0, LXa/a;->c:Lrc/b;

    .line 60
    .line 61
    iget-object v0, p0, LXa/a;->d:LXa/b;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    iput-object v1, v0, LXa/b;->d:Landroid/app/Activity;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LXa/a;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LXa/a;->d:LXa/b;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, LXa/b;->c:Luc/r;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lab/a;->a:LHf/e0;

    .line 7
    .line 8
    invoke-static {p1}, LFe/g;->C(Landroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LXa/a;->onAttachedToActivity(Lrc/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
