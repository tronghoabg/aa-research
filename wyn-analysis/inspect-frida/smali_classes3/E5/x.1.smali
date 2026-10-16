.class public final synthetic LE5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, LE5/x;->a:I

    iput p1, p0, LE5/x;->b:I

    iput p2, p0, LE5/x;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LE5/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN1/H;

    .line 7
    .line 8
    iget v0, p0, LE5/x;->b:I

    .line 9
    .line 10
    iget v1, p0, LE5/x;->c:I

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, LN1/H;->g(II)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, LE5/u0;

    .line 17
    .line 18
    iget v0, p0, LE5/x;->b:I

    .line 19
    .line 20
    iget v1, p0, LE5/x;->c:I

    .line 21
    .line 22
    invoke-interface {p1, v0, v1}, LE5/u0;->g(II)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
