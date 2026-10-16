.class public abstract LE/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE/x;

.field public static final b:LE/x;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LE/x;

    .line 2
    .line 3
    new-instance v1, LE/l;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x4

    .line 7
    invoke-direct {v1, v2, v3}, LE/l;-><init>(II)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-direct {v0, v1, v3}, LE/x;-><init>(Ltf/l;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LE/L;->a:LE/x;

    .line 15
    .line 16
    new-instance v0, LE/x;

    .line 17
    .line 18
    new-instance v1, LE/l;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v1, v2, v4}, LE/l;-><init>(II)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    invoke-direct {v0, v1, v4}, LE/x;-><init>(Ltf/l;I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LE/L;->b:LE/x;

    .line 29
    .line 30
    const-string v0, "direction"

    .line 31
    .line 32
    invoke-static {v3, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static a(LZ/k;)LZ/k;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LE/L;->b:LE/x;

    .line 7
    .line 8
    invoke-interface {p0, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final b(LZ/k;F)LZ/k;
    .locals 7

    .line 1
    const-string v0, "$this$height"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE/M;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v6, 0x5

    .line 11
    move v5, p1

    .line 12
    move v3, p1

    .line 13
    invoke-direct/range {v1 .. v6}, LE/M;-><init>(FFFFI)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final c(LZ/k;F)LZ/k;
    .locals 7

    .line 1
    const-string v0, "$this$size"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE/M;

    .line 7
    .line 8
    const/4 v6, 0x1

    .line 9
    move v3, p1

    .line 10
    move v4, p1

    .line 11
    move v5, p1

    .line 12
    move v2, p1

    .line 13
    invoke-direct/range {v1 .. v6}, LE/M;-><init>(FFFFZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final d(LZ/k;J)LZ/k;
    .locals 1

    .line 1
    const-string v0, "$this$size"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, LL0/f;->b(J)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {p1, p2}, LL0/f;->a(J)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p0, v0, p1}, LE/L;->e(LZ/k;FF)LZ/k;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final e(LZ/k;FF)LZ/k;
    .locals 7

    .line 1
    const-string v0, "$this$size"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE/M;

    .line 7
    .line 8
    const/4 v6, 0x1

    .line 9
    move v4, p1

    .line 10
    move v5, p2

    .line 11
    move v2, p1

    .line 12
    move v3, p2

    .line 13
    invoke-direct/range {v1 .. v6}, LE/M;-><init>(FFFFZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final f(F)LZ/k;
    .locals 6

    .line 1
    new-instance v0, LE/M;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    const/16 v5, 0xa

    .line 6
    .line 7
    move v3, p0

    .line 8
    move v1, p0

    .line 9
    invoke-direct/range {v0 .. v5}, LE/M;-><init>(FFFFI)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static g(LZ/k;F)LZ/k;
    .locals 7

    .line 1
    const-string v0, "$this$widthIn"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE/M;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v6, 0xa

    .line 10
    .line 11
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move v4, p1

    .line 15
    invoke-direct/range {v1 .. v6}, LE/M;-><init>(FFFFI)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
