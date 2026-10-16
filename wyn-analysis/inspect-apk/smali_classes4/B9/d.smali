.class public final LB9/d;
.super LV4/a;
.source "SourceFile"


# instance fields
.field public d:Landroid/widget/ImageView;

.field public final synthetic e:LE9/c;

.field public final synthetic f:Landroid/app/Activity;

.field public final synthetic g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final synthetic h:LB9/f;


# direct methods
.method public constructor <init>(LB9/f;LE9/c;Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB9/d;->h:LB9/f;

    .line 2
    .line 3
    iput-object p2, p0, LB9/d;->e:LE9/c;

    .line 4
    .line 5
    iput-object p3, p0, LB9/d;->f:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p4, p0, LB9/d;->g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 8
    .line 9
    invoke-direct {p0}, LV4/a;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    const-string v0, "Downloading Image Cleared"

    .line 2
    .line 3
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB9/d;->d:Landroid/widget/ImageView;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, LB9/d;->f()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    const-string v0, "Downloading Image Failed"

    .line 2
    .line 3
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB9/d;->d:Landroid/widget/ImageView;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 14
    .line 15
    const-string v0, "Image loading failed!"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "Image download failure "

    .line 21
    .line 22
    invoke-static {p1}, LD9/e;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LB9/d;->g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LB9/d;->e:LE9/c;

    .line 30
    .line 31
    invoke-virtual {v0}, LE9/c;->i()Landroid/widget/ImageView;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, LB9/d;->h:LB9/f;

    .line 43
    .line 44
    iget-object v0, p1, LB9/f;->d:LY9/c;

    .line 45
    .line 46
    iget-object v1, v0, LY9/c;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Landroid/os/CountDownTimer;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->cancel()V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, LY9/c;->b:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_2
    iget-object v0, p1, LB9/f;->e:LY9/c;

    .line 59
    .line 60
    iget-object v1, v0, LY9/c;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Landroid/os/CountDownTimer;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->cancel()V

    .line 67
    .line 68
    .line 69
    iput-object v2, v0, LY9/c;->b:Ljava/lang/Object;

    .line 70
    .line 71
    :cond_3
    iput-object v2, p1, LB9/f;->j:LN9/h;

    .line 72
    .line 73
    iput-object v2, p1, LB9/f;->k:Lz9/E;

    .line 74
    .line 75
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    const-string v0, "Downloading Image Success!!!"

    .line 4
    .line 5
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LB9/d;->d:Landroid/widget/ImageView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, LB9/d;->f()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, LB9/d;->e:LE9/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LE9/c;->f()LD9/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, LB9/c;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, p0, v3}, LB9/c;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, LB9/d;->h:LB9/f;

    .line 29
    .line 30
    iget-object v2, v1, LB9/f;->d:LY9/c;

    .line 31
    .line 32
    new-instance v3, Lxa/d;

    .line 33
    .line 34
    const/4 v4, 0x5

    .line 35
    invoke-direct {v3, p0, v4}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v4, LD9/l;

    .line 42
    .line 43
    const-wide/16 v5, 0x1388

    .line 44
    .line 45
    invoke-direct {v4, v5, v6, v3}, LD9/l;-><init>(JLD9/m;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, v2, LY9/c;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v0}, LE9/c;->f()LD9/k;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v0, v0, LD9/k;->k:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    new-instance v0, Ly3/j;

    .line 67
    .line 68
    const/4 v2, 0x5

    .line 69
    invoke-direct {v0, p0, v2}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v1, LB9/f;->e:LY9/c;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v2, LD9/l;

    .line 78
    .line 79
    const-wide/16 v3, 0x4e20

    .line 80
    .line 81
    invoke-direct {v2, v3, v4, v0}, LD9/l;-><init>(JLD9/m;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, v1, LY9/c;->b:Ljava/lang/Object;

    .line 89
    .line 90
    :cond_1
    new-instance v0, LA7/V;

    .line 91
    .line 92
    const/4 v1, 0x4

    .line 93
    invoke-direct {v0, p0, v1}, LA7/V;-><init>(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, LB9/d;->f:Landroid/app/Activity;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
