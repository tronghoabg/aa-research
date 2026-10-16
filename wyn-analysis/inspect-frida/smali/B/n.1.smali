.class public final LB/n;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public a:I

.field public synthetic b:LC/e;

.field public synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:LD/i;

.field public final synthetic f:LN/V;

.field public final synthetic g:LN/V;


# direct methods
.method public constructor <init>(ZLD/i;LN/V;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB/n;->d:Z

    .line 2
    .line 3
    iput-object p2, p0, LB/n;->e:LD/i;

    .line 4
    .line 5
    iput-object p3, p0, LB/n;->f:LN/V;

    .line 6
    .line 7
    iput-object p4, p0, LB/n;->g:LN/V;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, LC/e;

    .line 2
    .line 3
    check-cast p2, Ld0/c;

    .line 4
    .line 5
    iget-wide v0, p2, Ld0/c;->a:J

    .line 6
    .line 7
    move-object v7, p3

    .line 8
    check-cast v7, Ljf/c;

    .line 9
    .line 10
    new-instance v2, LB/n;

    .line 11
    .line 12
    iget-object v6, p0, LB/n;->g:LN/V;

    .line 13
    .line 14
    iget-boolean v3, p0, LB/n;->d:Z

    .line 15
    .line 16
    iget-object v4, p0, LB/n;->e:LD/i;

    .line 17
    .line 18
    iget-object v5, p0, LB/n;->f:LN/V;

    .line 19
    .line 20
    invoke-direct/range {v2 .. v7}, LB/n;-><init>(ZLD/i;LN/V;LN/V;Ljf/c;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v2, LB/n;->b:LC/e;

    .line 24
    .line 25
    iput-wide v0, v2, LB/n;->c:J

    .line 26
    .line 27
    sget-object p1, Lef/C;->a:Lef/C;

    .line 28
    .line 29
    invoke-virtual {v2, p1}, LB/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LB/n;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

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
    return-object v2

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
    iget-object v4, p0, LB/n;->b:LC/e;

    .line 28
    .line 29
    iget-wide v5, p0, LB/n;->c:J

    .line 30
    .line 31
    iget-boolean p1, p0, LB/n;->d:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iput v3, p0, LB/n;->a:I

    .line 36
    .line 37
    new-instance v3, LB/t;

    .line 38
    .line 39
    iget-object v9, p0, LB/n;->g:LN/V;

    .line 40
    .line 41
    iget-object v7, p0, LB/n;->e:LD/i;

    .line 42
    .line 43
    iget-object v8, p0, LB/n;->f:LN/V;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-direct/range {v3 .. v10}, LB/t;-><init>(LC/e;JLD/i;LN/V;LN/V;Ljf/c;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object p1, v2

    .line 57
    :goto_0
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    return-object v2
.end method
