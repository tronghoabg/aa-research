.class public final Landroidx/datastore/preferences/protobuf/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/b0;


# static fields
.field public static final o:[I

.field public static final p:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Landroidx/datastore/preferences/protobuf/v;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:Landroidx/datastore/preferences/protobuf/U;

.field public final l:Landroidx/datastore/preferences/protobuf/G;

.field public final m:Landroidx/datastore/preferences/protobuf/k0;

.field public final n:Landroidx/datastore/preferences/protobuf/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Landroidx/datastore/preferences/protobuf/S;->o:[I

    .line 5
    .line 6
    invoke-static {}, Landroidx/datastore/preferences/protobuf/s0;->i()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/v;Z[IIILandroidx/datastore/preferences/protobuf/U;Landroidx/datastore/preferences/protobuf/G;Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/datastore/preferences/protobuf/S;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Landroidx/datastore/preferences/protobuf/S;->c:I

    .line 9
    .line 10
    iput p4, p0, Landroidx/datastore/preferences/protobuf/S;->d:I

    .line 11
    .line 12
    instance-of p1, p5, Landroidx/datastore/preferences/protobuf/v;

    .line 13
    .line 14
    iput-boolean p1, p0, Landroidx/datastore/preferences/protobuf/S;->f:Z

    .line 15
    .line 16
    iput-boolean p6, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 17
    .line 18
    iput-object p7, p0, Landroidx/datastore/preferences/protobuf/S;->h:[I

    .line 19
    .line 20
    iput p8, p0, Landroidx/datastore/preferences/protobuf/S;->i:I

    .line 21
    .line 22
    iput p9, p0, Landroidx/datastore/preferences/protobuf/S;->j:I

    .line 23
    .line 24
    iput-object p10, p0, Landroidx/datastore/preferences/protobuf/S;->k:Landroidx/datastore/preferences/protobuf/U;

    .line 25
    .line 26
    iput-object p11, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 27
    .line 28
    iput-object p12, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 29
    .line 30
    iput-object p5, p0, Landroidx/datastore/preferences/protobuf/S;->e:Landroidx/datastore/preferences/protobuf/v;

    .line 31
    .line 32
    iput-object p14, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 33
    .line 34
    return-void
.end method

.method public static A(JLjava/lang/Object;)J
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    const-string v2, "Field "

    .line 33
    .line 34
    const-string v3, " for "

    .line 35
    .line 36
    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, " not found. Known fields are "

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1
.end method

.method public static J(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p2, p2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Landroidx/datastore/preferences/protobuf/j;

    .line 10
    .line 11
    invoke-virtual {p2, p0, p1}, Landroidx/datastore/preferences/protobuf/j;->P(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    check-cast p1, Landroidx/datastore/preferences/protobuf/g;

    .line 16
    .line 17
    invoke-virtual {p2, p0, p1}, Landroidx/datastore/preferences/protobuf/J;->a(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p0}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public static w(Landroidx/datastore/preferences/protobuf/a0;Landroidx/datastore/preferences/protobuf/U;Landroidx/datastore/preferences/protobuf/G;Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/N;)Landroidx/datastore/preferences/protobuf/S;
    .locals 1

    .line 1
    instance-of v0, p0, Landroidx/datastore/preferences/protobuf/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static/range {p0 .. p5}, Landroidx/datastore/preferences/protobuf/S;->x(Landroidx/datastore/preferences/protobuf/a0;Landroidx/datastore/preferences/protobuf/U;Landroidx/datastore/preferences/protobuf/G;Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/N;)Landroidx/datastore/preferences/protobuf/S;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/lang/ClassCastException;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p0
.end method

.method public static x(Landroidx/datastore/preferences/protobuf/a0;Landroidx/datastore/preferences/protobuf/U;Landroidx/datastore/preferences/protobuf/G;Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/N;)Landroidx/datastore/preferences/protobuf/S;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/datastore/preferences/protobuf/a0;->d:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    and-int/2addr v1, v2

    .line 7
    const/4 v3, 0x2

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v3

    .line 13
    :goto_0
    const/4 v4, 0x0

    .line 14
    if-ne v1, v3, :cond_1

    .line 15
    .line 16
    move v11, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v11, v4

    .line 19
    :goto_1
    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/a0;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const v8, 0xd800

    .line 30
    .line 31
    .line 32
    if-lt v6, v8, :cond_3

    .line 33
    .line 34
    and-int/lit16 v6, v6, 0x1fff

    .line 35
    .line 36
    move v9, v2

    .line 37
    const/16 v10, 0xd

    .line 38
    .line 39
    :goto_2
    add-int/lit8 v12, v9, 0x1

    .line 40
    .line 41
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-lt v9, v8, :cond_2

    .line 46
    .line 47
    and-int/lit16 v9, v9, 0x1fff

    .line 48
    .line 49
    shl-int/2addr v9, v10

    .line 50
    or-int/2addr v6, v9

    .line 51
    add-int/lit8 v10, v10, 0xd

    .line 52
    .line 53
    move v9, v12

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    shl-int/2addr v9, v10

    .line 56
    or-int/2addr v6, v9

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move v12, v2

    .line 59
    :goto_3
    add-int/lit8 v9, v12, 0x1

    .line 60
    .line 61
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-lt v10, v8, :cond_5

    .line 66
    .line 67
    and-int/lit16 v10, v10, 0x1fff

    .line 68
    .line 69
    const/16 v12, 0xd

    .line 70
    .line 71
    :goto_4
    add-int/lit8 v13, v9, 0x1

    .line 72
    .line 73
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-lt v9, v8, :cond_4

    .line 78
    .line 79
    and-int/lit16 v9, v9, 0x1fff

    .line 80
    .line 81
    shl-int/2addr v9, v12

    .line 82
    or-int/2addr v10, v9

    .line 83
    add-int/lit8 v12, v12, 0xd

    .line 84
    .line 85
    move v9, v13

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    shl-int/2addr v9, v12

    .line 88
    or-int/2addr v10, v9

    .line 89
    move v9, v13

    .line 90
    :cond_5
    if-nez v10, :cond_6

    .line 91
    .line 92
    sget-object v10, Landroidx/datastore/preferences/protobuf/S;->o:[I

    .line 93
    .line 94
    move/from16 v17, v3

    .line 95
    .line 96
    move v3, v4

    .line 97
    move v7, v3

    .line 98
    move v13, v7

    .line 99
    move v14, v13

    .line 100
    move v15, v14

    .line 101
    move-object v12, v10

    .line 102
    move v10, v15

    .line 103
    goto/16 :goto_f

    .line 104
    .line 105
    :cond_6
    add-int/lit8 v10, v9, 0x1

    .line 106
    .line 107
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-lt v9, v8, :cond_8

    .line 112
    .line 113
    and-int/lit16 v9, v9, 0x1fff

    .line 114
    .line 115
    const/16 v12, 0xd

    .line 116
    .line 117
    :goto_5
    add-int/lit8 v13, v10, 0x1

    .line 118
    .line 119
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-lt v10, v8, :cond_7

    .line 124
    .line 125
    and-int/lit16 v10, v10, 0x1fff

    .line 126
    .line 127
    shl-int/2addr v10, v12

    .line 128
    or-int/2addr v9, v10

    .line 129
    add-int/lit8 v12, v12, 0xd

    .line 130
    .line 131
    move v10, v13

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    shl-int/2addr v10, v12

    .line 134
    or-int/2addr v9, v10

    .line 135
    move v10, v13

    .line 136
    :cond_8
    add-int/lit8 v12, v10, 0x1

    .line 137
    .line 138
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-lt v10, v8, :cond_a

    .line 143
    .line 144
    and-int/lit16 v10, v10, 0x1fff

    .line 145
    .line 146
    const/16 v13, 0xd

    .line 147
    .line 148
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 149
    .line 150
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-lt v12, v8, :cond_9

    .line 155
    .line 156
    and-int/lit16 v12, v12, 0x1fff

    .line 157
    .line 158
    shl-int/2addr v12, v13

    .line 159
    or-int/2addr v10, v12

    .line 160
    add-int/lit8 v13, v13, 0xd

    .line 161
    .line 162
    move v12, v14

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    shl-int/2addr v12, v13

    .line 165
    or-int/2addr v10, v12

    .line 166
    move v12, v14

    .line 167
    :cond_a
    add-int/lit8 v13, v12, 0x1

    .line 168
    .line 169
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-lt v12, v8, :cond_c

    .line 174
    .line 175
    and-int/lit16 v12, v12, 0x1fff

    .line 176
    .line 177
    const/16 v14, 0xd

    .line 178
    .line 179
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 180
    .line 181
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    if-lt v13, v8, :cond_b

    .line 186
    .line 187
    and-int/lit16 v13, v13, 0x1fff

    .line 188
    .line 189
    shl-int/2addr v13, v14

    .line 190
    or-int/2addr v12, v13

    .line 191
    add-int/lit8 v14, v14, 0xd

    .line 192
    .line 193
    move v13, v15

    .line 194
    goto :goto_7

    .line 195
    :cond_b
    shl-int/2addr v13, v14

    .line 196
    or-int/2addr v12, v13

    .line 197
    move v13, v15

    .line 198
    :cond_c
    add-int/lit8 v14, v13, 0x1

    .line 199
    .line 200
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-lt v13, v8, :cond_e

    .line 205
    .line 206
    and-int/lit16 v13, v13, 0x1fff

    .line 207
    .line 208
    const/16 v15, 0xd

    .line 209
    .line 210
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 211
    .line 212
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-lt v14, v8, :cond_d

    .line 217
    .line 218
    and-int/lit16 v14, v14, 0x1fff

    .line 219
    .line 220
    shl-int/2addr v14, v15

    .line 221
    or-int/2addr v13, v14

    .line 222
    add-int/lit8 v15, v15, 0xd

    .line 223
    .line 224
    move/from16 v14, v16

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_d
    shl-int/2addr v14, v15

    .line 228
    or-int/2addr v13, v14

    .line 229
    move/from16 v14, v16

    .line 230
    .line 231
    :cond_e
    add-int/lit8 v15, v14, 0x1

    .line 232
    .line 233
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    if-lt v14, v8, :cond_10

    .line 238
    .line 239
    and-int/lit16 v14, v14, 0x1fff

    .line 240
    .line 241
    const/16 v16, 0xd

    .line 242
    .line 243
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 244
    .line 245
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    if-lt v15, v8, :cond_f

    .line 250
    .line 251
    and-int/lit16 v15, v15, 0x1fff

    .line 252
    .line 253
    shl-int v15, v15, v16

    .line 254
    .line 255
    or-int/2addr v14, v15

    .line 256
    add-int/lit8 v16, v16, 0xd

    .line 257
    .line 258
    move/from16 v15, v17

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_f
    shl-int v15, v15, v16

    .line 262
    .line 263
    or-int/2addr v14, v15

    .line 264
    move/from16 v15, v17

    .line 265
    .line 266
    :cond_10
    add-int/lit8 v16, v15, 0x1

    .line 267
    .line 268
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 269
    .line 270
    .line 271
    move-result v15

    .line 272
    if-lt v15, v8, :cond_12

    .line 273
    .line 274
    and-int/lit16 v15, v15, 0x1fff

    .line 275
    .line 276
    move/from16 v17, v3

    .line 277
    .line 278
    move/from16 v3, v16

    .line 279
    .line 280
    const/16 v16, 0xd

    .line 281
    .line 282
    :goto_a
    add-int/lit8 v18, v3, 0x1

    .line 283
    .line 284
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-lt v3, v8, :cond_11

    .line 289
    .line 290
    and-int/lit16 v3, v3, 0x1fff

    .line 291
    .line 292
    shl-int v3, v3, v16

    .line 293
    .line 294
    or-int/2addr v15, v3

    .line 295
    add-int/lit8 v16, v16, 0xd

    .line 296
    .line 297
    move/from16 v3, v18

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_11
    shl-int v3, v3, v16

    .line 301
    .line 302
    or-int/2addr v15, v3

    .line 303
    move/from16 v3, v18

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_12
    move/from16 v17, v3

    .line 307
    .line 308
    move/from16 v3, v16

    .line 309
    .line 310
    :goto_b
    add-int/lit8 v16, v3, 0x1

    .line 311
    .line 312
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-lt v3, v8, :cond_14

    .line 317
    .line 318
    and-int/lit16 v3, v3, 0x1fff

    .line 319
    .line 320
    move/from16 v4, v16

    .line 321
    .line 322
    const/16 v16, 0xd

    .line 323
    .line 324
    :goto_c
    add-int/lit8 v19, v4, 0x1

    .line 325
    .line 326
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-lt v4, v8, :cond_13

    .line 331
    .line 332
    and-int/lit16 v4, v4, 0x1fff

    .line 333
    .line 334
    shl-int v4, v4, v16

    .line 335
    .line 336
    or-int/2addr v3, v4

    .line 337
    add-int/lit8 v16, v16, 0xd

    .line 338
    .line 339
    move/from16 v4, v19

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_13
    shl-int v4, v4, v16

    .line 343
    .line 344
    or-int/2addr v3, v4

    .line 345
    move/from16 v4, v19

    .line 346
    .line 347
    goto :goto_d

    .line 348
    :cond_14
    move/from16 v4, v16

    .line 349
    .line 350
    :goto_d
    add-int/lit8 v16, v4, 0x1

    .line 351
    .line 352
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-lt v4, v8, :cond_16

    .line 357
    .line 358
    and-int/lit16 v4, v4, 0x1fff

    .line 359
    .line 360
    move/from16 v7, v16

    .line 361
    .line 362
    const/16 v16, 0xd

    .line 363
    .line 364
    :goto_e
    add-int/lit8 v20, v7, 0x1

    .line 365
    .line 366
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    if-lt v7, v8, :cond_15

    .line 371
    .line 372
    and-int/lit16 v7, v7, 0x1fff

    .line 373
    .line 374
    shl-int v7, v7, v16

    .line 375
    .line 376
    or-int/2addr v4, v7

    .line 377
    add-int/lit8 v16, v16, 0xd

    .line 378
    .line 379
    move/from16 v7, v20

    .line 380
    .line 381
    goto :goto_e

    .line 382
    :cond_15
    shl-int v7, v7, v16

    .line 383
    .line 384
    or-int/2addr v4, v7

    .line 385
    move/from16 v16, v20

    .line 386
    .line 387
    :cond_16
    add-int v7, v4, v15

    .line 388
    .line 389
    add-int/2addr v7, v3

    .line 390
    new-array v3, v7, [I

    .line 391
    .line 392
    mul-int/lit8 v7, v9, 0x2

    .line 393
    .line 394
    add-int/2addr v7, v10

    .line 395
    move v10, v12

    .line 396
    move-object v12, v3

    .line 397
    move v3, v10

    .line 398
    move v10, v13

    .line 399
    move v13, v4

    .line 400
    move v4, v9

    .line 401
    move/from16 v9, v16

    .line 402
    .line 403
    :goto_f
    sget-object v2, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 404
    .line 405
    iget-object v8, v0, Landroidx/datastore/preferences/protobuf/a0;->a:Landroidx/datastore/preferences/protobuf/v;

    .line 406
    .line 407
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    move/from16 v21, v3

    .line 412
    .line 413
    mul-int/lit8 v3, v14, 0x3

    .line 414
    .line 415
    new-array v3, v3, [I

    .line 416
    .line 417
    mul-int/lit8 v14, v14, 0x2

    .line 418
    .line 419
    new-array v14, v14, [Ljava/lang/Object;

    .line 420
    .line 421
    add-int/2addr v15, v13

    .line 422
    move/from16 v24, v13

    .line 423
    .line 424
    move/from16 v25, v15

    .line 425
    .line 426
    const/16 v22, 0x0

    .line 427
    .line 428
    const/16 v23, 0x0

    .line 429
    .line 430
    :goto_10
    if-ge v9, v5, :cond_34

    .line 431
    .line 432
    add-int/lit8 v26, v9, 0x1

    .line 433
    .line 434
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    move-object/from16 v27, v3

    .line 439
    .line 440
    const v3, 0xd800

    .line 441
    .line 442
    .line 443
    if-lt v9, v3, :cond_18

    .line 444
    .line 445
    and-int/lit16 v9, v9, 0x1fff

    .line 446
    .line 447
    move/from16 v3, v26

    .line 448
    .line 449
    const/16 v26, 0xd

    .line 450
    .line 451
    :goto_11
    add-int/lit8 v28, v3, 0x1

    .line 452
    .line 453
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    move/from16 v29, v4

    .line 458
    .line 459
    const v4, 0xd800

    .line 460
    .line 461
    .line 462
    if-lt v3, v4, :cond_17

    .line 463
    .line 464
    and-int/lit16 v3, v3, 0x1fff

    .line 465
    .line 466
    shl-int v3, v3, v26

    .line 467
    .line 468
    or-int/2addr v9, v3

    .line 469
    add-int/lit8 v26, v26, 0xd

    .line 470
    .line 471
    move/from16 v3, v28

    .line 472
    .line 473
    move/from16 v4, v29

    .line 474
    .line 475
    goto :goto_11

    .line 476
    :cond_17
    shl-int v3, v3, v26

    .line 477
    .line 478
    or-int/2addr v9, v3

    .line 479
    move/from16 v3, v28

    .line 480
    .line 481
    goto :goto_12

    .line 482
    :cond_18
    move/from16 v29, v4

    .line 483
    .line 484
    move/from16 v3, v26

    .line 485
    .line 486
    :goto_12
    add-int/lit8 v4, v3, 0x1

    .line 487
    .line 488
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    move/from16 v26, v4

    .line 493
    .line 494
    const v4, 0xd800

    .line 495
    .line 496
    .line 497
    if-lt v3, v4, :cond_1a

    .line 498
    .line 499
    and-int/lit16 v3, v3, 0x1fff

    .line 500
    .line 501
    move/from16 v4, v26

    .line 502
    .line 503
    const/16 v26, 0xd

    .line 504
    .line 505
    :goto_13
    add-int/lit8 v28, v4, 0x1

    .line 506
    .line 507
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    move/from16 v30, v3

    .line 512
    .line 513
    const v3, 0xd800

    .line 514
    .line 515
    .line 516
    if-lt v4, v3, :cond_19

    .line 517
    .line 518
    and-int/lit16 v3, v4, 0x1fff

    .line 519
    .line 520
    shl-int v3, v3, v26

    .line 521
    .line 522
    or-int v3, v30, v3

    .line 523
    .line 524
    add-int/lit8 v26, v26, 0xd

    .line 525
    .line 526
    move/from16 v4, v28

    .line 527
    .line 528
    goto :goto_13

    .line 529
    :cond_19
    shl-int v3, v4, v26

    .line 530
    .line 531
    or-int v3, v30, v3

    .line 532
    .line 533
    move/from16 v4, v28

    .line 534
    .line 535
    goto :goto_14

    .line 536
    :cond_1a
    move/from16 v4, v26

    .line 537
    .line 538
    :goto_14
    move/from16 v26, v5

    .line 539
    .line 540
    and-int/lit16 v5, v3, 0xff

    .line 541
    .line 542
    move/from16 v28, v6

    .line 543
    .line 544
    and-int/lit16 v6, v3, 0x400

    .line 545
    .line 546
    if-eqz v6, :cond_1b

    .line 547
    .line 548
    add-int/lit8 v6, v22, 0x1

    .line 549
    .line 550
    aput v23, v12, v22

    .line 551
    .line 552
    move/from16 v22, v6

    .line 553
    .line 554
    :cond_1b
    iget-object v6, v0, Landroidx/datastore/preferences/protobuf/a0;->c:[Ljava/lang/Object;

    .line 555
    .line 556
    move-object/from16 v30, v6

    .line 557
    .line 558
    const/16 v6, 0x33

    .line 559
    .line 560
    if-lt v5, v6, :cond_23

    .line 561
    .line 562
    add-int/lit8 v6, v4, 0x1

    .line 563
    .line 564
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    move/from16 v31, v6

    .line 569
    .line 570
    const v6, 0xd800

    .line 571
    .line 572
    .line 573
    if-lt v4, v6, :cond_1d

    .line 574
    .line 575
    and-int/lit16 v4, v4, 0x1fff

    .line 576
    .line 577
    move/from16 v6, v31

    .line 578
    .line 579
    const/16 v31, 0xd

    .line 580
    .line 581
    :goto_15
    add-int/lit8 v34, v6, 0x1

    .line 582
    .line 583
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    move/from16 v35, v4

    .line 588
    .line 589
    const v4, 0xd800

    .line 590
    .line 591
    .line 592
    if-lt v6, v4, :cond_1c

    .line 593
    .line 594
    and-int/lit16 v4, v6, 0x1fff

    .line 595
    .line 596
    shl-int v4, v4, v31

    .line 597
    .line 598
    or-int v4, v35, v4

    .line 599
    .line 600
    add-int/lit8 v31, v31, 0xd

    .line 601
    .line 602
    move/from16 v6, v34

    .line 603
    .line 604
    goto :goto_15

    .line 605
    :cond_1c
    shl-int v4, v6, v31

    .line 606
    .line 607
    or-int v4, v35, v4

    .line 608
    .line 609
    move/from16 v6, v34

    .line 610
    .line 611
    goto :goto_16

    .line 612
    :cond_1d
    move/from16 v6, v31

    .line 613
    .line 614
    :goto_16
    move/from16 v31, v4

    .line 615
    .line 616
    add-int/lit8 v4, v5, -0x33

    .line 617
    .line 618
    move/from16 v34, v6

    .line 619
    .line 620
    const/16 v6, 0x9

    .line 621
    .line 622
    if-eq v4, v6, :cond_1f

    .line 623
    .line 624
    const/16 v6, 0x11

    .line 625
    .line 626
    if-ne v4, v6, :cond_1e

    .line 627
    .line 628
    goto :goto_18

    .line 629
    :cond_1e
    const/16 v6, 0xc

    .line 630
    .line 631
    if-ne v4, v6, :cond_20

    .line 632
    .line 633
    and-int/lit8 v4, v28, 0x1

    .line 634
    .line 635
    const/4 v6, 0x1

    .line 636
    if-ne v4, v6, :cond_20

    .line 637
    .line 638
    div-int/lit8 v4, v23, 0x3

    .line 639
    .line 640
    mul-int/lit8 v4, v4, 0x2

    .line 641
    .line 642
    add-int/2addr v4, v6

    .line 643
    add-int/lit8 v6, v7, 0x1

    .line 644
    .line 645
    aget-object v7, v30, v7

    .line 646
    .line 647
    aput-object v7, v14, v4

    .line 648
    .line 649
    :goto_17
    move v7, v6

    .line 650
    goto :goto_19

    .line 651
    :cond_1f
    :goto_18
    div-int/lit8 v4, v23, 0x3

    .line 652
    .line 653
    mul-int/lit8 v4, v4, 0x2

    .line 654
    .line 655
    const/16 v16, 0x1

    .line 656
    .line 657
    add-int/lit8 v4, v4, 0x1

    .line 658
    .line 659
    add-int/lit8 v6, v7, 0x1

    .line 660
    .line 661
    aget-object v7, v30, v7

    .line 662
    .line 663
    aput-object v7, v14, v4

    .line 664
    .line 665
    goto :goto_17

    .line 666
    :cond_20
    :goto_19
    mul-int/lit8 v4, v31, 0x2

    .line 667
    .line 668
    aget-object v6, v30, v4

    .line 669
    .line 670
    move/from16 v31, v4

    .line 671
    .line 672
    instance-of v4, v6, Ljava/lang/reflect/Field;

    .line 673
    .line 674
    if-eqz v4, :cond_21

    .line 675
    .line 676
    check-cast v6, Ljava/lang/reflect/Field;

    .line 677
    .line 678
    :goto_1a
    move v4, v7

    .line 679
    goto :goto_1b

    .line 680
    :cond_21
    check-cast v6, Ljava/lang/String;

    .line 681
    .line 682
    invoke-static {v8, v6}, Landroidx/datastore/preferences/protobuf/S;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    aput-object v6, v30, v31

    .line 687
    .line 688
    goto :goto_1a

    .line 689
    :goto_1b
    invoke-virtual {v2, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 690
    .line 691
    .line 692
    move-result-wide v6

    .line 693
    long-to-int v6, v6

    .line 694
    add-int/lit8 v7, v31, 0x1

    .line 695
    .line 696
    move/from16 v31, v4

    .line 697
    .line 698
    aget-object v4, v30, v7

    .line 699
    .line 700
    move/from16 v32, v6

    .line 701
    .line 702
    instance-of v6, v4, Ljava/lang/reflect/Field;

    .line 703
    .line 704
    if-eqz v6, :cond_22

    .line 705
    .line 706
    check-cast v4, Ljava/lang/reflect/Field;

    .line 707
    .line 708
    goto :goto_1c

    .line 709
    :cond_22
    check-cast v4, Ljava/lang/String;

    .line 710
    .line 711
    invoke-static {v8, v4}, Landroidx/datastore/preferences/protobuf/S;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    aput-object v4, v30, v7

    .line 716
    .line 717
    :goto_1c
    invoke-virtual {v2, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 718
    .line 719
    .line 720
    move-result-wide v6

    .line 721
    long-to-int v4, v6

    .line 722
    move/from16 v6, v32

    .line 723
    .line 724
    move/from16 v32, v9

    .line 725
    .line 726
    move v9, v6

    .line 727
    move v6, v4

    .line 728
    move/from16 v7, v31

    .line 729
    .line 730
    move/from16 v33, v34

    .line 731
    .line 732
    const/4 v4, 0x0

    .line 733
    goto/16 :goto_28

    .line 734
    .line 735
    :cond_23
    add-int/lit8 v6, v7, 0x1

    .line 736
    .line 737
    aget-object v31, v30, v7

    .line 738
    .line 739
    move/from16 v34, v6

    .line 740
    .line 741
    move-object/from16 v6, v31

    .line 742
    .line 743
    check-cast v6, Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {v8, v6}, Landroidx/datastore/preferences/protobuf/S;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    move/from16 v31, v7

    .line 750
    .line 751
    const/16 v7, 0x9

    .line 752
    .line 753
    if-eq v5, v7, :cond_24

    .line 754
    .line 755
    const/16 v7, 0x11

    .line 756
    .line 757
    if-ne v5, v7, :cond_25

    .line 758
    .line 759
    :cond_24
    move/from16 v32, v9

    .line 760
    .line 761
    const/4 v9, 0x1

    .line 762
    goto/16 :goto_20

    .line 763
    .line 764
    :cond_25
    const/16 v7, 0x1b

    .line 765
    .line 766
    if-eq v5, v7, :cond_26

    .line 767
    .line 768
    const/16 v7, 0x31

    .line 769
    .line 770
    if-ne v5, v7, :cond_27

    .line 771
    .line 772
    :cond_26
    move/from16 v32, v9

    .line 773
    .line 774
    const/4 v9, 0x1

    .line 775
    goto :goto_1f

    .line 776
    :cond_27
    const/16 v7, 0xc

    .line 777
    .line 778
    if-eq v5, v7, :cond_2b

    .line 779
    .line 780
    const/16 v7, 0x1e

    .line 781
    .line 782
    if-eq v5, v7, :cond_2b

    .line 783
    .line 784
    const/16 v7, 0x2c

    .line 785
    .line 786
    if-ne v5, v7, :cond_28

    .line 787
    .line 788
    goto :goto_1e

    .line 789
    :cond_28
    const/16 v7, 0x32

    .line 790
    .line 791
    if-ne v5, v7, :cond_2a

    .line 792
    .line 793
    add-int/lit8 v7, v24, 0x1

    .line 794
    .line 795
    aput v23, v12, v24

    .line 796
    .line 797
    div-int/lit8 v24, v23, 0x3

    .line 798
    .line 799
    mul-int/lit8 v24, v24, 0x2

    .line 800
    .line 801
    add-int/lit8 v32, v31, 0x2

    .line 802
    .line 803
    aget-object v33, v30, v34

    .line 804
    .line 805
    aput-object v33, v14, v24

    .line 806
    .line 807
    move/from16 v33, v7

    .line 808
    .line 809
    and-int/lit16 v7, v3, 0x800

    .line 810
    .line 811
    if-eqz v7, :cond_29

    .line 812
    .line 813
    add-int/lit8 v24, v24, 0x1

    .line 814
    .line 815
    add-int/lit8 v7, v31, 0x3

    .line 816
    .line 817
    aget-object v31, v30, v32

    .line 818
    .line 819
    aput-object v31, v14, v24

    .line 820
    .line 821
    move/from16 v16, v7

    .line 822
    .line 823
    move/from16 v32, v9

    .line 824
    .line 825
    move/from16 v24, v33

    .line 826
    .line 827
    :goto_1d
    const/4 v9, 0x1

    .line 828
    goto :goto_22

    .line 829
    :cond_29
    move/from16 v16, v32

    .line 830
    .line 831
    move/from16 v24, v33

    .line 832
    .line 833
    move/from16 v32, v9

    .line 834
    .line 835
    goto :goto_1d

    .line 836
    :cond_2a
    move/from16 v32, v9

    .line 837
    .line 838
    const/4 v9, 0x1

    .line 839
    goto :goto_21

    .line 840
    :cond_2b
    :goto_1e
    and-int/lit8 v7, v28, 0x1

    .line 841
    .line 842
    move/from16 v32, v9

    .line 843
    .line 844
    const/4 v9, 0x1

    .line 845
    if-ne v7, v9, :cond_2c

    .line 846
    .line 847
    div-int/lit8 v7, v23, 0x3

    .line 848
    .line 849
    mul-int/lit8 v7, v7, 0x2

    .line 850
    .line 851
    add-int/2addr v7, v9

    .line 852
    add-int/lit8 v16, v31, 0x2

    .line 853
    .line 854
    aget-object v31, v30, v34

    .line 855
    .line 856
    aput-object v31, v14, v7

    .line 857
    .line 858
    goto :goto_22

    .line 859
    :goto_1f
    div-int/lit8 v7, v23, 0x3

    .line 860
    .line 861
    mul-int/lit8 v7, v7, 0x2

    .line 862
    .line 863
    add-int/2addr v7, v9

    .line 864
    add-int/lit8 v16, v31, 0x2

    .line 865
    .line 866
    aget-object v31, v30, v34

    .line 867
    .line 868
    aput-object v31, v14, v7

    .line 869
    .line 870
    goto :goto_22

    .line 871
    :goto_20
    div-int/lit8 v7, v23, 0x3

    .line 872
    .line 873
    mul-int/lit8 v7, v7, 0x2

    .line 874
    .line 875
    add-int/2addr v7, v9

    .line 876
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    move-result-object v16

    .line 880
    aput-object v16, v14, v7

    .line 881
    .line 882
    :cond_2c
    :goto_21
    move/from16 v16, v34

    .line 883
    .line 884
    :goto_22
    invoke-virtual {v2, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 885
    .line 886
    .line 887
    move-result-wide v6

    .line 888
    long-to-int v6, v6

    .line 889
    and-int/lit8 v7, v28, 0x1

    .line 890
    .line 891
    if-ne v7, v9, :cond_30

    .line 892
    .line 893
    const/16 v7, 0x11

    .line 894
    .line 895
    if-gt v5, v7, :cond_30

    .line 896
    .line 897
    add-int/lit8 v7, v4, 0x1

    .line 898
    .line 899
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    const v9, 0xd800

    .line 904
    .line 905
    .line 906
    if-lt v4, v9, :cond_2e

    .line 907
    .line 908
    and-int/lit16 v4, v4, 0x1fff

    .line 909
    .line 910
    const/16 v20, 0xd

    .line 911
    .line 912
    :goto_23
    add-int/lit8 v33, v7, 0x1

    .line 913
    .line 914
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 915
    .line 916
    .line 917
    move-result v7

    .line 918
    if-lt v7, v9, :cond_2d

    .line 919
    .line 920
    and-int/lit16 v7, v7, 0x1fff

    .line 921
    .line 922
    shl-int v7, v7, v20

    .line 923
    .line 924
    or-int/2addr v4, v7

    .line 925
    add-int/lit8 v20, v20, 0xd

    .line 926
    .line 927
    move/from16 v7, v33

    .line 928
    .line 929
    goto :goto_23

    .line 930
    :cond_2d
    shl-int v7, v7, v20

    .line 931
    .line 932
    or-int/2addr v4, v7

    .line 933
    goto :goto_24

    .line 934
    :cond_2e
    move/from16 v33, v7

    .line 935
    .line 936
    :goto_24
    mul-int/lit8 v7, v29, 0x2

    .line 937
    .line 938
    div-int/lit8 v20, v4, 0x20

    .line 939
    .line 940
    add-int v20, v20, v7

    .line 941
    .line 942
    aget-object v7, v30, v20

    .line 943
    .line 944
    instance-of v9, v7, Ljava/lang/reflect/Field;

    .line 945
    .line 946
    if-eqz v9, :cond_2f

    .line 947
    .line 948
    check-cast v7, Ljava/lang/reflect/Field;

    .line 949
    .line 950
    :goto_25
    move v9, v6

    .line 951
    goto :goto_26

    .line 952
    :cond_2f
    check-cast v7, Ljava/lang/String;

    .line 953
    .line 954
    invoke-static {v8, v7}, Landroidx/datastore/preferences/protobuf/S;->G(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    aput-object v7, v30, v20

    .line 959
    .line 960
    goto :goto_25

    .line 961
    :goto_26
    invoke-virtual {v2, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 962
    .line 963
    .line 964
    move-result-wide v6

    .line 965
    long-to-int v6, v6

    .line 966
    rem-int/lit8 v4, v4, 0x20

    .line 967
    .line 968
    goto :goto_27

    .line 969
    :cond_30
    move v9, v6

    .line 970
    move/from16 v33, v4

    .line 971
    .line 972
    const/4 v4, 0x0

    .line 973
    const/4 v6, 0x0

    .line 974
    :goto_27
    const/16 v7, 0x12

    .line 975
    .line 976
    if-lt v5, v7, :cond_31

    .line 977
    .line 978
    const/16 v7, 0x31

    .line 979
    .line 980
    if-gt v5, v7, :cond_31

    .line 981
    .line 982
    add-int/lit8 v7, v25, 0x1

    .line 983
    .line 984
    aput v9, v12, v25

    .line 985
    .line 986
    move/from16 v25, v7

    .line 987
    .line 988
    :cond_31
    move/from16 v7, v16

    .line 989
    .line 990
    :goto_28
    add-int/lit8 v16, v23, 0x1

    .line 991
    .line 992
    aput v32, v27, v23

    .line 993
    .line 994
    add-int/lit8 v20, v23, 0x2

    .line 995
    .line 996
    move-object/from16 v30, v1

    .line 997
    .line 998
    and-int/lit16 v1, v3, 0x200

    .line 999
    .line 1000
    if-eqz v1, :cond_32

    .line 1001
    .line 1002
    const/high16 v1, 0x20000000

    .line 1003
    .line 1004
    goto :goto_29

    .line 1005
    :cond_32
    const/4 v1, 0x0

    .line 1006
    :goto_29
    and-int/lit16 v3, v3, 0x100

    .line 1007
    .line 1008
    if-eqz v3, :cond_33

    .line 1009
    .line 1010
    const/high16 v3, 0x10000000

    .line 1011
    .line 1012
    goto :goto_2a

    .line 1013
    :cond_33
    const/4 v3, 0x0

    .line 1014
    :goto_2a
    or-int/2addr v1, v3

    .line 1015
    shl-int/lit8 v3, v5, 0x14

    .line 1016
    .line 1017
    or-int/2addr v1, v3

    .line 1018
    or-int/2addr v1, v9

    .line 1019
    aput v1, v27, v16

    .line 1020
    .line 1021
    add-int/lit8 v23, v23, 0x3

    .line 1022
    .line 1023
    shl-int/lit8 v1, v4, 0x14

    .line 1024
    .line 1025
    or-int/2addr v1, v6

    .line 1026
    aput v1, v27, v20

    .line 1027
    .line 1028
    move/from16 v5, v26

    .line 1029
    .line 1030
    move-object/from16 v3, v27

    .line 1031
    .line 1032
    move/from16 v6, v28

    .line 1033
    .line 1034
    move/from16 v4, v29

    .line 1035
    .line 1036
    move-object/from16 v1, v30

    .line 1037
    .line 1038
    move/from16 v9, v33

    .line 1039
    .line 1040
    goto/16 :goto_10

    .line 1041
    .line 1042
    :cond_34
    move-object/from16 v27, v3

    .line 1043
    .line 1044
    new-instance v5, Landroidx/datastore/preferences/protobuf/S;

    .line 1045
    .line 1046
    iget-object v0, v0, Landroidx/datastore/preferences/protobuf/a0;->a:Landroidx/datastore/preferences/protobuf/v;

    .line 1047
    .line 1048
    move-object/from16 v16, p2

    .line 1049
    .line 1050
    move-object/from16 v17, p3

    .line 1051
    .line 1052
    move-object/from16 v18, p4

    .line 1053
    .line 1054
    move-object/from16 v19, p5

    .line 1055
    .line 1056
    move v9, v10

    .line 1057
    move-object v7, v14

    .line 1058
    move v14, v15

    .line 1059
    move/from16 v8, v21

    .line 1060
    .line 1061
    move-object/from16 v6, v27

    .line 1062
    .line 1063
    move-object/from16 v15, p1

    .line 1064
    .line 1065
    move-object v10, v0

    .line 1066
    invoke-direct/range {v5 .. v19}, Landroidx/datastore/preferences/protobuf/S;-><init>([I[Ljava/lang/Object;IILandroidx/datastore/preferences/protobuf/v;Z[IIILandroidx/datastore/preferences/protobuf/U;Landroidx/datastore/preferences/protobuf/G;Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/N;)V

    .line 1067
    .line 1068
    .line 1069
    return-object v5
.end method

.method public static y(I)J
    .locals 2

    .line 1
    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static z(JLjava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final B(I)I
    .locals 7

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/S;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-lt p1, v0, :cond_2

    .line 5
    .line 6
    iget v0, p0, Landroidx/datastore/preferences/protobuf/S;->d:I

    .line 7
    .line 8
    if-gt p1, v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 11
    .line 12
    array-length v2, v0

    .line 13
    div-int/lit8 v2, v2, 0x3

    .line 14
    .line 15
    add-int/lit8 v2, v2, -0x1

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-gt v3, v2, :cond_2

    .line 19
    .line 20
    add-int v4, v2, v3

    .line 21
    .line 22
    ushr-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    mul-int/lit8 v5, v4, 0x3

    .line 25
    .line 26
    aget v6, v0, v5

    .line 27
    .line 28
    if-ne p1, v6, :cond_0

    .line 29
    .line 30
    return v5

    .line 31
    :cond_0
    if-ge p1, v6, :cond_1

    .line 32
    .line 33
    add-int/lit8 v4, v4, -0x1

    .line 34
    .line 35
    move v2, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    move v3, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v1
.end method

.method public final C(Ljava/lang/Object;JLG4/f;Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p3, p1}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p2, p4, LG4/f;->a:I

    .line 8
    .line 9
    and-int/lit8 p3, p2, 0x7

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-ne p3, v0, :cond_3

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p4, p5, p6}, LG4/f;->w(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p3, p4, LG4/f;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p3, Landroidx/datastore/preferences/protobuf/h;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/h;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget v0, p4, LG4/f;->c:I

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/h;->z()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eq p3, p2, :cond_0

    .line 41
    .line 42
    iput p3, p4, LG4/f;->c:I

    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void

    .line 45
    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->b()Landroidx/datastore/preferences/protobuf/z;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    throw p1
.end method

.method public final D(Ljava/lang/Object;ILG4/f;Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)V
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p2, v0

    .line 5
    int-to-long v0, p2

    .line 6
    iget-object p2, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 7
    .line 8
    invoke-virtual {p2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget p2, p3, LG4/f;->a:I

    .line 13
    .line 14
    and-int/lit8 v0, p2, 0x7

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne v0, v1, :cond_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p3, p4, p5}, LG4/f;->C(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p3, LG4/f;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroidx/datastore/preferences/protobuf/h;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/h;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    iget v1, p3, LG4/f;->c:I

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/h;->z()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eq v0, p2, :cond_0

    .line 46
    .line 47
    iput v0, p3, LG4/f;->c:I

    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void

    .line 50
    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->b()Landroidx/datastore/preferences/protobuf/z;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1
.end method

.method public final E(Ljava/lang/Object;ILG4/f;)V
    .locals 2

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p2

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const v1, 0xfffff

    .line 10
    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    and-int/2addr p2, v1

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-virtual {p3}, LG4/f;->O()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/S;->f:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    and-int/2addr p2, v1

    .line 29
    int-to-long v0, p2

    .line 30
    invoke-virtual {p3}, LG4/f;->M()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    and-int/2addr p2, v1

    .line 39
    int-to-long v0, p2

    .line 40
    invoke-virtual {p3}, LG4/f;->j()Landroidx/datastore/preferences/protobuf/g;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final F(Ljava/lang/Object;ILG4/f;)V
    .locals 3

    .line 1
    const/high16 v0, 0x20000000

    .line 2
    .line 3
    and-int/2addr v0, p2

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const v1, 0xfffff

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    and-int/2addr p2, v1

    .line 17
    int-to-long v0, p2

    .line 18
    invoke-virtual {v2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {p3, p1, p2}, LG4/f;->N(Ljava/util/List;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    and-int/2addr p2, v1

    .line 28
    int-to-long v0, p2

    .line 29
    invoke-virtual {v2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-virtual {p3, p1, p2}, LG4/f;->N(Ljava/util/List;Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final H(ILjava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    add-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 9
    .line 10
    aget p1, v0, p1

    .line 11
    .line 12
    ushr-int/lit8 v0, p1, 0x14

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    shl-int v0, v1, v0

    .line 16
    .line 17
    const v1, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr p1, v1

    .line 21
    int-to-long v1, p1

    .line 22
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 23
    .line 24
    invoke-virtual {p1, v1, v2, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    or-int/2addr p1, v0

    .line 29
    invoke-static {v1, v2, p2, p1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final I(IILjava/lang/Object;)V
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 4
    .line 5
    aget p2, v0, p2

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p2, v0

    .line 11
    int-to-long v0, p2

    .line 12
    invoke-static {v0, v1, p3, p1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final K(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public final L(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    sget-object v5, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 11
    .line 12
    const/4 v7, -0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    :goto_0
    if-ge v8, v4, :cond_4

    .line 16
    .line 17
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    aget v11, v3, v8

    .line 22
    .line 23
    invoke-static {v10}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 24
    .line 25
    .line 26
    move-result v12

    .line 27
    const/4 v13, 0x1

    .line 28
    iget-boolean v14, v0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 29
    .line 30
    if-nez v14, :cond_1

    .line 31
    .line 32
    const/16 v14, 0x11

    .line 33
    .line 34
    if-gt v12, v14, :cond_1

    .line 35
    .line 36
    add-int/lit8 v14, v8, 0x2

    .line 37
    .line 38
    aget v14, v3, v14

    .line 39
    .line 40
    const v16, 0xfffff

    .line 41
    .line 42
    .line 43
    and-int v15, v14, v16

    .line 44
    .line 45
    if-eq v15, v7, :cond_0

    .line 46
    .line 47
    int-to-long v6, v15

    .line 48
    invoke-virtual {v5, v1, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    move v7, v15

    .line 53
    :cond_0
    ushr-int/lit8 v6, v14, 0x14

    .line 54
    .line 55
    shl-int v6, v13, v6

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const v16, 0xfffff

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    :goto_1
    and-int v10, v10, v16

    .line 63
    .line 64
    int-to-long v14, v10

    .line 65
    const/16 v10, 0x3f

    .line 66
    .line 67
    packed-switch v12, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_2
    const/4 v12, 0x0

    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :pswitch_0
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v2, v11, v6, v10}, Landroidx/datastore/preferences/protobuf/J;->b(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_1
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    shl-long v12, v14, v13

    .line 102
    .line 103
    shr-long/2addr v14, v10

    .line 104
    xor-long/2addr v12, v14

    .line 105
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 108
    .line 109
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :pswitch_2
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_2

    .line 118
    .line 119
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    shl-int/lit8 v10, v6, 0x1

    .line 124
    .line 125
    shr-int/lit8 v6, v6, 0x1f

    .line 126
    .line 127
    xor-int/2addr v6, v10

    .line 128
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 131
    .line 132
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :pswitch_3
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_2

    .line 141
    .line 142
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v12

    .line 146
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 149
    .line 150
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :pswitch_4
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_2

    .line 159
    .line 160
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 167
    .line 168
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :pswitch_5
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_2

    .line 177
    .line 178
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 185
    .line 186
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :pswitch_6
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_2

    .line 195
    .line 196
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 203
    .line 204
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    :pswitch_7
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_2

    .line 214
    .line 215
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    check-cast v6, Landroidx/datastore/preferences/protobuf/g;

    .line 220
    .line 221
    invoke-virtual {v2, v11, v6}, Landroidx/datastore/preferences/protobuf/J;->a(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_2

    .line 225
    .line 226
    :pswitch_8
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_2

    .line 231
    .line 232
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    iget-object v12, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v12, Landroidx/datastore/preferences/protobuf/j;

    .line 243
    .line 244
    check-cast v6, Landroidx/datastore/preferences/protobuf/a;

    .line 245
    .line 246
    invoke-virtual {v12, v11, v6, v10}, Landroidx/datastore/preferences/protobuf/j;->O(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_2

    .line 250
    .line 251
    :pswitch_9
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_2

    .line 256
    .line 257
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-static {v11, v6, v2}, Landroidx/datastore/preferences/protobuf/S;->N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :pswitch_a
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-eqz v6, :cond_2

    .line 271
    .line 272
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 273
    .line 274
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    check-cast v6, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 287
    .line 288
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->F(IZ)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :pswitch_b
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    if-eqz v6, :cond_2

    .line 298
    .line 299
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 306
    .line 307
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :pswitch_c
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-eqz v6, :cond_2

    .line 317
    .line 318
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 319
    .line 320
    .line 321
    move-result-wide v12

    .line 322
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 325
    .line 326
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :pswitch_d
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-eqz v6, :cond_2

    .line 336
    .line 337
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 344
    .line 345
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_2

    .line 349
    .line 350
    :pswitch_e
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-eqz v6, :cond_2

    .line 355
    .line 356
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 357
    .line 358
    .line 359
    move-result-wide v12

    .line 360
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 363
    .line 364
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_2

    .line 368
    .line 369
    :pswitch_f
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    if-eqz v6, :cond_2

    .line 374
    .line 375
    invoke-static {v14, v15, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 376
    .line 377
    .line 378
    move-result-wide v12

    .line 379
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 382
    .line 383
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_2

    .line 387
    .line 388
    :pswitch_10
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-eqz v6, :cond_2

    .line 393
    .line 394
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 395
    .line 396
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    check-cast v6, Ljava/lang/Float;

    .line 401
    .line 402
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 409
    .line 410
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 418
    .line 419
    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :pswitch_11
    invoke-virtual {v0, v11, v8, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-eqz v6, :cond_2

    .line 427
    .line 428
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 429
    .line 430
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    check-cast v6, Ljava/lang/Double;

    .line 435
    .line 436
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 437
    .line 438
    .line 439
    move-result-wide v12

    .line 440
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 443
    .line 444
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-static {v12, v13}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 448
    .line 449
    .line 450
    move-result-wide v12

    .line 451
    invoke-virtual {v6, v11, v12, v13}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_2

    .line 455
    .line 456
    :pswitch_12
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    invoke-virtual {v0, v2, v11, v6, v8}, Landroidx/datastore/preferences/protobuf/S;->M(Landroidx/datastore/preferences/protobuf/J;ILjava/lang/Object;I)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_2

    .line 464
    .line 465
    :pswitch_13
    aget v6, v3, v8

    .line 466
    .line 467
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    check-cast v10, Ljava/util/List;

    .line 472
    .line 473
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 474
    .line 475
    .line 476
    move-result-object v11

    .line 477
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->G(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_2

    .line 481
    .line 482
    :pswitch_14
    aget v6, v3, v8

    .line 483
    .line 484
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    check-cast v10, Ljava/util/List;

    .line 489
    .line 490
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_2

    .line 494
    .line 495
    :pswitch_15
    aget v6, v3, v8

    .line 496
    .line 497
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v10

    .line 501
    check-cast v10, Ljava/util/List;

    .line 502
    .line 503
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->M(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_2

    .line 507
    .line 508
    :pswitch_16
    aget v6, v3, v8

    .line 509
    .line 510
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    check-cast v10, Ljava/util/List;

    .line 515
    .line 516
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 517
    .line 518
    .line 519
    goto/16 :goto_2

    .line 520
    .line 521
    :pswitch_17
    aget v6, v3, v8

    .line 522
    .line 523
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    check-cast v10, Ljava/util/List;

    .line 528
    .line 529
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_2

    .line 533
    .line 534
    :pswitch_18
    aget v6, v3, v8

    .line 535
    .line 536
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v10

    .line 540
    check-cast v10, Ljava/util/List;

    .line 541
    .line 542
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_2

    .line 546
    .line 547
    :pswitch_19
    aget v6, v3, v8

    .line 548
    .line 549
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v10

    .line 553
    check-cast v10, Ljava/util/List;

    .line 554
    .line 555
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 556
    .line 557
    .line 558
    goto/16 :goto_2

    .line 559
    .line 560
    :pswitch_1a
    aget v6, v3, v8

    .line 561
    .line 562
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v10

    .line 566
    check-cast v10, Ljava/util/List;

    .line 567
    .line 568
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->z(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 569
    .line 570
    .line 571
    goto/16 :goto_2

    .line 572
    .line 573
    :pswitch_1b
    aget v6, v3, v8

    .line 574
    .line 575
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v10

    .line 579
    check-cast v10, Ljava/util/List;

    .line 580
    .line 581
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->D(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 582
    .line 583
    .line 584
    goto/16 :goto_2

    .line 585
    .line 586
    :pswitch_1c
    aget v6, v3, v8

    .line 587
    .line 588
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v10

    .line 592
    check-cast v10, Ljava/util/List;

    .line 593
    .line 594
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_2

    .line 598
    .line 599
    :pswitch_1d
    aget v6, v3, v8

    .line 600
    .line 601
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v10

    .line 605
    check-cast v10, Ljava/util/List;

    .line 606
    .line 607
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 608
    .line 609
    .line 610
    goto/16 :goto_2

    .line 611
    .line 612
    :pswitch_1e
    aget v6, v3, v8

    .line 613
    .line 614
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    check-cast v10, Ljava/util/List;

    .line 619
    .line 620
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_2

    .line 624
    .line 625
    :pswitch_1f
    aget v6, v3, v8

    .line 626
    .line 627
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v10

    .line 631
    check-cast v10, Ljava/util/List;

    .line 632
    .line 633
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 634
    .line 635
    .line 636
    goto/16 :goto_2

    .line 637
    .line 638
    :pswitch_20
    aget v6, v3, v8

    .line 639
    .line 640
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v10

    .line 644
    check-cast v10, Ljava/util/List;

    .line 645
    .line 646
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_2

    .line 650
    .line 651
    :pswitch_21
    aget v6, v3, v8

    .line 652
    .line 653
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    check-cast v10, Ljava/util/List;

    .line 658
    .line 659
    invoke-static {v6, v10, v2, v13}, Landroidx/datastore/preferences/protobuf/c0;->B(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 660
    .line 661
    .line 662
    goto/16 :goto_2

    .line 663
    .line 664
    :pswitch_22
    aget v6, v3, v8

    .line 665
    .line 666
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    check-cast v10, Ljava/util/List;

    .line 671
    .line 672
    const/4 v11, 0x0

    .line 673
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 674
    .line 675
    .line 676
    :goto_3
    move v12, v11

    .line 677
    goto/16 :goto_4

    .line 678
    .line 679
    :pswitch_23
    const/4 v11, 0x0

    .line 680
    aget v6, v3, v8

    .line 681
    .line 682
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v10

    .line 686
    check-cast v10, Ljava/util/List;

    .line 687
    .line 688
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->M(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 689
    .line 690
    .line 691
    goto :goto_3

    .line 692
    :pswitch_24
    const/4 v11, 0x0

    .line 693
    aget v6, v3, v8

    .line 694
    .line 695
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    check-cast v10, Ljava/util/List;

    .line 700
    .line 701
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 702
    .line 703
    .line 704
    goto :goto_3

    .line 705
    :pswitch_25
    const/4 v11, 0x0

    .line 706
    aget v6, v3, v8

    .line 707
    .line 708
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v10

    .line 712
    check-cast v10, Ljava/util/List;

    .line 713
    .line 714
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 715
    .line 716
    .line 717
    goto :goto_3

    .line 718
    :pswitch_26
    const/4 v11, 0x0

    .line 719
    aget v6, v3, v8

    .line 720
    .line 721
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v10

    .line 725
    check-cast v10, Ljava/util/List;

    .line 726
    .line 727
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 728
    .line 729
    .line 730
    goto :goto_3

    .line 731
    :pswitch_27
    const/4 v11, 0x0

    .line 732
    aget v6, v3, v8

    .line 733
    .line 734
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v10

    .line 738
    check-cast v10, Ljava/util/List;

    .line 739
    .line 740
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 741
    .line 742
    .line 743
    goto :goto_3

    .line 744
    :pswitch_28
    aget v6, v3, v8

    .line 745
    .line 746
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v10

    .line 750
    check-cast v10, Ljava/util/List;

    .line 751
    .line 752
    invoke-static {v6, v10, v2}, Landroidx/datastore/preferences/protobuf/c0;->A(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;)V

    .line 753
    .line 754
    .line 755
    goto/16 :goto_2

    .line 756
    .line 757
    :pswitch_29
    aget v6, v3, v8

    .line 758
    .line 759
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v10

    .line 763
    check-cast v10, Ljava/util/List;

    .line 764
    .line 765
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 766
    .line 767
    .line 768
    move-result-object v11

    .line 769
    invoke-static {v6, v10, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->J(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 770
    .line 771
    .line 772
    goto/16 :goto_2

    .line 773
    .line 774
    :pswitch_2a
    aget v6, v3, v8

    .line 775
    .line 776
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v10

    .line 780
    check-cast v10, Ljava/util/List;

    .line 781
    .line 782
    invoke-static {v6, v10, v2}, Landroidx/datastore/preferences/protobuf/c0;->O(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_2

    .line 786
    .line 787
    :pswitch_2b
    aget v6, v3, v8

    .line 788
    .line 789
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v10

    .line 793
    check-cast v10, Ljava/util/List;

    .line 794
    .line 795
    const/4 v12, 0x0

    .line 796
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->z(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 797
    .line 798
    .line 799
    goto/16 :goto_4

    .line 800
    .line 801
    :pswitch_2c
    const/4 v12, 0x0

    .line 802
    aget v6, v3, v8

    .line 803
    .line 804
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v10

    .line 808
    check-cast v10, Ljava/util/List;

    .line 809
    .line 810
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->D(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 811
    .line 812
    .line 813
    goto/16 :goto_4

    .line 814
    .line 815
    :pswitch_2d
    const/4 v12, 0x0

    .line 816
    aget v6, v3, v8

    .line 817
    .line 818
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    check-cast v10, Ljava/util/List;

    .line 823
    .line 824
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 825
    .line 826
    .line 827
    goto/16 :goto_4

    .line 828
    .line 829
    :pswitch_2e
    const/4 v12, 0x0

    .line 830
    aget v6, v3, v8

    .line 831
    .line 832
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v10

    .line 836
    check-cast v10, Ljava/util/List;

    .line 837
    .line 838
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 839
    .line 840
    .line 841
    goto/16 :goto_4

    .line 842
    .line 843
    :pswitch_2f
    const/4 v12, 0x0

    .line 844
    aget v6, v3, v8

    .line 845
    .line 846
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v10

    .line 850
    check-cast v10, Ljava/util/List;

    .line 851
    .line 852
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 853
    .line 854
    .line 855
    goto/16 :goto_4

    .line 856
    .line 857
    :pswitch_30
    const/4 v12, 0x0

    .line 858
    aget v6, v3, v8

    .line 859
    .line 860
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v10

    .line 864
    check-cast v10, Ljava/util/List;

    .line 865
    .line 866
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_4

    .line 870
    .line 871
    :pswitch_31
    const/4 v12, 0x0

    .line 872
    aget v6, v3, v8

    .line 873
    .line 874
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v10

    .line 878
    check-cast v10, Ljava/util/List;

    .line 879
    .line 880
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_4

    .line 884
    .line 885
    :pswitch_32
    const/4 v12, 0x0

    .line 886
    aget v6, v3, v8

    .line 887
    .line 888
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v10

    .line 892
    check-cast v10, Ljava/util/List;

    .line 893
    .line 894
    invoke-static {v6, v10, v2, v12}, Landroidx/datastore/preferences/protobuf/c0;->B(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 895
    .line 896
    .line 897
    goto/16 :goto_4

    .line 898
    .line 899
    :pswitch_33
    const/4 v12, 0x0

    .line 900
    and-int/2addr v6, v9

    .line 901
    if-eqz v6, :cond_3

    .line 902
    .line 903
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 908
    .line 909
    .line 910
    move-result-object v10

    .line 911
    invoke-virtual {v2, v11, v6, v10}, Landroidx/datastore/preferences/protobuf/J;->b(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 912
    .line 913
    .line 914
    goto/16 :goto_4

    .line 915
    .line 916
    :pswitch_34
    const/4 v12, 0x0

    .line 917
    and-int/2addr v6, v9

    .line 918
    if-eqz v6, :cond_3

    .line 919
    .line 920
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 921
    .line 922
    .line 923
    move-result-wide v14

    .line 924
    shl-long v16, v14, v13

    .line 925
    .line 926
    shr-long v13, v14, v10

    .line 927
    .line 928
    xor-long v13, v16, v13

    .line 929
    .line 930
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 933
    .line 934
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 935
    .line 936
    .line 937
    goto/16 :goto_4

    .line 938
    .line 939
    :pswitch_35
    const/4 v12, 0x0

    .line 940
    and-int/2addr v6, v9

    .line 941
    if-eqz v6, :cond_3

    .line 942
    .line 943
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 944
    .line 945
    .line 946
    move-result v6

    .line 947
    shl-int/lit8 v10, v6, 0x1

    .line 948
    .line 949
    shr-int/lit8 v6, v6, 0x1f

    .line 950
    .line 951
    xor-int/2addr v6, v10

    .line 952
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 955
    .line 956
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_4

    .line 960
    .line 961
    :pswitch_36
    const/4 v12, 0x0

    .line 962
    and-int/2addr v6, v9

    .line 963
    if-eqz v6, :cond_3

    .line 964
    .line 965
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 966
    .line 967
    .line 968
    move-result-wide v13

    .line 969
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 972
    .line 973
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 974
    .line 975
    .line 976
    goto/16 :goto_4

    .line 977
    .line 978
    :pswitch_37
    const/4 v12, 0x0

    .line 979
    and-int/2addr v6, v9

    .line 980
    if-eqz v6, :cond_3

    .line 981
    .line 982
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 983
    .line 984
    .line 985
    move-result v6

    .line 986
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 989
    .line 990
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 991
    .line 992
    .line 993
    goto/16 :goto_4

    .line 994
    .line 995
    :pswitch_38
    const/4 v12, 0x0

    .line 996
    and-int/2addr v6, v9

    .line 997
    if-eqz v6, :cond_3

    .line 998
    .line 999
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1000
    .line 1001
    .line 1002
    move-result v6

    .line 1003
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1006
    .line 1007
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_4

    .line 1011
    .line 1012
    :pswitch_39
    const/4 v12, 0x0

    .line 1013
    and-int/2addr v6, v9

    .line 1014
    if-eqz v6, :cond_3

    .line 1015
    .line 1016
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1017
    .line 1018
    .line 1019
    move-result v6

    .line 1020
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1023
    .line 1024
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 1025
    .line 1026
    .line 1027
    goto/16 :goto_4

    .line 1028
    .line 1029
    :pswitch_3a
    const/4 v12, 0x0

    .line 1030
    and-int/2addr v6, v9

    .line 1031
    if-eqz v6, :cond_3

    .line 1032
    .line 1033
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v6

    .line 1037
    check-cast v6, Landroidx/datastore/preferences/protobuf/g;

    .line 1038
    .line 1039
    invoke-virtual {v2, v11, v6}, Landroidx/datastore/preferences/protobuf/J;->a(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_4

    .line 1043
    .line 1044
    :pswitch_3b
    const/4 v12, 0x0

    .line 1045
    and-int/2addr v6, v9

    .line 1046
    if-eqz v6, :cond_3

    .line 1047
    .line 1048
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v6

    .line 1052
    invoke-virtual {v0, v8}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v10

    .line 1056
    iget-object v13, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v13, Landroidx/datastore/preferences/protobuf/j;

    .line 1059
    .line 1060
    check-cast v6, Landroidx/datastore/preferences/protobuf/a;

    .line 1061
    .line 1062
    invoke-virtual {v13, v11, v6, v10}, Landroidx/datastore/preferences/protobuf/j;->O(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 1063
    .line 1064
    .line 1065
    goto/16 :goto_4

    .line 1066
    .line 1067
    :pswitch_3c
    const/4 v12, 0x0

    .line 1068
    and-int/2addr v6, v9

    .line 1069
    if-eqz v6, :cond_3

    .line 1070
    .line 1071
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v6

    .line 1075
    invoke-static {v11, v6, v2}, Landroidx/datastore/preferences/protobuf/S;->N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V

    .line 1076
    .line 1077
    .line 1078
    goto/16 :goto_4

    .line 1079
    .line 1080
    :pswitch_3d
    const/4 v12, 0x0

    .line 1081
    and-int/2addr v6, v9

    .line 1082
    if-eqz v6, :cond_3

    .line 1083
    .line 1084
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1085
    .line 1086
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v6

    .line 1090
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1093
    .line 1094
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->F(IZ)V

    .line 1095
    .line 1096
    .line 1097
    goto/16 :goto_4

    .line 1098
    .line 1099
    :pswitch_3e
    const/4 v12, 0x0

    .line 1100
    and-int/2addr v6, v9

    .line 1101
    if-eqz v6, :cond_3

    .line 1102
    .line 1103
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1104
    .line 1105
    .line 1106
    move-result v6

    .line 1107
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1110
    .line 1111
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 1112
    .line 1113
    .line 1114
    goto/16 :goto_4

    .line 1115
    .line 1116
    :pswitch_3f
    const/4 v12, 0x0

    .line 1117
    and-int/2addr v6, v9

    .line 1118
    if-eqz v6, :cond_3

    .line 1119
    .line 1120
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1121
    .line 1122
    .line 1123
    move-result-wide v13

    .line 1124
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 1127
    .line 1128
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 1129
    .line 1130
    .line 1131
    goto :goto_4

    .line 1132
    :pswitch_40
    const/4 v12, 0x0

    .line 1133
    and-int/2addr v6, v9

    .line 1134
    if-eqz v6, :cond_3

    .line 1135
    .line 1136
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1137
    .line 1138
    .line 1139
    move-result v6

    .line 1140
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1143
    .line 1144
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 1145
    .line 1146
    .line 1147
    goto :goto_4

    .line 1148
    :pswitch_41
    const/4 v12, 0x0

    .line 1149
    and-int/2addr v6, v9

    .line 1150
    if-eqz v6, :cond_3

    .line 1151
    .line 1152
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v13

    .line 1156
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 1159
    .line 1160
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_4

    .line 1164
    :pswitch_42
    const/4 v12, 0x0

    .line 1165
    and-int/2addr v6, v9

    .line 1166
    if-eqz v6, :cond_3

    .line 1167
    .line 1168
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v13

    .line 1172
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 1175
    .line 1176
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_4

    .line 1180
    :pswitch_43
    const/4 v12, 0x0

    .line 1181
    and-int/2addr v6, v9

    .line 1182
    if-eqz v6, :cond_3

    .line 1183
    .line 1184
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1185
    .line 1186
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 1187
    .line 1188
    .line 1189
    move-result v6

    .line 1190
    iget-object v10, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1191
    .line 1192
    check-cast v10, Landroidx/datastore/preferences/protobuf/j;

    .line 1193
    .line 1194
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1198
    .line 1199
    .line 1200
    move-result v6

    .line 1201
    invoke-virtual {v10, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_4

    .line 1205
    :pswitch_44
    const/4 v12, 0x0

    .line 1206
    and-int/2addr v6, v9

    .line 1207
    if-eqz v6, :cond_3

    .line 1208
    .line 1209
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1210
    .line 1211
    invoke-virtual {v6, v14, v15, v1}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 1212
    .line 1213
    .line 1214
    move-result-wide v13

    .line 1215
    iget-object v6, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v6, Landroidx/datastore/preferences/protobuf/j;

    .line 1218
    .line 1219
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    invoke-static {v13, v14}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v13

    .line 1226
    invoke-virtual {v6, v11, v13, v14}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 1227
    .line 1228
    .line 1229
    :cond_3
    :goto_4
    add-int/lit8 v8, v8, 0x3

    .line 1230
    .line 1231
    goto/16 :goto_0

    .line 1232
    .line 1233
    :cond_4
    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 1234
    .line 1235
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1236
    .line 1237
    .line 1238
    check-cast v1, Landroidx/datastore/preferences/protobuf/v;

    .line 1239
    .line 1240
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1241
    .line 1242
    invoke-virtual {v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->d(Landroidx/datastore/preferences/protobuf/J;)V

    .line 1243
    .line 1244
    .line 1245
    return-void

    .line 1246
    nop

    .line 1247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final M(Landroidx/datastore/preferences/protobuf/J;ILjava/lang/Object;I)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz p3, :cond_6

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/S;->l(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v3, Landroidx/datastore/preferences/protobuf/L;

    .line 19
    .line 20
    iget-object v3, v3, Landroidx/datastore/preferences/protobuf/L;->a:Landroidx/datastore/preferences/protobuf/K;

    .line 21
    .line 22
    move-object/from16 v4, p3

    .line 23
    .line 24
    check-cast v4, Landroidx/datastore/preferences/protobuf/M;

    .line 25
    .line 26
    move-object/from16 v5, p1

    .line 27
    .line 28
    iget-object v5, v5, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Landroidx/datastore/preferences/protobuf/j;

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/M;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_6

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Ljava/util/Map$Entry;

    .line 54
    .line 55
    move/from16 v7, p2

    .line 56
    .line 57
    invoke-virtual {v5, v7, v2}, Landroidx/datastore/preferences/protobuf/j;->R(II)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    sget v10, Landroidx/datastore/preferences/protobuf/p;->c:I

    .line 69
    .line 70
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    sget-object v11, Landroidx/datastore/preferences/protobuf/A0;->d:Landroidx/datastore/preferences/protobuf/x0;

    .line 75
    .line 76
    iget-object v12, v3, Landroidx/datastore/preferences/protobuf/K;->a:Landroidx/datastore/preferences/protobuf/w0;

    .line 77
    .line 78
    if-ne v12, v11, :cond_0

    .line 79
    .line 80
    mul-int/2addr v10, v2

    .line 81
    :cond_0
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    const/16 v14, 0x3f

    .line 86
    .line 87
    const-string v15, "There is no way to get here, but the compiler thinks otherwise."

    .line 88
    .line 89
    const/16 v16, 0x8

    .line 90
    .line 91
    const/16 v17, 0x4

    .line 92
    .line 93
    packed-switch v13, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    new-instance v1, Ljava/lang/RuntimeException;

    .line 97
    .line 98
    invoke-direct {v1, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :pswitch_0
    check-cast v8, Ljava/lang/Long;

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v18

    .line 108
    shl-long v20, v18, v1

    .line 109
    .line 110
    shr-long v18, v18, v14

    .line 111
    .line 112
    xor-long v18, v20, v18

    .line 113
    .line 114
    invoke-static/range {v18 .. v19}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :pswitch_1
    check-cast v8, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    shl-int/lit8 v13, v8, 0x1

    .line 127
    .line 128
    shr-int/lit8 v8, v8, 0x1f

    .line 129
    .line 130
    xor-int/2addr v8, v13

    .line 131
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :pswitch_2
    check-cast v8, Ljava/lang/Long;

    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    :goto_1
    move/from16 v8, v16

    .line 143
    .line 144
    goto/16 :goto_4

    .line 145
    .line 146
    :pswitch_3
    check-cast v8, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    :goto_2
    move/from16 v8, v17

    .line 152
    .line 153
    goto/16 :goto_4

    .line 154
    .line 155
    :pswitch_4
    check-cast v8, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :pswitch_5
    check-cast v8, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    goto/16 :goto_4

    .line 178
    .line 179
    :pswitch_6
    instance-of v13, v8, Landroidx/datastore/preferences/protobuf/g;

    .line 180
    .line 181
    if-eqz v13, :cond_1

    .line 182
    .line 183
    check-cast v8, Landroidx/datastore/preferences/protobuf/g;

    .line 184
    .line 185
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    goto/16 :goto_4

    .line 190
    .line 191
    :cond_1
    check-cast v8, [B

    .line 192
    .line 193
    array-length v8, v8

    .line 194
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    :goto_3
    add-int/2addr v8, v13

    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :pswitch_7
    check-cast v8, Landroidx/datastore/preferences/protobuf/a;

    .line 202
    .line 203
    invoke-virtual {v8}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    goto :goto_3

    .line 212
    :pswitch_8
    check-cast v8, Landroidx/datastore/preferences/protobuf/a;

    .line 213
    .line 214
    invoke-virtual {v8}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    goto :goto_4

    .line 219
    :pswitch_9
    instance-of v13, v8, Landroidx/datastore/preferences/protobuf/g;

    .line 220
    .line 221
    if-eqz v13, :cond_2

    .line 222
    .line 223
    check-cast v8, Landroidx/datastore/preferences/protobuf/g;

    .line 224
    .line 225
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    goto :goto_4

    .line 230
    :cond_2
    check-cast v8, Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    goto :goto_4

    .line 237
    :pswitch_a
    check-cast v8, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move v8, v1

    .line 243
    goto :goto_4

    .line 244
    :pswitch_b
    check-cast v8, Ljava/lang/Integer;

    .line 245
    .line 246
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :pswitch_c
    check-cast v8, Ljava/lang/Long;

    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :pswitch_d
    check-cast v8, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    goto :goto_4

    .line 267
    :pswitch_e
    check-cast v8, Ljava/lang/Long;

    .line 268
    .line 269
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 270
    .line 271
    .line 272
    move-result-wide v18

    .line 273
    invoke-static/range {v18 .. v19}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    goto :goto_4

    .line 278
    :pswitch_f
    check-cast v8, Ljava/lang/Long;

    .line 279
    .line 280
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 281
    .line 282
    .line 283
    move-result-wide v18

    .line 284
    invoke-static/range {v18 .. v19}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    goto :goto_4

    .line 289
    :pswitch_10
    check-cast v8, Ljava/lang/Float;

    .line 290
    .line 291
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :pswitch_11
    check-cast v8, Ljava/lang/Double;

    .line 297
    .line 298
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :goto_4
    add-int/2addr v8, v10

    .line 304
    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    iget-object v13, v3, Landroidx/datastore/preferences/protobuf/K;->b:Landroidx/datastore/preferences/protobuf/y0;

    .line 309
    .line 310
    if-ne v13, v11, :cond_3

    .line 311
    .line 312
    mul-int/2addr v10, v2

    .line 313
    :cond_3
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    packed-switch v11, :pswitch_data_1

    .line 318
    .line 319
    .line 320
    new-instance v1, Ljava/lang/RuntimeException;

    .line 321
    .line 322
    invoke-direct {v1, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v1

    .line 326
    :pswitch_12
    check-cast v9, Ljava/lang/Long;

    .line 327
    .line 328
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 329
    .line 330
    .line 331
    move-result-wide v15

    .line 332
    shl-long v17, v15, v1

    .line 333
    .line 334
    shr-long v14, v15, v14

    .line 335
    .line 336
    xor-long v14, v17, v14

    .line 337
    .line 338
    invoke-static {v14, v15}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 339
    .line 340
    .line 341
    move-result v16

    .line 342
    goto/16 :goto_7

    .line 343
    .line 344
    :pswitch_13
    check-cast v9, Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    shl-int/lit8 v11, v9, 0x1

    .line 351
    .line 352
    shr-int/lit8 v9, v9, 0x1f

    .line 353
    .line 354
    xor-int/2addr v9, v11

    .line 355
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 356
    .line 357
    .line 358
    move-result v16

    .line 359
    goto/16 :goto_7

    .line 360
    .line 361
    :pswitch_14
    check-cast v9, Ljava/lang/Long;

    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    goto/16 :goto_7

    .line 367
    .line 368
    :pswitch_15
    check-cast v9, Ljava/lang/Integer;

    .line 369
    .line 370
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    :goto_5
    move/from16 v16, v17

    .line 374
    .line 375
    goto/16 :goto_7

    .line 376
    .line 377
    :pswitch_16
    check-cast v9, Ljava/lang/Integer;

    .line 378
    .line 379
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 384
    .line 385
    .line 386
    move-result v16

    .line 387
    goto/16 :goto_7

    .line 388
    .line 389
    :pswitch_17
    check-cast v9, Ljava/lang/Integer;

    .line 390
    .line 391
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 396
    .line 397
    .line 398
    move-result v16

    .line 399
    goto/16 :goto_7

    .line 400
    .line 401
    :pswitch_18
    instance-of v11, v9, Landroidx/datastore/preferences/protobuf/g;

    .line 402
    .line 403
    if-eqz v11, :cond_4

    .line 404
    .line 405
    check-cast v9, Landroidx/datastore/preferences/protobuf/g;

    .line 406
    .line 407
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 408
    .line 409
    .line 410
    move-result v16

    .line 411
    goto/16 :goto_7

    .line 412
    .line 413
    :cond_4
    check-cast v9, [B

    .line 414
    .line 415
    array-length v9, v9

    .line 416
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    :goto_6
    add-int v16, v11, v9

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :pswitch_19
    check-cast v9, Landroidx/datastore/preferences/protobuf/a;

    .line 424
    .line 425
    invoke-virtual {v9}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 426
    .line 427
    .line 428
    move-result v9

    .line 429
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    goto :goto_6

    .line 434
    :pswitch_1a
    check-cast v9, Landroidx/datastore/preferences/protobuf/a;

    .line 435
    .line 436
    invoke-virtual {v9}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 437
    .line 438
    .line 439
    move-result v16

    .line 440
    goto :goto_7

    .line 441
    :pswitch_1b
    instance-of v11, v9, Landroidx/datastore/preferences/protobuf/g;

    .line 442
    .line 443
    if-eqz v11, :cond_5

    .line 444
    .line 445
    check-cast v9, Landroidx/datastore/preferences/protobuf/g;

    .line 446
    .line 447
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 448
    .line 449
    .line 450
    move-result v16

    .line 451
    goto :goto_7

    .line 452
    :cond_5
    check-cast v9, Ljava/lang/String;

    .line 453
    .line 454
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 455
    .line 456
    .line 457
    move-result v16

    .line 458
    goto :goto_7

    .line 459
    :pswitch_1c
    check-cast v9, Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move/from16 v16, v1

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :pswitch_1d
    check-cast v9, Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    goto :goto_5

    .line 473
    :pswitch_1e
    check-cast v9, Ljava/lang/Long;

    .line 474
    .line 475
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    goto :goto_7

    .line 479
    :pswitch_1f
    check-cast v9, Ljava/lang/Integer;

    .line 480
    .line 481
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    invoke-static {v9}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 486
    .line 487
    .line 488
    move-result v16

    .line 489
    goto :goto_7

    .line 490
    :pswitch_20
    check-cast v9, Ljava/lang/Long;

    .line 491
    .line 492
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 493
    .line 494
    .line 495
    move-result-wide v14

    .line 496
    invoke-static {v14, v15}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 497
    .line 498
    .line 499
    move-result v16

    .line 500
    goto :goto_7

    .line 501
    :pswitch_21
    check-cast v9, Ljava/lang/Long;

    .line 502
    .line 503
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 504
    .line 505
    .line 506
    move-result-wide v14

    .line 507
    invoke-static {v14, v15}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 508
    .line 509
    .line 510
    move-result v16

    .line 511
    goto :goto_7

    .line 512
    :pswitch_22
    check-cast v9, Ljava/lang/Float;

    .line 513
    .line 514
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    goto/16 :goto_5

    .line 518
    .line 519
    :pswitch_23
    check-cast v9, Ljava/lang/Double;

    .line 520
    .line 521
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    :goto_7
    add-int v16, v16, v10

    .line 525
    .line 526
    add-int v8, v16, v8

    .line 527
    .line 528
    invoke-virtual {v5, v8}, Landroidx/datastore/preferences/protobuf/j;->T(I)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-static {v5, v12, v1, v8}, Landroidx/datastore/preferences/protobuf/p;->b(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/A0;ILjava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    invoke-static {v5, v13, v2, v6}, Landroidx/datastore/preferences/protobuf/p;->b(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/A0;ILjava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_0

    .line 546
    .line 547
    :cond_6
    return-void

    .line 548
    nop

    .line 549
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/S;->i:I

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/S;->h:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Landroidx/datastore/preferences/protobuf/S;->j:I

    .line 7
    .line 8
    if-ge v0, v3, :cond_1

    .line 9
    .line 10
    aget v1, v1, v0

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v1, v3

    .line 20
    int-to-long v3, v1

    .line 21
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 22
    .line 23
    invoke-virtual {v1, v3, v4, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-object v5, v1

    .line 36
    check-cast v5, Landroidx/datastore/preferences/protobuf/M;

    .line 37
    .line 38
    iput-boolean v2, v5, Landroidx/datastore/preferences/protobuf/M;->a:Z

    .line 39
    .line 40
    invoke-static {p1, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    array-length v0, v1

    .line 47
    :goto_2
    if-ge v3, v0, :cond_2

    .line 48
    .line 49
    aget v4, v1, v3

    .line 50
    .line 51
    int-to-long v4, v4

    .line 52
    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 53
    .line 54
    invoke-virtual {v6, v4, v5, p1}, Landroidx/datastore/preferences/protobuf/G;->a(JLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast p1, Landroidx/datastore/preferences/protobuf/v;

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 68
    .line 69
    iput-boolean v2, p1, Landroidx/datastore/preferences/protobuf/j0;->e:Z

    .line 70
    .line 71
    return-void
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    iget v4, p0, Landroidx/datastore/preferences/protobuf/S;->i:I

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    if-ge v2, v4, :cond_12

    .line 9
    .line 10
    iget-object v4, p0, Landroidx/datastore/preferences/protobuf/S;->h:[I

    .line 11
    .line 12
    aget v4, v4, v2

    .line 13
    .line 14
    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 15
    .line 16
    aget v7, v6, v4

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    const v9, 0xfffff

    .line 23
    .line 24
    .line 25
    iget-boolean v10, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 26
    .line 27
    if-nez v10, :cond_0

    .line 28
    .line 29
    add-int/lit8 v11, v4, 0x2

    .line 30
    .line 31
    aget v6, v6, v11

    .line 32
    .line 33
    and-int v11, v6, v9

    .line 34
    .line 35
    ushr-int/lit8 v6, v6, 0x14

    .line 36
    .line 37
    shl-int v6, v5, v6

    .line 38
    .line 39
    if-eq v11, v0, :cond_1

    .line 40
    .line 41
    sget-object v0, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 42
    .line 43
    int-to-long v12, v11

    .line 44
    invoke-virtual {v0, p1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    move v0, v11

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v6, v1

    .line 51
    :cond_1
    :goto_1
    const/high16 v11, 0x10000000

    .line 52
    .line 53
    and-int/2addr v11, v8

    .line 54
    if-eqz v11, :cond_4

    .line 55
    .line 56
    if-eqz v10, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0, v4, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    and-int v11, v3, v6

    .line 64
    .line 65
    if-eqz v11, :cond_3

    .line 66
    .line 67
    move v11, v5

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v11, v1

    .line 70
    :goto_2
    if-nez v11, :cond_4

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_4
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    const/16 v12, 0x9

    .line 79
    .line 80
    if-eq v11, v12, :cond_e

    .line 81
    .line 82
    const/16 v12, 0x11

    .line 83
    .line 84
    if-eq v11, v12, :cond_e

    .line 85
    .line 86
    const/16 v5, 0x1b

    .line 87
    .line 88
    if-eq v11, v5, :cond_b

    .line 89
    .line 90
    const/16 v5, 0x3c

    .line 91
    .line 92
    if-eq v11, v5, :cond_a

    .line 93
    .line 94
    const/16 v5, 0x44

    .line 95
    .line 96
    if-eq v11, v5, :cond_a

    .line 97
    .line 98
    const/16 v5, 0x31

    .line 99
    .line 100
    if-eq v11, v5, :cond_b

    .line 101
    .line 102
    const/16 v5, 0x32

    .line 103
    .line 104
    if-eq v11, v5, :cond_5

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_5
    and-int v5, v8, v9

    .line 109
    .line 110
    int-to-long v5, v5

    .line 111
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 112
    .line 113
    invoke-virtual {v7, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    check-cast v5, Landroidx/datastore/preferences/protobuf/M;

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    goto/16 :goto_6

    .line 131
    .line 132
    :cond_6
    invoke-virtual {p0, v4}, Landroidx/datastore/preferences/protobuf/S;->l(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Landroidx/datastore/preferences/protobuf/L;

    .line 137
    .line 138
    iget-object v4, v4, Landroidx/datastore/preferences/protobuf/L;->a:Landroidx/datastore/preferences/protobuf/K;

    .line 139
    .line 140
    iget-object v4, v4, Landroidx/datastore/preferences/protobuf/K;->b:Landroidx/datastore/preferences/protobuf/y0;

    .line 141
    .line 142
    iget-object v4, v4, Landroidx/datastore/preferences/protobuf/A0;->a:Landroidx/datastore/preferences/protobuf/B0;

    .line 143
    .line 144
    sget-object v6, Landroidx/datastore/preferences/protobuf/B0;->j:Landroidx/datastore/preferences/protobuf/B0;

    .line 145
    .line 146
    if-eq v4, v6, :cond_7

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_7
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const/4 v5, 0x0

    .line 159
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_11

    .line 164
    .line 165
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    if-nez v5, :cond_9

    .line 170
    .line 171
    sget-object v5, Landroidx/datastore/preferences/protobuf/Y;->c:Landroidx/datastore/preferences/protobuf/Y;

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v5, v7}, Landroidx/datastore/preferences/protobuf/Y;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/b0;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    :cond_9
    invoke-interface {v5, v6}, Landroidx/datastore/preferences/protobuf/b0;->b(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-nez v6, :cond_8

    .line 186
    .line 187
    goto/16 :goto_5

    .line 188
    .line 189
    :cond_a
    invoke-virtual {p0, v7, v4, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_11

    .line 194
    .line 195
    invoke-virtual {p0, v4}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    and-int v5, v8, v9

    .line 200
    .line 201
    int-to-long v5, v5

    .line 202
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 203
    .line 204
    invoke-virtual {v7, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-interface {v4, v5}, Landroidx/datastore/preferences/protobuf/b0;->b(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_11

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_b
    and-int v5, v8, v9

    .line 216
    .line 217
    int-to-long v5, v5

    .line 218
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 219
    .line 220
    invoke-virtual {v7, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    check-cast v5, Ljava/util/List;

    .line 225
    .line 226
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_c

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_c
    invoke-virtual {p0, v4}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    move v6, v1

    .line 238
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-ge v6, v7, :cond_11

    .line 243
    .line 244
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-interface {v4, v7}, Landroidx/datastore/preferences/protobuf/b0;->b(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-nez v7, :cond_d

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_e
    if-eqz v10, :cond_f

    .line 259
    .line 260
    invoke-virtual {p0, v4, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    goto :goto_4

    .line 265
    :cond_f
    and-int/2addr v6, v3

    .line 266
    if-eqz v6, :cond_10

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_10
    move v5, v1

    .line 270
    :goto_4
    if-eqz v5, :cond_11

    .line 271
    .line 272
    invoke-virtual {p0, v4}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    and-int v5, v8, v9

    .line 277
    .line 278
    int-to-long v5, v5

    .line 279
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 280
    .line 281
    invoke-virtual {v7, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-interface {v4, v5}, Landroidx/datastore/preferences/protobuf/b0;->b(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-nez v4, :cond_11

    .line 290
    .line 291
    :goto_5
    return v1

    .line 292
    :cond_11
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_12
    return v5
.end method

.method public final c(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-boolean v3, v0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 11
    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    const/4 v5, 0x0

    .line 18
    move v6, v5

    .line 19
    :goto_0
    if-ge v6, v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    aget v8, v3, v6

    .line 26
    .line 27
    invoke-static {v7}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    const/16 v10, 0x3f

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    iget-object v12, v2, Landroidx/datastore/preferences/protobuf/J;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v12, Landroidx/datastore/preferences/protobuf/j;

    .line 37
    .line 38
    const v13, 0xfffff

    .line 39
    .line 40
    .line 41
    packed-switch v9, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :pswitch_0
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-eqz v9, :cond_0

    .line 51
    .line 52
    and-int/2addr v7, v13

    .line 53
    int-to-long v9, v7

    .line 54
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 55
    .line 56
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v2, v8, v7, v9}, Landroidx/datastore/preferences/protobuf/J;->b(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :pswitch_1
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_0

    .line 74
    .line 75
    and-int/2addr v7, v13

    .line 76
    int-to-long v13, v7

    .line 77
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    shl-long v15, v13, v11

    .line 82
    .line 83
    shr-long v9, v13, v10

    .line 84
    .line 85
    xor-long/2addr v9, v15

    .line 86
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :pswitch_2
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_0

    .line 96
    .line 97
    and-int/2addr v7, v13

    .line 98
    int-to-long v9, v7

    .line 99
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    shl-int/lit8 v9, v7, 0x1

    .line 104
    .line 105
    shr-int/lit8 v7, v7, 0x1f

    .line 106
    .line 107
    xor-int/2addr v7, v9

    .line 108
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_3
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_0

    .line 118
    .line 119
    and-int/2addr v7, v13

    .line 120
    int-to-long v9, v7

    .line 121
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v9

    .line 125
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :pswitch_4
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_0

    .line 135
    .line 136
    and-int/2addr v7, v13

    .line 137
    int-to-long v9, v7

    .line 138
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :pswitch_5
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_0

    .line 152
    .line 153
    and-int/2addr v7, v13

    .line 154
    int-to-long v9, v7

    .line 155
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_1

    .line 163
    .line 164
    :pswitch_6
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_0

    .line 169
    .line 170
    and-int/2addr v7, v13

    .line 171
    int-to-long v9, v7

    .line 172
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_7
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-eqz v9, :cond_0

    .line 186
    .line 187
    and-int/2addr v7, v13

    .line 188
    int-to-long v9, v7

    .line 189
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 190
    .line 191
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, Landroidx/datastore/preferences/protobuf/g;

    .line 196
    .line 197
    invoke-virtual {v2, v8, v7}, Landroidx/datastore/preferences/protobuf/J;->a(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :pswitch_8
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_0

    .line 207
    .line 208
    and-int/2addr v7, v13

    .line 209
    int-to-long v9, v7

    .line 210
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 211
    .line 212
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    check-cast v7, Landroidx/datastore/preferences/protobuf/a;

    .line 221
    .line 222
    invoke-virtual {v12, v8, v7, v9}, Landroidx/datastore/preferences/protobuf/j;->O(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :pswitch_9
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-eqz v9, :cond_0

    .line 232
    .line 233
    and-int/2addr v7, v13

    .line 234
    int-to-long v9, v7

    .line 235
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 236
    .line 237
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-static {v8, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :pswitch_a
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    if-eqz v9, :cond_0

    .line 251
    .line 252
    and-int/2addr v7, v13

    .line 253
    int-to-long v9, v7

    .line 254
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 255
    .line 256
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    check-cast v7, Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->F(IZ)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :pswitch_b
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-eqz v9, :cond_0

    .line 276
    .line 277
    and-int/2addr v7, v13

    .line 278
    int-to-long v9, v7

    .line 279
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :pswitch_c
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-eqz v9, :cond_0

    .line 293
    .line 294
    and-int/2addr v7, v13

    .line 295
    int-to-long v9, v7

    .line 296
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 297
    .line 298
    .line 299
    move-result-wide v9

    .line 300
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :pswitch_d
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_0

    .line 310
    .line 311
    and-int/2addr v7, v13

    .line 312
    int-to-long v9, v7

    .line 313
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_1

    .line 321
    .line 322
    :pswitch_e
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    if-eqz v9, :cond_0

    .line 327
    .line 328
    and-int/2addr v7, v13

    .line 329
    int-to-long v9, v7

    .line 330
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 331
    .line 332
    .line 333
    move-result-wide v9

    .line 334
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :pswitch_f
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    if-eqz v9, :cond_0

    .line 344
    .line 345
    and-int/2addr v7, v13

    .line 346
    int-to-long v9, v7

    .line 347
    invoke-static {v9, v10, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v9

    .line 351
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :pswitch_10
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-eqz v9, :cond_0

    .line 361
    .line 362
    and-int/2addr v7, v13

    .line 363
    int-to-long v9, v7

    .line 364
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 365
    .line 366
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    check-cast v7, Ljava/lang/Float;

    .line 371
    .line 372
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_1

    .line 387
    .line 388
    :pswitch_11
    invoke-virtual {v0, v8, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    if-eqz v9, :cond_0

    .line 393
    .line 394
    and-int/2addr v7, v13

    .line 395
    int-to-long v9, v7

    .line 396
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 397
    .line 398
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    check-cast v7, Ljava/lang/Double;

    .line 403
    .line 404
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 405
    .line 406
    .line 407
    move-result-wide v9

    .line 408
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 412
    .line 413
    .line 414
    move-result-wide v9

    .line 415
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_1

    .line 419
    .line 420
    :pswitch_12
    and-int/2addr v7, v13

    .line 421
    int-to-long v9, v7

    .line 422
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 423
    .line 424
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    invoke-virtual {v0, v2, v8, v7, v6}, Landroidx/datastore/preferences/protobuf/S;->M(Landroidx/datastore/preferences/protobuf/J;ILjava/lang/Object;I)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_1

    .line 432
    .line 433
    :pswitch_13
    aget v8, v3, v6

    .line 434
    .line 435
    and-int/2addr v7, v13

    .line 436
    int-to-long v9, v7

    .line 437
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 438
    .line 439
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    check-cast v7, Ljava/util/List;

    .line 444
    .line 445
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    invoke-static {v8, v7, v2, v9}, Landroidx/datastore/preferences/protobuf/c0;->G(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_14
    aget v8, v3, v6

    .line 455
    .line 456
    and-int/2addr v7, v13

    .line 457
    int-to-long v9, v7

    .line 458
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 459
    .line 460
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    check-cast v7, Ljava/util/List;

    .line 465
    .line 466
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 467
    .line 468
    .line 469
    goto/16 :goto_1

    .line 470
    .line 471
    :pswitch_15
    aget v8, v3, v6

    .line 472
    .line 473
    and-int/2addr v7, v13

    .line 474
    int-to-long v9, v7

    .line 475
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 476
    .line 477
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    check-cast v7, Ljava/util/List;

    .line 482
    .line 483
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->M(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_1

    .line 487
    .line 488
    :pswitch_16
    aget v8, v3, v6

    .line 489
    .line 490
    and-int/2addr v7, v13

    .line 491
    int-to-long v9, v7

    .line 492
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 493
    .line 494
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    check-cast v7, Ljava/util/List;

    .line 499
    .line 500
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_1

    .line 504
    .line 505
    :pswitch_17
    aget v8, v3, v6

    .line 506
    .line 507
    and-int/2addr v7, v13

    .line 508
    int-to-long v9, v7

    .line 509
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 510
    .line 511
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    check-cast v7, Ljava/util/List;

    .line 516
    .line 517
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 518
    .line 519
    .line 520
    goto/16 :goto_1

    .line 521
    .line 522
    :pswitch_18
    aget v8, v3, v6

    .line 523
    .line 524
    and-int/2addr v7, v13

    .line 525
    int-to-long v9, v7

    .line 526
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 527
    .line 528
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    check-cast v7, Ljava/util/List;

    .line 533
    .line 534
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_1

    .line 538
    .line 539
    :pswitch_19
    aget v8, v3, v6

    .line 540
    .line 541
    and-int/2addr v7, v13

    .line 542
    int-to-long v9, v7

    .line 543
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 544
    .line 545
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    check-cast v7, Ljava/util/List;

    .line 550
    .line 551
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_1

    .line 555
    .line 556
    :pswitch_1a
    aget v8, v3, v6

    .line 557
    .line 558
    and-int/2addr v7, v13

    .line 559
    int-to-long v9, v7

    .line 560
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 561
    .line 562
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    check-cast v7, Ljava/util/List;

    .line 567
    .line 568
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->z(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 569
    .line 570
    .line 571
    goto/16 :goto_1

    .line 572
    .line 573
    :pswitch_1b
    aget v8, v3, v6

    .line 574
    .line 575
    and-int/2addr v7, v13

    .line 576
    int-to-long v9, v7

    .line 577
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 578
    .line 579
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v7

    .line 583
    check-cast v7, Ljava/util/List;

    .line 584
    .line 585
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->D(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_1

    .line 589
    .line 590
    :pswitch_1c
    aget v8, v3, v6

    .line 591
    .line 592
    and-int/2addr v7, v13

    .line 593
    int-to-long v9, v7

    .line 594
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 595
    .line 596
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    check-cast v7, Ljava/util/List;

    .line 601
    .line 602
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_1

    .line 606
    .line 607
    :pswitch_1d
    aget v8, v3, v6

    .line 608
    .line 609
    and-int/2addr v7, v13

    .line 610
    int-to-long v9, v7

    .line 611
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 612
    .line 613
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    check-cast v7, Ljava/util/List;

    .line 618
    .line 619
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 620
    .line 621
    .line 622
    goto/16 :goto_1

    .line 623
    .line 624
    :pswitch_1e
    aget v8, v3, v6

    .line 625
    .line 626
    and-int/2addr v7, v13

    .line 627
    int-to-long v9, v7

    .line 628
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 629
    .line 630
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    check-cast v7, Ljava/util/List;

    .line 635
    .line 636
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_1

    .line 640
    .line 641
    :pswitch_1f
    aget v8, v3, v6

    .line 642
    .line 643
    and-int/2addr v7, v13

    .line 644
    int-to-long v9, v7

    .line 645
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 646
    .line 647
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v7

    .line 651
    check-cast v7, Ljava/util/List;

    .line 652
    .line 653
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_1

    .line 657
    .line 658
    :pswitch_20
    aget v8, v3, v6

    .line 659
    .line 660
    and-int/2addr v7, v13

    .line 661
    int-to-long v9, v7

    .line 662
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 663
    .line 664
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    check-cast v7, Ljava/util/List;

    .line 669
    .line 670
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 671
    .line 672
    .line 673
    goto/16 :goto_1

    .line 674
    .line 675
    :pswitch_21
    aget v8, v3, v6

    .line 676
    .line 677
    and-int/2addr v7, v13

    .line 678
    int-to-long v9, v7

    .line 679
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 680
    .line 681
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    check-cast v7, Ljava/util/List;

    .line 686
    .line 687
    invoke-static {v8, v7, v2, v11}, Landroidx/datastore/preferences/protobuf/c0;->B(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_1

    .line 691
    .line 692
    :pswitch_22
    aget v8, v3, v6

    .line 693
    .line 694
    and-int/2addr v7, v13

    .line 695
    int-to-long v9, v7

    .line 696
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 697
    .line 698
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    check-cast v7, Ljava/util/List;

    .line 703
    .line 704
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->N(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_1

    .line 708
    .line 709
    :pswitch_23
    aget v8, v3, v6

    .line 710
    .line 711
    and-int/2addr v7, v13

    .line 712
    int-to-long v9, v7

    .line 713
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 714
    .line 715
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    check-cast v7, Ljava/util/List;

    .line 720
    .line 721
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->M(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 722
    .line 723
    .line 724
    goto/16 :goto_1

    .line 725
    .line 726
    :pswitch_24
    aget v8, v3, v6

    .line 727
    .line 728
    and-int/2addr v7, v13

    .line 729
    int-to-long v9, v7

    .line 730
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 731
    .line 732
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v7

    .line 736
    check-cast v7, Ljava/util/List;

    .line 737
    .line 738
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->L(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 739
    .line 740
    .line 741
    goto/16 :goto_1

    .line 742
    .line 743
    :pswitch_25
    aget v8, v3, v6

    .line 744
    .line 745
    and-int/2addr v7, v13

    .line 746
    int-to-long v9, v7

    .line 747
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 748
    .line 749
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    check-cast v7, Ljava/util/List;

    .line 754
    .line 755
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->K(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 756
    .line 757
    .line 758
    goto/16 :goto_1

    .line 759
    .line 760
    :pswitch_26
    aget v8, v3, v6

    .line 761
    .line 762
    and-int/2addr v7, v13

    .line 763
    int-to-long v9, v7

    .line 764
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 765
    .line 766
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v7

    .line 770
    check-cast v7, Ljava/util/List;

    .line 771
    .line 772
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->C(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_1

    .line 776
    .line 777
    :pswitch_27
    aget v8, v3, v6

    .line 778
    .line 779
    and-int/2addr v7, v13

    .line 780
    int-to-long v9, v7

    .line 781
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 782
    .line 783
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v7

    .line 787
    check-cast v7, Ljava/util/List;

    .line 788
    .line 789
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->P(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 790
    .line 791
    .line 792
    goto/16 :goto_1

    .line 793
    .line 794
    :pswitch_28
    aget v8, v3, v6

    .line 795
    .line 796
    and-int/2addr v7, v13

    .line 797
    int-to-long v9, v7

    .line 798
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 799
    .line 800
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    check-cast v7, Ljava/util/List;

    .line 805
    .line 806
    invoke-static {v8, v7, v2}, Landroidx/datastore/preferences/protobuf/c0;->A(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;)V

    .line 807
    .line 808
    .line 809
    goto/16 :goto_1

    .line 810
    .line 811
    :pswitch_29
    aget v8, v3, v6

    .line 812
    .line 813
    and-int/2addr v7, v13

    .line 814
    int-to-long v9, v7

    .line 815
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 816
    .line 817
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v7

    .line 821
    check-cast v7, Ljava/util/List;

    .line 822
    .line 823
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 824
    .line 825
    .line 826
    move-result-object v9

    .line 827
    invoke-static {v8, v7, v2, v9}, Landroidx/datastore/preferences/protobuf/c0;->J(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_1

    .line 831
    .line 832
    :pswitch_2a
    aget v8, v3, v6

    .line 833
    .line 834
    and-int/2addr v7, v13

    .line 835
    int-to-long v9, v7

    .line 836
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 837
    .line 838
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v7

    .line 842
    check-cast v7, Ljava/util/List;

    .line 843
    .line 844
    invoke-static {v8, v7, v2}, Landroidx/datastore/preferences/protobuf/c0;->O(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;)V

    .line 845
    .line 846
    .line 847
    goto/16 :goto_1

    .line 848
    .line 849
    :pswitch_2b
    aget v8, v3, v6

    .line 850
    .line 851
    and-int/2addr v7, v13

    .line 852
    int-to-long v9, v7

    .line 853
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 854
    .line 855
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v7

    .line 859
    check-cast v7, Ljava/util/List;

    .line 860
    .line 861
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->z(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 862
    .line 863
    .line 864
    goto/16 :goto_1

    .line 865
    .line 866
    :pswitch_2c
    aget v8, v3, v6

    .line 867
    .line 868
    and-int/2addr v7, v13

    .line 869
    int-to-long v9, v7

    .line 870
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 871
    .line 872
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v7

    .line 876
    check-cast v7, Ljava/util/List;

    .line 877
    .line 878
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->D(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 879
    .line 880
    .line 881
    goto/16 :goto_1

    .line 882
    .line 883
    :pswitch_2d
    aget v8, v3, v6

    .line 884
    .line 885
    and-int/2addr v7, v13

    .line 886
    int-to-long v9, v7

    .line 887
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 888
    .line 889
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v7

    .line 893
    check-cast v7, Ljava/util/List;

    .line 894
    .line 895
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->E(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_1

    .line 899
    .line 900
    :pswitch_2e
    aget v8, v3, v6

    .line 901
    .line 902
    and-int/2addr v7, v13

    .line 903
    int-to-long v9, v7

    .line 904
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 905
    .line 906
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    check-cast v7, Ljava/util/List;

    .line 911
    .line 912
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->H(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 913
    .line 914
    .line 915
    goto/16 :goto_1

    .line 916
    .line 917
    :pswitch_2f
    aget v8, v3, v6

    .line 918
    .line 919
    and-int/2addr v7, v13

    .line 920
    int-to-long v9, v7

    .line 921
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 922
    .line 923
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v7

    .line 927
    check-cast v7, Ljava/util/List;

    .line 928
    .line 929
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->Q(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 930
    .line 931
    .line 932
    goto/16 :goto_1

    .line 933
    .line 934
    :pswitch_30
    aget v8, v3, v6

    .line 935
    .line 936
    and-int/2addr v7, v13

    .line 937
    int-to-long v9, v7

    .line 938
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 939
    .line 940
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    check-cast v7, Ljava/util/List;

    .line 945
    .line 946
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->I(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 947
    .line 948
    .line 949
    goto/16 :goto_1

    .line 950
    .line 951
    :pswitch_31
    aget v8, v3, v6

    .line 952
    .line 953
    and-int/2addr v7, v13

    .line 954
    int-to-long v9, v7

    .line 955
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 956
    .line 957
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    check-cast v7, Ljava/util/List;

    .line 962
    .line 963
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->F(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 964
    .line 965
    .line 966
    goto/16 :goto_1

    .line 967
    .line 968
    :pswitch_32
    aget v8, v3, v6

    .line 969
    .line 970
    and-int/2addr v7, v13

    .line 971
    int-to-long v9, v7

    .line 972
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 973
    .line 974
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v7

    .line 978
    check-cast v7, Ljava/util/List;

    .line 979
    .line 980
    invoke-static {v8, v7, v2, v5}, Landroidx/datastore/preferences/protobuf/c0;->B(ILjava/util/List;Landroidx/datastore/preferences/protobuf/J;Z)V

    .line 981
    .line 982
    .line 983
    goto/16 :goto_1

    .line 984
    .line 985
    :pswitch_33
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v9

    .line 989
    if-eqz v9, :cond_0

    .line 990
    .line 991
    and-int/2addr v7, v13

    .line 992
    int-to-long v9, v7

    .line 993
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 994
    .line 995
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v7

    .line 999
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v9

    .line 1003
    invoke-virtual {v2, v8, v7, v9}, Landroidx/datastore/preferences/protobuf/J;->b(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 1004
    .line 1005
    .line 1006
    goto/16 :goto_1

    .line 1007
    .line 1008
    :pswitch_34
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v9

    .line 1012
    if-eqz v9, :cond_0

    .line 1013
    .line 1014
    and-int/2addr v7, v13

    .line 1015
    int-to-long v13, v7

    .line 1016
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1017
    .line 1018
    invoke-virtual {v7, v13, v14, v1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1019
    .line 1020
    .line 1021
    move-result-wide v13

    .line 1022
    shl-long v15, v13, v11

    .line 1023
    .line 1024
    shr-long v9, v13, v10

    .line 1025
    .line 1026
    xor-long/2addr v9, v15

    .line 1027
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 1028
    .line 1029
    .line 1030
    goto/16 :goto_1

    .line 1031
    .line 1032
    :pswitch_35
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v9

    .line 1036
    if-eqz v9, :cond_0

    .line 1037
    .line 1038
    and-int/2addr v7, v13

    .line 1039
    int-to-long v9, v7

    .line 1040
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1041
    .line 1042
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1043
    .line 1044
    .line 1045
    move-result v7

    .line 1046
    shl-int/lit8 v9, v7, 0x1

    .line 1047
    .line 1048
    shr-int/lit8 v7, v7, 0x1f

    .line 1049
    .line 1050
    xor-int/2addr v7, v9

    .line 1051
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 1052
    .line 1053
    .line 1054
    goto/16 :goto_1

    .line 1055
    .line 1056
    :pswitch_36
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v9

    .line 1060
    if-eqz v9, :cond_0

    .line 1061
    .line 1062
    and-int/2addr v7, v13

    .line 1063
    int-to-long v9, v7

    .line 1064
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1065
    .line 1066
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v9

    .line 1070
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 1071
    .line 1072
    .line 1073
    goto/16 :goto_1

    .line 1074
    .line 1075
    :pswitch_37
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v9

    .line 1079
    if-eqz v9, :cond_0

    .line 1080
    .line 1081
    and-int/2addr v7, v13

    .line 1082
    int-to-long v9, v7

    .line 1083
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1084
    .line 1085
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1086
    .line 1087
    .line 1088
    move-result v7

    .line 1089
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 1090
    .line 1091
    .line 1092
    goto/16 :goto_1

    .line 1093
    .line 1094
    :pswitch_38
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v9

    .line 1098
    if-eqz v9, :cond_0

    .line 1099
    .line 1100
    and-int/2addr v7, v13

    .line 1101
    int-to-long v9, v7

    .line 1102
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1103
    .line 1104
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1105
    .line 1106
    .line 1107
    move-result v7

    .line 1108
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 1109
    .line 1110
    .line 1111
    goto/16 :goto_1

    .line 1112
    .line 1113
    :pswitch_39
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v9

    .line 1117
    if-eqz v9, :cond_0

    .line 1118
    .line 1119
    and-int/2addr v7, v13

    .line 1120
    int-to-long v9, v7

    .line 1121
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1122
    .line 1123
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v7

    .line 1127
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->S(II)V

    .line 1128
    .line 1129
    .line 1130
    goto/16 :goto_1

    .line 1131
    .line 1132
    :pswitch_3a
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v9

    .line 1136
    if-eqz v9, :cond_0

    .line 1137
    .line 1138
    and-int/2addr v7, v13

    .line 1139
    int-to-long v9, v7

    .line 1140
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1141
    .line 1142
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v7

    .line 1146
    check-cast v7, Landroidx/datastore/preferences/protobuf/g;

    .line 1147
    .line 1148
    invoke-virtual {v2, v8, v7}, Landroidx/datastore/preferences/protobuf/J;->a(ILandroidx/datastore/preferences/protobuf/g;)V

    .line 1149
    .line 1150
    .line 1151
    goto/16 :goto_1

    .line 1152
    .line 1153
    :pswitch_3b
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v9

    .line 1157
    if-eqz v9, :cond_0

    .line 1158
    .line 1159
    and-int/2addr v7, v13

    .line 1160
    int-to-long v9, v7

    .line 1161
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1162
    .line 1163
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v7

    .line 1167
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v9

    .line 1171
    check-cast v7, Landroidx/datastore/preferences/protobuf/a;

    .line 1172
    .line 1173
    invoke-virtual {v12, v8, v7, v9}, Landroidx/datastore/preferences/protobuf/j;->O(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)V

    .line 1174
    .line 1175
    .line 1176
    goto/16 :goto_1

    .line 1177
    .line 1178
    :pswitch_3c
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v9

    .line 1182
    if-eqz v9, :cond_0

    .line 1183
    .line 1184
    and-int/2addr v7, v13

    .line 1185
    int-to-long v9, v7

    .line 1186
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1187
    .line 1188
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v7

    .line 1192
    invoke-static {v8, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_1

    .line 1196
    .line 1197
    :pswitch_3d
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v9

    .line 1201
    if-eqz v9, :cond_0

    .line 1202
    .line 1203
    and-int/2addr v7, v13

    .line 1204
    int-to-long v9, v7

    .line 1205
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1206
    .line 1207
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v7

    .line 1211
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->F(IZ)V

    .line 1212
    .line 1213
    .line 1214
    goto/16 :goto_1

    .line 1215
    .line 1216
    :pswitch_3e
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v9

    .line 1220
    if-eqz v9, :cond_0

    .line 1221
    .line 1222
    and-int/2addr v7, v13

    .line 1223
    int-to-long v9, v7

    .line 1224
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1225
    .line 1226
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1227
    .line 1228
    .line 1229
    move-result v7

    .line 1230
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 1231
    .line 1232
    .line 1233
    goto/16 :goto_1

    .line 1234
    .line 1235
    :pswitch_3f
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v9

    .line 1239
    if-eqz v9, :cond_0

    .line 1240
    .line 1241
    and-int/2addr v7, v13

    .line 1242
    int-to-long v9, v7

    .line 1243
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1244
    .line 1245
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1246
    .line 1247
    .line 1248
    move-result-wide v9

    .line 1249
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_1

    .line 1253
    :pswitch_40
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v9

    .line 1257
    if-eqz v9, :cond_0

    .line 1258
    .line 1259
    and-int/2addr v7, v13

    .line 1260
    int-to-long v9, v7

    .line 1261
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1262
    .line 1263
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1264
    .line 1265
    .line 1266
    move-result v7

    .line 1267
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->M(II)V

    .line 1268
    .line 1269
    .line 1270
    goto :goto_1

    .line 1271
    :pswitch_41
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v9

    .line 1275
    if-eqz v9, :cond_0

    .line 1276
    .line 1277
    and-int/2addr v7, v13

    .line 1278
    int-to-long v9, v7

    .line 1279
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1280
    .line 1281
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v9

    .line 1285
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_1

    .line 1289
    :pswitch_42
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1290
    .line 1291
    .line 1292
    move-result v9

    .line 1293
    if-eqz v9, :cond_0

    .line 1294
    .line 1295
    and-int/2addr v7, v13

    .line 1296
    int-to-long v9, v7

    .line 1297
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1298
    .line 1299
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1300
    .line 1301
    .line 1302
    move-result-wide v9

    .line 1303
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->U(IJ)V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_1

    .line 1307
    :pswitch_43
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v9

    .line 1311
    if-eqz v9, :cond_0

    .line 1312
    .line 1313
    and-int/2addr v7, v13

    .line 1314
    int-to-long v9, v7

    .line 1315
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1316
    .line 1317
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 1318
    .line 1319
    .line 1320
    move-result v7

    .line 1321
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1325
    .line 1326
    .line 1327
    move-result v7

    .line 1328
    invoke-virtual {v12, v8, v7}, Landroidx/datastore/preferences/protobuf/j;->I(II)V

    .line 1329
    .line 1330
    .line 1331
    goto :goto_1

    .line 1332
    :pswitch_44
    invoke-virtual {v0, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v9

    .line 1336
    if-eqz v9, :cond_0

    .line 1337
    .line 1338
    and-int/2addr v7, v13

    .line 1339
    int-to-long v9, v7

    .line 1340
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1341
    .line 1342
    invoke-virtual {v7, v9, v10, v1}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 1343
    .line 1344
    .line 1345
    move-result-wide v9

    .line 1346
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1350
    .line 1351
    .line 1352
    move-result-wide v9

    .line 1353
    invoke-virtual {v12, v8, v9, v10}, Landroidx/datastore/preferences/protobuf/j;->K(IJ)V

    .line 1354
    .line 1355
    .line 1356
    :cond_0
    :goto_1
    add-int/lit8 v6, v6, 0x3

    .line 1357
    .line 1358
    goto/16 :goto_0

    .line 1359
    .line 1360
    :cond_1
    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 1361
    .line 1362
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    check-cast v1, Landroidx/datastore/preferences/protobuf/v;

    .line 1366
    .line 1367
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1368
    .line 1369
    invoke-virtual {v1, v2}, Landroidx/datastore/preferences/protobuf/j0;->d(Landroidx/datastore/preferences/protobuf/J;)V

    .line 1370
    .line 1371
    .line 1372
    return-void

    .line 1373
    :cond_2
    invoke-virtual/range {p0 .. p2}, Landroidx/datastore/preferences/protobuf/S;->L(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/J;)V

    .line 1374
    .line 1375
    .line 1376
    return-void

    .line 1377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroidx/datastore/preferences/protobuf/a;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/S;->o(Landroidx/datastore/preferences/protobuf/a;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/S;->n(Landroidx/datastore/preferences/protobuf/a;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final e(Ljava/lang/Object;LG4/f;Landroidx/datastore/preferences/protobuf/m;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/S;->s(Landroidx/datastore/preferences/protobuf/k0;Ljava/lang/Object;LG4/f;Landroidx/datastore/preferences/protobuf/m;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v3, v2

    .line 18
    int-to-long v6, v3

    .line 19
    aget v1, v1, v0

    .line 20
    .line 21
    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    packed-switch v2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/S;->v(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_1
    move-object v5, p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :pswitch_1
    invoke-virtual {p0, v1, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 42
    .line 43
    invoke-virtual {v2, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/S;->v(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_3
    invoke-virtual {p0, v1, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 65
    .line 66
    invoke-virtual {v2, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_4
    sget-object v1, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 78
    .line 79
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 80
    .line 81
    invoke-virtual {v1, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v3, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v1}, Landroidx/datastore/preferences/protobuf/N;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/M;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_5
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 103
    .line 104
    invoke-virtual {v1, p1, p2, v6, v7}, Landroidx/datastore/preferences/protobuf/G;->b(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;J)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/S;->u(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_0

    .line 117
    .line 118
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 119
    .line 120
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :pswitch_8
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_0

    .line 136
    .line 137
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 138
    .line 139
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_9
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_0

    .line 155
    .line 156
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 157
    .line 158
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v1

    .line 162
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :pswitch_a
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_0

    .line 175
    .line 176
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 177
    .line 178
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :pswitch_b
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_0

    .line 195
    .line 196
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 197
    .line 198
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :pswitch_c
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_0

    .line 215
    .line 216
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 217
    .line 218
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :pswitch_d
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_0

    .line 235
    .line 236
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 237
    .line 238
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/S;->u(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :pswitch_f
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_0

    .line 260
    .line 261
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 262
    .line 263
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {p1, v6, v7, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :pswitch_10
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_0

    .line 280
    .line 281
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 282
    .line 283
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    invoke-virtual {v1, p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/r0;->k(Ljava/lang/Object;JZ)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :pswitch_11
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-eqz v1, :cond_0

    .line 300
    .line 301
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 302
    .line 303
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :pswitch_12
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_0

    .line 320
    .line 321
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 322
    .line 323
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 324
    .line 325
    .line 326
    move-result-wide v1

    .line 327
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :pswitch_13
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_0

    .line 340
    .line 341
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 342
    .line 343
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-static {v6, v7, p1, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :pswitch_14
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_0

    .line 360
    .line 361
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 362
    .line 363
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 364
    .line 365
    .line 366
    move-result-wide v1

    .line 367
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_15
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_0

    .line 380
    .line 381
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 382
    .line 383
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 384
    .line 385
    .line 386
    move-result-wide v1

    .line 387
    invoke-static {p1, v6, v7, v1, v2}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_1

    .line 394
    .line 395
    :pswitch_16
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_0

    .line 400
    .line 401
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 402
    .line 403
    invoke-virtual {v1, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    invoke-virtual {v1, p1, v6, v7, v2}, Landroidx/datastore/preferences/protobuf/r0;->n(Ljava/lang/Object;JF)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_1

    .line 414
    .line 415
    :pswitch_17
    invoke-virtual {p0, v0, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_0

    .line 420
    .line 421
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 422
    .line 423
    invoke-virtual {v4, v6, v7, p2}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 424
    .line 425
    .line 426
    move-result-wide v8

    .line 427
    move-object v5, p1

    .line 428
    invoke-virtual/range {v4 .. v9}, Landroidx/datastore/preferences/protobuf/r0;->m(Ljava/lang/Object;JD)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0, v0, v5}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 435
    .line 436
    move-object p1, v5

    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_1
    move-object v5, p1

    .line 440
    iget-boolean p1, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 441
    .line 442
    if-nez p1, :cond_2

    .line 443
    .line 444
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 445
    .line 446
    invoke-static {p1, v5, p2}, Landroidx/datastore/preferences/protobuf/c0;->x(Landroidx/datastore/preferences/protobuf/k0;Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)V

    .line 447
    .line 448
    .line 449
    :cond_2
    return-void

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Landroidx/datastore/preferences/protobuf/v;)I
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v8, 0x4d5

    .line 24
    .line 25
    const/16 v9, 0x4cf

    .line 26
    .line 27
    const/16 v10, 0x25

    .line 28
    .line 29
    packed-switch v4, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 41
    .line 42
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    mul-int/lit8 v3, v3, 0x35

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    :goto_1
    add-int/2addr v4, v3

    .line 53
    move v3, v4

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    mul-int/lit8 v3, v3, 0x35

    .line 63
    .line 64
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_1

    .line 73
    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    mul-int/lit8 v3, v3, 0x35

    .line 80
    .line 81
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    goto :goto_1

    .line 86
    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    mul-int/lit8 v3, v3, 0x35

    .line 93
    .line 94
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    goto :goto_1

    .line 103
    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_2

    .line 108
    .line 109
    mul-int/lit8 v3, v3, 0x35

    .line 110
    .line 111
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    goto :goto_1

    .line 116
    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    mul-int/lit8 v3, v3, 0x35

    .line 123
    .line 124
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    goto :goto_1

    .line 129
    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    mul-int/lit8 v3, v3, 0x35

    .line 136
    .line 137
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    goto :goto_1

    .line 142
    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_2

    .line 147
    .line 148
    mul-int/lit8 v3, v3, 0x35

    .line 149
    .line 150
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 151
    .line 152
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    goto :goto_1

    .line 161
    :pswitch_8
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 168
    .line 169
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    mul-int/lit8 v3, v3, 0x35

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    goto :goto_1

    .line 180
    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_2

    .line 185
    .line 186
    mul-int/lit8 v3, v3, 0x35

    .line 187
    .line 188
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 189
    .line 190
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_2

    .line 207
    .line 208
    mul-int/lit8 v3, v3, 0x35

    .line 209
    .line 210
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 211
    .line 212
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    sget-object v5, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    .line 223
    .line 224
    if-eqz v4, :cond_0

    .line 225
    .line 226
    :goto_2
    move v8, v9

    .line 227
    :cond_0
    add-int/2addr v8, v3

    .line 228
    move v3, v8

    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_2

    .line 236
    .line 237
    mul-int/lit8 v3, v3, 0x35

    .line 238
    .line 239
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_2

    .line 250
    .line 251
    mul-int/lit8 v3, v3, 0x35

    .line 252
    .line 253
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_2

    .line 268
    .line 269
    mul-int/lit8 v3, v3, 0x35

    .line 270
    .line 271
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_2

    .line 282
    .line 283
    mul-int/lit8 v3, v3, 0x35

    .line 284
    .line 285
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 286
    .line 287
    .line 288
    move-result-wide v4

    .line 289
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_2

    .line 300
    .line 301
    mul-int/lit8 v3, v3, 0x35

    .line 302
    .line 303
    invoke-static {v6, v7, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 304
    .line 305
    .line 306
    move-result-wide v4

    .line 307
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_2

    .line 318
    .line 319
    mul-int/lit8 v3, v3, 0x35

    .line 320
    .line 321
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 322
    .line 323
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Ljava/lang/Float;

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_2

    .line 344
    .line 345
    mul-int/lit8 v3, v3, 0x35

    .line 346
    .line 347
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 348
    .line 349
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    check-cast v4, Ljava/lang/Double;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 356
    .line 357
    .line 358
    move-result-wide v4

    .line 359
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 360
    .line 361
    .line 362
    move-result-wide v4

    .line 363
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 370
    .line 371
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 372
    .line 373
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 384
    .line 385
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 386
    .line 387
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :pswitch_14
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 398
    .line 399
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    if-eqz v4, :cond_1

    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    .line 410
    .line 411
    add-int/2addr v3, v10

    .line 412
    goto/16 :goto_4

    .line 413
    .line 414
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 415
    .line 416
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 417
    .line 418
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 419
    .line 420
    .line 421
    move-result-wide v4

    .line 422
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 429
    .line 430
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 431
    .line 432
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    goto/16 :goto_1

    .line 437
    .line 438
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 439
    .line 440
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 441
    .line 442
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 443
    .line 444
    .line 445
    move-result-wide v4

    .line 446
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 453
    .line 454
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 455
    .line 456
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 463
    .line 464
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 465
    .line 466
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    goto/16 :goto_1

    .line 471
    .line 472
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 473
    .line 474
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 475
    .line 476
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 483
    .line 484
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 485
    .line 486
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    goto/16 :goto_1

    .line 495
    .line 496
    :pswitch_1c
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 497
    .line 498
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    if-eqz v4, :cond_1

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    goto :goto_3

    .line 509
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 510
    .line 511
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 512
    .line 513
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/String;

    .line 518
    .line 519
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    goto/16 :goto_1

    .line 524
    .line 525
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 526
    .line 527
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 528
    .line 529
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    sget-object v5, Landroidx/datastore/preferences/protobuf/y;->a:Ljava/nio/charset/Charset;

    .line 534
    .line 535
    if-eqz v4, :cond_0

    .line 536
    .line 537
    goto/16 :goto_2

    .line 538
    .line 539
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 540
    .line 541
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 542
    .line 543
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    goto/16 :goto_1

    .line 548
    .line 549
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 550
    .line 551
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 552
    .line 553
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 554
    .line 555
    .line 556
    move-result-wide v4

    .line 557
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    goto/16 :goto_1

    .line 562
    .line 563
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 564
    .line 565
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 566
    .line 567
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    goto/16 :goto_1

    .line 572
    .line 573
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 574
    .line 575
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 576
    .line 577
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 578
    .line 579
    .line 580
    move-result-wide v4

    .line 581
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    goto/16 :goto_1

    .line 586
    .line 587
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 588
    .line 589
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 590
    .line 591
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 592
    .line 593
    .line 594
    move-result-wide v4

    .line 595
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    goto/16 :goto_1

    .line 600
    .line 601
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 602
    .line 603
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 604
    .line 605
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 610
    .line 611
    .line 612
    move-result v4

    .line 613
    goto/16 :goto_1

    .line 614
    .line 615
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 616
    .line 617
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 618
    .line 619
    invoke-virtual {v4, v6, v7, p1}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 620
    .line 621
    .line 622
    move-result-wide v4

    .line 623
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 624
    .line 625
    .line 626
    move-result-wide v4

    .line 627
    invoke-static {v4, v5}, Landroidx/datastore/preferences/protobuf/y;->b(J)I

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    goto/16 :goto_1

    .line 632
    .line 633
    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 638
    .line 639
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 645
    .line 646
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/j0;->hashCode()I

    .line 647
    .line 648
    .line 649
    move-result p1

    .line 650
    add-int/2addr p1, v3

    .line 651
    return p1

    .line 652
    nop

    .line 653
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 29
    .line 30
    aget v5, v0, v5

    .line 31
    .line 32
    and-int/2addr v5, v6

    .line 33
    int-to-long v5, v5

    .line 34
    sget-object v9, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 35
    .line 36
    invoke-virtual {v9, v5, v6, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    invoke-virtual {v9, v5, v6, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ne v10, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v9, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v9, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_0
    move v4, v2

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :pswitch_1
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 66
    .line 67
    invoke-virtual {v4, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v5, v4}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :pswitch_2
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 82
    .line 83
    invoke-virtual {v4, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v4, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v5, v4}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_0

    .line 102
    .line 103
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 104
    .line 105
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_0

    .line 126
    .line 127
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 128
    .line 129
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v9

    .line 133
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    cmp-long v5, v9, v5

    .line 138
    .line 139
    if-nez v5, :cond_0

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_0

    .line 148
    .line 149
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 150
    .line 151
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-ne v6, v5, :cond_0

    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_0

    .line 168
    .line 169
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 170
    .line 171
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    cmp-long v5, v9, v5

    .line 180
    .line 181
    if-nez v5, :cond_0

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_0

    .line 190
    .line 191
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 192
    .line 193
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-ne v6, v5, :cond_0

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_0

    .line 210
    .line 211
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 212
    .line 213
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-ne v6, v5, :cond_0

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_0

    .line 230
    .line 231
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 232
    .line 233
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-ne v6, v5, :cond_0

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_0

    .line 250
    .line 251
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 252
    .line 253
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_0

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_0

    .line 274
    .line 275
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 276
    .line 277
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_0

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_0

    .line 298
    .line 299
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 300
    .line 301
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-static {v6, v5}, Landroidx/datastore/preferences/protobuf/c0;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_0

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_0

    .line 322
    .line 323
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 324
    .line 325
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-ne v6, v5, :cond_0

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_0

    .line 342
    .line 343
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 344
    .line 345
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-ne v6, v5, :cond_0

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_0

    .line 362
    .line 363
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 364
    .line 365
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 366
    .line 367
    .line 368
    move-result-wide v9

    .line 369
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v5

    .line 373
    cmp-long v5, v9, v5

    .line 374
    .line 375
    if-nez v5, :cond_0

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_0

    .line 384
    .line 385
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 386
    .line 387
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-ne v6, v5, :cond_0

    .line 396
    .line 397
    goto :goto_1

    .line 398
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_0

    .line 403
    .line 404
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 405
    .line 406
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 407
    .line 408
    .line 409
    move-result-wide v9

    .line 410
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v5

    .line 414
    cmp-long v5, v9, v5

    .line 415
    .line 416
    if-nez v5, :cond_0

    .line 417
    .line 418
    goto :goto_1

    .line 419
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_0

    .line 424
    .line 425
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 426
    .line 427
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 428
    .line 429
    .line 430
    move-result-wide v9

    .line 431
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 432
    .line 433
    .line 434
    move-result-wide v5

    .line 435
    cmp-long v5, v9, v5

    .line 436
    .line 437
    if-nez v5, :cond_0

    .line 438
    .line 439
    goto :goto_1

    .line 440
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-eqz v5, :cond_0

    .line 445
    .line 446
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 447
    .line 448
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-ne v6, v5, :cond_0

    .line 465
    .line 466
    goto :goto_1

    .line 467
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Landroidx/datastore/preferences/protobuf/S;->i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_0

    .line 472
    .line 473
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 474
    .line 475
    invoke-virtual {v5, v7, v8, p1}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 476
    .line 477
    .line 478
    move-result-wide v9

    .line 479
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 480
    .line 481
    .line 482
    move-result-wide v9

    .line 483
    invoke-virtual {v5, v7, v8, p2}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 484
    .line 485
    .line 486
    move-result-wide v5

    .line 487
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 488
    .line 489
    .line 490
    move-result-wide v5

    .line 491
    cmp-long v5, v9, v5

    .line 492
    .line 493
    if-nez v5, :cond_0

    .line 494
    .line 495
    :goto_1
    if-nez v4, :cond_1

    .line 496
    .line 497
    goto :goto_2

    .line 498
    :cond_1
    add-int/lit8 v3, v3, 0x3

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_2
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 508
    .line 509
    iget-object p2, p2, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 510
    .line 511
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/j0;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result p1

    .line 515
    if-nez p1, :cond_3

    .line 516
    .line 517
    :goto_2
    return v2

    .line 518
    :cond_3
    return v4

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final j(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 2
    .line 3
    aget p3, p3, p1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const v0, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p3, v0

    .line 13
    int-to-long v0, p3

    .line 14
    sget-object p3, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 15
    .line 16
    invoke-virtual {p3, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/S;->k(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final k(I)V
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object p1, v0, p1

    .line 8
    .line 9
    return-object p1
.end method

.method public final m(I)Landroidx/datastore/preferences/protobuf/b0;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v0, p1

    .line 8
    .line 9
    check-cast v1, Landroidx/datastore/preferences/protobuf/b0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-object v1, Landroidx/datastore/preferences/protobuf/Y;->c:Landroidx/datastore/preferences/protobuf/Y;

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x1

    .line 17
    .line 18
    aget-object v2, v0, v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/datastore/preferences/protobuf/Y;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/b0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    aput-object v1, v0, p1

    .line 27
    .line 28
    return-object v1
.end method

.method public final n(Landroidx/datastore/preferences/protobuf/a;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 7
    .line 8
    const/4 v5, -0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    :goto_0
    iget-object v9, v0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 13
    .line 14
    array-length v10, v9

    .line 15
    if-ge v6, v10, :cond_8

    .line 16
    .line 17
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    aget v11, v9, v6

    .line 22
    .line 23
    invoke-static {v10}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 24
    .line 25
    .line 26
    move-result v12

    .line 27
    const/16 v13, 0x11

    .line 28
    .line 29
    const v14, 0xfffff

    .line 30
    .line 31
    .line 32
    if-gt v12, v13, :cond_0

    .line 33
    .line 34
    add-int/lit8 v13, v6, 0x2

    .line 35
    .line 36
    aget v9, v9, v13

    .line 37
    .line 38
    and-int v13, v9, v14

    .line 39
    .line 40
    ushr-int/lit8 v9, v9, 0x14

    .line 41
    .line 42
    shl-int v9, v2, v9

    .line 43
    .line 44
    if-eq v13, v5, :cond_1

    .line 45
    .line 46
    int-to-long v4, v13

    .line 47
    invoke-virtual {v3, v1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    move v5, v13

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const/4 v9, 0x0

    .line 54
    :cond_1
    :goto_1
    and-int v4, v10, v14

    .line 55
    .line 56
    int-to-long v13, v4

    .line 57
    const/4 v10, 0x4

    .line 58
    const/16 v15, 0x3f

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    packed-switch v12, :pswitch_data_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :pswitch_0
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_7

    .line 72
    .line 73
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 78
    .line 79
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-static {v11, v4, v9}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    :goto_2
    add-int/2addr v7, v4

    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :pswitch_1
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    shl-long v11, v9, v2

    .line 105
    .line 106
    shr-long/2addr v9, v15

    .line 107
    xor-long/2addr v9, v11

    .line 108
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    :goto_3
    add-int/2addr v9, v4

    .line 113
    :goto_4
    add-int/2addr v7, v9

    .line 114
    goto/16 :goto_a

    .line 115
    .line 116
    :pswitch_2
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_7

    .line 121
    .line 122
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    shl-int/lit8 v10, v4, 0x1

    .line 131
    .line 132
    shr-int/lit8 v4, v4, 0x1f

    .line 133
    .line 134
    xor-int/2addr v4, v10

    .line 135
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    :goto_5
    add-int/2addr v4, v9

    .line 140
    goto :goto_2

    .line 141
    :pswitch_3
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    if-eqz v9, :cond_7

    .line 146
    .line 147
    invoke-static {v11, v4, v7}, LVa/M6;->h(III)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :pswitch_4
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_7

    .line 158
    .line 159
    invoke-static {v11, v10, v7}, LVa/M6;->h(III)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    goto/16 :goto_a

    .line 164
    .line 165
    :pswitch_5
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_7

    .line 170
    .line 171
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    goto :goto_5

    .line 184
    :pswitch_6
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_7

    .line 189
    .line 190
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    goto :goto_5

    .line 203
    :pswitch_7
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_7

    .line 208
    .line 209
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 214
    .line 215
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :pswitch_8
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_7

    .line 226
    .line 227
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    sget-object v10, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 236
    .line 237
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 238
    .line 239
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual {v4, v9}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/b0;)I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    invoke-static {v4, v4, v10, v7}, LVa/M6;->i(IIII)I

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    goto/16 :goto_a

    .line 252
    .line 253
    :pswitch_9
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_7

    .line 258
    .line 259
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    instance-of v9, v4, Landroidx/datastore/preferences/protobuf/g;

    .line 264
    .line 265
    if-eqz v9, :cond_2

    .line 266
    .line 267
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 268
    .line 269
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    :goto_6
    add-int/2addr v4, v7

    .line 274
    move v7, v4

    .line 275
    goto/16 :goto_a

    .line 276
    .line 277
    :cond_2
    check-cast v4, Ljava/lang/String;

    .line 278
    .line 279
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    :goto_7
    add-int/2addr v4, v9

    .line 288
    goto :goto_6

    .line 289
    :pswitch_a
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_7

    .line 294
    .line 295
    invoke-static {v11, v2, v7}, LVa/M6;->h(III)I

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    goto/16 :goto_a

    .line 300
    .line 301
    :pswitch_b
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_7

    .line 306
    .line 307
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->t(I)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    goto/16 :goto_2

    .line 312
    .line 313
    :pswitch_c
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_7

    .line 318
    .line 319
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->u(I)I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :pswitch_d
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-eqz v4, :cond_7

    .line 330
    .line 331
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :pswitch_e
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-eqz v4, :cond_7

    .line 350
    .line 351
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 352
    .line 353
    .line 354
    move-result-wide v9

    .line 355
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    goto/16 :goto_3

    .line 364
    .line 365
    :pswitch_f
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_7

    .line 370
    .line 371
    invoke-static {v13, v14, v1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 372
    .line 373
    .line 374
    move-result-wide v9

    .line 375
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    goto/16 :goto_3

    .line 384
    .line 385
    :pswitch_10
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-eqz v4, :cond_7

    .line 390
    .line 391
    invoke-static {v11, v10, v7}, LVa/M6;->h(III)I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    goto/16 :goto_a

    .line 396
    .line 397
    :pswitch_11
    invoke-virtual {v0, v11, v6, v1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    if-eqz v9, :cond_7

    .line 402
    .line 403
    invoke-static {v11, v4, v7}, LVa/M6;->h(III)I

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    goto/16 :goto_a

    .line 408
    .line 409
    :pswitch_12
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->l(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v9

    .line 417
    iget-object v10, v0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 418
    .line 419
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-static {v11, v4, v9}, Landroidx/datastore/preferences/protobuf/N;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    goto/16 :goto_2

    .line 427
    .line 428
    :pswitch_13
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    check-cast v4, Ljava/util/List;

    .line 433
    .line 434
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    sget-object v10, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 439
    .line 440
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 441
    .line 442
    .line 443
    move-result v10

    .line 444
    if-nez v10, :cond_3

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    goto :goto_9

    .line 448
    :cond_3
    const/4 v12, 0x0

    .line 449
    const/4 v13, 0x0

    .line 450
    :goto_8
    if-ge v12, v10, :cond_4

    .line 451
    .line 452
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    check-cast v14, Landroidx/datastore/preferences/protobuf/a;

    .line 457
    .line 458
    invoke-static {v11, v14, v9}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    add-int/2addr v13, v14

    .line 463
    add-int/2addr v12, v2

    .line 464
    goto :goto_8

    .line 465
    :cond_4
    :goto_9
    add-int/2addr v7, v13

    .line 466
    goto/16 :goto_a

    .line 467
    .line 468
    :pswitch_14
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    check-cast v4, Ljava/util/List;

    .line 473
    .line 474
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->p(Ljava/util/List;)I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    if-lez v4, :cond_7

    .line 479
    .line 480
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 481
    .line 482
    .line 483
    move-result v9

    .line 484
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    goto/16 :goto_a

    .line 489
    .line 490
    :pswitch_15
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    check-cast v4, Ljava/util/List;

    .line 495
    .line 496
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->n(Ljava/util/List;)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-lez v4, :cond_7

    .line 501
    .line 502
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    goto/16 :goto_a

    .line 511
    .line 512
    :pswitch_16
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    check-cast v4, Ljava/util/List;

    .line 517
    .line 518
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    if-lez v4, :cond_7

    .line 523
    .line 524
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 529
    .line 530
    .line 531
    move-result v7

    .line 532
    goto/16 :goto_a

    .line 533
    .line 534
    :pswitch_17
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    check-cast v4, Ljava/util/List;

    .line 539
    .line 540
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    if-lez v4, :cond_7

    .line 545
    .line 546
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 547
    .line 548
    .line 549
    move-result v9

    .line 550
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 551
    .line 552
    .line 553
    move-result v7

    .line 554
    goto/16 :goto_a

    .line 555
    .line 556
    :pswitch_18
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    check-cast v4, Ljava/util/List;

    .line 561
    .line 562
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->c(Ljava/util/List;)I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    if-lez v4, :cond_7

    .line 567
    .line 568
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    goto/16 :goto_a

    .line 577
    .line 578
    :pswitch_19
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    check-cast v4, Ljava/util/List;

    .line 583
    .line 584
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->s(Ljava/util/List;)I

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    if-lez v4, :cond_7

    .line 589
    .line 590
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 591
    .line 592
    .line 593
    move-result v9

    .line 594
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    goto/16 :goto_a

    .line 599
    .line 600
    :pswitch_1a
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    check-cast v4, Ljava/util/List;

    .line 605
    .line 606
    sget-object v9, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 607
    .line 608
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    if-lez v4, :cond_7

    .line 613
    .line 614
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    goto/16 :goto_a

    .line 623
    .line 624
    :pswitch_1b
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    check-cast v4, Ljava/util/List;

    .line 629
    .line 630
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    if-lez v4, :cond_7

    .line 635
    .line 636
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 637
    .line 638
    .line 639
    move-result v9

    .line 640
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    goto/16 :goto_a

    .line 645
    .line 646
    :pswitch_1c
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    check-cast v4, Ljava/util/List;

    .line 651
    .line 652
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-lez v4, :cond_7

    .line 657
    .line 658
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    goto/16 :goto_a

    .line 667
    .line 668
    :pswitch_1d
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    check-cast v4, Ljava/util/List;

    .line 673
    .line 674
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->i(Ljava/util/List;)I

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    if-lez v4, :cond_7

    .line 679
    .line 680
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 681
    .line 682
    .line 683
    move-result v9

    .line 684
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 685
    .line 686
    .line 687
    move-result v7

    .line 688
    goto/16 :goto_a

    .line 689
    .line 690
    :pswitch_1e
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    check-cast v4, Ljava/util/List;

    .line 695
    .line 696
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->u(Ljava/util/List;)I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    if-lez v4, :cond_7

    .line 701
    .line 702
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 703
    .line 704
    .line 705
    move-result v9

    .line 706
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 707
    .line 708
    .line 709
    move-result v7

    .line 710
    goto/16 :goto_a

    .line 711
    .line 712
    :pswitch_1f
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    check-cast v4, Ljava/util/List;

    .line 717
    .line 718
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->k(Ljava/util/List;)I

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    if-lez v4, :cond_7

    .line 723
    .line 724
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 729
    .line 730
    .line 731
    move-result v7

    .line 732
    goto/16 :goto_a

    .line 733
    .line 734
    :pswitch_20
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    check-cast v4, Ljava/util/List;

    .line 739
    .line 740
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 741
    .line 742
    .line 743
    move-result v4

    .line 744
    if-lez v4, :cond_7

    .line 745
    .line 746
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    goto/16 :goto_a

    .line 755
    .line 756
    :pswitch_21
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    check-cast v4, Ljava/util/List;

    .line 761
    .line 762
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    if-lez v4, :cond_7

    .line 767
    .line 768
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 769
    .line 770
    .line 771
    move-result v9

    .line 772
    invoke-static {v4, v9, v4, v7}, LVa/M6;->i(IIII)I

    .line 773
    .line 774
    .line 775
    move-result v7

    .line 776
    goto/16 :goto_a

    .line 777
    .line 778
    :pswitch_22
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    check-cast v4, Ljava/util/List;

    .line 783
    .line 784
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->o(ILjava/util/List;)I

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    goto/16 :goto_2

    .line 789
    .line 790
    :pswitch_23
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    check-cast v4, Ljava/util/List;

    .line 795
    .line 796
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->m(ILjava/util/List;)I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    goto/16 :goto_2

    .line 801
    .line 802
    :pswitch_24
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    check-cast v4, Ljava/util/List;

    .line 807
    .line 808
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    goto/16 :goto_2

    .line 813
    .line 814
    :pswitch_25
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    check-cast v4, Ljava/util/List;

    .line 819
    .line 820
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    goto/16 :goto_2

    .line 825
    .line 826
    :pswitch_26
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    check-cast v4, Ljava/util/List;

    .line 831
    .line 832
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->b(ILjava/util/List;)I

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    goto/16 :goto_2

    .line 837
    .line 838
    :pswitch_27
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    check-cast v4, Ljava/util/List;

    .line 843
    .line 844
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->r(ILjava/util/List;)I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    goto/16 :goto_2

    .line 849
    .line 850
    :pswitch_28
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    check-cast v4, Ljava/util/List;

    .line 855
    .line 856
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->a(ILjava/util/List;)I

    .line 857
    .line 858
    .line 859
    move-result v4

    .line 860
    goto/16 :goto_2

    .line 861
    .line 862
    :pswitch_29
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v4

    .line 866
    check-cast v4, Ljava/util/List;

    .line 867
    .line 868
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 869
    .line 870
    .line 871
    move-result-object v9

    .line 872
    invoke-static {v11, v4, v9}, Landroidx/datastore/preferences/protobuf/c0;->l(ILjava/util/List;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 873
    .line 874
    .line 875
    move-result v4

    .line 876
    goto/16 :goto_2

    .line 877
    .line 878
    :pswitch_2a
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v4

    .line 882
    check-cast v4, Ljava/util/List;

    .line 883
    .line 884
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->q(ILjava/util/List;)I

    .line 885
    .line 886
    .line 887
    move-result v4

    .line 888
    goto/16 :goto_2

    .line 889
    .line 890
    :pswitch_2b
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    check-cast v4, Ljava/util/List;

    .line 895
    .line 896
    sget-object v9, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 897
    .line 898
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    if-nez v4, :cond_5

    .line 903
    .line 904
    const/4 v9, 0x0

    .line 905
    goto/16 :goto_4

    .line 906
    .line 907
    :cond_5
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 908
    .line 909
    .line 910
    move-result v9

    .line 911
    add-int/2addr v9, v2

    .line 912
    mul-int/2addr v9, v4

    .line 913
    goto/16 :goto_4

    .line 914
    .line 915
    :pswitch_2c
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v4

    .line 919
    check-cast v4, Ljava/util/List;

    .line 920
    .line 921
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 922
    .line 923
    .line 924
    move-result v4

    .line 925
    goto/16 :goto_2

    .line 926
    .line 927
    :pswitch_2d
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    check-cast v4, Ljava/util/List;

    .line 932
    .line 933
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 934
    .line 935
    .line 936
    move-result v4

    .line 937
    goto/16 :goto_2

    .line 938
    .line 939
    :pswitch_2e
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v4

    .line 943
    check-cast v4, Ljava/util/List;

    .line 944
    .line 945
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->h(ILjava/util/List;)I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    goto/16 :goto_2

    .line 950
    .line 951
    :pswitch_2f
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    check-cast v4, Ljava/util/List;

    .line 956
    .line 957
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->t(ILjava/util/List;)I

    .line 958
    .line 959
    .line 960
    move-result v4

    .line 961
    goto/16 :goto_2

    .line 962
    .line 963
    :pswitch_30
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    check-cast v4, Ljava/util/List;

    .line 968
    .line 969
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->j(ILjava/util/List;)I

    .line 970
    .line 971
    .line 972
    move-result v4

    .line 973
    goto/16 :goto_2

    .line 974
    .line 975
    :pswitch_31
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    check-cast v4, Ljava/util/List;

    .line 980
    .line 981
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 982
    .line 983
    .line 984
    move-result v4

    .line 985
    goto/16 :goto_2

    .line 986
    .line 987
    :pswitch_32
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v4

    .line 991
    check-cast v4, Ljava/util/List;

    .line 992
    .line 993
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    goto/16 :goto_2

    .line 998
    .line 999
    :pswitch_33
    and-int v4, v8, v9

    .line 1000
    .line 1001
    if-eqz v4, :cond_7

    .line 1002
    .line 1003
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 1008
    .line 1009
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v9

    .line 1013
    invoke-static {v11, v4, v9}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    goto/16 :goto_2

    .line 1018
    .line 1019
    :pswitch_34
    and-int v4, v8, v9

    .line 1020
    .line 1021
    if-eqz v4, :cond_7

    .line 1022
    .line 1023
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v9

    .line 1027
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1028
    .line 1029
    .line 1030
    move-result v4

    .line 1031
    shl-long v11, v9, v2

    .line 1032
    .line 1033
    shr-long/2addr v9, v15

    .line 1034
    xor-long/2addr v9, v11

    .line 1035
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1036
    .line 1037
    .line 1038
    move-result v9

    .line 1039
    goto/16 :goto_3

    .line 1040
    .line 1041
    :pswitch_35
    and-int v4, v8, v9

    .line 1042
    .line 1043
    if-eqz v4, :cond_7

    .line 1044
    .line 1045
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1046
    .line 1047
    .line 1048
    move-result v4

    .line 1049
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1050
    .line 1051
    .line 1052
    move-result v9

    .line 1053
    shl-int/lit8 v10, v4, 0x1

    .line 1054
    .line 1055
    shr-int/lit8 v4, v4, 0x1f

    .line 1056
    .line 1057
    xor-int/2addr v4, v10

    .line 1058
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 1059
    .line 1060
    .line 1061
    move-result v4

    .line 1062
    goto/16 :goto_5

    .line 1063
    .line 1064
    :pswitch_36
    and-int/2addr v9, v8

    .line 1065
    if-eqz v9, :cond_7

    .line 1066
    .line 1067
    invoke-static {v11, v4, v7}, LVa/M6;->h(III)I

    .line 1068
    .line 1069
    .line 1070
    move-result v7

    .line 1071
    goto/16 :goto_a

    .line 1072
    .line 1073
    :pswitch_37
    and-int v4, v8, v9

    .line 1074
    .line 1075
    if-eqz v4, :cond_7

    .line 1076
    .line 1077
    invoke-static {v11, v10, v7}, LVa/M6;->h(III)I

    .line 1078
    .line 1079
    .line 1080
    move-result v7

    .line 1081
    goto/16 :goto_a

    .line 1082
    .line 1083
    :pswitch_38
    and-int v4, v8, v9

    .line 1084
    .line 1085
    if-eqz v4, :cond_7

    .line 1086
    .line 1087
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1088
    .line 1089
    .line 1090
    move-result v4

    .line 1091
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1092
    .line 1093
    .line 1094
    move-result v9

    .line 1095
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 1096
    .line 1097
    .line 1098
    move-result v4

    .line 1099
    goto/16 :goto_5

    .line 1100
    .line 1101
    :pswitch_39
    and-int v4, v8, v9

    .line 1102
    .line 1103
    if-eqz v4, :cond_7

    .line 1104
    .line 1105
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1110
    .line 1111
    .line 1112
    move-result v9

    .line 1113
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v4

    .line 1117
    goto/16 :goto_5

    .line 1118
    .line 1119
    :pswitch_3a
    and-int v4, v8, v9

    .line 1120
    .line 1121
    if-eqz v4, :cond_7

    .line 1122
    .line 1123
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v4

    .line 1127
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 1128
    .line 1129
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1130
    .line 1131
    .line 1132
    move-result v4

    .line 1133
    goto/16 :goto_2

    .line 1134
    .line 1135
    :pswitch_3b
    and-int v4, v8, v9

    .line 1136
    .line 1137
    if-eqz v4, :cond_7

    .line 1138
    .line 1139
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v4

    .line 1143
    invoke-virtual {v0, v6}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v9

    .line 1147
    sget-object v10, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 1148
    .line 1149
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 1150
    .line 1151
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1152
    .line 1153
    .line 1154
    move-result v10

    .line 1155
    invoke-virtual {v4, v9}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/b0;)I

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    invoke-static {v4, v4, v10, v7}, LVa/M6;->i(IIII)I

    .line 1160
    .line 1161
    .line 1162
    move-result v7

    .line 1163
    goto/16 :goto_a

    .line 1164
    .line 1165
    :pswitch_3c
    and-int v4, v8, v9

    .line 1166
    .line 1167
    if-eqz v4, :cond_7

    .line 1168
    .line 1169
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v4

    .line 1173
    instance-of v9, v4, Landroidx/datastore/preferences/protobuf/g;

    .line 1174
    .line 1175
    if-eqz v9, :cond_6

    .line 1176
    .line 1177
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 1178
    .line 1179
    invoke-static {v11, v4}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1180
    .line 1181
    .line 1182
    move-result v4

    .line 1183
    goto/16 :goto_6

    .line 1184
    .line 1185
    :cond_6
    check-cast v4, Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1188
    .line 1189
    .line 1190
    move-result v9

    .line 1191
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v4

    .line 1195
    goto/16 :goto_7

    .line 1196
    .line 1197
    :pswitch_3d
    and-int v4, v8, v9

    .line 1198
    .line 1199
    if-eqz v4, :cond_7

    .line 1200
    .line 1201
    invoke-static {v11, v2, v7}, LVa/M6;->h(III)I

    .line 1202
    .line 1203
    .line 1204
    move-result v7

    .line 1205
    goto :goto_a

    .line 1206
    :pswitch_3e
    and-int v4, v8, v9

    .line 1207
    .line 1208
    if-eqz v4, :cond_7

    .line 1209
    .line 1210
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->t(I)I

    .line 1211
    .line 1212
    .line 1213
    move-result v4

    .line 1214
    goto/16 :goto_2

    .line 1215
    .line 1216
    :pswitch_3f
    and-int v4, v8, v9

    .line 1217
    .line 1218
    if-eqz v4, :cond_7

    .line 1219
    .line 1220
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->u(I)I

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    goto/16 :goto_2

    .line 1225
    .line 1226
    :pswitch_40
    and-int v4, v8, v9

    .line 1227
    .line 1228
    if-eqz v4, :cond_7

    .line 1229
    .line 1230
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1231
    .line 1232
    .line 1233
    move-result v4

    .line 1234
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1235
    .line 1236
    .line 1237
    move-result v9

    .line 1238
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 1239
    .line 1240
    .line 1241
    move-result v4

    .line 1242
    goto/16 :goto_5

    .line 1243
    .line 1244
    :pswitch_41
    and-int v4, v8, v9

    .line 1245
    .line 1246
    if-eqz v4, :cond_7

    .line 1247
    .line 1248
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v9

    .line 1252
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1253
    .line 1254
    .line 1255
    move-result v4

    .line 1256
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1257
    .line 1258
    .line 1259
    move-result v9

    .line 1260
    goto/16 :goto_3

    .line 1261
    .line 1262
    :pswitch_42
    and-int v4, v8, v9

    .line 1263
    .line 1264
    if-eqz v4, :cond_7

    .line 1265
    .line 1266
    invoke-virtual {v3, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1267
    .line 1268
    .line 1269
    move-result-wide v9

    .line 1270
    invoke-static {v11}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1271
    .line 1272
    .line 1273
    move-result v4

    .line 1274
    invoke-static {v9, v10}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1275
    .line 1276
    .line 1277
    move-result v9

    .line 1278
    goto/16 :goto_3

    .line 1279
    .line 1280
    :pswitch_43
    and-int v4, v8, v9

    .line 1281
    .line 1282
    if-eqz v4, :cond_7

    .line 1283
    .line 1284
    invoke-static {v11, v10, v7}, LVa/M6;->h(III)I

    .line 1285
    .line 1286
    .line 1287
    move-result v7

    .line 1288
    goto :goto_a

    .line 1289
    :pswitch_44
    and-int/2addr v9, v8

    .line 1290
    if-eqz v9, :cond_7

    .line 1291
    .line 1292
    invoke-static {v11, v4, v7}, LVa/M6;->h(III)I

    .line 1293
    .line 1294
    .line 1295
    move-result v7

    .line 1296
    :cond_7
    :goto_a
    add-int/lit8 v6, v6, 0x3

    .line 1297
    .line 1298
    goto/16 :goto_0

    .line 1299
    .line 1300
    :cond_8
    iget-object v2, v0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1303
    .line 1304
    .line 1305
    check-cast v1, Landroidx/datastore/preferences/protobuf/v;

    .line 1306
    .line 1307
    iget-object v1, v1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1308
    .line 1309
    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/j0;->a()I

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    add-int/2addr v1, v7

    .line 1314
    return v1

    .line 1315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newInstance()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->k:Landroidx/datastore/preferences/protobuf/U;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->e:Landroidx/datastore/preferences/protobuf/v;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/v;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final o(Landroidx/datastore/preferences/protobuf/a;)I
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Landroidx/datastore/preferences/protobuf/S;->p:Lsun/misc/Unsafe;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 8
    .line 9
    array-length v6, v5

    .line 10
    if-ge v3, v6, :cond_7

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    aget v8, v5, v3

    .line 21
    .line 22
    const v9, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr v6, v9

    .line 26
    int-to-long v9, v6

    .line 27
    sget-object v6, Landroidx/datastore/preferences/protobuf/q;->b:Landroidx/datastore/preferences/protobuf/q;

    .line 28
    .line 29
    iget v6, v6, Landroidx/datastore/preferences/protobuf/q;->a:I

    .line 30
    .line 31
    if-lt v7, v6, :cond_0

    .line 32
    .line 33
    sget-object v6, Landroidx/datastore/preferences/protobuf/q;->c:Landroidx/datastore/preferences/protobuf/q;

    .line 34
    .line 35
    iget v6, v6, Landroidx/datastore/preferences/protobuf/q;->a:I

    .line 36
    .line 37
    if-gt v7, v6, :cond_0

    .line 38
    .line 39
    add-int/lit8 v6, v3, 0x2

    .line 40
    .line 41
    aget v5, v5, v6

    .line 42
    .line 43
    :cond_0
    const/16 v5, 0x3f

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    const/16 v11, 0x8

    .line 47
    .line 48
    packed-switch v7, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_a

    .line 52
    .line 53
    :pswitch_0
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_6

    .line 58
    .line 59
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 60
    .line 61
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Landroidx/datastore/preferences/protobuf/a;

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v8, v5, v6}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    :goto_1
    add-int/2addr v4, v5

    .line 76
    goto/16 :goto_a

    .line 77
    .line 78
    :pswitch_1
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    shl-long v9, v6, v0

    .line 93
    .line 94
    shr-long v5, v6, v5

    .line 95
    .line 96
    xor-long/2addr v5, v9

    .line 97
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    :goto_2
    add-int/2addr v5, v8

    .line 102
    goto :goto_1

    .line 103
    :pswitch_2
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_6

    .line 108
    .line 109
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    shl-int/lit8 v7, v5, 0x1

    .line 118
    .line 119
    shr-int/lit8 v5, v5, 0x1f

    .line 120
    .line 121
    xor-int/2addr v5, v7

    .line 122
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    :goto_3
    add-int/2addr v5, v6

    .line 127
    goto :goto_1

    .line 128
    :pswitch_3
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_6

    .line 133
    .line 134
    invoke-static {v8, v11, v4}, LVa/M6;->h(III)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    goto/16 :goto_a

    .line 139
    .line 140
    :pswitch_4
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    invoke-static {v8, v6, v4}, LVa/M6;->h(III)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    goto/16 :goto_a

    .line 151
    .line 152
    :pswitch_5
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    goto :goto_3

    .line 171
    :pswitch_6
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_6

    .line 176
    .line 177
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    goto :goto_3

    .line 190
    :pswitch_7
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_6

    .line 195
    .line 196
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 197
    .line 198
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Landroidx/datastore/preferences/protobuf/g;

    .line 203
    .line 204
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :pswitch_8
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_6

    .line 215
    .line 216
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 217
    .line 218
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    sget-object v7, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 227
    .line 228
    check-cast v5, Landroidx/datastore/preferences/protobuf/a;

    .line 229
    .line 230
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-virtual {v5, v6}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/b0;)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-static {v5, v5, v7, v4}, LVa/M6;->i(IIII)I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    goto/16 :goto_a

    .line 243
    .line 244
    :pswitch_9
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_6

    .line 249
    .line 250
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 251
    .line 252
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    instance-of v6, v5, Landroidx/datastore/preferences/protobuf/g;

    .line 257
    .line 258
    if-eqz v6, :cond_1

    .line 259
    .line 260
    check-cast v5, Landroidx/datastore/preferences/protobuf/g;

    .line 261
    .line 262
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    :goto_4
    add-int/2addr v5, v4

    .line 267
    move v4, v5

    .line 268
    goto/16 :goto_a

    .line 269
    .line 270
    :cond_1
    check-cast v5, Ljava/lang/String;

    .line 271
    .line 272
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    :goto_5
    add-int/2addr v5, v6

    .line 281
    goto :goto_4

    .line 282
    :pswitch_a
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-eqz v5, :cond_6

    .line 287
    .line 288
    invoke-static {v8, v0, v4}, LVa/M6;->h(III)I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    goto/16 :goto_a

    .line 293
    .line 294
    :pswitch_b
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_6

    .line 299
    .line 300
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->t(I)I

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    goto/16 :goto_1

    .line 305
    .line 306
    :pswitch_c
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_6

    .line 311
    .line 312
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->u(I)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :pswitch_d
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_6

    .line 323
    .line 324
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->z(JLjava/lang/Object;)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    goto/16 :goto_3

    .line 337
    .line 338
    :pswitch_e
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_6

    .line 343
    .line 344
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 345
    .line 346
    .line 347
    move-result-wide v5

    .line 348
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    :goto_6
    add-int/2addr v5, v7

    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :pswitch_f
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_6

    .line 364
    .line 365
    invoke-static {v9, v10, p1}, Landroidx/datastore/preferences/protobuf/S;->A(JLjava/lang/Object;)J

    .line 366
    .line 367
    .line 368
    move-result-wide v5

    .line 369
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    goto :goto_6

    .line 378
    :pswitch_10
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-eqz v5, :cond_6

    .line 383
    .line 384
    invoke-static {v8, v6, v4}, LVa/M6;->h(III)I

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    goto/16 :goto_a

    .line 389
    .line 390
    :pswitch_11
    invoke-virtual {p0, v8, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    if-eqz v5, :cond_6

    .line 395
    .line 396
    invoke-static {v8, v11, v4}, LVa/M6;->h(III)I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    goto/16 :goto_a

    .line 401
    .line 402
    :pswitch_12
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 403
    .line 404
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->l(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    iget-object v7, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 413
    .line 414
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-static {v8, v5, v6}, Landroidx/datastore/preferences/protobuf/N;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    goto/16 :goto_1

    .line 422
    .line 423
    :pswitch_13
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    sget-object v7, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 432
    .line 433
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    if-nez v7, :cond_2

    .line 438
    .line 439
    move v10, v2

    .line 440
    goto :goto_8

    .line 441
    :cond_2
    move v9, v2

    .line 442
    move v10, v9

    .line 443
    :goto_7
    if-ge v9, v7, :cond_3

    .line 444
    .line 445
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v11

    .line 449
    check-cast v11, Landroidx/datastore/preferences/protobuf/a;

    .line 450
    .line 451
    invoke-static {v8, v11, v6}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 452
    .line 453
    .line 454
    move-result v11

    .line 455
    add-int/2addr v10, v11

    .line 456
    add-int/2addr v9, v0

    .line 457
    goto :goto_7

    .line 458
    :cond_3
    :goto_8
    add-int/2addr v4, v10

    .line 459
    goto/16 :goto_a

    .line 460
    .line 461
    :pswitch_14
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    check-cast v5, Ljava/util/List;

    .line 466
    .line 467
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->p(Ljava/util/List;)I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-lez v5, :cond_6

    .line 472
    .line 473
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    goto/16 :goto_a

    .line 482
    .line 483
    :pswitch_15
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    check-cast v5, Ljava/util/List;

    .line 488
    .line 489
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->n(Ljava/util/List;)I

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    if-lez v5, :cond_6

    .line 494
    .line 495
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    goto/16 :goto_a

    .line 504
    .line 505
    :pswitch_16
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    check-cast v5, Ljava/util/List;

    .line 510
    .line 511
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-lez v5, :cond_6

    .line 516
    .line 517
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 518
    .line 519
    .line 520
    move-result v6

    .line 521
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    goto/16 :goto_a

    .line 526
    .line 527
    :pswitch_17
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    check-cast v5, Ljava/util/List;

    .line 532
    .line 533
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    if-lez v5, :cond_6

    .line 538
    .line 539
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 540
    .line 541
    .line 542
    move-result v6

    .line 543
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    goto/16 :goto_a

    .line 548
    .line 549
    :pswitch_18
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    check-cast v5, Ljava/util/List;

    .line 554
    .line 555
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->c(Ljava/util/List;)I

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    if-lez v5, :cond_6

    .line 560
    .line 561
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    goto/16 :goto_a

    .line 570
    .line 571
    :pswitch_19
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    check-cast v5, Ljava/util/List;

    .line 576
    .line 577
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->s(Ljava/util/List;)I

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-lez v5, :cond_6

    .line 582
    .line 583
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 588
    .line 589
    .line 590
    move-result v4

    .line 591
    goto/16 :goto_a

    .line 592
    .line 593
    :pswitch_1a
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    check-cast v5, Ljava/util/List;

    .line 598
    .line 599
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 600
    .line 601
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    if-lez v5, :cond_6

    .line 606
    .line 607
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 608
    .line 609
    .line 610
    move-result v6

    .line 611
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    goto/16 :goto_a

    .line 616
    .line 617
    :pswitch_1b
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    check-cast v5, Ljava/util/List;

    .line 622
    .line 623
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 624
    .line 625
    .line 626
    move-result v5

    .line 627
    if-lez v5, :cond_6

    .line 628
    .line 629
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 630
    .line 631
    .line 632
    move-result v6

    .line 633
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    goto/16 :goto_a

    .line 638
    .line 639
    :pswitch_1c
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    check-cast v5, Ljava/util/List;

    .line 644
    .line 645
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    if-lez v5, :cond_6

    .line 650
    .line 651
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 652
    .line 653
    .line 654
    move-result v6

    .line 655
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    goto/16 :goto_a

    .line 660
    .line 661
    :pswitch_1d
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    check-cast v5, Ljava/util/List;

    .line 666
    .line 667
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->i(Ljava/util/List;)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    if-lez v5, :cond_6

    .line 672
    .line 673
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 678
    .line 679
    .line 680
    move-result v4

    .line 681
    goto/16 :goto_a

    .line 682
    .line 683
    :pswitch_1e
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    check-cast v5, Ljava/util/List;

    .line 688
    .line 689
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->u(Ljava/util/List;)I

    .line 690
    .line 691
    .line 692
    move-result v5

    .line 693
    if-lez v5, :cond_6

    .line 694
    .line 695
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 700
    .line 701
    .line 702
    move-result v4

    .line 703
    goto/16 :goto_a

    .line 704
    .line 705
    :pswitch_1f
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    check-cast v5, Ljava/util/List;

    .line 710
    .line 711
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->k(Ljava/util/List;)I

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    if-lez v5, :cond_6

    .line 716
    .line 717
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 718
    .line 719
    .line 720
    move-result v6

    .line 721
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    goto/16 :goto_a

    .line 726
    .line 727
    :pswitch_20
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    check-cast v5, Ljava/util/List;

    .line 732
    .line 733
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->e(Ljava/util/List;)I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-lez v5, :cond_6

    .line 738
    .line 739
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    goto/16 :goto_a

    .line 748
    .line 749
    :pswitch_21
    invoke-virtual {v1, p1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v5

    .line 753
    check-cast v5, Ljava/util/List;

    .line 754
    .line 755
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/c0;->g(Ljava/util/List;)I

    .line 756
    .line 757
    .line 758
    move-result v5

    .line 759
    if-lez v5, :cond_6

    .line 760
    .line 761
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    invoke-static {v5, v6, v5, v4}, LVa/M6;->i(IIII)I

    .line 766
    .line 767
    .line 768
    move-result v4

    .line 769
    goto/16 :goto_a

    .line 770
    .line 771
    :pswitch_22
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->o(ILjava/util/List;)I

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    goto/16 :goto_1

    .line 780
    .line 781
    :pswitch_23
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->m(ILjava/util/List;)I

    .line 786
    .line 787
    .line 788
    move-result v5

    .line 789
    goto/16 :goto_1

    .line 790
    .line 791
    :pswitch_24
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 796
    .line 797
    .line 798
    move-result v5

    .line 799
    goto/16 :goto_1

    .line 800
    .line 801
    :pswitch_25
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 806
    .line 807
    .line 808
    move-result v5

    .line 809
    goto/16 :goto_1

    .line 810
    .line 811
    :pswitch_26
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->b(ILjava/util/List;)I

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    goto/16 :goto_1

    .line 820
    .line 821
    :pswitch_27
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 822
    .line 823
    .line 824
    move-result-object v5

    .line 825
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->r(ILjava/util/List;)I

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    goto/16 :goto_1

    .line 830
    .line 831
    :pswitch_28
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->a(ILjava/util/List;)I

    .line 836
    .line 837
    .line 838
    move-result v5

    .line 839
    goto/16 :goto_1

    .line 840
    .line 841
    :pswitch_29
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 842
    .line 843
    .line 844
    move-result-object v5

    .line 845
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    invoke-static {v8, v5, v6}, Landroidx/datastore/preferences/protobuf/c0;->l(ILjava/util/List;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 850
    .line 851
    .line 852
    move-result v5

    .line 853
    goto/16 :goto_1

    .line 854
    .line 855
    :pswitch_2a
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->q(ILjava/util/List;)I

    .line 860
    .line 861
    .line 862
    move-result v5

    .line 863
    goto/16 :goto_1

    .line 864
    .line 865
    :pswitch_2b
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    sget-object v6, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 870
    .line 871
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 872
    .line 873
    .line 874
    move-result v5

    .line 875
    if-nez v5, :cond_4

    .line 876
    .line 877
    move v6, v2

    .line 878
    goto :goto_9

    .line 879
    :cond_4
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 880
    .line 881
    .line 882
    move-result v6

    .line 883
    add-int/2addr v6, v0

    .line 884
    mul-int/2addr v6, v5

    .line 885
    :goto_9
    add-int/2addr v4, v6

    .line 886
    goto/16 :goto_a

    .line 887
    .line 888
    :pswitch_2c
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v5

    .line 892
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 893
    .line 894
    .line 895
    move-result v5

    .line 896
    goto/16 :goto_1

    .line 897
    .line 898
    :pswitch_2d
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 899
    .line 900
    .line 901
    move-result-object v5

    .line 902
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 903
    .line 904
    .line 905
    move-result v5

    .line 906
    goto/16 :goto_1

    .line 907
    .line 908
    :pswitch_2e
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->h(ILjava/util/List;)I

    .line 913
    .line 914
    .line 915
    move-result v5

    .line 916
    goto/16 :goto_1

    .line 917
    .line 918
    :pswitch_2f
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->t(ILjava/util/List;)I

    .line 923
    .line 924
    .line 925
    move-result v5

    .line 926
    goto/16 :goto_1

    .line 927
    .line 928
    :pswitch_30
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 929
    .line 930
    .line 931
    move-result-object v5

    .line 932
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->j(ILjava/util/List;)I

    .line 933
    .line 934
    .line 935
    move-result v5

    .line 936
    goto/16 :goto_1

    .line 937
    .line 938
    :pswitch_31
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 939
    .line 940
    .line 941
    move-result-object v5

    .line 942
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->d(ILjava/util/List;)I

    .line 943
    .line 944
    .line 945
    move-result v5

    .line 946
    goto/16 :goto_1

    .line 947
    .line 948
    :pswitch_32
    invoke-static {p1, v9, v10}, Landroidx/datastore/preferences/protobuf/S;->r(Landroidx/datastore/preferences/protobuf/a;J)Ljava/util/List;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/c0;->f(ILjava/util/List;)I

    .line 953
    .line 954
    .line 955
    move-result v5

    .line 956
    goto/16 :goto_1

    .line 957
    .line 958
    :pswitch_33
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v5

    .line 962
    if-eqz v5, :cond_6

    .line 963
    .line 964
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 965
    .line 966
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v5

    .line 970
    check-cast v5, Landroidx/datastore/preferences/protobuf/a;

    .line 971
    .line 972
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    invoke-static {v8, v5, v6}, Landroidx/datastore/preferences/protobuf/j;->v(ILandroidx/datastore/preferences/protobuf/a;Landroidx/datastore/preferences/protobuf/b0;)I

    .line 977
    .line 978
    .line 979
    move-result v5

    .line 980
    goto/16 :goto_1

    .line 981
    .line 982
    :pswitch_34
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v6

    .line 986
    if-eqz v6, :cond_6

    .line 987
    .line 988
    sget-object v6, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 989
    .line 990
    invoke-virtual {v6, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 991
    .line 992
    .line 993
    move-result-wide v6

    .line 994
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 995
    .line 996
    .line 997
    move-result v8

    .line 998
    shl-long v9, v6, v0

    .line 999
    .line 1000
    shr-long v5, v6, v5

    .line 1001
    .line 1002
    xor-long/2addr v5, v9

    .line 1003
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1004
    .line 1005
    .line 1006
    move-result v5

    .line 1007
    goto/16 :goto_2

    .line 1008
    .line 1009
    :pswitch_35
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v5

    .line 1013
    if-eqz v5, :cond_6

    .line 1014
    .line 1015
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1016
    .line 1017
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1018
    .line 1019
    .line 1020
    move-result v5

    .line 1021
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1022
    .line 1023
    .line 1024
    move-result v6

    .line 1025
    shl-int/lit8 v7, v5, 0x1

    .line 1026
    .line 1027
    shr-int/lit8 v5, v5, 0x1f

    .line 1028
    .line 1029
    xor-int/2addr v5, v7

    .line 1030
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 1031
    .line 1032
    .line 1033
    move-result v5

    .line 1034
    goto/16 :goto_3

    .line 1035
    .line 1036
    :pswitch_36
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v5

    .line 1040
    if-eqz v5, :cond_6

    .line 1041
    .line 1042
    invoke-static {v8, v11, v4}, LVa/M6;->h(III)I

    .line 1043
    .line 1044
    .line 1045
    move-result v4

    .line 1046
    goto/16 :goto_a

    .line 1047
    .line 1048
    :pswitch_37
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v5

    .line 1052
    if-eqz v5, :cond_6

    .line 1053
    .line 1054
    invoke-static {v8, v6, v4}, LVa/M6;->h(III)I

    .line 1055
    .line 1056
    .line 1057
    move-result v4

    .line 1058
    goto/16 :goto_a

    .line 1059
    .line 1060
    :pswitch_38
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v5

    .line 1064
    if-eqz v5, :cond_6

    .line 1065
    .line 1066
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1067
    .line 1068
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1069
    .line 1070
    .line 1071
    move-result v5

    .line 1072
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1073
    .line 1074
    .line 1075
    move-result v6

    .line 1076
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 1077
    .line 1078
    .line 1079
    move-result v5

    .line 1080
    goto/16 :goto_3

    .line 1081
    .line 1082
    :pswitch_39
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v5

    .line 1086
    if-eqz v5, :cond_6

    .line 1087
    .line 1088
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1089
    .line 1090
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1091
    .line 1092
    .line 1093
    move-result v5

    .line 1094
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v5

    .line 1102
    goto/16 :goto_3

    .line 1103
    .line 1104
    :pswitch_3a
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    move-result v5

    .line 1108
    if-eqz v5, :cond_6

    .line 1109
    .line 1110
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1111
    .line 1112
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v5

    .line 1116
    check-cast v5, Landroidx/datastore/preferences/protobuf/g;

    .line 1117
    .line 1118
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    goto/16 :goto_1

    .line 1123
    .line 1124
    :pswitch_3b
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v5

    .line 1128
    if-eqz v5, :cond_6

    .line 1129
    .line 1130
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1131
    .line 1132
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    invoke-virtual {p0, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v6

    .line 1140
    sget-object v7, Landroidx/datastore/preferences/protobuf/c0;->a:Ljava/lang/Class;

    .line 1141
    .line 1142
    check-cast v5, Landroidx/datastore/preferences/protobuf/a;

    .line 1143
    .line 1144
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1145
    .line 1146
    .line 1147
    move-result v7

    .line 1148
    invoke-virtual {v5, v6}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/b0;)I

    .line 1149
    .line 1150
    .line 1151
    move-result v5

    .line 1152
    invoke-static {v5, v5, v7, v4}, LVa/M6;->i(IIII)I

    .line 1153
    .line 1154
    .line 1155
    move-result v4

    .line 1156
    goto/16 :goto_a

    .line 1157
    .line 1158
    :pswitch_3c
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v5

    .line 1162
    if-eqz v5, :cond_6

    .line 1163
    .line 1164
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1165
    .line 1166
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v5

    .line 1170
    instance-of v6, v5, Landroidx/datastore/preferences/protobuf/g;

    .line 1171
    .line 1172
    if-eqz v6, :cond_5

    .line 1173
    .line 1174
    check-cast v5, Landroidx/datastore/preferences/protobuf/g;

    .line 1175
    .line 1176
    invoke-static {v8, v5}, Landroidx/datastore/preferences/protobuf/j;->r(ILandroidx/datastore/preferences/protobuf/g;)I

    .line 1177
    .line 1178
    .line 1179
    move-result v5

    .line 1180
    goto/16 :goto_4

    .line 1181
    .line 1182
    :cond_5
    check-cast v5, Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1185
    .line 1186
    .line 1187
    move-result v6

    .line 1188
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 1189
    .line 1190
    .line 1191
    move-result v5

    .line 1192
    goto/16 :goto_5

    .line 1193
    .line 1194
    :pswitch_3d
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v5

    .line 1198
    if-eqz v5, :cond_6

    .line 1199
    .line 1200
    invoke-static {v8, v0, v4}, LVa/M6;->h(III)I

    .line 1201
    .line 1202
    .line 1203
    move-result v4

    .line 1204
    goto/16 :goto_a

    .line 1205
    .line 1206
    :pswitch_3e
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v5

    .line 1210
    if-eqz v5, :cond_6

    .line 1211
    .line 1212
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->t(I)I

    .line 1213
    .line 1214
    .line 1215
    move-result v5

    .line 1216
    goto/16 :goto_1

    .line 1217
    .line 1218
    :pswitch_3f
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v5

    .line 1222
    if-eqz v5, :cond_6

    .line 1223
    .line 1224
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->u(I)I

    .line 1225
    .line 1226
    .line 1227
    move-result v5

    .line 1228
    goto/16 :goto_1

    .line 1229
    .line 1230
    :pswitch_40
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v5

    .line 1234
    if-eqz v5, :cond_6

    .line 1235
    .line 1236
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1237
    .line 1238
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 1239
    .line 1240
    .line 1241
    move-result v5

    .line 1242
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1243
    .line 1244
    .line 1245
    move-result v6

    .line 1246
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 1247
    .line 1248
    .line 1249
    move-result v5

    .line 1250
    goto/16 :goto_3

    .line 1251
    .line 1252
    :pswitch_41
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v5

    .line 1256
    if-eqz v5, :cond_6

    .line 1257
    .line 1258
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1259
    .line 1260
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1261
    .line 1262
    .line 1263
    move-result-wide v5

    .line 1264
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1265
    .line 1266
    .line 1267
    move-result v7

    .line 1268
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1269
    .line 1270
    .line 1271
    move-result v5

    .line 1272
    goto/16 :goto_6

    .line 1273
    .line 1274
    :pswitch_42
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v5

    .line 1278
    if-eqz v5, :cond_6

    .line 1279
    .line 1280
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1281
    .line 1282
    invoke-virtual {v5, v9, v10, p1}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 1283
    .line 1284
    .line 1285
    move-result-wide v5

    .line 1286
    invoke-static {v8}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 1287
    .line 1288
    .line 1289
    move-result v7

    .line 1290
    invoke-static {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 1291
    .line 1292
    .line 1293
    move-result v5

    .line 1294
    goto/16 :goto_6

    .line 1295
    .line 1296
    :pswitch_43
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v5

    .line 1300
    if-eqz v5, :cond_6

    .line 1301
    .line 1302
    invoke-static {v8, v6, v4}, LVa/M6;->h(III)I

    .line 1303
    .line 1304
    .line 1305
    move-result v4

    .line 1306
    goto :goto_a

    .line 1307
    :pswitch_44
    invoke-virtual {p0, v3, p1}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v5

    .line 1311
    if-eqz v5, :cond_6

    .line 1312
    .line 1313
    invoke-static {v8, v11, v4}, LVa/M6;->h(III)I

    .line 1314
    .line 1315
    .line 1316
    move-result v4

    .line 1317
    :cond_6
    :goto_a
    add-int/lit8 v3, v3, 0x3

    .line 1318
    .line 1319
    goto/16 :goto_0

    .line 1320
    .line 1321
    :cond_7
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->m:Landroidx/datastore/preferences/protobuf/k0;

    .line 1322
    .line 1323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    check-cast p1, Landroidx/datastore/preferences/protobuf/v;

    .line 1327
    .line 1328
    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1329
    .line 1330
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/j0;->a()I

    .line 1331
    .line 1332
    .line 1333
    move-result p1

    .line 1334
    add-int/2addr p1, v4

    .line 1335
    return p1

    .line 1336
    nop

    .line 1337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(ILjava/lang/Object;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/S;->g:Z

    .line 2
    .line 3
    const v1, 0xfffff

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    and-int v0, p1, v1

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :pswitch_0
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :pswitch_1
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    cmp-long p1, p1, v3

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :pswitch_2
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :pswitch_3
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    cmp-long p1, p1, v3

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :pswitch_4
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 76
    .line 77
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :pswitch_5
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 86
    .line 87
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :pswitch_6
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 96
    .line 97
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :pswitch_7
    sget-object p1, Landroidx/datastore/preferences/protobuf/g;->c:Landroidx/datastore/preferences/protobuf/g;

    .line 106
    .line 107
    sget-object v3, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 108
    .line 109
    invoke-virtual {v3, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/g;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    xor-int/2addr p1, v2

    .line 118
    return p1

    .line 119
    :pswitch_8
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 120
    .line 121
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :pswitch_9
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    instance-of p2, p1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz p2, :cond_0

    .line 138
    .line 139
    check-cast p1, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    xor-int/2addr p1, v2

    .line 146
    return p1

    .line 147
    :cond_0
    instance-of p2, p1, Landroidx/datastore/preferences/protobuf/g;

    .line 148
    .line 149
    if-eqz p2, :cond_1

    .line 150
    .line 151
    sget-object p2, Landroidx/datastore/preferences/protobuf/g;->c:Landroidx/datastore/preferences/protobuf/g;

    .line 152
    .line 153
    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/g;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    xor-int/2addr p1, v2

    .line 158
    return p1

    .line 159
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :pswitch_a
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 166
    .line 167
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->c(JLjava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    return p1

    .line 172
    :pswitch_b
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 173
    .line 174
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_3

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :pswitch_c
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 182
    .line 183
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 184
    .line 185
    .line 186
    move-result-wide p1

    .line 187
    cmp-long p1, p1, v3

    .line 188
    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :pswitch_d
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 193
    .line 194
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_3

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :pswitch_e
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 202
    .line 203
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    cmp-long p1, p1, v3

    .line 208
    .line 209
    if-eqz p1, :cond_3

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :pswitch_f
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 213
    .line 214
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->h(JLjava/lang/Object;)J

    .line 215
    .line 216
    .line 217
    move-result-wide p1

    .line 218
    cmp-long p1, p1, v3

    .line 219
    .line 220
    if-eqz p1, :cond_3

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :pswitch_10
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 224
    .line 225
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->f(JLjava/lang/Object;)F

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    const/4 p2, 0x0

    .line 230
    cmpl-float p1, p1, p2

    .line 231
    .line 232
    if-eqz p1, :cond_3

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :pswitch_11
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 236
    .line 237
    invoke-virtual {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->e(JLjava/lang/Object;)D

    .line 238
    .line 239
    .line 240
    move-result-wide p1

    .line 241
    const-wide/16 v0, 0x0

    .line 242
    .line 243
    cmpl-double p1, p1, v0

    .line 244
    .line 245
    if-eqz p1, :cond_3

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_2
    add-int/lit8 p1, p1, 0x2

    .line 249
    .line 250
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 251
    .line 252
    aget p1, v0, p1

    .line 253
    .line 254
    ushr-int/lit8 v0, p1, 0x14

    .line 255
    .line 256
    shl-int v0, v2, v0

    .line 257
    .line 258
    and-int/2addr p1, v1

    .line 259
    int-to-long v3, p1

    .line 260
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 261
    .line 262
    invoke-virtual {p1, v3, v4, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    and-int/2addr p1, v0

    .line 267
    if-eqz p1, :cond_3

    .line 268
    .line 269
    :goto_0
    return v2

    .line 270
    :cond_3
    const/4 p1, 0x0

    .line 271
    return p1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(IILjava/lang/Object;)Z
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 4
    .line 5
    aget p2, v0, p2

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p2, v0

    .line 11
    int-to-long v0, p2

    .line 12
    sget-object p2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 13
    .line 14
    invoke-virtual {p2, v0, v1, p3}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-ne p2, p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final s(Landroidx/datastore/preferences/protobuf/k0;Ljava/lang/Object;LG4/f;Landroidx/datastore/preferences/protobuf/m;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    iget-object v9, v1, Landroidx/datastore/preferences/protobuf/S;->h:[I

    .line 12
    .line 13
    iget v10, v1, Landroidx/datastore/preferences/protobuf/S;->j:I

    .line 14
    .line 15
    iget v11, v1, Landroidx/datastore/preferences/protobuf/S;->i:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move-object v12, v0

    .line 19
    :goto_0
    :try_start_0
    invoke-virtual {v4}, LG4/f;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/S;->B(I)I

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    sget-object v13, Landroidx/datastore/preferences/protobuf/j0;->f:Landroidx/datastore/preferences/protobuf/j0;

    .line 28
    .line 29
    if-gez v3, :cond_8

    .line 30
    .line 31
    const v3, 0x7fffffff

    .line 32
    .line 33
    .line 34
    if-ne v0, v3, :cond_3

    .line 35
    .line 36
    :goto_1
    if-ge v11, v10, :cond_0

    .line 37
    .line 38
    aget v0, v9, v11

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2, v12}, Landroidx/datastore/preferences/protobuf/S;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v11, v11, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    if-eqz v12, :cond_2

    .line 47
    .line 48
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_2
    move-object v0, v2

    .line 52
    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    .line 53
    .line 54
    iput-object v12, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 55
    .line 56
    :cond_2
    move-object v6, v1

    .line 57
    goto/16 :goto_11

    .line 58
    .line 59
    :cond_3
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    if-nez v12, :cond_5

    .line 63
    .line 64
    move-object v0, v2

    .line 65
    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    .line 66
    .line 67
    iget-object v3, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 68
    .line 69
    if-ne v3, v13, :cond_4

    .line 70
    .line 71
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j0;->b()Landroidx/datastore/preferences/protobuf/j0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iput-object v3, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 76
    .line 77
    :cond_4
    move-object v12, v3

    .line 78
    goto :goto_5

    .line 79
    :goto_3
    move-object v6, v1

    .line 80
    :goto_4
    move-object v14, v9

    .line 81
    goto/16 :goto_13

    .line 82
    .line 83
    :cond_5
    :goto_5
    invoke-static {v12, v4}, Landroidx/datastore/preferences/protobuf/k0;->a(Ljava/lang/Object;LG4/f;)Z

    .line 84
    .line 85
    .line 86
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    :goto_6
    if-ge v11, v10, :cond_7

    .line 91
    .line 92
    aget v0, v9, v11

    .line 93
    .line 94
    invoke-virtual {v1, v0, v2, v12}, Landroidx/datastore/preferences/protobuf/S;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v11, v11, 0x1

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_7
    if-eqz v12, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_8
    :try_start_2
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 104
    .line 105
    .line 106
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    :try_start_3
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->J(I)I

    .line 108
    .line 109
    .line 110
    move-result v7
    :try_end_3
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 111
    iget-object v14, v1, Landroidx/datastore/preferences/protobuf/S;->l:Landroidx/datastore/preferences/protobuf/G;

    .line 112
    .line 113
    packed-switch v7, :pswitch_data_0

    .line 114
    .line 115
    .line 116
    if-nez v12, :cond_9

    .line 117
    .line 118
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Landroidx/datastore/preferences/protobuf/k0;->b()Landroidx/datastore/preferences/protobuf/j0;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    goto :goto_9

    .line 126
    :catch_0
    :goto_7
    move-object v6, v1

    .line 127
    move-object v15, v4

    .line 128
    :catch_1
    :goto_8
    move-object v14, v9

    .line 129
    goto/16 :goto_f

    .line 130
    .line 131
    :cond_9
    :goto_9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v12, v4}, Landroidx/datastore/preferences/protobuf/k0;->a(Ljava/lang/Object;LG4/f;)Z

    .line 135
    .line 136
    .line 137
    move-result v0
    :try_end_4
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    if-nez v0, :cond_a

    .line 139
    .line 140
    :goto_a
    if-ge v11, v10, :cond_1

    .line 141
    .line 142
    aget v0, v9, v11

    .line 143
    .line 144
    invoke-virtual {v1, v0, v2, v12}, Landroidx/datastore/preferences/protobuf/S;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v11, v11, 0x1

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :pswitch_0
    :try_start_5
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    invoke-virtual {v4, v14, v5}, LG4/f;->x(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_a
    :goto_b
    move-object v6, v1

    .line 169
    move-object v15, v4

    .line 170
    :goto_c
    move-object v14, v9

    .line 171
    goto/16 :goto_12

    .line 172
    .line 173
    :catchall_0
    move-exception v0

    .line 174
    goto :goto_3

    .line 175
    :pswitch_1
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    invoke-virtual {v4}, LG4/f;->K()J

    .line 180
    .line 181
    .line 182
    move-result-wide v14

    .line 183
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_b

    .line 194
    :pswitch_2
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    invoke-virtual {v4}, LG4/f;->I()I

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_b

    .line 213
    :pswitch_3
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 214
    .line 215
    .line 216
    move-result-wide v6

    .line 217
    invoke-virtual {v4}, LG4/f;->G()J

    .line 218
    .line 219
    .line 220
    move-result-wide v14

    .line 221
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object v14

    .line 225
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto :goto_b

    .line 232
    :pswitch_4
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    invoke-virtual {v4}, LG4/f;->E()I

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto :goto_b

    .line 251
    :pswitch_5
    invoke-virtual {v4}, LG4/f;->n()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->k(I)V

    .line 256
    .line 257
    .line 258
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v14

    .line 262
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-static {v2, v14, v15, v6}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_b

    .line 273
    :pswitch_6
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    invoke-virtual {v4}, LG4/f;->P()I

    .line 278
    .line 279
    .line 280
    move-result v14

    .line 281
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    goto :goto_b

    .line 292
    :pswitch_7
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    invoke-virtual {v4}, LG4/f;->j()Landroidx/datastore/preferences/protobuf/g;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_b

    .line 307
    .line 308
    :pswitch_8
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-eqz v7, :cond_b

    .line 313
    .line 314
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v14

    .line 318
    sget-object v7, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 319
    .line 320
    invoke-virtual {v7, v14, v15, v2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    invoke-virtual {v4, v14, v5}, LG4/f;->D(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    invoke-static {v7, v14}, Landroidx/datastore/preferences/protobuf/y;->c(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/v;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 337
    .line 338
    .line 339
    move-result-wide v14

    .line 340
    invoke-static {v2, v14, v15, v7}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto :goto_d

    .line 344
    :cond_b
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v6

    .line 348
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    invoke-virtual {v4, v14, v5}, LG4/f;->D(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :goto_d
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_b

    .line 366
    .line 367
    :pswitch_9
    invoke-virtual {v1, v2, v6, v4}, Landroidx/datastore/preferences/protobuf/S;->E(Ljava/lang/Object;ILG4/f;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_b

    .line 374
    .line 375
    :pswitch_a
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 376
    .line 377
    .line 378
    move-result-wide v6

    .line 379
    invoke-virtual {v4}, LG4/f;->h()Z

    .line 380
    .line 381
    .line 382
    move-result v14

    .line 383
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_b

    .line 394
    .line 395
    :pswitch_b
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    invoke-virtual {v4}, LG4/f;->q()I

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v14

    .line 407
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_b

    .line 414
    .line 415
    :pswitch_c
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 416
    .line 417
    .line 418
    move-result-wide v6

    .line 419
    invoke-virtual {v4}, LG4/f;->s()J

    .line 420
    .line 421
    .line 422
    move-result-wide v14

    .line 423
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto/16 :goto_b

    .line 434
    .line 435
    :pswitch_d
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 436
    .line 437
    .line 438
    move-result-wide v6

    .line 439
    invoke-virtual {v4}, LG4/f;->y()I

    .line 440
    .line 441
    .line 442
    move-result v14

    .line 443
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v14

    .line 447
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_b

    .line 454
    .line 455
    :pswitch_e
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 456
    .line 457
    .line 458
    move-result-wide v6

    .line 459
    invoke-virtual {v4}, LG4/f;->R()J

    .line 460
    .line 461
    .line 462
    move-result-wide v14

    .line 463
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_b

    .line 474
    .line 475
    :pswitch_f
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 476
    .line 477
    .line 478
    move-result-wide v6

    .line 479
    invoke-virtual {v4}, LG4/f;->A()J

    .line 480
    .line 481
    .line 482
    move-result-wide v14

    .line 483
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 484
    .line 485
    .line 486
    move-result-object v14

    .line 487
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_b

    .line 494
    .line 495
    :pswitch_10
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 496
    .line 497
    .line 498
    move-result-wide v6

    .line 499
    invoke-virtual {v4}, LG4/f;->u()F

    .line 500
    .line 501
    .line 502
    move-result v14

    .line 503
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 504
    .line 505
    .line 506
    move-result-object v14

    .line 507
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_b

    .line 514
    .line 515
    :pswitch_11
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    invoke-virtual {v4}, LG4/f;->l()D

    .line 520
    .line 521
    .line 522
    move-result-wide v14

    .line 523
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 524
    .line 525
    .line 526
    move-result-object v14

    .line 527
    invoke-static {v2, v6, v7, v14}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v0, v3, v2}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V
    :try_end_5
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 531
    .line 532
    .line 533
    goto/16 :goto_b

    .line 534
    .line 535
    :pswitch_12
    :try_start_6
    invoke-virtual {v1, v3}, Landroidx/datastore/preferences/protobuf/S;->l(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    move-object/from16 v6, p3

    .line 540
    .line 541
    invoke-virtual/range {v1 .. v6}, Landroidx/datastore/preferences/protobuf/S;->t(Ljava/lang/Object;ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/m;LG4/f;)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v2, p2

    .line 545
    .line 546
    move-object/from16 v15, p3

    .line 547
    .line 548
    move-object v6, v1

    .line 549
    goto/16 :goto_c

    .line 550
    .line 551
    :catchall_1
    move-exception v0

    .line 552
    move-object/from16 v2, p2

    .line 553
    .line 554
    goto/16 :goto_3

    .line 555
    .line 556
    :catch_2
    move-object/from16 v2, p2

    .line 557
    .line 558
    move-object/from16 v15, p3

    .line 559
    .line 560
    :goto_e
    move-object v6, v1

    .line 561
    goto/16 :goto_8

    .line 562
    .line 563
    :pswitch_13
    move v7, v3

    .line 564
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 565
    .line 566
    .line 567
    move-result-wide v3

    .line 568
    invoke-virtual {v1, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 569
    .line 570
    .line 571
    move-result-object v6
    :try_end_6
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 572
    move-object/from16 v2, p2

    .line 573
    .line 574
    move-object/from16 v5, p3

    .line 575
    .line 576
    move-object/from16 v7, p4

    .line 577
    .line 578
    :try_start_7
    invoke-virtual/range {v1 .. v7}, Landroidx/datastore/preferences/protobuf/S;->C(Ljava/lang/Object;JLG4/f;Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)V
    :try_end_7
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 579
    .line 580
    .line 581
    move-object v4, v5

    .line 582
    goto/16 :goto_b

    .line 583
    .line 584
    :catch_3
    move-object v6, v1

    .line 585
    move-object v15, v5

    .line 586
    goto/16 :goto_8

    .line 587
    .line 588
    :pswitch_14
    :try_start_8
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 589
    .line 590
    .line 591
    move-result-wide v5

    .line 592
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v4, v0}, LG4/f;->L(Ljava/util/List;)V

    .line 597
    .line 598
    .line 599
    goto/16 :goto_b

    .line 600
    .line 601
    :pswitch_15
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 602
    .line 603
    .line 604
    move-result-wide v5

    .line 605
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v4, v0}, LG4/f;->J(Ljava/util/List;)V

    .line 610
    .line 611
    .line 612
    goto/16 :goto_b

    .line 613
    .line 614
    :pswitch_16
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 615
    .line 616
    .line 617
    move-result-wide v5

    .line 618
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v4, v0}, LG4/f;->H(Ljava/util/List;)V

    .line 623
    .line 624
    .line 625
    goto/16 :goto_b

    .line 626
    .line 627
    :pswitch_17
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 628
    .line 629
    .line 630
    move-result-wide v5

    .line 631
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-virtual {v4, v0}, LG4/f;->F(Ljava/util/List;)V

    .line 636
    .line 637
    .line 638
    goto/16 :goto_b

    .line 639
    .line 640
    :pswitch_18
    move v7, v3

    .line 641
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 642
    .line 643
    .line 644
    move-result-wide v5

    .line 645
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    invoke-virtual {v4, v3}, LG4/f;->o(Ljava/util/List;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v7}, Landroidx/datastore/preferences/protobuf/S;->k(I)V

    .line 653
    .line 654
    .line 655
    invoke-static {v0, v3, v12, v8}, Landroidx/datastore/preferences/protobuf/c0;->v(ILjava/util/List;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k0;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    goto/16 :goto_b

    .line 659
    .line 660
    :pswitch_19
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 661
    .line 662
    .line 663
    move-result-wide v5

    .line 664
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v4, v0}, LG4/f;->Q(Ljava/util/List;)V

    .line 669
    .line 670
    .line 671
    goto/16 :goto_b

    .line 672
    .line 673
    :pswitch_1a
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 674
    .line 675
    .line 676
    move-result-wide v5

    .line 677
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v4, v0}, LG4/f;->i(Ljava/util/List;)V

    .line 682
    .line 683
    .line 684
    goto/16 :goto_b

    .line 685
    .line 686
    :pswitch_1b
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 687
    .line 688
    .line 689
    move-result-wide v5

    .line 690
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v4, v0}, LG4/f;->r(Ljava/util/List;)V

    .line 695
    .line 696
    .line 697
    goto/16 :goto_b

    .line 698
    .line 699
    :pswitch_1c
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 700
    .line 701
    .line 702
    move-result-wide v5

    .line 703
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v4, v0}, LG4/f;->t(Ljava/util/List;)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_b

    .line 711
    .line 712
    :pswitch_1d
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 713
    .line 714
    .line 715
    move-result-wide v5

    .line 716
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v4, v0}, LG4/f;->z(Ljava/util/List;)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_b

    .line 724
    .line 725
    :pswitch_1e
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 726
    .line 727
    .line 728
    move-result-wide v5

    .line 729
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {v4, v0}, LG4/f;->S(Ljava/util/List;)V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_b

    .line 737
    .line 738
    :pswitch_1f
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 739
    .line 740
    .line 741
    move-result-wide v5

    .line 742
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v4, v0}, LG4/f;->B(Ljava/util/List;)V

    .line 747
    .line 748
    .line 749
    goto/16 :goto_b

    .line 750
    .line 751
    :pswitch_20
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 752
    .line 753
    .line 754
    move-result-wide v5

    .line 755
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v4, v0}, LG4/f;->v(Ljava/util/List;)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_b

    .line 763
    .line 764
    :pswitch_21
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 765
    .line 766
    .line 767
    move-result-wide v5

    .line 768
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v4, v0}, LG4/f;->m(Ljava/util/List;)V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_b

    .line 776
    .line 777
    :pswitch_22
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 778
    .line 779
    .line 780
    move-result-wide v5

    .line 781
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-virtual {v4, v0}, LG4/f;->L(Ljava/util/List;)V

    .line 786
    .line 787
    .line 788
    goto/16 :goto_b

    .line 789
    .line 790
    :pswitch_23
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 791
    .line 792
    .line 793
    move-result-wide v5

    .line 794
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-virtual {v4, v0}, LG4/f;->J(Ljava/util/List;)V

    .line 799
    .line 800
    .line 801
    goto/16 :goto_b

    .line 802
    .line 803
    :pswitch_24
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 804
    .line 805
    .line 806
    move-result-wide v5

    .line 807
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-virtual {v4, v0}, LG4/f;->H(Ljava/util/List;)V

    .line 812
    .line 813
    .line 814
    goto/16 :goto_b

    .line 815
    .line 816
    :pswitch_25
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 817
    .line 818
    .line 819
    move-result-wide v5

    .line 820
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-virtual {v4, v0}, LG4/f;->F(Ljava/util/List;)V

    .line 825
    .line 826
    .line 827
    goto/16 :goto_b

    .line 828
    .line 829
    :pswitch_26
    move v7, v3

    .line 830
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 831
    .line 832
    .line 833
    move-result-wide v5

    .line 834
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-virtual {v4, v3}, LG4/f;->o(Ljava/util/List;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v1, v7}, Landroidx/datastore/preferences/protobuf/S;->k(I)V

    .line 842
    .line 843
    .line 844
    invoke-static {v0, v3, v12, v8}, Landroidx/datastore/preferences/protobuf/c0;->v(ILjava/util/List;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/k0;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    goto/16 :goto_b

    .line 848
    .line 849
    :pswitch_27
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 850
    .line 851
    .line 852
    move-result-wide v5

    .line 853
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-virtual {v4, v0}, LG4/f;->Q(Ljava/util/List;)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_b

    .line 861
    .line 862
    :pswitch_28
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 863
    .line 864
    .line 865
    move-result-wide v5

    .line 866
    invoke-virtual {v14, v5, v6, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-virtual {v4, v0}, LG4/f;->k(Ljava/util/List;)V
    :try_end_8
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 871
    .line 872
    .line 873
    goto/16 :goto_b

    .line 874
    .line 875
    :pswitch_29
    move v7, v3

    .line 876
    :try_start_9
    invoke-virtual {v1, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 877
    .line 878
    .line 879
    move-result-object v5
    :try_end_9
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 880
    move v3, v6

    .line 881
    move-object/from16 v6, p4

    .line 882
    .line 883
    :try_start_a
    invoke-virtual/range {v1 .. v6}, Landroidx/datastore/preferences/protobuf/S;->D(Ljava/lang/Object;ILG4/f;Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)V
    :try_end_a
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 884
    .line 885
    .line 886
    move-object v15, v4

    .line 887
    move-object v0, v6

    .line 888
    move-object v6, v1

    .line 889
    goto/16 :goto_c

    .line 890
    .line 891
    :catch_4
    move-object v15, v4

    .line 892
    move-object v0, v6

    .line 893
    goto/16 :goto_e

    .line 894
    .line 895
    :catch_5
    move-object/from16 v0, p4

    .line 896
    .line 897
    goto/16 :goto_7

    .line 898
    .line 899
    :pswitch_2a
    move-object v15, v4

    .line 900
    move-object v0, v5

    .line 901
    move v3, v6

    .line 902
    move-object v6, v1

    .line 903
    :try_start_b
    invoke-virtual {v6, v2, v3, v15}, Landroidx/datastore/preferences/protobuf/S;->F(Ljava/lang/Object;ILG4/f;)V

    .line 904
    .line 905
    .line 906
    goto/16 :goto_c

    .line 907
    .line 908
    :catchall_2
    move-exception v0

    .line 909
    goto/16 :goto_4

    .line 910
    .line 911
    :pswitch_2b
    move-object v15, v4

    .line 912
    move-object v0, v5

    .line 913
    move v3, v6

    .line 914
    move-object v6, v1

    .line 915
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 916
    .line 917
    .line 918
    move-result-wide v3

    .line 919
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    invoke-virtual {v15, v1}, LG4/f;->i(Ljava/util/List;)V

    .line 924
    .line 925
    .line 926
    goto/16 :goto_c

    .line 927
    .line 928
    :pswitch_2c
    move-object v15, v4

    .line 929
    move-object v0, v5

    .line 930
    move v3, v6

    .line 931
    move-object v6, v1

    .line 932
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 933
    .line 934
    .line 935
    move-result-wide v3

    .line 936
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v15, v1}, LG4/f;->r(Ljava/util/List;)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_c

    .line 944
    .line 945
    :pswitch_2d
    move-object v15, v4

    .line 946
    move-object v0, v5

    .line 947
    move v3, v6

    .line 948
    move-object v6, v1

    .line 949
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 950
    .line 951
    .line 952
    move-result-wide v3

    .line 953
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    invoke-virtual {v15, v1}, LG4/f;->t(Ljava/util/List;)V

    .line 958
    .line 959
    .line 960
    goto/16 :goto_c

    .line 961
    .line 962
    :pswitch_2e
    move-object v15, v4

    .line 963
    move-object v0, v5

    .line 964
    move v3, v6

    .line 965
    move-object v6, v1

    .line 966
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 967
    .line 968
    .line 969
    move-result-wide v3

    .line 970
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    invoke-virtual {v15, v1}, LG4/f;->z(Ljava/util/List;)V

    .line 975
    .line 976
    .line 977
    goto/16 :goto_c

    .line 978
    .line 979
    :pswitch_2f
    move-object v15, v4

    .line 980
    move-object v0, v5

    .line 981
    move v3, v6

    .line 982
    move-object v6, v1

    .line 983
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 984
    .line 985
    .line 986
    move-result-wide v3

    .line 987
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-virtual {v15, v1}, LG4/f;->S(Ljava/util/List;)V

    .line 992
    .line 993
    .line 994
    goto/16 :goto_c

    .line 995
    .line 996
    :pswitch_30
    move-object v15, v4

    .line 997
    move-object v0, v5

    .line 998
    move v3, v6

    .line 999
    move-object v6, v1

    .line 1000
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v3

    .line 1004
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-virtual {v15, v1}, LG4/f;->B(Ljava/util/List;)V

    .line 1009
    .line 1010
    .line 1011
    goto/16 :goto_c

    .line 1012
    .line 1013
    :pswitch_31
    move-object v15, v4

    .line 1014
    move-object v0, v5

    .line 1015
    move v3, v6

    .line 1016
    move-object v6, v1

    .line 1017
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1018
    .line 1019
    .line 1020
    move-result-wide v3

    .line 1021
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    invoke-virtual {v15, v1}, LG4/f;->v(Ljava/util/List;)V

    .line 1026
    .line 1027
    .line 1028
    goto/16 :goto_c

    .line 1029
    .line 1030
    :pswitch_32
    move-object v15, v4

    .line 1031
    move-object v0, v5

    .line 1032
    move v3, v6

    .line 1033
    move-object v6, v1

    .line 1034
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v3

    .line 1038
    invoke-virtual {v14, v3, v4, v2}, Landroidx/datastore/preferences/protobuf/G;->c(JLjava/lang/Object;)Ljava/util/List;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    invoke-virtual {v15, v1}, LG4/f;->m(Ljava/util/List;)V

    .line 1043
    .line 1044
    .line 1045
    goto/16 :goto_c

    .line 1046
    .line 1047
    :pswitch_33
    move v7, v3

    .line 1048
    move-object v15, v4

    .line 1049
    move-object v0, v5

    .line 1050
    move v3, v6

    .line 1051
    move-object v6, v1

    .line 1052
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v1

    .line 1056
    if-eqz v1, :cond_c

    .line 1057
    .line 1058
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v4

    .line 1062
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1063
    .line 1064
    invoke-virtual {v1, v4, v5, v2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    invoke-virtual {v15, v4, v0}, LG4/f;->x(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v4

    .line 1076
    invoke-static {v1, v4}, Landroidx/datastore/preferences/protobuf/y;->c(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/v;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1081
    .line 1082
    .line 1083
    move-result-wide v3

    .line 1084
    invoke-static {v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    goto/16 :goto_c

    .line 1088
    .line 1089
    :cond_c
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v3

    .line 1093
    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    invoke-virtual {v15, v1, v0}, LG4/f;->x(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v1

    .line 1101
    invoke-static {v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    goto/16 :goto_c

    .line 1108
    .line 1109
    :pswitch_34
    move v7, v3

    .line 1110
    move-object v15, v4

    .line 1111
    move-object v0, v5

    .line 1112
    move v3, v6

    .line 1113
    move-object v6, v1

    .line 1114
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v3
    :try_end_b
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1118
    move-object v14, v9

    .line 1119
    :try_start_c
    invoke-virtual {v15}, LG4/f;->K()J

    .line 1120
    .line 1121
    .line 1122
    move-result-wide v8

    .line 1123
    invoke-static {v2, v3, v4, v8, v9}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    goto/16 :goto_12

    .line 1130
    .line 1131
    :pswitch_35
    move v7, v3

    .line 1132
    move-object v15, v4

    .line 1133
    move-object v0, v5

    .line 1134
    move v3, v6

    .line 1135
    move-object v14, v9

    .line 1136
    move-object v6, v1

    .line 1137
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1138
    .line 1139
    .line 1140
    move-result-wide v3

    .line 1141
    invoke-virtual {v15}, LG4/f;->I()I

    .line 1142
    .line 1143
    .line 1144
    move-result v1

    .line 1145
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1149
    .line 1150
    .line 1151
    goto/16 :goto_12

    .line 1152
    .line 1153
    :pswitch_36
    move v7, v3

    .line 1154
    move-object v15, v4

    .line 1155
    move-object v0, v5

    .line 1156
    move v3, v6

    .line 1157
    move-object v14, v9

    .line 1158
    move-object v6, v1

    .line 1159
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1160
    .line 1161
    .line 1162
    move-result-wide v3

    .line 1163
    invoke-virtual {v15}, LG4/f;->G()J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v8

    .line 1167
    invoke-static {v2, v3, v4, v8, v9}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1171
    .line 1172
    .line 1173
    goto/16 :goto_12

    .line 1174
    .line 1175
    :pswitch_37
    move v7, v3

    .line 1176
    move-object v15, v4

    .line 1177
    move-object v0, v5

    .line 1178
    move v3, v6

    .line 1179
    move-object v14, v9

    .line 1180
    move-object v6, v1

    .line 1181
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1182
    .line 1183
    .line 1184
    move-result-wide v3

    .line 1185
    invoke-virtual {v15}, LG4/f;->E()I

    .line 1186
    .line 1187
    .line 1188
    move-result v1

    .line 1189
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_12

    .line 1196
    .line 1197
    :pswitch_38
    move v7, v3

    .line 1198
    move-object v15, v4

    .line 1199
    move-object v0, v5

    .line 1200
    move v3, v6

    .line 1201
    move-object v14, v9

    .line 1202
    move-object v6, v1

    .line 1203
    invoke-virtual {v15}, LG4/f;->n()I

    .line 1204
    .line 1205
    .line 1206
    move-result v1

    .line 1207
    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/S;->k(I)V

    .line 1208
    .line 1209
    .line 1210
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1211
    .line 1212
    .line 1213
    move-result-wide v3

    .line 1214
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1218
    .line 1219
    .line 1220
    goto/16 :goto_12

    .line 1221
    .line 1222
    :catchall_3
    move-exception v0

    .line 1223
    goto/16 :goto_13

    .line 1224
    .line 1225
    :pswitch_39
    move v7, v3

    .line 1226
    move-object v15, v4

    .line 1227
    move-object v0, v5

    .line 1228
    move v3, v6

    .line 1229
    move-object v14, v9

    .line 1230
    move-object v6, v1

    .line 1231
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1232
    .line 1233
    .line 1234
    move-result-wide v3

    .line 1235
    invoke-virtual {v15}, LG4/f;->P()I

    .line 1236
    .line 1237
    .line 1238
    move-result v1

    .line 1239
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    goto/16 :goto_12

    .line 1246
    .line 1247
    :pswitch_3a
    move v7, v3

    .line 1248
    move-object v15, v4

    .line 1249
    move-object v0, v5

    .line 1250
    move v3, v6

    .line 1251
    move-object v14, v9

    .line 1252
    move-object v6, v1

    .line 1253
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v3

    .line 1257
    invoke-virtual {v15}, LG4/f;->j()Landroidx/datastore/preferences/protobuf/g;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    invoke-static {v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1265
    .line 1266
    .line 1267
    goto/16 :goto_12

    .line 1268
    .line 1269
    :pswitch_3b
    move v7, v3

    .line 1270
    move-object v15, v4

    .line 1271
    move-object v0, v5

    .line 1272
    move v3, v6

    .line 1273
    move-object v14, v9

    .line 1274
    move-object v6, v1

    .line 1275
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v1

    .line 1279
    if-eqz v1, :cond_d

    .line 1280
    .line 1281
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v4

    .line 1285
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1286
    .line 1287
    invoke-virtual {v1, v4, v5, v2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v1

    .line 1291
    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    invoke-virtual {v15, v4, v0}, LG4/f;->D(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    invoke-static {v1, v4}, Landroidx/datastore/preferences/protobuf/y;->c(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/v;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v1

    .line 1303
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1304
    .line 1305
    .line 1306
    move-result-wide v3

    .line 1307
    invoke-static {v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1308
    .line 1309
    .line 1310
    goto/16 :goto_12

    .line 1311
    .line 1312
    :cond_d
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v3

    .line 1316
    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/S;->m(I)Landroidx/datastore/preferences/protobuf/b0;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v1

    .line 1320
    invoke-virtual {v15, v1, v0}, LG4/f;->D(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v1

    .line 1324
    invoke-static {v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_12

    .line 1331
    .line 1332
    :pswitch_3c
    move v7, v3

    .line 1333
    move-object v15, v4

    .line 1334
    move-object v0, v5

    .line 1335
    move v3, v6

    .line 1336
    move-object v14, v9

    .line 1337
    move-object v6, v1

    .line 1338
    invoke-virtual {v6, v2, v3, v15}, Landroidx/datastore/preferences/protobuf/S;->E(Ljava/lang/Object;ILG4/f;)V

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1342
    .line 1343
    .line 1344
    goto/16 :goto_12

    .line 1345
    .line 1346
    :pswitch_3d
    move v7, v3

    .line 1347
    move-object v15, v4

    .line 1348
    move-object v0, v5

    .line 1349
    move v3, v6

    .line 1350
    move-object v14, v9

    .line 1351
    move-object v6, v1

    .line 1352
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1353
    .line 1354
    .line 1355
    move-result-wide v3

    .line 1356
    invoke-virtual {v15}, LG4/f;->h()Z

    .line 1357
    .line 1358
    .line 1359
    move-result v1

    .line 1360
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1361
    .line 1362
    invoke-virtual {v5, v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/r0;->k(Ljava/lang/Object;JZ)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    goto/16 :goto_12

    .line 1369
    .line 1370
    :pswitch_3e
    move v7, v3

    .line 1371
    move-object v15, v4

    .line 1372
    move-object v0, v5

    .line 1373
    move v3, v6

    .line 1374
    move-object v14, v9

    .line 1375
    move-object v6, v1

    .line 1376
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v3

    .line 1380
    invoke-virtual {v15}, LG4/f;->q()I

    .line 1381
    .line 1382
    .line 1383
    move-result v1

    .line 1384
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1388
    .line 1389
    .line 1390
    goto/16 :goto_12

    .line 1391
    .line 1392
    :pswitch_3f
    move v7, v3

    .line 1393
    move-object v15, v4

    .line 1394
    move-object v0, v5

    .line 1395
    move v3, v6

    .line 1396
    move-object v14, v9

    .line 1397
    move-object v6, v1

    .line 1398
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1399
    .line 1400
    .line 1401
    move-result-wide v3

    .line 1402
    invoke-virtual {v15}, LG4/f;->s()J

    .line 1403
    .line 1404
    .line 1405
    move-result-wide v8

    .line 1406
    invoke-static {v2, v3, v4, v8, v9}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1410
    .line 1411
    .line 1412
    goto/16 :goto_12

    .line 1413
    .line 1414
    :pswitch_40
    move v7, v3

    .line 1415
    move-object v15, v4

    .line 1416
    move-object v0, v5

    .line 1417
    move v3, v6

    .line 1418
    move-object v14, v9

    .line 1419
    move-object v6, v1

    .line 1420
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1421
    .line 1422
    .line 1423
    move-result-wide v3

    .line 1424
    invoke-virtual {v15}, LG4/f;->y()I

    .line 1425
    .line 1426
    .line 1427
    move-result v1

    .line 1428
    invoke-static {v3, v4, v2, v1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    goto/16 :goto_12

    .line 1435
    .line 1436
    :pswitch_41
    move v7, v3

    .line 1437
    move-object v15, v4

    .line 1438
    move-object v0, v5

    .line 1439
    move v3, v6

    .line 1440
    move-object v14, v9

    .line 1441
    move-object v6, v1

    .line 1442
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v3

    .line 1446
    invoke-virtual {v15}, LG4/f;->R()J

    .line 1447
    .line 1448
    .line 1449
    move-result-wide v8

    .line 1450
    invoke-static {v2, v3, v4, v8, v9}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1454
    .line 1455
    .line 1456
    goto/16 :goto_12

    .line 1457
    .line 1458
    :pswitch_42
    move v7, v3

    .line 1459
    move-object v15, v4

    .line 1460
    move-object v0, v5

    .line 1461
    move v3, v6

    .line 1462
    move-object v14, v9

    .line 1463
    move-object v6, v1

    .line 1464
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1465
    .line 1466
    .line 1467
    move-result-wide v3

    .line 1468
    invoke-virtual {v15}, LG4/f;->A()J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v8

    .line 1472
    invoke-static {v2, v3, v4, v8, v9}, Landroidx/datastore/preferences/protobuf/s0;->n(Ljava/lang/Object;JJ)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1476
    .line 1477
    .line 1478
    goto/16 :goto_12

    .line 1479
    .line 1480
    :pswitch_43
    move v7, v3

    .line 1481
    move-object v15, v4

    .line 1482
    move-object v0, v5

    .line 1483
    move v3, v6

    .line 1484
    move-object v14, v9

    .line 1485
    move-object v6, v1

    .line 1486
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1487
    .line 1488
    .line 1489
    move-result-wide v3

    .line 1490
    invoke-virtual {v15}, LG4/f;->u()F

    .line 1491
    .line 1492
    .line 1493
    move-result v1

    .line 1494
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 1495
    .line 1496
    invoke-virtual {v5, v2, v3, v4, v1}, Landroidx/datastore/preferences/protobuf/r0;->n(Ljava/lang/Object;JF)V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 1500
    .line 1501
    .line 1502
    goto :goto_12

    .line 1503
    :pswitch_44
    move v7, v3

    .line 1504
    move-object v15, v4

    .line 1505
    move-object v0, v5

    .line 1506
    move v3, v6

    .line 1507
    move-object v14, v9

    .line 1508
    move-object v6, v1

    .line 1509
    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/S;->y(I)J

    .line 1510
    .line 1511
    .line 1512
    move-result-wide v3
    :try_end_c
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_c .. :try_end_c} :catch_8
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 1513
    move-wide v2, v3

    .line 1514
    :try_start_d
    invoke-virtual {v15}, LG4/f;->l()D

    .line 1515
    .line 1516
    .line 1517
    move-result-wide v4

    .line 1518
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;
    :try_end_d
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1519
    .line 1520
    move-object/from16 v1, p2

    .line 1521
    .line 1522
    :try_start_e
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/r0;->m(Ljava/lang/Object;JD)V
    :try_end_e
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1523
    .line 1524
    .line 1525
    move-object v2, v1

    .line 1526
    :try_start_f
    invoke-virtual {v6, v7, v2}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V
    :try_end_f
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 1527
    .line 1528
    .line 1529
    goto :goto_12

    .line 1530
    :catchall_4
    move-exception v0

    .line 1531
    move-object v2, v1

    .line 1532
    goto :goto_13

    .line 1533
    :catch_6
    move-object v2, v1

    .line 1534
    goto :goto_f

    .line 1535
    :catchall_5
    move-exception v0

    .line 1536
    move-object/from16 v2, p2

    .line 1537
    .line 1538
    goto :goto_13

    .line 1539
    :catch_7
    move-object/from16 v2, p2

    .line 1540
    .line 1541
    :catch_8
    :goto_f
    :try_start_10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1542
    .line 1543
    .line 1544
    if-nez v12, :cond_f

    .line 1545
    .line 1546
    move-object v0, v2

    .line 1547
    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    .line 1548
    .line 1549
    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1550
    .line 1551
    if-ne v1, v13, :cond_e

    .line 1552
    .line 1553
    invoke-static {}, Landroidx/datastore/preferences/protobuf/j0;->b()Landroidx/datastore/preferences/protobuf/j0;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    iput-object v1, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1558
    .line 1559
    :cond_e
    move-object v12, v1

    .line 1560
    :cond_f
    invoke-static {v12, v15}, Landroidx/datastore/preferences/protobuf/k0;->a(Ljava/lang/Object;LG4/f;)Z

    .line 1561
    .line 1562
    .line 1563
    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 1564
    if-nez v0, :cond_12

    .line 1565
    .line 1566
    :goto_10
    if-ge v11, v10, :cond_10

    .line 1567
    .line 1568
    aget v0, v14, v11

    .line 1569
    .line 1570
    invoke-virtual {v6, v0, v2, v12}, Landroidx/datastore/preferences/protobuf/S;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1571
    .line 1572
    .line 1573
    add-int/lit8 v11, v11, 0x1

    .line 1574
    .line 1575
    goto :goto_10

    .line 1576
    :cond_10
    if-eqz v12, :cond_11

    .line 1577
    .line 1578
    move-object v0, v2

    .line 1579
    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    .line 1580
    .line 1581
    iput-object v12, v0, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1582
    .line 1583
    :cond_11
    :goto_11
    return-void

    .line 1584
    :cond_12
    :goto_12
    move-object/from16 v8, p1

    .line 1585
    .line 1586
    move-object/from16 v5, p4

    .line 1587
    .line 1588
    move-object v1, v6

    .line 1589
    move-object v9, v14

    .line 1590
    move-object v4, v15

    .line 1591
    goto/16 :goto_0

    .line 1592
    .line 1593
    :goto_13
    if-ge v11, v10, :cond_13

    .line 1594
    .line 1595
    aget v1, v14, v11

    .line 1596
    .line 1597
    invoke-virtual {v6, v1, v2, v12}, Landroidx/datastore/preferences/protobuf/S;->j(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1598
    .line 1599
    .line 1600
    add-int/lit8 v11, v11, 0x1

    .line 1601
    .line 1602
    goto :goto_13

    .line 1603
    :cond_13
    if-eqz v12, :cond_14

    .line 1604
    .line 1605
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1606
    .line 1607
    .line 1608
    move-object v1, v2

    .line 1609
    check-cast v1, Landroidx/datastore/preferences/protobuf/v;

    .line 1610
    .line 1611
    iput-object v12, v1, Landroidx/datastore/preferences/protobuf/v;->unknownFields:Landroidx/datastore/preferences/protobuf/j0;

    .line 1612
    .line 1613
    :cond_14
    throw v0

    .line 1614
    nop

    .line 1615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Ljava/lang/Object;ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/m;LG4/f;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p2}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p2, v0

    .line 9
    int-to-long v0, p2

    .line 10
    sget-object p2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 11
    .line 12
    invoke-virtual {p2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/S;->n:Landroidx/datastore/preferences/protobuf/N;

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object p2, Landroidx/datastore/preferences/protobuf/M;->b:Landroidx/datastore/preferences/protobuf/M;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/M;->c()Landroidx/datastore/preferences/protobuf/M;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-object v3, p2

    .line 37
    check-cast v3, Landroidx/datastore/preferences/protobuf/M;

    .line 38
    .line 39
    iget-boolean v3, v3, Landroidx/datastore/preferences/protobuf/M;->a:Z

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    sget-object v3, Landroidx/datastore/preferences/protobuf/M;->b:Landroidx/datastore/preferences/protobuf/M;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/datastore/preferences/protobuf/M;->c()Landroidx/datastore/preferences/protobuf/M;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3, p2}, Landroidx/datastore/preferences/protobuf/N;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/M;

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0, v1, v3}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object p2, v3

    .line 56
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p2, Landroidx/datastore/preferences/protobuf/M;

    .line 60
    .line 61
    check-cast p3, Landroidx/datastore/preferences/protobuf/L;

    .line 62
    .line 63
    iget-object p1, p3, Landroidx/datastore/preferences/protobuf/L;->a:Landroidx/datastore/preferences/protobuf/K;

    .line 64
    .line 65
    const/4 p3, 0x2

    .line 66
    invoke-virtual {p5, p3}, LG4/f;->W(I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p5, LG4/f;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Landroidx/datastore/preferences/protobuf/h;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/h;->A()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/h;->e(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const-string v2, ""

    .line 82
    .line 83
    iget-object v3, p1, Landroidx/datastore/preferences/protobuf/K;->c:Lw1/i;

    .line 84
    .line 85
    move-object v4, v3

    .line 86
    :goto_1
    :try_start_0
    invoke-virtual {p5}, LG4/f;->d()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const v6, 0x7fffffff

    .line 91
    .line 92
    .line 93
    if-eq v5, v6, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/h;->c()Z

    .line 96
    .line 97
    .line 98
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-eqz v6, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const/4 v6, 0x1

    .line 103
    const-string v7, "Unable to parse map entry."

    .line 104
    .line 105
    if-eq v5, v6, :cond_5

    .line 106
    .line 107
    if-eq v5, p3, :cond_4

    .line 108
    .line 109
    :try_start_1
    invoke-virtual {p5}, LG4/f;->X()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    new-instance v5, Landroidx/datastore/preferences/protobuf/A;

    .line 117
    .line 118
    invoke-direct {v5, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v5

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    iget-object v5, p1, Landroidx/datastore/preferences/protobuf/K;->b:Landroidx/datastore/preferences/protobuf/y0;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {p5, v5, v6, p4}, LG4/f;->p(Landroidx/datastore/preferences/protobuf/A0;Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    goto :goto_1

    .line 135
    :cond_5
    iget-object v5, p1, Landroidx/datastore/preferences/protobuf/K;->a:Landroidx/datastore/preferences/protobuf/w0;

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    invoke-virtual {p5, v5, v6, v6}, LG4/f;->p(Landroidx/datastore/preferences/protobuf/A0;Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/m;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2
    :try_end_1
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    goto :goto_1

    .line 143
    :catch_0
    :try_start_2
    invoke-virtual {p5}, LG4/f;->X()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_6

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    new-instance p1, Landroidx/datastore/preferences/protobuf/A;

    .line 151
    .line 152
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_7
    :goto_2
    invoke-virtual {p2, v2, v4}, Landroidx/datastore/preferences/protobuf/M;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/h;->d(I)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :goto_3
    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/h;->d(I)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method

.method public final u(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-virtual {p0, p3, p2}, Landroidx/datastore/preferences/protobuf/S;->p(ILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v1, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-static {v3, p2}, Landroidx/datastore/preferences/protobuf/y;->c(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/v;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p3, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-static {p1, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p3, p1}, Landroidx/datastore/preferences/protobuf/S;->H(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
.end method

.method public final v(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/S;->K(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/S;->a:[I

    .line 6
    .line 7
    aget v1, v1, p3

    .line 8
    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v2

    .line 13
    int-to-long v2, v0

    .line 14
    invoke-virtual {p0, v1, p3, p2}, Landroidx/datastore/preferences/protobuf/S;->q(IILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, p1}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v0, v2, v3, p2}, Landroidx/datastore/preferences/protobuf/r0;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-static {v4, p2}, Landroidx/datastore/preferences/protobuf/y;->c(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/v;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p1, v2, v3, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1, p3, p1}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-static {p1, v2, v3, p2}, Landroidx/datastore/preferences/protobuf/s0;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1, p3, p1}, Landroidx/datastore/preferences/protobuf/S;->I(IILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    return-void
.end method
