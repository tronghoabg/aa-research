.class public final Lf0/i;
.super Lf0/c;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IJILjava/lang/String;)V
    .locals 0

    .line 1
    iput p4, p0, Lf0/i;->d:I

    invoke-direct {p0, p5, p2, p3, p1}, Lf0/c;-><init>(Ljava/lang/String;JI)V

    return-void
.end method

.method public static f(F)F
    .locals 2

    .line 1
    const/high16 v0, -0x40000000    # -2.0f

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final a([F)[F
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lf0/i;->d:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v2, "v"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget v3, v1, v2

    .line 17
    .line 18
    invoke-static {v3}, Lf0/i;->f(F)F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    aput v3, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aget v3, v1, v2

    .line 26
    .line 27
    invoke-static {v3}, Lf0/i;->f(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    aput v3, v1, v2

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    aget v3, v1, v2

    .line 35
    .line 36
    invoke-static {v3}, Lf0/i;->f(F)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    aput v3, v1, v2

    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_0
    const-string v2, "v"

    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    aget v3, v1, v2

    .line 50
    .line 51
    sget-object v4, Lf0/h;->e:[F

    .line 52
    .line 53
    aget v5, v4, v2

    .line 54
    .line 55
    div-float/2addr v3, v5

    .line 56
    const/4 v5, 0x1

    .line 57
    aget v6, v1, v5

    .line 58
    .line 59
    aget v7, v4, v5

    .line 60
    .line 61
    div-float/2addr v6, v7

    .line 62
    const/4 v7, 0x2

    .line 63
    aget v8, v1, v7

    .line 64
    .line 65
    aget v4, v4, v7

    .line 66
    .line 67
    div-float/2addr v8, v4

    .line 68
    const v4, 0x3c111aa7

    .line 69
    .line 70
    .line 71
    cmpl-float v9, v3, v4

    .line 72
    .line 73
    const v10, 0x3e0d3dcb

    .line 74
    .line 75
    .line 76
    const v11, 0x40f92f68

    .line 77
    .line 78
    .line 79
    const v12, 0x3eaaaaab

    .line 80
    .line 81
    .line 82
    if-lez v9, :cond_0

    .line 83
    .line 84
    float-to-double v13, v3

    .line 85
    move v9, v2

    .line 86
    float-to-double v2, v12

    .line 87
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    double-to-float v2, v2

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move v9, v2

    .line 94
    mul-float/2addr v3, v11

    .line 95
    add-float v2, v3, v10

    .line 96
    .line 97
    :goto_0
    cmpl-float v3, v6, v4

    .line 98
    .line 99
    if-lez v3, :cond_1

    .line 100
    .line 101
    float-to-double v13, v6

    .line 102
    move v15, v4

    .line 103
    move v3, v5

    .line 104
    float-to-double v4, v12

    .line 105
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    double-to-float v4, v4

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    move v15, v4

    .line 112
    move v3, v5

    .line 113
    mul-float/2addr v6, v11

    .line 114
    add-float v4, v6, v10

    .line 115
    .line 116
    :goto_1
    cmpl-float v5, v8, v15

    .line 117
    .line 118
    if-lez v5, :cond_2

    .line 119
    .line 120
    float-to-double v5, v8

    .line 121
    float-to-double v10, v12

    .line 122
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->pow(DD)D

    .line 123
    .line 124
    .line 125
    move-result-wide v5

    .line 126
    double-to-float v5, v5

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    mul-float/2addr v8, v11

    .line 129
    add-float v5, v8, v10

    .line 130
    .line 131
    :goto_2
    const/high16 v6, 0x42e80000    # 116.0f

    .line 132
    .line 133
    mul-float/2addr v6, v4

    .line 134
    const/high16 v8, 0x41800000    # 16.0f

    .line 135
    .line 136
    sub-float/2addr v6, v8

    .line 137
    const/high16 v8, 0x43fa0000    # 500.0f

    .line 138
    .line 139
    sub-float/2addr v2, v4

    .line 140
    mul-float/2addr v2, v8

    .line 141
    const/high16 v8, 0x43480000    # 200.0f

    .line 142
    .line 143
    sub-float/2addr v4, v5

    .line 144
    mul-float/2addr v4, v8

    .line 145
    const/4 v5, 0x0

    .line 146
    const/high16 v8, 0x42c80000    # 100.0f

    .line 147
    .line 148
    invoke-static {v6, v5, v8}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    aput v5, v1, v9

    .line 153
    .line 154
    const/high16 v5, -0x3d000000    # -128.0f

    .line 155
    .line 156
    const/high16 v6, 0x43000000    # 128.0f

    .line 157
    .line 158
    invoke-static {v2, v5, v6}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    aput v2, v1, v3

    .line 163
    .line 164
    invoke-static {v4, v5, v6}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    aput v2, v1, v7

    .line 169
    .line 170
    return-object v1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)F
    .locals 1

    .line 1
    iget v0, p0, Lf0/i;->d:I

    packed-switch v0, :pswitch_data_0

    const/high16 p1, 0x40000000    # 2.0f

    return p1

    :pswitch_0
    if-nez p1, :cond_0

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x43000000    # 128.0f

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(I)F
    .locals 1

    .line 1
    iget v0, p0, Lf0/i;->d:I

    packed-switch v0, :pswitch_data_0

    const/high16 p1, -0x40000000    # -2.0f

    return p1

    :pswitch_0
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x3d000000    # -128.0f

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e([F)[F
    .locals 10

    .line 1
    iget v0, p0, Lf0/i;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v1, p1, v0

    .line 8
    .line 9
    invoke-static {v1}, Lf0/i;->f(F)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    aput v1, p1, v0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aget v1, p1, v0

    .line 17
    .line 18
    invoke-static {v1}, Lf0/i;->f(F)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    aput v1, p1, v0

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    aget v1, p1, v0

    .line 26
    .line 27
    invoke-static {v1}, Lf0/i;->f(F)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    aput v1, p1, v0

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    const/4 v0, 0x0

    .line 35
    aget v1, p1, v0

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/high16 v3, 0x42c80000    # 100.0f

    .line 39
    .line 40
    invoke-static {v1, v2, v3}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    aput v1, p1, v0

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    aget v2, p1, v1

    .line 48
    .line 49
    const/high16 v3, -0x3d000000    # -128.0f

    .line 50
    .line 51
    const/high16 v4, 0x43000000    # 128.0f

    .line 52
    .line 53
    invoke-static {v2, v3, v4}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    aput v2, p1, v1

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    aget v5, p1, v2

    .line 61
    .line 62
    invoke-static {v5, v3, v4}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    aput v3, p1, v2

    .line 67
    .line 68
    aget v4, p1, v0

    .line 69
    .line 70
    const/high16 v5, 0x41800000    # 16.0f

    .line 71
    .line 72
    add-float/2addr v4, v5

    .line 73
    const/high16 v5, 0x42e80000    # 116.0f

    .line 74
    .line 75
    div-float/2addr v4, v5

    .line 76
    aget v5, p1, v1

    .line 77
    .line 78
    const v6, 0x3b03126f    # 0.002f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v5, v6

    .line 82
    add-float/2addr v5, v4

    .line 83
    const v6, 0x3ba3d70a    # 0.005f

    .line 84
    .line 85
    .line 86
    mul-float/2addr v3, v6

    .line 87
    sub-float v3, v4, v3

    .line 88
    .line 89
    const v6, 0x3e53dcb1

    .line 90
    .line 91
    .line 92
    cmpl-float v7, v5, v6

    .line 93
    .line 94
    const v8, 0x3e0d3dcb

    .line 95
    .line 96
    .line 97
    const v9, 0x3e038027

    .line 98
    .line 99
    .line 100
    if-lez v7, :cond_0

    .line 101
    .line 102
    mul-float v7, v5, v5

    .line 103
    .line 104
    mul-float/2addr v7, v5

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    sub-float/2addr v5, v8

    .line 107
    mul-float v7, v5, v9

    .line 108
    .line 109
    :goto_0
    cmpl-float v5, v4, v6

    .line 110
    .line 111
    if-lez v5, :cond_1

    .line 112
    .line 113
    mul-float v5, v4, v4

    .line 114
    .line 115
    mul-float/2addr v5, v4

    .line 116
    goto :goto_1

    .line 117
    :cond_1
    sub-float/2addr v4, v8

    .line 118
    mul-float v5, v4, v9

    .line 119
    .line 120
    :goto_1
    cmpl-float v4, v3, v6

    .line 121
    .line 122
    if-lez v4, :cond_2

    .line 123
    .line 124
    mul-float v4, v3, v3

    .line 125
    .line 126
    mul-float/2addr v4, v3

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    sub-float/2addr v3, v8

    .line 129
    mul-float v4, v3, v9

    .line 130
    .line 131
    :goto_2
    sget-object v3, Lf0/h;->e:[F

    .line 132
    .line 133
    aget v6, v3, v0

    .line 134
    .line 135
    mul-float/2addr v7, v6

    .line 136
    aput v7, p1, v0

    .line 137
    .line 138
    aget v0, v3, v1

    .line 139
    .line 140
    mul-float/2addr v5, v0

    .line 141
    aput v5, p1, v1

    .line 142
    .line 143
    aget v0, v3, v2

    .line 144
    .line 145
    mul-float/2addr v4, v0

    .line 146
    aput v4, p1, v2

    .line 147
    .line 148
    return-object p1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
