.class final Lcom/google/android/gms/internal/mlkit_common/zzeb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_common/zzeb;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzeb;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzeb;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzeb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeb;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/a;->o(I)Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {v0, v1, v0, v1, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->p(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;I)Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {v0, v1, v0, v1, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->p(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;I)Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-static {v0, v1, v0, v1, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->p(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;I)Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1, v0, v1}, Lcom/google/android/gms/internal/consent_sdk/a;->x(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zzck;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    throw p1
.end method
