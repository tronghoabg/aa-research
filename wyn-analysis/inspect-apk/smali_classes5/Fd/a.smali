.class public final LFd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFd/b;


# instance fields
.field public final a:Lxd/c;

.field public final b:LJd/s;

.field public final c:LJd/H;

.field public final d:LJd/o;

.field public final e:LNd/d;


# direct methods
.method public constructor <init>(Lxd/c;LFd/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFd/a;->a:Lxd/c;

    .line 5
    .line 6
    iget-object p1, p2, LFd/d;->b:LJd/s;

    .line 7
    .line 8
    iput-object p1, p0, LFd/a;->b:LJd/s;

    .line 9
    .line 10
    iget-object p1, p2, LFd/d;->a:LJd/H;

    .line 11
    .line 12
    iput-object p1, p0, LFd/a;->c:LJd/H;

    .line 13
    .line 14
    iget-object p1, p2, LFd/d;->c:LJd/o;

    .line 15
    .line 16
    iput-object p1, p0, LFd/a;->d:LJd/o;

    .line 17
    .line 18
    iget-object p1, p2, LFd/d;->f:LNd/d;

    .line 19
    .line 20
    iput-object p1, p0, LFd/a;->e:LNd/d;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()LJd/m;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/a;->d:LJd/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LNd/d;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/a;->e:LNd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/a;->a:Lxd/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxd/c;->getCoroutineContext()Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getUrl()LJd/H;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/a;->c:LJd/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LJd/s;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/a;->b:LJd/s;

    .line 2
    .line 3
    return-object v0
.end method
