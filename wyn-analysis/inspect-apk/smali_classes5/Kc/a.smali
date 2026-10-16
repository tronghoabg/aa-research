.class public final LKc/a;
.super Lzc/a;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public final c:Landroid/graphics/Rect;

.field public d:Ljava/lang/Float;

.field public final e:Ljava/lang/Float;

.field public final f:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Lt6/q;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, LKc/a;->d:Ljava/lang/Float;

    .line 11
    .line 12
    iput-object v1, p0, LKc/a;->e:Ljava/lang/Float;

    .line 13
    .line 14
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 15
    .line 16
    iget-object p1, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/graphics/Rect;

    .line 25
    .line 26
    iput-object v2, p0, LKc/a;->c:Landroid/graphics/Rect;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iput-object v1, p0, LKc/a;->f:Ljava/lang/Float;

    .line 32
    .line 33
    iput-boolean v3, p0, LKc/a;->b:Z

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    sget v2, Lyc/E;->a:I

    .line 37
    .line 38
    const/16 v4, 0x1e

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-lt v2, v4, :cond_1

    .line 42
    .line 43
    move v2, v5

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v2, v3

    .line 46
    :goto_0
    if-eqz v2, :cond_4

    .line 47
    .line 48
    invoke-static {}, Lk1/c0;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/util/Range;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/Float;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v0, v1

    .line 69
    :goto_1
    iput-object v0, p0, LKc/a;->e:Ljava/lang/Float;

    .line 70
    .line 71
    invoke-static {}, Lk1/c0;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroid/util/Range;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    move-object v1, p1

    .line 88
    check-cast v1, Ljava/lang/Float;

    .line 89
    .line 90
    :cond_3
    iput-object v1, p0, LKc/a;->f:Ljava/lang/Float;

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    iput-object v1, p0, LKc/a;->e:Ljava/lang/Float;

    .line 94
    .line 95
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 96
    .line 97
    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Float;

    .line 102
    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    cmpg-float v0, v2, v0

    .line 110
    .line 111
    if-gez v0, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move-object v1, p1

    .line 115
    :cond_6
    :goto_2
    iput-object v1, p0, LKc/a;->f:Ljava/lang/Float;

    .line 116
    .line 117
    :goto_3
    iget-object p1, p0, LKc/a;->f:Ljava/lang/Float;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iget-object v0, p0, LKc/a;->e:Ljava/lang/Float;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-static {p1, v0}, Ljava/lang/Float;->compare(FF)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-lez p1, :cond_7

    .line 134
    .line 135
    move v3, v5

    .line 136
    :cond_7
    iput-boolean v3, p0, LKc/a;->b:Z

    .line 137
    .line 138
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, LKc/a;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget v0, Lyc/E;->a:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, LKc/a;->e:Ljava/lang/Float;

    .line 16
    .line 17
    iget-object v2, p0, LKc/a;->f:Ljava/lang/Float;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-static {}, LA7/N0;->h()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v3, p0, LKc/a;->d:Ljava/lang/Float;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    cmpg-float v4, v3, v1

    .line 40
    .line 41
    if-gez v4, :cond_2

    .line 42
    .line 43
    move v3, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    cmpl-float v1, v3, v2

    .line 46
    .line 47
    if-lez v1, :cond_3

    .line 48
    .line 49
    move v3, v2

    .line 50
    :cond_3
    :goto_1
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    iget-object v0, p0, LKc/a;->d:Ljava/lang/Float;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    cmpg-float v3, v0, v1

    .line 73
    .line 74
    if-gez v3, :cond_5

    .line 75
    .line 76
    move v0, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_5
    cmpl-float v1, v0, v2

    .line 79
    .line 80
    if-lez v1, :cond_6

    .line 81
    .line 82
    move v0, v2

    .line 83
    :cond_6
    :goto_2
    iget-object v1, p0, LKc/a;->c:Landroid/graphics/Rect;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    div-int/lit8 v2, v2, 0x2

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    div-int/lit8 v3, v3, 0x2

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    int-to-float v4, v4

    .line 102
    const/high16 v5, 0x3f000000    # 0.5f

    .line 103
    .line 104
    mul-float/2addr v4, v5

    .line 105
    div-float/2addr v4, v0

    .line 106
    float-to-int v4, v4

    .line 107
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    int-to-float v1, v1

    .line 112
    mul-float/2addr v1, v5

    .line 113
    div-float/2addr v1, v0

    .line 114
    float-to-int v0, v1

    .line 115
    new-instance v1, Landroid/graphics/Rect;

    .line 116
    .line 117
    sub-int v5, v2, v4

    .line 118
    .line 119
    sub-int v6, v3, v0

    .line 120
    .line 121
    add-int/2addr v2, v4

    .line 122
    add-int/2addr v3, v0

    .line 123
    invoke-direct {v1, v5, v6, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method
