.class public Lab/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljf/g;
.implements Lr7/c;
.implements Ls2/o;
.implements LL8/e;


# direct methods
.method public static a(Ljava/lang/String;)Lcg/j;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v2, 0x41

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    const-string v5, "<this>"

    .line 8
    .line 9
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v5, Lcg/a;->a:[B

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    :goto_0
    const/16 v6, 0x9

    .line 19
    .line 20
    const/16 v7, 0x20

    .line 21
    .line 22
    const/16 v8, 0xd

    .line 23
    .line 24
    const/16 v9, 0xa

    .line 25
    .line 26
    if-lez v5, :cond_1

    .line 27
    .line 28
    add-int/lit8 v10, v5, -0x1

    .line 29
    .line 30
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    const/16 v11, 0x3d

    .line 35
    .line 36
    if-eq v10, v11, :cond_0

    .line 37
    .line 38
    if-eq v10, v9, :cond_0

    .line 39
    .line 40
    if-eq v10, v8, :cond_0

    .line 41
    .line 42
    if-eq v10, v7, :cond_0

    .line 43
    .line 44
    if-eq v10, v6, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v5, v5, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    int-to-long v10, v5

    .line 51
    const-wide/16 v12, 0x6

    .line 52
    .line 53
    mul-long/2addr v10, v12

    .line 54
    const-wide/16 v12, 0x8

    .line 55
    .line 56
    div-long/2addr v10, v12

    .line 57
    long-to-int v10, v10

    .line 58
    new-array v11, v10, [B

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    move v13, v12

    .line 62
    move v14, v13

    .line 63
    move v15, v14

    .line 64
    :goto_2
    const/16 v16, 0x0

    .line 65
    .line 66
    if-ge v12, v5, :cond_c

    .line 67
    .line 68
    const/16 v17, 0x3

    .line 69
    .line 70
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    move/from16 v18, v2

    .line 75
    .line 76
    if-gt v2, v1, :cond_2

    .line 77
    .line 78
    const/16 v2, 0x5b

    .line 79
    .line 80
    if-ge v1, v2, :cond_2

    .line 81
    .line 82
    add-int/lit8 v1, v1, -0x41

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_2
    const/16 v2, 0x61

    .line 86
    .line 87
    if-gt v2, v1, :cond_3

    .line 88
    .line 89
    const/16 v2, 0x7b

    .line 90
    .line 91
    if-ge v1, v2, :cond_3

    .line 92
    .line 93
    add-int/lit8 v1, v1, -0x47

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_3
    const/16 v2, 0x30

    .line 97
    .line 98
    if-gt v2, v1, :cond_4

    .line 99
    .line 100
    const/16 v2, 0x3a

    .line 101
    .line 102
    if-ge v1, v2, :cond_4

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x4

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_4
    const/16 v2, 0x2b

    .line 108
    .line 109
    if-eq v1, v2, :cond_9

    .line 110
    .line 111
    const/16 v2, 0x2d

    .line 112
    .line 113
    if-ne v1, v2, :cond_5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    const/16 v2, 0x2f

    .line 117
    .line 118
    if-eq v1, v2, :cond_8

    .line 119
    .line 120
    const/16 v2, 0x5f

    .line 121
    .line 122
    if-ne v1, v2, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    if-eq v1, v9, :cond_b

    .line 126
    .line 127
    if-eq v1, v8, :cond_b

    .line 128
    .line 129
    if-eq v1, v7, :cond_b

    .line 130
    .line 131
    if-ne v1, v6, :cond_7

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    move-object/from16 v11, v16

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_8
    :goto_3
    const/16 v1, 0x3f

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    :goto_4
    const/16 v1, 0x3e

    .line 141
    .line 142
    :goto_5
    shl-int/lit8 v2, v14, 0x6

    .line 143
    .line 144
    or-int/2addr v1, v2

    .line 145
    add-int/2addr v13, v4

    .line 146
    rem-int/lit8 v2, v13, 0x4

    .line 147
    .line 148
    if-nez v2, :cond_a

    .line 149
    .line 150
    add-int/lit8 v2, v15, 0x1

    .line 151
    .line 152
    shr-int/lit8 v14, v1, 0x10

    .line 153
    .line 154
    int-to-byte v14, v14

    .line 155
    aput-byte v14, v11, v15

    .line 156
    .line 157
    add-int/lit8 v14, v15, 0x2

    .line 158
    .line 159
    shr-int/lit8 v6, v1, 0x8

    .line 160
    .line 161
    int-to-byte v6, v6

    .line 162
    aput-byte v6, v11, v2

    .line 163
    .line 164
    add-int/lit8 v15, v15, 0x3

    .line 165
    .line 166
    int-to-byte v2, v1

    .line 167
    aput-byte v2, v11, v14

    .line 168
    .line 169
    :cond_a
    move v14, v1

    .line 170
    :cond_b
    :goto_6
    add-int/2addr v12, v4

    .line 171
    move/from16 v2, v18

    .line 172
    .line 173
    const/16 v6, 0x9

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_c
    const/16 v17, 0x3

    .line 177
    .line 178
    rem-int/lit8 v13, v13, 0x4

    .line 179
    .line 180
    if-eq v13, v4, :cond_7

    .line 181
    .line 182
    if-eq v13, v3, :cond_e

    .line 183
    .line 184
    move/from16 v0, v17

    .line 185
    .line 186
    if-eq v13, v0, :cond_d

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_d
    shl-int/lit8 v0, v14, 0x6

    .line 190
    .line 191
    add-int/2addr v4, v15

    .line 192
    shr-int/lit8 v1, v0, 0x10

    .line 193
    .line 194
    int-to-byte v1, v1

    .line 195
    aput-byte v1, v11, v15

    .line 196
    .line 197
    add-int/2addr v15, v3

    .line 198
    shr-int/lit8 v0, v0, 0x8

    .line 199
    .line 200
    int-to-byte v0, v0

    .line 201
    aput-byte v0, v11, v4

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_e
    shl-int/lit8 v0, v14, 0xc

    .line 205
    .line 206
    add-int/2addr v4, v15

    .line 207
    shr-int/lit8 v0, v0, 0x10

    .line 208
    .line 209
    int-to-byte v0, v0

    .line 210
    aput-byte v0, v11, v15

    .line 211
    .line 212
    move v15, v4

    .line 213
    :goto_7
    if-ne v15, v10, :cond_f

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_f
    invoke-static {v11, v15}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    const-string v0, "copyOf(...)"

    .line 221
    .line 222
    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :goto_8
    if-eqz v11, :cond_10

    .line 226
    .line 227
    new-instance v0, Lcg/j;

    .line 228
    .line 229
    invoke-direct {v0, v11}, Lcg/j;-><init>([B)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_10
    return-object v16
.end method

.method public static b(Ljava/lang/String;)Lcg/j;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    div-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    new-array v1, v0, [B

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-ge v2, v0, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v3, v2, 0x2

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ldg/b;->a(C)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    shl-int/lit8 v4, v4, 0x4

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-static {v3}, Ldg/b;->a(C)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v3, v4

    .line 48
    int-to-byte v3, v3

    .line 49
    aput-byte v3, v1, v2

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p0, Lcg/j;

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lcg/j;-><init>([B)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_1
    const-string v0, "Unexpected hex string: "

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public static c(Ljava/lang/String;)Lcg/j;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcg/j;

    .line 7
    .line 8
    sget-object v1, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getBytes(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcg/j;-><init>([B)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lcg/j;->c:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public static f()Z
    .locals 1

    .line 1
    sget-object v0, Lab/a;->a:LHf/e0;

    .line 2
    .line 3
    iget-object v0, v0, LHf/e0;->a:LHf/c0;

    .line 4
    .line 5
    check-cast v0, LHf/x0;

    .line 6
    .line 7
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public static g([B)Lcg/j;
    .locals 8

    .line 1
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    array-length v1, p0

    .line 5
    int-to-long v2, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    int-to-long v4, v1

    .line 8
    int-to-long v6, v0

    .line 9
    invoke-static/range {v2 .. v7}, Lcg/b;->f(JJJ)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcg/j;

    .line 13
    .line 14
    invoke-static {v1, v0, p0}, Lff/m;->k0(II[B)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v2, p0}, Lcg/j;-><init>([B)V

    .line 19
    .line 20
    .line 21
    return-object v2
.end method

.method public static h(Landroid/content/Context;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lab/b;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/content/Intent;

    .line 13
    .line 14
    const-class v1, Lab/a;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "foregroundServiceAction"

    .line 31
    .line 32
    const-string v3, "com.pravera.flutter_foreground_task.action.api_restart"

    .line 33
    .line 34
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, LY0/e;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance p0, LYa/a;

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    invoke-direct {p0, v0}, LYa/a;-><init>(I)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lab/b;->f()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_57

    .line 15
    .line 16
    new-instance v2, Landroid/content/Intent;

    .line 17
    .line 18
    const-class v3, Lab/a;

    .line 19
    .line 20
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    instance-of v3, v1, Ljava/util/Map;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast v1, Ljava/util/Map;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    const-string v3, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS"

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v6, "foregroundServiceAction"

    .line 43
    .line 44
    const-string v7, "com.pravera.flutter_foreground_task.action.api_start"

    .line 45
    .line 46
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    .line 51
    .line 52
    const-string v3, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_TYPES"

    .line 53
    .line 54
    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/4 v7, 0x2

    .line 61
    const/4 v8, 0x1

    .line 62
    const-string v9, "serviceTypes"

    .line 63
    .line 64
    const/16 v10, 0x1d

    .line 65
    .line 66
    if-lt v6, v10, :cond_11

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v6, 0x0

    .line 76
    :goto_1
    instance-of v11, v6, Ljava/util/List;

    .line 77
    .line 78
    if-eqz v11, :cond_2

    .line 79
    .line 80
    check-cast v6, Ljava/util/List;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/4 v6, 0x0

    .line 84
    :goto_2
    if-eqz v6, :cond_11

    .line 85
    .line 86
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    move v11, v5

    .line 91
    :cond_3
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_12

    .line 96
    .line 97
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    const/16 v14, 0x1e

    .line 110
    .line 111
    if-eqz v13, :cond_5

    .line 112
    .line 113
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    if-lt v12, v14, :cond_4

    .line 116
    .line 117
    const/16 v12, 0x40

    .line 118
    .line 119
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    const/4 v12, 0x0

    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eqz v13, :cond_6

    .line 137
    .line 138
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 139
    .line 140
    if-lt v12, v10, :cond_4

    .line 141
    .line 142
    const/16 v12, 0x10

    .line 143
    .line 144
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_7

    .line 159
    .line 160
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    if-lt v12, v10, :cond_4

    .line 163
    .line 164
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_7
    const/4 v13, 0x3

    .line 171
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    const/16 v15, 0x22

    .line 180
    .line 181
    if-eqz v13, :cond_8

    .line 182
    .line 183
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 184
    .line 185
    if-lt v12, v15, :cond_4

    .line 186
    .line 187
    const/16 v12, 0x100

    .line 188
    .line 189
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    goto/16 :goto_4

    .line 194
    .line 195
    :cond_8
    const/4 v13, 0x4

    .line 196
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const/16 v16, 0x8

    .line 205
    .line 206
    if-eqz v4, :cond_9

    .line 207
    .line 208
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    if-lt v4, v10, :cond_4

    .line 211
    .line 212
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    goto/16 :goto_4

    .line 217
    .line 218
    :cond_9
    const/4 v4, 0x5

    .line 219
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_a

    .line 228
    .line 229
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    if-lt v4, v10, :cond_4

    .line 232
    .line 233
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    goto/16 :goto_4

    .line 238
    .line 239
    :cond_a
    const/4 v4, 0x6

    .line 240
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_b

    .line 249
    .line 250
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 251
    .line 252
    if-lt v4, v10, :cond_4

    .line 253
    .line 254
    const/16 v4, 0x20

    .line 255
    .line 256
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    goto/16 :goto_4

    .line 261
    .line 262
    :cond_b
    const/4 v4, 0x7

    .line 263
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_c

    .line 272
    .line 273
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 274
    .line 275
    if-lt v4, v14, :cond_4

    .line 276
    .line 277
    const/16 v4, 0x80

    .line 278
    .line 279
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    goto/16 :goto_4

    .line 284
    .line 285
    :cond_c
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    if-eqz v4, :cond_d

    .line 294
    .line 295
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 296
    .line 297
    if-lt v4, v10, :cond_4

    .line 298
    .line 299
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    goto :goto_4

    .line 304
    :cond_d
    const/16 v4, 0x9

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_e

    .line 315
    .line 316
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 317
    .line 318
    if-lt v4, v15, :cond_4

    .line 319
    .line 320
    const/16 v4, 0x200

    .line 321
    .line 322
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    goto :goto_4

    .line 327
    :cond_e
    const/16 v4, 0xa

    .line 328
    .line 329
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    if-eqz v4, :cond_f

    .line 338
    .line 339
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 340
    .line 341
    if-lt v4, v15, :cond_4

    .line 342
    .line 343
    const/16 v4, 0x800

    .line 344
    .line 345
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    goto :goto_4

    .line 350
    :cond_f
    const/16 v4, 0xb

    .line 351
    .line 352
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-eqz v4, :cond_10

    .line 361
    .line 362
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 363
    .line 364
    if-lt v4, v15, :cond_4

    .line 365
    .line 366
    const/high16 v4, 0x40000000    # 2.0f

    .line 367
    .line 368
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    goto :goto_4

    .line 373
    :cond_10
    const/16 v4, 0xc

    .line 374
    .line 375
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_4

    .line 384
    .line 385
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 386
    .line 387
    if-lt v4, v15, :cond_4

    .line 388
    .line 389
    const/16 v4, 0x400

    .line 390
    .line 391
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v12

    .line 395
    :goto_4
    if-eqz v12, :cond_3

    .line 396
    .line 397
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    or-int/2addr v11, v4

    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :cond_11
    move v11, v5

    .line 405
    :cond_12
    if-lez v11, :cond_13

    .line 406
    .line 407
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-interface {v3, v9, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 412
    .line 413
    .line 414
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 415
    .line 416
    .line 417
    :cond_13
    const-string v3, "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS"

    .line 418
    .line 419
    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    const-string v6, "serviceId"

    .line 424
    .line 425
    if-eqz v1, :cond_14

    .line 426
    .line 427
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    goto :goto_5

    .line 432
    :cond_14
    const/4 v9, 0x0

    .line 433
    :goto_5
    instance-of v10, v9, Ljava/lang/Integer;

    .line 434
    .line 435
    if-eqz v10, :cond_15

    .line 436
    .line 437
    check-cast v9, Ljava/lang/Integer;

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :cond_15
    const/4 v9, 0x0

    .line 441
    :goto_6
    if-eqz v9, :cond_16

    .line 442
    .line 443
    :goto_7
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v9

    .line 447
    goto :goto_a

    .line 448
    :cond_16
    if-eqz v1, :cond_17

    .line 449
    .line 450
    const-string v9, "notificationId"

    .line 451
    .line 452
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    goto :goto_8

    .line 457
    :cond_17
    const/4 v9, 0x0

    .line 458
    :goto_8
    instance-of v10, v9, Ljava/lang/Integer;

    .line 459
    .line 460
    if-eqz v10, :cond_18

    .line 461
    .line 462
    check-cast v9, Ljava/lang/Integer;

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_18
    const/4 v9, 0x0

    .line 466
    :goto_9
    if-eqz v9, :cond_19

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_19
    const/16 v9, 0x3e8

    .line 470
    .line 471
    :goto_a
    const-string v10, "notificationChannelId"

    .line 472
    .line 473
    if-eqz v1, :cond_1a

    .line 474
    .line 475
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v11

    .line 479
    goto :goto_b

    .line 480
    :cond_1a
    const/4 v11, 0x0

    .line 481
    :goto_b
    instance-of v12, v11, Ljava/lang/String;

    .line 482
    .line 483
    if-eqz v12, :cond_1b

    .line 484
    .line 485
    check-cast v11, Ljava/lang/String;

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_1b
    const/4 v11, 0x0

    .line 489
    :goto_c
    const-string v12, "notificationChannelName"

    .line 490
    .line 491
    if-eqz v1, :cond_1c

    .line 492
    .line 493
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v13

    .line 497
    goto :goto_d

    .line 498
    :cond_1c
    const/4 v13, 0x0

    .line 499
    :goto_d
    instance-of v14, v13, Ljava/lang/String;

    .line 500
    .line 501
    if-eqz v14, :cond_1d

    .line 502
    .line 503
    check-cast v13, Ljava/lang/String;

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_1d
    const/4 v13, 0x0

    .line 507
    :goto_e
    const-string v14, "notificationChannelDescription"

    .line 508
    .line 509
    if-eqz v1, :cond_1e

    .line 510
    .line 511
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v15

    .line 515
    goto :goto_f

    .line 516
    :cond_1e
    const/4 v15, 0x0

    .line 517
    :goto_f
    instance-of v7, v15, Ljava/lang/String;

    .line 518
    .line 519
    if-eqz v7, :cond_1f

    .line 520
    .line 521
    check-cast v15, Ljava/lang/String;

    .line 522
    .line 523
    goto :goto_10

    .line 524
    :cond_1f
    const/4 v15, 0x0

    .line 525
    :goto_10
    const-string v7, "notificationChannelImportance"

    .line 526
    .line 527
    if-eqz v1, :cond_20

    .line 528
    .line 529
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v16

    .line 533
    move-object/from16 v8, v16

    .line 534
    .line 535
    goto :goto_11

    .line 536
    :cond_20
    const/4 v8, 0x0

    .line 537
    :goto_11
    instance-of v5, v8, Ljava/lang/Integer;

    .line 538
    .line 539
    if-eqz v5, :cond_21

    .line 540
    .line 541
    check-cast v8, Ljava/lang/Integer;

    .line 542
    .line 543
    goto :goto_12

    .line 544
    :cond_21
    const/4 v8, 0x0

    .line 545
    :goto_12
    if-eqz v8, :cond_22

    .line 546
    .line 547
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    goto :goto_13

    .line 552
    :cond_22
    const/4 v5, 0x2

    .line 553
    :goto_13
    const-string v8, "notificationPriority"

    .line 554
    .line 555
    if-eqz v1, :cond_23

    .line 556
    .line 557
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v17

    .line 561
    move-object/from16 p1, v4

    .line 562
    .line 563
    move-object/from16 v4, v17

    .line 564
    .line 565
    :goto_14
    move-object/from16 v17, v2

    .line 566
    .line 567
    goto :goto_15

    .line 568
    :cond_23
    move-object/from16 p1, v4

    .line 569
    .line 570
    const/4 v4, 0x0

    .line 571
    goto :goto_14

    .line 572
    :goto_15
    instance-of v2, v4, Ljava/lang/Integer;

    .line 573
    .line 574
    if-eqz v2, :cond_24

    .line 575
    .line 576
    check-cast v4, Ljava/lang/Integer;

    .line 577
    .line 578
    goto :goto_16

    .line 579
    :cond_24
    const/4 v4, 0x0

    .line 580
    :goto_16
    if-eqz v4, :cond_25

    .line 581
    .line 582
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    goto :goto_17

    .line 587
    :cond_25
    const/4 v2, -0x1

    .line 588
    :goto_17
    const-string v4, "enableVibration"

    .line 589
    .line 590
    if-eqz v1, :cond_26

    .line 591
    .line 592
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v18

    .line 596
    move-object/from16 v29, v18

    .line 597
    .line 598
    move-object/from16 v18, v3

    .line 599
    .line 600
    move-object/from16 v3, v29

    .line 601
    .line 602
    goto :goto_18

    .line 603
    :cond_26
    move-object/from16 v18, v3

    .line 604
    .line 605
    const/4 v3, 0x0

    .line 606
    :goto_18
    instance-of v0, v3, Ljava/lang/Boolean;

    .line 607
    .line 608
    if-eqz v0, :cond_27

    .line 609
    .line 610
    check-cast v3, Ljava/lang/Boolean;

    .line 611
    .line 612
    goto :goto_19

    .line 613
    :cond_27
    const/4 v3, 0x0

    .line 614
    :goto_19
    if-eqz v3, :cond_28

    .line 615
    .line 616
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    goto :goto_1a

    .line 621
    :cond_28
    const/4 v0, 0x0

    .line 622
    :goto_1a
    const-string v3, "playSound"

    .line 623
    .line 624
    if-eqz v1, :cond_29

    .line 625
    .line 626
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v19

    .line 630
    move-object/from16 v20, v19

    .line 631
    .line 632
    move-object/from16 v19, v3

    .line 633
    .line 634
    move-object/from16 v3, v20

    .line 635
    .line 636
    :goto_1b
    move/from16 v20, v0

    .line 637
    .line 638
    goto :goto_1c

    .line 639
    :cond_29
    move-object/from16 v19, v3

    .line 640
    .line 641
    const/4 v3, 0x0

    .line 642
    goto :goto_1b

    .line 643
    :goto_1c
    instance-of v0, v3, Ljava/lang/Boolean;

    .line 644
    .line 645
    if-eqz v0, :cond_2a

    .line 646
    .line 647
    check-cast v3, Ljava/lang/Boolean;

    .line 648
    .line 649
    goto :goto_1d

    .line 650
    :cond_2a
    const/4 v3, 0x0

    .line 651
    :goto_1d
    if-eqz v3, :cond_2b

    .line 652
    .line 653
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    goto :goto_1e

    .line 658
    :cond_2b
    const/4 v0, 0x0

    .line 659
    :goto_1e
    const-string v3, "showWhen"

    .line 660
    .line 661
    if-eqz v1, :cond_2c

    .line 662
    .line 663
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v21

    .line 667
    move-object/from16 v22, v21

    .line 668
    .line 669
    move-object/from16 v21, v3

    .line 670
    .line 671
    move-object/from16 v3, v22

    .line 672
    .line 673
    :goto_1f
    move/from16 v22, v0

    .line 674
    .line 675
    goto :goto_20

    .line 676
    :cond_2c
    move-object/from16 v21, v3

    .line 677
    .line 678
    const/4 v3, 0x0

    .line 679
    goto :goto_1f

    .line 680
    :goto_20
    instance-of v0, v3, Ljava/lang/Boolean;

    .line 681
    .line 682
    if-eqz v0, :cond_2d

    .line 683
    .line 684
    check-cast v3, Ljava/lang/Boolean;

    .line 685
    .line 686
    goto :goto_21

    .line 687
    :cond_2d
    const/4 v3, 0x0

    .line 688
    :goto_21
    if-eqz v3, :cond_2e

    .line 689
    .line 690
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    goto :goto_22

    .line 695
    :cond_2e
    const/4 v0, 0x0

    .line 696
    :goto_22
    const-string v3, "showBadge"

    .line 697
    .line 698
    if-eqz v1, :cond_2f

    .line 699
    .line 700
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v23

    .line 704
    move-object/from16 v24, v23

    .line 705
    .line 706
    move-object/from16 v23, v3

    .line 707
    .line 708
    move-object/from16 v3, v24

    .line 709
    .line 710
    :goto_23
    move/from16 v24, v0

    .line 711
    .line 712
    goto :goto_24

    .line 713
    :cond_2f
    move-object/from16 v23, v3

    .line 714
    .line 715
    const/4 v3, 0x0

    .line 716
    goto :goto_23

    .line 717
    :goto_24
    instance-of v0, v3, Ljava/lang/Boolean;

    .line 718
    .line 719
    if-eqz v0, :cond_30

    .line 720
    .line 721
    check-cast v3, Ljava/lang/Boolean;

    .line 722
    .line 723
    goto :goto_25

    .line 724
    :cond_30
    const/4 v3, 0x0

    .line 725
    :goto_25
    if-eqz v3, :cond_31

    .line 726
    .line 727
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    goto :goto_26

    .line 732
    :cond_31
    const/4 v0, 0x0

    .line 733
    :goto_26
    const-string v3, "onlyAlertOnce"

    .line 734
    .line 735
    if-eqz v1, :cond_32

    .line 736
    .line 737
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v25

    .line 741
    move-object/from16 v26, v25

    .line 742
    .line 743
    move-object/from16 v25, v3

    .line 744
    .line 745
    move-object/from16 v3, v26

    .line 746
    .line 747
    :goto_27
    move/from16 v26, v0

    .line 748
    .line 749
    goto :goto_28

    .line 750
    :cond_32
    move-object/from16 v25, v3

    .line 751
    .line 752
    const/4 v3, 0x0

    .line 753
    goto :goto_27

    .line 754
    :goto_28
    instance-of v0, v3, Ljava/lang/Boolean;

    .line 755
    .line 756
    if-eqz v0, :cond_33

    .line 757
    .line 758
    check-cast v3, Ljava/lang/Boolean;

    .line 759
    .line 760
    goto :goto_29

    .line 761
    :cond_33
    const/4 v3, 0x0

    .line 762
    :goto_29
    if-eqz v3, :cond_34

    .line 763
    .line 764
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    goto :goto_2a

    .line 769
    :cond_34
    const/4 v0, 0x0

    .line 770
    :goto_2a
    const-string v3, "visibility"

    .line 771
    .line 772
    if-eqz v1, :cond_35

    .line 773
    .line 774
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v27

    .line 778
    move-object/from16 v28, v27

    .line 779
    .line 780
    move-object/from16 v27, v1

    .line 781
    .line 782
    move-object/from16 v1, v28

    .line 783
    .line 784
    :goto_2b
    move-object/from16 v28, v3

    .line 785
    .line 786
    goto :goto_2c

    .line 787
    :cond_35
    move-object/from16 v27, v1

    .line 788
    .line 789
    const/4 v1, 0x0

    .line 790
    goto :goto_2b

    .line 791
    :goto_2c
    instance-of v3, v1, Ljava/lang/Integer;

    .line 792
    .line 793
    if-eqz v3, :cond_36

    .line 794
    .line 795
    check-cast v1, Ljava/lang/Integer;

    .line 796
    .line 797
    goto :goto_2d

    .line 798
    :cond_36
    const/4 v1, 0x0

    .line 799
    :goto_2d
    if-eqz v1, :cond_37

    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    goto :goto_2e

    .line 806
    :cond_37
    const/4 v1, 0x1

    .line 807
    :goto_2e
    invoke-interface/range {p1 .. p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-interface {v3, v6, v9}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 812
    .line 813
    .line 814
    invoke-interface {v3, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 815
    .line 816
    .line 817
    invoke-interface {v3, v12, v13}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 818
    .line 819
    .line 820
    invoke-interface {v3, v14, v15}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 821
    .line 822
    .line 823
    invoke-interface {v3, v7, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 824
    .line 825
    .line 826
    invoke-interface {v3, v8, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 827
    .line 828
    .line 829
    move/from16 v2, v20

    .line 830
    .line 831
    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 832
    .line 833
    .line 834
    move-object/from16 v2, v19

    .line 835
    .line 836
    move/from16 v4, v22

    .line 837
    .line 838
    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 839
    .line 840
    .line 841
    move-object/from16 v2, v21

    .line 842
    .line 843
    move/from16 v4, v24

    .line 844
    .line 845
    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 846
    .line 847
    .line 848
    move-object/from16 v2, v23

    .line 849
    .line 850
    move/from16 v4, v26

    .line 851
    .line 852
    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 853
    .line 854
    .line 855
    move-object/from16 v2, v25

    .line 856
    .line 857
    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 858
    .line 859
    .line 860
    move-object/from16 v0, v28

    .line 861
    .line 862
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 863
    .line 864
    .line 865
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 866
    .line 867
    .line 868
    const-string v0, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS"

    .line 869
    .line 870
    const/4 v2, 0x0

    .line 871
    move-object/from16 v1, p0

    .line 872
    .line 873
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    const-string v2, "taskEventAction"

    .line 878
    .line 879
    move-object/from16 v4, v27

    .line 880
    .line 881
    if-eqz v27, :cond_38

    .line 882
    .line 883
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v5

    .line 887
    goto :goto_2f

    .line 888
    :cond_38
    const/4 v5, 0x0

    .line 889
    :goto_2f
    instance-of v6, v5, Ljava/util/Map;

    .line 890
    .line 891
    if-eqz v6, :cond_39

    .line 892
    .line 893
    check-cast v5, Ljava/util/Map;

    .line 894
    .line 895
    goto :goto_30

    .line 896
    :cond_39
    const/4 v5, 0x0

    .line 897
    :goto_30
    if-eqz v5, :cond_3a

    .line 898
    .line 899
    new-instance v6, Lorg/json/JSONObject;

    .line 900
    .line 901
    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    goto :goto_31

    .line 909
    :cond_3a
    const/4 v5, 0x0

    .line 910
    :goto_31
    const-string v6, "autoRunOnBoot"

    .line 911
    .line 912
    if-eqz v4, :cond_3b

    .line 913
    .line 914
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v7

    .line 918
    goto :goto_32

    .line 919
    :cond_3b
    const/4 v7, 0x0

    .line 920
    :goto_32
    instance-of v8, v7, Ljava/lang/Boolean;

    .line 921
    .line 922
    if-eqz v8, :cond_3c

    .line 923
    .line 924
    check-cast v7, Ljava/lang/Boolean;

    .line 925
    .line 926
    goto :goto_33

    .line 927
    :cond_3c
    const/4 v7, 0x0

    .line 928
    :goto_33
    if-eqz v7, :cond_3d

    .line 929
    .line 930
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 931
    .line 932
    .line 933
    move-result v7

    .line 934
    goto :goto_34

    .line 935
    :cond_3d
    const/4 v7, 0x0

    .line 936
    :goto_34
    const-string v8, "autoRunOnMyPackageReplaced"

    .line 937
    .line 938
    if-eqz v4, :cond_3e

    .line 939
    .line 940
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v9

    .line 944
    goto :goto_35

    .line 945
    :cond_3e
    const/4 v9, 0x0

    .line 946
    :goto_35
    instance-of v10, v9, Ljava/lang/Boolean;

    .line 947
    .line 948
    if-eqz v10, :cond_3f

    .line 949
    .line 950
    check-cast v9, Ljava/lang/Boolean;

    .line 951
    .line 952
    goto :goto_36

    .line 953
    :cond_3f
    const/4 v9, 0x0

    .line 954
    :goto_36
    if-eqz v9, :cond_40

    .line 955
    .line 956
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    goto :goto_37

    .line 961
    :cond_40
    const/4 v9, 0x0

    .line 962
    :goto_37
    const-string v10, "allowWakeLock"

    .line 963
    .line 964
    if-eqz v4, :cond_41

    .line 965
    .line 966
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v11

    .line 970
    goto :goto_38

    .line 971
    :cond_41
    const/4 v11, 0x0

    .line 972
    :goto_38
    instance-of v12, v11, Ljava/lang/Boolean;

    .line 973
    .line 974
    if-eqz v12, :cond_42

    .line 975
    .line 976
    check-cast v11, Ljava/lang/Boolean;

    .line 977
    .line 978
    goto :goto_39

    .line 979
    :cond_42
    const/4 v11, 0x0

    .line 980
    :goto_39
    if-eqz v11, :cond_43

    .line 981
    .line 982
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 983
    .line 984
    .line 985
    move-result v11

    .line 986
    goto :goto_3a

    .line 987
    :cond_43
    const/4 v11, 0x1

    .line 988
    :goto_3a
    const-string v12, "allowWifiLock"

    .line 989
    .line 990
    if-eqz v4, :cond_44

    .line 991
    .line 992
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v13

    .line 996
    goto :goto_3b

    .line 997
    :cond_44
    const/4 v13, 0x0

    .line 998
    :goto_3b
    instance-of v14, v13, Ljava/lang/Boolean;

    .line 999
    .line 1000
    if-eqz v14, :cond_45

    .line 1001
    .line 1002
    check-cast v13, Ljava/lang/Boolean;

    .line 1003
    .line 1004
    goto :goto_3c

    .line 1005
    :cond_45
    const/4 v13, 0x0

    .line 1006
    :goto_3c
    if-eqz v13, :cond_46

    .line 1007
    .line 1008
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v13

    .line 1012
    goto :goto_3d

    .line 1013
    :cond_46
    const/4 v13, 0x0

    .line 1014
    :goto_3d
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v3

    .line 1018
    invoke-interface {v3, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1019
    .line 1020
    .line 1021
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v3, v8, v9}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1025
    .line 1026
    .line 1027
    invoke-interface {v3, v10, v11}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1028
    .line 1029
    .line 1030
    invoke-interface {v3, v12, v13}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1034
    .line 1035
    .line 1036
    const/4 v2, 0x0

    .line 1037
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    const-string v2, "callbackHandle"

    .line 1042
    .line 1043
    if-eqz v4, :cond_47

    .line 1044
    .line 1045
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    goto :goto_3e

    .line 1050
    :cond_47
    const/4 v3, 0x0

    .line 1051
    :goto_3e
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    invoke-static {v3}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v3

    .line 1059
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1064
    .line 1065
    .line 1066
    if-eqz v3, :cond_48

    .line 1067
    .line 1068
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v5

    .line 1072
    invoke-interface {v0, v2, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1073
    .line 1074
    .line 1075
    :cond_48
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1076
    .line 1077
    .line 1078
    move-object/from16 v0, v18

    .line 1079
    .line 1080
    const/4 v2, 0x0

    .line 1081
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    const-string v2, "notificationContentTitle"

    .line 1086
    .line 1087
    if-eqz v4, :cond_49

    .line 1088
    .line 1089
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    goto :goto_3f

    .line 1094
    :cond_49
    const/4 v3, 0x0

    .line 1095
    :goto_3f
    instance-of v5, v3, Ljava/lang/String;

    .line 1096
    .line 1097
    if-eqz v5, :cond_4a

    .line 1098
    .line 1099
    check-cast v3, Ljava/lang/String;

    .line 1100
    .line 1101
    goto :goto_40

    .line 1102
    :cond_4a
    const/4 v3, 0x0

    .line 1103
    :goto_40
    const-string v5, ""

    .line 1104
    .line 1105
    if-nez v3, :cond_4b

    .line 1106
    .line 1107
    move-object v3, v5

    .line 1108
    :cond_4b
    const-string v6, "notificationContentText"

    .line 1109
    .line 1110
    if-eqz v4, :cond_4c

    .line 1111
    .line 1112
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v7

    .line 1116
    goto :goto_41

    .line 1117
    :cond_4c
    const/4 v7, 0x0

    .line 1118
    :goto_41
    instance-of v8, v7, Ljava/lang/String;

    .line 1119
    .line 1120
    if-eqz v8, :cond_4d

    .line 1121
    .line 1122
    check-cast v7, Ljava/lang/String;

    .line 1123
    .line 1124
    goto :goto_42

    .line 1125
    :cond_4d
    const/4 v7, 0x0

    .line 1126
    :goto_42
    if-nez v7, :cond_4e

    .line 1127
    .line 1128
    goto :goto_43

    .line 1129
    :cond_4e
    move-object v5, v7

    .line 1130
    :goto_43
    const-string v7, "icon"

    .line 1131
    .line 1132
    if-eqz v4, :cond_4f

    .line 1133
    .line 1134
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v8

    .line 1138
    goto :goto_44

    .line 1139
    :cond_4f
    const/4 v8, 0x0

    .line 1140
    :goto_44
    instance-of v9, v8, Ljava/util/Map;

    .line 1141
    .line 1142
    if-eqz v9, :cond_50

    .line 1143
    .line 1144
    check-cast v8, Ljava/util/Map;

    .line 1145
    .line 1146
    goto :goto_45

    .line 1147
    :cond_50
    const/4 v8, 0x0

    .line 1148
    :goto_45
    if-eqz v8, :cond_51

    .line 1149
    .line 1150
    new-instance v9, Lorg/json/JSONObject;

    .line 1151
    .line 1152
    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v8

    .line 1159
    goto :goto_46

    .line 1160
    :cond_51
    const/4 v8, 0x0

    .line 1161
    :goto_46
    const-string v9, "buttons"

    .line 1162
    .line 1163
    if-eqz v4, :cond_52

    .line 1164
    .line 1165
    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v10

    .line 1169
    goto :goto_47

    .line 1170
    :cond_52
    const/4 v10, 0x0

    .line 1171
    :goto_47
    instance-of v11, v10, Ljava/util/List;

    .line 1172
    .line 1173
    if-eqz v11, :cond_53

    .line 1174
    .line 1175
    check-cast v10, Ljava/util/List;

    .line 1176
    .line 1177
    goto :goto_48

    .line 1178
    :cond_53
    const/4 v10, 0x0

    .line 1179
    :goto_48
    if-eqz v10, :cond_54

    .line 1180
    .line 1181
    new-instance v11, Lorg/json/JSONArray;

    .line 1182
    .line 1183
    check-cast v10, Ljava/util/Collection;

    .line 1184
    .line 1185
    invoke-direct {v11, v10}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v10

    .line 1192
    goto :goto_49

    .line 1193
    :cond_54
    const/4 v10, 0x0

    .line 1194
    :goto_49
    const-string v11, "initialRoute"

    .line 1195
    .line 1196
    if-eqz v4, :cond_55

    .line 1197
    .line 1198
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v4

    .line 1202
    goto :goto_4a

    .line 1203
    :cond_55
    const/4 v4, 0x0

    .line 1204
    :goto_4a
    instance-of v12, v4, Ljava/lang/String;

    .line 1205
    .line 1206
    if-eqz v12, :cond_56

    .line 1207
    .line 1208
    check-cast v4, Ljava/lang/String;

    .line 1209
    .line 1210
    goto :goto_4b

    .line 1211
    :cond_56
    const/4 v4, 0x0

    .line 1212
    :goto_4b
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1217
    .line 1218
    .line 1219
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v0, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1226
    .line 1227
    .line 1228
    invoke-interface {v0, v11, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1229
    .line 1230
    .line 1231
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1232
    .line 1233
    .line 1234
    move-object/from16 v0, v17

    .line 1235
    .line 1236
    invoke-static {v1, v0}, LY0/e;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1237
    .line 1238
    .line 1239
    return-void

    .line 1240
    :cond_57
    new-instance v0, LYa/a;

    .line 1241
    .line 1242
    const-string v1, "The service has already started."

    .line 1243
    .line 1244
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    throw v0
.end method

.method public static j(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lab/b;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/content/Intent;

    .line 13
    .line 14
    const-class v1, Lab/a;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS"

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "foregroundServiceAction"

    .line 31
    .line 32
    const-string v4, "com.pravera.flutter_foreground_task.action.api_stop"

    .line 33
    .line 34
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 38
    .line 39
    .line 40
    const-string v1, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_TYPES"

    .line 41
    .line 42
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 54
    .line 55
    .line 56
    const-string v1, "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS"

    .line 57
    .line 58
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 70
    .line 71
    .line 72
    const-string v3, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS"

    .line 73
    .line 74
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    .line 99
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 114
    .line 115
    .line 116
    invoke-static {p0, v0}, LY0/e;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_0
    new-instance p0, LYa/a;

    .line 121
    .line 122
    const/16 v0, 0xb

    .line 123
    .line 124
    invoke-direct {p0, v0}, LYa/a;-><init>(I)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lab/b;->f()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_24

    .line 15
    .line 16
    new-instance v2, Landroid/content/Intent;

    .line 17
    .line 18
    const-class v3, Lab/a;

    .line 19
    .line 20
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    instance-of v3, v1, Ljava/util/Map;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast v1, Ljava/util/Map;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    const-string v3, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS"

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v6, "foregroundServiceAction"

    .line 43
    .line 44
    const-string v7, "com.pravera.flutter_foreground_task.action.api_update"

    .line 45
    .line 46
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    .line 51
    .line 52
    const-string v3, "com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS"

    .line 53
    .line 54
    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const-string v7, "taskEventAction"

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v8, 0x0

    .line 68
    :goto_1
    instance-of v9, v8, Ljava/util/Map;

    .line 69
    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    check-cast v8, Ljava/util/Map;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/4 v8, 0x0

    .line 76
    :goto_2
    if-eqz v8, :cond_3

    .line 77
    .line 78
    new-instance v9, Lorg/json/JSONObject;

    .line 79
    .line 80
    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    const/4 v8, 0x0

    .line 89
    :goto_3
    const-string v9, "autoRunOnBoot"

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const/4 v10, 0x0

    .line 99
    :goto_4
    instance-of v11, v10, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-eqz v11, :cond_5

    .line 102
    .line 103
    check-cast v10, Ljava/lang/Boolean;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    const/4 v10, 0x0

    .line 107
    :goto_5
    const-string v11, "autoRunOnMyPackageReplaced"

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    goto :goto_6

    .line 116
    :cond_6
    const/4 v12, 0x0

    .line 117
    :goto_6
    instance-of v13, v12, Ljava/lang/Boolean;

    .line 118
    .line 119
    if-eqz v13, :cond_7

    .line 120
    .line 121
    check-cast v12, Ljava/lang/Boolean;

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    const/4 v12, 0x0

    .line 125
    :goto_7
    const-string v13, "allowWakeLock"

    .line 126
    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    goto :goto_8

    .line 134
    :cond_8
    const/4 v14, 0x0

    .line 135
    :goto_8
    instance-of v15, v14, Ljava/lang/Boolean;

    .line 136
    .line 137
    if-eqz v15, :cond_9

    .line 138
    .line 139
    check-cast v14, Ljava/lang/Boolean;

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_9
    const/4 v14, 0x0

    .line 143
    :goto_9
    const-string v15, "allowWifiLock"

    .line 144
    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    move-object/from16 v4, v16

    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_a
    const/4 v4, 0x0

    .line 155
    :goto_a
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 156
    .line 157
    if-eqz v5, :cond_b

    .line 158
    .line 159
    check-cast v4, Ljava/lang/Boolean;

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_b
    const/4 v4, 0x0

    .line 163
    :goto_b
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    if-eqz v8, :cond_c

    .line 168
    .line 169
    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 170
    .line 171
    .line 172
    :cond_c
    if-eqz v10, :cond_d

    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    invoke-interface {v5, v9, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 179
    .line 180
    .line 181
    :cond_d
    if-eqz v12, :cond_e

    .line 182
    .line 183
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    invoke-interface {v5, v11, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 188
    .line 189
    .line 190
    :cond_e
    if-eqz v14, :cond_f

    .line 191
    .line 192
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    invoke-interface {v5, v13, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 197
    .line 198
    .line 199
    :cond_f
    if-eqz v4, :cond_10

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-interface {v5, v15, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 206
    .line 207
    .line 208
    :cond_10
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 209
    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    const-string v4, "callbackHandle"

    .line 217
    .line 218
    if-eqz v1, :cond_11

    .line 219
    .line 220
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    goto :goto_c

    .line 225
    :cond_11
    const/4 v5, 0x0

    .line 226
    :goto_c
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v5}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    if-eqz v5, :cond_12

    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 241
    .line 242
    .line 243
    move-result-wide v5

    .line 244
    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 245
    .line 246
    .line 247
    :cond_12
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 248
    .line 249
    .line 250
    const-string v3, "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS"

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const-string v4, "notificationContentTitle"

    .line 258
    .line 259
    if-eqz v1, :cond_13

    .line 260
    .line 261
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    goto :goto_d

    .line 266
    :cond_13
    const/4 v5, 0x0

    .line 267
    :goto_d
    instance-of v6, v5, Ljava/lang/String;

    .line 268
    .line 269
    if-eqz v6, :cond_14

    .line 270
    .line 271
    check-cast v5, Ljava/lang/String;

    .line 272
    .line 273
    goto :goto_e

    .line 274
    :cond_14
    const/4 v5, 0x0

    .line 275
    :goto_e
    const-string v6, "notificationContentText"

    .line 276
    .line 277
    if-eqz v1, :cond_15

    .line 278
    .line 279
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    goto :goto_f

    .line 284
    :cond_15
    const/4 v7, 0x0

    .line 285
    :goto_f
    instance-of v8, v7, Ljava/lang/String;

    .line 286
    .line 287
    if-eqz v8, :cond_16

    .line 288
    .line 289
    check-cast v7, Ljava/lang/String;

    .line 290
    .line 291
    goto :goto_10

    .line 292
    :cond_16
    const/4 v7, 0x0

    .line 293
    :goto_10
    const-string v8, "icon"

    .line 294
    .line 295
    if-eqz v1, :cond_17

    .line 296
    .line 297
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    goto :goto_11

    .line 302
    :cond_17
    const/4 v9, 0x0

    .line 303
    :goto_11
    instance-of v10, v9, Ljava/util/Map;

    .line 304
    .line 305
    if-eqz v10, :cond_18

    .line 306
    .line 307
    check-cast v9, Ljava/util/Map;

    .line 308
    .line 309
    goto :goto_12

    .line 310
    :cond_18
    const/4 v9, 0x0

    .line 311
    :goto_12
    if-eqz v9, :cond_19

    .line 312
    .line 313
    new-instance v10, Lorg/json/JSONObject;

    .line 314
    .line 315
    invoke-direct {v10, v9}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    goto :goto_13

    .line 323
    :cond_19
    const/4 v9, 0x0

    .line 324
    :goto_13
    const-string v10, "buttons"

    .line 325
    .line 326
    if-eqz v1, :cond_1a

    .line 327
    .line 328
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    goto :goto_14

    .line 333
    :cond_1a
    const/4 v11, 0x0

    .line 334
    :goto_14
    instance-of v12, v11, Ljava/util/List;

    .line 335
    .line 336
    if-eqz v12, :cond_1b

    .line 337
    .line 338
    check-cast v11, Ljava/util/List;

    .line 339
    .line 340
    goto :goto_15

    .line 341
    :cond_1b
    const/4 v11, 0x0

    .line 342
    :goto_15
    if-eqz v11, :cond_1c

    .line 343
    .line 344
    new-instance v12, Lorg/json/JSONArray;

    .line 345
    .line 346
    check-cast v11, Ljava/util/Collection;

    .line 347
    .line 348
    invoke-direct {v12, v11}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v11

    .line 355
    goto :goto_16

    .line 356
    :cond_1c
    const/4 v11, 0x0

    .line 357
    :goto_16
    const-string v12, "initialRoute"

    .line 358
    .line 359
    if-eqz v1, :cond_1d

    .line 360
    .line 361
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    goto :goto_17

    .line 366
    :cond_1d
    const/4 v1, 0x0

    .line 367
    :goto_17
    instance-of v13, v1, Ljava/lang/String;

    .line 368
    .line 369
    if-eqz v13, :cond_1e

    .line 370
    .line 371
    check-cast v1, Ljava/lang/String;

    .line 372
    .line 373
    goto :goto_18

    .line 374
    :cond_1e
    const/4 v1, 0x0

    .line 375
    :goto_18
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    if-eqz v5, :cond_1f

    .line 380
    .line 381
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 382
    .line 383
    .line 384
    :cond_1f
    if-eqz v7, :cond_20

    .line 385
    .line 386
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 387
    .line 388
    .line 389
    :cond_20
    if-eqz v9, :cond_21

    .line 390
    .line 391
    invoke-interface {v3, v8, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 392
    .line 393
    .line 394
    :cond_21
    if-eqz v11, :cond_22

    .line 395
    .line 396
    invoke-interface {v3, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 397
    .line 398
    .line 399
    :cond_22
    if-eqz v1, :cond_23

    .line 400
    .line 401
    invoke-interface {v3, v12, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 402
    .line 403
    .line 404
    :cond_23
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v2}, LY0/e;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :cond_24
    new-instance v0, LYa/a;

    .line 412
    .line 413
    const/16 v1, 0xb

    .line 414
    .line 415
    invoke-direct {v0, v1}, LYa/a;-><init>(I)V

    .line 416
    .line 417
    .line 418
    throw v0
.end method


# virtual methods
.method public d(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;Lr7/b;)LG5/c;
    .locals 3

    .line 1
    new-instance v0, LG5/c;

    .line 2
    .line 3
    invoke-direct {v0}, LG5/c;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-interface {p3, p1, p2, v1}, Lr7/b;->a(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iput v2, v0, LG5/c;->b:I

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iput v1, v0, LG5/c;->c:I

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-interface {p3, p1, p2}, Lr7/b;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, v0, LG5/c;->a:I

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    iput p1, v0, LG5/c;->c:I

    .line 28
    .line 29
    :cond_1
    return-object v0
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public m(II)Ls2/C;
    .locals 0

    .line 1
    new-instance p1, Ls2/l;

    .line 2
    .line 3
    invoke-direct {p1}, Ls2/l;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p1, Lya/a;

    .line 2
    .line 3
    invoke-direct {p1}, Lya/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LA7/z;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {v0, v1}, LA7/z;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Lya/a;->a:Ljava/lang/ref/ReferenceQueue;

    .line 13
    .line 14
    new-instance v2, Lya/l;

    .line 15
    .line 16
    iget-object v3, p1, Lya/a;->b:Ljava/util/Set;

    .line 17
    .line 18
    invoke-direct {v2, p1, v1, v3, v0}, Lya/l;-><init>(Lya/a;Ljava/lang/ref/ReferenceQueue;Ljava/util/Set;LA7/z;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v0, LL7/b;

    .line 25
    .line 26
    const/16 v2, 0x1d

    .line 27
    .line 28
    invoke-direct {v0, v2, v1, v3}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/lang/Thread;

    .line 32
    .line 33
    const-string v2, "MlKitCleaner"

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public s(Ls2/w;)V
    .locals 0

    .line 1
    return-void
.end method
