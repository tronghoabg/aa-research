.class public abstract synthetic LFe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    invoke-static {}, Lae/e;->values()[Lae/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    :try_start_0
    aput v1, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    :catch_0
    const/4 v2, 0x2

    .line 12
    :try_start_1
    sget-object v3, Lae/e;->b:Lae/d;

    .line 13
    .line 14
    aput v2, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    :catch_1
    const/4 v3, 0x6

    .line 17
    const/4 v4, 0x3

    .line 18
    :try_start_2
    sget-object v5, Lae/e;->b:Lae/d;

    .line 19
    .line 20
    aput v4, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 21
    .line 22
    :catch_2
    const/4 v5, 0x7

    .line 23
    const/4 v6, 0x4

    .line 24
    :try_start_3
    sget-object v7, Lae/e;->b:Lae/d;

    .line 25
    .line 26
    aput v6, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 27
    .line 28
    :catch_3
    const/16 v7, 0x8

    .line 29
    .line 30
    const/4 v8, 0x5

    .line 31
    :try_start_4
    sget-object v9, Lae/e;->b:Lae/d;

    .line 32
    .line 33
    aput v8, v0, v7
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 34
    .line 35
    :catch_4
    const/16 v9, 0x9

    .line 36
    .line 37
    :try_start_5
    sget-object v10, Lae/e;->b:Lae/d;

    .line 38
    .line 39
    aput v3, v0, v9
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 40
    .line 41
    :catch_5
    :try_start_6
    sget-object v3, Lae/e;->b:Lae/d;

    .line 42
    .line 43
    aput v5, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 44
    .line 45
    :catch_6
    :try_start_7
    sget-object v3, Lae/e;->b:Lae/d;

    .line 46
    .line 47
    aput v7, v0, v6
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 48
    .line 49
    :catch_7
    :try_start_8
    sget-object v3, Lae/e;->b:Lae/d;

    .line 50
    .line 51
    aput v9, v0, v8
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 52
    .line 53
    :catch_8
    invoke-static {}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->values()[Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    array-length v0, v0

    .line 58
    new-array v0, v0, [I

    .line 59
    .line 60
    :try_start_9
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    aput v1, v0, v3
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 67
    .line 68
    :catch_9
    :try_start_a
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    aput v2, v0, v3
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 75
    .line 76
    :catch_a
    :try_start_b
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    aput v4, v0, v3
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 83
    .line 84
    :catch_b
    :try_start_c
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    aput v6, v0, v3
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 91
    .line 92
    :catch_c
    :try_start_d
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    aput v8, v0, v3
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 99
    .line 100
    :catch_d
    sput-object v0, LFe/i;->a:[I

    .line 101
    .line 102
    invoke-static {}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    array-length v0, v0

    .line 107
    new-array v0, v0, [I

    .line 108
    .line 109
    :try_start_e
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    aput v1, v0, v3
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 116
    .line 117
    :catch_e
    :try_start_f
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    aput v2, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 124
    .line 125
    :catch_f
    :try_start_10
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    aput v4, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 132
    .line 133
    :catch_10
    sput-object v0, LFe/i;->b:[I

    .line 134
    .line 135
    return-void
.end method
