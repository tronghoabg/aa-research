.class public final synthetic Ls4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ls4/b;


# direct methods
.method public synthetic constructor <init>(Ls4/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls4/a;->a:Ls4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr4/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls4/a;->a:Ls4/b;

    .line 2
    .line 3
    iget-object v1, v0, Ls4/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Ls4/b;->o(Lr4/e;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v2, "FFmpegKitLogCallbackEvent"

    .line 21
    .line 22
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Ls4/b;->j:Luc/h;

    .line 26
    .line 27
    iget-object v0, v0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v2, LVc/f;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-direct {v2, p1, v1, v3}, LVc/f;-><init>(Luc/h;Ljava/util/HashMap;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public b(Lr4/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls4/a;->a:Ls4/b;

    .line 2
    .line 3
    iget-object v1, v0, Ls4/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Ls4/b;->q(Lr4/i;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v2, "FFmpegKitStatisticsCallbackEvent"

    .line 21
    .line 22
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Ls4/b;->j:Luc/h;

    .line 26
    .line 27
    iget-object v0, v0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v2, LVc/f;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-direct {v2, p1, v1, v3}, LVc/f;-><init>(Luc/h;Ljava/util/HashMap;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method
