.class public final Lt3/g;
.super Lt3/q;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lt3/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lt3/g;->a:I

    iput-object p1, p0, Lt3/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lt3/p;)V
    .locals 3

    .line 1
    iget v0, p0, Lt3/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt3/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt3/u;

    .line 9
    .line 10
    iget v1, v0, Lt3/u;->z:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, v0, Lt3/u;->z:I

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, v0, Lt3/u;->A:Z

    .line 20
    .line 21
    invoke-virtual {v0}, Lt3/p;->n()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1, p0}, Lt3/p;->w(Lt3/o;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, Lt3/g;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lt3/p;

    .line 31
    .line 32
    invoke-virtual {v0}, Lt3/p;->z()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lt3/p;->w(Lt3/o;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    sget-object v0, Lt3/x;->a:Lt3/y;

    .line 40
    .line 41
    iget-object v1, p0, Lt3/g;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/view/View;

    .line 44
    .line 45
    const/high16 v2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lgc/b;->J(Landroid/view/View;F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lt3/p;->w(Lt3/o;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lt3/p;)V
    .locals 1

    .line 1
    iget p1, p0, Lt3/g;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lt3/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lt3/u;

    .line 10
    .line 11
    iget-boolean v0, p1, Lt3/u;->A:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lt3/p;->H()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p1, Lt3/u;->A:Z

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
