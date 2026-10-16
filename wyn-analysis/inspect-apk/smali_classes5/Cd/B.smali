.class public final LCd/B;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Throwable;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LCd/B;->a:I

    iput-object p1, p0, LCd/B;->e:Ljava/util/List;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LCd/B;->a:I

    .line 2
    .line 3
    check-cast p1, LFd/b;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p3, Ljf/c;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, LCd/B;

    .line 13
    .line 14
    iget-object v1, p0, LCd/B;->e:Ljava/util/List;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, p3, v2}, LCd/B;-><init>(Ljava/util/List;Ljf/c;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, LCd/B;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p2, v0, LCd/B;->d:Ljava/lang/Throwable;

    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LCd/B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :pswitch_0
    new-instance v0, LCd/B;

    .line 32
    .line 33
    iget-object v1, p0, LCd/B;->e:Ljava/util/List;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v0, v1, p3, v2}, LCd/B;-><init>(Ljava/util/List;Ljf/c;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v0, LCd/B;->c:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p2, v0, LCd/B;->d:Ljava/lang/Throwable;

    .line 42
    .line 43
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LCd/B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LCd/B;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 7
    .line 8
    iget v1, p0, LCd/B;->b:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LCd/B;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LCd/B;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LFd/b;

    .line 37
    .line 38
    iget-object v1, p0, LCd/B;->d:Ljava/lang/Throwable;

    .line 39
    .line 40
    invoke-static {v1}, LHd/a;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, LCd/B;->c:Ljava/lang/Object;

    .line 45
    .line 46
    iput v2, p0, LCd/B;->b:I

    .line 47
    .line 48
    iget-object v2, p0, LCd/B;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v2, v1, p1, p0}, LCd/F;->a(Ljava/util/List;Ljava/lang/Throwable;LFd/b;Llf/c;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lef/C;->a:Lef/C;

    .line 54
    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v0, v1

    .line 59
    :goto_0
    return-object v0

    .line 60
    :pswitch_0
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 61
    .line 62
    iget v1, p0, LCd/B;->b:I

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    if-ne v1, v2, :cond_3

    .line 68
    .line 69
    iget-object v0, p0, LCd/B;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Throwable;

    .line 72
    .line 73
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, LCd/B;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, LFd/b;

    .line 91
    .line 92
    iget-object v1, p0, LCd/B;->d:Ljava/lang/Throwable;

    .line 93
    .line 94
    invoke-static {v1}, LHd/a;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iput-object v1, p0, LCd/B;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput v2, p0, LCd/B;->b:I

    .line 101
    .line 102
    iget-object v2, p0, LCd/B;->e:Ljava/util/List;

    .line 103
    .line 104
    invoke-static {v2, v1, p1, p0}, LCd/F;->a(Ljava/util/List;Ljava/lang/Throwable;LFd/b;Llf/c;)V

    .line 105
    .line 106
    .line 107
    sget-object p1, Lef/C;->a:Lef/C;

    .line 108
    .line 109
    if-ne p1, v0, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object v0, v1

    .line 113
    :goto_1
    return-object v0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
