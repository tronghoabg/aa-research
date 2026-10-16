.class public final Lh4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic a:I

.field public final b:Landroidx/lifecycle/o;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh4/a;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lh4/a;->b:Landroidx/lifecycle/o;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/o;LEf/m0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh4/a;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh4/a;->b:Landroidx/lifecycle/o;

    .line 3
    iput-object p2, p0, Lh4/a;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic d(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic e(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 1

    .line 1
    iget v0, p0, Lh4/a;->a:I

    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 1

    .line 1
    iget p1, p0, Lh4/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lh4/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LEf/m0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-interface {p1, v0}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onPause(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    iget p1, p0, Lh4/a;->a:I

    return-void
.end method

.method public final onResume(Landroidx/lifecycle/v;)V
    .locals 3

    .line 1
    iget v0, p0, Lh4/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lh4/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/emoji2/text/EmojiCompatInitializer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x1c

    .line 16
    .line 17
    if-lt p1, v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Ly1/a;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance v0, LA7/z;

    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    invoke-direct {v0, v1}, LA7/z;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v1, 0x1f4

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lh4/a;->b:Landroidx/lifecycle/o;

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    invoke-static {p1}, LVa/M6;->d(Landroidx/lifecycle/v;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic onStart(Landroidx/lifecycle/v;)V
    .locals 1

    .line 1
    iget v0, p0, Lh4/a;->a:I

    invoke-static {p1}, LVa/M6;->e(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final synthetic onStop(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    iget p1, p0, Lh4/a;->a:I

    return-void
.end method
