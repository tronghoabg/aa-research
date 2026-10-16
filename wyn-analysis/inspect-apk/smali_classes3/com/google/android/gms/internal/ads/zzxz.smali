.class final Lcom/google/android/gms/internal/ads/zzxz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzxj;
.implements Lcom/google/android/gms/internal/ads/zzxi;


# instance fields
.field private final zza:[Lcom/google/android/gms/internal/ads/zzxj;

.field private final zzb:[Z

.field private final zzc:Ljava/util/IdentityHashMap;

.field private final zzd:Ljava/util/ArrayList;

.field private final zze:Ljava/util/HashMap;

.field private zzf:Lcom/google/android/gms/internal/ads/zzxi;

.field private zzg:Lcom/google/android/gms/internal/ads/zzzo;

.field private zzh:[Lcom/google/android/gms/internal/ads/zzxj;

.field private zzi:Lcom/google/android/gms/internal/ads/zzzf;


# direct methods
.method public varargs constructor <init>(Lcom/google/android/gms/internal/ads/zzww;[J[Lcom/google/android/gms/internal/ads/zzxj;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzd:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zze:Ljava/util/HashMap;

    .line 19
    .line 20
    new-instance p1, Lcom/google/android/gms/internal/ads/zzwv;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzwv;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 34
    .line 35
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzc:Ljava/util/IdentityHashMap;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    new-array v0, p1, [Lcom/google/android/gms/internal/ads/zzxj;

    .line 44
    .line 45
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 46
    .line 47
    array-length v0, p3

    .line 48
    new-array v0, v0, [Z

    .line 49
    .line 50
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzb:[Z

    .line 51
    .line 52
    :goto_0
    array-length v0, p3

    .line 53
    if-ge p1, v0, :cond_1

    .line 54
    .line 55
    aget-wide v0, p2, p1

    .line 56
    .line 57
    const-wide/16 v2, 0x0

    .line 58
    .line 59
    cmp-long v2, v0, v2

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzb:[Z

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    aput-boolean v3, v2, p1

    .line 67
    .line 68
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 69
    .line 70
    new-instance v3, Lcom/google/android/gms/internal/ads/zzzl;

    .line 71
    .line 72
    aget-object v4, p3, p1

    .line 73
    .line 74
    invoke-direct {v3, v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzzl;-><init>(Lcom/google/android/gms/internal/ads/zzxj;J)V

    .line 75
    .line 76
    .line 77
    aput-object v3, v2, p1

    .line 78
    .line 79
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/ads/zzxj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzb:[Z

    .line 2
    .line 3
    aget-boolean v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/gms/internal/ads/zzzl;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzzl;->zza()Lcom/google/android/gms/internal/ads/zzxj;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 19
    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    return-object p1
.end method

.method public final zzb()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzzf;->zzb()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzc()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzzf;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzmc;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzd:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lcom/google/android/gms/internal/ads/zzxj;

    .line 22
    .line 23
    invoke-interface {v4, p1}, Lcom/google/android/gms/internal/ads/zzxj;->zzd(Lcom/google/android/gms/internal/ads/zzmc;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzzf;->zzd(Lcom/google/android/gms/internal/ads/zzmc;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public final zze()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzzf;->zze()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzf(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzzf;->zzf(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzxi;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzf:Lcom/google/android/gms/internal/ads/zzxi;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzd:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :goto_0
    array-length v1, v0

    .line 12
    if-ge p1, v1, :cond_0

    .line 13
    .line 14
    aget-object v1, v0, p1

    .line 15
    .line 16
    invoke-interface {v1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzxj;->zzl(Lcom/google/android/gms/internal/ads/zzxi;J)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final zzm()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzxj;->zzm()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final zzn()Lcom/google/android/gms/internal/ads/zzzo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzg:Lcom/google/android/gms/internal/ads/zzzo;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final zzo([Lcom/google/android/gms/internal/ads/zzabb;[Z[Lcom/google/android/gms/internal/ads/zzzd;[ZJ)J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    new-array v3, v3, [I

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move v6, v5

    .line 14
    :goto_0
    array-length v7, v1

    .line 15
    if-ge v6, v7, :cond_3

    .line 16
    .line 17
    aget-object v7, v2, v6

    .line 18
    .line 19
    if-nez v7, :cond_0

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzc:Ljava/util/IdentityHashMap;

    .line 24
    .line 25
    invoke-virtual {v8, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    move-object v8, v7

    .line 30
    check-cast v8, Ljava/lang/Integer;

    .line 31
    .line 32
    :goto_1
    const/4 v7, -0x1

    .line 33
    if-nez v8, :cond_1

    .line 34
    .line 35
    move v8, v7

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    :goto_2
    aput v8, v4, v6

    .line 42
    .line 43
    aget-object v8, v1, v6

    .line 44
    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzabg;->zza()Lcom/google/android/gms/internal/ads/zzbg;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzbg;->zzb:Ljava/lang/String;

    .line 52
    .line 53
    const-string v8, ":"

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-virtual {v7, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    aput v7, v3, v6

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    aput v7, v3, v6

    .line 71
    .line 72
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzc:Ljava/util/IdentityHashMap;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    .line 78
    .line 79
    .line 80
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 81
    .line 82
    new-array v10, v7, [Lcom/google/android/gms/internal/ads/zzzd;

    .line 83
    .line 84
    new-array v14, v7, [Lcom/google/android/gms/internal/ads/zzzd;

    .line 85
    .line 86
    new-array v12, v7, [Lcom/google/android/gms/internal/ads/zzabb;

    .line 87
    .line 88
    new-instance v11, Ljava/util/ArrayList;

    .line 89
    .line 90
    array-length v13, v9

    .line 91
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    move-wide/from16 v16, p5

    .line 95
    .line 96
    move v13, v5

    .line 97
    :goto_4
    array-length v15, v9

    .line 98
    if-ge v13, v15, :cond_e

    .line 99
    .line 100
    move v15, v5

    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    :goto_5
    array-length v8, v1

    .line 104
    if-ge v15, v8, :cond_6

    .line 105
    .line 106
    aget v8, v4, v15

    .line 107
    .line 108
    if-ne v8, v13, :cond_4

    .line 109
    .line 110
    aget-object v8, v2, v15

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_4
    move-object/from16 v8, v18

    .line 114
    .line 115
    :goto_6
    aput-object v8, v14, v15

    .line 116
    .line 117
    aget v8, v3, v15

    .line 118
    .line 119
    if-ne v8, v13, :cond_5

    .line 120
    .line 121
    aget-object v8, v1, v15

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzabg;->zza()Lcom/google/android/gms/internal/ads/zzbg;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    move-object/from16 v19, v3

    .line 131
    .line 132
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzxz;->zze:Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lcom/google/android/gms/internal/ads/zzbg;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v5, Lcom/google/android/gms/internal/ads/zzxy;

    .line 144
    .line 145
    invoke-direct {v5, v8, v3}, Lcom/google/android/gms/internal/ads/zzxy;-><init>(Lcom/google/android/gms/internal/ads/zzabb;Lcom/google/android/gms/internal/ads/zzbg;)V

    .line 146
    .line 147
    .line 148
    aput-object v5, v12, v15

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_5
    move-object/from16 v19, v3

    .line 152
    .line 153
    aput-object v18, v12, v15

    .line 154
    .line 155
    :goto_7
    add-int/lit8 v15, v15, 0x1

    .line 156
    .line 157
    move-object/from16 v3, v19

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    goto :goto_5

    .line 161
    :cond_6
    move-object/from16 v19, v3

    .line 162
    .line 163
    move-object v3, v11

    .line 164
    aget-object v11, v9, v13

    .line 165
    .line 166
    move-object/from16 v15, p4

    .line 167
    .line 168
    move v5, v13

    .line 169
    move-object/from16 v13, p2

    .line 170
    .line 171
    invoke-interface/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzxj;->zzo([Lcom/google/android/gms/internal/ads/zzabb;[Z[Lcom/google/android/gms/internal/ads/zzzd;[ZJ)J

    .line 172
    .line 173
    .line 174
    move-result-wide v20

    .line 175
    if-nez v5, :cond_7

    .line 176
    .line 177
    move-wide/from16 v16, v20

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_7
    cmp-long v8, v20, v16

    .line 181
    .line 182
    if-nez v8, :cond_d

    .line 183
    .line 184
    :goto_8
    const/4 v8, 0x0

    .line 185
    const/4 v11, 0x0

    .line 186
    :goto_9
    array-length v13, v1

    .line 187
    if-ge v8, v13, :cond_b

    .line 188
    .line 189
    aget v13, v19, v8

    .line 190
    .line 191
    const/4 v15, 0x1

    .line 192
    if-ne v13, v5, :cond_8

    .line 193
    .line 194
    aget-object v11, v14, v8

    .line 195
    .line 196
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    aput-object v11, v10, v8

    .line 200
    .line 201
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    invoke-virtual {v6, v11, v13}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move v11, v15

    .line 209
    goto :goto_b

    .line 210
    :cond_8
    aget v13, v4, v8

    .line 211
    .line 212
    if-ne v13, v5, :cond_a

    .line 213
    .line 214
    aget-object v13, v14, v8

    .line 215
    .line 216
    if-nez v13, :cond_9

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_9
    const/4 v15, 0x0

    .line 220
    :goto_a
    invoke-static {v15}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 221
    .line 222
    .line 223
    :cond_a
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_b
    if-eqz v11, :cond_c

    .line 227
    .line 228
    aget-object v8, v9, v5

    .line 229
    .line 230
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    :cond_c
    add-int/lit8 v13, v5, 0x1

    .line 234
    .line 235
    move-object v11, v3

    .line 236
    move-object/from16 v3, v19

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    goto/16 :goto_4

    .line 240
    .line 241
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 242
    .line 243
    const-string v2, "Children enabled at different positions."

    .line 244
    .line 245
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v1

    .line 249
    :cond_e
    move v1, v5

    .line 250
    move-object v3, v11

    .line 251
    invoke-static {v10, v1, v2, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 252
    .line 253
    .line 254
    new-array v1, v1, [Lcom/google/android/gms/internal/ads/zzxj;

    .line 255
    .line 256
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzxj;

    .line 261
    .line 262
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 263
    .line 264
    sget-object v1, Lcom/google/android/gms/internal/ads/zzxx;->zza:Lcom/google/android/gms/internal/ads/zzxx;

    .line 265
    .line 266
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzgxt;->zzc(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzgti;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    new-instance v2, Lcom/google/android/gms/internal/ads/zzwv;

    .line 271
    .line 272
    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzwv;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzi:Lcom/google/android/gms/internal/ads/zzzf;

    .line 276
    .line 277
    return-wide v16
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzxj;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzd:Ljava/util/ArrayList;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    :goto_0
    array-length v5, v1

    .line 22
    if-ge v3, v5, :cond_1

    .line 23
    .line 24
    aget-object v5, v1, v3

    .line 25
    .line 26
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzxj;->zzn()Lcom/google/android/gms/internal/ads/zzzo;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 31
    .line 32
    add-int/2addr v4, v5

    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-array v3, v4, [Lcom/google/android/gms/internal/ads/zzbg;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    :goto_1
    array-length v6, v1

    .line 41
    if-ge v4, v6, :cond_6

    .line 42
    .line 43
    aget-object v6, v1, v4

    .line 44
    .line 45
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxj;->zzn()Lcom/google/android/gms/internal/ads/zzzo;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    iget v7, v6, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    :goto_2
    if-ge v8, v7, :cond_5

    .line 53
    .line 54
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    iget v10, v9, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 59
    .line 60
    new-array v11, v10, [Lcom/google/android/gms/internal/ads/zzv;

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    :goto_3
    const-string v14, ":"

    .line 64
    .line 65
    if-ge v12, v10, :cond_4

    .line 66
    .line 67
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzv;->zza:Ljava/lang/String;

    .line 76
    .line 77
    if-nez v13, :cond_2

    .line 78
    .line 79
    const-string v13, ""

    .line 80
    .line 81
    :cond_2
    move-object/from16 v16, v1

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-static {v4, v1}, LA7/p0;->f(II)I

    .line 85
    .line 86
    .line 87
    move-result v17

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v18

    .line 94
    move/from16 v19, v5

    .line 95
    .line 96
    add-int v5, v18, v17

    .line 97
    .line 98
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 115
    .line 116
    .line 117
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzv;->zzn:Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    const/4 v5, 0x1

    .line 122
    invoke-static {v4, v5}, LA7/p0;->f(II)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    new-instance v15, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    add-int/2addr v5, v13

    .line 133
    invoke-direct {v15, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 150
    .line 151
    .line 152
    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    aput-object v1, v11, v12

    .line 157
    .line 158
    add-int/lit8 v12, v12, 0x1

    .line 159
    .line 160
    move-object/from16 v1, v16

    .line 161
    .line 162
    move/from16 v5, v19

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    move-object/from16 v16, v1

    .line 166
    .line 167
    move/from16 v19, v5

    .line 168
    .line 169
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbg;

    .line 170
    .line 171
    iget-object v2, v9, Lcom/google/android/gms/internal/ads/zzbg;->zzb:Ljava/lang/String;

    .line 172
    .line 173
    const/4 v5, 0x1

    .line 174
    invoke-static {v4, v5}, LA7/p0;->f(II)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    new-instance v12, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    add-int/2addr v5, v10

    .line 189
    invoke-direct {v12, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-direct {v1, v2, v11}, Lcom/google/android/gms/internal/ads/zzbg;-><init>(Ljava/lang/String;[Lcom/google/android/gms/internal/ads/zzv;)V

    .line 206
    .line 207
    .line 208
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzxz;->zze:Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-virtual {v2, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    add-int/lit8 v5, v19, 0x1

    .line 214
    .line 215
    aput-object v1, v3, v19

    .line 216
    .line 217
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    move-object/from16 v1, v16

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :cond_5
    move-object/from16 v16, v1

    .line 224
    .line 225
    move/from16 v19, v5

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :cond_6
    new-instance v1, Lcom/google/android/gms/internal/ads/zzzo;

    .line 232
    .line 233
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/zzzo;-><init>([Lcom/google/android/gms/internal/ads/zzbg;)V

    .line 234
    .line 235
    .line 236
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzg:Lcom/google/android/gms/internal/ads/zzzo;

    .line 237
    .line 238
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzxz;->zzf:Lcom/google/android/gms/internal/ads/zzxi;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzxi;->zzp(Lcom/google/android/gms/internal/ads/zzxj;)V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public final zzq(JZ)V
    .locals 4

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    aget-object v3, p3, v2

    .line 9
    .line 10
    invoke-interface {v3, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzxj;->zzq(JZ)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public final zzr()J
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    move v5, v2

    .line 11
    move-wide v6, v3

    .line 12
    :goto_0
    if-ge v5, v1, :cond_8

    .line 13
    .line 14
    aget-object v8, v0, v5

    .line 15
    .line 16
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzxj;->zzr()J

    .line 17
    .line 18
    .line 19
    move-result-wide v9

    .line 20
    cmp-long v11, v9, v3

    .line 21
    .line 22
    const-string v12, "Unexpected child seekToUs result."

    .line 23
    .line 24
    if-eqz v11, :cond_5

    .line 25
    .line 26
    cmp-long v11, v6, v3

    .line 27
    .line 28
    if-nez v11, :cond_3

    .line 29
    .line 30
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 31
    .line 32
    array-length v7, v6

    .line 33
    move v11, v2

    .line 34
    :goto_1
    if-ge v11, v7, :cond_2

    .line 35
    .line 36
    aget-object v13, v6, v11

    .line 37
    .line 38
    if-ne v13, v8, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    invoke-interface {v13, v9, v10}, Lcom/google/android/gms/internal/ads/zzxj;->zzt(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    cmp-long v13, v13, v9

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    add-int/lit8 v11, v11, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    :goto_2
    move-wide v6, v9

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    cmp-long v8, v9, v6

    .line 61
    .line 62
    if-nez v8, :cond_4

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "Conflicting discontinuities."

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_5
    cmp-long v9, v6, v3

    .line 74
    .line 75
    if-eqz v9, :cond_7

    .line 76
    .line 77
    invoke-interface {v8, v6, v7}, Lcom/google/android/gms/internal/ads/zzxj;->zzt(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    cmp-long v8, v8, v6

    .line 82
    .line 83
    if-nez v8, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_7
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_8
    return-wide v6
.end method

.method public final bridge synthetic zzs(Lcom/google/android/gms/internal/ads/zzzf;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzxj;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzf:Lcom/google/android/gms/internal/ads/zzxi;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/zzze;->zzs(Lcom/google/android/gms/internal/ads/zzzf;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzt(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzxj;->zzt(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/4 v0, 0x1

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_1

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzxj;->zzt(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    cmp-long v1, v1, p1

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p2, "Unexpected child seekToUs result."

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    return-wide p1
.end method

.method public final zzu(JLcom/google/android/gms/internal/ads/zznk;)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zzh:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    aget-object v0, v0, v2

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxz;->zza:[Lcom/google/android/gms/internal/ads/zzxj;

    .line 11
    .line 12
    aget-object v0, v0, v2

    .line 13
    .line 14
    :goto_0
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzxj;->zzu(JLcom/google/android/gms/internal/ads/zznk;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method
