.class public final LK/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LE/F;

.field public final synthetic k:LV/d;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(LE/F;LV/d;II)V
    .locals 0

    .line 1
    iput p4, p0, LK/b;->i:I

    iput-object p1, p0, LK/b;->j:LE/F;

    iput-object p2, p0, LK/b;->k:LV/d;

    iput p3, p0, LK/b;->l:I

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
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LK/b;->l:I

    .line 5
    .line 6
    iget-object v3, p0, LK/b;->j:LE/F;

    .line 7
    .line 8
    iget-object v4, p0, LK/b;->k:LV/d;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    iget v6, p0, LK/b;->i:I

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, LN/o;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int/lit8 p2, p2, 0xb

    .line 25
    .line 26
    if-ne p2, v5, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, LN/o;->x()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    sget-object p2, LK/M;->a:LN/L0;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, LK/L;

    .line 46
    .line 47
    iget-object p2, p2, LK/L;->k:Lz0/p;

    .line 48
    .line 49
    new-instance v5, LK/b;

    .line 50
    .line 51
    invoke-direct {v5, v3, v4, v2, v1}, LK/b;-><init>(LE/F;LV/d;II)V

    .line 52
    .line 53
    .line 54
    const v1, -0x25921360

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v1, v5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/16 v2, 0x30

    .line 62
    .line 63
    invoke-static {p2, v1, p1, v2}, LK/I;->a(Lz0/p;LV/d;LN/o;I)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-object v0

    .line 67
    :pswitch_0
    check-cast p1, LN/o;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    and-int/lit8 p2, p2, 0xb

    .line 76
    .line 77
    if-ne p2, v5, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1}, LN/o;->x()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {p1}, LN/o;->I()V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :cond_3
    :goto_2
    sget p2, LK/a;->b:F

    .line 92
    .line 93
    sget v5, LK/a;->c:F

    .line 94
    .line 95
    sget-object v6, LE/L;->a:LE/x;

    .line 96
    .line 97
    new-instance v6, LE/O;

    .line 98
    .line 99
    invoke-direct {v6, p2, v5}, LE/O;-><init>(FF)V

    .line 100
    .line 101
    .line 102
    invoke-static {v6, v3}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    sget-object v3, LE/i;->c:LE/b;

    .line 107
    .line 108
    shr-int/lit8 v2, v2, 0x12

    .line 109
    .line 110
    and-int/lit16 v2, v2, 0x1c00

    .line 111
    .line 112
    or-int/lit16 v2, v2, 0x1b0

    .line 113
    .line 114
    const v5, 0x2952b718

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v5}, LN/o;->M(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3, p1}, LE/J;->a(LE/c;LN/o;)Lr0/n;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const v5, -0x4ee9b9da

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v5}, LN/o;->M(I)V

    .line 128
    .line 129
    .line 130
    sget-object v5, Lu0/M;->e:LN/L0;

    .line 131
    .line 132
    invoke-virtual {p1, v5}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, LL0/b;

    .line 137
    .line 138
    sget-object v6, Lu0/M;->k:LN/L0;

    .line 139
    .line 140
    invoke-virtual {p1, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, LL0/i;

    .line 145
    .line 146
    sget-object v7, Lu0/M;->o:LN/L0;

    .line 147
    .line 148
    invoke-virtual {p1, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    check-cast v7, Lu0/p0;

    .line 153
    .line 154
    sget-object v8, Lt0/c;->g9:Lt0/b;

    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    sget-object v8, Lt0/b;->b:Lt0/d;

    .line 160
    .line 161
    invoke-static {p2}, LS3/f;->y(LZ/k;)LV/d;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p1}, LN/o;->O()V

    .line 166
    .line 167
    .line 168
    iget-boolean v9, p1, LN/o;->O:Z

    .line 169
    .line 170
    if-eqz v9, :cond_4

    .line 171
    .line 172
    invoke-virtual {p1, v8}, LN/o;->k(Ltf/a;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    invoke-virtual {p1}, LN/o;->X()V

    .line 177
    .line 178
    .line 179
    :goto_3
    iput-boolean v1, p1, LN/o;->x:Z

    .line 180
    .line 181
    sget-object v8, Lt0/b;->e:Lt0/a;

    .line 182
    .line 183
    invoke-static {p1, v3, v8}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 184
    .line 185
    .line 186
    sget-object v3, Lt0/b;->d:Lt0/a;

    .line 187
    .line 188
    invoke-static {p1, v5, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 189
    .line 190
    .line 191
    sget-object v3, Lt0/b;->f:Lt0/a;

    .line 192
    .line 193
    invoke-static {p1, v6, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 194
    .line 195
    .line 196
    sget-object v3, Lt0/b;->g:Lt0/a;

    .line 197
    .line 198
    invoke-static {p1, v7, v3, p1}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    const v5, 0x7ab4aae9

    .line 203
    .line 204
    .line 205
    invoke-static {v1, p2, v3, p1, v5}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 206
    .line 207
    .line 208
    const p2, -0x286e2e7f

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p2}, LN/o;->M(I)V

    .line 212
    .line 213
    .line 214
    sget-object p2, LE/K;->a:LE/K;

    .line 215
    .line 216
    shr-int/lit8 v2, v2, 0x6

    .line 217
    .line 218
    and-int/lit8 v2, v2, 0x70

    .line 219
    .line 220
    or-int/lit8 v2, v2, 0x6

    .line 221
    .line 222
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v4, p2, p1, v2}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    const/4 p2, 0x1

    .line 230
    invoke-static {p1, v1, v1, p2, v1}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v1}, LN/o;->p(Z)V

    .line 234
    .line 235
    .line 236
    :goto_4
    return-object v0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
