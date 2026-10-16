.class public final Lcom/moloco/sdk/internal/publisher/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/internal/publisher/s0;


# instance fields
.field public final a:Lcom/moloco/sdk/publisher/AdLoad$Listener;

.field public final b:Lcom/moloco/sdk/internal/B;

.field public final c:Lcom/moloco/sdk/acm/l;

.field public final d:Lcom/moloco/sdk/publisher/AdFormatType;

.field public final e:Lcom/moloco/sdk/acm/recorder/c;

.field public final f:Ltf/a;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/publisher/AdLoad$Listener;Lcom/moloco/sdk/internal/B;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)V
    .locals 1

    .line 1
    const-string v0, "sdkEventUrlTracker"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "acmLoadTimerEvent"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "adFormatType"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/C;->a:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/C;->b:Lcom/moloco/sdk/internal/B;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/C;->c:Lcom/moloco/sdk/acm/l;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/C;->d:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 26
    .line 27
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/C;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 28
    .line 29
    iput-object p6, p0, Lcom/moloco/sdk/internal/publisher/C;->f:Ltf/a;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V
    .locals 11

    .line 1
    const-string v0, "internalError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "onAdLoadFailed: "

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const-string v2, "AdLoadListenerTrackerImpl"

    .line 25
    .line 26
    const/16 v6, 0xc

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/d;->b:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/C;->b:Lcom/moloco/sdk/internal/B;

    .line 43
    .line 44
    invoke-virtual {v2, p2, v0, v1, p1}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p2, p1, Lcom/moloco/sdk/internal/r;->c:Ljava/util/Map;

    .line 48
    .line 49
    const-string v0, "missing_fields"

    .line 50
    .line 51
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Ljava/lang/String;

    .line 56
    .line 57
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 58
    .line 59
    const-string v1, "result"

    .line 60
    .line 61
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/C;->c:Lcom/moloco/sdk/acm/l;

    .line 62
    .line 63
    const-string v3, "failure"

    .line 64
    .line 65
    invoke-virtual {v2, v1, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p1, Lcom/moloco/sdk/internal/r;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 69
    .line 70
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v4, "reason"

    .line 75
    .line 76
    invoke-virtual {v2, v4, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/C;->d:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 86
    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-string v7, "toLowerCase(...)"

    .line 92
    .line 93
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v8, "ad_type"

    .line 97
    .line 98
    invoke-virtual {v2, v8, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/C;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 102
    .line 103
    invoke-virtual {v5, v2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 107
    .line 108
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 109
    .line 110
    const-string v9, "load_ad_failed"

    .line 111
    .line 112
    invoke-direct {v2, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p1, Lcom/moloco/sdk/internal/r;->a:Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/moloco/sdk/publisher/MolocoAdError;->getNetworkName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    const-string v10, "network"

    .line 122
    .line 123
    invoke-virtual {v2, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;->a()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v2, v4, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v8, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/C;->f:Ltf/a;

    .line 148
    .line 149
    invoke-static {v2, v1}, Lxg/g;->g(Lcom/moloco/sdk/acm/h;Ltf/a;)V

    .line 150
    .line 151
    .line 152
    if-eqz p2, :cond_2

    .line 153
    .line 154
    invoke-static {p2}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_1

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v2, v0, p2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_2
    :goto_0
    invoke-virtual {v5, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 165
    .line 166
    .line 167
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/C;->a:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 168
    .line 169
    if-eqz p2, :cond_3

    .line 170
    .line 171
    invoke-interface {p2, p1}, Lcom/moloco/sdk/publisher/AdLoad$Listener;->onAdLoadFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    return-void
.end method

.method public final b(Lcom/moloco/sdk/publisher/MolocoAd;JLcom/moloco/sdk/internal/ortb/model/d;)V
    .locals 8

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "onAdLoadStarted: "

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, ", "

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const-string v2, "AdLoadListenerTrackerImpl"

    .line 33
    .line 34
    const/16 v6, 0xc

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    if-eqz p4, :cond_0

    .line 41
    .line 42
    iget-object p1, p4, Lcom/moloco/sdk/internal/ortb/model/d;->a:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const/4 p4, 0x0

    .line 47
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/C;->b:Lcom/moloco/sdk/internal/B;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final c(Lcom/moloco/sdk/publisher/MolocoAd;Lcom/moloco/sdk/internal/ortb/model/d;)V
    .locals 8

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "onAdLoadSuccess: "

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const-string v2, "AdLoadListenerTrackerImpl"

    .line 25
    .line 26
    const/16 v6, 0xc

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/d;->c:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const/4 v2, 0x0

    .line 43
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/C;->b:Lcom/moloco/sdk/internal/B;

    .line 44
    .line 45
    invoke-virtual {v3, p2, v0, v1, v2}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object p2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 49
    .line 50
    const-string p2, "result"

    .line 51
    .line 52
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/C;->c:Lcom/moloco/sdk/acm/l;

    .line 53
    .line 54
    const-string v1, "success"

    .line 55
    .line 56
    invoke-virtual {v0, p2, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/C;->d:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-string v3, "toLowerCase(...)"

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v4, "ad_type"

    .line 77
    .line 78
    invoke-virtual {v0, v4, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/C;->f:Ltf/a;

    .line 82
    .line 83
    invoke-static {v1}, Lxg/g;->f(Ltf/a;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    const-string v6, "creative_type"

    .line 90
    .line 91
    invoke-virtual {v0, v6, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/C;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 95
    .line 96
    invoke-virtual {v5, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 100
    .line 101
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 102
    .line 103
    const-string v6, "load_ad_success"

    .line 104
    .line 105
    invoke-direct {v0, v6}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4, p2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Lxg/g;->g(Lcom/moloco/sdk/acm/h;Ltf/a;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 126
    .line 127
    .line 128
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/C;->a:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 129
    .line 130
    if-eqz p2, :cond_2

    .line 131
    .line 132
    invoke-interface {p2, p1}, Lcom/moloco/sdk/publisher/AdLoad$Listener;->onAdLoadSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 133
    .line 134
    .line 135
    :cond_2
    return-void
.end method
