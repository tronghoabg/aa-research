.class public abstract LK/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE/F;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:LE/F;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    new-instance v2, LE/F;

    .line 8
    .line 9
    invoke-direct {v2, v0, v1, v0, v1}, LE/F;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v2, LK/a;->a:LE/F;

    .line 13
    .line 14
    const/16 v0, 0x40

    .line 15
    .line 16
    int-to-float v0, v0

    .line 17
    sput v0, LK/a;->b:F

    .line 18
    .line 19
    const/16 v0, 0x24

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    sput v0, LK/a;->c:F

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    int-to-float v0, v0

    .line 26
    sput v0, LK/a;->d:F

    .line 27
    .line 28
    new-instance v0, LE/F;

    .line 29
    .line 30
    invoke-direct {v0, v1, v1, v1, v1}, LE/F;-><init>(FFFF)V

    .line 31
    .line 32
    .line 33
    sput-object v0, LK/a;->e:LE/F;

    .line 34
    .line 35
    return-void
.end method

.method public static a(JJLN/o;II)LK/j;
    .locals 9

    .line 1
    const p5, 0x6f7b993e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, p5}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 p5, p6, 0x1

    .line 8
    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    sget-object p0, LK/g;->a:LN/L0;

    .line 12
    .line 13
    invoke-virtual {p4, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, LK/e;

    .line 18
    .line 19
    invoke-virtual {p0}, LK/e;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    :cond_0
    move-wide v1, p0

    .line 24
    and-int/lit8 p0, p6, 0x2

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {v1, v2, p4}, LK/g;->b(JLN/o;)J

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    :cond_1
    move-wide v3, p2

    .line 33
    sget-object p0, LK/g;->a:LN/L0;

    .line 34
    .line 35
    invoke-virtual {p4, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, LK/e;

    .line 40
    .line 41
    invoke-virtual {p1}, LK/e;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    const p3, 0x3df5c28f    # 0.12f

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2, p3}, Le0/q;->a(JF)J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    invoke-virtual {p4, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    check-cast p3, LK/e;

    .line 57
    .line 58
    invoke-virtual {p3}, LK/e;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide p5

    .line 62
    invoke-static {p1, p2, p5, p6}, Le0/z;->g(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    invoke-virtual {p4, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, LK/e;

    .line 71
    .line 72
    invoke-virtual {p0}, LK/e;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide p0

    .line 76
    invoke-static {p4}, LBa/c;->y(LN/o;)F

    .line 77
    .line 78
    .line 79
    const p2, 0x3ec28f5c    # 0.38f

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1, p2}, Le0/q;->a(JF)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    new-instance v0, LK/j;

    .line 87
    .line 88
    invoke-direct/range {v0 .. v8}, LK/j;-><init>(JJJJ)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    invoke-virtual {p4, p0}, LN/o;->p(Z)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method
