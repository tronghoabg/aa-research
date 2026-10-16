.class public abstract LM/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LA/Z;

    .line 2
    .line 3
    sget-object v1, LA/s;->a:LA/s;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v1, v3}, LA/Z;-><init>(ILA/r;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LM/s;->a:LA/Z;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(LN/o;II)LM/e;
    .locals 3

    .line 1
    const p1, 0x61769d80

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    sget-wide p1, Le0/q;->i:J

    .line 8
    .line 9
    new-instance v0, Le0/q;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Le0/q;-><init>(J)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p0}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, LL0/d;

    .line 24
    .line 25
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 26
    .line 27
    invoke-direct {v1, v2}, LL0/d;-><init>(F)V

    .line 28
    .line 29
    .line 30
    const v2, -0x384098

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2}, LN/o;->M(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    or-int/2addr v0, v1

    .line 45
    invoke-virtual {p0}, LN/o;->F()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    sget-object v0, LN/k;->a:LN/P;

    .line 52
    .line 53
    if-ne v1, v0, :cond_1

    .line 54
    .line 55
    :cond_0
    new-instance v1, LM/e;

    .line 56
    .line 57
    invoke-direct {v1, p2, p1}, LM/e;-><init>(ZLN/V;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    invoke-virtual {p0, p1}, LN/o;->p(Z)V

    .line 65
    .line 66
    .line 67
    check-cast v1, LM/e;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, LN/o;->p(Z)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method
