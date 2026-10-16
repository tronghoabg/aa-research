.class public final LH7/U;
.super Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvn;


# static fields
.field private static final zbb:LH7/U;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbafq;

.field private zbg:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbja;

.field private zbh:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbdy;

.field private zbi:LH7/h0;

.field private zbj:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/U;

    .line 2
    .line 3
    invoke-direct {v0}, LH7/U;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH7/U;->zbb:LH7/U;

    .line 7
    .line 8
    const-class v1, LH7/U;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbD(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, LH7/U;->zbj:B

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final zbb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 p3, 0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    add-int/lit8 p1, p1, -0x1

    .line 8
    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    if-eq p1, v4, :cond_4

    .line 12
    .line 13
    if-eq p1, v3, :cond_3

    .line 14
    .line 15
    if-eq p1, v2, :cond_2

    .line 16
    .line 17
    if-eq p1, v1, :cond_1

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    move p3, v0

    .line 22
    :cond_0
    iput-byte p3, p0, LH7/U;->zbj:B

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object p1, LH7/U;->zbb:LH7/U;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, LH7/Q;

    .line 30
    .line 31
    sget-object p2, LH7/U;->zbb:LH7/U;

    .line 32
    .line 33
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtz;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    new-instance p1, LH7/U;

    .line 38
    .line 39
    invoke-direct {p1}, LH7/U;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_4
    const/4 p1, 0x7

    .line 44
    new-array p1, p1, [Ljava/lang/Object;

    .line 45
    .line 46
    const-string p2, "zbd"

    .line 47
    .line 48
    aput-object p2, p1, v0

    .line 49
    .line 50
    const-string p2, "zbg"

    .line 51
    .line 52
    aput-object p2, p1, p3

    .line 53
    .line 54
    const-string p2, "zbh"

    .line 55
    .line 56
    aput-object p2, p1, v4

    .line 57
    .line 58
    const-string p2, "zbe"

    .line 59
    .line 60
    aput-object p2, p1, v3

    .line 61
    .line 62
    sget-object p2, LH7/a;->i:LH7/a;

    .line 63
    .line 64
    aput-object p2, p1, v2

    .line 65
    .line 66
    const-string p2, "zbi"

    .line 67
    .line 68
    aput-object p2, p1, v1

    .line 69
    .line 70
    const-string p2, "zbf"

    .line 71
    .line 72
    const/4 p3, 0x6

    .line 73
    aput-object p2, p1, p3

    .line 74
    .line 75
    sget-object p2, LH7/U;->zbb:LH7/U;

    .line 76
    .line 77
    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1009\u0002\u0002\u1009\u0003\u0003\u180c\u0000\u0004\u1009\u0004\u0005\u1409\u0001"

    .line 78
    .line 79
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbA(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_5
    iget-byte p1, p0, LH7/U;->zbj:B

    .line 85
    .line 86
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1
.end method
