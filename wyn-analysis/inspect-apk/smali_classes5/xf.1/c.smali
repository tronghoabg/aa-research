.class public final Lxf/c;
.super Lxf/d;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    sget-object v0, Lxf/d;->a:Lxf/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxf/a;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()I
    .locals 1

    .line 1
    sget-object v0, Lxf/d;->a:Lxf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxf/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final d()J
    .locals 2

    .line 1
    sget-object v0, Lxf/d;->a:Lxf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxf/a;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final e(J)J
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f(JJ)J
    .locals 2

    .line 1
    sget-object p1, Lxf/d;->a:Lxf/a;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1, p3, p4}, Lxf/d;->f(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method
