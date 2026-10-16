.class public final Lad/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/e;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lad/Y;->a:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad/Y;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LU1/m;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lad/Y;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lad/Y;->b:Ljava/lang/Object;

    .line 3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne p1, v1, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    new-instance v0, Lid/a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lid/a;-><init>(Ljava/lang/Object;I)V

    .line 5
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    const/4 v2, 0x1

    if-gt p1, v1, :cond_1

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    .line 7
    :cond_1
    check-cast p2, LU1/u;

    .line 8
    invoke-virtual {p2}, LU1/u;->S0()V

    .line 9
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 10
    invoke-virtual {p2}, LU1/u;->S0()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 11
    invoke-virtual {p2}, LU1/u;->S0()V

    .line 12
    invoke-virtual {p2}, LU1/u;->C0()V

    .line 13
    invoke-virtual {p2, v0}, LU1/u;->K0(Landroid/view/Surface;)V

    .line 14
    invoke-virtual {p2, v1, v1}, LU1/u;->y0(II)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p2}, LU1/u;->C0()V

    .line 16
    iput-boolean v2, p2, LU1/u;->Q:Z

    .line 17
    iput-object p1, p2, LU1/u;->P:Landroid/view/SurfaceHolder;

    .line 18
    iget-object v2, p2, LU1/u;->v:LU1/r;

    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 19
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 20
    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 21
    invoke-virtual {p2, v2}, LU1/u;->K0(Landroid/view/Surface;)V

    .line 22
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p2, v0, p1}, LU1/u;->y0(II)V

    goto :goto_0

    .line 24
    :cond_3
    invoke-virtual {p2, v0}, LU1/u;->K0(Landroid/view/Surface;)V

    .line 25
    invoke-virtual {p2, v1, v1}, LU1/u;->y0(II)V

    :goto_0
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic d()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic e()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic f()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic g()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic h()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic i()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, Lad/Y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lad/Y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/SurfaceView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 19
    .line 20
    .line 21
    :pswitch_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getView()Landroid/view/View;
    .locals 2

    .line 1
    iget v0, p0, Lad/Y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lad/Y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/SurfaceView;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Landroid/view/View;

    .line 12
    .line 13
    iget-object v1, p0, Lad/Y;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic onFlutterViewAttached(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lad/Y;->a:I

    return-void
.end method

.method public final synthetic onFlutterViewDetached()V
    .locals 1

    .line 1
    iget v0, p0, Lad/Y;->a:I

    return-void
.end method

.method public final synthetic onInputConnectionLocked()V
    .locals 1

    .line 1
    iget v0, p0, Lad/Y;->a:I

    return-void
.end method

.method public final synthetic onInputConnectionUnlocked()V
    .locals 1

    .line 1
    iget v0, p0, Lad/Y;->a:I

    return-void
.end method
