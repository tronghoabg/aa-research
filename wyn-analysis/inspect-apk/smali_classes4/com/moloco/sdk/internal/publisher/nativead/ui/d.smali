.class public final Lcom/moloco/sdk/internal/publisher/nativead/ui/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LV/d;


# direct methods
.method public synthetic constructor <init>(LV/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->b:LV/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->a:I

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
    move-result p2

    .line 14
    and-int/lit8 p2, p2, 0x3

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, LN/o;->x()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->b:LV/d;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    move-object v4, p1

    .line 44
    check-cast v4, LN/o;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    and-int/lit8 p1, p1, 0x3

    .line 53
    .line 54
    const/4 p2, 0x2

    .line 55
    if-ne p1, p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v4}, LN/o;->x()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v4}, LN/o;->I()V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    :goto_2
    new-instance p1, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;

    .line 69
    .line 70
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->b:LV/d;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-direct {p1, p2, v0}, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;-><init>(LV/d;I)V

    .line 74
    .line 75
    .line 76
    const p2, -0x3976e531

    .line 77
    .line 78
    .line 79
    invoke-static {v4, p2, p1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const/16 v5, 0xc00

    .line 84
    .line 85
    const/4 v6, 0x7

    .line 86
    const/4 v0, 0x0

    .line 87
    const/4 v1, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-static/range {v0 .. v6}, LFe/c;->c(LK/e;LK/L;LK/z;LV/d;LN/o;II)V

    .line 90
    .line 91
    .line 92
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_1
    check-cast p1, LN/o;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    and-int/lit8 p2, p2, 0x3

    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    if-ne p2, v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, LN/o;->x()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_4

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    invoke-virtual {p1}, LN/o;->I()V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    :goto_4
    sget-object p2, LZ/i;->a:LZ/i;

    .line 120
    .line 121
    invoke-static {p2}, LE/L;->a(LZ/k;)LZ/k;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    const/4 v0, 0x6

    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;->b:LV/d;

    .line 131
    .line 132
    invoke-virtual {v1, p2, p1, v0}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :goto_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 136
    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
