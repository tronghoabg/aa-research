.class public final Lzg/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/c;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lzg/c;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lzg/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/l;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lzg/l;->b:Lzg/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/l;->b:Lzg/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lzg/c;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/l;->clone()Lzg/c;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Lzg/c;
    .locals 3

    .line 2
    new-instance v0, Lzg/l;

    iget-object v1, p0, Lzg/l;->b:Lzg/c;

    invoke-interface {v1}, Lzg/c;->clone()Lzg/c;

    move-result-object v1

    iget-object v2, p0, Lzg/l;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v1}, Lzg/l;-><init>(Ljava/util/concurrent/Executor;Lzg/c;)V

    return-object v0
.end method

.method public final i(Lzg/f;)V
    .locals 1

    .line 1
    new-instance v0, Lzg/k;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lzg/k;-><init>(Lzg/l;Lzg/f;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lzg/l;->b:Lzg/c;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lzg/c;->i(Lzg/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/l;->b:Lzg/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lzg/c;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final request()Lokhttp3/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/l;->b:Lzg/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lzg/c;->request()Lokhttp3/Request;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
