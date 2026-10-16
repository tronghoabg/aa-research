.class public final LN/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/Q;


# static fields
.field public static final a:LN/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LN/t0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN/t0;->a:LN/t0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ltf/l;Llf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LJf/n;->a:LFf/e;

    .line 4
    .line 5
    new-instance v1, LN/s0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, LN/s0;-><init>(Ltf/l;Ljf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Ljf/g;)Ljf/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->C(Ljf/f;Ljf/g;)Ljf/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Ljf/g;
    .locals 1

    .line 1
    sget-object v0, LN/P;->b:LN/P;

    return-object v0
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->N(Ljf/f;Ljf/g;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
