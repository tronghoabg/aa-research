.class public final LVa/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/gb;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, LVa/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LVa/Kb;->C()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x2

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    check-cast p1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v0, v0, Landroid/app/Activity;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Activity;

    .line 37
    .line 38
    const v3, 0x1020002

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/view/ViewGroup;

    .line 46
    .line 47
    sget v3, LVa/cb;->f:I

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x3d

    .line 50
    .line 51
    rem-int/lit16 v4, v3, 0x80

    .line 52
    .line 53
    sput v4, LVa/cb;->g:I

    .line 54
    .line 55
    rem-int/2addr v3, v2

    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-static {p1, v0}, LVa/cb;->s(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {p1, v0}, LVa/cb;->s(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_1
    :goto_0
    iget-object v0, p0, LVa/f;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LVa/cb;

    .line 70
    .line 71
    sget v1, LVa/cb;->f:I

    .line 72
    .line 73
    add-int/lit8 v1, v1, 0x4b

    .line 74
    .line 75
    rem-int/lit16 v3, v1, 0x80

    .line 76
    .line 77
    sput v3, LVa/cb;->g:I

    .line 78
    .line 79
    rem-int/2addr v1, v2

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    new-instance v1, LVa/ab;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-direct {v1, v2}, LVa/ab;-><init>(I)V

    .line 89
    .line 90
    .line 91
    iput-object v0, v1, LVa/ab;->c:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p1, v1, LVa/ab;->b:Ljava/lang/Object;

    .line 94
    .line 95
    sget v2, LVa/cb;->g:I

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x13

    .line 98
    .line 99
    rem-int/lit16 v2, v2, 0x80

    .line 100
    .line 101
    sput v2, LVa/cb;->f:I

    .line 102
    .line 103
    const/4 v2, 0x7

    .line 104
    div-int/lit8 v2, v2, 0x0

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    new-instance v1, LVa/ab;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-direct {v1, v2}, LVa/ab;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, v1, LVa/ab;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, v1, LVa/ab;->b:Ljava/lang/Object;

    .line 116
    .line 117
    sget v2, LVa/cb;->g:I

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x13

    .line 120
    .line 121
    rem-int/lit16 v2, v2, 0x80

    .line 122
    .line 123
    sput v2, LVa/cb;->f:I

    .line 124
    .line 125
    :goto_1
    invoke-static {v0, p1, v1}, LVa/cb;->m(LVa/cb;Landroid/view/ViewGroup;LVa/ab;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_4

    .line 129
    .line 130
    :cond_3
    iget-object p1, p0, LVa/f;->b:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v0, p1

    .line 133
    check-cast v0, LVa/cb;

    .line 134
    .line 135
    monitor-enter v0

    .line 136
    :try_start_0
    sget p1, LVa/cb;->g:I

    .line 137
    .line 138
    add-int/lit8 p1, p1, 0x55

    .line 139
    .line 140
    rem-int/lit16 v3, p1, 0x80

    .line 141
    .line 142
    sput v3, LVa/cb;->f:I

    .line 143
    .line 144
    rem-int/2addr p1, v2

    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    iget-object p1, v0, LVa/cb;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, LVa/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 150
    .line 151
    :try_start_1
    div-int/lit8 v2, v2, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catchall_0
    move-exception p1

    .line 157
    :try_start_2
    throw p1

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    goto :goto_5

    .line 160
    :cond_4
    iget-object p1, v0, LVa/cb;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, LVa/f;

    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    :goto_2
    iget-object p1, v0, LVa/cb;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Ljava/util/WeakHashMap;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget v2, LVa/cb;->g:I

    .line 179
    .line 180
    add-int/lit8 v2, v2, 0x4f

    .line 181
    .line 182
    rem-int/lit16 v2, v2, 0x80

    .line 183
    .line 184
    sput v2, LVa/cb;->f:I

    .line 185
    .line 186
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_6

    .line 191
    .line 192
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, Landroid/view/ViewGroup;

    .line 197
    .line 198
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 203
    .line 204
    if-eqz v4, :cond_5

    .line 205
    .line 206
    sget v4, LVa/cb;->f:I

    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x4d

    .line 209
    .line 210
    rem-int/lit16 v4, v4, 0x80

    .line 211
    .line 212
    sput v4, LVa/cb;->g:I

    .line 213
    .line 214
    check-cast v3, Landroid/view/ViewGroup;

    .line 215
    .line 216
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    iget-object p1, v0, LVa/cb;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p1, Ljava/util/WeakHashMap;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->clear()V

    .line 225
    .line 226
    .line 227
    invoke-static {}, LVa/Za;->n()LVa/Za;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iget-object v2, v0, LVa/cb;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, LVa/f;

    .line 234
    .line 235
    invoke-virtual {p1, v2}, LVa/Za;->m(LVa/gb;)V

    .line 236
    .line 237
    .line 238
    iput-object v1, v0, LVa/cb;->a:Ljava/lang/Object;

    .line 239
    .line 240
    sget p1, LVa/cb;->f:I

    .line 241
    .line 242
    add-int/lit8 p1, p1, 0x6d

    .line 243
    .line 244
    rem-int/lit16 p1, p1, 0x80

    .line 245
    .line 246
    sput p1, LVa/cb;->g:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 247
    .line 248
    :cond_7
    monitor-exit v0

    .line 249
    :cond_8
    :goto_4
    return-void

    .line 250
    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 251
    throw p1

    .line 252
    :pswitch_0
    iget-object v0, p0, LVa/f;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, LVa/i;

    .line 255
    .line 256
    invoke-static {v0}, LVa/i;->C(LVa/i;)LVa/g;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 261
    .line 262
    .line 263
    sget v1, LVa/i;->r:I

    .line 264
    .line 265
    add-int/lit8 v1, v1, 0x3b

    .line 266
    .line 267
    rem-int/lit16 v2, v1, 0x80

    .line 268
    .line 269
    sput v2, LVa/i;->q:I

    .line 270
    .line 271
    rem-int/lit8 v1, v1, 0x2

    .line 272
    .line 273
    if-nez v1, :cond_9

    .line 274
    .line 275
    iget-object v1, v0, LVa/i;->l:Ljava/util/WeakHashMap;

    .line 276
    .line 277
    invoke-static {v0}, LVa/i;->C(LVa/i;)LVa/g;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_9
    const/4 p1, 0x0

    .line 286
    throw p1

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, LVa/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, LVa/f;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LVa/i;

    .line 10
    .line 11
    invoke-static {v0}, LVa/i;->C(LVa/i;)LVa/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 16
    .line 17
    .line 18
    sget v1, LVa/i;->r:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x3b

    .line 21
    .line 22
    rem-int/lit16 v2, v1, 0x80

    .line 23
    .line 24
    sput v2, LVa/i;->q:I

    .line 25
    .line 26
    rem-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, LVa/i;->l:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    throw p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
