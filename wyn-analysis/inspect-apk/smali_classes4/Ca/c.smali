.class public final LCa/c;
.super LCa/d;
.source "SourceFile"


# instance fields
.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzd()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzc()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zze()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, ""

    .line 14
    .line 15
    invoke-direct {p0, v0, v1, v2, v3}, LCa/d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zzb()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, LCa/c;->e:F

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;->zza()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, LCa/c;->f:F

    .line 29
    .line 30
    return-void
.end method
