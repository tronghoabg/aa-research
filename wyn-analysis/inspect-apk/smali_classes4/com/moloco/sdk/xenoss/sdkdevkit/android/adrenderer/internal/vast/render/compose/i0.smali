.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LFf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LJf/n;->a:LFf/e;

    .line 4
    .line 5
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/i0;->a:LFf/e;

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Ljava/lang/String;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;ZLtf/l;Ltf/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Ltf/l;Ltf/l;LZ/k;LN/o;I)V
    .locals 30

    move-object/from16 v1, p0

    move/from16 v4, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p11

    move/from16 v2, p12

    const-string v3, "uri"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "play"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "seekToMillis"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "isPlaying"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "isVisible"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onProgressChanged"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onError"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x1ef0e80

    .line 1
    invoke-virtual {v15, v3}, LN/o;->N(I)LN/o;

    and-int/lit8 v3, v2, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v15, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v15, v4}, LN/o;->f(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v2, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v15, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :cond_5
    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v15, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v3, v7

    :cond_7
    and-int/lit16 v7, v2, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v15, v9}, LN/o;->f(Z)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v3, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v2

    if-nez v7, :cond_b

    invoke-virtual {v15, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v7, 0x10000

    :goto_6
    or-int/2addr v3, v7

    :cond_b
    const/high16 v7, 0x180000

    and-int/2addr v7, v2

    if-nez v7, :cond_d

    invoke-virtual {v15, v11}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v7, 0x80000

    :goto_7
    or-int/2addr v3, v7

    :cond_d
    const/high16 v7, 0xc00000

    and-int/2addr v7, v2

    if-nez v7, :cond_f

    invoke-virtual {v15, v12}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    const/high16 v7, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v7, 0x400000

    :goto_8
    or-int/2addr v3, v7

    :cond_f
    const/high16 v7, 0x6000000

    and-int/2addr v7, v2

    if-nez v7, :cond_11

    invoke-virtual {v15, v13}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    const/high16 v7, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v7, 0x2000000

    :goto_9
    or-int/2addr v3, v7

    :cond_11
    const/high16 v7, 0x30000000

    and-int/2addr v7, v2

    if-nez v7, :cond_13

    invoke-virtual {v15, v14}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    const/high16 v7, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v7, 0x10000000

    :goto_a
    or-int/2addr v3, v7

    :cond_13
    move-object/from16 v7, p10

    invoke-virtual {v15, v7}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    move/from16 v16, v5

    goto :goto_b

    :cond_14
    move/from16 v16, v6

    :goto_b
    const v5, 0x12492493

    and-int/2addr v3, v5

    const v5, 0x12492492

    if-ne v3, v5, :cond_16

    and-int/lit8 v3, v16, 0x3

    if-ne v3, v6, :cond_16

    invoke-virtual {v15}, LN/o;->x()Z

    move-result v3

    if-nez v3, :cond_15

    goto :goto_c

    .line 2
    :cond_15
    invoke-virtual {v15}, LN/o;->I()V

    move-object v7, v1

    move-object v10, v8

    move-object v8, v0

    goto/16 :goto_f

    .line 3
    :cond_16
    :goto_c
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 4
    invoke-virtual {v15, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v3

    .line 5
    check-cast v3, Landroid/content/Context;

    .line 6
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LN/f0;

    move-result-object v5

    .line 7
    invoke-virtual {v15, v5}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/v;

    .line 8
    invoke-interface {v5}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    move-result-object v6

    const v5, -0x2f550be0

    invoke-virtual {v15, v5}, LN/o;->M(I)V

    .line 9
    invoke-virtual {v15, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v15, v4}, LN/o;->f(Z)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v15, v6}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    .line 10
    invoke-virtual {v15}, LN/o;->F()Ljava/lang/Object;

    move-result-object v2

    sget-object v9, LN/k;->a:LN/P;

    if-nez v5, :cond_17

    if-ne v2, v9, :cond_18

    .line 11
    :cond_17
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 12
    sget-object v5, Lcom/moloco/sdk/service_locator/g;->b:Lef/p;

    invoke-virtual {v5}, Lef/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 13
    sget-object v18, Lcom/moloco/sdk/acm/recorder/b;->Companion:Lcom/moloco/sdk/acm/recorder/a;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    new-instance v7, Lcom/moloco/sdk/acm/recorder/c;

    move-object/from16 v18, v2

    const/4 v2, 0x0

    .line 15
    invoke-direct {v7, v2}, Lcom/moloco/sdk/acm/recorder/c;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v18

    .line 16
    invoke-direct/range {v2 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;-><init>(Landroid/content/Context;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Landroidx/lifecycle/o;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 17
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;

    invoke-direct {v3, v2, v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V

    .line 18
    invoke-virtual {v15, v3}, LN/o;->U(Ljava/lang/Object;)V

    move-object v2, v3

    .line 19
    :cond_18
    move-object/from16 v19, v2

    check-cast v19, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;

    const/4 v2, 0x0

    .line 20
    invoke-virtual {v15, v2}, LN/o;->p(Z)V

    const v3, 0x2e20b340

    .line 21
    invoke-virtual {v15, v3}, LN/o;->M(I)V

    const v3, -0x1d58f75c

    .line 22
    invoke-virtual {v15, v3}, LN/o;->M(I)V

    .line 23
    invoke-virtual {v15}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_19

    .line 24
    new-instance v3, LN/t;

    .line 25
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/i0;->a:LFf/e;

    invoke-static {v4, v15}, LN/d;->x(Ljf/h;LN/o;)LKd/a;

    move-result-object v4

    .line 26
    invoke-direct {v3, v4}, LN/t;-><init>(LKd/a;)V

    .line 27
    invoke-virtual {v15, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 28
    :cond_19
    invoke-virtual {v15, v2}, LN/o;->p(Z)V

    .line 29
    check-cast v3, LN/t;

    .line 30
    iget-object v3, v3, LN/t;->a:LKd/a;

    .line 31
    invoke-virtual {v15, v2}, LN/o;->p(Z)V

    .line 32
    invoke-static {v10, v15}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    move-result-object v23

    .line 33
    invoke-static {v11, v15}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    move-result-object v24

    new-array v4, v2, [Ljava/lang/Object;

    const v5, -0x2f548ecc

    invoke-virtual {v15, v5}, LN/o;->M(I)V

    .line 34
    invoke-virtual {v15}, LN/o;->F()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_1a

    .line 35
    new-instance v5, Lcom/moloco/sdk/service_locator/h;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 36
    invoke-virtual {v15, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 37
    :cond_1a
    check-cast v5, Ltf/a;

    .line 38
    invoke-virtual {v15, v2}, LN/o;->p(Z)V

    const/4 v7, 0x6

    move-object/from16 v20, v3

    const/4 v3, 0x0

    const/16 v6, 0xc00

    move v10, v2

    move-object v2, v4

    move-object v4, v5

    move-object v5, v15

    move-object/from16 v15, v19

    move-object/from16 v27, v20

    move-object/from16 v28, v23

    move-object/from16 v29, v24

    .line 39
    invoke-static/range {v2 .. v7}, Lgc/b;->E([Ljava/lang/Object;LS3/e;Ltf/a;LN/o;II)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, LN/V;

    new-array v2, v10, [Ljava/lang/Object;

    const v3, -0x2f54836c

    invoke-virtual {v5, v3}, LN/o;->M(I)V

    .line 40
    invoke-virtual {v5}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_1b

    .line 41
    new-instance v3, Lcom/moloco/sdk/service_locator/h;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 42
    invoke-virtual {v5, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 43
    :cond_1b
    move-object v4, v3

    check-cast v4, Ltf/a;

    .line 44
    invoke-virtual {v5, v10}, LN/o;->p(Z)V

    const/4 v7, 0x6

    const/4 v3, 0x0

    const/16 v6, 0xc00

    move-object/from16 v10, v22

    .line 45
    invoke-static/range {v2 .. v7}, Lgc/b;->E([Ljava/lang/Object;LS3/e;Ltf/a;LN/o;II)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v5

    check-cast v2, LN/V;

    .line 46
    invoke-static {v13, v6}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    move-result-object v3

    .line 47
    invoke-static {v14, v6}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    move-result-object v4

    const v5, -0x2f54658e

    .line 48
    invoke-virtual {v6, v5}, LN/o;->M(I)V

    invoke-virtual {v6, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v7, v28

    invoke-virtual {v6, v7}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v6, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v6, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    move-object/from16 v21, v2

    move-object/from16 v2, v29

    invoke-virtual {v6, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    move-object/from16 v2, v27

    invoke-virtual {v6, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v6, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v6, v4}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    move-object/from16 v20, v2

    .line 49
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v2

    if-nez v5, :cond_1c

    if-ne v2, v9, :cond_1d

    .line 50
    :cond_1c
    new-instance v18, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v23, v7

    move-object/from16 v22, v10

    move-object/from16 v19, v15

    move-object/from16 v24, v29

    invoke-direct/range {v18 .. v26}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;LKd/a;LN/V;LN/V;LN/V;LN/V;LN/V;LN/V;)V

    move-object/from16 v2, v18

    .line 51
    invoke-virtual {v6, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 52
    :cond_1d
    check-cast v2, Ltf/l;

    const/4 v10, 0x0

    .line 53
    invoke-virtual {v6, v10}, LN/o;->p(Z)V

    .line 54
    invoke-static {v15, v2, v6}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 55
    sget-object v2, Lef/C;->a:Lef/C;

    const v3, -0x2f53d5ec

    invoke-virtual {v6, v3}, LN/o;->M(I)V

    invoke-virtual {v6, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    .line 56
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1e

    if-ne v4, v9, :cond_1f

    .line 57
    :cond_1e
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/a0;

    const/4 v3, 0x0

    invoke-direct {v4, v15, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/a0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;Ljf/c;)V

    .line 58
    invoke-virtual {v6, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 59
    :cond_1f
    check-cast v4, Ltf/p;

    const/4 v10, 0x0

    .line 60
    invoke-virtual {v6, v10}, LN/o;->p(Z)V

    .line 61
    invoke-static {v6, v2, v4}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    const v2, -0x2f53a8ed

    .line 62
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    invoke-virtual {v6, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v6, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v6, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 63
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_21

    if-ne v3, v9, :cond_20

    goto :goto_d

    :cond_20
    move-object v7, v1

    move-object v10, v8

    move-object v8, v0

    goto :goto_e

    .line 64
    :cond_21
    :goto_d
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/c0;

    const/4 v5, 0x0

    move-object/from16 v4, p2

    move-object v2, v1

    move-object v3, v8

    move-object v1, v15

    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/c0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;Ljf/c;)V

    move-object v7, v2

    move-object v10, v3

    move-object v8, v4

    .line 65
    invoke-virtual {v6, v0}, LN/o;->U(Ljava/lang/Object;)V

    move-object v3, v0

    .line 66
    :goto_e
    check-cast v3, Ltf/p;

    const/4 v0, 0x0

    .line 67
    invoke-virtual {v6, v0}, LN/o;->p(Z)V

    .line 68
    invoke-static {v15, v7, v10, v3, v6}, LN/d;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    const v0, -0x2f5367d2

    .line 69
    invoke-virtual {v6, v0}, LN/o;->M(I)V

    invoke-virtual {v6, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v6, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 70
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    if-ne v1, v9, :cond_23

    .line 71
    :cond_22
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/e0;

    const/4 v3, 0x0

    invoke-direct {v1, v15, v8, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/e0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;Ljf/c;)V

    .line 72
    invoke-virtual {v6, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 73
    :cond_23
    check-cast v1, Ltf/p;

    const/4 v0, 0x0

    .line 74
    invoke-virtual {v6, v0}, LN/o;->p(Z)V

    .line 75
    invoke-static {v15, v8, v1, v6}, LN/d;->f(Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    .line 76
    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v1, -0x2f5351da

    invoke-virtual {v6, v1}, LN/o;->M(I)V

    invoke-virtual {v6, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v2, p4

    invoke-virtual {v6, v2}, LN/o;->f(Z)Z

    move-result v3

    or-int/2addr v1, v3

    .line 77
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_24

    if-ne v3, v9, :cond_25

    .line 78
    :cond_24
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/g0;

    const/4 v1, 0x0

    invoke-direct {v3, v15, v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/g0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;ZLjf/c;)V

    .line 79
    invoke-virtual {v6, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 80
    :cond_25
    check-cast v3, Ltf/p;

    const/4 v1, 0x0

    .line 81
    invoke-virtual {v6, v1}, LN/o;->p(Z)V

    .line 82
    invoke-static {v15, v0, v3, v6}, LN/d;->f(Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    .line 83
    iget-object v0, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 84
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->l:Ls6/C;

    if-nez v0, :cond_26

    goto :goto_f

    :cond_26
    const v1, -0x72f18079

    invoke-virtual {v6, v1}, LN/o;->M(I)V

    invoke-virtual {v6, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    .line 85
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_27

    if-ne v3, v9, :cond_28

    .line 86
    :cond_27
    new-instance v3, LAf/r;

    const/16 v1, 0x18

    invoke-direct {v3, v0, v1}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 87
    invoke-virtual {v6, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 88
    :cond_28
    move-object v0, v3

    check-cast v0, Ltf/l;

    const/4 v1, 0x0

    .line 89
    invoke-virtual {v6, v1}, LN/o;->p(Z)V

    shl-int/lit8 v1, v16, 0x3

    and-int/lit8 v4, v1, 0x70

    const/4 v2, 0x0

    const/4 v5, 0x4

    move-object/from16 v1, p10

    move-object v3, v6

    .line 90
    invoke-static/range {v0 .. v5}, La/a;->c(Ltf/l;LZ/k;LM0/m;LN/o;II)V

    .line 91
    :goto_f
    invoke-virtual/range {p11 .. p11}, LN/o;->r()LN/i0;

    move-result-object v15

    if-eqz v15, :cond_29

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/W;

    move/from16 v2, p1

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object v1, v7

    move-object v3, v8

    move-object v4, v10

    move-object v7, v11

    move-object v8, v12

    move-object v9, v13

    move-object v10, v14

    move-object/from16 v11, p10

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/W;-><init>(Ljava/lang/String;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;ZLtf/l;Ltf/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Ltf/l;Ltf/l;LZ/k;I)V

    .line 92
    iput-object v0, v15, LN/i0;->d:Ltf/p;

    :cond_29
    return-void
.end method
