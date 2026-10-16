.class public final LEa/f;
.super LBa/b;
.source "SourceFile"

# interfaces
.implements LCa/g;


# instance fields
.field public final f:LCa/h;


# direct methods
.method public constructor <init>(LEa/a;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;LCa/h;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, LBa/b;-><init>(LEa/a;Ljava/util/concurrent/Executor;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, LEa/f;->f:LCa/h;

    .line 5
    .line 6
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p4}, LCa/h;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 23
    .line 24
    .line 25
    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 26
    .line 27
    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance p4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 31
    .line 32
    invoke-direct {p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {v0}, LA6/c;->P(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p4, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzg(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 62
    .line 63
    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a()[Ld7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LEa/f;->f:LCa/h;

    .line 2
    .line 3
    invoke-static {v0}, LA6/h;->T(LCa/h;)[Ld7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
