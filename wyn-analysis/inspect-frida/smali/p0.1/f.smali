.class public final Lp0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:LE5/b;

.field public c:I


# direct methods
.method public constructor <init>(Ljava/util/List;LE5/b;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/f;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lp0/f;->b:LE5/b;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object v1, p2, LE5/b;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LY2/B;

    .line 14
    .line 15
    iget-object v1, v1, LY2/B;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/view/MotionEvent;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v0

    .line 21
    :goto_0
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 25
    .line 26
    .line 27
    :cond_1
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object v1, p2, LE5/b;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, LY2/B;

    .line 32
    .line 33
    iget-object v1, v1, LY2/B;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Landroid/view/MotionEvent;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v1, v0

    .line 39
    :goto_1
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 42
    .line 43
    .line 44
    :cond_3
    if-eqz p2, :cond_4

    .line 45
    .line 46
    iget-object p2, p2, LE5/b;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, LY2/B;

    .line 49
    .line 50
    iget-object p2, p2, LY2/B;->c:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v0, p2

    .line 53
    check-cast v0, Landroid/view/MotionEvent;

    .line 54
    .line 55
    :cond_4
    const/4 p2, 0x1

    .line 56
    const/4 v1, 0x3

    .line 57
    const/4 v3, 0x2

    .line 58
    if-eqz v0, :cond_8

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_7

    .line 65
    .line 66
    if-eq p1, p2, :cond_6

    .line 67
    .line 68
    if-eq p1, v3, :cond_5

    .line 69
    .line 70
    packed-switch p1, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    goto :goto_5

    .line 74
    :pswitch_0
    const/4 v2, 0x5

    .line 75
    goto :goto_5

    .line 76
    :pswitch_1
    const/4 v2, 0x4

    .line 77
    goto :goto_5

    .line 78
    :pswitch_2
    const/4 v2, 0x6

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    :pswitch_3
    move v2, v1

    .line 81
    goto :goto_5

    .line 82
    :cond_6
    :goto_2
    :pswitch_4
    move v2, v3

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    :goto_3
    :pswitch_5
    move v2, p2

    .line 85
    goto :goto_5

    .line 86
    :cond_8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_4
    if-ge v2, v0, :cond_5

    .line 91
    .line 92
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Lp0/k;

    .line 97
    .line 98
    invoke-static {v4}, Landroid/support/v4/media/session/b;->P(Lp0/k;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_9

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_9
    invoke-static {v4}, Landroid/support/v4/media/session/b;->N(Lp0/k;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_a

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :goto_5
    iput v2, p0, Lp0/f;->c:I

    .line 116
    .line 117
    return-void

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
