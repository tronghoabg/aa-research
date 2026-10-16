.class public final Lcom/google/android/gms/internal/ads/zzchv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Z


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/String;

.field private final zzd:LH6/a;

.field private final zze:Lcom/google/android/gms/internal/ads/zzbjj;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbjm;

.field private final zzg:LG6/u;

.field private final zzh:[J

.field private final zzi:[Ljava/lang/String;

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z

.field private zzm:Z

.field private zzn:Z

.field private zzo:Lcom/google/android/gms/internal/ads/zzcha;

.field private zzp:Z

.field private zzq:Z

.field private zzr:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LD6/q;->g:LD6/q;

    .line 2
    .line 3
    iget-object v0, v0, LD6/q;->e:Ljava/util/Random;

    .line 4
    .line 5
    const/16 v1, 0x64

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzos:Lcom/google/android/gms/internal/ads/zzbio;

    .line 12
    .line 13
    sget-object v2, LD6/s;->e:LD6/s;

    .line 14
    .line 15
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/ads/zzchv;->zza:Z

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LH6/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LG6/t;

    .line 5
    .line 6
    invoke-direct {v0}, LG6/t;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 10
    .line 11
    const-string v1, "min_1"

    .line 12
    .line 13
    const-wide/16 v2, 0x1

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 16
    .line 17
    .line 18
    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    .line 19
    .line 20
    const-string v1, "1_5"

    .line 21
    .line 22
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 25
    .line 26
    .line 27
    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    .line 28
    .line 29
    const-string v1, "5_10"

    .line 30
    .line 31
    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    .line 32
    .line 33
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 34
    .line 35
    .line 36
    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    .line 37
    .line 38
    const-string v1, "10_20"

    .line 39
    .line 40
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    .line 41
    .line 42
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 43
    .line 44
    .line 45
    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    .line 46
    .line 47
    const-string v1, "20_30"

    .line 48
    .line 49
    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 52
    .line 53
    .line 54
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const-string v1, "30_max"

    .line 60
    .line 61
    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    .line 62
    .line 63
    invoke-virtual/range {v0 .. v5}, LG6/t;->b(Ljava/lang/String;DD)V

    .line 64
    .line 65
    .line 66
    new-instance v1, LG6/u;

    .line 67
    .line 68
    invoke-direct {v1, v0}, LG6/u;-><init>(LG6/t;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzg:LG6/u;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzj:Z

    .line 75
    .line 76
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzk:Z

    .line 77
    .line 78
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzl:Z

    .line 79
    .line 80
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzm:Z

    .line 81
    .line 82
    const-wide/16 v1, -0x1

    .line 83
    .line 84
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzr:J

    .line 85
    .line 86
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzb:Landroid/content/Context;

    .line 87
    .line 88
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzd:LH6/a;

    .line 89
    .line 90
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzc:Ljava/lang/String;

    .line 91
    .line 92
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzf:Lcom/google/android/gms/internal/ads/zzbjm;

    .line 93
    .line 94
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzchv;->zze:Lcom/google/android/gms/internal/ads/zzbjj;

    .line 95
    .line 96
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzat:Lcom/google/android/gms/internal/ads/zzbio;

    .line 97
    .line 98
    sget-object p2, LD6/s;->e:LD6/s;

    .line 99
    .line 100
    iget-object p2, p2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    if-nez p1, :cond_0

    .line 109
    .line 110
    new-array p1, v0, [Ljava/lang/String;

    .line 111
    .line 112
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzi:[Ljava/lang/String;

    .line 113
    .line 114
    new-array p1, v0, [J

    .line 115
    .line 116
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 117
    .line 118
    return-void

    .line 119
    :cond_0
    const-string p2, ","

    .line 120
    .line 121
    invoke-static {p1, p2}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    array-length p2, p1

    .line 126
    new-array p3, p2, [Ljava/lang/String;

    .line 127
    .line 128
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzi:[Ljava/lang/String;

    .line 129
    .line 130
    new-array p2, p2, [J

    .line 131
    .line 132
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 133
    .line 134
    move p2, v0

    .line 135
    :goto_0
    array-length p3, p1

    .line 136
    if-ge p2, p3, :cond_1

    .line 137
    .line 138
    :try_start_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 139
    .line 140
    aget-object p4, p1, p2

    .line 141
    .line 142
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 143
    .line 144
    .line 145
    move-result-wide p4

    .line 146
    aput-wide p4, p3, p2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :catch_0
    move-exception v0

    .line 150
    move-object p3, v0

    .line 151
    sget p4, LG6/L;->b:I

    .line 152
    .line 153
    const-string p4, "Unable to parse frame hash target time number."

    .line 154
    .line 155
    invoke-static {p4, p3}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 159
    .line 160
    aput-wide v1, p3, p2

    .line 161
    .line 162
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_1
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzcha;)V
    .locals 3

    .line 1
    const-string v0, "vpc2"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzf:Lcom/google/android/gms/internal/ads/zzbjm;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzchv;->zze:Lcom/google/android/gms/internal/ads/zzbjj;

    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbje;->zza(Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;[Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzj:Z

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcha;->zza()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "vpn"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzo:Lcom/google/android/gms/internal/ads/zzcha;

    .line 27
    .line 28
    return-void
.end method

.method public final zzb()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzj:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzk:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzf:Lcom/google/android/gms/internal/ads/zzbjm;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zze:Lcom/google/android/gms/internal/ads/zzbjj;

    .line 13
    .line 14
    const-string v2, "vfr2"

    .line 15
    .line 16
    filled-new-array {v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbje;->zza(Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;[Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzk:Z

    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public final zzc()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v3, Lcom/google/android/gms/internal/ads/zzchv;->zza:Z

    .line 4
    .line 5
    if-eqz v3, :cond_7

    .line 6
    .line 7
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzp:Z

    .line 8
    .line 9
    if-nez v3, :cond_7

    .line 10
    .line 11
    const-string v3, "type"

    .line 12
    .line 13
    const-string v4, "native-player-metrics"

    .line 14
    .line 15
    invoke-static {v3, v4}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzc:Ljava/lang/String;

    .line 20
    .line 21
    const-string v5, "request"

    .line 22
    .line 23
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzo:Lcom/google/android/gms/internal/ads/zzcha;

    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzcha;->zza()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v5, "player"

    .line 33
    .line 34
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzg:LG6/u;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v5, Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-object v6, v4, LG6/u;->a:[Ljava/lang/String;

    .line 45
    .line 46
    array-length v7, v6

    .line 47
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    :goto_0
    array-length v8, v6

    .line 52
    if-ge v7, v8, :cond_0

    .line 53
    .line 54
    new-instance v9, LG6/s;

    .line 55
    .line 56
    aget-object v10, v6, v7

    .line 57
    .line 58
    iget-object v8, v4, LG6/u;->c:[D

    .line 59
    .line 60
    aget-wide v11, v8, v7

    .line 61
    .line 62
    iget-object v8, v4, LG6/u;->b:[D

    .line 63
    .line 64
    aget-wide v13, v8, v7

    .line 65
    .line 66
    iget-object v8, v4, LG6/u;->d:[I

    .line 67
    .line 68
    aget v8, v8, v7

    .line 69
    .line 70
    const/16 v18, 0x1

    .line 71
    .line 72
    int-to-double v1, v8

    .line 73
    iget v15, v4, LG6/u;->e:I

    .line 74
    .line 75
    move-wide/from16 v16, v1

    .line 76
    .line 77
    int-to-double v1, v15

    .line 78
    div-double v15, v16, v1

    .line 79
    .line 80
    move/from16 v17, v8

    .line 81
    .line 82
    invoke-direct/range {v9 .. v17}, LG6/s;-><init>(Ljava/lang/String;DDDI)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v7, v7, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/16 v18, 0x1

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, LG6/s;

    .line 108
    .line 109
    iget-object v4, v2, LG6/s;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget v6, v2, LG6/s;->e:I

    .line 116
    .line 117
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const-string v7, "fps_c_"

    .line 122
    .line 123
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v3, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iget-wide v5, v2, LG6/s;->d:D

    .line 135
    .line 136
    invoke-static {v5, v6}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v5, "fps_p_"

    .line 141
    .line 142
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    const/4 v1, 0x0

    .line 151
    :goto_2
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 152
    .line 153
    array-length v4, v2

    .line 154
    if-ge v1, v4, :cond_3

    .line 155
    .line 156
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzi:[Ljava/lang/String;

    .line 157
    .line 158
    aget-object v4, v4, v1

    .line 159
    .line 160
    if-eqz v4, :cond_2

    .line 161
    .line 162
    aget-wide v5, v2, v1

    .line 163
    .line 164
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    new-instance v6, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    add-int/lit8 v5, v5, 0x3

    .line 179
    .line 180
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 181
    .line 182
    .line 183
    const-string v5, "fh_"

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v3, v2, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzb:Landroid/content/Context;

    .line 200
    .line 201
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzd:LH6/a;

    .line 202
    .line 203
    sget-object v4, LC6/n;->D:LC6/n;

    .line 204
    .line 205
    iget-object v4, v4, LC6/n;->c:LG6/U;

    .line 206
    .line 207
    iget-object v2, v2, LH6/a;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const-string v5, "device"

    .line 213
    .line 214
    invoke-static {}, LG6/U;->O()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v3, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 222
    .line 223
    sget-object v5, LD6/s;->e:LD6/s;

    .line 224
    .line 225
    iget-object v6, v5, LD6/s;->a:Lcom/google/android/gms/internal/ads/zzbip;

    .line 226
    .line 227
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzbip;->zze()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    const-string v7, ","

    .line 232
    .line 233
    invoke-static {v7, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    const-string v7, "eids"

    .line 238
    .line 239
    invoke-virtual {v3, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-eqz v6, :cond_4

    .line 247
    .line 248
    sget v4, LG6/L;->b:I

    .line 249
    .line 250
    const-string v4, "Empty or null bundle."

    .line 251
    .line 252
    invoke-static {v4}, LH6/l;->a(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_4
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzmh:Lcom/google/android/gms/internal/ads/zzbio;

    .line 257
    .line 258
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 259
    .line 260
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    check-cast v5, Ljava/lang/String;

    .line 265
    .line 266
    iget-object v6, v4, LG6/U;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 267
    .line 268
    move/from16 v7, v18

    .line 269
    .line 270
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    iget-object v7, v4, LG6/U;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 275
    .line 276
    if-nez v6, :cond_6

    .line 277
    .line 278
    new-instance v6, LG6/P;

    .line 279
    .line 280
    invoke-direct {v6, v4, v1, v5}, LG6/P;-><init>(LG6/U;Landroid/content/Context;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    if-eqz v4, :cond_5

    .line 288
    .line 289
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_5
    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-interface {v4, v6}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v1, v5}, LFe/c;->K(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    :goto_3
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_6
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Landroid/os/Bundle;

    .line 311
    .line 312
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    sget-object v4, LD6/q;->g:LD6/q;

    .line 316
    .line 317
    iget-object v4, v4, LD6/q;->a:LH6/f;

    .line 318
    .line 319
    new-instance v4, LS3/c;

    .line 320
    .line 321
    const/4 v5, 0x7

    .line 322
    const/4 v6, 0x0

    .line 323
    invoke-direct {v4, v1, v6, v2, v5}, LS3/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v2, v3, v4}, LH6/f;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;LH6/e;)V

    .line 327
    .line 328
    .line 329
    const/4 v7, 0x1

    .line 330
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzp:Z

    .line 331
    .line 332
    :cond_7
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzcha;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzl:Z

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzm:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    invoke-static {}, LG6/L;->m()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzm:Z

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    const-string v2, "VideoMetricsMixin first frame"

    .line 23
    .line 24
    invoke-static {v2}, LG6/L;->k(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzf:Lcom/google/android/gms/internal/ads/zzbjm;

    .line 28
    .line 29
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zze:Lcom/google/android/gms/internal/ads/zzbjj;

    .line 30
    .line 31
    const-string v5, "vff2"

    .line 32
    .line 33
    filled-new-array {v5}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzbje;->zza(Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;[Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzm:Z

    .line 41
    .line 42
    :cond_1
    sget-object v2, LC6/n;->D:LC6/n;

    .line 43
    .line 44
    iget-object v2, v2, LC6/n;->k:Ln7/b;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzn:Z

    .line 54
    .line 55
    const-wide/16 v6, 0x1

    .line 56
    .line 57
    const-wide/16 v8, -0x1

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzq:Z

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzr:J

    .line 66
    .line 67
    cmp-long v2, v10, v8

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 72
    .line 73
    invoke-virtual {v2, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    long-to-double v10, v10

    .line 78
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzr:J

    .line 79
    .line 80
    sub-long v12, v4, v12

    .line 81
    .line 82
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzg:LG6/u;

    .line 83
    .line 84
    long-to-double v12, v12

    .line 85
    div-double/2addr v10, v12

    .line 86
    iget v12, v2, LG6/u;->e:I

    .line 87
    .line 88
    add-int/2addr v12, v3

    .line 89
    iput v12, v2, LG6/u;->e:I

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    :goto_0
    iget-object v13, v2, LG6/u;->c:[D

    .line 93
    .line 94
    array-length v14, v13

    .line 95
    if-ge v12, v14, :cond_4

    .line 96
    .line 97
    aget-wide v14, v13, v12

    .line 98
    .line 99
    cmpg-double v13, v14, v10

    .line 100
    .line 101
    if-gtz v13, :cond_2

    .line 102
    .line 103
    iget-object v13, v2, LG6/u;->b:[D

    .line 104
    .line 105
    aget-wide v16, v13, v12

    .line 106
    .line 107
    cmpg-double v13, v10, v16

    .line 108
    .line 109
    if-gez v13, :cond_2

    .line 110
    .line 111
    iget-object v13, v2, LG6/u;->d:[I

    .line 112
    .line 113
    aget v16, v13, v12

    .line 114
    .line 115
    add-int/lit8 v16, v16, 0x1

    .line 116
    .line 117
    aput v16, v13, v12

    .line 118
    .line 119
    :cond_2
    cmpg-double v13, v10, v14

    .line 120
    .line 121
    if-gez v13, :cond_3

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    add-int/2addr v12, v3

    .line 125
    goto :goto_0

    .line 126
    :cond_4
    :goto_1
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzn:Z

    .line 127
    .line 128
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzq:Z

    .line 129
    .line 130
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzr:J

    .line 131
    .line 132
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzau:Lcom/google/android/gms/internal/ads/zzbio;

    .line 133
    .line 134
    sget-object v4, LD6/s;->e:LD6/s;

    .line 135
    .line 136
    iget-object v4, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 137
    .line 138
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Ljava/lang/Long;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzcha;->zzh()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    int-to-long v10, v2

    .line 153
    const/4 v2, 0x0

    .line 154
    :goto_2
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzi:[Ljava/lang/String;

    .line 155
    .line 156
    array-length v13, v12

    .line 157
    if-ge v2, v13, :cond_a

    .line 158
    .line 159
    aget-object v13, v12, v2

    .line 160
    .line 161
    if-eqz v13, :cond_6

    .line 162
    .line 163
    :cond_5
    move-object/from16 v13, p1

    .line 164
    .line 165
    const/16 v18, 0x0

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_6
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzchv;->zzh:[J

    .line 169
    .line 170
    aget-wide v14, v13, v2

    .line 171
    .line 172
    sub-long v14, v10, v14

    .line 173
    .line 174
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v13

    .line 178
    cmp-long v13, v4, v13

    .line 179
    .line 180
    if-lez v13, :cond_5

    .line 181
    .line 182
    const/16 v4, 0x8

    .line 183
    .line 184
    move-object/from16 v13, p1

    .line 185
    .line 186
    invoke-virtual {v13, v4, v4}, Landroid/view/TextureView;->getBitmap(II)Landroid/graphics/Bitmap;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const-wide/16 v10, 0x0

    .line 191
    .line 192
    const-wide/16 v13, 0x3f

    .line 193
    .line 194
    move-wide/from16 v16, v10

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    :goto_3
    if-ge v15, v4, :cond_9

    .line 198
    .line 199
    const/4 v1, 0x0

    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    :goto_4
    if-ge v1, v4, :cond_8

    .line 203
    .line 204
    invoke-virtual {v5, v1, v15}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 205
    .line 206
    .line 207
    move-result v19

    .line 208
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->blue(I)I

    .line 209
    .line 210
    .line 211
    move-result v20

    .line 212
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->red(I)I

    .line 213
    .line 214
    .line 215
    move-result v21

    .line 216
    add-int v21, v21, v20

    .line 217
    .line 218
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->green(I)I

    .line 219
    .line 220
    .line 221
    move-result v19

    .line 222
    add-int v4, v19, v21

    .line 223
    .line 224
    const/16 v6, 0x80

    .line 225
    .line 226
    if-le v4, v6, :cond_7

    .line 227
    .line 228
    const-wide/16 v6, 0x1

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_7
    move-wide v6, v10

    .line 232
    :goto_5
    long-to-int v4, v13

    .line 233
    shl-long/2addr v6, v4

    .line 234
    or-long v16, v16, v6

    .line 235
    .line 236
    add-long/2addr v13, v8

    .line 237
    add-int/2addr v1, v3

    .line 238
    const/16 v4, 0x8

    .line 239
    .line 240
    const-wide/16 v6, 0x1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    add-int/2addr v15, v3

    .line 244
    const/16 v4, 0x8

    .line 245
    .line 246
    const-wide/16 v6, 0x1

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    const/16 v18, 0x0

    .line 250
    .line 251
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    new-array v3, v3, [Ljava/lang/Object;

    .line 256
    .line 257
    aput-object v1, v3, v18

    .line 258
    .line 259
    const-string v1, "%016X"

    .line 260
    .line 261
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    aput-object v1, v12, v2

    .line 266
    .line 267
    return-void

    .line 268
    :goto_6
    add-int/2addr v2, v3

    .line 269
    const-wide/16 v6, 0x1

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_a
    return-void
.end method

.method public final zze()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzn:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzk:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzl:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzf:Lcom/google/android/gms/internal/ads/zzbjm;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzchv;->zze:Lcom/google/android/gms/internal/ads/zzbjj;

    .line 15
    .line 16
    const-string v3, "vfp2"

    .line 17
    .line 18
    filled-new-array {v3}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbje;->zza(Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;[Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzl:Z

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchv;->zzn:Z

    return-void
.end method
