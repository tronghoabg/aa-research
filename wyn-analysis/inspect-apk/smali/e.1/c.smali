.class public abstract Le/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le/c;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroidx/activity/ComponentActivity;LV/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x1020002

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Lu0/L;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Lu0/L;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v2

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Lu0/a;->setParentCompositionContext(LN/q;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lu0/L;->setContent(Ltf/p;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v0, Lu0/L;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lu0/L;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Lu0/a;->setParentCompositionContext(LN/q;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lu0/L;->setContent(Ltf/p;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-static {p1, p0}, Landroidx/lifecycle/V;->h(Landroid/view/View;Landroidx/lifecycle/v;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    sget-object v1, Landroidx/lifecycle/g0;->l:Landroidx/lifecycle/g0;

    .line 70
    .line 71
    invoke-static {p1, v1}, LAf/n;->a0(Ljava/lang/Object;Ltf/l;)LAf/k;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v2, Landroidx/lifecycle/g0;->m:Landroidx/lifecycle/g0;

    .line 76
    .line 77
    invoke-static {v1, v2}, LAf/n;->d0(LAf/k;Ltf/l;)LAf/g;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroidx/lifecycle/f0;

    .line 86
    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    invoke-static {p1, p0}, Landroidx/lifecycle/V;->i(Landroid/view/View;Landroidx/lifecycle/f0;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-static {p1}, Ltg/b;->y(Landroid/view/View;)Ln3/f;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-nez v1, :cond_4

    .line 97
    .line 98
    invoke-static {p1, p0}, Ltg/b;->O(Landroid/view/View;Ln3/f;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    sget-object p1, Le/c;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 102
    .line 103
    invoke-virtual {p0, v0, p1}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method
