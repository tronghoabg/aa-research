.class public Lcom/applovin/applovin_max/AppLovinMAXAdViewFactory;
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
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdViewFactory;->messenger:Luc/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/e;
    .locals 15

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    const-string v1, "ad_unit_id"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v4, v1

    .line 12
    check-cast v4, Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "ad_format"

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "mrec"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    sget-object v1, Lcom/applovin/mediation/MaxAdFormat;->MREC:Lcom/applovin/mediation/MaxAdFormat;

    .line 31
    .line 32
    :goto_0
    move-object v6, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/applovin/applovin_max/AppLovinMAX;->getDeviceSpecificBannerAdViewAdFormat(Landroid/content/Context;)Lcom/applovin/mediation/MaxAdFormat;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :goto_1
    const-string v1, "ad_view_id"

    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/Integer;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move-object v1, v3

    .line 56
    :goto_2
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :goto_3
    move v5, v1

    .line 63
    goto :goto_4

    .line 64
    :cond_2
    const/4 v1, 0x0

    .line 65
    goto :goto_3

    .line 66
    :goto_4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    const-string v2, "is_adaptive_banner_enabled"

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    const-string v2, "is_auto_refresh_enabled"

    .line 79
    .line 80
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const-string v1, "placement"

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    move-object v9, v1

    .line 103
    goto :goto_5

    .line 104
    :cond_3
    move-object v9, v3

    .line 105
    :goto_5
    const-string v1, "custom_data"

    .line 106
    .line 107
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    move-object v10, v1

    .line 120
    goto :goto_6

    .line 121
    :cond_4
    move-object v10, v3

    .line 122
    :goto_6
    const-string v1, "extra_parameters"

    .line 123
    .line 124
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_5

    .line 129
    .line 130
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Ljava/util/Map;

    .line 135
    .line 136
    move-object v11, v1

    .line 137
    goto :goto_7

    .line 138
    :cond_5
    move-object v11, v3

    .line 139
    :goto_7
    const-string v1, "local_extra_parameters"

    .line 140
    .line 141
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object v3, v0

    .line 152
    check-cast v3, Ljava/util/Map;

    .line 153
    .line 154
    :cond_6
    move-object v12, v3

    .line 155
    new-instance v2, Lcom/applovin/applovin_max/AppLovinMAXAdView;

    .line 156
    .line 157
    iget-object v13, p0, Lcom/applovin/applovin_max/AppLovinMAXAdViewFactory;->messenger:Luc/f;

    .line 158
    .line 159
    move-object/from16 v14, p1

    .line 160
    .line 161
    move/from16 v3, p2

    .line 162
    .line 163
    invoke-direct/range {v2 .. v14}, Lcom/applovin/applovin_max/AppLovinMAXAdView;-><init>(ILjava/lang/String;ILcom/applovin/mediation/MaxAdFormat;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Luc/f;Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    return-object v2
.end method
