.class public final Lad/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/e;


# instance fields
.field public final synthetic a:I

.field public b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lad/N;->a:I

    iput-object p1, p0, Lad/N;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iget v0, p0, Lad/N;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lad/N;->b:Landroid/view/View;

    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 1
    iget v0, p0, Lad/N;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lad/N;->b:Landroid/view/View;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lad/N;->b:Landroid/view/View;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic onFlutterViewAttached(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lad/N;->a:I

    return-void
.end method

.method public final synthetic onFlutterViewDetached()V
    .locals 1

    .line 1
    iget v0, p0, Lad/N;->a:I

    return-void
.end method

.method public final synthetic onInputConnectionLocked()V
    .locals 1

    .line 1
    iget v0, p0, Lad/N;->a:I

    return-void
.end method

.method public final synthetic onInputConnectionUnlocked()V
    .locals 1

    .line 1
    iget v0, p0, Lad/N;->a:I

    return-void
.end method
