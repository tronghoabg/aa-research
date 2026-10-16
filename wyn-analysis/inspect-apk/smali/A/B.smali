.class public final LA/B;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:D

.field public final synthetic k:D

.field public final synthetic l:D

.field public final synthetic m:D


# direct methods
.method public synthetic constructor <init>(DDDDI)V
    .locals 0

    .line 1
    iput p9, p0, LA/B;->i:I

    iput-wide p1, p0, LA/B;->j:D

    iput-wide p3, p0, LA/B;->k:D

    iput-wide p5, p0, LA/B;->l:D

    iput-wide p7, p0, LA/B;->m:D

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LA/B;->i:I

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
    iget-wide v2, p0, LA/B;->j:D

    .line 13
    .line 14
    iget-wide v4, p0, LA/B;->k:D

    .line 15
    .line 16
    mul-double/2addr v2, v4

    .line 17
    mul-double/2addr v4, v0

    .line 18
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    mul-double/2addr v4, v2

    .line 23
    iget-wide v2, p0, LA/B;->l:D

    .line 24
    .line 25
    iget-wide v6, p0, LA/B;->m:D

    .line 26
    .line 27
    mul-double/2addr v2, v6

    .line 28
    mul-double/2addr v6, v0

    .line 29
    invoke-static {v6, v7}, Ljava/lang/Math;->exp(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    mul-double/2addr v0, v2

    .line 34
    add-double/2addr v0, v4

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iget-wide v2, p0, LA/B;->k:D

    .line 47
    .line 48
    mul-double/2addr v2, v0

    .line 49
    iget-wide v4, p0, LA/B;->j:D

    .line 50
    .line 51
    add-double/2addr v2, v4

    .line 52
    iget-wide v4, p0, LA/B;->l:D

    .line 53
    .line 54
    mul-double/2addr v4, v0

    .line 55
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    mul-double/2addr v0, v2

    .line 60
    iget-wide v2, p0, LA/B;->m:D

    .line 61
    .line 62
    add-double/2addr v0, v2

    .line 63
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
