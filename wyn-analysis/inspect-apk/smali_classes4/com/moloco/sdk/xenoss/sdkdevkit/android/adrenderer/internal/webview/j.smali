.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/webkit/WebView;

.field public final synthetic c:LHf/c0;

.field public final synthetic d:I

.field public final synthetic e:Ltf/l;

.field public final synthetic f:Ltf/a;

.field public final synthetic g:Ltf/a;

.field public final synthetic h:J

.field public final synthetic i:Ltf/p;

.field public final synthetic j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

.field public final synthetic k:LL0/d;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebView;LHf/c0;ILtf/l;Ltf/a;Ltf/a;JLtf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LL0/d;ZI)V
    .locals 0

    .line 1
    iput p13, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->b:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->c:LHf/c0;

    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->d:I

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->e:Ltf/l;

    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->f:Ltf/a;

    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->g:Ltf/a;

    iput-wide p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->h:J

    iput-object p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->i:Ltf/p;

    iput-object p10, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    iput-object p11, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->k:LL0/d;

    iput-boolean p12, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->l:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    check-cast v4, LN/o;

    .line 15
    .line 16
    move-object/from16 v5, p2

    .line 17
    .line 18
    check-cast v5, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    and-int/lit8 v5, v5, 0x3

    .line 25
    .line 26
    if-ne v5, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, LN/o;->x()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v4}, LN/o;->I()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;

    .line 40
    .line 41
    iget-object v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->i:Ltf/p;

    .line 42
    .line 43
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->f:Ltf/a;

    .line 44
    .line 45
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->k:LL0/d;

    .line 46
    .line 47
    iget-boolean v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->l:Z

    .line 48
    .line 49
    move/from16 v17, v6

    .line 50
    .line 51
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->b:Landroid/webkit/WebView;

    .line 52
    .line 53
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->c:LHf/c0;

    .line 54
    .line 55
    iget v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->d:I

    .line 56
    .line 57
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->e:Ltf/l;

    .line 58
    .line 59
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->g:Ltf/a;

    .line 60
    .line 61
    iget-wide v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->h:J

    .line 62
    .line 63
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    move-object/from16 v16, v3

    .line 68
    .line 69
    invoke-direct/range {v5 .. v18}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;-><init>(Landroid/webkit/WebView;LHf/c0;ILtf/l;Ltf/a;Ltf/a;JLtf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LL0/d;ZI)V

    .line 70
    .line 71
    .line 72
    const v3, -0x60d37e0

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v3, v5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const/16 v5, 0x30

    .line 80
    .line 81
    invoke-static {v2, v3, v4, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;->a(ZLV/d;LN/o;I)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-object v1

    .line 85
    :pswitch_0
    move-object/from16 v4, p1

    .line 86
    .line 87
    check-cast v4, LN/o;

    .line 88
    .line 89
    move-object/from16 v5, p2

    .line 90
    .line 91
    check-cast v5, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    and-int/lit8 v5, v5, 0x3

    .line 98
    .line 99
    if-ne v5, v3, :cond_3

    .line 100
    .line 101
    invoke-virtual {v4}, LN/o;->x()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    invoke-virtual {v4}, LN/o;->I()V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_3
    :goto_2
    const v3, 0x4f9d29ac    # 5.273508E9f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v3}, LN/o;->M(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget-object v5, LN/k;->a:LN/P;

    .line 124
    .line 125
    if-ne v3, v5, :cond_4

    .line 126
    .line 127
    sget-object v3, Lcom/moloco/sdk/service_locator/i;->a:Lef/p;

    .line 128
    .line 129
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 138
    .line 139
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 140
    .line 141
    .line 142
    const v6, 0x4f9d3c86

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v6}, LN/o;->M(I)V

    .line 146
    .line 147
    .line 148
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->b:Landroid/webkit/WebView;

    .line 149
    .line 150
    invoke-virtual {v4, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-nez v7, :cond_5

    .line 159
    .line 160
    if-ne v8, v5, :cond_6

    .line 161
    .line 162
    :cond_5
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;->a(Landroid/view/View;)LHf/l;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v4, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    move-object/from16 v19, v8

    .line 170
    .line 171
    check-cast v19, LHf/l;

    .line 172
    .line 173
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 174
    .line 175
    .line 176
    const v3, 0x4f9d4eaf    # 5.278359E9f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v3}, LN/o;->M(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->c:LHf/c0;

    .line 187
    .line 188
    if-ne v3, v5, :cond_7

    .line 189
    .line 190
    move-object v3, v6

    .line 191
    check-cast v3, LHf/x0;

    .line 192
    .line 193
    invoke-virtual {v3}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    sget-object v7, LN/P;->f:LN/P;

    .line 198
    .line 199
    invoke-static {v3, v7}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v4, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    move-object v8, v3

    .line 207
    check-cast v8, LN/V;

    .line 208
    .line 209
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 210
    .line 211
    .line 212
    const v3, 0x4f9d5dac

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v3}, LN/o;->M(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-virtual {v4, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    or-int/2addr v3, v7

    .line 227
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    if-nez v3, :cond_8

    .line 232
    .line 233
    if-ne v7, v5, :cond_9

    .line 234
    .line 235
    :cond_8
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/i;

    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    invoke-direct {v7, v8, v6, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/i;-><init>(LN/V;LHf/c0;Ljf/c;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v7}, LN/o;->U(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_9
    check-cast v7, Ltf/p;

    .line 245
    .line 246
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 247
    .line 248
    .line 249
    invoke-static {v4, v1, v7}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->i:Ltf/p;

    .line 257
    .line 258
    invoke-interface {v3, v4, v2}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    move-object v15, v2

    .line 263
    check-cast v15, Ltf/c;

    .line 264
    .line 265
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->k:LL0/d;

    .line 266
    .line 267
    iget v2, v2, LL0/d;->a:F

    .line 268
    .line 269
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->f:Ltf/a;

    .line 270
    .line 271
    iget-boolean v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->l:Z

    .line 272
    .line 273
    const/16 v21, 0x180

    .line 274
    .line 275
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->b:Landroid/webkit/WebView;

    .line 276
    .line 277
    iget v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->d:I

    .line 278
    .line 279
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->e:Ltf/l;

    .line 280
    .line 281
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->g:Ltf/a;

    .line 282
    .line 283
    const/4 v12, 0x0

    .line 284
    iget-wide v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->h:J

    .line 285
    .line 286
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/j;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 287
    .line 288
    move/from16 v17, v2

    .line 289
    .line 290
    move/from16 v18, v3

    .line 291
    .line 292
    move-object/from16 v20, v4

    .line 293
    .line 294
    move-object/from16 v16, v5

    .line 295
    .line 296
    invoke-static/range {v6 .. v21}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/k;->c(Landroid/webkit/WebView;ILN/V;Ltf/l;Ltf/a;Ltf/a;LZ/k;JLtf/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;FZLHf/l;LN/o;I)V

    .line 297
    .line 298
    .line 299
    :goto_3
    return-object v1

    .line 300
    nop

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
