.class public final Lr9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/Q;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:LY2/B;

.field public c:I

.field public d:Ls9/o;

.field public e:J

.field public final f:Lr9/t;


# direct methods
.method public constructor <init>(Lr9/t;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr9/u;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, LY2/B;

    .line 12
    .line 13
    const/16 v1, 0x18

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v2, v1}, LY2/B;-><init>(BI)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lr9/u;->b:LY2/B;

    .line 20
    .line 21
    sget-object v0, Ls9/o;->b:Ls9/o;

    .line 22
    .line 23
    iput-object v0, p0, Lr9/u;->d:Ls9/o;

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    iput-wide v0, p0, Lr9/u;->e:J

    .line 28
    .line 29
    iput-object p1, p0, Lr9/u;->f:Lr9/t;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lc9/d;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/u;->b:LY2/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    check-cast v2, LA7/v;

    .line 12
    .line 13
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/Iterator;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ls9/h;

    .line 28
    .line 29
    new-instance v3, Lr9/c;

    .line 30
    .line 31
    invoke-direct {v3, v2, p2}, Lr9/c;-><init>(Ls9/h;I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, LY2/B;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lc9/d;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, LY2/B;->b:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lc9/d;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p2, p0, Lr9/u;->f:Lr9/t;

    .line 56
    .line 57
    iget-object p2, p2, Lr9/t;->k:Lr9/z;

    .line 58
    .line 59
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_1
    move-object v0, p1

    .line 64
    check-cast v0, LA7/v;

    .line 65
    .line 66
    iget-object v1, v0, LA7/v;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/Iterator;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ls9/h;

    .line 81
    .line 82
    invoke-interface {p2, v0}, Lr9/z;->g(Ls9/h;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    return-void
.end method

.method public final b(Lr9/S;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr9/u;->f(Lr9/S;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c(Lc9/d;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/u;->b:LY2/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    check-cast v2, LA7/v;

    .line 12
    .line 13
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/Iterator;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ls9/h;

    .line 28
    .line 29
    new-instance v3, Lr9/c;

    .line 30
    .line 31
    invoke-direct {v3, v2, p2}, Lr9/c;-><init>(Ls9/h;I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, LY2/B;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lc9/d;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, v0, LY2/B;->b:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lc9/d;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p2, p0, Lr9/u;->f:Lr9/t;

    .line 56
    .line 57
    iget-object p2, p2, Lr9/t;->k:Lr9/z;

    .line 58
    .line 59
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :goto_1
    move-object v0, p1

    .line 64
    check-cast v0, LA7/v;

    .line 65
    .line 66
    iget-object v1, v0, LA7/v;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/Iterator;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ls9/h;

    .line 81
    .line 82
    invoke-interface {p2, v0}, Lr9/z;->a(Ls9/h;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    return-void
.end method

.method public final d(Lp9/A;)Lr9/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/u;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lr9/S;

    .line 8
    .line 9
    return-object p1
.end method

.method public final e(Ls9/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr9/u;->d:Ls9/o;

    .line 2
    .line 3
    return-void
.end method

.method public final f(Lr9/S;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/u;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lr9/S;->a:Lp9/A;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lr9/u;->c:I

    .line 9
    .line 10
    iget v1, p1, Lr9/S;->b:I

    .line 11
    .line 12
    if-le v1, v0, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lr9/u;->c:I

    .line 15
    .line 16
    :cond_0
    iget-wide v0, p0, Lr9/u;->e:J

    .line 17
    .line 18
    iget-wide v2, p1, Lr9/S;->c:J

    .line 19
    .line 20
    cmp-long p1, v2, v0

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    iput-wide v2, p0, Lr9/u;->e:J

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lr9/u;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(I)Lc9/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/u;->b:LY2/B;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY2/B;->z(I)Lc9/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i()Ls9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/u;->d:Ls9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/u;->b:LY2/B;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY2/B;->C(I)Lc9/d;

    .line 4
    .line 5
    .line 6
    return-void
.end method
