.class final Lcom/google/android/gms/internal/ads/zzcqb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzehr;


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzini;

.field final zzb:Lcom/google/android/gms/internal/ads/zzini;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcpe;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcqb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcpe;Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzd:Lcom/google/android/gms/internal/ads/zzcqb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzc:Lcom/google/android/gms/internal/ads/zzcpe;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzcpe;->zzaG:Lcom/google/android/gms/internal/ads/zzini;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzeiz;->zzc(Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzeiz;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zza:Lcom/google/android/gms/internal/ads/zzini;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzcpe;->zzf:Lcom/google/android/gms/internal/ads/zzini;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoi;->zza()Lcom/google/android/gms/internal/ads/zzfoi;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/zzcoy;->zza:Lcom/google/android/gms/internal/ads/zzcoz;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzcpe;->zzaF:Lcom/google/android/gms/internal/ads/zzini;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzcpe;->zzaH:Lcom/google/android/gms/internal/ads/zzini;

    sget-object v6, Lcom/google/android/gms/internal/ads/zzcov;->zza:Lcom/google/android/gms/internal/ads/zzcow;

    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zzcpe;->zzG:Lcom/google/android/gms/internal/ads/zzini;

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzeir;->zza(Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzeir;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzb:Lcom/google/android/gms/internal/ads/zzini;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzehv;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzc:Lcom/google/android/gms/internal/ads/zzcpe;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzcpe;->zzp:Lcom/google/android/gms/internal/ads/zzini;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcpe;->zzI()Lcom/google/android/gms/internal/ads/zzcns;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzb:Lcom/google/android/gms/internal/ads/zzini;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcpe;->zzI()Lcom/google/android/gms/internal/ads/zzcns;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zzd(Lcom/google/android/gms/internal/ads/zzcns;)Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoo;->zzc()Lcom/google/android/gms/internal/ads/zzhcp;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoi;->zzc()Lcom/google/android/gms/internal/ads/zzhcp;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzimy;->zzc(Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzimt;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcop;->zzd(Lcom/google/android/gms/internal/ads/zzcns;)LH6/a;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v10, v0

    .line 40
    check-cast v10, Lcom/google/android/gms/internal/ads/zzdzt;

    .line 41
    .line 42
    move-object v9, p0

    .line 43
    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzehw;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzimt;LH6/a;Lcom/google/android/gms/internal/ads/zzehr;Lcom/google/android/gms/internal/ads/zzdzt;)Lcom/google/android/gms/internal/ads/zzehv;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzehx;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcqc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzc:Lcom/google/android/gms/internal/ads/zzcpe;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqb;->zzd:Lcom/google/android/gms/internal/ads/zzcqb;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcqc;-><init>(Lcom/google/android/gms/internal/ads/zzcpe;Lcom/google/android/gms/internal/ads/zzcqb;[B)V

    return-object v0
.end method
