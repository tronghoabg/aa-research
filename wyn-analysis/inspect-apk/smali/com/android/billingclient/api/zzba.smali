.class public final synthetic Lcom/android/billingclient/api/zzba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/android/billingclient/api/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/zzba;->zza:Lcom/android/billingclient/api/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/zzba;->zza:Lcom/android/billingclient/api/d;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, v1, Lcom/android/billingclient/api/a;->a:I

    .line 7
    .line 8
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput-object v2, v1, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 12
    .line 13
    sget-object v1, Lcom/android/billingclient/api/i;->m:Lcom/android/billingclient/api/BillingResult;

    .line 14
    .line 15
    iget-object v2, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 16
    .line 17
    const/16 v3, 0x18

    .line 18
    .line 19
    const/4 v4, 0x6

    .line 20
    invoke-static {v3, v4, v1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d;->a(Lcom/android/billingclient/api/BillingResult;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
