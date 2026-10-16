.class public final LM0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# instance fields
.field public final synthetic a:LM0/o;

.field public final synthetic b:Lt0/t;


# direct methods
.method public constructor <init>(LM0/o;Lt0/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM0/b;->a:LM0/o;

    .line 5
    .line 6
    iput-object p2, p0, LM0/b;->b:Lt0/t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 3

    .line 1
    const-string p2, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, LM0/b;->a:LM0/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p2, v2}, Landroid/view/View;->setMinimumWidth(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p2, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0}, LM0/i;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 59
    .line 60
    invoke-static {v0, p2, v1, v2}, LM0/i;->g(LM0/o;III)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    invoke-virtual {v0}, LM0/i;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    invoke-static {p4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget p4, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 80
    .line 81
    invoke-static {v0, v1, p3, p4}, LM0/i;->g(LM0/o;III)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    invoke-virtual {v0, p2, p3}, Landroid/view/View;->measure(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    new-instance p4, LM0/a;

    .line 97
    .line 98
    iget-object v1, p0, LM0/b;->b:Lt0/t;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    invoke-direct {p4, v0, v1, v2}, LM0/a;-><init>(LM0/o;Lt0/t;I)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1
.end method
