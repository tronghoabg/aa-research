.class public Lcom/applovin/applovin_max/AppLovinMAXAdView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/e;


# static fields
.field private static final preloadedWidgetInstances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;",
            ">;"
        }
    .end annotation
.end field

.field private static final widgetInstances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final adViewId:I

.field private final channel:Luc/r;

.field private widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widgetInstances:Ljava/util/Map;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILcom/applovin/mediation/MaxAdFormat;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Luc/f;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Lcom/applovin/mediation/MaxAdFormat;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Luc/f;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "applovin_max/adview_"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Luc/r;

    .line 11
    .line 12
    invoke-direct {v0, p11, p1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->channel:Luc/r;

    .line 16
    .line 17
    new-instance p1, LS8/b;

    .line 18
    .line 19
    const/16 p11, 0x17

    .line 20
    .line 21
    invoke-direct {p1, p0, p11}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Luc/r;->b(Luc/p;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p11

    .line 33
    invoke-interface {p1, p11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 40
    .line 41
    const-string p11, ") for Ad Unit ID "

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->hasContainerView()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p4, "Mounting the preloaded AdView ("

    .line 54
    .line 55
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput p3, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 75
    .line 76
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 77
    .line 78
    invoke-virtual {p1, p6}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setAutoRefreshEnabled(Z)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->attachAdView(Lcom/applovin/applovin_max/AppLovinMAXAdView;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    new-instance p1, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 88
    .line 89
    invoke-direct {p1, p2, p4, p5, p12}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;ZLandroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iput p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 99
    .line 100
    sget-object p3, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widgetInstances:Ljava/util/Map;

    .line 101
    .line 102
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    iget-object p5, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 107
    .line 108
    invoke-interface {p3, p4, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    new-instance p3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string p4, "Mounting a new AdView ("

    .line 114
    .line 115
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, p11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 135
    .line 136
    invoke-virtual {p1, p7}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setPlacement(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 140
    .line 141
    invoke-virtual {p1, p8}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setCustomData(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 145
    .line 146
    invoke-virtual {p1, p9}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setExtraParameters(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 150
    .line 151
    invoke-virtual {p1, p10}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setLocalExtraParameters(Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 155
    .line 156
    invoke-virtual {p1, p6}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setAutoRefreshEnabled(Z)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 160
    .line 161
    invoke-virtual {p1, p0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->attachAdView(Lcom/applovin/applovin_max/AppLovinMAXAdView;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->loadAd()V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public static synthetic a(Lcom/applovin/applovin_max/AppLovinMAXAdView;Luc/o;Ltc/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXAdView;->lambda$new$0(Luc/o;Luc/q;)V

    return-void
.end method

.method public static destroyWidgetAdView(ILuc/q;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 12
    .line 13
    const-string v2, "AppLovinMAX"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string p0, "No preloaded AdView found to destroy"

    .line 19
    .line 20
    invoke-interface {p1, v2, p0, v3}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->hasContainerView()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    const-string p0, "Cannot destroy - the preloaded AdView is currently in use"

    .line 31
    .line 32
    invoke-interface {p1, v2, p0, v3}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->detachAdView()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->destroy()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v3}, Luc/q;->a(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static getInstance(Ljava/lang/String;)Lcom/applovin/mediation/ads/MaxAdView;
    .locals 3

    .line 1
    sget-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdUnitId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdView()Lcom/applovin/mediation/ads/MaxAdView;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    sget-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widgetInstances:Ljava/util/Map;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdUnitId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdView()Lcom/applovin/mediation/ads/MaxAdView;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_3
    const/4 p0, 0x0

    .line 100
    return-object p0
.end method

.method private synthetic lambda$new$0(Luc/o;Luc/q;)V
    .locals 2

    .line 1
    iget-object v0, p1, Luc/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "startAutoRefresh"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setAutoRefreshEnabled(Z)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string v0, "stopAutoRefresh"

    .line 23
    .line 24
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setAutoRefreshEnabled(Z)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-interface {p2}, Luc/q;->c()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static preloadWidgetAdView(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Luc/q;Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/applovin/mediation/MaxAdFormat;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Luc/q;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move-object v5, p8

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;ZZLandroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setPlacement(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p4}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setCustomData(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p5}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setExtraParameters(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p6}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setLocalExtraParameters(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->loadAd()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p7, p0}, Luc/q;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->detachAdView()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->preloadedWidgetInstances:Ljava/util/Map;

    .line 9
    .line 10
    iget v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 23
    .line 24
    if-ne v1, v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "Unmounting the preloaded AdView ("

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ") for Ad Unit ID "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdUnitId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->setAutoRefreshEnabled(Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Unmounting the AdView ("

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ") to destroy for Ad Unit ID "

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->getAdUnitId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widgetInstances:Ljava/util/Map;

    .line 100
    .line 101
    iget v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->adViewId:I

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;->destroy()V

    .line 113
    .line 114
    .line 115
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->channel:Luc/r;

    .line 116
    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-virtual {v0, v1}, Luc/r;->b(Luc/p;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->widget:Lcom/applovin/applovin_max/AppLovinMAXAdViewWidget;

    .line 2
    .line 3
    return-object v0
.end method

.method public onFlutterViewAttached(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onFlutterViewDetached()V
    .locals 0

    return-void
.end method

.method public bridge synthetic onInputConnectionLocked()V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onInputConnectionUnlocked()V
    .locals 0

    .line 1
    return-void
.end method

.method public sendEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXAdView;->channel:Luc/r;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lcom/applovin/applovin_max/AppLovinMAX;->fireCallback(Ljava/lang/String;Ljava/util/Map;Luc/r;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
