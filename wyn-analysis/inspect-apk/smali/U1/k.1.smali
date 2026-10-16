.class public final LU1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LQ1/q;

.field public final c:Lk8/p;

.field public d:Lk8/p;

.field public final e:LE5/p;

.field public f:Lk8/p;

.field public final g:LE5/p;

.field public final h:LJ9/x;

.field public final i:Landroid/os/Looper;

.field public final j:I

.field public final k:LN1/c;

.field public final l:I

.field public m:Z

.field public final n:LU1/a0;

.field public o:LU1/f;

.field public final p:J

.field public final q:J

.field public final r:Z

.field public s:Z

.field public final t:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, LE5/p;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, LE5/p;-><init>(Landroid/content/Context;I)V

    new-instance v1, LE5/p;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, LE5/p;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, p1, v0, v1}, LU1/k;-><init>(Landroid/content/Context;Lk8/p;Lk8/p;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk8/p;Lk8/p;)V
    .locals 11

    .line 2
    new-instance v0, LE5/p;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, LE5/p;-><init>(Landroid/content/Context;I)V

    new-instance v1, LE5/q;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, LE5/q;-><init>(I)V

    new-instance v2, LE5/p;

    const/4 v3, 0x7

    invoke-direct {v2, p1, v3}, LE5/p;-><init>(Landroid/content/Context;I)V

    new-instance v3, LJ9/x;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, LJ9/x;-><init>(I)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object p1, p0, LU1/k;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, LU1/k;->c:Lk8/p;

    .line 7
    iput-object p3, p0, LU1/k;->d:Lk8/p;

    .line 8
    iput-object v0, p0, LU1/k;->e:LE5/p;

    .line 9
    iput-object v1, p0, LU1/k;->f:Lk8/p;

    .line 10
    iput-object v2, p0, LU1/k;->g:LE5/p;

    .line 11
    iput-object v3, p0, LU1/k;->h:LJ9/x;

    .line 12
    sget p1, LQ1/x;->a:I

    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, LU1/k;->i:Landroid/os/Looper;

    .line 16
    sget-object p1, LN1/c;->e:LN1/c;

    iput-object p1, p0, LU1/k;->k:LN1/c;

    const/4 p1, 0x1

    .line 17
    iput p1, p0, LU1/k;->l:I

    .line 18
    iput-boolean p1, p0, LU1/k;->m:Z

    .line 19
    sget-object p2, LU1/a0;->c:LU1/a0;

    iput-object p2, p0, LU1/k;->n:LU1/a0;

    const-wide/16 p2, 0x14

    .line 20
    invoke-static {p2, p3}, LQ1/x;->K(J)J

    move-result-wide v6

    const-wide/16 p2, 0x1f4

    .line 21
    invoke-static {p2, p3}, LQ1/x;->K(J)J

    move-result-wide v8

    .line 22
    new-instance v0, LU1/f;

    const v2, 0x3f83d70a    # 1.03f

    const-wide/16 v3, 0x3e8

    const v1, 0x3f7851ec    # 0.97f

    const v5, 0x33d6bf95    # 1.0E-7f

    const v10, 0x3f7fbe77    # 0.999f

    invoke-direct/range {v0 .. v10}, LU1/f;-><init>(FFJFJJF)V

    .line 23
    iput-object v0, p0, LU1/k;->o:LU1/f;

    .line 24
    sget-object v0, LQ1/q;->a:LQ1/q;

    iput-object v0, p0, LU1/k;->b:LQ1/q;

    .line 25
    iput-wide p2, p0, LU1/k;->p:J

    const-wide/16 p2, 0x7d0

    .line 26
    iput-wide p2, p0, LU1/k;->q:J

    .line 27
    iput-boolean p1, p0, LU1/k;->r:Z

    .line 28
    const-string p1, ""

    iput-object p1, p0, LU1/k;->t:Ljava/lang/String;

    const/16 p1, -0x3e8

    .line 29
    iput p1, p0, LU1/k;->j:I

    return-void
.end method


# virtual methods
.method public final a()LU1/u;
    .locals 2

    .line 1
    iget-boolean v0, p0, LU1/k;->s:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, LU1/k;->s:Z

    .line 9
    .line 10
    sget v0, LQ1/x;->a:I

    .line 11
    .line 12
    new-instance v0, LU1/u;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LU1/u;-><init>(LU1/k;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
