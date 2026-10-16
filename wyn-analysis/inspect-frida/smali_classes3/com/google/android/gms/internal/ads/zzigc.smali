.class final Lcom/google/android/gms/internal/ads/zzigc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzigr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzigr<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zza:[I

.field private static final zzb:Lsun/misc/Unsafe;


# instance fields
.field private final zzc:[I

.field private final zzd:[Ljava/lang/Object;

.field private final zze:I

.field private final zzf:I

.field private final zzg:Lcom/google/android/gms/internal/ads/zzifz;

.field private final zzh:Z

.field private final zzi:Z

.field private final zzj:[I

.field private final zzk:I

.field private final zzl:I

.field private final zzm:Lcom/google/android/gms/internal/ads/zzihd;

.field private final zzn:Lcom/google/android/gms/internal/ads/zziea;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/ads/zzigc;->zza:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihk;->zzr()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/ads/zzifz;Z[IIILcom/google/android/gms/internal/ads/zzigf;Lcom/google/android/gms/internal/ads/zzifl;Lcom/google/android/gms/internal/ads/zzihd;Lcom/google/android/gms/internal/ads/zziea;Lcom/google/android/gms/internal/ads/zzifu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzd:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzigc;->zze:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzf:I

    instance-of p1, p5, Lcom/google/android/gms/internal/ads/zziep;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzi:Z

    const/4 p1, 0x0

    if-eqz p13, :cond_0

    instance-of p2, p5, Lcom/google/android/gms/internal/ads/zziel;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzn:Lcom/google/android/gms/internal/ads/zziea;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzg:Lcom/google/android/gms/internal/ads/zzifz;

    return-void
.end method

.method private final zzA(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private final zzB(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private static zzC(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private static zzD(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzE(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/ads/zziep;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/gms/internal/ads/zziep;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziep;->zzaX()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private static zzF(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "Mutating immutable message: "

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method private static zzG(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static zzH(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private final zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method private final zzJ(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private final zzK(Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzB(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int v2, v0, v1

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    const-wide/32 v4, 0xfffff

    .line 12
    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v4, :cond_14

    .line 19
    .line 20
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int v0, p2, v1

    .line 25
    .line 26
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    int-to-long v0, v0

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    packed-switch p2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzigc;->zzR()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    return v6

    .line 48
    :cond_0
    return v5

    .line 49
    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    cmp-long p1, p1, v2

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    return v6

    .line 58
    :cond_1
    return v5

    .line 59
    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    return v6

    .line 66
    :cond_2
    return v5

    .line 67
    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    cmp-long p1, p1, v2

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    return v6

    .line 76
    :cond_3
    return v5

    .line 77
    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    return v6

    .line 84
    :cond_4
    return v5

    .line 85
    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    return v6

    .line 92
    :cond_5
    return v5

    .line 93
    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    return v6

    .line 100
    :cond_6
    return v5

    .line 101
    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/ads/zzidl;->zza:Lcom/google/android/gms/internal/ads/zzidl;

    .line 102
    .line 103
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzidl;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    return v6

    .line 114
    :cond_7
    return v5

    .line 115
    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_8

    .line 120
    .line 121
    return v6

    .line 122
    :cond_8
    return v5

    .line 123
    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    instance-of p2, p1, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz p2, :cond_a

    .line 130
    .line 131
    check-cast p1, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-nez p1, :cond_9

    .line 138
    .line 139
    return v6

    .line 140
    :cond_9
    return v5

    .line 141
    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/ads/zzidl;

    .line 142
    .line 143
    if-eqz p2, :cond_c

    .line 144
    .line 145
    sget-object p2, Lcom/google/android/gms/internal/ads/zzidl;->zza:Lcom/google/android/gms/internal/ads/zzidl;

    .line 146
    .line 147
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzidl;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_b

    .line 152
    .line 153
    return v6

    .line 154
    :cond_b
    return v5

    .line 155
    :cond_c
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzigc;->zzR()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    return p1

    .line 160
    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    return p1

    .line 165
    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_d

    .line 170
    .line 171
    return v6

    .line 172
    :cond_d
    return v5

    .line 173
    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 174
    .line 175
    .line 176
    move-result-wide p1

    .line 177
    cmp-long p1, p1, v2

    .line 178
    .line 179
    if-eqz p1, :cond_e

    .line 180
    .line 181
    return v6

    .line 182
    :cond_e
    return v5

    .line 183
    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_f

    .line 188
    .line 189
    return v6

    .line 190
    :cond_f
    return v5

    .line 191
    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 192
    .line 193
    .line 194
    move-result-wide p1

    .line 195
    cmp-long p1, p1, v2

    .line 196
    .line 197
    if-eqz p1, :cond_10

    .line 198
    .line 199
    return v6

    .line 200
    :cond_10
    return v5

    .line 201
    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 202
    .line 203
    .line 204
    move-result-wide p1

    .line 205
    cmp-long p1, p1, v2

    .line 206
    .line 207
    if-eqz p1, :cond_11

    .line 208
    .line 209
    return v6

    .line 210
    :cond_11
    return v5

    .line 211
    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_12

    .line 220
    .line 221
    return v6

    .line 222
    :cond_12
    return v5

    .line 223
    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 224
    .line 225
    .line 226
    move-result-wide p1

    .line 227
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 228
    .line 229
    .line 230
    move-result-wide p1

    .line 231
    cmp-long p1, p1, v2

    .line 232
    .line 233
    if-eqz p1, :cond_13

    .line 234
    .line 235
    return v6

    .line 236
    :cond_13
    return v5

    .line 237
    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    .line 238
    .line 239
    shl-int p2, v6, p2

    .line 240
    .line 241
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    and-int/2addr p1, p2

    .line 246
    if-eqz p1, :cond_15

    .line 247
    .line 248
    return v6

    .line 249
    :cond_15
    return v5

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzL(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzB(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p2

    .line 9
    int-to-long v0, v0

    .line 10
    const-wide/32 v2, 0xfffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    shl-int p2, v3, p2

    .line 26
    .line 27
    or-int/2addr p2, v2

    .line 28
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final zzM(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzB(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private final zzN(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzB(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method private final zzO(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzB(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final zzP(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zze:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzf:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzQ(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, -0x1

    .line 16
    return p1
.end method

.method private final zzQ(II)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    div-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    :goto_0
    if-gt p2, v1, :cond_2

    .line 9
    .line 10
    add-int v3, v1, p2

    .line 11
    .line 12
    ushr-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    mul-int/lit8 v4, v3, 0x3

    .line 15
    .line 16
    aget v5, v0, v4

    .line 17
    .line 18
    if-ne p1, v5, :cond_0

    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    if-ge p1, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v3, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return v2
.end method

.method private zzR()Z
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method private static final zzS([BIILcom/google/android/gms/internal/ads/zzihq;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzicz;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzihq;->zza:Lcom/google/android/gms/internal/ads/zzihq;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    const-string p1, "unsupported field type."

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_1
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget-wide p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 23
    .line 24
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 33
    .line 34
    return p0

    .line 35
    :pswitch_2
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 40
    .line 41
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_3
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzg([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzigj;->zza()Lcom/google/android/gms/internal/ads/zzigj;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/ads/zzigj;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzigr;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-static {p3, p0, p1, p2, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzh(Lcom/google/android/gms/internal/ads/zzigr;[BIILcom/google/android/gms/internal/ads/zzicz;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :pswitch_5
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzf([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :pswitch_6
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    iget-wide p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 80
    .line 81
    const-wide/16 p3, 0x0

    .line 82
    .line 83
    cmp-long p1, p1, p3

    .line 84
    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/4 p1, 0x0

    .line 90
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 95
    .line 96
    return p0

    .line 97
    :pswitch_7
    add-int/lit8 p2, p1, 0x4

    .line 98
    .line 99
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iput-object p0, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 108
    .line 109
    return p2

    .line 110
    :pswitch_8
    add-int/lit8 p2, p1, 0x8

    .line 111
    .line 112
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    .line 113
    .line 114
    .line 115
    move-result-wide p0

    .line 116
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    iput-object p0, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 121
    .line 122
    return p2

    .line 123
    :pswitch_9
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    iget p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 128
    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 134
    .line 135
    return p0

    .line 136
    :pswitch_a
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    iget-wide p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 141
    .line 142
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iput-object p1, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 147
    .line 148
    return p0

    .line 149
    :pswitch_b
    add-int/lit8 p2, p1, 0x4

    .line 150
    .line 151
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    iput-object p0, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 164
    .line 165
    return p2

    .line 166
    :pswitch_c
    add-int/lit8 p2, p1, 0x8

    .line 167
    .line 168
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    .line 169
    .line 170
    .line 171
    move-result-wide p0

    .line 172
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 173
    .line 174
    .line 175
    move-result-wide p0

    .line 176
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    iput-object p0, p5, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 181
    .line 182
    return p2

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static final zzT(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihs;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/ads/zzihs;->zzm(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzidl;

    .line 12
    .line 13
    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/ads/zzihs;->zzn(ILcom/google/android/gms/internal/ads/zzidl;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzihe;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/ads/zziep;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihe;->zza()Lcom/google/android/gms/internal/ads/zzihe;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihe;->zzb()Lcom/google/android/gms/internal/ads/zzihe;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public static zzm(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzifw;Lcom/google/android/gms/internal/ads/zzigf;Lcom/google/android/gms/internal/ads/zzifl;Lcom/google/android/gms/internal/ads/zzihd;Lcom/google/android/gms/internal/ads/zziea;Lcom/google/android/gms/internal/ads/zzifu;)Lcom/google/android/gms/internal/ads/zzigc;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzigl;

    .line 4
    .line 5
    if-eqz v1, :cond_36

    .line 6
    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzigl;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzigl;->zzd()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const v5, 0xd800

    .line 23
    .line 24
    .line 25
    if-lt v4, v5, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    :goto_0
    add-int/lit8 v7, v4, 0x1

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-lt v4, v5, :cond_1

    .line 35
    .line 36
    move v4, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x1

    .line 39
    :cond_1
    add-int/lit8 v4, v7, 0x1

    .line 40
    .line 41
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-lt v7, v5, :cond_3

    .line 46
    .line 47
    and-int/lit16 v7, v7, 0x1fff

    .line 48
    .line 49
    const/16 v9, 0xd

    .line 50
    .line 51
    :goto_1
    add-int/lit8 v10, v4, 0x1

    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-lt v4, v5, :cond_2

    .line 58
    .line 59
    and-int/lit16 v4, v4, 0x1fff

    .line 60
    .line 61
    shl-int/2addr v4, v9

    .line 62
    or-int/2addr v7, v4

    .line 63
    add-int/lit8 v9, v9, 0xd

    .line 64
    .line 65
    move v4, v10

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    shl-int/2addr v4, v9

    .line 68
    or-int/2addr v7, v4

    .line 69
    move v4, v10

    .line 70
    :cond_3
    if-nez v7, :cond_4

    .line 71
    .line 72
    sget-object v7, Lcom/google/android/gms/internal/ads/zzigc;->zza:[I

    .line 73
    .line 74
    move v9, v3

    .line 75
    move v10, v9

    .line 76
    move v11, v10

    .line 77
    move v12, v11

    .line 78
    move v13, v12

    .line 79
    move/from16 v17, v13

    .line 80
    .line 81
    move-object/from16 v16, v7

    .line 82
    .line 83
    move/from16 v7, v17

    .line 84
    .line 85
    goto/16 :goto_a

    .line 86
    .line 87
    :cond_4
    add-int/lit8 v7, v4, 0x1

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-lt v4, v5, :cond_6

    .line 94
    .line 95
    and-int/lit16 v4, v4, 0x1fff

    .line 96
    .line 97
    const/16 v9, 0xd

    .line 98
    .line 99
    :goto_2
    add-int/lit8 v10, v7, 0x1

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-lt v7, v5, :cond_5

    .line 106
    .line 107
    and-int/lit16 v7, v7, 0x1fff

    .line 108
    .line 109
    shl-int/2addr v7, v9

    .line 110
    or-int/2addr v4, v7

    .line 111
    add-int/lit8 v9, v9, 0xd

    .line 112
    .line 113
    move v7, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    shl-int/2addr v7, v9

    .line 116
    or-int/2addr v4, v7

    .line 117
    move v7, v10

    .line 118
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 119
    .line 120
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-lt v7, v5, :cond_8

    .line 125
    .line 126
    and-int/lit16 v7, v7, 0x1fff

    .line 127
    .line 128
    const/16 v10, 0xd

    .line 129
    .line 130
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 131
    .line 132
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-lt v9, v5, :cond_7

    .line 137
    .line 138
    and-int/lit16 v9, v9, 0x1fff

    .line 139
    .line 140
    shl-int/2addr v9, v10

    .line 141
    or-int/2addr v7, v9

    .line 142
    add-int/lit8 v10, v10, 0xd

    .line 143
    .line 144
    move v9, v11

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    shl-int/2addr v9, v10

    .line 147
    or-int/2addr v7, v9

    .line 148
    move v9, v11

    .line 149
    :cond_8
    add-int/lit8 v10, v9, 0x1

    .line 150
    .line 151
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-lt v9, v5, :cond_a

    .line 156
    .line 157
    and-int/lit16 v9, v9, 0x1fff

    .line 158
    .line 159
    const/16 v11, 0xd

    .line 160
    .line 161
    :goto_4
    add-int/lit8 v12, v10, 0x1

    .line 162
    .line 163
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-lt v10, v5, :cond_9

    .line 168
    .line 169
    and-int/lit16 v10, v10, 0x1fff

    .line 170
    .line 171
    shl-int/2addr v10, v11

    .line 172
    or-int/2addr v9, v10

    .line 173
    add-int/lit8 v11, v11, 0xd

    .line 174
    .line 175
    move v10, v12

    .line 176
    goto :goto_4

    .line 177
    :cond_9
    shl-int/2addr v10, v11

    .line 178
    or-int/2addr v9, v10

    .line 179
    move v10, v12

    .line 180
    :cond_a
    add-int/lit8 v11, v10, 0x1

    .line 181
    .line 182
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-lt v10, v5, :cond_c

    .line 187
    .line 188
    and-int/lit16 v10, v10, 0x1fff

    .line 189
    .line 190
    const/16 v12, 0xd

    .line 191
    .line 192
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 193
    .line 194
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-lt v11, v5, :cond_b

    .line 199
    .line 200
    and-int/lit16 v11, v11, 0x1fff

    .line 201
    .line 202
    shl-int/2addr v11, v12

    .line 203
    or-int/2addr v10, v11

    .line 204
    add-int/lit8 v12, v12, 0xd

    .line 205
    .line 206
    move v11, v13

    .line 207
    goto :goto_5

    .line 208
    :cond_b
    shl-int/2addr v11, v12

    .line 209
    or-int/2addr v10, v11

    .line 210
    move v11, v13

    .line 211
    :cond_c
    add-int/lit8 v12, v11, 0x1

    .line 212
    .line 213
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-lt v11, v5, :cond_e

    .line 218
    .line 219
    and-int/lit16 v11, v11, 0x1fff

    .line 220
    .line 221
    const/16 v13, 0xd

    .line 222
    .line 223
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 224
    .line 225
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-lt v12, v5, :cond_d

    .line 230
    .line 231
    and-int/lit16 v12, v12, 0x1fff

    .line 232
    .line 233
    shl-int/2addr v12, v13

    .line 234
    or-int/2addr v11, v12

    .line 235
    add-int/lit8 v13, v13, 0xd

    .line 236
    .line 237
    move v12, v14

    .line 238
    goto :goto_6

    .line 239
    :cond_d
    shl-int/2addr v12, v13

    .line 240
    or-int/2addr v11, v12

    .line 241
    move v12, v14

    .line 242
    :cond_e
    add-int/lit8 v13, v12, 0x1

    .line 243
    .line 244
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    if-lt v12, v5, :cond_10

    .line 249
    .line 250
    and-int/lit16 v12, v12, 0x1fff

    .line 251
    .line 252
    const/16 v14, 0xd

    .line 253
    .line 254
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 255
    .line 256
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-lt v13, v5, :cond_f

    .line 261
    .line 262
    and-int/lit16 v13, v13, 0x1fff

    .line 263
    .line 264
    shl-int/2addr v13, v14

    .line 265
    or-int/2addr v12, v13

    .line 266
    add-int/lit8 v14, v14, 0xd

    .line 267
    .line 268
    move v13, v15

    .line 269
    goto :goto_7

    .line 270
    :cond_f
    shl-int/2addr v13, v14

    .line 271
    or-int/2addr v12, v13

    .line 272
    move v13, v15

    .line 273
    :cond_10
    add-int/lit8 v14, v13, 0x1

    .line 274
    .line 275
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    if-lt v13, v5, :cond_12

    .line 280
    .line 281
    :goto_8
    add-int/lit8 v13, v14, 0x1

    .line 282
    .line 283
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    if-lt v14, v5, :cond_11

    .line 288
    .line 289
    move v14, v13

    .line 290
    goto :goto_8

    .line 291
    :cond_11
    move v14, v13

    .line 292
    :cond_12
    add-int/lit8 v13, v14, 0x1

    .line 293
    .line 294
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-lt v14, v5, :cond_14

    .line 299
    .line 300
    and-int/lit16 v14, v14, 0x1fff

    .line 301
    .line 302
    const/16 v15, 0xd

    .line 303
    .line 304
    :goto_9
    add-int/lit8 v16, v13, 0x1

    .line 305
    .line 306
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    if-lt v13, v5, :cond_13

    .line 311
    .line 312
    and-int/lit16 v13, v13, 0x1fff

    .line 313
    .line 314
    shl-int/2addr v13, v15

    .line 315
    or-int/2addr v14, v13

    .line 316
    add-int/lit8 v15, v15, 0xd

    .line 317
    .line 318
    move/from16 v13, v16

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_13
    shl-int/2addr v13, v15

    .line 322
    or-int/2addr v14, v13

    .line 323
    move/from16 v13, v16

    .line 324
    .line 325
    :cond_14
    add-int v15, v14, v12

    .line 326
    .line 327
    add-int/2addr v15, v4

    .line 328
    add-int v16, v4, v4

    .line 329
    .line 330
    add-int v16, v16, v7

    .line 331
    .line 332
    new-array v7, v15, [I

    .line 333
    .line 334
    move-object/from16 v17, v7

    .line 335
    .line 336
    move v7, v4

    .line 337
    move v4, v13

    .line 338
    move v13, v10

    .line 339
    move/from16 v10, v16

    .line 340
    .line 341
    move-object/from16 v16, v17

    .line 342
    .line 343
    move/from16 v17, v12

    .line 344
    .line 345
    move v12, v9

    .line 346
    move/from16 v9, v17

    .line 347
    .line 348
    move/from16 v17, v14

    .line 349
    .line 350
    :goto_a
    sget-object v14, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 351
    .line 352
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzigl;->zze()[Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzigl;->zzb()Lcom/google/android/gms/internal/ads/zzifz;

    .line 357
    .line 358
    .line 359
    move-result-object v18

    .line 360
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    add-int v18, v17, v9

    .line 365
    .line 366
    add-int v9, v11, v11

    .line 367
    .line 368
    mul-int/lit8 v11, v11, 0x3

    .line 369
    .line 370
    new-array v11, v11, [I

    .line 371
    .line 372
    new-array v9, v9, [Ljava/lang/Object;

    .line 373
    .line 374
    move/from16 v21, v17

    .line 375
    .line 376
    move/from16 v20, v18

    .line 377
    .line 378
    const/4 v8, 0x0

    .line 379
    const/16 v19, 0x0

    .line 380
    .line 381
    :goto_b
    if-ge v4, v2, :cond_35

    .line 382
    .line 383
    add-int/lit8 v22, v4, 0x1

    .line 384
    .line 385
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-lt v4, v5, :cond_16

    .line 390
    .line 391
    and-int/lit16 v4, v4, 0x1fff

    .line 392
    .line 393
    move/from16 v6, v22

    .line 394
    .line 395
    const/16 v22, 0xd

    .line 396
    .line 397
    :goto_c
    add-int/lit8 v24, v6, 0x1

    .line 398
    .line 399
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-lt v6, v5, :cond_15

    .line 404
    .line 405
    and-int/lit16 v6, v6, 0x1fff

    .line 406
    .line 407
    shl-int v6, v6, v22

    .line 408
    .line 409
    or-int/2addr v4, v6

    .line 410
    add-int/lit8 v22, v22, 0xd

    .line 411
    .line 412
    move/from16 v6, v24

    .line 413
    .line 414
    goto :goto_c

    .line 415
    :cond_15
    shl-int v6, v6, v22

    .line 416
    .line 417
    or-int/2addr v4, v6

    .line 418
    move/from16 v6, v24

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_16
    move/from16 v6, v22

    .line 422
    .line 423
    :goto_d
    add-int/lit8 v22, v6, 0x1

    .line 424
    .line 425
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    if-lt v6, v5, :cond_18

    .line 430
    .line 431
    and-int/lit16 v6, v6, 0x1fff

    .line 432
    .line 433
    move/from16 v5, v22

    .line 434
    .line 435
    const/16 v22, 0xd

    .line 436
    .line 437
    :goto_e
    add-int/lit8 v25, v5, 0x1

    .line 438
    .line 439
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    move-object/from16 v26, v0

    .line 444
    .line 445
    const v0, 0xd800

    .line 446
    .line 447
    .line 448
    if-lt v5, v0, :cond_17

    .line 449
    .line 450
    and-int/lit16 v0, v5, 0x1fff

    .line 451
    .line 452
    shl-int v0, v0, v22

    .line 453
    .line 454
    or-int/2addr v6, v0

    .line 455
    add-int/lit8 v22, v22, 0xd

    .line 456
    .line 457
    move/from16 v5, v25

    .line 458
    .line 459
    move-object/from16 v0, v26

    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_17
    shl-int v0, v5, v22

    .line 463
    .line 464
    or-int/2addr v6, v0

    .line 465
    move/from16 v0, v25

    .line 466
    .line 467
    goto :goto_f

    .line 468
    :cond_18
    move-object/from16 v26, v0

    .line 469
    .line 470
    move/from16 v0, v22

    .line 471
    .line 472
    :goto_f
    and-int/lit16 v5, v6, 0x400

    .line 473
    .line 474
    if-eqz v5, :cond_19

    .line 475
    .line 476
    add-int/lit8 v5, v19, 0x1

    .line 477
    .line 478
    aput v8, v16, v19

    .line 479
    .line 480
    move/from16 v19, v5

    .line 481
    .line 482
    :cond_19
    and-int/lit16 v5, v6, 0xff

    .line 483
    .line 484
    move/from16 v22, v2

    .line 485
    .line 486
    and-int/lit16 v2, v6, 0x800

    .line 487
    .line 488
    move/from16 v25, v2

    .line 489
    .line 490
    const/16 v2, 0x33

    .line 491
    .line 492
    if-lt v5, v2, :cond_23

    .line 493
    .line 494
    add-int/lit8 v2, v0, 0x1

    .line 495
    .line 496
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    move/from16 v27, v2

    .line 501
    .line 502
    const v2, 0xd800

    .line 503
    .line 504
    .line 505
    if-lt v0, v2, :cond_1b

    .line 506
    .line 507
    and-int/lit16 v0, v0, 0x1fff

    .line 508
    .line 509
    move/from16 v2, v27

    .line 510
    .line 511
    const/16 v27, 0xd

    .line 512
    .line 513
    :goto_10
    add-int/lit8 v29, v2, 0x1

    .line 514
    .line 515
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    move/from16 v30, v0

    .line 520
    .line 521
    const v0, 0xd800

    .line 522
    .line 523
    .line 524
    if-lt v2, v0, :cond_1a

    .line 525
    .line 526
    and-int/lit16 v0, v2, 0x1fff

    .line 527
    .line 528
    shl-int v0, v0, v27

    .line 529
    .line 530
    or-int v0, v30, v0

    .line 531
    .line 532
    add-int/lit8 v27, v27, 0xd

    .line 533
    .line 534
    move/from16 v2, v29

    .line 535
    .line 536
    goto :goto_10

    .line 537
    :cond_1a
    shl-int v0, v2, v27

    .line 538
    .line 539
    or-int v0, v30, v0

    .line 540
    .line 541
    move/from16 v2, v29

    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_1b
    move/from16 v2, v27

    .line 545
    .line 546
    :goto_11
    move/from16 v27, v0

    .line 547
    .line 548
    add-int/lit8 v0, v5, -0x33

    .line 549
    .line 550
    move/from16 v29, v2

    .line 551
    .line 552
    const/16 v2, 0x9

    .line 553
    .line 554
    if-eq v0, v2, :cond_1c

    .line 555
    .line 556
    const/16 v2, 0x11

    .line 557
    .line 558
    if-ne v0, v2, :cond_1d

    .line 559
    .line 560
    :cond_1c
    const/4 v2, 0x1

    .line 561
    goto :goto_13

    .line 562
    :cond_1d
    const/16 v2, 0xc

    .line 563
    .line 564
    if-ne v0, v2, :cond_20

    .line 565
    .line 566
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzigl;->zzc()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    const/4 v2, 0x1

    .line 571
    if-eq v0, v2, :cond_1f

    .line 572
    .line 573
    if-eqz v25, :cond_1e

    .line 574
    .line 575
    goto :goto_12

    .line 576
    :cond_1e
    const/4 v2, 0x0

    .line 577
    goto :goto_14

    .line 578
    :cond_1f
    :goto_12
    add-int/lit8 v0, v10, 0x1

    .line 579
    .line 580
    move/from16 v23, v0

    .line 581
    .line 582
    const/4 v0, 0x3

    .line 583
    invoke-static {v8, v0, v2}, Lcb/a;->A(III)I

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    aget-object v10, v15, v10

    .line 588
    .line 589
    aput-object v10, v9, v0

    .line 590
    .line 591
    move/from16 v10, v23

    .line 592
    .line 593
    :cond_20
    move/from16 v2, v25

    .line 594
    .line 595
    goto :goto_14

    .line 596
    :goto_13
    add-int/lit8 v0, v10, 0x1

    .line 597
    .line 598
    move/from16 v28, v0

    .line 599
    .line 600
    const/4 v0, 0x3

    .line 601
    invoke-static {v8, v0, v2}, Lcb/a;->A(III)I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    aget-object v2, v15, v10

    .line 606
    .line 607
    aput-object v2, v9, v0

    .line 608
    .line 609
    move/from16 v2, v25

    .line 610
    .line 611
    move/from16 v10, v28

    .line 612
    .line 613
    :goto_14
    add-int v0, v27, v27

    .line 614
    .line 615
    move/from16 v25, v0

    .line 616
    .line 617
    aget-object v0, v15, v25

    .line 618
    .line 619
    move/from16 v27, v2

    .line 620
    .line 621
    instance-of v2, v0, Ljava/lang/reflect/Field;

    .line 622
    .line 623
    if-eqz v2, :cond_21

    .line 624
    .line 625
    check-cast v0, Ljava/lang/reflect/Field;

    .line 626
    .line 627
    :goto_15
    move-object v2, v9

    .line 628
    move/from16 v28, v10

    .line 629
    .line 630
    goto :goto_16

    .line 631
    :cond_21
    check-cast v0, Ljava/lang/String;

    .line 632
    .line 633
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzn(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    aput-object v0, v15, v25

    .line 638
    .line 639
    add-int/lit8 v2, v20, 0x1

    .line 640
    .line 641
    aput v8, v16, v20

    .line 642
    .line 643
    move/from16 v20, v2

    .line 644
    .line 645
    goto :goto_15

    .line 646
    :goto_16
    invoke-virtual {v14, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 647
    .line 648
    .line 649
    move-result-wide v9

    .line 650
    long-to-int v0, v9

    .line 651
    add-int/lit8 v9, v25, 0x1

    .line 652
    .line 653
    aget-object v10, v15, v9

    .line 654
    .line 655
    move/from16 v25, v0

    .line 656
    .line 657
    instance-of v0, v10, Ljava/lang/reflect/Field;

    .line 658
    .line 659
    if-eqz v0, :cond_22

    .line 660
    .line 661
    check-cast v10, Ljava/lang/reflect/Field;

    .line 662
    .line 663
    goto :goto_17

    .line 664
    :cond_22
    check-cast v10, Ljava/lang/String;

    .line 665
    .line 666
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/ads/zzigc;->zzn(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    aput-object v10, v15, v9

    .line 671
    .line 672
    :goto_17
    invoke-virtual {v14, v10}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 673
    .line 674
    .line 675
    move-result-wide v9

    .line 676
    long-to-int v0, v9

    .line 677
    move-object v10, v1

    .line 678
    move/from16 v9, v28

    .line 679
    .line 680
    const/4 v1, 0x0

    .line 681
    move/from16 v28, v7

    .line 682
    .line 683
    move/from16 v7, v29

    .line 684
    .line 685
    move-object/from16 v29, v2

    .line 686
    .line 687
    move/from16 v2, v27

    .line 688
    .line 689
    move/from16 v27, v4

    .line 690
    .line 691
    move v4, v8

    .line 692
    move v8, v0

    .line 693
    move/from16 v0, v25

    .line 694
    .line 695
    goto/16 :goto_23

    .line 696
    .line 697
    :cond_23
    move-object v2, v9

    .line 698
    add-int/lit8 v9, v10, 0x1

    .line 699
    .line 700
    aget-object v27, v15, v10

    .line 701
    .line 702
    move-object/from16 v29, v2

    .line 703
    .line 704
    move-object/from16 v2, v27

    .line 705
    .line 706
    check-cast v2, Ljava/lang/String;

    .line 707
    .line 708
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzn(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    move/from16 v27, v4

    .line 713
    .line 714
    const/16 v4, 0x9

    .line 715
    .line 716
    if-eq v5, v4, :cond_24

    .line 717
    .line 718
    const/16 v4, 0x11

    .line 719
    .line 720
    if-ne v5, v4, :cond_25

    .line 721
    .line 722
    :cond_24
    move/from16 v28, v7

    .line 723
    .line 724
    const/4 v7, 0x1

    .line 725
    goto/16 :goto_1d

    .line 726
    .line 727
    :cond_25
    const/16 v4, 0x1b

    .line 728
    .line 729
    if-eq v5, v4, :cond_2d

    .line 730
    .line 731
    const/16 v4, 0x31

    .line 732
    .line 733
    if-ne v5, v4, :cond_26

    .line 734
    .line 735
    add-int/lit8 v10, v10, 0x2

    .line 736
    .line 737
    move/from16 v28, v7

    .line 738
    .line 739
    const/4 v7, 0x1

    .line 740
    goto/16 :goto_1c

    .line 741
    .line 742
    :cond_26
    const/16 v4, 0xc

    .line 743
    .line 744
    if-eq v5, v4, :cond_2a

    .line 745
    .line 746
    const/16 v4, 0x1e

    .line 747
    .line 748
    if-eq v5, v4, :cond_2a

    .line 749
    .line 750
    const/16 v4, 0x2c

    .line 751
    .line 752
    if-ne v5, v4, :cond_27

    .line 753
    .line 754
    goto :goto_19

    .line 755
    :cond_27
    const/16 v4, 0x32

    .line 756
    .line 757
    if-ne v5, v4, :cond_29

    .line 758
    .line 759
    add-int/lit8 v4, v10, 0x2

    .line 760
    .line 761
    add-int/lit8 v28, v21, 0x1

    .line 762
    .line 763
    aput v8, v16, v21

    .line 764
    .line 765
    div-int/lit8 v21, v8, 0x3

    .line 766
    .line 767
    aget-object v9, v15, v9

    .line 768
    .line 769
    add-int v21, v21, v21

    .line 770
    .line 771
    aput-object v9, v29, v21

    .line 772
    .line 773
    if-eqz v25, :cond_28

    .line 774
    .line 775
    add-int/lit8 v21, v21, 0x1

    .line 776
    .line 777
    add-int/lit8 v9, v10, 0x3

    .line 778
    .line 779
    aget-object v4, v15, v4

    .line 780
    .line 781
    aput-object v4, v29, v21

    .line 782
    .line 783
    move v4, v8

    .line 784
    move/from16 v21, v28

    .line 785
    .line 786
    :goto_18
    move/from16 v28, v7

    .line 787
    .line 788
    goto :goto_1f

    .line 789
    :cond_28
    move v9, v4

    .line 790
    move v4, v8

    .line 791
    move/from16 v21, v28

    .line 792
    .line 793
    const/16 v25, 0x0

    .line 794
    .line 795
    goto :goto_18

    .line 796
    :cond_29
    move/from16 v28, v7

    .line 797
    .line 798
    const/4 v7, 0x1

    .line 799
    goto :goto_1e

    .line 800
    :cond_2a
    :goto_19
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzigl;->zzc()I

    .line 801
    .line 802
    .line 803
    move-result v4

    .line 804
    move/from16 v28, v7

    .line 805
    .line 806
    const/4 v7, 0x1

    .line 807
    if-eq v4, v7, :cond_2c

    .line 808
    .line 809
    if-eqz v25, :cond_2b

    .line 810
    .line 811
    goto :goto_1a

    .line 812
    :cond_2b
    move v4, v8

    .line 813
    const/16 v25, 0x0

    .line 814
    .line 815
    goto :goto_1f

    .line 816
    :cond_2c
    :goto_1a
    add-int/lit8 v10, v10, 0x2

    .line 817
    .line 818
    const/4 v4, 0x3

    .line 819
    invoke-static {v8, v4, v7}, Lcb/a;->A(III)I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    aget-object v9, v15, v9

    .line 824
    .line 825
    aput-object v9, v29, v4

    .line 826
    .line 827
    :goto_1b
    move v4, v8

    .line 828
    move v9, v10

    .line 829
    goto :goto_1f

    .line 830
    :cond_2d
    move/from16 v28, v7

    .line 831
    .line 832
    const/4 v7, 0x1

    .line 833
    add-int/lit8 v10, v10, 0x2

    .line 834
    .line 835
    :goto_1c
    const/4 v4, 0x3

    .line 836
    invoke-static {v8, v4, v7}, Lcb/a;->A(III)I

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    aget-object v9, v15, v9

    .line 841
    .line 842
    aput-object v9, v29, v4

    .line 843
    .line 844
    goto :goto_1b

    .line 845
    :goto_1d
    const/4 v4, 0x3

    .line 846
    invoke-static {v8, v4, v7}, Lcb/a;->A(III)I

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    move-result-object v10

    .line 854
    aput-object v10, v29, v4

    .line 855
    .line 856
    :goto_1e
    move v4, v8

    .line 857
    :goto_1f
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 858
    .line 859
    .line 860
    move-result-wide v7

    .line 861
    long-to-int v2, v7

    .line 862
    and-int/lit16 v7, v6, 0x1000

    .line 863
    .line 864
    const v8, 0xfffff

    .line 865
    .line 866
    .line 867
    if-eqz v7, :cond_31

    .line 868
    .line 869
    const/16 v7, 0x11

    .line 870
    .line 871
    if-gt v5, v7, :cond_31

    .line 872
    .line 873
    add-int/lit8 v7, v0, 0x1

    .line 874
    .line 875
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    const v10, 0xd800

    .line 880
    .line 881
    .line 882
    if-lt v0, v10, :cond_2f

    .line 883
    .line 884
    and-int/lit16 v0, v0, 0x1fff

    .line 885
    .line 886
    const/16 v8, 0xd

    .line 887
    .line 888
    :goto_20
    add-int/lit8 v24, v7, 0x1

    .line 889
    .line 890
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 891
    .line 892
    .line 893
    move-result v7

    .line 894
    if-lt v7, v10, :cond_2e

    .line 895
    .line 896
    and-int/lit16 v7, v7, 0x1fff

    .line 897
    .line 898
    shl-int/2addr v7, v8

    .line 899
    or-int/2addr v0, v7

    .line 900
    add-int/lit8 v8, v8, 0xd

    .line 901
    .line 902
    move/from16 v7, v24

    .line 903
    .line 904
    goto :goto_20

    .line 905
    :cond_2e
    shl-int/2addr v7, v8

    .line 906
    or-int/2addr v0, v7

    .line 907
    move/from16 v7, v24

    .line 908
    .line 909
    :cond_2f
    add-int v8, v28, v28

    .line 910
    .line 911
    div-int/lit8 v24, v0, 0x20

    .line 912
    .line 913
    add-int v24, v24, v8

    .line 914
    .line 915
    aget-object v8, v15, v24

    .line 916
    .line 917
    instance-of v10, v8, Ljava/lang/reflect/Field;

    .line 918
    .line 919
    if-eqz v10, :cond_30

    .line 920
    .line 921
    check-cast v8, Ljava/lang/reflect/Field;

    .line 922
    .line 923
    :goto_21
    move/from16 v24, v0

    .line 924
    .line 925
    move-object v10, v1

    .line 926
    goto :goto_22

    .line 927
    :cond_30
    check-cast v8, Ljava/lang/String;

    .line 928
    .line 929
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzn(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 930
    .line 931
    .line 932
    move-result-object v8

    .line 933
    aput-object v8, v15, v24

    .line 934
    .line 935
    goto :goto_21

    .line 936
    :goto_22
    invoke-virtual {v14, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 937
    .line 938
    .line 939
    move-result-wide v0

    .line 940
    long-to-int v0, v0

    .line 941
    rem-int/lit8 v1, v24, 0x20

    .line 942
    .line 943
    move v8, v0

    .line 944
    move v0, v2

    .line 945
    move/from16 v2, v25

    .line 946
    .line 947
    goto :goto_23

    .line 948
    :cond_31
    move-object v10, v1

    .line 949
    move v7, v0

    .line 950
    move v0, v2

    .line 951
    move/from16 v2, v25

    .line 952
    .line 953
    const/4 v1, 0x0

    .line 954
    :goto_23
    add-int/lit8 v24, v4, 0x1

    .line 955
    .line 956
    aput v27, v11, v4

    .line 957
    .line 958
    add-int/lit8 v25, v4, 0x2

    .line 959
    .line 960
    move/from16 v27, v0

    .line 961
    .line 962
    and-int/lit16 v0, v6, 0x200

    .line 963
    .line 964
    if-eqz v0, :cond_32

    .line 965
    .line 966
    const/high16 v0, 0x20000000

    .line 967
    .line 968
    goto :goto_24

    .line 969
    :cond_32
    const/4 v0, 0x0

    .line 970
    :goto_24
    and-int/lit16 v6, v6, 0x100

    .line 971
    .line 972
    if-eqz v6, :cond_33

    .line 973
    .line 974
    const/high16 v6, 0x10000000

    .line 975
    .line 976
    goto :goto_25

    .line 977
    :cond_33
    const/4 v6, 0x0

    .line 978
    :goto_25
    if-eqz v2, :cond_34

    .line 979
    .line 980
    const/high16 v2, -0x80000000

    .line 981
    .line 982
    goto :goto_26

    .line 983
    :cond_34
    const/4 v2, 0x0

    .line 984
    :goto_26
    shl-int/lit8 v5, v5, 0x14

    .line 985
    .line 986
    or-int/2addr v0, v6

    .line 987
    or-int/2addr v0, v2

    .line 988
    or-int/2addr v0, v5

    .line 989
    or-int v0, v0, v27

    .line 990
    .line 991
    aput v0, v11, v24

    .line 992
    .line 993
    add-int/lit8 v0, v4, 0x3

    .line 994
    .line 995
    shl-int/lit8 v1, v1, 0x14

    .line 996
    .line 997
    or-int/2addr v1, v8

    .line 998
    aput v1, v11, v25

    .line 999
    .line 1000
    move v8, v0

    .line 1001
    move v4, v7

    .line 1002
    move-object v1, v10

    .line 1003
    move/from16 v2, v22

    .line 1004
    .line 1005
    move-object/from16 v0, v26

    .line 1006
    .line 1007
    move/from16 v7, v28

    .line 1008
    .line 1009
    const v5, 0xd800

    .line 1010
    .line 1011
    .line 1012
    move v10, v9

    .line 1013
    move-object/from16 v9, v29

    .line 1014
    .line 1015
    goto/16 :goto_b

    .line 1016
    .line 1017
    :cond_35
    move-object/from16 v26, v0

    .line 1018
    .line 1019
    move-object/from16 v29, v9

    .line 1020
    .line 1021
    new-instance v9, Lcom/google/android/gms/internal/ads/zzigc;

    .line 1022
    .line 1023
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzigl;->zzb()Lcom/google/android/gms/internal/ads/zzifz;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v14

    .line 1027
    const/4 v15, 0x0

    .line 1028
    move-object/from16 v19, p2

    .line 1029
    .line 1030
    move-object/from16 v20, p3

    .line 1031
    .line 1032
    move-object/from16 v21, p4

    .line 1033
    .line 1034
    move-object/from16 v22, p5

    .line 1035
    .line 1036
    move-object/from16 v23, p6

    .line 1037
    .line 1038
    move-object v10, v11

    .line 1039
    move-object/from16 v11, v29

    .line 1040
    .line 1041
    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/ads/zzigc;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/ads/zzifz;Z[IIILcom/google/android/gms/internal/ads/zzigf;Lcom/google/android/gms/internal/ads/zzifl;Lcom/google/android/gms/internal/ads/zzihd;Lcom/google/android/gms/internal/ads/zziea;Lcom/google/android/gms/internal/ads/zzifu;)V

    .line 1042
    .line 1043
    .line 1044
    return-object v9

    .line 1045
    :cond_36
    check-cast v0, Lcom/google/android/gms/internal/ads/zzigy;

    .line 1046
    .line 1047
    const/4 v0, 0x0

    .line 1048
    throw v0
.end method

.method private static zzn(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/lit8 v3, v3, 0xb

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    add-int/2addr v3, v4

    .line 60
    add-int/lit8 v3, v3, 0x1d

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    add-int/2addr v3, v4

    .line 69
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 70
    .line 71
    .line 72
    const-string v3, "Field "

    .line 73
    .line 74
    const-string v4, " for "

    .line 75
    .line 76
    invoke-static {v5, v3, p1, v4, p0}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p0, " not found. Known fields are "

    .line 80
    .line 81
    invoke-static {v5, p0, v1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v2
.end method

.method private final zzo(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    sget-object v1, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 17
    .line 18
    int-to-long v2, v0

    .line 19
    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p3, v4

    .line 80
    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 85
    .line 86
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    aget p1, p1, p3

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/16 p3, 0x26

    .line 95
    .line 96
    invoke-static {p1, p3}, LA7/p0;->f(II)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    add-int/2addr p3, v1

    .line 107
    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const-string p3, "Source subfield "

    .line 111
    .line 112
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p1, " is present but null: "

    .line 119
    .line 120
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0
.end method

.method private final zzp(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 2
    .line 3
    aget v1, v0, p3

    .line 4
    .line 5
    invoke-direct {p0, p2, v1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    sget-object v3, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 21
    .line 22
    int-to-long v4, v2

    .line 23
    invoke-virtual {v3, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, p1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p3, v0

    .line 84
    :cond_3
    invoke-interface {p2, p3, v2}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    aget p3, v0, p3

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    const/16 v0, 0x26

    .line 97
    .line 98
    invoke-static {p3, v0}, LA7/p0;->f(II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    add-int/2addr v0, v1

    .line 109
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const-string v0, "Source subfield "

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p3, " is present but null: "

    .line 121
    .line 122
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1
.end method

.method private final zzq(I)Lcom/google/android/gms/internal/ads/zzigr;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzd:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object v1, v0, p1

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/gms/internal/ads/zzigr;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzigj;->zza()Lcom/google/android/gms/internal/ads/zzigj;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    aget-object v1, v0, v1

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzigj;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzigr;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    aput-object v1, v0, p1

    .line 28
    .line 29
    return-object v1
.end method

.method private final zzr(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzd:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    return-object p1
.end method

.method private final zzs(I)Lcom/google/android/gms/internal/ads/zziev;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzd:[Ljava/lang/Object;

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    check-cast p1, Lcom/google/android/gms/internal/ads/zziev;

    .line 11
    .line 12
    return-object p1
.end method

.method private final zzt(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    int-to-long v1, v1

    .line 25
    sget-object p2, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method private final zzu(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final zzv(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const v1, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p3, v1

    .line 26
    int-to-long v1, p3

    .line 27
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzigr;->zza()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzigr;->zzd(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method private final zzw(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 2
    .line 3
    aget v0, v0, p2

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    int-to-long v1, v1

    .line 14
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    :goto_0
    return-object p3

    .line 28
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzift;

    .line 29
    .line 30
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lcom/google/android/gms/internal/ads/zzifs;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzifs;->zze()Lcom/google/android/gms/internal/ads/zzifr;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/util/Map$Entry;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zziev;->zza(I)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    if-nez p3, :cond_3

    .line 77
    .line 78
    invoke-virtual {p4, p5}, Lcom/google/android/gms/internal/ads/zzihd;->zzh(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifs;->zzc(Lcom/google/android/gms/internal/ads/zzifr;Ljava/lang/Object;Ljava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    sget-object v4, Lcom/google/android/gms/internal/ads/zzidl;->zza:Lcom/google/android/gms/internal/ads/zzidl;

    .line 95
    .line 96
    new-array v4, v3, [B

    .line 97
    .line 98
    sget v5, Lcom/google/android/gms/internal/ads/zzidu;->zzb:I

    .line 99
    .line 100
    new-instance v5, Lcom/google/android/gms/internal/ads/zzidr;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-direct {v5, v4, v6, v3}, Lcom/google/android/gms/internal/ads/zzidr;-><init>([BII)V

    .line 104
    .line 105
    .line 106
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v5, p2, v3, v2}, Lcom/google/android/gms/internal/ads/zzifs;->zzb(Lcom/google/android/gms/internal/ads/zzidu;Lcom/google/android/gms/internal/ads/zzifr;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/ads/zzidh;->zza(Lcom/google/android/gms/internal/ads/zzidu;[B)Lcom/google/android/gms/internal/ads/zzidl;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {p4, p3, v0, v2}, Lcom/google/android/gms/internal/ads/zzihd;->zzd(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzidl;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catch_0
    move-exception p1

    .line 129
    new-instance p2, Ljava/lang/RuntimeException;

    .line 130
    .line 131
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p2

    .line 135
    :cond_4
    return-object p3
.end method

.method private static zzy(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigr;)Z
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/ads/zzigr;->zzl(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final zzz(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzD(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p2, v1

    .line 9
    int-to-long v1, p2

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzn()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzi:Z

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzm()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzq()Lcom/google/android/gms/internal/ads/zzidl;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzg:Lcom/google/android/gms/internal/ads/zzifz;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zziep;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziep;->zzbg()Lcom/google/android/gms/internal/ads/zziep;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final zzb(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    const v3, 0xfffff

    .line 7
    .line 8
    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/16 v5, 0x32

    .line 20
    .line 21
    if-le v4, v5, :cond_0

    .line 22
    .line 23
    const/16 v5, 0x45

    .line 24
    .line 25
    if-ge v4, v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    and-int/2addr v2, v3

    .line 30
    int-to-long v2, v2

    .line 31
    packed-switch v4, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :pswitch_0
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzN(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :pswitch_1
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    goto :goto_1

    .line 71
    :pswitch_2
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    :goto_1
    if-nez v2, :cond_1

    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :pswitch_3
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_2

    .line 92
    .line 93
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :pswitch_4
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    cmp-long v2, v4, v2

    .line 124
    .line 125
    if-nez v2, :cond_2

    .line 126
    .line 127
    goto/16 :goto_2

    .line 128
    .line 129
    :pswitch_5
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-ne v4, v2, :cond_2

    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :pswitch_6
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_2

    .line 152
    .line 153
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    cmp-long v2, v4, v2

    .line 162
    .line 163
    if-nez v2, :cond_2

    .line 164
    .line 165
    goto/16 :goto_2

    .line 166
    .line 167
    :pswitch_7
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_2

    .line 172
    .line 173
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-ne v4, v2, :cond_2

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :pswitch_8
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_2

    .line 190
    .line 191
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-ne v4, v2, :cond_2

    .line 200
    .line 201
    goto/16 :goto_2

    .line 202
    .line 203
    :pswitch_9
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_2

    .line 208
    .line 209
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-ne v4, v2, :cond_2

    .line 218
    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :pswitch_a
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_2

    .line 226
    .line 227
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_2

    .line 240
    .line 241
    goto/16 :goto_2

    .line 242
    .line 243
    :pswitch_b
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_2

    .line 248
    .line 249
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_2

    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :pswitch_c
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_2

    .line 270
    .line 271
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_2

    .line 284
    .line 285
    goto/16 :goto_2

    .line 286
    .line 287
    :pswitch_d
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_2

    .line 292
    .line 293
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-ne v4, v2, :cond_2

    .line 302
    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :pswitch_e
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_2

    .line 310
    .line 311
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-ne v4, v2, :cond_2

    .line 320
    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :pswitch_f
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_2

    .line 328
    .line 329
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 330
    .line 331
    .line 332
    move-result-wide v4

    .line 333
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 334
    .line 335
    .line 336
    move-result-wide v2

    .line 337
    cmp-long v2, v4, v2

    .line 338
    .line 339
    if-nez v2, :cond_2

    .line 340
    .line 341
    goto :goto_2

    .line 342
    :pswitch_10
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    if-eqz v4, :cond_2

    .line 347
    .line 348
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-ne v4, v2, :cond_2

    .line 357
    .line 358
    goto :goto_2

    .line 359
    :pswitch_11
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_2

    .line 364
    .line 365
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 366
    .line 367
    .line 368
    move-result-wide v4

    .line 369
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    cmp-long v2, v4, v2

    .line 374
    .line 375
    if-nez v2, :cond_2

    .line 376
    .line 377
    goto :goto_2

    .line 378
    :pswitch_12
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-eqz v4, :cond_2

    .line 383
    .line 384
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 385
    .line 386
    .line 387
    move-result-wide v4

    .line 388
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v2

    .line 392
    cmp-long v2, v4, v2

    .line 393
    .line 394
    if-nez v2, :cond_2

    .line 395
    .line 396
    goto :goto_2

    .line 397
    :pswitch_13
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-eqz v4, :cond_2

    .line 402
    .line 403
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-ne v4, v2, :cond_2

    .line 420
    .line 421
    goto :goto_2

    .line 422
    :pswitch_14
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzI(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_2

    .line 427
    .line 428
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 429
    .line 430
    .line 431
    move-result-wide v4

    .line 432
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 433
    .line 434
    .line 435
    move-result-wide v4

    .line 436
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 437
    .line 438
    .line 439
    move-result-wide v2

    .line 440
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 441
    .line 442
    .line 443
    move-result-wide v2

    .line 444
    cmp-long v2, v4, v2

    .line 445
    .line 446
    if-nez v2, :cond_2

    .line 447
    .line 448
    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x3

    .line 449
    .line 450
    goto/16 :goto_0

    .line 451
    .line 452
    :cond_2
    :goto_3
    return v0

    .line 453
    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 454
    .line 455
    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 456
    .line 457
    array-length v4, v2

    .line 458
    if-ge v1, v4, :cond_7

    .line 459
    .line 460
    aget v2, v2, v1

    .line 461
    .line 462
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzN(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-nez v4, :cond_4

    .line 467
    .line 468
    return v0

    .line 469
    :cond_4
    invoke-direct {p0, p1, v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-eqz v4, :cond_5

    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_5
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    and-int/2addr v2, v3

    .line 481
    int-to-long v4, v2

    .line 482
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzigs;->zzF(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-nez v2, :cond_6

    .line 495
    .line 496
    return v0

    .line 497
    :cond_6
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 498
    .line 499
    goto :goto_4

    .line 500
    :cond_7
    move-object v1, p1

    .line 501
    check-cast v1, Lcom/google/android/gms/internal/ads/zziep;

    .line 502
    .line 503
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 504
    .line 505
    move-object v2, p2

    .line 506
    check-cast v2, Lcom/google/android/gms/internal/ads/zziep;

    .line 507
    .line 508
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 509
    .line 510
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzihe;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-nez v1, :cond_8

    .line 515
    .line 516
    return v0

    .line 517
    :cond_8
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 518
    .line 519
    if-eqz v0, :cond_9

    .line 520
    .line 521
    check-cast p1, Lcom/google/android/gms/internal/ads/zziel;

    .line 522
    .line 523
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 524
    .line 525
    check-cast p2, Lcom/google/android/gms/internal/ads/zziel;

    .line 526
    .line 527
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 528
    .line 529
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zziee;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    return p1

    .line 534
    :cond_9
    const/4 p1, 0x1

    .line 535
    return p1

    .line 536
    nop

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final zzc(Ljava/lang/Object;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    const v4, 0xfffff

    .line 8
    .line 9
    .line 10
    if-ge v1, v3, :cond_3

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/16 v6, 0x32

    .line 21
    .line 22
    if-le v5, v6, :cond_0

    .line 23
    .line 24
    const/16 v6, 0x45

    .line 25
    .line 26
    if-lt v5, v6, :cond_2

    .line 27
    .line 28
    :cond_0
    and-int/2addr v3, v4

    .line 29
    int-to-long v3, v3

    .line 30
    const/16 v6, 0x25

    .line 31
    .line 32
    const/16 v7, 0x20

    .line 33
    .line 34
    packed-switch v5, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :pswitch_0
    mul-int/lit8 v2, v2, 0x35

    .line 40
    .line 41
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_1
    add-int/2addr v2, v3

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :pswitch_1
    mul-int/lit8 v2, v2, 0x35

    .line 53
    .line 54
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    goto :goto_1

    .line 63
    :pswitch_2
    mul-int/lit8 v2, v2, 0x35

    .line 64
    .line 65
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    :cond_1
    :goto_2
    add-int/2addr v2, v6

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :pswitch_3
    mul-int/lit8 v2, v2, 0x35

    .line 79
    .line 80
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 85
    .line 86
    :goto_3
    ushr-long v5, v3, v7

    .line 87
    .line 88
    xor-long/2addr v3, v5

    .line 89
    long-to-int v3, v3

    .line 90
    :goto_4
    add-int/2addr v2, v3

    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :pswitch_4
    mul-int/lit8 v2, v2, 0x35

    .line 94
    .line 95
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    goto :goto_4

    .line 100
    :pswitch_5
    mul-int/lit8 v2, v2, 0x35

    .line 101
    .line 102
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :pswitch_6
    mul-int/lit8 v2, v2, 0x35

    .line 110
    .line 111
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    goto :goto_4

    .line 116
    :pswitch_7
    mul-int/lit8 v2, v2, 0x35

    .line 117
    .line 118
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    goto :goto_4

    .line 123
    :pswitch_8
    mul-int/lit8 v2, v2, 0x35

    .line 124
    .line 125
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    goto :goto_4

    .line 130
    :pswitch_9
    mul-int/lit8 v2, v2, 0x35

    .line 131
    .line 132
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    goto :goto_1

    .line 141
    :pswitch_a
    mul-int/lit8 v2, v2, 0x35

    .line 142
    .line 143
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-eqz v3, :cond_1

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    goto :goto_2

    .line 154
    :pswitch_b
    mul-int/lit8 v2, v2, 0x35

    .line 155
    .line 156
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    goto :goto_1

    .line 167
    :pswitch_c
    mul-int/lit8 v2, v2, 0x35

    .line 168
    .line 169
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzifc;->zzb(Z)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    goto/16 :goto_1

    .line 178
    .line 179
    :pswitch_d
    mul-int/lit8 v2, v2, 0x35

    .line 180
    .line 181
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    goto :goto_4

    .line 186
    :pswitch_e
    mul-int/lit8 v2, v2, 0x35

    .line 187
    .line 188
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 189
    .line 190
    .line 191
    move-result-wide v3

    .line 192
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :pswitch_f
    mul-int/lit8 v2, v2, 0x35

    .line 196
    .line 197
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    goto :goto_4

    .line 202
    :pswitch_10
    mul-int/lit8 v2, v2, 0x35

    .line 203
    .line 204
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 205
    .line 206
    .line 207
    move-result-wide v3

    .line 208
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :pswitch_11
    mul-int/lit8 v2, v2, 0x35

    .line 212
    .line 213
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 214
    .line 215
    .line 216
    move-result-wide v3

    .line 217
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    .line 222
    .line 223
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    .line 234
    .line 235
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 236
    .line 237
    .line 238
    move-result-wide v3

    .line 239
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 240
    .line 241
    .line 242
    move-result-wide v3

    .line 243
    sget-object v5, Lcom/google/android/gms/internal/ads/zzifc;->zza:[B

    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :cond_2
    :goto_5
    add-int/lit8 v1, v1, 0x3

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 252
    .line 253
    :goto_6
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 254
    .line 255
    array-length v5, v3

    .line 256
    if-ge v1, v5, :cond_5

    .line 257
    .line 258
    aget v3, v3, v1

    .line 259
    .line 260
    invoke-direct {p0, p1, v0, v3}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_4

    .line 265
    .line 266
    mul-int/lit8 v2, v2, 0x35

    .line 267
    .line 268
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    and-int/2addr v3, v4

    .line 273
    int-to-long v5, v3

    .line 274
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    add-int/2addr v3, v2

    .line 283
    move v2, v3

    .line 284
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_5
    mul-int/lit8 v2, v2, 0x35

    .line 288
    .line 289
    move-object v0, p1

    .line 290
    check-cast v0, Lcom/google/android/gms/internal/ads/zziep;

    .line 291
    .line 292
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 293
    .line 294
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzihe;->hashCode()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    add-int/2addr v0, v2

    .line 299
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 300
    .line 301
    if-eqz v1, :cond_6

    .line 302
    .line 303
    mul-int/lit8 v0, v0, 0x35

    .line 304
    .line 305
    check-cast p1, Lcom/google/android/gms/internal/ads/zziel;

    .line 306
    .line 307
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 308
    .line 309
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zziee;->zza:Lcom/google/android/gms/internal/ads/zzigx;

    .line 310
    .line 311
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzigx;->hashCode()I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    add-int/2addr v0, p1

    .line 316
    :cond_6
    return v0

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzd(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzF(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_4

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr v3, v2

    .line 21
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    int-to-long v3, v3

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzp(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :pswitch_1
    invoke-direct {p0, p2, v1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :pswitch_2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzp(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :pswitch_3
    invoke-direct {p0, p2, v1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :pswitch_4
    sget v1, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 80
    .line 81
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzifu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :pswitch_5
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/google/android/gms/internal/ads/zzifb;

    .line 103
    .line 104
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/google/android/gms/internal/ads/zzifb;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-lez v5, :cond_1

    .line 119
    .line 120
    if-lez v6, :cond_1

    .line 121
    .line 122
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzifb;->zza()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_0

    .line 127
    .line 128
    add-int/2addr v6, v5

    .line 129
    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/ads/zzifb;->zzh(I)Lcom/google/android/gms/internal/ads/zzifb;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    .line 135
    .line 136
    :cond_1
    if-gtz v5, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    move-object v2, v1

    .line 140
    :goto_1
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :pswitch_6
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzo(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_3

    .line 173
    .line 174
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_3

    .line 209
    .line 210
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 215
    .line 216
    .line 217
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_3

    .line 227
    .line 228
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_2

    .line 239
    .line 240
    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_3

    .line 245
    .line 246
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_2

    .line 257
    .line 258
    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_3

    .line 263
    .line 264
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    .line 276
    :pswitch_e
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzo(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_3

    .line 286
    .line 287
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_3

    .line 304
    .line 305
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzh(Ljava/lang/Object;JZ)V

    .line 310
    .line 311
    .line 312
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_3

    .line 322
    .line 323
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 328
    .line 329
    .line 330
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 331
    .line 332
    .line 333
    goto :goto_2

    .line 334
    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_3

    .line 339
    .line 340
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 341
    .line 342
    .line 343
    move-result-wide v1

    .line 344
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 345
    .line 346
    .line 347
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_3

    .line 356
    .line 357
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzc(Ljava/lang/Object;J)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 362
    .line 363
    .line 364
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_2

    .line 368
    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_3

    .line 373
    .line 374
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 379
    .line 380
    .line 381
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 382
    .line 383
    .line 384
    goto :goto_2

    .line 385
    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_3

    .line 390
    .line 391
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zze(Ljava/lang/Object;J)J

    .line 392
    .line 393
    .line 394
    move-result-wide v1

    .line 395
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 396
    .line 397
    .line 398
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_2

    .line 402
    :pswitch_16
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_3

    .line 407
    .line 408
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzj(Ljava/lang/Object;JF)V

    .line 413
    .line 414
    .line 415
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 416
    .line 417
    .line 418
    goto :goto_2

    .line 419
    :pswitch_17
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_3

    .line 424
    .line 425
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzl(Ljava/lang/Object;JD)V

    .line 430
    .line 431
    .line 432
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 433
    .line 434
    .line 435
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    .line 440
    .line 441
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzigs;->zzH(Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 445
    .line 446
    if-eqz v0, :cond_5

    .line 447
    .line 448
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzn:Lcom/google/android/gms/internal/ads/zziea;

    .line 449
    .line 450
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzigs;->zzG(Lcom/google/android/gms/internal/ads/zziea;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_5
    return-void

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zze(Ljava/lang/Object;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    sget-object v7, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    const v9, 0xfffff

    .line 10
    .line 11
    .line 12
    move v2, v8

    .line 13
    move v4, v2

    .line 14
    move v10, v4

    .line 15
    move v3, v9

    .line 16
    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 17
    .line 18
    array-length v11, v5

    .line 19
    if-ge v2, v11, :cond_1b

    .line 20
    .line 21
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 22
    .line 23
    .line 24
    move-result v11

    .line 25
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    aget v13, v5, v2

    .line 30
    .line 31
    add-int/lit8 v14, v2, 0x2

    .line 32
    .line 33
    aget v5, v5, v14

    .line 34
    .line 35
    and-int v14, v5, v9

    .line 36
    .line 37
    const/16 v15, 0x11

    .line 38
    .line 39
    if-gt v12, v15, :cond_2

    .line 40
    .line 41
    if-eq v14, v3, :cond_1

    .line 42
    .line 43
    if-ne v14, v9, :cond_0

    .line 44
    .line 45
    move v4, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    int-to-long v3, v14

    .line 48
    invoke-virtual {v7, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move v4, v3

    .line 53
    :goto_1
    move v3, v14

    .line 54
    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    .line 55
    .line 56
    shl-int v5, v6, v5

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v5, v8

    .line 60
    :goto_2
    and-int/2addr v11, v9

    .line 61
    sget-object v14, Lcom/google/android/gms/internal/ads/zzief;->zzJ:Lcom/google/android/gms/internal/ads/zzief;

    .line 62
    .line 63
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzief;->zza()I

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-lt v12, v14, :cond_3

    .line 68
    .line 69
    sget-object v14, Lcom/google/android/gms/internal/ads/zzief;->zzW:Lcom/google/android/gms/internal/ads/zzief;

    .line 70
    .line 71
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzief;->zza()I

    .line 72
    .line 73
    .line 74
    :cond_3
    int-to-long v14, v11

    .line 75
    const/4 v9, 0x4

    .line 76
    const/16 v16, 0x3f

    .line 77
    .line 78
    const/16 v11, 0x8

    .line 79
    .line 80
    packed-switch v12, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    goto/16 :goto_16

    .line 84
    .line 85
    :pswitch_0
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_1a

    .line 90
    .line 91
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lcom/google/android/gms/internal/ads/zzifz;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v13, v5, v9}, Lcom/google/android/gms/internal/ads/zzigs;->zzD(ILcom/google/android/gms/internal/ads/zzifz;Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    :goto_3
    add-int/2addr v10, v5

    .line 106
    goto/16 :goto_16

    .line 107
    .line 108
    :pswitch_1
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_1a

    .line 113
    .line 114
    shl-int/lit8 v5, v13, 0x3

    .line 115
    .line 116
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v11

    .line 120
    add-long v13, v11, v11

    .line 121
    .line 122
    shr-long v11, v11, v16

    .line 123
    .line 124
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    xor-long/2addr v11, v13

    .line 129
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    :goto_4
    add-int/2addr v9, v5

    .line 134
    add-int/2addr v10, v9

    .line 135
    goto/16 :goto_16

    .line 136
    .line 137
    :pswitch_2
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_1a

    .line 142
    .line 143
    shl-int/lit8 v5, v13, 0x3

    .line 144
    .line 145
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    add-int v11, v9, v9

    .line 150
    .line 151
    shr-int/lit8 v9, v9, 0x1f

    .line 152
    .line 153
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    xor-int/2addr v9, v11

    .line 158
    invoke-static {v9, v5, v10}, Lcb/a;->a(III)I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    goto/16 :goto_16

    .line 163
    .line 164
    :pswitch_3
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_1a

    .line 169
    .line 170
    shl-int/lit8 v5, v13, 0x3

    .line 171
    .line 172
    invoke-static {v5, v11, v10}, Lcb/a;->a(III)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    goto/16 :goto_16

    .line 177
    .line 178
    :pswitch_4
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_1a

    .line 183
    .line 184
    shl-int/lit8 v5, v13, 0x3

    .line 185
    .line 186
    invoke-static {v5, v9, v10}, Lcb/a;->a(III)I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    goto/16 :goto_16

    .line 191
    .line 192
    :pswitch_5
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-eqz v5, :cond_1a

    .line 197
    .line 198
    shl-int/lit8 v5, v13, 0x3

    .line 199
    .line 200
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    int-to-long v11, v9

    .line 205
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    goto :goto_4

    .line 214
    :pswitch_6
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_1a

    .line 219
    .line 220
    shl-int/lit8 v5, v13, 0x3

    .line 221
    .line 222
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    invoke-static {v9, v5, v10}, Lcb/a;->a(III)I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    goto/16 :goto_16

    .line 235
    .line 236
    :pswitch_7
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_1a

    .line 241
    .line 242
    shl-int/lit8 v5, v13, 0x3

    .line 243
    .line 244
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    check-cast v9, Lcom/google/android/gms/internal/ads/zzidl;

    .line 249
    .line 250
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    invoke-static {v9, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    goto/16 :goto_16

    .line 263
    .line 264
    :pswitch_8
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_1a

    .line 269
    .line 270
    shl-int/lit8 v5, v13, 0x3

    .line 271
    .line 272
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    sget v12, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 281
    .line 282
    check-cast v9, Lcom/google/android/gms/internal/ads/zzicu;

    .line 283
    .line 284
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/ads/zzicu;->zzaT(Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    invoke-static {v9, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    goto/16 :goto_16

    .line 297
    .line 298
    :pswitch_9
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    if-eqz v5, :cond_1a

    .line 303
    .line 304
    shl-int/lit8 v5, v13, 0x3

    .line 305
    .line 306
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    instance-of v11, v9, Lcom/google/android/gms/internal/ads/zzidl;

    .line 311
    .line 312
    if-eqz v11, :cond_4

    .line 313
    .line 314
    check-cast v9, Lcom/google/android/gms/internal/ads/zzidl;

    .line 315
    .line 316
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    invoke-static {v9, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    goto/16 :goto_16

    .line 329
    .line 330
    :cond_4
    check-cast v9, Ljava/lang/String;

    .line 331
    .line 332
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzihp;->zzc(Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    invoke-static {v9, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    goto/16 :goto_16

    .line 345
    .line 346
    :pswitch_a
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    if-eqz v5, :cond_1a

    .line 351
    .line 352
    shl-int/lit8 v5, v13, 0x3

    .line 353
    .line 354
    invoke-static {v5, v6, v10}, Lcb/a;->a(III)I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    goto/16 :goto_16

    .line 359
    .line 360
    :pswitch_b
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_1a

    .line 365
    .line 366
    shl-int/lit8 v5, v13, 0x3

    .line 367
    .line 368
    invoke-static {v5, v9, v10}, Lcb/a;->a(III)I

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    goto/16 :goto_16

    .line 373
    .line 374
    :pswitch_c
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_1a

    .line 379
    .line 380
    shl-int/lit8 v5, v13, 0x3

    .line 381
    .line 382
    invoke-static {v5, v11, v10}, Lcb/a;->a(III)I

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    goto/16 :goto_16

    .line 387
    .line 388
    :pswitch_d
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eqz v5, :cond_1a

    .line 393
    .line 394
    shl-int/lit8 v5, v13, 0x3

    .line 395
    .line 396
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    int-to-long v11, v9

    .line 401
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 406
    .line 407
    .line 408
    move-result v9

    .line 409
    goto/16 :goto_4

    .line 410
    .line 411
    :pswitch_e
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-eqz v5, :cond_1a

    .line 416
    .line 417
    shl-int/lit8 v5, v13, 0x3

    .line 418
    .line 419
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 420
    .line 421
    .line 422
    move-result-wide v11

    .line 423
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    goto/16 :goto_4

    .line 432
    .line 433
    :pswitch_f
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    if-eqz v5, :cond_1a

    .line 438
    .line 439
    shl-int/lit8 v5, v13, 0x3

    .line 440
    .line 441
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 442
    .line 443
    .line 444
    move-result-wide v11

    .line 445
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 450
    .line 451
    .line 452
    move-result v9

    .line 453
    goto/16 :goto_4

    .line 454
    .line 455
    :pswitch_10
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    if-eqz v5, :cond_1a

    .line 460
    .line 461
    shl-int/lit8 v5, v13, 0x3

    .line 462
    .line 463
    invoke-static {v5, v9, v10}, Lcb/a;->a(III)I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    goto/16 :goto_16

    .line 468
    .line 469
    :pswitch_11
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_1a

    .line 474
    .line 475
    shl-int/lit8 v5, v13, 0x3

    .line 476
    .line 477
    invoke-static {v5, v11, v10}, Lcb/a;->a(III)I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    goto/16 :goto_16

    .line 482
    .line 483
    :pswitch_12
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    check-cast v5, Lcom/google/android/gms/internal/ads/zzift;

    .line 492
    .line 493
    check-cast v9, Lcom/google/android/gms/internal/ads/zzifs;

    .line 494
    .line 495
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 496
    .line 497
    .line 498
    move-result v11

    .line 499
    if-eqz v11, :cond_5

    .line 500
    .line 501
    :goto_5
    move v11, v8

    .line 502
    goto :goto_7

    .line 503
    :cond_5
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzift;->entrySet()Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    move v11, v8

    .line 512
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    if-eqz v12, :cond_6

    .line 517
    .line 518
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    check-cast v12, Ljava/util/Map$Entry;

    .line 523
    .line 524
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v14

    .line 528
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v12

    .line 532
    invoke-virtual {v9, v13, v14, v12}, Lcom/google/android/gms/internal/ads/zzifs;->zzd(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 533
    .line 534
    .line 535
    move-result v12

    .line 536
    add-int/2addr v11, v12

    .line 537
    goto :goto_6

    .line 538
    :cond_6
    :goto_7
    add-int/2addr v10, v11

    .line 539
    goto/16 :goto_16

    .line 540
    .line 541
    :pswitch_13
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    check-cast v5, Ljava/util/List;

    .line 546
    .line 547
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 548
    .line 549
    .line 550
    move-result-object v9

    .line 551
    sget v11, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 552
    .line 553
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    if-nez v11, :cond_7

    .line 558
    .line 559
    move v14, v8

    .line 560
    goto :goto_9

    .line 561
    :cond_7
    move v12, v8

    .line 562
    move v14, v12

    .line 563
    :goto_8
    if-ge v12, v11, :cond_8

    .line 564
    .line 565
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v15

    .line 569
    check-cast v15, Lcom/google/android/gms/internal/ads/zzifz;

    .line 570
    .line 571
    invoke-static {v13, v15, v9}, Lcom/google/android/gms/internal/ads/zzigs;->zzD(ILcom/google/android/gms/internal/ads/zzifz;Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 572
    .line 573
    .line 574
    move-result v15

    .line 575
    add-int/2addr v14, v15

    .line 576
    add-int/2addr v12, v6

    .line 577
    goto :goto_8

    .line 578
    :cond_8
    :goto_9
    add-int/2addr v10, v14

    .line 579
    goto/16 :goto_16

    .line 580
    .line 581
    :pswitch_14
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    check-cast v5, Ljava/util/List;

    .line 586
    .line 587
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzu(Ljava/util/List;)I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    if-lez v5, :cond_1a

    .line 592
    .line 593
    shl-int/lit8 v9, v13, 0x3

    .line 594
    .line 595
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 600
    .line 601
    .line 602
    move-result v10

    .line 603
    goto/16 :goto_16

    .line 604
    .line 605
    :pswitch_15
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    check-cast v5, Ljava/util/List;

    .line 610
    .line 611
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzy(Ljava/util/List;)I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    if-lez v5, :cond_1a

    .line 616
    .line 617
    shl-int/lit8 v9, v13, 0x3

    .line 618
    .line 619
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 620
    .line 621
    .line 622
    move-result v9

    .line 623
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 624
    .line 625
    .line 626
    move-result v10

    .line 627
    goto/16 :goto_16

    .line 628
    .line 629
    :pswitch_16
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    check-cast v5, Ljava/util/List;

    .line 634
    .line 635
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzB(Ljava/util/List;)I

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    if-lez v5, :cond_1a

    .line 640
    .line 641
    shl-int/lit8 v9, v13, 0x3

    .line 642
    .line 643
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 644
    .line 645
    .line 646
    move-result v9

    .line 647
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 648
    .line 649
    .line 650
    move-result v10

    .line 651
    goto/16 :goto_16

    .line 652
    .line 653
    :pswitch_17
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    check-cast v5, Ljava/util/List;

    .line 658
    .line 659
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzz(Ljava/util/List;)I

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    if-lez v5, :cond_1a

    .line 664
    .line 665
    shl-int/lit8 v9, v13, 0x3

    .line 666
    .line 667
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 668
    .line 669
    .line 670
    move-result v9

    .line 671
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 672
    .line 673
    .line 674
    move-result v10

    .line 675
    goto/16 :goto_16

    .line 676
    .line 677
    :pswitch_18
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    check-cast v5, Ljava/util/List;

    .line 682
    .line 683
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzv(Ljava/util/List;)I

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    if-lez v5, :cond_1a

    .line 688
    .line 689
    shl-int/lit8 v9, v13, 0x3

    .line 690
    .line 691
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 692
    .line 693
    .line 694
    move-result v9

    .line 695
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 696
    .line 697
    .line 698
    move-result v10

    .line 699
    goto/16 :goto_16

    .line 700
    .line 701
    :pswitch_19
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v5

    .line 705
    check-cast v5, Ljava/util/List;

    .line 706
    .line 707
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzx(Ljava/util/List;)I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    if-lez v5, :cond_1a

    .line 712
    .line 713
    shl-int/lit8 v9, v13, 0x3

    .line 714
    .line 715
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 716
    .line 717
    .line 718
    move-result v9

    .line 719
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 720
    .line 721
    .line 722
    move-result v10

    .line 723
    goto/16 :goto_16

    .line 724
    .line 725
    :pswitch_1a
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    check-cast v5, Ljava/util/List;

    .line 730
    .line 731
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 732
    .line 733
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-lez v5, :cond_1a

    .line 738
    .line 739
    shl-int/lit8 v9, v13, 0x3

    .line 740
    .line 741
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 742
    .line 743
    .line 744
    move-result v9

    .line 745
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 746
    .line 747
    .line 748
    move-result v10

    .line 749
    goto/16 :goto_16

    .line 750
    .line 751
    :pswitch_1b
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    check-cast v5, Ljava/util/List;

    .line 756
    .line 757
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzz(Ljava/util/List;)I

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    if-lez v5, :cond_1a

    .line 762
    .line 763
    shl-int/lit8 v9, v13, 0x3

    .line 764
    .line 765
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 766
    .line 767
    .line 768
    move-result v9

    .line 769
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 770
    .line 771
    .line 772
    move-result v10

    .line 773
    goto/16 :goto_16

    .line 774
    .line 775
    :pswitch_1c
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    check-cast v5, Ljava/util/List;

    .line 780
    .line 781
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzB(Ljava/util/List;)I

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    if-lez v5, :cond_1a

    .line 786
    .line 787
    shl-int/lit8 v9, v13, 0x3

    .line 788
    .line 789
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 790
    .line 791
    .line 792
    move-result v9

    .line 793
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 794
    .line 795
    .line 796
    move-result v10

    .line 797
    goto/16 :goto_16

    .line 798
    .line 799
    :pswitch_1d
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v5

    .line 803
    check-cast v5, Ljava/util/List;

    .line 804
    .line 805
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzw(Ljava/util/List;)I

    .line 806
    .line 807
    .line 808
    move-result v5

    .line 809
    if-lez v5, :cond_1a

    .line 810
    .line 811
    shl-int/lit8 v9, v13, 0x3

    .line 812
    .line 813
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 814
    .line 815
    .line 816
    move-result v9

    .line 817
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 818
    .line 819
    .line 820
    move-result v10

    .line 821
    goto/16 :goto_16

    .line 822
    .line 823
    :pswitch_1e
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    check-cast v5, Ljava/util/List;

    .line 828
    .line 829
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzt(Ljava/util/List;)I

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    if-lez v5, :cond_1a

    .line 834
    .line 835
    shl-int/lit8 v9, v13, 0x3

    .line 836
    .line 837
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 838
    .line 839
    .line 840
    move-result v9

    .line 841
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 842
    .line 843
    .line 844
    move-result v10

    .line 845
    goto/16 :goto_16

    .line 846
    .line 847
    :pswitch_1f
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    check-cast v5, Ljava/util/List;

    .line 852
    .line 853
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzs(Ljava/util/List;)I

    .line 854
    .line 855
    .line 856
    move-result v5

    .line 857
    if-lez v5, :cond_1a

    .line 858
    .line 859
    shl-int/lit8 v9, v13, 0x3

    .line 860
    .line 861
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 862
    .line 863
    .line 864
    move-result v9

    .line 865
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 866
    .line 867
    .line 868
    move-result v10

    .line 869
    goto/16 :goto_16

    .line 870
    .line 871
    :pswitch_20
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    check-cast v5, Ljava/util/List;

    .line 876
    .line 877
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzz(Ljava/util/List;)I

    .line 878
    .line 879
    .line 880
    move-result v5

    .line 881
    if-lez v5, :cond_1a

    .line 882
    .line 883
    shl-int/lit8 v9, v13, 0x3

    .line 884
    .line 885
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 886
    .line 887
    .line 888
    move-result v9

    .line 889
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 890
    .line 891
    .line 892
    move-result v10

    .line 893
    goto/16 :goto_16

    .line 894
    .line 895
    :pswitch_21
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v5

    .line 899
    check-cast v5, Ljava/util/List;

    .line 900
    .line 901
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzB(Ljava/util/List;)I

    .line 902
    .line 903
    .line 904
    move-result v5

    .line 905
    if-lez v5, :cond_1a

    .line 906
    .line 907
    shl-int/lit8 v9, v13, 0x3

    .line 908
    .line 909
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 910
    .line 911
    .line 912
    move-result v9

    .line 913
    invoke-static {v5, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 914
    .line 915
    .line 916
    move-result v10

    .line 917
    goto/16 :goto_16

    .line 918
    .line 919
    :pswitch_22
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v5

    .line 923
    check-cast v5, Ljava/util/List;

    .line 924
    .line 925
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 926
    .line 927
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 928
    .line 929
    .line 930
    move-result v9

    .line 931
    if-nez v9, :cond_9

    .line 932
    .line 933
    goto/16 :goto_5

    .line 934
    .line 935
    :cond_9
    shl-int/lit8 v11, v13, 0x3

    .line 936
    .line 937
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzu(Ljava/util/List;)I

    .line 938
    .line 939
    .line 940
    move-result v5

    .line 941
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 942
    .line 943
    .line 944
    move-result v11

    .line 945
    :goto_a
    mul-int/2addr v11, v9

    .line 946
    add-int/2addr v11, v5

    .line 947
    goto/16 :goto_7

    .line 948
    .line 949
    :pswitch_23
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v5

    .line 953
    check-cast v5, Ljava/util/List;

    .line 954
    .line 955
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 956
    .line 957
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 958
    .line 959
    .line 960
    move-result v9

    .line 961
    if-nez v9, :cond_a

    .line 962
    .line 963
    goto/16 :goto_5

    .line 964
    .line 965
    :cond_a
    shl-int/lit8 v11, v13, 0x3

    .line 966
    .line 967
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzy(Ljava/util/List;)I

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 972
    .line 973
    .line 974
    move-result v11

    .line 975
    goto :goto_a

    .line 976
    :pswitch_24
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v5

    .line 980
    check-cast v5, Ljava/util/List;

    .line 981
    .line 982
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzC(ILjava/util/List;Z)I

    .line 983
    .line 984
    .line 985
    move-result v5

    .line 986
    goto/16 :goto_3

    .line 987
    .line 988
    :pswitch_25
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    check-cast v5, Ljava/util/List;

    .line 993
    .line 994
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzA(ILjava/util/List;Z)I

    .line 995
    .line 996
    .line 997
    move-result v5

    .line 998
    goto/16 :goto_3

    .line 999
    .line 1000
    :pswitch_26
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v5

    .line 1004
    check-cast v5, Ljava/util/List;

    .line 1005
    .line 1006
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1007
    .line 1008
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1009
    .line 1010
    .line 1011
    move-result v9

    .line 1012
    if-nez v9, :cond_b

    .line 1013
    .line 1014
    goto/16 :goto_5

    .line 1015
    .line 1016
    :cond_b
    shl-int/lit8 v11, v13, 0x3

    .line 1017
    .line 1018
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzv(Ljava/util/List;)I

    .line 1019
    .line 1020
    .line 1021
    move-result v5

    .line 1022
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1023
    .line 1024
    .line 1025
    move-result v11

    .line 1026
    goto :goto_a

    .line 1027
    :pswitch_27
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v5

    .line 1031
    check-cast v5, Ljava/util/List;

    .line 1032
    .line 1033
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1034
    .line 1035
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1036
    .line 1037
    .line 1038
    move-result v9

    .line 1039
    if-nez v9, :cond_c

    .line 1040
    .line 1041
    goto/16 :goto_5

    .line 1042
    .line 1043
    :cond_c
    shl-int/lit8 v11, v13, 0x3

    .line 1044
    .line 1045
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzx(Ljava/util/List;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v5

    .line 1049
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1050
    .line 1051
    .line 1052
    move-result v11

    .line 1053
    goto :goto_a

    .line 1054
    :pswitch_28
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    check-cast v5, Ljava/util/List;

    .line 1059
    .line 1060
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1061
    .line 1062
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1063
    .line 1064
    .line 1065
    move-result v9

    .line 1066
    if-nez v9, :cond_d

    .line 1067
    .line 1068
    goto/16 :goto_5

    .line 1069
    .line 1070
    :cond_d
    shl-int/lit8 v11, v13, 0x3

    .line 1071
    .line 1072
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1073
    .line 1074
    .line 1075
    move-result v11

    .line 1076
    mul-int/2addr v11, v9

    .line 1077
    move v9, v8

    .line 1078
    :goto_b
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1079
    .line 1080
    .line 1081
    move-result v12

    .line 1082
    if-ge v9, v12, :cond_6

    .line 1083
    .line 1084
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v12

    .line 1088
    check-cast v12, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1089
    .line 1090
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 1091
    .line 1092
    .line 1093
    move-result v12

    .line 1094
    invoke-static {v12, v12, v11}, Lcb/a;->a(III)I

    .line 1095
    .line 1096
    .line 1097
    move-result v11

    .line 1098
    add-int/2addr v9, v6

    .line 1099
    goto :goto_b

    .line 1100
    :pswitch_29
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v5

    .line 1104
    check-cast v5, Ljava/util/List;

    .line 1105
    .line 1106
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v9

    .line 1110
    sget v11, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1111
    .line 1112
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1113
    .line 1114
    .line 1115
    move-result v11

    .line 1116
    if-nez v11, :cond_e

    .line 1117
    .line 1118
    move v12, v8

    .line 1119
    goto :goto_d

    .line 1120
    :cond_e
    shl-int/lit8 v12, v13, 0x3

    .line 1121
    .line 1122
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1123
    .line 1124
    .line 1125
    move-result v12

    .line 1126
    mul-int/2addr v12, v11

    .line 1127
    move v13, v8

    .line 1128
    :goto_c
    if-ge v13, v11, :cond_f

    .line 1129
    .line 1130
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v14

    .line 1134
    check-cast v14, Lcom/google/android/gms/internal/ads/zzicu;

    .line 1135
    .line 1136
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/zzicu;->zzaT(Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 1137
    .line 1138
    .line 1139
    move-result v14

    .line 1140
    invoke-static {v14, v14, v12}, Lcb/a;->a(III)I

    .line 1141
    .line 1142
    .line 1143
    move-result v12

    .line 1144
    add-int/2addr v13, v6

    .line 1145
    goto :goto_c

    .line 1146
    :cond_f
    :goto_d
    add-int/2addr v10, v12

    .line 1147
    goto/16 :goto_16

    .line 1148
    .line 1149
    :pswitch_2a
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v5

    .line 1153
    check-cast v5, Ljava/util/List;

    .line 1154
    .line 1155
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1156
    .line 1157
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1158
    .line 1159
    .line 1160
    move-result v9

    .line 1161
    if-nez v9, :cond_10

    .line 1162
    .line 1163
    goto/16 :goto_5

    .line 1164
    .line 1165
    :cond_10
    shl-int/lit8 v11, v13, 0x3

    .line 1166
    .line 1167
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1168
    .line 1169
    .line 1170
    move-result v11

    .line 1171
    mul-int/2addr v11, v9

    .line 1172
    instance-of v12, v5, Lcom/google/android/gms/internal/ads/zzifk;

    .line 1173
    .line 1174
    if-eqz v12, :cond_12

    .line 1175
    .line 1176
    check-cast v5, Lcom/google/android/gms/internal/ads/zzifk;

    .line 1177
    .line 1178
    move v12, v8

    .line 1179
    :goto_e
    if-ge v12, v9, :cond_6

    .line 1180
    .line 1181
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzifk;->zzc()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v13

    .line 1185
    instance-of v14, v13, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1186
    .line 1187
    if-eqz v14, :cond_11

    .line 1188
    .line 1189
    check-cast v13, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1190
    .line 1191
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 1192
    .line 1193
    .line 1194
    move-result v13

    .line 1195
    invoke-static {v13, v13, v11}, Lcb/a;->a(III)I

    .line 1196
    .line 1197
    .line 1198
    move-result v11

    .line 1199
    goto :goto_f

    .line 1200
    :cond_11
    check-cast v13, Ljava/lang/String;

    .line 1201
    .line 1202
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzihp;->zzc(Ljava/lang/String;)I

    .line 1203
    .line 1204
    .line 1205
    move-result v13

    .line 1206
    invoke-static {v13, v13, v11}, Lcb/a;->a(III)I

    .line 1207
    .line 1208
    .line 1209
    move-result v11

    .line 1210
    :goto_f
    add-int/2addr v12, v6

    .line 1211
    goto :goto_e

    .line 1212
    :cond_12
    move v12, v8

    .line 1213
    :goto_10
    if-ge v12, v9, :cond_6

    .line 1214
    .line 1215
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v13

    .line 1219
    instance-of v14, v13, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1220
    .line 1221
    if-eqz v14, :cond_13

    .line 1222
    .line 1223
    check-cast v13, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1224
    .line 1225
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 1226
    .line 1227
    .line 1228
    move-result v13

    .line 1229
    invoke-static {v13, v13, v11}, Lcb/a;->a(III)I

    .line 1230
    .line 1231
    .line 1232
    move-result v11

    .line 1233
    goto :goto_11

    .line 1234
    :cond_13
    check-cast v13, Ljava/lang/String;

    .line 1235
    .line 1236
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzihp;->zzc(Ljava/lang/String;)I

    .line 1237
    .line 1238
    .line 1239
    move-result v13

    .line 1240
    invoke-static {v13, v13, v11}, Lcb/a;->a(III)I

    .line 1241
    .line 1242
    .line 1243
    move-result v11

    .line 1244
    :goto_11
    add-int/2addr v12, v6

    .line 1245
    goto :goto_10

    .line 1246
    :pswitch_2b
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v5

    .line 1250
    check-cast v5, Ljava/util/List;

    .line 1251
    .line 1252
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1253
    .line 1254
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1255
    .line 1256
    .line 1257
    move-result v5

    .line 1258
    if-nez v5, :cond_14

    .line 1259
    .line 1260
    :goto_12
    move v9, v8

    .line 1261
    goto :goto_13

    .line 1262
    :cond_14
    shl-int/lit8 v9, v13, 0x3

    .line 1263
    .line 1264
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1265
    .line 1266
    .line 1267
    move-result v9

    .line 1268
    add-int/2addr v9, v6

    .line 1269
    mul-int/2addr v9, v5

    .line 1270
    :goto_13
    add-int/2addr v10, v9

    .line 1271
    goto/16 :goto_16

    .line 1272
    .line 1273
    :pswitch_2c
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v5

    .line 1277
    check-cast v5, Ljava/util/List;

    .line 1278
    .line 1279
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzA(ILjava/util/List;Z)I

    .line 1280
    .line 1281
    .line 1282
    move-result v5

    .line 1283
    goto/16 :goto_3

    .line 1284
    .line 1285
    :pswitch_2d
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v5

    .line 1289
    check-cast v5, Ljava/util/List;

    .line 1290
    .line 1291
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzC(ILjava/util/List;Z)I

    .line 1292
    .line 1293
    .line 1294
    move-result v5

    .line 1295
    goto/16 :goto_3

    .line 1296
    .line 1297
    :pswitch_2e
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v5

    .line 1301
    check-cast v5, Ljava/util/List;

    .line 1302
    .line 1303
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1304
    .line 1305
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1306
    .line 1307
    .line 1308
    move-result v9

    .line 1309
    if-nez v9, :cond_15

    .line 1310
    .line 1311
    goto/16 :goto_5

    .line 1312
    .line 1313
    :cond_15
    shl-int/lit8 v11, v13, 0x3

    .line 1314
    .line 1315
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzw(Ljava/util/List;)I

    .line 1316
    .line 1317
    .line 1318
    move-result v5

    .line 1319
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1320
    .line 1321
    .line 1322
    move-result v11

    .line 1323
    goto/16 :goto_a

    .line 1324
    .line 1325
    :pswitch_2f
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v5

    .line 1329
    check-cast v5, Ljava/util/List;

    .line 1330
    .line 1331
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1332
    .line 1333
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1334
    .line 1335
    .line 1336
    move-result v9

    .line 1337
    if-nez v9, :cond_16

    .line 1338
    .line 1339
    goto/16 :goto_5

    .line 1340
    .line 1341
    :cond_16
    shl-int/lit8 v11, v13, 0x3

    .line 1342
    .line 1343
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzt(Ljava/util/List;)I

    .line 1344
    .line 1345
    .line 1346
    move-result v5

    .line 1347
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1348
    .line 1349
    .line 1350
    move-result v11

    .line 1351
    goto/16 :goto_a

    .line 1352
    .line 1353
    :pswitch_30
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v5

    .line 1357
    check-cast v5, Ljava/util/List;

    .line 1358
    .line 1359
    sget v9, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1360
    .line 1361
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1362
    .line 1363
    .line 1364
    move-result v9

    .line 1365
    if-nez v9, :cond_17

    .line 1366
    .line 1367
    goto :goto_12

    .line 1368
    :cond_17
    shl-int/lit8 v9, v13, 0x3

    .line 1369
    .line 1370
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigs;->zzs(Ljava/util/List;)I

    .line 1371
    .line 1372
    .line 1373
    move-result v11

    .line 1374
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1375
    .line 1376
    .line 1377
    move-result v5

    .line 1378
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1379
    .line 1380
    .line 1381
    move-result v9

    .line 1382
    mul-int/2addr v9, v5

    .line 1383
    add-int/2addr v9, v11

    .line 1384
    goto :goto_13

    .line 1385
    :pswitch_31
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v5

    .line 1389
    check-cast v5, Ljava/util/List;

    .line 1390
    .line 1391
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzA(ILjava/util/List;Z)I

    .line 1392
    .line 1393
    .line 1394
    move-result v5

    .line 1395
    goto/16 :goto_3

    .line 1396
    .line 1397
    :pswitch_32
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v5

    .line 1401
    check-cast v5, Ljava/util/List;

    .line 1402
    .line 1403
    invoke-static {v13, v5, v8}, Lcom/google/android/gms/internal/ads/zzigs;->zzC(ILjava/util/List;Z)I

    .line 1404
    .line 1405
    .line 1406
    move-result v5

    .line 1407
    goto/16 :goto_3

    .line 1408
    .line 1409
    :pswitch_33
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v5

    .line 1413
    if-eqz v5, :cond_1a

    .line 1414
    .line 1415
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v5

    .line 1419
    check-cast v5, Lcom/google/android/gms/internal/ads/zzifz;

    .line 1420
    .line 1421
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v9

    .line 1425
    invoke-static {v13, v5, v9}, Lcom/google/android/gms/internal/ads/zzigs;->zzD(ILcom/google/android/gms/internal/ads/zzifz;Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 1426
    .line 1427
    .line 1428
    move-result v5

    .line 1429
    goto/16 :goto_3

    .line 1430
    .line 1431
    :pswitch_34
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v5

    .line 1435
    if-eqz v5, :cond_18

    .line 1436
    .line 1437
    shl-int/lit8 v0, v13, 0x3

    .line 1438
    .line 1439
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v11

    .line 1443
    add-long v13, v11, v11

    .line 1444
    .line 1445
    shr-long v11, v11, v16

    .line 1446
    .line 1447
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1448
    .line 1449
    .line 1450
    move-result v0

    .line 1451
    xor-long/2addr v11, v13

    .line 1452
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 1453
    .line 1454
    .line 1455
    move-result v5

    .line 1456
    :goto_14
    add-int/2addr v5, v0

    .line 1457
    add-int/2addr v10, v5

    .line 1458
    :cond_18
    :goto_15
    move-object/from16 v0, p0

    .line 1459
    .line 1460
    goto/16 :goto_16

    .line 1461
    .line 1462
    :pswitch_35
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v5

    .line 1466
    if-eqz v5, :cond_18

    .line 1467
    .line 1468
    shl-int/lit8 v0, v13, 0x3

    .line 1469
    .line 1470
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1471
    .line 1472
    .line 1473
    move-result v5

    .line 1474
    add-int v9, v5, v5

    .line 1475
    .line 1476
    shr-int/lit8 v5, v5, 0x1f

    .line 1477
    .line 1478
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1479
    .line 1480
    .line 1481
    move-result v0

    .line 1482
    xor-int/2addr v5, v9

    .line 1483
    invoke-static {v5, v0, v10}, Lcb/a;->a(III)I

    .line 1484
    .line 1485
    .line 1486
    move-result v10

    .line 1487
    goto :goto_15

    .line 1488
    :pswitch_36
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v5

    .line 1492
    if-eqz v5, :cond_18

    .line 1493
    .line 1494
    shl-int/lit8 v0, v13, 0x3

    .line 1495
    .line 1496
    invoke-static {v0, v11, v10}, Lcb/a;->a(III)I

    .line 1497
    .line 1498
    .line 1499
    move-result v10

    .line 1500
    goto :goto_15

    .line 1501
    :pswitch_37
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v5

    .line 1505
    if-eqz v5, :cond_18

    .line 1506
    .line 1507
    shl-int/lit8 v0, v13, 0x3

    .line 1508
    .line 1509
    invoke-static {v0, v9, v10}, Lcb/a;->a(III)I

    .line 1510
    .line 1511
    .line 1512
    move-result v10

    .line 1513
    goto :goto_15

    .line 1514
    :pswitch_38
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1515
    .line 1516
    .line 1517
    move-result v5

    .line 1518
    if-eqz v5, :cond_18

    .line 1519
    .line 1520
    shl-int/lit8 v0, v13, 0x3

    .line 1521
    .line 1522
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1523
    .line 1524
    .line 1525
    move-result v5

    .line 1526
    int-to-long v11, v5

    .line 1527
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1528
    .line 1529
    .line 1530
    move-result v0

    .line 1531
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 1532
    .line 1533
    .line 1534
    move-result v5

    .line 1535
    goto :goto_14

    .line 1536
    :pswitch_39
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1537
    .line 1538
    .line 1539
    move-result v5

    .line 1540
    if-eqz v5, :cond_18

    .line 1541
    .line 1542
    shl-int/lit8 v0, v13, 0x3

    .line 1543
    .line 1544
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1545
    .line 1546
    .line 1547
    move-result v5

    .line 1548
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1549
    .line 1550
    .line 1551
    move-result v0

    .line 1552
    invoke-static {v5, v0, v10}, Lcb/a;->a(III)I

    .line 1553
    .line 1554
    .line 1555
    move-result v10

    .line 1556
    goto :goto_15

    .line 1557
    :pswitch_3a
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v5

    .line 1561
    if-eqz v5, :cond_18

    .line 1562
    .line 1563
    shl-int/lit8 v0, v13, 0x3

    .line 1564
    .line 1565
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v5

    .line 1569
    check-cast v5, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1570
    .line 1571
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1572
    .line 1573
    .line 1574
    move-result v0

    .line 1575
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 1576
    .line 1577
    .line 1578
    move-result v5

    .line 1579
    invoke-static {v5, v5, v0, v10}, Lcb/a;->B(IIII)I

    .line 1580
    .line 1581
    .line 1582
    move-result v10

    .line 1583
    goto :goto_15

    .line 1584
    :pswitch_3b
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v5

    .line 1588
    if-eqz v5, :cond_1a

    .line 1589
    .line 1590
    shl-int/lit8 v5, v13, 0x3

    .line 1591
    .line 1592
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v9

    .line 1596
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v11

    .line 1600
    sget v12, Lcom/google/android/gms/internal/ads/zzigs;->zza:I

    .line 1601
    .line 1602
    check-cast v9, Lcom/google/android/gms/internal/ads/zzicu;

    .line 1603
    .line 1604
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1605
    .line 1606
    .line 1607
    move-result v5

    .line 1608
    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/ads/zzicu;->zzaT(Lcom/google/android/gms/internal/ads/zzigr;)I

    .line 1609
    .line 1610
    .line 1611
    move-result v9

    .line 1612
    invoke-static {v9, v9, v5, v10}, Lcb/a;->B(IIII)I

    .line 1613
    .line 1614
    .line 1615
    move-result v10

    .line 1616
    goto/16 :goto_16

    .line 1617
    .line 1618
    :pswitch_3c
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v5

    .line 1622
    if-eqz v5, :cond_18

    .line 1623
    .line 1624
    shl-int/lit8 v0, v13, 0x3

    .line 1625
    .line 1626
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v5

    .line 1630
    instance-of v9, v5, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1631
    .line 1632
    if-eqz v9, :cond_19

    .line 1633
    .line 1634
    check-cast v5, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1635
    .line 1636
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1637
    .line 1638
    .line 1639
    move-result v0

    .line 1640
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 1641
    .line 1642
    .line 1643
    move-result v5

    .line 1644
    invoke-static {v5, v5, v0, v10}, Lcb/a;->B(IIII)I

    .line 1645
    .line 1646
    .line 1647
    move-result v10

    .line 1648
    goto/16 :goto_15

    .line 1649
    .line 1650
    :cond_19
    check-cast v5, Ljava/lang/String;

    .line 1651
    .line 1652
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1653
    .line 1654
    .line 1655
    move-result v0

    .line 1656
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzihp;->zzc(Ljava/lang/String;)I

    .line 1657
    .line 1658
    .line 1659
    move-result v5

    .line 1660
    invoke-static {v5, v5, v0, v10}, Lcb/a;->B(IIII)I

    .line 1661
    .line 1662
    .line 1663
    move-result v10

    .line 1664
    goto/16 :goto_15

    .line 1665
    .line 1666
    :pswitch_3d
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v5

    .line 1670
    if-eqz v5, :cond_18

    .line 1671
    .line 1672
    shl-int/lit8 v0, v13, 0x3

    .line 1673
    .line 1674
    invoke-static {v0, v6, v10}, Lcb/a;->a(III)I

    .line 1675
    .line 1676
    .line 1677
    move-result v10

    .line 1678
    goto/16 :goto_15

    .line 1679
    .line 1680
    :pswitch_3e
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v5

    .line 1684
    if-eqz v5, :cond_18

    .line 1685
    .line 1686
    shl-int/lit8 v0, v13, 0x3

    .line 1687
    .line 1688
    invoke-static {v0, v9, v10}, Lcb/a;->a(III)I

    .line 1689
    .line 1690
    .line 1691
    move-result v10

    .line 1692
    goto/16 :goto_15

    .line 1693
    .line 1694
    :pswitch_3f
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v5

    .line 1698
    if-eqz v5, :cond_18

    .line 1699
    .line 1700
    shl-int/lit8 v0, v13, 0x3

    .line 1701
    .line 1702
    invoke-static {v0, v11, v10}, Lcb/a;->a(III)I

    .line 1703
    .line 1704
    .line 1705
    move-result v10

    .line 1706
    goto/16 :goto_15

    .line 1707
    .line 1708
    :pswitch_40
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v5

    .line 1712
    if-eqz v5, :cond_18

    .line 1713
    .line 1714
    shl-int/lit8 v0, v13, 0x3

    .line 1715
    .line 1716
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1717
    .line 1718
    .line 1719
    move-result v5

    .line 1720
    int-to-long v11, v5

    .line 1721
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1722
    .line 1723
    .line 1724
    move-result v0

    .line 1725
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 1726
    .line 1727
    .line 1728
    move-result v5

    .line 1729
    goto/16 :goto_14

    .line 1730
    .line 1731
    :pswitch_41
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1732
    .line 1733
    .line 1734
    move-result v5

    .line 1735
    if-eqz v5, :cond_18

    .line 1736
    .line 1737
    shl-int/lit8 v0, v13, 0x3

    .line 1738
    .line 1739
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1740
    .line 1741
    .line 1742
    move-result-wide v11

    .line 1743
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1744
    .line 1745
    .line 1746
    move-result v0

    .line 1747
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 1748
    .line 1749
    .line 1750
    move-result v5

    .line 1751
    goto/16 :goto_14

    .line 1752
    .line 1753
    :pswitch_42
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1754
    .line 1755
    .line 1756
    move-result v5

    .line 1757
    if-eqz v5, :cond_18

    .line 1758
    .line 1759
    shl-int/lit8 v0, v13, 0x3

    .line 1760
    .line 1761
    invoke-virtual {v7, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1762
    .line 1763
    .line 1764
    move-result-wide v11

    .line 1765
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzidu;->zzF(I)I

    .line 1766
    .line 1767
    .line 1768
    move-result v0

    .line 1769
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidu;->zzG(J)I

    .line 1770
    .line 1771
    .line 1772
    move-result v5

    .line 1773
    goto/16 :goto_14

    .line 1774
    .line 1775
    :pswitch_43
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v5

    .line 1779
    if-eqz v5, :cond_18

    .line 1780
    .line 1781
    shl-int/lit8 v0, v13, 0x3

    .line 1782
    .line 1783
    invoke-static {v0, v9, v10}, Lcb/a;->a(III)I

    .line 1784
    .line 1785
    .line 1786
    move-result v10

    .line 1787
    goto/16 :goto_15

    .line 1788
    .line 1789
    :pswitch_44
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v5

    .line 1793
    if-eqz v5, :cond_1a

    .line 1794
    .line 1795
    shl-int/lit8 v1, v13, 0x3

    .line 1796
    .line 1797
    invoke-static {v1, v11, v10}, Lcb/a;->a(III)I

    .line 1798
    .line 1799
    .line 1800
    move-result v10

    .line 1801
    :cond_1a
    :goto_16
    add-int/lit8 v2, v2, 0x3

    .line 1802
    .line 1803
    move-object/from16 v1, p1

    .line 1804
    .line 1805
    const v9, 0xfffff

    .line 1806
    .line 1807
    .line 1808
    goto/16 :goto_0

    .line 1809
    .line 1810
    :cond_1b
    move-object/from16 v1, p1

    .line 1811
    .line 1812
    check-cast v1, Lcom/google/android/gms/internal/ads/zziep;

    .line 1813
    .line 1814
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 1815
    .line 1816
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzihe;->zzi()I

    .line 1817
    .line 1818
    .line 1819
    move-result v1

    .line 1820
    add-int/2addr v1, v10

    .line 1821
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 1822
    .line 1823
    if-eqz v2, :cond_1e

    .line 1824
    .line 1825
    move-object/from16 v2, p1

    .line 1826
    .line 1827
    check-cast v2, Lcom/google/android/gms/internal/ads/zziel;

    .line 1828
    .line 1829
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 1830
    .line 1831
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zziee;->zza:Lcom/google/android/gms/internal/ads/zzigx;

    .line 1832
    .line 1833
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzigx;->zzc()I

    .line 1834
    .line 1835
    .line 1836
    move-result v3

    .line 1837
    move v4, v8

    .line 1838
    :goto_17
    if-ge v8, v3, :cond_1c

    .line 1839
    .line 1840
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzigx;->zzd(I)Ljava/util/Map$Entry;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v5

    .line 1844
    move-object v7, v5

    .line 1845
    check-cast v7, Lcom/google/android/gms/internal/ads/zzigu;

    .line 1846
    .line 1847
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzigu;->zza()Ljava/lang/Comparable;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v7

    .line 1851
    check-cast v7, Lcom/google/android/gms/internal/ads/zzied;

    .line 1852
    .line 1853
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v5

    .line 1857
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/ads/zziee;->zzj(Lcom/google/android/gms/internal/ads/zzied;Ljava/lang/Object;)I

    .line 1858
    .line 1859
    .line 1860
    move-result v5

    .line 1861
    add-int/2addr v4, v5

    .line 1862
    add-int/2addr v8, v6

    .line 1863
    goto :goto_17

    .line 1864
    :cond_1c
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzigx;->zze()Ljava/lang/Iterable;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v2

    .line 1868
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v2

    .line 1872
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1873
    .line 1874
    .line 1875
    move-result v3

    .line 1876
    if-eqz v3, :cond_1d

    .line 1877
    .line 1878
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v3

    .line 1882
    check-cast v3, Ljava/util/Map$Entry;

    .line 1883
    .line 1884
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v5

    .line 1888
    check-cast v5, Lcom/google/android/gms/internal/ads/zzied;

    .line 1889
    .line 1890
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v3

    .line 1894
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/ads/zziee;->zzj(Lcom/google/android/gms/internal/ads/zzied;Ljava/lang/Object;)I

    .line 1895
    .line 1896
    .line 1897
    move-result v3

    .line 1898
    add-int/2addr v4, v3

    .line 1899
    goto :goto_18

    .line 1900
    :cond_1d
    add-int/2addr v1, v4

    .line 1901
    :cond_1e
    return v1

    .line 1902
    nop

    .line 1903
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzf(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzihs;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lcom/google/android/gms/internal/ads/zziel;

    .line 13
    .line 14
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 15
    .line 16
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zziee;->zza:Lcom/google/android/gms/internal/ads/zzigx;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zziee;->zzc()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    move-object v8, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    :goto_0
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 39
    .line 40
    sget-object v10, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 41
    .line 42
    const v11, 0xfffff

    .line 43
    .line 44
    .line 45
    move v4, v11

    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    :goto_1
    array-length v13, v9

    .line 49
    if-ge v2, v13, :cond_a

    .line 50
    .line 51
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    aget v15, v9, v2

    .line 60
    .line 61
    const/16 v7, 0x11

    .line 62
    .line 63
    if-gt v14, v7, :cond_3

    .line 64
    .line 65
    add-int/lit8 v7, v2, 0x2

    .line 66
    .line 67
    aget v7, v9, v7

    .line 68
    .line 69
    const/16 v16, 0x1

    .line 70
    .line 71
    and-int v12, v7, v11

    .line 72
    .line 73
    if-eq v12, v4, :cond_2

    .line 74
    .line 75
    if-ne v12, v11, :cond_1

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    int-to-long v4, v12

    .line 80
    invoke-virtual {v10, v1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    move v5, v4

    .line 85
    :goto_2
    move v4, v12

    .line 86
    :cond_2
    ushr-int/lit8 v7, v7, 0x14

    .line 87
    .line 88
    shl-int v7, v16, v7

    .line 89
    .line 90
    move/from16 v19, v7

    .line 91
    .line 92
    move-object v7, v3

    .line 93
    move v3, v4

    .line 94
    move v4, v5

    .line 95
    move/from16 v5, v19

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    const/16 v16, 0x1

    .line 99
    .line 100
    move-object v7, v3

    .line 101
    move v3, v4

    .line 102
    move v4, v5

    .line 103
    const/4 v5, 0x0

    .line 104
    :goto_3
    if-eqz v7, :cond_5

    .line 105
    .line 106
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzn:Lcom/google/android/gms/internal/ads/zziea;

    .line 107
    .line 108
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v17

    .line 112
    move/from16 v18, v11

    .line 113
    .line 114
    move-object/from16 v11, v17

    .line 115
    .line 116
    check-cast v11, Lcom/google/android/gms/internal/ads/zziem;

    .line 117
    .line 118
    iget v11, v11, Lcom/google/android/gms/internal/ads/zziem;->zza:I

    .line 119
    .line 120
    if-gt v11, v15, :cond_6

    .line 121
    .line 122
    invoke-virtual {v12, v6, v7}, Lcom/google/android/gms/internal/ads/zziea;->zzb(Lcom/google/android/gms/internal/ads/zzihs;Ljava/util/Map$Entry;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_4

    .line 130
    .line 131
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Ljava/util/Map$Entry;

    .line 136
    .line 137
    move/from16 v11, v18

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    move/from16 v11, v18

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    move/from16 v18, v11

    .line 145
    .line 146
    :cond_6
    and-int v11, v13, v18

    .line 147
    .line 148
    int-to-long v11, v11

    .line 149
    packed-switch v14, :pswitch_data_0

    .line 150
    .line 151
    .line 152
    :cond_7
    :goto_4
    const/4 v13, 0x0

    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :pswitch_0
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_7

    .line 160
    .line 161
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-interface {v6, v15, v5, v11}, Lcom/google/android/gms/internal/ads/zzihs;->zzs(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :pswitch_1
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_7

    .line 178
    .line 179
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v11

    .line 183
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzq(IJ)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :pswitch_2
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_7

    .line 192
    .line 193
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzp(II)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :pswitch_3
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_7

    .line 206
    .line 207
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 208
    .line 209
    .line 210
    move-result-wide v11

    .line 211
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzd(IJ)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :pswitch_4
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_7

    .line 220
    .line 221
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzb(II)V

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :pswitch_5
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_7

    .line 234
    .line 235
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzg(II)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :pswitch_6
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_7

    .line 248
    .line 249
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzo(II)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :pswitch_7
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_7

    .line 262
    .line 263
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    check-cast v5, Lcom/google/android/gms/internal/ads/zzidl;

    .line 268
    .line 269
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzn(ILcom/google/android/gms/internal/ads/zzidl;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_8
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_7

    .line 278
    .line 279
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    invoke-interface {v6, v15, v5, v11}, Lcom/google/android/gms/internal/ads/zzihs;->zzr(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_4

    .line 291
    .line 292
    :pswitch_9
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-eqz v5, :cond_7

    .line 297
    .line 298
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-static {v15, v5, v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzT(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihs;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_4

    .line 306
    .line 307
    :pswitch_a
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_7

    .line 312
    .line 313
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    check-cast v5, Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzl(IZ)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_4

    .line 327
    .line 328
    :pswitch_b
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_7

    .line 333
    .line 334
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzk(II)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_4

    .line 342
    .line 343
    :pswitch_c
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_7

    .line 348
    .line 349
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 350
    .line 351
    .line 352
    move-result-wide v11

    .line 353
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzj(IJ)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_4

    .line 357
    .line 358
    :pswitch_d
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    if-eqz v5, :cond_7

    .line 363
    .line 364
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzG(Ljava/lang/Object;J)I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzi(II)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_4

    .line 372
    .line 373
    :pswitch_e
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_7

    .line 378
    .line 379
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 380
    .line 381
    .line 382
    move-result-wide v11

    .line 383
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzh(IJ)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_4

    .line 387
    .line 388
    :pswitch_f
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eqz v5, :cond_7

    .line 393
    .line 394
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzH(Ljava/lang/Object;J)J

    .line 395
    .line 396
    .line 397
    move-result-wide v11

    .line 398
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzc(IJ)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_4

    .line 402
    .line 403
    :pswitch_10
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-eqz v5, :cond_7

    .line 408
    .line 409
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    check-cast v5, Ljava/lang/Float;

    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    invoke-interface {v6, v15, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zze(IF)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_4

    .line 423
    .line 424
    :pswitch_11
    invoke-direct {v0, v1, v15, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    if-eqz v5, :cond_7

    .line 429
    .line 430
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    check-cast v5, Ljava/lang/Double;

    .line 435
    .line 436
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 437
    .line 438
    .line 439
    move-result-wide v11

    .line 440
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzf(ID)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_4

    .line 444
    .line 445
    :pswitch_12
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    if-eqz v5, :cond_7

    .line 450
    .line 451
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    check-cast v11, Lcom/google/android/gms/internal/ads/zzifs;

    .line 456
    .line 457
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzifs;->zze()Lcom/google/android/gms/internal/ads/zzifr;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    check-cast v5, Lcom/google/android/gms/internal/ads/zzift;

    .line 462
    .line 463
    invoke-interface {v6, v15, v11, v5}, Lcom/google/android/gms/internal/ads/zzihs;->zzM(ILcom/google/android/gms/internal/ads/zzifr;Ljava/util/Map;)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_4

    .line 467
    .line 468
    :pswitch_13
    aget v5, v9, v2

    .line 469
    .line 470
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    check-cast v11, Ljava/util/List;

    .line 475
    .line 476
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    invoke-static {v5, v11, v6, v12}, Lcom/google/android/gms/internal/ads/zzigs;->zzr(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_4

    .line 484
    .line 485
    :pswitch_14
    aget v5, v9, v2

    .line 486
    .line 487
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    check-cast v11, Ljava/util/List;

    .line 492
    .line 493
    move/from16 v13, v16

    .line 494
    .line 495
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zze(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_4

    .line 499
    .line 500
    :pswitch_15
    move/from16 v13, v16

    .line 501
    .line 502
    aget v5, v9, v2

    .line 503
    .line 504
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v11

    .line 508
    check-cast v11, Ljava/util/List;

    .line 509
    .line 510
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_4

    .line 514
    .line 515
    :pswitch_16
    move/from16 v13, v16

    .line 516
    .line 517
    aget v5, v9, v2

    .line 518
    .line 519
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v11

    .line 523
    check-cast v11, Ljava/util/List;

    .line 524
    .line 525
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_4

    .line 529
    .line 530
    :pswitch_17
    move/from16 v13, v16

    .line 531
    .line 532
    aget v5, v9, v2

    .line 533
    .line 534
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    check-cast v11, Ljava/util/List;

    .line 539
    .line 540
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_4

    .line 544
    .line 545
    :pswitch_18
    move/from16 v13, v16

    .line 546
    .line 547
    aget v5, v9, v2

    .line 548
    .line 549
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    check-cast v11, Ljava/util/List;

    .line 554
    .line 555
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 556
    .line 557
    .line 558
    goto/16 :goto_4

    .line 559
    .line 560
    :pswitch_19
    move/from16 v13, v16

    .line 561
    .line 562
    aget v5, v9, v2

    .line 563
    .line 564
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    check-cast v11, Ljava/util/List;

    .line 569
    .line 570
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 571
    .line 572
    .line 573
    goto/16 :goto_4

    .line 574
    .line 575
    :pswitch_1a
    move/from16 v13, v16

    .line 576
    .line 577
    aget v5, v9, v2

    .line 578
    .line 579
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v11

    .line 583
    check-cast v11, Ljava/util/List;

    .line 584
    .line 585
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :pswitch_1b
    move/from16 v13, v16

    .line 591
    .line 592
    aget v5, v9, v2

    .line 593
    .line 594
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v11

    .line 598
    check-cast v11, Ljava/util/List;

    .line 599
    .line 600
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_4

    .line 604
    .line 605
    :pswitch_1c
    move/from16 v13, v16

    .line 606
    .line 607
    aget v5, v9, v2

    .line 608
    .line 609
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    check-cast v11, Ljava/util/List;

    .line 614
    .line 615
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_4

    .line 619
    .line 620
    :pswitch_1d
    move/from16 v13, v16

    .line 621
    .line 622
    aget v5, v9, v2

    .line 623
    .line 624
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v11

    .line 628
    check-cast v11, Ljava/util/List;

    .line 629
    .line 630
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_4

    .line 634
    .line 635
    :pswitch_1e
    move/from16 v13, v16

    .line 636
    .line 637
    aget v5, v9, v2

    .line 638
    .line 639
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    check-cast v11, Ljava/util/List;

    .line 644
    .line 645
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 646
    .line 647
    .line 648
    goto/16 :goto_4

    .line 649
    .line 650
    :pswitch_1f
    move/from16 v13, v16

    .line 651
    .line 652
    aget v5, v9, v2

    .line 653
    .line 654
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v11

    .line 658
    check-cast v11, Ljava/util/List;

    .line 659
    .line 660
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_4

    .line 664
    .line 665
    :pswitch_20
    move/from16 v13, v16

    .line 666
    .line 667
    aget v5, v9, v2

    .line 668
    .line 669
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v11

    .line 673
    check-cast v11, Ljava/util/List;

    .line 674
    .line 675
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_4

    .line 679
    .line 680
    :pswitch_21
    move/from16 v13, v16

    .line 681
    .line 682
    aget v5, v9, v2

    .line 683
    .line 684
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v11

    .line 688
    check-cast v11, Ljava/util/List;

    .line 689
    .line 690
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zza(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 691
    .line 692
    .line 693
    goto/16 :goto_4

    .line 694
    .line 695
    :pswitch_22
    aget v5, v9, v2

    .line 696
    .line 697
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v11

    .line 701
    check-cast v11, Ljava/util/List;

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zze(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_6

    .line 708
    .line 709
    :pswitch_23
    const/4 v13, 0x0

    .line 710
    aget v5, v9, v2

    .line 711
    .line 712
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v11

    .line 716
    check-cast v11, Ljava/util/List;

    .line 717
    .line 718
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 719
    .line 720
    .line 721
    goto/16 :goto_6

    .line 722
    .line 723
    :pswitch_24
    const/4 v13, 0x0

    .line 724
    aget v5, v9, v2

    .line 725
    .line 726
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v11

    .line 730
    check-cast v11, Ljava/util/List;

    .line 731
    .line 732
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_6

    .line 736
    .line 737
    :pswitch_25
    const/4 v13, 0x0

    .line 738
    aget v5, v9, v2

    .line 739
    .line 740
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v11

    .line 744
    check-cast v11, Ljava/util/List;

    .line 745
    .line 746
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 747
    .line 748
    .line 749
    goto/16 :goto_6

    .line 750
    .line 751
    :pswitch_26
    const/4 v13, 0x0

    .line 752
    aget v5, v9, v2

    .line 753
    .line 754
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v11

    .line 758
    check-cast v11, Ljava/util/List;

    .line 759
    .line 760
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 761
    .line 762
    .line 763
    goto/16 :goto_6

    .line 764
    .line 765
    :pswitch_27
    const/4 v13, 0x0

    .line 766
    aget v5, v9, v2

    .line 767
    .line 768
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v11

    .line 772
    check-cast v11, Ljava/util/List;

    .line 773
    .line 774
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_6

    .line 778
    .line 779
    :pswitch_28
    aget v5, v9, v2

    .line 780
    .line 781
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v11

    .line 785
    check-cast v11, Ljava/util/List;

    .line 786
    .line 787
    invoke-static {v5, v11, v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzp(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;)V

    .line 788
    .line 789
    .line 790
    goto/16 :goto_4

    .line 791
    .line 792
    :pswitch_29
    aget v5, v9, v2

    .line 793
    .line 794
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v11

    .line 798
    check-cast v11, Ljava/util/List;

    .line 799
    .line 800
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 801
    .line 802
    .line 803
    move-result-object v12

    .line 804
    invoke-static {v5, v11, v6, v12}, Lcom/google/android/gms/internal/ads/zzigs;->zzq(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_4

    .line 808
    .line 809
    :pswitch_2a
    aget v5, v9, v2

    .line 810
    .line 811
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v11

    .line 815
    check-cast v11, Ljava/util/List;

    .line 816
    .line 817
    invoke-static {v5, v11, v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzo(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;)V

    .line 818
    .line 819
    .line 820
    goto/16 :goto_4

    .line 821
    .line 822
    :pswitch_2b
    aget v5, v9, v2

    .line 823
    .line 824
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v11

    .line 828
    check-cast v11, Ljava/util/List;

    .line 829
    .line 830
    const/4 v13, 0x0

    .line 831
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 832
    .line 833
    .line 834
    goto/16 :goto_6

    .line 835
    .line 836
    :pswitch_2c
    const/4 v13, 0x0

    .line 837
    aget v5, v9, v2

    .line 838
    .line 839
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v11

    .line 843
    check-cast v11, Ljava/util/List;

    .line 844
    .line 845
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_6

    .line 849
    .line 850
    :pswitch_2d
    const/4 v13, 0x0

    .line 851
    aget v5, v9, v2

    .line 852
    .line 853
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v11

    .line 857
    check-cast v11, Ljava/util/List;

    .line 858
    .line 859
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 860
    .line 861
    .line 862
    goto/16 :goto_6

    .line 863
    .line 864
    :pswitch_2e
    const/4 v13, 0x0

    .line 865
    aget v5, v9, v2

    .line 866
    .line 867
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v11

    .line 871
    check-cast v11, Ljava/util/List;

    .line 872
    .line 873
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 874
    .line 875
    .line 876
    goto/16 :goto_6

    .line 877
    .line 878
    :pswitch_2f
    const/4 v13, 0x0

    .line 879
    aget v5, v9, v2

    .line 880
    .line 881
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v11

    .line 885
    check-cast v11, Ljava/util/List;

    .line 886
    .line 887
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_6

    .line 891
    .line 892
    :pswitch_30
    const/4 v13, 0x0

    .line 893
    aget v5, v9, v2

    .line 894
    .line 895
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    check-cast v11, Ljava/util/List;

    .line 900
    .line 901
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 902
    .line 903
    .line 904
    goto/16 :goto_6

    .line 905
    .line 906
    :pswitch_31
    const/4 v13, 0x0

    .line 907
    aget v5, v9, v2

    .line 908
    .line 909
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v11

    .line 913
    check-cast v11, Ljava/util/List;

    .line 914
    .line 915
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 916
    .line 917
    .line 918
    goto/16 :goto_6

    .line 919
    .line 920
    :pswitch_32
    const/4 v13, 0x0

    .line 921
    aget v5, v9, v2

    .line 922
    .line 923
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v11

    .line 927
    check-cast v11, Ljava/util/List;

    .line 928
    .line 929
    invoke-static {v5, v11, v6, v13}, Lcom/google/android/gms/internal/ads/zzigs;->zza(ILjava/util/List;Lcom/google/android/gms/internal/ads/zzihs;Z)V

    .line 930
    .line 931
    .line 932
    goto/16 :goto_6

    .line 933
    .line 934
    :pswitch_33
    const/4 v13, 0x0

    .line 935
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-eqz v5, :cond_9

    .line 940
    .line 941
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v5

    .line 945
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 946
    .line 947
    .line 948
    move-result-object v11

    .line 949
    invoke-interface {v6, v15, v5, v11}, Lcom/google/android/gms/internal/ads/zzihs;->zzs(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 950
    .line 951
    .line 952
    goto/16 :goto_6

    .line 953
    .line 954
    :pswitch_34
    const/4 v13, 0x0

    .line 955
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 956
    .line 957
    .line 958
    move-result v5

    .line 959
    if-eqz v5, :cond_8

    .line 960
    .line 961
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 962
    .line 963
    .line 964
    move-result-wide v11

    .line 965
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzq(IJ)V

    .line 966
    .line 967
    .line 968
    :cond_8
    :goto_5
    move-object/from16 v0, p0

    .line 969
    .line 970
    goto/16 :goto_6

    .line 971
    .line 972
    :pswitch_35
    const/4 v13, 0x0

    .line 973
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 974
    .line 975
    .line 976
    move-result v5

    .line 977
    if-eqz v5, :cond_8

    .line 978
    .line 979
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 980
    .line 981
    .line 982
    move-result v0

    .line 983
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzp(II)V

    .line 984
    .line 985
    .line 986
    goto :goto_5

    .line 987
    :pswitch_36
    const/4 v13, 0x0

    .line 988
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 989
    .line 990
    .line 991
    move-result v5

    .line 992
    if-eqz v5, :cond_8

    .line 993
    .line 994
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 995
    .line 996
    .line 997
    move-result-wide v11

    .line 998
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzd(IJ)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_5

    .line 1002
    :pswitch_37
    const/4 v13, 0x0

    .line 1003
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v5

    .line 1007
    if-eqz v5, :cond_8

    .line 1008
    .line 1009
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1010
    .line 1011
    .line 1012
    move-result v0

    .line 1013
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzb(II)V

    .line 1014
    .line 1015
    .line 1016
    goto :goto_5

    .line 1017
    :pswitch_38
    const/4 v13, 0x0

    .line 1018
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v5

    .line 1022
    if-eqz v5, :cond_8

    .line 1023
    .line 1024
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzg(II)V

    .line 1029
    .line 1030
    .line 1031
    goto :goto_5

    .line 1032
    :pswitch_39
    const/4 v13, 0x0

    .line 1033
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v5

    .line 1037
    if-eqz v5, :cond_8

    .line 1038
    .line 1039
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzo(II)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_5

    .line 1047
    :pswitch_3a
    const/4 v13, 0x0

    .line 1048
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v5

    .line 1052
    if-eqz v5, :cond_8

    .line 1053
    .line 1054
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    check-cast v0, Lcom/google/android/gms/internal/ads/zzidl;

    .line 1059
    .line 1060
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzn(ILcom/google/android/gms/internal/ads/zzidl;)V

    .line 1061
    .line 1062
    .line 1063
    goto :goto_5

    .line 1064
    :pswitch_3b
    const/4 v13, 0x0

    .line 1065
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v5

    .line 1069
    if-eqz v5, :cond_9

    .line 1070
    .line 1071
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v11

    .line 1079
    invoke-interface {v6, v15, v5, v11}, Lcom/google/android/gms/internal/ads/zzihs;->zzr(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;)V

    .line 1080
    .line 1081
    .line 1082
    goto/16 :goto_6

    .line 1083
    .line 1084
    :pswitch_3c
    const/4 v13, 0x0

    .line 1085
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v5

    .line 1089
    if-eqz v5, :cond_8

    .line 1090
    .line 1091
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-static {v15, v0, v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzT(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihs;)V

    .line 1096
    .line 1097
    .line 1098
    goto/16 :goto_5

    .line 1099
    .line 1100
    :pswitch_3d
    const/4 v13, 0x0

    .line 1101
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v5

    .line 1105
    if-eqz v5, :cond_8

    .line 1106
    .line 1107
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzg(Ljava/lang/Object;J)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzl(IZ)V

    .line 1112
    .line 1113
    .line 1114
    goto/16 :goto_5

    .line 1115
    .line 1116
    :pswitch_3e
    const/4 v13, 0x0

    .line 1117
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v5

    .line 1121
    if-eqz v5, :cond_8

    .line 1122
    .line 1123
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzk(II)V

    .line 1128
    .line 1129
    .line 1130
    goto/16 :goto_5

    .line 1131
    .line 1132
    :pswitch_3f
    const/4 v13, 0x0

    .line 1133
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v5

    .line 1137
    if-eqz v5, :cond_8

    .line 1138
    .line 1139
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1140
    .line 1141
    .line 1142
    move-result-wide v11

    .line 1143
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzj(IJ)V

    .line 1144
    .line 1145
    .line 1146
    goto/16 :goto_5

    .line 1147
    .line 1148
    :pswitch_40
    const/4 v13, 0x0

    .line 1149
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-eqz v5, :cond_8

    .line 1154
    .line 1155
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1156
    .line 1157
    .line 1158
    move-result v0

    .line 1159
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zzi(II)V

    .line 1160
    .line 1161
    .line 1162
    goto/16 :goto_5

    .line 1163
    .line 1164
    :pswitch_41
    const/4 v13, 0x0

    .line 1165
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v5

    .line 1169
    if-eqz v5, :cond_8

    .line 1170
    .line 1171
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v11

    .line 1175
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzh(IJ)V

    .line 1176
    .line 1177
    .line 1178
    goto/16 :goto_5

    .line 1179
    .line 1180
    :pswitch_42
    const/4 v13, 0x0

    .line 1181
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v5

    .line 1185
    if-eqz v5, :cond_8

    .line 1186
    .line 1187
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v11

    .line 1191
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzc(IJ)V

    .line 1192
    .line 1193
    .line 1194
    goto/16 :goto_5

    .line 1195
    .line 1196
    :pswitch_43
    const/4 v13, 0x0

    .line 1197
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v5

    .line 1201
    if-eqz v5, :cond_8

    .line 1202
    .line 1203
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzi(Ljava/lang/Object;J)F

    .line 1204
    .line 1205
    .line 1206
    move-result v0

    .line 1207
    invoke-interface {v6, v15, v0}, Lcom/google/android/gms/internal/ads/zzihs;->zze(IF)V

    .line 1208
    .line 1209
    .line 1210
    goto/16 :goto_5

    .line 1211
    .line 1212
    :pswitch_44
    const/4 v13, 0x0

    .line 1213
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v5

    .line 1217
    if-eqz v5, :cond_9

    .line 1218
    .line 1219
    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzihk;->zzk(Ljava/lang/Object;J)D

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v11

    .line 1223
    invoke-interface {v6, v15, v11, v12}, Lcom/google/android/gms/internal/ads/zzihs;->zzf(ID)V

    .line 1224
    .line 1225
    .line 1226
    :cond_9
    :goto_6
    add-int/lit8 v2, v2, 0x3

    .line 1227
    .line 1228
    move v5, v4

    .line 1229
    move/from16 v11, v18

    .line 1230
    .line 1231
    move v4, v3

    .line 1232
    move-object v3, v7

    .line 1233
    goto/16 :goto_1

    .line 1234
    .line 1235
    :cond_a
    :goto_7
    if-eqz v3, :cond_c

    .line 1236
    .line 1237
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzn:Lcom/google/android/gms/internal/ads/zziea;

    .line 1238
    .line 1239
    invoke-virtual {v2, v6, v3}, Lcom/google/android/gms/internal/ads/zziea;->zzb(Lcom/google/android/gms/internal/ads/zzihs;Ljava/util/Map$Entry;)V

    .line 1240
    .line 1241
    .line 1242
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1243
    .line 1244
    .line 1245
    move-result v2

    .line 1246
    if-eqz v2, :cond_b

    .line 1247
    .line 1248
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v2

    .line 1252
    move-object v3, v2

    .line 1253
    check-cast v3, Ljava/util/Map$Entry;

    .line 1254
    .line 1255
    goto :goto_7

    .line 1256
    :cond_b
    const/4 v3, 0x0

    .line 1257
    goto :goto_7

    .line 1258
    :cond_c
    check-cast v1, Lcom/google/android/gms/internal/ads/zziep;

    .line 1259
    .line 1260
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zziep;->zzt:Lcom/google/android/gms/internal/ads/zzihe;

    .line 1261
    .line 1262
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzihe;->zzg(Lcom/google/android/gms/internal/ads/zzihs;)V

    .line 1263
    .line 1264
    .line 1265
    return-void

    .line 1266
    nop

    .line 1267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzg(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigm;Lcom/google/android/gms/internal/ads/zzidz;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzF(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move-object v6, v5

    .line 11
    move-object v5, v0

    .line 12
    :goto_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzb()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzP(I)I

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 20
    const/4 v7, 0x0

    .line 21
    if-gez v1, :cond_8

    .line 22
    .line 23
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    if-ne v2, v1, :cond_1

    .line 27
    .line 28
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 29
    .line 30
    move-object v4, v5

    .line 31
    :goto_1
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 32
    .line 33
    if-ge p2, p3, :cond_0

    .line 34
    .line 35
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 36
    .line 37
    aget v3, p3, p2

    .line 38
    .line 39
    move-object v5, v6

    .line 40
    move-object v6, p1

    .line 41
    move-object v1, p0

    .line 42
    move-object v2, p1

    .line 43
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    move-object v6, v5

    .line 48
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move-object v1, p0

    .line 52
    move-object v2, p1

    .line 53
    goto/16 :goto_15

    .line 54
    .line 55
    :cond_1
    move-object v1, p0

    .line 56
    :try_start_1
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    move-object v2, v0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzg:Lcom/google/android/gms/internal/ads/zzifz;

    .line 63
    .line 64
    invoke-virtual {p3, v3, v2}, Lcom/google/android/gms/internal/ads/zzidz;->zzd(Lcom/google/android/gms/internal/ads/zzifz;I)Lcom/google/android/gms/internal/ads/zzien;

    .line 65
    .line 66
    .line 67
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 68
    :goto_2
    if-nez v2, :cond_7

    .line 69
    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    :try_start_2
    invoke-virtual {v6, p1}, Lcom/google/android/gms/internal/ads/zzihd;->zzh(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    move-object v5, v2

    .line 77
    goto :goto_3

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object p2, v0

    .line 80
    move-object v2, p1

    .line 81
    goto/16 :goto_17

    .line 82
    .line 83
    :cond_3
    :goto_3
    :try_start_3
    invoke-virtual {v6, v5, p2, v7}, Lcom/google/android/gms/internal/ads/zzihd;->zzk(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigm;I)Z

    .line 84
    .line 85
    .line 86
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    if-nez v2, :cond_5

    .line 88
    .line 89
    iget p2, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 90
    .line 91
    move-object v4, v5

    .line 92
    :goto_4
    iget p3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 93
    .line 94
    if-ge p2, p3, :cond_4

    .line 95
    .line 96
    iget-object p3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 97
    .line 98
    aget v3, p3, p2

    .line 99
    .line 100
    move-object v5, v6

    .line 101
    move-object v6, p1

    .line 102
    move-object v2, p1

    .line 103
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    move-object p1, v1

    .line 108
    move-object v3, v2

    .line 109
    move-object v6, v5

    .line 110
    add-int/lit8 p2, p2, 0x1

    .line 111
    .line 112
    move-object p1, v3

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move-object v3, p1

    .line 115
    :goto_5
    move-object v2, v3

    .line 116
    goto/16 :goto_15

    .line 117
    .line 118
    :cond_5
    move-object v3, p1

    .line 119
    move-object p1, v1

    .line 120
    :cond_6
    :goto_6
    move-object p1, v3

    .line 121
    goto :goto_0

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    move-object v3, p1

    .line 124
    move-object p1, v1

    .line 125
    goto :goto_9

    .line 126
    :goto_7
    move-object v1, p1

    .line 127
    :goto_8
    move-object v2, v3

    .line 128
    goto/16 :goto_17

    .line 129
    .line 130
    :cond_7
    move-object v3, p1

    .line 131
    move-object p1, v1

    .line 132
    :try_start_4
    move-object p2, v3

    .line 133
    check-cast p2, Lcom/google/android/gms/internal/ads/zziel;

    .line 134
    .line 135
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    :catchall_2
    move-exception v0

    .line 137
    :goto_9
    move-object p2, v0

    .line 138
    goto :goto_7

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    move-object v3, p1

    .line 141
    move-object p1, v1

    .line 142
    move-object p2, v0

    .line 143
    goto :goto_8

    .line 144
    :cond_8
    move-object v3, p1

    .line 145
    move-object p1, p0

    .line 146
    :try_start_5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 147
    .line 148
    .line 149
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    .line 150
    :try_start_6
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 151
    .line 152
    .line 153
    move-result v8
    :try_end_6
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 154
    const v9, 0xfffff

    .line 155
    .line 156
    .line 157
    packed-switch v8, :pswitch_data_0

    .line 158
    .line 159
    .line 160
    if-nez v5, :cond_9

    .line 161
    .line 162
    :try_start_7
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzihd;->zzh(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move-object v5, v1

    .line 167
    :cond_9
    invoke-virtual {v6, v5, p2, v7}, Lcom/google/android/gms/internal/ads/zzihd;->zzk(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigm;I)Z

    .line 168
    .line 169
    .line 170
    move-result v1
    :try_end_7
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 171
    if-nez v1, :cond_6

    .line 172
    .line 173
    iget p2, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 174
    .line 175
    move-object v4, v5

    .line 176
    :goto_a
    iget p3, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 177
    .line 178
    if-ge p2, p3, :cond_a

    .line 179
    .line 180
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 181
    .line 182
    aget p3, p3, p2

    .line 183
    .line 184
    move-object v5, v6

    .line 185
    move-object v6, v3

    .line 186
    move-object v1, p1

    .line 187
    move-object v2, v3

    .line 188
    move v3, p3

    .line 189
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object v3, v2

    .line 194
    move-object v6, v5

    .line 195
    add-int/lit8 p2, p2, 0x1

    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_a
    move-object v1, p1

    .line 199
    goto :goto_5

    .line 200
    :catch_0
    move-object v2, v3

    .line 201
    goto/16 :goto_11

    .line 202
    .line 203
    :pswitch_0
    :try_start_8
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzv(Ljava/lang/Object;II)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Lcom/google/android/gms/internal/ads/zzifz;

    .line 208
    .line 209
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-interface {p2, v4, v8, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzp(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {p0, v3, v2, v1, v4}, Lcom/google/android/gms/internal/ads/zzigc;->zzw(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :goto_b
    move-object v2, v3

    .line 220
    goto/16 :goto_e

    .line 221
    .line 222
    :pswitch_1
    and-int/2addr v4, v9

    .line 223
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzw()J

    .line 224
    .line 225
    .line 226
    move-result-wide v8

    .line 227
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    int-to-long v9, v4

    .line 232
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 236
    .line 237
    .line 238
    goto :goto_b

    .line 239
    :pswitch_2
    and-int/2addr v4, v9

    .line 240
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzv()I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    int-to-long v9, v4

    .line 249
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 253
    .line 254
    .line 255
    goto :goto_b

    .line 256
    :pswitch_3
    and-int/2addr v4, v9

    .line 257
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzu()J

    .line 258
    .line 259
    .line 260
    move-result-wide v8

    .line 261
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    int-to-long v9, v4

    .line 266
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 270
    .line 271
    .line 272
    goto :goto_b

    .line 273
    :pswitch_4
    and-int/2addr v4, v9

    .line 274
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzt()I

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    int-to-long v9, v4

    .line 283
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 287
    .line 288
    .line 289
    goto :goto_b

    .line 290
    :pswitch_5
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzs()I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    if-eqz v10, :cond_c

    .line 299
    .line 300
    invoke-interface {v10, v8}, Lcom/google/android/gms/internal/ads/zziev;->zza(I)Z

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    if-eqz v10, :cond_b

    .line 305
    .line 306
    goto :goto_c

    .line 307
    :cond_b
    invoke-static {v3, v2, v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzJ(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    goto/16 :goto_6

    .line 312
    .line 313
    :cond_c
    :goto_c
    and-int/2addr v4, v9

    .line 314
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    int-to-long v9, v4

    .line 319
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 323
    .line 324
    .line 325
    goto :goto_b

    .line 326
    :pswitch_6
    and-int/2addr v4, v9

    .line 327
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzr()I

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    int-to-long v9, v4

    .line 336
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 340
    .line 341
    .line 342
    goto :goto_b

    .line 343
    :pswitch_7
    and-int/2addr v4, v9

    .line 344
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzq()Lcom/google/android/gms/internal/ads/zzidl;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    int-to-long v9, v4

    .line 349
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_b

    .line 356
    .line 357
    :pswitch_8
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzv(Ljava/lang/Object;II)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    check-cast v4, Lcom/google/android/gms/internal/ads/zzifz;

    .line 362
    .line 363
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    invoke-interface {p2, v4, v8, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 368
    .line 369
    .line 370
    invoke-direct {p0, v3, v2, v1, v4}, Lcom/google/android/gms/internal/ads/zzigc;->zzw(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_b

    .line 374
    .line 375
    :pswitch_9
    invoke-direct {p0, v3, v4, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzz(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigm;)V

    .line 376
    .line 377
    .line 378
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_b

    .line 382
    .line 383
    :pswitch_a
    and-int/2addr v4, v9

    .line 384
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzl()Z

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    int-to-long v9, v4

    .line 393
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 397
    .line 398
    .line 399
    goto/16 :goto_b

    .line 400
    .line 401
    :pswitch_b
    and-int/2addr v4, v9

    .line 402
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzk()I

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    int-to-long v9, v4

    .line 411
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_b

    .line 418
    .line 419
    :pswitch_c
    and-int/2addr v4, v9

    .line 420
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzj()J

    .line 421
    .line 422
    .line 423
    move-result-wide v8

    .line 424
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    int-to-long v9, v4

    .line 429
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_b

    .line 436
    .line 437
    :pswitch_d
    and-int/2addr v4, v9

    .line 438
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzi()I

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    int-to-long v9, v4

    .line 447
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_b

    .line 454
    .line 455
    :pswitch_e
    and-int/2addr v4, v9

    .line 456
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzg()J

    .line 457
    .line 458
    .line 459
    move-result-wide v8

    .line 460
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    int-to-long v9, v4

    .line 465
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_b

    .line 472
    .line 473
    :pswitch_f
    and-int/2addr v4, v9

    .line 474
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzh()J

    .line 475
    .line 476
    .line 477
    move-result-wide v8

    .line 478
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    int-to-long v9, v4

    .line 483
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_b

    .line 490
    .line 491
    :pswitch_10
    and-int/2addr v4, v9

    .line 492
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzf()F

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 497
    .line 498
    .line 499
    move-result-object v8

    .line 500
    int-to-long v9, v4

    .line 501
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_b

    .line 508
    .line 509
    :pswitch_11
    and-int/2addr v4, v9

    .line 510
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zze()D

    .line 511
    .line 512
    .line 513
    move-result-wide v8

    .line 514
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    int-to-long v9, v4

    .line 519
    invoke-static {v3, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    invoke-direct {p0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzO(Ljava/lang/Object;II)V

    .line 523
    .line 524
    .line 525
    goto/16 :goto_b

    .line 526
    .line 527
    :pswitch_12
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    and-int/2addr v1, v9

    .line 536
    int-to-long v8, v1

    .line 537
    invoke-static {v3, v8, v9}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    if-nez v1, :cond_d

    .line 542
    .line 543
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzift;->zza()Lcom/google/android/gms/internal/ads/zzift;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzift;->zzc()Lcom/google/android/gms/internal/ads/zzift;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-static {v3, v8, v9, v1}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_d
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzifu;->zza(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    move-result v4

    .line 559
    if-eqz v4, :cond_e

    .line 560
    .line 561
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzift;->zza()Lcom/google/android/gms/internal/ads/zzift;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzift;->zzc()Lcom/google/android/gms/internal/ads/zzift;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzifu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    invoke-static {v3, v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    move-object v1, v4

    .line 576
    :cond_e
    :goto_d
    check-cast v1, Lcom/google/android/gms/internal/ads/zzift;

    .line 577
    .line 578
    check-cast v2, Lcom/google/android/gms/internal/ads/zzifs;

    .line 579
    .line 580
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzifs;->zze()Lcom/google/android/gms/internal/ads/zzifr;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-interface {p2, v1, v2, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzP(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzifr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 585
    .line 586
    .line 587
    goto/16 :goto_b

    .line 588
    .line 589
    :pswitch_13
    and-int v2, v4, v9

    .line 590
    .line 591
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    int-to-long v8, v2

    .line 596
    invoke-static {v3, v8, v9}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    invoke-interface {p2, v2, v1, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzH(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_b

    .line 604
    .line 605
    :pswitch_14
    and-int v1, v4, v9

    .line 606
    .line 607
    int-to-long v1, v1

    .line 608
    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzO(Ljava/util/List;)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_b

    .line 616
    .line 617
    :pswitch_15
    and-int v1, v4, v9

    .line 618
    .line 619
    int-to-long v1, v1

    .line 620
    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzN(Ljava/util/List;)V

    .line 625
    .line 626
    .line 627
    goto/16 :goto_b

    .line 628
    .line 629
    :pswitch_16
    and-int v1, v4, v9

    .line 630
    .line 631
    int-to-long v1, v1

    .line 632
    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzM(Ljava/util/List;)V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_b

    .line 640
    .line 641
    :pswitch_17
    and-int v1, v4, v9

    .line 642
    .line 643
    int-to-long v1, v1

    .line 644
    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzL(Ljava/util/List;)V
    :try_end_8
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 649
    .line 650
    .line 651
    goto/16 :goto_b

    .line 652
    .line 653
    :pswitch_18
    and-int/2addr v4, v9

    .line 654
    int-to-long v8, v4

    .line 655
    :try_start_9
    invoke-static {v3, v8, v9}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    invoke-interface {p2, v4}, Lcom/google/android/gms/internal/ads/zzigm;->zzK(Ljava/util/List;)V
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 660
    .line 661
    .line 662
    move v8, v1

    .line 663
    move-object v1, v3

    .line 664
    move-object v3, v4

    .line 665
    :try_start_a
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzI(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/ads/zziev;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v5
    :try_end_a
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 673
    move-object v2, v1

    .line 674
    :goto_e
    move-object p1, v2

    .line 675
    goto/16 :goto_0

    .line 676
    .line 677
    :catchall_4
    move-exception v0

    .line 678
    move-object v2, v1

    .line 679
    :goto_f
    move-object p2, v0

    .line 680
    goto/16 :goto_12

    .line 681
    .line 682
    :catch_1
    move-object v2, v1

    .line 683
    goto/16 :goto_11

    .line 684
    .line 685
    :catchall_5
    move-exception v0

    .line 686
    move-object v2, v3

    .line 687
    goto :goto_f

    .line 688
    :pswitch_19
    move-object v2, v3

    .line 689
    and-int v1, v4, v9

    .line 690
    .line 691
    int-to-long v3, v1

    .line 692
    :try_start_b
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzJ(Ljava/util/List;)V

    .line 697
    .line 698
    .line 699
    goto :goto_e

    .line 700
    :catchall_6
    move-exception v0

    .line 701
    goto :goto_f

    .line 702
    :pswitch_1a
    move-object v2, v3

    .line 703
    and-int v1, v4, v9

    .line 704
    .line 705
    int-to-long v3, v1

    .line 706
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzE(Ljava/util/List;)V

    .line 711
    .line 712
    .line 713
    goto :goto_e

    .line 714
    :pswitch_1b
    move-object v2, v3

    .line 715
    and-int v1, v4, v9

    .line 716
    .line 717
    int-to-long v3, v1

    .line 718
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzD(Ljava/util/List;)V

    .line 723
    .line 724
    .line 725
    goto :goto_e

    .line 726
    :pswitch_1c
    move-object v2, v3

    .line 727
    and-int v1, v4, v9

    .line 728
    .line 729
    int-to-long v3, v1

    .line 730
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzC(Ljava/util/List;)V

    .line 735
    .line 736
    .line 737
    goto :goto_e

    .line 738
    :pswitch_1d
    move-object v2, v3

    .line 739
    and-int v1, v4, v9

    .line 740
    .line 741
    int-to-long v3, v1

    .line 742
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzB(Ljava/util/List;)V

    .line 747
    .line 748
    .line 749
    goto :goto_e

    .line 750
    :pswitch_1e
    move-object v2, v3

    .line 751
    and-int v1, v4, v9

    .line 752
    .line 753
    int-to-long v3, v1

    .line 754
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzz(Ljava/util/List;)V

    .line 759
    .line 760
    .line 761
    goto :goto_e

    .line 762
    :pswitch_1f
    move-object v2, v3

    .line 763
    and-int v1, v4, v9

    .line 764
    .line 765
    int-to-long v3, v1

    .line 766
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzA(Ljava/util/List;)V

    .line 771
    .line 772
    .line 773
    goto :goto_e

    .line 774
    :pswitch_20
    move-object v2, v3

    .line 775
    and-int v1, v4, v9

    .line 776
    .line 777
    int-to-long v3, v1

    .line 778
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzy(Ljava/util/List;)V

    .line 783
    .line 784
    .line 785
    goto :goto_e

    .line 786
    :pswitch_21
    move-object v2, v3

    .line 787
    and-int v1, v4, v9

    .line 788
    .line 789
    int-to-long v3, v1

    .line 790
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzx(Ljava/util/List;)V

    .line 795
    .line 796
    .line 797
    goto :goto_e

    .line 798
    :pswitch_22
    move-object v2, v3

    .line 799
    and-int v1, v4, v9

    .line 800
    .line 801
    int-to-long v3, v1

    .line 802
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzO(Ljava/util/List;)V

    .line 807
    .line 808
    .line 809
    goto/16 :goto_e

    .line 810
    .line 811
    :pswitch_23
    move-object v2, v3

    .line 812
    and-int v1, v4, v9

    .line 813
    .line 814
    int-to-long v3, v1

    .line 815
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzN(Ljava/util/List;)V

    .line 820
    .line 821
    .line 822
    goto/16 :goto_e

    .line 823
    .line 824
    :pswitch_24
    move-object v2, v3

    .line 825
    and-int v1, v4, v9

    .line 826
    .line 827
    int-to-long v3, v1

    .line 828
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzM(Ljava/util/List;)V

    .line 833
    .line 834
    .line 835
    goto/16 :goto_e

    .line 836
    .line 837
    :pswitch_25
    move-object v2, v3

    .line 838
    and-int v1, v4, v9

    .line 839
    .line 840
    int-to-long v3, v1

    .line 841
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzL(Ljava/util/List;)V
    :try_end_b
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 846
    .line 847
    .line 848
    goto/16 :goto_e

    .line 849
    .line 850
    :pswitch_26
    move v8, v1

    .line 851
    move-object v1, v3

    .line 852
    and-int v3, v4, v9

    .line 853
    .line 854
    int-to-long v3, v3

    .line 855
    :try_start_c
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/ads/zzigm;->zzK(Ljava/util/List;)V

    .line 860
    .line 861
    .line 862
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    .line 863
    .line 864
    .line 865
    move-result-object v4

    .line 866
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzI(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/ads/zziev;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v5
    :try_end_c
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 870
    move-object v2, v1

    .line 871
    goto/16 :goto_e

    .line 872
    .line 873
    :pswitch_27
    move-object v2, v3

    .line 874
    and-int v1, v4, v9

    .line 875
    .line 876
    int-to-long v3, v1

    .line 877
    :try_start_d
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzJ(Ljava/util/List;)V

    .line 882
    .line 883
    .line 884
    goto/16 :goto_e

    .line 885
    .line 886
    :pswitch_28
    move-object v2, v3

    .line 887
    and-int v1, v4, v9

    .line 888
    .line 889
    int-to-long v3, v1

    .line 890
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzI(Ljava/util/List;)V

    .line 895
    .line 896
    .line 897
    goto/16 :goto_e

    .line 898
    .line 899
    :pswitch_29
    move v8, v1

    .line 900
    move-object v2, v3

    .line 901
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    and-int v3, v4, v9

    .line 906
    .line 907
    int-to-long v3, v3

    .line 908
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    invoke-interface {p2, v3, v1, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzG(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 913
    .line 914
    .line 915
    goto/16 :goto_e

    .line 916
    .line 917
    :pswitch_2a
    move-object v2, v3

    .line 918
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzigc;->zzD(I)Z

    .line 919
    .line 920
    .line 921
    move-result v1

    .line 922
    if-eqz v1, :cond_f

    .line 923
    .line 924
    and-int v1, v4, v9

    .line 925
    .line 926
    int-to-long v3, v1

    .line 927
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    move-object v3, p2

    .line 932
    check-cast v3, Lcom/google/android/gms/internal/ads/zzidq;

    .line 933
    .line 934
    const/4 v4, 0x1

    .line 935
    invoke-virtual {v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzidq;->zzF(Ljava/util/List;Z)V

    .line 936
    .line 937
    .line 938
    goto/16 :goto_e

    .line 939
    .line 940
    :cond_f
    and-int v1, v4, v9

    .line 941
    .line 942
    int-to-long v3, v1

    .line 943
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    move-object v3, p2

    .line 948
    check-cast v3, Lcom/google/android/gms/internal/ads/zzidq;

    .line 949
    .line 950
    invoke-virtual {v3, v1, v7}, Lcom/google/android/gms/internal/ads/zzidq;->zzF(Ljava/util/List;Z)V

    .line 951
    .line 952
    .line 953
    goto/16 :goto_e

    .line 954
    .line 955
    :pswitch_2b
    move-object v2, v3

    .line 956
    and-int v1, v4, v9

    .line 957
    .line 958
    int-to-long v3, v1

    .line 959
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzE(Ljava/util/List;)V

    .line 964
    .line 965
    .line 966
    goto/16 :goto_e

    .line 967
    .line 968
    :pswitch_2c
    move-object v2, v3

    .line 969
    and-int v1, v4, v9

    .line 970
    .line 971
    int-to-long v3, v1

    .line 972
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzD(Ljava/util/List;)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_e

    .line 980
    .line 981
    :pswitch_2d
    move-object v2, v3

    .line 982
    and-int v1, v4, v9

    .line 983
    .line 984
    int-to-long v3, v1

    .line 985
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v1

    .line 989
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzC(Ljava/util/List;)V

    .line 990
    .line 991
    .line 992
    goto/16 :goto_e

    .line 993
    .line 994
    :pswitch_2e
    move-object v2, v3

    .line 995
    and-int v1, v4, v9

    .line 996
    .line 997
    int-to-long v3, v1

    .line 998
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzB(Ljava/util/List;)V

    .line 1003
    .line 1004
    .line 1005
    goto/16 :goto_e

    .line 1006
    .line 1007
    :pswitch_2f
    move-object v2, v3

    .line 1008
    and-int v1, v4, v9

    .line 1009
    .line 1010
    int-to-long v3, v1

    .line 1011
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzz(Ljava/util/List;)V

    .line 1016
    .line 1017
    .line 1018
    goto/16 :goto_e

    .line 1019
    .line 1020
    :pswitch_30
    move-object v2, v3

    .line 1021
    and-int v1, v4, v9

    .line 1022
    .line 1023
    int-to-long v3, v1

    .line 1024
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzA(Ljava/util/List;)V

    .line 1029
    .line 1030
    .line 1031
    goto/16 :goto_e

    .line 1032
    .line 1033
    :pswitch_31
    move-object v2, v3

    .line 1034
    and-int v1, v4, v9

    .line 1035
    .line 1036
    int-to-long v3, v1

    .line 1037
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzy(Ljava/util/List;)V

    .line 1042
    .line 1043
    .line 1044
    goto/16 :goto_e

    .line 1045
    .line 1046
    :pswitch_32
    move-object v2, v3

    .line 1047
    and-int v1, v4, v9

    .line 1048
    .line 1049
    int-to-long v3, v1

    .line 1050
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzifl;->zza(Ljava/lang/Object;J)Ljava/util/List;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/ads/zzigm;->zzx(Ljava/util/List;)V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_e

    .line 1058
    .line 1059
    :pswitch_33
    move v8, v1

    .line 1060
    move-object v2, v3

    .line 1061
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzt(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    check-cast v1, Lcom/google/android/gms/internal/ads/zzifz;

    .line 1066
    .line 1067
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v3

    .line 1071
    invoke-interface {p2, v1, v3, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzp(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-direct {p0, v2, v8, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzu(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    goto/16 :goto_e

    .line 1078
    .line 1079
    :pswitch_34
    move v8, v1

    .line 1080
    move-object v2, v3

    .line 1081
    and-int v1, v4, v9

    .line 1082
    .line 1083
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzw()J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v3

    .line 1087
    int-to-long v9, v1

    .line 1088
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 1089
    .line 1090
    .line 1091
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1092
    .line 1093
    .line 1094
    goto/16 :goto_e

    .line 1095
    .line 1096
    :pswitch_35
    move v8, v1

    .line 1097
    move-object v2, v3

    .line 1098
    and-int v1, v4, v9

    .line 1099
    .line 1100
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzv()I

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    int-to-long v9, v1

    .line 1105
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1106
    .line 1107
    .line 1108
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1109
    .line 1110
    .line 1111
    goto/16 :goto_e

    .line 1112
    .line 1113
    :pswitch_36
    move v8, v1

    .line 1114
    move-object v2, v3

    .line 1115
    and-int v1, v4, v9

    .line 1116
    .line 1117
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzu()J

    .line 1118
    .line 1119
    .line 1120
    move-result-wide v3

    .line 1121
    int-to-long v9, v1

    .line 1122
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 1123
    .line 1124
    .line 1125
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1126
    .line 1127
    .line 1128
    goto/16 :goto_e

    .line 1129
    .line 1130
    :pswitch_37
    move v8, v1

    .line 1131
    move-object v2, v3

    .line 1132
    and-int v1, v4, v9

    .line 1133
    .line 1134
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzt()I

    .line 1135
    .line 1136
    .line 1137
    move-result v3

    .line 1138
    int-to-long v9, v1

    .line 1139
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1140
    .line 1141
    .line 1142
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1143
    .line 1144
    .line 1145
    goto/16 :goto_e

    .line 1146
    .line 1147
    :pswitch_38
    move v8, v1

    .line 1148
    move v1, v2

    .line 1149
    move-object v2, v3

    .line 1150
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzs()I

    .line 1151
    .line 1152
    .line 1153
    move-result v3

    .line 1154
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v10

    .line 1158
    if-eqz v10, :cond_11

    .line 1159
    .line 1160
    invoke-interface {v10, v3}, Lcom/google/android/gms/internal/ads/zziev;->zza(I)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v10

    .line 1164
    if-eqz v10, :cond_10

    .line 1165
    .line 1166
    goto :goto_10

    .line 1167
    :cond_10
    invoke-static {v2, v1, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzJ(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v5

    .line 1171
    goto/16 :goto_e

    .line 1172
    .line 1173
    :cond_11
    :goto_10
    and-int v1, v4, v9

    .line 1174
    .line 1175
    int-to-long v9, v1

    .line 1176
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1177
    .line 1178
    .line 1179
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1180
    .line 1181
    .line 1182
    goto/16 :goto_e

    .line 1183
    .line 1184
    :pswitch_39
    move v8, v1

    .line 1185
    move-object v2, v3

    .line 1186
    and-int v1, v4, v9

    .line 1187
    .line 1188
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzr()I

    .line 1189
    .line 1190
    .line 1191
    move-result v3

    .line 1192
    int-to-long v9, v1

    .line 1193
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1194
    .line 1195
    .line 1196
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1197
    .line 1198
    .line 1199
    goto/16 :goto_e

    .line 1200
    .line 1201
    :pswitch_3a
    move v8, v1

    .line 1202
    move-object v2, v3

    .line 1203
    and-int v1, v4, v9

    .line 1204
    .line 1205
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzq()Lcom/google/android/gms/internal/ads/zzidl;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v3

    .line 1209
    int-to-long v9, v1

    .line 1210
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzn(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1214
    .line 1215
    .line 1216
    goto/16 :goto_e

    .line 1217
    .line 1218
    :pswitch_3b
    move v8, v1

    .line 1219
    move-object v2, v3

    .line 1220
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzt(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v1

    .line 1224
    check-cast v1, Lcom/google/android/gms/internal/ads/zzifz;

    .line 1225
    .line 1226
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v3

    .line 1230
    invoke-interface {p2, v1, v3, p3}, Lcom/google/android/gms/internal/ads/zzigm;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;Lcom/google/android/gms/internal/ads/zzidz;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-direct {p0, v2, v8, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzu(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    goto/16 :goto_e

    .line 1237
    .line 1238
    :pswitch_3c
    move v8, v1

    .line 1239
    move-object v2, v3

    .line 1240
    invoke-direct {p0, v2, v4, p2}, Lcom/google/android/gms/internal/ads/zzigc;->zzz(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigm;)V

    .line 1241
    .line 1242
    .line 1243
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1244
    .line 1245
    .line 1246
    goto/16 :goto_e

    .line 1247
    .line 1248
    :pswitch_3d
    move v8, v1

    .line 1249
    move-object v2, v3

    .line 1250
    and-int v1, v4, v9

    .line 1251
    .line 1252
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzl()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v3

    .line 1256
    int-to-long v9, v1

    .line 1257
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzh(Ljava/lang/Object;JZ)V

    .line 1258
    .line 1259
    .line 1260
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1261
    .line 1262
    .line 1263
    goto/16 :goto_e

    .line 1264
    .line 1265
    :pswitch_3e
    move v8, v1

    .line 1266
    move-object v2, v3

    .line 1267
    and-int v1, v4, v9

    .line 1268
    .line 1269
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzk()I

    .line 1270
    .line 1271
    .line 1272
    move-result v3

    .line 1273
    int-to-long v9, v1

    .line 1274
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1275
    .line 1276
    .line 1277
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1278
    .line 1279
    .line 1280
    goto/16 :goto_e

    .line 1281
    .line 1282
    :pswitch_3f
    move v8, v1

    .line 1283
    move-object v2, v3

    .line 1284
    and-int v1, v4, v9

    .line 1285
    .line 1286
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzj()J

    .line 1287
    .line 1288
    .line 1289
    move-result-wide v3

    .line 1290
    int-to-long v9, v1

    .line 1291
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 1292
    .line 1293
    .line 1294
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1295
    .line 1296
    .line 1297
    goto/16 :goto_e

    .line 1298
    .line 1299
    :pswitch_40
    move v8, v1

    .line 1300
    move-object v2, v3

    .line 1301
    and-int v1, v4, v9

    .line 1302
    .line 1303
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzi()I

    .line 1304
    .line 1305
    .line 1306
    move-result v3

    .line 1307
    int-to-long v9, v1

    .line 1308
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzd(Ljava/lang/Object;JI)V

    .line 1309
    .line 1310
    .line 1311
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1312
    .line 1313
    .line 1314
    goto/16 :goto_e

    .line 1315
    .line 1316
    :pswitch_41
    move v8, v1

    .line 1317
    move-object v2, v3

    .line 1318
    and-int v1, v4, v9

    .line 1319
    .line 1320
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzg()J

    .line 1321
    .line 1322
    .line 1323
    move-result-wide v3

    .line 1324
    int-to-long v9, v1

    .line 1325
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 1326
    .line 1327
    .line 1328
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1329
    .line 1330
    .line 1331
    goto/16 :goto_e

    .line 1332
    .line 1333
    :pswitch_42
    move v8, v1

    .line 1334
    move-object v2, v3

    .line 1335
    and-int v1, v4, v9

    .line 1336
    .line 1337
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzh()J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v3

    .line 1341
    int-to-long v9, v1

    .line 1342
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzf(Ljava/lang/Object;JJ)V

    .line 1343
    .line 1344
    .line 1345
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1346
    .line 1347
    .line 1348
    goto/16 :goto_e

    .line 1349
    .line 1350
    :pswitch_43
    move v8, v1

    .line 1351
    move-object v2, v3

    .line 1352
    and-int v1, v4, v9

    .line 1353
    .line 1354
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zzf()F

    .line 1355
    .line 1356
    .line 1357
    move-result v3

    .line 1358
    int-to-long v9, v1

    .line 1359
    invoke-static {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzihk;->zzj(Ljava/lang/Object;JF)V

    .line 1360
    .line 1361
    .line 1362
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V

    .line 1363
    .line 1364
    .line 1365
    goto/16 :goto_e

    .line 1366
    .line 1367
    :pswitch_44
    move v8, v1

    .line 1368
    move-object v2, v3

    .line 1369
    and-int v1, v4, v9

    .line 1370
    .line 1371
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzigm;->zze()D

    .line 1372
    .line 1373
    .line 1374
    move-result-wide v3

    .line 1375
    int-to-long v9, v1

    .line 1376
    invoke-static {v2, v9, v10, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzl(Ljava/lang/Object;JD)V

    .line 1377
    .line 1378
    .line 1379
    invoke-direct {p0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzL(Ljava/lang/Object;I)V
    :try_end_d
    .catch Lcom/google/android/gms/internal/ads/zzifg; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1380
    .line 1381
    .line 1382
    goto/16 :goto_e

    .line 1383
    .line 1384
    :catch_2
    :goto_11
    if-nez v5, :cond_12

    .line 1385
    .line 1386
    :try_start_e
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzihd;->zzh(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 1390
    move-object v5, v1

    .line 1391
    goto :goto_13

    .line 1392
    :catchall_7
    move-exception v0

    .line 1393
    goto/16 :goto_f

    .line 1394
    .line 1395
    :goto_12
    move-object v1, p1

    .line 1396
    goto :goto_17

    .line 1397
    :cond_12
    :goto_13
    :try_start_f
    invoke-virtual {v6, v5, p2, v7}, Lcom/google/android/gms/internal/ads/zzihd;->zzk(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigm;I)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 1401
    if-nez v1, :cond_15

    .line 1402
    .line 1403
    iget p2, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 1404
    .line 1405
    move-object v4, v5

    .line 1406
    :goto_14
    iget p3, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 1407
    .line 1408
    if-ge p2, p3, :cond_13

    .line 1409
    .line 1410
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 1411
    .line 1412
    aget v3, p3, p2

    .line 1413
    .line 1414
    move-object v5, v6

    .line 1415
    move-object v6, v2

    .line 1416
    move-object v1, p1

    .line 1417
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v4

    .line 1421
    move-object v6, v5

    .line 1422
    add-int/lit8 p2, p2, 0x1

    .line 1423
    .line 1424
    goto :goto_14

    .line 1425
    :cond_13
    move-object v1, p1

    .line 1426
    :goto_15
    if-eqz v4, :cond_14

    .line 1427
    .line 1428
    invoke-virtual {v6, v2, v4}, Lcom/google/android/gms/internal/ads/zzihd;->zzi(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1429
    .line 1430
    .line 1431
    :cond_14
    return-void

    .line 1432
    :cond_15
    move-object v1, p1

    .line 1433
    goto/16 :goto_e

    .line 1434
    .line 1435
    :catchall_8
    move-exception v0

    .line 1436
    move-object v1, p1

    .line 1437
    :goto_16
    move-object p2, v0

    .line 1438
    goto :goto_17

    .line 1439
    :catchall_9
    move-exception v0

    .line 1440
    move-object v1, p1

    .line 1441
    move-object v2, v3

    .line 1442
    goto :goto_16

    .line 1443
    :catchall_a
    move-exception v0

    .line 1444
    move-object v1, p0

    .line 1445
    move-object v2, p1

    .line 1446
    goto :goto_16

    .line 1447
    :goto_17
    iget p1, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 1448
    .line 1449
    move-object v4, v5

    .line 1450
    :goto_18
    iget p3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    .line 1451
    .line 1452
    if-ge p1, p3, :cond_16

    .line 1453
    .line 1454
    iget-object p3, v1, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 1455
    .line 1456
    aget v3, p3, p1

    .line 1457
    .line 1458
    move-object v5, v6

    .line 1459
    move-object v6, v2

    .line 1460
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v4

    .line 1464
    add-int/lit8 p1, p1, 0x1

    .line 1465
    .line 1466
    move-object v1, p0

    .line 1467
    move-object v6, v5

    .line 1468
    goto :goto_18

    .line 1469
    :cond_16
    move-object v5, v6

    .line 1470
    if-eqz v4, :cond_17

    .line 1471
    .line 1472
    invoke-virtual {v5, v2, v4}, Lcom/google/android/gms/internal/ads/zzihd;->zzi(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_17
    throw p2

    .line 1476
    nop

    .line 1477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzi(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/ads/zzicz;)I
    .locals 33
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    .line 1
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzF(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    const/4 v15, -0x1

    move/from16 v7, p3

    move v8, v15

    const/4 v9, 0x0

    const/4 v13, 0x0

    const v14, 0xfffff

    const/16 v16, 0x1

    const/16 v17, 0x0

    :goto_0
    const/16 v18, 0x0

    const/16 v19, 0x2

    const-string v11, "Failed to parse the message."

    if-ge v7, v4, :cond_7c

    const/16 v20, 0x3

    add-int/lit8 v12, v7, 0x1

    .line 2
    aget-byte v7, v3, v7

    if-gez v7, :cond_0

    .line 3
    invoke-static {v7, v3, v12, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzb(I[BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v12

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    :cond_0
    move/from16 v17, v7

    ushr-int/lit8 v7, v17, 0x3

    if-le v7, v8, :cond_2

    div-int/lit8 v9, v9, 0x3

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzigc;->zze:I

    if-lt v7, v8, :cond_1

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzf:I

    if-gt v7, v8, :cond_1

    .line 4
    invoke-direct {v0, v7, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzQ(II)I

    move-result v8

    goto :goto_1

    :cond_1
    move v8, v15

    goto :goto_1

    .line 5
    :cond_2
    invoke-direct {v0, v7}, Lcom/google/android/gms/internal/ads/zzigc;->zzP(I)I

    move-result v8

    :goto_1
    if-ne v8, v15, :cond_3

    move/from16 v10, p5

    move-object v8, v1

    move-object v1, v6

    move-object/from16 v21, v11

    move v4, v12

    move/from16 v12, v17

    const p3, 0xfffff

    const/4 v9, 0x0

    move v11, v7

    move-object v7, v2

    goto/16 :goto_50

    :cond_3
    and-int/lit8 v9, v17, 0x7

    .line 6
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    add-int/lit8 v21, v8, 0x1

    const v22, 0xfffff

    .line 7
    aget v5, v15, v21

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    move-result v3

    and-int v4, v5, v22

    move/from16 p3, v7

    int-to-long v6, v4

    const-wide/16 v23, 0x0

    const-string v4, ""

    move-wide/from16 v26, v6

    const-string v6, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    const/16 v7, 0x11

    if-gt v3, v7, :cond_15

    add-int/lit8 v7, v8, 0x2

    .line 8
    aget v7, v15, v7

    ushr-int/lit8 v15, v7, 0x14

    shl-int v15, v16, v15

    and-int v7, v7, v22

    move/from16 v21, v12

    move/from16 v12, v22

    move/from16 v22, v15

    if-eq v7, v14, :cond_6

    if-eq v14, v12, :cond_4

    int-to-long v14, v14

    .line 9
    invoke-virtual {v1, v2, v14, v15, v13}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_4
    if-ne v7, v12, :cond_5

    const/4 v13, 0x0

    goto :goto_2

    :cond_5
    int-to-long v13, v7

    .line 10
    invoke-virtual {v1, v2, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v13

    :goto_2
    move v14, v7

    :cond_6
    packed-switch v3, :pswitch_data_0

    move/from16 v3, v20

    if-ne v9, v3, :cond_7

    or-int v13, v13, v22

    move/from16 v20, v3

    .line 11
    invoke-direct {v0, v2, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzt(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    shl-int/lit8 v4, p3, 0x3

    or-int/lit8 v4, v4, 0x4

    move v5, v4

    .line 12
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v4

    move/from16 v7, p4

    move-object/from16 v9, p6

    move v15, v8

    move/from16 v22, v12

    move/from16 v6, v21

    move/from16 v12, p3

    move v8, v5

    move-object/from16 v5, p2

    .line 13
    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzida;->zzk(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;[BIIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    move-object v7, v5

    move-object v8, v9

    .line 14
    invoke-direct {v0, v2, v15, v3}, Lcom/google/android/gms/internal/ads/zzigc;->zzu(Ljava/lang/Object;ILjava/lang/Object;)V

    move-object v3, v7

    move-object v6, v8

    move v8, v12

    move v9, v15

    const/4 v15, -0x1

    :goto_3
    move v7, v4

    :goto_4
    move/from16 v4, p4

    goto/16 :goto_0

    :cond_7
    move v15, v8

    move v3, v12

    move-object/from16 v7, p2

    move-object/from16 v12, p6

    move-object v4, v1

    move-object v1, v2

    move/from16 v25, v13

    move/from16 v26, v14

    move/from16 v2, v21

    move/from16 v21, v17

    move/from16 v17, p3

    move/from16 p3, v3

    goto/16 :goto_12

    :pswitch_0
    move-object/from16 v7, p2

    move v15, v8

    move v3, v12

    move/from16 v4, v21

    move/from16 v12, p3

    move-object/from16 v8, p6

    if-nez v9, :cond_8

    or-int v13, v13, v22

    .line 15
    invoke-static {v7, v4, v8}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget-wide v4, v8, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 16
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    move-result-wide v5

    move/from16 v22, v3

    move-wide/from16 v3, v26

    .line 17
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v31, v2

    move-object v2, v1

    move-object/from16 v1, v31

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v4, p4

    :goto_5
    move-object v3, v7

    move-object v6, v8

    move v7, v9

    move v8, v12

    :goto_6
    move v9, v15

    :goto_7
    const/4 v15, -0x1

    goto/16 :goto_0

    :cond_8
    move-object/from16 v31, v2

    move-object v2, v1

    move-object/from16 v1, v31

    move/from16 p3, v4

    move-object v4, v2

    move/from16 v2, p3

    move/from16 p3, v3

    move/from16 v25, v13

    move/from16 v26, v14

    move/from16 v21, v17

    move/from16 v17, v12

    :goto_8
    move-object v12, v8

    goto/16 :goto_12

    :pswitch_1
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v7, p2

    move v15, v8

    move v3, v12

    move/from16 v6, v17

    move/from16 v4, v21

    move-wide/from16 v28, v26

    move/from16 v12, p3

    move-object/from16 v8, p6

    if-nez v9, :cond_9

    or-int v13, v13, v22

    .line 18
    invoke-static {v7, v4, v8}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v5, v8, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 19
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    move-result v5

    move v9, v4

    move-wide/from16 v3, v28

    .line 20
    invoke-virtual {v2, v1, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v4, p4

    move/from16 v17, v6

    goto :goto_5

    :cond_9
    move/from16 p3, v4

    move-object v4, v2

    move/from16 v2, p3

    move/from16 p3, v3

    move/from16 v21, v6

    move/from16 v17, v12

    move/from16 v25, v13

    move/from16 v26, v14

    goto :goto_8

    :pswitch_2
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v7, p2

    move v15, v8

    move/from16 v6, v17

    move/from16 v12, v21

    move-wide/from16 v3, v26

    move/from16 v17, p3

    move-object/from16 v8, p6

    if-nez v9, :cond_c

    .line 21
    invoke-static {v7, v12, v8}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v11, v8, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 22
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    move-result-object v12

    const/high16 v18, -0x80000000

    and-int v5, v5, v18

    if-eqz v5, :cond_b

    if-eqz v12, :cond_b

    .line 23
    invoke-interface {v12, v11}, Lcom/google/android/gms/internal/ads/zziev;->zza(I)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_a

    .line 24
    :cond_a
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzihe;

    move-result-object v3

    int-to-long v4, v11

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lcom/google/android/gms/internal/ads/zzihe;->zzk(ILjava/lang/Object;)V

    :goto_9
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v3, v17

    move/from16 v17, v6

    move-object v6, v8

    move v8, v3

    move/from16 v4, p4

    move-object v3, v7

    move v7, v9

    goto/16 :goto_6

    :cond_b
    :goto_a
    or-int v13, v13, v22

    .line 25
    invoke-virtual {v2, v1, v3, v4, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_9

    :cond_c
    move-object v4, v2

    move/from16 v21, v6

    move v2, v12

    move/from16 v25, v13

    move/from16 v26, v14

    const p3, 0xfffff

    goto/16 :goto_8

    :pswitch_3
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v7, p2

    move v15, v8

    move/from16 v6, v17

    move/from16 v5, v19

    move/from16 v12, v21

    move-wide/from16 v3, v26

    move/from16 v17, p3

    move-object/from16 v8, p6

    if-ne v9, v5, :cond_c

    or-int v13, v13, v22

    .line 26
    invoke-static {v7, v12, v8}, Lcom/google/android/gms/internal/ads/zzida;->zzg([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget-object v11, v8, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 27
    invoke-virtual {v2, v1, v3, v4, v11}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_4
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move-object/from16 v7, p2

    move v15, v8

    move/from16 v6, v17

    move/from16 v5, v19

    move/from16 v12, v21

    move/from16 v17, p3

    move-object/from16 v8, p6

    if-ne v9, v5, :cond_d

    or-int v13, v13, v22

    move-object v3, v1

    .line 28
    invoke-direct {v0, v3, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzt(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v2

    .line 29
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v2

    move-object/from16 v19, v7

    move-object v7, v3

    move-object/from16 v3, v19

    move/from16 v19, v5

    move/from16 v21, v6

    move-object v6, v8

    move/from16 v5, p4

    move-object v8, v4

    move v4, v12

    const v12, 0xfffff

    .line 30
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzj(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;[BIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    move-object/from16 v31, v3

    move-object v3, v1

    move-object/from16 v1, v31

    .line 31
    invoke-direct {v0, v7, v15, v3}, Lcom/google/android/gms/internal/ads/zzigc;->zzu(Ljava/lang/Object;ILjava/lang/Object;)V

    move-object v3, v7

    move v7, v2

    move-object v2, v3

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v3, v1

    move-object v1, v8

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    goto/16 :goto_7

    :cond_d
    move-object v8, v7

    move-object v7, v1

    move-object v1, v8

    move-object v8, v2

    move/from16 v21, v6

    move v2, v12

    move-object/from16 p3, v7

    move-object v7, v1

    move-object/from16 v1, p3

    move-object/from16 v12, p6

    move-object v4, v8

    move/from16 v25, v13

    move/from16 v26, v14

    const p3, 0xfffff

    goto/16 :goto_12

    :pswitch_5
    move-object v7, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-object v8, v1

    move-object v13, v4

    move/from16 v21, v17

    move-wide/from16 v3, v26

    move-object/from16 v1, p2

    move/from16 v17, p3

    move/from16 p3, v12

    move/from16 v26, v14

    move/from16 v14, v19

    move-object/from16 v12, p6

    if-ne v9, v14, :cond_11

    or-int v9, v25, v22

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzD(I)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 32
    invoke-static {v1, v2, v12}, Lcom/google/android/gms/internal/ads/zzida;->zzf([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    goto :goto_b

    .line 33
    :cond_e
    invoke-static {v1, v2, v12}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    iget v5, v12, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v5, :cond_10

    if-nez v5, :cond_f

    .line 34
    iput-object v13, v12, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    goto :goto_b

    :cond_f
    new-instance v6, Ljava/lang/String;

    .line 35
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v6, v1, v2, v5, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v6, v12, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    add-int/2addr v2, v5

    .line 36
    :goto_b
    iget-object v5, v12, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 37
    invoke-virtual {v8, v7, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v3, v7

    move v7, v2

    move-object v2, v3

    move/from16 v4, p4

    move-object v3, v1

    move-object v1, v8

    move v13, v9

    :goto_c
    move-object v6, v12

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    move/from16 v14, v26

    goto/16 :goto_7

    .line 38
    :cond_10
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 39
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 40
    throw v1

    :cond_11
    move-object v4, v7

    move-object v7, v1

    move-object v1, v4

    :goto_d
    move-object v4, v8

    goto/16 :goto_12

    :pswitch_6
    move-object v7, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-wide/from16 v3, v26

    move-object v8, v1

    move/from16 v26, v14

    move/from16 v21, v17

    move-object/from16 v1, p2

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-nez v9, :cond_11

    or-int v13, v25, v22

    .line 41
    invoke-static {v1, v2, v12}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    iget-wide v5, v12, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    cmp-long v5, v5, v23

    if-eqz v5, :cond_12

    move/from16 v5, v16

    goto :goto_e

    :cond_12
    const/4 v5, 0x0

    .line 42
    :goto_e
    invoke-static {v7, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzihk;->zzh(Ljava/lang/Object;JZ)V

    move-object v3, v7

    move v7, v2

    move-object v2, v3

    move/from16 v4, p4

    move-object v3, v1

    move-object v1, v8

    goto :goto_c

    :pswitch_7
    move-object v7, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-wide/from16 v3, v26

    const/4 v5, 0x5

    move-object v8, v1

    move/from16 v26, v14

    move/from16 v21, v17

    move-object/from16 v1, p2

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-ne v9, v5, :cond_11

    add-int/lit8 v5, v2, 0x4

    or-int v13, v25, v22

    .line 43
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v2

    invoke-virtual {v8, v7, v3, v4, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move/from16 v4, p4

    move-object v3, v1

    move-object v2, v7

    move-object v1, v8

    move-object v6, v12

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    move/from16 v14, v26

    const/4 v15, -0x1

    move v7, v5

    goto/16 :goto_0

    :pswitch_8
    move-object v7, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v5, v16

    move/from16 v2, v21

    move-wide/from16 v3, v26

    move-object v8, v1

    move/from16 v26, v14

    move/from16 v21, v17

    move-object/from16 v1, p2

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-ne v9, v5, :cond_13

    add-int/lit8 v9, v2, 0x8

    or-int v13, v25, v22

    .line 44
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v5

    move-object v2, v7

    move-object v7, v1

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move v7, v9

    :goto_f
    move-object v6, v12

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    move/from16 v14, v26

    :goto_10
    const/4 v15, -0x1

    const/16 v16, 0x1

    goto/16 :goto_0

    :cond_13
    move-object/from16 v31, v7

    move-object v7, v1

    move-object/from16 v1, v31

    goto/16 :goto_d

    :pswitch_9
    move-object/from16 v7, p2

    move-object v4, v1

    move-object v1, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-wide/from16 v5, v26

    move/from16 v26, v14

    move/from16 v21, v17

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-nez v9, :cond_14

    or-int v13, v25, v22

    .line 45
    invoke-static {v7, v2, v12}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    iget v3, v12, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 46
    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v3, v7

    move-object v6, v12

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    move/from16 v14, v26

    const/4 v15, -0x1

    const/16 v16, 0x1

    move v7, v2

    move-object v2, v1

    move-object v1, v4

    goto/16 :goto_4

    :pswitch_a
    move-object/from16 v7, p2

    move-object v4, v1

    move-object v1, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-wide/from16 v5, v26

    move/from16 v26, v14

    move/from16 v21, v17

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-nez v9, :cond_14

    or-int v13, v25, v22

    .line 47
    invoke-static {v7, v2, v12}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v8

    move-wide/from16 v28, v5

    iget-wide v5, v12, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    move-object v2, v1

    move-object v1, v4

    move-wide/from16 v3, v28

    .line 48
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move v7, v8

    goto :goto_f

    :pswitch_b
    move-object/from16 v7, p2

    move-object v4, v1

    move-object v1, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v2, v21

    move-wide/from16 v5, v26

    const/4 v3, 0x5

    move/from16 v26, v14

    move/from16 v21, v17

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-ne v9, v3, :cond_14

    add-int/lit8 v3, v2, 0x4

    or-int v13, v25, v22

    .line 49
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 50
    invoke-static {v1, v5, v6, v2}, Lcom/google/android/gms/internal/ads/zzihk;->zzj(Ljava/lang/Object;JF)V

    :goto_11
    move-object v2, v7

    move v7, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v4

    move-object v6, v12

    move v9, v15

    move/from16 v8, v17

    move/from16 v17, v21

    move/from16 v14, v26

    const/4 v15, -0x1

    const/16 v16, 0x1

    goto/16 :goto_4

    :pswitch_c
    move-object/from16 v7, p2

    move-object v4, v1

    move-object v1, v2

    move v15, v8

    move/from16 v25, v13

    move/from16 v3, v16

    move/from16 v2, v21

    move-wide/from16 v5, v26

    move/from16 v26, v14

    move/from16 v21, v17

    move/from16 v17, p3

    move/from16 p3, v12

    move-object/from16 v12, p6

    if-ne v9, v3, :cond_14

    add-int/lit8 v3, v2, 0x8

    or-int v13, v25, v22

    .line 51
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    .line 52
    invoke-static {v1, v5, v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzihk;->zzl(Ljava/lang/Object;JD)V

    goto :goto_11

    :cond_14
    :goto_12
    move/from16 v10, p5

    move-object v8, v4

    move-object v3, v7

    move v9, v15

    move/from16 v13, v25

    move/from16 v14, v26

    const/16 v20, 0x3

    move-object v7, v1

    move v4, v2

    move-object v1, v12

    move/from16 v12, v21

    move-object/from16 v21, v11

    move/from16 v11, v17

    goto/16 :goto_50

    :cond_15
    move-object/from16 v7, p2

    move/from16 v28, v12

    move/from16 v21, v17

    move/from16 v17, p3

    move-object/from16 v12, p6

    move/from16 p3, v22

    move/from16 v22, v13

    move-object v13, v4

    move-object v4, v1

    move-object v1, v2

    move-wide/from16 v31, v26

    move/from16 v27, v14

    move-object/from16 v26, v15

    move-wide/from16 v14, v31

    const/16 v2, 0x1b

    if-ne v3, v2, :cond_19

    const/4 v2, 0x2

    if-ne v9, v2, :cond_18

    .line 53
    invoke-virtual {v4, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzifb;

    .line 54
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzifb;->zza()Z

    move-result v3

    if-nez v3, :cond_17

    .line 55
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_16

    const/16 v3, 0xa

    goto :goto_13

    :cond_16
    add-int/2addr v3, v3

    .line 56
    :goto_13
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzifb;->zzh(I)Lcom/google/android/gms/internal/ads/zzifb;

    move-result-object v2

    .line 57
    invoke-virtual {v4, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_17
    move-object v6, v2

    .line 58
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v1

    move/from16 v5, p4

    move-object v9, v4

    move-object v3, v7

    move-object v7, v12

    move/from16 v2, v21

    move/from16 v4, v28

    move-object/from16 v12, p1

    .line 59
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzida;->zzn(Lcom/google/android/gms/internal/ads/zzigr;I[BIILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move v7, v2

    move v7, v1

    move-object v1, v9

    move v9, v8

    move/from16 v8, v17

    move/from16 v17, v2

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v2, v12

    move/from16 v13, v22

    move/from16 v14, v27

    goto/16 :goto_10

    :cond_18
    move-object v12, v1

    move-object v9, v4

    move-object/from16 v3, p2

    move/from16 v6, p4

    move-object/from16 v4, p6

    move-object v10, v11

    move/from16 v29, v17

    move/from16 v12, v21

    move/from16 v7, v28

    move v11, v8

    move-object v8, v9

    goto/16 :goto_43

    :cond_19
    move-object v12, v1

    move-object v1, v4

    move/from16 v7, v21

    move/from16 v4, v28

    const/16 v2, 0x31

    move/from16 v21, v4

    const-string v4, "Protocol message had invalid UTF-8."

    const-string v10, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    if-gt v3, v2, :cond_60

    move/from16 v28, v3

    int-to-long v2, v5

    .line 60
    invoke-virtual {v1, v12, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzifb;

    .line 61
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzifb;->zza()Z

    move-result v26

    if-nez v26, :cond_1a

    .line 62
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v26

    move-wide/from16 v29, v2

    add-int v2, v26, v26

    .line 63
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzifb;->zzh(I)Lcom/google/android/gms/internal/ads/zzifb;

    move-result-object v5

    .line 64
    invoke-virtual {v1, v12, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_14
    move-object v14, v5

    goto :goto_15

    :cond_1a
    move-wide/from16 v29, v2

    goto :goto_14

    :goto_15
    packed-switch v28, :pswitch_data_1

    const/4 v3, 0x3

    if-ne v9, v3, :cond_1c

    and-int/lit8 v2, v7, -0x8

    or-int/lit8 v5, v2, 0x4

    move-object v4, v1

    .line 65
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v1

    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move-object v15, v4

    move/from16 v3, v21

    move/from16 v4, p4

    .line 66
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzi(Lcom/google/android/gms/internal/ads/zzigr;[BIIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    move v13, v3

    iget-object v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 67
    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_16
    if-ge v9, v4, :cond_1b

    .line 68
    invoke-static {v2, v9, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    iget v10, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v7, v10, :cond_1b

    .line 69
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzi(Lcom/google/android/gms/internal/ads/zzigr;[BIIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget-object v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 70
    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1b
    move v3, v4

    move v12, v7

    move v4, v9

    move-object/from16 v21, v11

    move v7, v13

    :goto_17
    move/from16 v29, v17

    move v11, v8

    :goto_18
    move-object/from16 v17, v15

    goto/16 :goto_3d

    :cond_1c
    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v6, p6

    move v12, v7

    move/from16 v29, v17

    move/from16 v7, v21

    move-object/from16 v17, v1

    move-object/from16 v21, v11

    :cond_1d
    :goto_19
    move v11, v8

    goto/16 :goto_3c

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v15, v1

    move/from16 v13, v21

    const/4 v5, 0x2

    if-ne v9, v5, :cond_21

    .line 71
    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 72
    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int/2addr v3, v1

    :goto_1a
    if-ge v1, v3, :cond_1e

    .line 73
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move-object/from16 v21, v11

    iget-wide v11, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 74
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    move-result-wide v11

    invoke-virtual {v14, v11, v12}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    move-object/from16 v12, p1

    move-object/from16 v11, v21

    goto :goto_1a

    :cond_1e
    move-object/from16 v21, v11

    if-ne v1, v3, :cond_20

    :cond_1f
    :goto_1b
    move v3, v4

    move v12, v7

    move v11, v8

    move v7, v13

    move/from16 v29, v17

    move v4, v1

    goto :goto_18

    .line 75
    :cond_20
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 76
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 77
    throw v1

    :cond_21
    move-object/from16 v21, v11

    if-nez v9, :cond_22

    .line 78
    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 79
    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget-wide v9, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 80
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    move-result-wide v9

    invoke-virtual {v14, v9, v10}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    :goto_1c
    if-ge v1, v4, :cond_1f

    .line 81
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    iget v5, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v7, v5, :cond_1f

    .line 82
    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget-wide v9, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    move-result-wide v9

    .line 83
    invoke-virtual {v14, v9, v10}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    goto :goto_1c

    :cond_22
    move v3, v4

    move v12, v7

    move v11, v8

    move v7, v13

    :goto_1d
    move/from16 v29, v17

    :goto_1e
    move-object/from16 v17, v15

    goto/16 :goto_3c

    :pswitch_e
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v15, v1

    move/from16 v13, v21

    const/4 v5, 0x2

    move-object/from16 v21, v11

    if-ne v9, v5, :cond_25

    .line 84
    check-cast v14, Lcom/google/android/gms/internal/ads/zzieq;

    .line 85
    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int/2addr v3, v1

    :goto_1f
    if-ge v1, v3, :cond_23

    .line 86
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v5, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 87
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    move-result v5

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    goto :goto_1f

    :cond_23
    if-ne v1, v3, :cond_24

    goto :goto_1b

    .line 88
    :cond_24
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 89
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 90
    throw v1

    :cond_25
    if-nez v9, :cond_22

    .line 91
    check-cast v14, Lcom/google/android/gms/internal/ads/zzieq;

    .line 92
    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 93
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    move-result v3

    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    :goto_20
    if-ge v1, v4, :cond_1f

    .line 94
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    iget v5, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v7, v5, :cond_1f

    .line 95
    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v3, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    move-result v3

    .line 96
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    goto :goto_20

    :pswitch_f
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v15, v1

    move/from16 v13, v21

    const/4 v5, 0x2

    move-object/from16 v21, v11

    if-ne v9, v5, :cond_26

    .line 97
    invoke-static {v2, v13, v14, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzm([BILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move-object v5, v14

    move v14, v13

    move v13, v7

    move v9, v1

    move-object v11, v2

    move v12, v4

    move-object v7, v6

    goto :goto_21

    :cond_26
    if-nez v9, :cond_27

    move v1, v7

    move v3, v13

    move-object v5, v14

    .line 98
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzl(I[BIILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v7

    move v13, v1

    move v14, v3

    move v1, v7

    move-object v11, v2

    move v12, v4

    move-object v7, v6

    move v9, v1

    .line 99
    :goto_21
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    move-result-object v4

    move-object v3, v5

    const/4 v5, 0x0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    move-object/from16 v1, p1

    move/from16 v2, v17

    .line 100
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigs;->zzI(Ljava/lang/Object;ILjava/util/List;Lcom/google/android/gms/internal/ads/zziev;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;)Ljava/lang/Object;

    move/from16 v29, v2

    move-object v6, v7

    move v4, v9

    move-object v2, v11

    move v3, v12

    move v12, v13

    move v7, v14

    move-object/from16 v17, v15

    :goto_22
    move v11, v8

    goto/16 :goto_3d

    :cond_27
    move v14, v13

    move v13, v7

    move v3, v4

    move v11, v8

    move v12, v13

    move v7, v14

    goto/16 :goto_1d

    :pswitch_10
    move/from16 v12, p4

    move-object v15, v1

    move v13, v7

    move-object v5, v14

    move/from16 v14, v21

    const/4 v2, 0x2

    move-object/from16 v7, p6

    move-object/from16 v21, v11

    move-object/from16 v11, p2

    if-ne v9, v2, :cond_2f

    .line 101
    invoke-static {v11, v14, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v2, :cond_2e

    .line 102
    array-length v3, v11

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_2d

    if-nez v2, :cond_28

    .line 103
    sget-object v2, Lcom/google/android/gms/internal/ads/zzidl;->zza:Lcom/google/android/gms/internal/ads/zzidl;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 104
    :cond_28
    invoke-static {v11, v1, v2}, Lcom/google/android/gms/internal/ads/zzidl;->zzt([BII)Lcom/google/android/gms/internal/ads/zzidl;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_23
    add-int/2addr v1, v2

    :goto_24
    if-ge v1, v12, :cond_2c

    .line 105
    invoke-static {v11, v1, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    iget v3, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v13, v3, :cond_2c

    .line 106
    invoke-static {v11, v2, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v2, :cond_2b

    .line 107
    array-length v3, v11

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_2a

    if-nez v2, :cond_29

    .line 108
    sget-object v2, Lcom/google/android/gms/internal/ads/zzidl;->zza:Lcom/google/android/gms/internal/ads/zzidl;

    .line 109
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 110
    :cond_29
    invoke-static {v11, v1, v2}, Lcom/google/android/gms/internal/ads/zzidl;->zzt([BII)Lcom/google/android/gms/internal/ads/zzidl;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 111
    :cond_2a
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 112
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 113
    throw v1

    .line 114
    :cond_2b
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 115
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 116
    throw v1

    :cond_2c
    move v4, v1

    move-object v6, v7

    move-object v2, v11

    move v3, v12

    move v12, v13

    move v7, v14

    goto/16 :goto_17

    .line 117
    :cond_2d
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 118
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 119
    throw v1

    .line 120
    :cond_2e
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 121
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 122
    throw v1

    :cond_2f
    move-object v6, v7

    move-object v2, v11

    move v3, v12

    move v12, v13

    move v7, v14

    move/from16 v29, v17

    move v11, v8

    goto/16 :goto_1e

    :pswitch_11
    move/from16 v12, p4

    move-object v15, v1

    move v13, v7

    move-object v5, v14

    move/from16 v14, v21

    const/4 v10, 0x2

    move-object/from16 v7, p6

    move-object/from16 v21, v11

    move-object/from16 v11, p2

    if-ne v9, v10, :cond_2f

    .line 123
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v1

    move-object v6, v5

    move-object v3, v11

    move v5, v12

    move v2, v13

    move v4, v14

    move/from16 v11, v17

    .line 124
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzida;->zzn(Lcom/google/android/gms/internal/ads/zzigr;I[BIILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move/from16 v31, v4

    move v4, v1

    move v1, v2

    move-object v2, v3

    move/from16 v3, v31

    move v12, v1

    move-object v6, v7

    move/from16 v29, v11

    move-object/from16 v17, v15

    :goto_25
    move v7, v3

    move v3, v5

    goto/16 :goto_22

    :pswitch_12
    move-object/from16 v2, p2

    move/from16 v5, p4

    move-object v15, v1

    move v1, v7

    move/from16 v3, v21

    const/4 v10, 0x2

    move-object/from16 v7, p6

    move-object/from16 v21, v11

    move/from16 v11, v17

    if-ne v9, v10, :cond_3d

    const-wide/32 v9, 0x20000000

    and-long v9, v29, v9

    cmp-long v9, v9, v23

    if-nez v9, :cond_35

    .line 125
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v9, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v9, :cond_34

    if-nez v9, :cond_30

    .line 126
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v15

    goto :goto_27

    .line 127
    :cond_30
    new-instance v10, Ljava/lang/String;

    move-object/from16 v17, v15

    .line 128
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v10, v2, v4, v9, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 129
    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_26
    add-int/2addr v4, v9

    :goto_27
    if-ge v4, v5, :cond_33

    .line 130
    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v10, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v1, v10, :cond_33

    .line 131
    invoke-static {v2, v9, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v9, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v9, :cond_32

    if-nez v9, :cond_31

    .line 132
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_31
    new-instance v10, Ljava/lang/String;

    .line 133
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v10, v2, v4, v9, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 134
    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    .line 135
    :cond_32
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 136
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 137
    throw v1

    :cond_33
    move v12, v1

    move-object v6, v7

    move/from16 v29, v11

    goto :goto_25

    .line 138
    :cond_34
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 139
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 140
    throw v1

    :cond_35
    move-object/from16 v17, v15

    .line 141
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v10, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v10, :cond_3c

    if-nez v10, :cond_36

    .line 142
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v29, v11

    goto :goto_29

    :cond_36
    add-int v15, v9, v10

    .line 143
    invoke-static {v2, v9, v15}, Lcom/google/android/gms/internal/ads/zzihp;->zzb([BII)Z

    move-result v23

    if-eqz v23, :cond_3b

    move/from16 v23, v15

    .line 144
    new-instance v15, Ljava/lang/String;

    move/from16 v29, v11

    .line 145
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v15, v2, v9, v10, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 146
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_28
    move/from16 v9, v23

    :goto_29
    if-ge v9, v5, :cond_3a

    .line 147
    invoke-static {v2, v9, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v10

    iget v11, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v1, v11, :cond_3a

    .line 148
    invoke-static {v2, v10, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v10, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v10, :cond_39

    if-nez v10, :cond_37

    .line 149
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_37
    add-int v11, v9, v10

    .line 150
    invoke-static {v2, v9, v11}, Lcom/google/android/gms/internal/ads/zzihp;->zzb([BII)Z

    move-result v15

    if-eqz v15, :cond_38

    .line 151
    new-instance v15, Ljava/lang/String;

    move/from16 v23, v11

    .line 152
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v15, v2, v9, v10, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 153
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 154
    :cond_38
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 155
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 156
    throw v1

    .line 157
    :cond_39
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 158
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 159
    throw v1

    :cond_3a
    move v12, v1

    move-object v6, v7

    move v11, v8

    move v4, v9

    :goto_2a
    move v7, v3

    move v3, v5

    goto/16 :goto_3d

    .line 160
    :cond_3b
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 161
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 162
    throw v1

    .line 163
    :cond_3c
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 164
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 165
    throw v1

    :cond_3d
    move/from16 v29, v11

    move-object/from16 v17, v15

    :cond_3e
    move v12, v1

    move-object v6, v7

    move v11, v8

    move v7, v3

    move v3, v5

    goto/16 :goto_3c

    :pswitch_13
    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v29, v17

    move/from16 v3, v21

    const/4 v4, 0x2

    move-object/from16 v17, v1

    move v1, v7

    move-object/from16 v21, v11

    move-object/from16 v7, p6

    if-ne v9, v4, :cond_43

    .line 166
    check-cast v14, Lcom/google/android/gms/internal/ads/zzidb;

    .line 167
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int/2addr v6, v4

    :goto_2b
    if-ge v4, v6, :cond_40

    .line 168
    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget-wide v11, v7, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    cmp-long v9, v11, v23

    if-eqz v9, :cond_3f

    const/4 v9, 0x1

    goto :goto_2c

    :cond_3f
    const/4 v9, 0x0

    .line 169
    :goto_2c
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/zzidb;->zzg(Z)V

    goto :goto_2b

    :cond_40
    if-ne v4, v6, :cond_42

    :cond_41
    :goto_2d
    move v12, v1

    move-object v6, v7

    move v11, v8

    goto :goto_2a

    .line 170
    :cond_42
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 171
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 172
    throw v1

    :cond_43
    if-nez v9, :cond_3e

    .line 173
    check-cast v14, Lcom/google/android/gms/internal/ads/zzidb;

    .line 174
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget-wide v9, v7, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    cmp-long v6, v9, v23

    if-eqz v6, :cond_44

    const/4 v6, 0x1

    goto :goto_2e

    :cond_44
    const/4 v6, 0x0

    .line 175
    :goto_2e
    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzidb;->zzg(Z)V

    :goto_2f
    if-ge v4, v5, :cond_41

    .line 176
    invoke-static {v2, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v6

    iget v9, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v1, v9, :cond_41

    .line 177
    invoke-static {v2, v6, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget-wide v9, v7, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    cmp-long v6, v9, v23

    if-eqz v6, :cond_45

    const/4 v6, 0x1

    goto :goto_30

    :cond_45
    const/4 v6, 0x0

    .line 178
    :goto_30
    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzidb;->zzg(Z)V

    goto :goto_2f

    :pswitch_14
    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v29, v17

    move/from16 v3, v21

    const/4 v4, 0x2

    move-object/from16 v17, v1

    move v1, v7

    move-object/from16 v21, v11

    move-object/from16 v7, p6

    if-ne v9, v4, :cond_49

    .line 179
    check-cast v14, Lcom/google/android/gms/internal/ads/zzieq;

    .line 180
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int v9, v4, v6

    .line 181
    array-length v11, v2

    if-gt v9, v11, :cond_48

    .line 182
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzieq;->size()I

    move-result v11

    div-int/lit8 v6, v6, 0x4

    add-int/2addr v6, v11

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzieq;->zzj(I)V

    :goto_31
    if-ge v4, v9, :cond_46

    .line 183
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    add-int/lit8 v4, v4, 0x4

    goto :goto_31

    :cond_46
    if-ne v4, v9, :cond_47

    goto :goto_2d

    .line 184
    :cond_47
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 185
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 186
    throw v1

    .line 187
    :cond_48
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 188
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 189
    throw v1

    :cond_49
    const/4 v4, 0x5

    if-ne v9, v4, :cond_3e

    add-int/lit8 v12, v3, 0x4

    .line 190
    check-cast v14, Lcom/google/android/gms/internal/ads/zzieq;

    .line 191
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v4

    invoke-virtual {v14, v4}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    :goto_32
    if-ge v12, v5, :cond_4a

    .line 192
    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v1, v6, :cond_4a

    .line 193
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzieq;->zzi(I)V

    add-int/lit8 v12, v4, 0x4

    goto :goto_32

    :cond_4a
    move-object v6, v7

    move v11, v8

    move v4, v12

    move v12, v1

    goto/16 :goto_2a

    :pswitch_15
    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v29, v17

    move/from16 v3, v21

    const/4 v4, 0x2

    move-object/from16 v17, v1

    move v1, v7

    move-object/from16 v21, v11

    move-object/from16 v7, p6

    if-ne v9, v4, :cond_4e

    .line 194
    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 195
    invoke-static {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int v9, v4, v6

    .line 196
    array-length v11, v2

    if-gt v9, v11, :cond_4d

    .line 197
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzifn;->size()I

    move-result v11

    div-int/lit8 v6, v6, 0x8

    add-int/2addr v6, v11

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzifn;->zzi(I)V

    :goto_33
    if-ge v4, v9, :cond_4b

    .line 198
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v11

    invoke-virtual {v14, v11, v12}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    add-int/lit8 v4, v4, 0x8

    goto :goto_33

    :cond_4b
    if-ne v4, v9, :cond_4c

    goto/16 :goto_2d

    .line 199
    :cond_4c
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 200
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 201
    throw v1

    .line 202
    :cond_4d
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 203
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 204
    throw v1

    :cond_4e
    const/4 v4, 0x1

    if-ne v9, v4, :cond_3e

    add-int/lit8 v12, v3, 0x8

    .line 205
    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 206
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v9

    invoke-virtual {v14, v9, v10}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    :goto_34
    if-ge v12, v5, :cond_4a

    .line 207
    invoke-static {v2, v12, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v6, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v1, v6, :cond_4a

    .line 208
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v9

    invoke-virtual {v14, v9, v10}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    add-int/lit8 v12, v4, 0x8

    goto :goto_34

    :pswitch_16
    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v29, v17

    move/from16 v3, v21

    move-object/from16 v17, v1

    move v1, v7

    move-object/from16 v21, v11

    const/4 v11, 0x2

    move-object/from16 v7, p6

    if-ne v9, v11, :cond_4f

    .line 209
    invoke-static {v2, v3, v14, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzm([BILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    goto/16 :goto_2d

    :cond_4f
    if-nez v9, :cond_50

    move v4, v5

    move-object v6, v7

    move-object v5, v14

    .line 210
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzl(I[BIILcom/google/android/gms/internal/ads/zzifb;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v5

    move v12, v1

    move v7, v3

    move v3, v4

    move v4, v5

    goto/16 :goto_22

    :cond_50
    move v12, v1

    move-object v6, v7

    move v7, v3

    move v3, v5

    goto/16 :goto_19

    :pswitch_17
    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v6, p6

    move v12, v7

    move-object v5, v14

    move/from16 v29, v17

    move/from16 v7, v21

    move-object/from16 v17, v1

    move-object/from16 v21, v11

    const/4 v11, 0x2

    if-ne v9, v11, :cond_53

    .line 211
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 212
    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int/2addr v4, v1

    :goto_35
    if-ge v1, v4, :cond_51

    .line 213
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move v5, v1

    iget-wide v0, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 214
    invoke-virtual {v14, v0, v1}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    move-object/from16 v0, p0

    move v1, v5

    goto :goto_35

    :cond_51
    if-ne v1, v4, :cond_52

    move v4, v1

    goto/16 :goto_22

    .line 215
    :cond_52
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifh;

    .line 216
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 217
    throw v0

    :cond_53
    if-nez v9, :cond_1d

    .line 218
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzifn;

    .line 219
    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v0

    iget-wide v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 220
    invoke-virtual {v14, v4, v5}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    :goto_36
    if-ge v0, v3, :cond_54

    .line 221
    invoke-static {v2, v0, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v12, v4, :cond_54

    .line 222
    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v0

    iget-wide v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 223
    invoke-virtual {v14, v4, v5}, Lcom/google/android/gms/internal/ads/zzifn;->zzd(J)V

    goto :goto_36

    :cond_54
    :goto_37
    move v4, v0

    goto/16 :goto_22

    :pswitch_18
    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v6, p6

    move v12, v7

    move-object v5, v14

    move/from16 v29, v17

    move/from16 v7, v21

    const/4 v4, 0x2

    move-object/from16 v17, v1

    move-object/from16 v21, v11

    if-ne v9, v4, :cond_58

    .line 224
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzieg;

    .line 225
    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v0

    iget v1, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int v4, v0, v1

    .line 226
    array-length v5, v2

    if-gt v4, v5, :cond_57

    .line 227
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzieg;->size()I

    move-result v5

    div-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v5

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzieg;->zzi(I)V

    :goto_38
    if-ge v0, v4, :cond_55

    .line 228
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 229
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzieg;->zzg(F)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_38

    :cond_55
    if-ne v0, v4, :cond_56

    goto :goto_37

    .line 230
    :cond_56
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifh;

    .line 231
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 232
    throw v0

    .line 233
    :cond_57
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifh;

    .line 234
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 235
    throw v0

    :cond_58
    const/4 v4, 0x5

    if-ne v9, v4, :cond_1d

    add-int/lit8 v0, v7, 0x4

    .line 236
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzieg;

    .line 237
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 238
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzieg;->zzg(F)V

    :goto_39
    if-ge v0, v3, :cond_54

    .line 239
    invoke-static {v2, v0, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v12, v4, :cond_54

    .line 240
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 241
    invoke-virtual {v14, v0}, Lcom/google/android/gms/internal/ads/zzieg;->zzg(F)V

    add-int/lit8 v0, v1, 0x4

    goto :goto_39

    :pswitch_19
    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v6, p6

    move v12, v7

    move-object v5, v14

    move/from16 v29, v17

    move/from16 v7, v21

    const/4 v4, 0x2

    move-object/from16 v17, v1

    move-object/from16 v21, v11

    if-ne v9, v4, :cond_5d

    .line 242
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzidw;

    .line 243
    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v0

    iget v1, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    add-int v4, v0, v1

    .line 244
    array-length v5, v2

    if-gt v4, v5, :cond_5c

    .line 245
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzidw;->size()I

    move-result v5

    div-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v5

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzidw;->zzi(I)V

    :goto_3a
    if-ge v0, v4, :cond_59

    .line 246
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v23

    move v11, v8

    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    .line 247
    invoke-virtual {v14, v8, v9}, Lcom/google/android/gms/internal/ads/zzidw;->zzg(D)V

    add-int/lit8 v0, v0, 0x8

    move v8, v11

    goto :goto_3a

    :cond_59
    move v11, v8

    if-ne v0, v4, :cond_5b

    :cond_5a
    move v4, v0

    goto :goto_3d

    .line 248
    :cond_5b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifh;

    .line 249
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 250
    throw v0

    .line 251
    :cond_5c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifh;

    .line 252
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 253
    throw v0

    :cond_5d
    move v11, v8

    const/4 v4, 0x1

    if-ne v9, v4, :cond_5e

    add-int/lit8 v0, v7, 0x8

    .line 254
    move-object v14, v5

    check-cast v14, Lcom/google/android/gms/internal/ads/zzidw;

    .line 255
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    .line 256
    invoke-virtual {v14, v4, v5}, Lcom/google/android/gms/internal/ads/zzidw;->zzg(D)V

    :goto_3b
    if-ge v0, v3, :cond_5a

    .line 257
    invoke-static {v2, v0, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ne v12, v4, :cond_5a

    .line 258
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    .line 259
    invoke-virtual {v14, v4, v5}, Lcom/google/android/gms/internal/ads/zzidw;->zzg(D)V

    add-int/lit8 v0, v1, 0x8

    goto :goto_3b

    :cond_5e
    :goto_3c
    move v4, v7

    :goto_3d
    move-object/from16 v0, p0

    if-eq v4, v7, :cond_5f

    move v7, v4

    move v9, v11

    move-object/from16 v1, v17

    move/from16 v13, v22

    move/from16 v14, v27

    move/from16 v8, v29

    const/4 v15, -0x1

    const/16 v16, 0x1

    move v4, v3

    move/from16 v17, v12

    move-object v3, v2

    move-object/from16 v2, p1

    goto/16 :goto_0

    :cond_5f
    move-object/from16 v7, p1

    move/from16 v10, p5

    move-object v3, v2

    move-object v1, v6

    move v9, v11

    move-object/from16 v8, v17

    move/from16 v13, v22

    move/from16 v14, v27

    move/from16 v11, v29

    const/16 v20, 0x3

    goto/16 :goto_50

    :cond_60
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v28, v3

    move v12, v7

    move/from16 v29, v17

    move/from16 v7, v21

    move/from16 v3, p4

    move-object/from16 v21, v11

    move v11, v8

    move-object v8, v1

    const/16 v0, 0x32

    move/from16 v1, v28

    if-ne v1, v0, :cond_6c

    const/4 v0, 0x2

    if-ne v9, v0, :cond_6b

    move-object/from16 v0, p0

    .line 260
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v9, p1

    .line 261
    invoke-virtual {v8, v9, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    .line 262
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzifu;->zza(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_61

    .line 263
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzift;->zza()Lcom/google/android/gms/internal/ads/zzift;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzift;->zzc()Lcom/google/android/gms/internal/ads/zzift;

    move-result-object v5

    .line 264
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/ads/zzifu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    invoke-virtual {v8, v9, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v5

    .line 266
    :cond_61
    check-cast v1, Lcom/google/android/gms/internal/ads/zzifs;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzifs;->zze()Lcom/google/android/gms/internal/ads/zzifr;

    move-result-object v13

    .line 267
    move-object v14, v4

    check-cast v14, Lcom/google/android/gms/internal/ads/zzift;

    .line 268
    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    iget v4, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-ltz v4, :cond_6a

    sub-int v5, v3, v1

    if-gt v4, v5, :cond_6a

    add-int v10, v1, v4

    .line 269
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzifr;->zzb:Ljava/lang/Object;

    iget-object v15, v13, Lcom/google/android/gms/internal/ads/zzifr;->zzd:Ljava/lang/Object;

    move-object v5, v15

    :goto_3e
    if-ge v1, v10, :cond_67

    const/16 v16, 0x1

    add-int/lit8 v3, v1, 0x1

    .line 270
    aget-byte v1, v2, v1

    if-gez v1, :cond_62

    .line 271
    invoke-static {v1, v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzida;->zzb(I[BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    iget v1, v6, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    :cond_62
    const/16 v20, 0x3

    ushr-int/lit8 v2, v1, 0x3

    move/from16 v17, v3

    and-int/lit8 v3, v1, 0x7

    move-object/from16 v23, v4

    move/from16 v4, v16

    if-eq v2, v4, :cond_66

    const/4 v4, 0x2

    if-eq v2, v4, :cond_63

    move-object/from16 v3, p2

    move-object v2, v5

    move-object v4, v6

    move/from16 v5, v17

    move-object/from16 v9, v23

    :goto_3f
    move/from16 v6, p4

    goto/16 :goto_41

    .line 272
    :cond_63
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzifr;->zzc:Lcom/google/android/gms/internal/ads/zzihq;

    .line 273
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzihq;->zzb()I

    move-result v2

    if-ne v3, v2, :cond_64

    .line 274
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v1, p2

    move/from16 v3, p4

    move/from16 v2, v17

    move-object/from16 v9, v23

    .line 275
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzS([BIILcom/google/android/gms/internal/ads/zzihq;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    iget-object v5, v6, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    move v1, v2

    move-object v4, v9

    move-object/from16 v9, p1

    move-object/from16 v2, p2

    goto :goto_3e

    :cond_64
    move-object/from16 v9, v23

    :cond_65
    move-object/from16 v3, p2

    move-object v2, v5

    move-object v4, v6

    move/from16 v5, v17

    goto :goto_3f

    :cond_66
    move/from16 v2, v17

    move-object/from16 v9, v23

    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzifr;->zza:Lcom/google/android/gms/internal/ads/zzihq;

    .line 276
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzihq;->zzb()I

    move-result v2

    if-ne v3, v2, :cond_65

    move-object v2, v5

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object v9, v2

    move/from16 v2, v17

    .line 277
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzS([BIILcom/google/android/gms/internal/ads/zzihq;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    move-object v4, v6

    move v6, v3

    move-object v3, v1

    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    move-object v5, v4

    move-object v4, v1

    move v1, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v5

    move-object v5, v9

    :goto_40
    move-object/from16 v9, p1

    goto :goto_3e

    .line 278
    :goto_41
    invoke-static {v1, v3, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzida;->zzp(I[BIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v1

    move-object v5, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v4

    move-object v4, v9

    goto :goto_40

    :cond_67
    move-object v9, v4

    move-object v4, v6

    move v6, v3

    move-object v3, v2

    move-object v2, v5

    if-ne v1, v10, :cond_69

    .line 279
    invoke-interface {v14, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v10, v7, :cond_68

    move v1, v6

    move-object v6, v4

    move v4, v1

    move-object/from16 v2, p1

    move-object v1, v8

    move v7, v10

    move v9, v11

    move/from16 v17, v12

    move/from16 v13, v22

    move/from16 v14, v27

    move/from16 v8, v29

    goto/16 :goto_10

    :cond_68
    move-object/from16 v7, p1

    move-object v1, v4

    move v4, v10

    move v9, v11

    move/from16 v13, v22

    move/from16 v14, v27

    move/from16 v11, v29

    const/16 v20, 0x3

    :goto_42
    move/from16 v10, p5

    goto/16 :goto_50

    .line 280
    :cond_69
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    move-object/from16 v10, v21

    .line 281
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 282
    throw v1

    .line 283
    :cond_6a
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 284
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 285
    throw v1

    :cond_6b
    move-object/from16 v0, p0

    move-object v4, v6

    move-object/from16 v10, v21

    move v6, v3

    move-object v3, v2

    :goto_43
    move-object v1, v4

    move v4, v7

    move-object/from16 v21, v10

    move v9, v11

    move/from16 v13, v22

    move/from16 v14, v27

    move/from16 v11, v29

    const/16 v20, 0x3

    move-object/from16 v7, p1

    goto :goto_42

    :cond_6c
    move-object/from16 v0, p0

    move v6, v3

    move-object/from16 v10, v21

    const/16 v19, 0x2

    move-object v3, v2

    move-object/from16 v2, p1

    add-int/lit8 v17, v11, 0x2

    .line 286
    aget v17, v26, v17

    move/from16 v28, v1

    and-int v1, v17, p3

    move/from16 v17, v5

    int-to-long v5, v1

    packed-switch v28, :pswitch_data_2

    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/16 v20, 0x3

    goto/16 :goto_4e

    :pswitch_1a
    const/4 v13, 0x3

    if-ne v9, v13, :cond_6d

    and-int/lit8 v1, v12, -0x8

    or-int/lit8 v6, v1, 0x4

    move/from16 v9, v29

    .line 287
    invoke-direct {v0, v2, v9, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzv(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    .line 288
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v2

    move-object/from16 v14, p1

    move/from16 v5, p4

    move v4, v7

    move-object/from16 v7, p6

    .line 289
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzida;->zzk(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;[BIIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    .line 290
    invoke-direct {v0, v14, v9, v11, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzw(Ljava/lang/Object;IILjava/lang/Object;)V

    move v1, v4

    move v4, v2

    move v2, v1

    move-object v1, v7

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v20, v13

    move-object v7, v14

    :goto_44
    move v11, v9

    goto/16 :goto_4f

    :cond_6d
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v20, v13

    move/from16 v11, v29

    goto/16 :goto_4e

    :pswitch_1b
    move-object v1, v2

    move v4, v7

    move/from16 v2, v29

    const/4 v13, 0x3

    move-object/from16 v7, p6

    if-nez v9, :cond_6e

    .line 291
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    move-wide/from16 v28, v14

    iget-wide v13, v7, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 292
    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzidp;->zzN(J)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    move-wide/from16 v14, v28

    invoke-virtual {v8, v1, v14, v15, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 293
    invoke-virtual {v8, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_45
    move-object/from16 v19, v7

    move-object v7, v1

    move-object/from16 v1, v19

    move-object/from16 v21, v10

    move/from16 v19, v11

    const/16 v20, 0x3

    move v11, v2

    move v2, v4

    :goto_46
    move v4, v9

    goto/16 :goto_4f

    :cond_6e
    move-object/from16 v19, v7

    move-object v7, v1

    move-object/from16 v1, v19

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v20, v13

    :goto_47
    move v11, v2

    move v2, v4

    goto/16 :goto_4e

    :pswitch_1c
    move-object v1, v2

    move v4, v7

    move/from16 v2, v29

    move-object/from16 v7, p6

    if-nez v9, :cond_6f

    .line 294
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v13, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 295
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzidp;->zzM(I)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v1, v14, v15, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 296
    invoke-virtual {v8, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_45

    :cond_6f
    move-object/from16 v19, v7

    move-object v7, v1

    move-object/from16 v1, v19

    :goto_48
    move-object/from16 v21, v10

    move/from16 v19, v11

    const/16 v20, 0x3

    goto :goto_47

    :pswitch_1d
    move-object v1, v2

    move v4, v7

    move/from16 v2, v29

    move-object/from16 v7, p6

    if-nez v9, :cond_6f

    .line 297
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v13, v7, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    move/from16 v17, v9

    .line 298
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzs(I)Lcom/google/android/gms/internal/ads/zziev;

    move-result-object v9

    if-eqz v9, :cond_71

    .line 299
    invoke-interface {v9, v13}, Lcom/google/android/gms/internal/ads/zziev;->zza(I)Z

    move-result v9

    if-eqz v9, :cond_70

    goto :goto_49

    .line 300
    :cond_70
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzihe;

    move-result-object v5

    int-to-long v13, v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v12, v6}, Lcom/google/android/gms/internal/ads/zzihe;->zzk(ILjava/lang/Object;)V

    goto :goto_4a

    .line 301
    :cond_71
    :goto_49
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v1, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 302
    invoke-virtual {v8, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_4a
    move-object/from16 v19, v7

    move-object v7, v1

    move-object/from16 v1, v19

    move-object/from16 v21, v10

    move/from16 v19, v11

    const/16 v20, 0x3

    move v11, v2

    move v2, v4

    move/from16 v4, v17

    goto/16 :goto_4f

    :pswitch_1e
    move-object v1, v2

    move v4, v7

    move/from16 v2, v29

    const/4 v13, 0x2

    move-object/from16 v7, p6

    if-ne v9, v13, :cond_6f

    .line 303
    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzida;->zzg([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget-object v13, v7, Lcom/google/android/gms/internal/ads/zzicz;->zzc:Ljava/lang/Object;

    .line 304
    invoke-virtual {v8, v1, v14, v15, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 305
    invoke-virtual {v8, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_45

    :pswitch_1f
    move-object v1, v2

    move v4, v7

    move/from16 v2, v29

    const/4 v13, 0x2

    move-object/from16 v7, p6

    if-ne v9, v13, :cond_72

    move-object v9, v1

    .line 306
    invoke-direct {v0, v9, v2, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzv(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    move/from16 v17, v2

    .line 307
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    move-result-object v2

    move/from16 v5, p4

    move-object v6, v7

    move-object v7, v9

    move/from16 v9, v17

    .line 308
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzj(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzigr;[BIILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v2

    move-object v5, v1

    move-object v1, v6

    .line 309
    invoke-direct {v0, v7, v9, v11, v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzw(Ljava/lang/Object;IILjava/lang/Object;)V

    move/from16 v19, v4

    move v4, v2

    move/from16 v2, v19

    move-object/from16 v21, v10

    move/from16 v19, v11

    const/16 v20, 0x3

    goto/16 :goto_44

    :cond_72
    move-object/from16 v31, v7

    move-object v7, v1

    move-object/from16 v1, v31

    goto/16 :goto_48

    :pswitch_20
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/4 v10, 0x2

    const/16 v20, 0x3

    if-ne v9, v10, :cond_77

    .line 310
    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v9

    iget v10, v1, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    if-nez v10, :cond_73

    .line 311
    invoke-virtual {v8, v7, v14, v15, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4c

    :cond_73
    add-int v13, v9, v10

    const/high16 v23, 0x20000000

    and-int v17, v17, v23

    if-eqz v17, :cond_75

    .line 312
    invoke-static {v3, v9, v13}, Lcom/google/android/gms/internal/ads/zzihp;->zzb([BII)Z

    move-result v17

    if-eqz v17, :cond_74

    goto :goto_4b

    :cond_74
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 313
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 314
    throw v1

    :cond_75
    :goto_4b
    new-instance v4, Ljava/lang/String;

    move/from16 v17, v13

    .line 315
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v9, v10, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 316
    invoke-virtual {v8, v7, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v9, v17

    .line 317
    :goto_4c
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_46

    :pswitch_21
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/16 v20, 0x3

    if-nez v9, :cond_77

    .line 318
    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    cmp-long v9, v9, v23

    if-eqz v9, :cond_76

    const/4 v9, 0x1

    goto :goto_4d

    :cond_76
    const/4 v9, 0x0

    .line 319
    :goto_4d
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 320
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4f

    :pswitch_22
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/4 v4, 0x5

    const/16 v20, 0x3

    if-ne v9, v4, :cond_77

    add-int/lit8 v4, v2, 0x4

    .line 321
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 322
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4f

    :pswitch_23
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/4 v4, 0x1

    const/16 v20, 0x3

    if-ne v9, v4, :cond_77

    add-int/lit8 v4, v2, 0x8

    .line 323
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 324
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4f

    :pswitch_24
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/16 v20, 0x3

    if-nez v9, :cond_77

    .line 325
    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zza([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget v9, v1, Lcom/google/android/gms/internal/ads/zzicz;->zza:I

    .line 326
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 327
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_4f

    :pswitch_25
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/16 v20, 0x3

    if-nez v9, :cond_77

    .line 328
    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzida;->zzc([BILcom/google/android/gms/internal/ads/zzicz;)I

    move-result v4

    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/zzicz;->zzb:J

    .line 329
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 330
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4f

    :pswitch_26
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/4 v4, 0x5

    const/16 v20, 0x3

    if-ne v9, v4, :cond_77

    add-int/lit8 v4, v2, 0x4

    .line 331
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzida;->zzd([BI)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 332
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 333
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4f

    :pswitch_27
    move v1, v7

    move-object v7, v2

    move v2, v1

    move-object/from16 v1, p6

    move-object/from16 v21, v10

    move/from16 v19, v11

    move/from16 v11, v29

    const/4 v4, 0x1

    const/16 v20, 0x3

    if-ne v9, v4, :cond_77

    add-int/lit8 v4, v2, 0x8

    .line 334
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzida;->zze([BI)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v9

    .line 335
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v8, v7, v14, v15, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 336
    invoke-virtual {v8, v7, v5, v6, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4f

    :cond_77
    :goto_4e
    move v4, v2

    :goto_4f
    if-eq v4, v2, :cond_78

    move-object v6, v1

    move-object v2, v7

    move-object v1, v8

    move v8, v11

    move/from16 v17, v12

    move/from16 v9, v19

    move/from16 v13, v22

    move/from16 v14, v27

    const/4 v15, -0x1

    const/16 v16, 0x1

    goto/16 :goto_3

    :cond_78
    move/from16 v10, p5

    move/from16 v9, v19

    move/from16 v13, v22

    move/from16 v14, v27

    :goto_50
    if-ne v12, v10, :cond_79

    if-eqz v10, :cond_79

    move/from16 v3, p3

    move-object v1, v7

    move v6, v12

    move/from16 v12, p4

    move v7, v4

    goto/16 :goto_52

    .line 337
    :cond_79
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    if-eqz v2, :cond_7b

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzicz;->zzd:Lcom/google/android/gms/internal/ads/zzidz;

    .line 338
    sget v5, Lcom/google/android/gms/internal/ads/zzidz;->zzb:I

    .line 339
    sget v5, Lcom/google/android/gms/internal/ads/zzicy;->zza:I

    sget-object v5, Lcom/google/android/gms/internal/ads/zzidz;->zza:Lcom/google/android/gms/internal/ads/zzidz;

    if-eq v2, v5, :cond_7b

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzg:Lcom/google/android/gms/internal/ads/zzifz;

    .line 340
    invoke-virtual {v2, v5, v11}, Lcom/google/android/gms/internal/ads/zzidz;->zzd(Lcom/google/android/gms/internal/ads/zzifz;I)Lcom/google/android/gms/internal/ads/zzien;

    move-result-object v2

    if-nez v2, :cond_7a

    .line 341
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzigc;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzihe;

    move-result-object v5

    move-object v6, v1

    move-object v2, v3

    move v3, v4

    move v1, v12

    move/from16 v4, p4

    .line 342
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzo(I[BIILcom/google/android/gms/internal/ads/zzihe;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    move/from16 v12, p4

    goto :goto_51

    .line 343
    :cond_7a
    move-object v1, v7

    check-cast v1, Lcom/google/android/gms/internal/ads/zziel;

    .line 344
    throw v18

    :cond_7b
    move v3, v4

    move v1, v12

    .line 345
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzigc;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzihe;

    move-result-object v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    .line 346
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzida;->zzo(I[BIILcom/google/android/gms/internal/ads/zzihe;Lcom/google/android/gms/internal/ads/zzicz;)I

    move-result v3

    move v12, v4

    :goto_51
    move-object/from16 v6, p6

    move/from16 v17, v1

    move-object v2, v7

    move-object v1, v8

    move v8, v11

    move v4, v12

    const/4 v15, -0x1

    const/16 v16, 0x1

    move v7, v3

    move-object/from16 v3, p2

    goto/16 :goto_0

    :cond_7c
    move/from16 v10, p5

    move-object v8, v1

    move-object v1, v2

    move v12, v4

    move-object/from16 v21, v11

    move/from16 v22, v13

    move/from16 v27, v14

    move/from16 v6, v17

    const v3, 0xfffff

    :goto_52
    if-eq v14, v3, :cond_7d

    int-to-long v2, v14

    .line 347
    invoke-virtual {v8, v1, v2, v3, v13}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_7d
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    move v8, v2

    move-object/from16 v3, v18

    :goto_53
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzl:I

    if-ge v8, v2, :cond_7e

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    .line 348
    aget v2, v2, v8

    move-object/from16 v5, p1

    .line 349
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzx(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/ads/zzihd;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/gms/internal/ads/zzihe;

    const/16 v16, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_53

    :cond_7e
    if-eqz v3, :cond_7f

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    .line 350
    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzihd;->zzi(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7f
    if-nez v10, :cond_81

    if-ne v7, v12, :cond_80

    goto :goto_54

    :cond_80
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    move-object/from16 v2, v21

    .line 351
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 352
    throw v1

    :cond_81
    move-object/from16 v2, v21

    if-gt v7, v12, :cond_82

    if-ne v6, v10, :cond_82

    :goto_54
    return v7

    :cond_82
    new-instance v1, Lcom/google/android/gms/internal/ads/zzifh;

    .line 353
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzifh;-><init>(Ljava/lang/String;)V

    .line 354
    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method

.method public final zzj(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/zzicz;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzigc;->zzi(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/ads/zzicz;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzk(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzE(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zziep;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lcom/google/android/gms/internal/ads/zziep;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziep;->zzbq()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziep;->zzbb()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziep;->zzaY()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    array-length v2, v0

    .line 29
    if-ge v1, v2, :cond_5

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const v3, 0xfffff

    .line 36
    .line 37
    .line 38
    and-int/2addr v3, v2

    .line 39
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-long v3, v3

    .line 44
    const/16 v5, 0x9

    .line 45
    .line 46
    if-eq v2, v5, :cond_3

    .line 47
    .line 48
    const/16 v5, 0x3c

    .line 49
    .line 50
    if-eq v2, v5, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x44

    .line 53
    .line 54
    if-eq v2, v5, :cond_2

    .line 55
    .line 56
    packed-switch v2, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 61
    .line 62
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    move-object v6, v5

    .line 69
    check-cast v6, Lcom/google/android/gms/internal/ads/zzift;

    .line 70
    .line 71
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzift;->zzd()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :pswitch_1
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lcom/google/android/gms/internal/ads/zzifb;

    .line 83
    .line 84
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzifb;->zzb()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    aget v2, v0, v1

    .line 89
    .line 90
    invoke-direct {p0, p1, v2, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v5, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 101
    .line 102
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzigr;->zzk(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzK(Ljava/lang/Object;I)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v5, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 121
    .line 122
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzigr;->zzk(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzm:Lcom/google/android/gms/internal/ads/zzihd;

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzihd;->zzj(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 138
    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzn:Lcom/google/android/gms/internal/ads/zziea;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zziea;->zza(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_2
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzl(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0xfffff

    .line 3
    .line 4
    .line 5
    move v2, v0

    .line 6
    move v4, v2

    .line 7
    move v3, v1

    .line 8
    :goto_0
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzk:I

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_b

    .line 12
    .line 13
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzj:[I

    .line 14
    .line 15
    aget v9, v5, v2

    .line 16
    .line 17
    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzA(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    iget-object v13, p0, Lcom/google/android/gms/internal/ads/zzigc;->zzc:[I

    .line 22
    .line 23
    add-int/lit8 v7, v9, 0x2

    .line 24
    .line 25
    aget v7, v13, v7

    .line 26
    .line 27
    and-int v8, v7, v1

    .line 28
    .line 29
    ushr-int/lit8 v7, v7, 0x14

    .line 30
    .line 31
    shl-int v12, v6, v7

    .line 32
    .line 33
    if-eq v8, v3, :cond_1

    .line 34
    .line 35
    if-eq v8, v1, :cond_0

    .line 36
    .line 37
    int-to-long v3, v8

    .line 38
    sget-object v6, Lcom/google/android/gms/internal/ads/zzigc;->zzb:Lsun/misc/Unsafe;

    .line 39
    .line 40
    invoke-virtual {v6, p1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    :cond_0
    move v11, v4

    .line 45
    move v10, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v10, v3

    .line 48
    move v11, v4

    .line 49
    :goto_1
    const/high16 v3, 0x10000000

    .line 50
    .line 51
    and-int/2addr v3, v5

    .line 52
    move-object v7, p0

    .line 53
    move-object v8, p1

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    return v0

    .line 63
    :cond_2
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzigc;->zzC(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/16 v3, 0x9

    .line 68
    .line 69
    if-eq p1, v3, :cond_9

    .line 70
    .line 71
    const/16 v3, 0x11

    .line 72
    .line 73
    if-eq p1, v3, :cond_9

    .line 74
    .line 75
    const/16 v3, 0x1b

    .line 76
    .line 77
    if-eq p1, v3, :cond_7

    .line 78
    .line 79
    const/16 v3, 0x3c

    .line 80
    .line 81
    if-eq p1, v3, :cond_6

    .line 82
    .line 83
    const/16 v3, 0x44

    .line 84
    .line 85
    if-eq p1, v3, :cond_6

    .line 86
    .line 87
    const/16 v3, 0x31

    .line 88
    .line 89
    if-eq p1, v3, :cond_7

    .line 90
    .line 91
    const/16 v3, 0x32

    .line 92
    .line 93
    if-eq p1, v3, :cond_3

    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_3
    and-int p1, v5, v1

    .line 98
    .line 99
    int-to-long v3, p1

    .line 100
    invoke-static {v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/google/android/gms/internal/ads/zzift;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_a

    .line 111
    .line 112
    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzr(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lcom/google/android/gms/internal/ads/zzifs;

    .line 117
    .line 118
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzifs;->zze()Lcom/google/android/gms/internal/ads/zzifr;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzifr;->zzc:Lcom/google/android/gms/internal/ads/zzihq;

    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzihq;->zza()Lcom/google/android/gms/internal/ads/zzihr;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v4, Lcom/google/android/gms/internal/ads/zzihr;->zzi:Lcom/google/android/gms/internal/ads/zzihr;

    .line 129
    .line 130
    if-ne v3, v4, :cond_a

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/4 v3, 0x0

    .line 141
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-nez v3, :cond_5

    .line 152
    .line 153
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzigj;->zza()Lcom/google/android/gms/internal/ads/zzigj;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzigj;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzigr;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    :cond_5
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzigr;->zzl(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-nez v4, :cond_4

    .line 170
    .line 171
    return v0

    .line 172
    :cond_6
    aget p1, v13, v9

    .line 173
    .line 174
    invoke-direct {p0, v8, p1, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzM(Ljava/lang/Object;II)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_a

    .line 179
    .line 180
    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v8, v5, p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzy(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigr;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-nez p1, :cond_a

    .line 189
    .line 190
    return v0

    .line 191
    :cond_7
    and-int p1, v5, v1

    .line 192
    .line 193
    int-to-long v3, p1

    .line 194
    invoke-static {v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzihk;->zzm(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Ljava/util/List;

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-nez v3, :cond_a

    .line 205
    .line 206
    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    move v4, v0

    .line 211
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-ge v4, v5, :cond_a

    .line 216
    .line 217
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/zzigr;->zzl(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-nez v5, :cond_8

    .line 226
    .line 227
    return v0

    .line 228
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_9
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/zzigc;->zzJ(Ljava/lang/Object;IIII)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_a

    .line 236
    .line 237
    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/ads/zzigc;->zzq(I)Lcom/google/android/gms/internal/ads/zzigr;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {v8, v5, p1}, Lcom/google/android/gms/internal/ads/zzigc;->zzy(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzigr;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-nez p1, :cond_a

    .line 246
    .line 247
    return v0

    .line 248
    :cond_a
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 249
    .line 250
    move-object p1, v8

    .line 251
    move v3, v10

    .line 252
    move v4, v11

    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_b
    move-object v7, p0

    .line 256
    move-object v8, p1

    .line 257
    iget-boolean p1, v7, Lcom/google/android/gms/internal/ads/zzigc;->zzh:Z

    .line 258
    .line 259
    if-eqz p1, :cond_c

    .line 260
    .line 261
    move-object p1, v8

    .line 262
    check-cast p1, Lcom/google/android/gms/internal/ads/zziel;

    .line 263
    .line 264
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zziel;->zza:Lcom/google/android/gms/internal/ads/zziee;

    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zziee;->zze()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-nez p1, :cond_c

    .line 271
    .line 272
    return v0

    .line 273
    :cond_c
    return v6
.end method
