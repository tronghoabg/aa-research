.class final Lcom/google/android/gms/internal/ads/zzamg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzahd;


# instance fields
.field private final zza:J

.field private final zzb:[Lcom/google/android/gms/internal/ads/zzamh;

.field private final zzc:I


# direct methods
.method public constructor <init>(J[Lcom/google/android/gms/internal/ads/zzamh;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzamg;->zza:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzamg;->zzb:[Lcom/google/android/gms/internal/ads/zzamh;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzamg;->zzc:I

    return-void
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamg;->zza:J

    return-wide v0
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzahb;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzamg;->zzb:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    if-nez v4, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahb;

    .line 11
    .line 12
    sget-object v2, Lcom/google/android/gms/internal/ads/zzahe;->zza:Lcom/google/android/gms/internal/ads/zzahe;

    .line 13
    .line 14
    invoke-direct {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzamg;->zzc:I

    .line 19
    .line 20
    const/4 v5, -0x1

    .line 21
    if-eq v4, v5, :cond_2

    .line 22
    .line 23
    aget-object v10, v3, v4

    .line 24
    .line 25
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 26
    .line 27
    invoke-static {v10, v1, v2}, Lcom/google/android/gms/internal/ads/zzami;->zzi(Lcom/google/android/gms/internal/ads/zzams;J)I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    if-ne v11, v5, :cond_1

    .line 32
    .line 33
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahb;

    .line 34
    .line 35
    sget-object v2, Lcom/google/android/gms/internal/ads/zzahe;->zza:Lcom/google/android/gms/internal/ads/zzahe;

    .line 36
    .line 37
    invoke-direct {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    iget-object v12, v10, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 42
    .line 43
    aget-wide v13, v12, v11

    .line 44
    .line 45
    iget-object v15, v10, Lcom/google/android/gms/internal/ads/zzams;->zzc:[J

    .line 46
    .line 47
    aget-wide v16, v15, v11

    .line 48
    .line 49
    cmp-long v18, v13, v1

    .line 50
    .line 51
    if-gez v18, :cond_3

    .line 52
    .line 53
    iget v6, v10, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 54
    .line 55
    add-int/2addr v6, v5

    .line 56
    if-ge v11, v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v10, v1, v2}, Lcom/google/android/gms/internal/ads/zzams;->zzb(J)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eq v1, v5, :cond_3

    .line 63
    .line 64
    if-eq v1, v11, :cond_3

    .line 65
    .line 66
    aget-wide v5, v12, v1

    .line 67
    .line 68
    aget-wide v1, v15, v1

    .line 69
    .line 70
    move-wide/from16 v18, v1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const-wide v16, 0x7fffffffffffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    move-wide v13, v1

    .line 79
    :cond_3
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    const-wide/16 v18, -0x1

    .line 85
    .line 86
    :goto_0
    const/4 v1, 0x0

    .line 87
    move-wide/from16 v10, v16

    .line 88
    .line 89
    move-wide/from16 v8, v18

    .line 90
    .line 91
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    :goto_1
    array-length v2, v3

    .line 97
    if-ge v1, v2, :cond_5

    .line 98
    .line 99
    if-eq v1, v4, :cond_4

    .line 100
    .line 101
    aget-object v2, v3, v1

    .line 102
    .line 103
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 104
    .line 105
    invoke-static {v2, v13, v14, v10, v11}, Lcom/google/android/gms/internal/ads/zzami;->zzh(Lcom/google/android/gms/internal/ads/zzams;JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    cmp-long v7, v5, v15

    .line 110
    .line 111
    if-eqz v7, :cond_4

    .line 112
    .line 113
    invoke-static {v2, v5, v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzami;->zzh(Lcom/google/android/gms/internal/ads/zzams;JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    move-wide v8, v7

    .line 118
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahe;

    .line 122
    .line 123
    invoke-direct {v1, v13, v14, v10, v11}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 124
    .line 125
    .line 126
    cmp-long v2, v5, v15

    .line 127
    .line 128
    if-nez v2, :cond_6

    .line 129
    .line 130
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahb;

    .line 131
    .line 132
    invoke-direct {v2, v1, v1}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_6
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahe;

    .line 137
    .line 138
    invoke-direct {v2, v5, v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 139
    .line 140
    .line 141
    new-instance v3, Lcom/google/android/gms/internal/ads/zzahb;

    .line 142
    .line 143
    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 144
    .line 145
    .line 146
    return-object v3
.end method

.method public final synthetic zzj()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/h;->a(Lcom/google/android/gms/internal/ads/zzahd;)Z

    move-result v0

    return v0
.end method
