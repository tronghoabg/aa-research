.class public final Lf0/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lf0/o;


# direct methods
.method public synthetic constructor <init>(Lf0/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf0/k;->i:I

    iput-object p1, p0, Lf0/k;->j:Lf0/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lf0/k;->i:I

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
    iget-object p1, p0, Lf0/k;->j:Lf0/o;

    .line 13
    .line 14
    iget-wide v2, p1, Lf0/o;->e:D

    .line 15
    .line 16
    cmpl-double v2, v0, v2

    .line 17
    .line 18
    if-ltz v2, :cond_0

    .line 19
    .line 20
    iget-wide v2, p1, Lf0/o;->b:D

    .line 21
    .line 22
    mul-double/2addr v2, v0

    .line 23
    iget-wide v0, p1, Lf0/o;->c:D

    .line 24
    .line 25
    add-double/2addr v2, v0

    .line 26
    iget-wide v0, p1, Lf0/o;->a:D

    .line 27
    .line 28
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v2, p1, Lf0/o;->d:D

    .line 34
    .line 35
    mul-double/2addr v0, v2

    .line 36
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-object p1, p0, Lf0/k;->j:Lf0/o;

    .line 48
    .line 49
    iget-wide v2, p1, Lf0/o;->e:D

    .line 50
    .line 51
    iget-wide v4, p1, Lf0/o;->d:D

    .line 52
    .line 53
    mul-double/2addr v2, v4

    .line 54
    cmpl-double v2, v0, v2

    .line 55
    .line 56
    if-ltz v2, :cond_1

    .line 57
    .line 58
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 59
    .line 60
    iget-wide v4, p1, Lf0/o;->a:D

    .line 61
    .line 62
    div-double/2addr v2, v4

    .line 63
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    iget-wide v2, p1, Lf0/o;->c:D

    .line 68
    .line 69
    sub-double/2addr v0, v2

    .line 70
    iget-wide v2, p1, Lf0/o;->b:D

    .line 71
    .line 72
    div-double/2addr v0, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    div-double/2addr v0, v4

    .line 75
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
