.class public final synthetic LV5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/os/Handler$Callback;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Handler$Callback;I)V
    .locals 0

    .line 1
    iput p3, p0, LV5/a;->a:I

    iput-object p1, p0, LV5/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LV5/a;->b:Landroid/os/Handler$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 2

    .line 1
    iget p1, p0, LV5/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LV5/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LX2/j;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LV5/a;->b:Landroid/os/Handler$Callback;

    .line 14
    .line 15
    check-cast p1, Lq2/d;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget p4, LQ1/x;->a:I

    .line 21
    .line 22
    const/16 p5, 0x1e

    .line 23
    .line 24
    if-ge p4, p5, :cond_0

    .line 25
    .line 26
    iget-object p1, p1, Lq2/d;->b:Landroid/os/Handler;

    .line 27
    .line 28
    const/16 p4, 0x20

    .line 29
    .line 30
    shr-long p4, p2, p4

    .line 31
    .line 32
    long-to-int p4, p4

    .line 33
    long-to-int p2, p2

    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-static {p1, p3, p4, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1, p2, p3}, Lq2/d;->a(J)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :pswitch_0
    iget-object p1, p0, LV5/a;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ld2/a;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LV5/a;->b:Landroid/os/Handler$Callback;

    .line 55
    .line 56
    check-cast p1, Lq2/d;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget p4, LQ1/x;->a:I

    .line 62
    .line 63
    const/16 p5, 0x1e

    .line 64
    .line 65
    if-ge p4, p5, :cond_1

    .line 66
    .line 67
    iget-object p1, p1, Lq2/d;->b:Landroid/os/Handler;

    .line 68
    .line 69
    const/16 p4, 0x20

    .line 70
    .line 71
    shr-long p4, p2, p4

    .line 72
    .line 73
    long-to-int p4, p4

    .line 74
    long-to-int p2, p2

    .line 75
    const/4 p3, 0x0

    .line 76
    invoke-static {p1, p3, p4, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p1, p2, p3}, Lq2/d;->a(J)V

    .line 85
    .line 86
    .line 87
    :goto_1
    return-void

    .line 88
    :pswitch_1
    iget-object p1, p0, LV5/a;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, LDd/c;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, LV5/a;->b:Landroid/os/Handler$Callback;

    .line 96
    .line 97
    check-cast p1, Lq2/d;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget p4, Lu6/v;->a:I

    .line 103
    .line 104
    const/16 p5, 0x1e

    .line 105
    .line 106
    if-ge p4, p5, :cond_2

    .line 107
    .line 108
    iget-object p1, p1, Lq2/d;->b:Landroid/os/Handler;

    .line 109
    .line 110
    const/16 p4, 0x20

    .line 111
    .line 112
    shr-long p4, p2, p4

    .line 113
    .line 114
    long-to-int p4, p4

    .line 115
    long-to-int p2, p2

    .line 116
    const/4 p3, 0x0

    .line 117
    invoke-static {p1, p3, p4, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    iget-object p4, p1, Lq2/d;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p4, Lv6/f;

    .line 128
    .line 129
    iget-object p5, p4, Lv6/f;->l1:Lq2/d;

    .line 130
    .line 131
    if-eq p1, p5, :cond_3

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    const-wide v0, 0x7fffffffffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    cmp-long p1, p2, v0

    .line 140
    .line 141
    const/4 p5, 0x1

    .line 142
    if-nez p1, :cond_4

    .line 143
    .line 144
    iput-boolean p5, p4, LV5/q;->x0:Z

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    :try_start_0
    invoke-virtual {p4, p2, p3}, LV5/q;->o0(J)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4}, Lv6/f;->w0()V

    .line 151
    .line 152
    .line 153
    iget-object p1, p4, LV5/q;->z0:LH5/e;

    .line 154
    .line 155
    iget v0, p1, LH5/e;->f:I

    .line 156
    .line 157
    add-int/2addr v0, p5

    .line 158
    iput v0, p1, LH5/e;->f:I

    .line 159
    .line 160
    invoke-virtual {p4}, Lv6/f;->v0()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p4, p2, p3}, Lv6/f;->X(J)V
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_0
    move-exception p1

    .line 168
    iput-object p1, p4, LV5/q;->y0:LE5/o;

    .line 169
    .line 170
    :goto_2
    return-void

    .line 171
    :pswitch_2
    iget-object p1, p0, LV5/a;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, LLc/b;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, LV5/a;->b:Landroid/os/Handler$Callback;

    .line 179
    .line 180
    check-cast p1, Lq2/d;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget p4, Lu6/v;->a:I

    .line 186
    .line 187
    const/16 p5, 0x1e

    .line 188
    .line 189
    if-ge p4, p5, :cond_5

    .line 190
    .line 191
    iget-object p1, p1, Lq2/d;->b:Landroid/os/Handler;

    .line 192
    .line 193
    const/16 p4, 0x20

    .line 194
    .line 195
    shr-long p4, p2, p4

    .line 196
    .line 197
    long-to-int p4, p4

    .line 198
    long-to-int p2, p2

    .line 199
    const/4 p3, 0x0

    .line 200
    invoke-static {p1, p3, p4, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    iget-object p4, p1, Lq2/d;->c:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p4, Lv6/f;

    .line 211
    .line 212
    iget-object p5, p4, Lv6/f;->l1:Lq2/d;

    .line 213
    .line 214
    if-eq p1, p5, :cond_6

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_6
    const-wide v0, 0x7fffffffffffffffL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    cmp-long p1, p2, v0

    .line 223
    .line 224
    const/4 p5, 0x1

    .line 225
    if-nez p1, :cond_7

    .line 226
    .line 227
    iput-boolean p5, p4, LV5/q;->x0:Z

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_7
    :try_start_1
    invoke-virtual {p4, p2, p3}, LV5/q;->o0(J)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p4}, Lv6/f;->w0()V

    .line 234
    .line 235
    .line 236
    iget-object p1, p4, LV5/q;->z0:LH5/e;

    .line 237
    .line 238
    iget v0, p1, LH5/e;->f:I

    .line 239
    .line 240
    add-int/2addr v0, p5

    .line 241
    iput v0, p1, LH5/e;->f:I

    .line 242
    .line 243
    invoke-virtual {p4}, Lv6/f;->v0()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p4, p2, p3}, Lv6/f;->X(J)V
    :try_end_1
    .catch LE5/o; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :catch_1
    move-exception p1

    .line 251
    iput-object p1, p4, LV5/q;->y0:LE5/o;

    .line 252
    .line 253
    :goto_3
    return-void

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
