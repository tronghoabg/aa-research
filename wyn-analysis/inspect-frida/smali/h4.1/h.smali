.class public final Lh4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Object;

.field public final c:Ly3/j;

.field public final d:Landroid/graphics/Bitmap$Config;

.field public final e:Lff/v;

.field public final f:Lj4/a;

.field public final g:Lokhttp3/Headers;

.field public final h:Lh4/p;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:LEf/A;

.field public final n:LEf/A;

.field public final o:LEf/A;

.field public final p:LEf/A;

.field public final q:Landroidx/lifecycle/o;

.field public final r:Li4/g;

.field public final s:Lh4/n;

.field public final t:Lh4/c;

.field public final u:Lh4/b;

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ly3/j;Landroid/graphics/Bitmap$Config;ILff/v;Lj4/a;Lokhttp3/Headers;Lh4/p;ZZZZIIILEf/A;LEf/A;LEf/A;LEf/A;Landroidx/lifecycle/o;Li4/g;ILh4/n;Lh4/c;Lh4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh4/h;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lh4/h;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lh4/h;->c:Ly3/j;

    .line 5
    iput-object p4, p0, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 6
    iput p5, p0, Lh4/h;->v:I

    .line 7
    iput-object p6, p0, Lh4/h;->e:Lff/v;

    .line 8
    iput-object p7, p0, Lh4/h;->f:Lj4/a;

    .line 9
    iput-object p8, p0, Lh4/h;->g:Lokhttp3/Headers;

    .line 10
    iput-object p9, p0, Lh4/h;->h:Lh4/p;

    .line 11
    iput-boolean p10, p0, Lh4/h;->i:Z

    .line 12
    iput-boolean p11, p0, Lh4/h;->j:Z

    .line 13
    iput-boolean p12, p0, Lh4/h;->k:Z

    .line 14
    iput-boolean p13, p0, Lh4/h;->l:Z

    .line 15
    iput p14, p0, Lh4/h;->w:I

    .line 16
    iput p15, p0, Lh4/h;->x:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lh4/h;->y:I

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lh4/h;->m:LEf/A;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lh4/h;->n:LEf/A;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lh4/h;->o:LEf/A;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lh4/h;->p:LEf/A;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lh4/h;->q:Landroidx/lifecycle/o;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lh4/h;->r:Li4/g;

    move/from16 p1, p23

    .line 24
    iput p1, p0, Lh4/h;->z:I

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lh4/h;->s:Lh4/n;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lh4/h;->t:Lh4/c;

    move-object/from16 p1, p26

    .line 27
    iput-object p1, p0, Lh4/h;->u:Lh4/b;

    return-void
.end method

.method public static a(Lh4/h;)Lh4/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/h;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lh4/g;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lh4/g;-><init>(Lh4/h;Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lh4/h;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lh4/h;

    .line 10
    .line 11
    iget-object v0, p1, Lh4/h;->a:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v1, p0, Lh4/h;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lh4/h;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, p1, Lh4/h;->b:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lh4/h;->c:Ly3/j;

    .line 32
    .line 33
    iget-object v1, p1, Lh4/h;->c:Ly3/j;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 42
    .line 43
    iget-object v1, p1, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 44
    .line 45
    if-ne v0, v1, :cond_1

    .line 46
    .line 47
    iget v0, p0, Lh4/h;->v:I

    .line 48
    .line 49
    iget v1, p1, Lh4/h;->v:I

    .line 50
    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lh4/h;->e:Lff/v;

    .line 54
    .line 55
    iget-object v1, p1, Lh4/h;->e:Lff/v;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lh4/h;->f:Lj4/a;

    .line 64
    .line 65
    iget-object v1, p1, Lh4/h;->f:Lj4/a;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Lh4/h;->g:Lokhttp3/Headers;

    .line 74
    .line 75
    iget-object v1, p1, Lh4/h;->g:Lokhttp3/Headers;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    iget-object v0, p0, Lh4/h;->h:Lh4/p;

    .line 84
    .line 85
    iget-object v1, p1, Lh4/h;->h:Lh4/p;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lh4/p;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    iget-boolean v0, p0, Lh4/h;->i:Z

    .line 94
    .line 95
    iget-boolean v1, p1, Lh4/h;->i:Z

    .line 96
    .line 97
    if-ne v0, v1, :cond_1

    .line 98
    .line 99
    iget-boolean v0, p0, Lh4/h;->j:Z

    .line 100
    .line 101
    iget-boolean v1, p1, Lh4/h;->j:Z

    .line 102
    .line 103
    if-ne v0, v1, :cond_1

    .line 104
    .line 105
    iget-boolean v0, p0, Lh4/h;->k:Z

    .line 106
    .line 107
    iget-boolean v1, p1, Lh4/h;->k:Z

    .line 108
    .line 109
    if-ne v0, v1, :cond_1

    .line 110
    .line 111
    iget-boolean v0, p0, Lh4/h;->l:Z

    .line 112
    .line 113
    iget-boolean v1, p1, Lh4/h;->l:Z

    .line 114
    .line 115
    if-ne v0, v1, :cond_1

    .line 116
    .line 117
    iget v0, p0, Lh4/h;->w:I

    .line 118
    .line 119
    iget v1, p1, Lh4/h;->w:I

    .line 120
    .line 121
    if-ne v0, v1, :cond_1

    .line 122
    .line 123
    iget v0, p0, Lh4/h;->x:I

    .line 124
    .line 125
    iget v1, p1, Lh4/h;->x:I

    .line 126
    .line 127
    if-ne v0, v1, :cond_1

    .line 128
    .line 129
    iget v0, p0, Lh4/h;->y:I

    .line 130
    .line 131
    iget v1, p1, Lh4/h;->y:I

    .line 132
    .line 133
    if-ne v0, v1, :cond_1

    .line 134
    .line 135
    iget-object v0, p0, Lh4/h;->m:LEf/A;

    .line 136
    .line 137
    iget-object v1, p1, Lh4/h;->m:LEf/A;

    .line 138
    .line 139
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_1

    .line 144
    .line 145
    iget-object v0, p0, Lh4/h;->n:LEf/A;

    .line 146
    .line 147
    iget-object v1, p1, Lh4/h;->n:LEf/A;

    .line 148
    .line 149
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_1

    .line 154
    .line 155
    iget-object v0, p0, Lh4/h;->o:LEf/A;

    .line 156
    .line 157
    iget-object v1, p1, Lh4/h;->o:LEf/A;

    .line 158
    .line 159
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_1

    .line 164
    .line 165
    iget-object v0, p0, Lh4/h;->p:LEf/A;

    .line 166
    .line 167
    iget-object v1, p1, Lh4/h;->p:LEf/A;

    .line 168
    .line 169
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_1

    .line 174
    .line 175
    iget-object v0, p0, Lh4/h;->q:Landroidx/lifecycle/o;

    .line 176
    .line 177
    iget-object v1, p1, Lh4/h;->q:Landroidx/lifecycle/o;

    .line 178
    .line 179
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_1

    .line 184
    .line 185
    iget-object v0, p0, Lh4/h;->r:Li4/g;

    .line 186
    .line 187
    iget-object v1, p1, Lh4/h;->r:Li4/g;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_1

    .line 194
    .line 195
    iget v0, p0, Lh4/h;->z:I

    .line 196
    .line 197
    iget v1, p1, Lh4/h;->z:I

    .line 198
    .line 199
    if-ne v0, v1, :cond_1

    .line 200
    .line 201
    iget-object v0, p0, Lh4/h;->s:Lh4/n;

    .line 202
    .line 203
    iget-object v1, p1, Lh4/h;->s:Lh4/n;

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Lh4/n;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_1

    .line 210
    .line 211
    iget-object v0, p0, Lh4/h;->t:Lh4/c;

    .line 212
    .line 213
    iget-object v1, p1, Lh4/h;->t:Lh4/c;

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Lh4/c;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_1

    .line 220
    .line 221
    iget-object v0, p0, Lh4/h;->u:Lh4/b;

    .line 222
    .line 223
    iget-object p1, p1, Lh4/h;->u:Lh4/b;

    .line 224
    .line 225
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_1

    .line 230
    .line 231
    :goto_0
    const/4 p1, 0x1

    .line 232
    return p1

    .line 233
    :cond_1
    const/4 p1, 0x0

    .line 234
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lh4/h;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lh4/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lh4/h;->c:Ly3/j;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    add-int/2addr v2, v0

    .line 29
    const v0, 0xe1781

    .line 30
    .line 31
    .line 32
    mul-int/2addr v2, v0

    .line 33
    iget-object v0, p0, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, v2

    .line 40
    mul-int/lit16 v0, v0, 0x3c1

    .line 41
    .line 42
    iget v2, p0, Lh4/h;->v:I

    .line 43
    .line 44
    const/16 v3, 0x745f

    .line 45
    .line 46
    invoke-static {v2, v0, v3}, LA/f;->d(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lh4/h;->e:Lff/v;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, Lh4/h;->f:Lj4/a;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-class v0, Lj4/a;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v0, v2

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget-object v2, p0, Lh4/h;->g:Lokhttp3/Headers;

    .line 72
    .line 73
    iget-object v2, v2, Lokhttp3/Headers;->a:[Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v0, v2

    .line 80
    mul-int/2addr v0, v1

    .line 81
    iget-object v2, p0, Lh4/h;->h:Lh4/p;

    .line 82
    .line 83
    iget-object v2, v2, Lh4/p;->a:Ljava/util/Map;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    add-int/2addr v2, v0

    .line 90
    mul-int/2addr v2, v1

    .line 91
    iget-boolean v0, p0, Lh4/h;->i:Z

    .line 92
    .line 93
    const/16 v3, 0x4d5

    .line 94
    .line 95
    const/16 v4, 0x4cf

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    move v0, v4

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move v0, v3

    .line 102
    :goto_1
    add-int/2addr v2, v0

    .line 103
    mul-int/2addr v2, v1

    .line 104
    iget-boolean v0, p0, Lh4/h;->j:Z

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    move v0, v4

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    move v0, v3

    .line 111
    :goto_2
    add-int/2addr v2, v0

    .line 112
    mul-int/2addr v2, v1

    .line 113
    iget-boolean v0, p0, Lh4/h;->k:Z

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    move v0, v4

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move v0, v3

    .line 120
    :goto_3
    add-int/2addr v2, v0

    .line 121
    mul-int/2addr v2, v1

    .line 122
    iget-boolean v0, p0, Lh4/h;->l:Z

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    move v3, v4

    .line 127
    :cond_4
    add-int/2addr v2, v3

    .line 128
    mul-int/2addr v2, v1

    .line 129
    iget v0, p0, Lh4/h;->w:I

    .line 130
    .line 131
    invoke-static {v0, v2, v1}, LA/f;->d(III)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget v2, p0, Lh4/h;->x:I

    .line 136
    .line 137
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    iget v2, p0, Lh4/h;->y:I

    .line 142
    .line 143
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iget-object v2, p0, Lh4/h;->m:LEf/A;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    add-int/2addr v2, v0

    .line 154
    mul-int/2addr v2, v1

    .line 155
    iget-object v0, p0, Lh4/h;->n:LEf/A;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    add-int/2addr v0, v2

    .line 162
    mul-int/2addr v0, v1

    .line 163
    iget-object v2, p0, Lh4/h;->o:LEf/A;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    add-int/2addr v2, v0

    .line 170
    mul-int/2addr v2, v1

    .line 171
    iget-object v0, p0, Lh4/h;->p:LEf/A;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    add-int/2addr v0, v2

    .line 178
    mul-int/2addr v0, v1

    .line 179
    iget-object v2, p0, Lh4/h;->q:Landroidx/lifecycle/o;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    add-int/2addr v2, v0

    .line 186
    mul-int/2addr v2, v1

    .line 187
    iget-object v0, p0, Lh4/h;->r:Li4/g;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    add-int/2addr v0, v2

    .line 194
    mul-int/2addr v0, v1

    .line 195
    iget v2, p0, Lh4/h;->z:I

    .line 196
    .line 197
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iget-object v2, p0, Lh4/h;->s:Lh4/n;

    .line 202
    .line 203
    iget-object v2, v2, Lh4/n;->a:Ljava/util/Map;

    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    add-int/2addr v2, v0

    .line 210
    const v0, -0x6bbb90ff

    .line 211
    .line 212
    .line 213
    mul-int/2addr v2, v0

    .line 214
    iget-object v0, p0, Lh4/h;->t:Lh4/c;

    .line 215
    .line 216
    invoke-virtual {v0}, Lh4/c;->hashCode()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    add-int/2addr v0, v2

    .line 221
    mul-int/2addr v0, v1

    .line 222
    iget-object v1, p0, Lh4/h;->u:Lh4/b;

    .line 223
    .line 224
    invoke-virtual {v1}, Lh4/b;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    add-int/2addr v1, v0

    .line 229
    return v1
.end method
