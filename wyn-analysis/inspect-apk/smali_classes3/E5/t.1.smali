.class public final synthetic LE5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    .line 1
    iput p2, p0, LE5/t;->a:I

    iput p1, p0, LE5/t;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LE5/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN1/H;

    .line 7
    .line 8
    iget v0, p0, LE5/t;->b:F

    .line 9
    .line 10
    invoke-interface {p1, v0}, LN1/H;->j(F)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, LE5/u0;

    .line 15
    .line 16
    iget v0, p0, LE5/t;->b:F

    .line 17
    .line 18
    invoke-interface {p1, v0}, LE5/u0;->j(F)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
