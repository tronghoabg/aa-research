.class public final Lcom/google/android/gms/internal/ads/zzsc;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final zza:Z


# direct methods
.method public constructor <init>(IIIIILcom/google/android/gms/internal/ads/zzv;ZLjava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-static {p6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p6

    .line 9
    invoke-virtual {p6}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result p6

    .line 13
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p7

    .line 17
    invoke-virtual {p7}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p7

    .line 21
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    add-int/lit8 p6, p6, 0x22

    .line 44
    .line 45
    add-int/2addr p6, p7

    .line 46
    add-int/lit8 p6, p6, 0x2

    .line 47
    .line 48
    add-int/2addr p6, v0

    .line 49
    add-int/lit8 p6, p6, 0x2

    .line 50
    .line 51
    add-int/2addr p6, v1

    .line 52
    add-int/lit8 p6, p6, 0x2

    .line 53
    .line 54
    add-int/2addr p6, v2

    .line 55
    invoke-direct {v3, p6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const-string p6, "AudioTrack init failed 0 Config("

    .line 59
    .line 60
    const-string p7, ", "

    .line 61
    .line 62
    invoke-static {p2, p3, p6, p7, v3}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p4, p5, p7, p7, v3}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 66
    .line 67
    .line 68
    const-string p2, ") "

    .line 69
    .line 70
    const-string p3, ""

    .line 71
    .line 72
    invoke-static {v3, p2, p1, p3}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p0, p1, p8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzsc;->zza:Z

    .line 81
    .line 82
    return-void
.end method
