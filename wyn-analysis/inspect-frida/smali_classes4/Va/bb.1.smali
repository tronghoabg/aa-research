.class public final LVa/bb;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final synthetic a:LVa/cb;


# direct methods
.method public constructor <init>(LVa/cb;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/bb;->a:LVa/cb;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LVa/bb;->a:LVa/cb;

    .line 2
    .line 3
    sget v1, LVa/cb;->g:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x41

    .line 6
    .line 7
    rem-int/lit16 v2, v1, 0x80

    .line 8
    .line 9
    sput v2, LVa/cb;->f:I

    .line 10
    .line 11
    rem-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LVa/cb;->x(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    throw p1
.end method
