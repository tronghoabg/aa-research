.class public final Lu0/L0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lu0/M0;

.field public final synthetic k:LV/d;


# direct methods
.method public synthetic constructor <init>(Lu0/M0;LV/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu0/L0;->i:I

    iput-object p1, p0, Lu0/L0;->j:Lu0/M0;

    iput-object p2, p0, Lu0/L0;->k:LV/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/L0;->k:LV/d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lu0/L0;->j:Lu0/M0;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    iget v6, p0, Lu0/L0;->i:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, LN/o;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 p2, p2, 0xb

    .line 24
    .line 25
    if-ne p2, v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, LN/o;->x()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object p2, v3, Lu0/M0;->a:Lu0/n;

    .line 40
    .line 41
    const v4, 0x7f0a0160

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    instance-of v6, p2, Ljava/util/Set;

    .line 49
    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    instance-of v6, p2, Luf/a;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    instance-of v6, p2, Luf/f;

    .line 57
    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    :cond_2
    move v6, v2

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v6, v5

    .line 63
    :goto_1
    const/4 v7, 0x0

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    check-cast p2, Ljava/util/Set;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move-object p2, v7

    .line 70
    :goto_2
    iget-object v6, v3, Lu0/M0;->a:Lu0/n;

    .line 71
    .line 72
    if-nez p2, :cond_9

    .line 73
    .line 74
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    instance-of v8, p2, Landroid/view/View;

    .line 79
    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    check-cast p2, Landroid/view/View;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    move-object p2, v7

    .line 86
    :goto_3
    if-eqz p2, :cond_6

    .line 87
    .line 88
    invoke-virtual {p2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move-object p2, v7

    .line 94
    :goto_4
    instance-of v4, p2, Ljava/util/Set;

    .line 95
    .line 96
    if-eqz v4, :cond_8

    .line 97
    .line 98
    instance-of v4, p2, Luf/a;

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    .line 102
    instance-of v4, p2, Luf/f;

    .line 103
    .line 104
    if-eqz v4, :cond_8

    .line 105
    .line 106
    :cond_7
    check-cast p2, Ljava/util/Set;

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    move-object p2, v7

    .line 110
    :cond_9
    :goto_5
    if-eqz p2, :cond_a

    .line 111
    .line 112
    iget-object v4, p1, LN/o;->c:LN/w0;

    .line 113
    .line 114
    invoke-interface {p2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    iput-boolean v2, p1, LN/o;->p:Z

    .line 118
    .line 119
    iput-boolean v2, p1, LN/o;->B:Z

    .line 120
    .line 121
    iget-object v4, p1, LN/o;->c:LN/w0;

    .line 122
    .line 123
    invoke-virtual {v4}, LN/w0;->c()V

    .line 124
    .line 125
    .line 126
    iget-object v4, p1, LN/o;->G:LN/w0;

    .line 127
    .line 128
    invoke-virtual {v4}, LN/w0;->c()V

    .line 129
    .line 130
    .line 131
    iget-object v4, p1, LN/o;->H:LN/y0;

    .line 132
    .line 133
    iget-object v8, v4, LN/y0;->a:LN/w0;

    .line 134
    .line 135
    iget-object v9, v8, LN/w0;->i:Ljava/util/HashMap;

    .line 136
    .line 137
    iput-object v9, v4, LN/y0;->e:Ljava/util/HashMap;

    .line 138
    .line 139
    iget-object v8, v8, LN/w0;->j:Lx/m;

    .line 140
    .line 141
    iput-object v8, v4, LN/y0;->f:Lx/m;

    .line 142
    .line 143
    :cond_a
    new-instance v4, Lu0/J0;

    .line 144
    .line 145
    invoke-direct {v4, v3, v7}, Lu0/J0;-><init>(Lu0/M0;Ljf/c;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1, v6, v4}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 149
    .line 150
    .line 151
    new-instance v4, Lu0/K0;

    .line 152
    .line 153
    invoke-direct {v4, v3, v7}, Lu0/K0;-><init>(Lu0/M0;Ljf/c;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p1, v6, v4}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 157
    .line 158
    .line 159
    sget-object v4, LY/b;->a:LN/L0;

    .line 160
    .line 161
    invoke-virtual {v4, p2}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    new-array v2, v2, [LN/g0;

    .line 166
    .line 167
    aput-object p2, v2, v5

    .line 168
    .line 169
    new-instance p2, Lu0/L0;

    .line 170
    .line 171
    invoke-direct {p2, v3, v1, v5}, Lu0/L0;-><init>(Lu0/M0;LV/d;I)V

    .line 172
    .line 173
    .line 174
    const v1, -0x4722c3de

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v1, p2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    const/16 v1, 0x38

    .line 182
    .line 183
    invoke-static {v2, p2, p1, v1}, LN/d;->a([LN/g0;LV/d;LN/o;I)V

    .line 184
    .line 185
    .line 186
    :goto_6
    return-object v0

    .line 187
    :pswitch_0
    check-cast p1, LN/o;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    and-int/lit8 p2, p2, 0xb

    .line 196
    .line 197
    if-ne p2, v4, :cond_c

    .line 198
    .line 199
    invoke-virtual {p1}, LN/o;->x()Z

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    if-nez p2, :cond_b

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_b
    invoke-virtual {p1}, LN/o;->I()V

    .line 207
    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_c
    :goto_7
    iget-object p2, v3, Lu0/M0;->a:Lu0/n;

    .line 211
    .line 212
    const/16 v2, 0x8

    .line 213
    .line 214
    invoke-static {p2, v1, p1, v2}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(Lu0/n;LV/d;LN/o;I)V

    .line 215
    .line 216
    .line 217
    :goto_8
    return-object v0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
