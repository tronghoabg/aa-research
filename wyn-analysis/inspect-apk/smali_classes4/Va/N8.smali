.class public abstract LVa/N8;
.super LVa/F8;
.source "SourceFile"


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(LVa/y8;LVa/y8;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/N8;->i:I

    invoke-direct {p0, p1, p2}, LVa/F8;-><init>(LVa/y8;LVa/y8;)V

    return-void
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 4

    .line 1
    iget v0, p0, LVa/N8;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LVa/s8;

    .line 7
    .line 8
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, LVa/s8;->a()Ljava/lang/Number;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, LVa/F8;->f()LVa/y8;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, LVa/s8;->a()Ljava/lang/Number;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, v1, p1}, LVa/N8;->i(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, LVa/F8;->f()LVa/y8;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, LVa/s8;->c()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :try_start_0
    new-instance p2, LVa/s8;

    .line 65
    .line 66
    new-instance v1, Ljava/math/BigDecimal;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Ljava/math/BigDecimal;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p0, v1}, LVa/N8;->l(I)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-direct {p2, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catch_0
    instance-of p2, v0, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz p2, :cond_0

    .line 103
    .line 104
    instance-of p2, p1, Ljava/lang/String;

    .line 105
    .line 106
    if-eqz p2, :cond_0

    .line 107
    .line 108
    new-instance p2, LVa/s8;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/String;

    .line 111
    .line 112
    check-cast p1, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p0, v0, p1}, LVa/N8;->k(Ljava/lang/String;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p2, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    new-instance p2, LVa/s8;

    .line 127
    .line 128
    invoke-virtual {p0, v0, p1}, LVa/N8;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p2, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :goto_0
    return-object p2

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract i(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;
.end method

.method public abstract j(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract k(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract l(I)Z
.end method
