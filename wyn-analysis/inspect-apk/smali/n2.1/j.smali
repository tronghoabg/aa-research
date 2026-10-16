.class public final Ln2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln2/j;->a:I

    iput-object p1, p0, Ln2/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSpatializerAvailableChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Ln2/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p2, p0, Ln2/j;->a:I

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lr6/l;

    .line 9
    .line 10
    sget-object p2, Lr6/l;->j:Ll8/d0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lr6/l;->f()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Ln2/o;

    .line 17
    .line 18
    sget-object p2, Ln2/o;->j:Ll8/d0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ln2/o;->e()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSpatializerEnabledChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Ln2/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p2, p0, Ln2/j;->a:I

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lr6/l;

    .line 9
    .line 10
    sget-object p2, Lr6/l;->j:Ll8/d0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lr6/l;->f()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Ln2/o;

    .line 17
    .line 18
    sget-object p2, Ln2/o;->j:Ll8/d0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ln2/o;->e()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
