.class public final LH0/d;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field public a:LK0/d;

.field public b:Le0/D;


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    sget v0, Le0/q;->j:I

    .line 2
    .line 3
    sget-wide v0, Le0/q;->i:J

    .line 4
    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1, p2}, Le0/z;->s(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eq p2, p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b(Le0/D;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Le0/D;->d:Le0/D;

    .line 4
    .line 5
    sget-object p1, Le0/D;->d:Le0/D;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LH0/d;->b:Le0/D;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iput-object p1, p0, LH0/d;->b:Le0/D;

    .line 16
    .line 17
    sget-object v0, Le0/D;->d:Le0/D;

    .line 18
    .line 19
    sget-object v0, Le0/D;->d:Le0/D;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p1, p0, LH0/d;->b:Le0/D;

    .line 32
    .line 33
    iget v0, p1, Le0/D;->c:F

    .line 34
    .line 35
    iget-wide v1, p1, Le0/D;->b:J

    .line 36
    .line 37
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object v1, p0, LH0/d;->b:Le0/D;

    .line 42
    .line 43
    iget-wide v1, v1, Le0/D;->b:J

    .line 44
    .line 45
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v2, p0, LH0/d;->b:Le0/D;

    .line 50
    .line 51
    iget-wide v2, v2, Le0/D;->a:J

    .line 52
    .line 53
    invoke-static {v2, v3}, Le0/z;->s(J)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final c(LK0/d;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LK0/d;->b:LK0/d;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, LH0/d;->a:LK0/d;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    iput-object p1, p0, LH0/d;->a:LK0/d;

    .line 14
    .line 15
    iget p1, p1, LK0/d;->a:I

    .line 16
    .line 17
    or-int/lit8 v0, p1, 0x1

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v0, p1, :cond_1

    .line 22
    .line 23
    move p1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move p1, v1

    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LH0/d;->a:LK0/d;

    .line 30
    .line 31
    iget p1, p1, LK0/d;->a:I

    .line 32
    .line 33
    or-int/lit8 v0, p1, 0x2

    .line 34
    .line 35
    if-ne v0, p1, :cond_2

    .line 36
    .line 37
    move v1, v2

    .line 38
    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method
