.class public final synthetic LN6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LN6/e;->a:I

    iput-object p1, p0, LN6/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lp8/p;
    .locals 4

    .line 1
    iget v0, p0, LN6/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/internal/ads/zzeha;

    .line 7
    .line 8
    new-instance v0, LN6/s;

    .line 9
    .line 10
    new-instance v1, Landroid/util/JsonReader;

    .line 11
    .line 12
    new-instance v2, Ljava/io/InputStreamReader;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeha;->zza()Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeha;->zzb()Lcom/google/android/gms/internal/ads/zzcbk;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, v1, p1}, LN6/s;-><init>(Landroid/util/JsonReader;Lcom/google/android/gms/internal/ads/zzcbk;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LN6/e;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcbk;

    .line 34
    .line 35
    :try_start_0
    sget-object v1, LD6/q;->g:LD6/q;

    .line 36
    .line 37
    iget-object v1, v1, LD6/q;->a:LH6/f;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzcbk;->zza:Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, LH6/f;->m(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, v0, LN6/s;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_0
    const-string p1, "{}"

    .line 53
    .line 54
    iput-object p1, v0, LN6/s;->b:Ljava/lang/String;

    .line 55
    .line 56
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 62
    .line 63
    iget-object v0, p0, LN6/e;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LN6/j;

    .line 66
    .line 67
    const-string v1, "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, LN6/j;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhbx;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, LN6/g;

    .line 74
    .line 75
    invoke-direct {v2, p1}, LN6/g;-><init>(Landroid/net/Uri;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v0, LN6/j;->f:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 79
    .line 80
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzk(Lp8/p;Lcom/google/android/gms/internal/ads/zzgti;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_1
    check-cast p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v0, p0, LN6/e;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LN6/j;

    .line 90
    .line 91
    const-string v1, "google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"

    .line 92
    .line 93
    invoke-virtual {v0, v1}, LN6/j;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhbx;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, LN6/f;

    .line 98
    .line 99
    invoke-direct {v2, v0, p1}, LN6/f;-><init>(LN6/j;Ljava/util/ArrayList;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v0, LN6/j;->f:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 103
    .line 104
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzk(Lp8/p;Lcom/google/android/gms/internal/ads/zzgti;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
