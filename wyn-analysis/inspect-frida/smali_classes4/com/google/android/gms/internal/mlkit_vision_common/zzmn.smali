.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO9/b;


# instance fields
.field public final synthetic zza:Lq5/g;


# direct methods
.method public synthetic constructor <init>(Lq5/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;->zza:Lq5/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;->zza:Lq5/g;

    .line 2
    .line 3
    new-instance v1, Lq5/c;

    .line 4
    .line 5
    const-string v2, "proto"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_common/zzml;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzml;

    .line 11
    .line 12
    check-cast v0, Lt5/p;

    .line 13
    .line 14
    const-string v3, "FIREBASE_ML_SDK"

    .line 15
    .line 16
    invoke-virtual {v0, v3, v1, v2}, Lt5/p;->a(Ljava/lang/String;Lq5/c;Lq5/f;)Lt5/q;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
