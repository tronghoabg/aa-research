.class public abstract Ltg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ1/g;


# static fields
.field public static a:Li0/d;

.field public static final synthetic b:I

.field public static c:J

.field public static d:Ljava/lang/reflect/Method;

.field public static e:Ljava/lang/reflect/Method;

.field public static f:Ljava/lang/reflect/Method;


# direct methods
.method public static final A()Li0/d;
    .locals 17

    .line 1
    sget-object v0, Ltg/b;->a:Li0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Li0/c;

    .line 7
    .line 8
    sget-wide v7, Le0/q;->i:J

    .line 9
    .line 10
    const/high16 v6, 0x41c00000    # 24.0f

    .line 11
    .line 12
    const/4 v9, 0x5

    .line 13
    const-string v2, "Filled.Star"

    .line 14
    .line 15
    const/high16 v3, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v4, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v5, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-direct/range {v1 .. v10}, Li0/c;-><init>(Ljava/lang/String;FFFFJIZ)V

    .line 23
    .line 24
    .line 25
    sget v0, Li0/I;->a:I

    .line 26
    .line 27
    new-instance v6, Le0/G;

    .line 28
    .line 29
    sget-wide v2, Le0/q;->b:J

    .line 30
    .line 31
    invoke-direct {v6, v2, v3}, Le0/G;-><init>(J)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v0, Li0/l;

    .line 40
    .line 41
    const v2, 0x418a28f6    # 17.27f

    .line 42
    .line 43
    .line 44
    const/high16 v3, 0x41400000    # 12.0f

    .line 45
    .line 46
    invoke-direct {v0, v3, v2}, Li0/l;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    new-instance v0, Li0/k;

    .line 53
    .line 54
    const v2, 0x419170a4    # 18.18f

    .line 55
    .line 56
    .line 57
    const/high16 v5, 0x41a80000    # 21.0f

    .line 58
    .line 59
    invoke-direct {v0, v2, v5}, Li0/k;-><init>(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v0, Li0/s;

    .line 66
    .line 67
    const v2, -0x402e147b    # -1.64f

    .line 68
    .line 69
    .line 70
    const v7, -0x3f1f0a3d    # -7.03f

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v2, v7}, Li0/s;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    new-instance v0, Li0/k;

    .line 80
    .line 81
    const/high16 v2, 0x41b00000    # 22.0f

    .line 82
    .line 83
    const v7, 0x4113d70a    # 9.24f

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v2, v7}, Li0/k;-><init>(FF)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    new-instance v0, Li0/s;

    .line 93
    .line 94
    const v2, -0x3f19eb85    # -7.19f

    .line 95
    .line 96
    .line 97
    const v8, -0x40e3d70a    # -0.61f

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v2, v8}, Li0/s;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v0, Li0/k;

    .line 107
    .line 108
    const/high16 v2, 0x40000000    # 2.0f

    .line 109
    .line 110
    invoke-direct {v0, v3, v2}, Li0/k;-><init>(FF)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    new-instance v0, Li0/k;

    .line 117
    .line 118
    const v3, 0x41130a3d    # 9.19f

    .line 119
    .line 120
    .line 121
    const v8, 0x410a147b    # 8.63f

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v3, v8}, Li0/k;-><init>(FF)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    new-instance v0, Li0/k;

    .line 131
    .line 132
    invoke-direct {v0, v2, v7}, Li0/k;-><init>(FF)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    new-instance v0, Li0/s;

    .line 139
    .line 140
    const v2, 0x40aeb852    # 5.46f

    .line 141
    .line 142
    .line 143
    const v3, 0x40975c29    # 4.73f

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v2, v3}, Li0/s;-><init>(FF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    new-instance v0, Li0/k;

    .line 153
    .line 154
    const v2, 0x40ba3d71    # 5.82f

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, v2, v5}, Li0/k;-><init>(FF)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    sget-object v0, Li0/h;->c:Li0/h;

    .line 164
    .line 165
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Li0/c;->b()V

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Li0/c;->i:Ljava/util/ArrayList;

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-static {v0, v2}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Li0/b;

    .line 179
    .line 180
    iget-object v0, v0, Li0/b;->j:Ljava/util/List;

    .line 181
    .line 182
    new-instance v2, Li0/O;

    .line 183
    .line 184
    const-string v3, ""

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    const/high16 v7, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/4 v8, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v10, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v12, 0x2

    .line 196
    const/high16 v13, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const/high16 v15, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/16 v16, 0x0

    .line 202
    .line 203
    invoke-direct/range {v2 .. v16}, Li0/O;-><init>(Ljava/lang/String;Ljava/util/List;ILe0/m;FLe0/m;FFIIFFFF)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Li0/c;->a()Li0/d;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, Ltg/b;->a:Li0/d;

    .line 214
    .line 215
    return-object v0
.end method

.method public static B(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    const-string v2, "android.os.SystemProperties"

    .line 4
    .line 5
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "get"

    .line 10
    .line 11
    new-array v4, v1, [Ljava/lang/Class;

    .line 12
    .line 13
    const-class v5, Ljava/lang/String;

    .line 14
    .line 15
    aput-object v5, v4, v0

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-array v1, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p0, v1, v0

    .line 24
    .line 25
    invoke-virtual {v3, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static C(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    throw p0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "Unable to call "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " via reflection"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "Trace"

    .line 42
    .line 43
    invoke-static {v0, p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static D()Z
    .locals 6

    .line 1
    const-string v4, "/data/local/tmp/supersu"

    .line 2
    .line 3
    const-string v5, "/dev/com.koushikdutta.superuser.daemon/"

    .line 4
    .line 5
    const-string v0, "/system/app/Superuser.apk"

    .line 6
    .line 7
    const-string v1, "/system/app/SuperSU.apk"

    .line 8
    .line 9
    const-string v2, "/system/priv-app/SuperSU/SuperSU.apk"

    .line 10
    .line 11
    const-string v3, "/system/xbin/daemonsu"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    const/4 v3, 0x6

    .line 20
    if-ge v2, v3, :cond_1

    .line 21
    .line 22
    aget-object v3, v0, v2

    .line 23
    .line 24
    new-instance v4, Ljava/io/File;

    .line 25
    .line 26
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v1
.end method

.method public static E()Z
    .locals 6

    .line 1
    sget-object v0, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "eng"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, "userdebug"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    move v0, v2

    .line 25
    :goto_1
    sget-object v1, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    const-string v4, "dev-keys"

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    const-string v4, "test-keys"

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :cond_2
    move v1, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move v1, v3

    .line 48
    :goto_2
    const-string v4, "ro.debuggable"

    .line 49
    .line 50
    invoke-static {v4}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "1"

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v0, :cond_5

    .line 61
    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    return v3

    .line 68
    :cond_5
    :goto_3
    return v2
.end method

.method public static F()Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v3, 0x1d

    .line 6
    .line 7
    if-lt v2, v3, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ls3/a;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const-string v2, "isTagEnabled"

    .line 15
    .line 16
    const-class v3, Landroid/os/Trace;

    .line 17
    .line 18
    :try_start_0
    sget-object v4, Ltg/b;->d:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    const-string v4, "TRACE_TAG_APP"

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    sput-wide v6, Ltg/b;->c:J

    .line 34
    .line 35
    new-array v4, v0, [Ljava/lang/Class;

    .line 36
    .line 37
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    aput-object v6, v4, v1

    .line 40
    .line 41
    invoke-virtual {v3, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sput-object v3, Ltg/b;->d:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    sget-object v3, Ltg/b;->d:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    sget-wide v6, Ltg/b;->c:J

    .line 53
    .line 54
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-array v0, v0, [Ljava/lang/Object;

    .line 59
    .line 60
    aput-object v4, v0, v1

    .line 61
    .line 62
    invoke-virtual {v3, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    return v0

    .line 73
    :goto_1
    invoke-static {v2, v0}, Ltg/b;->C(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 74
    .line 75
    .line 76
    return v1
.end method

.method public static G(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "power"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/os/PowerManager;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public static H(Landroid/content/Context;)Z
    .locals 7

    .line 1
    new-instance v0, Lx4/d;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx4/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ltg/b;->E()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0}, Lx4/d;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p0}, Ltg/b;->N(Landroid/content/Context;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {}, Ltg/b;->r()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {}, Ltg/b;->v()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v1}, Ltg/b;->p(Z)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v6, "xiaomi"

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    const-string v6, "redmi"

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_2

    .line 57
    .line 58
    const-string v6, "poco"

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    if-eqz v1, :cond_1

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    invoke-static {}, Ltg/b;->D()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_4

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    if-nez v0, :cond_4

    .line 81
    .line 82
    if-nez p0, :cond_4

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    if-nez v3, :cond_4

    .line 87
    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    :goto_0
    invoke-static {}, Ltg/b;->D()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_4

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    if-eqz v3, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    const/4 p0, 0x0

    .line 103
    return p0

    .line 104
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 105
    return p0
.end method

.method public static I(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static L(Ljava/lang/String;)LJd/x;
    .locals 10

    .line 1
    const-string v0, "query"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LBf/k;->s0(Ljava/lang/CharSequence;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, LJd/x;->b:LJd/l;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p0, LJd/h;->c:LJd/h;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object v0, LJd/x;->b:LJd/l;

    .line 21
    .line 22
    new-instance v0, LJd/z;

    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, LBf/k;->s0(Ljava/lang/CharSequence;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/16 v3, 0x3e8

    .line 35
    .line 36
    const/4 v4, -0x1

    .line 37
    if-ltz v1, :cond_6

    .line 38
    .line 39
    move v5, v2

    .line 40
    move v6, v5

    .line 41
    move v7, v4

    .line 42
    :goto_0
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    const/16 v9, 0x26

    .line 50
    .line 51
    if-eq v8, v9, :cond_3

    .line 52
    .line 53
    const/16 v9, 0x3d

    .line 54
    .line 55
    if-eq v8, v9, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    if-ne v7, v4, :cond_4

    .line 59
    .line 60
    move v7, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v0, p0, v6, v7, v5}, Ltg/b;->g(LJd/z;Ljava/lang/String;III)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v6, v5, 0x1

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    move v7, v4

    .line 70
    :cond_4
    :goto_1
    if-eq v5, v1, :cond_5

    .line 71
    .line 72
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    move v4, v7

    .line 76
    goto :goto_2

    .line 77
    :cond_6
    move v6, v2

    .line 78
    :goto_2
    if-ne v2, v3, :cond_7

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v0, p0, v6, v4, v1}, Ltg/b;->g(LJd/z;Ljava/lang/String;III)V

    .line 86
    .line 87
    .line 88
    :goto_3
    new-instance p0, LJd/A;

    .line 89
    .line 90
    const-string v1, "values"

    .line 91
    .line 92
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/util/Map;

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v0}, LNd/l;-><init>(Ljava/util/Map;)V

    .line 100
    .line 101
    .line 102
    return-object p0
.end method

.method public static M(Ljava/lang/String;Lac/a;I)Lw1/b;
    .locals 2

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    sget-object p2, Lw1/a;->i:Lw1/a;

    .line 7
    .line 8
    sget-object v0, LEf/S;->a:LLf/e;

    .line 9
    .line 10
    sget-object v0, LLf/d;->b:LLf/d;

    .line 11
    .line 12
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljf/a;->plus(Ljf/h;)Ljf/h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "name"

    .line 25
    .line 26
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lw1/b;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1, p2, v0}, Lw1/b;-><init>(Ljava/lang/String;Lac/a;Ltf/l;LEf/E;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public static N(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    new-instance v0, LE4/F;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, LE4/F;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    iput-boolean p0, v0, LE4/F;->b:Z

    .line 10
    .line 11
    sput p0, LFe/b;->a:I

    .line 12
    .line 13
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v1, "oneplus"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const-string v1, "moto"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "xiaomi"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const-string v1, "lenovo"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "samsung"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v0}, LE4/F;->g()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {v0}, LE4/F;->g()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public static final O(Landroid/view/View;Ln3/f;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f0a02c5

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static P(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "singleton(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static Q(Luc/f;Lkd/s;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lkd/s;->a:LC8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lkd/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LVa/X7;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lkd/E;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/E;-><init>(Lkd/s;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LVa/X7;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/E;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lkd/E;-><init>(Lkd/s;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LVa/X7;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition"

    .line 70
    .line 71
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lkd/E;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lkd/E;-><init>(Lkd/s;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LVa/X7;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled"

    .line 92
    .line 93
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lkd/E;

    .line 99
    .line 100
    const/4 v4, 0x3

    .line 101
    invoke-direct {v2, p1, v4}, Lkd/E;-><init>(Lkd/s;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance v1, LVa/X7;

    .line 112
    .line 113
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled"

    .line 114
    .line 115
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance v2, Lkd/E;

    .line 121
    .line 122
    const/4 v4, 0x4

    .line 123
    invoke-direct {v2, p1, v4}, Lkd/E;-><init>(Lkd/s;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 131
    .line 132
    .line 133
    :goto_5
    new-instance v1, LVa/X7;

    .line 134
    .line 135
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode"

    .line 136
    .line 137
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    new-instance p0, Lkd/E;

    .line 143
    .line 144
    const/4 v0, 0x5

    .line 145
    invoke-direct {p0, p1, v0}, Lkd/E;-><init>(Lkd/s;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public static R(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lic/a;Lic/b;)V
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, p1}, Lgc/b;->z(Landroid/content/Context;I)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_12

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "Your Device "

    .line 18
    .line 19
    const-string v5, " "

    .line 20
    .line 21
    const-string v6, " has additional battery optimization"

    .line 22
    .line 23
    invoke-static {v4, p2, v5, v3, v6}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    new-instance v3, Lhc/b;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p0, v3, Lhc/b;->a:Landroid/content/Context;

    .line 33
    .line 34
    iput-boolean v2, v3, Lhc/b;->c:Z

    .line 35
    .line 36
    iput-object p2, v3, Lhc/b;->d:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, v3, Lhc/b;->e:Ljava/lang/String;

    .line 39
    .line 40
    const-string p2, "Ok"

    .line 41
    .line 42
    iput-object p2, v3, Lhc/b;->f:Ljava/lang/String;

    .line 43
    .line 44
    new-instance p2, LLb/h;

    .line 45
    .line 46
    invoke-direct {p2, p4, v0}, LLb/h;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object p2, v3, Lhc/b;->h:LLb/h;

    .line 50
    .line 51
    new-instance p2, LLb/h;

    .line 52
    .line 53
    const/16 p3, 0x9

    .line 54
    .line 55
    invoke-direct {p2, p5, p3}, LLb/h;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    iput-object p2, v3, Lhc/b;->i:LLb/h;

    .line 59
    .line 60
    iput p1, v3, Lhc/b;->b:I

    .line 61
    .line 62
    if-eqz p0, :cond_11

    .line 63
    .line 64
    if-eqz p1, :cond_10

    .line 65
    .line 66
    invoke-static {}, Lgc/a;->a()Lfc/b;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sput-object p0, Lgc/b;->a:Lfc/b;

    .line 71
    .line 72
    iget-object p0, v3, Lhc/b;->a:Landroid/content/Context;

    .line 73
    .line 74
    iget p1, v3, Lhc/b;->b:I

    .line 75
    .line 76
    invoke-static {p0, p1}, Lgc/b;->z(Landroid/content/Context;I)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const-class p1, Lhc/b;

    .line 81
    .line 82
    if-nez p0, :cond_1

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string p1, "This action is not available for this device no need to show the dialog"

    .line 89
    .line 90
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    sget-object p0, Lgc/b;->a:Lfc/b;

    .line 95
    .line 96
    if-nez p0, :cond_2

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string p1, "Device not in the list no need to show the dialog"

    .line 103
    .line 104
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    new-instance p0, Ll4/e;

    .line 109
    .line 110
    iget-object p1, v3, Lhc/b;->a:Landroid/content/Context;

    .line 111
    .line 112
    invoke-direct {p0, p1}, Ll4/e;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    iget-object p2, v3, Lhc/b;->f:Ljava/lang/String;

    .line 116
    .line 117
    if-nez p2, :cond_3

    .line 118
    .line 119
    iget-object p2, v3, Lhc/b;->a:Landroid/content/Context;

    .line 120
    .line 121
    const p3, 0x7f13005a

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    iput-object p2, v3, Lhc/b;->f:Ljava/lang/String;

    .line 133
    .line 134
    :cond_3
    iget-object p2, v3, Lhc/b;->g:Ljava/lang/String;

    .line 135
    .line 136
    if-nez p2, :cond_4

    .line 137
    .line 138
    iget-object p2, v3, Lhc/b;->a:Landroid/content/Context;

    .line 139
    .line 140
    const/high16 p3, 0x1040000

    .line 141
    .line 142
    invoke-virtual {p2, p3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iput-object p2, v3, Lhc/b;->g:Ljava/lang/String;

    .line 151
    .line 152
    :cond_4
    iget-object p2, v3, Lhc/b;->f:Ljava/lang/String;

    .line 153
    .line 154
    iput-object p2, p0, Ll4/e;->k:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    const p3, 0x7f0d0069

    .line 161
    .line 162
    .line 163
    const/4 p4, 0x0

    .line 164
    invoke-virtual {p2, p3, p4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    if-eqz p3, :cond_5

    .line 173
    .line 174
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    instance-of p3, p3, Landroid/view/ViewGroup;

    .line 179
    .line 180
    if-eqz p3, :cond_5

    .line 181
    .line 182
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    check-cast p3, Landroid/view/ViewGroup;

    .line 187
    .line 188
    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    iput-object p2, p0, Ll4/e;->m:Landroid/view/View;

    .line 192
    .line 193
    new-instance p2, La2/v;

    .line 194
    .line 195
    const/16 p3, 0xb

    .line 196
    .line 197
    invoke-direct {p2, v3, p3}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 198
    .line 199
    .line 200
    iput-object p2, p0, Ll4/e;->s:La2/v;

    .line 201
    .line 202
    iget-object p2, v3, Lhc/b;->g:Ljava/lang/String;

    .line 203
    .line 204
    iput-object p2, p0, Ll4/e;->l:Ljava/lang/String;

    .line 205
    .line 206
    new-instance p2, Lcom/google/android/gms/ads/nativead/l;

    .line 207
    .line 208
    const/4 p3, 0x5

    .line 209
    invoke-direct {p2, v3, p3}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    iput-object p2, p0, Ll4/e;->t:Lcom/google/android/gms/ads/nativead/l;

    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    sget-object p3, La1/l;->a:Ljava/lang/ThreadLocal;

    .line 219
    .line 220
    const p3, 0x1080027

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, p3, p4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iput-object p2, p0, Ll4/e;->x:Landroid/graphics/drawable/Drawable;

    .line 228
    .line 229
    iget-object p2, v3, Lhc/b;->d:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-nez p2, :cond_6

    .line 236
    .line 237
    iget-object p2, v3, Lhc/b;->d:Ljava/lang/String;

    .line 238
    .line 239
    iput-object p2, p0, Ll4/e;->b:Ljava/lang/CharSequence;

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_6
    iget-object p2, v3, Lhc/b;->a:Landroid/content/Context;

    .line 243
    .line 244
    sget-object p3, Lgc/b;->a:Lfc/b;

    .line 245
    .line 246
    invoke-virtual {p3}, Lfc/b;->d()Lic/c;

    .line 247
    .line 248
    .line 249
    move-result-object p3

    .line 250
    invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    new-array p4, v1, [Ljava/lang/Object;

    .line 255
    .line 256
    aput-object p3, p4, v2

    .line 257
    .line 258
    const p3, 0x7f13005d

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2, p3, p4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    iput-object p2, p0, Ll4/e;->b:Ljava/lang/CharSequence;

    .line 266
    .line 267
    :goto_0
    iget-boolean p2, v3, Lhc/b;->c:Z

    .line 268
    .line 269
    const p3, 0x7f13005b

    .line 270
    .line 271
    .line 272
    if-eqz p2, :cond_7

    .line 273
    .line 274
    new-instance p2, Lhc/a;

    .line 275
    .line 276
    invoke-direct {p2, v3, v2}, Lhc/a;-><init>(Lhc/b;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    iput-object p1, p0, Ll4/e;->C:Ljava/lang/CharSequence;

    .line 288
    .line 289
    iput-object p2, p0, Ll4/e;->D:Lhc/a;

    .line 290
    .line 291
    :cond_7
    iget-boolean p1, v3, Lhc/b;->c:Z

    .line 292
    .line 293
    if-eqz p1, :cond_9

    .line 294
    .line 295
    iget-object p1, v3, Lhc/b;->a:Landroid/content/Context;

    .line 296
    .line 297
    iget p2, v3, Lhc/b;->b:I

    .line 298
    .line 299
    const-string p4, "KillerManager"

    .line 300
    .line 301
    invoke-virtual {p1, p4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {p2}, Lcom/google/android/gms/internal/consent_sdk/a;->j(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    const-string p4, "DONT_SHOW_AGAIN"

    .line 310
    .line 311
    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-interface {p1, p2, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    if-nez p1, :cond_8

    .line 320
    .line 321
    goto :goto_1

    .line 322
    :cond_8
    return-void

    .line 323
    :cond_9
    :goto_1
    new-instance p1, Ll4/g;

    .line 324
    .line 325
    invoke-direct {p1, p0}, Ll4/g;-><init>(Ll4/e;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Ll4/g;->show()V

    .line 329
    .line 330
    .line 331
    iget-object p0, p1, Ll4/g;->c:Ll4/e;

    .line 332
    .line 333
    iget-object p0, p0, Ll4/e;->m:Landroid/view/View;

    .line 334
    .line 335
    const p1, 0x7f0a01a3

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    check-cast p1, Landroid/widget/TextView;

    .line 343
    .line 344
    const p2, 0x7f0a01af

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    check-cast p2, Landroid/widget/CheckBox;

    .line 352
    .line 353
    const p4, 0x7f0a01ac

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    check-cast p0, Landroid/widget/ImageView;

    .line 361
    .line 362
    iget-object p4, v3, Lhc/b;->e:Ljava/lang/String;

    .line 363
    .line 364
    if-eqz p4, :cond_a

    .line 365
    .line 366
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result p4

    .line 370
    if-nez p4, :cond_a

    .line 371
    .line 372
    iget-object p4, v3, Lhc/b;->e:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    goto :goto_2

    .line 378
    :cond_a
    iget-object p4, v3, Lhc/b;->a:Landroid/content/Context;

    .line 379
    .line 380
    const p5, 0x7f13005c

    .line 381
    .line 382
    .line 383
    invoke-virtual {p4, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p4

    .line 387
    iget-object p5, v3, Lhc/b;->a:Landroid/content/Context;

    .line 388
    .line 389
    const v4, 0x7f13001f

    .line 390
    .line 391
    .line 392
    invoke-virtual {p5, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p5

    .line 396
    new-array v4, v1, [Ljava/lang/Object;

    .line 397
    .line 398
    aput-object p5, v4, v2

    .line 399
    .line 400
    invoke-static {p4, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p4

    .line 404
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    :goto_2
    iget-boolean p1, v3, Lhc/b;->c:Z

    .line 408
    .line 409
    if-eqz p1, :cond_b

    .line 410
    .line 411
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 415
    .line 416
    .line 417
    new-instance p1, Lhc/a;

    .line 418
    .line 419
    invoke-direct {p1, v3, v1}, Lhc/a;-><init>(Lhc/b;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 423
    .line 424
    .line 425
    :cond_b
    iget p1, v3, Lhc/b;->b:I

    .line 426
    .line 427
    invoke-static {p1}, LA/f;->f(I)I

    .line 428
    .line 429
    .line 430
    move-result p1

    .line 431
    if-eqz p1, :cond_e

    .line 432
    .line 433
    if-eq p1, v1, :cond_d

    .line 434
    .line 435
    const/4 p2, 0x2

    .line 436
    if-eq p1, p2, :cond_c

    .line 437
    .line 438
    goto :goto_3

    .line 439
    :cond_c
    sget-object p1, Lgc/b;->a:Lfc/b;

    .line 440
    .line 441
    invoke-virtual {p1}, Lfc/b;->h()I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    goto :goto_3

    .line 446
    :cond_d
    sget-object p1, Lgc/b;->a:Lfc/b;

    .line 447
    .line 448
    invoke-virtual {p1}, Lfc/b;->g()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    goto :goto_3

    .line 453
    :cond_e
    sget-object p1, Lgc/b;->a:Lfc/b;

    .line 454
    .line 455
    invoke-virtual {p1}, Lfc/b;->f()I

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    :goto_3
    if-eqz v2, :cond_f

    .line 460
    .line 461
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :cond_f
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_10
    new-instance p0, Ljava/lang/NullPointerException;

    .line 470
    .line 471
    const-string p1, "Action can\'t be null"

    .line 472
    .line 473
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    throw p0

    .line 477
    :cond_11
    new-instance p0, Ljava/lang/NullPointerException;

    .line 478
    .line 479
    const-string p1, "Context can\'t be null"

    .line 480
    .line 481
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw p0

    .line 485
    :cond_12
    invoke-interface {p4}, Lic/a;->a()V

    .line 486
    .line 487
    .line 488
    return-void
.end method

.method public static final S(IILjava/lang/String;)I
    .locals 1

    .line 1
    :goto_0
    if-le p1, p0, :cond_0

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ltg/b;->I(C)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 p1, p1, -0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return p1
.end method

.method public static final T(IILjava/lang/String;)I
    .locals 1

    .line 1
    :goto_0
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ltg/b;->I(C)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return p0
.end method

.method public static U(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static V(Ljava/lang/Throwable;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    instance-of v1, p0, Ldd/g;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Ldd/g;

    .line 12
    .line 13
    iget-object v1, p0, Ldd/g;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v2, "Cause: "

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, ", Stacktrace: "

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public static W(Landroid/content/Context;Ljava/lang/String;LH6/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ltg/b;->X(Landroid/content/Context;)Lr7/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p2, p0}, LH6/m;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance p1, LH6/n;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public static X(Landroid/content/Context;)Lr7/d;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lr7/d;->b:Lab/b;

    .line 2
    .line 3
    const-string v1, "com.google.android.gms.ads.dynamite"

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    new-instance v0, LH6/n;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public static a(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ltf/a;Ltf/a;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;I)Lcom/moloco/sdk/internal/publisher/b;
    .locals 12

    .line 1
    move-object/from16 v9, p6

    .line 2
    .line 3
    sget-object v0, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 4
    .line 5
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v6, v0

    .line 10
    check-cast v6, Lcom/moloco/sdk/internal/B;

    .line 11
    .line 12
    sget-object v0, Lcom/moloco/sdk/internal/k;->a:Lef/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v7, v0

    .line 19
    check-cast v7, Lcom/moloco/sdk/internal/j;

    .line 20
    .line 21
    new-instance v10, LY2/B;

    .line 22
    .line 23
    invoke-direct {v10, v9}, LY2/B;-><init>(Lcom/moloco/sdk/acm/recorder/c;)V

    .line 24
    .line 25
    .line 26
    move/from16 v0, p8

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0x400

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    move-object v11, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object/from16 v11, p7

    .line 36
    .line 37
    :goto_0
    const-string v0, "appLifecycleTrackerService"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "customUserEventBuilderService"

    .line 43
    .line 44
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "sdkEventUrlTracker"

    .line 48
    .line 49
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "bUrlTracker"

    .line 53
    .line 54
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "adType"

    .line 58
    .line 59
    move-object/from16 v8, p5

    .line 60
    .line 61
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "metricsRecorder"

    .line 65
    .line 66
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lcom/moloco/sdk/internal/publisher/b;

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    move-object v2, p1

    .line 73
    move-object v3, p2

    .line 74
    move-object v4, p3

    .line 75
    move-object/from16 v5, p4

    .line 76
    .line 77
    invoke-direct/range {v0 .. v11}, Lcom/moloco/sdk/internal/publisher/b;-><init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ltf/a;Ltf/a;Lcom/moloco/sdk/internal/B;Lcom/moloco/sdk/internal/j;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;LY2/B;Ltf/a;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public static final b(LHf/v0;Ltf/a;Ltf/l;Ltf/c;ZLN/o;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v12, p5

    .line 4
    .line 5
    sget-object v3, LE/q;->a:LE/q;

    .line 6
    .line 7
    const v0, 0x2a23a6bf

    .line 8
    .line 9
    .line 10
    invoke-virtual {v12, v0}, LN/o;->N(I)LN/o;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v12, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int v0, p6, v0

    .line 23
    .line 24
    invoke-virtual {v12, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v2, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v2

    .line 36
    move-object/from16 v2, p1

    .line 37
    .line 38
    invoke-virtual {v12, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v4

    .line 50
    move-object/from16 v7, p2

    .line 51
    .line 52
    invoke-virtual {v12, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    const/16 v4, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v4, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v4

    .line 64
    move-object/from16 v4, p3

    .line 65
    .line 66
    invoke-virtual {v12, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    const/16 v5, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v5, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v5

    .line 78
    move/from16 v14, p4

    .line 79
    .line 80
    invoke-virtual {v12, v14}, LN/o;->f(Z)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    const/high16 v5, 0x20000

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    const/high16 v5, 0x10000

    .line 90
    .line 91
    :goto_5
    or-int/2addr v0, v5

    .line 92
    const v5, 0x12493

    .line 93
    .line 94
    .line 95
    and-int/2addr v5, v0

    .line 96
    const v6, 0x12492

    .line 97
    .line 98
    .line 99
    if-ne v5, v6, :cond_7

    .line 100
    .line 101
    invoke-virtual {v12}, LN/o;->x()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_6

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_6
    invoke-virtual {v12}, LN/o;->I()V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :cond_7
    :goto_6
    shr-int/lit8 v5, v0, 0x3

    .line 114
    .line 115
    and-int/lit8 v5, v5, 0xe

    .line 116
    .line 117
    invoke-static {v1, v12, v5}, LFe/b;->n(LHf/v0;LN/o;I)LN/V;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const v6, -0x7d3bf272

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v6}, LN/o;->M(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    sget-object v8, LN/k;->a:LN/P;

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    if-ne v6, v8, :cond_8

    .line 135
    .line 136
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    sget-object v10, LN/P;->f:LN/P;

    .line 141
    .line 142
    invoke-static {v6, v10}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v12, v6}, LN/o;->U(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_8
    check-cast v6, LN/V;

    .line 150
    .line 151
    invoke-virtual {v12, v9}, LN/o;->p(Z)V

    .line 152
    .line 153
    .line 154
    sget-object v10, Lef/C;->a:Lef/C;

    .line 155
    .line 156
    const v11, -0x7d3bea46

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v11}, LN/o;->M(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-virtual {v12, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    or-int/2addr v11, v13

    .line 171
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    const/4 v15, 0x0

    .line 176
    if-nez v11, :cond_9

    .line 177
    .line 178
    if-ne v13, v8, :cond_a

    .line 179
    .line 180
    :cond_9
    new-instance v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/r;

    .line 181
    .line 182
    invoke-direct {v13, v5, v6, v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/r;-><init>(LN/V;LN/V;Ljf/c;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v13}, LN/o;->U(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_a
    check-cast v13, Ltf/p;

    .line 189
    .line 190
    invoke-virtual {v12, v9}, LN/o;->p(Z)V

    .line 191
    .line 192
    .line 193
    invoke-static {v12, v10, v13}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v6}, LN/K0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/f;

    .line 211
    .line 212
    instance-of v11, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;

    .line 213
    .line 214
    if-eqz v11, :cond_b

    .line 215
    .line 216
    move-object v15, v10

    .line 217
    check-cast v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;

    .line 218
    .line 219
    :cond_b
    if-eqz v15, :cond_c

    .line 220
    .line 221
    iget v10, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;->a:I

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_c
    move v10, v9

    .line 225
    :goto_7
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    check-cast v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/f;

    .line 230
    .line 231
    instance-of v11, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;

    .line 232
    .line 233
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/f;

    .line 242
    .line 243
    instance-of v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/e;

    .line 244
    .line 245
    xor-int/lit8 v5, v5, 0x1

    .line 246
    .line 247
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    new-instance v15, Lef/u;

    .line 256
    .line 257
    invoke-direct {v15, v6}, Lef/u;-><init>(I)V

    .line 258
    .line 259
    .line 260
    new-instance v6, Lef/u;

    .line 261
    .line 262
    invoke-direct {v6, v10}, Lef/u;-><init>(I)V

    .line 263
    .line 264
    .line 265
    const v10, -0x7d3b70de

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v10}, LN/o;->M(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    if-ne v10, v8, :cond_d

    .line 276
    .line 277
    new-instance v10, Lcom/moloco/sdk/service_locator/h;

    .line 278
    .line 279
    const/16 v8, 0xe

    .line 280
    .line 281
    invoke-direct {v10, v8}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v10}, LN/o;->U(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_d
    check-cast v10, Ltf/a;

    .line 288
    .line 289
    invoke-virtual {v12, v9}, LN/o;->p(Z)V

    .line 290
    .line 291
    .line 292
    and-int/lit8 v8, v0, 0xe

    .line 293
    .line 294
    const/high16 v9, 0x6000000

    .line 295
    .line 296
    or-int/2addr v8, v9

    .line 297
    shl-int/lit8 v9, v0, 0x3

    .line 298
    .line 299
    move/from16 v16, v0

    .line 300
    .line 301
    and-int/lit16 v0, v9, 0x1c00

    .line 302
    .line 303
    or-int/2addr v0, v8

    .line 304
    const v8, 0xe000

    .line 305
    .line 306
    .line 307
    and-int/2addr v8, v9

    .line 308
    or-int/2addr v0, v8

    .line 309
    const/high16 v8, 0x70000

    .line 310
    .line 311
    and-int v8, v16, v8

    .line 312
    .line 313
    or-int/2addr v0, v8

    .line 314
    shl-int/lit8 v8, v16, 0xf

    .line 315
    .line 316
    const/high16 v9, 0x70000000

    .line 317
    .line 318
    and-int/2addr v8, v9

    .line 319
    or-int/2addr v0, v8

    .line 320
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    move-object v8, v6

    .line 325
    move-object v6, v2

    .line 326
    move-object v2, v4

    .line 327
    move-object v4, v11

    .line 328
    move-object v11, v10

    .line 329
    move-object v10, v8

    .line 330
    move-object v8, v13

    .line 331
    move-object v9, v15

    .line 332
    move-object v13, v0

    .line 333
    invoke-interface/range {v2 .. v13}, Ltf/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    :goto_8
    invoke-virtual/range {p5 .. p5}, LN/o;->r()LN/i0;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    if-eqz v7, :cond_e

    .line 341
    .line 342
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/n;

    .line 343
    .line 344
    move-object/from16 v2, p1

    .line 345
    .line 346
    move-object/from16 v3, p2

    .line 347
    .line 348
    move-object/from16 v4, p3

    .line 349
    .line 350
    move/from16 v6, p6

    .line 351
    .line 352
    move v5, v14

    .line 353
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/n;-><init>(LHf/v0;Ltf/a;Ltf/l;Ltf/c;ZI)V

    .line 354
    .line 355
    .line 356
    iput-object v0, v7, LN/i0;->d:Ltf/p;

    .line 357
    .line 358
    :cond_e
    return-void
.end method

.method public static final c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;Ltf/c;Ltf/c;Ltf/c;LN/o;II)V
    .locals 9

    .line 1
    sget-object v1, LE/q;->a:LE/q;

    .line 2
    .line 3
    const-string v2, "adViewModel"

    .line 4
    .line 5
    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v2, -0x1acbda23

    .line 9
    .line 10
    .line 11
    invoke-virtual {p5, v2}, LN/o;->N(I)LN/o;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v2, p6, 0x6

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p5, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, p6

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, p6

    .line 30
    :goto_1
    and-int/lit8 v2, p6, 0x30

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    invoke-virtual {p5, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v2, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v1, v2

    .line 46
    :cond_3
    and-int/lit16 v2, p6, 0x180

    .line 47
    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    invoke-virtual {p5, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    const/16 v2, 0x100

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const/16 v2, 0x80

    .line 60
    .line 61
    :goto_3
    or-int/2addr v1, v2

    .line 62
    :cond_5
    and-int/lit16 v2, p6, 0xc00

    .line 63
    .line 64
    if-nez v2, :cond_7

    .line 65
    .line 66
    invoke-virtual {p5, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_6

    .line 71
    .line 72
    const/16 v2, 0x800

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    const/16 v2, 0x400

    .line 76
    .line 77
    :goto_4
    or-int/2addr v1, v2

    .line 78
    :cond_7
    and-int/lit16 v2, p6, 0x6000

    .line 79
    .line 80
    if-nez v2, :cond_9

    .line 81
    .line 82
    invoke-virtual {p5, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_8

    .line 87
    .line 88
    const/16 v2, 0x4000

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/16 v2, 0x2000

    .line 92
    .line 93
    :goto_5
    or-int/2addr v1, v2

    .line 94
    :cond_9
    const/high16 v2, 0x30000

    .line 95
    .line 96
    and-int/2addr v2, p6

    .line 97
    if-nez v2, :cond_b

    .line 98
    .line 99
    and-int/lit8 v2, p7, 0x10

    .line 100
    .line 101
    if-nez v2, :cond_a

    .line 102
    .line 103
    invoke-virtual {p5, p4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_a

    .line 108
    .line 109
    const/high16 v3, 0x20000

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_a
    const/high16 v3, 0x10000

    .line 113
    .line 114
    :goto_6
    or-int/2addr v1, v3

    .line 115
    :cond_b
    const v3, 0x12493

    .line 116
    .line 117
    .line 118
    and-int/2addr v1, v3

    .line 119
    const v3, 0x12492

    .line 120
    .line 121
    .line 122
    if-ne v1, v3, :cond_d

    .line 123
    .line 124
    invoke-virtual {p5}, LN/o;->x()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_c

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_c
    invoke-virtual {p5}, LN/o;->I()V

    .line 132
    .line 133
    .line 134
    move-object v5, p4

    .line 135
    goto/16 :goto_10

    .line 136
    .line 137
    :cond_d
    :goto_7
    invoke-virtual {p5}, LN/o;->K()V

    .line 138
    .line 139
    .line 140
    and-int/lit8 v1, p6, 0x1

    .line 141
    .line 142
    if-eqz v1, :cond_10

    .line 143
    .line 144
    invoke-virtual {p5}, LN/o;->w()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_e

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_e
    invoke-virtual {p5}, LN/o;->I()V

    .line 152
    .line 153
    .line 154
    and-int/lit8 v1, p7, 0x10

    .line 155
    .line 156
    :cond_f
    move-object v2, p4

    .line 157
    goto :goto_9

    .line 158
    :cond_10
    :goto_8
    and-int/lit8 v1, p7, 0x10

    .line 159
    .line 160
    if-eqz v1, :cond_f

    .line 161
    .line 162
    move-object v2, p2

    .line 163
    :goto_9
    invoke-virtual {p5}, LN/o;->q()V

    .line 164
    .line 165
    .line 166
    const/4 v1, 0x0

    .line 167
    if-eqz p1, :cond_11

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;->a()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    goto :goto_a

    .line 178
    :cond_11
    move-object v3, v1

    .line 179
    :goto_a
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_12

    .line 186
    .line 187
    move-object v1, p3

    .line 188
    goto :goto_c

    .line 189
    :cond_12
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_16

    .line 196
    .line 197
    instance-of v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 198
    .line 199
    if-eqz v1, :cond_13

    .line 200
    .line 201
    move-object v1, p2

    .line 202
    goto :goto_c

    .line 203
    :cond_13
    instance-of v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 204
    .line 205
    if-nez v1, :cond_15

    .line 206
    .line 207
    instance-of v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 208
    .line 209
    if-nez v1, :cond_15

    .line 210
    .line 211
    instance-of v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 212
    .line 213
    if-nez v1, :cond_15

    .line 214
    .line 215
    if-nez p1, :cond_14

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_14
    new-instance p0, LE5/Q;

    .line 219
    .line 220
    const/16 p1, 0x9

    .line 221
    .line 222
    const/4 p2, 0x0

    .line 223
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 224
    .line 225
    .line 226
    throw p0

    .line 227
    :cond_15
    :goto_b
    move-object v1, v2

    .line 228
    goto :goto_c

    .line 229
    :cond_16
    if-nez v3, :cond_1f

    .line 230
    .line 231
    :goto_c
    instance-of v3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 232
    .line 233
    const/4 v4, 0x0

    .line 234
    if-eqz v3, :cond_17

    .line 235
    .line 236
    goto :goto_d

    .line 237
    :cond_17
    instance-of v5, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 238
    .line 239
    if-eqz v5, :cond_18

    .line 240
    .line 241
    goto :goto_d

    .line 242
    :cond_18
    instance-of v5, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 243
    .line 244
    if-eqz v5, :cond_19

    .line 245
    .line 246
    const/4 v5, 0x1

    .line 247
    goto :goto_e

    .line 248
    :cond_19
    :goto_d
    move v5, v4

    .line 249
    :goto_e
    if-nez v1, :cond_1a

    .line 250
    .line 251
    goto :goto_f

    .line 252
    :cond_1a
    new-instance v7, Lcom/moloco/sdk/internal/g;

    .line 253
    .line 254
    invoke-direct {v7, p0, v1, v5}, Lcom/moloco/sdk/internal/g;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Ltf/c;Z)V

    .line 255
    .line 256
    .line 257
    const v1, -0x347833ed    # -1.7799206E7f

    .line 258
    .line 259
    .line 260
    invoke-static {p5, v1, v7}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    const/4 v5, 0x6

    .line 265
    if-eqz v3, :cond_1b

    .line 266
    .line 267
    const v3, -0x3d0c1b80

    .line 268
    .line 269
    .line 270
    invoke-virtual {p5, v3}, LN/o;->M(I)V

    .line 271
    .line 272
    .line 273
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v1, p5, v3}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p5, v4}, LN/o;->p(Z)V

    .line 281
    .line 282
    .line 283
    goto :goto_f

    .line 284
    :cond_1b
    instance-of v3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 285
    .line 286
    if-eqz v3, :cond_1c

    .line 287
    .line 288
    const v3, -0x3d0c1480

    .line 289
    .line 290
    .line 291
    invoke-virtual {p5, v3}, LN/o;->M(I)V

    .line 292
    .line 293
    .line 294
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v1, p5, v3}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p5, v4}, LN/o;->p(Z)V

    .line 302
    .line 303
    .line 304
    goto :goto_f

    .line 305
    :cond_1c
    instance-of v3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 306
    .line 307
    if-eqz v3, :cond_1d

    .line 308
    .line 309
    const v3, -0x3d0c0d20

    .line 310
    .line 311
    .line 312
    invoke-virtual {p5, v3}, LN/o;->M(I)V

    .line 313
    .line 314
    .line 315
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual {v1, p5, v3}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p5, v4}, LN/o;->p(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_1d
    const v1, -0x64750f1f

    .line 327
    .line 328
    .line 329
    invoke-virtual {p5, v1}, LN/o;->M(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p5, v4}, LN/o;->p(Z)V

    .line 333
    .line 334
    .line 335
    :goto_f
    move-object v5, v2

    .line 336
    :goto_10
    invoke-virtual {p5}, LN/o;->r()LN/i0;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    if-eqz v8, :cond_1e

    .line 341
    .line 342
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/m;

    .line 343
    .line 344
    move-object v1, p0

    .line 345
    move-object v2, p1

    .line 346
    move-object v3, p2

    .line 347
    move-object v4, p3

    .line 348
    move v6, p6

    .line 349
    move/from16 v7, p7

    .line 350
    .line 351
    invoke-direct/range {v0 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/m;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;Ltf/c;Ltf/c;Ltf/c;II)V

    .line 352
    .line 353
    .line 354
    iput-object v0, v8, LN/i0;->d:Ltf/p;

    .line 355
    .line 356
    :cond_1e
    return-void

    .line 357
    :cond_1f
    new-instance p0, LE5/Q;

    .line 358
    .line 359
    const/16 p1, 0x9

    .line 360
    .line 361
    const/4 p2, 0x0

    .line 362
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 363
    .line 364
    .line 365
    throw p0
.end method

.method public static final d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;LZ/k;LN/o;II)V
    .locals 4

    .line 1
    const-string v0, "imageResource"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x634f779d

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    and-int/lit8 v0, p3, 0x6

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int/2addr v0, p3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, p3

    .line 28
    :goto_1
    and-int/lit8 v1, p4, 0x2

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    or-int/lit8 v0, v0, 0x30

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    and-int/lit8 v2, p3, 0x30

    .line 36
    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    const/16 v2, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v2

    .line 51
    :cond_4
    :goto_3
    and-int/lit8 v0, v0, 0x13

    .line 52
    .line 53
    const/16 v2, 0x12

    .line 54
    .line 55
    if-ne v0, v2, :cond_6

    .line 56
    .line 57
    invoke-virtual {p2}, LN/o;->x()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_5
    invoke-virtual {p2}, LN/o;->I()V

    .line 65
    .line 66
    .line 67
    goto :goto_5

    .line 68
    :cond_6
    :goto_4
    if-eqz v1, :cond_7

    .line 69
    .line 70
    sget-object p1, LZ/i;->a:LZ/i;

    .line 71
    .line 72
    :cond_7
    sget-object v0, Lr0/g;->b:Lr0/f;

    .line 73
    .line 74
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;->b:I

    .line 75
    .line 76
    int-to-float v1, v1

    .line 77
    iget v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;->c:I

    .line 78
    .line 79
    int-to-float v2, v2

    .line 80
    invoke-static {p1, v1, v2}, LE/L;->e(LZ/k;FF)LZ/k;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;->a:Ljava/lang/String;

    .line 85
    .line 86
    const/16 v3, 0x30

    .line 87
    .line 88
    invoke-static {v2, v0, v1, p2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/t;->a(Ljava/lang/String;Lr0/h;LZ/k;LN/o;I)V

    .line 89
    .line 90
    .line 91
    :goto_5
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_8

    .line 96
    .line 97
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/U;

    .line 98
    .line 99
    invoke-direct {v0, p0, p1, p3, p4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/U;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;LZ/k;II)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 103
    .line 104
    :cond_8
    return-void
.end method

.method public static final e(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v3, "Cause: "

    .line 22
    .line 23
    const-string v4, ", Stacktrace: "

    .line 24
    .line 25
    invoke-static {v3, v4, p0, v2}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    filled-new-array {v0, v1, p0}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final g(LJd/z;Ljava/lang/String;III)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const-string v1, "substring(...)"

    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p2, p4, p1}, Ltg/b;->T(IILjava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-static {p2, p4, p1}, Ltg/b;->S(IILjava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-le p3, p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object p2, Lff/v;->a:Lff/v;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {p2, p3, p1}, Ltg/b;->T(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2, p3, p1}, Ltg/b;->S(IILjava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-le v0, p2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 p3, p3, 0x1

    .line 47
    .line 48
    invoke-static {p3, p4, p1}, Ltg/b;->T(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    invoke-static {p3, p4, p1}, Ltg/b;->S(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    invoke-virtual {p1, p3, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p2, p1}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public static final i(Landroidx/lifecycle/o;Llf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lk4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk4/b;

    .line 7
    .line 8
    iget v1, v0, Lk4/b;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lk4/b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk4/b;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk4/b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lk4/b;->d:I

    .line 30
    .line 31
    sget-object v3, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lk4/b;->b:Lkotlin/jvm/internal/G;

    .line 39
    .line 40
    iget-object v0, v0, Lk4/b;->a:Landroidx/lifecycle/o;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v2, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ltz p1, :cond_3

    .line 70
    .line 71
    return-object v3

    .line 72
    :cond_3
    new-instance p1, Lkotlin/jvm/internal/G;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    :try_start_1
    iput-object p0, v0, Lk4/b;->a:Landroidx/lifecycle/o;

    .line 78
    .line 79
    iput-object p1, v0, Lk4/b;->b:Lkotlin/jvm/internal/G;

    .line 80
    .line 81
    iput v4, v0, Lk4/b;->d:I

    .line 82
    .line 83
    new-instance v2, LEf/n;

    .line 84
    .line 85
    invoke-static {v0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {v2, v4, v0}, LEf/n;-><init>(ILjf/c;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, LEf/n;->t()V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lk4/c;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Lk4/c;-><init>(LEf/n;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, LEf/n;->s()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    if-ne v0, v1, :cond_4

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_4
    move-object v0, p0

    .line 113
    move-object p0, p1

    .line 114
    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Landroidx/lifecycle/u;

    .line 117
    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    return-object v3

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object v5, v0

    .line 126
    move-object v0, p0

    .line 127
    move-object p0, p1

    .line 128
    move-object p1, v5

    .line 129
    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Landroidx/lifecycle/u;

    .line 132
    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    throw p1
.end method

.method public static m(Lgf/h;)Lgf/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lgf/h;->a:Lgf/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgf/f;->c()Lgf/f;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Lgf/f;->i:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p0, Lgf/h;->b:Lgf/h;

    .line 12
    .line 13
    return-object p0
.end method

.method public static n(Ljava/lang/String;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/io/BufferedReader;

    .line 10
    .line 11
    new-instance v1, Ljava/io/InputStreamReader;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static o(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-class v0, Ltg/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Ljava/lang/Class;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object p0, v1, v2

    .line 16
    .line 17
    invoke-static {v0, v1, p1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static p(Z)Z
    .locals 5

    .line 1
    const-string v0, "1"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "ro.debuggable"

    .line 5
    .line 6
    invoke-static {v2}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    const-string v2, "ro.secure"

    .line 21
    .line 22
    invoke-static {v2}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v4, "0"

    .line 27
    .line 28
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    return v3

    .line 38
    :cond_2
    const-string v2, "service.adb.root"

    .line 39
    .line 40
    invoke-static {v2}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    if-nez p0, :cond_3

    .line 51
    .line 52
    return v3

    .line 53
    :catch_0
    :cond_3
    return v1
.end method

.method public static final q(II)V
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 7
    .line 8
    const-string v1, "index: "

    .line 9
    .line 10
    const-string v2, ", size: "

    .line 11
    .line 12
    invoke-static {p0, p1, v1, v2}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public static r()Z
    .locals 18

    .line 1
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "generic"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    const-string v2, "unknown"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "google_sdk"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    const-string v4, "Emulator"

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    const-string v4, "Android SDK built for x86"

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 47
    .line 48
    const-string v5, "Genymotion"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    const-string v4, "sdk_"

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_1

    .line 63
    .line 64
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 65
    .line 66
    const-string v5, "emulator"

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_1

    .line 73
    .line 74
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_0

    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_1

    .line 87
    .line 88
    :cond_0
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_1

    .line 95
    .line 96
    sget-object v2, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 97
    .line 98
    const-string v4, "goldfish"

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_1

    .line 105
    .line 106
    const-string v4, "ranchu"

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_1

    .line 113
    .line 114
    const-string v4, "vbox86p"

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_1

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v4, "nox"

    .line 127
    .line 128
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_1

    .line 133
    .line 134
    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_1

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_1

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const-string v1, "droid4x"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_1

    .line 167
    .line 168
    const-string v0, "vbox86"

    .line 169
    .line 170
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    :cond_1
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 177
    .line 178
    const-string v1, "test-keys"

    .line 179
    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_2

    .line 187
    .line 188
    invoke-static {}, Ltg/b;->E()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_4

    .line 193
    .line 194
    :cond_2
    if-eqz v0, :cond_3

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_3

    .line 201
    .line 202
    invoke-static {}, Ltg/b;->E()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_4

    .line 207
    .line 208
    :cond_3
    const-string v16, "/system/xbin/daemonsu"

    .line 209
    .line 210
    const-string v17, "/system/priv-app/SuperSU/SuperSU.apk"

    .line 211
    .line 212
    const-string v4, "/system/app/Superuser.apk"

    .line 213
    .line 214
    const-string v5, "/system/xbin/su"

    .line 215
    .line 216
    const-string v6, "/system/bin/su"

    .line 217
    .line 218
    const-string v7, "/sbin/su"

    .line 219
    .line 220
    const-string v8, "/data/local/su"

    .line 221
    .line 222
    const-string v9, "/data/local/bin/su"

    .line 223
    .line 224
    const-string v10, "/data/local/xbin/su"

    .line 225
    .line 226
    const-string v11, "/system/sd/xbin/su"

    .line 227
    .line 228
    const-string v12, "/system/bin/failsafe/su"

    .line 229
    .line 230
    const-string v13, "/system/app/SuperSU.apk"

    .line 231
    .line 232
    const-string v14, "/system/etc/init.d/99SuperSUDaemon"

    .line 233
    .line 234
    const-string v15, "/dev/com.koushikdutta.superuser.daemon/"

    .line 235
    .line 236
    filled-new-array/range {v4 .. v17}, [Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    move v1, v3

    .line 241
    :goto_0
    const/16 v2, 0xe

    .line 242
    .line 243
    if-ge v1, v2, :cond_6

    .line 244
    .line 245
    aget-object v2, v0, v1

    .line 246
    .line 247
    new-instance v4, Ljava/io/File;

    .line 248
    .line 249
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_5

    .line 257
    .line 258
    :cond_4
    const/4 v0, 0x1

    .line 259
    return v0

    .line 260
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    goto :goto_0

    .line 263
    :cond_6
    return v3
.end method

.method public static final s(II)V
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-gt p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 7
    .line 8
    const-string v1, "index: "

    .line 9
    .line 10
    const-string v2, ", size: "

    .line 11
    .line 12
    invoke-static {p0, p1, v1, v2}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public static t(I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v2, "radix "

    .line 12
    .line 13
    const-string v3, " was not in valid range "

    .line 14
    .line 15
    invoke-static {p0, v2, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, Lzf/g;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/16 v4, 0x24

    .line 23
    .line 24
    invoke-direct {v2, v0, v4, v3}, Lzf/e;-><init>(III)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public static final u(III)V
    .locals 4

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, " > toIndex: "

    .line 13
    .line 14
    invoke-static {p0, p1, v0, v1}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p2

    .line 22
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 23
    .line 24
    const-string v2, ", toIndex: "

    .line 25
    .line 26
    const-string v3, ", size: "

    .line 27
    .line 28
    invoke-static {v0, p0, v2, p1, v3}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public static v()Z
    .locals 9

    .line 1
    const-string v7, "/data/local/su"

    .line 2
    .line 3
    const-string v8, "/su/bin/su"

    .line 4
    .line 5
    const-string v0, "/sbin/su"

    .line 6
    .line 7
    const-string v1, "/system/bin/su"

    .line 8
    .line 9
    const-string v2, "/system/xbin/su"

    .line 10
    .line 11
    const-string v3, "/data/local/xbin/su"

    .line 12
    .line 13
    const-string v4, "/data/local/bin/su"

    .line 14
    .line 15
    const-string v5, "/system/sd/xbin/su"

    .line 16
    .line 17
    const-string v6, "/system/bin/failsafe/su"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    const/4 v3, 0x1

    .line 26
    const/16 v4, 0x9

    .line 27
    .line 28
    if-ge v2, v4, :cond_1

    .line 29
    .line 30
    aget-object v4, v0, v2

    .line 31
    .line 32
    new-instance v5, Ljava/io/File;

    .line 33
    .line 34
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    return v3

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string v0, "which su"

    .line 48
    .line 49
    invoke-static {v0}, Ltg/b;->n(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    const-string v0, "type su"

    .line 56
    .line 57
    invoke-static {v0}, Ltg/b;->n(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    const-string v0, "su --version"

    .line 64
    .line 65
    invoke-static {v0}, Ltg/b;->n(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return v1

    .line 73
    :cond_3
    :goto_1
    return v3
.end method

.method public static w(Landroid/content/Context;)Z
    .locals 5

    .line 1
    const-string v0, "display"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/hardware/display/DisplayManager;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-static {p0}, Lorg/apache/tika/utils/a;->v(Landroid/view/Display;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-static {p0}, Ld2/b;->i(Landroid/view/Display;)Landroid/view/Display$HdrCapabilities;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Ld2/b;->A(Landroid/view/Display$HdrCapabilities;)[I

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    array-length v1, p0

    .line 35
    move v2, v0

    .line 36
    :goto_1
    if-ge v2, v1, :cond_2

    .line 37
    .line 38
    aget v3, p0, v2

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    return v4

    .line 44
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    return v0
.end method

.method public static final x(CCZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p0, p1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    return v0
.end method

.method public static final y(Landroid/view/View;)Ln3/f;
    .locals 1

    .line 1
    sget-object v0, Ln3/g;->j:Ln3/g;

    .line 2
    .line 3
    invoke-static {p0, v0}, LAf/n;->a0(Ljava/lang/Object;Ltf/l;)LAf/k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ln3/g;->k:Ln3/g;

    .line 8
    .line 9
    invoke-static {p0, v0}, LAf/n;->d0(LAf/k;Ltf/l;)LAf/g;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ln3/f;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final z(LE0/l;I)I
    .locals 2

    .line 1
    const-string v0, "fontWeight"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LE0/l;->b:LE0/l;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, LE0/l;->a(LE0/l;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    if-ltz p0, :cond_0

    .line 15
    .line 16
    move p0, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p0, v1

    .line 19
    :goto_0
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    move p1, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p1, v1

    .line 24
    :goto_1
    if-eqz p1, :cond_2

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    return p0

    .line 30
    :cond_2
    if-eqz p0, :cond_3

    .line 31
    .line 32
    return v0

    .line 33
    :cond_3
    if-eqz p1, :cond_4

    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    return p0

    .line 37
    :cond_4
    return v1
.end method


# virtual methods
.method public abstract J(Ljava/lang/Throwable;)V
.end method

.method public abstract K(LVa/X7;)V
.end method
