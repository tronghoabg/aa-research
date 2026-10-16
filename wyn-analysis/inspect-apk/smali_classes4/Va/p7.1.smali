.class public final LVa/p7;
.super LVa/a;
.source "SourceFile"


# static fields
.field public static final A:[I

.field public static B:I = 0x0

.field public static C:I = 0x1


# instance fields
.field public synthetic y:Z

.field public synthetic z:LVa/y7;


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
    sput-object v0, LVa/p7;->A:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x2f8ee425
        -0x7ba5e19
        0x4f324539
        -0x3258275e    # -3.5199904E8f
        0x1036adc6
        0x1dc38fe0
        -0x6a439017
        -0x1348e5c4
        0x38b0b1f4
        0x9cc939f
        0x2af91686
        -0x631e3dca
        0x1e3ea3d5
        -0x2adce27b
        -0x521407fa
        -0x75f3951f
        -0x39a38d6c
        -0x605bd9aa
    .end array-data
.end method

.method public static t(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/p7;->A:[I

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
.method public final C(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->B:I

    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, ""

    .line 18
    .line 19
    const/16 v3, 0x30

    .line 20
    .line 21
    invoke-static {v2, v3, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    rsub-int/lit8 v1, v1, 0x13

    .line 26
    .line 27
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v1, p0

    .line 36
    move-object v3, p1

    .line 37
    move-object v4, p2

    .line 38
    move-object v5, p3

    .line 39
    move-object v6, p4

    .line 40
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 41
    .line 42
    .line 43
    sget p1, LVa/p7;->C:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x3b

    .line 46
    .line 47
    rem-int/lit16 p1, p1, 0x80

    .line 48
    .line 49
    sput p1, LVa/p7;->B:I

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :array_0
    .array-data 4
        0x54b18d1c
        -0x4d024634
        -0x6b8e879f
        -0x6c6e1d96
        -0x527dc7b0
        0x7c9cf753
        0x669ef864
        -0x286e7ef8
        0x6b45bf29
        0x3802ebd0
    .end array-data
.end method

.method public final D(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V
    .locals 8

    .line 1
    sget v0, LVa/p7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->C:I

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/lit8 v2, v2, 0xb

    .line 21
    .line 22
    invoke-static {v2, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v2, p0

    .line 32
    move-object v4, p1

    .line 33
    move-object v5, p2

    .line 34
    move-object v7, p3

    .line 35
    invoke-virtual/range {v2 .. v7}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 36
    .line 37
    .line 38
    sget p1, LVa/p7;->C:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x23

    .line 41
    .line 42
    rem-int/lit16 p2, p1, 0x80

    .line 43
    .line 44
    sput p2, LVa/p7;->B:I

    .line 45
    .line 46
    rem-int/lit8 p1, p1, 0x2

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/16 p1, 0x28

    .line 51
    .line 52
    div-int/2addr p1, v1

    .line 53
    :cond_0
    return-void

    .line 54
    nop

    .line 55
    :array_0
    .array-data 4
        0x2d4b6fba
        -0x780962b4
        0x2d393bf5
        0x36ef10ab
        0x148c273d
        -0x3a3570cf
    .end array-data
.end method

.method public final K(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V
    .locals 12

    .line 1
    const/4 v0, 0x6

    .line 2
    sget v1, LVa/p7;->B:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x53

    .line 5
    .line 6
    rem-int/lit16 v2, v1, 0x80

    .line 7
    .line 8
    sput v2, LVa/p7;->C:I

    .line 9
    .line 10
    rem-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    fill-array-data v0, :array_0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    div-int/lit8 v1, v1, 0x24

    .line 24
    .line 25
    const/16 v2, 0x77

    .line 26
    .line 27
    shr-int v1, v2, v1

    .line 28
    .line 29
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v1, p0

    .line 39
    move-object v3, p1

    .line 40
    move-object v4, p2

    .line 41
    move-object v6, p3

    .line 42
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v3, p1

    .line 47
    move-object v4, p2

    .line 48
    move-object v6, p3

    .line 49
    new-array p1, v0, [I

    .line 50
    .line 51
    fill-array-data p1, :array_1

    .line 52
    .line 53
    .line 54
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    shr-int/lit8 p2, p2, 0x16

    .line 59
    .line 60
    add-int/lit8 p2, p2, 0xb

    .line 61
    .line 62
    invoke-static {p2, p1}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const/4 v10, 0x0

    .line 71
    move-object v8, v3

    .line 72
    move-object v9, v4

    .line 73
    move-object v11, v6

    .line 74
    move-object v6, p0

    .line 75
    invoke-virtual/range {v6 .. v11}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    sget p1, LVa/p7;->C:I

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x3

    .line 81
    .line 82
    rem-int/lit16 p1, p1, 0x80

    .line 83
    .line 84
    sput p1, LVa/p7;->B:I

    .line 85
    .line 86
    return-void

    .line 87
    :array_0
    .array-data 4
        0x151c7efc
        -0x7dd72256
        -0x17584b37
        -0x688e5887
        0x62bc63eb
        0x7d191731
    .end array-data

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_1
    .array-data 4
        0x151c7efc
        -0x7dd72256
        -0x17584b37
        -0x688e5887
        0x62bc63eb
        0x7d191731
    .end array-data
.end method

.method public final M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v3, 0x8

    .line 9
    .line 10
    new-array v3, v3, [I

    .line 11
    .line 12
    fill-array-data v3, :array_0

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/lit8 v4, v4, 0xf

    .line 20
    .line 21
    invoke-static {v4, v3}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v2, 0x4

    .line 40
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object p2, v2, v1

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    aput-object p3, v2, p2

    .line 46
    .line 47
    aput-object p4, v2, v0

    .line 48
    .line 49
    const/4 p2, 0x3

    .line 50
    aput-object p5, v2, p2

    .line 51
    .line 52
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object p3, p0, LVa/p7;->z:LVa/y7;

    .line 57
    .line 58
    iget-boolean p4, p0, LVa/p7;->y:Z

    .line 59
    .line 60
    invoke-static {p3, p1, p4, v1, p2}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 61
    .line 62
    .line 63
    sget p1, LVa/p7;->B:I

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x73

    .line 66
    .line 67
    rem-int/lit16 p2, p1, 0x80

    .line 68
    .line 69
    sput p2, LVa/p7;->C:I

    .line 70
    .line 71
    rem-int/2addr p1, v0

    .line 72
    if-eqz p1, :cond_0

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    const/4 p1, 0x0

    .line 76
    throw p1

    .line 77
    :array_0
    .array-data 4
        -0x178ab784
        0x3b6f8db6
        0x1e5c360f
        0x36bb3ba2
        -0xcca879
        -0xd4f75ce
        -0xd2d4a27
        0x3e85d283
    .end array-data
.end method

.method public final a(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->B:I

    .line 8
    .line 9
    const v0, -0xd80cf82

    .line 10
    .line 11
    .line 12
    const v1, 0x7ceb1872

    .line 13
    .line 14
    .line 15
    const v2, -0x3aa8a8fb

    .line 16
    .line 17
    .line 18
    const v3, -0x3b7972a5

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, v1, v2, v3}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpl-float v1, v1, v2

    .line 31
    .line 32
    rsub-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v1, p0

    .line 44
    move-object v3, p1

    .line 45
    move-object v4, p2

    .line 46
    move-object v6, p3

    .line 47
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 48
    .line 49
    .line 50
    sget p1, LVa/p7;->B:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x41

    .line 53
    .line 54
    rem-int/lit16 p2, p1, 0x80

    .line 55
    .line 56
    sput p2, LVa/p7;->C:I

    .line 57
    .line 58
    rem-int/lit8 p1, p1, 0x2

    .line 59
    .line 60
    if-nez p1, :cond_0

    .line 61
    .line 62
    const/16 p1, 0x56

    .line 63
    .line 64
    div-int/lit8 p1, p1, 0x0

    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final g(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Landroid/app/Activity;)V
    .locals 9

    .line 1
    const/4 v0, 0x6

    .line 2
    sget v1, LVa/p7;->C:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x79

    .line 5
    .line 6
    rem-int/lit16 v2, v1, 0x80

    .line 7
    .line 8
    sput v2, LVa/p7;->B:I

    .line 9
    .line 10
    rem-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-array v0, v0, [I

    .line 17
    .line 18
    fill-array-data v0, :array_0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    rem-int/lit8 v1, v1, 0x3e

    .line 26
    .line 27
    shr-int v1, v2, v1

    .line 28
    .line 29
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v1, p0

    .line 38
    move-object v3, p1

    .line 39
    move-object v4, p2

    .line 40
    move-object v5, p3

    .line 41
    move-object v6, p4

    .line 42
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v3, p1

    .line 47
    move-object v4, p2

    .line 48
    move-object v5, p3

    .line 49
    move-object v6, p4

    .line 50
    new-array p1, v0, [I

    .line 51
    .line 52
    fill-array-data p1, :array_1

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    shr-int/lit8 p2, p2, 0x10

    .line 60
    .line 61
    sub-int/2addr v2, p2

    .line 62
    invoke-static {v2, p1}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    move-object v7, v5

    .line 71
    move-object v8, v6

    .line 72
    move-object v5, v3

    .line 73
    move-object v6, v4

    .line 74
    move-object v3, p0

    .line 75
    move-object v4, p1

    .line 76
    invoke-virtual/range {v3 .. v8}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget p1, LVa/p7;->C:I

    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x43

    .line 82
    .line 83
    rem-int/lit16 p2, p1, 0x80

    .line 84
    .line 85
    sput p2, LVa/p7;->B:I

    .line 86
    .line 87
    rem-int/lit8 p1, p1, 0x2

    .line 88
    .line 89
    if-nez p1, :cond_1

    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    const/4 p1, 0x0

    .line 93
    throw p1

    .line 94
    nop

    .line 95
    :array_0
    .array-data 4
        -0xd80cf82
        0x7ceb1872
        -0x66f317af
        0x186a6922
        -0x516c65f2
        -0x5c4b7e4f
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
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
    :array_1
    .array-data 4
        -0xd80cf82
        0x7ceb1872
        -0x66f317af
        0x186a6922
        -0x516c65f2
        -0x5c4b7e4f
    .end array-data
.end method

.method public final synthetic h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p7;->B:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/p7;->D(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public final i(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V
    .locals 12

    .line 1
    const/4 v0, 0x6

    .line 2
    sget v1, LVa/p7;->B:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x5d

    .line 5
    .line 6
    rem-int/lit16 v2, v1, 0x80

    .line 7
    .line 8
    sput v2, LVa/p7;->C:I

    .line 9
    .line 10
    rem-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-array v0, v0, [I

    .line 16
    .line 17
    fill-array-data v0, :array_0

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-static {v1, v3, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/high16 v2, 0x40000000    # 2.0f

    .line 28
    .line 29
    cmpl-float v1, v1, v2

    .line 30
    .line 31
    const/16 v2, 0x54

    .line 32
    .line 33
    ushr-int v1, v2, v1

    .line 34
    .line 35
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v1, p0

    .line 45
    move-object v3, p1

    .line 46
    move-object v4, p2

    .line 47
    move-object v6, p3

    .line 48
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v3, p1

    .line 53
    move-object v4, p2

    .line 54
    move-object v6, p3

    .line 55
    new-array p1, v0, [I

    .line 56
    .line 57
    fill-array-data p1, :array_1

    .line 58
    .line 59
    .line 60
    const/4 p2, 0x0

    .line 61
    invoke-static {p2, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    cmpl-float p2, p2, v2

    .line 66
    .line 67
    add-int/lit8 p2, p2, 0xc

    .line 68
    .line 69
    invoke-static {p2, p1}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const/4 v10, 0x0

    .line 78
    move-object v8, v3

    .line 79
    move-object v9, v4

    .line 80
    move-object v11, v6

    .line 81
    move-object v6, p0

    .line 82
    invoke-virtual/range {v6 .. v11}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    sget p1, LVa/p7;->B:I

    .line 86
    .line 87
    add-int/lit8 p1, p1, 0x2d

    .line 88
    .line 89
    rem-int/lit16 p2, p1, 0x80

    .line 90
    .line 91
    sput p2, LVa/p7;->C:I

    .line 92
    .line 93
    rem-int/lit8 p1, p1, 0x2

    .line 94
    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    const/4 p1, 0x0

    .line 99
    throw p1

    .line 100
    nop

    .line 101
    :array_0
    .array-data 4
        0x73d84dc6
        0x699325b2
        -0x39431c68
        0x24779056
        0x262f781a
        0x6710cd26
    .end array-data

    .line 102
    .line 103
    :array_1
    .array-data 4
        0x73d84dc6
        0x699325b2
        -0x39431c68
        0x24779056
        0x262f781a
        0x6710cd26
    .end array-data
.end method

.method public final synthetic k(Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;)V
    .locals 1

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->B:I

    .line 8
    .line 9
    check-cast p3, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LVa/p7;->a(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/p7;->C:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x7b

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/p7;->B:I

    .line 21
    .line 22
    return-void
.end method

.method public final synthetic m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget v0, LVa/p7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->C:I

    .line 8
    .line 9
    check-cast p2, Landroid/view/View;

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/p7;->i(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/p7;->B:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x33

    .line 19
    .line 20
    rem-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    sput p1, LVa/p7;->C:I

    .line 23
    .line 24
    return-void
.end method

.method public final synthetic n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/p7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x67

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p4, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/p7;->y(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public final synthetic r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget v0, LVa/p7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->C:I

    .line 8
    .line 9
    check-cast p3, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LVa/p7;->z(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/p7;->B:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x3d

    .line 17
    .line 18
    rem-int/lit16 p2, p1, 0x80

    .line 19
    .line 20
    sput p2, LVa/p7;->C:I

    .line 21
    .line 22
    rem-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public final synthetic s(Lorg/json/JSONObject;Ljava/lang/Object;LVa/e0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/p7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    check-cast p2, Landroid/view/View;

    .line 13
    .line 14
    check-cast p4, Landroid/app/Activity;

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/p7;->g(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Landroid/app/Activity;)V

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget p1, LVa/p7;->C:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x21

    .line 24
    .line 25
    rem-int/lit16 p2, p1, 0x80

    .line 26
    .line 27
    sput p2, LVa/p7;->B:I

    .line 28
    .line 29
    rem-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    throw v1

    .line 35
    :cond_1
    throw v1
.end method

.method public final synthetic v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p7;->B:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/p7;->K(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public final synthetic w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p7;->B:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p4, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/p7;->C(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget p1, LVa/p7;->C:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x29

    .line 21
    .line 22
    rem-int/lit16 p1, p1, 0x80

    .line 23
    .line 24
    sput p1, LVa/p7;->B:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public final y(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/p7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/p7;->B:I

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0xe

    .line 25
    .line 26
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v1, p0

    .line 35
    move-object v3, p1

    .line 36
    move-object v4, p2

    .line 37
    move-object v5, p3

    .line 38
    move-object v6, p4

    .line 39
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 40
    .line 41
    .line 42
    sget p1, LVa/p7;->C:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x29

    .line 45
    .line 46
    rem-int/lit16 p2, p1, 0x80

    .line 47
    .line 48
    sput p2, LVa/p7;->B:I

    .line 49
    .line 50
    rem-int/lit8 p1, p1, 0x2

    .line 51
    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    throw p1

    .line 57
    :array_0
    .array-data 4
        -0xd80cf82
        0x7ceb1872
        -0x66f317af
        0x186a6922
        -0x1d62609b
        0x1db299bb
        0x29b1c8ef
        0x54f1f74c
    .end array-data
.end method

.method public final z(Lorg/json/JSONObject;Landroid/view/View;Landroid/app/Activity;)V
    .locals 12

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    sget v1, LVa/p7;->C:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0xf

    .line 6
    .line 7
    rem-int/lit16 v2, v1, 0x80

    .line 8
    .line 9
    sput v2, LVa/p7;->B:I

    .line 10
    .line 11
    rem-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-array v0, v0, [I

    .line 17
    .line 18
    fill-array-data v0, :array_0

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x16

    .line 22
    .line 23
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/2addr v1, v2

    .line 28
    invoke-static {v1, v0}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v5, 0x0

    .line 37
    move-object v1, p0

    .line 38
    move-object v3, p1

    .line 39
    move-object v4, p2

    .line 40
    move-object v6, p3

    .line 41
    invoke-virtual/range {v1 .. v6}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v3, p1

    .line 46
    move-object v4, p2

    .line 47
    move-object v6, p3

    .line 48
    new-array p1, v0, [I

    .line 49
    .line 50
    fill-array-data p1, :array_1

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    add-int/lit8 p2, p2, 0x10

    .line 58
    .line 59
    invoke-static {p2, p1}, LVa/p7;->t(I[I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const/4 v10, 0x0

    .line 68
    move-object v8, v3

    .line 69
    move-object v9, v4

    .line 70
    move-object v11, v6

    .line 71
    move-object v6, p0

    .line 72
    invoke-virtual/range {v6 .. v11}, LVa/p7;->M(Ljava/lang/String;Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget p1, LVa/p7;->C:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x55

    .line 78
    .line 79
    rem-int/lit16 p2, p1, 0x80

    .line 80
    .line 81
    sput p2, LVa/p7;->B:I

    .line 82
    .line 83
    rem-int/lit8 p1, p1, 0x2

    .line 84
    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    const/4 p1, 0x0

    .line 89
    throw p1

    .line 90
    nop

    .line 91
    :array_0
    .array-data 4
        0x151c7efc
        -0x7dd72256
        -0x17584b37
        -0x688e5887
        0x617fb2cc
        0x7c772393
        0x3374b3e8
        0x59c3d665
    .end array-data

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_1
    .array-data 4
        0x151c7efc
        -0x7dd72256
        -0x17584b37
        -0x688e5887
        0x617fb2cc
        0x7c772393
        0x3374b3e8
        0x59c3d665
    .end array-data
.end method
