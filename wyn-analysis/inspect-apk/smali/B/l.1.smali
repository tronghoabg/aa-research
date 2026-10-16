.class public final LB/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lef/e;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Boolean;Ltf/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LB/l;->i:I

    .line 1
    iput-object p1, p0, LB/l;->j:Ljava/lang/Object;

    iput-object p2, p0, LB/l;->k:Ljava/lang/Object;

    check-cast p3, Llf/j;

    iput-object p3, p0, LB/l;->l:Lef/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lx0/e;Ltf/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB/l;->i:I

    .line 2
    iput-object p1, p0, LB/l;->j:Ljava/lang/Object;

    iput-object p2, p0, LB/l;->k:Ljava/lang/Object;

    iput-object p3, p0, LB/l;->l:Lef/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LB/l;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LZ/k;

    .line 7
    .line 8
    check-cast p2, LN/o;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    const-string p3, "$this$composed"

    .line 16
    .line 17
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const p1, 0x4611bb71

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lu0/M;->e:LN/L0;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, LL0/b;

    .line 33
    .line 34
    sget-object p3, Lu0/M;->o:LN/L0;

    .line 35
    .line 36
    invoke-virtual {p2, p3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Lu0/p0;

    .line 41
    .line 42
    const v0, 0x44faf204

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    sget-object v0, LN/k;->a:LN/P;

    .line 59
    .line 60
    if-ne v1, v0, :cond_1

    .line 61
    .line 62
    :cond_0
    new-instance v1, Lp0/t;

    .line 63
    .line 64
    invoke-direct {v1, p3, p1}, Lp0/t;-><init>(Lu0/p0;LL0/b;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    const/4 p1, 0x0

    .line 71
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 72
    .line 73
    .line 74
    check-cast v1, Lp0/t;

    .line 75
    .line 76
    new-instance p3, Lp0/v;

    .line 77
    .line 78
    iget-object v0, p0, LB/l;->l:Lef/e;

    .line 79
    .line 80
    check-cast v0, Llf/j;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {p3, v1, v0, v2}, Lp0/v;-><init>(Lp0/t;Ltf/p;Ljf/c;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, LB/l;->k:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Boolean;

    .line 89
    .line 90
    iget-object v2, p0, LB/l;->j:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v1, v2, v0, p3, p2}, LN/d;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 96
    .line 97
    .line 98
    return-object v1

    .line 99
    :pswitch_0
    check-cast p1, LZ/k;

    .line 100
    .line 101
    check-cast p2, LN/o;

    .line 102
    .line 103
    check-cast p3, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    const-string p3, "$this$composed"

    .line 109
    .line 110
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const p1, -0x2d10e1f7

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 117
    .line 118
    .line 119
    sget-object v0, LZ/i;->a:LZ/i;

    .line 120
    .line 121
    sget-object p1, LB/U;->a:LN/L0;

    .line 122
    .line 123
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    move-object v2, p1

    .line 128
    check-cast v2, LB/Q;

    .line 129
    .line 130
    const p1, -0x1d58f75c

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    sget-object p3, LN/k;->a:LN/P;

    .line 141
    .line 142
    if-ne p1, p3, :cond_2

    .line 143
    .line 144
    new-instance p1, LD/i;

    .line 145
    .line 146
    invoke-direct {p1}, LD/i;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, p1}, LN/o;->U(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    const/4 p3, 0x0

    .line 153
    invoke-virtual {p2, p3}, LN/o;->p(Z)V

    .line 154
    .line 155
    .line 156
    move-object v1, p1

    .line 157
    check-cast v1, LD/i;

    .line 158
    .line 159
    iget-object p1, p0, LB/l;->k:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v5, p1

    .line 162
    check-cast v5, Lx0/e;

    .line 163
    .line 164
    iget-object p1, p0, LB/l;->l:Lef/e;

    .line 165
    .line 166
    move-object v6, p1

    .line 167
    check-cast v6, Ltf/a;

    .line 168
    .line 169
    const/4 v3, 0x1

    .line 170
    iget-object p1, p0, LB/l;->j:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v4, p1

    .line 173
    check-cast v4, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/H;->P(LZ/k;LD/i;LB/Q;ZLjava/lang/String;Lx0/e;Ltf/a;)LZ/k;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p2, p3}, LN/o;->p(Z)V

    .line 180
    .line 181
    .line 182
    return-object p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
