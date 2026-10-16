.class public final Lcc/c;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic d:Lflutter/overlay/window/flutter_overlay_window/OverlayService;


# direct methods
.method public constructor <init>(Lflutter/overlay/window/flutter_overlay_window/OverlayService;)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    iput-object p1, p0, Lcc/c;->d:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    iput-object v2, p0, Lcc/c;->c:Landroid/view/WindowManager$LayoutParams;

    .line 17
    .line 18
    iget-object v3, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 19
    .line 20
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->n:Landroid/graphics/Point;

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 27
    .line 28
    .line 29
    iget v3, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->l:I

    .line 30
    .line 31
    iput v3, p0, Lcc/c;->b:I

    .line 32
    .line 33
    sget-object v3, LS3/f;->i:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v5, -0x1

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    sparse-switch v6, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_0
    const-string v6, "right"

    .line 48
    .line 49
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v5, v0

    .line 57
    goto :goto_0

    .line 58
    :sswitch_1
    const-string v6, "left"

    .line 59
    .line 60
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v5, 0x1

    .line 68
    goto :goto_0

    .line 69
    :sswitch_2
    const-string v6, "auto"

    .line 70
    .line 71
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v5, v1

    .line 79
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    iget p1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 83
    .line 84
    iput p1, p0, Lcc/c;->a:I

    .line 85
    .line 86
    iget p1, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 87
    .line 88
    iput p1, p0, Lcc/c;->b:I

    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_0
    iget v0, v4, Landroid/graphics/Point;->x:I

    .line 92
    .line 93
    iget-object p1, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    sub-int/2addr v0, p1

    .line 100
    iput v0, p0, Lcc/c;->a:I

    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_1
    iput v1, p0, Lcc/c;->a:I

    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_2
    iget-object v1, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget-object p1, p1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 119
    .line 120
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 121
    .line 122
    sub-int/2addr v5, v1

    .line 123
    div-int/2addr v5, v0

    .line 124
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 129
    .line 130
    sub-int/2addr v1, v5

    .line 131
    div-int/2addr v1, v0

    .line 132
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    iput v1, p0, Lcc/c;->a:I

    .line 137
    .line 138
    iget v1, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 139
    .line 140
    iget v2, v4, Landroid/graphics/Point;->y:I

    .line 141
    .line 142
    sub-int/2addr v2, p1

    .line 143
    div-int/2addr v2, v0

    .line 144
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    iget v2, v4, Landroid/graphics/Point;->y:I

    .line 149
    .line 150
    sub-int/2addr p1, v2

    .line 151
    div-int/2addr p1, v0

    .line 152
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    iput p1, p0, Lcc/c;->b:I

    .line 157
    .line 158
    return-void

    .line 159
    :sswitch_data_0
    .sparse-switch
        0x2dddaf -> :sswitch_2
        0x32a007 -> :sswitch_1
        0x677c21c -> :sswitch_0
    .end sparse-switch

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcc/c;->d:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 2
    .line 3
    iget-object v0, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->i:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lzb/b;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, Lzb/b;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
