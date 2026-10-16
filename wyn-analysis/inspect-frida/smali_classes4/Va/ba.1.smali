.class public final LVa/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[B

.field public static final e:[B

.field public static f:I = 0x0

.field public static g:I = 0x0

.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x84

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/ba;->e:[B

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/ba;->d:[B

    .line 18
    .line 19
    const/16 v0, 0x3b

    .line 20
    .line 21
    sput v0, LVa/ba;->g:I

    .line 22
    .line 23
    return-void

    .line 24
    nop

    :array_0
    .array-data 1
        0x1t
        0x15t
        -0x16t
        0x1t
        -0x1t
        0x16t
        -0x26t
        0xet
        0x4t
        -0x13t
        0xbt
        0x7t
        0xct
        0x1t
        0x3t
        -0x12t
        -0xat
        0xdt
        0x0t
        -0x7t
        -0xbt
        0xbt
        -0xct
        0xbt
        -0xet
        0x12t
        0x3t
        -0xet
        0xet
        0x4t
        0x12t
        -0x54t
        0x6t
        0x9t
        -0x8t
        -0x1t
        -0x1t
        -0x3t
        0x9t
        -0xdt
        0x8t
        0x9t
        0x45t
        -0x44t
        -0x5t
        -0x3t
        0xbt
        -0x15t
        0x8t
        0x25t
        0x4bt
        0x4t
        -0x45t
        0x3t
        -0x5t
        0x13t
        -0x2t
        -0x10t
        -0x2t
        0xft
        0x4t
        0x13t
        -0x4t
        0xet
        0x4t
        0x13t
        -0x3et
        0x3t
        -0xbt
        -0x1t
        0x47t
        -0x39t
        -0x7t
        0x5t
        -0x3t
        0x0t
        0x3t
        0x7t
        0x34t
        -0x33t
        -0xbt
        -0x1t
        -0x2t
        0x0t
        -0x4t
        0x45t
        -0x3ft
        -0x2t
        0xct
        0x11t
        -0x50t
        0x14t
        -0x6t
        0x4bt
        -0x52t
        0x3t
        0x4ft
        -0x41t
        -0x13t
        0x13t
        -0x3t
        0x44t
        -0x44t
        -0x5t
        -0x3t
        0xbt
        -0x15t
        0x8t
        0x5t
        0x41t
        0x8t
        -0x44t
        -0xat
        -0x7t
        0x6t
        0x9t
        0x46t
        -0x54t
        0x5t
        0x1t
        0x4et
        -0x52t
        0xdt
        0x1t
        0x3t
        -0x4t
        0x1dt
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x10t
        0x4at
        0x47t
        -0x50t
        0x20t
        0x65t
        -0x2ft
        0x48t
        0x75t
        -0xet
        0x0t
        -0x1dt
        0x46t
        0x41t
        -0xct
        0x4at
    .end array-data
.end method

.method public static synthetic b(LVa/ba;)Ljava/util/HashMap;
    .locals 2

    .line 1
    sget v0, LVa/ba;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ba;->i:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/HashMap;

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x63

    .line 14
    .line 15
    rem-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    sput v1, LVa/ba;->h:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/16 v0, 0x36

    .line 24
    .line 25
    div-int/lit8 v0, v0, 0x0

    .line 26
    .line 27
    :cond_0
    return-object p0
.end method

.method public static c(Ljava/lang/Class;LA/x;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget-object v0, p1, LA/x;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/ea;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v1, v0, LVa/ca;->K:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v0, v0, LVa/ca;->L:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v1, v0, v2}, LVa/ba;->i(Ljava/lang/Class;ZILjava/util/List;)[Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    array-length v0, p0

    .line 29
    const/4 v1, 0x0

    .line 30
    move v2, v1

    .line 31
    :goto_1
    if-ge v2, v0, :cond_7

    .line 32
    .line 33
    aget-object v3, p0, v2

    .line 34
    .line 35
    iget-object v4, p1, LA/x;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, LVa/ea;

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iget-object v6, p1, LA/x;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, LVa/ea;

    .line 49
    .line 50
    iget v6, v6, LVa/ca;->M:I

    .line 51
    .line 52
    and-int/2addr v4, v6

    .line 53
    if-ne v4, v6, :cond_5

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget-object v6, p1, LA/x;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v6, LVa/ea;

    .line 62
    .line 63
    iget v7, v6, LVa/ca;->N:I

    .line 64
    .line 65
    and-int/2addr v4, v7

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_1
    iget-object v4, v6, LVa/ea;->R:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    iget-object v4, p1, LA/x;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, LVa/ea;

    .line 85
    .line 86
    iget-boolean v6, v4, LVa/ea;->Q:Z

    .line 87
    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v6, p1, LA/x;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, LVa/ea;

    .line 97
    .line 98
    iget-object v6, v6, LVa/ea;->O:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    iget-object v4, v4, LVa/ea;->O:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v4, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    :goto_2
    if-eqz v4, :cond_5

    .line 116
    .line 117
    iget v4, p1, LA/x;->b:I

    .line 118
    .line 119
    if-nez v4, :cond_4

    .line 120
    .line 121
    move v4, v5

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 124
    .line 125
    iput v4, p1, LA/x;->b:I

    .line 126
    .line 127
    :cond_5
    :goto_3
    move v4, v1

    .line 128
    :goto_4
    if-eqz v4, :cond_6

    .line 129
    .line 130
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    return-void
.end method

.method public static f(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/ba;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ba;->i:I

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    rsub-int/lit8 v2, v2, 0xe

    .line 20
    .line 21
    const-string v3, "\u5473\uc962\ua0cf\u4819\ub70b\ud972\u62a9\udc58\u8963\u566a\u6ed6\u63b1\uadc7\u3a03"

    .line 22
    .line 23
    invoke-static {v2, v3}, LVa/ba;->n(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {v1, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    cmpl-float v2, v3, v2

    .line 44
    .line 45
    rsub-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    const-string v3, "\u467a\uc1a2"

    .line 48
    .line 49
    invoke-static {v2, v3}, LVa/ba;->n(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    rsub-int/lit8 v2, v2, 0xe

    .line 65
    .line 66
    const-string v3, "\ufb6c\ud11a\u565f\u36f3\ub09a\ucad1\u569d\u63d7\u366f\u6aa3\ubcda\ucfae\u37c7\u0a9a"

    .line 67
    .line 68
    invoke-static {v2, v3}, LVa/ba;->n(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    add-int/lit8 v2, v2, 0xd

    .line 88
    .line 89
    const-string v3, "\u569d\u63d7\ufeb9\ucfa1\u05bc\u8133\u795e\u3eb1\u4b86\u855a\u460b\uc39b\u8a70\ubf6c"

    .line 90
    .line 91
    invoke-static {v2, v3}, LVa/ba;->n(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, ""

    .line 107
    .line 108
    const/16 v3, 0x30

    .line 109
    .line 110
    invoke-static {v2, v3, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    rsub-int/lit8 v2, v2, 0xe

    .line 115
    .line 116
    const-string v3, "\ufb6c\ud11a\u3386\u3b38\ufeb9\ucfa1\u05bc\u8133\u795e\u3eb1\u4b86\u855a\u460b\uc39b\u8a70\ubf6c"

    .line 117
    .line 118
    invoke-static {v2, v3}, LVa/ba;->n(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    sget v0, LVa/ba;->h:I

    .line 138
    .line 139
    add-int/lit8 v0, v0, 0x65

    .line 140
    .line 141
    rem-int/lit16 v2, v0, 0x80

    .line 142
    .line 143
    sput v2, LVa/ba;->i:I

    .line 144
    .line 145
    rem-int/lit8 v0, v0, 0x2

    .line 146
    .line 147
    if-nez v0, :cond_0

    .line 148
    .line 149
    const/16 v0, 0x3f

    .line 150
    .line 151
    div-int/2addr v0, v1

    .line 152
    :cond_0
    add-int/lit8 v2, v2, 0x71

    .line 153
    .line 154
    rem-int/lit16 v0, v2, 0x80

    .line 155
    .line 156
    sput v0, LVa/ba;->h:I

    .line 157
    .line 158
    rem-int/lit8 v2, v2, 0x2

    .line 159
    .line 160
    if-nez v2, :cond_1

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_1
    const/4 p0, 0x0

    .line 164
    throw p0
.end method

.method public static i(Ljava/lang/Class;ZILjava/util/List;)[Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p3}, LVa/ub;->g(Ljava/lang/Class;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    new-array v0, p3, [Ljava/lang/reflect/Field;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    new-array v0, p3, [Ljava/lang/reflect/Field;

    .line 20
    .line 21
    new-array v1, p3, [Ljava/lang/reflect/Field;

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :catch_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    .line 31
    :catch_1
    invoke-static {v0, v1}, LVa/ub;->f([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_1
    if-eqz p0, :cond_2

    .line 43
    .line 44
    if-eq p3, p2, :cond_2

    .line 45
    .line 46
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {v0, p1}, LVa/ub;->f([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_2

    .line 54
    :catch_2
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, p1}, LVa/ub;->f([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3

    .line 62
    move-object v0, p1

    .line 63
    :catch_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    add-int/lit8 p3, p3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    return-object v0
.end method

.method public static l(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xcdb7

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    const v11, 0xd888

    .line 59
    .line 60
    .line 61
    add-int/2addr v10, v11

    .line 62
    xor-int/2addr v9, v10

    .line 63
    sub-int/2addr v7, v9

    .line 64
    int-to-char v7, v7

    .line 65
    aput-char v7, v3, v5

    .line 66
    .line 67
    add-int v9, v7, v4

    .line 68
    .line 69
    shl-int/lit8 v10, v7, 0x4

    .line 70
    .line 71
    add-int/lit16 v10, v10, 0xa53

    .line 72
    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0xa543

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p0

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method

.method public static synthetic m(LVa/ba;)Ljava/util/HashMap;
    .locals 2

    .line 1
    sget v0, LVa/ba;->i:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/ba;->h:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/HashMap;

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x15

    .line 14
    .line 15
    rem-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    sput v1, LVa/ba;->h:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public static n(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0x9bc8

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    const v11, 0xfcae

    .line 59
    .line 60
    .line 61
    add-int/2addr v10, v11

    .line 62
    xor-int/2addr v9, v10

    .line 63
    sub-int/2addr v7, v9

    .line 64
    int-to-char v7, v7

    .line 65
    aput-char v7, v3, v5

    .line 66
    .line 67
    add-int v9, v7, v4

    .line 68
    .line 69
    shl-int/lit8 v10, v7, 0x4

    .line 70
    .line 71
    const v11, 0xf416

    .line 72
    .line 73
    .line 74
    add-int/2addr v10, v11

    .line 75
    xor-int/2addr v9, v10

    .line 76
    ushr-int/lit8 v7, v7, 0x5

    .line 77
    .line 78
    add-int/lit16 v7, v7, 0x4760

    .line 79
    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p1

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method

.method public static o(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x7e

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, -0x1

    .line 13
    if-ne p1, v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-eqz v3, :cond_1

    .line 19
    .line 20
    sget-object p1, LVa/ba;->e:[B

    .line 21
    .line 22
    const v4, 0x7d7e229e

    .line 23
    .line 24
    .line 25
    add-int/2addr v4, p4

    .line 26
    aget-byte p1, p1, v4

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x7e

    .line 29
    .line 30
    int-to-byte p1, p1

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :goto_1
    if-lez p1, :cond_2

    .line 35
    .line 36
    add-int/2addr p4, p1

    .line 37
    const v4, -0x7d7e229c

    .line 38
    .line 39
    .line 40
    sub-int/2addr p4, v4

    .line 41
    add-int/2addr p4, v3

    .line 42
    sput p4, LVa/pb;->F:I

    .line 43
    .line 44
    sput-byte p2, LVa/pb;->G:B

    .line 45
    .line 46
    const p2, 0xcdba0e

    .line 47
    .line 48
    .line 49
    add-int/2addr p0, p2

    .line 50
    int-to-char p0, p0

    .line 51
    sput-char p0, LVa/pb;->H:C

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-char p0, LVa/pb;->H:C

    .line 57
    .line 58
    sput-char p0, LVa/pb;->I:C

    .line 59
    .line 60
    sput v2, LVa/pb;->E:I

    .line 61
    .line 62
    :goto_2
    sget p0, LVa/pb;->E:I

    .line 63
    .line 64
    if-ge p0, p1, :cond_2

    .line 65
    .line 66
    sget-object p0, LVa/ba;->e:[B

    .line 67
    .line 68
    sget p2, LVa/pb;->F:I

    .line 69
    .line 70
    add-int/lit8 p4, p2, -0x1

    .line 71
    .line 72
    sput p4, LVa/pb;->F:I

    .line 73
    .line 74
    aget-byte p0, p0, p2

    .line 75
    .line 76
    sget-char p2, LVa/pb;->I:C

    .line 77
    .line 78
    add-int/2addr p0, p3

    .line 79
    int-to-byte p0, p0

    .line 80
    sget-byte p4, LVa/pb;->G:B

    .line 81
    .line 82
    xor-int/2addr p0, p4

    .line 83
    add-int/2addr p2, p0

    .line 84
    int-to-char p0, p2

    .line 85
    sput-char p0, LVa/pb;->H:C

    .line 86
    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    sget-char p0, LVa/pb;->H:C

    .line 91
    .line 92
    sput-char p0, LVa/pb;->I:C

    .line 93
    .line 94
    sget p0, LVa/pb;->E:I

    .line 95
    .line 96
    add-int/2addr p0, v2

    .line 97
    sput p0, LVa/pb;->E:I

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    return-object p0

    .line 106
    :goto_3
    monitor-exit v0

    .line 107
    throw p0
.end method

.method public static synthetic q(LVa/ba;)Ljava/util/HashMap;
    .locals 2

    .line 1
    sget v0, LVa/ba;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ba;->h:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/HashMap;

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x2f

    .line 14
    .line 15
    rem-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    sput v1, LVa/ba;->i:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    const-class v0, LVa/pb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LVa/ea;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, LVa/ea;

    .line 11
    .line 12
    invoke-direct {v1}, LVa/ea;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object v1, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LVa/ea;

    .line 23
    .line 24
    iput-object p2, v1, LVa/ea;->O:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, LVa/ba;->p(Ljava/lang/Class;LVa/ea;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    return-object p1

    .line 32
    :goto_1
    monitor-exit v0

    .line 33
    throw p1
.end method

.method public d(Lorg/json/JSONObject;LVa/s7;)V
    .locals 1

    .line 1
    sget v0, LVa/ba;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ba;->i:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, p2, v0}, LVa/ba;->r(Lorg/json/JSONObject;LVa/s7;LVa/ha;)V

    .line 11
    .line 12
    .line 13
    sget p1, LVa/ba;->h:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x61

    .line 16
    .line 17
    rem-int/lit16 p2, p1, 0x80

    .line 18
    .line 19
    sput p2, LVa/ba;->i:I

    .line 20
    .line 21
    rem-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    throw v0
.end method

.method public declared-synchronized e(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/ba;->f:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x37

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/ba;->g:I

    .line 9
    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget p1, LVa/ba;->f:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x31

    .line 20
    .line 21
    rem-int/lit16 v0, p1, 0x80

    .line 22
    .line 23
    sput v0, LVa/ba;->g:I

    .line 24
    .line 25
    rem-int/lit8 p1, p1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    const/16 p1, 0x57

    .line 30
    .line 31
    :try_start_1
    div-int/2addr p1, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :goto_0
    monitor-exit p0

    .line 39
    const/4 p1, 0x0

    .line 40
    return-object p1

    .line 41
    :cond_1
    const/16 v0, 0x30

    .line 42
    .line 43
    :try_start_3
    new-instance v2, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljavax/crypto/Cipher;

    .line 48
    .line 49
    invoke-static {p1}, LVa/pb;->R(Ljava/lang/String;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v3, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "\ud78c\u5e06\ufad1\uba88\ude7c\u974b"

    .line 58
    .line 59
    const-string v5, ""

    .line 60
    .line 61
    invoke-static {v5, v0, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    rsub-int/lit8 v5, v5, 0x4

    .line 66
    .line 67
    invoke-static {v4, v5}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    shr-int/lit8 v3, v3, 0x8

    .line 83
    .line 84
    int-to-short v3, v3

    .line 85
    const-string v4, ""

    .line 86
    .line 87
    const-string v5, ""

    .line 88
    .line 89
    invoke-static {v4, v5, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    const v5, -0xcdb9ab

    .line 94
    .line 95
    .line 96
    sub-int/2addr v5, v4

    .line 97
    const-string v4, ""

    .line 98
    .line 99
    invoke-static {v4, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    add-int/lit8 v4, v4, -0x56

    .line 104
    .line 105
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    const v7, -0x7d7e226c

    .line 110
    .line 111
    .line 112
    sub-int v6, v7, v6

    .line 113
    .line 114
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    shr-int/lit8 v8, v8, 0x10

    .line 119
    .line 120
    int-to-byte v8, v8

    .line 121
    invoke-static {v5, v4, v8, v3, v6}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_2

    .line 134
    .line 135
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    shr-int/lit8 v3, v3, 0x10

    .line 140
    .line 141
    int-to-short v3, v3

    .line 142
    const-string v4, ""

    .line 143
    .line 144
    invoke-static {v4, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    const v5, -0xcdb9ac

    .line 149
    .line 150
    .line 151
    sub-int/2addr v5, v4

    .line 152
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    rsub-int/lit8 v4, v4, -0x56

    .line 157
    .line 158
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    shr-int/lit8 v6, v6, 0x10

    .line 163
    .line 164
    add-int/2addr v6, v7

    .line 165
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    int-to-byte v1, v1

    .line 170
    invoke-static {v5, v4, v1, v3, v6}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1
    :try_end_3
    .catch LVa/oa; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 190
    monitor-exit p0

    .line 191
    return-object p1

    .line 192
    :catch_0
    move-exception p1

    .line 193
    goto :goto_1

    .line 194
    :catch_1
    move-exception v1

    .line 195
    goto :goto_2

    .line 196
    :catch_2
    move-exception v0

    .line 197
    goto/16 :goto_3

    .line 198
    .line 199
    :catch_3
    move-exception v0

    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :cond_2
    :try_start_4
    new-instance v1, LVa/pa;

    .line 203
    .line 204
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    shr-int/lit8 v3, v3, 0x18

    .line 214
    .line 215
    int-to-short v3, v3

    .line 216
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    shr-int/lit8 v4, v4, 0x8

    .line 221
    .line 222
    const v5, -0xcdb9c6

    .line 223
    .line 224
    .line 225
    sub-int/2addr v5, v4

    .line 226
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    shr-int/lit8 v4, v4, 0x10

    .line 231
    .line 232
    rsub-int/lit8 v4, v4, -0x57

    .line 233
    .line 234
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    shr-int/lit8 v6, v6, 0x10

    .line 239
    .line 240
    const v7, -0x7d7e2245

    .line 241
    .line 242
    .line 243
    sub-int/2addr v7, v6

    .line 244
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    int-to-byte v6, v6

    .line 249
    rsub-int/lit8 v6, v6, -0x1

    .line 250
    .line 251
    int-to-byte v6, v6

    .line 252
    invoke-static {v5, v4, v6, v3, v7}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1
    :try_end_4
    .catch LVa/oa; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 274
    :goto_1
    :try_start_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 275
    .line 276
    const-string v1, "\ua280\u2732\u9cbd\uccf1\uf9d8\u71b9\u5c6f\udf03\ue6c5\u5cfe\u186d\u4320\u56dd\u4526\u5014\udaf5\ue6c5\u5cfe\uea27\u16ba"

    .line 277
    .line 278
    const-string v2, ""

    .line 279
    .line 280
    const-string v3, ""

    .line 281
    .line 282
    invoke-static {v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    add-int/lit8 v2, v2, 0x13

    .line 287
    .line 288
    invoke-static {v1, v2}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :goto_2
    invoke-virtual {p0}, LVa/ba;->g()V

    .line 301
    .line 302
    .line 303
    new-instance v2, LVa/pa;

    .line 304
    .line 305
    new-instance v3, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v1, "\u010e\u4fc2"

    .line 318
    .line 319
    const-string v4, ""

    .line 320
    .line 321
    invoke-static {v4, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    neg-int v0, v0

    .line 326
    invoke-static {v1, v0}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v2

    .line 348
    :goto_3
    invoke-virtual {p0}, LVa/ba;->g()V

    .line 349
    .line 350
    .line 351
    new-instance v1, LVa/pa;

    .line 352
    .line 353
    new-instance v2, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v0, "\u010e\u4fc2"

    .line 366
    .line 367
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    shr-int/lit8 v3, v3, 0x10

    .line 372
    .line 373
    add-int/lit8 v3, v3, 0x1

    .line 374
    .line 375
    invoke-static {v0, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v1

    .line 397
    :goto_4
    invoke-virtual {p0}, LVa/ba;->g()V

    .line 398
    .line 399
    .line 400
    new-instance v1, LVa/pa;

    .line 401
    .line 402
    new-instance v2, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string v0, "\u010e\u4fc2"

    .line 415
    .line 416
    const-wide/16 v3, 0x0

    .line 417
    .line 418
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    rsub-int/lit8 v3, v3, 0x1

    .line 423
    .line 424
    invoke-static {v0, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :goto_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 447
    throw p1
.end method

.method public g()V
    .locals 9

    .line 1
    iget-object v0, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 4
    .line 5
    const-string v1, "\u8d77\u25ef\u0451\udd62\u3a2c\u5289\uf198\ud631\ub9b0\ub70a\uf956\ua06a\u8783\ua9ef\ueb7f\uffe5\u29a3\u7b0a\u9830\ua2fb"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    add-int/lit8 v3, v3, 0x14

    .line 13
    .line 14
    invoke-static {v1, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iput-object v3, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    .line 29
    .line 30
    sget-object v5, LVa/ba;->d:[B

    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    invoke-virtual {v3, v6, v0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/lit8 v3, v3, 0x14

    .line 44
    .line 45
    invoke-static {v1, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, LVa/ba;->b:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 60
    .line 61
    invoke-direct {v3, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 62
    .line 63
    .line 64
    const/4 v4, 0x2

    .line 65
    invoke-virtual {v1, v4, v0, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    sget v0, LVa/ba;->g:I

    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x77

    .line 71
    .line 72
    rem-int/lit16 v1, v0, 0x80

    .line 73
    .line 74
    sput v1, LVa/ba;->f:I

    .line 75
    .line 76
    rem-int/2addr v0, v4

    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    const/4 v0, 0x0

    .line 81
    throw v0

    .line 82
    :catch_0
    move-exception v0

    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    .line 84
    .line 85
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    shr-int/lit8 v3, v3, 0x16

    .line 90
    .line 91
    int-to-short v3, v3

    .line 92
    const-string v4, ""

    .line 93
    .line 94
    invoke-static {v4, v4, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    const v6, -0xcdb9c5

    .line 99
    .line 100
    .line 101
    add-int/2addr v5, v6

    .line 102
    const/16 v6, 0x30

    .line 103
    .line 104
    invoke-static {v4, v6, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    add-int/lit8 v7, v7, -0x68

    .line 109
    .line 110
    const v8, -0x7d7e2281

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    sub-int/2addr v8, v4

    .line 118
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    int-to-byte v2, v2

    .line 123
    invoke-static {v5, v7, v2, v3, v8}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v1
.end method

.method public h(Ljava/lang/Class;LVa/ea;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    const-class v0, LVa/ba;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LA/x;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, LA/x;

    .line 11
    .line 12
    const/16 v2, 0xb

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, v2, v3}, LA/x;-><init>(IC)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v1, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, LA/x;

    .line 26
    .line 27
    iput-object p2, v1, LA/x;->c:Ljava/lang/Object;

    .line 28
    .line 29
    iget p2, p2, LVa/ea;->P:I

    .line 30
    .line 31
    iput p2, v1, LA/x;->b:I

    .line 32
    .line 33
    invoke-static {p1, v1, p3}, LVa/ba;->c(Ljava/lang/Class;LA/x;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    return-void

    .line 38
    :goto_1
    monitor-exit v0

    .line 39
    throw p1
.end method

.method public j()V
    .locals 2

    .line 1
    new-instance v0, LVa/Nb;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LVa/Nb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Nb;->d:LVa/ba;

    .line 8
    .line 9
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 10
    .line 11
    .line 12
    sget v0, LVa/ba;->h:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x4d

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    sput v0, LVa/ba;->i:I

    .line 19
    .line 20
    return-void
.end method

.method public declared-synchronized k(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/ba;->g:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x23

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/ba;->f:I

    .line 9
    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    :try_start_1
    iget-object v0, p0, LVa/ba;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljavax/crypto/Cipher;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-short v3, v3

    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    shr-int/lit8 v4, v4, 0x10

    .line 37
    .line 38
    const v5, -0xcdb9ab

    .line 39
    .line 40
    .line 41
    sub-int/2addr v5, v4

    .line 42
    const-string v4, ""

    .line 43
    .line 44
    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/lit8 v4, v4, -0x56

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    cmp-long v6, v6, v8

    .line 57
    .line 58
    const v7, -0x7d7e226b

    .line 59
    .line 60
    .line 61
    sub-int/2addr v7, v6

    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    shr-int/lit8 v6, v6, 0x10

    .line 67
    .line 68
    int-to-byte v6, v6

    .line 69
    invoke-static {v5, v4, v6, v3, v7}, LVa/ba;->o(IIBSI)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v1, "\ud78c\u5e06\ufad1\uba88\ude7c\u974b"

    .line 88
    .line 89
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    shr-int/lit8 v3, v3, 0x10

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x5

    .line 96
    .line 97
    invoke-static {v1, v3}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, LVa/pb;->Z([B)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    monitor-exit p0

    .line 118
    return-object p1

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    goto :goto_3

    .line 121
    :catch_0
    move-exception p1

    .line 122
    goto :goto_0

    .line 123
    :catch_1
    move-exception p1

    .line 124
    goto :goto_1

    .line 125
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LVa/ba;->g()V

    .line 126
    .line 127
    .line 128
    new-instance v0, Ljava/lang/RuntimeException;

    .line 129
    .line 130
    const-string v1, "\ua280\u2732\u9cbd\uccf1\uf9d8\u71b9\u5c6f\udf03\ue6c5\u5cfe\u186d\u4320\u56dd\u4526\u5014\udaf5\ue6c5\u5cfe\uea27\u16ba"

    .line 131
    .line 132
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    const/4 v3, 0x0

    .line 137
    cmpl-float v2, v2, v3

    .line 138
    .line 139
    rsub-int/lit8 v2, v2, 0x13

    .line 140
    .line 141
    invoke-static {v1, v2}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :goto_1
    invoke-virtual {p0}, LVa/ba;->g()V

    .line 154
    .line 155
    .line 156
    new-instance v0, Ljava/lang/RuntimeException;

    .line 157
    .line 158
    const-string v1, "\ua280\u2732\u9cbd\uccf1\uf9d8\u71b9\u5c6f\udf03\ue6c5\u5cfe\u186d\u4320\u56dd\u4526\u5014\udaf5\ue6c5\u5cfe\uea27\u16ba"

    .line 159
    .line 160
    const-string v2, ""

    .line 161
    .line 162
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    rsub-int/lit8 v2, v2, 0x13

    .line 167
    .line 168
    invoke-static {v1, v2}, LVa/ba;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_0
    sget v0, LVa/ba;->g:I

    .line 181
    .line 182
    add-int/lit8 v0, v0, 0x7

    .line 183
    .line 184
    rem-int/lit16 v1, v0, 0x80

    .line 185
    .line 186
    sput v1, LVa/ba;->f:I

    .line 187
    .line 188
    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    .line 190
    if-eqz v0, :cond_1

    .line 191
    .line 192
    const/16 v0, 0x32

    .line 193
    .line 194
    :try_start_3
    div-int/2addr v0, v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 195
    goto :goto_2

    .line 196
    :catchall_1
    move-exception p1

    .line 197
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    :cond_1
    :goto_2
    monitor-exit p0

    .line 199
    return-object p1

    .line 200
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 201
    throw p1
.end method

.method public p(Ljava/lang/Class;LVa/ea;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    const-class v0, LVa/pb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-object v1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2, v1}, LVa/ba;->h(Ljava/lang/Class;LVa/ea;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, LVa/ba;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/reflect/Field;

    .line 54
    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    return-object p1

    .line 57
    :cond_1
    monitor-exit v0

    .line 58
    const/4 p1, 0x0

    .line 59
    return-object p1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p1
.end method

.method public r(Lorg/json/JSONObject;LVa/s7;LVa/ha;)V
    .locals 2

    .line 1
    new-instance v0, LVa/O;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LVa/O;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/O;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, v0, LVa/O;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p2, v0, LVa/O;->f:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 16
    .line 17
    .line 18
    sget p1, LVa/ba;->i:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0xf

    .line 21
    .line 22
    rem-int/lit16 p2, p1, 0x80

    .line 23
    .line 24
    sput p2, LVa/ba;->h:I

    .line 25
    .line 26
    rem-int/lit8 p1, p1, 0x2

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/16 p1, 0x1f

    .line 31
    .line 32
    div-int/lit8 p1, p1, 0x0

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    new-instance v0, LVa/Nb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/Nb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Nb;->d:LVa/ba;

    .line 8
    .line 9
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 10
    .line 11
    .line 12
    sget v0, LVa/ba;->h:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x7

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/ba;->i:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    throw v0
.end method
