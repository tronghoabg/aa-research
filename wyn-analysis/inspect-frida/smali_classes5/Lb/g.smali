.class public final synthetic LLb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LLb/g;->a:I

    iput-object p1, p0, LLb/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget v0, p0, LLb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/vungle/ads/internal/r1;

    .line 9
    .line 10
    invoke-static {v0, p1, p2}, Lcom/vungle/ads/internal/r1;->a(Lcom/vungle/ads/internal/r1;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object p1, p0, LLb/g;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lf8/j;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne p2, v1, :cond_3

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    iget-wide v4, p1, Lf8/j;->o:J

    .line 35
    .line 36
    sub-long/2addr v2, v4

    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    cmp-long p2, v2, v4

    .line 40
    .line 41
    if-ltz p2, :cond_1

    .line 42
    .line 43
    const-wide/16 v4, 0x12c

    .line 44
    .line 45
    cmp-long p2, v2, v4

    .line 46
    .line 47
    if-lez p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p2, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    move p2, v1

    .line 53
    :goto_1
    if-eqz p2, :cond_2

    .line 54
    .line 55
    iput-boolean v0, p1, Lf8/j;->m:Z

    .line 56
    .line 57
    :cond_2
    invoke-virtual {p1}, Lf8/j;->u()V

    .line 58
    .line 59
    .line 60
    iput-boolean v1, p1, Lf8/j;->m:Z

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    iput-wide v1, p1, Lf8/j;->o:J

    .line 67
    .line 68
    :cond_3
    return v0

    .line 69
    :pswitch_1
    iget-object v0, p0, LLb/g;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;

    .line 72
    .line 73
    invoke-static {v0, p1, p2}, Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;->a(Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :pswitch_2
    iget-object v0, p0, LLb/g;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lcom/bytedance/sdk/openadsdk/common/tpx;

    .line 81
    .line 82
    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/common/tpx;->e(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1

    .line 87
    :pswitch_3
    iget-object v0, p0, LLb/g;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lcom/vungle/ads/internal/ui/view/k;

    .line 90
    .line 91
    invoke-static {v0, p1, p2}, Lcom/vungle/ads/internal/ui/view/k;->a(Lcom/vungle/ads/internal/ui/view/k;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
