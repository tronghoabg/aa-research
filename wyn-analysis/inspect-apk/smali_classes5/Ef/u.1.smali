.class public final LEf/u;
.super LEf/z0;
.source "SourceFile"

# interfaces
.implements LEf/t;


# virtual methods
.method public final Y(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    new-instance v0, LEf/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, LEf/x;-><init>(ZLjava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final await(Ljf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    return-object p1
.end method
