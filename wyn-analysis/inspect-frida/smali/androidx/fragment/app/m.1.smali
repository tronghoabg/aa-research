.class public final Landroidx/fragment/app/m;
.super Landroidx/fragment/app/z0;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/fragment/app/A0;

.field public final e:Landroidx/fragment/app/A0;

.field public final f:Landroidx/fragment/app/v0;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lx/e;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:Lx/e;

.field public final n:Lx/e;

.field public final o:Z

.field public final p:LR4/a;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroidx/fragment/app/A0;Landroidx/fragment/app/A0;Landroidx/fragment/app/v0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lx/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Lx/e;Lx/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/m;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/m;->d:Landroidx/fragment/app/A0;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/m;->e:Landroidx/fragment/app/A0;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/fragment/app/m;->f:Landroidx/fragment/app/v0;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/fragment/app/m;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/fragment/app/m;->h:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/fragment/app/m;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p8, p0, Landroidx/fragment/app/m;->j:Lx/e;

    .line 19
    .line 20
    iput-object p9, p0, Landroidx/fragment/app/m;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p10, p0, Landroidx/fragment/app/m;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p11, p0, Landroidx/fragment/app/m;->m:Lx/e;

    .line 25
    .line 26
    iput-object p12, p0, Landroidx/fragment/app/m;->n:Lx/e;

    .line 27
    .line 28
    iput-boolean p13, p0, Landroidx/fragment/app/m;->o:Z

    .line 29
    .line 30
    new-instance p1, LR4/a;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/fragment/app/m;->p:LR4/a;

    .line 36
    .line 37
    return-void
.end method

.method public static f(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget v1, Lk1/U;->a:I

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, p0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-static {v2, p1}, Landroidx/fragment/app/m;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/m;->f:Landroidx/fragment/app/v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/v0;->i()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/m;->p:LR4/a;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    iget-boolean v0, p1, LR4/a;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    monitor-exit p1

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p1, LR4/a;->a:Z

    .line 19
    .line 20
    iput-boolean v0, p1, LR4/a;->b:Z

    .line 21
    .line 22
    iget-object v0, p1, LR4/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La2/v;

    .line 25
    .line 26
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :try_start_1
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lt3/p;

    .line 33
    .line 34
    invoke-virtual {v0}, Lt3/p;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v0

    .line 39
    monitor-enter p1

    .line 40
    :try_start_2
    iput-boolean v1, p1, LR4/a;->b:Z

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 43
    .line 44
    .line 45
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 46
    throw v0

    .line 47
    :catchall_2
    move-exception v0

    .line 48
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 49
    throw v0

    .line 50
    :cond_1
    :goto_0
    monitor-enter p1

    .line 51
    :try_start_4
    iput-boolean v1, p1, LR4/a;->b:Z

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 54
    .line 55
    .line 56
    monitor-exit p1

    .line 57
    return-void

    .line 58
    :catchall_3
    move-exception v0

    .line 59
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 60
    throw v0

    .line 61
    :goto_1
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 62
    throw v0
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "View: "

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/fragment/app/m;->j:Lx/e;

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/fragment/app/m;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, v0, Landroidx/fragment/app/m;->f:Landroidx/fragment/app/v0;

    .line 12
    .line 13
    const-string v9, "container"

    .line 14
    .line 15
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v10, v0, Landroidx/fragment/app/m;->c:Ljava/util/ArrayList;

    .line 23
    .line 24
    const-string v11, "FragmentManager"

    .line 25
    .line 26
    const/4 v12, 0x2

    .line 27
    if-nez v9, :cond_2

    .line 28
    .line 29
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroidx/fragment/app/n;

    .line 44
    .line 45
    iget-object v4, v3, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 46
    .line 47
    invoke-static {v12}, Landroidx/fragment/app/e0;->J(I)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    new-instance v5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v6, "SpecialEffectsController: Container "

    .line 56
    .line 57
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v6, " has not been laid out. Completing operation "

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    :cond_0
    iget-object v3, v3, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Landroidx/fragment/app/A0;->c(Landroidx/fragment/app/z0;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object v10, v0

    .line 85
    goto/16 :goto_12

    .line 86
    .line 87
    :cond_2
    iget-object v9, v0, Landroidx/fragment/app/m;->e:Landroidx/fragment/app/A0;

    .line 88
    .line 89
    iget-object v13, v0, Landroidx/fragment/app/m;->d:Landroidx/fragment/app/A0;

    .line 90
    .line 91
    new-instance v14, Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    invoke-direct {v14, v15}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    new-instance v15, Landroid/graphics/Rect;

    .line 101
    .line 102
    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v16

    .line 109
    const/4 v6, 0x0

    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v18

    .line 116
    iget-object v12, v0, Landroidx/fragment/app/m;->i:Ljava/util/ArrayList;

    .line 117
    .line 118
    iget-object v8, v0, Landroidx/fragment/app/m;->h:Ljava/util/ArrayList;

    .line 119
    .line 120
    iget-object v5, v0, Landroidx/fragment/app/m;->f:Landroidx/fragment/app/v0;

    .line 121
    .line 122
    if-eqz v18, :cond_7

    .line 123
    .line 124
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v18

    .line 128
    move-object/from16 v27, v3

    .line 129
    .line 130
    move-object/from16 v3, v18

    .line 131
    .line 132
    check-cast v3, Landroidx/fragment/app/n;

    .line 133
    .line 134
    iget-object v3, v3, Landroidx/fragment/app/n;->d:Ljava/lang/Object;

    .line 135
    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    if-eqz v13, :cond_6

    .line 139
    .line 140
    if-eqz v9, :cond_6

    .line 141
    .line 142
    invoke-virtual/range {v27 .. v27}, Lx/v;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_6

    .line 147
    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    iget-object v3, v0, Landroidx/fragment/app/m;->m:Lx/e;

    .line 151
    .line 152
    sget-object v18, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/t0;

    .line 153
    .line 154
    move-object/from16 v18, v7

    .line 155
    .line 156
    const-string v7, "inFragment"

    .line 157
    .line 158
    move-object/from16 v28, v10

    .line 159
    .line 160
    iget-object v10, v9, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 161
    .line 162
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v7, "outFragment"

    .line 166
    .line 167
    move-object/from16 v19, v10

    .line 168
    .line 169
    iget-object v10, v13, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 170
    .line 171
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-boolean v7, v0, Landroidx/fragment/app/m;->o:Z

    .line 175
    .line 176
    if-eqz v7, :cond_3

    .line 177
    .line 178
    invoke-virtual {v10}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    invoke-virtual/range {v19 .. v19}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 183
    .line 184
    .line 185
    :goto_2
    new-instance v7, LAb/a;

    .line 186
    .line 187
    const/16 v10, 0x13

    .line 188
    .line 189
    invoke-direct {v7, v9, v13, v0, v10}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v7}, Lk1/t;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Lx/e;->values()Ljava/util/Collection;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 200
    .line 201
    .line 202
    iget-object v7, v0, Landroidx/fragment/app/m;->l:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    if-nez v10, :cond_4

    .line 209
    .line 210
    const/4 v10, 0x0

    .line 211
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    const-string v7, "exitingNames[0]"

    .line 216
    .line 217
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    check-cast v6, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v3, v6}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Landroid/view/View;

    .line 227
    .line 228
    invoke-virtual {v5, v3, v4}, Landroidx/fragment/app/v0;->n(Landroid/view/View;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    move-object v6, v3

    .line 232
    :cond_4
    iget-object v3, v0, Landroidx/fragment/app/m;->n:Lx/e;

    .line 233
    .line 234
    invoke-virtual {v3}, Lx/e;->values()Ljava/util/Collection;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 239
    .line 240
    .line 241
    iget-object v7, v0, Landroidx/fragment/app/m;->k:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-nez v10, :cond_5

    .line 248
    .line 249
    const/4 v10, 0x0

    .line 250
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    const-string v10, "enteringNames[0]"

    .line 255
    .line 256
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    check-cast v7, Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v3, v7}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Landroid/view/View;

    .line 266
    .line 267
    if-eqz v3, :cond_5

    .line 268
    .line 269
    new-instance v7, Landroidx/fragment/app/l;

    .line 270
    .line 271
    invoke-direct {v7, v5, v3, v15}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/v0;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v1, v7}, Lk1/t;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 275
    .line 276
    .line 277
    const/16 v17, 0x1

    .line 278
    .line 279
    :cond_5
    invoke-virtual {v5, v4, v14, v8}, Landroidx/fragment/app/v0;->q(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 280
    .line 281
    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    const/16 v22, 0x0

    .line 285
    .line 286
    iget-object v3, v0, Landroidx/fragment/app/m;->g:Ljava/lang/Object;

    .line 287
    .line 288
    move-object/from16 v23, v3

    .line 289
    .line 290
    move-object/from16 v20, v3

    .line 291
    .line 292
    move-object/from16 v19, v5

    .line 293
    .line 294
    move-object/from16 v24, v12

    .line 295
    .line 296
    invoke-virtual/range {v19 .. v24}, Landroidx/fragment/app/v0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 297
    .line 298
    .line 299
    :goto_3
    move-object/from16 v7, v18

    .line 300
    .line 301
    move-object/from16 v3, v27

    .line 302
    .line 303
    move-object/from16 v10, v28

    .line 304
    .line 305
    const/4 v12, 0x2

    .line 306
    goto/16 :goto_1

    .line 307
    .line 308
    :cond_6
    move-object/from16 v18, v7

    .line 309
    .line 310
    move-object/from16 v28, v10

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_7
    move-object/from16 v27, v3

    .line 314
    .line 315
    move-object/from16 v18, v7

    .line 316
    .line 317
    move-object/from16 v28, v10

    .line 318
    .line 319
    move-object v3, v12

    .line 320
    new-instance v7, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    move-object/from16 v16, v3

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    const/4 v12, 0x0

    .line 333
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v19

    .line 337
    if-eqz v19, :cond_12

    .line 338
    .line 339
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v19

    .line 343
    move-object/from16 v29, v8

    .line 344
    .line 345
    move-object/from16 v8, v19

    .line 346
    .line 347
    check-cast v8, Landroidx/fragment/app/n;

    .line 348
    .line 349
    move-object/from16 v30, v10

    .line 350
    .line 351
    iget-object v10, v8, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 352
    .line 353
    iget-object v0, v8, Landroidx/fragment/app/n;->b:Ljava/lang/Object;

    .line 354
    .line 355
    invoke-virtual {v5, v0}, Landroidx/fragment/app/v0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    move-object/from16 v31, v4

    .line 360
    .line 361
    if-eqz v0, :cond_11

    .line 362
    .line 363
    new-instance v4, Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    move-object/from16 v32, v3

    .line 369
    .line 370
    iget-object v3, v10, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 371
    .line 372
    iget-object v3, v3, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 373
    .line 374
    move-object/from16 v33, v12

    .line 375
    .line 376
    const-string v12, "operation.fragment.mView"

    .line 377
    .line 378
    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-static {v3, v4}, Landroidx/fragment/app/m;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 382
    .line 383
    .line 384
    if-eqz v31, :cond_a

    .line 385
    .line 386
    if-eq v10, v13, :cond_8

    .line 387
    .line 388
    if-ne v10, v9, :cond_a

    .line 389
    .line 390
    :cond_8
    if-ne v10, v13, :cond_9

    .line 391
    .line 392
    invoke-static/range {v29 .. v29}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, Ljava/util/Collection;

    .line 397
    .line 398
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_9
    invoke-static/range {v16 .. v16}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    check-cast v3, Ljava/util/Collection;

    .line 407
    .line 408
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 409
    .line 410
    .line 411
    :cond_a
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    if-eqz v3, :cond_c

    .line 416
    .line 417
    invoke-virtual {v5, v14, v0}, Landroidx/fragment/app/v0;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    move-object v3, v4

    .line 421
    :cond_b
    move-object/from16 v19, v14

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_c
    invoke-virtual {v5, v0, v4}, Landroidx/fragment/app/v0;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 425
    .line 426
    .line 427
    const/16 v24, 0x0

    .line 428
    .line 429
    const/16 v23, 0x0

    .line 430
    .line 431
    move-object/from16 v21, v0

    .line 432
    .line 433
    move-object/from16 v20, v0

    .line 434
    .line 435
    move-object/from16 v22, v4

    .line 436
    .line 437
    move-object/from16 v19, v5

    .line 438
    .line 439
    invoke-virtual/range {v19 .. v24}, Landroidx/fragment/app/v0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v3, v22

    .line 443
    .line 444
    iget v4, v10, Landroidx/fragment/app/A0;->a:I

    .line 445
    .line 446
    const/4 v12, 0x3

    .line 447
    if-ne v4, v12, :cond_b

    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    iput-boolean v4, v10, Landroidx/fragment/app/A0;->i:Z

    .line 451
    .line 452
    new-instance v4, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 455
    .line 456
    .line 457
    iget-object v12, v10, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 458
    .line 459
    move-object/from16 v19, v14

    .line 460
    .line 461
    iget-object v14, v12, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 462
    .line 463
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    iget-object v12, v12, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 467
    .line 468
    invoke-virtual {v5, v0, v12, v4}, Landroidx/fragment/app/v0;->l(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 469
    .line 470
    .line 471
    new-instance v4, Landroidx/fragment/app/u;

    .line 472
    .line 473
    const/4 v12, 0x1

    .line 474
    invoke-direct {v4, v3, v12}, Landroidx/fragment/app/u;-><init>(Ljava/lang/Object;I)V

    .line 475
    .line 476
    .line 477
    invoke-static {v1, v4}, Lk1/t;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 478
    .line 479
    .line 480
    :goto_6
    iget v4, v10, Landroidx/fragment/app/A0;->a:I

    .line 481
    .line 482
    const-string v10, "transitioningViews"

    .line 483
    .line 484
    const/4 v12, 0x2

    .line 485
    if-ne v4, v12, :cond_e

    .line 486
    .line 487
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 488
    .line 489
    .line 490
    if-eqz v17, :cond_d

    .line 491
    .line 492
    invoke-virtual {v5, v0, v15}, Landroidx/fragment/app/v0;->o(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 493
    .line 494
    .line 495
    :cond_d
    invoke-static {v12}, Landroidx/fragment/app/e0;->J(I)Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_f

    .line 500
    .line 501
    new-instance v4, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    const-string v12, "Entering Transition: "

    .line 504
    .line 505
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    const-string v4, ">>>>> EnteringViews <<<<<"

    .line 519
    .line 520
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-eqz v4, :cond_f

    .line 532
    .line 533
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    check-cast v4, Landroid/view/View;

    .line 541
    .line 542
    new-instance v12, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :cond_e
    invoke-virtual {v5, v6, v0}, Landroidx/fragment/app/v0;->n(Landroid/view/View;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    const/16 v25, 0x2

    .line 562
    .line 563
    invoke-static/range {v25 .. v25}, Landroidx/fragment/app/e0;->J(I)Z

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    if-eqz v4, :cond_f

    .line 568
    .line 569
    new-instance v4, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v12, "Exiting Transition: "

    .line 572
    .line 573
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 584
    .line 585
    .line 586
    const-string v4, ">>>>> ExitingViews <<<<<"

    .line 587
    .line 588
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_f

    .line 600
    .line 601
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    check-cast v4, Landroid/view/View;

    .line 609
    .line 610
    new-instance v12, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 623
    .line 624
    .line 625
    goto :goto_8

    .line 626
    :cond_f
    iget-boolean v3, v8, Landroidx/fragment/app/n;->c:Z

    .line 627
    .line 628
    if-eqz v3, :cond_10

    .line 629
    .line 630
    move-object/from16 v3, v33

    .line 631
    .line 632
    invoke-virtual {v5, v3, v0}, Landroidx/fragment/app/v0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v12

    .line 636
    move-object/from16 v0, p0

    .line 637
    .line 638
    move-object/from16 v14, v19

    .line 639
    .line 640
    move-object/from16 v8, v29

    .line 641
    .line 642
    move-object/from16 v10, v30

    .line 643
    .line 644
    move-object/from16 v4, v31

    .line 645
    .line 646
    move-object/from16 v3, v32

    .line 647
    .line 648
    goto/16 :goto_4

    .line 649
    .line 650
    :cond_10
    move-object/from16 v4, v32

    .line 651
    .line 652
    move-object/from16 v3, v33

    .line 653
    .line 654
    invoke-virtual {v5, v4, v0}, Landroidx/fragment/app/v0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    move-object v12, v3

    .line 659
    move-object/from16 v14, v19

    .line 660
    .line 661
    move-object/from16 v8, v29

    .line 662
    .line 663
    move-object/from16 v10, v30

    .line 664
    .line 665
    move-object/from16 v4, v31

    .line 666
    .line 667
    move-object v3, v0

    .line 668
    move-object/from16 v0, p0

    .line 669
    .line 670
    goto/16 :goto_4

    .line 671
    .line 672
    :cond_11
    move-object v4, v3

    .line 673
    move-object v3, v12

    .line 674
    move-object/from16 v0, p0

    .line 675
    .line 676
    move-object v3, v4

    .line 677
    move-object/from16 v8, v29

    .line 678
    .line 679
    move-object/from16 v10, v30

    .line 680
    .line 681
    move-object/from16 v4, v31

    .line 682
    .line 683
    goto/16 :goto_4

    .line 684
    .line 685
    :cond_12
    move-object v0, v4

    .line 686
    move-object v4, v3

    .line 687
    move-object v3, v12

    .line 688
    invoke-virtual {v5, v3, v4, v0}, Landroidx/fragment/app/v0;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    const/16 v25, 0x2

    .line 693
    .line 694
    invoke-static/range {v25 .. v25}, Landroidx/fragment/app/e0;->J(I)Z

    .line 695
    .line 696
    .line 697
    move-result v4

    .line 698
    if-eqz v4, :cond_13

    .line 699
    .line 700
    new-instance v4, Ljava/lang/StringBuilder;

    .line 701
    .line 702
    const-string v5, "Final merged transition: "

    .line 703
    .line 704
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 715
    .line 716
    .line 717
    :cond_13
    new-instance v4, Lef/k;

    .line 718
    .line 719
    invoke-direct {v4, v7, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    iget-object v3, v4, Lef/k;->a:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v3, Ljava/util/ArrayList;

    .line 725
    .line 726
    new-instance v5, Ljava/util/ArrayList;

    .line 727
    .line 728
    const/16 v6, 0xa

    .line 729
    .line 730
    move-object/from16 v7, v28

    .line 731
    .line 732
    invoke-static {v7, v6}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 737
    .line 738
    .line 739
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 744
    .line 745
    .line 746
    move-result v7

    .line 747
    if-eqz v7, :cond_14

    .line 748
    .line 749
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    check-cast v7, Landroidx/fragment/app/n;

    .line 754
    .line 755
    iget-object v7, v7, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 756
    .line 757
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    goto :goto_9

    .line 761
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 766
    .line 767
    .line 768
    move-result v6

    .line 769
    iget-object v7, v4, Lef/k;->b:Ljava/lang/Object;

    .line 770
    .line 771
    if-eqz v6, :cond_15

    .line 772
    .line 773
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    check-cast v6, Landroidx/fragment/app/A0;

    .line 778
    .line 779
    iget-object v8, v6, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 780
    .line 781
    new-instance v8, Landroidx/fragment/app/l;

    .line 782
    .line 783
    move-object/from16 v10, p0

    .line 784
    .line 785
    invoke-direct {v8, v6, v10}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/A0;Landroidx/fragment/app/m;)V

    .line 786
    .line 787
    .line 788
    iget-object v6, v10, Landroidx/fragment/app/m;->p:LR4/a;

    .line 789
    .line 790
    move-object/from16 v12, v18

    .line 791
    .line 792
    invoke-virtual {v12, v7, v6, v8}, Landroidx/fragment/app/v0;->p(Ljava/lang/Object;LR4/a;Landroidx/fragment/app/l;)V

    .line 793
    .line 794
    .line 795
    goto :goto_a

    .line 796
    :cond_15
    move-object/from16 v10, p0

    .line 797
    .line 798
    move-object/from16 v12, v18

    .line 799
    .line 800
    new-instance v4, LA0/d;

    .line 801
    .line 802
    const/4 v5, 0x1

    .line 803
    invoke-direct {v4, v10, v1, v7, v5}, LA0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 804
    .line 805
    .line 806
    const/4 v5, 0x4

    .line 807
    invoke-static {v3, v5}, Landroidx/fragment/app/o0;->a(Ljava/util/ArrayList;I)V

    .line 808
    .line 809
    .line 810
    new-instance v5, Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 813
    .line 814
    .line 815
    iget-object v6, v10, Landroidx/fragment/app/m;->i:Ljava/util/ArrayList;

    .line 816
    .line 817
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 818
    .line 819
    .line 820
    move-result v7

    .line 821
    const/4 v8, 0x0

    .line 822
    :goto_b
    if-ge v8, v7, :cond_16

    .line 823
    .line 824
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v14

    .line 828
    check-cast v14, Landroid/view/View;

    .line 829
    .line 830
    sget-object v15, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 831
    .line 832
    invoke-static {v14}, Lk1/J;->f(Landroid/view/View;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v15

    .line 836
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    const/4 v15, 0x0

    .line 840
    invoke-static {v14, v15}, Lk1/J;->m(Landroid/view/View;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    const/16 v26, 0x1

    .line 844
    .line 845
    add-int/lit8 v8, v8, 0x1

    .line 846
    .line 847
    goto :goto_b

    .line 848
    :cond_16
    const/16 v25, 0x2

    .line 849
    .line 850
    invoke-static/range {v25 .. v25}, Landroidx/fragment/app/e0;->J(I)Z

    .line 851
    .line 852
    .line 853
    move-result v7

    .line 854
    iget-object v8, v10, Landroidx/fragment/app/m;->h:Ljava/util/ArrayList;

    .line 855
    .line 856
    if-eqz v7, :cond_18

    .line 857
    .line 858
    const-string v7, ">>>>> Beginning transition <<<<<"

    .line 859
    .line 860
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 861
    .line 862
    .line 863
    const-string v7, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 864
    .line 865
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 866
    .line 867
    .line 868
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 869
    .line 870
    .line 871
    move-result-object v7

    .line 872
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v14

    .line 876
    const-string v15, " Name: "

    .line 877
    .line 878
    if-eqz v14, :cond_17

    .line 879
    .line 880
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v14

    .line 884
    move-object/from16 v16, v4

    .line 885
    .line 886
    const-string v4, "sharedElementFirstOutViews"

    .line 887
    .line 888
    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    check-cast v14, Landroid/view/View;

    .line 892
    .line 893
    new-instance v4, Ljava/lang/StringBuilder;

    .line 894
    .line 895
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    sget-object v15, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 905
    .line 906
    invoke-static {v14}, Lk1/J;->f(Landroid/view/View;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v14

    .line 910
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 918
    .line 919
    .line 920
    move-object/from16 v4, v16

    .line 921
    .line 922
    goto :goto_c

    .line 923
    :cond_17
    move-object/from16 v16, v4

    .line 924
    .line 925
    const-string v4, ">>>>> SharedElementLastInViews <<<<<"

    .line 926
    .line 927
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 928
    .line 929
    .line 930
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 931
    .line 932
    .line 933
    move-result-object v4

    .line 934
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v7

    .line 938
    if-eqz v7, :cond_19

    .line 939
    .line 940
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    const-string v14, "sharedElementLastInViews"

    .line 945
    .line 946
    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    check-cast v7, Landroid/view/View;

    .line 950
    .line 951
    new-instance v14, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    sget-object v17, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 963
    .line 964
    invoke-static {v7}, Lk1/J;->f(Landroid/view/View;)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v7

    .line 968
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v7

    .line 975
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 976
    .line 977
    .line 978
    goto :goto_d

    .line 979
    :cond_18
    move-object/from16 v16, v4

    .line 980
    .line 981
    :cond_19
    invoke-interface/range {v16 .. v16}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 985
    .line 986
    .line 987
    move-result v2

    .line 988
    new-instance v4, Ljava/util/ArrayList;

    .line 989
    .line 990
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 991
    .line 992
    .line 993
    const/4 v7, 0x0

    .line 994
    :goto_e
    if-ge v7, v2, :cond_1d

    .line 995
    .line 996
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v14

    .line 1000
    check-cast v14, Landroid/view/View;

    .line 1001
    .line 1002
    sget-object v15, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 1003
    .line 1004
    invoke-static {v14}, Lk1/J;->f(Landroid/view/View;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v15

    .line 1008
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    if-nez v15, :cond_1b

    .line 1012
    .line 1013
    move/from16 v18, v2

    .line 1014
    .line 1015
    move-object/from16 v22, v4

    .line 1016
    .line 1017
    move/from16 v16, v7

    .line 1018
    .line 1019
    move-object/from16 v14, v27

    .line 1020
    .line 1021
    :cond_1a
    :goto_f
    const/16 v26, 0x1

    .line 1022
    .line 1023
    goto :goto_11

    .line 1024
    :cond_1b
    move-object/from16 v22, v4

    .line 1025
    .line 1026
    const/4 v4, 0x0

    .line 1027
    invoke-static {v14, v4}, Lk1/J;->m(Landroid/view/View;Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    move-object/from16 v14, v27

    .line 1031
    .line 1032
    invoke-virtual {v14, v15}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v16

    .line 1036
    move-object/from16 v4, v16

    .line 1037
    .line 1038
    check-cast v4, Ljava/lang/String;

    .line 1039
    .line 1040
    move/from16 v16, v7

    .line 1041
    .line 1042
    const/4 v7, 0x0

    .line 1043
    :goto_10
    move/from16 v18, v2

    .line 1044
    .line 1045
    if-ge v7, v2, :cond_1a

    .line 1046
    .line 1047
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    if-eqz v2, :cond_1c

    .line 1056
    .line 1057
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v2

    .line 1061
    check-cast v2, Landroid/view/View;

    .line 1062
    .line 1063
    invoke-static {v2, v15}, Lk1/J;->m(Landroid/view/View;Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_f

    .line 1067
    :cond_1c
    const/16 v26, 0x1

    .line 1068
    .line 1069
    add-int/lit8 v7, v7, 0x1

    .line 1070
    .line 1071
    move/from16 v2, v18

    .line 1072
    .line 1073
    goto :goto_10

    .line 1074
    :goto_11
    add-int/lit8 v7, v16, 0x1

    .line 1075
    .line 1076
    move-object/from16 v27, v14

    .line 1077
    .line 1078
    move/from16 v2, v18

    .line 1079
    .line 1080
    move-object/from16 v4, v22

    .line 1081
    .line 1082
    goto :goto_e

    .line 1083
    :cond_1d
    move/from16 v18, v2

    .line 1084
    .line 1085
    move-object/from16 v22, v4

    .line 1086
    .line 1087
    new-instance v17, Landroidx/fragment/app/u0;

    .line 1088
    .line 1089
    move-object/from16 v20, v5

    .line 1090
    .line 1091
    move-object/from16 v19, v6

    .line 1092
    .line 1093
    move-object/from16 v21, v8

    .line 1094
    .line 1095
    invoke-direct/range {v17 .. v22}, Landroidx/fragment/app/u0;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1096
    .line 1097
    .line 1098
    move-object/from16 v5, v17

    .line 1099
    .line 1100
    move-object/from16 v2, v19

    .line 1101
    .line 1102
    move-object/from16 v4, v21

    .line 1103
    .line 1104
    invoke-static {v1, v5}, Lk1/t;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1105
    .line 1106
    .line 1107
    const/4 v1, 0x0

    .line 1108
    invoke-static {v3, v1}, Landroidx/fragment/app/o0;->a(Ljava/util/ArrayList;I)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v12, v0, v4, v2}, Landroidx/fragment/app/v0;->r(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1112
    .line 1113
    .line 1114
    const/16 v25, 0x2

    .line 1115
    .line 1116
    invoke-static/range {v25 .. v25}, Landroidx/fragment/app/e0;->J(I)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    if-eqz v0, :cond_1e

    .line 1121
    .line 1122
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1123
    .line 1124
    const-string v1, "Completed executing operations from "

    .line 1125
    .line 1126
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    const-string v1, " to "

    .line 1133
    .line 1134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1145
    .line 1146
    .line 1147
    :cond_1e
    :goto_12
    return-void
.end method

.method public final d(Landroidx/activity/b;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "container"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Landroidx/fragment/app/m;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string v2, "FragmentManager"

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/fragment/app/n;

    .line 31
    .line 32
    iget-object v1, v1, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-static {v3}, Landroidx/fragment/app/e0;->J(I)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v4, "SpecialEffectsController: Container "

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, " has not been laid out. Skipping onStart for operation "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    iget-object p1, p0, Landroidx/fragment/app/m;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroidx/fragment/app/n;

    .line 92
    .line 93
    iget-object v0, v0, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 94
    .line 95
    iget-object v0, v0, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 96
    .line 97
    iget-boolean v0, v0, Landroidx/fragment/app/F;->mTransitioning:Z

    .line 98
    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    :goto_1
    const/4 p1, 0x1

    .line 104
    :goto_2
    if-eqz p1, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, Landroidx/fragment/app/m;->g:Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/m;->a()Z

    .line 111
    .line 112
    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v1, "Ignoring shared elements transition "

    .line 116
    .line 117
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p1, " between "

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Landroidx/fragment/app/m;->d:Landroidx/fragment/app/A0;

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p1, " and "

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Landroidx/fragment/app/m;->e:Landroidx/fragment/app/A0;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string p1, " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/m;->a()Z

    .line 156
    .line 157
    .line 158
    return-void
.end method
