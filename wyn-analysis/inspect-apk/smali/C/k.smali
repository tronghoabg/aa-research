.class public final LC/k;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LB/n;

.field public final synthetic d:LEf/E;

.field public final synthetic e:LC/e;

.field public final synthetic f:LB/o;


# direct methods
.method public constructor <init>(LB/n;LEf/E;LC/e;LB/o;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/k;->c:LB/n;

    .line 2
    .line 3
    iput-object p2, p0, LC/k;->d:LEf/E;

    .line 4
    .line 5
    iput-object p3, p0, LC/k;->e:LC/e;

    .line 6
    .line 7
    iput-object p4, p0, LC/k;->f:LB/o;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/i;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, LC/k;

    .line 2
    .line 3
    iget-object v3, p0, LC/k;->e:LC/e;

    .line 4
    .line 5
    iget-object v4, p0, LC/k;->f:LB/o;

    .line 6
    .line 7
    iget-object v1, p0, LC/k;->c:LB/n;

    .line 8
    .line 9
    iget-object v2, p0, LC/k;->d:LEf/E;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LC/k;-><init>(LB/n;LEf/E;LC/e;LB/o;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LC/k;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp0/s;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LC/k;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LC/k;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LC/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LC/k;->a:I

    .line 4
    .line 5
    iget-object v2, p0, LC/k;->e:LC/e;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v5, :cond_1

    .line 13
    .line 14
    if-ne v1, v4, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-object v1, p0, LC/k;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lp0/s;

    .line 31
    .line 32
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LC/k;->b:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    check-cast v1, Lp0/s;

    .line 43
    .line 44
    iput-object v1, p0, LC/k;->b:Ljava/lang/Object;

    .line 45
    .line 46
    iput v5, p0, LC/k;->a:I

    .line 47
    .line 48
    sget-object p1, LC/o;->a:LC/h;

    .line 49
    .line 50
    sget-object p1, Lp0/g;->b:Lp0/g;

    .line 51
    .line 52
    invoke-static {v1, p1, v5, p0}, LC/o;->a(Lp0/s;Lp0/g;ZLlf/a;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    check-cast p1, Lp0/k;

    .line 60
    .line 61
    invoke-virtual {p1}, Lp0/k;->a()V

    .line 62
    .line 63
    .line 64
    sget-object v6, LC/o;->a:LC/h;

    .line 65
    .line 66
    iget-object v7, p0, LC/k;->c:LB/n;

    .line 67
    .line 68
    if-eq v7, v6, :cond_4

    .line 69
    .line 70
    new-instance v6, LC/j;

    .line 71
    .line 72
    invoke-direct {v6, v7, v2, p1, v3}, LC/j;-><init>(LB/n;LC/e;Lp0/k;Ljf/c;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x3

    .line 76
    iget-object v7, p0, LC/k;->d:LEf/E;

    .line 77
    .line 78
    invoke-static {v7, v3, v6, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 79
    .line 80
    .line 81
    :cond_4
    iput-object v3, p0, LC/k;->b:Ljava/lang/Object;

    .line 82
    .line 83
    iput v4, p0, LC/k;->a:I

    .line 84
    .line 85
    invoke-static {v1, p0}, LC/o;->b(Lp0/s;Llf/a;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v0, :cond_5

    .line 90
    .line 91
    :goto_1
    return-object v0

    .line 92
    :cond_5
    :goto_2
    check-cast p1, Lp0/k;

    .line 93
    .line 94
    iget-object v0, v2, LC/e;->d:LNf/d;

    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    iput-boolean v5, v2, LC/e;->c:Z

    .line 99
    .line 100
    invoke-virtual {v0, v3}, LNf/d;->a(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    invoke-virtual {p1}, Lp0/k;->a()V

    .line 105
    .line 106
    .line 107
    iput-boolean v5, v2, LC/e;->b:Z

    .line 108
    .line 109
    invoke-virtual {v0, v3}, LNf/d;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, LC/k;->f:LB/o;

    .line 113
    .line 114
    new-instance v1, Ld0/c;

    .line 115
    .line 116
    iget-wide v2, p1, Lp0/k;->c:J

    .line 117
    .line 118
    invoke-direct {v1, v2, v3}, Ld0/c;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, LB/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 125
    .line 126
    return-object p1
.end method
