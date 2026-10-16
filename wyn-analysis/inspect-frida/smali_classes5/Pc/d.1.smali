.class public LPc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lqc/b;
.implements Lrc/a;


# static fields
.field public static final i:Ljava/util/HashMap;


# instance fields
.field public a:Luc/f;

.field public b:Luc/r;

.field public c:Landroid/app/Activity;

.field public final d:Ljava/util/HashMap;

.field public final e:Lxa/d;

.field public final f:LPc/k;

.field public final g:LPc/l;

.field public final h:Lc8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LPc/d;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Lxa/d;

    .line 12
    .line 13
    const/16 v1, 0x15

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v1, v2}, Lxa/d;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LPc/d;->e:Lxa/d;

    .line 20
    .line 21
    new-instance v0, LPc/k;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LPc/d;->f:LPc/k;

    .line 27
    .line 28
    new-instance v0, LPc/l;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LPc/d;->g:LPc/l;

    .line 34
    .line 35
    new-instance v0, Lc8/e;

    .line 36
    .line 37
    const/16 v1, 0x19

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LPc/d;->h:Lc8/e;

    .line 43
    .line 44
    return-void
.end method

.method public static a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 3

    .line 1
    iget-object v0, p0, LPc/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LPc/m;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->f(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v1, LQc/c;->c:Ljava/util/HashMap;

    .line 19
    .line 20
    iget-object v2, p0, LPc/m;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->d(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p0, p0, LPc/m;->c:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->d(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, LPc/d;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Luc/j;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Luc/i;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-interface {v3, v4}, Luc/i;->onCancel(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v2, v4}, Luc/j;->a(Luc/i;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final didReinitializeFirebaseCore()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LC8/d;

    .line 9
    .line 10
    const/16 v3, 0x18

    .line 11
    .line 12
    invoke-direct {v2, v3, p0, v0}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LB8/a;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v2, p1, v0, v3}, LB8/a;-><init>(Ls8/g;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, LPc/d;->c:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v0, p0, LPc/d;->e:Lxa/d;

    .line 10
    .line 11
    iput-object p1, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    const-string v0, "plugins.flutter.io/firebase_auth"

    .line 4
    .line 5
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Luc/r;

    .line 9
    .line 10
    invoke-direct {v1, p1, v0}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LPc/d;->b:Luc/r;

    .line 14
    .line 15
    invoke-static {p1, p0}, LN0/a;->u(Luc/f;LPc/d;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LPc/d;->e:Lxa/d;

    .line 19
    .line 20
    invoke-static {p1, v0}, LN0/a;->z(Luc/f;Lxa/d;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LPc/d;->f:LPc/k;

    .line 24
    .line 25
    invoke-static {p1, v0}, LN0/a;->x(Luc/f;LPc/z;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, LN0/a;->v(Luc/f;LPc/u;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LPc/d;->g:LPc/l;

    .line 32
    .line 33
    invoke-static {p1, v0}, LN0/a;->w(Luc/f;LPc/w;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LPc/d;->h:Lc8/e;

    .line 37
    .line 38
    invoke-static {p1, v0}, LN0/a;->y(Luc/f;Lc8/e;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LPc/d;->a:Luc/f;

    .line 42
    .line 43
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LPc/d;->c:Landroid/app/Activity;

    .line 3
    .line 4
    iget-object v1, p0, LPc/d;->e:Lxa/d;

    .line 5
    .line 6
    iput-object v0, v1, Lxa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LPc/d;->c:Landroid/app/Activity;

    .line 3
    .line 4
    iget-object v1, p0, LPc/d;->e:Lxa/d;

    .line 5
    .line 6
    iput-object v0, v1, Lxa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LPc/d;->b:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/a;->u(Luc/f;LPc/d;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 13
    .line 14
    invoke-static {p1, v0}, LN0/a;->z(Luc/f;Lxa/d;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 18
    .line 19
    invoke-static {p1, v0}, LN0/a;->x(Luc/f;LPc/z;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 23
    .line 24
    invoke-static {p1, v0}, LN0/a;->v(Luc/f;LPc/u;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 28
    .line 29
    invoke-static {p1, v0}, LN0/a;->w(Luc/f;LPc/w;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LPc/d;->a:Luc/f;

    .line 33
    .line 34
    invoke-static {p1, v0}, LN0/a;->y(Luc/f;Lc8/e;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, LPc/d;->b:Luc/r;

    .line 38
    .line 39
    iput-object v0, p0, LPc/d;->a:Luc/f;

    .line 40
    .line 41
    invoke-virtual {p0}, LPc/d;->b()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, LPc/d;->c:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v0, p0, LPc/d;->e:Lxa/d;

    .line 10
    .line 11
    iput-object p1, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method
