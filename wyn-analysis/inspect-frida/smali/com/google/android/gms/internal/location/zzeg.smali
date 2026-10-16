.class public final Lcom/google/android/gms/internal/location/zzeg;
.super Lf7/a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/location/zzeg;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field zza:Lcom/google/android/gms/location/LocationRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzeh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzeh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzeg;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;ZZZZLjava/lang/String;J)V
    .locals 11

    .line 1
    move-wide/from16 v0, p8

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v4, Lx7/n;

    .line 9
    .line 10
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->a:I

    .line 11
    .line 12
    iget-wide v6, p1, Lcom/google/android/gms/location/LocationRequest;->b:J

    .line 13
    .line 14
    invoke-direct {v4, v5, v6, v7}, Lx7/n;-><init>(IJ)V

    .line 15
    .line 16
    .line 17
    iget-wide v5, p1, Lcom/google/android/gms/location/LocationRequest;->c:J

    .line 18
    .line 19
    invoke-virtual {v4, v5, v6}, Lx7/n;->d(J)V

    .line 20
    .line 21
    .line 22
    iget-wide v5, p1, Lcom/google/android/gms/location/LocationRequest;->d:J

    .line 23
    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    cmp-long v9, v5, v7

    .line 27
    .line 28
    if-ltz v9, :cond_0

    .line 29
    .line 30
    move v9, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v9, v3

    .line 33
    :goto_0
    const-string v10, "maxUpdateDelayMillis must be greater than or equal to 0"

    .line 34
    .line 35
    invoke-static {v10, v9}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    iput-wide v5, v4, Lx7/n;->d:J

    .line 39
    .line 40
    iget-wide v5, p1, Lcom/google/android/gms/location/LocationRequest;->e:J

    .line 41
    .line 42
    cmp-long v7, v5, v7

    .line 43
    .line 44
    if-lez v7, :cond_1

    .line 45
    .line 46
    move v7, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v7, v3

    .line 49
    :goto_1
    const-string v8, "durationMillis must be greater than 0"

    .line 50
    .line 51
    invoke-static {v8, v7}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    iput-wide v5, v4, Lx7/n;->e:J

    .line 55
    .line 56
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->f:I

    .line 57
    .line 58
    if-lez v5, :cond_2

    .line 59
    .line 60
    move v6, v2

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v6, v3

    .line 63
    :goto_2
    const-string v7, "maxUpdates must be greater than 0"

    .line 64
    .line 65
    invoke-static {v7, v6}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    iput v5, v4, Lx7/n;->f:I

    .line 69
    .line 70
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->g:F

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    cmpl-float v6, v5, v6

    .line 74
    .line 75
    if-ltz v6, :cond_3

    .line 76
    .line 77
    move v6, v2

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v6, v3

    .line 80
    :goto_3
    const-string v7, "minUpdateDistanceMeters must be greater than or equal to 0"

    .line 81
    .line 82
    invoke-static {v7, v6}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    iput v5, v4, Lx7/n;->g:F

    .line 86
    .line 87
    iget-boolean v5, p1, Lcom/google/android/gms/location/LocationRequest;->h:Z

    .line 88
    .line 89
    iput-boolean v5, v4, Lx7/n;->h:Z

    .line 90
    .line 91
    iget-wide v5, p1, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 92
    .line 93
    invoke-virtual {v4, v5, v6}, Lx7/n;->c(J)V

    .line 94
    .line 95
    .line 96
    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->j:I

    .line 97
    .line 98
    invoke-virtual {v4, v5}, Lx7/n;->b(I)V

    .line 99
    .line 100
    .line 101
    const/4 v5, 0x2

    .line 102
    iget v6, p1, Lcom/google/android/gms/location/LocationRequest;->k:I

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    if-eq v6, v2, :cond_5

    .line 107
    .line 108
    if-ne v6, v5, :cond_4

    .line 109
    .line 110
    move v8, v2

    .line 111
    move v7, v5

    .line 112
    goto :goto_5

    .line 113
    :cond_4
    move v8, v3

    .line 114
    :goto_4
    move v7, v6

    .line 115
    goto :goto_5

    .line 116
    :cond_5
    move v8, v2

    .line 117
    goto :goto_4

    .line 118
    :goto_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    new-array v9, v2, [Ljava/lang/Object;

    .line 123
    .line 124
    aput-object v7, v9, v3

    .line 125
    .line 126
    const-string v7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant"

    .line 127
    .line 128
    invoke-static {v8, v7, v9}, Lcom/google/android/gms/common/internal/v;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iput v6, v4, Lx7/n;->k:I

    .line 132
    .line 133
    iget-boolean v6, p1, Lcom/google/android/gms/location/LocationRequest;->l:Z

    .line 134
    .line 135
    iput-boolean v6, v4, Lx7/n;->l:Z

    .line 136
    .line 137
    iget-object v6, p1, Lcom/google/android/gms/location/LocationRequest;->m:Landroid/os/WorkSource;

    .line 138
    .line 139
    iput-object v6, v4, Lx7/n;->m:Landroid/os/WorkSource;

    .line 140
    .line 141
    iget-object p1, p1, Lcom/google/android/gms/location/LocationRequest;->n:Lcom/google/android/gms/internal/location/zze;

    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zze;->zza()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_7

    .line 150
    .line 151
    :cond_6
    move v3, v2

    .line 152
    :cond_7
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 153
    .line 154
    .line 155
    if-eqz p2, :cond_a

    .line 156
    .line 157
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_8

    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    goto :goto_7

    .line 165
    :cond_8
    new-instance p1, Landroid/os/WorkSource;

    .line 166
    .line 167
    invoke-direct {p1}, Landroid/os/WorkSource;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Lcom/google/android/gms/common/internal/g;

    .line 185
    .line 186
    iget v6, v3, Lcom/google/android/gms/common/internal/g;->a:I

    .line 187
    .line 188
    iget-object v3, v3, Lcom/google/android/gms/common/internal/g;->b:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {p1, v6, v3}, Ln7/g;->a(Landroid/os/WorkSource;ILjava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    :goto_7
    iput-object p1, v4, Lx7/n;->m:Landroid/os/WorkSource;

    .line 195
    .line 196
    :cond_a
    if-eqz p3, :cond_b

    .line 197
    .line 198
    invoke-virtual {v4, v2}, Lx7/n;->b(I)V

    .line 199
    .line 200
    .line 201
    :cond_b
    if-eqz p4, :cond_c

    .line 202
    .line 203
    iput v5, v4, Lx7/n;->k:I

    .line 204
    .line 205
    :cond_c
    if-eqz p5, :cond_d

    .line 206
    .line 207
    iput-boolean v2, v4, Lx7/n;->l:Z

    .line 208
    .line 209
    :cond_d
    if-eqz p6, :cond_e

    .line 210
    .line 211
    iput-boolean v2, v4, Lx7/n;->h:Z

    .line 212
    .line 213
    :cond_e
    const-wide p1, 0x7fffffffffffffffL

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    cmp-long p1, v0, p1

    .line 219
    .line 220
    if-eqz p1, :cond_f

    .line 221
    .line 222
    invoke-virtual {v4, v0, v1}, Lx7/n;->c(J)V

    .line 223
    .line 224
    .line 225
    :cond_f
    invoke-virtual {v4}, Lx7/n;->a()Lcom/google/android/gms/location/LocationRequest;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 230
    .line 231
    return-void
.end method

.method public static zza(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/location/zzeg;
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzeg;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const-wide v8, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/location/zzeg;-><init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;ZZZZLjava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/location/zzeg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/location/zzeg;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzeg;->zza:Lcom/google/android/gms/location/LocationRequest;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-static {p1, v3, v1, p2, v2}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
