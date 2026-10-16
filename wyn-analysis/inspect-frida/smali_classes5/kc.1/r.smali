.class public final Lkc/r;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lkc/n;

.field public final b:Lkc/p;

.field public c:Lkc/m;

.field public d:Landroid/view/View;

.field public e:Landroid/view/View;

.field public final f:Ljava/util/HashSet;

.field public g:Z

.field public h:Llc/b;

.field public final i:Ljava/util/HashSet;

.field public j:Lba/a;

.field public k:Lio/flutter/plugin/editing/i;

.field public l:Lio/flutter/plugin/editing/f;

.field public m:Lvc/a;

.field public n:LDd/c;

.field public o:Lkc/a;

.field public p:Lio/flutter/view/l;

.field public q:Landroid/view/textservice/TextServicesManager;

.field public r:Lac/a;

.field public final s:Lio/flutter/embedding/engine/renderer/j;

.field public final t:La2/c;

.field public final u:Lio/flutter/view/c;

.field public final v:Lkc/c;

.field public w:LD3/i;

.field public x:Lkc/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkc/n;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lkc/r;->f:Ljava/util/HashSet;

    .line 3
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lkc/r;->i:Ljava/util/HashSet;

    .line 4
    new-instance p1, Lio/flutter/embedding/engine/renderer/j;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/j;-><init>()V

    iput-object p1, p0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 5
    new-instance p1, La2/c;

    const/16 v0, 0x10

    invoke-direct {p1, p0, v0}, La2/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lkc/r;->t:La2/c;

    .line 6
    new-instance p1, Lio/flutter/view/c;

    new-instance v0, Landroid/os/Handler;

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lio/flutter/view/c;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    iput-object p1, p0, Lkc/r;->u:Lio/flutter/view/c;

    .line 8
    new-instance p1, Lkc/c;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lkc/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lkc/r;->v:Lkc/c;

    .line 9
    new-instance p1, Lkc/s;

    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lkc/r;->x:Lkc/s;

    .line 12
    iput-object p2, p0, Lkc/r;->a:Lkc/n;

    .line 13
    iput-object p2, p0, Lkc/r;->d:Landroid/view/View;

    .line 14
    invoke-virtual {p0}, Lkc/r;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkc/p;)V
    .locals 2

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lkc/r;->f:Ljava/util/HashSet;

    .line 17
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lkc/r;->i:Ljava/util/HashSet;

    .line 18
    new-instance p1, Lio/flutter/embedding/engine/renderer/j;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/j;-><init>()V

    iput-object p1, p0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 19
    new-instance p1, La2/c;

    const/16 v0, 0x10

    invoke-direct {p1, p0, v0}, La2/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lkc/r;->t:La2/c;

    .line 20
    new-instance p1, Lio/flutter/view/c;

    new-instance v0, Landroid/os/Handler;

    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, Lio/flutter/view/c;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    iput-object p1, p0, Lkc/r;->u:Lio/flutter/view/c;

    .line 22
    new-instance p1, Lkc/c;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lkc/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lkc/r;->v:Lkc/c;

    .line 23
    new-instance p1, Lkc/s;

    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lkc/r;->x:Lkc/s;

    .line 26
    iput-object p2, p0, Lkc/r;->b:Lkc/p;

    .line 27
    iput-object p2, p0, Lkc/r;->d:Landroid/view/View;

    .line 28
    invoke-virtual {p0}, Lkc/r;->c()V

    return-void
.end method


# virtual methods
.method public final a(Llc/b;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_8

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lkc/r;->b()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object p1, p0, Lkc/r;->h:Llc/b;

    .line 20
    .line 21
    iget-object v0, p1, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 22
    .line 23
    iget-boolean v2, v0, Lio/flutter/embedding/engine/renderer/k;->d:Z

    .line 24
    .line 25
    iput-boolean v2, p0, Lkc/r;->g:Z

    .line 26
    .line 27
    iget-object v2, p0, Lkc/r;->d:Landroid/view/View;

    .line 28
    .line 29
    invoke-interface {v2, v0}, Lio/flutter/embedding/engine/renderer/m;->a(Lio/flutter/embedding/engine/renderer/k;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v0, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 33
    .line 34
    iget-object v6, p0, Lkc/r;->v:Lkc/c;

    .line 35
    .line 36
    invoke-virtual {v2, v6}, Lio/flutter/embedding/engine/FlutterJNI;->addIsDisplayingFlutterUiListener(Lio/flutter/embedding/engine/renderer/l;)V

    .line 37
    .line 38
    .line 39
    iget-boolean v0, v0, Lio/flutter/embedding/engine/renderer/k;->d:Z

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6}, Lkc/c;->e()V

    .line 44
    .line 45
    .line 46
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v2, 0x18

    .line 49
    .line 50
    if-lt v0, v2, :cond_3

    .line 51
    .line 52
    new-instance v0, Lba/a;

    .line 53
    .line 54
    iget-object v2, p0, Lkc/r;->h:Llc/b;

    .line 55
    .line 56
    iget-object v2, v2, Llc/b;->h:La2/c;

    .line 57
    .line 58
    invoke-direct {v0, p0, v2}, Lba/a;-><init>(Lkc/r;La2/c;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lkc/r;->j:Lba/a;

    .line 62
    .line 63
    :cond_3
    new-instance v0, Lio/flutter/plugin/editing/i;

    .line 64
    .line 65
    iget-object v2, p0, Lkc/r;->h:Llc/b;

    .line 66
    .line 67
    iget-object v3, v2, Llc/b;->q:Lt6/q;

    .line 68
    .line 69
    move-object v4, v3

    .line 70
    iget-object v3, v2, Llc/b;->m:La2/v;

    .line 71
    .line 72
    move-object v5, v4

    .line 73
    iget-object v4, v2, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 74
    .line 75
    iget-object v2, v2, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 76
    .line 77
    move-object v1, v5

    .line 78
    move-object v5, v2

    .line 79
    move-object v2, v1

    .line 80
    move-object v1, p0

    .line 81
    invoke-direct/range {v0 .. v5}, Lio/flutter/plugin/editing/i;-><init>(Lkc/r;Lt6/q;La2/v;Lio/flutter/plugin/platform/q;Lio/flutter/plugin/platform/p;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 85
    .line 86
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v2, "textservices"

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Landroid/view/textservice/TextServicesManager;

    .line 97
    .line 98
    iput-object v0, p0, Lkc/r;->q:Landroid/view/textservice/TextServicesManager;

    .line 99
    .line 100
    new-instance v2, Lio/flutter/plugin/editing/f;

    .line 101
    .line 102
    iget-object v3, p0, Lkc/r;->h:Llc/b;

    .line 103
    .line 104
    iget-object v3, v3, Llc/b;->o:Ltc/j;

    .line 105
    .line 106
    invoke-direct {v2, v0, v3}, Lio/flutter/plugin/editing/f;-><init>(Landroid/view/textservice/TextServicesManager;Ltc/j;)V

    .line 107
    .line 108
    .line 109
    iput-object v2, p0, Lkc/r;->l:Lio/flutter/plugin/editing/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catch_0
    const-string v0, "FlutterView"

    .line 113
    .line 114
    const-string v2, "TextServicesManager not supported by device, spell check disabled."

    .line 115
    .line 116
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :goto_0
    new-instance v0, Lba/a;

    .line 120
    .line 121
    iget-object v2, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 122
    .line 123
    iget-object v2, v2, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 124
    .line 125
    iget-object v3, p0, Lkc/r;->h:Llc/b;

    .line 126
    .line 127
    iget-object v3, v3, Llc/b;->m:La2/v;

    .line 128
    .line 129
    invoke-direct {v0, p0, v2, v3}, Lba/a;-><init>(Lkc/r;Landroid/view/inputmethod/InputMethodManager;La2/v;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 133
    .line 134
    iget-object v0, v0, Llc/b;->e:Lvc/a;

    .line 135
    .line 136
    iput-object v0, p0, Lkc/r;->m:Lvc/a;

    .line 137
    .line 138
    new-instance v0, LDd/c;

    .line 139
    .line 140
    invoke-direct {v0, p0}, LDd/c;-><init>(Lkc/r;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Lkc/r;->n:LDd/c;

    .line 144
    .line 145
    new-instance v0, Lkc/a;

    .line 146
    .line 147
    iget-object v2, p0, Lkc/r;->h:Llc/b;

    .line 148
    .line 149
    iget-object v2, v2, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    invoke-direct {v0, v2, v7}, Lkc/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p0, Lkc/r;->o:Lkc/a;

    .line 156
    .line 157
    new-instance v0, Lio/flutter/view/l;

    .line 158
    .line 159
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const-string v3, "accessibility"

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    move-object v3, v2

    .line 170
    check-cast v3, Landroid/view/accessibility/AccessibilityManager;

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iget-object v2, p0, Lkc/r;->h:Llc/b;

    .line 181
    .line 182
    iget-object v5, v2, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 183
    .line 184
    iget-object v2, p1, Llc/b;->f:Lme/a;

    .line 185
    .line 186
    move-object v1, p0

    .line 187
    invoke-direct/range {v0 .. v5}, Lio/flutter/view/l;-><init>(Lkc/r;Lme/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/j;)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 191
    .line 192
    iget-object v2, p0, Lkc/r;->t:La2/c;

    .line 193
    .line 194
    iput-object v2, v0, Lio/flutter/view/l;->s:La2/c;

    .line 195
    .line 196
    iget-object v0, v0, Lio/flutter/view/l;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iget-object v2, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 203
    .line 204
    iget-object v2, v2, Lio/flutter/view/l;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 205
    .line 206
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    iget-object v3, p0, Lkc/r;->h:Llc/b;

    .line 211
    .line 212
    iget-object v3, v3, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 213
    .line 214
    iget-object v3, v3, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 215
    .line 216
    invoke-virtual {v3}, Lio/flutter/embedding/engine/FlutterJNI;->getIsSoftwareRenderingEnabled()Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    const/4 v4, 0x1

    .line 221
    if-nez v3, :cond_5

    .line 222
    .line 223
    if-nez v0, :cond_4

    .line 224
    .line 225
    if-nez v2, :cond_4

    .line 226
    .line 227
    move v0, v4

    .line 228
    goto :goto_1

    .line 229
    :cond_4
    move v0, v7

    .line 230
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_5
    invoke-virtual {p0, v7}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 235
    .line 236
    .line 237
    :goto_2
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 238
    .line 239
    iget-object v2, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 240
    .line 241
    iget-object v3, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 242
    .line 243
    iget-object v5, v2, Lio/flutter/plugin/platform/q;->h:Lio/flutter/plugin/platform/a;

    .line 244
    .line 245
    iput-object v3, v5, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/l;

    .line 246
    .line 247
    new-instance v3, Lkc/a;

    .line 248
    .line 249
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 250
    .line 251
    invoke-direct {v3, v0, v4}, Lkc/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 252
    .line 253
    .line 254
    iput-object v3, v2, Lio/flutter/plugin/platform/q;->b:Lkc/a;

    .line 255
    .line 256
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 257
    .line 258
    iget-object v2, v0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 259
    .line 260
    iget-object v3, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 261
    .line 262
    iget-object v5, v2, Lio/flutter/plugin/platform/p;->h:Lio/flutter/plugin/platform/a;

    .line 263
    .line 264
    iput-object v3, v5, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/l;

    .line 265
    .line 266
    new-instance v3, Lkc/a;

    .line 267
    .line 268
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 269
    .line 270
    invoke-direct {v3, v0, v4}, Lkc/a;-><init>(Lio/flutter/embedding/engine/renderer/k;Z)V

    .line 271
    .line 272
    .line 273
    iput-object v3, v2, Lio/flutter/plugin/platform/p;->b:Lkc/a;

    .line 274
    .line 275
    iget-object v0, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 276
    .line 277
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 278
    .line 279
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lkc/r;->e()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const-string v2, "show_password"

    .line 294
    .line 295
    invoke-static {v2}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    iget-object v3, p0, Lkc/r;->u:Lio/flutter/view/c;

    .line 300
    .line 301
    invoke-virtual {v0, v2, v7, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lkc/r;->f()V

    .line 305
    .line 306
    .line 307
    iget-object v0, p1, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 308
    .line 309
    iput-object p0, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 310
    .line 311
    move v2, v7

    .line 312
    :goto_3
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 313
    .line 314
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-ge v2, v4, :cond_6

    .line 319
    .line 320
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, Lio/flutter/plugin/platform/i;

    .line 325
    .line 326
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 327
    .line 328
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 329
    .line 330
    .line 331
    add-int/lit8 v2, v2, 0x1

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_6
    move v2, v7

    .line 335
    :goto_4
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->l:Landroid/util/SparseArray;

    .line 336
    .line 337
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    if-ge v2, v4, :cond_7

    .line 342
    .line 343
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, Lpc/a;

    .line 348
    .line 349
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 350
    .line 351
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    add-int/lit8 v2, v2, 0x1

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_7
    move v2, v7

    .line 358
    :goto_5
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 359
    .line 360
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-ge v2, v4, :cond_8

    .line 365
    .line 366
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    check-cast v3, Lio/flutter/plugin/platform/e;

    .line 371
    .line 372
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 373
    .line 374
    invoke-interface {v3, v4}, Lio/flutter/plugin/platform/e;->onFlutterViewAttached(Landroid/view/View;)V

    .line 375
    .line 376
    .line 377
    add-int/lit8 v2, v2, 0x1

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_8
    iget-object v0, p1, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 381
    .line 382
    iput-object p0, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 383
    .line 384
    move v2, v7

    .line 385
    :goto_6
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->j:Landroid/util/SparseArray;

    .line 386
    .line 387
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-ge v2, v4, :cond_9

    .line 392
    .line 393
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, Lpc/a;

    .line 398
    .line 399
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 400
    .line 401
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 402
    .line 403
    .line 404
    add-int/lit8 v2, v2, 0x1

    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_9
    :goto_7
    iget-object v2, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 408
    .line 409
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-ge v7, v3, :cond_a

    .line 414
    .line 415
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    check-cast v2, Lio/flutter/plugin/platform/e;

    .line 420
    .line 421
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 422
    .line 423
    invoke-interface {v2, v3}, Lio/flutter/plugin/platform/e;->onFlutterViewAttached(Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    add-int/lit8 v7, v7, 0x1

    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_a
    iget-object v0, p0, Lkc/r;->i:Ljava/util/HashSet;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-nez v2, :cond_c

    .line 440
    .line 441
    iget-boolean v0, p0, Lkc/r;->g:Z

    .line 442
    .line 443
    if-eqz v0, :cond_b

    .line 444
    .line 445
    invoke-virtual {v6}, Lkc/c;->e()V

    .line 446
    .line 447
    .line 448
    :cond_b
    :goto_8
    return-void

    .line 449
    :cond_c
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    throw v0
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v4, 0x1a

    .line 8
    .line 9
    if-ge v3, v4, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 16
    .line 17
    if-eqz v3, :cond_7

    .line 18
    .line 19
    iget-object v4, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 20
    .line 21
    if-eqz v4, :cond_7

    .line 22
    .line 23
    iget-object v3, v3, Ltc/k;->j:LS3/i;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    move v5, v1

    .line 35
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-ge v5, v6, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Ltc/k;

    .line 52
    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    iget-object v6, v6, Ltc/k;->j:LS3/i;

    .line 56
    .line 57
    if-nez v6, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-static {v7}, LU1/b;->j(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v7}, LU1/b;->l(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    new-instance v8, Ltc/l;

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    const/4 v12, -0x1

    .line 87
    const/4 v13, -0x1

    .line 88
    invoke-direct/range {v8 .. v13}, Ltc/l;-><init>(Ljava/lang/String;IIII)V

    .line 89
    .line 90
    .line 91
    iget-object v6, v6, LS3/i;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v6, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v7, v3, LS3/i;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_3

    .line 104
    .line 105
    iget-object v6, v2, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 106
    .line 107
    invoke-virtual {v6, v8}, Lio/flutter/plugin/editing/e;->f(Ltc/l;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {v4, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_1
    add-int/2addr v5, v0

    .line 115
    goto :goto_0

    .line 116
    :cond_5
    iget-object p1, v2, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 117
    .line 118
    iget p1, p1, LD9/n;->c:I

    .line 119
    .line 120
    iget-object v2, v2, Lio/flutter/plugin/editing/i;->d:Lt6/q;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    new-instance v3, Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_6

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Ljava/util/Map$Entry;

    .line 156
    .line 157
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, Ltc/l;

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    check-cast v5, Ljava/lang/String;

    .line 168
    .line 169
    iget-object v7, v6, Ltc/l;->a:Ljava/lang/String;

    .line 170
    .line 171
    iget v8, v6, Ltc/l;->b:I

    .line 172
    .line 173
    iget v6, v6, Ltc/l;->c:I

    .line 174
    .line 175
    const/4 v9, -0x1

    .line 176
    invoke-static {v7, v8, v6, v9, v9}, Lt6/q;->f(Ljava/lang/String;IIII)Ljava/util/HashMap;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const/4 v4, 0x2

    .line 189
    new-array v4, v4, [Ljava/io/Serializable;

    .line 190
    .line 191
    aput-object p1, v4, v1

    .line 192
    .line 193
    aput-object v3, v4, v0

    .line 194
    .line 195
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget-object v0, v2, Lt6/q;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Luc/r;

    .line 202
    .line 203
    const-string v1, "TextInputClient.updateEditingStateWithTag"

    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-virtual {v0, v1, p1, v2}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    :goto_3
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 2
    .line 3
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lkc/r;->i:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_e

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lkc/r;->u:Lio/flutter/view/c;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 39
    .line 40
    iget-object v0, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v2, v1

    .line 44
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-ge v2, v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lio/flutter/plugin/platform/i;

    .line 57
    .line 58
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v2, v1

    .line 67
    :goto_1
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->l:Landroid/util/SparseArray;

    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ge v2, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lpc/a;

    .line 80
    .line 81
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 82
    .line 83
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->g()V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 93
    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    const-string v2, "PlatformViewsController"

    .line 97
    .line 98
    const-string v3, "removeOverlaySurfaces called while flutter view is null"

    .line 99
    .line 100
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move v2, v1

    .line 105
    :goto_2
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->m:Landroid/util/SparseArray;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-ge v2, v4, :cond_4

    .line 112
    .line 113
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Landroid/view/View;

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 128
    .line 129
    .line 130
    :goto_3
    const/4 v2, 0x0

    .line 131
    iput-object v2, v0, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 132
    .line 133
    iput-boolean v1, v0, Lio/flutter/plugin/platform/q;->p:Z

    .line 134
    .line 135
    move v3, v1

    .line 136
    :goto_4
    iget-object v4, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 137
    .line 138
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-ge v3, v5, :cond_5

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lio/flutter/plugin/platform/e;

    .line 149
    .line 150
    invoke-interface {v4}, Lio/flutter/plugin/platform/e;->onFlutterViewDetached()V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_5
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 157
    .line 158
    iget-object v0, v0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 159
    .line 160
    move v3, v1

    .line 161
    :goto_5
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->j:Landroid/util/SparseArray;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-ge v3, v5, :cond_6

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Lpc/a;

    .line 174
    .line 175
    iget-object v5, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 176
    .line 177
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->n:Landroid/view/Surface;

    .line 184
    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 188
    .line 189
    .line 190
    iput-object v2, v0, Lio/flutter/plugin/platform/p;->n:Landroid/view/Surface;

    .line 191
    .line 192
    iput-object v2, v0, Lio/flutter/plugin/platform/p;->o:Landroid/view/SurfaceControl;

    .line 193
    .line 194
    :cond_7
    iput-object v2, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 195
    .line 196
    move v3, v1

    .line 197
    :goto_6
    iget-object v4, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-ge v3, v5, :cond_8

    .line 204
    .line 205
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Lio/flutter/plugin/platform/e;

    .line 210
    .line 211
    invoke-interface {v4}, Lio/flutter/plugin/platform/e;->onFlutterViewDetached()V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v3, v3, 0x1

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_8
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 218
    .line 219
    iget-object v0, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 220
    .line 221
    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->d()V

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 225
    .line 226
    iget-object v0, v0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 227
    .line 228
    invoke-virtual {v0}, Lio/flutter/plugin/platform/p;->d()V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 232
    .line 233
    const/4 v3, 0x1

    .line 234
    iput-boolean v3, v0, Lio/flutter/view/l;->u:Z

    .line 235
    .line 236
    iget-object v3, v0, Lio/flutter/view/l;->e:Lio/flutter/plugin/platform/j;

    .line 237
    .line 238
    invoke-interface {v3}, Lio/flutter/plugin/platform/j;->d()V

    .line 239
    .line 240
    .line 241
    iput-object v2, v0, Lio/flutter/view/l;->s:La2/c;

    .line 242
    .line 243
    iget-object v3, v0, Lio/flutter/view/l;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 244
    .line 245
    iget-object v4, v0, Lio/flutter/view/l;->w:Lio/flutter/view/b;

    .line 246
    .line 247
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 248
    .line 249
    .line 250
    iget-object v4, v0, Lio/flutter/view/l;->x:Lio/flutter/view/d;

    .line 251
    .line 252
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 253
    .line 254
    .line 255
    iget-object v3, v0, Lio/flutter/view/l;->y:Lio/flutter/view/c;

    .line 256
    .line 257
    iget-object v4, v0, Lio/flutter/view/l;->f:Landroid/content/ContentResolver;

    .line 258
    .line 259
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 260
    .line 261
    .line 262
    iget-object v0, v0, Lio/flutter/view/l;->b:Lme/a;

    .line 263
    .line 264
    iput-object v2, v0, Lme/a;->c:Ljava/lang/Object;

    .line 265
    .line 266
    iget-object v0, v0, Lme/a;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Llc/h;)V

    .line 271
    .line 272
    .line 273
    iput-object v2, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 274
    .line 275
    iget-object v0, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 276
    .line 277
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 278
    .line 279
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 283
    .line 284
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->c()V

    .line 285
    .line 286
    .line 287
    iget-object v0, p0, Lkc/r;->n:LDd/c;

    .line 288
    .line 289
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Ljava/util/HashSet;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-lez v0, :cond_9

    .line 298
    .line 299
    new-instance v3, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v4, "A KeyboardManager was destroyed with "

    .line 302
    .line 303
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v0, " unhandled redispatch event(s)."

    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const-string v3, "KeyboardManager"

    .line 323
    .line 324
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    :cond_9
    iget-object v0, p0, Lkc/r;->l:Lio/flutter/plugin/editing/f;

    .line 328
    .line 329
    if-eqz v0, :cond_a

    .line 330
    .line 331
    iget-object v3, v0, Lio/flutter/plugin/editing/f;->a:Ltc/j;

    .line 332
    .line 333
    iput-object v2, v3, Ltc/j;->a:Ljava/lang/Object;

    .line 334
    .line 335
    iget-object v0, v0, Lio/flutter/plugin/editing/f;->c:Landroid/view/textservice/SpellCheckerSession;

    .line 336
    .line 337
    if-eqz v0, :cond_a

    .line 338
    .line 339
    invoke-virtual {v0}, Landroid/view/textservice/SpellCheckerSession;->close()V

    .line 340
    .line 341
    .line 342
    :cond_a
    iget-object v0, p0, Lkc/r;->j:Lba/a;

    .line 343
    .line 344
    if-eqz v0, :cond_b

    .line 345
    .line 346
    iget-object v0, v0, Lba/a;->c:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, La2/c;

    .line 349
    .line 350
    iput-object v2, v0, La2/c;->b:Ljava/lang/Object;

    .line 351
    .line 352
    :cond_b
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 353
    .line 354
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 355
    .line 356
    iput-boolean v1, p0, Lkc/r;->g:Z

    .line 357
    .line 358
    iget-object v3, v0, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 359
    .line 360
    iget-object v4, p0, Lkc/r;->v:Lkc/c;

    .line 361
    .line 362
    invoke-virtual {v3, v4}, Lio/flutter/embedding/engine/FlutterJNI;->removeIsDisplayingFlutterUiListener(Lio/flutter/embedding/engine/renderer/l;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/k;->g()V

    .line 366
    .line 367
    .line 368
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 369
    .line 370
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 371
    .line 372
    .line 373
    iget-object v0, p0, Lkc/r;->e:Landroid/view/View;

    .line 374
    .line 375
    if-eqz v0, :cond_c

    .line 376
    .line 377
    iget-object v1, p0, Lkc/r;->d:Landroid/view/View;

    .line 378
    .line 379
    iget-object v3, p0, Lkc/r;->c:Lkc/m;

    .line 380
    .line 381
    if-ne v1, v3, :cond_c

    .line 382
    .line 383
    iput-object v0, p0, Lkc/r;->d:Landroid/view/View;

    .line 384
    .line 385
    :cond_c
    iget-object v0, p0, Lkc/r;->d:Landroid/view/View;

    .line 386
    .line 387
    invoke-interface {v0}, Lio/flutter/embedding/engine/renderer/m;->b()V

    .line 388
    .line 389
    .line 390
    iget-object v0, p0, Lkc/r;->c:Lkc/m;

    .line 391
    .line 392
    if-eqz v0, :cond_d

    .line 393
    .line 394
    iget-object v0, v0, Lkc/m;->a:Landroid/media/ImageReader;

    .line 395
    .line 396
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 397
    .line 398
    .line 399
    iget-object v0, p0, Lkc/r;->c:Lkc/m;

    .line 400
    .line 401
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 402
    .line 403
    .line 404
    iput-object v2, p0, Lkc/r;->c:Lkc/m;

    .line 405
    .line 406
    :cond_d
    iput-object v2, p0, Lkc/r;->e:Landroid/view/View;

    .line 407
    .line 408
    iput-object v2, p0, Lkc/r;->h:Llc/b;

    .line 409
    .line 410
    return-void

    .line 411
    :cond_e
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    throw v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkc/r;->a:Lkc/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lkc/r;->b:Lkc/p;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lkc/r;->c:Lkc/m;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 27
    .line 28
    .line 29
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v1, 0x1a

    .line 32
    .line 33
    if-lt v0, v1, :cond_2

    .line 34
    .line 35
    invoke-static {p0}, Lio/flutter/plugin/editing/h;->y(Lkc/r;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public final checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->j:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/view/View;

    .line 36
    .line 37
    if-ne v0, p1, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/View;->checkInputConnectionProxy(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->checkInputConnectionProxy(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lkc/r;->d:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/m;->getAttachedRenderer()Lio/flutter/embedding/engine/renderer/k;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lkc/r;->n:LDd/c;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, LDd/c;->H(Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    :cond_3
    return v1

    .line 56
    :cond_4
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final e()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x30

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    :goto_0
    iget-object v1, p0, Lkc/r;->q:Landroid/view/textservice/TextServicesManager;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v5, 0x1f

    .line 29
    .line 30
    if-lt v4, v5, :cond_3

    .line 31
    .line 32
    invoke-static {v1}, Le1/c;->n(Landroid/view/textservice/TextServicesManager;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Landroid/view/textservice/SpellCheckerInfo;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/textservice/SpellCheckerInfo;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v5, "com.google.android.inputmethod.latin"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    move v1, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v1, v3

    .line 67
    :goto_1
    iget-object v4, p0, Lkc/r;->q:Landroid/view/textservice/TextServicesManager;

    .line 68
    .line 69
    invoke-static {v4}, Le1/c;->B(Landroid/view/textservice/TextServicesManager;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    :cond_3
    move v1, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v1, v3

    .line 80
    :goto_2
    iget-object v4, p0, Lkc/r;->h:Llc/b;

    .line 81
    .line 82
    iget-object v4, v4, Llc/b;->n:Ltc/i;

    .line 83
    .line 84
    iget-object v4, v4, Ltc/i;->a:LVa/X7;

    .line 85
    .line 86
    new-instance v5, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget v6, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const-string v7, "textScaleFactor"

    .line 106
    .line 107
    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v8, "nativeSpellCheckServiceDefined"

    .line 123
    .line 124
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v8, "show_password"

    .line 136
    .line 137
    invoke-static {v1, v8, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-ne v1, v2, :cond_5

    .line 142
    .line 143
    move v1, v2

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move v1, v3

    .line 146
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const-string v8, "brieflyShowPassword"

    .line 151
    .line 152
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const-string v8, "alwaysUse24HourFormat"

    .line 168
    .line 169
    invoke-virtual {v5, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    if-eq v0, v1, :cond_7

    .line 174
    .line 175
    const/4 v1, 0x2

    .line 176
    if-ne v0, v1, :cond_6

    .line 177
    .line 178
    const-string v0, "dark"

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_6
    const/4 v0, 0x0

    .line 182
    throw v0

    .line 183
    :cond_7
    const-string v0, "light"

    .line 184
    .line 185
    :goto_4
    const-string v1, "platformBrightness"

    .line 186
    .line 187
    invoke-virtual {v5, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 212
    .line 213
    const/16 v1, 0x22

    .line 214
    .line 215
    if-lt v0, v1, :cond_8

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_8
    move v2, v3

    .line 219
    :goto_5
    const/4 v0, 0x0

    .line 220
    if-eqz v2, :cond_b

    .line 221
    .line 222
    if-nez v6, :cond_9

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_9
    new-instance v1, Ltc/h;

    .line 226
    .line 227
    invoke-direct {v1, v6}, Ltc/h;-><init>(Landroid/util/DisplayMetrics;)V

    .line 228
    .line 229
    .line 230
    sget-object v2, Ltc/i;->b:Lmd/J;

    .line 231
    .line 232
    iget-object v3, v2, Lmd/J;->a:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 235
    .line 236
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    iget-object v3, v2, Lmd/J;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v3, Ltc/h;

    .line 242
    .line 243
    iput-object v1, v2, Lmd/J;->c:Ljava/lang/Object;

    .line 244
    .line 245
    if-nez v3, :cond_a

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_a
    new-instance v0, LY2/B;

    .line 249
    .line 250
    const/16 v6, 0x1d

    .line 251
    .line 252
    invoke-direct {v0, v6, v2, v3}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :goto_6
    iget v1, v1, Ltc/h;->a:I

    .line 256
    .line 257
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    const-string v2, "configurationId"

    .line 262
    .line 263
    invoke-virtual {v5, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4, v5, v0}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_b
    :goto_7
    invoke-virtual {v4, v5, v0}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 271
    .line 272
    .line 273
    return-void
.end method

.method public final f()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lkc/r;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "FlutterView"

    .line 10
    .line 11
    const-string v2, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine."

    .line 12
    .line 13
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 26
    .line 27
    iget-object v2, v0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 28
    .line 29
    iput v1, v2, Lio/flutter/embedding/engine/renderer/j;->a:F

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iput v1, v2, Lio/flutter/embedding/engine/renderer/j;->p:I

    .line 44
    .line 45
    iget-object v1, v0, Lkc/r;->h:Llc/b;

    .line 46
    .line 47
    iget-object v1, v1, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget v3, v2, Lio/flutter/embedding/engine/renderer/j;->b:I

    .line 53
    .line 54
    if-lez v3, :cond_3

    .line 55
    .line 56
    iget v3, v2, Lio/flutter/embedding/engine/renderer/j;->c:I

    .line 57
    .line 58
    if-lez v3, :cond_3

    .line 59
    .line 60
    iget v3, v2, Lio/flutter/embedding/engine/renderer/j;->a:F

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    cmpl-float v3, v3, v4

    .line 64
    .line 65
    if-lez v3, :cond_3

    .line 66
    .line 67
    iget-object v3, v2, Lio/flutter/embedding/engine/renderer/j;->q:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    iget-object v4, v2, Lio/flutter/embedding/engine/renderer/j;->r:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    add-int/2addr v6, v5

    .line 86
    mul-int/lit8 v5, v6, 0x4

    .line 87
    .line 88
    new-array v5, v5, [I

    .line 89
    .line 90
    new-array v7, v6, [I

    .line 91
    .line 92
    new-array v6, v6, [I

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    move v9, v8

    .line 96
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-ge v9, v10, :cond_1

    .line 101
    .line 102
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    check-cast v10, Lio/flutter/embedding/engine/renderer/c;

    .line 107
    .line 108
    mul-int/lit8 v11, v9, 0x4

    .line 109
    .line 110
    iget-object v12, v10, Lio/flutter/embedding/engine/renderer/c;->a:Landroid/graphics/Rect;

    .line 111
    .line 112
    iget v13, v12, Landroid/graphics/Rect;->left:I

    .line 113
    .line 114
    aput v13, v5, v11

    .line 115
    .line 116
    add-int/lit8 v13, v11, 0x1

    .line 117
    .line 118
    iget v14, v12, Landroid/graphics/Rect;->top:I

    .line 119
    .line 120
    aput v14, v5, v13

    .line 121
    .line 122
    add-int/lit8 v13, v11, 0x2

    .line 123
    .line 124
    iget v14, v12, Landroid/graphics/Rect;->right:I

    .line 125
    .line 126
    aput v14, v5, v13

    .line 127
    .line 128
    add-int/lit8 v11, v11, 0x3

    .line 129
    .line 130
    iget v12, v12, Landroid/graphics/Rect;->bottom:I

    .line 131
    .line 132
    aput v12, v5, v11

    .line 133
    .line 134
    iget v11, v10, Lio/flutter/embedding/engine/renderer/c;->b:I

    .line 135
    .line 136
    invoke-static {v11}, LA/f;->f(I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    aput v11, v7, v9

    .line 141
    .line 142
    iget v10, v10, Lio/flutter/embedding/engine/renderer/c;->c:I

    .line 143
    .line 144
    invoke-static {v10}, LA/f;->f(I)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    aput v10, v6, v9

    .line 149
    .line 150
    add-int/lit8 v9, v9, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    mul-int/lit8 v9, v9, 0x4

    .line 158
    .line 159
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-ge v8, v10, :cond_2

    .line 164
    .line 165
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    check-cast v10, Lio/flutter/embedding/engine/renderer/c;

    .line 170
    .line 171
    mul-int/lit8 v11, v8, 0x4

    .line 172
    .line 173
    add-int/2addr v11, v9

    .line 174
    iget-object v12, v10, Lio/flutter/embedding/engine/renderer/c;->a:Landroid/graphics/Rect;

    .line 175
    .line 176
    iget v13, v12, Landroid/graphics/Rect;->left:I

    .line 177
    .line 178
    aput v13, v5, v11

    .line 179
    .line 180
    add-int/lit8 v13, v11, 0x1

    .line 181
    .line 182
    iget v14, v12, Landroid/graphics/Rect;->top:I

    .line 183
    .line 184
    aput v14, v5, v13

    .line 185
    .line 186
    add-int/lit8 v13, v11, 0x2

    .line 187
    .line 188
    iget v14, v12, Landroid/graphics/Rect;->right:I

    .line 189
    .line 190
    aput v14, v5, v13

    .line 191
    .line 192
    add-int/lit8 v11, v11, 0x3

    .line 193
    .line 194
    iget v12, v12, Landroid/graphics/Rect;->bottom:I

    .line 195
    .line 196
    aput v12, v5, v11

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    add-int/2addr v11, v8

    .line 203
    iget v12, v10, Lio/flutter/embedding/engine/renderer/c;->b:I

    .line 204
    .line 205
    invoke-static {v12}, LA/f;->f(I)I

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    aput v12, v7, v11

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    add-int/2addr v11, v8

    .line 216
    iget v10, v10, Lio/flutter/embedding/engine/renderer/c;->c:I

    .line 217
    .line 218
    invoke-static {v10}, LA/f;->f(I)I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    aput v10, v6, v11

    .line 223
    .line 224
    add-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_2
    iget v8, v2, Lio/flutter/embedding/engine/renderer/j;->a:F

    .line 228
    .line 229
    iget v9, v2, Lio/flutter/embedding/engine/renderer/j;->b:I

    .line 230
    .line 231
    iget v10, v2, Lio/flutter/embedding/engine/renderer/j;->c:I

    .line 232
    .line 233
    iget v11, v2, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 234
    .line 235
    iget v12, v2, Lio/flutter/embedding/engine/renderer/j;->e:I

    .line 236
    .line 237
    iget v13, v2, Lio/flutter/embedding/engine/renderer/j;->f:I

    .line 238
    .line 239
    iget v14, v2, Lio/flutter/embedding/engine/renderer/j;->g:I

    .line 240
    .line 241
    iget v15, v2, Lio/flutter/embedding/engine/renderer/j;->h:I

    .line 242
    .line 243
    iget v3, v2, Lio/flutter/embedding/engine/renderer/j;->i:I

    .line 244
    .line 245
    iget v4, v2, Lio/flutter/embedding/engine/renderer/j;->j:I

    .line 246
    .line 247
    iget v0, v2, Lio/flutter/embedding/engine/renderer/j;->k:I

    .line 248
    .line 249
    move/from16 v18, v0

    .line 250
    .line 251
    iget v0, v2, Lio/flutter/embedding/engine/renderer/j;->l:I

    .line 252
    .line 253
    move/from16 v19, v0

    .line 254
    .line 255
    iget v0, v2, Lio/flutter/embedding/engine/renderer/j;->m:I

    .line 256
    .line 257
    move/from16 v20, v0

    .line 258
    .line 259
    iget v0, v2, Lio/flutter/embedding/engine/renderer/j;->n:I

    .line 260
    .line 261
    move/from16 v21, v0

    .line 262
    .line 263
    iget v0, v2, Lio/flutter/embedding/engine/renderer/j;->o:I

    .line 264
    .line 265
    iget v2, v2, Lio/flutter/embedding/engine/renderer/j;->p:I

    .line 266
    .line 267
    iget-object v1, v1, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 268
    .line 269
    move/from16 v22, v0

    .line 270
    .line 271
    move/from16 v23, v2

    .line 272
    .line 273
    move/from16 v16, v3

    .line 274
    .line 275
    move/from16 v17, v4

    .line 276
    .line 277
    move-object/from16 v24, v5

    .line 278
    .line 279
    move-object/from16 v26, v6

    .line 280
    .line 281
    move-object/from16 v25, v7

    .line 282
    .line 283
    move-object v7, v1

    .line 284
    invoke-virtual/range {v7 .. v26}, Lio/flutter/embedding/engine/FlutterJNI;->setViewportMetrics(FIIIIIIIIIIIIIII[I[I[I)V

    .line 285
    .line 286
    .line 287
    :cond_3
    return-void
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lio/flutter/view/l;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public getAttachedFlutterEngine()Llc/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBinaryMessenger()Luc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 2
    .line 3
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 4
    .line 5
    return-object v0
.end method

.method public getCurrentImageSurface()Lkc/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/r;->c:Lkc/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public getViewportMetrics()Lio/flutter/embedding/engine/renderer/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/widget/FrameLayout;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v4, 0x1d

    .line 12
    .line 13
    iget-object v5, v0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lio/flutter/plugin/platform/o;->x(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, Lq/k0;->b(Landroid/graphics/Insets;)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    iput v6, v5, Lio/flutter/embedding/engine/renderer/j;->l:I

    .line 26
    .line 27
    invoke-static {v4}, Lq/k0;->r(Landroid/graphics/Insets;)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iput v6, v5, Lio/flutter/embedding/engine/renderer/j;->m:I

    .line 32
    .line 33
    invoke-static {v4}, Lq/k0;->x(Landroid/graphics/Insets;)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    iput v6, v5, Lio/flutter/embedding/engine/renderer/j;->n:I

    .line 38
    .line 39
    invoke-static {v4}, Lio/flutter/plugin/platform/o;->b(Landroid/graphics/Insets;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->o:I

    .line 44
    .line 45
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v6, 0x4

    .line 50
    and-int/2addr v4, v6

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x1

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    move v4, v8

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v4, v7

    .line 58
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    const/4 v10, 0x2

    .line 63
    and-int/2addr v9, v10

    .line 64
    if-nez v9, :cond_2

    .line 65
    .line 66
    move v9, v8

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v9, v7

    .line 69
    :goto_1
    const/16 v11, 0x1e

    .line 70
    .line 71
    if-lt v3, v11, :cond_3

    .line 72
    .line 73
    invoke-static {}, LA7/N0;->u()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v1, v4}, Lk1/c0;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lq/k0;->b(Landroid/graphics/Insets;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 86
    .line 87
    invoke-static {v4}, Lq/k0;->r(Landroid/graphics/Insets;)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->e:I

    .line 92
    .line 93
    invoke-static {v4}, Lq/k0;->x(Landroid/graphics/Insets;)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->f:I

    .line 98
    .line 99
    invoke-static {v4}, Lio/flutter/plugin/platform/o;->b(Landroid/graphics/Insets;)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->g:I

    .line 104
    .line 105
    invoke-static {}, Lcom/applovin/impl/sdk/z;->D()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v1, v4}, Lk1/c0;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v4}, Lq/k0;->b(Landroid/graphics/Insets;)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->h:I

    .line 118
    .line 119
    invoke-static {v4}, Lq/k0;->r(Landroid/graphics/Insets;)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->i:I

    .line 124
    .line 125
    invoke-static {v4}, Lq/k0;->x(Landroid/graphics/Insets;)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->j:I

    .line 130
    .line 131
    invoke-static {v4}, Lio/flutter/plugin/platform/o;->b(Landroid/graphics/Insets;)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->k:I

    .line 136
    .line 137
    invoke-static {}, Lk1/c0;->u()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-static {v1, v4}, Lk1/c0;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-static {v4}, Lq/k0;->b(Landroid/graphics/Insets;)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->l:I

    .line 150
    .line 151
    invoke-static {v4}, Lq/k0;->r(Landroid/graphics/Insets;)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->m:I

    .line 156
    .line 157
    invoke-static {v4}, Lq/k0;->x(Landroid/graphics/Insets;)I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->n:I

    .line 162
    .line 163
    invoke-static {v4}, Lio/flutter/plugin/platform/o;->b(Landroid/graphics/Insets;)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->o:I

    .line 168
    .line 169
    invoke-static {v1}, Ldb/b;->l(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-eqz v4, :cond_11

    .line 174
    .line 175
    invoke-static {v4}, Lk1/c0;->c(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    iget v9, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 180
    .line 181
    invoke-static {v7}, Lq/k0;->b(Landroid/graphics/Insets;)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    invoke-static {v4}, LA0/j;->d(Landroid/view/DisplayCutout;)I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    iput v9, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 198
    .line 199
    iget v9, v5, Lio/flutter/embedding/engine/renderer/j;->e:I

    .line 200
    .line 201
    invoke-static {v7}, Lq/k0;->r(Landroid/graphics/Insets;)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    invoke-static {v4}, LA0/j;->D(Landroid/view/DisplayCutout;)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    iput v9, v5, Lio/flutter/embedding/engine/renderer/j;->e:I

    .line 218
    .line 219
    iget v9, v5, Lio/flutter/embedding/engine/renderer/j;->f:I

    .line 220
    .line 221
    invoke-static {v7}, Lq/k0;->x(Landroid/graphics/Insets;)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-static {v4}, LA0/j;->C(Landroid/view/DisplayCutout;)I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    iput v9, v5, Lio/flutter/embedding/engine/renderer/j;->f:I

    .line 238
    .line 239
    iget v9, v5, Lio/flutter/embedding/engine/renderer/j;->g:I

    .line 240
    .line 241
    invoke-static {v7}, Lio/flutter/plugin/platform/o;->b(Landroid/graphics/Insets;)I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    invoke-static {v4}, LA0/j;->z(Landroid/view/DisplayCutout;)I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->g:I

    .line 258
    .line 259
    goto/16 :goto_b

    .line 260
    .line 261
    :cond_3
    const/4 v11, 0x3

    .line 262
    if-nez v9, :cond_7

    .line 263
    .line 264
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    invoke-virtual {v13}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    iget v13, v13, Landroid/content/res/Configuration;->orientation:I

    .line 277
    .line 278
    if-ne v13, v10, :cond_7

    .line 279
    .line 280
    const-string v13, "display"

    .line 281
    .line 282
    invoke-virtual {v12, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    check-cast v12, Landroid/hardware/display/DisplayManager;

    .line 287
    .line 288
    invoke-virtual {v12, v7}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v12}, Landroid/view/Display;->getRotation()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-ne v12, v8, :cond_4

    .line 297
    .line 298
    move v12, v11

    .line 299
    goto :goto_2

    .line 300
    :cond_4
    if-ne v12, v11, :cond_5

    .line 301
    .line 302
    move v12, v10

    .line 303
    goto :goto_2

    .line 304
    :cond_5
    if-eqz v12, :cond_6

    .line 305
    .line 306
    if-ne v12, v10, :cond_7

    .line 307
    .line 308
    :cond_6
    move v12, v6

    .line 309
    goto :goto_2

    .line 310
    :cond_7
    move v12, v8

    .line 311
    :goto_2
    if-eqz v4, :cond_8

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    goto :goto_3

    .line 318
    :cond_8
    move v4, v7

    .line 319
    :goto_3
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 320
    .line 321
    if-eq v12, v11, :cond_a

    .line 322
    .line 323
    if-ne v12, v6, :cond_9

    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_9
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    goto :goto_5

    .line 331
    :cond_a
    :goto_4
    move v4, v7

    .line 332
    :goto_5
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->e:I

    .line 333
    .line 334
    if-eqz v9, :cond_c

    .line 335
    .line 336
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    const-wide v15, 0x3fc70a3d70a3d70aL    # 0.18

    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    int-to-double v13, v9

    .line 354
    int-to-double v8, v4

    .line 355
    mul-double/2addr v8, v15

    .line 356
    cmpg-double v4, v13, v8

    .line 357
    .line 358
    if-gez v4, :cond_b

    .line 359
    .line 360
    move v4, v7

    .line 361
    goto :goto_6

    .line 362
    :cond_b
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    :goto_6
    if-nez v4, :cond_d

    .line 367
    .line 368
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    goto :goto_7

    .line 373
    :cond_c
    const-wide v15, 0x3fc70a3d70a3d70aL    # 0.18

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    :cond_d
    move v4, v7

    .line 379
    :goto_7
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->f:I

    .line 380
    .line 381
    if-eq v12, v10, :cond_f

    .line 382
    .line 383
    if-ne v12, v6, :cond_e

    .line 384
    .line 385
    goto :goto_8

    .line 386
    :cond_e
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    goto :goto_9

    .line 391
    :cond_f
    :goto_8
    move v4, v7

    .line 392
    :goto_9
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->g:I

    .line 393
    .line 394
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->h:I

    .line 395
    .line 396
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->i:I

    .line 397
    .line 398
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    int-to-double v8, v8

    .line 411
    int-to-double v12, v4

    .line 412
    mul-double/2addr v12, v15

    .line 413
    cmpg-double v4, v8, v12

    .line 414
    .line 415
    if-gez v4, :cond_10

    .line 416
    .line 417
    move v4, v7

    .line 418
    goto :goto_a

    .line 419
    :cond_10
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    :goto_a
    iput v4, v5, Lio/flutter/embedding/engine/renderer/j;->j:I

    .line 424
    .line 425
    iput v7, v5, Lio/flutter/embedding/engine/renderer/j;->k:I

    .line 426
    .line 427
    :cond_11
    :goto_b
    new-instance v4, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 430
    .line 431
    .line 432
    const/16 v7, 0x1c

    .line 433
    .line 434
    if-lt v3, v7, :cond_12

    .line 435
    .line 436
    invoke-static {v1}, Ldb/b;->l(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    if-eqz v1, :cond_12

    .line 441
    .line 442
    invoke-static {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->o(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_12

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    check-cast v3, Landroid/graphics/Rect;

    .line 461
    .line 462
    invoke-virtual {v3}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    new-instance v7, Lio/flutter/embedding/engine/renderer/c;

    .line 466
    .line 467
    const/4 v11, 0x1

    .line 468
    invoke-direct {v7, v3, v6, v11}, Lio/flutter/embedding/engine/renderer/c;-><init>(Landroid/graphics/Rect;II)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    goto :goto_c

    .line 475
    :cond_12
    iget-object v1, v5, Lio/flutter/embedding/engine/renderer/j;->r:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 481
    .line 482
    .line 483
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 484
    .line 485
    const/16 v3, 0x23

    .line 486
    .line 487
    if-lt v1, v3, :cond_17

    .line 488
    .line 489
    iget-object v1, v0, Lkc/r;->x:Lkc/s;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-static {v3}, LS3/f;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    const/4 v3, 0x0

    .line 503
    if-nez v1, :cond_13

    .line 504
    .line 505
    goto :goto_d

    .line 506
    :cond_13
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    if-nez v1, :cond_14

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_14
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    :goto_d
    if-nez v3, :cond_15

    .line 522
    .line 523
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 524
    .line 525
    goto :goto_e

    .line 526
    :cond_15
    invoke-static {}, Lk1/c0;->s()I

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    invoke-static {v3, v1}, Lcom/applovin/impl/sdk/y;->i(Landroid/view/WindowInsets;I)Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    :goto_e
    iget v3, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 535
    .line 536
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-eqz v4, :cond_16

    .line 545
    .line 546
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    check-cast v4, Landroid/graphics/Rect;

    .line 551
    .line 552
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 553
    .line 554
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    goto :goto_f

    .line 559
    :cond_16
    iput v3, v5, Lio/flutter/embedding/engine/renderer/j;->d:I

    .line 560
    .line 561
    :cond_17
    invoke-virtual {v0}, Lkc/r;->f()V

    .line 562
    .line 563
    .line 564
    return-object v2
.end method

.method public final onAttachedToWindow()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v2, Lac/a;

    .line 7
    .line 8
    new-instance v3, LS3/e;

    .line 9
    .line 10
    sget-object v4, LD3/h;->I8:LD3/g;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v5}, LD3/g;->a(Landroid/content/Context;)LD3/b;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-direct {v3, v4}, LS3/e;-><init>(LD3/b;)V

    .line 24
    .line 25
    .line 26
    const/16 v4, 0xb

    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lac/a;-><init>(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-object v2, v1

    .line 33
    :goto_0
    iput-object v2, p0, Lkc/r;->r:Lac/a;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, LS3/f;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Lkc/r;->r:Lac/a;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    new-instance v4, LD3/i;

    .line 50
    .line 51
    invoke-direct {v4, p0, v0}, LD3/i;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput-object v4, p0, Lkc/r;->w:LD3/i;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, LY0/e;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget-object v5, p0, Lkc/r;->w:LD3/i;

    .line 65
    .line 66
    iget-object v3, v3, Lac/a;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, LS3/e;

    .line 69
    .line 70
    const-string v6, "executor"

    .line 71
    .line 72
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v6, "consumer"

    .line 76
    .line 77
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v6, v3, LS3/e;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, LD3/b;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v7, LD3/j;

    .line 88
    .line 89
    invoke-direct {v7, v6, v2, v1}, LD3/j;-><init>(LD3/b;Landroid/app/Activity;Ljf/c;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v7}, LHf/k0;->h(Ltf/p;)LHf/c;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v6, LEf/S;->a:LLf/e;

    .line 97
    .line 98
    sget-object v6, LJf/n;->a:LFf/e;

    .line 99
    .line 100
    invoke-static {v2, v6}, LHf/k0;->s(LHf/l;LFf/e;)LHf/l;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, v3, LS3/e;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, LS3/c;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const-string v6, "flow"

    .line 112
    .line 113
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v6, v3, LS3/c;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, Ljava/util/concurrent/locks/ReentrantLock;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 121
    .line 122
    .line 123
    iget-object v3, v3, LS3/c;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    :try_start_1
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-nez v7, :cond_0

    .line 132
    .line 133
    invoke-static {v4}, LEf/H;->r(Ljava/util/concurrent/Executor;)LEf/A;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v4}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    new-instance v7, LB3/b;

    .line 142
    .line 143
    invoke-direct {v7, v2, v5, v1}, LB3/b;-><init>(LHf/l;LD3/i;Ljf/c;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v1, v7, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v3, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto :goto_2

    .line 156
    :cond_0
    :goto_1
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :goto_2
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_1
    :goto_3
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lkc/r;->m:Lvc/a;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lvc/a;->b(Landroid/content/res/Configuration;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lkc/r;->e()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lkc/r;->h:Llc/b;

    .line 21
    .line 22
    invoke-static {p1, v0}, LS3/f;->i(Landroid/content/Context;Lld/b;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 13
    .line 14
    iget-object v5, p0, Lkc/r;->n:LDd/c;

    .line 15
    .line 16
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 17
    .line 18
    iget v2, v1, LD9/n;->b:I

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    iput-object v4, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    const/4 v6, 0x4

    .line 28
    if-ne v2, v6, :cond_2

    .line 29
    .line 30
    return-object v4

    .line 31
    :cond_2
    const/4 v4, 0x3

    .line 32
    if-ne v2, v4, :cond_4

    .line 33
    .line 34
    iget-boolean v2, v0, Lio/flutter/plugin/editing/i;->p:Z

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_3
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->k:Lio/flutter/plugin/platform/q;

    .line 42
    .line 43
    iget v1, v1, LD9/n;->c:I

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lio/flutter/plugin/platform/q;->b(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 57
    .line 58
    iget-object v2, v1, Ltc/k;->g:LN1/P;

    .line 59
    .line 60
    const/4 v7, 0x2

    .line 61
    iget v8, v2, LN1/P;->a:I

    .line 62
    .line 63
    if-ne v8, v7, :cond_5

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_5
    const/4 v9, 0x5

    .line 68
    if-ne v8, v9, :cond_7

    .line 69
    .line 70
    iget-boolean v4, v2, LN1/P;->b:Z

    .line 71
    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    const/16 v4, 0x1002

    .line 75
    .line 76
    move v6, v4

    .line 77
    goto :goto_0

    .line 78
    :cond_6
    move v6, v7

    .line 79
    :goto_0
    iget-boolean v2, v2, LN1/P;->c:Z

    .line 80
    .line 81
    if-eqz v2, :cond_17

    .line 82
    .line 83
    :goto_1
    or-int/lit16 v6, v6, 0x2000

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_7
    const/4 v2, 0x6

    .line 88
    if-ne v8, v2, :cond_8

    .line 89
    .line 90
    move v6, v4

    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_8
    const/16 v2, 0xb

    .line 94
    .line 95
    if-ne v8, v2, :cond_9

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_9
    const/4 v2, 0x7

    .line 101
    if-ne v8, v2, :cond_a

    .line 102
    .line 103
    const v2, 0x20001

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_a
    const/16 v2, 0x8

    .line 108
    .line 109
    if-eq v8, v2, :cond_11

    .line 110
    .line 111
    const/16 v2, 0xd

    .line 112
    .line 113
    if-ne v8, v2, :cond_b

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_b
    const/16 v2, 0x9

    .line 117
    .line 118
    if-eq v8, v2, :cond_10

    .line 119
    .line 120
    const/16 v2, 0xc

    .line 121
    .line 122
    if-ne v8, v2, :cond_c

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_c
    const/16 v2, 0xa

    .line 126
    .line 127
    if-ne v8, v2, :cond_d

    .line 128
    .line 129
    const/16 v2, 0x91

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_d
    if-ne v8, v4, :cond_e

    .line 133
    .line 134
    const/16 v2, 0x61

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_e
    if-ne v8, v6, :cond_f

    .line 138
    .line 139
    const/16 v2, 0x71

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_f
    move v2, v3

    .line 143
    goto :goto_4

    .line 144
    :cond_10
    :goto_2
    const/16 v2, 0x11

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_11
    :goto_3
    const/16 v2, 0x21

    .line 148
    .line 149
    :goto_4
    iget-boolean v6, v1, Ltc/k;->a:Z

    .line 150
    .line 151
    if-eqz v6, :cond_13

    .line 152
    .line 153
    const v6, 0x80080

    .line 154
    .line 155
    .line 156
    :goto_5
    or-int/2addr v2, v6

    .line 157
    :cond_12
    move v6, v2

    .line 158
    goto :goto_6

    .line 159
    :cond_13
    iget-boolean v6, v1, Ltc/k;->b:Z

    .line 160
    .line 161
    if-eqz v6, :cond_14

    .line 162
    .line 163
    const v6, 0x8000

    .line 164
    .line 165
    .line 166
    or-int/2addr v2, v6

    .line 167
    :cond_14
    iget-boolean v6, v1, Ltc/k;->c:Z

    .line 168
    .line 169
    if-nez v6, :cond_12

    .line 170
    .line 171
    const v6, 0x80090

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_6
    iget v2, v1, Ltc/k;->f:I

    .line 176
    .line 177
    if-ne v2, v3, :cond_15

    .line 178
    .line 179
    or-int/lit16 v6, v6, 0x1000

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_15
    if-ne v2, v7, :cond_16

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_16
    if-ne v2, v4, :cond_17

    .line 186
    .line 187
    or-int/lit16 v6, v6, 0x4000

    .line 188
    .line 189
    :cond_17
    :goto_7
    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 190
    .line 191
    const/high16 v2, 0x2000000

    .line 192
    .line 193
    iput v2, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 194
    .line 195
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 196
    .line 197
    const/16 v4, 0x1a

    .line 198
    .line 199
    if-lt v2, v4, :cond_18

    .line 200
    .line 201
    iget-boolean v4, v1, Ltc/k;->d:Z

    .line 202
    .line 203
    if-nez v4, :cond_18

    .line 204
    .line 205
    const/high16 v4, 0x3000000

    .line 206
    .line 207
    iput v4, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 208
    .line 209
    :cond_18
    iget-object v1, v1, Ltc/k;->h:Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 216
    .line 217
    iget-object v6, v4, Ltc/k;->i:Ljava/lang/String;

    .line 218
    .line 219
    if-eqz v6, :cond_19

    .line 220
    .line 221
    iput-object v6, p1, Landroid/view/inputmethod/EditorInfo;->actionLabel:Ljava/lang/CharSequence;

    .line 222
    .line 223
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->actionId:I

    .line 224
    .line 225
    :cond_19
    iget v6, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 226
    .line 227
    or-int/2addr v1, v6

    .line 228
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 229
    .line 230
    iget-object v1, v4, Ltc/k;->k:[Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v1, :cond_1a

    .line 233
    .line 234
    invoke-static {p1, v1}, Lm1/c;->a(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_1a
    const/16 v1, 0x22

    .line 238
    .line 239
    if-lt v2, v1, :cond_1d

    .line 240
    .line 241
    const/16 v1, 0x23

    .line 242
    .line 243
    if-lt v2, v1, :cond_1b

    .line 244
    .line 245
    invoke-static {p1}, Lm1/b;->a(Landroid/view/inputmethod/EditorInfo;)V

    .line 246
    .line 247
    .line 248
    :cond_1b
    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 249
    .line 250
    if-nez v1, :cond_1c

    .line 251
    .line 252
    new-instance v1, Landroid/os/Bundle;

    .line 253
    .line 254
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 255
    .line 256
    .line 257
    iput-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 258
    .line 259
    :cond_1c
    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 260
    .line 261
    const-string v2, "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"

    .line 262
    .line 263
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 264
    .line 265
    .line 266
    :cond_1d
    new-instance v1, Lio/flutter/plugin/editing/b;

    .line 267
    .line 268
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 269
    .line 270
    iget v3, v2, LD9/n;->c:I

    .line 271
    .line 272
    iget-object v6, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 273
    .line 274
    iget-object v4, v0, Lio/flutter/plugin/editing/i;->d:Lt6/q;

    .line 275
    .line 276
    move-object v2, p0

    .line 277
    move-object v7, p1

    .line 278
    invoke-direct/range {v1 .. v7}, Lio/flutter/plugin/editing/b;-><init>(Lkc/r;ILt6/q;LDd/c;Lio/flutter/plugin/editing/e;Landroid/view/inputmethod/EditorInfo;)V

    .line 279
    .line 280
    .line 281
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    iput p1, v7, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 291
    .line 292
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    iput p1, v7, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 302
    .line 303
    iput-object v1, v0, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 304
    .line 305
    return-object v1
.end method

.method public final onDetachedFromWindow()V
    .locals 5

    .line 1
    iget-object v0, p0, Lkc/r;->r:Lac/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lkc/r;->w:LD3/i;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lac/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LS3/e;

    .line 13
    .line 14
    iget-object v0, v0, LS3/e;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LS3/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, LS3/c;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ljava/util/concurrent/locks/ReentrantLock;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, LS3/c;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LEf/m0;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-interface {v4, v1}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LEf/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    :goto_0
    iput-object v1, p0, Lkc/r;->w:LD3/i;

    .line 59
    .line 60
    iput-object v1, p0, Lkc/r;->r:Lac/a;

    .line 61
    .line 62
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Lkc/r;->o:Lkc/a;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x7

    .line 26
    const/4 v9, 0x1

    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v2, v9

    .line 41
    :goto_1
    if-eqz v0, :cond_3

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Lkc/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    mul-int/lit16 v0, v0, 0x120

    .line 58
    .line 59
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    sget-object v6, Lkc/a;->f:Landroid/graphics/Matrix;

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    move-object v2, p1

    .line 76
    invoke-virtual/range {v1 .. v8}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    rem-int/lit16 p1, p1, 0x120

    .line 84
    .line 85
    if-nez p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, v1, Lkc/a;->a:Lio/flutter/embedding/engine/renderer/k;

    .line 92
    .line 93
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 94
    .line 95
    invoke-virtual {v0, v7, p1}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 96
    .line 97
    .line 98
    return v9

    .line 99
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 100
    .line 101
    const-string v0, "Packet position is not on field boundary."

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_3
    move-object v2, p1

    .line 108
    invoke-super {p0, v2}, Landroid/widget/FrameLayout;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    return p1
.end method

.method public final onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Lkc/r;->p:Lio/flutter/view/l;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p1, v1}, Lio/flutter/view/l;->e(Landroid/view/MotionEvent;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Landroid/widget/FrameLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    iget-object v2, v1, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 9
    .line 10
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v4, 0x1a

    .line 13
    .line 14
    if-lt v3, v4, :cond_5

    .line 15
    .line 16
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 17
    .line 18
    if-eqz v3, :cond_4

    .line 19
    .line 20
    iget-object v3, v2, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 21
    .line 22
    iget-object v3, v3, Ltc/k;->j:LS3/i;

    .line 23
    .line 24
    iget-object v3, v3, LS3/i;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/ViewStructure;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    :goto_0
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-ge v6, v7, :cond_4

    .line 41
    .line 42
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 43
    .line 44
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->keyAt(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    iget-object v8, v2, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Ltc/k;

    .line 55
    .line 56
    iget-object v8, v8, Ltc/k;->j:LS3/i;

    .line 57
    .line 58
    if-nez v8, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const/4 v9, 0x1

    .line 62
    invoke-virtual {v0, v9}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-virtual {v10, v4, v7}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 70
    .line 71
    .line 72
    iget-object v11, v8, LS3/i;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v11, [Ljava/lang/String;

    .line 75
    .line 76
    array-length v12, v11

    .line 77
    if-lez v12, :cond_1

    .line 78
    .line 79
    invoke-virtual {v10, v11}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v10, v9}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v8, LS3/i;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v9, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v9, :cond_2

    .line 93
    .line 94
    invoke-virtual {v10, v9}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-ne v9, v7, :cond_3

    .line 102
    .line 103
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 104
    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    iget v11, v7, Landroid/graphics/Rect;->left:I

    .line 108
    .line 109
    iget v12, v7, Landroid/graphics/Rect;->top:I

    .line 110
    .line 111
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 116
    .line 117
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 118
    .line 119
    .line 120
    move-result v16

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v2, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 127
    .line 128
    invoke-static {v7}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v10, v7}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    const/4 v15, 0x1

    .line 137
    const/16 v16, 0x1

    .line 138
    .line 139
    const/4 v11, 0x0

    .line 140
    const/4 v12, 0x0

    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 144
    .line 145
    .line 146
    iget-object v7, v8, LS3/i;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v7, Ltc/l;

    .line 149
    .line 150
    iget-object v7, v7, Ltc/l;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v7}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {v10, v7}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_4
    return-void

    .line 163
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 5
    .line 6
    iput p1, p3, Lio/flutter/embedding/engine/renderer/j;->b:I

    .line 7
    .line 8
    iput p2, p3, Lio/flutter/embedding/engine/renderer/j;->c:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc/r;->f()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/r;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lkc/r;->o:Lkc/a;

    .line 16
    .line 17
    sget-object v1, Lkc/a;->f:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lkc/a;->d(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public setDelegate(Lkc/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkc/r;->x:Lkc/s;

    .line 2
    .line 3
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/r;->d:Landroid/view/View;

    .line 5
    .line 6
    instance-of v1, v0, Lkc/n;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lkc/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setWindowInfoListenerDisplayFeatures(LD3/k;)V
    .locals 7

    .line 1
    iget-object p1, p1, LD3/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LD3/c;

    .line 23
    .line 24
    iget-object v2, v1, LD3/c;->a:LA3/b;

    .line 25
    .line 26
    invoke-virtual {v2}, LA3/b;->a()Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, LD3/c;->a:LA3/b;

    .line 34
    .line 35
    iget v3, v2, LA3/b;->c:I

    .line 36
    .line 37
    iget v4, v2, LA3/b;->a:I

    .line 38
    .line 39
    sub-int/2addr v3, v4

    .line 40
    sget-object v4, LD3/b;->d:LD3/b;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget v3, v2, LA3/b;->d:I

    .line 45
    .line 46
    iget v5, v2, LA3/b;->b:I

    .line 47
    .line 48
    sub-int/2addr v3, v5

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move-object v3, v4

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    sget-object v3, LD3/b;->c:LD3/b;

    .line 55
    .line 56
    :goto_2
    const/4 v5, 0x2

    .line 57
    const/4 v6, 0x3

    .line 58
    if-ne v3, v4, :cond_2

    .line 59
    .line 60
    move v3, v6

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    move v3, v5

    .line 63
    :goto_3
    sget-object v4, LD3/b;->e:LD3/b;

    .line 64
    .line 65
    iget-object v1, v1, LD3/c;->c:LD3/b;

    .line 66
    .line 67
    if-ne v1, v4, :cond_3

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_3
    sget-object v4, LD3/b;->f:LD3/b;

    .line 71
    .line 72
    if-ne v1, v4, :cond_4

    .line 73
    .line 74
    move v5, v6

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/4 v5, 0x1

    .line 77
    :goto_4
    new-instance v1, Lio/flutter/embedding/engine/renderer/c;

    .line 78
    .line 79
    invoke-virtual {v2}, LA3/b;->a()Landroid/graphics/Rect;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-direct {v1, v2, v3, v5}, Lio/flutter/embedding/engine/renderer/c;-><init>(Landroid/graphics/Rect;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object p1, p0, Lkc/r;->s:Lio/flutter/embedding/engine/renderer/j;

    .line 91
    .line 92
    iget-object p1, p1, Lio/flutter/embedding/engine/renderer/j;->q:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lkc/r;->f()V

    .line 101
    .line 102
    .line 103
    return-void
.end method
