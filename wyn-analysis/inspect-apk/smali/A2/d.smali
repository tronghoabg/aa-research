.class public final LA2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/n;
.implements Ls2/o;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements LJ5/l;
.implements LJ5/m;
.implements LX1/g;


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, LA2/d;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 18
    iput-wide v0, p0, LA2/d;->b:J

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA2/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LA2/d;->a:I

    iput-wide p1, p0, LA2/d;->b:J

    iput-object p3, p0, LA2/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LJ5/h;J)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, LA2/d;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 9
    iget-wide v0, p1, LJ5/h;->d:J

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    invoke-static {p1}, Lu6/a;->e(Z)V

    .line 11
    iput-wide p2, p0, LA2/d;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 3
    iput p4, p0, LA2/d;->a:I

    iput-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    iput-wide p2, p0, LA2/d;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln7/b;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA2/d;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 6
    iput-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls2/j;J)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA2/d;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 14
    iget-wide v0, p1, Ls2/j;->d:J

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-static {p1}, LQ1/k;->c(Z)V

    .line 16
    iput-wide p2, p0, LA2/d;->b:J

    return-void
.end method

.method public static final R(Lcom/google/android/gms/internal/ads/zzdzt;Ljava/lang/String;J)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzoq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 4
    .line 5
    sget-object v1, LD6/s;->e:LD6/s;

    .line 6
    .line 7
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdzt;->zza()Lcom/google/android/gms/internal/ads/zzdzs;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "action"

    .line 26
    .line 27
    const-string v1, "lat_init"

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdzs;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzs;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdzs;->zzd()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public E()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public F(JJ)J
    .locals 0

    .line 1
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ls2/h;

    .line 4
    .line 5
    iget p1, p1, Ls2/h;->a:I

    .line 6
    .line 7
    int-to-long p1, p1

    .line 8
    return-wide p1
.end method

.method public G(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LA2/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    invoke-virtual {v1, p1}, LA2/d;->G(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-wide v0, p0, LA2/d;->b:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p1

    .line 21
    not-long v2, v2

    .line 22
    and-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, LA2/d;->b:J

    .line 24
    .line 25
    return-void
.end method

.method public H(I)I
    .locals 6

    .line 1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA2/d;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-lt p1, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, LA2/d;->b:J

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    iget-wide v0, p0, LA2/d;->b:J

    .line 21
    .line 22
    shl-long v4, v2, p1

    .line 23
    .line 24
    sub-long/2addr v4, v2

    .line 25
    and-long/2addr v0, v4

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    if-ge p1, v1, :cond_2

    .line 32
    .line 33
    iget-wide v0, p0, LA2/d;->b:J

    .line 34
    .line 35
    shl-long v4, v2, p1

    .line 36
    .line 37
    sub-long/2addr v4, v2

    .line 38
    and-long/2addr v0, v4

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_2
    sub-int/2addr p1, v1

    .line 45
    invoke-virtual {v0, p1}, LA2/d;->H(I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-wide v0, p0, LA2/d;->b:J

    .line 50
    .line 51
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, p1

    .line 56
    return v0
.end method

.method public I()V
    .locals 1

    .line 1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA2/d;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LA2/d;

    .line 8
    .line 9
    invoke-direct {v0}, LA2/d;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public J(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/d;->I()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA2/d;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, LA2/d;->J(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    iget-wide v0, p0, LA2/d;->b:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    shl-long/2addr v2, p1

    .line 23
    and-long/2addr v0, v2

    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long p1, v0, v2

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public K(IZ)V
    .locals 9

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/d;->I()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA2/d;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1, p2}, LA2/d;->K(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, LA2/d;->b:J

    .line 18
    .line 19
    const-wide/high16 v2, -0x8000000000000000L

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    shl-long v7, v5, p1

    .line 36
    .line 37
    sub-long/2addr v7, v5

    .line 38
    and-long v5, v0, v7

    .line 39
    .line 40
    not-long v7, v7

    .line 41
    and-long/2addr v0, v7

    .line 42
    shl-long/2addr v0, v4

    .line 43
    or-long/2addr v0, v5

    .line 44
    iput-wide v0, p0, LA2/d;->b:J

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1}, LA2/d;->O(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, LA2/d;->G(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, LA2/d;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_2
    invoke-virtual {p0}, LA2/d;->I()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, LA2/d;

    .line 71
    .line 72
    invoke-virtual {p1, v3, v2}, LA2/d;->K(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public L(I)Z
    .locals 10

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/d;->I()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA2/d;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, LA2/d;->L(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    shl-long v2, v0, p1

    .line 21
    .line 22
    iget-wide v4, p0, LA2/d;->b:J

    .line 23
    .line 24
    and-long v6, v4, v2

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, v7

    .line 37
    :goto_0
    not-long v8, v2

    .line 38
    and-long/2addr v4, v8

    .line 39
    iput-wide v4, p0, LA2/d;->b:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    and-long v0, v4, v2

    .line 43
    .line 44
    not-long v2, v2

    .line 45
    and-long/2addr v2, v4

    .line 46
    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    or-long/2addr v0, v2

    .line 51
    iput-wide v0, p0, LA2/d;->b:J

    .line 52
    .line 53
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, LA2/d;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v7}, LA2/d;->J(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {p0, v0}, LA2/d;->O(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, LA2/d;

    .line 73
    .line 74
    invoke-virtual {v0, v7}, LA2/d;->L(I)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    return p1
.end method

.method public M()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LA2/d;->b:J

    .line 4
    .line 5
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LA2/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LA2/d;->M()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public N(Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv9/b;

    .line 4
    .line 5
    iget-object v1, v0, Lv9/b;->f:Lw9/e;

    .line 6
    .line 7
    invoke-virtual {v1}, Lw9/e;->d()V

    .line 8
    .line 9
    .line 10
    iget-wide v1, v0, Lv9/b;->i:J

    .line 11
    .line 12
    iget-wide v3, p0, LA2/d;->b:J

    .line 13
    .line 14
    cmp-long v1, v1, v3

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x0

    .line 31
    new-array v0, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const-string v2, "stream callback skipped by CloseGuardedRunner."

    .line 35
    .line 36
    invoke-static {p1, v2, v1, v0}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public O(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/d;->I()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA2/d;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, LA2/d;->O(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, LA2/d;->b:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long/2addr v2, p1

    .line 22
    or-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, LA2/d;->b:J

    .line 24
    .line 25
    return-void
.end method

.method public P(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LA2/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Exception;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 12
    .line 13
    const-wide/16 v2, 0x64

    .line 14
    .line 15
    add-long/2addr v2, v0

    .line 16
    iput-wide v2, p0, LA2/d;->b:J

    .line 17
    .line 18
    :cond_0
    iget-wide v2, p0, LA2/d;->b:J

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-ltz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Exception;

    .line 27
    .line 28
    if-eq v0, p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Exception;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    return-void
.end method

.method public Q(Landroid/content/Context;LH6/a;ZLcom/google/android/gms/internal/ads/zzcff;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Lcom/google/android/gms/internal/ads/zzfqt;Lcom/google/android/gms/internal/ads/zzdzt;Ljava/lang/Long;Z)V
    .locals 13

    .line 1
    move-object/from16 v1, p7

    .line 2
    .line 3
    move-object/from16 v2, p8

    .line 4
    .line 5
    move-object/from16 v3, p9

    .line 6
    .line 7
    move-object/from16 v4, p10

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v6, LC6/n;->D:LC6/n;

    .line 11
    .line 12
    iget-object v7, v6, LC6/n;->k:Ln7/b;

    .line 13
    .line 14
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v7

    .line 21
    iget-wide v9, p0, LA2/d;->b:J

    .line 22
    .line 23
    sub-long/2addr v7, v9

    .line 24
    const-wide/16 v9, 0x1388

    .line 25
    .line 26
    cmp-long v7, v7, v9

    .line 27
    .line 28
    if-gez v7, :cond_0

    .line 29
    .line 30
    sget p1, LG6/L;->b:I

    .line 31
    .line 32
    const-string p1, "Not retrying to fetch app settings"

    .line 33
    .line 34
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object v7, v6, LC6/n;->k:Ln7/b;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    iput-wide v8, p0, LA2/d;->b:J

    .line 48
    .line 49
    if-eqz p4, :cond_2

    .line 50
    .line 51
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/ads/zzcff;->zzd()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/ads/zzcff;->zzb()J

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v10

    .line 73
    sub-long/2addr v10, v8

    .line 74
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbix;->zzfj:Lcom/google/android/gms/internal/ads/zzbio;

    .line 75
    .line 76
    sget-object v8, LD6/s;->e:LD6/s;

    .line 77
    .line 78
    iget-object v8, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 79
    .line 80
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    cmp-long v7, v10, v7

    .line 91
    .line 92
    if-gtz v7, :cond_2

    .line 93
    .line 94
    invoke-virtual/range {p4 .. p4}, Lcom/google/android/gms/internal/ads/zzcff;->zzc()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_2

    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 103
    .line 104
    sget p1, LG6/L;->b:I

    .line 105
    .line 106
    const-string p1, "Context not provided to fetch application settings"

    .line 107
    .line 108
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_4

    .line 117
    .line 118
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_4

    .line 123
    .line 124
    sget p1, LG6/L;->b:I

    .line 125
    .line 126
    const-string p1, "App settings could not be fetched. Required parameters missing"

    .line 127
    .line 128
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-nez v7, :cond_5

    .line 137
    .line 138
    move-object v7, p1

    .line 139
    :cond_5
    iput-object v7, p0, LA2/d;->c:Ljava/lang/Object;

    .line 140
    .line 141
    const/4 v7, 0x4

    .line 142
    invoke-static {p1, v7}, Lcom/google/android/gms/internal/ads/u;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-interface {v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zza()Lcom/google/android/gms/internal/ads/zzfqg;

    .line 147
    .line 148
    .line 149
    iget-object v8, p0, LA2/d;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v8, Landroid/content/Context;

    .line 152
    .line 153
    iget-object v6, v6, LC6/n;->r:Lcom/google/android/gms/internal/ads/zzbug;

    .line 154
    .line 155
    invoke-virtual {v6, v8, p2, v2}, Lcom/google/android/gms/internal/ads/zzbug;->zzb(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzfqt;)Lcom/google/android/gms/internal/ads/zzbup;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    const-string v8, "google.afma.config.fetchAppSettings"

    .line 160
    .line 161
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbum;->zza:Lcom/google/android/gms/internal/ads/zzbuj;

    .line 162
    .line 163
    invoke-virtual {v6, v8, v9, v9}, Lcom/google/android/gms/internal/ads/zzbup;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbui;Lcom/google/android/gms/internal/ads/zzbuh;)Lcom/google/android/gms/internal/ads/zzbuf;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    .line 168
    .line 169
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-nez v9, :cond_6

    .line 177
    .line 178
    const-string v9, "app_id"

    .line 179
    .line 180
    move-object/from16 v10, p5

    .line 181
    .line 182
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :catch_0
    move-exception v0

    .line 187
    move-object p1, v0

    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :cond_6
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    if-nez v9, :cond_7

    .line 195
    .line 196
    const-string v9, "ad_unit_id"

    .line 197
    .line 198
    move-object/from16 v10, p6

    .line 199
    .line 200
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    :cond_7
    :goto_1
    const-string v9, "is_init"

    .line 204
    .line 205
    move/from16 v10, p3

    .line 206
    .line 207
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 208
    .line 209
    .line 210
    const-string v9, "pn"

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    const-string v9, "experiment_ids"

    .line 220
    .line 221
    const-string v10, ","

    .line 222
    .line 223
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbix;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 224
    .line 225
    sget-object v11, LD6/s;->e:LD6/s;

    .line 226
    .line 227
    iget-object v12, v11, LD6/s;->a:Lcom/google/android/gms/internal/ads/zzbip;

    .line 228
    .line 229
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzbip;->zze()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    invoke-static {v10, v12}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    .line 239
    .line 240
    const-string v9, "js"

    .line 241
    .line 242
    iget-object v0, p2, LH6/a;->a:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 245
    .line 246
    .line 247
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzlb:Lcom/google/android/gms/internal/ads/zzbio;

    .line 248
    .line 249
    iget-object v9, v11, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 250
    .line 251
    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Ljava/lang/Boolean;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    const-string v0, "inspector_enabled"

    .line 264
    .line 265
    move/from16 v9, p11

    .line 266
    .line 267
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    .line 269
    .line 270
    :cond_8
    :try_start_1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Landroid/content/Context;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-eqz v0, :cond_9

    .line 279
    .line 280
    invoke-static {p1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {p1, v5, v0}, LE0/a;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-eqz p1, :cond_9

    .line 291
    .line 292
    const-string v0, "version"

    .line 293
    .line 294
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 295
    .line 296
    invoke-virtual {v8, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 297
    .line 298
    .line 299
    goto :goto_2

    .line 300
    :catch_1
    :try_start_2
    const-string p1, "Error fetching PackageInfo."

    .line 301
    .line 302
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_9
    :goto_2
    invoke-interface {v6, v8}, Lcom/google/android/gms/internal/ads/zzbuf;->zzb(Ljava/lang/Object;)Lp8/p;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    new-instance v0, LC6/d;

    .line 310
    .line 311
    invoke-direct {v0, v4, v3, v7, v2}, LC6/d;-><init>(Ljava/lang/Long;Lcom/google/android/gms/internal/ads/zzdzt;Lcom/google/android/gms/internal/ads/zzfqg;Lcom/google/android/gms/internal/ads/zzfqt;)V

    .line 312
    .line 313
    .line 314
    sget-object v6, Lcom/google/android/gms/internal/ads/zzcfy;->zzh:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 315
    .line 316
    invoke-static {p1, v0, v6}, Lcom/google/android/gms/internal/ads/zzhcf;->zzj(Lp8/p;Lcom/google/android/gms/internal/ads/zzhbn;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v1, :cond_a

    .line 321
    .line 322
    invoke-interface {p1, v1, v6}, Lp8/p;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 323
    .line 324
    .line 325
    :cond_a
    if-eqz v4, :cond_b

    .line 326
    .line 327
    new-instance v1, LA7/p;

    .line 328
    .line 329
    const/16 v8, 0xe

    .line 330
    .line 331
    invoke-direct {v1, v3, v5, v4, v8}, LA7/p;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 332
    .line 333
    .line 334
    invoke-interface {p1, v1, v6}, Lp8/p;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 335
    .line 336
    .line 337
    :cond_b
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zziM:Lcom/google/android/gms/internal/ads/zzbio;

    .line 338
    .line 339
    sget-object v1, LD6/s;->e:LD6/s;

    .line 340
    .line 341
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 342
    .line 343
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    check-cast p1, Ljava/lang/Boolean;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 350
    .line 351
    .line 352
    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 353
    const-string v1, "ConfigLoader.maybeFetchNewAppSettings"

    .line 354
    .line 355
    if-eqz p1, :cond_c

    .line 356
    .line 357
    :try_start_3
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzcgb;->zzb(Lp8/p;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_c
    invoke-static {v0, v1, v6}, Lcom/google/android/gms/internal/ads/zzcgb;->zza(Lp8/p;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 362
    .line 363
    .line 364
    :goto_3
    return-void

    .line 365
    :goto_4
    sget v0, LG6/L;->b:I

    .line 366
    .line 367
    const-string v0, "Error requesting application settings"

    .line 368
    .line 369
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    invoke-interface {v7, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 373
    .line 374
    .line 375
    invoke-interface {v7, v5}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 376
    .line 377
    .line 378
    invoke-interface {v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzm()Lcom/google/android/gms/internal/ads/zzfqj;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzfqt;->zzb(Lcom/google/android/gms/internal/ads/zzfqj;)V

    .line 383
    .line 384
    .line 385
    return-void
.end method

.method public a(II[B)V
    .locals 2

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LJ5/h;

    .line 10
    .line 11
    invoke-virtual {v1, p3, p1, p2, v0}, LJ5/h;->c([BIIZ)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const/4 v0, 0x0

    .line 16
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ls2/j;

    .line 19
    .line 20
    invoke-virtual {v1, p3, p1, p2, v0}, Ls2/j;->c([BIIZ)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(J)J
    .locals 2

    .line 1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/h;

    .line 4
    .line 5
    iget-object v0, v0, Ls2/h;->e:[J

    .line 6
    .line 7
    long-to-int p1, p1

    .line 8
    aget-wide p1, v0, p1

    .line 9
    .line 10
    iget-wide v0, p0, LA2/d;->b:J

    .line 11
    .line 12
    sub-long/2addr p1, v0

    .line 13
    return-wide p1
.end method

.method public c([BIIZ)Z
    .locals 1

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LJ5/h;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, LJ5/h;->c([BIIZ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ls2/j;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3, p4}, Ls2/j;->c([BIIZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 2

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LJ5/h;

    .line 10
    .line 11
    iput v0, v1, LJ5/h;->f:I

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const/4 v0, 0x0

    .line 15
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ls2/j;

    .line 18
    .line 19
    iput v0, v1, Ls2/j;->f:I

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f([BIIZ)Z
    .locals 1

    .line 1
    iget p2, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LJ5/h;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, LJ5/h;->f([BIIZ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :pswitch_0
    const/4 p2, 0x0

    .line 17
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ls2/j;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, p3, p4}, Ls2/j;->f([BIIZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g()J
    .locals 4

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ5/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LJ5/h;->g()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, LA2/d;->b:J

    .line 15
    .line 16
    sub-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ls2/j;

    .line 21
    .line 22
    invoke-virtual {v0}, Ls2/j;->g()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget-wide v2, p0, LA2/d;->b:J

    .line 27
    .line 28
    sub-long/2addr v0, v2

    .line 29
    return-wide v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getPosition()J
    .locals 4

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ5/h;

    .line 9
    .line 10
    iget-wide v0, v0, LJ5/h;->d:J

    .line 11
    .line 12
    iget-wide v2, p0, LA2/d;->b:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    return-wide v0

    .line 16
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ls2/j;

    .line 19
    .line 20
    iget-wide v0, v0, Ls2/j;->d:J

    .line 21
    .line 22
    iget-wide v2, p0, LA2/d;->b:J

    .line 23
    .line 24
    sub-long/2addr v0, v2

    .line 25
    return-wide v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LJ5/h;

    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, LJ5/h;->b(IZ)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const/4 v0, 0x0

    .line 16
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ls2/j;

    .line 19
    .line 20
    invoke-virtual {v1, p1, v0}, Ls2/j;->b(IZ)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i()J
    .locals 4

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ5/h;

    .line 9
    .line 10
    iget-wide v0, v0, LJ5/h;->c:J

    .line 11
    .line 12
    iget-wide v2, p0, LA2/d;->b:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    return-wide v0

    .line 16
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ls2/j;

    .line 19
    .line 20
    iget-wide v0, v0, Ls2/j;->c:J

    .line 21
    .line 22
    iget-wide v2, p0, LA2/d;->b:J

    .line 23
    .line 24
    sub-long/2addr v0, v2

    .line 25
    return-wide v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j(I)V
    .locals 1

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ5/h;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LJ5/h;->j(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ls2/j;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ls2/j;->j(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 1

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lf6/N;

    .line 9
    .line 10
    invoke-virtual {v0}, Lf6/N;->l()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ls2/o;

    .line 17
    .line 18
    invoke-interface {v0}, Ls2/o;->l()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public m(II)LJ5/w;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    check-cast v0, Lf6/N;

    invoke-virtual {v0, p1, p2}, Lf6/N;->m(II)LJ5/w;

    move-result-object p1

    return-object p1
.end method

.method public m(II)Ls2/C;
    .locals 1

    .line 2
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    check-cast v0, Ls2/o;

    invoke-interface {v0, p1, p2}, Ls2/o;->m(II)Ls2/C;

    move-result-object p1

    return-object p1
.end method

.method public o(JJ)J
    .locals 0

    .line 1
    iget-object p3, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Ls2/h;

    .line 4
    .line 5
    iget-object p3, p3, Ls2/h;->d:[J

    .line 6
    .line 7
    long-to-int p1, p1

    .line 8
    aget-wide p1, p3, p1

    .line 9
    .line 10
    return-wide p1
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LA7/L;

    .line 4
    .line 5
    iget-object p1, p1, LA7/L;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    iget-wide v0, p0, LA2/d;->b:J

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public q(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public r(JJ)J
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide p1
.end method

.method public read([BII)I
    .locals 1

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ5/h;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, LJ5/h;->read([BII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ls2/j;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, p3}, Ls2/j;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public readFully([BII)V
    .locals 2

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LJ5/h;

    .line 10
    .line 11
    invoke-virtual {v1, p1, p2, p3, v0}, LJ5/h;->f([BIIZ)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const/4 v0, 0x0

    .line 16
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ls2/j;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2, p3, v0}, Ls2/j;->f([BIIZ)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public s(Ls2/w;)V
    .locals 1

    .line 1
    new-instance v0, LA2/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p1}, LA2/e;-><init>(LA2/d;Ls2/w;Ls2/w;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ls2/o;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ls2/o;->s(Ls2/w;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LA2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LA2/d;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LA2/d;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, LA2/d;->b:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, LA2/d;

    .line 32
    .line 33
    invoke-virtual {v1}, LA2/d;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, LA2/d;->b:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    .line 59
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public u(J)LY1/j;
    .locals 6

    .line 1
    new-instance v0, LY1/j;

    .line 2
    .line 3
    iget-object v1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ls2/h;

    .line 6
    .line 7
    iget-object v2, v1, Ls2/h;->c:[J

    .line 8
    .line 9
    long-to-int p1, p1

    .line 10
    aget-wide v3, v2, p1

    .line 11
    .line 12
    iget-object p2, v1, Ls2/h;->b:[I

    .line 13
    .line 14
    aget p1, p2, p1

    .line 15
    .line 16
    int-to-long p1, p1

    .line 17
    const/4 v1, 0x0

    .line 18
    move-wide v2, v3

    .line 19
    move-wide v4, p1

    .line 20
    invoke-direct/range {v0 .. v5}, LY1/j;-><init>(Ljava/lang/String;JJ)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public v(JJ)J
    .locals 0

    .line 1
    iget-wide p3, p0, LA2/d;->b:J

    .line 2
    .line 3
    add-long/2addr p1, p3

    .line 4
    iget-object p3, p0, LA2/d;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p3, Ls2/h;

    .line 7
    .line 8
    iget-object p3, p3, Ls2/h;->e:[J

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    invoke-static {p3, p1, p2, p4}, LQ1/x;->e([JJZ)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    int-to-long p1, p1

    .line 16
    return-wide p1
.end method

.method public w(J)J
    .locals 0

    .line 1
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ls2/h;

    .line 4
    .line 5
    iget p1, p1, Ls2/h;->a:I

    .line 6
    .line 7
    int-to-long p1, p1

    .line 8
    return-wide p1
.end method

.method public x(LJ5/t;)V
    .locals 1

    .line 1
    new-instance v0, LO5/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LO5/c;-><init>(LA2/d;LJ5/t;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lf6/N;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lf6/N;->x(LJ5/t;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
