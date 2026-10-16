.class public final Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;",
        "",
        "()V",
        "from",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "isoPeriod",
        "",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;-><init>()V

    return-void
.end method

.method private static final from$toPeriodCount(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/lit8 p0, p0, -0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v0, "substring(...)"

    .line 24
    .line 25
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, LBf/r;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_1
    return v1
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "isoPeriod"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?$"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "compile(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "matcher(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, LBf/f;

    .line 35
    .line 36
    invoke-direct {v1, v0, p1}, LBf/f;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_0
    const/4 v1, 0x0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 44
    .line 45
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    invoke-virtual {v0}, LBf/f;->a()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, 0x1

    .line 56
    check-cast v2, LBf/e;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, LBf/e;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0}, LBf/f;->a()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const/4 v4, 0x2

    .line 69
    check-cast v3, LBf/e;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, LBf/e;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, LBf/f;->a()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/4 v5, 0x3

    .line 82
    check-cast v4, LBf/e;

    .line 83
    .line 84
    invoke-virtual {v4, v5}, LBf/e;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0}, LBf/f;->a()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/4 v5, 0x4

    .line 95
    check-cast v0, LBf/e;

    .line 96
    .line 97
    invoke-virtual {v0, v5}, LBf/e;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-static {v3}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v4}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-static {v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from$toPeriodCount(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-lez v2, :cond_2

    .line 120
    .line 121
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 122
    .line 123
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 124
    .line 125
    invoke-direct {v0, v2, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_2
    if-lez v3, :cond_3

    .line 130
    .line 131
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 132
    .line 133
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Month:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 134
    .line 135
    invoke-direct {v0, v3, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_3
    if-lez v4, :cond_4

    .line 140
    .line 141
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 142
    .line 143
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Week:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 144
    .line 145
    invoke-direct {v0, v4, v1, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_4
    if-lez v0, :cond_5

    .line 150
    .line 151
    new-instance v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 152
    .line 153
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Day:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 154
    .line 155
    invoke-direct {v1, v0, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_5
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 160
    .line 161
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Unknown:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 162
    .line 163
    invoke-direct {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v0
.end method
