.class public final Lz/m;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lz/n;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lz/n;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lz/m;->i:I

    iput-object p1, p0, Lz/m;->j:Lz/n;

    iput-wide p2, p0, Lz/m;->k:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x9

    .line 3
    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Lz/m;->j:Lz/n;

    .line 7
    .line 8
    const-string v5, "it"

    .line 9
    .line 10
    iget v6, p0, Lz/m;->i:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lz/f;

    .line 16
    .line 17
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v5, v4, Lz/n;->f:LZ/d;

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    sget-wide v0, LL0/g;->b:J

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    iget-object v5, v4, Lz/n;->e:LN/V;

    .line 32
    .line 33
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    sget-wide v0, LL0/g;->b:J

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_1
    iget-object v6, v4, Lz/n;->f:LZ/d;

    .line 44
    .line 45
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    sget-wide v0, LL0/g;->b:J

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    if-eq p1, v3, :cond_5

    .line 65
    .line 66
    if-ne p1, v2, :cond_4

    .line 67
    .line 68
    iget-object p1, v4, Lz/n;->d:LN/V;

    .line 69
    .line 70
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lz/e;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    new-instance v0, LL0/h;

    .line 79
    .line 80
    iget-wide v7, p0, Lz/m;->k:J

    .line 81
    .line 82
    invoke-direct {v0, v7, v8}, LL0/h;-><init>(J)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p1, Lz/e;->b:Ltf/l;

    .line 86
    .line 87
    invoke-interface {p1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, LL0/h;

    .line 92
    .line 93
    iget-wide v9, p1, LL0/h;->a:J

    .line 94
    .line 95
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v6, p1

    .line 103
    check-cast v6, LZ/d;

    .line 104
    .line 105
    sget-object v11, LL0/i;->a:LL0/i;

    .line 106
    .line 107
    invoke-virtual/range {v6 .. v11}, LZ/d;->a(JJLL0/i;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    iget-object v6, v4, Lz/n;->f:LZ/d;

    .line 112
    .line 113
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v6 .. v11}, LZ/d;->a(JJLL0/i;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    sget p1, LL0/g;->c:I

    .line 121
    .line 122
    const/16 p1, 0x20

    .line 123
    .line 124
    shr-long v4, v0, p1

    .line 125
    .line 126
    long-to-int v4, v4

    .line 127
    shr-long v5, v2, p1

    .line 128
    .line 129
    long-to-int p1, v5

    .line 130
    sub-int/2addr v4, p1

    .line 131
    const-wide v5, 0xffffffffL

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    and-long/2addr v0, v5

    .line 137
    long-to-int p1, v0

    .line 138
    and-long v0, v2, v5

    .line 139
    .line 140
    long-to-int v0, v0

    .line 141
    sub-int/2addr p1, v0

    .line 142
    invoke-static {v4, p1}, LA6/h;->b(II)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    goto :goto_0

    .line 147
    :cond_3
    sget-wide v0, LL0/g;->b:J

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    new-instance p1, LE5/Q;

    .line 151
    .line 152
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(BI)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_5
    sget-wide v0, LL0/g;->b:J

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_6
    sget-wide v0, LL0/g;->b:J

    .line 160
    .line 161
    :goto_0
    new-instance p1, LL0/g;

    .line 162
    .line 163
    invoke-direct {p1, v0, v1}, LL0/g;-><init>(J)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :pswitch_0
    check-cast p1, Lz/f;

    .line 168
    .line 169
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v5, v4, Lz/n;->c:LN/V;

    .line 176
    .line 177
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, Lz/e;

    .line 182
    .line 183
    iget-wide v6, p0, Lz/m;->k:J

    .line 184
    .line 185
    if-eqz v5, :cond_7

    .line 186
    .line 187
    new-instance v8, LL0/h;

    .line 188
    .line 189
    invoke-direct {v8, v6, v7}, LL0/h;-><init>(J)V

    .line 190
    .line 191
    .line 192
    iget-object v5, v5, Lz/e;->b:Ltf/l;

    .line 193
    .line 194
    invoke-interface {v5, v8}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, LL0/h;

    .line 199
    .line 200
    iget-wide v8, v5, LL0/h;->a:J

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_7
    move-wide v8, v6

    .line 204
    :goto_1
    iget-object v4, v4, Lz/n;->d:LN/V;

    .line 205
    .line 206
    invoke-interface {v4}, LN/K0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lz/e;

    .line 211
    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    new-instance v5, LL0/h;

    .line 215
    .line 216
    invoke-direct {v5, v6, v7}, LL0/h;-><init>(J)V

    .line 217
    .line 218
    .line 219
    iget-object v4, v4, Lz/e;->b:Ltf/l;

    .line 220
    .line 221
    invoke-interface {v4, v5}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, LL0/h;

    .line 226
    .line 227
    iget-wide v4, v4, LL0/h;->a:J

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_8
    move-wide v4, v6

    .line 231
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_a

    .line 236
    .line 237
    if-eq p1, v3, :cond_b

    .line 238
    .line 239
    if-ne p1, v2, :cond_9

    .line 240
    .line 241
    move-wide v6, v4

    .line 242
    goto :goto_3

    .line 243
    :cond_9
    new-instance p1, LE5/Q;

    .line 244
    .line 245
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(BI)V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_a
    move-wide v6, v8

    .line 250
    :cond_b
    :goto_3
    new-instance p1, LL0/h;

    .line 251
    .line 252
    invoke-direct {p1, v6, v7}, LL0/h;-><init>(J)V

    .line 253
    .line 254
    .line 255
    return-object p1

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
