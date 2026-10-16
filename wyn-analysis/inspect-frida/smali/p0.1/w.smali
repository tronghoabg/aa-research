.class public abstract Lp0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lp0/f;

    .line 2
    .line 3
    sget-object v1, Lff/v;->a:Lff/v;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lp0/f;-><init>(Ljava/util/List;LE5/b;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lp0/w;->a:Lp0/f;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(LZ/k;Ljava/lang/Object;Ltf/p;)LZ/k;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LB/T;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, v1, p1, p2}, LB/T;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lr7/e;->n(LZ/k;Ltf/q;)LZ/k;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
