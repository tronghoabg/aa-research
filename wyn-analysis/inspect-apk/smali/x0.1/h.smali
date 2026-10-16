.class public final Lx0/h;
.super LX0/E;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lt0/y;Lx0/i;)V
    .locals 1

    .line 1
    const-string v0, "wrapped"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modifier"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LX0/E;-><init>(Lt0/y;LZ/j;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LX0/E;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, LX0/E;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lt0/y;

    .line 7
    .line 8
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lu0/n;->o()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LX0/E;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, LX0/E;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lt0/y;

    .line 7
    .line 8
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lu0/n;->o()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final j()Lx0/g;
    .locals 8

    .line 1
    iget-object v0, p0, LX0/E;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX0/E;

    .line 4
    .line 5
    check-cast v0, Lx0/h;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, LX0/E;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lt0/y;

    .line 14
    .line 15
    invoke-virtual {v0}, Lt0/y;->N()Lt0/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    :goto_0
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v3, v0, Lt0/y;->s:[LX0/E;

    .line 24
    .line 25
    invoke-static {v3, v1}, LFe/e;->H([LX0/E;I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lt0/y;->N()Lt0/y;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lt0/y;->s:[LX0/E;

    .line 39
    .line 40
    aget-object v0, v0, v1

    .line 41
    .line 42
    check-cast v0, Lx0/h;

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    iget-object v3, v0, LX0/E;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lt0/y;

    .line 49
    .line 50
    :goto_1
    if-eqz v3, :cond_6

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    :goto_2
    move-object v2, v0

    .line 55
    goto :goto_4

    .line 56
    :cond_1
    invoke-virtual {v3}, Lt0/y;->N()Lt0/y;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    iget-object v0, v3, Lt0/y;->s:[LX0/E;

    .line 63
    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    check-cast v0, Lx0/h;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v0, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget-object v3, v0, LX0/E;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lt0/y;

    .line 74
    .line 75
    :goto_3
    if-eqz v3, :cond_6

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    invoke-virtual {v3}, Lt0/y;->N()Lt0/y;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    iget-object v0, v3, Lt0/y;->s:[LX0/E;

    .line 87
    .line 88
    aget-object v0, v0, v1

    .line 89
    .line 90
    check-cast v0, Lx0/h;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move-object v0, v2

    .line 94
    goto :goto_3

    .line 95
    :cond_6
    :goto_4
    iget-object v0, p0, LX0/E;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, LZ/j;

    .line 98
    .line 99
    if-eqz v2, :cond_10

    .line 100
    .line 101
    move-object v1, v0

    .line 102
    check-cast v1, Lx0/i;

    .line 103
    .line 104
    check-cast v1, Lx0/j;

    .line 105
    .line 106
    iget-object v1, v1, Lx0/j;->b:Lx0/g;

    .line 107
    .line 108
    iget-boolean v3, v1, Lx0/g;->c:Z

    .line 109
    .line 110
    if-eqz v3, :cond_7

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v0, Lx0/g;

    .line 118
    .line 119
    invoke-direct {v0}, Lx0/g;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-boolean v3, v1, Lx0/g;->b:Z

    .line 123
    .line 124
    iput-boolean v3, v0, Lx0/g;->b:Z

    .line 125
    .line 126
    iget-boolean v3, v1, Lx0/g;->c:Z

    .line 127
    .line 128
    iput-boolean v3, v0, Lx0/g;->c:Z

    .line 129
    .line 130
    iget-object v3, v0, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    iget-object v1, v1, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    invoke-interface {v3, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lx0/h;->j()Lx0/g;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "peer"

    .line 142
    .line 143
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-boolean v2, v1, Lx0/g;->b:Z

    .line 147
    .line 148
    const/4 v4, 0x1

    .line 149
    if-eqz v2, :cond_8

    .line 150
    .line 151
    iput-boolean v4, v0, Lx0/g;->b:Z

    .line 152
    .line 153
    :cond_8
    iget-boolean v2, v1, Lx0/g;->c:Z

    .line 154
    .line 155
    if-eqz v2, :cond_9

    .line 156
    .line 157
    iput-boolean v4, v0, Lx0/g;->c:Z

    .line 158
    .line 159
    :cond_9
    iget-object v1, v1, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_f

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ljava/util/Map$Entry;

    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    check-cast v4, Lx0/q;

    .line 186
    .line 187
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_b

    .line 196
    .line 197
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    instance-of v5, v2, Lx0/a;

    .line 202
    .line 203
    if-eqz v5, :cond_a

    .line 204
    .line 205
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-eqz v5, :cond_e

    .line 210
    .line 211
    check-cast v5, Lx0/a;

    .line 212
    .line 213
    new-instance v6, Lx0/a;

    .line 214
    .line 215
    iget-object v7, v5, Lx0/a;->a:Ljava/lang/String;

    .line 216
    .line 217
    if-nez v7, :cond_c

    .line 218
    .line 219
    move-object v7, v2

    .line 220
    check-cast v7, Lx0/a;

    .line 221
    .line 222
    iget-object v7, v7, Lx0/a;->a:Ljava/lang/String;

    .line 223
    .line 224
    :cond_c
    iget-object v5, v5, Lx0/a;->b:Lef/e;

    .line 225
    .line 226
    if-nez v5, :cond_d

    .line 227
    .line 228
    check-cast v2, Lx0/a;

    .line 229
    .line 230
    iget-object v5, v2, Lx0/a;->b:Lef/e;

    .line 231
    .line 232
    :cond_d
    invoke-direct {v6, v7, v5}, Lx0/a;-><init>(Ljava/lang/String;Lef/e;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v3, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    .line 240
    .line 241
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    .line 242
    .line 243
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :cond_f
    return-object v0

    .line 248
    :cond_10
    :goto_6
    check-cast v0, Lx0/i;

    .line 249
    .line 250
    check-cast v0, Lx0/j;

    .line 251
    .line 252
    iget-object v0, v0, Lx0/j;->b:Lx0/g;

    .line 253
    .line 254
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " id: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LX0/E;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LZ/j;

    .line 21
    .line 22
    check-cast v1, Lx0/i;

    .line 23
    .line 24
    check-cast v1, Lx0/j;

    .line 25
    .line 26
    iget v2, v1, Lx0/j;->a:I

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, " config: "

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, Lx0/j;->b:Lx0/g;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
