.class Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

.field final synthetic uef:J


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->uef:J

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 21
    .line 22
    invoke-static {v5, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;I)I

    .line 23
    .line 24
    .line 25
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 26
    .line 27
    const-string v6, "lmt"

    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    iget-wide v9, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->uef:J

    .line 34
    .line 35
    sub-long/2addr v7, v9

    .line 36
    invoke-virtual {v5, v0, v6, v7, v8}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ILjava/lang/String;J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v2

    .line 41
    goto :goto_4

    .line 42
    :cond_0
    :goto_0
    if-nez v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 49
    .line 50
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 61
    .line 62
    invoke-static {v6, v2}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    iget-wide v9, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->uef:J

    .line 72
    .line 73
    sub-long/2addr v7, v9

    .line 74
    invoke-virtual {v6, v1, v7, v8}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ZJ)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 79
    .line 80
    const-string v7, "empty gaid"

    .line 81
    .line 82
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    iget-wide v10, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->uef:J

    .line 87
    .line 88
    sub-long/2addr v8, v10

    .line 89
    const/4 v10, 0x4

    .line 90
    invoke-virtual {v6, v10, v7, v8, v9}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ILjava/lang/String;J)V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_3

    .line 98
    .line 99
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cq;->uef()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    move v4, v3

    .line 104
    :cond_3
    :goto_2
    if-eq v4, v3, :cond_4

    .line 105
    .line 106
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/yo;->uef()Lcom/bytedance/sdk/openadsdk/core/yo;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, "limit_ad_track"

    .line 111
    .line 112
    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/yo;->uef(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 116
    .line 117
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Z)Z

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 121
    .line 122
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/util/concurrent/CountDownLatch;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wrv/yo;->uef(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :goto_4
    :try_start_1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 140
    .line 141
    invoke-static {v3, v0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;I)I

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 145
    .line 146
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    iget-wide v5, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->uef:J

    .line 151
    .line 152
    sub-long/2addr v3, v5

    .line 153
    const/4 v5, 0x3

    .line 154
    invoke-virtual {v0, v5, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ILjava/lang/Throwable;J)V

    .line 155
    .line 156
    .line 157
    const-string v0, "AdvertisingIdHelper"

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 169
    .line 170
    invoke-static {v2, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Z)Z

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 174
    .line 175
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/util/concurrent/CountDownLatch;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;->oa:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 183
    .line 184
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wrv/yo;->uef(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0
.end method
