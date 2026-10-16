.class public final Lcom/google/android/gms/internal/ads/zzbzz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zze:Lcom/google/android/gms/internal/ads/zzcet;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lx6/b;

.field private final zzc:LD6/Q0;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx6/b;LD6/Q0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbzz;->zzb:Lx6/b;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:LD6/Q0;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbzz;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcet;
    .locals 4

    .line 1
    const-class v0, Lcom/google/android/gms/internal/ads/zzbzz;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbzz;->zze:Lcom/google/android/gms/internal/ads/zzcet;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, LD6/q;->g:LD6/q;

    .line 9
    .line 10
    iget-object v1, v1, LD6/q;->b:LD6/o;

    .line 11
    .line 12
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 13
    .line 14
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v3, LD6/e;

    .line 21
    .line 22
    invoke-direct {v3, v1, p0, v2}, LD6/e;-><init>(LD6/o;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbvf;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v3, p0, v1}, LD6/p;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lcom/google/android/gms/internal/ads/zzcet;

    .line 31
    .line 32
    sput-object p0, Lcom/google/android/gms/internal/ads/zzbzz;->zze:Lcom/google/android/gms/internal/ads/zzcet;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbzz;->zze:Lcom/google/android/gms/internal/ads/zzcet;

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-object p0

    .line 41
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method


# virtual methods
.method public final zzb(LQ6/b;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v29

    .line 9
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbzz;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcet;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const-string v2, "Internal Error, query info generator is null."

    .line 18
    .line 19
    invoke-virtual {v1, v2}, LQ6/b;->onFailure(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v4, Lq7/b;

    .line 24
    .line 25
    invoke-direct {v4, v2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:LD6/Q0;

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    new-instance v6, Landroid/os/Bundle;

    .line 33
    .line 34
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v8, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v16, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v17, Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct/range {v17 .. v17}, Landroid/os/Bundle;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v18, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v25, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v2, LD6/v1;

    .line 63
    .line 64
    const-wide/16 v31, 0x0

    .line 65
    .line 66
    const/16 v33, -0x1

    .line 67
    .line 68
    move-object v5, v3

    .line 69
    const/16 v3, 0x8

    .line 70
    .line 71
    move-object v9, v4

    .line 72
    move-object v7, v5

    .line 73
    const-wide/16 v4, -0x1

    .line 74
    .line 75
    move-object v10, v7

    .line 76
    const/4 v7, -0x1

    .line 77
    move-object v11, v9

    .line 78
    const/4 v9, 0x0

    .line 79
    move-object v12, v10

    .line 80
    const/4 v10, -0x1

    .line 81
    move-object v13, v11

    .line 82
    const/4 v11, 0x0

    .line 83
    move-object v14, v12

    .line 84
    const/4 v12, 0x0

    .line 85
    move-object v15, v13

    .line 86
    const/4 v13, 0x0

    .line 87
    move-object/from16 v19, v14

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    move-object/from16 v20, v15

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    move-object/from16 v21, v19

    .line 94
    .line 95
    const/16 v19, 0x0

    .line 96
    .line 97
    move-object/from16 v22, v20

    .line 98
    .line 99
    const/16 v20, 0x0

    .line 100
    .line 101
    move-object/from16 v23, v21

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    move-object/from16 v24, v22

    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    move-object/from16 v26, v24

    .line 110
    .line 111
    const/16 v24, 0x0

    .line 112
    .line 113
    move-object/from16 v27, v26

    .line 114
    .line 115
    const v26, 0xea60

    .line 116
    .line 117
    .line 118
    move-object/from16 v28, v27

    .line 119
    .line 120
    const/16 v27, 0x0

    .line 121
    .line 122
    move-object/from16 v34, v28

    .line 123
    .line 124
    const/16 v28, 0x0

    .line 125
    .line 126
    move-object/from16 v35, v23

    .line 127
    .line 128
    move/from16 v23, v10

    .line 129
    .line 130
    move-object/from16 v37, v34

    .line 131
    .line 132
    move-object/from16 v36, v35

    .line 133
    .line 134
    invoke-direct/range {v2 .. v33}, LD6/v1;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;LD6/q1;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLD6/Q;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJI)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    move-object/from16 v36, v3

    .line 139
    .line 140
    move-object/from16 v37, v4

    .line 141
    .line 142
    move-wide/from16 v3, v29

    .line 143
    .line 144
    iput-wide v3, v5, LD6/Q0;->n:J

    .line 145
    .line 146
    invoke-static {v2, v5}, LD6/w1;->a(Landroid/content/Context;LD6/Q0;)LD6/v1;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzd:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzb:Lx6/b;

    .line 153
    .line 154
    new-instance v5, Lcom/google/android/gms/internal/ads/zzcex;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const/4 v6, 0x0

    .line 161
    invoke-direct {v5, v3, v4, v6, v2}, Lcom/google/android/gms/internal/ads/zzcex;-><init>(Ljava/lang/String;Ljava/lang/String;LD6/x1;LD6/v1;)V

    .line 162
    .line 163
    .line 164
    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbzy;

    .line 165
    .line 166
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbzy;-><init>(Lcom/google/android/gms/internal/ads/zzbzz;LQ6/b;)V

    .line 167
    .line 168
    .line 169
    move-object/from16 v14, v36

    .line 170
    .line 171
    move-object/from16 v15, v37

    .line 172
    .line 173
    invoke-interface {v14, v15, v5, v2}, Lcom/google/android/gms/internal/ads/zzcet;->zze(Lq7/a;Lcom/google/android/gms/internal/ads/zzcex;Lcom/google/android/gms/internal/ads/zzceq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :catch_0
    const-string v2, "Internal Error."

    .line 178
    .line 179
    invoke-virtual {v1, v2}, LQ6/b;->onFailure(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method
