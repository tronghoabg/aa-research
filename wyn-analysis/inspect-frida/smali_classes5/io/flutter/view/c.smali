.class public final Lio/flutter/view/c;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Handler;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio/flutter/view/c;->a:I

    iput-object p1, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Lq/b1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lio/flutter/view/c;->a:I

    .line 2
    iput-object p1, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    .line 3
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/view/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/database/ContentObserver;->deliverSelfNotifications()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onChange(Z)V
    .locals 1

    iget v0, p0, Lio/flutter/view/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    check-cast p1, Lq/b1;

    iget-boolean v0, p1, Lq1/a;->b:Z

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p1, Lq1/a;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p1, Lq1/a;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->requery()Z

    move-result v0

    iput-boolean v0, p1, Lq1/a;->a:Z

    :cond_0
    return-void

    .line 13
    :pswitch_1
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 14
    iget-object p1, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    check-cast p1, Lkc/r;

    iget-object v0, p1, Lkc/r;->h:Llc/b;

    if-nez v0, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Lkc/r;->e()V

    :goto_0
    return-void

    :pswitch_2
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Lio/flutter/view/c;->onChange(ZLandroid/net/Uri;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 2

    iget v0, p0, Lio/flutter/view/c;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/database/ContentObserver;->onChange(ZLandroid/net/Uri;)V

    return-void

    .line 1
    :sswitch_0
    sget-object p1, Lef/C;->a:Lef/C;

    iget-object p2, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    check-cast p2, LGf/e;

    invoke-interface {p2, p1}, LGf/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2
    :sswitch_1
    iget-object p1, p0, Lio/flutter/view/c;->b:Ljava/lang/Object;

    check-cast p1, Lio/flutter/view/l;

    iget-boolean p2, p1, Lio/flutter/view/l;->u:Z

    if-eqz p2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    const-string p2, "transition_animation_scale"

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    iget-object v1, p1, Lio/flutter/view/l;->f:Landroid/content/ContentResolver;

    invoke-static {v1, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p2

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    if-nez p2, :cond_1

    .line 5
    iget p2, p1, Lio/flutter/view/l;->l:I

    or-int/lit8 p2, p2, 0x4

    iput p2, p1, Lio/flutter/view/l;->l:I

    goto :goto_0

    .line 6
    :cond_1
    iget p2, p1, Lio/flutter/view/l;->l:I

    and-int/lit8 p2, p2, -0x5

    iput p2, p1, Lio/flutter/view/l;->l:I

    .line 7
    :goto_0
    iget p2, p1, Lio/flutter/view/l;->l:I

    .line 8
    iget-object p1, p1, Lio/flutter/view/l;->b:Lme/a;

    iget-object p1, p1, Lme/a;->b:Ljava/lang/Object;

    check-cast p1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 9
    invoke-virtual {p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityFeatures(I)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method
