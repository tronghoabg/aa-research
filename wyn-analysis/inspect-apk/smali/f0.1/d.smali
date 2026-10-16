.class public final Lf0/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# static fields
.field public static final j:Lf0/d;

.field public static final k:Lf0/d;

.field public static final l:Lf0/d;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lf0/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lf0/d;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf0/d;->j:Lf0/d;

    .line 9
    .line 10
    new-instance v0, Lf0/d;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lf0/d;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf0/d;->k:Lf0/d;

    .line 18
    .line 19
    new-instance v0, Lf0/d;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Lf0/d;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lf0/d;->l:Lf0/d;

    .line 27
    .line 28
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lf0/d;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lf0/d;->i:I

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
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmpg-double p1, v0, v2

    .line 26
    .line 27
    if-gez p1, :cond_0

    .line 28
    .line 29
    neg-double v2, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-wide v2, v0

    .line 32
    :goto_0
    const-wide v4, 0x3fa4b5dcc63f1412L    # 0.04045

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmpl-double p1, v2, v4

    .line 38
    .line 39
    if-ltz p1, :cond_1

    .line 40
    .line 41
    const-wide v4, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    mul-double/2addr v4, v2

    .line 47
    const-wide v2, 0x3faab1232f514a03L    # 0.05213270142180095

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    add-double/2addr v4, v2

    .line 53
    const-wide v2, 0x4003333333333333L    # 2.4

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-wide v4, 0x3fb3d0722149b580L    # 0.07739938080495357

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    mul-double/2addr v2, v4

    .line 69
    :goto_1
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->copySign(DD)D

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    const-wide/16 v2, 0x0

    .line 85
    .line 86
    cmpg-double p1, v0, v2

    .line 87
    .line 88
    if-gez p1, :cond_2

    .line 89
    .line 90
    neg-double v2, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move-wide v2, v0

    .line 93
    :goto_2
    const-wide v4, 0x3f69a5c61c57a063L    # 0.0031308049535603718

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    cmpl-double p1, v2, v4

    .line 99
    .line 100
    if-ltz p1, :cond_3

    .line 101
    .line 102
    const-wide v4, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    const-wide v4, 0x3faab1232f514a03L    # 0.05213270142180095

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    sub-double/2addr v2, v4

    .line 117
    const-wide v4, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    :goto_3
    div-double/2addr v2, v4

    .line 123
    goto :goto_4

    .line 124
    :cond_3
    const-wide v4, 0x3fb3d0722149b580L    # 0.07739938080495357

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :goto_4
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->copySign(DD)D

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
