.class public final Lo4/b;
.super Lcom/google/android/gms/internal/play_billing/zzc;
.source "SourceFile"


# instance fields
.field public final a:Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;

.field public final b:LX2/j;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;LX2/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/zzc;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo4/b;->a:Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;

    .line 5
    .line 6
    iput-object p2, p0, Lo4/b;->b:LX2/j;

    .line 7
    .line 8
    iput p3, p0, Lo4/b;->c:I

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
    iget v1, p0, Lo4/b;->c:I

    .line 3
    .line 4
    const/16 v2, 0xf

    .line 5
    .line 6
    iget-object v3, p0, Lo4/b;->b:LX2/j;

    .line 7
    .line 8
    iget-object v4, p0, Lo4/b;->a:Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 13
    .line 14
    const/16 v5, 0x47

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
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;->onAlternativeBillingOnlyTokenResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V

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
    invoke-static {v6, v7}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v8, "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: "

    .line 46
    .line 47
    invoke-direct {p1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v5, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/16 p1, 0x17

    .line 61
    .line 62
    invoke-static {p1, v2, v7}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v3, p1, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v4, v7, v0}, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;->onAlternativeBillingOnlyTokenResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    const-string v6, "CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS"

    .line 74
    .line 75
    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :try_start_0
    new-instance v6, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;

    .line 80
    .line 81
    invoke-direct {v6, p1}, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    invoke-interface {v4, v7, v6}, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;->onAlternativeBillingOnlyTokenResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catch_0
    move-exception p1

    .line 89
    const-string v6, "Error when parsing invalid alternative billing only reporting details. \n Exception: "

    .line 90
    .line 91
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 95
    .line 96
    const/16 v5, 0x48

    .line 97
    .line 98
    invoke-static {v5, v2, p1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v3, v2, v1}, LX2/j;->a0(Lcom/google/android/gms/internal/play_billing/zzga;I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4, p1, v0}, Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;->onAlternativeBillingOnlyTokenResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
