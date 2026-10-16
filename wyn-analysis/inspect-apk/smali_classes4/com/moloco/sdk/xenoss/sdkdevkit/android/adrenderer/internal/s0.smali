.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/moloco/sdk/internal/services/events/c;

.field public final c:Lcom/moloco/sdk/internal/ortb/model/u;

.field public final d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

.field public final e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

.field public final f:Lcom/moloco/sdk/acm/recorder/c;

.field public g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

.field public final h:LKd/a;

.field public i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

.field public j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

.field public k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

.field public final l:Lab/b;

.field public final m:LHf/x0;

.field public final n:LHf/x0;

.field public final o:LHf/x0;

.field public final p:LHf/x0;

.field public final q:LHf/x0;

.field public final r:LHf/x0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    .line 1
    const-string v0, "bid"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 23
    .line 24
    sget-object p1, LEf/S;->a:LLf/e;

    .line 25
    .line 26
    sget-object p1, LJf/n;->a:LFf/e;

    .line 27
    .line 28
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->h:LKd/a;

    .line 33
    .line 34
    new-instance p1, Lab/b;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->l:Lab/b;

    .line 40
    .line 41
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->m:LHf/x0;

    .line 48
    .line 49
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->n:LHf/x0;

    .line 50
    .line 51
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->o:LHf/x0;

    .line 56
    .line 57
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->p:LHf/x0;

    .line 58
    .line 59
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->q:LHf/x0;

    .line 64
    .line 65
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->r:LHf/x0;

    .line 66
    .line 67
    return-void
.end method

.method public static final b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Llf/c;)Ljava/lang/Object;
    .locals 24

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
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;

    .line 15
    .line 16
    iget v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->d:I

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
    iput v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->d:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Llf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->d:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    iget-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

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
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 63
    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    sget-object v1, LEf/S;->a:LLf/e;

    .line 67
    .line 68
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/r0;

    .line 69
    .line 70
    invoke-direct {v5, v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/r0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Ljf/c;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 74
    .line 75
    iput v6, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/n0;->d:I

    .line 76
    .line 77
    invoke-static {v1, v5, v3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-ne v1, v4, :cond_3

    .line 82
    .line 83
    return-object v4

    .line 84
    :cond_3
    :goto_1
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 85
    .line 86
    :cond_4
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/k0;->a:[I

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    aget v1, v3, v1

    .line 93
    .line 94
    packed-switch v1, :pswitch_data_0

    .line 95
    .line 96
    .line 97
    new-instance v0, LE5/Q;

    .line 98
    .line 99
    const/16 v1, 0x9

    .line 100
    .line 101
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :pswitch_0
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const/16 v13, 0xc

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const-string v9, "AggregatedFullscreenAd"

    .line 114
    .line 115
    const-string v10, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format."

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :pswitch_1
    sget-object v15, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/16 v20, 0xc

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const-string v16, "AggregatedFullscreenAd"

    .line 134
    .line 135
    const-string v17, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead."

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    invoke-static/range {v15 .. v21}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_3

    .line 145
    .line 146
    :pswitch_2
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->l:Lab/b;

    .line 147
    .line 148
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 149
    .line 150
    iget-object v11, v3, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->a:Landroid/content/Context;

    .line 156
    .line 157
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 158
    .line 159
    const-string v1, "adm"

    .line 160
    .line 161
    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 165
    .line 166
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 167
    .line 168
    iget-object v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 169
    .line 170
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 171
    .line 172
    invoke-direct/range {v8 .. v14}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 173
    .line 174
    .line 175
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :pswitch_3
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->l:Lab/b;

    .line 180
    .line 181
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 182
    .line 183
    iget-object v4, v3, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 184
    .line 185
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 186
    .line 187
    if-eqz v4, :cond_5

    .line 188
    .line 189
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 190
    .line 191
    if-eqz v4, :cond_5

    .line 192
    .line 193
    iget-boolean v4, v4, Lcom/moloco/sdk/internal/ortb/model/f0;->a:Z

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    move v4, v2

    .line 197
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->a:Landroid/content/Context;

    .line 201
    .line 202
    const-string v1, "scope"

    .line 203
    .line 204
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->h:LKd/a;

    .line 205
    .line 206
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 210
    .line 211
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 212
    .line 213
    const-string v6, "isAdDisplaying"

    .line 214
    .line 215
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->o:LHf/x0;

    .line 216
    .line 217
    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 221
    .line 222
    new-instance v11, LK8/H;

    .line 223
    .line 224
    invoke-direct {v11, v9, v5, v4}, LK8/H;-><init>(Landroid/content/Context;LKd/a;Z)V

    .line 225
    .line 226
    .line 227
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;

    .line 228
    .line 229
    new-instance v18, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 230
    .line 231
    iget-object v13, v3, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 232
    .line 233
    move-object/from16 v8, v18

    .line 234
    .line 235
    invoke-direct/range {v8 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;-><init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;LK8/H;LHf/x0;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 239
    .line 240
    new-instance v16, LS8/d;

    .line 241
    .line 242
    const-class v19, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 243
    .line 244
    const-string v20, "closeFullscreenAdRepresentation"

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const-string v21, "closeFullscreenAdRepresentation()V"

    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const/16 v23, 0xd

    .line 253
    .line 254
    invoke-direct/range {v16 .. v23}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v4, v16

    .line 258
    .line 259
    iget-object v6, v11, LK8/H;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v6, LHf/j0;

    .line 262
    .line 263
    iget-object v8, v11, LK8/H;->f:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 266
    .line 267
    invoke-direct {v13, v4, v5, v8, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;-><init>(LS8/d;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;LHf/j0;)V

    .line 268
    .line 269
    .line 270
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 271
    .line 272
    invoke-static {}, Lcom/moloco/sdk/service_locator/a;->a()LY2/B;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    new-instance v16, LEf/p0;

    .line 277
    .line 278
    const-class v19, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 279
    .line 280
    const-string v20, "loadAndReadyMraid"

    .line 281
    .line 282
    const/16 v17, 0x1

    .line 283
    .line 284
    const-string v21, "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/16 v23, 0x6

    .line 289
    .line 290
    invoke-direct/range {v16 .. v23}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v6, v16

    .line 294
    .line 295
    invoke-direct {v11, v5, v3, v4, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;-><init>(LKd/a;Lcom/moloco/sdk/internal/ortb/model/u;LY2/B;Ltf/l;)V

    .line 296
    .line 297
    .line 298
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;->h:LHf/j0;

    .line 299
    .line 300
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 301
    .line 302
    iget-object v14, v3, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    .line 303
    .line 304
    move-object v10, v1

    .line 305
    move-object/from16 v12, v18

    .line 306
    .line 307
    invoke-direct/range {v8 .. v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;-><init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;Ljava/lang/String;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 308
    .line 309
    .line 310
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :pswitch_4
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->l:Lab/b;

    .line 314
    .line 315
    invoke-static {}, Lcom/moloco/sdk/service_locator/g;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    iget-boolean v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;->b:Z

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->a:Landroid/content/Context;

    .line 325
    .line 326
    const-string v1, "bid"

    .line 327
    .line 328
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 329
    .line 330
    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget-object v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 334
    .line 335
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 336
    .line 337
    invoke-static {}, Lcom/moloco/sdk/service_locator/g;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    iget-boolean v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;->b:Z

    .line 342
    .line 343
    invoke-static {v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->b(Landroid/content/Context;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-static {}, Lcom/moloco/sdk/service_locator/a;->a()LY2/B;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 352
    .line 353
    invoke-direct/range {v8 .. v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;LY2/B;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 354
    .line 355
    .line 356
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 357
    .line 358
    :goto_3
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->h:LKd/a;

    .line 363
    .line 364
    if-eqz v1, :cond_6

    .line 365
    .line 366
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;->isLoaded()LHf/v0;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    if-eqz v1, :cond_6

    .line 371
    .line 372
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/o0;

    .line 373
    .line 374
    invoke-direct {v4, v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/o0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Ljf/c;)V

    .line 375
    .line 376
    .line 377
    new-instance v5, LHf/Z;

    .line 378
    .line 379
    invoke-direct {v5, v1, v4, v2}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 380
    .line 381
    .line 382
    invoke-static {v5, v3}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 383
    .line 384
    .line 385
    :cond_6
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    if-eqz v1, :cond_7

    .line 390
    .line 391
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;->l()LHf/v0;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    if-eqz v1, :cond_7

    .line 396
    .line 397
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/p0;

    .line 398
    .line 399
    invoke-direct {v4, v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/p0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Ljf/c;)V

    .line 400
    .line 401
    .line 402
    new-instance v5, LHf/Z;

    .line 403
    .line 404
    invoke-direct {v5, v1, v4, v2}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 405
    .line 406
    .line 407
    invoke-static {v5, v3}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 408
    .line 409
    .line 410
    :cond_7
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    if-eqz v1, :cond_8

    .line 415
    .line 416
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;->k()LHf/v0;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    if-eqz v1, :cond_8

    .line 421
    .line 422
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q0;

    .line 423
    .line 424
    invoke-direct {v4, v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;Ljf/c;)V

    .line 425
    .line 426
    .line 427
    new-instance v0, LHf/Z;

    .line 428
    .line 429
    invoke-direct {v0, v1, v4, v2}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    invoke-static {v0, v3}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 433
    .line 434
    .line 435
    :cond_8
    sget-object v0, Lef/C;->a:Lef/C;

    .line 436
    .line 437
    return-object v0

    .line 438
    nop

    .line 439
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
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/m0;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move-object v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/m0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    const/4 p2, 0x0

    .line 12
    iget-object p3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->h:LKd/a;

    .line 13
    .line 14
    invoke-static {p3, p2, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->h:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;->destroy()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->n:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->r:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->p:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method
