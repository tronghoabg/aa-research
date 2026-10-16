.class public final LHf/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/l;

.field public final synthetic c:Llf/j;


# direct methods
.method public constructor <init>(LHf/l;Ltf/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LHf/v;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LHf/v;->b:LHf/l;

    check-cast p2, Llf/j;

    iput-object p2, p0, LHf/v;->c:Llf/j;

    return-void
.end method

.method public constructor <init>(LHf/l;Ltf/q;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LHf/v;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LHf/v;->b:LHf/l;

    check-cast p2, Llf/j;

    iput-object p2, p0, LHf/v;->c:Llf/j;

    return-void
.end method

.method public constructor <init>(Ltf/p;LHf/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LHf/v;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    check-cast p1, Llf/j;

    iput-object p1, p0, LHf/v;->c:Llf/j;

    iput-object p2, p0, LHf/v;->b:LHf/l;

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LHf/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/C;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, LHf/j;

    .line 12
    .line 13
    iget-object v2, p0, LHf/v;->c:Llf/j;

    .line 14
    .line 15
    invoke-direct {v1, v0, p1, v2}, LHf/j;-><init>(Lkotlin/jvm/internal/C;LHf/m;Ltf/p;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LHf/v;->b:LHf/l;

    .line 19
    .line 20
    invoke-interface {p1, v1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 30
    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    instance-of v0, p2, LHf/w;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, LHf/w;

    .line 38
    .line 39
    iget v1, v0, LHf/w;->b:I

    .line 40
    .line 41
    const/high16 v2, -0x80000000

    .line 42
    .line 43
    and-int v3, v1, v2

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    sub-int/2addr v1, v2

    .line 48
    iput v1, v0, LHf/w;->b:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v0, LHf/w;

    .line 52
    .line 53
    invoke-direct {v0, p0, p2}, LHf/w;-><init>(LHf/v;Ljf/c;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object p2, v0, LHf/w;->a:Ljava/lang/Object;

    .line 57
    .line 58
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 59
    .line 60
    iget v2, v0, LHf/w;->b:I

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    const/4 v4, 0x1

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    if-eq v2, v4, :cond_3

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_3
    iget-object p1, v0, LHf/w;->e:LHf/m;

    .line 83
    .line 84
    iget-object v2, v0, LHf/w;->d:LHf/v;

    .line 85
    .line 86
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object p0, v0, LHf/w;->d:LHf/v;

    .line 94
    .line 95
    iput-object p1, v0, LHf/w;->e:LHf/m;

    .line 96
    .line 97
    iput v4, v0, LHf/w;->b:I

    .line 98
    .line 99
    iget-object p2, p0, LHf/v;->b:LHf/l;

    .line 100
    .line 101
    invoke-static {p2, p1, v0}, LHf/k0;->i(LHf/l;LHf/m;Llf/c;)Ljava/io/Serializable;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-ne p2, v1, :cond_5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v2, p0

    .line 109
    :goto_2
    check-cast p2, Ljava/lang/Throwable;

    .line 110
    .line 111
    if-eqz p2, :cond_6

    .line 112
    .line 113
    iget-object v2, v2, LHf/v;->c:Llf/j;

    .line 114
    .line 115
    const/4 v4, 0x0

    .line 116
    iput-object v4, v0, LHf/w;->d:LHf/v;

    .line 117
    .line 118
    iput-object v4, v0, LHf/w;->e:LHf/m;

    .line 119
    .line 120
    iput v3, v0, LHf/w;->b:I

    .line 121
    .line 122
    invoke-interface {v2, p1, p2, v0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v1, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    :goto_3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 130
    .line 131
    :goto_4
    return-object v1

    .line 132
    :pswitch_1
    instance-of v0, p2, LHf/u;

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    move-object v0, p2

    .line 137
    check-cast v0, LHf/u;

    .line 138
    .line 139
    iget v1, v0, LHf/u;->b:I

    .line 140
    .line 141
    const/high16 v2, -0x80000000

    .line 142
    .line 143
    and-int v3, v1, v2

    .line 144
    .line 145
    if-eqz v3, :cond_7

    .line 146
    .line 147
    sub-int/2addr v1, v2

    .line 148
    iput v1, v0, LHf/u;->b:I

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    new-instance v0, LHf/u;

    .line 152
    .line 153
    invoke-direct {v0, p0, p2}, LHf/u;-><init>(LHf/v;Ljf/c;)V

    .line 154
    .line 155
    .line 156
    :goto_5
    iget-object p2, v0, LHf/u;->a:Ljava/lang/Object;

    .line 157
    .line 158
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 159
    .line 160
    iget v2, v0, LHf/u;->b:I

    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    const/4 v4, 0x1

    .line 164
    if-eqz v2, :cond_a

    .line 165
    .line 166
    if-eq v2, v4, :cond_9

    .line 167
    .line 168
    if-ne v2, v3, :cond_8

    .line 169
    .line 170
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 177
    .line 178
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_9
    iget-object p1, v0, LHf/u;->f:LIf/z;

    .line 183
    .line 184
    iget-object v2, v0, LHf/u;->e:LHf/m;

    .line 185
    .line 186
    iget-object v4, v0, LHf/u;->d:LHf/v;

    .line 187
    .line 188
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :catchall_0
    move-exception p2

    .line 193
    goto :goto_9

    .line 194
    :cond_a
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    new-instance p2, LIf/z;

    .line 198
    .line 199
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {p2, p1, v2}, LIf/z;-><init>(LHf/m;Ljf/h;)V

    .line 204
    .line 205
    .line 206
    :try_start_1
    iget-object v2, p0, LHf/v;->c:Llf/j;

    .line 207
    .line 208
    iput-object p0, v0, LHf/u;->d:LHf/v;

    .line 209
    .line 210
    iput-object p1, v0, LHf/u;->e:LHf/m;

    .line 211
    .line 212
    iput-object p2, v0, LHf/u;->f:LIf/z;

    .line 213
    .line 214
    iput v4, v0, LHf/u;->b:I

    .line 215
    .line 216
    invoke-interface {v2, p2, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    if-ne v2, v1, :cond_b

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_b
    move-object v4, p0

    .line 224
    move-object v2, p1

    .line 225
    move-object p1, p2

    .line 226
    :goto_6
    invoke-virtual {p1}, Llf/c;->releaseIntercepted()V

    .line 227
    .line 228
    .line 229
    iget-object p1, v4, LHf/v;->b:LHf/l;

    .line 230
    .line 231
    const/4 p2, 0x0

    .line 232
    iput-object p2, v0, LHf/u;->d:LHf/v;

    .line 233
    .line 234
    iput-object p2, v0, LHf/u;->e:LHf/m;

    .line 235
    .line 236
    iput-object p2, v0, LHf/u;->f:LIf/z;

    .line 237
    .line 238
    iput v3, v0, LHf/u;->b:I

    .line 239
    .line 240
    invoke-interface {p1, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-ne p1, v1, :cond_c

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_c
    :goto_7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 248
    .line 249
    :goto_8
    return-object v1

    .line 250
    :catchall_1
    move-exception p1

    .line 251
    move-object v5, p2

    .line 252
    move-object p2, p1

    .line 253
    move-object p1, v5

    .line 254
    :goto_9
    invoke-virtual {p1}, Llf/c;->releaseIntercepted()V

    .line 255
    .line 256
    .line 257
    throw p2

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
