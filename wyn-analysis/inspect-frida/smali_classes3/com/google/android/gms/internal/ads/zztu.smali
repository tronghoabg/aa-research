.class public final Lcom/google/android/gms/internal/ads/zztu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzsg;


# static fields
.field private static final zza:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:I

.field private zzD:Z

.field private zzE:Z

.field private zzF:J

.field private zzG:J

.field private zzH:F

.field private zzI:Ljava/nio/ByteBuffer;

.field private zzJ:I

.field private zzK:Ljava/nio/ByteBuffer;

.field private zzL:Z

.field private zzM:Z

.field private zzN:Z

.field private zzO:Z

.field private zzP:I

.field private zzQ:Z

.field private zzR:Lcom/google/android/gms/internal/ads/zze;

.field private zzS:Landroid/media/AudioDeviceInfo;

.field private zzT:I

.field private zzU:J

.field private zzV:Z

.field private zzW:Z

.field private zzX:J

.field private zzY:J

.field private zzZ:Landroid/os/Handler;

.field private final zzaa:Lcom/google/android/gms/internal/ads/zztp;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zztj;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzug;

.field private final zze:Lcom/google/android/gms/internal/ads/zzcw;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzuf;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzgwt;

.field private final zzh:Ljava/util/ArrayDeque;

.field private zzi:Lcom/google/android/gms/internal/ads/zztl;

.field private final zzj:Lcom/google/android/gms/internal/ads/zztt;

.field private final zzk:Lcom/google/android/gms/internal/ads/zztt;

.field private zzl:Lcom/google/android/gms/internal/ads/zzqh;

.field private zzm:Lcom/google/android/gms/internal/ads/zzsd;

.field private zzn:Lcom/google/android/gms/internal/ads/zzto;

.field private zzo:Lcom/google/android/gms/internal/ads/zzto;

.field private zzp:Lcom/google/android/gms/internal/ads/zzck;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzrh;

.field private zzr:Lcom/google/android/gms/internal/ads/zzre;

.field private zzs:Lcom/google/android/gms/internal/ads/zzqx;

.field private zzt:Lcom/google/android/gms/internal/ads/zzd;

.field private zzu:Lcom/google/android/gms/internal/ads/zzts;

.field private zzv:Lcom/google/android/gms/internal/ads/zzts;

.field private zzw:Lcom/google/android/gms/internal/ads/zzav;

.field private zzx:Z

.field private zzy:J

.field private zzz:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zztu;->zza:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zztn;[B)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzb()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzb()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzb:Landroid/content/Context;

    .line 21
    .line 22
    sget-object p2, Lcom/google/android/gms/internal/ads/zzd;->zza:Lcom/google/android/gms/internal/ads/zzd;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzt:Lcom/google/android/gms/internal/ads/zzd;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzd()Lcom/google/android/gms/internal/ads/zztp;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzc()Lcom/google/android/gms/internal/ads/zzrh;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 37
    .line 38
    new-instance p2, Lcom/google/android/gms/internal/ads/zztj;

    .line 39
    .line 40
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zztj;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzc:Lcom/google/android/gms/internal/ads/zztj;

    .line 44
    .line 45
    new-instance v0, Lcom/google/android/gms/internal/ads/zzug;

    .line 46
    .line 47
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzug;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzd:Lcom/google/android/gms/internal/ads/zzug;

    .line 51
    .line 52
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcw;

    .line 53
    .line 54
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcw;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzcw;

    .line 58
    .line 59
    new-instance v1, Lcom/google/android/gms/internal/ads/zzuf;

    .line 60
    .line 61
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzuf;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzf:Lcom/google/android/gms/internal/ads/zzuf;

    .line 65
    .line 66
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzgwt;->zzk(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzg:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 71
    .line 72
    const/high16 p2, 0x3f800000    # 1.0f

    .line 73
    .line 74
    iput p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzH:F

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    iput p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 78
    .line 79
    new-instance v0, Lcom/google/android/gms/internal/ads/zze;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/ads/zze;-><init>(IF)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzR:Lcom/google/android/gms/internal/ads/zze;

    .line 86
    .line 87
    new-instance v2, Lcom/google/android/gms/internal/ads/zzts;

    .line 88
    .line 89
    sget-object v3, Lcom/google/android/gms/internal/ads/zzav;->zza:Lcom/google/android/gms/internal/ads/zzav;

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const-wide/16 v4, 0x0

    .line 93
    .line 94
    const-wide/16 v6, 0x0

    .line 95
    .line 96
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzts;-><init>(Lcom/google/android/gms/internal/ads/zzav;JJ[B)V

    .line 97
    .line 98
    .line 99
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 100
    .line 101
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 102
    .line 103
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzx:Z

    .line 104
    .line 105
    new-instance p2, Ljava/util/ArrayDeque;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzh:Ljava/util/ArrayDeque;

    .line 111
    .line 112
    new-instance p2, Lcom/google/android/gms/internal/ads/zztt;

    .line 113
    .line 114
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zztt;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzj:Lcom/google/android/gms/internal/ads/zztt;

    .line 118
    .line 119
    new-instance p2, Lcom/google/android/gms/internal/ads/zztt;

    .line 120
    .line 121
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zztt;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzk:Lcom/google/android/gms/internal/ads/zztt;

    .line 125
    .line 126
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 127
    .line 128
    const/16 v0, 0x22

    .line 129
    .line 130
    const/4 v1, -0x1

    .line 131
    if-lt p2, v0, :cond_2

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzb()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-nez p2, :cond_1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzb()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p1}, LWf/p;->a(Landroid/content/Context;)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zztu;->zzai(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    :cond_2
    :goto_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzT:I

    .line 153
    .line 154
    return-void
.end method

.method public static zzF(ILjava/nio/ByteBuffer;)I
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-eq p0, v0, :cond_c

    .line 4
    .line 5
    const/16 v0, 0x1e

    .line 6
    .line 7
    const/4 v1, -0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    const/16 v4, 0x400

    .line 11
    .line 12
    if-eq p0, v0, :cond_5

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    packed-switch p0, :pswitch_data_1

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1b

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v0, "Unexpected audio encoding: "

    .line 40
    .line 41
    invoke-static {p0, v0, v1}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :pswitch_0
    new-array p0, v0, [B

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 59
    .line 60
    .line 61
    new-instance p1, Lcom/google/android/gms/internal/ads/zzet;

    .line 62
    .line 63
    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzafd;->zzb(Lcom/google/android/gms/internal/ads/zzet;)Lcom/google/android/gms/internal/ads/zzafc;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget p0, p0, Lcom/google/android/gms/internal/ads/zzafc;->zzc:I

    .line 71
    .line 72
    return p0

    .line 73
    :pswitch_1
    return v4

    .line 74
    :pswitch_2
    const/16 p0, 0x200

    .line 75
    .line 76
    return p0

    .line 77
    :pswitch_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    add-int/lit8 v4, v4, -0xa

    .line 86
    .line 87
    move v5, p0

    .line 88
    :goto_0
    if-gt v5, v4, :cond_1

    .line 89
    .line 90
    add-int/lit8 v6, v5, 0x4

    .line 91
    .line 92
    invoke-static {p1, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzO(Ljava/nio/ByteBuffer;I)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    and-int/2addr v6, v1

    .line 97
    const v7, -0x78d9046

    .line 98
    .line 99
    .line 100
    if-ne v6, v7, :cond_0

    .line 101
    .line 102
    sub-int/2addr v5, p0

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    move v5, v3

    .line 108
    :goto_1
    if-eq v5, v3, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    add-int/2addr p0, v5

    .line 115
    add-int/lit8 p0, p0, 0x7

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    and-int/lit16 p0, p0, 0xff

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/2addr v1, v5

    .line 128
    const/16 v2, 0xbb

    .line 129
    .line 130
    if-ne p0, v2, :cond_2

    .line 131
    .line 132
    const/16 p0, 0x9

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const/16 p0, 0x8

    .line 136
    .line 137
    :goto_2
    add-int/2addr v1, p0

    .line 138
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    shr-int/lit8 p0, p0, 0x4

    .line 143
    .line 144
    and-int/lit8 p0, p0, 0x7

    .line 145
    .line 146
    const/16 p1, 0x28

    .line 147
    .line 148
    shl-int p0, p1, p0

    .line 149
    .line 150
    mul-int/2addr p0, v0

    .line 151
    return p0

    .line 152
    :cond_3
    return v2

    .line 153
    :pswitch_4
    const/16 p0, 0x800

    .line 154
    .line 155
    return p0

    .line 156
    :pswitch_5
    return v4

    .line 157
    :pswitch_6
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzfm;->zzO(Ljava/nio/ByteBuffer;I)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzagy;->zzb(I)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eq p0, v3, :cond_4

    .line 170
    .line 171
    return p0

    .line 172
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    :pswitch_7
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzafa;->zze(Ljava/nio/ByteBuffer;)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_5
    :pswitch_8
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    const v0, -0xde4bec0

    .line 188
    .line 189
    .line 190
    if-eq p0, v0, :cond_b

    .line 191
    .line 192
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    const v0, -0x17bd3b8f

    .line 197
    .line 198
    .line 199
    if-ne p0, v0, :cond_6

    .line 200
    .line 201
    return v4

    .line 202
    :cond_6
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    const v0, 0x25205864

    .line 207
    .line 208
    .line 209
    if-ne p0, v0, :cond_7

    .line 210
    .line 211
    const/16 p0, 0x1000

    .line 212
    .line 213
    return p0

    .line 214
    :cond_7
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eq v0, v1, :cond_a

    .line 223
    .line 224
    if-eq v0, v3, :cond_9

    .line 225
    .line 226
    const/16 v1, 0x1f

    .line 227
    .line 228
    if-eq v0, v1, :cond_8

    .line 229
    .line 230
    add-int/lit8 v0, p0, 0x4

    .line 231
    .line 232
    add-int/lit8 p0, p0, 0x5

    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    and-int/lit8 v0, v0, 0x1

    .line 239
    .line 240
    shl-int/lit8 v0, v0, 0x6

    .line 241
    .line 242
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    and-int/lit16 p0, p0, 0xfc

    .line 247
    .line 248
    :goto_3
    shr-int/lit8 p0, p0, 0x2

    .line 249
    .line 250
    or-int/2addr p0, v0

    .line 251
    goto :goto_5

    .line 252
    :cond_8
    add-int/lit8 v0, p0, 0x5

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    and-int/lit8 v0, v0, 0x7

    .line 259
    .line 260
    shl-int/lit8 v0, v0, 0x4

    .line 261
    .line 262
    add-int/lit8 p0, p0, 0x6

    .line 263
    .line 264
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    :goto_4
    and-int/lit8 p0, p0, 0x3c

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_9
    add-int/lit8 v0, p0, 0x4

    .line 272
    .line 273
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    and-int/lit8 v0, v0, 0x7

    .line 278
    .line 279
    shl-int/lit8 v0, v0, 0x4

    .line 280
    .line 281
    add-int/lit8 p0, p0, 0x7

    .line 282
    .line 283
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    goto :goto_4

    .line 288
    :cond_a
    add-int/lit8 v0, p0, 0x4

    .line 289
    .line 290
    add-int/lit8 p0, p0, 0x5

    .line 291
    .line 292
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    and-int/lit8 p0, p0, 0x1

    .line 297
    .line 298
    shl-int/lit8 p0, p0, 0x6

    .line 299
    .line 300
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    and-int/lit16 p1, p1, 0xfc

    .line 305
    .line 306
    shr-int/lit8 p1, p1, 0x2

    .line 307
    .line 308
    or-int/2addr p0, p1

    .line 309
    :goto_5
    add-int/lit8 p0, p0, 0x1

    .line 310
    .line 311
    mul-int/lit8 p0, p0, 0x20

    .line 312
    .line 313
    return p0

    .line 314
    :cond_b
    return v4

    .line 315
    :cond_c
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgx;->zzb(Ljava/nio/ByteBuffer;)I

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    return p0

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public static synthetic zzI()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zztu;->zza:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static synthetic zzJ()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zztu;->zza:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private final zzS(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzk()Lcom/google/android/gms/internal/ads/zzck;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-wide/16 p1, 0x0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzG:J

    .line 22
    .line 23
    sub-long/2addr p1, v0

    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzl()Lcom/google/android/gms/internal/ads/zzbf;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbf;->zza:Lcom/google/android/gms/internal/ads/zzbf;

    .line 31
    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzm()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbd;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbd;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzto;->zzl()Lcom/google/android/gms/internal/ads/zzbf;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzto;->zzm()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbf;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbd;)Lcom/google/android/gms/internal/ads/zzbd;

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 63
    .line 64
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcm;

    .line 65
    .line 66
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcm;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzto;->zzl()Lcom/google/android/gms/internal/ads/zzbf;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzcm;->zzb(Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzcm;

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzto;->zzm()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzcm;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzcm;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzcm;->zza(J)Lcom/google/android/gms/internal/ads/zzcm;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcm;->zzd()Lcom/google/android/gms/internal/ads/zzcn;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzck;->zzb(Lcom/google/android/gms/internal/ads/zzcn;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method private final zzT(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzqx;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsc;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zztg;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztg;->zzf(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zztb;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzrd; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception v0

    .line 11
    move-object v9, v0

    .line 12
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    .line 13
    .line 14
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 15
    .line 16
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 17
    .line 18
    iget v6, p1, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 19
    .line 20
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsc;

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzto;->zzf()Lcom/google/android/gms/internal/ads/zzv;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzsc;-><init>(IIIIILcom/google/android/gms/internal/ads/zzv;ZLjava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzsd;->zza(Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    throw v1
.end method

.method private final zzU(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsf;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzX(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzc()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzg()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_4

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zze()Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztu;->zzW(Ljava/nio/ByteBuffer;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzX(J)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzck;->zzd(Ljava/nio/ByteBuffer;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztu;->zzW(Ljava/nio/ByteBuffer;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzX(J)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_1
    return-void
.end method

.method private final zzV()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsf;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzc()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zztu;->zzX(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    return v3

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzf()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zztu;->zzU(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzg()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    return v3

    .line 49
    :cond_2
    return v4

    .line 50
    :cond_3
    return v3
.end method

.method private final zzW(Ljava/nio/ByteBuffer;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_20

    .line 18
    .line 19
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1f

    .line 26
    .line 27
    const-wide/16 v1, 0x14

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    .line 40
    .line 41
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzv(JI)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    long-to-int v1, v1

    .line 46
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zztu;->zzaf()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    int-to-long v4, v1

    .line 51
    cmp-long v6, v2, v4

    .line 52
    .line 53
    if-gez v6, :cond_1f

    .line 54
    .line 55
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 56
    .line 57
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 62
    .line 63
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 64
    .line 65
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzto;->zzi()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    long-to-int v2, v2

    .line 90
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_1e

    .line 95
    .line 96
    if-ge v2, v1, :cond_1e

    .line 97
    .line 98
    const/high16 v13, 0x50000000

    .line 99
    .line 100
    const/high16 v14, 0x10000000

    .line 101
    .line 102
    const/16 v15, 0x16

    .line 103
    .line 104
    const/16 v3, 0x15

    .line 105
    .line 106
    const/4 v10, 0x4

    .line 107
    const/4 v11, 0x3

    .line 108
    const/4 v12, 0x2

    .line 109
    const/high16 v16, 0x4f000000

    .line 110
    .line 111
    const/high16 v17, -0x31000000

    .line 112
    .line 113
    const-wide v18, 0x41dfffffffc00000L    # 2.147483647E9

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    const-wide/high16 v20, -0x3e20000000000000L    # -2.147483648E9

    .line 119
    .line 120
    if-eq v6, v12, :cond_d

    .line 121
    .line 122
    if-eq v6, v11, :cond_c

    .line 123
    .line 124
    const/high16 v11, -0x40800000    # -1.0f

    .line 125
    .line 126
    if-eq v6, v10, :cond_b

    .line 127
    .line 128
    if-eq v6, v3, :cond_a

    .line 129
    .line 130
    if-eq v6, v15, :cond_9

    .line 131
    .line 132
    if-eq v6, v14, :cond_8

    .line 133
    .line 134
    if-eq v6, v13, :cond_7

    .line 135
    .line 136
    const/high16 v13, 0x60000000

    .line 137
    .line 138
    if-eq v6, v13, :cond_6

    .line 139
    .line 140
    const-wide/16 v22, 0x0

    .line 141
    .line 142
    const/high16 v13, 0x70000000

    .line 143
    .line 144
    if-eq v6, v13, :cond_5

    .line 145
    .line 146
    const/high16 v13, 0x71000000

    .line 147
    .line 148
    if-eq v6, v13, :cond_3

    .line 149
    .line 150
    const/high16 v13, 0x72000000

    .line 151
    .line 152
    if-ne v6, v13, :cond_2

    .line 153
    .line 154
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 155
    .line 156
    .line 157
    move-result-wide v24

    .line 158
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->reverseBytes(J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v24

    .line 162
    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 163
    .line 164
    .line 165
    move-result-wide v26

    .line 166
    const-wide/high16 v28, -0x4010000000000000L    # -1.0

    .line 167
    .line 168
    const-wide/high16 v30, 0x3ff0000000000000L    # 1.0

    .line 169
    .line 170
    invoke-static/range {v26 .. v31}, Lcom/google/android/gms/internal/ads/zzfm;->zzm(DDD)D

    .line 171
    .line 172
    .line 173
    move-result-wide v14

    .line 174
    cmpg-double v11, v14, v22

    .line 175
    .line 176
    if-gez v11, :cond_1

    .line 177
    .line 178
    :goto_2
    neg-double v14, v14

    .line 179
    mul-double v14, v14, v20

    .line 180
    .line 181
    :goto_3
    double-to-int v11, v14

    .line 182
    goto/16 :goto_8

    .line 183
    .line 184
    :cond_1
    mul-double v14, v14, v18

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 190
    .line 191
    .line 192
    throw v1

    .line 193
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    invoke-static {v14}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    const/high16 v15, 0x3f800000    # 1.0f

    .line 206
    .line 207
    invoke-static {v14, v15}, Ljava/lang/Math;->min(FF)F

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    invoke-static {v11, v14}, Ljava/lang/Math;->max(FF)F

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    const/4 v14, 0x0

    .line 216
    cmpg-float v14, v11, v14

    .line 217
    .line 218
    if-gez v14, :cond_4

    .line 219
    .line 220
    :goto_4
    neg-float v11, v11

    .line 221
    mul-float v11, v11, v17

    .line 222
    .line 223
    :goto_5
    float-to-int v11, v11

    .line 224
    goto/16 :goto_8

    .line 225
    .line 226
    :cond_4
    mul-float v11, v11, v16

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 230
    .line 231
    .line 232
    move-result-wide v25

    .line 233
    const-wide/high16 v27, -0x4010000000000000L    # -1.0

    .line 234
    .line 235
    const-wide/high16 v29, 0x3ff0000000000000L    # 1.0

    .line 236
    .line 237
    invoke-static/range {v25 .. v30}, Lcom/google/android/gms/internal/ads/zzfm;->zzm(DDD)D

    .line 238
    .line 239
    .line 240
    move-result-wide v14

    .line 241
    cmpg-double v11, v14, v22

    .line 242
    .line 243
    if-gez v11, :cond_1

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    and-int/lit16 v11, v11, 0xff

    .line 251
    .line 252
    shl-int/lit8 v11, v11, 0x18

    .line 253
    .line 254
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    and-int/lit16 v14, v14, 0xff

    .line 259
    .line 260
    shl-int/lit8 v14, v14, 0x10

    .line 261
    .line 262
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    and-int/lit16 v15, v15, 0xff

    .line 267
    .line 268
    shl-int/lit8 v15, v15, 0x8

    .line 269
    .line 270
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    and-int/lit16 v13, v13, 0xff

    .line 275
    .line 276
    or-int/2addr v11, v14

    .line 277
    or-int/2addr v11, v15

    .line 278
    :goto_6
    or-int/2addr v11, v13

    .line 279
    goto/16 :goto_8

    .line 280
    .line 281
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    and-int/lit16 v11, v11, 0xff

    .line 286
    .line 287
    shl-int/lit8 v11, v11, 0x18

    .line 288
    .line 289
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    and-int/lit16 v13, v13, 0xff

    .line 294
    .line 295
    shl-int/lit8 v13, v13, 0x10

    .line 296
    .line 297
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 298
    .line 299
    .line 300
    move-result v14

    .line 301
    and-int/lit16 v14, v14, 0xff

    .line 302
    .line 303
    shl-int/lit8 v14, v14, 0x8

    .line 304
    .line 305
    :goto_7
    or-int/2addr v11, v13

    .line 306
    or-int/2addr v11, v14

    .line 307
    goto/16 :goto_8

    .line 308
    .line 309
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    and-int/lit16 v11, v11, 0xff

    .line 314
    .line 315
    shl-int/lit8 v11, v11, 0x18

    .line 316
    .line 317
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 318
    .line 319
    .line 320
    move-result v13

    .line 321
    and-int/lit16 v13, v13, 0xff

    .line 322
    .line 323
    shl-int/lit8 v13, v13, 0x10

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    and-int/lit16 v11, v11, 0xff

    .line 331
    .line 332
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    and-int/lit16 v13, v13, 0xff

    .line 337
    .line 338
    shl-int/lit8 v13, v13, 0x8

    .line 339
    .line 340
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    and-int/lit16 v14, v14, 0xff

    .line 345
    .line 346
    shl-int/lit8 v14, v14, 0x10

    .line 347
    .line 348
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 349
    .line 350
    .line 351
    move-result v15

    .line 352
    and-int/lit16 v15, v15, 0xff

    .line 353
    .line 354
    shl-int/lit8 v15, v15, 0x18

    .line 355
    .line 356
    or-int/2addr v11, v13

    .line 357
    or-int/2addr v11, v14

    .line 358
    or-int/2addr v11, v15

    .line 359
    goto :goto_8

    .line 360
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    and-int/lit16 v11, v11, 0xff

    .line 365
    .line 366
    shl-int/lit8 v11, v11, 0x8

    .line 367
    .line 368
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    and-int/lit16 v13, v13, 0xff

    .line 373
    .line 374
    shl-int/lit8 v13, v13, 0x10

    .line 375
    .line 376
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    and-int/lit16 v14, v14, 0xff

    .line 381
    .line 382
    shl-int/lit8 v14, v14, 0x18

    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_b
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    const/high16 v14, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-static {v13, v14}, Ljava/lang/Math;->min(FF)F

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    invoke-static {v11, v13}, Ljava/lang/Math;->max(FF)F

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    const/4 v13, 0x0

    .line 400
    cmpg-float v13, v11, v13

    .line 401
    .line 402
    if-gez v13, :cond_4

    .line 403
    .line 404
    goto/16 :goto_4

    .line 405
    .line 406
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 407
    .line 408
    .line 409
    move-result v11

    .line 410
    and-int/lit16 v11, v11, 0xff

    .line 411
    .line 412
    shl-int/lit8 v11, v11, 0x18

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    and-int/lit16 v11, v11, 0xff

    .line 420
    .line 421
    shl-int/lit8 v11, v11, 0x10

    .line 422
    .line 423
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    and-int/lit16 v13, v13, 0xff

    .line 428
    .line 429
    shl-int/lit8 v13, v13, 0x18

    .line 430
    .line 431
    goto/16 :goto_6

    .line 432
    .line 433
    :goto_8
    int-to-long v13, v11

    .line 434
    move-wide/from16 v25, v4

    .line 435
    .line 436
    int-to-long v3, v2

    .line 437
    mul-long/2addr v13, v3

    .line 438
    div-long v13, v13, v25

    .line 439
    .line 440
    long-to-int v3, v13

    .line 441
    if-eq v6, v12, :cond_1c

    .line 442
    .line 443
    const/4 v4, 0x3

    .line 444
    if-eq v6, v4, :cond_1b

    .line 445
    .line 446
    if-eq v6, v10, :cond_19

    .line 447
    .line 448
    const/16 v5, 0x15

    .line 449
    .line 450
    if-eq v6, v5, :cond_18

    .line 451
    .line 452
    const/16 v4, 0x16

    .line 453
    .line 454
    if-eq v6, v4, :cond_17

    .line 455
    .line 456
    const/high16 v13, 0x10000000

    .line 457
    .line 458
    if-eq v6, v13, :cond_16

    .line 459
    .line 460
    const/high16 v4, 0x50000000

    .line 461
    .line 462
    if-eq v6, v4, :cond_15

    .line 463
    .line 464
    const/high16 v13, 0x60000000

    .line 465
    .line 466
    if-eq v6, v13, :cond_14

    .line 467
    .line 468
    const/high16 v13, 0x70000000

    .line 469
    .line 470
    if-eq v6, v13, :cond_12

    .line 471
    .line 472
    const/high16 v13, 0x71000000

    .line 473
    .line 474
    if-eq v6, v13, :cond_10

    .line 475
    .line 476
    const/high16 v13, 0x72000000

    .line 477
    .line 478
    if-ne v6, v13, :cond_f

    .line 479
    .line 480
    if-gez v3, :cond_e

    .line 481
    .line 482
    int-to-double v3, v3

    .line 483
    neg-double v3, v3

    .line 484
    div-double v3, v3, v20

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_e
    int-to-double v3, v3

    .line 488
    div-double v3, v3, v18

    .line 489
    .line 490
    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 491
    .line 492
    .line 493
    move-result-wide v3

    .line 494
    invoke-static {v3, v4}, Ljava/lang/Long;->reverseBytes(J)J

    .line 495
    .line 496
    .line 497
    move-result-wide v3

    .line 498
    invoke-virtual {v8, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 499
    .line 500
    .line 501
    goto/16 :goto_b

    .line 502
    .line 503
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 504
    .line 505
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 506
    .line 507
    .line 508
    throw v1

    .line 509
    :cond_10
    if-gez v3, :cond_11

    .line 510
    .line 511
    int-to-float v3, v3

    .line 512
    neg-float v3, v3

    .line 513
    div-float v3, v3, v17

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_11
    int-to-float v3, v3

    .line 517
    div-float v3, v3, v16

    .line 518
    .line 519
    :goto_a
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    invoke-static {v3}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 528
    .line 529
    .line 530
    goto/16 :goto_b

    .line 531
    .line 532
    :cond_12
    if-gez v3, :cond_13

    .line 533
    .line 534
    int-to-double v3, v3

    .line 535
    neg-double v3, v3

    .line 536
    div-double v3, v3, v20

    .line 537
    .line 538
    invoke-virtual {v8, v3, v4}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 539
    .line 540
    .line 541
    goto/16 :goto_b

    .line 542
    .line 543
    :cond_13
    int-to-double v3, v3

    .line 544
    div-double v3, v3, v18

    .line 545
    .line 546
    invoke-virtual {v8, v3, v4}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 547
    .line 548
    .line 549
    goto/16 :goto_b

    .line 550
    .line 551
    :cond_14
    shr-int/lit8 v4, v3, 0x8

    .line 552
    .line 553
    shr-int/lit8 v5, v3, 0x10

    .line 554
    .line 555
    shr-int/lit8 v10, v3, 0x18

    .line 556
    .line 557
    int-to-byte v3, v3

    .line 558
    int-to-byte v10, v10

    .line 559
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 560
    .line 561
    .line 562
    int-to-byte v5, v5

    .line 563
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 564
    .line 565
    .line 566
    int-to-byte v4, v4

    .line 567
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 571
    .line 572
    .line 573
    goto/16 :goto_b

    .line 574
    .line 575
    :cond_15
    shr-int/lit8 v4, v3, 0x8

    .line 576
    .line 577
    shr-int/lit8 v5, v3, 0x10

    .line 578
    .line 579
    shr-int/lit8 v3, v3, 0x18

    .line 580
    .line 581
    int-to-byte v3, v3

    .line 582
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 583
    .line 584
    .line 585
    int-to-byte v3, v5

    .line 586
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 587
    .line 588
    .line 589
    int-to-byte v3, v4

    .line 590
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 591
    .line 592
    .line 593
    goto :goto_b

    .line 594
    :cond_16
    shr-int/lit8 v4, v3, 0x10

    .line 595
    .line 596
    shr-int/lit8 v3, v3, 0x18

    .line 597
    .line 598
    int-to-byte v3, v3

    .line 599
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 600
    .line 601
    .line 602
    int-to-byte v3, v4

    .line 603
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 604
    .line 605
    .line 606
    goto :goto_b

    .line 607
    :cond_17
    shr-int/lit8 v4, v3, 0x8

    .line 608
    .line 609
    shr-int/lit8 v5, v3, 0x10

    .line 610
    .line 611
    shr-int/lit8 v10, v3, 0x18

    .line 612
    .line 613
    int-to-byte v3, v3

    .line 614
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 615
    .line 616
    .line 617
    int-to-byte v3, v4

    .line 618
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 619
    .line 620
    .line 621
    int-to-byte v3, v5

    .line 622
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 623
    .line 624
    .line 625
    int-to-byte v3, v10

    .line 626
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 627
    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_18
    shr-int/lit8 v4, v3, 0x8

    .line 631
    .line 632
    shr-int/lit8 v5, v3, 0x10

    .line 633
    .line 634
    shr-int/lit8 v3, v3, 0x18

    .line 635
    .line 636
    int-to-byte v4, v4

    .line 637
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 638
    .line 639
    .line 640
    int-to-byte v4, v5

    .line 641
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 642
    .line 643
    .line 644
    int-to-byte v3, v3

    .line 645
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 646
    .line 647
    .line 648
    goto :goto_b

    .line 649
    :cond_19
    if-gez v3, :cond_1a

    .line 650
    .line 651
    int-to-float v3, v3

    .line 652
    neg-float v3, v3

    .line 653
    div-float v3, v3, v17

    .line 654
    .line 655
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 656
    .line 657
    .line 658
    goto :goto_b

    .line 659
    :cond_1a
    int-to-float v3, v3

    .line 660
    div-float v3, v3, v16

    .line 661
    .line 662
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 663
    .line 664
    .line 665
    goto :goto_b

    .line 666
    :cond_1b
    shr-int/lit8 v3, v3, 0x18

    .line 667
    .line 668
    int-to-byte v3, v3

    .line 669
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 670
    .line 671
    .line 672
    goto :goto_b

    .line 673
    :cond_1c
    shr-int/lit8 v4, v3, 0x10

    .line 674
    .line 675
    shr-int/lit8 v3, v3, 0x18

    .line 676
    .line 677
    int-to-byte v4, v4

    .line 678
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 679
    .line 680
    .line 681
    int-to-byte v3, v3

    .line 682
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 683
    .line 684
    .line 685
    :goto_b
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    add-int v4, v9, v7

    .line 690
    .line 691
    if-ne v3, v4, :cond_1d

    .line 692
    .line 693
    add-int/lit8 v2, v2, 0x1

    .line 694
    .line 695
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 696
    .line 697
    .line 698
    move-result v9

    .line 699
    :cond_1d
    move-wide/from16 v4, v25

    .line 700
    .line 701
    goto/16 :goto_1

    .line 702
    .line 703
    :cond_1e
    move-object/from16 v1, p1

    .line 704
    .line 705
    invoke-virtual {v8, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 709
    .line 710
    .line 711
    move-object v1, v8

    .line 712
    goto :goto_c

    .line 713
    :cond_1f
    move-object/from16 v1, p1

    .line 714
    .line 715
    :goto_c
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 716
    .line 717
    :cond_20
    return-void
.end method

.method private final zzX(J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsf;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzk:Lcom/google/android/gms/internal/ads/zztt;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztt;->zzb()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_a

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 26
    .line 27
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    iget v7, p0, Lcom/google/android/gms/internal/ads/zztu;->zzJ:I

    .line 30
    .line 31
    invoke-interface {v5, v6, v7, p1, p2}, Lcom/google/android/gms/internal/ads/zzqx;->zzc(Ljava/nio/ByteBuffer;IJ)Z

    .line 32
    .line 33
    .line 34
    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzqw; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzU:J

    .line 40
    .line 41
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzk:Lcom/google/android/gms/internal/ads/zztt;

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zztt;->zzc()V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 47
    .line 48
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzB:J

    .line 55
    .line 56
    cmp-long p2, v5, v1

    .line 57
    .line 58
    if-lez p2, :cond_1

    .line 59
    .line 60
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zztu;->zzW:Z

    .line 61
    .line 62
    :cond_1
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    check-cast p2, Lcom/google/android/gms/internal/ads/zztz;

    .line 73
    .line 74
    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzA:J

    .line 83
    .line 84
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    sub-int/2addr v0, p2

    .line 91
    int-to-long v5, v0

    .line 92
    add-long/2addr v1, v5

    .line 93
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzA:J

    .line 94
    .line 95
    :cond_3
    if-eqz p1, :cond_a

    .line 96
    .line 97
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    if-ne p1, p2, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    move v3, v4

    .line 113
    :goto_0
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 114
    .line 115
    .line 116
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzB:J

    .line 117
    .line 118
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzC:I

    .line 119
    .line 120
    int-to-long v0, v0

    .line 121
    iget v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzJ:I

    .line 122
    .line 123
    int-to-long v2, v2

    .line 124
    mul-long/2addr v0, v2

    .line 125
    add-long/2addr v0, p1

    .line 126
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzB:J

    .line 127
    .line 128
    :cond_5
    const/4 p1, 0x0

    .line 129
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    return-void

    .line 132
    :catch_0
    move-exception p1

    .line 133
    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzqw;->zzb:Z

    .line 134
    .line 135
    if-eqz p2, :cond_7

    .line 136
    .line 137
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaf()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    cmp-long v0, v5, v1

    .line 142
    .line 143
    if-lez v0, :cond_6

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 147
    .line 148
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_7

    .line 153
    .line 154
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzY()V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    move v3, v4

    .line 159
    :goto_1
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzqw;->zza:I

    .line 160
    .line 161
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsf;

    .line 162
    .line 163
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 164
    .line 165
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzto;->zzf()Lcom/google/android/gms/internal/ads/zzv;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-direct {v0, p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzsf;-><init>(ILcom/google/android/gms/internal/ads/zzv;Z)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 173
    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzsd;->zza(Ljava/lang/Exception;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    if-nez p2, :cond_9

    .line 180
    .line 181
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzk:Lcom/google/android/gms/internal/ads/zztt;

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zztt;->zza(Ljava/lang/Exception;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_9
    throw v0

    .line 188
    :cond_a
    :goto_2
    return-void
.end method

.method private final zzY()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final zzZ()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 8
    .line 9
    iget v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzH:F

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzqx;->zzf(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private final zzaa()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 13
    .line 14
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzto;->zzg()Lcom/google/android/gms/internal/ads/zzv;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, -0x1

    .line 23
    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zztu;->zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrh;->zzb(Lcom/google/android/gms/internal/ads/zzra;)Lcom/google/android/gms/internal/ads/zzrg;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzqy; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzto;->zza(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzto;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    new-instance v2, Lcom/google/android/gms/internal/ads/zzsb;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzto;->zzf()Lcom/google/android/gms/internal/ads/zzv;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzsb;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzC()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final zzab(Lcom/google/android/gms/internal/ads/zzav;)V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/ads/zzts;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    move-wide v4, v2

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzts;-><init>(Lcom/google/android/gms/internal/ads/zzav;JJ[B)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzu:Lcom/google/android/gms/internal/ads/zzts;

    return-void

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    return-void
.end method

.method private final zzac(J)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzad()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zztp;->zzb(Lcom/google/android/gms/internal/ads/zzav;)Lcom/google/android/gms/internal/ads/zzav;

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v3, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzav;->zza:Lcom/google/android/gms/internal/ads/zzav;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzad()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzx:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zztp;->zzc(Z)Z

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    const/4 v1, 0x0

    .line 36
    :goto_2
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzx:Z

    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzh:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    new-instance v2, Lcom/google/android/gms/internal/ads/zzts;

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaf()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzto;->zzc(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    const/4 v8, 0x0

    .line 59
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzts;-><init>(Lcom/google/android/gms/internal/ads/zzav;JJ[B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzS(J)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzx:Z

    .line 73
    .line 74
    check-cast p1, Lcom/google/android/gms/internal/ads/zztz;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzua;->zzaB()Lcom/google/android/gms/internal/ads/zzrw;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzrw;->zzh(Z)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method

.method private final zzad()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzf()Lcom/google/android/gms/internal/ads/zzv;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzK:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method private final zzae()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzaf()J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzA:J

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzto;->zzi()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-long v2, v2

    .line 18
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    const-wide/16 v4, -0x1

    .line 22
    .line 23
    add-long/2addr v0, v4

    .line 24
    div-long/2addr v0, v2

    .line 25
    return-wide v0

    .line 26
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzB:J

    .line 27
    .line 28
    return-wide v0
.end method

.method private final zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;
    .locals 1

    .line 1
    new-instance p2, Lcom/google/android/gms/internal/ads/zzqz;

    .line 2
    .line 3
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;-><init>(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzt:Lcom/google/android/gms/internal/ads/zzd;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;->zza(Lcom/google/android/gms/internal/ads/zzd;)Lcom/google/android/gms/internal/ads/zzqz;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzS:Landroid/media/AudioDeviceInfo;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzb(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzqz;

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzc(I)Lcom/google/android/gms/internal/ads/zzqz;

    .line 19
    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;->zze(I)Lcom/google/android/gms/internal/ads/zzqz;

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzT:I

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzd(I)Lcom/google/android/gms/internal/ads/zzqz;

    .line 28
    .line 29
    .line 30
    new-instance p1, Lcom/google/android/gms/internal/ads/zzra;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzra;-><init>(Lcom/google/android/gms/internal/ads/zzqz;[B)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method private final zzah()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzM:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzM:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzN:Z

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzd()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method private static zzai(I)I
    .locals 1

    const/4 v0, -0x1

    if-eqz p0, :cond_0

    if-eq p0, v0, :cond_0

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public final zzA(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzH:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzH:F

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzZ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final zzB()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzb()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final zzC()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzy:J

    .line 11
    .line 12
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzz:J

    .line 13
    .line 14
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzA:J

    .line 15
    .line 16
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzB:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzW:Z

    .line 20
    .line 21
    iput v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzC:I

    .line 22
    .line 23
    new-instance v4, Lcom/google/android/gms/internal/ads/zzts;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 26
    .line 27
    const-wide/16 v8, 0x0

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzts;-><init>(Lcom/google/android/gms/internal/ads/zzav;JJ[B)V

    .line 33
    .line 34
    .line 35
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 36
    .line 37
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzF:J

    .line 38
    .line 39
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzu:Lcom/google/android/gms/internal/ads/zzts;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztu;->zzh:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    iput v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzJ:I

    .line 49
    .line 50
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzK:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzM:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzL:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzN:Z

    .line 57
    .line 58
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzd:Lcom/google/android/gms/internal/ads/zzug;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzug;->zzr()V

    .line 61
    .line 62
    .line 63
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-direct {p0, v4, v5}, Lcom/google/android/gms/internal/ads/zztu;->zzS(J)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzi:Lcom/google/android/gms/internal/ads/zztl;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 78
    .line 79
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 80
    .line 81
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zztu;->zza:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 87
    .line 88
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zze()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 92
    .line 93
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzk:Lcom/google/android/gms/internal/ads/zztt;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztt;->zzc()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzj:Lcom/google/android/gms/internal/ads/zztt;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztt;->zzc()V

    .line 101
    .line 102
    .line 103
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzX:J

    .line 104
    .line 105
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzY:J

    .line 106
    .line 107
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzZ:Landroid/os/Handler;

    .line 108
    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-void
.end method

.method public final zzD()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzC()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzg:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lcom/google/android/gms/internal/ads/zzcp;

    .line 19
    .line 20
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzcp;->zzj()V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzcw;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcq;->zzj()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzf:Lcom/google/android/gms/internal/ads/zzuf;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcq;->zzj()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzck;->zzh()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    .line 44
    .line 45
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzV:Z

    .line 46
    .line 47
    return-void
.end method

.method public final zzE()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrh;->zze()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzG()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzY:J

    .line 2
    .line 3
    const-wide/32 v2, 0x493e0

    .line 4
    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/internal/ads/zztz;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzua;->zzaD(Z)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzY:J

    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final synthetic zzH()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lcom/google/android/gms/internal/ads/zztz;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzua;->zzaA(Lcom/google/android/gms/internal/ads/zzua;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final synthetic zzK()Lcom/google/android/gms/internal/ads/zztl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzi:Lcom/google/android/gms/internal/ads/zztl;

    return-object v0
.end method

.method public final synthetic zzL()Lcom/google/android/gms/internal/ads/zzsd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    return-object v0
.end method

.method public final synthetic zzM()Lcom/google/android/gms/internal/ads/zzto;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    return-object v0
.end method

.method public final synthetic zzN()Lcom/google/android/gms/internal/ads/zzqx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    return-object v0
.end method

.method public final synthetic zzO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzM:Z

    return v0
.end method

.method public final synthetic zzP(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzN:Z

    return-void
.end method

.method public final synthetic zzQ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    return v0
.end method

.method public final synthetic zzR()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzU:J

    return-wide v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzsd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzqh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzl:Lcom/google/android/gms/internal/ads/zzqh;

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzdp;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzrh;->zzd(Lcom/google/android/gms/internal/ads/zzdp;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zztu;->zze(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzv;)I
    .locals 6

    .line 1
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzK:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x2

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    if-eq v0, v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzJ(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    move v0, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v2

    .line 28
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 29
    .line 30
    const/4 v5, -0x1

    .line 31
    invoke-direct {p0, p1, v5}, Lcom/google/android/gms/internal/ads/zztu;->zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzrh;->zza(Lcom/google/android/gms/internal/ads/zzra;)Lcom/google/android/gms/internal/ads/zzrc;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzrc;->zzd:I

    .line 40
    .line 41
    if-eq p1, v3, :cond_3

    .line 42
    .line 43
    if-eq p1, v4, :cond_1

    .line 44
    .line 45
    return v2

    .line 46
    :cond_1
    if-eqz v0, :cond_2

    .line 47
    .line 48
    return v3

    .line 49
    :cond_2
    return v4

    .line 50
    :cond_3
    return v3
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzqu;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzV:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/zztu;->zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzrh;->zza(Lcom/google/android/gms/internal/ads/zzra;)Lcom/google/android/gms/internal/ads/zzrc;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lcom/google/android/gms/internal/ads/zzqt;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzqt;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzrc;->zza:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzqt;->zza(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 27
    .line 28
    .line 29
    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzrc;->zzb:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzqt;->zzb(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/zzrc;->zzc:Z

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzqt;->zzc(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzqt;->zzd()Lcom/google/android/gms/internal/ads/zzqu;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public final zzg(Z)J
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzE:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzqx;->zzk()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaf()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzto;->zzc(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzh:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/google/android/gms/internal/ads/zzts;

    .line 46
    .line 47
    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzts;->zzc:J

    .line 48
    .line 49
    cmp-long v2, v0, v2

    .line 50
    .line 51
    if-ltz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/google/android/gms/internal/ads/zzts;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 63
    .line 64
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzts;->zzc:J

    .line 65
    .line 66
    sub-long/2addr v0, v3

    .line 67
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzts;->zza:Lcom/google/android/gms/internal/ads/zzav;

    .line 68
    .line 69
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzav;->zzb:F

    .line 70
    .line 71
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzy(JF)J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zztp;->zzd(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 88
    .line 89
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzts;->zzb:J

    .line 90
    .line 91
    add-long/2addr v4, v0

    .line 92
    sub-long/2addr v0, v2

    .line 93
    iput-wide v0, p1, Lcom/google/android/gms/internal/ads/zzts;->zzd:J

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzv:Lcom/google/android/gms/internal/ads/zzts;

    .line 97
    .line 98
    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzts;->zzb:J

    .line 99
    .line 100
    add-long/2addr v0, v2

    .line 101
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzts;->zzd:J

    .line 102
    .line 103
    add-long v4, v0, v2

    .line 104
    .line 105
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztp;->zze()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 112
    .line 113
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzto;->zzc(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    add-long/2addr v4, v2

    .line 118
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzX:J

    .line 119
    .line 120
    cmp-long p1, v0, v2

    .line 121
    .line 122
    if-lez p1, :cond_4

    .line 123
    .line 124
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 125
    .line 126
    sub-long v2, v0, v2

    .line 127
    .line 128
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzto;->zzc(J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzX:J

    .line 133
    .line 134
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzY:J

    .line 135
    .line 136
    add-long/2addr v0, v2

    .line 137
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzY:J

    .line 138
    .line 139
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzZ:Landroid/os/Handler;

    .line 140
    .line 141
    if-nez p1, :cond_3

    .line 142
    .line 143
    new-instance p1, Landroid/os/Handler;

    .line 144
    .line 145
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzZ:Landroid/os/Handler;

    .line 153
    .line 154
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzZ:Landroid/os/Handler;

    .line 155
    .line 156
    const/4 v0, 0x0

    .line 157
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzZ:Landroid/os/Handler;

    .line 161
    .line 162
    new-instance v0, Lcom/google/android/gms/internal/ads/zztr;

    .line 163
    .line 164
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zztr;-><init>(Lcom/google/android/gms/internal/ads/zztu;)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v1, 0x64

    .line 168
    .line 169
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 170
    .line 171
    .line 172
    :cond_4
    return-wide v4

    .line 173
    :cond_5
    :goto_2
    const-wide/high16 v0, -0x8000000000000000L

    .line 174
    .line 175
    return-wide v0
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzrz;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsb;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzr:Lcom/google/android/gms/internal/ads/zzre;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzb:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/ads/zztq;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zztq;-><init>(Lcom/google/android/gms/internal/ads/zztu;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzr:Lcom/google/android/gms/internal/ads/zzre;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzrh;->zzc(Lcom/google/android/gms/internal/ads/zzre;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzrz;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 22
    .line 23
    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "audio/raw"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, -0x1

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget v0, v3, Lcom/google/android/gms/internal/ads/zzv;->zzK:I

    .line 35
    .line 36
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 41
    .line 42
    .line 43
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzI(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    mul-int/2addr v4, v2

    .line 50
    new-instance v5, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 51
    .line 52
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztu;->zzg:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgwq;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 58
    .line 59
    .line 60
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztu;->zze:Lcom/google/android/gms/internal/ads/zzcw;

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztu;->zzaa:Lcom/google/android/gms/internal/ads/zztp;

    .line 66
    .line 67
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zztp;->zza()[Lcom/google/android/gms/internal/ads/zzcp;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgwq;->zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 72
    .line 73
    .line 74
    new-instance v6, Lcom/google/android/gms/internal/ads/zzck;

    .line 75
    .line 76
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/ads/zzck;-><init>(Lcom/google/android/gms/internal/ads/zzgwt;)V

    .line 81
    .line 82
    .line 83
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 84
    .line 85
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzck;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztu;->zzp:Lcom/google/android/gms/internal/ads/zzck;

    .line 92
    .line 93
    :cond_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzd:Lcom/google/android/gms/internal/ads/zzug;

    .line 94
    .line 95
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzv;->zzL:I

    .line 96
    .line 97
    iget v8, v3, Lcom/google/android/gms/internal/ads/zzv;->zzM:I

    .line 98
    .line 99
    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/ads/zzug;->zzq(II)V

    .line 100
    .line 101
    .line 102
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztu;->zzc:Lcom/google/android/gms/internal/ads/zztj;

    .line 103
    .line 104
    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zzrz;->zzc:Lcom/google/android/gms/internal/ads/zzham;

    .line 105
    .line 106
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/ads/zztj;->zzq(Lcom/google/android/gms/internal/ads/zzham;)V

    .line 107
    .line 108
    .line 109
    new-instance v5, Lcom/google/android/gms/internal/ads/zzcl;

    .line 110
    .line 111
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 112
    .line 113
    invoke-direct {v5, v7, v2, v0}, Lcom/google/android/gms/internal/ads/zzcl;-><init>(III)V

    .line 114
    .line 115
    .line 116
    :try_start_0
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzck;->zza(Lcom/google/android/gms/internal/ads/zzcl;)Lcom/google/android/gms/internal/ads/zzcl;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzco; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 125
    .line 126
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzJ(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 127
    .line 128
    .line 129
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzcl;->zzb:I

    .line 130
    .line 131
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 132
    .line 133
    .line 134
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzcl;->zzc:I

    .line 135
    .line 136
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 137
    .line 138
    .line 139
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 140
    .line 141
    if-ne v0, v7, :cond_2

    .line 142
    .line 143
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzv;->zzI:I

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    move v7, v1

    .line 147
    :goto_0
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzH(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzfm;->zzI(I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    mul-int/2addr v5, v0

    .line 159
    move-object v8, v6

    .line 160
    move v6, v5

    .line 161
    move v5, v4

    .line 162
    move-object v4, v2

    .line 163
    goto :goto_1

    .line 164
    :catch_0
    move-exception v0

    .line 165
    move-object p1, v0

    .line 166
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsb;

    .line 167
    .line 168
    invoke-direct {v0, p1, v3}, Lcom/google/android/gms/internal/ads/zzsb;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_3
    new-instance v6, Lcom/google/android/gms/internal/ads/zzck;

    .line 173
    .line 174
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/zzck;-><init>(Lcom/google/android/gms/internal/ads/zzgwt;)V

    .line 179
    .line 180
    .line 181
    move v5, v1

    .line 182
    move-object v4, v3

    .line 183
    move-object v8, v6

    .line 184
    move v6, v5

    .line 185
    :goto_1
    invoke-direct {p0, v4, v1}, Lcom/google/android/gms/internal/ads/zztu;->zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 190
    .line 191
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzrh;->zzb(Lcom/google/android/gms/internal/ads/zzra;)Lcom/google/android/gms/internal/ads/zzrg;

    .line 192
    .line 193
    .line 194
    move-result-object v7
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzqy; {:try_start_1 .. :try_end_1} :catch_1

    .line 195
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 196
    .line 197
    const/4 v2, 0x0

    .line 198
    if-eqz v1, :cond_7

    .line 199
    .line 200
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 201
    .line 202
    if-eqz v1, :cond_6

    .line 203
    .line 204
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzV:Z

    .line 205
    .line 206
    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzrz;->zzd:Lcom/google/android/gms/internal/ads/zzbf;

    .line 207
    .line 208
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzrz;->zze:Lcom/google/android/gms/internal/ads/zzxl;

    .line 209
    .line 210
    new-instance v2, Lcom/google/android/gms/internal/ads/zzto;

    .line 211
    .line 212
    if-eqz p1, :cond_4

    .line 213
    .line 214
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzxl;->zza:Ljava/lang/Object;

    .line 215
    .line 216
    :goto_2
    move-object v10, p1

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    const/4 p1, 0x0

    .line 219
    goto :goto_2

    .line 220
    :goto_3
    const/4 v11, 0x0

    .line 221
    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/zzto;-><init>(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;IILcom/google/android/gms/internal/ads/zzrg;Lcom/google/android/gms/internal/ads/zzck;Lcom/google/android/gms/internal/ads/zzbf;Ljava/lang/Object;[B)V

    .line 222
    .line 223
    .line 224
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_5

    .line 229
    .line 230
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 231
    .line 232
    return-void

    .line 233
    :cond_5
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 234
    .line 235
    return-void

    .line 236
    :cond_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsb;

    .line 237
    .line 238
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    add-int/lit8 v1, v1, 0x2a

    .line 249
    .line 250
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const-string v1, "Invalid output channel config (isOffload=false)"

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzra;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 263
    .line 264
    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzsb;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :cond_7
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsb;

    .line 269
    .line 270
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    new-instance v2, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    add-int/lit8 v1, v1, 0x24

    .line 281
    .line 282
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 283
    .line 284
    .line 285
    const-string v1, "Invalid output encoding (isOffload=false)"

    .line 286
    .line 287
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzra;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 295
    .line 296
    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzsb;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 297
    .line 298
    .line 299
    throw p1

    .line 300
    :catch_1
    move-exception v0

    .line 301
    move-object p1, v0

    .line 302
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsb;

    .line 303
    .line 304
    invoke-direct {v0, p1, v3}, Lcom/google/android/gms/internal/ads/zzsb;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 305
    .line 306
    .line 307
    throw v0
.end method

.method public final zzi()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zza()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final zzj()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    return-void
.end method

.method public final zzk(Ljava/nio/ByteBuffer;JI)Z
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsc;,
            Lcom/google/android/gms/internal/ads/zzsf;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v3, p2

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-ne v2, v0, :cond_1

    .line 16
    .line 17
    :cond_0
    move v0, v6

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v7

    .line 20
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 24
    .line 25
    const/4 v8, -0x1

    .line 26
    const/4 v9, 0x0

    .line 27
    if-eqz v0, :cond_6

    .line 28
    .line 29
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzV()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return v7

    .line 36
    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 47
    .line 48
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzto;->zzg()Lcom/google/android/gms/internal/ads/zzv;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    invoke-direct {v1, v10, v8}, Lcom/google/android/gms/internal/ads/zztu;->zzag(Lcom/google/android/gms/internal/ads/zzv;I)Lcom/google/android/gms/internal/ads/zzra;

    .line 53
    .line 54
    .line 55
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 56
    .line 57
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzrg;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzah()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzn()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    return v7

    .line 77
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzC()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 82
    .line 83
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 84
    .line 85
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 86
    .line 87
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_1
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztu;->zzac(J)V

    .line 103
    .line 104
    .line 105
    :cond_6
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_10

    .line 110
    .line 111
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzj:Lcom/google/android/gms/internal/ads/zztt;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztt;->zzb()Z

    .line 114
    .line 115
    .line 116
    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_0 .. :try_end_0} :catch_1

    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    return v7

    .line 120
    :cond_7
    :try_start_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zztu;->zzT(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzqx;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_1 .. :try_end_1} :catch_0

    .line 130
    goto :goto_5

    .line 131
    :catch_0
    move-exception v0

    .line 132
    move-object v10, v0

    .line 133
    :try_start_2
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 140
    .line 141
    :goto_2
    const v11, 0xf4240

    .line 142
    .line 143
    .line 144
    if-le v0, v11, :cond_f

    .line 145
    .line 146
    shr-int/lit8 v0, v0, 0x1

    .line 147
    .line 148
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 149
    .line 150
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzto;->zzi()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-eq v11, v8, :cond_8

    .line 155
    .line 156
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 157
    .line 158
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzto;->zzi()I

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    goto :goto_3

    .line 163
    :catch_1
    move-exception v0

    .line 164
    goto/16 :goto_6

    .line 165
    .line 166
    :cond_8
    move v11, v6

    .line 167
    :goto_3
    rem-int v12, v0, v11

    .line 168
    .line 169
    if-eqz v12, :cond_9

    .line 170
    .line 171
    sub-int/2addr v11, v12

    .line 172
    add-int/2addr v11, v0

    .line 173
    goto :goto_4

    .line 174
    :cond_9
    move v11, v0

    .line 175
    :goto_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v12, Lcom/google/android/gms/internal/ads/zzrf;

    .line 182
    .line 183
    invoke-direct {v12, v0, v9}, Lcom/google/android/gms/internal/ads/zzrf;-><init>(Lcom/google/android/gms/internal/ads/zzrg;[B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzrf;->zze(I)Lcom/google/android/gms/internal/ads/zzrf;

    .line 187
    .line 188
    .line 189
    new-instance v0, Lcom/google/android/gms/internal/ads/zzrg;

    .line 190
    .line 191
    invoke-direct {v0, v12, v9}, Lcom/google/android/gms/internal/ads/zzrg;-><init>(Lcom/google/android/gms/internal/ads/zzrf;[B)V
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_2 .. :try_end_2} :catch_1

    .line 192
    .line 193
    .line 194
    :try_start_3
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zztu;->zzT(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzqx;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 199
    .line 200
    invoke-virtual {v13, v0}, Lcom/google/android/gms/internal/ads/zzto;->zza(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzto;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;
    :try_end_3
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_3 .. :try_end_3} :catch_2

    .line 205
    .line 206
    move-object v0, v12

    .line 207
    :goto_5
    :try_start_4
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 208
    .line 209
    new-instance v0, Lcom/google/android/gms/internal/ads/zztl;

    .line 210
    .line 211
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 212
    .line 213
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-direct {v0, v1, v8, v9}, Lcom/google/android/gms/internal/ads/zztl;-><init>(Lcom/google/android/gms/internal/ads/zztu;Lcom/google/android/gms/internal/ads/zzrg;[B)V

    .line 218
    .line 219
    .line 220
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzi:Lcom/google/android/gms/internal/ads/zztl;

    .line 221
    .line 222
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 223
    .line 224
    invoke-interface {v8, v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzm(Lcom/google/android/gms/internal/ads/zzqv;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 228
    .line 229
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 238
    .line 239
    .line 240
    :cond_a
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzl:Lcom/google/android/gms/internal/ads/zzqh;

    .line 241
    .line 242
    if-eqz v0, :cond_b

    .line 243
    .line 244
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 245
    .line 246
    invoke-interface {v8, v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzn(Lcom/google/android/gms/internal/ads/zzqh;)V

    .line 247
    .line 248
    .line 249
    :cond_b
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzZ()V

    .line 250
    .line 251
    .line 252
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzR:Lcom/google/android/gms/internal/ads/zze;

    .line 253
    .line 254
    iget v0, v0, Lcom/google/android/gms/internal/ads/zze;->zza:I

    .line 255
    .line 256
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzS:Landroid/media/AudioDeviceInfo;

    .line 257
    .line 258
    if-eqz v0, :cond_c

    .line 259
    .line 260
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 261
    .line 262
    invoke-interface {v8, v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzo(Landroid/media/AudioDeviceInfo;)V

    .line 263
    .line 264
    .line 265
    :cond_c
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zztu;->zzE:Z

    .line 266
    .line 267
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 268
    .line 269
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzh()I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    iget v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 274
    .line 275
    iput v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 276
    .line 277
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 278
    .line 279
    if-eqz v10, :cond_10

    .line 280
    .line 281
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 282
    .line 283
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzto;->zzd()Lcom/google/android/gms/internal/ads/zzsa;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    check-cast v10, Lcom/google/android/gms/internal/ads/zztz;

    .line 288
    .line 289
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 290
    .line 291
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzua;->zzaB()Lcom/google/android/gms/internal/ads/zzrw;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzrw;->zzk(Lcom/google/android/gms/internal/ads/zzsa;)V

    .line 296
    .line 297
    .line 298
    if-eq v0, v8, :cond_10

    .line 299
    .line 300
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zztu;->zzQ:Z

    .line 301
    .line 302
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    new-instance v10, Lcom/google/android/gms/internal/ads/zzrf;

    .line 309
    .line 310
    invoke-direct {v10, v8, v9}, Lcom/google/android/gms/internal/ads/zzrf;-><init>(Lcom/google/android/gms/internal/ads/zzrg;[B)V

    .line 311
    .line 312
    .line 313
    iget v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 314
    .line 315
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzrf;->zzg(I)Lcom/google/android/gms/internal/ads/zzrf;

    .line 316
    .line 317
    .line 318
    new-instance v8, Lcom/google/android/gms/internal/ads/zzrg;

    .line 319
    .line 320
    invoke-direct {v8, v10, v9}, Lcom/google/android/gms/internal/ads/zzrg;-><init>(Lcom/google/android/gms/internal/ads/zzrf;[B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzto;->zza(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzto;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 328
    .line 329
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 330
    .line 331
    if-eqz v0, :cond_d

    .line 332
    .line 333
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    new-instance v10, Lcom/google/android/gms/internal/ads/zzrf;

    .line 338
    .line 339
    invoke-direct {v10, v8, v9}, Lcom/google/android/gms/internal/ads/zzrf;-><init>(Lcom/google/android/gms/internal/ads/zzrg;[B)V

    .line 340
    .line 341
    .line 342
    iget v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 343
    .line 344
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzrf;->zzg(I)Lcom/google/android/gms/internal/ads/zzrf;

    .line 345
    .line 346
    .line 347
    new-instance v8, Lcom/google/android/gms/internal/ads/zzrg;

    .line 348
    .line 349
    invoke-direct {v8, v10, v9}, Lcom/google/android/gms/internal/ads/zzrg;-><init>(Lcom/google/android/gms/internal/ads/zzrf;[B)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzto;->zza(Lcom/google/android/gms/internal/ads/zzrg;)Lcom/google/android/gms/internal/ads/zzto;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzn:Lcom/google/android/gms/internal/ads/zzto;

    .line 357
    .line 358
    :cond_d
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 359
    .line 360
    iget v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 361
    .line 362
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 363
    .line 364
    const/16 v11, 0x23

    .line 365
    .line 366
    if-lt v10, v11, :cond_e

    .line 367
    .line 368
    move-object v10, v0

    .line 369
    check-cast v10, Lcom/google/android/gms/internal/ads/zztz;

    .line 370
    .line 371
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 372
    .line 373
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzua;->zzaC()Lcom/google/android/gms/internal/ads/zzvi;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    if-eqz v11, :cond_e

    .line 378
    .line 379
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzua;->zzaC()Lcom/google/android/gms/internal/ads/zzvi;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzvi;->zza(I)V

    .line 384
    .line 385
    .line 386
    :cond_e
    check-cast v0, Lcom/google/android/gms/internal/ads/zztz;

    .line 387
    .line 388
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 389
    .line 390
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzua;->zzaB()Lcom/google/android/gms/internal/ads/zzrw;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzrw;->zzm(I)V

    .line 395
    .line 396
    .line 397
    goto :goto_7

    .line 398
    :catch_2
    move-exception v0

    .line 399
    invoke-virtual {v10, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    move v0, v11

    .line 403
    goto/16 :goto_2

    .line 404
    .line 405
    :cond_f
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzY()V

    .line 406
    .line 407
    .line 408
    throw v10
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_4 .. :try_end_4} :catch_1

    .line 409
    :goto_6
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztu;->zzj:Lcom/google/android/gms/internal/ads/zztt;

    .line 410
    .line 411
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zztt;->zza(Ljava/lang/Exception;)V

    .line 412
    .line 413
    .line 414
    return v7

    .line 415
    :cond_10
    :goto_7
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzj:Lcom/google/android/gms/internal/ads/zztt;

    .line 416
    .line 417
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztt;->zzc()V

    .line 418
    .line 419
    .line 420
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzE:Z

    .line 421
    .line 422
    const-wide/16 v10, 0x0

    .line 423
    .line 424
    if-eqz v0, :cond_11

    .line 425
    .line 426
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 427
    .line 428
    .line 429
    move-result-wide v12

    .line 430
    iput-wide v12, v1, Lcom/google/android/gms/internal/ads/zztu;->zzF:J

    .line 431
    .line 432
    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    .line 433
    .line 434
    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zztu;->zzE:Z

    .line 435
    .line 436
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztu;->zzac(J)V

    .line 437
    .line 438
    .line 439
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzO:Z

    .line 440
    .line 441
    if-eqz v0, :cond_11

    .line 442
    .line 443
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzi()V

    .line 444
    .line 445
    .line 446
    :cond_11
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 447
    .line 448
    if-nez v0, :cond_1e

    .line 449
    .line 450
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 455
    .line 456
    if-ne v0, v8, :cond_12

    .line 457
    .line 458
    move v0, v6

    .line 459
    goto :goto_8

    .line 460
    :cond_12
    move v0, v7

    .line 461
    :goto_8
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-nez v0, :cond_13

    .line 469
    .line 470
    return v6

    .line 471
    :cond_13
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 472
    .line 473
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-nez v0, :cond_15

    .line 478
    .line 479
    iget v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzC:I

    .line 480
    .line 481
    if-nez v0, :cond_15

    .line 482
    .line 483
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 484
    .line 485
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 490
    .line 491
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zztu;->zzF(ILjava/nio/ByteBuffer;)I

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    iput v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzC:I

    .line 496
    .line 497
    if-eqz v0, :cond_14

    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_14
    return v6

    .line 501
    :cond_15
    :goto_9
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzu:Lcom/google/android/gms/internal/ads/zzts;

    .line 502
    .line 503
    if-eqz v0, :cond_17

    .line 504
    .line 505
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzV()Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_16

    .line 510
    .line 511
    return v7

    .line 512
    :cond_16
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztu;->zzac(J)V

    .line 513
    .line 514
    .line 515
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zztu;->zzu:Lcom/google/android/gms/internal/ads/zzts;

    .line 516
    .line 517
    :cond_17
    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/zztu;->zzF:J

    .line 518
    .line 519
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 520
    .line 521
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    if-eqz v8, :cond_18

    .line 526
    .line 527
    iget-wide v14, v1, Lcom/google/android/gms/internal/ads/zztu;->zzy:J

    .line 528
    .line 529
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 530
    .line 531
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzto;->zzh()I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    move-wide/from16 v16, v10

    .line 536
    .line 537
    int-to-long v10, v8

    .line 538
    div-long/2addr v14, v10

    .line 539
    goto :goto_a

    .line 540
    :cond_18
    move-wide/from16 v16, v10

    .line 541
    .line 542
    iget-wide v14, v1, Lcom/google/android/gms/internal/ads/zztu;->zzz:J

    .line 543
    .line 544
    :goto_a
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zztu;->zzd:Lcom/google/android/gms/internal/ads/zzug;

    .line 545
    .line 546
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzug;->zzs()J

    .line 547
    .line 548
    .line 549
    move-result-wide v10

    .line 550
    sub-long/2addr v14, v10

    .line 551
    invoke-virtual {v0, v14, v15}, Lcom/google/android/gms/internal/ads/zzto;->zzb(J)J

    .line 552
    .line 553
    .line 554
    move-result-wide v10

    .line 555
    add-long/2addr v12, v10

    .line 556
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    .line 557
    .line 558
    if-nez v0, :cond_1a

    .line 559
    .line 560
    sub-long v10, v12, v3

    .line 561
    .line 562
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    .line 563
    .line 564
    .line 565
    move-result-wide v10

    .line 566
    const-wide/32 v14, 0x30d40

    .line 567
    .line 568
    .line 569
    cmp-long v0, v10, v14

    .line 570
    .line 571
    if-lez v0, :cond_1a

    .line 572
    .line 573
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 574
    .line 575
    if-eqz v0, :cond_19

    .line 576
    .line 577
    new-instance v8, Lcom/google/android/gms/internal/ads/zzse;

    .line 578
    .line 579
    invoke-direct {v8, v3, v4, v12, v13}, Lcom/google/android/gms/internal/ads/zzse;-><init>(JJ)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v0, v8}, Lcom/google/android/gms/internal/ads/zzsd;->zza(Ljava/lang/Exception;)V

    .line 583
    .line 584
    .line 585
    :cond_19
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    .line 586
    .line 587
    :cond_1a
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    .line 588
    .line 589
    if-eqz v0, :cond_1c

    .line 590
    .line 591
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzV()Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-nez v0, :cond_1b

    .line 596
    .line 597
    return v7

    .line 598
    :cond_1b
    sub-long v10, v3, v12

    .line 599
    .line 600
    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/zztu;->zzF:J

    .line 601
    .line 602
    add-long/2addr v12, v10

    .line 603
    iput-wide v12, v1, Lcom/google/android/gms/internal/ads/zztu;->zzF:J

    .line 604
    .line 605
    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zztu;->zzD:Z

    .line 606
    .line 607
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztu;->zzac(J)V

    .line 608
    .line 609
    .line 610
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzm:Lcom/google/android/gms/internal/ads/zzsd;

    .line 611
    .line 612
    if-eqz v0, :cond_1c

    .line 613
    .line 614
    cmp-long v8, v10, v16

    .line 615
    .line 616
    if-eqz v8, :cond_1c

    .line 617
    .line 618
    check-cast v0, Lcom/google/android/gms/internal/ads/zztz;

    .line 619
    .line 620
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztz;->zza:Lcom/google/android/gms/internal/ads/zzua;

    .line 621
    .line 622
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzua;->zzar()V

    .line 623
    .line 624
    .line 625
    :cond_1c
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 626
    .line 627
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eqz v0, :cond_1d

    .line 632
    .line 633
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzy:J

    .line 634
    .line 635
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    int-to-long v12, v0

    .line 640
    add-long/2addr v10, v12

    .line 641
    iput-wide v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzy:J

    .line 642
    .line 643
    goto :goto_b

    .line 644
    :cond_1d
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zztu;->zzz:J

    .line 645
    .line 646
    iget v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzC:I

    .line 647
    .line 648
    int-to-long v12, v0

    .line 649
    int-to-long v14, v5

    .line 650
    mul-long/2addr v12, v14

    .line 651
    add-long/2addr v12, v10

    .line 652
    iput-wide v12, v1, Lcom/google/android/gms/internal/ads/zztu;->zzz:J

    .line 653
    .line 654
    :goto_b
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 655
    .line 656
    iput v5, v1, Lcom/google/android/gms/internal/ads/zztu;->zzJ:I

    .line 657
    .line 658
    :cond_1e
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zztu;->zzU(J)V

    .line 659
    .line 660
    .line 661
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-nez v0, :cond_1f

    .line 668
    .line 669
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zztu;->zzI:Ljava/nio/ByteBuffer;

    .line 670
    .line 671
    iput v7, v1, Lcom/google/android/gms/internal/ads/zztu;->zzJ:I

    .line 672
    .line 673
    return v6

    .line 674
    :cond_1f
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 675
    .line 676
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzl()Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_20

    .line 681
    .line 682
    const-string v0, "DefaultAudioSink"

    .line 683
    .line 684
    const-string v2, "Resetting stalled audio output"

    .line 685
    .line 686
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zztu;->zzC()V

    .line 690
    .line 691
    .line 692
    return v6

    .line 693
    :cond_20
    return v7
.end method

.method public final zzl()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsf;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzL:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzV()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzah()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzL:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final zzm()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzL:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzn()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    return v2

    .line 21
    :cond_1
    return v1
.end method

.method public final zzn()Z
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzN:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaf()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 30
    .line 31
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzqx;->zzk()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzqx;->zzi()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfm;->zzv(JI)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-lez v0, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0

    .line 54
    :cond_1
    const/4 v0, 0x0

    .line 55
    return v0
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzav;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzav;

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzav;->zzb:F

    .line 4
    .line 5
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 6
    .line 7
    const/high16 v2, 0x41000000    # 8.0f

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v3, 0x3dcccccd    # 0.1f

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzav;->zzc:F

    .line 21
    .line 22
    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzav;-><init>(FF)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztu;->zzab(Lcom/google/android/gms/internal/ads/zzav;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final zzp()Lcom/google/android/gms/internal/ads/zzav;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    return-object v0
.end method

.method public final zzq(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzx:Z

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzw:Lcom/google/android/gms/internal/ads/zzav;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zztu;->zzab(Lcom/google/android/gms/internal/ads/zzav;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzr(Lcom/google/android/gms/internal/ads/zzd;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzt:Lcom/google/android/gms/internal/ads/zzd;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzd;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzt:Lcom/google/android/gms/internal/ads/zzd;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaa()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final zzs()Lcom/google/android/gms/internal/ads/zzqj;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzq:Lcom/google/android/gms/internal/ads/zzrh;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zztg;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zztg;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztg;->zzg()Lcom/google/android/gms/internal/ads/zzqj;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final zzt(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzQ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 6
    .line 7
    if-ne v0, p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzQ:Z

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 13
    .line 14
    if-eq v0, p1, :cond_1

    .line 15
    .line 16
    iput p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzP:I

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaa()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final zzu(Lcom/google/android/gms/internal/ads/zze;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzR:Lcom/google/android/gms/internal/ads/zze;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zze;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzR:Lcom/google/android/gms/internal/ads/zze;

    .line 15
    .line 16
    iget v0, v0, Lcom/google/android/gms/internal/ads/zze;->zza:I

    .line 17
    .line 18
    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzR:Lcom/google/android/gms/internal/ads/zze;

    .line 19
    .line 20
    return-void
.end method

.method public final zzv(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzS:Landroid/media/AudioDeviceInfo;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzqx;->zzo(Landroid/media/AudioDeviceInfo;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final zzw(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzT:I

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zztu;->zzai(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzT:I

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzaa()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final zzx(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzG:J

    return-void
.end method

.method public final zzy()J
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztu;->zzae()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zze()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzqx;->zzj()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzto;->zzc(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqx;->zzj()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztu;->zzo:Lcom/google/android/gms/internal/ads/zzto;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzto;->zzj()Lcom/google/android/gms/internal/ads/zzrg;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 47
    .line 48
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzage;->zzf(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const v3, -0x7fffffff

    .line 53
    .line 54
    .line 55
    if-eq v0, v3, :cond_2

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v3, 0x0

    .line 60
    :goto_0
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 61
    .line 62
    .line 63
    int-to-long v5, v0

    .line 64
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 65
    .line 66
    const-wide/32 v3, 0xf4240

    .line 67
    .line 68
    .line 69
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    return-wide v0
.end method

.method public final zzz(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztu;->zzs:Lcom/google/android/gms/internal/ads/zzqx;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzqx;->zzg()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
