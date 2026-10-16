.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;

.field private static final zzb:Lh9/d;

.field private static final zzc:Lh9/d;

.field private static final zzd:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/a;->r(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

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
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lh9/d;

    .line 26
    .line 27
    invoke-static {v1}, Lpd/f;->n(Ljava/util/HashMap;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "inferenceCommonLogEvent"

    .line 32
    .line 33
    invoke-direct {v0, v2, v1}, Lh9/d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzb:Lh9/d;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/a;->r(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

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
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lh9/d;

    .line 56
    .line 57
    invoke-static {v1}, Lpd/f;->n(Ljava/util/HashMap;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "imageInfo"

    .line 62
    .line 63
    invoke-direct {v0, v2, v1}, Lh9/d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzc:Lh9/d;

    .line 67
    .line 68
    const/4 v0, 0x3

    .line 69
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/a;->r(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lh9/d;

    .line 86
    .line 87
    invoke-static {v1}, Lpd/f;->n(Ljava/util/HashMap;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "recognizerOptions"

    .line 92
    .line 93
    invoke-direct {v0, v2, v1}, Lh9/d;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzd:Lh9/d;

    .line 97
    .line 98
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzb:Lh9/d;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzc:Lh9/d;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;->zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 21
    .line 22
    .line 23
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzln;->zzd:Lh9/d;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 30
    .line 31
    .line 32
    return-void
.end method
