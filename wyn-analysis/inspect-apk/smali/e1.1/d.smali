.class public final Le1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public final d:F


# direct methods
.method public constructor <init>(FIJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Le1/d;->b:J

    .line 5
    .line 6
    iput p2, p0, Le1/d;->a:I

    .line 7
    .line 8
    iput-wide p5, p0, Le1/d;->c:J

    .line 9
    .line 10
    iput p1, p0, Le1/d;->d:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/location/LocationRequest;
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x1

    .line 6
    iget-wide v5, p0, Le1/d;->b:J

    .line 7
    .line 8
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v8, 0x1f

    .line 11
    .line 12
    if-lt v7, v8, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Le1/a;->c(Le1/d;)Landroid/location/LocationRequest;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 v7, 0x0

    .line 20
    :try_start_0
    sget-object v8, LA6/c;->a:Ljava/lang/Class;

    .line 21
    .line 22
    if-nez v8, :cond_1

    .line 23
    .line 24
    const-string v8, "android.location.LocationRequest"

    .line 25
    .line 26
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    sput-object v8, LA6/c;->a:Ljava/lang/Class;

    .line 31
    .line 32
    :cond_1
    sget-object v8, LA6/c;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-nez v8, :cond_2

    .line 37
    .line 38
    :try_start_1
    sget-object v8, LA6/c;->a:Ljava/lang/Class;

    .line 39
    .line 40
    const-string v10, "createFromDeprecatedProvider"

    .line 41
    .line 42
    new-array v11, v2, [Ljava/lang/Class;

    .line 43
    .line 44
    const-class v12, Ljava/lang/String;

    .line 45
    .line 46
    aput-object v12, v11, v3

    .line 47
    .line 48
    aput-object v9, v11, v4

    .line 49
    .line 50
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    aput-object v12, v11, v1

    .line 53
    .line 54
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    aput-object v12, v11, v0

    .line 57
    .line 58
    invoke-virtual {v8, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    sput-object v8, LA6/c;->b:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    invoke-virtual {v8, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    .line 66
    .line 67
    :cond_2
    sget-object v8, LA6/c;->b:Ljava/lang/reflect/Method;

    .line 68
    .line 69
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iget v11, p0, Le1/d;->d:F

    .line 74
    .line 75
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    .line 80
    .line 81
    aput-object p1, v2, v3

    .line 82
    .line 83
    aput-object v10, v2, v4

    .line 84
    .line 85
    aput-object v11, v2, v1

    .line 86
    .line 87
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    aput-object p1, v2, v0

    .line 90
    .line 91
    invoke-virtual {v8, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    sget-object v0, LA6/c;->c:Ljava/lang/reflect/Method;

    .line 99
    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    sget-object v0, LA6/c;->a:Ljava/lang/Class;

    .line 103
    .line 104
    const-string v1, "setQuality"

    .line 105
    .line 106
    new-array v2, v4, [Ljava/lang/Class;

    .line 107
    .line 108
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    aput-object v8, v2, v3

    .line 111
    .line 112
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sput-object v0, LA6/c;->c:Ljava/lang/reflect/Method;

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    .line 120
    .line 121
    :cond_4
    sget-object v0, LA6/c;->c:Ljava/lang/reflect/Method;

    .line 122
    .line 123
    iget v1, p0, Le1/d;->a:I

    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-array v2, v4, [Ljava/lang/Object;

    .line 130
    .line 131
    aput-object v1, v2, v3

    .line 132
    .line 133
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    sget-object v0, LA6/c;->d:Ljava/lang/reflect/Method;

    .line 137
    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    sget-object v0, LA6/c;->a:Ljava/lang/Class;

    .line 141
    .line 142
    const-string v1, "setFastestInterval"

    .line 143
    .line 144
    new-array v2, v4, [Ljava/lang/Class;

    .line 145
    .line 146
    aput-object v9, v2, v3

    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sput-object v0, LA6/c;->d:Ljava/lang/reflect/Method;

    .line 153
    .line 154
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 155
    .line 156
    .line 157
    :cond_5
    sget-object v0, LA6/c;->d:Ljava/lang/reflect/Method;

    .line 158
    .line 159
    iget-wide v1, p0, Le1/d;->c:J

    .line 160
    .line 161
    const-wide/16 v8, -0x1

    .line 162
    .line 163
    cmp-long v8, v1, v8

    .line 164
    .line 165
    if-nez v8, :cond_6

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_6
    move-wide v5, v1

    .line 169
    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    new-array v2, v4, [Ljava/lang/Object;

    .line 174
    .line 175
    aput-object v1, v2, v3

    .line 176
    .line 177
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 178
    .line 179
    .line 180
    move-object v7, p1

    .line 181
    :catch_0
    :goto_1
    invoke-static {v7}, Le1/c;->d(Ljava/lang/Object;)Landroid/location/LocationRequest;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Le1/d;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Le1/d;

    .line 11
    .line 12
    iget v1, p1, Le1/d;->a:I

    .line 13
    .line 14
    iget v2, p0, Le1/d;->a:I

    .line 15
    .line 16
    if-ne v2, v1, :cond_2

    .line 17
    .line 18
    iget-wide v1, p0, Le1/d;->b:J

    .line 19
    .line 20
    iget-wide v3, p1, Le1/d;->b:J

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    iget-wide v1, p0, Le1/d;->c:J

    .line 27
    .line 28
    iget-wide v3, p1, Le1/d;->c:J

    .line 29
    .line 30
    cmp-long v1, v1, v3

    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    iget p1, p1, Le1/d;->d:F

    .line 35
    .line 36
    iget v1, p0, Le1/d;->d:F

    .line 37
    .line 38
    invoke-static {p1, v1}, Ljava/lang/Float;->compare(FF)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    return v0

    .line 45
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Le1/d;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-wide v1, p0, Le1/d;->b:J

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    ushr-long v4, v1, v3

    .line 10
    .line 11
    xor-long/2addr v1, v4

    .line 12
    long-to-int v1, v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget-wide v1, p0, Le1/d;->c:J

    .line 17
    .line 18
    ushr-long v3, v1, v3

    .line 19
    .line 20
    xor-long/2addr v1, v3

    .line 21
    long-to-int v1, v1

    .line 22
    add-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "Request["

    .line 2
    .line 3
    invoke-static {v0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide v1, 0x7fffffffffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iget-wide v3, p0, Le1/d;->b:J

    .line 13
    .line 14
    cmp-long v1, v3, v1

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    const-string v1, "@"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v4, v0}, Lj1/d;->e(JLjava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x64

    .line 27
    .line 28
    iget v2, p0, Le1/d;->a:I

    .line 29
    .line 30
    if-eq v2, v1, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x66

    .line 33
    .line 34
    if-eq v2, v1, :cond_1

    .line 35
    .line 36
    const/16 v1, 0x68

    .line 37
    .line 38
    if-eq v2, v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v1, " LOW_POWER"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string v1, " BALANCED"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string v1, " HIGH_ACCURACY"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const-string v1, "PASSIVE"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-wide v1, p0, Le1/d;->c:J

    .line 65
    .line 66
    const-wide/16 v5, -0x1

    .line 67
    .line 68
    cmp-long v5, v1, v5

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    cmp-long v5, v1, v3

    .line 73
    .line 74
    if-gez v5, :cond_4

    .line 75
    .line 76
    const-string v5, ", minUpdateInterval="

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2, v0}, Lj1/d;->e(JLjava/lang/StringBuilder;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget v1, p0, Le1/d;->d:F

    .line 85
    .line 86
    float-to-double v5, v1

    .line 87
    const-wide/16 v7, 0x0

    .line 88
    .line 89
    cmpl-double v2, v5, v7

    .line 90
    .line 91
    if-lez v2, :cond_5

    .line 92
    .line 93
    const-string v2, ", minUpdateDistance="

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_5
    const-wide/16 v1, 0x0

    .line 102
    .line 103
    cmp-long v3, v1, v3

    .line 104
    .line 105
    if-lez v3, :cond_6

    .line 106
    .line 107
    const-string v3, ", maxUpdateDelay="

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v2, v0}, Lj1/d;->e(JLjava/lang/StringBuilder;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0
.end method
