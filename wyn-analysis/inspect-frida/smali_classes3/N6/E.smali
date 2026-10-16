.class public final LN6/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzini;

.field public final b:Lcom/google/android/gms/internal/ads/zzini;

.field public final c:Lcom/google/android/gms/internal/ads/zzini;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN6/E;->a:Lcom/google/android/gms/internal/ads/zzini;

    .line 5
    .line 6
    iput-object p2, p0, LN6/E;->b:Lcom/google/android/gms/internal/ads/zzini;

    .line 7
    .line 8
    iput-object p3, p0, LN6/E;->c:Lcom/google/android/gms/internal/ads/zzini;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LN6/E;->a:Lcom/google/android/gms/internal/ads/zzini;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdzo;

    .line 8
    .line 9
    iget-object v1, p0, LN6/E;->b:Lcom/google/android/gms/internal/ads/zzini;

    .line 10
    .line 11
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LN6/C;

    .line 16
    .line 17
    iget-object v2, p0, LN6/E;->c:Lcom/google/android/gms/internal/ads/zzini;

    .line 18
    .line 19
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    new-instance v3, LN6/D;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, LN6/D;-><init>(Lcom/google/android/gms/internal/ads/zzdzo;LN6/C;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method
