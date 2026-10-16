.class public final Lcom/moloco/sdk/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v;
.implements Ln3/f;


# instance fields
.field public final a:Landroidx/lifecycle/x;

.field public final b:Ln3/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/x;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/v;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/moloco/sdk/internal/b;->a:Landroidx/lifecycle/x;

    .line 10
    .line 11
    new-instance v0, Ln3/e;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ln3/e;-><init>(Ln3/f;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/moloco/sdk/internal/b;->b:Ln3/e;

    .line 17
    .line 18
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/b;Landroid/widget/FrameLayout;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 11
    .line 12
    const/16 v5, 0xc

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const-string v1, "ViewLifecycleOwner"

    .line 16
    .line 17
    const-string v2, "RootView is absent, skipping"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {p1}, Ltg/b;->y(Landroid/view/View;)Ln3/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-static {p1, p0}, Ltg/b;->O(Landroid/view/View;Ln3/f;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/b;->b:Ln3/e;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Ln3/e;->b(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 46
    .line 47
    const/16 v6, 0xc

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const-string v2, "ViewLifecycleOwner"

    .line 51
    .line 52
    const-string v3, "ViewTreeSavedStateRegistryOwner is absent, setting custom one"

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-static {p1}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    invoke-static {p1, p0}, Landroidx/lifecycle/V;->h(Landroid/view/View;Landroidx/lifecycle/v;)V

    .line 66
    .line 67
    .line 68
    sget-object p1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 69
    .line 70
    iget-object p0, p0, Lcom/moloco/sdk/internal/b;->a:Landroidx/lifecycle/x;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 86
    .line 87
    const/16 v5, 0xc

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    const-string v1, "ViewLifecycleOwner"

    .line 91
    .line 92
    const-string v2, "ViewTreeLifecycleOwner is absent, setting custom one"

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/b;->a:Landroidx/lifecycle/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSavedStateRegistry()Ln3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/b;->b:Ln3/e;

    .line 2
    .line 3
    iget-object v0, v0, Ln3/e;->b:Ln3/d;

    .line 4
    .line 5
    return-object v0
.end method
