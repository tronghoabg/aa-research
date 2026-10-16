.class public final Lu0/B;
.super LEf/A;
.source "SourceFile"


# static fields
.field public static final l:Lef/p;

.field public static final m:Lcom/google/android/gms/common/api/internal/f0;


# instance fields
.field public final b:Landroid/view/Choreographer;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/lang/Object;

.field public final e:Lff/l;

.field public f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Z

.field public i:Z

.field public final j:Lu0/A;

.field public final k:Lu0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lu0/w;->p:Lu0/w;

    .line 2
    .line 3
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lu0/B;->l:Lef/p;

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/common/api/internal/f0;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/internal/f0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lu0/B;->m:Lcom/google/android/gms/common/api/internal/f0;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LEf/A;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/B;->b:Landroid/view/Choreographer;

    .line 5
    .line 6
    iput-object p2, p0, Lu0/B;->c:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance p2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lu0/B;->d:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Lff/l;

    .line 16
    .line 17
    invoke-direct {p2}, Lff/l;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lu0/B;->e:Lff/l;

    .line 21
    .line 22
    new-instance p2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lu0/B;->f:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance p2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lu0/B;->g:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance p2, Lu0/A;

    .line 37
    .line 38
    invoke-direct {p2, p0}, Lu0/A;-><init>(Lu0/B;)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lu0/B;->j:Lu0/A;

    .line 42
    .line 43
    new-instance p2, Lu0/C;

    .line 44
    .line 45
    invoke-direct {p2, p1}, Lu0/C;-><init>(Landroid/view/Choreographer;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lu0/B;->k:Lu0/C;

    .line 49
    .line 50
    return-void
.end method

.method public static final z(Lu0/B;)V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Lu0/B;->B()Ljava/lang/Runnable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lu0/B;->B()Ljava/lang/Runnable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lu0/B;->d:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, p0, Lu0/B;->e:Lff/l;

    .line 19
    .line 20
    invoke-virtual {v1}, Lff/l;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Lu0/B;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    const/4 v1, 0x1

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    return-void

    .line 37
    :goto_2
    monitor-exit v0

    .line 38
    throw p0
.end method


# virtual methods
.method public final B()Ljava/lang/Runnable;
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lu0/B;->e:Lff/l;

    .line 5
    .line 6
    invoke-virtual {v1}, Lff/l;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v1}, Lff/l;->removeFirst()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    check-cast v1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0

    .line 24
    throw v1
.end method

.method public final i(Ljf/h;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "block"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lu0/B;->d:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    iget-object v0, p0, Lu0/B;->e:Lff/l;

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Lff/l;->addLast(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p2, p0, Lu0/B;->h:Z

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Lu0/B;->h:Z

    .line 25
    .line 26
    iget-object v0, p0, Lu0/B;->c:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object v1, p0, Lu0/B;->j:Lu0/A;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    iget-boolean v0, p0, Lu0/B;->i:Z

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iput-boolean p2, p0, Lu0/B;->i:Z

    .line 38
    .line 39
    iget-object p2, p0, Lu0/B;->b:Landroid/view/Choreographer;

    .line 40
    .line 41
    iget-object v0, p0, Lu0/B;->j:Lu0/A;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p1

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit p1

    .line 52
    throw p2
.end method
