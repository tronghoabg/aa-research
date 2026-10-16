.class public final LA/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/B;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/V;->a:I

    iput-object p2, p0, LA/V;->b:Ljava/lang/Object;

    iput-object p3, p0, LA/V;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 3

    .line 1
    iget-object v0, p0, LA/V;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LA/V;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, LA/V;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v0, Lu0/y;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast v1, Landroidx/lifecycle/v;

    .line 23
    .line 24
    invoke-interface {v1}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/g;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    check-cast v1, Landroidx/lifecycle/v;

    .line 35
    .line 36
    invoke-interface {v1}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/g;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_2
    check-cast v1, LG/e;

    .line 47
    .line 48
    iget-object v1, v1, LG/e;->a:LP/d;

    .line 49
    .line 50
    check-cast v0, LG/g;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, LP/d;->k(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_3
    check-cast v1, LE/S;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v2, "view"

    .line 62
    .line 63
    check-cast v0, Landroid/view/View;

    .line 64
    .line 65
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget v2, v1, LE/S;->q:I

    .line 69
    .line 70
    add-int/lit8 v2, v2, -0x1

    .line 71
    .line 72
    iput v2, v1, LE/S;->q:I

    .line 73
    .line 74
    if-nez v2, :cond_0

    .line 75
    .line 76
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-static {v0, v2}, Lk1/J;->l(Landroid/view/View;Lk1/r;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v2}, Lk1/S;->o(Landroid/view/View;LYf/f;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, v1, LE/S;->r:LE/z;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    return-void

    .line 91
    :pswitch_4
    check-cast v1, LA/U;

    .line 92
    .line 93
    const-string v2, "animation"

    .line 94
    .line 95
    check-cast v0, LA/O;

    .line 96
    .line 97
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v1, LA/U;->h:LX/p;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_5
    check-cast v1, LA/U;

    .line 107
    .line 108
    check-cast v0, LA/M;

    .line 109
    .line 110
    const-string v2, "deferredAnimation"

    .line 111
    .line 112
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, LA/M;->c:LS3/i;

    .line 116
    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    iget-object v0, v0, LS3/i;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, LA/O;

    .line 122
    .line 123
    iget-object v1, v1, LA/U;->h:LX/p;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_1
    return-void

    .line 129
    :pswitch_6
    check-cast v1, LA/U;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const-string v2, "transition"

    .line 135
    .line 136
    check-cast v0, LA/U;

    .line 137
    .line 138
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, v1, LA/U;->i:LX/p;

    .line 142
    .line 143
    invoke-virtual {v1, v0}, LX/p;->remove(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
