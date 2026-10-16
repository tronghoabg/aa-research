.class final Lcom/google/android/gms/internal/ads/zzejs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhcc;


# instance fields
.field final synthetic zza:Z

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzejt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzejt;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzejs;->zza:Z

    .line 2
    .line 3
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejt;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    sget p1, LG6/L;->b:I

    .line 2
    .line 3
    const-string p1, "Failed to get signals bundle"

    .line 4
    .line 5
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejt;

    .line 2
    .line 3
    check-cast p1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeju;->zzf()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_a

    .line 10
    .line 11
    const-string v1, "ad_types"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Ljava/util/List;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v2, v1, [Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    check-cast v1, [Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    instance-of v4, v3, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 73
    .line 74
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_9

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/4 v4, 0x2

    .line 100
    const/4 v6, 0x3

    .line 101
    const/4 v7, 0x1

    .line 102
    sparse-switch v3, :sswitch_data_0

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :sswitch_0
    const-string v3, "interstitial"

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    move v2, v7

    .line 115
    goto :goto_5

    .line 116
    :sswitch_1
    const-string v3, "rewarded"

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    move v2, v6

    .line 125
    goto :goto_5

    .line 126
    :sswitch_2
    const-string v3, "native"

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    move v2, v4

    .line 135
    goto :goto_5

    .line 136
    :sswitch_3
    const-string v3, "banner"

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    goto :goto_5

    .line 146
    :cond_4
    :goto_4
    const/4 v2, -0x1

    .line 147
    :goto_5
    if-eqz v2, :cond_8

    .line 148
    .line 149
    if-eq v2, v7, :cond_7

    .line 150
    .line 151
    if-eq v2, v4, :cond_6

    .line 152
    .line 153
    if-eq v2, v6, :cond_5

    .line 154
    .line 155
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;->zza:Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_5
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;->zzj:Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_6
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;->zzf:Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;->zzc:Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;->zzb:Lcom/google/android/gms/internal/ads/zzbic$zzd$zza;

    .line 168
    .line 169
    :goto_6
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzejt;->zze(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzd;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzejt;->zzb(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzbic$zzab;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzejs;->zza:Z

    .line 182
    .line 183
    new-instance v2, Lcom/google/android/gms/internal/ads/zzejr;

    .line 184
    .line 185
    move-object v3, p0

    .line 186
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzejr;-><init>(Lcom/google/android/gms/internal/ads/zzejs;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/zzbic$zzab;Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzd;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/zzeju;->zza:Lcom/google/android/gms/internal/ads/zzejh;

    .line 190
    .line 191
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzejh;->zza(Lcom/google/android/gms/internal/ads/zzfos;)V

    .line 192
    .line 193
    .line 194
    :cond_a
    return-void

    .line 195
    :sswitch_data_0
    .sparse-switch
        -0x533a80d4 -> :sswitch_3
        -0x3ebdafe9 -> :sswitch_2
        -0xe47b3f2 -> :sswitch_1
        0x240b672c -> :sswitch_0
    .end sparse-switch
.end method
