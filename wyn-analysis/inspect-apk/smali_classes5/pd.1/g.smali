.class public final Lpd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:La2/v;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:La2/v;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lod/Y1;

.field public final f:Ljavax/net/ssl/SSLSocketFactory;

.field public final g:Lqd/b;

.field public final h:I

.field public final i:Z

.field public final j:Lod/d;

.field public final k:J

.field public final l:I

.field public final m:I

.field public n:Z


# direct methods
.method public constructor <init>(La2/v;La2/v;Ljavax/net/ssl/SSLSocketFactory;Lqd/b;IZJJIILod/Y1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpd/g;->a:La2/v;

    .line 5
    .line 6
    iget-object p1, p1, La2/v;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lod/U1;

    .line 9
    .line 10
    invoke-static {p1}, Lod/V1;->a(Lod/U1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iput-object p1, p0, Lpd/g;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iput-object p2, p0, Lpd/g;->c:La2/v;

    .line 19
    .line 20
    iget-object p1, p2, La2/v;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lod/U1;

    .line 23
    .line 24
    invoke-static {p1}, Lod/V1;->a(Lod/U1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 29
    .line 30
    iput-object p1, p0, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    .line 32
    iput-object p3, p0, Lpd/g;->f:Ljavax/net/ssl/SSLSocketFactory;

    .line 33
    .line 34
    iput-object p4, p0, Lpd/g;->g:Lqd/b;

    .line 35
    .line 36
    iput p5, p0, Lpd/g;->h:I

    .line 37
    .line 38
    iput-boolean p6, p0, Lpd/g;->i:Z

    .line 39
    .line 40
    new-instance p1, Lod/d;

    .line 41
    .line 42
    invoke-direct {p1, p7, p8}, Lod/d;-><init>(J)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lpd/g;->j:Lod/d;

    .line 46
    .line 47
    iput-wide p9, p0, Lpd/g;->k:J

    .line 48
    .line 49
    iput p11, p0, Lpd/g;->l:I

    .line 50
    .line 51
    iput p12, p0, Lpd/g;->m:I

    .line 52
    .line 53
    const-string p1, "transportTracerFactory"

    .line 54
    .line 55
    invoke-static {p13, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p13, p0, Lpd/g;->e:Lod/Y1;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lpd/g;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lpd/g;->n:Z

    .line 8
    .line 9
    iget-object v0, p0, Lpd/g;->a:La2/v;

    .line 10
    .line 11
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lod/U1;

    .line 14
    .line 15
    iget-object v1, p0, Lpd/g;->b:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lod/V1;->b(Lod/U1;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lpd/g;->c:La2/v;

    .line 21
    .line 22
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lod/U1;

    .line 25
    .line 26
    iget-object v1, p0, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lod/V1;->b(Lod/U1;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
