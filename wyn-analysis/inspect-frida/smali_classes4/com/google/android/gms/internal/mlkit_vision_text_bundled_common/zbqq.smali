.class public final Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;
.super Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbub;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvn;


# static fields
.field private static final zbd:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;


# instance fields
.field private zbA:I

.field private zbB:F

.field private zbC:Z

.field private zbD:I

.field private zbE:B

.field private zbe:I

.field private zbf:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

.field private zbg:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpw;

.field private zbh:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpw;

.field private zbi:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpw;

.field private zbj:Ljava/lang/String;

.field private zbk:F

.field private zbl:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

.field private zbm:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

.field private zbn:F

.field private zbo:Ljava/lang/String;

.field private zbp:Z

.field private zbq:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

.field private zbr:I

.field private zbs:I

.field private zbt:Z

.field private zbu:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqi;

.field private zbv:Z

.field private zbw:I

.field private zbx:I

.field private zby:I

.field private zbz:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbrz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbd:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbD(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbub;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbE:B

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zby()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbf:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbj:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zby()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbl:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zby()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbm:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbo:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zby()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbq:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbun;

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbd:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    return-object v0
.end method


# virtual methods
.method public final zbb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

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
    iput-byte p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbE:B

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbd:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqp;

    .line 30
    .line 31
    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqp;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpu;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 36
    .line 37
    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbabe;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuj;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/16 p2, 0x1f

    .line 46
    .line 47
    new-array p2, p2, [Ljava/lang/Object;

    .line 48
    .line 49
    const-string v5, "zbe"

    .line 50
    .line 51
    aput-object v5, p2, v0

    .line 52
    .line 53
    const-string v0, "zbf"

    .line 54
    .line 55
    aput-object v0, p2, p3

    .line 56
    .line 57
    const-class p3, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbrs;

    .line 58
    .line 59
    aput-object p3, p2, v4

    .line 60
    .line 61
    const-string p3, "zbg"

    .line 62
    .line 63
    aput-object p3, p2, v3

    .line 64
    .line 65
    const-string p3, "zbh"

    .line 66
    .line 67
    aput-object p3, p2, v2

    .line 68
    .line 69
    const-string p3, "zbj"

    .line 70
    .line 71
    aput-object p3, p2, v1

    .line 72
    .line 73
    const-string p3, "zbk"

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    aput-object p3, p2, v0

    .line 77
    .line 78
    const-string p3, "zbm"

    .line 79
    .line 80
    const/4 v0, 0x7

    .line 81
    aput-object p3, p2, v0

    .line 82
    .line 83
    const-class p3, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpy;

    .line 84
    .line 85
    const/16 v0, 0x8

    .line 86
    .line 87
    aput-object p3, p2, v0

    .line 88
    .line 89
    const-string p3, "zbn"

    .line 90
    .line 91
    const/16 v0, 0x9

    .line 92
    .line 93
    aput-object p3, p2, v0

    .line 94
    .line 95
    const-string p3, "zbo"

    .line 96
    .line 97
    const/16 v0, 0xa

    .line 98
    .line 99
    aput-object p3, p2, v0

    .line 100
    .line 101
    const-string p3, "zbl"

    .line 102
    .line 103
    const/16 v0, 0xb

    .line 104
    .line 105
    aput-object p3, p2, v0

    .line 106
    .line 107
    const-class p3, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqa;

    .line 108
    .line 109
    const/16 v0, 0xc

    .line 110
    .line 111
    aput-object p3, p2, v0

    .line 112
    .line 113
    const-string p3, "zbp"

    .line 114
    .line 115
    const/16 v0, 0xd

    .line 116
    .line 117
    aput-object p3, p2, v0

    .line 118
    .line 119
    const-string p3, "zbq"

    .line 120
    .line 121
    const/16 v0, 0xe

    .line 122
    .line 123
    aput-object p3, p2, v0

    .line 124
    .line 125
    const-class p3, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbrc;

    .line 126
    .line 127
    const/16 v0, 0xf

    .line 128
    .line 129
    aput-object p3, p2, v0

    .line 130
    .line 131
    const-string p3, "zbr"

    .line 132
    .line 133
    const/16 v0, 0x10

    .line 134
    .line 135
    aput-object p3, p2, v0

    .line 136
    .line 137
    const-string p3, "zbs"

    .line 138
    .line 139
    const/16 v0, 0x11

    .line 140
    .line 141
    aput-object p3, p2, v0

    .line 142
    .line 143
    const-string p3, "zbt"

    .line 144
    .line 145
    const/16 v0, 0x12

    .line 146
    .line 147
    aput-object p3, p2, v0

    .line 148
    .line 149
    const-string p3, "zbu"

    .line 150
    .line 151
    const/16 v0, 0x13

    .line 152
    .line 153
    aput-object p3, p2, v0

    .line 154
    .line 155
    const-string p3, "zbv"

    .line 156
    .line 157
    const/16 v0, 0x14

    .line 158
    .line 159
    aput-object p3, p2, v0

    .line 160
    .line 161
    const-string p3, "zbw"

    .line 162
    .line 163
    const/16 v0, 0x15

    .line 164
    .line 165
    aput-object p3, p2, v0

    .line 166
    .line 167
    const-string p3, "zbx"

    .line 168
    .line 169
    const/16 v0, 0x16

    .line 170
    .line 171
    aput-object p3, p2, v0

    .line 172
    .line 173
    const-string p3, "zbi"

    .line 174
    .line 175
    const/16 v0, 0x17

    .line 176
    .line 177
    aput-object p3, p2, v0

    .line 178
    .line 179
    const-string p3, "zby"

    .line 180
    .line 181
    const/16 v0, 0x18

    .line 182
    .line 183
    aput-object p3, p2, v0

    .line 184
    .line 185
    const-string p3, "zbz"

    .line 186
    .line 187
    const/16 v0, 0x19

    .line 188
    .line 189
    aput-object p3, p2, v0

    .line 190
    .line 191
    const-string p3, "zbA"

    .line 192
    .line 193
    const/16 v0, 0x1a

    .line 194
    .line 195
    aput-object p3, p2, v0

    .line 196
    .line 197
    const/16 p3, 0x1b

    .line 198
    .line 199
    aput-object p1, p2, p3

    .line 200
    .line 201
    const-string p1, "zbB"

    .line 202
    .line 203
    const/16 p3, 0x1c

    .line 204
    .line 205
    aput-object p1, p2, p3

    .line 206
    .line 207
    const-string p1, "zbC"

    .line 208
    .line 209
    const/16 p3, 0x1d

    .line 210
    .line 211
    aput-object p1, p2, p3

    .line 212
    .line 213
    const-string p1, "zbD"

    .line 214
    .line 215
    const/16 p3, 0x1e

    .line 216
    .line 217
    aput-object p1, p2, p3

    .line 218
    .line 219
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbd:Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;

    .line 220
    .line 221
    const-string p3, "\u0001\u0019\u0000\u0001\u0001d\u0019\u0000\u0004\u0006\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1008\u0003\u0005\u1001\u0004\u0006\u001b\u0007\u1001\u0005\u0008\u1008\u0006\t\u041b\n\u1007\u0007\u000b\u001b\u000c\u1004\u0008\r\u1004\t\u000e\u1007\n\u000f\u1409\u000b\u0010\u1007\u000c\u0011\u1004\r\u0012\u1004\u000e\u0013\u1409\u0002\u0014\u1004\u000f\u0015\u1009\u0010\u0016\u180c\u0011\u0017\u1001\u0012\u0018\u1007\u0013d\u1004\u0014"

    .line 222
    .line 223
    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;->zbA(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbvm;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    return-object p1

    .line 228
    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbqq;->zbE:B

    .line 229
    .line 230
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1
.end method
