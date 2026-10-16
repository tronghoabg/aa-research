.class public final Lg2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg2/q;

.field public final b:Lo2/m;

.field public final c:Lk2/c0;

.field public d:Z

.field public e:Z

.field public final synthetic f:Lg2/s;


# direct methods
.method public constructor <init>(Lg2/s;Lg2/w;ILg2/d;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/r;->f:Lg2/s;

    .line 5
    .line 6
    new-instance v0, Lo2/m;

    .line 7
    .line 8
    const-string v1, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "

    .line 9
    .line 10
    invoke-static {p3, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lg2/r;->b:Lo2/m;

    .line 18
    .line 19
    iget-object v0, p1, Lg2/s;->a:Lo2/e;

    .line 20
    .line 21
    new-instance v5, Lk2/c0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v5, v0, v1, v1}, Lk2/c0;-><init>(Lo2/e;LZ1/g;LZ1/d;)V

    .line 25
    .line 26
    .line 27
    iput-object v5, p0, Lg2/r;->c:Lk2/c0;

    .line 28
    .line 29
    new-instance v1, Lg2/q;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    move-object v3, p2

    .line 33
    move v4, p3

    .line 34
    move-object v6, p4

    .line 35
    invoke-direct/range {v1 .. v6}, Lg2/q;-><init>(Lg2/s;Lg2/w;ILk2/c0;Lg2/d;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lg2/r;->a:Lg2/q;

    .line 39
    .line 40
    iget-object p1, v2, Lg2/s;->c:Lac/a;

    .line 41
    .line 42
    iput-object p1, v5, Lk2/c0;->f:Lk2/b0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg2/r;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg2/r;->a:Lg2/q;

    .line 6
    .line 7
    iget-object v0, v0, Lg2/q;->b:Lg2/f;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lg2/f;->j:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Lg2/r;->d:Z

    .line 13
    .line 14
    iget-object v0, p0, Lg2/r;->f:Lg2/s;

    .line 15
    .line 16
    invoke-static {v0}, Lg2/s;->a(Lg2/s;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
