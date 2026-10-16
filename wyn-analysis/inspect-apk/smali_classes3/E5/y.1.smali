.class public final synthetic LE5/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    .line 1
    iput p2, p0, LE5/y;->a:I

    iput-boolean p1, p0, LE5/y;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LE5/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN1/H;

    .line 7
    .line 8
    iget-boolean v0, p0, LE5/y;->b:Z

    .line 9
    .line 10
    invoke-interface {p1, v0}, LN1/H;->e(Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, LN1/H;

    .line 15
    .line 16
    iget-boolean v0, p0, LE5/y;->b:Z

    .line 17
    .line 18
    invoke-interface {p1, v0}, LN1/H;->c(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast p1, LN1/H;

    .line 23
    .line 24
    iget-boolean v0, p0, LE5/y;->b:Z

    .line 25
    .line 26
    invoke-interface {p1, v0}, LN1/H;->e(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    check-cast p1, LE5/u0;

    .line 31
    .line 32
    iget-boolean v0, p0, LE5/y;->b:Z

    .line 33
    .line 34
    invoke-interface {p1, v0}, LE5/u0;->e(Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    check-cast p1, LE5/u0;

    .line 39
    .line 40
    iget-boolean v0, p0, LE5/y;->b:Z

    .line 41
    .line 42
    invoke-interface {p1, v0}, LE5/u0;->c(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
