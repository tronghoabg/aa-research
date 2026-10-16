.class final Lcom/google/android/gms/internal/ads/zzemn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdnw;


# instance fields
.field private final zza:LH6/a;

.field private final zzb:Lp8/p;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfkn;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzclb;

.field private final zze:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbqa;

.field private final zzg:Z

.field private final zzh:Lcom/google/android/gms/internal/ads/zzekz;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzdzt;


# direct methods
.method public constructor <init>(LH6/a;Lp8/p;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzclb;Lcom/google/android/gms/internal/ads/zzflg;ZLcom/google/android/gms/internal/ads/zzbqa;Lcom/google/android/gms/internal/ads/zzekz;Lcom/google/android/gms/internal/ads/zzdzt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemn;->zza:LH6/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzb:Lp8/p;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzc:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzd:Lcom/google/android/gms/internal/ads/zzclb;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzemn;->zze:Lcom/google/android/gms/internal/ads/zzflg;

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzg:Z

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzf:Lcom/google/android/gms/internal/ads/zzbqa;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzh:Lcom/google/android/gms/internal/ads/zzekz;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzi:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzddm;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzb:Lp8/p;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzt(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/google/android/gms/internal/ads/zzcvd;

    .line 10
    .line 11
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzd:Lcom/google/android/gms/internal/ads/zzclb;

    .line 12
    .line 13
    const/4 v15, 0x1

    .line 14
    invoke-interface {v4, v15}, Lcom/google/android/gms/internal/ads/zzclb;->zzag(Z)V

    .line 15
    .line 16
    .line 17
    new-instance v5, LC6/g;

    .line 18
    .line 19
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzg:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzf:Lcom/google/android/gms/internal/ads/zzbqa;

    .line 24
    .line 25
    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/ads/zzbqa;->zzc(Z)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    move v6, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v6, v15

    .line 32
    :goto_0
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzf:Lcom/google/android/gms/internal/ads/zzbqa;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbqa;->zzd()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move v3, v15

    .line 44
    :cond_1
    move v8, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v8, v3

    .line 47
    move v3, v15

    .line 48
    :goto_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzf:Lcom/google/android/gms/internal/ads/zzbqa;

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbqa;->zze()F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_2
    move v9, v2

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/4 v2, 0x0

    .line 59
    goto :goto_2

    .line 60
    :goto_3
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzc:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 61
    .line 62
    iget-boolean v11, v2, Lcom/google/android/gms/internal/ads/zzfkn;->zzO:Z

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v7, 0x1

    .line 66
    move/from16 v10, p1

    .line 67
    .line 68
    invoke-direct/range {v5 .. v12}, LC6/g;-><init>(ZZZFZZZ)V

    .line 69
    .line 70
    .line 71
    if-eqz p3, :cond_4

    .line 72
    .line 73
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzddm;->zzb()V

    .line 74
    .line 75
    .line 76
    :cond_4
    sget-object v3, LC6/n;->D:LC6/n;

    .line 77
    .line 78
    iget-object v3, v3, LC6/n;->b:LXd/c;

    .line 79
    .line 80
    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcvd;->zzj()Lcom/google/android/gms/internal/ads/zzdnl;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzfkn;->zzQ:I

    .line 87
    .line 88
    const/4 v7, -0x1

    .line 89
    if-eq v6, v7, :cond_5

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzemn;->zze:Lcom/google/android/gms/internal/ads/zzflg;

    .line 93
    .line 94
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzflg;->zzk:LD6/A1;

    .line 95
    .line 96
    if-eqz v7, :cond_7

    .line 97
    .line 98
    iget v7, v7, LD6/A1;->a:I

    .line 99
    .line 100
    if-ne v7, v15, :cond_6

    .line 101
    .line 102
    const/4 v6, 0x7

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    const/4 v8, 0x2

    .line 105
    if-ne v7, v8, :cond_7

    .line 106
    .line 107
    const/4 v6, 0x6

    .line 108
    goto :goto_4

    .line 109
    :cond_7
    sget v7, LG6/L;->b:I

    .line 110
    .line 111
    const-string v7, "Error setting app open orientation; no targeting orientation available."

    .line 112
    .line 113
    invoke-static {v7}, LH6/l;->a(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_4
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzemn;->zza:LH6/a;

    .line 117
    .line 118
    move-object v8, v5

    .line 119
    move v5, v6

    .line 120
    move-object v6, v7

    .line 121
    iget-object v7, v2, Lcom/google/android/gms/internal/ads/zzfkn;->zzB:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v9, v2, Lcom/google/android/gms/internal/ads/zzfkn;->zzs:Lcom/google/android/gms/internal/ads/zzfks;

    .line 124
    .line 125
    iget-object v10, v9, Lcom/google/android/gms/internal/ads/zzfks;->zzb:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzfks;->zza:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzemn;->zze:Lcom/google/android/gms/internal/ads/zzflg;

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfkn;->zzb()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_8

    .line 136
    .line 137
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzh:Lcom/google/android/gms/internal/ads/zzekz;

    .line 138
    .line 139
    :goto_5
    move-object v13, v2

    .line 140
    goto :goto_6

    .line 141
    :cond_8
    const/4 v2, 0x0

    .line 142
    goto :goto_5

    .line 143
    :goto_6
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 144
    .line 145
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzchu;->zzn()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    move-object v2, v10

    .line 150
    move-object v10, v9

    .line 151
    move-object v9, v2

    .line 152
    move-object/from16 v12, p3

    .line 153
    .line 154
    move-object v2, v3

    .line 155
    move-object v3, v1

    .line 156
    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/zzdnl;Lcom/google/android/gms/internal/ads/zzclb;ILH6/a;Ljava/lang/String;LC6/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzddm;Lcom/google/android/gms/internal/ads/zzekz;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzemn;->zzi:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 160
    .line 161
    move-object/from16 v3, p2

    .line 162
    .line 163
    invoke-static {v3, v2, v15, v1}, LXd/c;->t(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLcom/google/android/gms/internal/ads/zzdzt;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfkn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzemn;->zzc:Lcom/google/android/gms/internal/ads/zzfkn;

    return-object v0
.end method
