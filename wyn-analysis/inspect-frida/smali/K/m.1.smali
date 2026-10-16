.class public final LK/m;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LA/e;

.field public final synthetic c:LK/n;

.field public final synthetic d:F

.field public final synthetic e:LD/h;


# direct methods
.method public constructor <init>(LA/e;LK/n;FLD/h;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/m;->b:LA/e;

    .line 2
    .line 3
    iput-object p2, p0, LK/m;->c:LK/n;

    .line 4
    .line 5
    iput p3, p0, LK/m;->d:F

    .line 6
    .line 7
    iput-object p4, p0, LK/m;->e:LD/h;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, LK/m;

    .line 2
    .line 3
    iget v3, p0, LK/m;->d:F

    .line 4
    .line 5
    iget-object v4, p0, LK/m;->e:LD/h;

    .line 6
    .line 7
    iget-object v1, p0, LK/m;->b:LA/e;

    .line 8
    .line 9
    iget-object v2, p0, LK/m;->c:LK/n;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LK/m;-><init>(LA/e;LK/n;FLD/h;Ljf/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, LK/m;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LK/m;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LK/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LK/m;->a:I

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
    iget-object p1, p0, LK/m;->b:LA/e;

    .line 28
    .line 29
    iget-object v1, p1, LA/e;->e:LN/Y;

    .line 30
    .line 31
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LL0/d;

    .line 36
    .line 37
    iget v1, v1, LL0/d;->a:F

    .line 38
    .line 39
    iget-object v4, p0, LK/m;->c:LK/n;

    .line 40
    .line 41
    iget v5, v4, LK/n;->b:F

    .line 42
    .line 43
    invoke-static {v1, v5}, LL0/d;->a(FF)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x0

    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    new-instance v1, LD/k;

    .line 51
    .line 52
    sget-wide v4, Ld0/c;->b:J

    .line 53
    .line 54
    invoke-direct {v1, v4, v5}, LD/k;-><init>(J)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget v5, v4, LK/n;->d:F

    .line 59
    .line 60
    invoke-static {v1, v5}, LL0/d;->a(FF)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    new-instance v1, LD/e;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget v4, v4, LK/n;->e:F

    .line 73
    .line 74
    invoke-static {v1, v4}, LL0/d;->a(FF)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    new-instance v1, LD/a;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    move-object v1, v6

    .line 87
    :goto_0
    iput v3, p0, LK/m;->a:I

    .line 88
    .line 89
    sget-object v3, LK/p;->a:LA/Z;

    .line 90
    .line 91
    iget-object v3, p0, LK/m;->e:LD/h;

    .line 92
    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    instance-of v1, v3, LD/k;

    .line 96
    .line 97
    sget-object v4, LK/p;->a:LA/Z;

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    :goto_1
    move-object v6, v4

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    instance-of v1, v3, LD/e;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    instance-of v1, v3, LD/a;

    .line 109
    .line 110
    if-eqz v1, :cond_a

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    if-eqz v1, :cond_a

    .line 114
    .line 115
    instance-of v3, v1, LD/k;

    .line 116
    .line 117
    sget-object v4, LK/p;->b:LA/Z;

    .line 118
    .line 119
    if-eqz v3, :cond_8

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_8
    instance-of v3, v1, LD/e;

    .line 123
    .line 124
    if-eqz v3, :cond_9

    .line 125
    .line 126
    sget-object v6, LK/p;->c:LA/Z;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    instance-of v1, v1, LD/a;

    .line 130
    .line 131
    if-eqz v1, :cond_a

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_a
    :goto_2
    iget v1, p0, LK/m;->d:F

    .line 135
    .line 136
    if-eqz v6, :cond_c

    .line 137
    .line 138
    new-instance v3, LL0/d;

    .line 139
    .line 140
    invoke-direct {v3, v1}, LL0/d;-><init>(F)V

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v3, v6, p0}, LA/e;->c(LA/e;Ljava/lang/Object;LA/i;Ljf/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v0, :cond_b

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_b
    move-object p1, v2

    .line 151
    goto :goto_3

    .line 152
    :cond_c
    new-instance v3, LL0/d;

    .line 153
    .line 154
    invoke-direct {v3, v1}, LL0/d;-><init>(F)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v3, p0}, LA/e;->e(Ljava/lang/Comparable;Llf/j;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, v0, :cond_b

    .line 162
    .line 163
    :goto_3
    if-ne p1, v0, :cond_d

    .line 164
    .line 165
    return-object v0

    .line 166
    :cond_d
    return-object v2
.end method
