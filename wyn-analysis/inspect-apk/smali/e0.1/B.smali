.class public final Le0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/b;


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:J

.field public f:J

.field public g:F

.field public h:J

.field public i:Le0/E;

.field public j:Z

.field public k:LL0/b;


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Le0/B;->k:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LL0/b;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Le0/B;->k:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
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
    iget-object v0, p0, Le0/B;->k:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LL0/b;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method

.method public final synthetic y(J)J
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, LA7/p0;->c(JLL0/b;)J

    move-result-wide p1

    return-wide p1
.end method
