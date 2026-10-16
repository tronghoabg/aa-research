.class public final LVa/d;
.super LVa/Pb;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;
.implements LVa/gb;


# static fields
.field public static final n:[I

.field public static o:I = 0x0

.field public static p:I = 0x1


# instance fields
.field public k:Ljava/lang/Class;

.field public l:Ljava/util/WeakHashMap;

.field public m:LVa/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/d;->n:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x6ff48d32
        -0x491cb159
        -0x2210dd5b
        0x3c9b106b
        0x1b1f1b1a
        0x162412a8
        0x1c293c59
        -0x3c468fe1
        0x5c7e6ee9
        -0x51c464d9
        0x7b1b1117
        -0x7e481fcb
        -0x36c4ec3f
        0x60ad08e2
        0x868b0f0
        -0x2c5a5182
        0x7cf88acc
        -0xc2882e5
    .end array-data
.end method

.method public static D(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget v0, LVa/d;->p:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x4d

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/d;->o:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge v0, v1, :cond_2

    .line 21
    .line 22
    sget v1, LVa/d;->o:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x35

    .line 25
    .line 26
    rem-int/lit16 v1, v1, 0x80

    .line 27
    .line 28
    sput v1, LVa/d;->p:I

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_0
    invoke-static {v1, p1}, LVa/d;->D(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    sget p0, LVa/d;->o:I

    .line 52
    .line 53
    add-int/lit8 p0, p0, 0x57

    .line 54
    .line 55
    rem-int/lit16 p0, p0, 0x80

    .line 56
    .line 57
    sput p0, LVa/d;->p:I

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public static F(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget v0, LVa/d;->o:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x65

    .line 8
    .line 9
    rem-int/lit16 v0, v0, 0x80

    .line 10
    .line 11
    sput v0, LVa/d;->p:I

    .line 12
    .line 13
    check-cast p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x4f

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, LVa/d;->o:I

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    sget p0, LVa/d;->p:I

    .line 47
    .line 48
    add-int/lit8 p0, p0, 0x61

    .line 49
    .line 50
    rem-int/lit16 p0, p0, 0x80

    .line 51
    .line 52
    sput p0, LVa/d;->o:I

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_0
    invoke-static {v1, p1}, LVa/d;->F(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method

.method public static G(I[I)Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, LVa/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x4

    .line 5
    :try_start_0
    new-array v1, v1, [C

    .line 6
    .line 7
    array-length v2, p1

    .line 8
    const/4 v3, 0x1

    .line 9
    shl-int/2addr v2, v3

    .line 10
    new-array v2, v2, [C

    .line 11
    .line 12
    sget-object v4, LVa/d;->n:[I

    .line 13
    .line 14
    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, [I

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    sput v5, LVa/a;->k:I

    .line 22
    .line 23
    :goto_0
    sget v6, LVa/a;->k:I

    .line 24
    .line 25
    array-length v7, p1

    .line 26
    if-ge v6, v7, :cond_1

    .line 27
    .line 28
    aget v7, p1, v6

    .line 29
    .line 30
    shr-int/lit8 v8, v7, 0x10

    .line 31
    .line 32
    int-to-char v8, v8

    .line 33
    aput-char v8, v1, v5

    .line 34
    .line 35
    int-to-char v7, v7

    .line 36
    aput-char v7, v1, v3

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    aget v6, p1, v6

    .line 41
    .line 42
    shr-int/lit8 v9, v6, 0x10

    .line 43
    .line 44
    int-to-char v9, v9

    .line 45
    const/4 v10, 0x2

    .line 46
    aput-char v9, v1, v10

    .line 47
    .line 48
    int-to-char v6, v6

    .line 49
    const/4 v11, 0x3

    .line 50
    aput-char v6, v1, v11

    .line 51
    .line 52
    shl-int/lit8 v8, v8, 0x10

    .line 53
    .line 54
    add-int/2addr v8, v7

    .line 55
    sput v8, LVa/a;->l:I

    .line 56
    .line 57
    shl-int/lit8 v7, v9, 0x10

    .line 58
    .line 59
    add-int/2addr v7, v6

    .line 60
    sput v7, LVa/a;->m:I

    .line 61
    .line 62
    invoke-static {v4}, LVa/a;->o([I)V

    .line 63
    .line 64
    .line 65
    move v6, v5

    .line 66
    :goto_1
    const/16 v7, 0x10

    .line 67
    .line 68
    if-ge v6, v7, :cond_0

    .line 69
    .line 70
    sget v7, LVa/a;->l:I

    .line 71
    .line 72
    aget v8, v4, v6

    .line 73
    .line 74
    xor-int/2addr v7, v8

    .line 75
    sput v7, LVa/a;->l:I

    .line 76
    .line 77
    invoke-static {v7}, LVa/a;->G(I)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    sget v8, LVa/a;->m:I

    .line 82
    .line 83
    xor-int/2addr v7, v8

    .line 84
    sget v8, LVa/a;->l:I

    .line 85
    .line 86
    sput v7, LVa/a;->l:I

    .line 87
    .line 88
    sput v8, LVa/a;->m:I

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    sget v6, LVa/a;->l:I

    .line 96
    .line 97
    sget v8, LVa/a;->m:I

    .line 98
    .line 99
    sput v8, LVa/a;->l:I

    .line 100
    .line 101
    sput v6, LVa/a;->m:I

    .line 102
    .line 103
    aget v7, v4, v7

    .line 104
    .line 105
    xor-int/2addr v6, v7

    .line 106
    sput v6, LVa/a;->m:I

    .line 107
    .line 108
    const/16 v7, 0x11

    .line 109
    .line 110
    aget v7, v4, v7

    .line 111
    .line 112
    xor-int/2addr v7, v8

    .line 113
    sput v7, LVa/a;->l:I

    .line 114
    .line 115
    ushr-int/lit8 v8, v7, 0x10

    .line 116
    .line 117
    int-to-char v8, v8

    .line 118
    aput-char v8, v1, v5

    .line 119
    .line 120
    int-to-char v7, v7

    .line 121
    aput-char v7, v1, v3

    .line 122
    .line 123
    ushr-int/lit8 v7, v6, 0x10

    .line 124
    .line 125
    int-to-char v7, v7

    .line 126
    aput-char v7, v1, v10

    .line 127
    .line 128
    int-to-char v6, v6

    .line 129
    aput-char v6, v1, v11

    .line 130
    .line 131
    invoke-static {v4}, LVa/a;->o([I)V

    .line 132
    .line 133
    .line 134
    sget v6, LVa/a;->k:I

    .line 135
    .line 136
    shl-int/lit8 v7, v6, 0x1

    .line 137
    .line 138
    aget-char v8, v1, v5

    .line 139
    .line 140
    aput-char v8, v2, v7

    .line 141
    .line 142
    add-int/lit8 v8, v7, 0x1

    .line 143
    .line 144
    aget-char v9, v1, v3

    .line 145
    .line 146
    aput-char v9, v2, v8

    .line 147
    .line 148
    add-int/lit8 v8, v7, 0x2

    .line 149
    .line 150
    aget-char v9, v1, v10

    .line 151
    .line 152
    aput-char v9, v2, v8

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x3

    .line 155
    .line 156
    aget-char v8, v1, v11

    .line 157
    .line 158
    aput-char v8, v2, v7

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x2

    .line 161
    .line 162
    sput v6, LVa/a;->k:I

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {p1, v2, v5, p0}, Ljava/lang/String;-><init>([CII)V

    .line 169
    .line 170
    .line 171
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    return-object p1

    .line 173
    :goto_2
    monitor-exit v0

    .line 174
    throw p0
.end method


# virtual methods
.method public final A()LVa/Lb;
    .locals 3

    .line 1
    sget v0, LVa/d;->o:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/d;->p:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x29

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/d;->p:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    throw v2

    .line 26
    :cond_1
    throw v2
.end method

.method public final B(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    sget v0, LVa/d;->o:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/d;->p:I

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Landroid/view/View;

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x7d

    .line 13
    .line 14
    rem-int/lit16 p1, v0, 0x80

    .line 15
    .line 16
    sput p1, LVa/d;->p:I

    .line 17
    .line 18
    rem-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, LVa/d;->m:LVa/c;

    .line 23
    .line 24
    invoke-static {p1}, LVa/c;->d(LVa/c;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object p1, p0, LVa/d;->m:LVa/c;

    .line 29
    .line 30
    iget-object v8, p1, LVa/Ob;->k:Ljava/util/ArrayList;

    .line 31
    .line 32
    const-class v3, Landroid/webkit/WebView;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    move-object v9, p2

    .line 38
    :goto_0
    invoke-static/range {v2 .. v9}, LVa/Bb;->d(Landroid/view/View;Ljava/lang/Class;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move-object v9, p2

    .line 43
    iget-object p1, p0, LVa/d;->m:LVa/c;

    .line 44
    .line 45
    invoke-static {p1}, LVa/c;->d(LVa/c;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object p1, p0, LVa/d;->m:LVa/c;

    .line 50
    .line 51
    iget-object v8, p1, LVa/Ob;->k:Ljava/util/ArrayList;

    .line 52
    .line 53
    const-class v3, Landroid/webkit/WebView;

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    sget p1, LVa/d;->o:I

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x75

    .line 62
    .line 63
    rem-int/lit16 p1, p1, 0x80

    .line 64
    .line 65
    sput p1, LVa/d;->p:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x5d

    .line 68
    .line 69
    rem-int/lit16 p1, p1, 0x80

    .line 70
    .line 71
    sput p1, LVa/d;->o:I

    .line 72
    .line 73
    return-void
.end method

.method public final C()LVa/b;
    .locals 2

    .line 1
    new-instance v0, LVa/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget v1, LVa/d;->p:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x6b

    .line 10
    .line 11
    rem-int/lit16 v1, v1, 0x80

    .line 12
    .line 13
    sput v1, LVa/d;->o:I

    .line 14
    .line 15
    return-object v0
.end method

.method public final E(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, LVa/d;->o:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/d;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/d;->l:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0, v1, p1}, LVa/Pb;->x(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget p1, LVa/d;->o:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x29

    .line 45
    .line 46
    rem-int/lit16 p1, p1, 0x80

    .line 47
    .line 48
    sput p1, LVa/d;->p:I

    .line 49
    .line 50
    :cond_0
    return-void

    .line 51
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    throw p1
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, LVa/d;->o:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/d;->p:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/d;->k:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p1, v0}, LVa/d;->D(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget p1, LVa/d;->o:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x41

    .line 20
    .line 21
    rem-int/lit16 v1, p1, 0x80

    .line 22
    .line 23
    sput v1, LVa/d;->p:I

    .line 24
    .line 25
    rem-int/lit8 p1, p1, 0x2

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, LVa/d;->E(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0, v0}, LVa/d;->E(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1

    .line 38
    :cond_1
    iget-object v0, p0, LVa/d;->m:LVa/c;

    .line 39
    .line 40
    invoke-static {v0}, LVa/c;->b(LVa/c;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    sget v0, LVa/d;->p:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x6f

    .line 53
    .line 54
    rem-int/lit16 v0, v0, 0x80

    .line 55
    .line 56
    sput v0, LVa/d;->o:I

    .line 57
    .line 58
    iget-object v0, p0, LVa/d;->m:LVa/c;

    .line 59
    .line 60
    invoke-static {v0}, LVa/c;->b(LVa/c;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1, v0}, LVa/d;->F(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    sget v0, LVa/d;->p:I

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0xf

    .line 73
    .line 74
    rem-int/lit16 v0, v0, 0x80

    .line 75
    .line 76
    sput v0, LVa/d;->o:I

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 79
    .line 80
    .line 81
    sget p1, LVa/d;->o:I

    .line 82
    .line 83
    add-int/lit8 p1, p1, 0x35

    .line 84
    .line 85
    rem-int/lit16 p1, p1, 0x80

    .line 86
    .line 87
    sput p1, LVa/d;->p:I

    .line 88
    .line 89
    :cond_2
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVa/d;->k:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p1, v0}, LVa/d;->D(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v1, LVa/d;->p:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x43

    .line 12
    .line 13
    rem-int/lit16 v1, v1, 0x80

    .line 14
    .line 15
    sput v1, LVa/d;->o:I

    .line 16
    .line 17
    iget-object v1, p0, LVa/d;->l:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, LVa/Pb;->y(Landroid/view/KeyEvent$Callback;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget p1, LVa/d;->p:I

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x79

    .line 31
    .line 32
    rem-int/lit16 v0, p1, 0x80

    .line 33
    .line 34
    sput v0, LVa/d;->o:I

    .line 35
    .line 36
    rem-int/lit8 p1, p1, 0x2

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const/16 p1, 0x20

    .line 41
    .line 42
    div-int/lit8 p1, p1, 0x0

    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final j(Lorg/json/JSONObject;)V
    .locals 13

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-instance v1, LVa/c;

    .line 4
    .line 5
    invoke-direct {v1}, LVa/Ob;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    rsub-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    const-string v6, "\u730f\u7378\u9f70\u1820\u0ad6\u3e9e\u6d78\u4c6b\u4a3d\ub8cb\ubebe\u70fa\ue893\u2364\ufc21\u66e3\u9aa9\uf16c\u2e37\u14fd\u44bf\u4747\u6007\uc2c6\uf6be\u1545"

    .line 20
    .line 21
    invoke-static {v2, v6}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget v6, LVa/c;->p:I

    .line 34
    .line 35
    add-int/lit8 v6, v6, 0x57

    .line 36
    .line 37
    rem-int/lit16 v6, v6, 0x80

    .line 38
    .line 39
    sput v6, LVa/c;->o:I

    .line 40
    .line 41
    iput-object v2, v1, LVa/c;->m:Ljava/lang/String;

    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x41

    .line 44
    .line 45
    rem-int/lit16 v6, v6, 0x80

    .line 46
    .line 47
    sput v6, LVa/c;->p:I

    .line 48
    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    shr-int/2addr v2, v0

    .line 54
    const-string v6, "\udc43\udc35\ua29e\u51e1\uc144\u91f8\u5093\u7189\u03ed\u7348\uf778\ubb49\u47c0\u1ea9\ub5f5\uad4e\u35ce"

    .line 55
    .line 56
    invoke-static {v2, v6}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget v6, LVa/c;->p:I

    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x2b

    .line 71
    .line 72
    rem-int/lit16 v7, v6, 0x80

    .line 73
    .line 74
    sput v7, LVa/c;->o:I

    .line 75
    .line 76
    rem-int/lit8 v6, v6, 0x2

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    if-nez v6, :cond_6

    .line 80
    .line 81
    iput-object v2, v1, LVa/c;->l:Ljava/lang/String;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    add-int/lit16 v6, v6, 0x6bdc

    .line 89
    .line 90
    const-string v8, "\uf045\u9b8f\u27f1\ub3c1\u5f37\ueb06\u7741\u02a1\uae88\u3af1\uc6eb\u522e\ufe14\u8a4c\u15a6\ua198"

    .line 91
    .line 92
    invoke-static {v6, v8}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    sget v8, LVa/c;->o:I

    .line 105
    .line 106
    add-int/lit8 v8, v8, 0x6d

    .line 107
    .line 108
    rem-int/lit16 v8, v8, 0x80

    .line 109
    .line 110
    sput v8, LVa/c;->p:I

    .line 111
    .line 112
    iput-object v6, v1, LVa/c;->n:Ljava/lang/String;

    .line 113
    .line 114
    add-int/lit8 v8, v8, 0x61

    .line 115
    .line 116
    rem-int/lit16 v6, v8, 0x80

    .line 117
    .line 118
    sput v6, LVa/c;->o:I

    .line 119
    .line 120
    rem-int/lit8 v8, v8, 0x2

    .line 121
    .line 122
    if-nez v8, :cond_5

    .line 123
    .line 124
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    const/4 v8, 0x0

    .line 129
    cmpl-float v6, v6, v8

    .line 130
    .line 131
    rsub-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    const-string v9, "\u1c09\u1c63\uecb8\u0a83\u1382\u51b8\u1ead\u3fb5\u58b5\ua180\uac2b\u6997\u879a\u50af"

    .line 134
    .line 135
    invoke-static {v6, v9}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iput-object v6, v1, LVa/Ob;->a:Ljava/lang/String;

    .line 148
    .line 149
    iput-boolean v2, v1, LVa/Ob;->c:Z

    .line 150
    .line 151
    const-string v6, ""

    .line 152
    .line 153
    invoke-static {v6}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-static {v10, v9}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    invoke-virtual {p1, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    const v10, 0x8d9b

    .line 174
    .line 175
    .line 176
    const-string v11, "\uf040\u7ddd\ueb66\u58b3\uc63c\u3450\ua1c1\u2f61\u9c88\u0a31\u7878\ue5f0\u5318\uc08f\u4e21\ubc54"

    .line 177
    .line 178
    if-eqz v9, :cond_1

    .line 179
    .line 180
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    shr-int/lit8 v9, v9, 0x8

    .line 185
    .line 186
    sub-int v9, v10, v9

    .line 187
    .line 188
    invoke-static {v9, v11}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {p1, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-nez v9, :cond_1

    .line 201
    .line 202
    const/16 v9, 0x30

    .line 203
    .line 204
    invoke-static {v6, v9, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    add-int/lit16 v9, v9, 0x28bc

    .line 209
    .line 210
    const-string v12, "\uf040\ud8fd\ua126\u8a53\u52bc\u3bf0\u0414\ued40\ub59f\u9ec9\u6716\u3059\u18b2\ue126\uca66\u92a5\u7beb\u442a"

    .line 211
    .line 212
    invoke-static {v9, v12}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-virtual {p1, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-eqz v9, :cond_0

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_0
    move v9, v2

    .line 228
    goto :goto_1

    .line 229
    :cond_1
    :goto_0
    move v9, v3

    .line 230
    :goto_1
    iput-boolean v9, v1, LVa/Ob;->f:Z

    .line 231
    .line 232
    invoke-static {v8, v8}, Landroid/graphics/PointF;->length(FF)F

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    cmpl-float v8, v9, v8

    .line 237
    .line 238
    sub-int/2addr v10, v8

    .line 239
    invoke-static {v10, v11}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    iput-boolean v8, v1, LVa/Ob;->g:Z

    .line 252
    .line 253
    const-string v8, "\uf5f5\uf580\u4d5c\u0905\uc1ef\ub875\ubf53\u9e51\u5b1a\u73c3\uaf9c\ubbd0\u6e4f\uf14c"

    .line 254
    .line 255
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    invoke-static {v9, v8}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    iput-boolean v8, v1, LVa/Ob;->h:Z

    .line 272
    .line 273
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    shr-int/lit8 v8, v8, 0x8

    .line 278
    .line 279
    const v9, 0xf9e9

    .line 280
    .line 281
    .line 282
    sub-int v8, v9, v8

    .line 283
    .line 284
    const-string v10, "\uf040\u09ae\u038b\u1dde\u17e3\u11dd\u2b25\u2503\u3f05"

    .line 285
    .line 286
    invoke-static {v8, v10}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    if-eqz v8, :cond_2

    .line 303
    .line 304
    move-object v8, v7

    .line 305
    goto :goto_2

    .line 306
    :cond_2
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    sub-int/2addr v9, v8

    .line 311
    invoke-static {v9, v10}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    const/high16 v9, -0x1000000

    .line 324
    .line 325
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    sub-int/2addr v9, v10

    .line 330
    const-string v10, "\u1970\u195c\ub8aa\ua13f\u4cff"

    .line 331
    .line 332
    invoke-static {v9, v10}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    :goto_2
    iput-object v8, v1, LVa/Ob;->b:Ljava/util/List;

    .line 349
    .line 350
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    rsub-int v8, v8, 0xfa1

    .line 355
    .line 356
    const-string v9, "\uf040\uffe7\uef12\ude9c\uced0\ube66\uad92\u9d21\u8d5e\u7cee\u6c16\u5bae\u4bcd"

    .line 357
    .line 358
    invoke-static {v8, v9}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-virtual {p1, v8, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    iput-boolean v8, v1, LVa/Ob;->d:Z

    .line 371
    .line 372
    iput-boolean v2, v1, LVa/Ob;->e:Z

    .line 373
    .line 374
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    shr-int/2addr v8, v0

    .line 379
    const-string v9, "\uce83\uceee\uac3e\ud7e4\ubc5e\u8312\u5e33\u7f35\u85ec\u0e47\u7174\uc650\u553a\u1035\u33eb\ud04e\u270a\uc23d\ue1f3\ua257\uf910"

    .line 380
    .line 381
    invoke-static {v8, v9}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v8

    .line 389
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    iput-boolean v8, v1, LVa/Ob;->i:Z

    .line 394
    .line 395
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 396
    .line 397
    .line 398
    move-result-wide v8

    .line 399
    cmp-long v8, v8, v4

    .line 400
    .line 401
    rsub-int/lit8 v8, v8, 0x1

    .line 402
    .line 403
    const-string v9, "\uc5a2\uc5cb\uce88\u6b4d\uc9b9\u8834\u3cbd\u1d9b\u395a\u7b8d\ucdc1\ub38c\u5e26"

    .line 404
    .line 405
    invoke-static {v8, v9}, LVa/c;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    iput-boolean v8, v1, LVa/Ob;->j:Z

    .line 418
    .line 419
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 420
    .line 421
    .line 422
    move-result-wide v8

    .line 423
    cmp-long v4, v8, v4

    .line 424
    .line 425
    add-int/lit16 v4, v4, 0x1434

    .line 426
    .line 427
    const-string v5, "\uf043\ue46f\ud836\uccdb\ua08a\u949e\u8968\u7d19\u51ca\u4590\u39a4\u2e76\u0234"

    .line 428
    .line 429
    invoke-static {v4, v5}, LVa/c;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    invoke-static {p1}, LVa/Ab;->i(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    if-eqz p1, :cond_3

    .line 446
    .line 447
    iput-object p1, v1, LVa/Ob;->k:Ljava/util/ArrayList;

    .line 448
    .line 449
    :cond_3
    iput-object v1, p0, LVa/Pb;->j:LVa/Ob;

    .line 450
    .line 451
    iput-object v1, p0, LVa/d;->m:LVa/c;

    .line 452
    .line 453
    :try_start_0
    sget p1, LVa/c;->p:I

    .line 454
    .line 455
    iget-object v4, v1, LVa/c;->l:Ljava/lang/String;

    .line 456
    .line 457
    add-int/lit8 p1, p1, 0x6f

    .line 458
    .line 459
    rem-int/lit16 p1, p1, 0x80

    .line 460
    .line 461
    sput p1, LVa/c;->o:I

    .line 462
    .line 463
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    iput-object p1, p0, LVa/d;->k:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
    .line 469
    sget p1, LVa/d;->o:I

    .line 470
    .line 471
    add-int/lit8 p1, p1, 0x43

    .line 472
    .line 473
    rem-int/lit16 p1, p1, 0x80

    .line 474
    .line 475
    sput p1, LVa/d;->p:I

    .line 476
    .line 477
    add-int/lit8 p1, p1, 0x43

    .line 478
    .line 479
    rem-int/lit16 p1, p1, 0x80

    .line 480
    .line 481
    sput p1, LVa/d;->o:I

    .line 482
    .line 483
    invoke-static {}, LVa/Za;->n()LVa/Za;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    invoke-virtual {p1, p0}, LVa/Za;->p(LVa/gb;)V

    .line 488
    .line 489
    .line 490
    sget p1, LVa/d;->o:I

    .line 491
    .line 492
    add-int/lit8 p1, p1, 0x27

    .line 493
    .line 494
    rem-int/lit16 v0, p1, 0x80

    .line 495
    .line 496
    sput v0, LVa/d;->p:I

    .line 497
    .line 498
    rem-int/lit8 p1, p1, 0x2

    .line 499
    .line 500
    if-eqz p1, :cond_4

    .line 501
    .line 502
    return-void

    .line 503
    :cond_4
    throw v7

    .line 504
    :catch_0
    move-exception p1

    .line 505
    const/16 v4, 0xa

    .line 506
    .line 507
    new-array v4, v4, [I

    .line 508
    .line 509
    fill-array-data v4, :array_0

    .line 510
    .line 511
    .line 512
    const v5, -0xffffed

    .line 513
    .line 514
    .line 515
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    sub-int/2addr v5, v7

    .line 520
    invoke-static {v5, v4}, LVa/d;->G(I[I)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    new-instance v5, Ljava/lang/StringBuilder;

    .line 529
    .line 530
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    new-array v0, v0, [I

    .line 534
    .line 535
    fill-array-data v0, :array_1

    .line 536
    .line 537
    .line 538
    invoke-static {v6, v6, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    add-int/lit8 v2, v2, 0x1f

    .line 543
    .line 544
    invoke-static {v2, v0}, LVa/d;->G(I[I)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    sget v0, LVa/c;->p:I

    .line 556
    .line 557
    iget-object v1, v1, LVa/c;->l:Ljava/lang/String;

    .line 558
    .line 559
    add-int/lit8 v0, v0, 0x6f

    .line 560
    .line 561
    rem-int/lit16 v0, v0, 0x80

    .line 562
    .line 563
    sput v0, LVa/c;->o:I

    .line 564
    .line 565
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const v0, -0x584cda67

    .line 569
    .line 570
    .line 571
    const v1, -0x54912ba8

    .line 572
    .line 573
    .line 574
    filled-new-array {v0, v1}, [I

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    int-to-byte v1, v1

    .line 583
    sub-int/2addr v3, v1

    .line 584
    invoke-static {v3, v0}, LVa/d;->G(I[I)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-static {v4, p1}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :cond_5
    throw v7

    .line 611
    :cond_6
    iput-object v2, v1, LVa/c;->l:Ljava/lang/String;

    .line 612
    .line 613
    throw v7

    .line 614
    nop

    .line 615
    :array_0
    .array-data 4
        -0x12714319
        0x3cfc5dfe
        -0x5b670fb8
        -0x7d3351a4
        0x58b959e1
        0xdea2040
        -0x6efd5326
        -0x57397a9b
        0x4954f89b
        -0x2816b165
    .end array-data

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    :array_1
    .array-data 4
        -0x192a5b0b
        0x27c7febd
        0x3668d9cd
        -0x667f076a
        -0x5fea2a7f
        0x4e2cb013    # 7.243051E8f
        -0x336d840
        0xeffb306
        -0x4de772a1
        -0x65ad0b5
        -0xcbb6109
        0x4b49ede8    # 1.323364E7f
        0x48a73cff
        0x49f095aa    # 1970869.2f
        0x6db1c0bb
        -0x1946b8f5
    .end array-data
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    sget p2, LVa/d;->o:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x29

    .line 4
    .line 5
    rem-int/lit16 p2, p2, 0x80

    .line 6
    .line 7
    sput p2, LVa/d;->p:I

    .line 8
    .line 9
    :try_start_0
    iget-object p2, p0, LVa/d;->k:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p1, p2}, LVa/d;->D(Landroid/view/View;Ljava/lang/Class;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    sget p3, LVa/d;->p:I

    .line 18
    .line 19
    add-int/lit8 p3, p3, 0xd

    .line 20
    .line 21
    rem-int/lit16 p4, p3, 0x80

    .line 22
    .line 23
    sput p4, LVa/d;->o:I

    .line 24
    .line 25
    rem-int/lit8 p3, p3, 0x2

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    :try_start_1
    invoke-virtual {p0, p2}, LVa/d;->E(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p2}, LVa/d;->E(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :cond_1
    return-void

    .line 47
    :goto_0
    const/16 p2, 0xa

    .line 48
    .line 49
    new-array p2, p2, [I

    .line 50
    .line 51
    fill-array-data p2, :array_0

    .line 52
    .line 53
    .line 54
    const-string p3, ""

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    invoke-static {p3, p4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    rsub-int/lit8 p3, p3, 0x13

    .line 62
    .line 63
    invoke-static {p3, p2}, LVa/d;->G(I[I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const/16 p3, 0xc

    .line 72
    .line 73
    new-array p3, p3, [I

    .line 74
    .line 75
    fill-array-data p3, :array_1

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 79
    .line 80
    .line 81
    move-result p5

    .line 82
    const/4 p6, 0x0

    .line 83
    cmpl-float p5, p5, p6

    .line 84
    .line 85
    add-int/lit8 p5, p5, 0x16

    .line 86
    .line 87
    invoke-static {p5, p3}, LVa/d;->G(I[I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-static {p2, p3, p1, p4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :array_0
    .array-data 4
        -0x12714319
        0x3cfc5dfe
        -0x5b670fb8
        -0x7d3351a4
        0x58b959e1
        0xdea2040
        -0x6efd5326
        -0x57397a9b
        0x4954f89b
        -0x2816b165
    .end array-data

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    :array_1
    .array-data 4
        -0x192a5b0b
        0x27c7febd
        0x114a18d9
        0x1287e988
        0x13fc4dab
        -0x7e65a686
        -0x68d4fbf1
        0x2ce6a9c2
        -0x55cd86fb
        0x3c96ffec
        -0x2103c437
        0xd6876da
    .end array-data
.end method

.method public final t(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    .line 1
    sget v0, LVa/d;->p:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/d;->o:I

    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x65

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/d;->o:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x49

    .line 18
    .line 19
    rem-int/lit16 v1, v0, 0x80

    .line 20
    .line 21
    sput v1, LVa/d;->p:I

    .line 22
    .line 23
    rem-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0xc

    .line 28
    .line 29
    div-int/lit8 v0, v0, 0x0

    .line 30
    .line 31
    :cond_0
    return-object p1
.end method
