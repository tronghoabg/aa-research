.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;


# instance fields
.field public final a:LHf/x0;

.field public final b:LHf/e0;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

.field public final synthetic d:Lcom/moloco/sdk/internal/services/events/c;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;Lcom/moloco/sdk/internal/services/events/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->d:Lcom/moloco/sdk/internal/services/events/c;

    .line 7
    .line 8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->a:LHf/x0;

    .line 15
    .line 16
    new-instance p2, LHf/e0;

    .line 17
    .line 18
    invoke-direct {p2, p1}, LHf/e0;-><init>(LHf/c0;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->b:LHf/e0;

    .line 22
    .line 23
    return-void
.end method

.method public static final b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;Llf/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;

    .line 15
    .line 16
    iget v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->d:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->d:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;Llf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->d:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v7, :cond_1

    .line 44
    .line 45
    iget-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;

    .line 46
    .line 47
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 63
    .line 64
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 65
    .line 66
    iget-object v9, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->p:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v12, 0x4

    .line 69
    const/4 v13, 0x0

    .line 70
    const-string v10, "Preparing banner"

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    invoke-static/range {v8 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    sget-object v5, LEf/S;->a:LLf/e;

    .line 83
    .line 84
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/g0;

    .line 85
    .line 86
    invoke-direct {v8, v1, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/g0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;Ljf/c;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;

    .line 90
    .line 91
    iput v7, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/d0;->d:I

    .line 92
    .line 93
    invoke-static {v5, v8, v3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-ne v1, v4, :cond_3

    .line 98
    .line 99
    return-object v4

    .line 100
    :cond_3
    :goto_1
    move-object v5, v1

    .line 101
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 102
    .line 103
    :cond_4
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a0;->a:[I

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    aget v1, v1, v3

    .line 110
    .line 111
    packed-switch v1, :pswitch_data_0

    .line 112
    .line 113
    .line 114
    new-instance v0, LE5/Q;

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :pswitch_0
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 123
    .line 124
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 125
    .line 126
    iget-object v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->p:Ljava/lang/String;

    .line 127
    .line 128
    const/16 v12, 0xc

    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const-string v9, "Unknown creative type for timeout error"

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_5

    .line 139
    .line 140
    :pswitch_1
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 141
    .line 142
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 143
    .line 144
    iget-object v15, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->p:Ljava/lang/String;

    .line 145
    .line 146
    const/16 v19, 0xc

    .line 147
    .line 148
    const/16 v20, 0x0

    .line 149
    .line 150
    const-string v16, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead."

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/16 v18, 0x0

    .line 155
    .line 156
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :pswitch_2
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;

    .line 162
    .line 163
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 164
    .line 165
    iget-object v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->g:Landroid/content/Context;

    .line 166
    .line 167
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->h:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 168
    .line 169
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 170
    .line 171
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/w;->e:Lcom/moloco/sdk/internal/ortb/model/b0;

    .line 172
    .line 173
    if-eqz v3, :cond_5

    .line 174
    .line 175
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/b0;->a:Lcom/moloco/sdk/internal/ortb/model/s;

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    move-object v3, v6

    .line 179
    :goto_2
    if-eqz v3, :cond_6

    .line 180
    .line 181
    move v11, v7

    .line 182
    :goto_3
    move-object v7, v10

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move v11, v2

    .line 185
    goto :goto_3

    .line 186
    :goto_4
    iget-object v10, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->o:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 187
    .line 188
    const/16 v12, 0x22

    .line 189
    .line 190
    iget-object v9, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->n:Lcom/moloco/sdk/internal/services/B;

    .line 191
    .line 192
    invoke-direct/range {v7 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;ZI)V

    .line 193
    .line 194
    .line 195
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;

    .line 196
    .line 197
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 198
    .line 199
    iget-object v8, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->g:Landroid/content/Context;

    .line 200
    .line 201
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/g;

    .line 202
    .line 203
    iget-object v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->h:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 204
    .line 205
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 208
    .line 209
    invoke-direct {v11, v4, v5, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/g;-><init>(Ljava/lang/String;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;)V

    .line 210
    .line 211
    .line 212
    iget-object v9, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 213
    .line 214
    iget-object v12, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 215
    .line 216
    move-object v10, v7

    .line 217
    move-object v7, v1

    .line 218
    invoke-direct/range {v7 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;-><init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/g;LKd/a;)V

    .line 219
    .line 220
    .line 221
    iput-object v7, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :pswitch_3
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 225
    .line 226
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 227
    .line 228
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 229
    .line 230
    iget-object v8, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->g:Landroid/content/Context;

    .line 231
    .line 232
    iget-object v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->h:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 233
    .line 234
    iget-object v9, v4, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v11, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 237
    .line 238
    iget-object v12, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 239
    .line 240
    iget-object v10, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 241
    .line 242
    invoke-direct/range {v7 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LKd/a;)V

    .line 243
    .line 244
    .line 245
    iput-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->t:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :pswitch_4
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 249
    .line 250
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->l:Lcom/moloco/sdk/internal/b;

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v4, LBf/g;

    .line 256
    .line 257
    const/4 v5, 0x4

    .line 258
    invoke-direct {v4, v5, v1, v3}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    sget-object v1, Lcom/moloco/sdk/internal/scheduling/c;->a:LKd/a;

    .line 262
    .line 263
    new-instance v1, Lcom/moloco/sdk/internal/scheduling/b;

    .line 264
    .line 265
    invoke-direct {v1, v4, v6}, Lcom/moloco/sdk/internal/scheduling/b;-><init>(Ltf/a;Ljf/c;)V

    .line 266
    .line 267
    .line 268
    const/4 v3, 0x3

    .line 269
    sget-object v4, Lcom/moloco/sdk/internal/scheduling/c;->a:LKd/a;

    .line 270
    .line 271
    invoke-static {v4, v6, v1, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 272
    .line 273
    .line 274
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/J;

    .line 275
    .line 276
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 277
    .line 278
    iget-object v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->g:Landroid/content/Context;

    .line 279
    .line 280
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 281
    .line 282
    iget-object v10, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 283
    .line 284
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 285
    .line 286
    invoke-static {v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->b(Landroid/content/Context;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-static {}, Lcom/moloco/sdk/service_locator/a;->a()LY2/B;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    iget-object v12, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->h:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 295
    .line 296
    iget-object v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 297
    .line 298
    const/16 v16, 0x1

    .line 299
    .line 300
    const/16 v17, 0x0

    .line 301
    .line 302
    invoke-direct/range {v11 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;-><init>(Lcom/moloco/sdk/internal/ortb/model/u;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;LY2/B;ZLcom/moloco/sdk/acm/recorder/c;)V

    .line 303
    .line 304
    .line 305
    move-object v12, v13

    .line 306
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->d:Lcom/moloco/sdk/internal/services/events/c;

    .line 307
    .line 308
    move-object v13, v11

    .line 309
    iget-object v11, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 310
    .line 311
    invoke-direct/range {v7 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/J;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;)V

    .line 312
    .line 313
    .line 314
    iput-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->s:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/J;

    .line 315
    .line 316
    :goto_5
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 317
    .line 318
    invoke-static {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 323
    .line 324
    if-eqz v1, :cond_7

    .line 325
    .line 326
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->isLoaded()LHf/v0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    if-eqz v1, :cond_7

    .line 331
    .line 332
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/e0;

    .line 333
    .line 334
    invoke-direct {v4, v0, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/e0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;Ljf/c;)V

    .line 335
    .line 336
    .line 337
    new-instance v0, LHf/Z;

    .line 338
    .line 339
    invoke-direct {v0, v1, v4, v2}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 340
    .line 341
    .line 342
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 343
    .line 344
    invoke-static {v0, v1}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 345
    .line 346
    .line 347
    :cond_7
    invoke-static {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    if-eqz v0, :cond_8

    .line 352
    .line 353
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->l()LHf/v0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-eqz v0, :cond_8

    .line 358
    .line 359
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/f0;

    .line 360
    .line 361
    invoke-direct {v1, v3, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/f0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;Ljf/c;)V

    .line 362
    .line 363
    .line 364
    new-instance v4, LHf/Z;

    .line 365
    .line 366
    invoke-direct {v4, v0, v1, v2}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 367
    .line 368
    .line 369
    iget-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 370
    .line 371
    invoke-static {v4, v0}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 372
    .line 373
    .line 374
    :cond_8
    invoke-virtual {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->getAdShowListener()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/j;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v3, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->setAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/j;)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Lef/C;->a:Lef/C;

    .line 382
    .line 383
    return-object v0

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V
    .locals 8

    .line 1
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 2
    .line 3
    iget-object v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;->m:LKd/a;

    .line 4
    .line 5
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c0;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-wide v3, p1

    .line 10
    move-object v5, p3

    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Ljf/c;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {v7, p2, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/h0;->b:LHf/e0;

    .line 2
    .line 3
    return-object v0
.end method
