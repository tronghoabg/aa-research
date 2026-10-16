.class public final LA7/r;
.super LA7/B;
.source "SourceFile"


# instance fields
.field public final b:Lx/e;

.field public final c:Lx/e;

.field public d:J


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/B0;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lx/e;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lx/v;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LA7/r;->c:Lx/e;

    .line 11
    .line 12
    new-instance p1, Lx/e;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lx/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LA7/r;->b:Lx/e;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final h0(J)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LA7/B;->f0()LA7/i1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LA7/i1;->k0(Z)LA7/j1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LA7/r;->b:Lx/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lx/e;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lx/b;

    .line 17
    .line 18
    invoke-virtual {v2}, Lx/b;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    sub-long v4, p1, v4

    .line 45
    .line 46
    invoke-virtual {p0, v3, v4, v5, v0}, LA7/r;->k0(Ljava/lang/String;JLA7/j1;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v1}, Lx/v;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iget-wide v1, p0, LA7/r;->d:J

    .line 57
    .line 58
    sub-long v1, p1, v1

    .line 59
    .line 60
    invoke-virtual {p0, v1, v2, v0}, LA7/r;->i0(JLA7/j1;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0, p1, p2}, LA7/r;->l0(J)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final i0(JLA7/j1;)V
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "Not logging ad exposure. No active activity"

    .line 8
    .line 9
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-wide/16 v0, 0x3e8

    .line 16
    .line 17
    cmp-long v0, p1, v0

    .line 18
    .line 19
    if-gez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p2, p3, LA7/N;->n:LA7/P;

    .line 30
    .line 31
    const-string p3, "Not logging ad exposure. Less than 1000 ms. exposure"

    .line 32
    .line 33
    invoke-virtual {p2, p3, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "_xt"

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-static {p3, v0, p1}, LA7/U1;->u0(LA7/j1;Landroid/os/Bundle;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, LA7/B;->e0()LA7/P0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "am"

    .line 56
    .line 57
    const-string p3, "_xa"

    .line 58
    .line 59
    invoke-virtual {p1, p2, p3, v0}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final j0(Ljava/lang/String;J)V
    .locals 7

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LA7/b;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v2, p0

    .line 18
    move-object v3, p1

    .line 19
    move-wide v4, p2

    .line 20
    invoke-direct/range {v1 .. v6}, LA7/b;-><init>(LA7/r;Ljava/lang/String;JI)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "Ad unit id must be a non-empty string"

    .line 32
    .line 33
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final k0(Ljava/lang/String;JLA7/j1;)V
    .locals 2

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "Not logging ad unit exposure. No active activity"

    .line 8
    .line 9
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-wide/16 v0, 0x3e8

    .line 16
    .line 17
    cmp-long v0, p2, v0

    .line 18
    .line 19
    if-gez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 30
    .line 31
    const-string p3, "Not logging ad unit exposure. Less than 1000 ms. exposure"

    .line 32
    .line 33
    invoke-virtual {p1, p3, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "_ai"

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p1, "_xt"

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    invoke-static {p4, v0, p1}, LA7/U1;->u0(LA7/j1;Landroid/os/Bundle;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, LA7/B;->e0()LA7/P0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "am"

    .line 61
    .line 62
    const-string p3, "_xu"

    .line 63
    .line 64
    invoke-virtual {p1, p2, p3, v0}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final l0(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/r;->b:Lx/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx/e;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lx/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lx/b;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v2, v3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Lx/v;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iput-wide p1, p0, LA7/r;->d:J

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final m0(JLjava/lang/String;)V
    .locals 7

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LA7/b;

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    move-object v2, p0

    .line 18
    move-wide v4, p1

    .line 19
    move-object v3, p3

    .line 20
    invoke-direct/range {v1 .. v6}, LA7/b;-><init>(LA7/r;Ljava/lang/String;JI)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "Ad unit id must be a non-empty string"

    .line 32
    .line 33
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
