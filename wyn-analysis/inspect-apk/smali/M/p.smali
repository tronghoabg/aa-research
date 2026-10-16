.class public abstract LM/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LM/p;->a:F

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lg0/d;ZJ)F
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ld0/f;->d(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Ld0/f;->b(J)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-static {v0, p2}, LU8/v0;->f(FF)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    mul-float/2addr v1, v0

    .line 22
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    mul-float/2addr p2, v0

    .line 31
    add-float/2addr p2, v1

    .line 32
    float-to-double p2, p2

    .line 33
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide p2

    .line 37
    double-to-float p2, p2

    .line 38
    const/high16 p3, 0x40000000    # 2.0f

    .line 39
    .line 40
    div-float/2addr p2, p3

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    sget p1, LM/p;->a:F

    .line 44
    .line 45
    invoke-interface {p0, p1}, LL0/b;->t(F)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    add-float/2addr p0, p2

    .line 50
    return p0

    .line 51
    :cond_0
    return p2
.end method
