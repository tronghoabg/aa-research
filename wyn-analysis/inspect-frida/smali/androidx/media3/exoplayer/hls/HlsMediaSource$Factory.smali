.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:La2/c;

.field public b:La2/d;

.field public c:Lwa/a;

.field public d:Z

.field public final e:Landroidx/fragment/app/X;

.field public final f:LV1/c;

.field public final g:La9/b;

.field public final h:LMf/d;

.field public final i:Lae/d;

.field public final j:Z

.field public final k:I

.field public final l:J


# direct methods
.method public constructor <init>(LS1/g;)V
    .locals 2

    .line 1
    new-instance v0, La2/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:La2/c;

    .line 11
    .line 12
    new-instance p1, LMf/d;

    .line 13
    .line 14
    invoke-direct {p1}, LMf/d;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:LMf/d;

    .line 18
    .line 19
    new-instance p1, Landroidx/fragment/app/X;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Landroidx/fragment/app/X;

    .line 26
    .line 27
    sget-object p1, Lb2/c;->o:LV1/c;

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:LV1/c;

    .line 30
    .line 31
    new-instance p1, Lae/d;

    .line 32
    .line 33
    const/16 v0, 0xa

    .line 34
    .line 35
    invoke-direct {p1, v0}, Lae/d;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:Lae/d;

    .line 39
    .line 40
    new-instance p1, La9/b;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:La9/b;

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:I

    .line 49
    .line 50
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:J

    .line 56
    .line 57
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Z

    .line 58
    .line 59
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lwa/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Z)Lk2/G;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic c(LN1/w;)Lk2/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d(LN1/w;)La2/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d(LN1/w;)La2/n;
    .locals 14

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La2/d;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La2/d;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lwa/a;

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lwa/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, La2/d;->a:Lwa/a;

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La2/d;

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lwa/a;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La2/d;

    .line 31
    .line 32
    iput-object v0, v1, La2/d;->a:Lwa/a;

    .line 33
    .line 34
    :cond_1
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:La2/d;

    .line 35
    .line 36
    iget-boolean v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Z

    .line 37
    .line 38
    iput-boolean v0, v5, La2/d;->b:Z

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Landroidx/fragment/app/X;

    .line 41
    .line 42
    iget-object v1, p1, LN1/w;->b:LN1/t;

    .line 43
    .line 44
    iget-object v1, v1, LN1/t;->c:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    new-instance v2, LX2/j;

    .line 53
    .line 54
    const/4 v3, 0x6

    .line 55
    invoke-direct {v2, v3, v0, v1}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :cond_2
    new-instance v2, La2/n;

    .line 60
    .line 61
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:LMf/d;

    .line 62
    .line 63
    invoke-virtual {v1, p1}, LMf/d;->b(LN1/w;)LZ1/g;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:Lae/d;

    .line 68
    .line 69
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:LV1/c;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v9, Lb2/c;

    .line 75
    .line 76
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:La2/c;

    .line 77
    .line 78
    invoke-direct {v9, v4, v8, v0}, Lb2/c;-><init>(La2/c;Lae/d;Lb2/p;)V

    .line 79
    .line 80
    .line 81
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:La9/b;

    .line 82
    .line 83
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->l:J

    .line 84
    .line 85
    iget-boolean v12, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:Z

    .line 86
    .line 87
    iget v13, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->k:I

    .line 88
    .line 89
    move-object v3, p1

    .line 90
    invoke-direct/range {v2 .. v13}, La2/n;-><init>(LN1/w;La2/c;La2/d;La9/b;LZ1/g;Lae/d;Lb2/c;JZI)V

    .line 91
    .line 92
    .line 93
    return-object v2
.end method
