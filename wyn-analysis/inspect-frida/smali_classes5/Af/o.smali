.class public final LAf/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAf/k;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LAf/o;->a:I

    iput-object p1, p0, LAf/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltf/p;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LAf/o;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Llf/i;

    iput-object p1, p0, LAf/o;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, LAf/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/k;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lqf/k;-><init>(LAf/o;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    iget-object v0, p0, LAf/o;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :pswitch_1
    iget-object v0, p0, LAf/o;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/k;->i([Ljava/lang/Object;)LUf/h;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, LBf/d;

    .line 31
    .line 32
    iget-object v1, p0, LAf/o;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {v0, v1}, LBf/d;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_3
    new-instance v0, LAf/s;

    .line 41
    .line 42
    iget-object v1, p0, LAf/o;->b:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {v0, v1}, LAf/s;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_4
    iget-object v0, p0, LAf/o;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/Iterator;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_5
    iget-object v0, p0, LAf/o;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Llf/i;

    .line 56
    .line 57
    invoke-static {v0}, LS3/f;->x(Ltf/p;)LAf/l;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
