.class public final Lgd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public a:Lb7/k;


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
.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgd/f;->a:Lb7/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "UrlLauncherPlugin"

    .line 6
    .line 7
    const-string v0, "urlLauncher was never set."

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    check-cast p1, Lq/s1;

    .line 14
    .line 15
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Landroid/app/Activity;

    .line 18
    .line 19
    iput-object p1, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    new-instance v0, Lb7/k;

    .line 2
    .line 3
    iget-object v1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lb7/k;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lgd/f;->a:Lb7/k;

    .line 11
    .line 12
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->E(Luc/f;Lb7/k;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgd/f;->a:Lb7/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "UrlLauncherPlugin"

    .line 6
    .line 7
    const-string v1, "urlLauncher was never set."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgd/f;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgd/f;->a:Lb7/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "UrlLauncherPlugin"

    .line 6
    .line 7
    const-string v0, "Already detached from the engine."

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->E(Luc/f;Lb7/k;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lgd/f;->a:Lb7/k;

    .line 20
    .line 21
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lgd/f;->onAttachedToActivity(Lrc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
