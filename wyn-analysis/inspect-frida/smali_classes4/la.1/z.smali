.class public abstract Lla/z;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a()Lla/y;
    .locals 1

    .line 1
    instance-of v0, p0, Lla/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lla/y;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lla/y;-><init>(Lla/z;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    move-object v0, p0

    .line 12
    check-cast v0, Lla/y;

    .line 13
    .line 14
    return-object v0
.end method

.method public abstract b(Lra/a;)Ljava/lang/Object;
.end method

.method public abstract c(Lra/b;Ljava/lang/Object;)V
.end method
