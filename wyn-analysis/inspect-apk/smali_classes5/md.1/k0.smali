.class public final Lmd/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/List;

.field public static final e:Lmd/k0;

.field public static final f:Lmd/k0;

.field public static final g:Lmd/k0;

.field public static final h:Lmd/k0;

.field public static final i:Lmd/k0;

.field public static final j:Lmd/k0;

.field public static final k:Lmd/k0;

.field public static final l:Lmd/k0;

.field public static final m:Lmd/k0;

.field public static final n:Lmd/k0;

.field public static final o:Lmd/Z;

.field public static final p:Lmd/Z;


# instance fields
.field public final a:Lmd/j0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lmd/j0;->values()[Lmd/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    aget-object v5, v1, v4

    .line 16
    .line 17
    iget v6, v5, Lmd/j0;->a:I

    .line 18
    .line 19
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    new-instance v7, Lmd/k0;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    invoke-direct {v7, v5, v8, v8}, Lmd/k0;-><init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Lmd/k0;

    .line 34
    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Code value duplication between "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v6, Lmd/k0;->a:Lmd/j0;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, " & "

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lmd/k0;->d:Ljava/util/List;

    .line 92
    .line 93
    sget-object v0, Lmd/j0;->c:Lmd/j0;

    .line 94
    .line 95
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lmd/k0;->e:Lmd/k0;

    .line 100
    .line 101
    sget-object v0, Lmd/j0;->d:Lmd/j0;

    .line 102
    .line 103
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lmd/k0;->f:Lmd/k0;

    .line 108
    .line 109
    sget-object v0, Lmd/j0;->e:Lmd/j0;

    .line 110
    .line 111
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lmd/k0;->g:Lmd/k0;

    .line 116
    .line 117
    sget-object v0, Lmd/j0;->f:Lmd/j0;

    .line 118
    .line 119
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 120
    .line 121
    .line 122
    sget-object v0, Lmd/j0;->g:Lmd/j0;

    .line 123
    .line 124
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, Lmd/k0;->h:Lmd/k0;

    .line 129
    .line 130
    sget-object v0, Lmd/j0;->h:Lmd/j0;

    .line 131
    .line 132
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 133
    .line 134
    .line 135
    sget-object v0, Lmd/j0;->i:Lmd/j0;

    .line 136
    .line 137
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 138
    .line 139
    .line 140
    sget-object v0, Lmd/j0;->j:Lmd/j0;

    .line 141
    .line 142
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lmd/k0;->i:Lmd/k0;

    .line 147
    .line 148
    sget-object v0, Lmd/j0;->s:Lmd/j0;

    .line 149
    .line 150
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, Lmd/k0;->j:Lmd/k0;

    .line 155
    .line 156
    sget-object v0, Lmd/j0;->k:Lmd/j0;

    .line 157
    .line 158
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sput-object v0, Lmd/k0;->k:Lmd/k0;

    .line 163
    .line 164
    sget-object v0, Lmd/j0;->l:Lmd/j0;

    .line 165
    .line 166
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sput-object v0, Lmd/k0;->l:Lmd/k0;

    .line 171
    .line 172
    sget-object v0, Lmd/j0;->m:Lmd/j0;

    .line 173
    .line 174
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 175
    .line 176
    .line 177
    sget-object v0, Lmd/j0;->n:Lmd/j0;

    .line 178
    .line 179
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 180
    .line 181
    .line 182
    sget-object v0, Lmd/j0;->o:Lmd/j0;

    .line 183
    .line 184
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 185
    .line 186
    .line 187
    sget-object v0, Lmd/j0;->p:Lmd/j0;

    .line 188
    .line 189
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sput-object v0, Lmd/k0;->m:Lmd/k0;

    .line 194
    .line 195
    sget-object v0, Lmd/j0;->q:Lmd/j0;

    .line 196
    .line 197
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    sput-object v0, Lmd/k0;->n:Lmd/k0;

    .line 202
    .line 203
    sget-object v0, Lmd/j0;->r:Lmd/j0;

    .line 204
    .line 205
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 206
    .line 207
    .line 208
    new-instance v0, Lmd/j;

    .line 209
    .line 210
    const/16 v1, 0xa

    .line 211
    .line 212
    invoke-direct {v0, v1}, Lmd/j;-><init>(I)V

    .line 213
    .line 214
    .line 215
    new-instance v1, Lmd/Z;

    .line 216
    .line 217
    const-string v2, "grpc-status"

    .line 218
    .line 219
    invoke-direct {v1, v2, v3, v0}, Lmd/Z;-><init>(Ljava/lang/String;ZLmd/a0;)V

    .line 220
    .line 221
    .line 222
    sput-object v1, Lmd/k0;->o:Lmd/Z;

    .line 223
    .line 224
    new-instance v0, Lmd/j;

    .line 225
    .line 226
    const/4 v1, 0x1

    .line 227
    invoke-direct {v0, v1}, Lmd/j;-><init>(I)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lmd/Z;

    .line 231
    .line 232
    const-string v2, "grpc-message"

    .line 233
    .line 234
    invoke-direct {v1, v2, v3, v0}, Lmd/Z;-><init>(Ljava/lang/String;ZLmd/a0;)V

    .line 235
    .line 236
    .line 237
    sput-object v1, Lmd/k0;->p:Lmd/Z;

    .line 238
    .line 239
    return-void
.end method

.method public constructor <init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "code"

    .line 5
    .line 6
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lmd/k0;->a:Lmd/j0;

    .line 10
    .line 11
    iput-object p2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 14
    .line 15
    return-void
.end method

.method public static c(Lmd/k0;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ": "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static d(I)Lmd/k0;
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    sget-object v0, Lmd/k0;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lt p0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lmd/k0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Unknown code "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v0, Lmd/k0;->g:Lmd/k0;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static e(Ljava/lang/Throwable;)Lmd/k0;
    .locals 2

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p0, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of v1, v0, Lmd/l0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lmd/l0;

    .line 14
    .line 15
    iget-object p0, v0, Lmd/l0;->a:Lmd/k0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v1, v0, Lmd/m0;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lmd/m0;

    .line 23
    .line 24
    iget-object p0, v0, Lmd/m0;->a:Lmd/k0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object v0, Lmd/k0;->g:Lmd/k0;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method


# virtual methods
.method public final a()Lmd/m0;
    .locals 2

    .line 1
    new-instance v0, Lmd/m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lmd/m0;-><init>(Lmd/k0;Lmd/b0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lmd/k0;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget-object v0, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 5
    .line 6
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 7
    .line 8
    iget-object v2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    new-instance v2, Lmd/k0;

    .line 13
    .line 14
    invoke-direct {v2, v1, p1, v0}, Lmd/k0;-><init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    new-instance v3, Lmd/k0;

    .line 19
    .line 20
    const-string v4, "\n"

    .line 21
    .line 22
    invoke-static {v2, v4, p1}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v3, v1, p1, v0}, Lmd/k0;-><init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v3
.end method

.method public final f()Z
    .locals 2

    .line 1
    sget-object v0, Lmd/j0;->c:Lmd/j0;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final g(Ljava/lang/Throwable;)Lmd/k0;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-static {v0, p1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lmd/k0;

    .line 11
    .line 12
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 13
    .line 14
    iget-object v2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p1}, Lmd/k0;-><init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final h(Ljava/lang/String;)Lmd/k0;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lmd/k0;

    .line 11
    .line 12
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 13
    .line 14
    iget-object v2, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1, v2}, Lmd/k0;-><init>(Lmd/j0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "code"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "description"

    .line 17
    .line 18
    iget-object v2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object v2, Lk8/t;->a:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v2, Ljava/io/StringWriter;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ljava/io/PrintWriter;

    .line 35
    .line 36
    invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_0
    const-string v2, "cause"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
