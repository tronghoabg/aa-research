.class public Lcom/applovin/applovin_max/AppLovinMAXNativeAdViewFactory;
.super Lio/flutter/plugin/platform/f;
.source "SourceFile"


# instance fields
.field private final messenger:Luc/f;


# direct methods
.method public constructor <init>(Luc/f;)V
    .locals 1

    .line 1
    sget-object v0, Luc/w;->a:Luc/w;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/f;-><init>(Luc/w;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdViewFactory;->messenger:Luc/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/e;
    .locals 11

    .line 1
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->getSdk()Lcom/applovin/sdk/AppLovinSdk;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    check-cast p3, Ljava/util/Map;

    .line 10
    .line 11
    const-string v0, "ad_unit_id"

    .line 12
    .line 13
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v3, v0

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "Creating MaxNativeAdView widget with Ad Unit ID: "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "placement"

    .line 38
    .line 39
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    move-object v4, v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v4, v2

    .line 55
    :goto_0
    const-string v0, "custom_data"

    .line 56
    .line 57
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move-object v5, v2

    .line 72
    :goto_1
    const-string v0, "extra_parameters"

    .line 73
    .line 74
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/Map;

    .line 85
    .line 86
    move-object v6, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move-object v6, v2

    .line 89
    :goto_2
    const-string v0, "local_extra_parameters"

    .line 90
    .line 91
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    move-object v2, p3

    .line 102
    check-cast v2, Ljava/util/Map;

    .line 103
    .line 104
    :cond_3
    move-object v7, v2

    .line 105
    new-instance v1, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 106
    .line 107
    iget-object v8, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdViewFactory;->messenger:Luc/f;

    .line 108
    .line 109
    move-object v10, p1

    .line 110
    move v2, p2

    .line 111
    invoke-direct/range {v1 .. v10}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Luc/f;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    return-object v1
.end method
