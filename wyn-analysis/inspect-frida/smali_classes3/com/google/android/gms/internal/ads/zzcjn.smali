.class public final Lcom/google/android/gms/internal/ads/zzcjn;
.super Lcom/google/android/gms/internal/ads/zzcjh;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzip;


# static fields
.field private static final zzo:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/ads/zzcht;

.field private zzf:Z

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcjm;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzciq;

.field private zzi:Ljava/nio/ByteBuffer;

.field private zzj:Z

.field private final zzk:Ljava/lang/Object;

.field private final zzl:Ljava/lang/String;

.field private final zzm:I

.field private zzn:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcjn;->zzo:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/internal/ads/zzcht;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcjh;-><init>(Lcom/google/android/gms/internal/ads/zzchu;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zze:Lcom/google/android/gms/internal/ads/zzcht;

    .line 5
    .line 6
    new-instance p2, Lcom/google/android/gms/internal/ads/zzcjm;

    .line 7
    .line 8
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzcjm;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzg:Lcom/google/android/gms/internal/ads/zzcjm;

    .line 12
    .line 13
    new-instance p2, Lcom/google/android/gms/internal/ads/zzciq;

    .line 14
    .line 15
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzciq;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzh:Lcom/google/android/gms/internal/ads/zzciq;

    .line 19
    .line 20
    new-instance p2, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzk:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzchu;->zzn()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgtp;->zzd(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgtp;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v0, ""

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzgtp;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Ljava/lang/String;

    .line 46
    .line 47
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzl:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzchu;->zzp()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    :goto_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzm:I

    .line 58
    .line 59
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcjn;->zzo:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static zzr()I
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcjn;->zzo:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final zzv(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-static {p0, v0}, LH6/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "cache:"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final zzx()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzg:Lcom/google/android/gms/internal/ads/zzcjm;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcjm;->zza()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v6, v0

    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzh:Lcom/google/android/gms/internal/ads/zzciq;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzciq;->zza(Ljava/nio/ByteBuffer;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    long-to-int v0, v0

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    int-to-float v1, v5

    .line 24
    int-to-float v2, v6

    .line 25
    int-to-float v3, v0

    .line 26
    div-float/2addr v1, v2

    .line 27
    mul-float/2addr v1, v3

    .line 28
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzP()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzQ()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzcjn;->zzv(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    int-to-long v7, v1

    .line 47
    if-lez v1, :cond_0

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    :goto_0
    move v11, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/4 v1, 0x0

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    int-to-long v9, v0

    .line 55
    move-object v2, p0

    .line 56
    invoke-virtual/range {v2 .. v13}, Lcom/google/android/gms/internal/ads/zzcjh;->zzn(Ljava/lang/String;Ljava/lang/String;IIJJZII)V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final release()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcjn;->zzo:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzhv;Z)V
    .locals 0

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzhv;Z)V
    .locals 0

    .line 1
    instance-of p2, p1, Lcom/google/android/gms/internal/ads/zzic;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzg:Lcom/google/android/gms/internal/ads/zzcjm;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzic;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzcjm;->zzb(Lcom/google/android/gms/internal/ads/zzic;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzhv;ZI)V
    .locals 0

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzhv;Z)V
    .locals 0

    return-void
.end method

.method public final zze(Ljava/lang/String;)Z
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "error"

    .line 8
    .line 9
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcjn;->zzv(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const-string v0, " bytes"

    .line 14
    .line 15
    const-string v5, "Precache abort at "

    .line 16
    .line 17
    const-string v6, " sec"

    .line 18
    .line 19
    const-string v7, "Timeout exceeded. Limit: "

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    :try_start_0
    new-instance v10, Lcom/google/android/gms/internal/ads/zzhy;

    .line 23
    .line 24
    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzhy;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzcjh;->zzb:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzhy;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhy;

    .line 30
    .line 31
    .line 32
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zze:Lcom/google/android/gms/internal/ads/zzcht;

    .line 33
    .line 34
    iget v12, v11, Lcom/google/android/gms/internal/ads/zzcht;->zzd:I

    .line 35
    .line 36
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/zzhy;->zzc(I)Lcom/google/android/gms/internal/ads/zzhy;

    .line 37
    .line 38
    .line 39
    iget v12, v11, Lcom/google/android/gms/internal/ads/zzcht;->zze:I

    .line 40
    .line 41
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/zzhy;->zzd(I)Lcom/google/android/gms/internal/ads/zzhy;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzhy;->zze(Z)Lcom/google/android/gms/internal/ads/zzhy;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/ads/zzhy;->zzf(Lcom/google/android/gms/internal/ads/zzip;)Lcom/google/android/gms/internal/ads/zzhy;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzhy;->zzg()Lcom/google/android/gms/internal/ads/zzic;

    .line 51
    .line 52
    .line 53
    move-result-object v15

    .line 54
    iget-boolean v10, v11, Lcom/google/android/gms/internal/ads/zzcht;->zzi:Z

    .line 55
    .line 56
    if-eqz v10, :cond_0

    .line 57
    .line 58
    new-instance v13, Lcom/google/android/gms/internal/ads/zzcio;

    .line 59
    .line 60
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzcjh;->zza:Landroid/content/Context;

    .line 61
    .line 62
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzl:Ljava/lang/String;

    .line 63
    .line 64
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzm:I

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const/16 v19, 0x0

    .line 69
    .line 70
    move-object/from16 v16, v10

    .line 71
    .line 72
    move/from16 v17, v12

    .line 73
    .line 74
    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/internal/ads/zzcio;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhr;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzip;Lcom/google/android/gms/internal/ads/zzcin;)V

    .line 75
    .line 76
    .line 77
    move-object v15, v13

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    move-object/from16 v23, v3

    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_0
    :goto_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object v17

    .line 88
    new-instance v16, Lcom/google/android/gms/internal/ads/zzhv;

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const-wide/16 v18, 0x0

    .line 93
    .line 94
    const-wide/16 v20, -0x1

    .line 95
    .line 96
    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/internal/ads/zzhv;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    move-object/from16 v10, v16

    .line 100
    .line 101
    invoke-interface {v15, v10}, Lcom/google/android/gms/internal/ads/zzhr;->zzb(Lcom/google/android/gms/internal/ads/zzhv;)J

    .line 102
    .line 103
    .line 104
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzcjh;->zzc:Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Lcom/google/android/gms/internal/ads/zzchu;

    .line 111
    .line 112
    if-eqz v10, :cond_1

    .line 113
    .line 114
    invoke-interface {v10, v4, v1}, Lcom/google/android/gms/internal/ads/zzchu;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcjh;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    sget-object v10, LC6/n;->D:LC6/n;

    .line 118
    .line 119
    iget-object v10, v10, LC6/n;->k:Ln7/b;

    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v12

    .line 128
    sget-object v10, Lcom/google/android/gms/internal/ads/zzbix;->zzar:Lcom/google/android/gms/internal/ads/zzbio;

    .line 129
    .line 130
    sget-object v14, LD6/s;->e:LD6/s;

    .line 131
    .line 132
    iget-object v9, v14, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Ljava/lang/Long;

    .line 139
    .line 140
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v9

    .line 144
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbix;->zzaq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 145
    .line 146
    iget-object v14, v14, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 147
    .line 148
    invoke-virtual {v14, v8}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, Ljava/lang/Long;

    .line 153
    .line 154
    move-wide/from16 v18, v9

    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    iget v10, v11, Lcom/google/android/gms/internal/ads/zzcht;->zzc:I

    .line 161
    .line 162
    invoke-static {v10}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    iput-object v10, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 167
    .line 168
    const/16 v10, 0x2000

    .line 169
    .line 170
    new-array v11, v10, [B

    .line 171
    .line 172
    move-wide/from16 v20, v12

    .line 173
    .line 174
    :goto_1
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 175
    .line 176
    invoke-virtual {v14}, Ljava/nio/Buffer;->remaining()I

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    const/4 v10, 0x0

    .line 185
    invoke-interface {v15, v11, v10, v14}, Lcom/google/android/gms/internal/ads/zzj;->zza([BII)I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    const/4 v10, -0x1

    .line 190
    if-ne v14, v10, :cond_2

    .line 191
    .line 192
    const/4 v10, 0x1

    .line 193
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzn:Z

    .line 194
    .line 195
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzh:Lcom/google/android/gms/internal/ads/zzciq;

    .line 196
    .line 197
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzciq;->zza(Ljava/nio/ByteBuffer;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v5

    .line 203
    long-to-int v0, v5

    .line 204
    int-to-long v5, v0

    .line 205
    invoke-virtual {v1, v2, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzcjh;->zzp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 206
    .line 207
    .line 208
    return v10

    .line 209
    :cond_2
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzk:Ljava/lang/Object;

    .line 210
    .line 211
    monitor-enter v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    move-object/from16 v23, v3

    .line 213
    .line 214
    :try_start_1
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzf:Z

    .line 215
    .line 216
    if-nez v3, :cond_3

    .line 217
    .line 218
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 219
    .line 220
    move-wide/from16 v24, v12

    .line 221
    .line 222
    const/4 v12, 0x0

    .line 223
    invoke-virtual {v3, v11, v12, v14}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    goto/16 :goto_3

    .line 229
    .line 230
    :cond_3
    move-wide/from16 v24, v12

    .line 231
    .line 232
    :goto_2
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    :try_start_2
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-gtz v3, :cond_4

    .line 240
    .line 241
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjn;->zzx()V

    .line 242
    .line 243
    .line 244
    const/16 v16, 0x1

    .line 245
    .line 246
    return v16

    .line 247
    :catch_1
    move-exception v0

    .line 248
    goto/16 :goto_4

    .line 249
    .line 250
    :cond_4
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzf:Z

    .line 251
    .line 252
    if-nez v3, :cond_7

    .line 253
    .line 254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 255
    .line 256
    .line 257
    move-result-wide v12

    .line 258
    sub-long v26, v12, v20

    .line 259
    .line 260
    cmp-long v3, v26, v18

    .line 261
    .line 262
    if-ltz v3, :cond_5

    .line 263
    .line 264
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjn;->zzx()V

    .line 265
    .line 266
    .line 267
    move-wide/from16 v20, v12

    .line 268
    .line 269
    :cond_5
    sub-long v12, v12, v24

    .line 270
    .line 271
    const-wide/16 v26, 0x3e8

    .line 272
    .line 273
    mul-long v26, v26, v8

    .line 274
    .line 275
    cmp-long v3, v12, v26

    .line 276
    .line 277
    if-gtz v3, :cond_6

    .line 278
    .line 279
    move-object/from16 v3, v23

    .line 280
    .line 281
    move-wide/from16 v12, v24

    .line 282
    .line 283
    const/16 v10, 0x2000

    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_6
    const-string v3, "downloadTimeout"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 287
    .line 288
    :try_start_3
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    add-int/lit8 v0, v0, 0x1d

    .line 297
    .line 298
    new-instance v5, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    new-instance v5, Ljava/io/IOException;

    .line 317
    .line 318
    invoke-direct {v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 322
    :catch_2
    move-exception v0

    .line 323
    goto :goto_5

    .line 324
    :cond_7
    :try_start_4
    const-string v3, "externalAbort"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 325
    .line 326
    :try_start_5
    new-instance v6, Ljava/io/IOException;

    .line 327
    .line 328
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 329
    .line 330
    invoke-virtual {v7}, Ljava/nio/Buffer;->limit()I

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    add-int/lit8 v8, v8, 0x18

    .line 343
    .line 344
    new-instance v9, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 366
    :goto_3
    :try_start_6
    monitor-exit v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 367
    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 368
    :goto_4
    move-object/from16 v3, v23

    .line 369
    .line 370
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    new-instance v8, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const/16 v16, 0x1

    .line 401
    .line 402
    add-int/lit8 v6, v6, 0x1

    .line 403
    .line 404
    add-int/2addr v6, v7

    .line 405
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 406
    .line 407
    .line 408
    const-string v6, ":"

    .line 409
    .line 410
    invoke-static {v8, v5, v6, v0}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    new-instance v6, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    add-int/lit8 v5, v5, 0x22

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    add-int/2addr v7, v5

    .line 431
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 432
    .line 433
    .line 434
    const-string v5, "Failed to preload url "

    .line 435
    .line 436
    const-string v7, " Exception: "

    .line 437
    .line 438
    invoke-static {v6, v5, v2, v7, v0}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    sget v6, LG6/L;->b:I

    .line 443
    .line 444
    invoke-static {v5}, LH6/l;->f(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v2, v4, v3, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    return v17
.end method

.method public final zzl()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzf:Z

    return-void
.end method

.method public final zzs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final zzt()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzn:Z

    return v0
.end method

.method public final zzu()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzk:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzj:Z

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzj:Z

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzf:Z

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzi:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    return-object v0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v1
.end method
