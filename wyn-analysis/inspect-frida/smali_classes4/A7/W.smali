.class public final LA7/W;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/L1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/W;->a:I

    .line 2
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 4
    iput-object p1, p0, LA7/W;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LK8/H;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/W;->a:I

    .line 1
    iput-object p1, p0, LA7/W;->d:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-boolean p2, p0, LA7/W;->c:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LA7/W;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x21

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-lt v0, v1, :cond_2

    .line 14
    .line 15
    iget-boolean v0, p0, LA7/W;->c:Z

    .line 16
    .line 17
    if-eq v2, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x2

    .line 22
    :goto_0
    invoke-static {p1, p0, p2, v0}, Lio/flutter/plugin/editing/h;->p(Landroid/content/Context;LA7/W;Landroid/content/IntentFilter;I)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    :goto_1
    iput-boolean v2, p0, LA7/W;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw p1
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/W;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/L1;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/L1;->a0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/L1;->zzl()LA7/k0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, LA7/k0;->c0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LA7/L1;->zzl()LA7/k0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LA7/k0;->c0()V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, LA7/W;->b:Z

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {v0}, LA7/L1;->zzj()LA7/N;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "Unregistering connectivity change receiver"

    .line 32
    .line 33
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, p0, LA7/W;->b:Z

    .line 40
    .line 41
    iput-boolean v1, p0, LA7/W;->c:Z

    .line 42
    .line 43
    iget-object v1, v0, LA7/L1;->l:LA7/n0;

    .line 44
    .line 45
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_0
    move-exception v1

    .line 52
    invoke-virtual {v0}, LA7/L1;->zzj()LA7/N;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v2, "Failed to unregister the network broadcast receiver"

    .line 57
    .line 58
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public declared-synchronized c(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LA7/W;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, LA7/W;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    const-string p1, "BillingBroadcastManager"

    .line 17
    .line 18
    const-string v0, "Receiver is not registered."

    .line 19
    .line 20
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw p1
.end method

.method public d(Landroid/os/Bundle;Lcom/android/billingclient/api/BillingResult;I)V
    .locals 3

    .line 1
    const-string v0, "FAILURE_LOGGING_PAYLOAD"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, LA7/W;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LK8/H;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object p2, v2, LK8/H;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, LX2/j;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzcd;->zza()Lcom/google/android/gms/internal/play_billing/zzcd;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/zzga;->zzA([BLcom/google/android/gms/internal/play_billing/zzcd;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p2, p1}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    const-string p1, "BillingBroadcastManager"

    .line 34
    .line 35
    const-string p2, "Failed parsing Api failure."

    .line 36
    .line 37
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object p1, v2, LK8/H;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, LX2/j;

    .line 44
    .line 45
    const/16 v0, 0x17

    .line 46
    .line 47
    invoke-static {v0, p3, p2}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1
    iget p1, p0, LA7/W;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    const-string v2, "BillingBroadcastManager"

    .line 13
    .line 14
    iget-object v3, p0, LA7/W;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, LK8/H;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "Bundle is null."

    .line 21
    .line 22
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v3, LK8/H;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LX2/j;

    .line 28
    .line 29
    sget-object p2, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 30
    .line 31
    const/16 v2, 0xb

    .line 32
    .line 33
    invoke-static {v2, v1, p2}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1, v1}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v3, LK8/H;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    .line 43
    .line 44
    if-eqz p1, :cond_b

    .line 45
    .line 46
    invoke-interface {p1, p2, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_0
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/play_billing/zzb;->zze(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v5, "INTENT_SOURCE"

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v6, "LAUNCH_BILLING_FLOW"

    .line 66
    .line 67
    invoke-static {v5, v6}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eq v1, v5, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/4 v1, 0x2

    .line 75
    :goto_0
    const-string v5, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 76
    .line 77
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_9

    .line 82
    .line 83
    const-string v5, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 84
    .line 85
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_2
    const-string v5, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 94
    .line 95
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_b

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_3

    .line 106
    .line 107
    invoke-virtual {p0, p1, v4, v1}, LA7/W;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/BillingResult;I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v3, LK8/H;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    .line 113
    .line 114
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzai;->zzk()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-interface {p1, v4, p2}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object p2, v3, LK8/H;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p2, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    .line 129
    .line 130
    iget-object v4, v3, LK8/H;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Lcom/android/billingclient/api/UserChoiceBillingListener;

    .line 133
    .line 134
    iget-object v3, v3, LK8/H;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v3, LX2/j;

    .line 137
    .line 138
    if-eqz v4, :cond_8

    .line 139
    .line 140
    const-string v5, "ALTERNATIVE_BILLING_USER_CHOICE_DATA"

    .line 141
    .line 142
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    if-eqz v4, :cond_4

    .line 149
    .line 150
    :try_start_0
    new-instance v0, Lcom/android/billingclient/api/UserChoiceDetails;

    .line 151
    .line 152
    invoke-direct {v0, p1}, Lcom/android/billingclient/api/UserChoiceDetails;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v4, v0}, Lcom/android/billingclient/api/UserChoiceBillingListener;->userSelectedAlternativeBilling(Lcom/android/billingclient/api/UserChoiceDetails;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, Lcom/android/billingclient/api/zzcb;->zzc(I)Lcom/google/android/gms/internal/play_billing/zzge;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v3, p1}, LX2/j;->b0(Lcom/google/android/gms/internal/play_billing/zzge;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :cond_4
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 168
    .line 169
    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v5, "products"

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    new-instance v5, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-ge v6, v7, :cond_6

    .line 191
    .line 192
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    if-eqz v7, :cond_5

    .line 197
    .line 198
    new-instance v8, Lcom/android/billingclient/api/zze;

    .line 199
    .line 200
    invoke-direct {v8, v7}, Lcom/android/billingclient/api/zze;-><init>(Lorg/json/JSONObject;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 204
    .line 205
    .line 206
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_6
    throw v0

    .line 210
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v4, "Error when parsing invalid user choice data: ["

    .line 213
    .line 214
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p1, "]"

    .line 221
    .line 222
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 233
    .line 234
    const/16 v0, 0x11

    .line 235
    .line 236
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v3, v0}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 241
    .line 242
    .line 243
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzai;->zzk()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_7
    const-string p1, "Couldn\'t find alternative billing user choice data in bundle."

    .line 252
    .line 253
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 257
    .line 258
    const/16 v0, 0x10

    .line 259
    .line 260
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v3, v0}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzai;->zzk()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_8
    const-string p1, "AlternativeBillingListener and UserChoiceBillingListener is null."

    .line 276
    .line 277
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 281
    .line 282
    const/16 v0, 0x4d

    .line 283
    .line 284
    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v3, v0}, LX2/j;->Z(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 289
    .line 290
    .line 291
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzai;->zzk()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-interface {p2, p1, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_9
    :goto_2
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzi(Landroid/os/Bundle;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    invoke-virtual {v4}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_a

    .line 308
    .line 309
    iget-object p1, v3, LK8/H;->e:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p1, LX2/j;

    .line 312
    .line 313
    invoke-static {v1}, Lcom/android/billingclient/api/zzcb;->zzc(I)Lcom/google/android/gms/internal/play_billing/zzge;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {p1, v0}, LX2/j;->b0(Lcom/google/android/gms/internal/play_billing/zzge;)V

    .line 318
    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_a
    invoke-virtual {p0, p1, v4, v1}, LA7/W;->d(Landroid/os/Bundle;Lcom/android/billingclient/api/BillingResult;I)V

    .line 322
    .line 323
    .line 324
    :goto_3
    iget-object p1, v3, LK8/H;->c:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast p1, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    .line 327
    .line 328
    invoke-interface {p1, v4, p2}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 329
    .line 330
    .line 331
    :cond_b
    :goto_4
    return-void

    .line 332
    :pswitch_0
    iget-object p1, p0, LA7/W;->d:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, LA7/L1;

    .line 335
    .line 336
    invoke-virtual {p1}, LA7/L1;->a0()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    invoke-virtual {p1}, LA7/L1;->zzj()LA7/N;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    const-string v1, "NetworkBroadcastReceiver received action"

    .line 348
    .line 349
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 350
    .line 351
    invoke-virtual {v0, v1, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 355
    .line 356
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-eqz v0, :cond_c

    .line 361
    .line 362
    iget-object p2, p1, LA7/L1;->b:LA7/Q;

    .line 363
    .line 364
    invoke-static {p2}, LA7/L1;->m(LA7/G1;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2}, LA7/Q;->m0()Z

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    iget-boolean v0, p0, LA7/W;->c:Z

    .line 372
    .line 373
    if-eq v0, p2, :cond_d

    .line 374
    .line 375
    iput-boolean p2, p0, LA7/W;->c:Z

    .line 376
    .line 377
    invoke-virtual {p1}, LA7/L1;->zzl()LA7/k0;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    new-instance v0, LA7/V;

    .line 382
    .line 383
    invoke-direct {v0, p0, p2}, LA7/V;-><init>(LA7/W;Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_c
    invoke-virtual {p1}, LA7/L1;->zzj()LA7/N;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    const-string v0, "NetworkBroadcastReceiver received unknown action"

    .line 395
    .line 396
    iget-object p1, p1, LA7/N;->i:LA7/P;

    .line 397
    .line 398
    invoke-virtual {p1, v0, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    :goto_5
    return-void

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
