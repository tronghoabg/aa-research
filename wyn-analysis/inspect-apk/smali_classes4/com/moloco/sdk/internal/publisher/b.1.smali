.class public final Lcom/moloco/sdk/internal/publisher/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/publisher/AdShowListener;

.field public final b:Lcom/moloco/sdk/internal/services/u;

.field public final c:Lcom/moloco/sdk/internal/services/events/c;

.field public final d:Ltf/a;

.field public final e:Ltf/a;

.field public final f:Lcom/moloco/sdk/internal/B;

.field public final g:Lcom/moloco/sdk/internal/j;

.field public final h:Lcom/moloco/sdk/publisher/AdFormatType;

.field public final i:Lcom/moloco/sdk/acm/recorder/c;

.field public final j:LY2/B;

.field public final k:Ltf/a;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ltf/a;Ltf/a;Lcom/moloco/sdk/internal/B;Lcom/moloco/sdk/internal/j;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;LY2/B;Ltf/a;)V
    .locals 1

    .line 1
    const-string v0, "appLifecycleTrackerService"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "customUserEventBuilderService"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "adType"

    .line 12
    .line 13
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "metricsRecorder"

    .line 17
    .line 18
    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/b;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/b;->b:Lcom/moloco/sdk/internal/services/u;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/b;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/b;->d:Ltf/a;

    .line 31
    .line 32
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/b;->e:Ltf/a;

    .line 33
    .line 34
    iput-object p6, p0, Lcom/moloco/sdk/internal/publisher/b;->f:Lcom/moloco/sdk/internal/B;

    .line 35
    .line 36
    iput-object p7, p0, Lcom/moloco/sdk/internal/publisher/b;->g:Lcom/moloco/sdk/internal/j;

    .line 37
    .line 38
    iput-object p8, p0, Lcom/moloco/sdk/internal/publisher/b;->h:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 39
    .line 40
    iput-object p9, p0, Lcom/moloco/sdk/internal/publisher/b;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 41
    .line 42
    iput-object p10, p0, Lcom/moloco/sdk/internal/publisher/b;->j:LY2/B;

    .line 43
    .line 44
    iput-object p11, p0, Lcom/moloco/sdk/internal/publisher/b;->k:Ltf/a;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/r;)V
    .locals 7

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
    const-string v2, "onAdShowFailed: "

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
    const-string v2, "InternalAdShowListenerImpl"

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x4

    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->d:Ltf/a;

    .line 31
    .line 32
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->d:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/b;->f:Lcom/moloco/sdk/internal/B;

    .line 49
    .line 50
    invoke-virtual {v3, v0, v1, v2, p1}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 54
    .line 55
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 56
    .line 57
    const-string v1, "show_ad_failed"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/b;->h:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "toLowerCase(...)"

    .line 77
    .line 78
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v2, "ad_type"

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p1, Lcom/moloco/sdk/internal/r;->a:Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/moloco/sdk/publisher/MolocoAdError;->getErrorType()Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "reason"

    .line 97
    .line 98
    invoke-virtual {v0, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/b;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 107
    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    return-void
.end method

.method public final b(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V
    .locals 9

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
    const-string v2, "onAdShowSuccess: "

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
    const-string v2, ", creativeType: "

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    iget-object v8, p0, Lcom/moloco/sdk/internal/publisher/b;->k:Ltf/a;

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    invoke-interface {v8}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, v7

    .line 36
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v2, "InternalAdShowListenerImpl"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x4

    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->d:Ltf/a;

    .line 52
    .line 53
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->e:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/b;->f:Lcom/moloco/sdk/internal/B;

    .line 70
    .line 71
    invoke-virtual {v3, v0, v1, v2, v7}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->j:LY2/B;

    .line 75
    .line 76
    iget-object v0, v0, LY2/B;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->e:Ltf/a;

    .line 85
    .line 86
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v5, v0

    .line 91
    check-cast v5, Lcom/moloco/sdk/internal/publisher/D;

    .line 92
    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    sget-object v0, Lcom/moloco/sdk/internal/scheduling/a;->a:LKd/a;

    .line 100
    .line 101
    new-instance v1, Lcom/moloco/sdk/internal/publisher/a;

    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    move-object v2, p0

    .line 105
    invoke-direct/range {v1 .. v6}, Lcom/moloco/sdk/internal/publisher/a;-><init>(Lcom/moloco/sdk/internal/publisher/b;JLcom/moloco/sdk/internal/publisher/D;Ljf/c;)V

    .line 106
    .line 107
    .line 108
    const/4 v3, 0x3

    .line 109
    invoke-static {v0, v7, v1, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    move-object v2, p0

    .line 114
    :goto_1
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 115
    .line 116
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 117
    .line 118
    const-string v1, "show_ad_success"

    .line 119
    .line 120
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 124
    .line 125
    iget-object v1, v2, Lcom/moloco/sdk/internal/publisher/b;->h:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 132
    .line 133
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v3, "toLowerCase(...)"

    .line 138
    .line 139
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v3, "ad_type"

    .line 143
    .line 144
    invoke-virtual {v0, v3, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v8}, Lxg/g;->g(Lcom/moloco/sdk/acm/h;Ltf/a;)V

    .line 148
    .line 149
    .line 150
    if-eqz p2, :cond_3

    .line 151
    .line 152
    const-string v1, "parent_view_type"

    .line 153
    .line 154
    invoke-virtual {v0, v1, p2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_3
    iget-object p2, v2, Lcom/moloco/sdk/internal/publisher/b;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 158
    .line 159
    invoke-virtual {p2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 160
    .line 161
    .line 162
    iget-object p2, v2, Lcom/moloco/sdk/internal/publisher/b;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 163
    .line 164
    if-eqz p2, :cond_4

    .line 165
    .line 166
    invoke-interface {p2, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    return-void
.end method

.method public final c(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 14

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
    const-string v2, "onAdClicked: "

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
    const-string v2, "InternalAdShowListenerImpl"

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x4

    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->b:Lcom/moloco/sdk/internal/services/u;

    .line 31
    .line 32
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/u;->c:LKd/a;

    .line 33
    .line 34
    new-instance v3, Lcom/moloco/sdk/internal/services/t;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v3, v0, v4}, Lcom/moloco/sdk/internal/services/t;-><init>(Lcom/moloco/sdk/internal/services/u;Ljf/c;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-static {v2, v4, v3, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->d:Ltf/a;

    .line 45
    .line 46
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->f:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/b;->f:Lcom/moloco/sdk/internal/B;

    .line 63
    .line 64
    invoke-virtual {v5, v0, v2, v3, v4}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 65
    .line 66
    .line 67
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 68
    .line 69
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 70
    .line 71
    const-string v2, "ad_clicked"

    .line 72
    .line 73
    invoke-direct {v0, v2}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 77
    .line 78
    iget-object v8, p0, Lcom/moloco/sdk/internal/publisher/b;->h:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 85
    .line 86
    invoke-virtual {v2, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v10, "toLowerCase(...)"

    .line 91
    .line 92
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v11, "ad_type"

    .line 96
    .line 97
    invoke-virtual {v0, v11, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/b;->k:Ltf/a;

    .line 101
    .line 102
    invoke-static {v0, v2}, Lxg/g;->g(Lcom/moloco/sdk/acm/h;Ltf/a;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/b;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->j:LY2/B;

    .line 111
    .line 112
    iget-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v12, v2

    .line 115
    check-cast v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    const/4 v13, 0x1

    .line 119
    invoke-virtual {v12, v2, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_1

    .line 124
    .line 125
    const/16 v6, 0xc

    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    const-string v2, "AcmClickDeduper"

    .line 129
    .line 130
    const-string v3, "Deduped click logged"

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 138
    .line 139
    const-string v2, "ad_clicked_deduped"

    .line 140
    .line 141
    invoke-direct {v1, v2}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v11, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, LY2/B;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lcom/moloco/sdk/acm/recorder/c;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 163
    .line 164
    .line 165
    :cond_1
    invoke-virtual {v12, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 169
    .line 170
    if-eqz v0, :cond_2

    .line 171
    .line 172
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    return-void
.end method

.method public final d(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 7

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
    const-string v2, "onAdHidden: "

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
    const-string v2, "InternalAdShowListenerImpl"

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x4

    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->d:Ltf/a;

    .line 31
    .line 32
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->g:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/b;->f:Lcom/moloco/sdk/internal/B;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-virtual {v3, v0, v1, v2, v4}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 55
    .line 56
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 57
    .line 58
    const-string v1, "ad_hidden"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 64
    .line 65
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/b;->h:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "toLowerCase(...)"

    .line 78
    .line 79
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v2, "ad_type"

    .line 83
    .line 84
    invoke-virtual {v0, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/b;->k:Ltf/a;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lxg/g;->g(Lcom/moloco/sdk/acm/h;Ltf/a;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/b;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/b;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method
