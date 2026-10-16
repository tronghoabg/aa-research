.class public final LA/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/B;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LA/X;->a:I

    iput-object p1, p0, LA/X;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 5

    .line 1
    iget v0, p0, LA/X;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu0/O;

    .line 9
    .line 10
    iget-object v0, v0, Lu0/O;->a:Lu0/P;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu0/P;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LN/p;

    .line 19
    .line 20
    invoke-interface {v0}, LN/p;->dispose()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Le/b;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/activity/o;->e()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/webkit/WebView;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    check-cast v1, Landroid/view/ViewGroup;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    :goto_0
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :pswitch_3
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 57
    .line 58
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/b;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/e;)LEf/H0;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, LG9/e;

    .line 67
    .line 68
    invoke-virtual {v0}, LG9/e;->H()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_5
    iget-object v0, p0, LA/X;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, LA/U;

    .line 75
    .line 76
    const-wide/high16 v1, -0x8000000000000000L

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v2, v0, LA/U;->f:LN/Y;

    .line 83
    .line 84
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, LA/U;->c:LN/Y;

    .line 88
    .line 89
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v2, v0, LA/U;->a:LS3/c;

    .line 94
    .line 95
    iget-object v3, v2, LS3/c;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, LN/Y;

    .line 98
    .line 99
    invoke-virtual {v3, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-wide/16 v3, 0x0

    .line 103
    .line 104
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v0, v0, LA/U;->e:LN/Y;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 114
    .line 115
    iget-object v1, v2, LS3/c;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, LN/Y;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
