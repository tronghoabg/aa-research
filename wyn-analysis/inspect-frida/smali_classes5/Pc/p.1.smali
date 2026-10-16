.class public final LPc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQc/h;
.implements LUc/y;
.implements Ldd/j;
.implements Ldd/m;
.implements Lyc/C;
.implements Lyc/D;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lba/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lba/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LPc/p;->a:I

    iput-object p1, p0, LPc/p;->b:Ljava/util/ArrayList;

    iput-object p2, p0, LPc/p;->c:Lba/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LPc/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 7
    .line 8
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    check-cast p1, Ldd/l;

    .line 35
    .line 36
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    check-cast p1, Ljava/lang/Void;

    .line 49
    .line 50
    iget-object p1, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_4
    check-cast p1, Ljava/lang/Void;

    .line 64
    .line 65
    iget-object p1, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_5
    check-cast p1, LUc/v;

    .line 79
    .line 80
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 93
    .line 94
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_7
    check-cast p1, LUc/r;

    .line 107
    .line 108
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_8
    check-cast p1, LUc/r;

    .line 121
    .line 122
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 135
    .line 136
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 137
    .line 138
    const/4 v1, 0x0

    .line 139
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_a
    check-cast p1, Ljava/lang/Void;

    .line 149
    .line 150
    iget-object p1, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_b
    check-cast p1, LPc/M;

    .line 164
    .line 165
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_c
    check-cast p1, LPc/N;

    .line 178
    .line 179
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_d
    check-cast p1, LPc/M;

    .line 192
    .line 193
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 194
    .line 195
    const/4 v1, 0x0

    .line 196
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_e
    check-cast p1, LPc/N;

    .line 206
    .line 207
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 208
    .line 209
    const/4 v1, 0x0

    .line 210
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_f
    check-cast p1, LPc/M;

    .line 220
    .line 221
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 222
    .line 223
    const/4 v1, 0x0

    .line 224
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 228
    .line 229
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 234
    .line 235
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 248
    .line 249
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 250
    .line 251
    const/4 v1, 0x0

    .line 252
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_12
    check-cast p1, LPc/M;

    .line 262
    .line 263
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object p1, p0, LPc/p;->c:Lba/a;

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget v0, p0, LPc/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_5
    invoke-static {p1}, Lgc/b;->N(Ljava/lang/Exception;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_6
    invoke-static {p1}, Lgc/b;->N(Ljava/lang/Exception;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_7
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_8
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_9
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_a
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_b
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_c
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_d
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 151
    .line 152
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_e
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_f
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 171
    .line 172
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_10
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_11
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 191
    .line 192
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public c(Lyc/o;)V
    .locals 1

    .line 1
    iget v0, p0, LPc/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p1}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-static {p1}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ldd/g;)V
    .locals 1

    .line 1
    iget v0, p0, LPc/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ltg/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p1}, Ltg/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-static {p1}, Ltg/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LPc/p;->c:Lba/a;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public success()V
    .locals 3

    .line 1
    iget v0, p0, LPc/p;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_2
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_3
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :sswitch_4
    iget-object v0, p0, LPc/p;->b:Ljava/util/ArrayList;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, LPc/p;->c:Lba/a;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0x6 -> :sswitch_3
        0xa -> :sswitch_2
        0x14 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method
