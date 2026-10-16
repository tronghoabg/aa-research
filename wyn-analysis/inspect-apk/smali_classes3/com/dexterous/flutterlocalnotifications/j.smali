.class public final Lcom/dexterous/flutterlocalnotifications/j;
.super Lla/z;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/dexterous/flutterlocalnotifications/j;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/dexterous/flutterlocalnotifications/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lla/l;Lla/z;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/dexterous/flutterlocalnotifications/j;->b:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, Lcom/dexterous/flutterlocalnotifications/j;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lra/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lla/z;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    invoke-static {p1}, Lna/d;->i(Lra/a;)Lla/o;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lla/o;->b()Lla/r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/j;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v0, v0, Lla/r;->a:Lna/l;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lna/l;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lla/o;

    .line 38
    .line 39
    const-string v2, "cannot deserialize "

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lla/o;->c()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v3, p0, Lcom/dexterous/flutterlocalnotifications/j;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lla/z;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    :try_start_0
    new-instance v0, Lcom/google/gson/internal/bind/h;

    .line 60
    .line 61
    sget-object v1, Lcom/google/gson/internal/bind/h;->t:Lcom/google/gson/internal/bind/g;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lra/a;-><init>(Ljava/io/Reader;)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0x20

    .line 67
    .line 68
    new-array v2, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v2, v0, Lcom/google/gson/internal/bind/h;->p:[Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    iput v2, v0, Lcom/google/gson/internal/bind/h;->q:I

    .line 74
    .line 75
    new-array v2, v1, [Ljava/lang/String;

    .line 76
    .line 77
    iput-object v2, v0, Lcom/google/gson/internal/bind/h;->r:[Ljava/lang/String;

    .line 78
    .line 79
    new-array v1, v1, [I

    .line 80
    .line 81
    iput-object v1, v0, Lcom/google/gson/internal/bind/h;->s:[I

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Lcom/google/gson/internal/bind/h;->t0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v0}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    return-object p1

    .line 91
    :catch_0
    move-exception p1

    .line 92
    new-instance v0, Lla/p;

    .line 93
    .line 94
    const/16 v1, 0xd

    .line 95
    .line 96
    invoke-direct {v0, p1, v1}, LE5/Q;-><init>(Ljava/lang/Throwable;I)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_0
    new-instance p1, LE5/Q;

    .line 101
    .line 102
    new-instance v3, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->a(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, " subtype named "

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, "; did you forget to register a subtype?"

    .line 123
    .line 124
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/16 v1, 0xd

    .line 132
    .line 133
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_1
    new-instance p1, LE5/Q;

    .line 138
    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->a(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v2, " because it does not define a field named "

    .line 152
    .line 153
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const/16 v1, 0xd

    .line 168
    .line 169
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lra/b;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/j;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/reflect/Type;

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    instance-of v1, v0, Ljava/lang/Class;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v0

    .line 26
    :goto_0
    iget-object v2, p0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lla/z;

    .line 29
    .line 30
    if-eq v1, v0, :cond_6

    .line 31
    .line 32
    new-instance v0, Lqa/a;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lqa/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/j;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lla/l;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lla/l;->c(Lqa/a;)Lla/z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, v0, Lcom/google/gson/internal/bind/p;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    move-object v1, v2

    .line 51
    :goto_1
    instance-of v3, v1, Lcom/google/gson/internal/bind/t;

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    move-object v3, v1

    .line 56
    check-cast v3, Lcom/google/gson/internal/bind/t;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/google/gson/internal/bind/t;->d()Lla/z;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-ne v3, v1, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object v1, v3

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    :goto_2
    instance-of v1, v1, Lcom/google/gson/internal/bind/p;

    .line 68
    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    :goto_3
    move-object v2, v0

    .line 73
    :cond_6
    :goto_4
    invoke-virtual {v2, p1, p2}, Lla/z;->c(Lra/b;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/j;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;

    .line 84
    .line 85
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->b(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v3, p0, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lla/z;

    .line 104
    .line 105
    const-string v4, "cannot serialize "

    .line 106
    .line 107
    if-eqz v3, :cond_b

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    :try_start_0
    new-instance v5, Lcom/google/gson/internal/bind/j;

    .line 113
    .line 114
    invoke-direct {v5}, Lcom/google/gson/internal/bind/j;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v5, p2}, Lla/z;->c(Lra/b;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p2, v5, Lcom/google/gson/internal/bind/j;->o:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_a

    .line 127
    .line 128
    iget-object p2, v5, Lcom/google/gson/internal/bind/j;->q:Lla/o;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    invoke-virtual {p2}, Lla/o;->b()Lla/r;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget-object p2, p2, Lla/r;->a:Lna/l;

    .line 139
    .line 140
    invoke-virtual {p2, v3}, Lna/l;->containsKey(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_9

    .line 145
    .line 146
    new-instance v0, Lla/r;

    .line 147
    .line 148
    invoke-direct {v0}, Lla/r;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v3, Lla/s;

    .line 156
    .line 157
    invoke-direct {v3, v2}, Lla/s;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Lla/r;->a:Lna/l;

    .line 161
    .line 162
    invoke-virtual {v2, v1, v3}, Lna/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Lna/l;->entrySet()Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Lna/j;

    .line 170
    .line 171
    invoke-virtual {p2}, Lna/j;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    :goto_5
    move-object v1, p2

    .line 176
    check-cast v1, Lhb/F;

    .line 177
    .line 178
    invoke-virtual {v1}, Lhb/F;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    move-object v1, p2

    .line 185
    check-cast v1, Lna/i;

    .line 186
    .line 187
    invoke-virtual {v1}, Lhb/F;->b()Lna/k;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    check-cast v3, Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lla/o;

    .line 202
    .line 203
    if-nez v1, :cond_7

    .line 204
    .line 205
    sget-object v1, Lla/q;->a:Lla/q;

    .line 206
    .line 207
    :cond_7
    invoke-virtual {v2, v3, v1}, Lna/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_8
    sget-object p2, Lcom/google/gson/internal/bind/Y;->z:Lcom/google/gson/internal/bind/f;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {p1, v0}, Lcom/google/gson/internal/bind/f;->e(Lra/b;Lla/o;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_9
    new-instance p1, LE5/Q;

    .line 221
    .line 222
    new-instance p2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v0, " because it already defines a field named "

    .line 235
    .line 236
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-static {v1}, Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;->c(Lcom/dexterous/flutterlocalnotifications/RuntimeTypeAdapterFactory;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    const/16 v0, 0xd

    .line 251
    .line 252
    invoke-direct {p1, p2, v0}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_a
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string v1, "Expected one JSON element but was "

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 276
    :catch_0
    move-exception p1

    .line 277
    new-instance p2, Lla/p;

    .line 278
    .line 279
    const/16 v0, 0xd

    .line 280
    .line 281
    invoke-direct {p2, p1, v0}, LE5/Q;-><init>(Ljava/lang/Throwable;I)V

    .line 282
    .line 283
    .line 284
    throw p2

    .line 285
    :cond_b
    new-instance p1, LE5/Q;

    .line 286
    .line 287
    new-instance p2, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v0, "; did you forget to register a subtype?"

    .line 300
    .line 301
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    const/16 v0, 0xd

    .line 309
    .line 310
    invoke-direct {p1, p2, v0}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 311
    .line 312
    .line 313
    throw p1

    .line 314
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
