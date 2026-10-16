.class public abstract LC7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LC7/l;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, LC7/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 13
    .line 14
    const-string v3, "SafetyNet.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    .line 20
    .line 21
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzae;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/google/android/gms/internal/safetynet/zzae;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzag;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/google/android/gms/internal/safetynet/zzag;-><init>()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
