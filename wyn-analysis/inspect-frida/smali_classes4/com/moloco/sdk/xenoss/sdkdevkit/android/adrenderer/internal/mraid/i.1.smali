.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->g:LK8/H;

    .line 29
    .line 30
    iput v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/i;->a:I

    .line 31
    .line 32
    iget-object v1, p1, LK8/H;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/N;

    .line 40
    .line 41
    iget-boolean p1, p1, LK8/H;->a:Z

    .line 42
    .line 43
    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v3, p1, v1, v5, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/N;-><init>(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;Ljava/lang/String;Ljf/c;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    check-cast p1, Lcom/moloco/sdk/internal/A;

    .line 56
    .line 57
    instance-of v0, p1, Lcom/moloco/sdk/internal/y;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_3
    iget-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->g:LK8/H;

    .line 63
    .line 64
    const-string v3, "mraidbridge.setSupports(false,false,false,false,true)"

    .line 65
    .line 66
    invoke-virtual {v1, v3}, LK8/H;->h(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;

    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v6, "mraidbridge.setPlacementType("

    .line 74
    .line 75
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v3}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/16 v3, 0x29

    .line 88
    .line 89
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v1, v5}, LK8/H;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->j:LK3/r;

    .line 100
    .line 101
    iget-object v6, v5, LK3/r;->f:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v6, LHf/x0;

    .line 104
    .line 105
    invoke-virtual {v6}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    new-instance v7, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v8, "mraidbridge.setIsViewable("

    .line 118
    .line 119
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1, v3}, LK8/H;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, v5, LK3/r;->i:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v3, LHf/x0;

    .line 138
    .line 139
    invoke-virtual {v3}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/I;

    .line 144
    .line 145
    iget-object v6, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/I;->a:LK3/r;

    .line 146
    .line 147
    invoke-virtual {v1, v6}, LK8/H;->b(LK3/r;)V

    .line 148
    .line 149
    .line 150
    sget-object v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;

    .line 151
    .line 152
    invoke-virtual {v4, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;)V

    .line 153
    .line 154
    .line 155
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/l;

    .line 156
    .line 157
    invoke-direct {v6, v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/l;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V

    .line 158
    .line 159
    .line 160
    const/4 v7, 0x3

    .line 161
    iget-object v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->h:LKd/a;

    .line 162
    .line 163
    invoke-static {v8, v2, v6, v7}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 164
    .line 165
    .line 166
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->g:LK8/H;

    .line 167
    .line 168
    iget-object v6, v6, LK8/H;->d:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, LHf/j0;

    .line 171
    .line 172
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/m;

    .line 173
    .line 174
    invoke-direct {v7, v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/m;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V

    .line 175
    .line 176
    .line 177
    new-instance v9, LHf/Z;

    .line 178
    .line 179
    const/4 v10, 0x0

    .line 180
    invoke-direct {v9, v6, v7, v10}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v9, v8}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 184
    .line 185
    .line 186
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n;

    .line 187
    .line 188
    invoke-direct {v6, v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V

    .line 189
    .line 190
    .line 191
    new-instance v7, LHf/Z;

    .line 192
    .line 193
    iget-object v5, v5, LK3/r;->f:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v5, LHf/x0;

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    invoke-direct {v7, v5, v6, v9}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v7, v8}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 202
    .line 203
    .line 204
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/o;

    .line 205
    .line 206
    invoke-direct {v5, v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/o;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;Ljf/c;)V

    .line 207
    .line 208
    .line 209
    new-instance v2, LHf/Z;

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-direct {v2, v3, v5, v4}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v8}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 216
    .line 217
    .line 218
    const-string v2, "mraidbridge.notifyReadyEvent()"

    .line 219
    .line 220
    invoke-virtual {v1, v2}, LK8/H;->h(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    instance-of v1, p1, Lcom/moloco/sdk/internal/z;

    .line 224
    .line 225
    if-eqz v1, :cond_4

    .line 226
    .line 227
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    const/4 v6, 0x0

    .line 231
    const-string v3, "MraidBaseAd"

    .line 232
    .line 233
    const-string v4, "Mraid Html data successfully loaded"

    .line 234
    .line 235
    const/16 v7, 0xc

    .line 236
    .line 237
    const/4 v8, 0x0

    .line 238
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    move-object v0, p1

    .line 242
    check-cast v0, Lcom/moloco/sdk/internal/z;

    .line 243
    .line 244
    iget-object v0, v0, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 247
    .line 248
    return-object p1

    .line 249
    :cond_4
    if-eqz v0, :cond_5

    .line 250
    .line 251
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 252
    .line 253
    const/4 v4, 0x0

    .line 254
    const/4 v5, 0x0

    .line 255
    const-string v2, "MraidBaseAd"

    .line 256
    .line 257
    const-string v3, "Mraid Html data load failed."

    .line 258
    .line 259
    const/16 v6, 0xc

    .line 260
    .line 261
    const/4 v7, 0x0

    .line 262
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :cond_5
    new-instance p1, LE5/Q;

    .line 267
    .line 268
    const/16 v0, 0x9

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 272
    .line 273
    .line 274
    throw p1
.end method
