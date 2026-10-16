.class public final Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;
.super Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvn;


# static fields
.field private static final zbb:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:Z

.field private zbh:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

.field private zbi:J

.field private zbj:Z

.field private zbk:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuk;

.field private zbl:F

.field private zbm:F

.field private zbn:F

.field private zbo:F

.field private zbp:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbb:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbD(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbe:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbp:B

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zby()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbh:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbj:Z

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbv()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuk;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbk:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuk;

    .line 24
    .line 25
    const v0, 0x3e19999a    # 0.15f

    .line 26
    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbl:F

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbb:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    return-object v0
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
    const/4 v3, 0x0

    .line 16
    if-eq p1, v2, :cond_2

    .line 17
    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    move p3, v0

    .line 23
    :cond_0
    iput-byte p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbp:B

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbb:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhq;

    .line 30
    .line 31
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhq;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhp;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 36
    .line 37
    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_4
    const/16 p1, 0xe

    .line 42
    .line 43
    new-array p1, p1, [Ljava/lang/Object;

    .line 44
    .line 45
    const-string p2, "zbf"

    .line 46
    .line 47
    aput-object p2, p1, v0

    .line 48
    .line 49
    const-string p2, "zbe"

    .line 50
    .line 51
    aput-object p2, p1, p3

    .line 52
    .line 53
    const-string p2, "zbd"

    .line 54
    .line 55
    aput-object p2, p1, v4

    .line 56
    .line 57
    const-class p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbim;

    .line 58
    .line 59
    aput-object p2, p1, v3

    .line 60
    .line 61
    const-string p2, "zbg"

    .line 62
    .line 63
    aput-object p2, p1, v2

    .line 64
    .line 65
    const-string p2, "zbh"

    .line 66
    .line 67
    aput-object p2, p1, v1

    .line 68
    .line 69
    const-class p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhi;

    .line 70
    .line 71
    const/4 p3, 0x6

    .line 72
    aput-object p2, p1, p3

    .line 73
    .line 74
    const-string p2, "zbk"

    .line 75
    .line 76
    const/4 p3, 0x7

    .line 77
    aput-object p2, p1, p3

    .line 78
    .line 79
    const-string p2, "zbl"

    .line 80
    .line 81
    const/16 p3, 0x8

    .line 82
    .line 83
    aput-object p2, p1, p3

    .line 84
    .line 85
    const-string p2, "zbm"

    .line 86
    .line 87
    const/16 p3, 0x9

    .line 88
    .line 89
    aput-object p2, p1, p3

    .line 90
    .line 91
    const-string p2, "zbn"

    .line 92
    .line 93
    const/16 p3, 0xa

    .line 94
    .line 95
    aput-object p2, p1, p3

    .line 96
    .line 97
    const-string p2, "zbo"

    .line 98
    .line 99
    const/16 p3, 0xb

    .line 100
    .line 101
    aput-object p2, p1, p3

    .line 102
    .line 103
    const-string p2, "zbi"

    .line 104
    .line 105
    const/16 p3, 0xc

    .line 106
    .line 107
    aput-object p2, p1, p3

    .line 108
    .line 109
    const-string p2, "zbj"

    .line 110
    .line 111
    const/16 p3, 0xd

    .line 112
    .line 113
    aput-object p2, p1, p3

    .line 114
    .line 115
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbb:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;

    .line 116
    .line 117
    const-string p3, "\u0001\n\u0001\u0001\u0002\r\n\u0000\u0002\u0001\u0002\u043c\u0000\u0003\u1007\u0000\u0004\u001b\u0005\u0013\u0006\u1001\u0003\u0007\u1001\u0004\u0008\u1001\u0005\u000b\u1001\u0006\u000c\u1002\u0001\r\u1007\u0002"

    .line 118
    .line 119
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbA(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhr;->zbp:B

    .line 125
    .line 126
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method
