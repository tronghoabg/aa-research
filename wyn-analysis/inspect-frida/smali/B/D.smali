.class public final LB/D;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LKd/a;LN/V;LG/e;LN/V;LN/V;LD/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB/D;->i:I

    .line 1
    iput-object p1, p0, LB/D;->j:Ljava/lang/Object;

    iput-object p2, p0, LB/D;->k:Ljava/lang/Object;

    iput-object p3, p0, LB/D;->n:Ljava/lang/Object;

    iput-object p4, p0, LB/D;->l:Ljava/lang/Object;

    iput-object p5, p0, LB/D;->m:Ljava/lang/Object;

    iput-object p6, p0, LB/D;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lr0/t;LP/a;Lt0/r;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;LZ/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LB/D;->i:I

    .line 2
    iput-object p1, p0, LB/D;->j:Ljava/lang/Object;

    iput-object p2, p0, LB/D;->k:Ljava/lang/Object;

    iput-object p3, p0, LB/D;->l:Ljava/lang/Object;

    iput-object p4, p0, LB/D;->m:Ljava/lang/Object;

    iput-object p5, p0, LB/D;->n:Ljava/lang/Object;

    iput-object p6, p0, LB/D;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 4
    .line 5
    iget-object v2, v0, LB/D;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, LB/D;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, LB/D;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, LB/D;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, LB/D;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, LB/D;->j:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v8, 0x1

    .line 18
    iget v9, v0, LB/D;->i:I

    .line 19
    .line 20
    packed-switch v9, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v10, p1

    .line 24
    .line 25
    check-cast v10, Lr0/s;

    .line 26
    .line 27
    const-string v9, "$this$layout"

    .line 28
    .line 29
    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v7, [Lr0/t;

    .line 33
    .line 34
    array-length v9, v7

    .line 35
    const/4 v11, 0x0

    .line 36
    move v12, v11

    .line 37
    :goto_0
    if-ge v11, v9, :cond_1

    .line 38
    .line 39
    move v13, v11

    .line 40
    aget-object v11, v7, v13

    .line 41
    .line 42
    add-int/lit8 v17, v12, 0x1

    .line 43
    .line 44
    if-eqz v11, :cond_0

    .line 45
    .line 46
    move-object v14, v6

    .line 47
    check-cast v14, LP/a;

    .line 48
    .line 49
    invoke-virtual {v14, v12}, LP/a;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    check-cast v12, Lr0/m;

    .line 54
    .line 55
    move-object v14, v5

    .line 56
    check-cast v14, Lt0/r;

    .line 57
    .line 58
    iget-object v14, v14, Lt0/r;->a:Lt0/t;

    .line 59
    .line 60
    iget-object v14, v14, Lt0/t;->p:LL0/i;

    .line 61
    .line 62
    move-object v15, v4

    .line 63
    check-cast v15, Lkotlin/jvm/internal/E;

    .line 64
    .line 65
    iget v15, v15, Lkotlin/jvm/internal/E;->a:I

    .line 66
    .line 67
    move/from16 v18, v8

    .line 68
    .line 69
    move-object v8, v3

    .line 70
    check-cast v8, Lkotlin/jvm/internal/E;

    .line 71
    .line 72
    iget v8, v8, Lkotlin/jvm/internal/E;->a:I

    .line 73
    .line 74
    move-object/from16 v16, v2

    .line 75
    .line 76
    check-cast v16, LZ/d;

    .line 77
    .line 78
    move/from16 v19, v15

    .line 79
    .line 80
    move v15, v8

    .line 81
    move v8, v13

    .line 82
    move-object v13, v14

    .line 83
    move/from16 v14, v19

    .line 84
    .line 85
    invoke-static/range {v10 .. v16}, LE/p;->b(Lr0/s;Lr0/t;Lr0/m;LL0/i;IILZ/d;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v11, v8, 0x1

    .line 89
    .line 90
    move/from16 v12, v17

    .line 91
    .line 92
    move/from16 v8, v18

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    .line 96
    .line 97
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_1
    return-object v1

    .line 104
    :pswitch_0
    move/from16 v18, v8

    .line 105
    .line 106
    move-object/from16 v8, p1

    .line 107
    .line 108
    check-cast v8, Lc0/r;

    .line 109
    .line 110
    const-string v9, "it"

    .line 111
    .line 112
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8}, Lc0/r;->b()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v6, LN/V;

    .line 124
    .line 125
    invoke-interface {v6, v8}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v6}, LN/K0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    check-cast v6, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    const/4 v8, 0x3

    .line 139
    check-cast v7, LKd/a;

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    check-cast v2, LD/i;

    .line 143
    .line 144
    check-cast v4, LN/V;

    .line 145
    .line 146
    if-eqz v6, :cond_2

    .line 147
    .line 148
    sget-object v6, LEf/F;->a:LEf/F;

    .line 149
    .line 150
    new-instance v6, LB/A;

    .line 151
    .line 152
    check-cast v3, LG/e;

    .line 153
    .line 154
    check-cast v5, LN/V;

    .line 155
    .line 156
    invoke-direct {v6, v3, v5, v9}, LB/A;-><init>(LG/e;LN/V;Ljf/c;)V

    .line 157
    .line 158
    .line 159
    move/from16 v3, v18

    .line 160
    .line 161
    invoke-static {v7, v9, v6, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 162
    .line 163
    .line 164
    new-instance v3, LB/B;

    .line 165
    .line 166
    invoke-direct {v3, v2, v4, v9}, LB/B;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v7, v9, v3, v8}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    new-instance v3, LB/C;

    .line 174
    .line 175
    invoke-direct {v3, v2, v4, v9}, LB/C;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v7, v9, v3, v8}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 179
    .line 180
    .line 181
    :goto_1
    return-object v1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
