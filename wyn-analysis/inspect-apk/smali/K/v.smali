.class public final LK/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LV/d;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(LV/d;II)V
    .locals 0

    .line 1
    iput p3, p0, LK/v;->i:I

    iput-object p1, p0, LK/v;->j:LV/d;

    iput p2, p0, LK/v;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LK/v;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget p2, p0, LK/v;->k:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    iget-object v0, p0, LK/v;->j:LV/d;

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, LFe/e;->b(LV/d;LN/o;I)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_0
    check-cast p1, LN/o;

    .line 26
    .line 27
    check-cast p2, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    and-int/lit8 p2, p2, 0xb

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    if-ne p2, v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, LN/o;->x()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p1}, LN/o;->I()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    iget p2, p0, LK/v;->k:I

    .line 50
    .line 51
    shr-int/lit8 p2, p2, 0x9

    .line 52
    .line 53
    and-int/lit8 p2, p2, 0xe

    .line 54
    .line 55
    iget-object v0, p0, LK/v;->j:LV/d;

    .line 56
    .line 57
    invoke-static {v0, p1, p2}, LFe/e;->b(LV/d;LN/o;I)V

    .line 58
    .line 59
    .line 60
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
