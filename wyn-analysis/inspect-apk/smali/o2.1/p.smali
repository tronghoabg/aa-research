.class public final Lo2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/j;


# instance fields
.field public final a:J

.field public final b:LS1/k;

.field public final c:I

.field public final d:LS1/z;

.field public final e:Lo2/o;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LS1/h;Landroid/net/Uri;ILo2/o;)V
    .locals 11

    .line 1
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "The uri must be set."

    .line 4
    .line 5
    invoke-static {p2, v0}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LS1/k;

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    const-wide/16 v7, -0x1

    .line 17
    .line 18
    move-object v1, p2

    .line 19
    invoke-direct/range {v0 .. v10}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, LS1/z;

    .line 26
    .line 27
    invoke-direct {p2, p1}, LS1/z;-><init>(LS1/h;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lo2/p;->d:LS1/z;

    .line 31
    .line 32
    iput-object v0, p0, Lo2/p;->b:LS1/k;

    .line 33
    .line 34
    iput p3, p0, Lo2/p;->c:I

    .line 35
    .line 36
    iput-object p4, p0, Lo2/p;->e:Lo2/o;

    .line 37
    .line 38
    sget-object p1, Lk2/z;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Lo2/p;->a:J

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 0

    .line 1
    return-void
.end method

.method public final load()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/p;->d:LS1/z;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iput-wide v1, v0, LS1/z;->b:J

    .line 6
    .line 7
    new-instance v0, LS1/j;

    .line 8
    .line 9
    iget-object v1, p0, Lo2/p;->d:LS1/z;

    .line 10
    .line 11
    iget-object v2, p0, Lo2/p;->b:LS1/k;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, LS1/j;-><init>(LS1/h;LS1/k;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v0, LS1/j;->a:LS1/h;

    .line 17
    .line 18
    iget-object v2, v0, LS1/j;->b:LS1/k;

    .line 19
    .line 20
    invoke-interface {v1, v2}, LS1/h;->y(LS1/k;)J

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, LS1/j;->d:Z

    .line 25
    .line 26
    iget-object v1, p0, Lo2/p;->d:LS1/z;

    .line 27
    .line 28
    iget-object v1, v1, LS1/z;->a:LS1/h;

    .line 29
    .line 30
    invoke-interface {v1}, LS1/h;->k()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lo2/p;->e:Lo2/o;

    .line 38
    .line 39
    invoke-interface {v2, v1, v0}, Lo2/o;->t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lo2/p;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 51
    .line 52
    .line 53
    throw v1
.end method
