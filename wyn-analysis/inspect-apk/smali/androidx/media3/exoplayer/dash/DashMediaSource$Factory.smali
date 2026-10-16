.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:LE4/n;

.field public final b:LS1/g;

.field public final c:LMf/d;

.field public final d:La9/b;

.field public final e:Lae/d;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(LS1/g;)V
    .locals 3

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LE4/n;-><init>(LS1/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LE4/n;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:LS1/g;

    .line 12
    .line 13
    new-instance p1, LMf/d;

    .line 14
    .line 15
    invoke-direct {p1}, LMf/d;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:LMf/d;

    .line 19
    .line 20
    new-instance p1, Lae/d;

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-direct {p1, v1}, Lae/d;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Lae/d;

    .line 28
    .line 29
    const-wide/16 v1, 0x7530

    .line 30
    .line 31
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 32
    .line 33
    const-wide/32 v1, 0x4c4b40

    .line 34
    .line 35
    .line 36
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 37
    .line 38
    new-instance p1, La9/b;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:La9/b;

    .line 44
    .line 45
    iget-object p1, v0, LE4/n;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LE4/F;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p1, LE4/F;->b:Z

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LE4/n;

    .line 2
    .line 3
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LE4/F;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LE4/F;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-object p0
.end method

.method public final b(Z)Lk2/G;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LE4/n;

    .line 2
    .line 3
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LE4/F;

    .line 6
    .line 7
    iput-boolean p1, v0, LE4/F;->b:Z

    .line 8
    .line 9
    return-object p0
.end method

.method public final bridge synthetic c(LN1/w;)Lk2/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d(LN1/w;)LX1/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d(LN1/w;)LX1/f;
    .locals 12

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, LY1/e;

    .line 7
    .line 8
    invoke-direct {v0}, LY1/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, LN1/w;->b:LN1/t;

    .line 12
    .line 13
    iget-object v2, v2, LN1/t;->c:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    new-instance v3, LY2/B;

    .line 22
    .line 23
    const/16 v4, 0xd

    .line 24
    .line 25
    invoke-direct {v3, v4, v0, v2}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v0

    .line 30
    :goto_0
    new-instance v0, LX1/f;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:LMf/d;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, LMf/d;->b(LN1/w;)LZ1/g;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Lae/d;

    .line 39
    .line 40
    iget-wide v10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 41
    .line 42
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:La9/b;

    .line 43
    .line 44
    iget-wide v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 45
    .line 46
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:LS1/g;

    .line 47
    .line 48
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:LE4/n;

    .line 49
    .line 50
    move-object v1, p1

    .line 51
    invoke-direct/range {v0 .. v11}, LX1/f;-><init>(LN1/w;LS1/g;Lo2/o;LE4/n;La9/b;LZ1/g;Lae/d;JJ)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method
