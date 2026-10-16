.class public final Lcom/moloco/sdk/internal/publisher/nativead/ui/g;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

.field public final b:Lcom/moloco/sdk/internal/b;

.field public c:Lu0/L;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Lcom/moloco/sdk/internal/b;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LS8/d;)V
    .locals 1

    .line 1
    const-string v0, "vastAdController"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->b:Lcom/moloco/sdk/internal/b;

    .line 12
    .line 13
    new-instance p2, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;

    .line 14
    .line 15
    invoke-direct {p2, p5, p0, p6, p3}, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/internal/publisher/nativead/ui/g;LS8/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V

    .line 16
    .line 17
    .line 18
    new-instance p3, LV/d;

    .line 19
    .line 20
    const p4, 0x6f487f35

    .line 21
    .line 22
    .line 23
    const/4 p5, 0x1

    .line 24
    invoke-direct {p3, p4, p5, p2}, LV/d;-><init>(IZLef/e;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lu0/L;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lu0/L;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;

    .line 33
    .line 34
    const/4 p4, 0x1

    .line 35
    invoke-direct {p1, p3, p4}, Lcom/moloco/sdk/internal/publisher/nativead/ui/d;-><init>(LV/d;I)V

    .line 36
    .line 37
    .line 38
    new-instance p3, LV/d;

    .line 39
    .line 40
    const p4, 0x6f785523

    .line 41
    .line 42
    .line 43
    invoke-direct {p3, p4, p5, p1}, LV/d;-><init>(IZLef/e;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p3}, Lu0/L;->setContent(Ltf/p;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 50
    .line 51
    const/4 p3, -0x1

    .line 52
    invoke-direct {p1, p3, p3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->c:Lu0/L;

    .line 59
    .line 60
    return-void
.end method

.method public static synthetic getVideoView$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getVideoView()Lu0/L;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->c:Lu0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v1, "VideoContainer"

    .line 9
    .line 10
    const-string v2, "onAttachedToWindow"

    .line 11
    .line 12
    const/16 v5, 0xc

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->b:Lcom/moloco/sdk/internal/b;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, LBf/g;

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    invoke-direct {v1, v2, p0, v0}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lcom/moloco/sdk/internal/scheduling/c;->a:LKd/a;

    .line 30
    .line 31
    new-instance v0, Lcom/moloco/sdk/internal/scheduling/b;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/scheduling/b;-><init>(Ltf/a;Ljf/c;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    sget-object v3, Lcom/moloco/sdk/internal/scheduling/c;->a:LKd/a;

    .line 39
    .line 40
    invoke-static {v3, v2, v0, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 5
    .line 6
    const/16 v5, 0xc

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const-string v1, "VideoContainer"

    .line 10
    .line 11
    const-string v2, "onDetachedFromWindow"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v7, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->b:Lcom/moloco/sdk/internal/b;

    .line 19
    .line 20
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    if-nez v8, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const-string v1, "ViewLifecycleOwner"

    .line 32
    .line 33
    const-string v2, "RootView is absent, skipping"

    .line 34
    .line 35
    const/16 v5, 0xc

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-static {v8}, Ltg/b;->y(Landroid/view/View;)Ln3/f;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v9, 0x0

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const-string v1, "ViewLifecycleOwner"

    .line 56
    .line 57
    const-string v2, "Removing ViewTreeSavedStateRegistryOwner"

    .line 58
    .line 59
    const/16 v5, 0xc

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v8, v9}, Ltg/b;->O(Landroid/view/View;Ln3/f;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-static {v8}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x0

    .line 80
    const-string v1, "ViewLifecycleOwner"

    .line 81
    .line 82
    const-string v2, "Removing ViewTreeLifecycleOwner"

    .line 83
    .line 84
    const/16 v5, 0xc

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v8, v9}, Landroidx/lifecycle/V;->h(Landroid/view/View;Landroidx/lifecycle/v;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 17

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->b:Lcom/moloco/sdk/internal/b;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    :try_start_0
    iget-object v2, v2, Lcom/moloco/sdk/internal/b;->a:Landroidx/lifecycle/x;

    .line 33
    .line 34
    sget-object v3, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    instance-of v2, v0, Lef/m;

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    check-cast v2, Lef/C;

    .line 51
    .line 52
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 53
    .line 54
    const/16 v8, 0xc

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const-string v4, "ViewLifecycleOwner"

    .line 58
    .line 59
    const-string v5, "lifecycle resume success"

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    if-eqz v13, :cond_2

    .line 71
    .line 72
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 73
    .line 74
    const/16 v15, 0x8

    .line 75
    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const-string v11, "ViewLifecycleOwner"

    .line 79
    .line 80
    const-string v12, "lifecycle resume failure"

    .line 81
    .line 82
    const/4 v14, 0x0

    .line 83
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v3}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    :try_start_1
    iget-object v2, v2, Lcom/moloco/sdk/internal/b;->a:Landroidx/lifecycle/x;

    .line 108
    .line 109
    sget-object v3, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_1
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v4, "lifecycle pause success "

    .line 125
    .line 126
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    instance-of v4, v0, Lef/m;

    .line 130
    .line 131
    xor-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const/16 v7, 0x8

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    const-string v3, "ViewLifecycleOwner"

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_2
    :goto_2
    return-void
.end method

.method public final setVideoView(Lu0/L;)V
    .locals 0
    .param p1    # Lu0/L;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->c:Lu0/L;

    .line 2
    .line 3
    return-void
.end method
