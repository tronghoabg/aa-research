.class public final LCd/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFd/b;


# instance fields
.field public final a:LJd/s;

.field public final b:LJd/H;

.field public final c:LNd/d;

.field public final d:LJd/o;


# direct methods
.method public constructor <init>(LFd/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LFd/c;->b:LJd/s;

    .line 5
    .line 6
    iput-object v0, p0, LCd/E;->a:LJd/s;

    .line 7
    .line 8
    iget-object v0, p1, LFd/c;->a:LJd/B;

    .line 9
    .line 10
    invoke-virtual {v0}, LJd/B;->b()LJd/H;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LCd/E;->b:LJd/H;

    .line 15
    .line 16
    iget-object v0, p1, LFd/c;->f:LNd/d;

    .line 17
    .line 18
    iput-object v0, p0, LCd/E;->c:LNd/d;

    .line 19
    .line 20
    new-instance v0, LJd/o;

    .line 21
    .line 22
    iget-object p1, p1, LFd/c;->c:LJd/n;

    .line 23
    .line 24
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {v0, p1}, LJd/o;-><init>(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LCd/E;->d:LJd/o;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()LJd/m;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/E;->d:LJd/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LNd/d;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/E;->c:LNd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCoroutineContext()Ljf/h;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Call is not initialized"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final getUrl()LJd/H;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/E;->b:LJd/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LJd/s;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/E;->a:LJd/s;

    .line 2
    .line 3
    return-object v0
.end method
