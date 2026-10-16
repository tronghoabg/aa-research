.class public final Lu1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Lu1/m;Lac/a;Ljava/util/List;LEf/E;Ltf/a;I)Lu1/G;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    sget-object p2, Lff/v;->a:Lff/v;

    .line 12
    .line 13
    :cond_1
    const-string p5, "serializer"

    .line 14
    .line 15
    invoke-static {p0, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p5, "scope"

    .line 19
    .line 20
    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    new-instance p1, Lae/d;

    .line 26
    .line 27
    const/16 p5, 0xe

    .line 28
    .line 29
    invoke-direct {p1, p5}, Lae/d;-><init>(I)V

    .line 30
    .line 31
    .line 32
    :cond_2
    move-object v6, p1

    .line 33
    new-instance p1, Lu1/e;

    .line 34
    .line 35
    invoke-direct {p1, p2, v1}, Lu1/e;-><init>(Ljava/util/List;Ljf/c;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-instance v2, Lu1/G;

    .line 43
    .line 44
    move-object v4, p0

    .line 45
    move-object v7, p3

    .line 46
    move-object v3, p4

    .line 47
    invoke-direct/range {v2 .. v7}, Lu1/G;-><init>(Ltf/a;Lu1/m;Ljava/util/List;Lu1/b;LEf/E;)V

    .line 48
    .line 49
    .line 50
    return-object v2
.end method
