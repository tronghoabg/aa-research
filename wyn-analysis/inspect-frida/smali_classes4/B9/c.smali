.class public final LB9/c;
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
    iput p2, p0, LB9/c;->a:I

    iput-object p1, p0, LB9/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget p1, p0, LB9/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    float-to-int v0, v0

    .line 15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    float-to-int p2, p2

    .line 20
    iget-object v1, p0, LB9/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lq/F0;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-object v2, v1, Lq/F0;->z:Lq/w;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    if-ltz v0, :cond_0

    .line 37
    .line 38
    iget-object v2, v1, Lq/F0;->z:Lq/w;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ge v0, v2, :cond_0

    .line 45
    .line 46
    if-ltz p2, :cond_0

    .line 47
    .line 48
    iget-object v0, v1, Lq/F0;->z:Lq/w;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ge p2, v0, :cond_0

    .line 55
    .line 56
    iget-object p1, v1, Lq/F0;->v:Landroid/os/Handler;

    .line 57
    .line 58
    iget-object p2, v1, Lq/F0;->r:Lq/C0;

    .line 59
    .line 60
    const-wide/16 v0, 0xfa

    .line 61
    .line 62
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p2, 0x1

    .line 67
    if-ne p1, p2, :cond_1

    .line 68
    .line 69
    iget-object p1, v1, Lq/F0;->v:Landroid/os/Handler;

    .line 70
    .line 71
    iget-object p2, v1, Lq/F0;->r:Lq/C0;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 77
    return p1

    .line 78
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    const/4 p2, 0x4

    .line 83
    if-ne p1, p2, :cond_3

    .line 84
    .line 85
    iget-object p1, p0, LB9/c;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, LB9/d;

    .line 88
    .line 89
    iget-object p2, p1, LB9/d;->h:LB9/f;

    .line 90
    .line 91
    iget-object p2, p2, LB9/f;->k:Lz9/E;

    .line 92
    .line 93
    if-eqz p2, :cond_2

    .line 94
    .line 95
    sget-object v0, Lz9/C;->a:Lz9/C;

    .line 96
    .line 97
    check-cast p2, LJ9/o;

    .line 98
    .line 99
    invoke-virtual {p2, v0}, LJ9/o;->f(Lz9/C;)Lcom/google/android/gms/tasks/Task;

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object p2, p1, LB9/d;->f:Landroid/app/Activity;

    .line 103
    .line 104
    iget-object p1, p1, LB9/d;->h:LB9/f;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const-string v0, "Dismissing fiam"

    .line 110
    .line 111
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2}, LB9/f;->e(Landroid/app/Activity;)V

    .line 115
    .line 116
    .line 117
    const/4 p2, 0x0

    .line 118
    iput-object p2, p1, LB9/f;->j:LN9/h;

    .line 119
    .line 120
    iput-object p2, p1, LB9/f;->k:Lz9/E;

    .line 121
    .line 122
    const/4 p1, 0x1

    .line 123
    goto :goto_1

    .line 124
    :cond_3
    const/4 p1, 0x0

    .line 125
    :goto_1
    return p1

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
