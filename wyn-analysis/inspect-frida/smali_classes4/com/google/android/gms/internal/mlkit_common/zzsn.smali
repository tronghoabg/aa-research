.class public final synthetic Lcom/google/android/gms/internal/mlkit_common/zzsn;
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
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsn;->zza:Lq5/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lq5/c;

    .line 2
    .line 3
    const-string v1, "proto"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzsl;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzsl;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsn;->zza:Lq5/g;

    .line 14
    .line 15
    const-string v3, "FIREBASE_ML_SDK"

    .line 16
    .line 17
    check-cast v2, Lt5/p;

    .line 18
    .line 19
    invoke-virtual {v2, v3, v0, v1}, Lt5/p;->a(Ljava/lang/String;Lq5/c;Lq5/f;)Lt5/q;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
