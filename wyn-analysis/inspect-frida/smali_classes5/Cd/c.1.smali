.class public final LCd/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public synthetic c:LRd/e;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ltf/q;


# direct methods
.method public synthetic constructor <init>(Ltf/q;Ljf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LCd/c;->a:I

    iput-object p1, p0, LCd/c;->e:Ltf/q;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LCd/c;->a:I

    .line 2
    .line 3
    check-cast p1, LRd/e;

    .line 4
    .line 5
    check-cast p3, Ljf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, LCd/c;

    .line 11
    .line 12
    iget-object v1, p0, LCd/c;->e:Ltf/q;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v1, p3, v2}, LCd/c;-><init>(Ltf/q;Ljf/c;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, LCd/c;->c:LRd/e;

    .line 19
    .line 20
    iput-object p2, v0, LCd/c;->d:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LCd/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    new-instance v0, LCd/c;

    .line 30
    .line 31
    iget-object v1, p0, LCd/c;->e:Ltf/q;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, p3, v2}, LCd/c;-><init>(Ltf/q;Ljf/c;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, LCd/c;->c:LRd/e;

    .line 38
    .line 39
    iput-object p2, v0, LCd/c;->d:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p1, Lef/C;->a:Lef/C;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, LCd/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LCd/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 7
    .line 8
    iget v1, p0, LCd/c;->b:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    iget-object v1, p0, LCd/c;->c:LRd/e;

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
    iget-object v1, p0, LCd/c;->c:LRd/e;

    .line 40
    .line 41
    iget-object p1, p0, LCd/c;->d:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v4, v1, LRd/e;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object v1, p0, LCd/c;->c:LRd/e;

    .line 46
    .line 47
    iput v3, p0, LCd/c;->b:I

    .line 48
    .line 49
    iget-object v3, p0, LCd/c;->e:Ltf/q;

    .line 50
    .line 51
    invoke-interface {v3, v4, p1, p0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    :goto_0
    check-cast p1, LMd/c;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    iput-object v3, p0, LCd/c;->c:LRd/e;

    .line 64
    .line 65
    iput v2, p0, LCd/c;->b:I

    .line 66
    .line 67
    invoke-virtual {v1, p1, p0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 75
    .line 76
    :goto_2
    return-object v0

    .line 77
    :pswitch_0
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 78
    .line 79
    iget v1, p0, LCd/c;->b:I

    .line 80
    .line 81
    sget-object v2, Lef/C;->a:Lef/C;

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    const/4 v4, 0x1

    .line 85
    if-eqz v1, :cond_8

    .line 86
    .line 87
    if-eq v1, v4, :cond_7

    .line 88
    .line 89
    if-ne v1, v3, :cond_6

    .line 90
    .line 91
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_3
    move-object v0, v2

    .line 95
    goto :goto_5

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_7
    iget-object v1, p0, LCd/c;->c:LRd/e;

    .line 105
    .line 106
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, LCd/c;->c:LRd/e;

    .line 114
    .line 115
    iget-object p1, p0, LCd/c;->d:Ljava/lang/Object;

    .line 116
    .line 117
    instance-of v5, p1, LMd/c;

    .line 118
    .line 119
    if-nez v5, :cond_9

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    iget-object v5, v1, LRd/e;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v1, p0, LCd/c;->c:LRd/e;

    .line 125
    .line 126
    iput v4, p0, LCd/c;->b:I

    .line 127
    .line 128
    iget-object v4, p0, LCd/c;->e:Ltf/q;

    .line 129
    .line 130
    invoke-interface {v4, v5, p1, p0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v0, :cond_a

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_a
    :goto_4
    check-cast p1, LMd/c;

    .line 138
    .line 139
    if-nez p1, :cond_b

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_b
    const/4 v4, 0x0

    .line 143
    iput-object v4, p0, LCd/c;->c:LRd/e;

    .line 144
    .line 145
    iput v3, p0, LCd/c;->b:I

    .line 146
    .line 147
    invoke-virtual {v1, p1, p0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v0, :cond_5

    .line 152
    .line 153
    :goto_5
    return-object v0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
