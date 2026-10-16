.class public abstract Lhd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/H;


# instance fields
.field public a:Z

.field public b:Z

.field public final c:LU1/m;

.field public final d:Lad/L;


# direct methods
.method public constructor <init>(LU1/m;Lad/L;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lhd/a;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lhd/a;->b:Z

    .line 8
    .line 9
    iput-object p1, p0, Lhd/a;->c:LU1/m;

    .line 10
    .line 11
    iput-object p2, p0, Lhd/a;->d:Lad/L;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final synthetic A(LN1/F;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final C(LN1/E;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lhd/a;->r(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p1, LN1/E;->a:I

    .line 6
    .line 7
    const/16 v2, 0x3ea

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lhd/a;->c:LU1/m;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    check-cast v1, LA7/B0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, LU1/u;

    .line 21
    .line 22
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v3, v4, v2, v0}, LA7/B0;->O(JIZ)V

    .line 32
    .line 33
    .line 34
    check-cast p1, LU1/u;

    .line 35
    .line 36
    invoke-virtual {p1}, LU1/u;->z0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "Video player had error "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v0, p0, Lhd/a;->d:Lad/L;

    .line 55
    .line 56
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lhd/n;

    .line 59
    .line 60
    const-string v1, "VideoError"

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v3, Lhd/m;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v1, v3, Lhd/m;->a:Ljava/lang/String;

    .line 72
    .line 73
    iput-object p1, v3, Lhd/m;->b:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v2, v3, Lhd/m;->c:Ljava/util/HashMap;

    .line 76
    .line 77
    iget-boolean p1, v0, Lhd/n;->c:Z

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object p1, v0, Lhd/n;->b:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-virtual {v0}, Lhd/n;->b()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final synthetic E(LN1/G;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic F(LN1/V;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lhd/a;->d:Lad/L;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "event"

    .line 5
    .line 6
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lhd/n;

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq p1, v3, :cond_2

    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    if-eq p1, v4, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq p1, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v4, "completed"

    .line 26
    .line 27
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-boolean v0, p0, Lhd/a;->b:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iput-boolean v1, p0, Lhd/a;->b:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Lhd/a;->q()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p0, v1}, Lhd/a;->r(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lhd/a;->c:LU1/m;

    .line 48
    .line 49
    check-cast v1, LU1/u;

    .line 50
    .line 51
    invoke-virtual {v1}, LU1/u;->h0()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    const-string v1, "bufferingUpdate"

    .line 56
    .line 57
    invoke-static {v2, v1}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v4, "position"

    .line 66
    .line 67
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    if-eq p1, v3, :cond_4

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1}, Lhd/a;->r(Z)V

    .line 77
    .line 78
    .line 79
    :cond_4
    return-void
.end method

.method public final synthetic c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic e(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic g(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic h(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic i(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic j(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic k(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic l(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhd/a;->d:Lad/L;

    .line 2
    .line 3
    const-string v1, "event"

    .line 4
    .line 5
    const-string v2, "isPlayingStateUpdate"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v2, "isPlaying"

    .line 16
    .line 17
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lad/L;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lhd/n;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final synthetic n(Ln2/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic o(LN1/B;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic p(LN1/Y;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract q()V
.end method

.method public final r(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lhd/a;->a:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lhd/a;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lhd/a;->d:Lad/L;

    .line 9
    .line 10
    const-string v1, "event"

    .line 11
    .line 12
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lhd/n;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    new-instance p1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "bufferingStart"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "bufferingEnd"

    .line 38
    .line 39
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final synthetic t(LN1/I;LN1/I;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic u(LP1/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic v(LN1/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic w(LN1/z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic x(LN1/E;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic z(LN1/w;I)V
    .locals 0

    .line 1
    return-void
.end method
