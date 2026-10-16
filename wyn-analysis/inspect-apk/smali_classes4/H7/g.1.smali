.class public final LH7/g;
.super Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvn;


# static fields
.field private static final zbb:LH7/g;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:Z

.field private zbh:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbix;

.field private zbi:Z

.field private zbj:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbhf;

.field private zbk:F

.field private zbl:Z

.field private zbm:Z

.field private zbn:I

.field private zbo:Z

.field private zbp:F

.field private zbq:I

.field private zbr:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbq;

.field private zbs:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/g;

    .line 2
    .line 3
    invoke-direct {v0}, LH7/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH7/g;->zbb:LH7/g;

    .line 7
    .line 8
    const-class v1, LH7/g;

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
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LH7/g;->zbe:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput-byte v0, p0, LH7/g;->zbs:B

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, LH7/g;->zbn:I

    .line 12
    .line 13
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
    iput-byte p3, p0, LH7/g;->zbs:B

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object p1, LH7/g;->zbb:LH7/g;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, LH7/c;

    .line 30
    .line 31
    sget-object p2, LH7/g;->zbb:LH7/g;

    .line 32
    .line 33
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtz;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    new-instance p1, LH7/g;

    .line 38
    .line 39
    invoke-direct {p1}, LH7/g;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_4
    const/16 p1, 0x11

    .line 44
    .line 45
    new-array p1, p1, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string p2, "zbf"

    .line 48
    .line 49
    aput-object p2, p1, v0

    .line 50
    .line 51
    const-string p2, "zbe"

    .line 52
    .line 53
    aput-object p2, p1, p3

    .line 54
    .line 55
    const-string p2, "zbd"

    .line 56
    .line 57
    aput-object p2, p1, v4

    .line 58
    .line 59
    const-class p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbafq;

    .line 60
    .line 61
    aput-object p2, p1, v3

    .line 62
    .line 63
    const-string p2, "zbh"

    .line 64
    .line 65
    aput-object p2, p1, v2

    .line 66
    .line 67
    const-string p2, "zbj"

    .line 68
    .line 69
    aput-object p2, p1, v1

    .line 70
    .line 71
    const-string p2, "zbm"

    .line 72
    .line 73
    const/4 p3, 0x6

    .line 74
    aput-object p2, p1, p3

    .line 75
    .line 76
    const-string p2, "zbn"

    .line 77
    .line 78
    const/4 p3, 0x7

    .line 79
    aput-object p2, p1, p3

    .line 80
    .line 81
    const-string p2, "zbo"

    .line 82
    .line 83
    const/16 p3, 0x8

    .line 84
    .line 85
    aput-object p2, p1, p3

    .line 86
    .line 87
    const-string p2, "zbg"

    .line 88
    .line 89
    const/16 p3, 0x9

    .line 90
    .line 91
    aput-object p2, p1, p3

    .line 92
    .line 93
    const-string p2, "zbp"

    .line 94
    .line 95
    const/16 p3, 0xa

    .line 96
    .line 97
    aput-object p2, p1, p3

    .line 98
    .line 99
    const-string p2, "zbq"

    .line 100
    .line 101
    const/16 p3, 0xb

    .line 102
    .line 103
    aput-object p2, p1, p3

    .line 104
    .line 105
    const-string p2, "zbi"

    .line 106
    .line 107
    const/16 p3, 0xc

    .line 108
    .line 109
    aput-object p2, p1, p3

    .line 110
    .line 111
    const-string p2, "zbr"

    .line 112
    .line 113
    const/16 p3, 0xd

    .line 114
    .line 115
    aput-object p2, p1, p3

    .line 116
    .line 117
    const-string p2, "zbk"

    .line 118
    .line 119
    const/16 p3, 0xe

    .line 120
    .line 121
    aput-object p2, p1, p3

    .line 122
    .line 123
    const-string p2, "zbl"

    .line 124
    .line 125
    const/16 p3, 0xf

    .line 126
    .line 127
    aput-object p2, p1, p3

    .line 128
    .line 129
    const-class p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbcz;

    .line 130
    .line 131
    const/16 p3, 0x10

    .line 132
    .line 133
    aput-object p2, p1, p3

    .line 134
    .line 135
    sget-object p2, LH7/g;->zbb:LH7/g;

    .line 136
    .line 137
    const-string p3, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001\u043c\u0000\u0002\u1009\u0001\u0003\u1009\u0003\u0004\u1007\u0006\u0005\u1004\u0007\u0006\u1007\u0008\u0007\u1007\u0000\u0008\u1001\t\t\u1004\n\n\u1007\u0002\u000b\u1009\u000b\u000c\u1001\u0004\r\u1007\u0005\u000e<\u0000"

    .line 138
    .line 139
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbA(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_5
    iget-byte p1, p0, LH7/g;->zbs:B

    .line 145
    .line 146
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1
.end method
