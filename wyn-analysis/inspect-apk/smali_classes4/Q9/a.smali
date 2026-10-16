.class public final LQ9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LQ9/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Lod/o1;Lmd/n0;Lg2/k;Lod/K0;Lod/k;Lod/D0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LQ9/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, LQ9/a;->b:I

    .line 4
    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQ9/a;->c:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, LQ9/a;->d:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, LQ9/a;->e:Ljava/lang/Object;

    .line 7
    iput-object p5, p0, LQ9/a;->f:Ljava/lang/Object;

    .line 8
    iput-object p6, p0, LQ9/a;->g:Ljava/lang/Object;

    .line 9
    iput-object p7, p0, LQ9/a;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LQ9/b;
    .locals 12

    .line 1
    iget v0, p0, LQ9/a;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, " registrationStatus"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, ""

    .line 9
    .line 10
    :goto_0
    iget-object v1, p0, LQ9/a;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Long;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const-string v1, " expiresInSecs"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    iget-object v1, p0, LQ9/a;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Long;

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    const-string v1, " tokenCreationEpochInSecs"

    .line 29
    .line 30
    invoke-static {v0, v1}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    new-instance v2, LQ9/b;

    .line 41
    .line 42
    iget-object v0, p0, LQ9/a;->c:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    iget v4, p0, LQ9/a;->b:I

    .line 48
    .line 49
    iget-object v0, p0, LQ9/a;->d:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    check-cast v5, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, p0, LQ9/a;->e:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v6, v0

    .line 57
    check-cast v6, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v0, p0, LQ9/a;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    iget-object v0, p0, LQ9/a;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v0, p0, LQ9/a;->f:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v11, v0

    .line 78
    check-cast v11, Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct/range {v2 .. v11}, LQ9/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v2, "Missing required properties:"

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LQ9/a;->a:I

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
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, LQ9/a;->b:I

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "defaultPort"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, LA7/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "proxyDetector"

    .line 27
    .line 28
    iget-object v2, p0, LQ9/a;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lod/o1;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "syncContext"

    .line 36
    .line 37
    iget-object v2, p0, LQ9/a;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lmd/n0;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "serviceConfigParser"

    .line 45
    .line 46
    iget-object v2, p0, LQ9/a;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lg2/k;

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, "scheduledExecutorService"

    .line 54
    .line 55
    iget-object v2, p0, LQ9/a;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lod/K0;

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "channelLogger"

    .line 63
    .line 64
    iget-object v2, p0, LQ9/a;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lod/k;

    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "executor"

    .line 72
    .line 73
    iget-object v2, p0, LQ9/a;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lod/D0;

    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "overrideAuthority"

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
