.class final synthetic Lcom/google/android/gms/internal/ads/zzekw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzekz;

.field private final synthetic zzb:LF6/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzekz;LF6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzekw;->zza:Lcom/google/android/gms/internal/ads/zzekz;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzekw;->zzb:LF6/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekw;->zza:Lcom/google/android/gms/internal/ads/zzekz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzekw;->zzb:LF6/l;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzekz;->zzq(LF6/l;Landroid/content/DialogInterface;)V

    return-void
.end method
