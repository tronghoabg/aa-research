.class public final LK/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LV/d;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LV/d;Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LK/w;->i:I

    .line 1
    iput-object p1, p0, LK/w;->j:LV/d;

    iput-object p2, p0, LK/w;->l:Ljava/lang/Object;

    iput p3, p0, LK/w;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;LV/d;II)V
    .locals 0

    .line 2
    iput p4, p0, LK/w;->i:I

    iput-object p1, p0, LK/w;->l:Ljava/lang/Object;

    iput-object p2, p0, LK/w;->j:LV/d;

    iput p3, p0, LK/w;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LK/w;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, LK/w;->k:I

    .line 14
    .line 15
    invoke-static {p2}, LN/d;->Q(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    or-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    iget-object v0, p0, LK/w;->j:LV/d;

    .line 22
    .line 23
    iget-object v1, p0, LK/w;->l:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1, p2}, LV/d;->c(Ljava/lang/Object;LN/o;I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    check-cast p1, LN/o;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, LK/w;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p2, [LN/g0;

    .line 41
    .line 42
    array-length v0, p2

    .line 43
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    check-cast p2, [LN/g0;

    .line 48
    .line 49
    iget v0, p0, LK/w;->k:I

    .line 50
    .line 51
    or-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    invoke-static {v0}, LN/d;->Q(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, LK/w;->j:LV/d;

    .line 58
    .line 59
    invoke-static {p2, v1, p1, v0}, LN/d;->a([LN/g0;LV/d;LN/o;I)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lef/C;->a:Lef/C;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    check-cast p1, LN/o;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    and-int/lit8 p2, p2, 0xb

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    if-ne p2, v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1}, LN/o;->x()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    iget-object p2, p0, LK/w;->l:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, LK/L;

    .line 92
    .line 93
    iget-object p2, p2, LK/L;->i:Lz0/p;

    .line 94
    .line 95
    new-instance v0, LK/v;

    .line 96
    .line 97
    iget-object v1, p0, LK/w;->j:LV/d;

    .line 98
    .line 99
    iget v2, p0, LK/w;->k:I

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    invoke-direct {v0, v1, v2, v3}, LK/v;-><init>(LV/d;II)V

    .line 103
    .line 104
    .line 105
    const v1, 0xad0597a

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v1, v0}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const/16 v1, 0x30

    .line 113
    .line 114
    invoke-static {p2, v0, p1, v1}, LK/I;->a(Lz0/p;LV/d;LN/o;I)V

    .line 115
    .line 116
    .line 117
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 118
    .line 119
    return-object p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
