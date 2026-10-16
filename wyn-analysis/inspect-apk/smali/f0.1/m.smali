.class public final Lf0/m;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lf0/n;


# direct methods
.method public synthetic constructor <init>(Lf0/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf0/m;->i:I

    iput-object p1, p0, Lf0/m;->j:Lf0/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lf0/m;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Lf0/m;->j:Lf0/n;

    .line 13
    .line 14
    iget-object v2, p1, Lf0/n;->k:Lkotlin/jvm/internal/n;

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v2, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    iget v0, p1, Lf0/n;->e:F

    .line 31
    .line 32
    float-to-double v3, v0

    .line 33
    iget p1, p1, Lf0/n;->f:F

    .line 34
    .line 35
    float-to-double v5, p1

    .line 36
    invoke-static/range {v1 .. v6}, Landroid/support/v4/media/session/b;->Q(DDD)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    iget-object p1, p0, Lf0/m;->j:Lf0/n;

    .line 52
    .line 53
    iget-object v6, p1, Lf0/n;->m:Lkotlin/jvm/internal/n;

    .line 54
    .line 55
    iget v2, p1, Lf0/n;->e:F

    .line 56
    .line 57
    float-to-double v2, v2

    .line 58
    iget p1, p1, Lf0/n;->f:F

    .line 59
    .line 60
    float-to-double v4, p1

    .line 61
    invoke-static/range {v0 .. v5}, Landroid/support/v4/media/session/b;->Q(DDD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {v6, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/Double;

    .line 74
    .line 75
    return-object p1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
