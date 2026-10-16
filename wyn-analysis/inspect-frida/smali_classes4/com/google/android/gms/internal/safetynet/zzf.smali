.class public abstract Lcom/google/android/gms/internal/safetynet/zzf;
.super Lcom/google/android/gms/internal/safetynet/zzb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/safetynet/zzg;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/safetynet/zzb;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const/4 p3, 0x1

    .line 2
    if-eq p1, p3, :cond_9

    .line 3
    .line 4
    const/4 p4, 0x2

    .line 5
    if-eq p1, p4, :cond_8

    .line 6
    .line 7
    const/4 p4, 0x3

    .line 8
    if-eq p1, p4, :cond_7

    .line 9
    .line 10
    const/4 p4, 0x4

    .line 11
    if-eq p1, p4, :cond_6

    .line 12
    .line 13
    const/4 p4, 0x6

    .line 14
    if-eq p1, p4, :cond_5

    .line 15
    .line 16
    const/16 p4, 0x8

    .line 17
    .line 18
    if-eq p1, p4, :cond_4

    .line 19
    .line 20
    const/16 p4, 0xa

    .line 21
    .line 22
    if-eq p1, p4, :cond_3

    .line 23
    .line 24
    const/16 p4, 0xb

    .line 25
    .line 26
    if-eq p1, p4, :cond_2

    .line 27
    .line 28
    const/16 p4, 0xf

    .line 29
    .line 30
    if-eq p1, p4, :cond_1

    .line 31
    .line 32
    const/16 p4, 0x10

    .line 33
    .line 34
    if-eq p1, p4, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    :cond_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 39
    .line 40
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-interface {p0, p1, p4, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzk(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 60
    .line 61
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 66
    .line 67
    sget-object p4, LC7/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 68
    .line 69
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, LC7/k;

    .line 74
    .line 75
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzi(Lcom/google/android/gms/common/api/Status;LC7/k;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 81
    .line 82
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 87
    .line 88
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/safetynet/zzg;->zzc(Lcom/google/android/gms/common/api/Status;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 94
    .line 95
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 100
    .line 101
    invoke-static {p2}, Lcom/google/android/gms/internal/safetynet/zzc;->zzc(Landroid/os/Parcel;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzf(Lcom/google/android/gms/common/api/Status;Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 110
    .line 111
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 116
    .line 117
    sget-object p4, LC7/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 118
    .line 119
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, LC7/i;

    .line 124
    .line 125
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzg(Lcom/google/android/gms/common/api/Status;LC7/i;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 130
    .line 131
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 136
    .line 137
    sget-object p4, LC7/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 138
    .line 139
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, LC7/j;

    .line 144
    .line 145
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzh(Lcom/google/android/gms/common/api/Status;LC7/j;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 150
    .line 151
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 156
    .line 157
    invoke-static {p2}, Lcom/google/android/gms/internal/safetynet/zzc;->zzc(Landroid/os/Parcel;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzb(Lcom/google/android/gms/common/api/Status;Z)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_7
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 166
    .line 167
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 172
    .line 173
    sget-object p4, LC7/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 174
    .line 175
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    check-cast p2, LC7/b;

    .line 180
    .line 181
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzj(Lcom/google/android/gms/common/api/Status;LC7/b;)V

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/safetynet/zzg;->zze(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_9
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 194
    .line 195
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 200
    .line 201
    sget-object p4, LC7/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 202
    .line 203
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/safetynet/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    check-cast p2, LC7/h;

    .line 208
    .line 209
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzg;->zzd(Lcom/google/android/gms/common/api/Status;LC7/h;)V

    .line 210
    .line 211
    .line 212
    :goto_0
    return p3
.end method
