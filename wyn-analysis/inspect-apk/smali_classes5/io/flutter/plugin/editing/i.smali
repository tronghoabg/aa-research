.class public final Lio/flutter/plugin/editing/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/editing/d;


# instance fields
.field public final a:Lkc/r;

.field public final b:Landroid/view/inputmethod/InputMethodManager;

.field public final c:Landroid/view/autofill/AutofillManager;

.field public final d:Lt6/q;

.field public e:LD9/n;

.field public f:Ltc/k;

.field public g:Landroid/util/SparseArray;

.field public h:Lio/flutter/plugin/editing/e;

.field public i:Z

.field public j:Landroid/view/inputmethod/InputConnection;

.field public final k:Lio/flutter/plugin/platform/q;

.field public final l:Lio/flutter/plugin/platform/p;

.field public m:Landroid/graphics/Rect;

.field public final n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

.field public o:Ltc/l;

.field public p:Z


# direct methods
.method public constructor <init>(Lkc/r;Lt6/q;La2/v;Lio/flutter/plugin/platform/q;Lio/flutter/plugin/platform/p;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, LD9/n;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    invoke-direct {p3, v0, v1, v2}, LD9/n;-><init>(III)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 14
    .line 15
    iput-object p1, p0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 16
    .line 17
    new-instance p3, Lio/flutter/plugin/editing/e;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p3, v0, p1}, Lio/flutter/plugin/editing/e;-><init>(Ltc/l;Lkc/r;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    const-string v1, "input_method"

    .line 30
    .line 31
    invoke-virtual {p3, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, Landroid/view/inputmethod/InputMethodManager;

    .line 36
    .line 37
    iput-object p3, p0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 38
    .line 39
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v1, 0x1a

    .line 42
    .line 43
    if-lt p3, v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {}, LU1/b;->m()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, LU1/b;->i(Ljava/lang/Object;)Landroid/view/autofill/AutofillManager;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iput-object v0, p0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 65
    .line 66
    :goto_0
    const/16 v1, 0x1e

    .line 67
    .line 68
    if-lt p3, v1, :cond_1

    .line 69
    .line 70
    new-instance p3, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 71
    .line 72
    invoke-direct {p3, p1}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;-><init>(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    iput-object p3, p0, Lio/flutter/plugin/editing/i;->n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 76
    .line 77
    invoke-virtual {p3}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->install()V

    .line 78
    .line 79
    .line 80
    :cond_1
    iput-object p2, p0, Lio/flutter/plugin/editing/i;->d:Lt6/q;

    .line 81
    .line 82
    new-instance p1, La2/c;

    .line 83
    .line 84
    const/16 p3, 0xd

    .line 85
    .line 86
    invoke-direct {p1, p0, p3}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p2, Lt6/q;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object p1, p2, Lt6/q;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Luc/r;

    .line 94
    .line 95
    const-string p2, "TextInputClient.requestExistingInputState"

    .line 96
    .line 97
    invoke-virtual {p1, p2, v0, v0}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 98
    .line 99
    .line 100
    iput-object p4, p0, Lio/flutter/plugin/editing/i;->k:Lio/flutter/plugin/platform/q;

    .line 101
    .line 102
    iput-object p0, p4, Lio/flutter/plugin/platform/q;->f:Lio/flutter/plugin/editing/i;

    .line 103
    .line 104
    iput-object p5, p0, Lio/flutter/plugin/editing/i;->l:Lio/flutter/plugin/platform/p;

    .line 105
    .line 106
    iput-object p0, p5, Lio/flutter/plugin/platform/p;->f:Lio/flutter/plugin/editing/i;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v4, 0x2

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/flutter/plugin/editing/e;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v6, 0x1a

    .line 15
    .line 16
    if-lt v5, v6, :cond_0

    .line 17
    .line 18
    iget-object v5, v1, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    iget-object v6, v1, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 23
    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    iget-object v6, v1, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 27
    .line 28
    iget-object v6, v6, Ltc/k;->j:LS3/i;

    .line 29
    .line 30
    iget-object v6, v6, LS3/i;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-static {v0}, Le0/h;->e(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v7, v1, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 43
    .line 44
    invoke-static {v5, v7, v6, v0}, Le0/h;->l(Landroid/view/autofill/AutofillManager;Lkc/r;ILandroid/view/autofill/AutofillValue;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v5, Ljava/util/ArrayList;

    .line 89
    .line 90
    iget-object v0, v0, Lio/flutter/plugin/editing/e;->e:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 96
    .line 97
    .line 98
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 103
    .line 104
    invoke-virtual {v0}, Lio/flutter/plugin/editing/e;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v6, v1, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 109
    .line 110
    iget-object v6, v6, Ltc/l;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_1

    .line 117
    .line 118
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 119
    .line 120
    iget v6, v0, Ltc/l;->b:I

    .line 121
    .line 122
    if-ne v7, v6, :cond_1

    .line 123
    .line 124
    iget v6, v0, Ltc/l;->c:I

    .line 125
    .line 126
    if-ne v8, v6, :cond_1

    .line 127
    .line 128
    iget v6, v0, Ltc/l;->d:I

    .line 129
    .line 130
    if-ne v9, v6, :cond_1

    .line 131
    .line 132
    iget v0, v0, Ltc/l;->e:I

    .line 133
    .line 134
    if-ne v10, v0, :cond_1

    .line 135
    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :cond_1
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 139
    .line 140
    invoke-virtual {v0}, Lio/flutter/plugin/editing/e;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 144
    .line 145
    iget-boolean v0, v0, Ltc/k;->e:Z

    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    iget-object v11, v1, Lio/flutter/plugin/editing/i;->d:Lt6/q;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 153
    .line 154
    iget v12, v0, LD9/n;->c:I

    .line 155
    .line 156
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    new-instance v13, Ljava/util/HashMap;

    .line 163
    .line 164
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v14, Lorg/json/JSONArray;

    .line 168
    .line 169
    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lio/flutter/plugin/editing/g;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v15, Lorg/json/JSONObject;

    .line 192
    .line 193
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 194
    .line 195
    .line 196
    const/16 v16, 0x1

    .line 197
    .line 198
    :try_start_0
    const-string v2, "oldText"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    :try_start_1
    iget-object v3, v0, Lio/flutter/plugin/editing/g;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    const-string v2, "deltaText"

    .line 212
    .line 213
    iget-object v3, v0, Lio/flutter/plugin/editing/g;->b:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    const-string v2, "deltaStart"

    .line 223
    .line 224
    iget v3, v0, Lio/flutter/plugin/editing/g;->c:I

    .line 225
    .line 226
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    const-string v2, "deltaEnd"

    .line 230
    .line 231
    iget v3, v0, Lio/flutter/plugin/editing/g;->d:I

    .line 232
    .line 233
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string v2, "selectionBase"

    .line 237
    .line 238
    iget v3, v0, Lio/flutter/plugin/editing/g;->e:I

    .line 239
    .line 240
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    const-string v2, "selectionExtent"

    .line 244
    .line 245
    iget v3, v0, Lio/flutter/plugin/editing/g;->f:I

    .line 246
    .line 247
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 248
    .line 249
    .line 250
    const-string v2, "composingBase"

    .line 251
    .line 252
    iget v3, v0, Lio/flutter/plugin/editing/g;->g:I

    .line 253
    .line 254
    invoke-virtual {v15, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    const-string v2, "composingExtent"

    .line 258
    .line 259
    iget v0, v0, Lio/flutter/plugin/editing/g;->h:I

    .line 260
    .line 261
    invoke-virtual {v15, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :catch_0
    move-exception v0

    .line 266
    goto :goto_1

    .line 267
    :catch_1
    move-exception v0

    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v3, "unable to create JSONObject: "

    .line 273
    .line 274
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const-string v2, "TextEditingDelta"

    .line 285
    .line 286
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    .line 288
    .line 289
    :goto_2
    invoke-virtual {v14, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 290
    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_2
    const/16 v16, 0x1

    .line 294
    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const-string v0, "deltas"

    .line 298
    .line 299
    invoke-virtual {v13, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    new-array v2, v4, [Ljava/io/Serializable;

    .line 307
    .line 308
    aput-object v0, v2, v17

    .line 309
    .line 310
    aput-object v13, v2, v16

    .line 311
    .line 312
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iget-object v2, v11, Lt6/q;->a:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v2, Luc/r;

    .line 319
    .line 320
    const-string v3, "TextInputClient.updateEditingStateWithDeltas"

    .line 321
    .line 322
    invoke-virtual {v2, v3, v0, v6}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 323
    .line 324
    .line 325
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 326
    .line 327
    iget-object v0, v0, Lio/flutter/plugin/editing/e;->e:Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_3
    const/16 v16, 0x1

    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 338
    .line 339
    iget v0, v0, LD9/n;->c:I

    .line 340
    .line 341
    iget-object v2, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 342
    .line 343
    invoke-virtual {v2}, Lio/flutter/plugin/editing/e;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-static {v2, v7, v8, v9, v10}, Lt6/q;->f(Ljava/lang/String;IIII)Ljava/util/HashMap;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    new-array v3, v4, [Ljava/io/Serializable;

    .line 359
    .line 360
    aput-object v0, v3, v17

    .line 361
    .line 362
    aput-object v2, v3, v16

    .line 363
    .line 364
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v2, v11, Lt6/q;->a:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Luc/r;

    .line 371
    .line 372
    const-string v3, "TextInputClient.updateEditingState"

    .line 373
    .line 374
    invoke-virtual {v2, v3, v0, v6}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 375
    .line 376
    .line 377
    :goto_3
    new-instance v5, Ltc/l;

    .line 378
    .line 379
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 380
    .line 381
    invoke-virtual {v0}, Lio/flutter/plugin/editing/e;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-direct/range {v5 .. v10}, Ltc/l;-><init>(Ljava/lang/String;IIII)V

    .line 386
    .line 387
    .line 388
    iput-object v5, v1, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 389
    .line 390
    return-void

    .line 391
    :cond_4
    :goto_4
    iget-object v0, v1, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 392
    .line 393
    iget-object v0, v0, Lio/flutter/plugin/editing/e;->e:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 2
    .line 3
    iget v1, v0, LD9/n;->b:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    :cond_0
    iget v0, v0, LD9/n;->c:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    new-instance p1, LD9/n;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-direct {p1, v0, v1, v2}, LD9/n;-><init>(III)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 25
    .line 26
    invoke-virtual {p0}, Lio/flutter/plugin/editing/i;->d()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v2, p0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 36
    .line 37
    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    iput-boolean v1, p0, Lio/flutter/plugin/editing/i;->i:Z

    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->k:Lio/flutter/plugin/platform/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lio/flutter/plugin/platform/q;->f:Lio/flutter/plugin/editing/i;

    .line 5
    .line 6
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->l:Lio/flutter/plugin/platform/p;

    .line 7
    .line 8
    iput-object v1, v0, Lio/flutter/plugin/platform/p;->f:Lio/flutter/plugin/editing/i;

    .line 9
    .line 10
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->d:Lt6/q;

    .line 11
    .line 12
    iput-object v1, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0}, Lio/flutter/plugin/editing/i;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lio/flutter/plugin/editing/e;->e(Lio/flutter/plugin/editing/d;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->n:Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/flutter/plugin/editing/ImeSyncDeferringInsetsCallback;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Ltc/k;->j:LS3/i;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, LS3/i;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v2, v1}, Le0/h;->j(Landroid/view/autofill/AutofillManager;Lkc/r;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final e(Ltc/k;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-eqz p1, :cond_5

    .line 9
    .line 10
    iget-object v0, p1, Ltc/k;->j:LS3/i;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 21
    .line 22
    iget-object v2, p1, Ltc/k;->l:[Ltc/k;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, LS3/i;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    array-length p1, v2

    .line 39
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-ge v0, p1, :cond_4

    .line 41
    .line 42
    aget-object v1, v2, v0

    .line 43
    .line 44
    iget-object v3, v1, Ltc/k;->j:LS3/i;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iget-object v4, p0, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 49
    .line 50
    iget-object v5, v3, LS3/i;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v4, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-object v3, v3, LS3/i;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ltc/l;

    .line 70
    .line 71
    iget-object v3, v3, Ltc/l;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v3}, Le0/h;->d(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget-object v5, p0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 78
    .line 79
    invoke-static {v1, v5, v4, v3}, Le0/h;->l(Landroid/view/autofill/AutofillManager;Lkc/r;ILandroid/view/autofill/AutofillValue;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    :goto_1
    return-void

    .line 86
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 88
    .line 89
    return-void
.end method
