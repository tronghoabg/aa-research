.class public final LH7/L;
.super Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvn;


# static fields
.field private static final zbb:LH7/L;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:I

.field private zbg:F

.field private zbh:J

.field private zbi:Z

.field private zbj:F

.field private zbk:F

.field private zbl:J

.field private zbm:I

.field private zbn:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/L;

    .line 2
    .line 3
    invoke-direct {v0}, LH7/L;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH7/L;->zbb:LH7/L;

    .line 7
    .line 8
    const-class v1, LH7/L;

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
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, LH7/L;->zbe:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zbb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 p2, 0x1

    .line 2
    const/4 p3, 0x5

    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x2

    .line 6
    add-int/lit8 p1, p1, -0x1

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    if-eq p1, v2, :cond_3

    .line 11
    .line 12
    if-eq p1, v1, :cond_2

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    if-eq p1, p3, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, LH7/L;->zbb:LH7/L;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    new-instance p1, LH7/c;

    .line 24
    .line 25
    sget-object p2, LH7/L;->zbb:LH7/L;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtz;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    new-instance p1, LH7/L;

    .line 32
    .line 33
    invoke-direct {p1}, LH7/L;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    const/16 p1, 0xb

    .line 38
    .line 39
    new-array p1, p1, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v3, "zbd"

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    aput-object v3, p1, v4

    .line 45
    .line 46
    const-string v3, "zbe"

    .line 47
    .line 48
    aput-object v3, p1, p2

    .line 49
    .line 50
    const-string p2, "zbf"

    .line 51
    .line 52
    aput-object p2, p1, v2

    .line 53
    .line 54
    const-string p2, "zbg"

    .line 55
    .line 56
    aput-object p2, p1, v1

    .line 57
    .line 58
    const-string p2, "zbh"

    .line 59
    .line 60
    aput-object p2, p1, v0

    .line 61
    .line 62
    const-string p2, "zbi"

    .line 63
    .line 64
    aput-object p2, p1, p3

    .line 65
    .line 66
    const-string p2, "zbj"

    .line 67
    .line 68
    const/4 p3, 0x6

    .line 69
    aput-object p2, p1, p3

    .line 70
    .line 71
    const-string p2, "zbk"

    .line 72
    .line 73
    const/4 p3, 0x7

    .line 74
    aput-object p2, p1, p3

    .line 75
    .line 76
    const-string p2, "zbl"

    .line 77
    .line 78
    const/16 p3, 0x8

    .line 79
    .line 80
    aput-object p2, p1, p3

    .line 81
    .line 82
    const-string p2, "zbm"

    .line 83
    .line 84
    const/16 p3, 0x9

    .line 85
    .line 86
    aput-object p2, p1, p3

    .line 87
    .line 88
    const-string p2, "zbn"

    .line 89
    .line 90
    const/16 p3, 0xa

    .line 91
    .line 92
    aput-object p2, p1, p3

    .line 93
    .line 94
    sget-object p2, LH7/L;->zbb:LH7/L;

    .line 95
    .line 96
    const-string p3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1002\u0003\u0005\u1007\u0004\u0006\u1001\u0005\u0007\u1001\u0006\u0008\u1002\u0007\t\u1004\u0008\n\u1002\t"

    .line 97
    .line 98
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbA(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1
.end method
