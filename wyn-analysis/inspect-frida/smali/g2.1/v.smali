.class public final Lg2/v;
.super Lk2/a;
.source "SourceFile"


# instance fields
.field public final h:Lad/I;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/net/Uri;

.field public final k:Ljavax/net/SocketFactory;

.field public l:J

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:LN1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.rtsp"

    .line 2
    .line 3
    invoke-static {v0}, LN1/x;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LN1/w;Lad/I;Ljavax/net/SocketFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/v;->p:LN1/w;

    .line 5
    .line 6
    iput-object p2, p0, Lg2/v;->h:Lad/I;

    .line 7
    .line 8
    const-string p2, "AndroidXMedia3/1.5.1"

    .line 9
    .line 10
    iput-object p2, p0, Lg2/v;->i:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, LN1/t;->a:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, Lg2/v;->j:Landroid/net/Uri;

    .line 20
    .line 21
    iput-object p3, p0, Lg2/v;->k:Ljavax/net/SocketFactory;

    .line 22
    .line 23
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide p1, p0, Lg2/v;->l:J

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lg2/v;->o:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 7

    .line 1
    new-instance v0, Lg2/s;

    .line 2
    .line 3
    new-instance v4, Lcom/google/android/gms/ads/nativead/l;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {v4, p0, p1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, Lg2/v;->j:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v5, p0, Lg2/v;->i:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Lg2/v;->h:Lad/I;

    .line 14
    .line 15
    iget-object v6, p0, Lg2/v;->k:Ljavax/net/SocketFactory;

    .line 16
    .line 17
    move-object v1, p2

    .line 18
    invoke-direct/range {v0 .. v6}, Lg2/s;-><init>(Lo2/e;Lad/I;Landroid/net/Uri;Lcom/google/android/gms/ads/nativead/l;Ljava/lang/String;Ljavax/net/SocketFactory;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final declared-synchronized h()LN1/w;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lg2/v;->p:LN1/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(LS1/A;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg2/v;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 5

    .line 1
    check-cast p1, Lg2/s;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p1, Lg2/s;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lg2/r;

    .line 18
    .line 19
    iget-boolean v2, v1, Lg2/r;->e:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    iget-object v4, v1, Lg2/r;->b:Lo2/m;

    .line 26
    .line 27
    invoke-virtual {v4, v2}, Lo2/m;->e(Lo2/k;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lg2/r;->c:Lk2/c0;

    .line 31
    .line 32
    invoke-virtual {v2}, Lk2/c0;->B()V

    .line 33
    .line 34
    .line 35
    iput-boolean v3, v1, Lg2/r;->e:Z

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p1, Lg2/s;->d:Lg2/n;

    .line 41
    .line 42
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v3, p1, Lg2/s;->r:Z

    .line 46
    .line 47
    return-void
.end method

.method public final p()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized s(LN1/w;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lg2/v;->p:LN1/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final t()V
    .locals 6

    .line 1
    new-instance v0, Lk2/k0;

    .line 2
    .line 3
    iget-wide v1, p0, Lg2/v;->l:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lg2/v;->m:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lg2/v;->n:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lg2/v;->h()LN1/w;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-direct/range {v0 .. v5}, Lk2/k0;-><init>(JZZLN1/w;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v1, p0, Lg2/v;->o:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lg2/t;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, v0, v2}, Lg2/t;-><init>(LN1/N;I)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    invoke-virtual {p0, v0}, Lk2/a;->m(LN1/N;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
