.class public final LM0/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lt0/M;


# direct methods
.method public synthetic constructor <init>(Lt0/M;I)V
    .locals 0

    .line 1
    iput p2, p0, LM0/k;->i:I

    iput-object p1, p0, LM0/k;->j:Lt0/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LM0/k;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt0/t;

    .line 7
    .line 8
    check-cast p2, LL0/i;

    .line 9
    .line 10
    const-string v0, "$this$set"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "it"

    .line 16
    .line 17
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 21
    .line 22
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, LM0/o;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    if-ne p2, v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, LE5/Q;

    .line 40
    .line 41
    const/16 p2, 0x9

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    const/4 v0, 0x0

    .line 49
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lef/C;->a:Lef/C;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    check-cast p1, Lt0/t;

    .line 56
    .line 57
    check-cast p2, Ltf/l;

    .line 58
    .line 59
    const-string v0, "$this$set"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string p1, "it"

    .line 65
    .line 66
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 70
    .line 71
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    check-cast p1, LM0/o;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, LM0/o;->setUpdateBlock(Ltf/l;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lef/C;->a:Lef/C;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_1
    check-cast p1, Lt0/t;

    .line 85
    .line 86
    check-cast p2, Ln3/f;

    .line 87
    .line 88
    const-string v0, "$this$set"

    .line 89
    .line 90
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string p1, "it"

    .line 94
    .line 95
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 99
    .line 100
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast p1, LM0/o;

    .line 106
    .line 107
    invoke-virtual {p1, p2}, LM0/i;->setSavedStateRegistryOwner(Ln3/f;)V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lef/C;->a:Lef/C;

    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_2
    check-cast p1, Lt0/t;

    .line 114
    .line 115
    check-cast p2, Landroidx/lifecycle/v;

    .line 116
    .line 117
    const-string v0, "$this$set"

    .line 118
    .line 119
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string p1, "it"

    .line 123
    .line 124
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 128
    .line 129
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    check-cast p1, LM0/o;

    .line 135
    .line 136
    invoke-virtual {p1, p2}, LM0/i;->setLifecycleOwner(Landroidx/lifecycle/v;)V

    .line 137
    .line 138
    .line 139
    sget-object p1, Lef/C;->a:Lef/C;

    .line 140
    .line 141
    return-object p1

    .line 142
    :pswitch_3
    check-cast p1, Lt0/t;

    .line 143
    .line 144
    check-cast p2, LL0/b;

    .line 145
    .line 146
    const-string v0, "$this$set"

    .line 147
    .line 148
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string p1, "it"

    .line 152
    .line 153
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 157
    .line 158
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    check-cast p1, LM0/o;

    .line 164
    .line 165
    invoke-virtual {p1, p2}, LM0/i;->setDensity(LL0/b;)V

    .line 166
    .line 167
    .line 168
    sget-object p1, Lef/C;->a:Lef/C;

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_4
    check-cast p1, Lt0/t;

    .line 172
    .line 173
    check-cast p2, LZ/k;

    .line 174
    .line 175
    const-string v0, "$this$set"

    .line 176
    .line 177
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string p1, "it"

    .line 181
    .line 182
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, LM0/k;->j:Lt0/M;

    .line 186
    .line 187
    iget-object p1, p1, Lt0/M;->a:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    check-cast p1, LM0/o;

    .line 193
    .line 194
    invoke-virtual {p1, p2}, LM0/i;->setModifier(LZ/k;)V

    .line 195
    .line 196
    .line 197
    sget-object p1, Lef/C;->a:Lef/C;

    .line 198
    .line 199
    return-object p1

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
