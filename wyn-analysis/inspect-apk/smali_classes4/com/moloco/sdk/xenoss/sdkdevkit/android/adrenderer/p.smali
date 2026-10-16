.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p2, "context"

    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;->a:Landroid/content/Context;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;->a:Landroid/content/Context;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Lcom/moloco/sdk/common_adapter_internal/a;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-class v1, Landroid/view/WindowManager;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY0/e;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/view/WindowManager;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lcom/moloco/sdk/common_adapter_internal/a;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    invoke-direct/range {v2 .. v8}, Lcom/moloco/sdk/common_adapter_internal/a;-><init>(IIFFIF)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v3, 0x1e

    .line 28
    .line 29
    if-lt v2, v3, :cond_1

    .line 30
    .line 31
    new-instance v2, Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 45
    .line 46
    iput v3, v2, Landroid/util/DisplayMetrics;->density:F

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 57
    .line 58
    iput v0, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 59
    .line 60
    invoke-static {v1}, LA7/N0;->x(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, LA7/N0;->g(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 73
    .line 74
    invoke-static {v1}, LA7/N0;->x(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, LA7/N0;->g(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    new-instance v2, Landroid/util/DisplayMetrics;

    .line 90
    .line 91
    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, v2}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    new-instance v3, Lcom/moloco/sdk/common_adapter_internal/a;

    .line 102
    .line 103
    iget v4, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 104
    .line 105
    iget v5, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 106
    .line 107
    iget v9, v2, Landroid/util/DisplayMetrics;->density:F

    .line 108
    .line 109
    int-to-float v0, v4

    .line 110
    div-float v6, v0, v9

    .line 111
    .line 112
    int-to-float v0, v5

    .line 113
    div-float v7, v0, v9

    .line 114
    .line 115
    iget v8, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 116
    .line 117
    invoke-direct/range {v3 .. v9}, Lcom/moloco/sdk/common_adapter_internal/a;-><init>(IIFFIF)V

    .line 118
    .line 119
    .line 120
    return-object v3
.end method
