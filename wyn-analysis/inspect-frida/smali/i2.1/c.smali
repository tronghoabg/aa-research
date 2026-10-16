.class public final Li2/c;
.super Lk2/a;
.source "SourceFile"

# interfaces
.implements Lo2/h;


# instance fields
.field public final h:Z

.field public final i:Landroid/net/Uri;

.field public final j:LS1/g;

.field public final k:LE5/b;

.field public final l:La9/b;

.field public final m:LZ1/g;

.field public final n:Lae/d;

.field public final o:J

.field public final p:LZ1/d;

.field public final q:Lo2/o;

.field public final r:Ljava/util/ArrayList;

.field public s:LS1/h;

.field public t:Lo2/m;

.field public u:Lo2/n;

.field public v:LS1/A;

.field public w:J

.field public x:Lj2/c;

.field public y:Landroid/os/Handler;

.field public z:LN1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.smoothstreaming"

    .line 2
    .line 3
    invoke-static {v0}, LN1/x;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LN1/w;LS1/g;Lo2/o;LE5/b;La9/b;LZ1/g;Lae/d;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lk2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/c;->z:LN1/w;

    .line 5
    .line 6
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Li2/c;->x:Lj2/c;

    .line 13
    .line 14
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object p1, p1, LN1/t;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object v2, LQ1/x;->j:Ljava/util/regex/Pattern;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    const-string v1, "Manifest"

    .line 53
    .line 54
    invoke-static {p1, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_2
    :goto_0
    iput-object p1, p0, Li2/c;->i:Landroid/net/Uri;

    .line 59
    .line 60
    iput-object p2, p0, Li2/c;->j:LS1/g;

    .line 61
    .line 62
    iput-object p3, p0, Li2/c;->q:Lo2/o;

    .line 63
    .line 64
    iput-object p4, p0, Li2/c;->k:LE5/b;

    .line 65
    .line 66
    iput-object p5, p0, Li2/c;->l:La9/b;

    .line 67
    .line 68
    iput-object p6, p0, Li2/c;->m:LZ1/g;

    .line 69
    .line 70
    iput-object p7, p0, Li2/c;->n:Lae/d;

    .line 71
    .line 72
    iput-wide p8, p0, Li2/c;->o:J

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lk2/a;->a(Lk2/H;)LZ1/d;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Li2/c;->p:LZ1/d;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Li2/c;->h:Z

    .line 82
    .line 83
    new-instance p1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Li2/c;->r:Ljava/util/ArrayList;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final A(Lo2/j;JJ)V
    .locals 3

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    new-instance v0, Lk2/z;

    .line 4
    .line 5
    iget-wide v1, p1, Lo2/p;->a:J

    .line 6
    .line 7
    iget-object v1, p1, Lo2/p;->d:LS1/z;

    .line 8
    .line 9
    iget-object v1, v1, LS1/z;->c:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-direct {v0, p4, p5}, Lk2/z;-><init>(J)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Li2/c;->n:Lae/d;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Li2/c;->p:LZ1/d;

    .line 20
    .line 21
    iget v2, p1, Lo2/p;->c:I

    .line 22
    .line 23
    invoke-virtual {v1, v0, v2}, LZ1/d;->d(Lk2/z;I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lo2/p;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lj2/c;

    .line 29
    .line 30
    iput-object p1, p0, Li2/c;->x:Lj2/c;

    .line 31
    .line 32
    sub-long/2addr p2, p4

    .line 33
    iput-wide p2, p0, Li2/c;->w:J

    .line 34
    .line 35
    invoke-virtual {p0}, Li2/c;->t()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Li2/c;->x:Lj2/c;

    .line 39
    .line 40
    iget-boolean p1, p1, Lj2/c;->d:Z

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-wide p1, p0, Li2/c;->w:J

    .line 46
    .line 47
    const-wide/16 p3, 0x1388

    .line 48
    .line 49
    add-long/2addr p1, p3

    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 51
    .line 52
    .line 53
    move-result-wide p3

    .line 54
    sub-long/2addr p1, p3

    .line 55
    const-wide/16 p3, 0x0

    .line 56
    .line 57
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object p3, p0, Li2/c;->y:Landroid/os/Handler;

    .line 62
    .line 63
    new-instance p4, Lcom/applovin/adview/a;

    .line 64
    .line 65
    const/16 p5, 0x1b

    .line 66
    .line 67
    invoke-direct {p4, p0, p5}, Lcom/applovin/adview/a;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p4, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    check-cast p1, Lo2/p;

    .line 3
    .line 4
    new-instance p3, Lk2/z;

    .line 5
    .line 6
    iget-wide v0, p1, Lo2/p;->a:J

    .line 7
    .line 8
    iget-object v0, p1, Lo2/p;->d:LS1/z;

    .line 9
    .line 10
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-direct {p3, p4, p5}, Lk2/z;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p4, p0, Li2/c;->n:Lae/d;

    .line 16
    .line 17
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of p4, p6, LN1/D;

    .line 21
    .line 22
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    if-nez p4, :cond_2

    .line 28
    .line 29
    instance-of p4, p6, Ljava/io/FileNotFoundException;

    .line 30
    .line 31
    if-nez p4, :cond_2

    .line 32
    .line 33
    instance-of p4, p6, LS1/r;

    .line 34
    .line 35
    if-nez p4, :cond_2

    .line 36
    .line 37
    instance-of p4, p6, Lo2/l;

    .line 38
    .line 39
    if-nez p4, :cond_2

    .line 40
    .line 41
    sget p4, LS1/i;->b:I

    .line 42
    .line 43
    move-object p4, p6

    .line 44
    :goto_0
    if-eqz p4, :cond_1

    .line 45
    .line 46
    instance-of p5, p4, LS1/i;

    .line 47
    .line 48
    if-eqz p5, :cond_0

    .line 49
    .line 50
    move-object p5, p4

    .line 51
    check-cast p5, LS1/i;

    .line 52
    .line 53
    iget p5, p5, LS1/i;->a:I

    .line 54
    .line 55
    const/16 v2, 0x7d8

    .line 56
    .line 57
    if-ne p5, v2, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    add-int/lit8 p7, p7, -0x1

    .line 66
    .line 67
    mul-int/lit16 p7, p7, 0x3e8

    .line 68
    .line 69
    const/16 p4, 0x1388

    .line 70
    .line 71
    invoke-static {p7, p4}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    int-to-long p4, p4

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    :goto_1
    move-wide p4, v0

    .line 78
    :goto_2
    cmp-long p7, p4, v0

    .line 79
    .line 80
    if-nez p7, :cond_3

    .line 81
    .line 82
    sget-object p2, Lo2/m;->f:LU5/f;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    new-instance p7, LU5/f;

    .line 86
    .line 87
    invoke-direct {p7, p4, p5, p2, p2}, LU5/f;-><init>(JIZ)V

    .line 88
    .line 89
    .line 90
    move-object p2, p7

    .line 91
    :goto_3
    invoke-virtual {p2}, LU5/f;->a()Z

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    xor-int/lit8 p4, p4, 0x1

    .line 96
    .line 97
    iget-object p5, p0, Li2/c;->p:LZ1/d;

    .line 98
    .line 99
    iget p1, p1, Lo2/p;->c:I

    .line 100
    .line 101
    invoke-virtual {p5, p3, p1, p6, p4}, LZ1/d;->g(Lk2/z;ILjava/io/IOException;Z)V

    .line 102
    .line 103
    .line 104
    return-object p2
.end method

.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 11

    .line 1
    invoke-virtual {p0, p1}, Lk2/a;->a(Lk2/H;)LZ1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v8

    .line 5
    new-instance v6, LZ1/d;

    .line 6
    .line 7
    iget-object p3, p0, Lk2/a;->d:LZ1/d;

    .line 8
    .line 9
    iget-object p3, p3, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-direct {v6, p3, p4, p1}, LZ1/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILk2/H;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Li2/b;

    .line 16
    .line 17
    iget-object v1, p0, Li2/c;->x:Lj2/c;

    .line 18
    .line 19
    iget-object v3, p0, Li2/c;->v:LS1/A;

    .line 20
    .line 21
    iget-object v9, p0, Li2/c;->u:Lo2/n;

    .line 22
    .line 23
    iget-object v4, p0, Li2/c;->l:La9/b;

    .line 24
    .line 25
    iget-object v5, p0, Li2/c;->m:LZ1/g;

    .line 26
    .line 27
    iget-object v2, p0, Li2/c;->k:LE5/b;

    .line 28
    .line 29
    iget-object v7, p0, Li2/c;->n:Lae/d;

    .line 30
    .line 31
    move-object v10, p2

    .line 32
    invoke-direct/range {v0 .. v10}, Li2/b;-><init>(Lj2/c;LE5/b;LS1/A;La9/b;LZ1/g;LZ1/d;Lae/d;LZ1/d;Lo2/n;Lo2/e;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Li2/c;->r:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final declared-synchronized h()LN1/w;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Li2/c;->z:LN1/w;
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
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c;->u:Lo2/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lo2/n;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(LS1/A;)V
    .locals 2

    .line 1
    iput-object p1, p0, Li2/c;->v:LS1/A;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lk2/a;->g:LV1/k;

    .line 8
    .line 9
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Li2/c;->m:LZ1/g;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, LZ1/g;->h(Landroid/os/Looper;LV1/k;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, LZ1/g;->f()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Li2/c;->h:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Landroidx/fragment/app/X;

    .line 25
    .line 26
    const/16 v0, 0xa

    .line 27
    .line 28
    invoke-direct {p1, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Li2/c;->u:Lo2/n;

    .line 32
    .line 33
    invoke-virtual {p0}, Li2/c;->t()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Li2/c;->j:LS1/g;

    .line 38
    .line 39
    invoke-interface {p1}, LS1/g;->b()LS1/h;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Li2/c;->s:LS1/h;

    .line 44
    .line 45
    new-instance p1, Lo2/m;

    .line 46
    .line 47
    const-string v0, "SsMediaSource"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Li2/c;->t:Lo2/m;

    .line 53
    .line 54
    iput-object p1, p0, Li2/c;->u:Lo2/n;

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-static {p1}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Li2/c;->y:Landroid/os/Handler;

    .line 62
    .line 63
    invoke-virtual {p0}, Li2/c;->u()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Li2/b;

    .line 3
    .line 4
    iget-object v1, v0, Li2/b;->m:[Ll2/h;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    const/4 v4, 0x0

    .line 9
    if-ge v3, v2, :cond_0

    .line 10
    .line 11
    aget-object v5, v1, v3

    .line 12
    .line 13
    invoke-virtual {v5, v4}, Ll2/h;->y(LX1/b;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object v4, v0, Li2/b;->k:Lk2/E;

    .line 20
    .line 21
    iget-object v0, p0, Li2/c;->r:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Li2/c;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Li2/c;->x:Lj2/c;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    iput-object v0, p0, Li2/c;->x:Lj2/c;

    .line 11
    .line 12
    iput-object v1, p0, Li2/c;->s:LS1/h;

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    iput-wide v2, p0, Li2/c;->w:J

    .line 17
    .line 18
    iget-object v0, p0, Li2/c;->t:Lo2/m;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lo2/m;->e(Lo2/k;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Li2/c;->t:Lo2/m;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Li2/c;->y:Landroid/os/Handler;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Li2/c;->y:Landroid/os/Handler;

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Li2/c;->m:LZ1/g;

    .line 37
    .line 38
    invoke-interface {v0}, LZ1/g;->release()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final declared-synchronized s(LN1/w;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Li2/c;->z:LN1/w;
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
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, v0, Li2/c;->r:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const/4 v5, 0x1

    .line 11
    if-ge v2, v4, :cond_4

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Li2/b;

    .line 18
    .line 19
    iget-object v4, v0, Li2/c;->x:Lj2/c;

    .line 20
    .line 21
    iput-object v4, v3, Li2/b;->l:Lj2/c;

    .line 22
    .line 23
    iget-object v6, v3, Li2/b;->m:[Ll2/h;

    .line 24
    .line 25
    array-length v7, v6

    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_1
    if-ge v8, v7, :cond_3

    .line 28
    .line 29
    aget-object v9, v6, v8

    .line 30
    .line 31
    iget-object v9, v9, Ll2/h;->e:Ll2/i;

    .line 32
    .line 33
    check-cast v9, Li2/a;

    .line 34
    .line 35
    iget-object v10, v9, Li2/a;->f:Lj2/c;

    .line 36
    .line 37
    iget-object v10, v10, Lj2/c;->f:[Lj2/b;

    .line 38
    .line 39
    iget v11, v9, Li2/a;->b:I

    .line 40
    .line 41
    aget-object v10, v10, v11

    .line 42
    .line 43
    iget v12, v10, Lj2/b;->k:I

    .line 44
    .line 45
    iget-object v13, v4, Lj2/c;->f:[Lj2/b;

    .line 46
    .line 47
    aget-object v11, v13, v11

    .line 48
    .line 49
    if-eqz v12, :cond_0

    .line 50
    .line 51
    iget v13, v11, Lj2/b;->k:I

    .line 52
    .line 53
    if-nez v13, :cond_1

    .line 54
    .line 55
    :cond_0
    move v13, v2

    .line 56
    const/4 v11, 0x0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    add-int/lit8 v13, v12, -0x1

    .line 59
    .line 60
    iget-object v14, v10, Lj2/b;->o:[J

    .line 61
    .line 62
    aget-wide v15, v14, v13

    .line 63
    .line 64
    invoke-virtual {v10, v13}, Lj2/b;->b(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v17

    .line 68
    add-long v17, v17, v15

    .line 69
    .line 70
    iget-object v10, v11, Lj2/b;->o:[J

    .line 71
    .line 72
    move v13, v2

    .line 73
    const/4 v11, 0x0

    .line 74
    aget-wide v1, v10, v11

    .line 75
    .line 76
    cmp-long v10, v17, v1

    .line 77
    .line 78
    if-gtz v10, :cond_2

    .line 79
    .line 80
    iget v1, v9, Li2/a;->g:I

    .line 81
    .line 82
    add-int/2addr v1, v12

    .line 83
    iput v1, v9, Li2/a;->g:I

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    iget v10, v9, Li2/a;->g:I

    .line 87
    .line 88
    invoke-static {v14, v1, v2, v5}, LQ1/x;->e([JJZ)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v1, v10

    .line 93
    iput v1, v9, Li2/a;->g:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_2
    iget v1, v9, Li2/a;->g:I

    .line 97
    .line 98
    add-int/2addr v1, v12

    .line 99
    iput v1, v9, Li2/a;->g:I

    .line 100
    .line 101
    :goto_3
    iput-object v4, v9, Li2/a;->f:Lj2/c;

    .line 102
    .line 103
    add-int/lit8 v8, v8, 0x1

    .line 104
    .line 105
    move v2, v13

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move v13, v2

    .line 108
    const/4 v11, 0x0

    .line 109
    iget-object v1, v3, Li2/b;->k:Lk2/E;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-interface {v1, v3}, Lk2/e0;->a(Lk2/f0;)V

    .line 115
    .line 116
    .line 117
    add-int/lit8 v2, v13, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    const/4 v11, 0x0

    .line 121
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 122
    .line 123
    iget-object v1, v1, Lj2/c;->f:[Lj2/b;

    .line 124
    .line 125
    array-length v2, v1

    .line 126
    const-wide v3, 0x7fffffffffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    const-wide/high16 v6, -0x8000000000000000L

    .line 132
    .line 133
    move-wide v9, v3

    .line 134
    move v8, v11

    .line 135
    :goto_4
    if-ge v8, v2, :cond_6

    .line 136
    .line 137
    aget-object v12, v1, v8

    .line 138
    .line 139
    iget v13, v12, Lj2/b;->k:I

    .line 140
    .line 141
    if-lez v13, :cond_5

    .line 142
    .line 143
    iget-object v13, v12, Lj2/b;->o:[J

    .line 144
    .line 145
    aget-wide v14, v13, v11

    .line 146
    .line 147
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v9

    .line 151
    iget v14, v12, Lj2/b;->k:I

    .line 152
    .line 153
    sub-int/2addr v14, v5

    .line 154
    aget-wide v15, v13, v14

    .line 155
    .line 156
    invoke-virtual {v12, v14}, Lj2/b;->b(I)J

    .line 157
    .line 158
    .line 159
    move-result-wide v12

    .line 160
    add-long/2addr v12, v15

    .line 161
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide v6

    .line 165
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    cmp-long v1, v9, v3

    .line 169
    .line 170
    const-wide/16 v2, 0x0

    .line 171
    .line 172
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    if-nez v1, :cond_8

    .line 178
    .line 179
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 180
    .line 181
    iget-boolean v1, v1, Lj2/c;->d:Z

    .line 182
    .line 183
    if-eqz v1, :cond_7

    .line 184
    .line 185
    move-wide v7, v4

    .line 186
    goto :goto_5

    .line 187
    :cond_7
    move-wide v7, v2

    .line 188
    :goto_5
    new-instance v6, Lk2/k0;

    .line 189
    .line 190
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 191
    .line 192
    iget-boolean v2, v1, Lj2/c;->d:Z

    .line 193
    .line 194
    invoke-virtual {v0}, Li2/c;->h()LN1/w;

    .line 195
    .line 196
    .line 197
    move-result-object v19

    .line 198
    const-wide/16 v13, 0x0

    .line 199
    .line 200
    const/4 v15, 0x1

    .line 201
    const-wide/16 v9, 0x0

    .line 202
    .line 203
    const-wide/16 v11, 0x0

    .line 204
    .line 205
    move/from16 v17, v2

    .line 206
    .line 207
    move-object/from16 v18, v1

    .line 208
    .line 209
    move/from16 v16, v2

    .line 210
    .line 211
    invoke-direct/range {v6 .. v19}, Lk2/k0;-><init>(JJJJZZZLjava/lang/Object;LN1/w;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_8
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 217
    .line 218
    iget-boolean v8, v1, Lj2/c;->d:Z

    .line 219
    .line 220
    if-eqz v8, :cond_b

    .line 221
    .line 222
    iget-wide v11, v1, Lj2/c;->h:J

    .line 223
    .line 224
    cmp-long v1, v11, v4

    .line 225
    .line 226
    if-eqz v1, :cond_9

    .line 227
    .line 228
    cmp-long v1, v11, v2

    .line 229
    .line 230
    if-lez v1, :cond_9

    .line 231
    .line 232
    sub-long v1, v6, v11

    .line 233
    .line 234
    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 235
    .line 236
    .line 237
    move-result-wide v9

    .line 238
    :cond_9
    move-wide/from16 v16, v9

    .line 239
    .line 240
    sub-long v14, v6, v16

    .line 241
    .line 242
    iget-wide v1, v0, Li2/c;->o:J

    .line 243
    .line 244
    invoke-static {v1, v2}, LQ1/x;->K(J)J

    .line 245
    .line 246
    .line 247
    move-result-wide v1

    .line 248
    sub-long v1, v14, v1

    .line 249
    .line 250
    const-wide/32 v3, 0x4c4b40

    .line 251
    .line 252
    .line 253
    cmp-long v5, v1, v3

    .line 254
    .line 255
    if-gez v5, :cond_a

    .line 256
    .line 257
    const-wide/16 v1, 0x2

    .line 258
    .line 259
    div-long v1, v14, v1

    .line 260
    .line 261
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 262
    .line 263
    .line 264
    move-result-wide v1

    .line 265
    :cond_a
    move-wide/from16 v18, v1

    .line 266
    .line 267
    new-instance v11, Lk2/k0;

    .line 268
    .line 269
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 270
    .line 271
    invoke-virtual {v0}, Li2/c;->h()LN1/w;

    .line 272
    .line 273
    .line 274
    move-result-object v24

    .line 275
    const/16 v21, 0x1

    .line 276
    .line 277
    const/16 v22, 0x1

    .line 278
    .line 279
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    const/16 v20, 0x1

    .line 285
    .line 286
    move-object/from16 v23, v1

    .line 287
    .line 288
    invoke-direct/range {v11 .. v24}, Lk2/k0;-><init>(JJJJZZZLjava/lang/Object;LN1/w;)V

    .line 289
    .line 290
    .line 291
    move-object v6, v11

    .line 292
    goto :goto_8

    .line 293
    :cond_b
    iget-wide v1, v1, Lj2/c;->g:J

    .line 294
    .line 295
    cmp-long v3, v1, v4

    .line 296
    .line 297
    if-eqz v3, :cond_c

    .line 298
    .line 299
    :goto_6
    move-wide/from16 v19, v1

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_c
    sub-long v1, v6, v9

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_7
    new-instance v12, Lk2/k0;

    .line 306
    .line 307
    add-long v17, v9, v19

    .line 308
    .line 309
    iget-object v1, v0, Li2/c;->x:Lj2/c;

    .line 310
    .line 311
    invoke-virtual {v0}, Li2/c;->h()LN1/w;

    .line 312
    .line 313
    .line 314
    move-result-object v29

    .line 315
    const/16 v26, 0x0

    .line 316
    .line 317
    const/16 v30, 0x0

    .line 318
    .line 319
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    const-wide/16 v23, 0x0

    .line 330
    .line 331
    const/16 v25, 0x1

    .line 332
    .line 333
    const/16 v27, 0x0

    .line 334
    .line 335
    move-object/from16 v28, v1

    .line 336
    .line 337
    move-wide/from16 v21, v9

    .line 338
    .line 339
    invoke-direct/range {v12 .. v30}, Lk2/k0;-><init>(JJJJJJZZZLjava/lang/Object;LN1/w;LN1/s;)V

    .line 340
    .line 341
    .line 342
    move-object v6, v12

    .line 343
    :goto_8
    invoke-virtual {v0, v6}, Lk2/a;->m(LN1/N;)V

    .line 344
    .line 345
    .line 346
    return-void
.end method

.method public final u()V
    .locals 14

    .line 1
    iget-object v0, p0, Li2/c;->t:Lo2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo2/m;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lo2/p;

    .line 11
    .line 12
    iget-object v1, p0, Li2/c;->s:LS1/h;

    .line 13
    .line 14
    iget-object v2, p0, Li2/c;->q:Lo2/o;

    .line 15
    .line 16
    iget-object v3, p0, Li2/c;->i:Landroid/net/Uri;

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    invoke-direct {v0, v1, v3, v4, v2}, Lo2/p;-><init>(LS1/h;Landroid/net/Uri;ILo2/o;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Li2/c;->t:Lo2/m;

    .line 23
    .line 24
    iget-object v2, p0, Li2/c;->n:Lae/d;

    .line 25
    .line 26
    iget v5, v0, Lo2/p;->c:I

    .line 27
    .line 28
    invoke-virtual {v2, v5}, Lae/d;->g(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v0, p0, v2}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 33
    .line 34
    .line 35
    new-instance v4, Lk2/z;

    .line 36
    .line 37
    iget-object v0, v0, Lo2/p;->b:LS1/k;

    .line 38
    .line 39
    invoke-direct {v4, v0}, Lk2/z;-><init>(LS1/k;)V

    .line 40
    .line 41
    .line 42
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Li2/c;->p:LZ1/d;

    .line 53
    .line 54
    const/4 v6, -0x1

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-virtual/range {v3 .. v13}, LZ1/d;->h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final w(Lo2/j;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    new-instance v1, Lk2/z;

    .line 4
    .line 5
    iget-wide p2, p1, Lo2/p;->a:J

    .line 6
    .line 7
    iget-object p2, p1, Lo2/p;->d:LS1/z;

    .line 8
    .line 9
    iget-object p2, p2, LS1/z;->c:Landroid/net/Uri;

    .line 10
    .line 11
    move-wide p2, p4

    .line 12
    invoke-direct {v1, p2, p3}, Lk2/z;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Li2/c;->n:Lae/d;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Li2/c;->p:LZ1/d;

    .line 31
    .line 32
    iget v2, p1, Lo2/p;->c:I

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual/range {v0 .. v10}, LZ1/d;->c(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
