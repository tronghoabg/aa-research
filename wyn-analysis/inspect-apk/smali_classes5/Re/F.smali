.class public final LRe/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/j;
.implements Lug/b;


# instance fields
.field public final a:LHe/f;

.field public b:LJe/b;


# direct methods
.method public constructor <init>(LHe/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/F;->a:LHe/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LRe/F;->b:LJe/b;

    .line 2
    .line 3
    iget-object p1, p0, LRe/F;->a:LHe/f;

    .line 4
    .line 5
    invoke-interface {p1, p0}, LHe/f;->e(Lug/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/F;->a:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/F;->b:LJe/b;

    .line 2
    .line 3
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/F;->a:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/F;->a:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final request(J)V
    .locals 0

    .line 1
    return-void
.end method
