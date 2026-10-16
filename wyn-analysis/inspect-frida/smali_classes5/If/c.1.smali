.class public abstract LIf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljf/c;

.field public static final b:LH6/g;

.field public static final c:LH6/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljf/c;

    .line 3
    .line 4
    sput-object v0, LIf/c;->a:[Ljf/c;

    .line 5
    .line 6
    new-instance v0, LH6/g;

    .line 7
    .line 8
    const-string v1, "NULL"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LIf/c;->b:LH6/g;

    .line 15
    .line 16
    new-instance v0, LH6/g;

    .line 17
    .line 18
    const-string v1, "UNINITIALIZED"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LIf/c;->c:LH6/g;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(LIf/w;LFf/e;ILGf/a;I)LHf/l;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Ljf/i;->a:Ljf/i;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p2, -0x3

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    sget-object p3, LGf/a;->a:LGf/a;

    .line 17
    .line 18
    :cond_2
    invoke-interface {p0, p1, p2, p3}, LIf/w;->a(Ljf/h;ILGf/a;)LHf/l;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final b(Ljf/h;Ljava/lang/Object;Ljava/lang/Object;Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p0, p2}, LJf/b;->n(Ljf/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    new-instance v0, LIf/D;

    .line 6
    .line 7
    invoke-direct {v0, p4, p0}, LIf/D;-><init>(Ljf/c;Ljf/h;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, p3, Llf/a;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {p3, p1, v0}, LA6/h;->S(Ltf/p;Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    invoke-static {v1, p3}, Lkotlin/jvm/internal/K;->e(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, p1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :goto_0
    invoke-static {p0, p2}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    if-ne p1, p0, :cond_1

    .line 35
    .line 36
    const-string p0, "frame"

    .line 37
    .line 38
    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-object p1

    .line 42
    :goto_1
    invoke-static {p0, p2}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
