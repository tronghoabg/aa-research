.class public final LD9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LE9/c;


# direct methods
.method public static a(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Landroid/graphics/Point;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "window"

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroid/view/WindowManager;

    .line 34
    .line 35
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 40
    .line 41
    .line 42
    iget p0, v1, Landroid/graphics/Rect;->top:I

    .line 43
    .line 44
    iput p0, v0, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    iget p0, v1, Landroid/graphics/Rect;->left:I

    .line 47
    .line 48
    iput p0, v0, Landroid/graphics/Rect;->left:I

    .line 49
    .line 50
    iget p0, v2, Landroid/graphics/Point;->x:I

    .line 51
    .line 52
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 53
    .line 54
    sub-int/2addr p0, v3

    .line 55
    iput p0, v0, Landroid/graphics/Rect;->right:I

    .line 56
    .line 57
    iget p0, v2, Landroid/graphics/Point;->y:I

    .line 58
    .line 59
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    sub-int/2addr p0, v1

    .line 62
    iput p0, v0, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    return-object v0
.end method
