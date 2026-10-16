.class public final LVa/la;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:[C

.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/la;->b:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x54s
        0x67s
        0x6fs
        0x6as
        0x68s
        0x79s
        0x4bs
        0x6es
        0x73s
        0x69s
        0x77s
        0x25s
        0x7es
        0x75s
        0x6bs
        0x74s
        0x72s
        0x71s
        0x66s
        0x78s
        0x7as
        0x6ds
        0x4as
        0x6cs
        0x7ds
        0x48s
        0x52s
        0x31s
        0x7bs
        0x3fs
    .end array-data
.end method

.method public static a(LVa/ma;LVa/na;)Z
    .locals 2

    .line 1
    sget v0, LVa/la;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p0, p1}, LVa/ma;->e(LVa/na;)Z

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    sget p1, LVa/la;->d:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x9

    .line 21
    .line 22
    rem-int/lit16 v0, p1, 0x80

    .line 23
    .line 24
    sput v0, LVa/la;->c:I

    .line 25
    .line 26
    rem-int/lit8 p1, p1, 0x2

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/16 p1, 0x1e

    .line 31
    .line 32
    div-int/2addr p1, v1

    .line 33
    :cond_0
    return p0

    .line 34
    :cond_1
    :try_start_1
    invoke-interface {p0, p1}, LVa/ma;->e(LVa/na;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    throw p0

    .line 41
    :catch_0
    return v1
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;LVa/na;)LVa/na;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_4

    .line 4
    .line 5
    sget v2, LVa/la;->c:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x67

    .line 8
    .line 9
    rem-int/lit16 v3, v3, 0x80

    .line 10
    .line 11
    sput v3, LVa/la;->d:I

    .line 12
    .line 13
    instance-of v4, p0, Ljava/util/Collection;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    new-instance v1, LVa/na;

    .line 18
    .line 19
    check-cast p0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1, p2}, LVa/na;-><init>(Ljava/util/Collection;Ljava/lang/Object;LVa/na;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x53

    .line 25
    .line 26
    rem-int/lit16 p0, v3, 0x80

    .line 27
    .line 28
    sput p0, LVa/la;->c:I

    .line 29
    .line 30
    rem-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/16 p0, 0x5e

    .line 35
    .line 36
    div-int/2addr p0, v0

    .line 37
    :cond_0
    return-object v1

    .line 38
    :cond_1
    instance-of v3, p0, Ljava/util/Map;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    new-instance v0, LVa/na;

    .line 43
    .line 44
    check-cast p0, Ljava/util/Map;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p0, v0, LVa/na;->M:Ljava/util/Map;

    .line 50
    .line 51
    iput-object p1, v0, LVa/na;->N:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p2, v0, LVa/na;->O:LVa/na;

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x7d

    .line 56
    .line 57
    rem-int/lit16 p0, v2, 0x80

    .line 58
    .line 59
    sput p0, LVa/la;->d:I

    .line 60
    .line 61
    rem-int/lit8 v2, v2, 0x2

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    throw v1

    .line 67
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    new-instance v1, LVa/na;

    .line 78
    .line 79
    new-instance v2, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    new-array v3, v3, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object p0, v3, v0

    .line 85
    .line 86
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v2, p1, p2}, LVa/na;-><init>(Ljava/util/Collection;Ljava/lang/Object;LVa/na;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    return-object v1
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_5

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    array-length v4, v3

    .line 23
    move v5, v1

    .line 24
    :goto_1
    if-ge v5, v4, :cond_1

    .line 25
    .line 26
    sget v6, LVa/la;->c:I

    .line 27
    .line 28
    add-int/lit8 v6, v6, 0x69

    .line 29
    .line 30
    rem-int/lit16 v6, v6, 0x80

    .line 31
    .line 32
    sput v6, LVa/la;->d:I

    .line 33
    .line 34
    aget-object v6, v3, v5

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const-class v8, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    sget v7, LVa/la;->d:I

    .line 49
    .line 50
    add-int/lit8 v7, v7, 0x65

    .line 51
    .line 52
    rem-int/lit16 v7, v7, 0x80

    .line 53
    .line 54
    sput v7, LVa/la;->c:I

    .line 55
    .line 56
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    sget v6, LVa/la;->c:I

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x57

    .line 64
    .line 65
    rem-int/lit16 v6, v6, 0x80

    .line 66
    .line 67
    sput v6, LVa/la;->d:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-array v3, v1, [Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, [Ljava/lang/reflect/Field;

    .line 77
    .line 78
    array-length v3, v2

    .line 79
    :goto_2
    if-ge v1, v3, :cond_4

    .line 80
    .line 81
    aget-object v4, v2, v1

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 104
    .line 105
    .line 106
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    sget v5, LVa/la;->d:I

    .line 110
    .line 111
    add-int/lit8 v5, v5, 0x39

    .line 112
    .line 113
    rem-int/lit16 v6, v5, 0x80

    .line 114
    .line 115
    sput v6, LVa/la;->c:I

    .line 116
    .line 117
    rem-int/lit8 v5, v5, 0x2

    .line 118
    .line 119
    if-nez v5, :cond_2

    .line 120
    .line 121
    return-object v4

    .line 122
    :cond_2
    :try_start_1
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    throw p0

    .line 125
    :cond_3
    sget v4, LVa/la;->c:I

    .line 126
    .line 127
    add-int/lit8 v4, v4, 0x3d

    .line 128
    .line 129
    rem-int/lit16 v4, v4, 0x80

    .line 130
    .line 131
    sput v4, LVa/la;->d:I

    .line 132
    .line 133
    :catch_0
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_5
    sget p0, LVa/la;->d:I

    .line 143
    .line 144
    add-int/lit8 p0, p0, 0x39

    .line 145
    .line 146
    rem-int/lit16 p1, p0, 0x80

    .line 147
    .line 148
    sput p1, LVa/la;->c:I

    .line 149
    .line 150
    rem-int/lit8 p0, p0, 0x2

    .line 151
    .line 152
    if-eqz p0, :cond_6

    .line 153
    .line 154
    const/16 p0, 0x58

    .line 155
    .line 156
    div-int/2addr p0, v1

    .line 157
    :cond_6
    return-object v0
.end method

.method public static d(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x63

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public static e(Lorg/json/JSONArray;Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    sget v1, LVa/la;->d:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x41

    .line 7
    .line 8
    rem-int/lit16 v1, v1, 0x80

    .line 9
    .line 10
    sput v1, LVa/la;->c:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_2

    .line 18
    .line 19
    sget v2, LVa/la;->d:I

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x37

    .line 22
    .line 23
    rem-int/lit16 v3, v2, 0x80

    .line 24
    .line 25
    sput v3, LVa/la;->c:I

    .line 26
    .line 27
    rem-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {p1, v2}, LVa/la;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    sget p0, LVa/la;->c:I

    .line 42
    .line 43
    add-int/lit8 p0, p0, 0x77

    .line 44
    .line 45
    rem-int/lit16 p0, p0, 0x80

    .line 46
    .line 47
    sput p0, LVa/la;->d:I

    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p1, p0}, LVa/la;->j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    return-object v0
.end method

.method public static f(Ljava/lang/Object;Ljava/util/List;)Z
    .locals 2

    .line 1
    sget v0, LVa/la;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x23

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->d:I

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x57

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/la;->d:I

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1}, LVa/ub;->g(Ljava/lang/Class;Ljava/util/List;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    sget p1, LVa/la;->d:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x41

    .line 28
    .line 29
    rem-int/lit16 p1, p1, 0x80

    .line 30
    .line 31
    sput p1, LVa/la;->c:I

    .line 32
    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static g(LVa/na;LF6/r;I)LVa/na;
    .locals 8

    .line 1
    invoke-virtual {p0}, LVa/na;->s0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, LF6/r;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_e

    .line 15
    .line 16
    iget-object v1, p1, LF6/r;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x1

    .line 25
    xor-int/2addr v3, v4

    .line 26
    if-eq v3, v4, :cond_0

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    iget-object v3, p1, LF6/r;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, LVa/ba;

    .line 33
    .line 34
    iget-object v5, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, LVa/ja;

    .line 37
    .line 38
    iget v5, v5, LVa/ja;->f:I

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    if-lt p2, v5, :cond_1

    .line 42
    .line 43
    move v5, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v5, v6

    .line 46
    :goto_0
    xor-int/2addr v5, v4

    .line 47
    if-eq v5, v4, :cond_3

    .line 48
    .line 49
    iget-object v5, v3, LVa/ba;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, LVa/ma;

    .line 52
    .line 53
    invoke-static {v5, p0}, LVa/la;->a(LVa/ma;LVa/na;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    iget-boolean p2, p1, LF6/r;->b:Z

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    iget-object p1, p1, LF6/r;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_2
    return-object p0

    .line 74
    :cond_3
    instance-of v1, v0, Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    move-object v1, v0

    .line 79
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    sget v5, LVa/la;->d:I

    .line 88
    .line 89
    add-int/2addr v5, v4

    .line 90
    rem-int/lit16 v5, v5, 0x80

    .line 91
    .line 92
    sput v5, LVa/la;->c:I

    .line 93
    .line 94
    iget-object v5, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, LVa/ja;

    .line 97
    .line 98
    iget v5, v5, LVa/ja;->i:I

    .line 99
    .line 100
    if-lt p2, v5, :cond_4

    .line 101
    .line 102
    move v5, v4

    .line 103
    goto :goto_1

    .line 104
    :cond_4
    move v5, v6

    .line 105
    :goto_1
    xor-int/2addr v5, v4

    .line 106
    if-eq v5, v4, :cond_5

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iget-object v7, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, LVa/ja;

    .line 115
    .line 116
    iget-object v7, v7, LVa/ja;->d:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v5, v7}, LVa/la;->f(Ljava/lang/Object;Ljava/util/List;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_5

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    add-int/2addr p2, v4

    .line 129
    invoke-static {v0, p1, p2, p0}, LVa/la;->l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_5
    iget-object v1, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, LVa/ja;

    .line 137
    .line 138
    iget-object v1, v1, LVa/ja;->d:Ljava/util/List;

    .line 139
    .line 140
    invoke-static {v0, v1}, LVa/la;->f(Ljava/lang/Object;Ljava/util/List;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_7

    .line 145
    .line 146
    sget v1, LVa/la;->d:I

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x61

    .line 149
    .line 150
    rem-int/lit16 v2, v1, 0x80

    .line 151
    .line 152
    sput v2, LVa/la;->c:I

    .line 153
    .line 154
    rem-int/lit8 v1, v1, 0x2

    .line 155
    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    invoke-static {v0, p1, p2, p0}, LVa/la;->l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :cond_6
    add-int/2addr p2, v4

    .line 164
    invoke-static {v0, p1, p2, p0}, LVa/la;->l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_7
    iget-object v1, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, LVa/ja;

    .line 172
    .line 173
    iget-boolean v1, v1, LVa/ja;->m:Z

    .line 174
    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    if-eqz v0, :cond_8

    .line 178
    .line 179
    iget-object v1, p1, LF6/r;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ljava/util/HashSet;

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_8
    sget v1, LVa/la;->c:I

    .line 187
    .line 188
    add-int/lit8 v1, v1, 0x61

    .line 189
    .line 190
    rem-int/lit16 v1, v1, 0x80

    .line 191
    .line 192
    sput v1, LVa/la;->d:I

    .line 193
    .line 194
    iget-object v1, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, LVa/ja;

    .line 197
    .line 198
    iget v3, v1, LVa/ja;->j:I

    .line 199
    .line 200
    if-lt p2, v3, :cond_9

    .line 201
    .line 202
    move v3, v4

    .line 203
    goto :goto_2

    .line 204
    :cond_9
    move v3, v6

    .line 205
    :goto_2
    iget v5, v1, LVa/ja;->k:I

    .line 206
    .line 207
    if-lt p2, v5, :cond_a

    .line 208
    .line 209
    move v5, v4

    .line 210
    goto :goto_3

    .line 211
    :cond_a
    move v5, v6

    .line 212
    :goto_3
    iget v1, v1, LVa/ja;->l:I

    .line 213
    .line 214
    if-lt p2, v1, :cond_b

    .line 215
    .line 216
    move v6, v4

    .line 217
    :cond_b
    invoke-static {v0, v3, v5, v6}, LVa/la;->o(Ljava/lang/Object;ZZZ)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    sget v3, LVa/la;->d:I

    .line 222
    .line 223
    add-int/lit8 v3, v3, 0x57

    .line 224
    .line 225
    rem-int/lit16 v3, v3, 0x80

    .line 226
    .line 227
    sput v3, LVa/la;->c:I

    .line 228
    .line 229
    if-eqz v1, :cond_d

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_d

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-static {v0, v2, p0}, LVa/la;->b(Ljava/lang/Object;Ljava/lang/Object;LVa/na;)LVa/na;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v3, p1, LF6/r;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v3, LVa/ga;

    .line 252
    .line 253
    iget v5, v3, LVa/ga;->b:I

    .line 254
    .line 255
    add-int/2addr v5, v4

    .line 256
    iput v5, v3, LVa/ga;->b:I

    .line 257
    .line 258
    iget-object v6, v3, LVa/ga;->a:Ljava/util/ArrayList;

    .line 259
    .line 260
    new-instance v7, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6, v5, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v2, p1, p2}, LVa/la;->g(LVa/na;LF6/r;I)LVa/na;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    if-eqz v2, :cond_c

    .line 273
    .line 274
    iget-boolean v5, p1, LF6/r;->b:Z

    .line 275
    .line 276
    if-nez v5, :cond_c

    .line 277
    .line 278
    return-object v2

    .line 279
    :cond_c
    iget v5, v3, LVa/ga;->b:I

    .line 280
    .line 281
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    iget v5, v3, LVa/ga;->b:I

    .line 285
    .line 286
    sub-int/2addr v5, v4

    .line 287
    iput v5, v3, LVa/ga;->b:I

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_d
    return-object v2

    .line 291
    :cond_e
    :goto_5
    sget p0, LVa/la;->c:I

    .line 292
    .line 293
    add-int/lit8 p0, p0, 0x4d

    .line 294
    .line 295
    rem-int/lit16 p0, p0, 0x80

    .line 296
    .line 297
    sput p0, LVa/la;->d:I

    .line 298
    .line 299
    return-object v2
.end method

.method public static h(LVa/na;LVa/ga;I)LVa/na;
    .locals 8

    .line 1
    sget v0, LVa/la;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_8

    .line 13
    .line 14
    iget-object v0, p1, LVa/ga;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ge p2, v0, :cond_7

    .line 21
    .line 22
    iget-object v0, p1, LVa/ga;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p0}, LVa/na;->s0()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget v3, LVa/la;->c:I

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x73

    .line 37
    .line 38
    rem-int/lit16 v4, v3, 0x80

    .line 39
    .line 40
    sput v4, LVa/la;->d:I

    .line 41
    .line 42
    rem-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x0

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v4, v4, v5}, LVa/la;->o(Ljava/lang/Object;ZZZ)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v2, v4, v4, v4}, LVa/la;->o(Ljava/lang/Object;ZZZ)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_0
    sget v6, LVa/la;->d:I

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x39

    .line 60
    .line 61
    rem-int/lit16 v7, v6, 0x80

    .line 62
    .line 63
    sput v7, LVa/la;->c:I

    .line 64
    .line 65
    rem-int/lit8 v6, v6, 0x2

    .line 66
    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    const/16 v6, 0x5d

    .line 70
    .line 71
    div-int/2addr v6, v5

    .line 72
    :cond_1
    if-nez v3, :cond_2

    .line 73
    .line 74
    const-string p0, ""

    .line 75
    .line 76
    const/16 p1, 0x30

    .line 77
    .line 78
    invoke-static {p0, p1, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    rsub-int/lit8 p0, p0, 0x7e

    .line 83
    .line 84
    const-string p1, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 85
    .line 86
    invoke-static {p0, p1}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    const/4 v0, 0x0

    .line 104
    cmpl-float p2, p2, v0

    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x7e

    .line 107
    .line 108
    const-string v0, "\u008c\u008a\u0084\u009d\u0088\u0084\u0085\u0084\u008b\u008c\u009c\u008e\u0093\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0092\u0092\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0097"

    .line 109
    .line 110
    invoke-static {p2, v0}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p0, p1}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    sget v5, LVa/la;->d:I

    .line 141
    .line 142
    add-int/lit8 v5, v5, 0x73

    .line 143
    .line 144
    rem-int/lit16 v5, v5, 0x80

    .line 145
    .line 146
    sput v5, LVa/la;->c:I

    .line 147
    .line 148
    :catch_0
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    sget v5, LVa/la;->c:I

    .line 155
    .line 156
    add-int/lit8 v5, v5, 0x13

    .line 157
    .line 158
    rem-int/lit16 v6, v5, 0x80

    .line 159
    .line 160
    sput v6, LVa/la;->d:I

    .line 161
    .line 162
    rem-int/lit8 v5, v5, 0x2

    .line 163
    .line 164
    if-eqz v5, :cond_5

    .line 165
    .line 166
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    :try_start_0
    invoke-static {v2, v5, p0}, LVa/la;->b(Ljava/lang/Object;Ljava/lang/Object;LVa/na;)LVa/na;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-static {v5, v0, v6}, LVa/la;->k(Ljava/lang/Object;Ljava/util/List;LVa/na;)LVa/na;

    .line 175
    .line 176
    .line 177
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    if-eqz v5, :cond_3

    .line 179
    .line 180
    sget v6, LVa/la;->c:I

    .line 181
    .line 182
    add-int/lit8 v6, v6, 0x3d

    .line 183
    .line 184
    rem-int/lit16 v6, v6, 0x80

    .line 185
    .line 186
    sput v6, LVa/la;->d:I

    .line 187
    .line 188
    add-int/lit8 v6, p2, 0x1

    .line 189
    .line 190
    :try_start_1
    invoke-static {v5, p1, v6}, LVa/la;->h(LVa/na;LVa/ga;I)LVa/na;

    .line 191
    .line 192
    .line 193
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 194
    sget p1, LVa/la;->c:I

    .line 195
    .line 196
    add-int/lit8 p1, p1, 0x5

    .line 197
    .line 198
    rem-int/lit16 p2, p1, 0x80

    .line 199
    .line 200
    sput p2, LVa/la;->d:I

    .line 201
    .line 202
    rem-int/lit8 p1, p1, 0x2

    .line 203
    .line 204
    if-eqz p1, :cond_4

    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_4
    throw v1

    .line 208
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    :try_start_2
    invoke-static {v2, v5, p0}, LVa/la;->b(Ljava/lang/Object;Ljava/lang/Object;LVa/na;)LVa/na;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-static {v5, v0, v6}, LVa/la;->k(Ljava/lang/Object;Ljava/util/List;LVa/na;)LVa/na;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 217
    .line 218
    .line 219
    :try_start_3
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 220
    :catchall_0
    move-exception p0

    .line 221
    throw p0

    .line 222
    :cond_6
    return-object v1

    .line 223
    :cond_7
    return-object p0

    .line 224
    :cond_8
    iget-object p0, p1, LVa/ga;->a:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    throw v1
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/la;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, v0, p1}, LVa/la;->c(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget p1, LVa/la;->d:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x31

    .line 25
    .line 26
    rem-int/lit16 v0, p1, 0x80

    .line 27
    .line 28
    sput v0, LVa/la;->c:I

    .line 29
    .line 30
    rem-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    throw v1

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0, v0, p1}, LVa/la;->c(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public static k(Ljava/lang/Object;Ljava/util/List;LVa/na;)LVa/na;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-class v2, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget v1, LVa/la;->d:I

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0xd

    .line 32
    .line 33
    rem-int/lit16 v2, v1, 0x80

    .line 34
    .line 35
    sput v2, LVa/la;->c:I

    .line 36
    .line 37
    rem-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x1

    .line 52
    div-int/lit8 v2, v2, 0x0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget v2, LVa/la;->c:I

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x27

    .line 73
    .line 74
    rem-int/lit16 v2, v2, 0x80

    .line 75
    .line 76
    sput v2, LVa/la;->d:I

    .line 77
    .line 78
    :goto_1
    new-instance v2, LVa/na;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v0, v2, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 84
    .line 85
    iput-object p0, v2, LVa/na;->N:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p2, v2, LVa/na;->O:LVa/na;

    .line 88
    .line 89
    sget p0, LVa/la;->c:I

    .line 90
    .line 91
    add-int/lit8 p0, p0, 0x7

    .line 92
    .line 93
    rem-int/lit16 p0, p0, 0x80

    .line 94
    .line 95
    sput p0, LVa/la;->d:I

    .line 96
    .line 97
    move-object p0, v1

    .line 98
    move-object p2, v2

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    return-object p2
.end method

.method public static l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;
    .locals 10

    .line 1
    sget v0, LVa/la;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, LF6/r;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LVa/ba;

    .line 18
    .line 19
    iget-object v0, v0, LVa/ba;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LVa/ja;

    .line 22
    .line 23
    iget v0, v0, LVa/ja;->e:I

    .line 24
    .line 25
    const/16 v3, 0x55

    .line 26
    .line 27
    div-int/2addr v3, v2

    .line 28
    if-eq p2, v0, :cond_8

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p1, LF6/r;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LVa/ba;

    .line 34
    .line 35
    iget-object v0, v0, LVa/ba;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LVa/ja;

    .line 38
    .line 39
    iget v0, v0, LVa/ja;->e:I

    .line 40
    .line 41
    if-eq p2, v0, :cond_8

    .line 42
    .line 43
    :goto_0
    if-eqz p0, :cond_8

    .line 44
    .line 45
    iget-object v0, p1, LF6/r;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/HashSet;

    .line 48
    .line 49
    iget-object v3, p1, LF6/r;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, LVa/ba;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_8

    .line 58
    .line 59
    sget v0, LVa/la;->c:I

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x6b

    .line 62
    .line 63
    rem-int/lit16 v0, v0, 0x80

    .line 64
    .line 65
    sput v0, LVa/la;->d:I

    .line 66
    .line 67
    if-lez p2, :cond_1

    .line 68
    .line 69
    instance-of v0, p0, Landroid/app/Activity;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_1
    iget-object v0, p1, LF6/r;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    :try_start_0
    iget-object v4, v3, LVa/ba;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, LVa/yb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    sget v3, LVa/la;->d:I

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1f

    .line 91
    .line 92
    rem-int/lit16 v3, v3, 0x80

    .line 93
    .line 94
    sput v3, LVa/la;->c:I

    .line 95
    .line 96
    :try_start_1
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-object v4, v4, LVa/yb;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Ljava/util/List;

    .line 110
    .line 111
    const/4 v5, -0x1

    .line 112
    invoke-static {v3, v0, v5, v4}, LVa/ba;->i(Ljava/lang/Class;ZILjava/util/List;)[Ljava/lang/reflect/Field;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    goto :goto_3

    .line 117
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget-object v3, v3, LVa/ba;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, LVa/ja;

    .line 124
    .line 125
    iget v5, v3, LVa/ja;->g:I

    .line 126
    .line 127
    if-lt p2, v5, :cond_3

    .line 128
    .line 129
    iget v3, v3, LVa/ja;->h:I

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    move v3, v2

    .line 133
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    move v6, v2

    .line 138
    :goto_2
    if-eqz v4, :cond_6

    .line 139
    .line 140
    if-eq v6, v3, :cond_6

    .line 141
    .line 142
    sget v7, LVa/la;->c:I

    .line 143
    .line 144
    add-int/lit8 v7, v7, 0x3f

    .line 145
    .line 146
    rem-int/lit16 v8, v7, 0x80

    .line 147
    .line 148
    sput v8, LVa/la;->d:I

    .line 149
    .line 150
    rem-int/lit8 v7, v7, 0x2

    .line 151
    .line 152
    if-eqz v7, :cond_5

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-eqz v4, :cond_4

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v5, v7}, LVa/ub;->f([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 169
    .line 170
    sget v7, LVa/la;->d:I

    .line 171
    .line 172
    add-int/lit8 v7, v7, 0x51

    .line 173
    .line 174
    rem-int/lit16 v7, v7, 0x80

    .line 175
    .line 176
    sput v7, LVa/la;->c:I

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    :cond_6
    sget v3, LVa/la;->c:I

    .line 184
    .line 185
    add-int/lit8 v3, v3, 0x45

    .line 186
    .line 187
    rem-int/lit16 v3, v3, 0x80

    .line 188
    .line 189
    sput v3, LVa/la;->d:I

    .line 190
    .line 191
    move-object v3, v5

    .line 192
    :goto_3
    :try_start_2
    iget-object v4, p1, LF6/r;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v4, LVa/ga;

    .line 195
    .line 196
    array-length v5, v3

    .line 197
    move v6, v2

    .line 198
    :goto_4
    if-ge v6, v5, :cond_8

    .line 199
    .line 200
    aget-object v7, v3, v6

    .line 201
    .line 202
    invoke-virtual {v7, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v8, v4, LVa/ga;->a:Ljava/util/ArrayList;

    .line 206
    .line 207
    iget v9, v4, LVa/ga;->b:I

    .line 208
    .line 209
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    check-cast v8, Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    new-instance v8, LVa/na;

    .line 219
    .line 220
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object v7, v8, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 224
    .line 225
    iput-object p0, v8, LVa/na;->N:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object p3, v8, LVa/na;->O:LVa/na;

    .line 228
    .line 229
    sget v9, LVa/la;->c:I

    .line 230
    .line 231
    add-int/lit8 v9, v9, 0x7

    .line 232
    .line 233
    rem-int/lit16 v9, v9, 0x80

    .line 234
    .line 235
    sput v9, LVa/la;->d:I

    .line 236
    .line 237
    invoke-static {v8, p1, p2}, LVa/la;->g(LVa/na;LF6/r;I)LVa/na;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    if-eqz v8, :cond_7

    .line 242
    .line 243
    iget-boolean v9, p1, LF6/r;->b:Z

    .line 244
    .line 245
    if-nez v9, :cond_7

    .line 246
    .line 247
    return-object v8

    .line 248
    :cond_7
    iget-object v8, v4, LVa/ga;->a:Ljava/util/ArrayList;

    .line 249
    .line 250
    iget v9, v4, LVa/ga;->b:I

    .line 251
    .line 252
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    check-cast v8, Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {v8, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 259
    .line 260
    .line 261
    add-int/lit8 v6, v6, 0x1

    .line 262
    .line 263
    sget v7, LVa/la;->c:I

    .line 264
    .line 265
    add-int/lit8 v7, v7, 0xb

    .line 266
    .line 267
    rem-int/lit16 v7, v7, 0x80

    .line 268
    .line 269
    sput v7, LVa/la;->d:I

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :catchall_0
    move-exception p0

    .line 273
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    int-to-byte p1, p1

    .line 278
    add-int/lit16 p1, p1, 0x80

    .line 279
    .line 280
    const-string p2, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 281
    .line 282
    invoke-static {p1, p2}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    const/16 p2, 0x30

    .line 291
    .line 292
    invoke-static {p2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 293
    .line 294
    .line 295
    move-result p2

    .line 296
    rsub-int/lit8 p2, p2, 0x49

    .line 297
    .line 298
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 299
    .line 300
    .line 301
    move-result p3

    .line 302
    rsub-int p3, p3, 0xc3

    .line 303
    .line 304
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    shr-int/lit8 v2, v2, 0x10

    .line 309
    .line 310
    rsub-int/lit8 v2, v2, 0x5

    .line 311
    .line 312
    const-string v3, "\u0012\u000f\u0012\u0012\uffe5\u0004\u000c\u0005\t\uffe6\u0014\u0003\u0005\n\u0002\uffef\uffc0\u0007\u000e\t\u0014\u0014\u0005\u0007\uffc0"

    .line 313
    .line 314
    invoke-static {v3, p2, p3, v2, v0}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-static {p1, p2, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    :cond_8
    return-object v1
.end method

.method public static m(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/la;->b:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit8 v4, v4, -0x5

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method

.method public static n(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/la;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v1, p0, p1}, LVa/la;->c(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget p1, LVa/la;->c:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x65

    .line 21
    .line 22
    rem-int/lit16 p1, p1, 0x80

    .line 23
    .line 24
    sput p1, LVa/la;->d:I

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    invoke-static {v1, p0, p1}, LVa/la;->c(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    throw v1
.end method

.method public static o(Ljava/lang/Object;ZZZ)Ljava/util/ArrayList;
    .locals 3

    .line 1
    sget v0, LVa/la;->d:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/la;->c:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0x59

    .line 17
    .line 18
    rem-int/lit16 v1, v1, 0x80

    .line 19
    .line 20
    sput v1, LVa/la;->c:I

    .line 21
    .line 22
    instance-of v1, p0, Ljava/util/Collection;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x3

    .line 27
    .line 28
    rem-int/lit16 v0, v0, 0x80

    .line 29
    .line 30
    sput v0, LVa/la;->c:I

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    check-cast p0, Ljava/util/Collection;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    if-eqz p3, :cond_1

    .line 53
    .line 54
    new-instance p1, Ljava/util/ArrayList;

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    new-array p2, p2, [Ljava/lang/Object;

    .line 58
    .line 59
    const/4 p3, 0x0

    .line 60
    aput-object p0, p2, p3

    .line 61
    .line 62
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 67
    .line 68
    .line 69
    sget p0, LVa/la;->c:I

    .line 70
    .line 71
    add-int/lit8 p0, p0, 0x59

    .line 72
    .line 73
    rem-int/lit16 p0, p0, 0x80

    .line 74
    .line 75
    sput p0, LVa/la;->d:I

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_1
    instance-of p1, p0, Ljava/util/Map;

    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    if-eqz p2, :cond_2

    .line 83
    .line 84
    new-instance p1, Ljava/util/ArrayList;

    .line 85
    .line 86
    check-cast p0, Ljava/util/Map;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    sget p0, LVa/la;->d:I

    .line 103
    .line 104
    add-int/lit8 p0, p0, 0x7

    .line 105
    .line 106
    rem-int/lit16 p0, p0, 0x80

    .line 107
    .line 108
    sput p0, LVa/la;->c:I

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_2
    return-object v2

    .line 112
    :cond_3
    throw v2
.end method

.method public static p(LVa/na;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 5

    .line 1
    sget v0, LVa/la;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/la;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u008c\u009e"

    .line 12
    .line 13
    const-string v2, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x53

    .line 19
    .line 20
    div-int/2addr v0, v3

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    :goto_0
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    rsub-int/lit8 v0, v0, 0x7f

    .line 31
    .line 32
    invoke-static {v0, v2}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    shr-int/lit8 p1, p1, 0x10

    .line 53
    .line 54
    rsub-int/lit8 p1, p1, 0x7f

    .line 55
    .line 56
    invoke-static {p1, v1}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const p1, 0x1000008

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    add-int/2addr p2, p1

    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    shr-int/lit8 p1, p1, 0x10

    .line 83
    .line 84
    add-int/lit16 p1, p1, 0xb4

    .line 85
    .line 86
    const-string v1, ""

    .line 87
    .line 88
    const/16 v4, 0x30

    .line 89
    .line 90
    invoke-static {v1, v4, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    rsub-int/lit8 v1, v1, 0x6

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    const-string v4, "\u0014$\u001b\u0010%\uffcf\uffdb\uffcf"

    .line 98
    .line 99
    invoke-static {v4, p2, p1, v1, v3}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, LVa/na;->s0()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {v0, p0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    shr-int/lit8 p0, p0, 0x10

    .line 130
    .line 131
    rsub-int/lit8 p0, p0, 0x7f

    .line 132
    .line 133
    invoke-static {p0, v2}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    shr-int/lit8 p1, p1, 0x10

    .line 154
    .line 155
    add-int/lit8 p1, p1, 0x7f

    .line 156
    .line 157
    invoke-static {p1, v1}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p0, p1}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    sget p0, LVa/la;->d:I

    .line 179
    .line 180
    add-int/lit8 p0, p0, 0x3b

    .line 181
    .line 182
    rem-int/lit16 p0, p0, 0x80

    .line 183
    .line 184
    sput p0, LVa/la;->c:I

    .line 185
    .line 186
    return-void
.end method


# virtual methods
.method public i(Ljava/lang/Object;LVa/ba;)LVa/na;
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    sget v0, LVa/la;->d:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x6d

    .line 8
    .line 9
    rem-int/lit16 v3, v0, 0x80

    .line 10
    .line 11
    sput v3, LVa/la;->c:I

    .line 12
    .line 13
    rem-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    move-object/from16 v3, p0

    .line 16
    .line 17
    iget-object v4, v3, LVa/la;->a:Ljava/util/HashMap;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v0, :cond_6

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v8, v2, LVa/ba;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v8, LVa/ja;

    .line 33
    .line 34
    iput-object v0, v8, LVa/ja;->a:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LVa/ga;

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    const-string v10, ""

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    sget v12, LVa/la;->c:I

    .line 49
    .line 50
    add-int/lit8 v12, v12, 0x6d

    .line 51
    .line 52
    rem-int/lit16 v13, v12, 0x80

    .line 53
    .line 54
    sput v13, LVa/la;->d:I

    .line 55
    .line 56
    rem-int/lit8 v12, v12, 0x2

    .line 57
    .line 58
    iget-object v13, v0, LVa/ga;->a:Ljava/util/ArrayList;

    .line 59
    .line 60
    const-string v14, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 61
    .line 62
    if-nez v12, :cond_0

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    check-cast v12, Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1, v12, v5}, LVa/la;->k(Ljava/lang/Object;Ljava/util/List;LVa/na;)LVa/na;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    :goto_0
    invoke-static {v12, v0, v9}, LVa/la;->h(LVa/na;LVa/ga;I)LVa/na;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :catch_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    check-cast v12, Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1, v12, v5}, LVa/la;->k(Ljava/lang/Object;Ljava/util/List;LVa/na;)LVa/na;

    .line 88
    .line 89
    .line 90
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    sget v12, LVa/la;->c:I

    .line 93
    .line 94
    add-int/lit8 v12, v12, 0x55

    .line 95
    .line 96
    rem-int/lit16 v13, v12, 0x80

    .line 97
    .line 98
    sput v13, LVa/la;->d:I

    .line 99
    .line 100
    rem-int/lit8 v12, v12, 0x2

    .line 101
    .line 102
    if-nez v12, :cond_1

    .line 103
    .line 104
    const/16 v12, 0x2d

    .line 105
    .line 106
    div-int/2addr v12, v11

    .line 107
    goto :goto_3

    .line 108
    :goto_2
    invoke-static {v10}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    rsub-int/lit8 v12, v12, 0x7e

    .line 113
    .line 114
    invoke-static {v12, v14}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    shr-int/lit8 v13, v13, 0x10

    .line 127
    .line 128
    rsub-int/lit8 v13, v13, 0x7f

    .line 129
    .line 130
    const-string v15, "\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0092\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0098\u0089\u0088\u0086\u0086\u0084\u0098\u008c\u008b\u0090\u008b\u008b\u0097"

    .line 131
    .line 132
    invoke-static {v13, v15}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-static {v12, v13, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v5

    .line 144
    :cond_1
    :goto_3
    if-eqz v0, :cond_3

    .line 145
    .line 146
    sget v12, LVa/la;->d:I

    .line 147
    .line 148
    add-int/lit8 v12, v12, 0x29

    .line 149
    .line 150
    rem-int/lit16 v13, v12, 0x80

    .line 151
    .line 152
    sput v13, LVa/la;->c:I

    .line 153
    .line 154
    rem-int/lit8 v12, v12, 0x2

    .line 155
    .line 156
    if-nez v12, :cond_2

    .line 157
    .line 158
    iget-object v12, v2, LVa/ba;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v12, LVa/ma;

    .line 161
    .line 162
    invoke-static {v12, v0}, LVa/la;->a(LVa/ma;LVa/na;)Z

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    if-eqz v12, :cond_3

    .line 167
    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-static {v11}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    rsub-int/lit8 v4, v4, 0x7f

    .line 178
    .line 179
    const-string v5, "\u008c\u0089\u0088\u008c\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0089\u0095\u0090\u008f"

    .line 180
    .line 181
    invoke-static {v4, v5}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 193
    .line 194
    .line 195
    move-result-wide v4

    .line 196
    sub-long/2addr v4, v6

    .line 197
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-static {v11, v11, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    rsub-int/lit8 v4, v4, 0x2

    .line 205
    .line 206
    invoke-static {v10, v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    rsub-int v5, v5, 0xd3

    .line 211
    .line 212
    invoke-static {v11}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    add-int/2addr v6, v9

    .line 217
    const-string v7, "\ufffd\u0003"

    .line 218
    .line 219
    invoke-static {v7, v4, v5, v6, v9}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v0, v1, v2}, LVa/la;->p(LVa/na;Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_2
    iget-object v1, v2, LVa/ba;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, LVa/ma;

    .line 241
    .line 242
    invoke-static {v1, v0}, LVa/la;->a(LVa/ma;LVa/na;)Z

    .line 243
    .line 244
    .line 245
    throw v5

    .line 246
    :cond_3
    invoke-static {v11, v11}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    add-int/lit8 v0, v0, 0x7f

    .line 251
    .line 252
    invoke-static {v0, v14}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v12, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-static {v11, v11}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    add-int/lit8 v13, v13, 0xb

    .line 273
    .line 274
    invoke-static {v10, v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    add-int/lit16 v14, v14, 0xbd

    .line 279
    .line 280
    invoke-static {v10}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    rsub-int/lit8 v15, v15, 0xa

    .line 285
    .line 286
    const-string v9, "\uffe0\uffc6\u0016\u0007\u001a\u000e\uffc6\u0013\u000f\u0019\u0019"

    .line 287
    .line 288
    invoke-static {v9, v13, v14, v15, v11}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-static {v0, v9}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    :cond_4
    new-instance v0, LF6/r;

    .line 310
    .line 311
    invoke-direct {v0, v2}, LF6/r;-><init>(LVa/ba;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v1, v0, v11, v5}, LVa/la;->l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    const-string v9, "\u0013\uffc4\u0018\t\u0017\uffc4\u0012\r\uffc4\u0017\u0018\u0007\t\u000e\u0006"

    .line 319
    .line 320
    const-string v13, "\"(\uffe1\uffd5"

    .line 321
    .line 322
    if-eqz v2, :cond_5

    .line 323
    .line 324
    new-instance v5, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 330
    .line 331
    .line 332
    move-result-wide v14

    .line 333
    const-wide/16 v16, 0x0

    .line 334
    .line 335
    cmp-long v14, v14, v16

    .line 336
    .line 337
    add-int/lit8 v14, v14, 0x8

    .line 338
    .line 339
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 340
    .line 341
    .line 342
    move-result v15

    .line 343
    shr-int/lit8 v15, v15, 0x10

    .line 344
    .line 345
    add-int/lit16 v15, v15, 0xbe

    .line 346
    .line 347
    invoke-static {v11}, Landroid/graphics/Color;->red(I)I

    .line 348
    .line 349
    .line 350
    move-result v18

    .line 351
    add-int/lit8 v12, v18, 0x6

    .line 352
    .line 353
    const-string v11, "\uffc5\t\u0013\u001a\u0014\u000b\uffc5\u0013\u000e"

    .line 354
    .line 355
    const/4 v3, 0x1

    .line 356
    invoke-static {v11, v14, v15, v12, v3}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 368
    .line 369
    .line 370
    move-result-wide v11

    .line 371
    sub-long/2addr v11, v6

    .line 372
    invoke-virtual {v5, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const/4 v3, 0x0

    .line 376
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    rsub-int/lit8 v6, v6, 0x4

    .line 381
    .line 382
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 383
    .line 384
    .line 385
    move-result-wide v11

    .line 386
    cmp-long v7, v11, v16

    .line 387
    .line 388
    rsub-int v7, v7, 0xaf

    .line 389
    .line 390
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 391
    .line 392
    .line 393
    move-result-wide v11

    .line 394
    cmp-long v11, v11, v16

    .line 395
    .line 396
    rsub-int/lit8 v11, v11, 0x5

    .line 397
    .line 398
    invoke-static {v13, v6, v7, v11, v3}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    iget-object v6, v0, LF6/r;->e:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v6, Ljava/util/HashSet;

    .line 412
    .line 413
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const/16 v6, 0x30

    .line 421
    .line 422
    invoke-static {v10, v6, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    rsub-int/lit8 v3, v3, 0xe

    .line 427
    .line 428
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 429
    .line 430
    .line 431
    move-result v6

    .line 432
    shr-int/lit8 v6, v6, 0x10

    .line 433
    .line 434
    rsub-int v6, v6, 0xbf

    .line 435
    .line 436
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    shr-int/lit8 v7, v7, 0x10

    .line 441
    .line 442
    rsub-int/lit8 v7, v7, 0x2

    .line 443
    .line 444
    const/4 v10, 0x1

    .line 445
    invoke-static {v9, v3, v6, v7, v10}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v2, v1, v3}, LVa/la;->p(LVa/na;Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    iget-object v0, v0, LF6/r;->d:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, LVa/ga;

    .line 466
    .line 467
    invoke-virtual {v4, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    return-object v2

    .line 471
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    const/4 v3, 0x0

    .line 477
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    rsub-int/lit8 v3, v4, 0xd

    .line 482
    .line 483
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    shr-int/lit8 v4, v4, 0x10

    .line 488
    .line 489
    rsub-int v4, v4, 0xbe

    .line 490
    .line 491
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    shr-int/lit8 v8, v8, 0x10

    .line 496
    .line 497
    add-int/lit8 v8, v8, 0x3

    .line 498
    .line 499
    const-string v11, "\u0019\u0014\u0013\uffc5\u0013\u000e\uffc5\t\u0013\u001a\u0014\u000b\uffc5"

    .line 500
    .line 501
    const/4 v12, 0x1

    .line 502
    invoke-static {v11, v3, v4, v8, v12}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 514
    .line 515
    .line 516
    move-result-wide v3

    .line 517
    sub-long/2addr v3, v6

    .line 518
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    const/4 v3, 0x0

    .line 522
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    rsub-int/lit8 v4, v4, 0x4

    .line 527
    .line 528
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    shr-int/lit8 v6, v6, 0x10

    .line 533
    .line 534
    rsub-int v6, v6, 0xae

    .line 535
    .line 536
    const/16 v7, 0x30

    .line 537
    .line 538
    invoke-static {v10, v7, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 539
    .line 540
    .line 541
    move-result v7

    .line 542
    rsub-int/lit8 v7, v7, 0x3

    .line 543
    .line 544
    invoke-static {v13, v4, v6, v7, v3}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    iget-object v0, v0, LF6/r;->e:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, Ljava/util/HashSet;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    shr-int/lit8 v0, v0, 0x10

    .line 571
    .line 572
    rsub-int/lit8 v0, v0, 0xf

    .line 573
    .line 574
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    shr-int/lit8 v3, v3, 0x10

    .line 579
    .line 580
    rsub-int v3, v3, 0xbf

    .line 581
    .line 582
    const/4 v4, 0x0

    .line 583
    invoke-static {v10, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    rsub-int/lit8 v4, v4, 0x2

    .line 588
    .line 589
    const/4 v10, 0x1

    .line 590
    invoke-static {v9, v0, v3, v4, v10}, LVa/la;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-static {v5, v1, v0}, LVa/la;->p(LVa/na;Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    return-object v5

    .line 609
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    iget-object v1, v2, LVa/ba;->a:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v1, LVa/ja;

    .line 619
    .line 620
    iput-object v0, v1, LVa/ja;->a:Ljava/lang/Class;

    .line 621
    .line 622
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    check-cast v0, LVa/ga;

    .line 627
    .line 628
    throw v5
.end method

.method public declared-synchronized q(Z)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, LVa/Y;->c()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    invoke-static {}, LVa/Y;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, p0, LVa/la;->a:Ljava/util/HashMap;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LVa/c0;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v1, 0x0

    .line 79
    :goto_1
    if-eqz v1, :cond_7

    .line 80
    .line 81
    sget v2, LVa/c0;->l:I

    .line 82
    .line 83
    iget-object v1, v1, LVa/c0;->g:LVa/a0;

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x35

    .line 86
    .line 87
    rem-int/lit16 v2, v2, 0x80

    .line 88
    .line 89
    sput v2, LVa/c0;->k:I

    .line 90
    .line 91
    sget-object v2, LVa/a0;->d:LVa/a0;

    .line 92
    .line 93
    if-eq v1, v2, :cond_2

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iget-object p1, p0, LVa/la;->a:Ljava/util/HashMap;

    .line 97
    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_6

    .line 132
    .line 133
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, LVa/c0;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    sget v3, LVa/c0;->l:I

    .line 142
    .line 143
    iget-object v2, v2, LVa/c0;->g:LVa/a0;

    .line 144
    .line 145
    add-int/lit8 v3, v3, 0x35

    .line 146
    .line 147
    rem-int/lit16 v3, v3, 0x80

    .line 148
    .line 149
    sput v3, LVa/c0;->k:I

    .line 150
    .line 151
    sget-object v3, LVa/a0;->d:LVa/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    if-ne v2, v3, :cond_6

    .line 154
    .line 155
    monitor-exit p0

    .line 156
    const/4 p1, 0x1

    .line 157
    return p1

    .line 158
    :cond_7
    :goto_2
    monitor-exit p0

    .line 159
    const/4 p1, 0x0

    .line 160
    return p1

    .line 161
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    throw p1
.end method
