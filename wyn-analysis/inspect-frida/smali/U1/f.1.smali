.class public final LU1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:J

.field public final d:F

.field public final e:J

.field public final f:J

.field public final g:F

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:J

.field public n:F

.field public o:F

.field public p:F

.field public q:J

.field public r:J

.field public s:J


# direct methods
.method public constructor <init>(FFJFJJF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LU1/f;->a:F

    .line 5
    .line 6
    iput p2, p0, LU1/f;->b:F

    .line 7
    .line 8
    iput-wide p3, p0, LU1/f;->c:J

    .line 9
    .line 10
    iput p5, p0, LU1/f;->d:F

    .line 11
    .line 12
    iput-wide p6, p0, LU1/f;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, LU1/f;->f:J

    .line 15
    .line 16
    iput p10, p0, LU1/f;->g:F

    .line 17
    .line 18
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p3, p0, LU1/f;->h:J

    .line 24
    .line 25
    iput-wide p3, p0, LU1/f;->i:J

    .line 26
    .line 27
    iput-wide p3, p0, LU1/f;->k:J

    .line 28
    .line 29
    iput-wide p3, p0, LU1/f;->l:J

    .line 30
    .line 31
    iput p1, p0, LU1/f;->o:F

    .line 32
    .line 33
    iput p2, p0, LU1/f;->n:F

    .line 34
    .line 35
    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput p1, p0, LU1/f;->p:F

    .line 38
    .line 39
    iput-wide p3, p0, LU1/f;->q:J

    .line 40
    .line 41
    iput-wide p3, p0, LU1/f;->j:J

    .line 42
    .line 43
    iput-wide p3, p0, LU1/f;->m:J

    .line 44
    .line 45
    iput-wide p3, p0, LU1/f;->r:J

    .line 46
    .line 47
    iput-wide p3, p0, LU1/f;->s:J

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-wide v0, p0, LU1/f;->h:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_3

    .line 11
    .line 12
    iget-wide v4, p0, LU1/f;->i:J

    .line 13
    .line 14
    cmp-long v6, v4, v2

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide v4, p0, LU1/f;->k:J

    .line 20
    .line 21
    cmp-long v6, v4, v2

    .line 22
    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    cmp-long v6, v0, v4

    .line 26
    .line 27
    if-gez v6, :cond_1

    .line 28
    .line 29
    move-wide v0, v4

    .line 30
    :cond_1
    iget-wide v4, p0, LU1/f;->l:J

    .line 31
    .line 32
    cmp-long v6, v4, v2

    .line 33
    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    cmp-long v6, v0, v4

    .line 37
    .line 38
    if-lez v6, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-wide v4, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move-wide v4, v2

    .line 44
    :goto_0
    iget-wide v0, p0, LU1/f;->j:J

    .line 45
    .line 46
    cmp-long v0, v0, v4

    .line 47
    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    iput-wide v4, p0, LU1/f;->j:J

    .line 52
    .line 53
    iput-wide v4, p0, LU1/f;->m:J

    .line 54
    .line 55
    iput-wide v2, p0, LU1/f;->r:J

    .line 56
    .line 57
    iput-wide v2, p0, LU1/f;->s:J

    .line 58
    .line 59
    iput-wide v2, p0, LU1/f;->q:J

    .line 60
    .line 61
    return-void
.end method
