.class public final Lu7/a;
.super Lcom/google/android/gms/common/api/l;
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
    new-instance v1, Lcom/google/android/gms/common/api/i;

    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/fido/zzo;

    .line 9
    .line 10
    invoke-direct {v2}, Lcom/google/android/gms/internal/fido/zzo;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v3, "Fido.FIDO2_API"

    .line 14
    .line 15
    invoke-direct {v1, v3, v2, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 16
    .line 17
    .line 18
    sput-object v1, Lu7/a;->a:Lcom/google/android/gms/common/api/i;

    .line 19
    .line 20
    return-void
.end method
