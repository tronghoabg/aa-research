.class public final LB3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB3/a;->a:I

    iput-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LB3/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, LB3/a;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lu0/b0;

    .line 19
    .line 20
    iget-object p2, p2, Lu0/b0;->a:LN/Y;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lef/C;->a:Lef/C;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Lea/o;

    .line 29
    .line 30
    iget-object p2, p0, LB3/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Lea/D;

    .line 33
    .line 34
    iget-object p2, p2, Lea/D;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, LB3/a;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, LHf/c0;

    .line 50
    .line 51
    check-cast p2, LHf/x0;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-virtual {p2, v0, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    sget-object p1, Lef/C;->a:Lef/C;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, LB3/a;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, LHf/x0;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {p2, v0, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    sget-object p1, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_0

    .line 86
    .line 87
    iget-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/o;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;

    .line 92
    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    const/4 p2, 0x1

    .line 96
    iput-boolean p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;->a:Z

    .line 97
    .line 98
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_4
    check-cast p1, Lef/C;

    .line 102
    .line 103
    iget-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Lcom/moloco/sdk/internal/publisher/i0;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/publisher/i0;->b()V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lef/C;->a:Lef/C;

    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_5
    check-cast p1, Lef/C;

    .line 114
    .line 115
    iget-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->getAdShowListener()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_1

    .line 124
    .line 125
    invoke-interface {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->b()V

    .line 126
    .line 127
    .line 128
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 129
    .line 130
    return-object p1

    .line 131
    :pswitch_6
    check-cast p1, Lef/u;

    .line 132
    .line 133
    iget p1, p1, Lef/u;->a:I

    .line 134
    .line 135
    new-instance v0, Lef/u;

    .line 136
    .line 137
    invoke-direct {v0, p1}, Lef/u;-><init>(I)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, LGf/t;

    .line 143
    .line 144
    check-cast p1, LGf/s;

    .line 145
    .line 146
    iget-object p1, p1, LGf/s;->d:LGf/e;

    .line 147
    .line 148
    invoke-interface {p1, v0, p2}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 153
    .line 154
    if-ne p1, p2, :cond_2

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 158
    .line 159
    :goto_0
    return-object p1

    .line 160
    :pswitch_7
    check-cast p1, Lef/C;

    .line 161
    .line 162
    iget-object p1, p0, LB3/a;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Lcom/moloco/sdk/internal/publisher/V;

    .line 165
    .line 166
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/V;->y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 167
    .line 168
    invoke-interface {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->b()V

    .line 169
    .line 170
    .line 171
    sget-object p1, Lef/C;->a:Lef/C;

    .line 172
    .line 173
    return-object p1

    .line 174
    :pswitch_8
    check-cast p1, LD/h;

    .line 175
    .line 176
    instance-of p2, p1, LD/e;

    .line 177
    .line 178
    iget-object v0, p0, LB3/a;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, LX/p;

    .line 181
    .line 182
    if-eqz p2, :cond_3

    .line 183
    .line 184
    invoke-virtual {v0, p1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_3
    instance-of p2, p1, LD/f;

    .line 189
    .line 190
    if-eqz p2, :cond_4

    .line 191
    .line 192
    check-cast p1, LD/f;

    .line 193
    .line 194
    iget-object p1, p1, LD/f;->a:LD/e;

    .line 195
    .line 196
    invoke-virtual {v0, p1}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_4
    instance-of p2, p1, LD/a;

    .line 201
    .line 202
    if-eqz p2, :cond_5

    .line 203
    .line 204
    invoke-virtual {v0, p1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_5
    instance-of p2, p1, LD/b;

    .line 209
    .line 210
    if-eqz p2, :cond_6

    .line 211
    .line 212
    check-cast p1, LD/b;

    .line 213
    .line 214
    iget-object p1, p1, LD/b;->a:LD/a;

    .line 215
    .line 216
    invoke-virtual {v0, p1}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_6
    instance-of p2, p1, LD/k;

    .line 221
    .line 222
    if-eqz p2, :cond_7

    .line 223
    .line 224
    invoke-virtual {v0, p1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_7
    instance-of p2, p1, LD/l;

    .line 229
    .line 230
    if-eqz p2, :cond_8

    .line 231
    .line 232
    check-cast p1, LD/l;

    .line 233
    .line 234
    iget-object p1, p1, LD/l;->a:LD/k;

    .line 235
    .line 236
    invoke-virtual {v0, p1}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_8
    instance-of p2, p1, LD/j;

    .line 241
    .line 242
    if-eqz p2, :cond_9

    .line 243
    .line 244
    check-cast p1, LD/j;

    .line 245
    .line 246
    iget-object p1, p1, LD/j;->a:LD/k;

    .line 247
    .line 248
    invoke-virtual {v0, p1}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    :cond_9
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 252
    .line 253
    return-object p1

    .line 254
    :pswitch_9
    iget-object p2, p0, LB3/a;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p2, LD3/i;

    .line 257
    .line 258
    invoke-virtual {p2, p1}, LD3/i;->accept(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    sget-object p1, Lef/C;->a:Lef/C;

    .line 262
    .line 263
    return-object p1

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
