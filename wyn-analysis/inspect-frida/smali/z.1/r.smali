.class public final Lz/r;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lz/q;

.field public final synthetic c:J

.field public final synthetic d:Lz/s;


# direct methods
.method public constructor <init>(Lz/q;JLz/s;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/r;->b:Lz/q;

    .line 2
    .line 3
    iput-wide p2, p0, Lz/r;->c:J

    .line 4
    .line 5
    iput-object p4, p0, Lz/r;->d:Lz/s;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lz/r;

    .line 2
    .line 3
    iget-wide v2, p0, Lz/r;->c:J

    .line 4
    .line 5
    iget-object v4, p0, Lz/r;->d:Lz/s;

    .line 6
    .line 7
    iget-object v1, p0, Lz/r;->b:Lz/q;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lz/r;-><init>(Lz/q;JLz/s;Ljf/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lz/r;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lz/r;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lz/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lz/r;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lz/r;->d:Lz/s;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lz/r;->b:Lz/q;

    .line 28
    .line 29
    iget-object p1, p1, Lz/q;->a:LA/e;

    .line 30
    .line 31
    new-instance v1, LL0/h;

    .line 32
    .line 33
    iget-wide v4, p0, Lz/r;->c:J

    .line 34
    .line 35
    invoke-direct {v1, v4, v5}, LL0/h;-><init>(J)V

    .line 36
    .line 37
    .line 38
    iget-object v4, v2, Lz/s;->a:LA/i;

    .line 39
    .line 40
    iput v3, p0, Lz/r;->a:I

    .line 41
    .line 42
    invoke-static {p1, v1, v4, p0}, LA/e;->c(LA/e;Ljava/lang/Object;LA/i;Ljf/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    check-cast p1, LA/g;

    .line 50
    .line 51
    iget p1, p1, LA/g;->b:I

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :cond_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 60
    .line 61
    return-object p1
.end method
