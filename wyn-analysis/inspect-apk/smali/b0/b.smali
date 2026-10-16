.class public final Lb0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/b;


# instance fields
.field public a:Lb0/a;

.field public b:LA/e0;


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/b;->a:Lb0/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lb0/a;->b()LL0/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LL0/b;->b()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/b;->a:Lb0/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lb0/a;->b()LL0/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final synthetic j(F)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LA7/p0;->a(LL0/b;F)I

    move-result p1

    return p1
.end method

.method public final synthetic l(J)F
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, LA7/p0;->b(JLL0/b;)F

    move-result p1

    return p1
.end method

.method public final t(F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb0/b;->b()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    return v0
.end method

.method public final synthetic y(J)J
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, LA7/p0;->c(JLL0/b;)J

    move-result-wide p1

    return-wide p1
.end method
