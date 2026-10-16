.class public final LR3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Landroid/os/Parcelable;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LR3/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR3/b;->e:Ljava/lang/Object;

    iput p2, p0, LR3/b;->b:I

    iput-object p3, p0, LR3/b;->d:Landroid/os/Parcelable;

    iput p4, p0, LR3/b;->c:I

    return-void
.end method

.method public constructor <init>(Lu/f;IILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LR3/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR3/b;->e:Ljava/lang/Object;

    iput p2, p0, LR3/b;->b:I

    iput p3, p0, LR3/b;->c:I

    iput-object p4, p0, LR3/b;->d:Landroid/os/Parcelable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, LR3/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR3/b;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu/f;

    .line 9
    .line 10
    iget-object v0, v0, Lu/f;->b:Lu/a;

    .line 11
    .line 12
    iget v1, p0, LR3/b;->c:I

    .line 13
    .line 14
    iget-object v2, p0, LR3/b;->d:Landroid/os/Parcelable;

    .line 15
    .line 16
    check-cast v2, Landroid/os/Bundle;

    .line 17
    .line 18
    iget v3, p0, LR3/b;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v3, v1, v2}, Lu/a;->onActivityResized(IILandroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x1f

    .line 27
    .line 28
    iget v2, p0, LR3/b;->c:I

    .line 29
    .line 30
    iget-object v3, p0, LR3/b;->d:Landroid/os/Parcelable;

    .line 31
    .line 32
    check-cast v3, Landroid/app/Notification;

    .line 33
    .line 34
    iget v4, p0, LR3/b;->b:I

    .line 35
    .line 36
    iget-object v5, p0, LR3/b;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 39
    .line 40
    if-lt v0, v1, :cond_0

    .line 41
    .line 42
    invoke-static {v5, v4, v3, v2}, LR3/e;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/16 v1, 0x1d

    .line 47
    .line 48
    if-lt v0, v1, :cond_1

    .line 49
    .line 50
    invoke-static {v5, v4, v3, v2}, LR3/d;->a(Landroid/app/Service;ILandroid/app/Notification;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v5, v4, v3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
