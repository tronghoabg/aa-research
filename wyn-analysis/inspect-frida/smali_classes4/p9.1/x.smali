.class public final Lp9/x;
.super Lp9/s;
.source "SourceFile"


# virtual methods
.method public final a(Lme/a;)Lr9/P;
    .locals 3

    .line 1
    iget-object v0, p0, Lp9/s;->c:Lp7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "persistence not initialized yet"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    check-cast v0, Lr9/K;

    .line 12
    .line 13
    iget-object v0, v0, Lr9/K;->j:LA7/c0;

    .line 14
    .line 15
    iget-object v0, v0, LA7/c0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lr9/q;

    .line 18
    .line 19
    invoke-virtual {p0}, Lp9/s;->d()Lr9/l;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, LM/y;

    .line 27
    .line 28
    iget-object p1, p1, Lme/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lw9/e;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, v2, LM/y;->e:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, v2, LM/y;->a:Z

    .line 39
    .line 40
    iput-object p1, v2, LM/y;->b:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, v2, LM/y;->c:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v2
.end method

.method public final b(Lme/a;)Lr9/e;
    .locals 4

    .line 1
    new-instance v0, Lr9/e;

    .line 2
    .line 3
    iget-object v1, p0, Lp9/s;->c:Lp7/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "persistence not initialized yet"

    .line 9
    .line 10
    invoke-static {v1, v3, v2}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lp9/s;->d()Lr9/l;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object p1, p1, Lme/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lw9/e;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1, v2}, Lr9/e;-><init>(Lp7/b;Lw9/e;Lr9/l;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final c(Lme/a;)Lp7/b;
    .locals 6

    .line 1
    new-instance v4, La2/v;

    .line 2
    .line 3
    iget-object v0, p0, Lp9/s;->b:LC8/i;

    .line 4
    .line 5
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv9/o;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v2, "remoteSerializer not initialized yet"

    .line 13
    .line 14
    invoke-static {v0, v2, v1}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x17

    .line 18
    .line 19
    invoke-direct {v4, v0, v1}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lp9/s;->a:Lm9/H;

    .line 23
    .line 24
    iget-object v1, v0, Lm9/H;->e:Lm9/P;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    instance-of v0, v1, Lm9/T;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    check-cast v1, Lm9/T;

    .line 33
    .line 34
    iget-wide v0, v1, Lm9/T;->a:J

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    check-cast v1, Lm9/Q;

    .line 38
    .line 39
    const-wide/16 v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-wide v0, v0, Lm9/H;->d:J

    .line 43
    .line 44
    :goto_0
    new-instance v5, LJ5/n;

    .line 45
    .line 46
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-wide v0, v5, LJ5/n;->a:J

    .line 50
    .line 51
    new-instance v0, Lr9/K;

    .line 52
    .line 53
    iget-object v1, p1, Lme/a;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, LA7/b0;

    .line 56
    .line 57
    iget-object v2, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v3, v2

    .line 60
    check-cast v3, Ls9/f;

    .line 61
    .line 62
    iget-object p1, p1, Lme/a;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Landroid/content/Context;

    .line 65
    .line 66
    iget-object v1, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v2, v1

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    move-object v1, p1

    .line 72
    invoke-direct/range {v0 .. v5}, Lr9/K;-><init>(Landroid/content/Context;Ljava/lang/String;Ls9/f;La2/v;LJ5/n;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
