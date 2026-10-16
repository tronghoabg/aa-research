.class public final Lvd/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lvd/m;

.field public volatile b:Lt6/q;

.field public c:Lt6/q;

.field public d:Ljava/lang/Long;

.field public e:I

.field public final f:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lvd/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt6/q;

    .line 5
    .line 6
    invoke-direct {v0}, Lt6/q;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lvd/k;->b:Lt6/q;

    .line 10
    .line 11
    new-instance v0, Lt6/q;

    .line 12
    .line 13
    invoke-direct {v0}, Lt6/q;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lvd/k;->c:Lt6/q;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lvd/k;->f:Ljava/util/HashSet;

    .line 24
    .line 25
    iput-object p1, p0, Lvd/k;->a:Lvd/m;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lvd/q;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lvd/k;->d()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p1, Lvd/q;->f:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lvd/q;->t()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lvd/k;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p1, Lvd/q;->f:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iput-boolean v0, p1, Lvd/q;->f:Z

    .line 27
    .line 28
    iget-object v1, p1, Lvd/q;->g:Lmd/n;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v2, p1, Lvd/q;->h:Lmd/N;

    .line 33
    .line 34
    invoke-interface {v2, v1}, Lmd/N;->a(Lmd/n;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object p1, v1, v0

    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    const-string v2, "Subchannel unejected: {0}"

    .line 44
    .line 45
    iget-object v3, p1, Lvd/q;->i:Lmd/e;

    .line 46
    .line 47
    invoke-virtual {v3, v0, v2, v1}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    iput-object p0, p1, Lvd/q;->e:Lvd/k;

    .line 51
    .line 52
    iget-object v0, p0, Lvd/k;->f:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lvd/k;->d:Ljava/lang/Long;

    .line 6
    .line 7
    iget p1, p0, Lvd/k;->e:I

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Lvd/k;->e:I

    .line 12
    .line 13
    iget-object p1, p0, Lvd/k;->f:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lvd/q;

    .line 30
    .line 31
    invoke-virtual {p2}, Lvd/q;->t()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public final c()J
    .locals 4

    .line 1
    iget-object v0, p0, Lvd/k;->c:Lt6/q;

    .line 2
    .line 3
    iget-object v0, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Lvd/k;->c:Lt6/q;

    .line 12
    .line 13
    iget-object v2, v2, Lt6/q;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    add-long/2addr v2, v0

    .line 22
    return-wide v2
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/k;->d:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final e()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lvd/k;->d:Ljava/lang/Long;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move v1, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v2

    .line 10
    :goto_0
    const-string v3, "not currently ejected"

    .line 11
    .line 12
    invoke-static {v3, v1}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lvd/k;->d:Ljava/lang/Long;

    .line 17
    .line 18
    iget-object v1, p0, Lvd/k;->f:Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lvd/q;

    .line 35
    .line 36
    iput-boolean v2, v3, Lvd/q;->f:Z

    .line 37
    .line 38
    iget-object v4, v3, Lvd/q;->g:Lmd/n;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    iget-object v5, v3, Lvd/q;->h:Lmd/N;

    .line 43
    .line 44
    invoke-interface {v5, v4}, Lmd/N;->a(Lmd/n;)V

    .line 45
    .line 46
    .line 47
    new-array v4, v0, [Ljava/lang/Object;

    .line 48
    .line 49
    aput-object v3, v4, v2

    .line 50
    .line 51
    const/4 v5, 0x2

    .line 52
    const-string v6, "Subchannel unejected: {0}"

    .line 53
    .line 54
    iget-object v3, v3, Lvd/q;->i:Lmd/e;

    .line 55
    .line 56
    invoke-virtual {v3, v5, v6, v4}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AddressTracker{subchannels="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lvd/k;->f:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
