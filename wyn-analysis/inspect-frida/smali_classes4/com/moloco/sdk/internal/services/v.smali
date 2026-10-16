.class public final Lcom/moloco/sdk/internal/services/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lef/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/v;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, LAf/q;

    .line 7
    .line 8
    const/16 v0, 0xe

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/v;->b:Lef/p;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Lcom/moloco/sdk/internal/services/F;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/moloco/sdk/internal/services/F;

    .line 4
    .line 5
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    move-object v2, v3

    .line 12
    :cond_0
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v4, :cond_1

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    :cond_1
    sget-object v5, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    move-object v3, v4

    .line 21
    if-nez v5, :cond_2

    .line 22
    .line 23
    move-object v4, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    move-object v4, v5

    .line 26
    :goto_0
    iget-object v7, v0, Lcom/moloco/sdk/internal/services/v;->b:Lef/p;

    .line 27
    .line 28
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 39
    .line 40
    const-string v9, "RELEASE"

    .line 41
    .line 42
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-object v8, v6

    .line 46
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v9}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    const-string v10, "getLanguage(...)"

    .line 57
    .line 58
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v10, v0, Lcom/moloco/sdk/internal/services/v;->a:Landroid/content/Context;

    .line 62
    .line 63
    const-class v11, Landroid/telephony/TelephonyManager;

    .line 64
    .line 65
    invoke-static {v10, v11}, LY0/e;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    check-cast v10, Landroid/telephony/TelephonyManager;

    .line 70
    .line 71
    if-eqz v10, :cond_3

    .line 72
    .line 73
    invoke-virtual {v10}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    if-eqz v10, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v10, v8

    .line 81
    :goto_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 90
    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v14

    .line 99
    sub-long/2addr v12, v14

    .line 100
    if-nez v5, :cond_4

    .line 101
    .line 102
    move-object v5, v8

    .line 103
    :cond_4
    sget-object v14, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 104
    .line 105
    move-wide/from16 v16, v12

    .line 106
    .line 107
    if-nez v14, :cond_5

    .line 108
    .line 109
    move-object v13, v8

    .line 110
    move-object v12, v5

    .line 111
    move v5, v7

    .line 112
    move-object v7, v9

    .line 113
    move-object v8, v10

    .line 114
    :goto_2
    move v9, v11

    .line 115
    move-wide/from16 v10, v16

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move-object v13, v14

    .line 119
    move-object v8, v10

    .line 120
    move-object v12, v5

    .line 121
    move v5, v7

    .line 122
    move-object v7, v9

    .line 123
    goto :goto_2

    .line 124
    :goto_3
    invoke-direct/range {v1 .. v13}, Lcom/moloco/sdk/internal/services/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;FJLjava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v1
.end method
