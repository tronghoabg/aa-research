.class public final Lcom/android/billingclient/api/f;
.super Lcom/google/android/gms/internal/play_billing/zzi;
.source "SourceFile"


# instance fields
.field public final a:Lcom/android/billingclient/api/BillingConfigResponseListener;

.field public final b:LX2/j;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/BillingConfigResponseListener;LX2/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/zzi;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/f;->a:Lcom/android/billingclient/api/BillingConfigResponseListener;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/f;->b:LX2/j;

    .line 7
    .line 8
    iput p3, p0, Lcom/android/billingclient/api/f;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Lcom/android/billingclient/api/f;->c:I

    .line 3
    .line 4
    const/16 v2, 0xd

    .line 5
    .line 6
    iget-object v3, p0, Lcom/android/billingclient/api/f;->b:LX2/j;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/android/billingclient/api/f;->a:Lcom/android/billingclient/api/BillingConfigResponseListener;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 13
    .line 14
    const/16 v5, 0x3f

    .line 15
    .line 16
    invoke-static {v5, v2, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v3, v2, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/BillingConfigResponseListener;->onBillingConfigResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string v5, "BillingClient"

    .line 28
    .line 29
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/play_billing/zzb;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/play_billing/zzb;->zzg(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->newBuilder()Lcom/android/billingclient/api/BillingResult$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8, v6}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v8, v7}, Lcom/android/billingclient/api/BillingResult$Builder;->setDebugMessage(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 45
    .line 46
    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v7, "getBillingConfig() failed. Response code: "

    .line 52
    .line 53
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v5, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/16 v5, 0x17

    .line 71
    .line 72
    invoke-static {v5, v2, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v3, v2, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/BillingConfigResponseListener;->onBillingConfigResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    const-string v6, "BILLING_CONFIG"

    .line 84
    .line 85
    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    const-string p1, "getBillingConfig() returned a bundle with neither an error nor a billing config response"

    .line 92
    .line 93
    invoke-static {v5, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x6

    .line 97
    invoke-virtual {v8, p1}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const/16 v5, 0x40

    .line 105
    .line 106
    invoke-static {v5, v2, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v3, v2, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/BillingConfigResponseListener;->onBillingConfigResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :try_start_0
    new-instance v6, Lcom/android/billingclient/api/BillingConfig;

    .line 122
    .line 123
    invoke-direct {v6, p1}, Lcom/android/billingclient/api/BillingConfig;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {v4, p1, v6}, Lcom/android/billingclient/api/BillingConfigResponseListener;->onBillingConfigResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catch_0
    move-exception p1

    .line 135
    const-string v6, "Got a JSON exception trying to decode BillingConfig. \n Exception: "

    .line 136
    .line 137
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 141
    .line 142
    const/16 v5, 0x41

    .line 143
    .line 144
    invoke-static {v5, v2, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v3, v2, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/BillingConfigResponseListener;->onBillingConfigResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
