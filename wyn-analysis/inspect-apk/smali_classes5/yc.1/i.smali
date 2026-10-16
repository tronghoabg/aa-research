.class public final Lyc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public a:Lqc/a;

.field public b:Lq/s1;


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
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lq/s1;

    .line 3
    .line 4
    iget-object v0, v0, Lq/s1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/app/Activity;

    .line 7
    .line 8
    iget-object v1, p0, Lyc/i;->a:Lqc/a;

    .line 9
    .line 10
    iget-object v2, v1, Lqc/a;->c:Luc/f;

    .line 11
    .line 12
    new-instance v3, Lo1/c;

    .line 13
    .line 14
    const/16 v4, 0x15

    .line 15
    .line 16
    invoke-direct {v3, p1, v4}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lq/s1;

    .line 20
    .line 21
    new-instance v4, Ls8/b;

    .line 22
    .line 23
    const/16 v5, 0x8

    .line 24
    .line 25
    invoke-direct {v4, v5}, Ls8/b;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    iput-boolean v5, v4, Ls8/b;->b:Z

    .line 30
    .line 31
    iget-object v1, v1, Lqc/a;->d:Lio/flutter/embedding/engine/renderer/k;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v2, p1, Lq/s1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v4, p1, Lq/s1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v3, p1, Lq/s1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v1, p1, Lq/s1;->e:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance v0, Luc/j;

    .line 47
    .line 48
    const-string v1, "plugins.flutter.io/camera_android/imageStream"

    .line 49
    .line 50
    invoke-direct {v0, v2, v1}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p1, Lq/s1;->f:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v2, p1}, Lwg/b;->f(Luc/f;Lq/s1;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lyc/i;->b:Lq/s1;

    .line 59
    .line 60
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc/i;->a:Lqc/a;

    .line 2
    .line 3
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyc/i;->b:Lq/s1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq/s1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Luc/f;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lwg/b;->f(Luc/f;Lq/s1;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lyc/i;->b:Lq/s1;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyc/i;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lyc/i;->a:Lqc/a;

    .line 3
    .line 4
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyc/i;->onAttachedToActivity(Lrc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
