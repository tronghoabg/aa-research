.class public abstract LE/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE/I;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, LE/i;->a:LE/f;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    int-to-float v1, v1

    .line 6
    sget-object v2, LZ/a;->j:LZ/c;

    .line 7
    .line 8
    new-instance v3, LE/u;

    .line 9
    .line 10
    invoke-direct {v3, v2, v0}, LE/u;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, LE/r;->k:LE/r;

    .line 14
    .line 15
    invoke-static {v1, v0, v3, v2}, Lgc/b;->F(FILandroid/support/v4/media/session/b;Ltf/s;)LE/I;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LE/J;->a:LE/I;

    .line 20
    .line 21
    return-void
.end method

.method public static final a(LE/c;LN/o;)Lr0/n;
    .locals 4

    .line 1
    sget-object v0, LZ/a;->k:LZ/c;

    .line 2
    .line 3
    const-string v1, "horizontalArrangement"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, -0x31efee4e

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, LN/o;->M(I)V

    .line 12
    .line 13
    .line 14
    const v1, 0x1e7b2b64

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, LN/o;->M(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    or-int/2addr v1, v2

    .line 29
    invoke-virtual {p1}, LN/o;->F()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    sget-object v1, LN/k;->a:LN/P;

    .line 36
    .line 37
    if-ne v2, v1, :cond_2

    .line 38
    .line 39
    :cond_0
    sget-object v1, LE/i;->a:LE/f;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    sget-object v1, LZ/a;->j:LZ/c;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LZ/c;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    sget-object p0, LE/J;->a:LE/I;

    .line 56
    .line 57
    :goto_0
    move-object v2, p0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-interface {p0}, LE/c;->b()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    new-instance v2, LE/u;

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-direct {v2, v0, v3}, LE/u;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    new-instance v0, LE/s;

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    invoke-direct {v0, p0, v3}, LE/s;-><init>(LE/c;I)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    invoke-static {v1, p0, v2, v0}, Lgc/b;->F(FILandroid/support/v4/media/session/b;Ltf/s;)LE/I;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_0

    .line 81
    :goto_1
    invoke-virtual {p1, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    const/4 p0, 0x0

    .line 85
    invoke-virtual {p1, p0}, LN/o;->p(Z)V

    .line 86
    .line 87
    .line 88
    check-cast v2, Lr0/n;

    .line 89
    .line 90
    invoke-virtual {p1, p0}, LN/o;->p(Z)V

    .line 91
    .line 92
    .line 93
    return-object v2
.end method
