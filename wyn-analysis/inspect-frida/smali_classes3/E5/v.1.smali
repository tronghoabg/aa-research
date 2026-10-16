.class public final synthetic LE5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LE5/v;->a:I

    iput p1, p0, LE5/v;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, LE5/v;->a:I

    iput p1, p0, LE5/v;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LE5/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LV1/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, LE5/v;->b:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iput-boolean v1, p1, LV1/i;->u:Z

    .line 17
    .line 18
    :cond_0
    iput v0, p1, LV1/i;->k:I

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p1, LN1/H;

    .line 22
    .line 23
    iget v0, p0, LE5/v;->b:I

    .line 24
    .line 25
    invoke-interface {p1, v0}, LN1/H;->k(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast p1, LF5/j;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget v0, p0, LE5/v;->b:I

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    iput-boolean v1, p1, LF5/j;->u:Z

    .line 40
    .line 41
    :cond_1
    iput v0, p1, LF5/j;->k:I

    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    check-cast p1, LE5/u0;

    .line 45
    .line 46
    iget v0, p0, LE5/v;->b:I

    .line 47
    .line 48
    invoke-interface {p1, v0}, LE5/u0;->k(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
