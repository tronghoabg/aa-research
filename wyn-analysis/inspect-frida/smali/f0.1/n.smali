.class public final Lf0/n;
.super Lf0/c;
.source "SourceFile"


# instance fields
.field public final d:Lf0/p;

.field public final e:F

.field public final f:F

.field public final g:Lf0/o;

.field public final h:[F

.field public final i:[F

.field public final j:[F

.field public final k:Lkotlin/jvm/internal/n;

.field public final l:Lf0/m;

.field public final m:Lkotlin/jvm/internal/n;

.field public final n:Lf0/m;

.field public final o:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;[FLf0/p;DFFI)V
    .locals 17

    move-wide/from16 v1, p4

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v1, v3

    .line 95
    sget-object v3, Lf0/d;->l:Lf0/d;

    if-nez v0, :cond_0

    move-object v11, v3

    goto :goto_0

    .line 96
    :cond_0
    new-instance v4, Lf0/l;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v2, v5}, Lf0/l;-><init>(DI)V

    move-object v11, v4

    :goto_0
    if-nez v0, :cond_1

    :goto_1
    move-object v12, v3

    goto :goto_2

    .line 97
    :cond_1
    new-instance v3, Lf0/l;

    const/4 v0, 0x1

    invoke-direct {v3, v1, v2, v0}, Lf0/l;-><init>(DI)V

    goto :goto_1

    .line 98
    :goto_2
    new-instance v15, Lf0/o;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/16 v5, 0x0

    move-object v0, v15

    invoke-direct/range {v0 .. v10}, Lf0/o;-><init>(DDDDD)V

    const/4 v10, 0x0

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v16, p8

    .line 99
    invoke-direct/range {v6 .. v16}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;[FLtf/l;Ltf/l;FFLf0/o;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V
    .locals 11

    .line 92
    new-instance v5, Lf0/k;

    const/4 v0, 0x0

    invoke-direct {v5, p4, v0}, Lf0/k;-><init>(Lf0/o;I)V

    .line 93
    new-instance v6, Lf0/k;

    const/4 v0, 0x1

    invoke-direct {v6, p4, v0}, Lf0/k;-><init>(Lf0/o;I)V

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v9, p4

    move/from16 v10, p5

    .line 94
    invoke-direct/range {v0 .. v10}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;[FLtf/l;Ltf/l;FFLf0/o;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLf0/p;[FLtf/l;Ltf/l;FFLf0/o;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p10

    const/16 v11, 0x9

    const/16 v16, 0x8

    const/4 v9, 0x6

    const/16 v17, 0x7

    const/4 v10, 0x0

    const/16 v18, 0x2

    const/4 v12, 0x1

    const/16 v19, 0x3

    const-string v13, "primaries"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "oetf"

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "eotf"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x4

    const/16 v20, 0x5

    .line 1
    sget-wide v14, Lf0/b;->a:J

    move/from16 v21, v13

    move-object/from16 v13, p1

    invoke-direct {v0, v13, v14, v15, v8}, Lf0/c;-><init>(Ljava/lang/String;JI)V

    .line 2
    iput-object v2, v0, Lf0/n;->d:Lf0/p;

    .line 3
    iput v6, v0, Lf0/n;->e:F

    .line 4
    iput v7, v0, Lf0/n;->f:F

    move-object/from16 v13, p9

    .line 5
    iput-object v13, v0, Lf0/n;->g:Lf0/o;

    .line 6
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/internal/n;

    iput-object v13, v0, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 7
    new-instance v13, Lf0/m;

    invoke-direct {v13, v0, v12}, Lf0/m;-><init>(Lf0/n;I)V

    iput-object v13, v0, Lf0/n;->l:Lf0/m;

    .line 8
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/internal/n;

    iput-object v13, v0, Lf0/n;->m:Lkotlin/jvm/internal/n;

    .line 9
    new-instance v13, Lf0/m;

    invoke-direct {v13, v0, v10}, Lf0/m;-><init>(Lf0/n;I)V

    iput-object v13, v0, Lf0/n;->n:Lf0/m;

    .line 10
    array-length v13, v1

    if-eq v13, v9, :cond_1

    array-length v13, v1

    if-ne v13, v11, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 12
    const-string v2, "The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"

    .line 13
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    cmpl-float v13, v6, v7

    if-gez v13, :cond_12

    .line 14
    new-array v13, v9, [F

    .line 15
    array-length v14, v1

    if-ne v14, v11, :cond_2

    .line 16
    aget v14, v1, v10

    aget v15, v1, v12

    add-float v22, v14, v15

    aget v23, v1, v18

    add-float v22, v22, v23

    div-float v14, v14, v22

    .line 17
    aput v14, v13, v10

    div-float v15, v15, v22

    .line 18
    aput v15, v13, v12

    .line 19
    aget v14, v1, v19

    aget v15, v1, v21

    add-float v22, v14, v15

    aget v23, v1, v20

    add-float v22, v22, v23

    div-float v14, v14, v22

    .line 20
    aput v14, v13, v18

    div-float v15, v15, v22

    .line 21
    aput v15, v13, v19

    .line 22
    aget v14, v1, v9

    aget v15, v1, v17

    add-float v22, v14, v15

    aget v1, v1, v16

    add-float v22, v22, v1

    div-float v14, v14, v22

    .line 23
    aput v14, v13, v21

    div-float v15, v15, v22

    .line 24
    aput v15, v13, v20

    goto :goto_1

    .line 25
    :cond_2
    invoke-static {v1, v10, v13, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    :goto_1
    iput-object v13, v0, Lf0/n;->h:[F

    if-nez v3, :cond_3

    .line 27
    aget v3, v13, v10

    .line 28
    aget v14, v13, v12

    .line 29
    aget v15, v13, v18

    .line 30
    aget v22, v13, v19

    .line 31
    aget v23, v13, v21

    .line 32
    aget v24, v13, v20

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v1, v12

    sub-float v25, v1, v3

    div-float v25, v25, v14

    sub-float v26, v1, v15

    div-float v26, v26, v22

    sub-float v27, v1, v23

    div-float v27, v27, v24

    move/from16 v28, v10

    .line 33
    iget v10, v2, Lf0/p;->a:F

    sub-float/2addr v1, v10

    move/from16 v29, v12

    iget v12, v2, Lf0/p;->b:F

    div-float/2addr v1, v12

    div-float v30, v3, v14

    div-float v31, v15, v22

    div-float v32, v23, v24

    div-float/2addr v10, v12

    sub-float v1, v1, v25

    sub-float v31, v31, v30

    mul-float v1, v1, v31

    sub-float v10, v10, v30

    sub-float v26, v26, v25

    mul-float v12, v10, v26

    sub-float/2addr v1, v12

    sub-float v27, v27, v25

    mul-float v27, v27, v31

    sub-float v32, v32, v30

    mul-float v26, v26, v32

    sub-float v27, v27, v26

    div-float v1, v1, v27

    mul-float v32, v32, v1

    sub-float v10, v10, v32

    div-float v10, v10, v31

    sub-float v12, p1, v10

    sub-float/2addr v12, v1

    div-float v25, v12, v14

    div-float v26, v10, v22

    div-float v27, v1, v24

    mul-float v30, v25, v3

    sub-float v3, p1, v3

    sub-float/2addr v3, v14

    mul-float v3, v3, v25

    mul-float v14, v26, v15

    sub-float v15, p1, v15

    sub-float v15, v15, v22

    mul-float v15, v15, v26

    mul-float v22, v27, v23

    sub-float v23, p1, v23

    sub-float v23, v23, v24

    mul-float v23, v23, v27

    .line 34
    new-array v11, v11, [F

    aput v30, v11, v28

    aput v12, v11, v29

    aput v3, v11, v18

    aput v14, v11, v19

    aput v10, v11, v21

    aput v15, v11, v20

    aput v22, v11, v9

    aput v1, v11, v17

    aput v23, v11, v16

    .line 35
    iput-object v11, v0, Lf0/n;->i:[F

    goto :goto_2

    :cond_3
    move/from16 v28, v10

    move/from16 v29, v12

    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    array-length v1, v3

    if-ne v1, v11, :cond_11

    .line 37
    iput-object v3, v0, Lf0/n;->i:[F

    .line 38
    :goto_2
    iget-object v1, v0, Lf0/n;->i:[F

    invoke-static {v1}, Lf0/h;->h([F)[F

    move-result-object v1

    iput-object v1, v0, Lf0/n;->j:[F

    .line 39
    invoke-static {v13}, Lf0/h;->b([F)F

    move-result v1

    .line 40
    sget-object v3, Lf0/e;->a:[F

    .line 41
    sget-object v3, Lf0/e;->b:[F

    .line 42
    invoke-static {v3}, Lf0/h;->b([F)F

    move-result v3

    div-float/2addr v1, v3

    const v3, 0x3f666666    # 0.9f

    cmpl-float v1, v1, v3

    if-lez v1, :cond_6

    .line 43
    sget-object v1, Lf0/e;->a:[F

    .line 44
    aget v10, v13, v28

    aget v11, v1, v28

    sub-float/2addr v10, v11

    aget v12, v13, v29

    aget v14, v1, v29

    sub-float/2addr v12, v14

    .line 45
    aget v15, v13, v18

    aget v16, v1, v18

    sub-float v15, v15, v16

    aget v16, v13, v19

    aget v17, v1, v19

    sub-float v16, v16, v17

    .line 46
    aget v17, v13, v21

    aget v22, v1, v21

    sub-float v17, v17, v22

    aget v23, v13, v20

    aget v24, v1, v20

    sub-float v23, v23, v24

    const/16 p2, 0x0

    new-array v3, v9, [F

    aput v10, v3, v28

    aput v12, v3, v29

    aput v15, v3, v18

    aput v16, v3, v19

    aput v17, v3, v21

    aput v23, v3, v20

    .line 47
    aget v10, v3, v28

    .line 48
    aget v12, v3, v29

    sub-float v11, v11, v22

    sub-float v14, v14, v24

    .line 49
    invoke-static {v10, v12, v11, v14}, Lf0/h;->g(FFFF)F

    move-result v10

    cmpg-float v10, v10, p2

    if-ltz v10, :cond_7

    .line 50
    aget v10, v1, v28

    aget v11, v1, v18

    sub-float/2addr v10, v11

    .line 51
    aget v11, v1, v29

    aget v12, v1, v19

    sub-float/2addr v11, v12

    .line 52
    aget v12, v3, v28

    .line 53
    aget v14, v3, v29

    .line 54
    invoke-static {v10, v11, v12, v14}, Lf0/h;->g(FFFF)F

    move-result v10

    cmpg-float v10, v10, p2

    if-gez v10, :cond_4

    goto :goto_3

    .line 55
    :cond_4
    aget v10, v3, v18

    .line 56
    aget v11, v3, v19

    .line 57
    aget v12, v1, v18

    aget v14, v1, v28

    sub-float/2addr v12, v14

    .line 58
    aget v14, v1, v19

    aget v15, v1, v29

    sub-float/2addr v14, v15

    .line 59
    invoke-static {v10, v11, v12, v14}, Lf0/h;->g(FFFF)F

    move-result v10

    cmpg-float v10, v10, p2

    if-ltz v10, :cond_7

    .line 60
    aget v10, v1, v18

    aget v11, v1, v21

    sub-float/2addr v10, v11

    .line 61
    aget v11, v1, v19

    aget v12, v1, v20

    sub-float/2addr v11, v12

    .line 62
    aget v12, v3, v18

    .line 63
    aget v14, v3, v19

    .line 64
    invoke-static {v10, v11, v12, v14}, Lf0/h;->g(FFFF)F

    move-result v10

    cmpg-float v10, v10, p2

    if-gez v10, :cond_5

    goto :goto_3

    .line 65
    :cond_5
    aget v10, v3, v21

    .line 66
    aget v11, v3, v20

    .line 67
    aget v12, v1, v21

    aget v14, v1, v18

    sub-float/2addr v12, v14

    .line 68
    aget v14, v1, v20

    aget v15, v1, v19

    sub-float/2addr v14, v15

    .line 69
    invoke-static {v10, v11, v12, v14}, Lf0/h;->g(FFFF)F

    move-result v10

    cmpg-float v10, v10, p2

    if-ltz v10, :cond_7

    .line 70
    aget v10, v1, v21

    aget v11, v1, v28

    sub-float/2addr v10, v11

    .line 71
    aget v11, v1, v20

    aget v1, v1, v29

    sub-float/2addr v11, v1

    .line 72
    aget v1, v3, v21

    .line 73
    aget v3, v3, v20

    .line 74
    invoke-static {v10, v11, v1, v3}, Lf0/h;->g(FFFF)F

    move-result v1

    cmpg-float v1, v1, p2

    if-ltz v1, :cond_7

    goto :goto_4

    :cond_6
    const/16 p2, 0x0

    :cond_7
    :goto_3
    cmpg-float v1, v6, p2

    :goto_4
    if-nez v8, :cond_8

    goto :goto_8

    .line 75
    :cond_8
    sget-object v1, Lf0/e;->a:[F

    if-ne v13, v1, :cond_9

    goto :goto_6

    :cond_9
    move/from16 v3, v28

    :goto_5
    if-ge v3, v9, :cond_b

    .line 76
    aget v8, v13, v3

    aget v10, v1, v3

    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_a

    aget v8, v13, v3

    aget v10, v1, v3

    sub-float/2addr v8, v10

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const v10, 0x3a83126f    # 0.001f

    cmpl-float v8, v8, v10

    if-lez v8, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 77
    :cond_b
    :goto_6
    sget-object v1, Lf0/h;->d:Lf0/p;

    invoke-static {v2, v1}, Lf0/h;->e(Lf0/p;Lf0/p;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_9

    :cond_c
    cmpg-float v1, v6, p2

    if-nez v1, :cond_10

    cmpg-float v1, v7, p1

    if-nez v1, :cond_10

    .line 78
    sget-object v1, Lf0/e;->a:[F

    .line 79
    sget-object v1, Lf0/e;->c:Lf0/n;

    const-wide/16 v2, 0x0

    :goto_7
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpg-double v6, v2, v6

    if-gtz v6, :cond_f

    .line 80
    iget-object v6, v1, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 81
    invoke-static {v2, v3, v4, v6}, Lf0/h;->d(DLtf/l;Ltf/l;)Z

    move-result v6

    if-nez v6, :cond_d

    goto :goto_9

    .line 82
    :cond_d
    iget-object v6, v1, Lf0/n;->m:Lkotlin/jvm/internal/n;

    invoke-static {v2, v3, v5, v6}, Lf0/h;->d(DLtf/l;Ltf/l;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_9

    :cond_e
    const-wide v6, 0x3f70101010101010L    # 0.00392156862745098

    add-double/2addr v2, v6

    goto :goto_7

    :cond_f
    :goto_8
    move/from16 v10, v29

    goto :goto_a

    :cond_10
    :goto_9
    move/from16 v10, v28

    .line 83
    :goto_a
    iput-boolean v10, v0, Lf0/n;->o:Z

    return-void

    .line 84
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Transform must have 9 entries! Has "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    array-length v3, v3

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 88
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 89
    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid range: min="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", max="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, "; min must be strictly < max"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 91
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a([F)[F
    .locals 5

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf0/n;->j:[F

    .line 7
    .line 8
    invoke-static {v0, p1}, Lf0/h;->j([F[F)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget v1, p1, v0

    .line 13
    .line 14
    float-to-double v1, v1

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lf0/n;->l:Lf0/m;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    double-to-float v1, v3

    .line 32
    aput v1, p1, v0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aget v1, p1, v0

    .line 36
    .line 37
    float-to-double v3, v1

    .line 38
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    double-to-float v1, v3

    .line 53
    aput v1, p1, v0

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    aget v1, p1, v0

    .line 57
    .line 58
    float-to-double v3, v1

    .line 59
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    double-to-float v1, v1

    .line 74
    aput v1, p1, v0

    .line 75
    .line 76
    return-object p1
.end method

.method public final b(I)F
    .locals 0

    .line 1
    iget p1, p0, Lf0/n;->f:F

    .line 2
    .line 3
    return p1
.end method

.method public final c(I)F
    .locals 0

    .line 1
    iget p1, p0, Lf0/n;->e:F

    .line 2
    .line 3
    return p1
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf0/n;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e([F)[F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    float-to-double v1, v1

    .line 5
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lf0/n;->n:Lf0/m;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    double-to-float v1, v3

    .line 22
    aput v1, p1, v0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aget v1, p1, v0

    .line 26
    .line 27
    float-to-double v3, v1

    .line 28
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    double-to-float v1, v3

    .line 43
    aput v1, p1, v0

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    aget v1, p1, v0

    .line 47
    .line 48
    float-to-double v3, v1

    .line 49
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    double-to-float v1, v1

    .line 64
    aput v1, p1, v0

    .line 65
    .line 66
    iget-object v0, p0, Lf0/n;->i:[F

    .line 67
    .line 68
    invoke-static {v0, p1}, Lf0/h;->j([F[F)V

    .line 69
    .line 70
    .line 71
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_a

    .line 5
    .line 6
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 7
    .line 8
    const-class v1, Lf0/n;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-super {p0, p1}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    check-cast p1, Lf0/n;

    .line 37
    .line 38
    iget v0, p1, Lf0/n;->e:F

    .line 39
    .line 40
    iget v1, p0, Lf0/n;->e:F

    .line 41
    .line 42
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    iget v0, p1, Lf0/n;->f:F

    .line 50
    .line 51
    iget v1, p0, Lf0/n;->f:F

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    iget-object v0, p0, Lf0/n;->d:Lf0/p;

    .line 61
    .line 62
    iget-object v1, p1, Lf0/n;->d:Lf0/p;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    iget-object v0, p0, Lf0/n;->h:[F

    .line 72
    .line 73
    iget-object v1, p1, Lf0/n;->h:[F

    .line 74
    .line 75
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_6

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_6
    iget-object v0, p1, Lf0/n;->g:Lf0/o;

    .line 83
    .line 84
    iget-object v1, p0, Lf0/n;->g:Lf0/o;

    .line 85
    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Lf0/o;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1

    .line 93
    :cond_7
    if-nez v0, :cond_8

    .line 94
    .line 95
    :goto_0
    const/4 p1, 0x1

    .line 96
    return p1

    .line 97
    :cond_8
    iget-object v0, p0, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 98
    .line 99
    iget-object v1, p1, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 100
    .line 101
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_9

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_9
    iget-object v0, p0, Lf0/n;->m:Lkotlin/jvm/internal/n;

    .line 109
    .line 110
    iget-object p1, p1, Lf0/n;->m:Lkotlin/jvm/internal/n;

    .line 111
    .line 112
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1

    .line 117
    :cond_a
    :goto_1
    const/4 p1, 0x0

    .line 118
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    invoke-super {p0}, Lf0/c;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lf0/n;->d:Lf0/p;

    .line 8
    .line 9
    invoke-virtual {v1}, Lf0/p;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lf0/n;->h:[F

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget v1, p0, Lf0/n;->e:F

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    cmpg-float v3, v1, v2

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    move v1, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :goto_0
    add-int/2addr v0, v1

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget v1, p0, Lf0/n;->f:F

    .line 43
    .line 44
    cmpg-float v2, v1, v2

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    move v1, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_1
    add-int/2addr v0, v1

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget-object v1, p0, Lf0/n;->g:Lf0/o;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1}, Lf0/o;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :cond_2
    add-int/2addr v0, v4

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    mul-int/lit8 v0, v0, 0x1f

    .line 69
    .line 70
    iget-object v1, p0, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    mul-int/lit8 v1, v1, 0x1f

    .line 78
    .line 79
    iget-object v0, p0, Lf0/n;->m:Lkotlin/jvm/internal/n;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/2addr v0, v1

    .line 86
    :cond_3
    return v0
.end method
