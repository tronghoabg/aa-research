.class public final LAf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Luf/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LAf/t;->a:I

    iput-object p1, p0, LAf/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, LAf/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LAf/b;

    .line 7
    .line 8
    iget-object v1, p0, LAf/t;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ltf/a;

    .line 11
    .line 12
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/Iterator;

    .line 17
    .line 18
    invoke-direct {v0, v1}, LAf/b;-><init>(Ljava/util/Iterator;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, LAf/t;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/k;->i([Ljava/lang/Object;)LUf/h;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_1
    new-instance v0, LUf/h;

    .line 32
    .line 33
    iget-object v1, p0, LAf/t;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LWf/y;

    .line 36
    .line 37
    invoke-direct {v0, v1}, LUf/h;-><init>(LWf/y;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_2
    iget-object v0, p0, LAf/t;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LAf/k;

    .line 44
    .line 45
    invoke-interface {v0}, LAf/k;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
