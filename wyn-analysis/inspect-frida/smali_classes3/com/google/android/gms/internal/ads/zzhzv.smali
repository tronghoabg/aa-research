.class public final Lcom/google/android/gms/internal/ads/zzhzv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhzv;->zza:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public static zza(Ljava/lang/String;I)[B
    .locals 3

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhzv;->zza:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    array-length p1, p0

    .line 8
    mul-int/lit8 v0, p1, 0x3

    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhzu;

    .line 11
    .line 12
    div-int/lit8 v0, v0, 0x4

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzhzu;-><init>(I[B)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, p0, v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzhzu;->zza([BIIZ)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    iget p0, v1, Lcom/google/android/gms/internal/ads/zzhzt;->zzb:I

    .line 29
    .line 30
    iget-object p1, v1, Lcom/google/android/gms/internal/ads/zzhzt;->zza:[B

    .line 31
    .line 32
    array-length v1, p1

    .line 33
    if-ne p0, v1, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    new-array v1, p0, [B

    .line 37
    .line 38
    invoke-static {p1, v0, v1, v0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p1, "bad base-64"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0
.end method
