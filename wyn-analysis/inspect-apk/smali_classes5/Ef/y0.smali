.class public final synthetic LEf/y0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# static fields
.field public static final a:LEf/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LEf/y0;

    .line 2
    .line 3
    const-string v4, "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, LEf/z0;

    .line 8
    .line 9
    const-string v3, "registerSelectForOnJoin"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LEf/y0;->a:LEf/y0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 p3, 0x1

    .line 2
    check-cast p1, LEf/z0;

    .line 3
    .line 4
    check-cast p2, LMf/i;

    .line 5
    .line 6
    sget-object v0, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, LEf/h0;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1, v0}, LEf/z0;->T(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    move v0, p3

    .line 30
    :goto_0
    sget-object v1, Lef/C;->a:Lef/C;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    check-cast p2, LMf/h;

    .line 35
    .line 36
    iput-object v1, p2, LMf/h;->e:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    new-instance v0, LEf/u0;

    .line 40
    .line 41
    invoke-direct {v0, p1, p2, p3}, LEf/u0;-><init>(LEf/z0;LMf/i;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p3, v0}, LEf/H;->x(LEf/m0;ZLEf/q0;)LEf/U;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p2, LMf/h;

    .line 49
    .line 50
    iput-object p1, p2, LMf/h;->c:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v1
.end method
