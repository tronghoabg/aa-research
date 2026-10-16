.class public final synthetic Lzb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzb/b;->a:I

    iput-object p1, p0, Lzb/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lzb/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzb/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcc/c;

    .line 9
    .line 10
    iget-object v1, v0, Lcc/c;->c:Landroid/view/WindowManager$LayoutParams;

    .line 11
    .line 12
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 13
    .line 14
    iget v3, v0, Lcc/c;->a:I

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    const/4 v4, 0x2

    .line 18
    mul-int/2addr v2, v4

    .line 19
    div-int/lit8 v2, v2, 0x3

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 23
    .line 24
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 25
    .line 26
    iget v5, v0, Lcc/c;->b:I

    .line 27
    .line 28
    sub-int/2addr v2, v5

    .line 29
    mul-int/2addr v2, v4

    .line 30
    div-int/lit8 v2, v2, 0x3

    .line 31
    .line 32
    add-int/2addr v2, v5

    .line 33
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 34
    .line 35
    iget-object v2, v0, Lcc/c;->d:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 36
    .line 37
    iget-object v6, v2, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 38
    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    iget-object v7, v2, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 42
    .line 43
    invoke-interface {v6, v7, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget v6, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 47
    .line 48
    sub-int/2addr v6, v3

    .line 49
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ge v3, v4, :cond_1

    .line 54
    .line 55
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 56
    .line 57
    sub-int/2addr v1, v5

    .line 58
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v1, v4, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 65
    .line 66
    .line 67
    iget-object v0, v2, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->o:Ljava/util/Timer;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :pswitch_0
    iget-object v0, p0, Lzb/b;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/vungle/ads/internal/w2;

    .line 76
    .line 77
    invoke-static {v0}, Lcom/vungle/ads/internal/w2;->a(Lcom/vungle/ads/internal/w2;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
