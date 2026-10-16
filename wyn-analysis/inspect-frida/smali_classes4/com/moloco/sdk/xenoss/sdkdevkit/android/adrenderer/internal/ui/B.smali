.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, -0xb88912

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Le0/z;->b(I)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->a:J

    .line 9
    .line 10
    sget v0, Le0/q;->j:I

    .line 11
    .line 12
    sget-wide v0, Le0/q;->d:J

    .line 13
    .line 14
    sput-wide v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->b:J

    .line 15
    .line 16
    return-void
.end method

.method public static final a(LZ/k;Ljava/lang/String;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;LN/o;I)V
    .locals 38

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v11, p4

    const/4 v5, 0x0

    const-string v6, "onClick"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "decRenderingData"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, -0xfbf55f9

    .line 1
    invoke-virtual {v11, v6}, LN/o;->N(I)LN/o;

    move-object/from16 v6, p0

    invoke-virtual {v11, v6}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int v7, p5, v7

    invoke-virtual {v11, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x20

    goto :goto_1

    :cond_1
    const/16 v9, 0x10

    :goto_1
    or-int/2addr v7, v9

    invoke-virtual {v11, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x800

    goto :goto_2

    :cond_2
    const/16 v9, 0x400

    :goto_2
    or-int/2addr v7, v9

    and-int/lit16 v9, v7, 0x493

    const/16 v10, 0x492

    if-ne v9, v10, :cond_4

    invoke-virtual {v11}, LN/o;->x()Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_3

    .line 2
    :cond_3
    invoke-virtual {v11}, LN/o;->I()V

    move-object v14, v2

    goto/16 :goto_30

    :cond_4
    :goto_3
    sget-object v9, LZ/i;->a:LZ/i;

    .line 3
    invoke-static {v6}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v10

    const/4 v12, 0x7

    const/4 v13, 0x0

    .line 4
    invoke-static {v10, v13, v1, v12}, Lcom/moloco/sdk/internal/publisher/H;->R(LZ/k;Lx0/e;Ltf/a;I)LZ/k;

    move-result-object v10

    const v12, 0x2bb5b5d7

    .line 5
    invoke-virtual {v11, v12}, LN/o;->M(I)V

    .line 6
    sget-object v14, LZ/a;->a:LZ/d;

    .line 7
    invoke-static {v14, v5, v11}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v15

    const v12, -0x4ee9b9da

    .line 8
    invoke-virtual {v11, v12}, LN/o;->M(I)V

    .line 9
    sget-object v8, Lu0/M;->e:LN/L0;

    .line 10
    invoke-virtual {v11, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v18

    const/16 v19, 0x1

    .line 11
    move-object/from16 v3, v18

    check-cast v3, LL0/b;

    .line 12
    sget-object v13, Lu0/M;->k:LN/L0;

    .line 13
    invoke-virtual {v11, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v20

    .line 14
    move-object/from16 v12, v20

    check-cast v12, LL0/i;

    .line 15
    sget-object v4, Lu0/M;->o:LN/L0;

    .line 16
    invoke-virtual {v11, v4}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v22

    .line 17
    move-object/from16 v5, v22

    check-cast v5, Lu0/p0;

    .line 18
    sget-object v22, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    sget-object v0, Lt0/b;->b:Lt0/d;

    .line 20
    invoke-static {v10}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v10

    .line 21
    invoke-virtual {v11}, LN/o;->O()V

    .line 22
    iget-boolean v1, v11, LN/o;->O:Z

    if-eqz v1, :cond_5

    .line 23
    invoke-virtual {v11, v0}, LN/o;->k(Ltf/a;)V

    :goto_4
    const/4 v1, 0x0

    goto :goto_5

    .line 24
    :cond_5
    invoke-virtual {v11}, LN/o;->X()V

    goto :goto_4

    .line 25
    :goto_5
    iput-boolean v1, v11, LN/o;->x:Z

    .line 26
    sget-object v1, Lt0/b;->e:Lt0/a;

    .line 27
    invoke-static {v11, v15, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 28
    sget-object v15, Lt0/b;->d:Lt0/a;

    .line 29
    invoke-static {v11, v3, v15}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 30
    sget-object v3, Lt0/b;->f:Lt0/a;

    .line 31
    invoke-static {v11, v12, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 32
    sget-object v12, Lt0/b;->g:Lt0/a;

    .line 33
    invoke-static {v11, v5, v12, v11}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v5

    const v6, 0x7ab4aae9

    move/from16 v22, v7

    const/4 v7, 0x0

    invoke-static {v7, v10, v5, v11, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v5, -0x7f65a980

    .line 34
    invoke-virtual {v11, v5}, LN/o;->M(I)V

    .line 35
    invoke-static {v9}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v7

    .line 36
    sget-object v10, LE/i;->c:LE/b;

    .line 37
    sget-object v5, LZ/a;->m:LZ/b;

    const v6, -0x1cd0f17e

    .line 38
    invoke-virtual {v11, v6}, LN/o;->M(I)V

    .line 39
    sget-object v6, LE/t;->a:LE/I;

    const-string v6, "verticalArrangement"

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, 0x40f63170

    invoke-virtual {v11, v6}, LN/o;->M(I)V

    const v6, 0x1e7b2b64

    .line 40
    invoke-virtual {v11, v6}, LN/o;->M(I)V

    .line 41
    invoke-virtual {v11, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11, v5}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v26

    or-int v6, v6, v26

    move/from16 v26, v6

    .line 42
    invoke-virtual {v11}, LN/o;->F()Ljava/lang/Object;

    move-result-object v6

    if-nez v26, :cond_7

    move-object/from16 v26, v7

    .line 43
    sget-object v7, LN/k;->a:LN/P;

    if-ne v6, v7, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    const/4 v7, 0x0

    goto :goto_a

    :cond_7
    move-object/from16 v26, v7

    .line 44
    :goto_7
    sget-object v6, LE/i;->b:LE/f;

    .line 45
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 46
    sget-object v6, LZ/a;->l:LZ/b;

    .line 47
    invoke-virtual {v5, v6}, LZ/b;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 48
    sget-object v5, LE/t;->a:LE/I;

    :goto_8
    move-object v6, v5

    goto :goto_9

    .line 49
    :cond_8
    new-instance v6, LE/u;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v7}, LE/u;-><init>(Ljava/lang/Object;I)V

    .line 50
    new-instance v5, LE/s;

    invoke-direct {v5, v10, v7}, LE/s;-><init>(LE/c;I)V

    iget v10, v10, LE/b;->b:F

    const/4 v7, 0x2

    invoke-static {v10, v7, v6, v5}, Lgc/b;->F(FILandroid/support/v4/media/session/b;Ltf/s;)LE/I;

    move-result-object v5

    goto :goto_8

    .line 51
    :goto_9
    invoke-virtual {v11, v6}, LN/o;->U(Ljava/lang/Object;)V

    goto :goto_6

    .line 52
    :goto_a
    invoke-virtual {v11, v7}, LN/o;->p(Z)V

    .line 53
    check-cast v6, Lr0/n;

    .line 54
    invoke-virtual {v11, v7}, LN/o;->p(Z)V

    const v5, -0x4ee9b9da

    .line 55
    invoke-virtual {v11, v5}, LN/o;->M(I)V

    .line 56
    invoke-virtual {v11, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v5

    .line 57
    check-cast v5, LL0/b;

    .line 58
    invoke-virtual {v11, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v7

    .line 59
    check-cast v7, LL0/i;

    .line 60
    invoke-virtual {v11, v4}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v10

    .line 61
    check-cast v10, Lu0/p0;

    move-object/from16 v27, v4

    .line 62
    invoke-static/range {v26 .. v26}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v4

    .line 63
    invoke-virtual {v11}, LN/o;->O()V

    move-object/from16 v26, v13

    .line 64
    iget-boolean v13, v11, LN/o;->O:Z

    if-eqz v13, :cond_9

    .line 65
    invoke-virtual {v11, v0}, LN/o;->k(Ltf/a;)V

    :goto_b
    const/4 v13, 0x0

    goto :goto_c

    .line 66
    :cond_9
    invoke-virtual {v11}, LN/o;->X()V

    goto :goto_b

    .line 67
    :goto_c
    iput-boolean v13, v11, LN/o;->x:Z

    .line 68
    invoke-static {v11, v6, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 69
    invoke-static {v11, v5, v15}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 70
    invoke-static {v11, v7, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 71
    invoke-static {v11, v10, v12, v11}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v5

    const v6, 0x7ab4aae9

    invoke-static {v13, v4, v5, v11, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v4, -0x455f09d5

    .line 72
    invoke-virtual {v11, v4}, LN/o;->M(I)V

    .line 73
    iget-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    if-eqz v4, :cond_a

    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->a:Ljava/lang/Integer;

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_d
    int-to-float v5, v5

    goto :goto_e

    :cond_a
    const/16 v5, 0x80

    goto :goto_d

    :goto_e
    if-eqz v4, :cond_b

    .line 74
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->b:Ljava/lang/String;

    goto :goto_f

    :cond_b
    const/4 v6, 0x0

    :goto_f
    if-eqz v4, :cond_c

    .line 75
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;

    goto :goto_10

    :cond_c
    const/4 v4, 0x0

    :goto_10
    const/16 v7, 0x1c

    int-to-float v7, v7

    .line 76
    invoke-static {v9, v5}, LE/L;->c(LZ/k;F)LZ/k;

    move-result-object v10

    .line 77
    const-string v13, "<this>"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    new-instance v13, LZ/l;

    invoke-direct {v13}, LZ/l;-><init>()V

    .line 79
    invoke-interface {v10, v13}, LZ/k;->g(LZ/k;)LZ/k;

    move-result-object v10

    if-eqz v4, :cond_f

    .line 80
    iget-object v13, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;->b:Ljava/lang/Object;

    .line 81
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v28

    if-nez v28, :cond_d

    .line 82
    invoke-static {v13}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/String;

    .line 83
    invoke-static/range {v28 .. v28}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v28

    move-object/from16 v29, v6

    move/from16 v30, v7

    .line 84
    invoke-static/range {v28 .. v28}, Le0/z;->b(I)J

    move-result-wide v6

    move-object/from16 v28, v13

    .line 85
    new-instance v13, Le0/q;

    invoke-direct {v13, v6, v7}, Le0/q;-><init>(J)V

    .line 86
    invoke-static/range {v28 .. v28}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 87
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    .line 88
    invoke-static {v6}, Le0/z;->b(I)J

    move-result-wide v6

    move-object/from16 v28, v13

    .line 89
    new-instance v13, Le0/q;

    invoke-direct {v13, v6, v7}, Le0/q;-><init>(J)V

    const/4 v7, 0x2

    .line 90
    new-array v6, v7, [Le0/q;

    const/16 v23, 0x0

    aput-object v28, v6, v23

    aput-object v13, v6, v19

    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object/from16 v32, v6

    goto :goto_11

    :cond_d
    move-object/from16 v29, v6

    move/from16 v30, v7

    const/4 v7, 0x2

    const/16 v32, 0x0

    :goto_11
    if-eqz v32, :cond_e

    .line 91
    sget-wide v33, Ld0/c;->b:J

    .line 92
    sget-wide v35, Ld0/c;->c:J

    .line 93
    new-instance v31, Le0/u;

    invoke-direct/range {v31 .. v36}, Le0/u;-><init>(Ljava/util/List;JJ)V

    move-object/from16 v6, v31

    .line 94
    invoke-static/range {v30 .. v30}, LH/e;->a(F)LH/d;

    move-result-object v13

    .line 95
    new-instance v7, LB/a;

    move/from16 v18, v5

    move/from16 v5, v19

    const/4 v2, 0x0

    invoke-direct {v7, v2, v6, v13, v5}, LB/a;-><init>(Le0/q;Le0/u;Le0/E;I)V

    goto :goto_13

    :cond_e
    move/from16 v18, v5

    goto :goto_12

    :cond_f
    move/from16 v18, v5

    move-object/from16 v29, v6

    move/from16 v30, v7

    :goto_12
    const/4 v2, 0x0

    move-object v7, v9

    .line 96
    :goto_13
    invoke-interface {v10, v7}, LZ/k;->g(LZ/k;)LZ/k;

    move-result-object v5

    if-eqz v4, :cond_10

    .line 97
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;->a:Ljava/lang/Integer;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_14
    int-to-float v6, v6

    goto :goto_15

    :cond_10
    const/4 v6, 0x4

    goto :goto_14

    .line 98
    :goto_15
    invoke-static {v5, v6}, Lcom/moloco/sdk/internal/publisher/H;->f0(LZ/k;F)LZ/k;

    move-result-object v5

    if-eqz v4, :cond_11

    .line 99
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;->b:Ljava/lang/Object;

    goto :goto_16

    :cond_11
    move-object v4, v2

    :goto_16
    if-eqz v4, :cond_12

    invoke-static/range {v30 .. v30}, LH/e;->a(F)LH/d;

    move-result-object v4

    const/4 v7, 0x0

    goto :goto_17

    :cond_12
    const/4 v7, 0x0

    int-to-float v4, v7

    .line 100
    invoke-static {v4}, LH/e;->a(F)LH/d;

    move-result-object v4

    :goto_17
    invoke-static {v5, v4}, Lic/d;->k(LZ/k;Le0/E;)LZ/k;

    move-result-object v4

    const v5, 0x2bb5b5d7

    .line 101
    invoke-virtual {v11, v5}, LN/o;->M(I)V

    .line 102
    invoke-static {v14, v7, v11}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v5

    const v6, -0x4ee9b9da

    .line 103
    invoke-virtual {v11, v6}, LN/o;->M(I)V

    .line 104
    invoke-virtual {v11, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v6

    .line 105
    check-cast v6, LL0/b;

    move-object/from16 v7, v26

    .line 106
    invoke-virtual {v11, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v7

    .line 107
    check-cast v7, LL0/i;

    move-object/from16 v8, v27

    .line 108
    invoke-virtual {v11, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v8

    .line 109
    check-cast v8, Lu0/p0;

    .line 110
    invoke-static {v4}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v4

    .line 111
    invoke-virtual {v11}, LN/o;->O()V

    .line 112
    iget-boolean v10, v11, LN/o;->O:Z

    if-eqz v10, :cond_13

    .line 113
    invoke-virtual {v11, v0}, LN/o;->k(Ltf/a;)V

    :goto_18
    const/4 v13, 0x0

    goto :goto_19

    .line 114
    :cond_13
    invoke-virtual {v11}, LN/o;->X()V

    goto :goto_18

    .line 115
    :goto_19
    iput-boolean v13, v11, LN/o;->x:Z

    .line 116
    invoke-static {v11, v5, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 117
    invoke-static {v11, v6, v15}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 118
    invoke-static {v11, v7, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 119
    invoke-static {v11, v8, v12, v11}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v0

    const v6, 0x7ab4aae9

    invoke-static {v13, v4, v0, v11, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v0, -0x7f65a980

    .line 120
    invoke-virtual {v11, v0}, LN/o;->M(I)V

    .line 121
    sget-object v0, Lr0/g;->a:Lr0/f;

    move/from16 v5, v18

    .line 122
    invoke-static {v9, v5}, LE/L;->c(LZ/k;F)LZ/k;

    move-result-object v1

    const/16 v3, 0x30

    move-object/from16 v6, v29

    .line 123
    invoke-static {v6, v0, v1, v11, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/t;->a(Ljava/lang/String;Lr0/h;LZ/k;LN/o;I)V

    const/4 v5, 0x1

    .line 124
    invoke-static {v11, v13, v13, v5, v13}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 125
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    const v0, 0x3e877f0b

    .line 126
    invoke-virtual {v11, v0}, LN/o;->M(I)V

    const/16 v0, 0xc

    if-eqz p1, :cond_16

    int-to-float v1, v0

    .line 127
    invoke-static {v9, v1}, LE/L;->b(LZ/k;F)LZ/k;

    move-result-object v1

    invoke-static {v11, v1}, Lka/e0;->b(LN/o;LZ/k;)V

    move-object/from16 v18, v2

    .line 128
    sget-wide v2, Le0/q;->d:J

    move-object/from16 v4, p3

    .line 129
    iget-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, LFe/b;->E(I)J

    move-result-wide v6

    .line 130
    new-instance v1, LL0/j;

    invoke-direct {v1, v6, v7}, LL0/j;-><init>(J)V

    goto :goto_1a

    :cond_14
    move-object/from16 v1, v18

    :goto_1a
    const v6, 0x3e8797ed

    .line 131
    invoke-virtual {v11, v6}, LN/o;->M(I)V

    if-nez v1, :cond_15

    .line 132
    sget-object v1, LK/M;->a:LN/L0;

    .line 133
    invoke-virtual {v11, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v1

    .line 134
    check-cast v1, LK/L;

    .line 135
    iget-object v1, v1, LK/L;->k:Lz0/p;

    .line 136
    iget-object v1, v1, Lz0/p;->a:Lz0/j;

    .line 137
    iget-wide v6, v1, Lz0/j;->b:J

    :goto_1b
    const/4 v13, 0x0

    goto :goto_1c

    .line 138
    :cond_15
    iget-wide v6, v1, LL0/j;->a:J

    goto :goto_1b

    .line 139
    :goto_1c
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    move/from16 v19, v5

    move-wide v4, v6

    .line 140
    sget-object v6, LE0/l;->f:LE0/l;

    shr-int/lit8 v1, v22, 0x3

    and-int/lit8 v1, v1, 0xe

    const v7, 0x30180

    or-int/2addr v1, v7

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v7, v19

    move/from16 v19, v1

    const/4 v1, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v12, v8

    move-object v10, v9

    const-wide/16 v8, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move v15, v12

    const-wide/16 v11, 0x0

    move/from16 v23, v13

    const/4 v13, 0x2

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x2

    const/16 v24, 0x2

    const/16 v20, 0xc30

    move-object/from16 v25, v21

    const v21, 0xd7d2

    move-object/from16 v0, p1

    move-object/from16 v22, v18

    move-object/from16 v37, v25

    move-object/from16 v18, p4

    .line 141
    invoke-static/range {v0 .. v21}, LK/I;->b(Ljava/lang/String;LZ/k;JJLE0/l;LE0/o;JLK0/c;JIZILK/B;Lz0/p;LN/o;III)V

    move-object/from16 v11, v18

    :goto_1d
    const/4 v13, 0x0

    goto :goto_1e

    :cond_16
    move-object/from16 v22, v2

    move-object/from16 v37, v9

    const/16 v24, 0x2

    goto :goto_1d

    .line 142
    :goto_1e
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    move-object/from16 v14, p3

    .line 143
    iget-object v0, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;

    if-eqz v0, :cond_17

    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;->d:I

    int-to-float v1, v1

    move v2, v1

    const/16 v1, 0xc

    goto :goto_1f

    :cond_17
    const/16 v1, 0xc

    int-to-float v2, v1

    :goto_1f
    if-eqz v0, :cond_18

    .line 144
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;->b:Ljava/lang/String;

    .line 145
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    .line 146
    invoke-static {v3}, Le0/z;->b(I)J

    move-result-wide v3

    goto :goto_20

    .line 147
    :cond_18
    sget-wide v3, Le0/q;->g:J

    :goto_20
    if-eqz v0, :cond_19

    .line 148
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;->c:Ljava/lang/String;

    .line 149
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 150
    invoke-static {v5}, Le0/z;->b(I)J

    move-result-wide v5

    goto :goto_21

    .line 151
    :cond_19
    sget-wide v5, Le0/q;->c:J

    :goto_21
    if-eqz v0, :cond_1a

    .line 152
    iget v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;->e:I

    goto :goto_22

    :cond_1a
    const/16 v7, 0x9

    :goto_22
    if-eqz v0, :cond_1b

    .line 153
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;->a:Ljava/lang/Float;

    goto :goto_23

    :cond_1b
    move-object/from16 v0, v22

    :goto_23
    const v8, 0x3e87f1a2

    invoke-virtual {v11, v8}, LN/o;->M(I)V

    if-nez v0, :cond_1c

    move-object/from16 v10, v37

    goto :goto_24

    :cond_1c
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    int-to-float v1, v1

    move-object/from16 v10, v37

    .line 154
    invoke-static {v10, v1}, LE/L;->b(LZ/k;F)LZ/k;

    move-result-object v1

    invoke-static {v11, v1}, Lka/e0;->b(LN/o;LZ/k;)V

    const/16 v9, 0x30

    move v1, v2

    move-wide v2, v3

    move-wide v4, v5

    move v6, v7

    const/4 v7, 0x0

    move-object v8, v11

    .line 155
    invoke-static/range {v0 .. v9}, LS3/f;->b(FFJJILZ/k;LN/o;I)V

    .line 156
    :goto_24
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 157
    iget-object v0, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;

    if-eqz v0, :cond_1d

    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_1d

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_25
    int-to-float v1, v1

    goto :goto_26

    :cond_1d
    const/16 v1, 0x8

    goto :goto_25

    .line 158
    :goto_26
    invoke-static {v10, v1}, LE/L;->b(LZ/k;F)LZ/k;

    move-result-object v1

    invoke-static {v11, v1}, Lka/e0;->b(LN/o;LZ/k;)V

    if-eqz v0, :cond_1e

    .line 159
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->b:Ljava/lang/String;

    if-nez v1, :cond_1f

    :cond_1e
    const-string v1, "GET"

    :cond_1f
    if-eqz v0, :cond_20

    .line 160
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->c:Ljava/lang/Integer;

    goto :goto_27

    :cond_20
    move-object/from16 v2, v22

    :goto_27
    if-eqz v0, :cond_21

    .line 161
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->d:Ljava/lang/Integer;

    goto :goto_28

    :cond_21
    move-object/from16 v3, v22

    :goto_28
    if-eqz v0, :cond_22

    .line 162
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;

    goto :goto_29

    :cond_22
    move-object/from16 v4, v22

    :goto_29
    if-eqz v0, :cond_23

    .line 163
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->f:Ljava/lang/String;

    if-eqz v5, :cond_23

    .line 164
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    .line 165
    invoke-static {v5}, Le0/z;->b(I)J

    move-result-wide v5

    :goto_2a
    move-wide v6, v5

    goto :goto_2b

    :cond_23
    sget-wide v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->b:J

    goto :goto_2a

    :goto_2b
    if-eqz v0, :cond_24

    .line 166
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;->g:Ljava/lang/String;

    if-eqz v0, :cond_24

    .line 167
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 168
    invoke-static {v0}, Le0/z;->b(I)J

    move-result-wide v8

    goto :goto_2c

    :cond_24
    sget-wide v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->a:J

    :goto_2c
    if-eqz v4, :cond_25

    .line 169
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;->b:Ljava/lang/Object;

    goto :goto_2d

    :cond_25
    move-object/from16 v0, v22

    :goto_2d
    if-eqz v4, :cond_26

    const/4 v5, 0x1

    goto :goto_2e

    :cond_26
    move v5, v13

    :goto_2e
    if-eqz v4, :cond_27

    .line 170
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;->a:Ljava/lang/Integer;

    if-eqz v4, :cond_27

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v10, v4

    goto :goto_2f

    :cond_27
    move/from16 v10, v24

    :goto_2f
    const/16 v12, 0x30

    move-object v4, v0

    move-object v0, v1

    move-object/from16 v1, p2

    .line 171
    invoke-static/range {v0 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->b(Ljava/lang/String;Ltf/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZJJILN/o;I)V

    const/4 v5, 0x1

    .line 172
    invoke-static {v11, v13, v13, v5, v13}, Lwg/b;->e(LN/o;ZZZZ)V

    invoke-static {v11, v13, v13, v13, v5}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 173
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 174
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 175
    :goto_30
    invoke-virtual {v11}, LN/o;->r()LN/i0;

    move-result-object v7

    if-eqz v7, :cond_28

    new-instance v0, Lcom/applovin/mediation/adapters/d;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move-object v4, v14

    invoke-direct/range {v0 .. v6}, Lcom/applovin/mediation/adapters/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lef/e;Ljava/lang/Object;II)V

    .line 176
    iput-object v0, v7, LN/i0;->d:Ltf/p;

    :cond_28
    return-void
.end method

.method public static final b(Ljava/lang/String;Ltf/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZJJILN/o;I)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v15, p3

    .line 8
    .line 9
    move-object/from16 v3, p4

    .line 10
    .line 11
    move/from16 v4, p5

    .line 12
    .line 13
    move-wide/from16 v7, p6

    .line 14
    .line 15
    move/from16 v12, p10

    .line 16
    .line 17
    move-object/from16 v9, p11

    .line 18
    .line 19
    move/from16 v13, p12

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const-string v11, "onClick"

    .line 23
    .line 24
    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const v11, 0x66a192d5

    .line 28
    .line 29
    .line 30
    invoke-virtual {v9, v11}, LN/o;->N(I)LN/o;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v11, v13, 0x6

    .line 34
    .line 35
    if-nez v11, :cond_1

    .line 36
    .line 37
    invoke-virtual {v9, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    if-eqz v11, :cond_0

    .line 42
    .line 43
    const/4 v11, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v11, 0x2

    .line 46
    :goto_0
    or-int/2addr v11, v13

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v11, v13

    .line 49
    :goto_1
    and-int/lit8 v14, v13, 0x30

    .line 50
    .line 51
    if-nez v14, :cond_3

    .line 52
    .line 53
    invoke-virtual {v9, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v14

    .line 57
    if-eqz v14, :cond_2

    .line 58
    .line 59
    const/16 v14, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v14, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v11, v14

    .line 65
    :cond_3
    and-int/lit16 v14, v13, 0x180

    .line 66
    .line 67
    if-nez v14, :cond_5

    .line 68
    .line 69
    invoke-virtual {v9, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-eqz v14, :cond_4

    .line 74
    .line 75
    const/16 v14, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v14, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr v11, v14

    .line 81
    :cond_5
    and-int/lit16 v14, v13, 0xc00

    .line 82
    .line 83
    if-nez v14, :cond_7

    .line 84
    .line 85
    invoke-virtual {v9, v15}, LN/o;->e(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-eqz v14, :cond_6

    .line 90
    .line 91
    const/16 v14, 0x800

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    const/16 v14, 0x400

    .line 95
    .line 96
    :goto_4
    or-int/2addr v11, v14

    .line 97
    :cond_7
    and-int/lit16 v14, v13, 0x6000

    .line 98
    .line 99
    if-nez v14, :cond_9

    .line 100
    .line 101
    invoke-virtual {v9, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-eqz v14, :cond_8

    .line 106
    .line 107
    const/16 v14, 0x4000

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    const/16 v14, 0x2000

    .line 111
    .line 112
    :goto_5
    or-int/2addr v11, v14

    .line 113
    :cond_9
    const/high16 v14, 0x30000

    .line 114
    .line 115
    and-int/2addr v14, v13

    .line 116
    if-nez v14, :cond_b

    .line 117
    .line 118
    invoke-virtual {v9, v4}, LN/o;->f(Z)Z

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    if-eqz v14, :cond_a

    .line 123
    .line 124
    const/high16 v14, 0x20000

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    const/high16 v14, 0x10000

    .line 128
    .line 129
    :goto_6
    or-int/2addr v11, v14

    .line 130
    :cond_b
    const/high16 v14, 0x180000

    .line 131
    .line 132
    and-int/2addr v14, v13

    .line 133
    if-nez v14, :cond_d

    .line 134
    .line 135
    invoke-virtual {v9, v7, v8}, LN/o;->d(J)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-eqz v14, :cond_c

    .line 140
    .line 141
    const/high16 v14, 0x100000

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_c
    const/high16 v14, 0x80000

    .line 145
    .line 146
    :goto_7
    or-int/2addr v11, v14

    .line 147
    :cond_d
    const/high16 v14, 0xc00000

    .line 148
    .line 149
    and-int/2addr v14, v13

    .line 150
    move/from16 v16, v11

    .line 151
    .line 152
    move-wide/from16 v10, p8

    .line 153
    .line 154
    if-nez v14, :cond_f

    .line 155
    .line 156
    invoke-virtual {v9, v10, v11}, LN/o;->d(J)Z

    .line 157
    .line 158
    .line 159
    move-result v17

    .line 160
    if-eqz v17, :cond_e

    .line 161
    .line 162
    const/high16 v17, 0x800000

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_e
    const/high16 v17, 0x400000

    .line 166
    .line 167
    :goto_8
    or-int v16, v16, v17

    .line 168
    .line 169
    :cond_f
    const/high16 v17, 0x6000000

    .line 170
    .line 171
    and-int v17, v13, v17

    .line 172
    .line 173
    if-nez v17, :cond_11

    .line 174
    .line 175
    invoke-virtual {v9, v12}, LN/o;->c(I)Z

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    if-eqz v17, :cond_10

    .line 180
    .line 181
    const/high16 v17, 0x4000000

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_10
    const/high16 v17, 0x2000000

    .line 185
    .line 186
    :goto_9
    or-int v16, v16, v17

    .line 187
    .line 188
    :cond_11
    const/high16 v17, 0x30000000

    .line 189
    .line 190
    or-int v16, v16, v17

    .line 191
    .line 192
    const v18, 0x12492493

    .line 193
    .line 194
    .line 195
    const/16 v19, 0x1

    .line 196
    .line 197
    and-int v5, v16, v18

    .line 198
    .line 199
    const v14, 0x12492492

    .line 200
    .line 201
    .line 202
    if-ne v5, v14, :cond_13

    .line 203
    .line 204
    invoke-virtual {v9}, LN/o;->x()Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-nez v5, :cond_12

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_12
    invoke-virtual {v9}, LN/o;->I()V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_11

    .line 215
    .line 216
    :cond_13
    :goto_a
    const v5, -0x63a7b0eb

    .line 217
    .line 218
    .line 219
    invoke-virtual {v9, v5}, LN/o;->M(I)V

    .line 220
    .line 221
    .line 222
    const v5, 0x78a807bc

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9, v5}, LN/o;->M(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9}, LN/o;->F()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    sget-object v14, LN/k;->a:LN/P;

    .line 233
    .line 234
    if-ne v5, v14, :cond_14

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    sget-object v14, LN/P;->f:LN/P;

    .line 242
    .line 243
    invoke-static {v5, v14}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v9, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_14
    check-cast v5, LN/V;

    .line 251
    .line 252
    invoke-virtual {v9, v6}, LN/o;->p(Z)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, v6}, LN/o;->p(Z)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    check-cast v5, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    move v8, v6

    .line 269
    float-to-double v6, v5

    .line 270
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 271
    .line 272
    .line 273
    move-result-wide v5

    .line 274
    move v7, v8

    .line 275
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 276
    .line 277
    .line 278
    move-result-wide v8

    .line 279
    double-to-float v8, v8

    .line 280
    const/high16 v9, 0x43960000    # 300.0f

    .line 281
    .line 282
    mul-float/2addr v8, v9

    .line 283
    move v11, v9

    .line 284
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 285
    .line 286
    .line 287
    move-result-wide v9

    .line 288
    double-to-float v9, v9

    .line 289
    mul-float/2addr v9, v11

    .line 290
    invoke-static {v8, v9}, LU8/v0;->f(FF)J

    .line 291
    .line 292
    .line 293
    move-result-wide v22

    .line 294
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    add-double/2addr v5, v8

    .line 300
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 301
    .line 302
    .line 303
    move-result-wide v8

    .line 304
    double-to-float v8, v8

    .line 305
    mul-float/2addr v8, v11

    .line 306
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 307
    .line 308
    .line 309
    move-result-wide v5

    .line 310
    double-to-float v5, v5

    .line 311
    mul-float/2addr v5, v11

    .line 312
    invoke-static {v8, v5}, LU8/v0;->f(FF)J

    .line 313
    .line 314
    .line 315
    move-result-wide v24

    .line 316
    if-eqz v3, :cond_16

    .line 317
    .line 318
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_15

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_15
    invoke-static {v3}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    check-cast v5, Ljava/lang/String;

    .line 330
    .line 331
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    invoke-static {v5}, Le0/z;->b(I)J

    .line 336
    .line 337
    .line 338
    move-result-wide v5

    .line 339
    new-instance v8, Le0/q;

    .line 340
    .line 341
    invoke-direct {v8, v5, v6}, Le0/q;-><init>(J)V

    .line 342
    .line 343
    .line 344
    invoke-static {v3}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    check-cast v5, Ljava/lang/String;

    .line 349
    .line 350
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    invoke-static {v5}, Le0/z;->b(I)J

    .line 355
    .line 356
    .line 357
    move-result-wide v5

    .line 358
    new-instance v9, Le0/q;

    .line 359
    .line 360
    invoke-direct {v9, v5, v6}, Le0/q;-><init>(J)V

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x2

    .line 364
    new-array v5, v14, [Le0/q;

    .line 365
    .line 366
    aput-object v8, v5, v7

    .line 367
    .line 368
    aput-object v9, v5, v19

    .line 369
    .line 370
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    :goto_b
    move-object/from16 v21, v5

    .line 375
    .line 376
    goto :goto_d

    .line 377
    :cond_16
    :goto_c
    new-instance v5, Le0/q;

    .line 378
    .line 379
    sget-wide v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->a:J

    .line 380
    .line 381
    invoke-direct {v5, v8, v9}, Le0/q;-><init>(J)V

    .line 382
    .line 383
    .line 384
    new-instance v6, Le0/q;

    .line 385
    .line 386
    invoke-direct {v6, v8, v9}, Le0/q;-><init>(J)V

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x2

    .line 390
    new-array v8, v14, [Le0/q;

    .line 391
    .line 392
    aput-object v5, v8, v7

    .line 393
    .line 394
    aput-object v6, v8, v19

    .line 395
    .line 396
    invoke-static {v8}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    goto :goto_b

    .line 401
    :goto_d
    new-instance v20, Le0/u;

    .line 402
    .line 403
    invoke-direct/range {v20 .. v25}, Le0/u;-><init>(Ljava/util/List;JJ)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v14, v20

    .line 407
    .line 408
    sget-object v18, LH/e;->a:LH/d;

    .line 409
    .line 410
    shr-int/lit8 v5, v16, 0x15

    .line 411
    .line 412
    and-int/lit8 v5, v5, 0xe

    .line 413
    .line 414
    shr-int/lit8 v6, v16, 0xf

    .line 415
    .line 416
    and-int/lit8 v6, v6, 0x70

    .line 417
    .line 418
    or-int v10, v5, v6

    .line 419
    .line 420
    const/16 v11, 0xc

    .line 421
    .line 422
    move-wide/from16 v7, p6

    .line 423
    .line 424
    move-wide/from16 v5, p8

    .line 425
    .line 426
    move-object/from16 v9, p11

    .line 427
    .line 428
    invoke-static/range {v5 .. v11}, LK/a;->a(JJLN/o;II)LK/j;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    move-wide v5, v7

    .line 433
    if-eqz v4, :cond_17

    .line 434
    .line 435
    new-instance v7, LB/h;

    .line 436
    .line 437
    int-to-float v8, v12

    .line 438
    invoke-direct {v7, v8, v14}, LB/h;-><init>(FLe0/m;)V

    .line 439
    .line 440
    .line 441
    :goto_e
    move-object v8, v7

    .line 442
    goto :goto_f

    .line 443
    :cond_17
    const/4 v7, 0x0

    .line 444
    goto :goto_e

    .line 445
    :goto_f
    sget-object v7, LZ/i;->a:LZ/i;

    .line 446
    .line 447
    if-eqz v0, :cond_19

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v14

    .line 457
    int-to-float v14, v14

    .line 458
    const v19, 0x3ea8f5c3    # 0.33f

    .line 459
    .line 460
    .line 461
    mul-float v14, v14, v19

    .line 462
    .line 463
    int-to-float v11, v11

    .line 464
    invoke-static {v7, v11, v14}, LE/L;->e(LZ/k;FF)LZ/k;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    if-nez v11, :cond_18

    .line 469
    .line 470
    goto :goto_10

    .line 471
    :cond_18
    move-object v7, v11

    .line 472
    :cond_19
    :goto_10
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;

    .line 473
    .line 474
    invoke-direct {v11, v1, v15, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;-><init>(Ljava/lang/String;Ljava/lang/Integer;J)V

    .line 475
    .line 476
    .line 477
    const v14, -0x1bfddb1b

    .line 478
    .line 479
    .line 480
    invoke-static {v9, v14, v11}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    shr-int/lit8 v14, v16, 0x3

    .line 485
    .line 486
    and-int/lit8 v14, v14, 0xe

    .line 487
    .line 488
    or-int v14, v14, v17

    .line 489
    .line 490
    const/4 v5, 0x0

    .line 491
    const/4 v6, 0x0

    .line 492
    const/4 v4, 0x0

    .line 493
    move-object v9, v10

    .line 494
    const/4 v10, 0x0

    .line 495
    move v13, v14

    .line 496
    const/16 v14, 0x11c

    .line 497
    .line 498
    move-object/from16 v12, p11

    .line 499
    .line 500
    move-object v3, v7

    .line 501
    move-object/from16 v7, v18

    .line 502
    .line 503
    invoke-static/range {v2 .. v14}, LA6/h;->a(Ltf/a;LZ/k;ZLD/i;LK/n;Le0/E;LB/h;LK/j;LE/F;LV/d;LN/o;II)V

    .line 504
    .line 505
    .line 506
    :goto_11
    invoke-virtual/range {p11 .. p11}, LN/o;->r()LN/i0;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    if-eqz v13, :cond_1a

    .line 511
    .line 512
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/A;

    .line 513
    .line 514
    move-object/from16 v2, p1

    .line 515
    .line 516
    move-object/from16 v3, p2

    .line 517
    .line 518
    move-object/from16 v5, p4

    .line 519
    .line 520
    move/from16 v6, p5

    .line 521
    .line 522
    move-wide/from16 v7, p6

    .line 523
    .line 524
    move-wide/from16 v9, p8

    .line 525
    .line 526
    move/from16 v11, p10

    .line 527
    .line 528
    move/from16 v12, p12

    .line 529
    .line 530
    move-object v4, v15

    .line 531
    invoke-direct/range {v0 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/A;-><init>(Ljava/lang/String;Ltf/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZJJII)V

    .line 532
    .line 533
    .line 534
    iput-object v0, v13, LN/i0;->d:Ltf/p;

    .line 535
    .line 536
    :cond_1a
    return-void
.end method
