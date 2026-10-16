.class public final Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:LE5/b;

.field public final b:LS1/g;

.field public final c:La9/b;

.field public final d:LMf/d;

.field public final e:Lae/d;

.field public final f:J


# direct methods
.method public constructor <init>(LS1/g;)V
    .locals 3

    .line 1
    new-instance v0, LE5/b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LE5/b;-><init>(LS1/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:LE5/b;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->b:LS1/g;

    .line 12
    .line 13
    new-instance p1, LMf/d;

    .line 14
    .line 15
    invoke-direct {p1}, LMf/d;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->d:LMf/d;

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
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->e:Lae/d;

    .line 28
    .line 29
    const-wide/16 v1, 0x7530

    .line 30
    .line 31
    iput-wide v1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->f:J

    .line 32
    .line 33
    new-instance p1, La9/b;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->c:La9/b;

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, v0, LE5/b;->b:Z

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:LE5/b;

    .line 2
    .line 3
    iput-object p1, v0, LE5/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final b(Z)Lk2/G;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:LE5/b;

    .line 2
    .line 3
    iput-boolean p1, v0, LE5/b;->b:Z

    .line 4
    .line 5
    return-object p0
.end method

.method public final c(LN1/w;)Lk2/a;
    .locals 14

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lac/a;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lac/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, LN1/w;->b:LN1/t;

    .line 14
    .line 15
    iget-object v1, v1, LN1/t;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, LY2/B;

    .line 24
    .line 25
    const/16 v3, 0xd

    .line 26
    .line 27
    invoke-direct {v2, v3, v0, v1}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v7, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v7, v0

    .line 33
    :goto_0
    new-instance v4, Li2/c;

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->d:LMf/d;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, LMf/d;->b(LN1/w;)LZ1/g;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    iget-object v11, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->e:Lae/d;

    .line 42
    .line 43
    iget-object v9, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->c:La9/b;

    .line 44
    .line 45
    iget-object v8, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->a:LE5/b;

    .line 46
    .line 47
    iget-wide v12, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->f:J

    .line 48
    .line 49
    iget-object v6, p0, Landroidx/media3/exoplayer/smoothstreaming/SsMediaSource$Factory;->b:LS1/g;

    .line 50
    .line 51
    move-object v5, p1

    .line 52
    invoke-direct/range {v4 .. v13}, Li2/c;-><init>(LN1/w;LS1/g;Lo2/o;LE5/b;La9/b;LZ1/g;Lae/d;J)V

    .line 53
    .line 54
    .line 55
    return-object v4
.end method
