.class public final LM0/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Z

.field public final synthetic c:LM0/i;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(ZLM0/i;JLjf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LM0/d;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, LM0/d;->c:LM0/i;

    .line 4
    .line 5
    iput-wide p3, p0, LM0/d;->d:J

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
    new-instance v0, LM0/d;

    .line 2
    .line 3
    iget-object v2, p0, LM0/d;->c:LM0/i;

    .line 4
    .line 5
    iget-wide v3, p0, LM0/d;->d:J

    .line 6
    .line 7
    iget-boolean v1, p0, LM0/d;->b:Z

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, LM0/d;-><init>(ZLM0/i;JLjf/c;)V

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
    invoke-virtual {p0, p1, p2}, LM0/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM0/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LM0/d;->a:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v6, p0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, LM0/d;->c:LM0/i;

    .line 34
    .line 35
    iget-boolean v1, p0, LM0/d;->b:Z

    .line 36
    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    sget-wide v5, LL0/l;->b:J

    .line 40
    .line 41
    iput v3, p0, LM0/d;->a:I

    .line 42
    .line 43
    iget-wide v7, p0, LM0/d;->d:J

    .line 44
    .line 45
    iget-object v4, p1, LM0/i;->a:Lo0/c;

    .line 46
    .line 47
    move-object v9, p0

    .line 48
    invoke-virtual/range {v4 .. v9}, Lo0/c;->a(JJLlf/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move-object v6, v9

    .line 53
    if-ne p1, v0, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move-object v6, p0

    .line 57
    sget-wide v4, LL0/l;->b:J

    .line 58
    .line 59
    iput v2, v6, LM0/d;->a:I

    .line 60
    .line 61
    iget-wide v2, v6, LM0/d;->d:J

    .line 62
    .line 63
    iget-object v1, p1, LM0/i;->a:Lo0/c;

    .line 64
    .line 65
    invoke-virtual/range {v1 .. v6}, Lo0/c;->a(JJLlf/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    :goto_0
    return-object v0

    .line 72
    :cond_4
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 73
    .line 74
    return-object p1
.end method
