.class public final Lk2/j0;
.super Lk2/a;
.source "SourceFile"


# static fields
.field public static final j:LN1/n;

.field public static final k:LN1/w;

.field public static final l:[B


# instance fields
.field public final h:J

.field public i:LN1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, LN1/m;

    .line 2
    .line 3
    invoke-direct {v0}, LN1/m;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, v0, LN1/m;->m:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iput v1, v0, LN1/m;->B:I

    .line 16
    .line 17
    const v2, 0xac44

    .line 18
    .line 19
    .line 20
    iput v2, v0, LN1/m;->C:I

    .line 21
    .line 22
    iput v1, v0, LN1/m;->D:I

    .line 23
    .line 24
    new-instance v1, LN1/n;

    .line 25
    .line 26
    invoke-direct {v1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lk2/j0;->j:LN1/n;

    .line 30
    .line 31
    new-instance v0, LJ5/n;

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    invoke-direct {v0, v2}, LJ5/n;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 38
    .line 39
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 40
    .line 41
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 44
    .line 45
    new-instance v2, LE5/Y;

    .line 46
    .line 47
    invoke-direct {v2}, LE5/Y;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v15, LN1/u;->a:LN1/u;

    .line 51
    .line 52
    sget-object v4, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    new-instance v3, LN1/t;

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v5, v1, LN1/n;->n:Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct/range {v3 .. v11}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 68
    .line 69
    .line 70
    move-object v12, v3

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-object v12, v6

    .line 73
    :goto_0
    new-instance v9, LN1/w;

    .line 74
    .line 75
    new-instance v11, LN1/r;

    .line 76
    .line 77
    invoke-direct {v11, v0}, LN1/q;-><init>(LJ5/n;)V

    .line 78
    .line 79
    .line 80
    new-instance v13, LN1/s;

    .line 81
    .line 82
    invoke-direct {v13, v2}, LN1/s;-><init>(LE5/Y;)V

    .line 83
    .line 84
    .line 85
    sget-object v14, LN1/z;->B:LN1/z;

    .line 86
    .line 87
    const-string v10, "SilenceMediaSource"

    .line 88
    .line 89
    invoke-direct/range {v9 .. v15}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 90
    .line 91
    .line 92
    sput-object v9, Lk2/j0;->k:LN1/w;

    .line 93
    .line 94
    const/16 v0, 0x1000

    .line 95
    .line 96
    new-array v0, v0, [B

    .line 97
    .line 98
    sput-object v0, Lk2/j0;->l:[B

    .line 99
    .line 100
    return-void
.end method

.method public constructor <init>(JLN1/w;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lk2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, Lk2/j0;->h:J

    .line 17
    .line 18
    iput-object p3, p0, Lk2/j0;->i:LN1/w;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 0

    .line 1
    new-instance p1, Lk2/h0;

    .line 2
    .line 3
    iget-wide p2, p0, Lk2/j0;->h:J

    .line 4
    .line 5
    invoke-direct {p1, p2, p3}, Lk2/h0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final declared-synchronized h()LN1/w;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk2/j0;->i:LN1/w;
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
    .locals 6

    .line 1
    new-instance v0, Lk2/k0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk2/j0;->h()LN1/w;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-wide v1, p0, Lk2/j0;->h:J

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lk2/k0;-><init>(JZZLN1/w;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lk2/a;->m(LN1/N;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 0

    .line 1
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
    iput-object p1, p0, Lk2/j0;->i:LN1/w;
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
