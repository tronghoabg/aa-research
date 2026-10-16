.class public final LWa/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LWa/d;->a:I

    iput-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget p1, p0, LWa/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lyc/g;

    .line 9
    .line 10
    iget-object v0, p1, Lyc/g;->r:LE4/n;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p1, Lyc/g;->m:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v0, v0, LE4/n;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/media/ImageReader;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1, p1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :pswitch_0
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lhd/n;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p1, Lhd/n;->a:Luc/h;

    .line 32
    .line 33
    invoke-virtual {p1}, Lhd/n;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Leb/d;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p1, Leb/d;->a:Luc/h;

    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LWa/b;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput-object v0, p1, LWa/b;->h:Luc/h;

    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 3

    .line 1
    iget p1, p0, LWa/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lyc/g;

    .line 9
    .line 10
    iget-object v0, p1, Lyc/g;->r:LE4/n;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p1, Lyc/g;->m:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v2, LLc/a;

    .line 18
    .line 19
    iget-object p1, p1, Lyc/g;->y:Lb7/k;

    .line 20
    .line 21
    check-cast p2, Luc/h;

    .line 22
    .line 23
    invoke-direct {v2, v0, p1, p2}, LLc/a;-><init>(LE4/n;Lb7/k;Luc/h;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/media/ImageReader;

    .line 29
    .line 30
    invoke-virtual {p1, v2, v1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lhd/n;

    .line 37
    .line 38
    check-cast p2, Luc/h;

    .line 39
    .line 40
    iput-object p2, p1, Lhd/n;->a:Luc/h;

    .line 41
    .line 42
    invoke-virtual {p1}, Lhd/n;->b()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Leb/d;

    .line 49
    .line 50
    check-cast p2, Luc/h;

    .line 51
    .line 52
    iput-object p2, p1, Leb/d;->a:Luc/h;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    iget-object p1, p0, LWa/d;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, LWa/b;

    .line 58
    .line 59
    check-cast p2, Luc/h;

    .line 60
    .line 61
    iput-object p2, p1, LWa/b;->h:Luc/h;

    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
