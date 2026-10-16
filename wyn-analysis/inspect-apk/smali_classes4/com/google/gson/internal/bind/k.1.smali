.class public final Lcom/google/gson/internal/bind/k;
.super Lla/z;
.source "SourceFile"


# instance fields
.field public final a:Lcom/dexterous/flutterlocalnotifications/j;

.field public final b:Lcom/dexterous/flutterlocalnotifications/j;

.field public final c:Lna/m;

.field public final synthetic d:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;Lla/l;Ljava/lang/reflect/Type;Lla/z;Ljava/lang/reflect/Type;Lla/z;Lna/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/k;->d:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;

    .line 5
    .line 6
    new-instance p1, Lcom/dexterous/flutterlocalnotifications/j;

    .line 7
    .line 8
    invoke-direct {p1, p2, p4, p3}, Lcom/dexterous/flutterlocalnotifications/j;-><init>(Lla/l;Lla/z;Ljava/lang/reflect/Type;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/gson/internal/bind/k;->a:Lcom/dexterous/flutterlocalnotifications/j;

    .line 12
    .line 13
    new-instance p1, Lcom/dexterous/flutterlocalnotifications/j;

    .line 14
    .line 15
    invoke-direct {p1, p2, p6, p5}, Lcom/dexterous/flutterlocalnotifications/j;-><init>(Lla/l;Lla/z;Ljava/lang/reflect/Type;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/gson/internal/bind/k;->b:Lcom/dexterous/flutterlocalnotifications/j;

    .line 19
    .line 20
    iput-object p7, p0, Lcom/google/gson/internal/bind/k;->c:Lna/m;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Lra/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lra/a;->e0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lra/a;->a0()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v2, p0, Lcom/google/gson/internal/bind/k;->c:Lna/m;

    .line 15
    .line 16
    invoke-interface {v2}, Lna/m;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/Map;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const-string v4, "duplicate key: "

    .line 24
    .line 25
    if-ne v0, v3, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Lra/a;->a()V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p1}, Lra/a;->D()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Lra/a;->a()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/gson/internal/bind/k;->a:Lcom/dexterous/flutterlocalnotifications/j;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lla/z;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/google/gson/internal/bind/k;->b:Lcom/dexterous/flutterlocalnotifications/j;

    .line 50
    .line 51
    iget-object v1, v1, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lla/z;

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Lra/a;->i()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, Lla/p;

    .line 70
    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/16 v1, 0xd

    .line 84
    .line 85
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_2
    invoke-virtual {p1}, Lra/a;->i()V

    .line 90
    .line 91
    .line 92
    return-object v2

    .line 93
    :cond_3
    invoke-virtual {p1}, Lra/a;->b()V

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-virtual {p1}, Lra/a;->D()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_a

    .line 101
    .line 102
    sget-object v0, La2/k;->b:La2/k;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    instance-of v0, p1, Lcom/google/gson/internal/bind/h;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    move-object v0, p1

    .line 112
    check-cast v0, Lcom/google/gson/internal/bind/h;

    .line 113
    .line 114
    const/4 v3, 0x5

    .line 115
    invoke-virtual {v0, v3}, Lcom/google/gson/internal/bind/h;->n0(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/google/gson/internal/bind/h;->r0()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Ljava/util/Iterator;

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/Map$Entry;

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v0, v5}, Lcom/google/gson/internal/bind/h;->t0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Lla/s;

    .line 138
    .line 139
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ljava/lang/String;

    .line 144
    .line 145
    invoke-direct {v5, v3}, Lla/s;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v5}, Lcom/google/gson/internal/bind/h;->t0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    iget v0, p1, Lra/a;->g:I

    .line 153
    .line 154
    if-nez v0, :cond_5

    .line 155
    .line 156
    invoke-virtual {p1}, Lra/a;->h()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    :cond_5
    const/16 v3, 0xd

    .line 161
    .line 162
    if-ne v0, v3, :cond_6

    .line 163
    .line 164
    iput v1, p1, Lra/a;->g:I

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_6
    const/16 v3, 0xc

    .line 168
    .line 169
    if-ne v0, v3, :cond_7

    .line 170
    .line 171
    const/16 v0, 0x8

    .line 172
    .line 173
    iput v0, p1, Lra/a;->g:I

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    const/16 v3, 0xe

    .line 177
    .line 178
    if-ne v0, v3, :cond_9

    .line 179
    .line 180
    const/16 v0, 0xa

    .line 181
    .line 182
    iput v0, p1, Lra/a;->g:I

    .line 183
    .line 184
    :goto_2
    iget-object v0, p0, Lcom/google/gson/internal/bind/k;->a:Lcom/dexterous/flutterlocalnotifications/j;

    .line 185
    .line 186
    iget-object v0, v0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Lla/z;

    .line 189
    .line 190
    invoke-virtual {v0, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v3, p0, Lcom/google/gson/internal/bind/k;->b:Lcom/dexterous/flutterlocalnotifications/j;

    .line 195
    .line 196
    iget-object v3, v3, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v3, Lla/z;

    .line 199
    .line 200
    invoke-virtual {v3, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-nez v3, :cond_8

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_8
    new-instance p1, Lla/p;

    .line 212
    .line 213
    new-instance v1, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const/16 v1, 0xd

    .line 226
    .line 227
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    throw p1

    .line 231
    :cond_9
    const-string v0, "a name"

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Lra/a;->m0(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    throw p1

    .line 238
    :cond_a
    invoke-virtual {p1}, Lra/a;->o()V

    .line 239
    .line 240
    .line 241
    return-object v2
.end method

.method public final c(Lra/b;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Ljava/util/Map;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lra/b;->z()Lra/b;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/k;->d:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/gson/internal/bind/k;->b:Lcom/dexterous/flutterlocalnotifications/j;

    .line 15
    .line 16
    invoke-virtual {p1}, Lra/b;->d()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Lra/b;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, p1, v1}, Lcom/dexterous/flutterlocalnotifications/j;->c(Lra/b;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p1}, Lra/b;->o()V

    .line 59
    .line 60
    .line 61
    return-void
.end method
