.class public final Lh4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lh4/b;

.field public c:Ljava/lang/Object;

.field public d:Ly3/j;

.field public final e:Lff/v;

.field public final f:Lokhttp3/Headers$Builder;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Z

.field public i:Ljava/lang/Boolean;

.field public final j:Z

.field public final k:Lh4/m;

.field public l:Li4/g;

.field public m:Landroidx/lifecycle/o;

.field public n:Li4/g;

.field public o:I

.field public p:I

.field public q:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh4/g;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Lk4/d;->a:Lh4/b;

    .line 4
    iput-object p1, p0, Lh4/g;->b:Lh4/b;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lh4/g;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lh4/g;->d:Ly3/j;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lh4/g;->o:I

    .line 8
    sget-object v1, Lff/v;->a:Lff/v;

    iput-object v1, p0, Lh4/g;->e:Lff/v;

    .line 9
    iput-object p1, p0, Lh4/g;->f:Lokhttp3/Headers$Builder;

    .line 10
    iput-object p1, p0, Lh4/g;->g:Ljava/util/LinkedHashMap;

    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, Lh4/g;->h:Z

    .line 12
    iput-object p1, p0, Lh4/g;->i:Ljava/lang/Boolean;

    .line 13
    iput-boolean v1, p0, Lh4/g;->j:Z

    .line 14
    iput-object p1, p0, Lh4/g;->k:Lh4/m;

    .line 15
    iput-object p1, p0, Lh4/g;->l:Li4/g;

    .line 16
    iput v0, p0, Lh4/g;->p:I

    .line 17
    iput-object p1, p0, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 18
    iput-object p1, p0, Lh4/g;->n:Li4/g;

    .line 19
    iput v0, p0, Lh4/g;->q:I

    return-void
.end method

.method public constructor <init>(Lh4/h;Landroid/content/Context;)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, Lh4/g;->a:Landroid/content/Context;

    .line 22
    iget-object v0, p1, Lh4/h;->u:Lh4/b;

    .line 23
    iput-object v0, p0, Lh4/g;->b:Lh4/b;

    .line 24
    iget-object v0, p1, Lh4/h;->b:Ljava/lang/Object;

    iput-object v0, p0, Lh4/g;->c:Ljava/lang/Object;

    .line 25
    iget-object v0, p1, Lh4/h;->c:Ly3/j;

    iput-object v0, p0, Lh4/g;->d:Ly3/j;

    .line 26
    iget-object v0, p1, Lh4/h;->t:Lh4/c;

    .line 27
    iget v1, v0, Lh4/c;->c:I

    iput v1, p0, Lh4/g;->o:I

    .line 28
    iget-object v1, p1, Lh4/h;->e:Lff/v;

    iput-object v1, p0, Lh4/g;->e:Lff/v;

    .line 29
    iget-object v1, p1, Lh4/h;->g:Lokhttp3/Headers;

    invoke-virtual {v1}, Lokhttp3/Headers;->d()Lokhttp3/Headers$Builder;

    move-result-object v1

    iput-object v1, p0, Lh4/g;->f:Lokhttp3/Headers$Builder;

    .line 30
    iget-object v1, p1, Lh4/h;->h:Lh4/p;

    .line 31
    iget-object v1, v1, Lh4/p;->a:Ljava/util/Map;

    invoke-static {v1}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iput-object v1, p0, Lh4/g;->g:Ljava/util/LinkedHashMap;

    .line 32
    iget-boolean v1, p1, Lh4/h;->i:Z

    iput-boolean v1, p0, Lh4/g;->h:Z

    .line 33
    iget-object v1, v0, Lh4/c;->d:Ljava/lang/Boolean;

    iput-object v1, p0, Lh4/g;->i:Ljava/lang/Boolean;

    .line 34
    iget-boolean v1, p1, Lh4/h;->l:Z

    iput-boolean v1, p0, Lh4/g;->j:Z

    .line 35
    iget-object v1, p1, Lh4/h;->s:Lh4/n;

    .line 36
    new-instance v2, Lh4/m;

    invoke-direct {v2, v1}, Lh4/m;-><init>(Lh4/n;)V

    .line 37
    iput-object v2, p0, Lh4/g;->k:Lh4/m;

    .line 38
    iget-object v1, v0, Lh4/c;->a:Li4/g;

    iput-object v1, p0, Lh4/g;->l:Li4/g;

    .line 39
    iget v0, v0, Lh4/c;->b:I

    iput v0, p0, Lh4/g;->p:I

    .line 40
    iget-object v0, p1, Lh4/h;->a:Landroid/content/Context;

    if-ne v0, p2, :cond_0

    .line 41
    iget-object p2, p1, Lh4/h;->q:Landroidx/lifecycle/o;

    iput-object p2, p0, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 42
    iget-object p2, p1, Lh4/h;->r:Li4/g;

    iput-object p2, p0, Lh4/g;->n:Li4/g;

    .line 43
    iget p1, p1, Lh4/h;->z:I

    iput p1, p0, Lh4/g;->q:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 45
    iput-object p1, p0, Lh4/g;->n:Li4/g;

    const/4 p1, 0x0

    .line 46
    iput p1, p0, Lh4/g;->q:I

    return-void
.end method


# virtual methods
.method public final a()Lh4/h;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lh4/g;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lh4/j;->a:Lh4/j;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, Lh4/g;->d:Ly3/j;

    .line 11
    .line 12
    iget-object v1, v0, Lh4/g;->b:Lh4/b;

    .line 13
    .line 14
    iget-object v6, v1, Lh4/b;->g:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    iget v2, v0, Lh4/g;->o:I

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    iget v2, v1, Lh4/b;->f:I

    .line 21
    .line 22
    :cond_1
    move v7, v2

    .line 23
    iget-object v9, v1, Lh4/b;->e:Lj4/a;

    .line 24
    .line 25
    iget-object v1, v0, Lh4/g;->f:Lokhttp3/Headers$Builder;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-nez v1, :cond_3

    .line 36
    .line 37
    sget-object v1, Lk4/e;->b:Lokhttp3/Headers;

    .line 38
    .line 39
    :goto_1
    move-object v10, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    sget-object v3, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :goto_2
    iget-object v1, v0, Lh4/g;->g:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    new-instance v3, Lh4/p;

    .line 49
    .line 50
    invoke-static {v1}, Lr7/e;->S(Ljava/util/Map;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v3, v1}, Lh4/p;-><init>(Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    const/4 v3, 0x0

    .line 59
    :goto_3
    if-nez v3, :cond_5

    .line 60
    .line 61
    sget-object v3, Lh4/p;->b:Lh4/p;

    .line 62
    .line 63
    :cond_5
    move-object v11, v3

    .line 64
    iget-object v1, v0, Lh4/g;->i:Ljava/lang/Boolean;

    .line 65
    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    :goto_4
    move v13, v1

    .line 73
    goto :goto_5

    .line 74
    :cond_6
    iget-object v1, v0, Lh4/g;->b:Lh4/b;

    .line 75
    .line 76
    iget-boolean v1, v1, Lh4/b;->h:Z

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_5
    iget-object v1, v0, Lh4/g;->b:Lh4/b;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v1, v0, Lh4/g;->b:Lh4/b;

    .line 85
    .line 86
    iget v3, v1, Lh4/b;->i:I

    .line 87
    .line 88
    iget v8, v1, Lh4/b;->j:I

    .line 89
    .line 90
    iget v12, v1, Lh4/b;->k:I

    .line 91
    .line 92
    iget-object v14, v1, Lh4/b;->a:LEf/A;

    .line 93
    .line 94
    iget-object v15, v1, Lh4/b;->b:LEf/A;

    .line 95
    .line 96
    iget-object v2, v1, Lh4/b;->c:LEf/A;

    .line 97
    .line 98
    iget-object v1, v1, Lh4/b;->d:LEf/A;

    .line 99
    .line 100
    move-object/from16 v22, v1

    .line 101
    .line 102
    iget-object v1, v0, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 103
    .line 104
    move-object/from16 v17, v1

    .line 105
    .line 106
    iget-object v1, v0, Lh4/g;->a:Landroid/content/Context;

    .line 107
    .line 108
    move-object/from16 v21, v2

    .line 109
    .line 110
    move/from16 v18, v3

    .line 111
    .line 112
    if-nez v17, :cond_a

    .line 113
    .line 114
    move-object v2, v1

    .line 115
    :goto_6
    instance-of v3, v2, Landroidx/lifecycle/v;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    check-cast v2, Landroidx/lifecycle/v;

    .line 120
    .line 121
    invoke-interface {v2}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    goto :goto_7

    .line 126
    :cond_7
    instance-of v3, v2, Landroid/content/ContextWrapper;

    .line 127
    .line 128
    if-nez v3, :cond_9

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    :goto_7
    if-nez v2, :cond_8

    .line 132
    .line 133
    sget-object v2, Lh4/f;->b:Lh4/f;

    .line 134
    .line 135
    :cond_8
    move-object/from16 v23, v2

    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_9
    check-cast v2, Landroid/content/ContextWrapper;

    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    goto :goto_6

    .line 145
    :cond_a
    move-object/from16 v23, v17

    .line 146
    .line 147
    :goto_8
    iget-object v2, v0, Lh4/g;->l:Li4/g;

    .line 148
    .line 149
    if-nez v2, :cond_c

    .line 150
    .line 151
    iget-object v3, v0, Lh4/g;->n:Li4/g;

    .line 152
    .line 153
    if-nez v3, :cond_b

    .line 154
    .line 155
    new-instance v3, Li4/c;

    .line 156
    .line 157
    invoke-direct {v3, v1}, Li4/c;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    :cond_b
    move-object/from16 v24, v3

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_c
    move-object/from16 v24, v2

    .line 164
    .line 165
    :goto_9
    iget v1, v0, Lh4/g;->p:I

    .line 166
    .line 167
    if-nez v1, :cond_e

    .line 168
    .line 169
    iget v1, v0, Lh4/g;->q:I

    .line 170
    .line 171
    if-nez v1, :cond_e

    .line 172
    .line 173
    instance-of v1, v2, Li4/e;

    .line 174
    .line 175
    if-eqz v1, :cond_d

    .line 176
    .line 177
    check-cast v2, Li4/e;

    .line 178
    .line 179
    :cond_d
    const/4 v1, 0x2

    .line 180
    :cond_e
    move/from16 v25, v1

    .line 181
    .line 182
    iget-object v1, v0, Lh4/g;->k:Lh4/m;

    .line 183
    .line 184
    if-eqz v1, :cond_f

    .line 185
    .line 186
    new-instance v2, Lh4/n;

    .line 187
    .line 188
    iget-object v1, v1, Lh4/m;->a:Ljava/util/LinkedHashMap;

    .line 189
    .line 190
    invoke-static {v1}, Lr7/e;->S(Ljava/util/Map;)Ljava/util/Map;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-direct {v2, v1}, Lh4/n;-><init>(Ljava/util/Map;)V

    .line 195
    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_f
    const/4 v2, 0x0

    .line 199
    :goto_a
    if-nez v2, :cond_10

    .line 200
    .line 201
    sget-object v2, Lh4/n;->b:Lh4/n;

    .line 202
    .line 203
    :cond_10
    move-object/from16 v26, v2

    .line 204
    .line 205
    new-instance v1, Lh4/c;

    .line 206
    .line 207
    iget-object v2, v0, Lh4/g;->l:Li4/g;

    .line 208
    .line 209
    iget v3, v0, Lh4/g;->p:I

    .line 210
    .line 211
    move-object/from16 v16, v4

    .line 212
    .line 213
    iget v4, v0, Lh4/g;->o:I

    .line 214
    .line 215
    move-object/from16 v17, v5

    .line 216
    .line 217
    iget-object v5, v0, Lh4/g;->i:Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-direct {v1, v2, v3, v4, v5}, Lh4/c;-><init>(Li4/g;IILjava/lang/Boolean;)V

    .line 220
    .line 221
    .line 222
    iget-object v2, v0, Lh4/g;->b:Lh4/b;

    .line 223
    .line 224
    move-object/from16 v28, v2

    .line 225
    .line 226
    new-instance v2, Lh4/h;

    .line 227
    .line 228
    move-object/from16 v5, v17

    .line 229
    .line 230
    move/from16 v17, v8

    .line 231
    .line 232
    iget-object v8, v0, Lh4/g;->e:Lff/v;

    .line 233
    .line 234
    move-object/from16 v4, v16

    .line 235
    .line 236
    move/from16 v16, v18

    .line 237
    .line 238
    move/from16 v18, v12

    .line 239
    .line 240
    iget-boolean v12, v0, Lh4/g;->h:Z

    .line 241
    .line 242
    move-object/from16 v20, v15

    .line 243
    .line 244
    iget-boolean v15, v0, Lh4/g;->j:Z

    .line 245
    .line 246
    iget-object v3, v0, Lh4/g;->a:Landroid/content/Context;

    .line 247
    .line 248
    move-object/from16 v19, v14

    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    move-object/from16 v27, v1

    .line 252
    .line 253
    invoke-direct/range {v2 .. v28}, Lh4/h;-><init>(Landroid/content/Context;Ljava/lang/Object;Ly3/j;Landroid/graphics/Bitmap$Config;ILff/v;Lj4/a;Lokhttp3/Headers;Lh4/p;ZZZZIIILEf/A;LEf/A;LEf/A;LEf/A;Landroidx/lifecycle/o;Li4/g;ILh4/n;Lh4/c;Lh4/b;)V

    .line 254
    .line 255
    .line 256
    return-object v2
.end method
