.class public final LK/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LK/c;->i:I

    iput-object p3, p0, LK/c;->l:Ljava/lang/Object;

    iput-object p4, p0, LK/c;->m:Ljava/lang/Object;

    iput-object p5, p0, LK/c;->j:Ljava/lang/Object;

    iput p1, p0, LK/c;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LV/d;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK/c;->i:I

    .line 2
    iput-object p1, p0, LK/c;->j:Ljava/lang/Object;

    iput-object p2, p0, LK/c;->l:Ljava/lang/Object;

    iput-object p3, p0, LK/c;->m:Ljava/lang/Object;

    iput p4, p0, LK/c;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, LK/c;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LK/c;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, LK/c;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget v4, p0, LK/c;->k:I

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget v6, p0, LK/c;->i:I

    .line 13
    .line 14
    packed-switch v6, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, LN/o;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    or-int/lit8 p2, v4, 0x1

    .line 25
    .line 26
    check-cast v3, Lt0/I;

    .line 27
    .line 28
    check-cast v2, Lu0/D;

    .line 29
    .line 30
    check-cast v1, LV/d;

    .line 31
    .line 32
    invoke-static {v3, v2, v1, p1, p2}, Lu0/M;->a(Lt0/I;Lu0/D;LV/d;LN/o;I)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    check-cast p1, LN/o;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    or-int/lit8 p2, v4, 0x1

    .line 44
    .line 45
    check-cast v3, Lh4/h;

    .line 46
    .line 47
    check-cast v1, Lr0/h;

    .line 48
    .line 49
    check-cast v2, LZ/k;

    .line 50
    .line 51
    invoke-static {v3, v2, v1, p1, p2}, Lcom/moloco/sdk/internal/publisher/H;->G(Lh4/h;LZ/k;Lr0/h;LN/o;I)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_1
    check-cast p1, LN/o;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    or-int/lit8 p2, v4, 0x1

    .line 63
    .line 64
    check-cast v2, LY3/n;

    .line 65
    .line 66
    check-cast v1, Lr0/h;

    .line 67
    .line 68
    check-cast v3, LZ/k;

    .line 69
    .line 70
    invoke-static {v3, v2, v1, p1, p2}, La/a;->e(LZ/k;LY3/n;Lr0/h;LN/o;I)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_2
    check-cast p1, LN/o;

    .line 75
    .line 76
    check-cast p2, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    invoke-static {v4}, LN/d;->Q(I)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    or-int/2addr p2, v5

    .line 86
    check-cast v1, LV/d;

    .line 87
    .line 88
    invoke-virtual {v1, v3, v2, p1, p2}, LV/d;->d(Ljava/lang/Object;Ljava/lang/Object;LN/o;I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_3
    check-cast p1, LN/o;

    .line 93
    .line 94
    check-cast p2, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    and-int/lit8 p2, p2, 0xb

    .line 101
    .line 102
    const/4 v6, 0x2

    .line 103
    if-ne p2, v6, :cond_1

    .line 104
    .line 105
    invoke-virtual {p1}, LN/o;->x()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-nez p2, :cond_0

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    :goto_0
    sget-object p2, LK/h;->a:LN/D;

    .line 117
    .line 118
    check-cast v3, LN/V;

    .line 119
    .line 120
    invoke-interface {v3}, LN/K0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Le0/q;

    .line 125
    .line 126
    iget-wide v6, v3, Le0/q;->a:J

    .line 127
    .line 128
    invoke-static {v6, v7}, Le0/q;->c(J)F

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {p2, v3}, LN/D;->a(Ljava/lang/Object;)LN/g0;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    new-array v3, v5, [LN/g0;

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    aput-object p2, v3, v6

    .line 144
    .line 145
    new-instance p2, LK/b;

    .line 146
    .line 147
    check-cast v1, LV/d;

    .line 148
    .line 149
    check-cast v2, LE/F;

    .line 150
    .line 151
    invoke-direct {p2, v2, v1, v4, v5}, LK/b;-><init>(LE/F;LV/d;II)V

    .line 152
    .line 153
    .line 154
    const v1, -0x6545fb91

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v1, p2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    const/16 v1, 0x38

    .line 162
    .line 163
    invoke-static {v3, p2, p1, v1}, LN/d;->a([LN/g0;LV/d;LN/o;I)V

    .line 164
    .line 165
    .line 166
    :goto_1
    return-object v0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
