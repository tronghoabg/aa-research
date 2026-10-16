.class public final Lcom/moloco/sdk/internal/publisher/T;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Landroid/view/MotionEvent;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

.field public final synthetic d:Lcom/moloco/sdk/internal/publisher/V;

.field public final synthetic e:LHf/j0;


# direct methods
.method public constructor <init>(Landroid/view/MotionEvent;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;Lcom/moloco/sdk/internal/publisher/V;LHf/j0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/T;->b:Landroid/view/MotionEvent;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/T;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/T;->d:Lcom/moloco/sdk/internal/publisher/V;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/T;->e:LHf/j0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/T;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/T;->e:LHf/j0;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/T;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/T;->b:Landroid/view/MotionEvent;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/T;->d:Lcom/moloco/sdk/internal/publisher/V;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/publisher/T;-><init>(Landroid/view/MotionEvent;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;Lcom/moloco/sdk/internal/publisher/V;LHf/j0;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/T;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/T;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/T;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v5, Lcom/moloco/sdk/internal/publisher/T;->a:I

    .line 6
    .line 7
    sget-object v7, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v7

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v5, Lcom/moloco/sdk/internal/publisher/T;->b:Landroid/view/MotionEvent;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    iget-object v2, v5, Lcom/moloco/sdk/internal/publisher/T;->d:Lcom/moloco/sdk/internal/publisher/V;

    .line 34
    .line 35
    move-object v3, v0

    .line 36
    iget-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->l:Lcom/moloco/sdk/internal/services/B;

    .line 37
    .line 38
    iget-object v4, v2, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 39
    .line 40
    iget-object v8, v4, LR0/e;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v4, LR0/e;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    iput v1, v5, Lcom/moloco/sdk/internal/publisher/T;->a:I

    .line 49
    .line 50
    sget v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;->a:I

    .line 51
    .line 52
    sget-object v1, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 53
    .line 54
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/moloco/sdk/internal/B;

    .line 59
    .line 60
    iget-object v9, v5, Lcom/moloco/sdk/internal/publisher/T;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getAction()I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_3

    .line 67
    .line 68
    const/4 v10, 0x2

    .line 69
    new-array v10, v10, [I

    .line 70
    .line 71
    invoke-virtual {v9, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 72
    .line 73
    .line 74
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;

    .line 75
    .line 76
    invoke-static {v10}, Lff/m;->t0([I)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    invoke-static {v10}, Lff/m;->B0([I)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v15

    .line 92
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    move-object/from16 p1, v0

    .line 97
    .line 98
    invoke-static {v10}, Lff/m;->t0([I)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    int-to-float v0, v0

    .line 103
    add-float/2addr v9, v0

    .line 104
    float-to-int v0, v9

    .line 105
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getY()F

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-static {v10}, Lff/m;->B0([I)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    int-to-float v9, v9

    .line 114
    add-float/2addr v3, v9

    .line 115
    float-to-int v3, v3

    .line 116
    move/from16 v16, v0

    .line 117
    .line 118
    move/from16 v17, v3

    .line 119
    .line 120
    invoke-direct/range {v11 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;-><init>(IIIIII)V

    .line 121
    .line 122
    .line 123
    if-eqz v8, :cond_2

    .line 124
    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 126
    .line 127
    .line 128
    move-result-wide v9

    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-virtual {v1, v8, v9, v10, v0}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 131
    .line 132
    .line 133
    :cond_2
    if-eqz v4, :cond_3

    .line 134
    .line 135
    move-object v1, v4

    .line 136
    iget-object v4, v5, Lcom/moloco/sdk/internal/publisher/T;->e:LHf/j0;

    .line 137
    .line 138
    iget-object v3, v2, Lcom/moloco/sdk/internal/publisher/V;->u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 139
    .line 140
    move-object/from16 v0, p1

    .line 141
    .line 142
    move-object v2, v11

    .line 143
    invoke-virtual/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/B;->a(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;LHf/j0;Llf/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v6, :cond_3

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_3
    move-object v0, v7

    .line 151
    :goto_0
    if-ne v0, v6, :cond_4

    .line 152
    .line 153
    return-object v6

    .line 154
    :cond_4
    return-object v7
.end method
