.class public final Lu0/l;
.super Lk1/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lt0/t;

.field public final synthetic e:Lu0/n;

.field public final synthetic f:Lu0/n;


# direct methods
.method public constructor <init>(Lt0/t;Lu0/n;Lu0/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/l;->d:Lt0/t;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/l;->e:Lu0/n;

    .line 4
    .line 5
    iput-object p3, p0, Lu0/l;->f:Lu0/n;

    .line 6
    .line 7
    invoke-direct {p0}, Lk1/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Ll1/e;)V
    .locals 4

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk1/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    iget-object v1, p2, Ll1/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lu0/l;->d:Lt0/t;

    .line 14
    .line 15
    invoke-static {p1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lx0/h;->j()Lx0/g;

    .line 23
    .line 24
    .line 25
    iget-object v0, p1, LX0/E;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LZ/j;

    .line 28
    .line 29
    check-cast v0, Lx0/i;

    .line 30
    .line 31
    check-cast v0, Lx0/j;

    .line 32
    .line 33
    iget v0, v0, Lx0/j;->a:I

    .line 34
    .line 35
    iget-object p1, p1, LX0/E;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lt0/y;

    .line 38
    .line 39
    iget-object p1, p1, Lt0/y;->e:Lt0/t;

    .line 40
    .line 41
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    const/4 v0, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-static {p1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move v3, v2

    .line 58
    :goto_1
    if-eqz v3, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object p1, v0

    .line 67
    :goto_2
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    move-object p1, v0

    .line 75
    :goto_3
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    new-instance v0, Lx0/k;

    .line 79
    .line 80
    invoke-direct {v0, p1, v2}, Lx0/k;-><init>(Lx0/h;Z)V

    .line 81
    .line 82
    .line 83
    :goto_4
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lu0/l;->e:Lu0/n;

    .line 87
    .line 88
    invoke-virtual {p1}, Lu0/n;->getSemanticsOwner()Lx0/l;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lx0/l;->a()Lx0/k;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget p1, p1, Lx0/k;->f:I

    .line 97
    .line 98
    iget v0, v0, Lx0/k;->f:I

    .line 99
    .line 100
    if-ne v0, p1, :cond_5

    .line 101
    .line 102
    const/4 v0, -0x1

    .line 103
    :cond_5
    iget-object p1, p0, Lu0/l;->f:Lu0/n;

    .line 104
    .line 105
    iput v0, p2, Ll1/e;->b:I

    .line 106
    .line 107
    invoke-virtual {v1, p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
