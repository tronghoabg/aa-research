.class public final synthetic LKb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LUc/f;LUc/n;Ljava/lang/String;Ljava/lang/String;LPc/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LKb/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKb/c;->c:Ljava/lang/Object;

    iput-object p2, p0, LKb/c;->d:Ljava/lang/Object;

    iput-object p3, p0, LKb/c;->b:Ljava/lang/Object;

    iput-object p4, p0, LKb/c;->e:Ljava/lang/Object;

    iput-object p5, p0, LKb/c;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p6, p0, LKb/c;->a:I

    iput-object p1, p0, LKb/c;->c:Ljava/lang/Object;

    iput-object p2, p0, LKb/c;->f:Ljava/lang/Object;

    iput-object p3, p0, LKb/c;->d:Ljava/lang/Object;

    iput-object p4, p0, LKb/c;->b:Ljava/lang/Object;

    iput-object p5, p0, LKb/c;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    iput p6, p0, LKb/c;->a:I

    iput-object p1, p0, LKb/c;->c:Ljava/lang/Object;

    iput-object p2, p0, LKb/c;->f:Ljava/lang/Object;

    iput-object p3, p0, LKb/c;->b:Ljava/lang/Object;

    iput-object p4, p0, LKb/c;->d:Ljava/lang/Object;

    iput-object p5, p0, LKb/c;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p6, p0, LKb/c;->a:I

    iput-object p1, p0, LKb/c;->c:Ljava/lang/Object;

    iput-object p2, p0, LKb/c;->b:Ljava/lang/Object;

    iput-object p3, p0, LKb/c;->d:Ljava/lang/Object;

    iput-object p4, p0, LKb/c;->e:Ljava/lang/Object;

    iput-object p5, p0, LKb/c;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    iget-object v3, v1, LKb/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v1, LKb/c;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v1, LKb/c;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v1, LKb/c;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v1, LKb/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget v8, v1, LKb/c;->a:I

    .line 18
    .line 19
    packed-switch v8, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v7, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 23
    .line 24
    check-cast v6, Landroid/content/Context;

    .line 25
    .line 26
    check-cast v5, Lp9/s;

    .line 27
    .line 28
    check-cast v4, Lv9/h;

    .line 29
    .line 30
    check-cast v3, Lp9/n;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ln9/e;

    .line 44
    .line 45
    invoke-virtual {v3, v6, v0, v5, v4}, Lp9/n;->a(Landroid/content/Context;Ln9/e;Lp9/s;Lv9/h;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 50
    goto :goto_0

    .line 51
    :catch_1
    move-exception v0

    .line 52
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 53
    .line 54
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :pswitch_0
    new-instance v9, Lcom/moloco/sdk/internal/publisher/d;

    .line 59
    .line 60
    invoke-direct {v9, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 61
    .line 62
    .line 63
    check-cast v3, Lkd/W;

    .line 64
    .line 65
    move-object v8, v4

    .line 66
    move-object v4, v3

    .line 67
    iget-object v3, v4, Lkd/W;->a:Lkd/r;

    .line 68
    .line 69
    move-object v10, v5

    .line 70
    move-object v5, v8

    .line 71
    check-cast v5, Landroid/webkit/WebView;

    .line 72
    .line 73
    check-cast v6, Landroid/webkit/HttpAuthHandler;

    .line 74
    .line 75
    check-cast v7, Ljava/lang/String;

    .line 76
    .line 77
    move-object v8, v10

    .line 78
    check-cast v8, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual/range {v3 .. v9}, Lkd/r;->i(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_1
    move-object v8, v4

    .line 85
    move-object v10, v5

    .line 86
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 87
    .line 88
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 89
    .line 90
    .line 91
    move-object v11, v3

    .line 92
    check-cast v11, Lkd/W;

    .line 93
    .line 94
    move-object v2, v10

    .line 95
    iget-object v10, v11, Lkd/W;->a:Lkd/r;

    .line 96
    .line 97
    move-object v12, v8

    .line 98
    check-cast v12, Landroid/webkit/WebView;

    .line 99
    .line 100
    move-object v13, v7

    .line 101
    check-cast v13, Ljava/lang/String;

    .line 102
    .line 103
    move-object v14, v6

    .line 104
    check-cast v14, Ljava/lang/String;

    .line 105
    .line 106
    move-object v15, v2

    .line 107
    check-cast v15, Ljava/lang/String;

    .line 108
    .line 109
    move-object/from16 v16, v0

    .line 110
    .line 111
    invoke-virtual/range {v10 .. v16}, Lkd/r;->k(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_2
    move-object v2, v5

    .line 116
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 117
    .line 118
    invoke-direct {v8, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 119
    .line 120
    .line 121
    check-cast v3, Lkd/T;

    .line 122
    .line 123
    move-object v10, v2

    .line 124
    iget-object v2, v3, Lkd/T;->a:Lkd/r;

    .line 125
    .line 126
    check-cast v4, Landroid/webkit/WebView;

    .line 127
    .line 128
    move-object v5, v6

    .line 129
    check-cast v5, Landroid/webkit/HttpAuthHandler;

    .line 130
    .line 131
    move-object v6, v7

    .line 132
    check-cast v6, Ljava/lang/String;

    .line 133
    .line 134
    move-object v7, v10

    .line 135
    check-cast v7, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual/range {v2 .. v8}, Lkd/r;->i(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_3
    move-object v10, v5

    .line 142
    new-instance v15, Lcom/moloco/sdk/internal/publisher/d;

    .line 143
    .line 144
    invoke-direct {v15, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 145
    .line 146
    .line 147
    check-cast v3, Lkd/T;

    .line 148
    .line 149
    iget-object v9, v3, Lkd/T;->a:Lkd/r;

    .line 150
    .line 151
    move-object v11, v4

    .line 152
    check-cast v11, Landroid/webkit/WebView;

    .line 153
    .line 154
    move-object v12, v7

    .line 155
    check-cast v12, Ljava/lang/String;

    .line 156
    .line 157
    move-object v13, v6

    .line 158
    check-cast v13, Ljava/lang/String;

    .line 159
    .line 160
    move-object v14, v10

    .line 161
    check-cast v14, Ljava/lang/String;

    .line 162
    .line 163
    move-object v10, v3

    .line 164
    invoke-virtual/range {v9 .. v15}, Lkd/r;->k(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_4
    move-object v10, v5

    .line 169
    move-object v5, v10

    .line 170
    check-cast v5, Landroid/view/ViewGroup;

    .line 171
    .line 172
    check-cast v3, Lcom/applovin/impl/n2;

    .line 173
    .line 174
    check-cast v7, Landroidx/lifecycle/o;

    .line 175
    .line 176
    check-cast v6, Lcom/applovin/sdk/AppLovinAd;

    .line 177
    .line 178
    check-cast v4, Landroid/app/Activity;

    .line 179
    .line 180
    invoke-static {v3, v7, v6, v5, v4}, Lcom/applovin/impl/n2;->a(Lcom/applovin/impl/n2;Landroidx/lifecycle/o;Lcom/applovin/sdk/AppLovinAd;Landroid/view/ViewGroup;Landroid/app/Activity;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_5
    move-object v10, v5

    .line 185
    check-cast v3, Lcom/applovin/impl/mediation/MediationServiceImpl;

    .line 186
    .line 187
    check-cast v7, Lcom/applovin/impl/c3;

    .line 188
    .line 189
    check-cast v6, Lcom/applovin/impl/mediation/h;

    .line 190
    .line 191
    move-object v5, v10

    .line 192
    check-cast v5, Landroid/app/Activity;

    .line 193
    .line 194
    check-cast v4, Lcom/applovin/impl/mediation/ads/a$a;

    .line 195
    .line 196
    invoke-static {v3, v7, v6, v5, v4}, Lcom/applovin/impl/mediation/MediationServiceImpl;->g(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/c3;Lcom/applovin/impl/mediation/h;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_6
    move-object v10, v5

    .line 201
    move-object v5, v10

    .line 202
    check-cast v5, Landroid/view/ViewTreeObserver;

    .line 203
    .line 204
    check-cast v4, Lcom/applovin/impl/I;

    .line 205
    .line 206
    check-cast v3, Lcom/applovin/impl/e1;

    .line 207
    .line 208
    check-cast v7, Landroid/view/View;

    .line 209
    .line 210
    check-cast v6, Landroid/widget/FrameLayout;

    .line 211
    .line 212
    invoke-static {v3, v7, v6, v5, v4}, Lcom/applovin/impl/e1;->i(Lcom/applovin/impl/e1;Landroid/view/View;Landroid/widget/FrameLayout;Landroid/view/ViewTreeObserver;Lcom/applovin/impl/I;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_7
    move-object v10, v5

    .line 217
    check-cast v6, LUc/n;

    .line 218
    .line 219
    check-cast v7, Ljava/lang/String;

    .line 220
    .line 221
    move-object v5, v10

    .line 222
    check-cast v5, Ljava/lang/String;

    .line 223
    .line 224
    check-cast v4, LPc/p;

    .line 225
    .line 226
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 227
    .line 228
    check-cast v3, LUc/f;

    .line 229
    .line 230
    const-string v0, "Transaction.getDocument(): No transaction handler exists for ID: "

    .line 231
    .line 232
    :try_start_1
    invoke-static {v6}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v2, v7}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    iget-object v3, v3, LUc/f;->d:Ljava/util/HashMap;

    .line 241
    .line 242
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    check-cast v3, Lm9/d0;

    .line 247
    .line 248
    if-nez v3, :cond_0

    .line 249
    .line 250
    new-instance v2, Ljava/lang/Exception;

    .line 251
    .line 252
    new-instance v3, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v2}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :catch_2
    move-exception v0

    .line 272
    goto :goto_1

    .line 273
    :cond_0
    invoke-virtual {v3, v2}, Lm9/d0;->a(Lm9/m;)Lm9/o;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    sget-object v2, Lm9/n;->a:Lm9/n;

    .line 278
    .line 279
    invoke-static {v0, v2}, Lxg/g;->W(Lm9/o;Lm9/n;)LUc/r;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v4, v0}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :goto_1
    invoke-static {v4, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 288
    .line 289
    .line 290
    :goto_2
    return-void

    .line 291
    :pswitch_8
    move-object v10, v5

    .line 292
    move-object v5, v10

    .line 293
    check-cast v5, Lcom/vungle/ads/internal/ui/z;

    .line 294
    .line 295
    check-cast v4, Landroid/webkit/WebView;

    .line 296
    .line 297
    check-cast v3, Lcom/vungle/ads/internal/ui/view/o;

    .line 298
    .line 299
    check-cast v7, Ljava/lang/String;

    .line 300
    .line 301
    check-cast v6, Lkotlinx/serialization/json/c;

    .line 302
    .line 303
    invoke-static {v3, v7, v6, v5, v4}, Lcom/vungle/ads/internal/ui/z;->a(Lcom/vungle/ads/internal/ui/view/o;Ljava/lang/String;Lkotlinx/serialization/json/c;Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
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
