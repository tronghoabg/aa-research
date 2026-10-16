.class public final Lcom/google/android/gms/internal/ads/zzeve;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcq;


# instance fields
.field public final zza:LD6/x1;

.field public final zzb:Ljava/lang/String;

.field public final zzc:Z

.field public final zzd:Ljava/lang/String;

.field public final zze:F

.field public final zzf:I

.field public final zzg:I

.field public final zzh:Ljava/lang/String;

.field public final zzi:I

.field public final zzj:Z

.field public final zzk:Lb1/c;

.field public final zzl:Lcom/google/android/gms/internal/ads/zzevb;


# direct methods
.method public constructor <init>(LD6/x1;Ljava/lang/String;ZLjava/lang/String;FIILjava/lang/String;IZLb1/c;Lcom/google/android/gms/internal/ads/zzevb;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "the adSize must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeve;->zza:LD6/x1;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzb:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzc:Z

    .line 14
    .line 15
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzd:Ljava/lang/String;

    .line 16
    .line 17
    iput p5, p0, Lcom/google/android/gms/internal/ads/zzeve;->zze:F

    .line 18
    .line 19
    iput p6, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzf:I

    .line 20
    .line 21
    iput p7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzg:I

    .line 22
    .line 23
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzh:Ljava/lang/String;

    .line 24
    .line 25
    iput p9, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzi:I

    .line 26
    .line 27
    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzj:Z

    .line 28
    .line 29
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzk:Lb1/c;

    .line 30
    .line 31
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzl:Lcom/google/android/gms/internal/ads/zzevb;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeve;->zza:LD6/x1;

    .line 2
    .line 3
    check-cast p1, Landroid/os/Bundle;

    .line 4
    .line 5
    iget v1, v0, LD6/x1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, -0x1

    .line 10
    if-ne v1, v4, :cond_0

    .line 11
    .line 12
    move v5, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v5, v2

    .line 15
    :goto_0
    const-string v6, "smart_w"

    .line 16
    .line 17
    const-string v7, "full"

    .line 18
    .line 19
    invoke-static {p1, v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v5, -0x2

    .line 23
    iget v6, v0, LD6/x1;->b:I

    .line 24
    .line 25
    if-ne v6, v5, :cond_1

    .line 26
    .line 27
    move v5, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v5, v2

    .line 30
    :goto_1
    const-string v7, "smart_h"

    .line 31
    .line 32
    const-string v8, "auto"

    .line 33
    .line 34
    invoke-static {p1, v7, v8, v5}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    iget-boolean v5, v0, LD6/x1;->j:Z

    .line 38
    .line 39
    const-string v7, "ene"

    .line 40
    .line 41
    invoke-static {p1, v7, v3, v5}, Lcom/google/android/gms/internal/ads/zzflv;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 42
    .line 43
    .line 44
    const-string v5, "102"

    .line 45
    .line 46
    iget-boolean v7, v0, LD6/x1;->m:Z

    .line 47
    .line 48
    const-string v8, "rafmt"

    .line 49
    .line 50
    invoke-static {p1, v8, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v5, "108"

    .line 54
    .line 55
    iget-boolean v7, v0, LD6/x1;->p:Z

    .line 56
    .line 57
    invoke-static {p1, v8, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const-string v5, "103"

    .line 61
    .line 62
    iget-boolean v7, v0, LD6/x1;->n:Z

    .line 63
    .line 64
    invoke-static {p1, v8, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    const-string v5, "105"

    .line 68
    .line 69
    iget-boolean v7, v0, LD6/x1;->o:Z

    .line 70
    .line 71
    invoke-static {p1, v8, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzj:Z

    .line 75
    .line 76
    const-string v8, "inline_adaptive_slot"

    .line 77
    .line 78
    invoke-static {p1, v8, v3, v5}, Lcom/google/android/gms/internal/ads/zzflv;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 79
    .line 80
    .line 81
    const-string v5, "interscroller_slot"

    .line 82
    .line 83
    invoke-static {p1, v5, v3, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 84
    .line 85
    .line 86
    const-string v5, "format"

    .line 87
    .line 88
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzb:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v5, "fluid"

    .line 94
    .line 95
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzc:Z

    .line 96
    .line 97
    const-string v8, "height"

    .line 98
    .line 99
    invoke-static {p1, v5, v8, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzd:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    xor-int/2addr v7, v3

    .line 109
    const-string v9, "sz"

    .line 110
    .line 111
    invoke-static {p1, v9, v5, v7}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v5, "u_sd"

    .line 115
    .line 116
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zze:F

    .line 117
    .line 118
    invoke-virtual {p1, v5, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 119
    .line 120
    .line 121
    const-string v5, "sw"

    .line 122
    .line 123
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzf:I

    .line 124
    .line 125
    invoke-virtual {p1, v5, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    const-string v5, "sh"

    .line 129
    .line 130
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzg:I

    .line 131
    .line 132
    invoke-virtual {p1, v5, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzh:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    xor-int/2addr v3, v7

    .line 142
    const-string v7, "sc"

    .line 143
    .line 144
    invoke-static {p1, v7, v5, v3}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzi:I

    .line 148
    .line 149
    if-eq v3, v4, :cond_2

    .line 150
    .line 151
    const-string v4, "u_mso"

    .line 152
    .line 153
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzk:Lb1/c;

    .line 157
    .line 158
    if-eqz v3, :cond_3

    .line 159
    .line 160
    const-string v4, "sam_t"

    .line 161
    .line 162
    iget v5, v3, Lb1/c;->b:I

    .line 163
    .line 164
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    const-string v4, "sam_b"

    .line 168
    .line 169
    iget v5, v3, Lb1/c;->d:I

    .line 170
    .line 171
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    const-string v4, "sam_l"

    .line 175
    .line 176
    iget v5, v3, Lb1/c;->a:I

    .line 177
    .line 178
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    const-string v4, "sam_r"

    .line 182
    .line 183
    iget v3, v3, Lb1/c;->c:I

    .line 184
    .line 185
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 186
    .line 187
    .line 188
    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeve;->zzl:Lcom/google/android/gms/internal/ads/zzevb;

    .line 189
    .line 190
    if-eqz v3, :cond_4

    .line 191
    .line 192
    const-string v4, "rc_tl"

    .line 193
    .line 194
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzevb;->zza:I

    .line 195
    .line 196
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    const-string v4, "rc_tr"

    .line 200
    .line 201
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzevb;->zzb:I

    .line 202
    .line 203
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 204
    .line 205
    .line 206
    const-string v4, "rc_bl"

    .line 207
    .line 208
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzevb;->zzc:I

    .line 209
    .line 210
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    const-string v4, "rc_br"

    .line 214
    .line 215
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzevb;->zzd:I

    .line 216
    .line 217
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v4, "is_fluid_height"

    .line 226
    .line 227
    const-string v5, "width"

    .line 228
    .line 229
    iget-object v7, v0, LD6/x1;->g:[LD6/x1;

    .line 230
    .line 231
    if-nez v7, :cond_5

    .line 232
    .line 233
    new-instance v2, Landroid/os/Bundle;

    .line 234
    .line 235
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v8, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    iget-boolean v0, v0, LD6/x1;->i:Z

    .line 245
    .line 246
    invoke-virtual {v2, v4, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_5
    :goto_2
    array-length v0, v7

    .line 254
    if-ge v2, v0, :cond_6

    .line 255
    .line 256
    aget-object v0, v7, v2

    .line 257
    .line 258
    new-instance v1, Landroid/os/Bundle;

    .line 259
    .line 260
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 261
    .line 262
    .line 263
    iget-boolean v6, v0, LD6/x1;->i:Z

    .line 264
    .line 265
    invoke-virtual {v1, v4, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 266
    .line 267
    .line 268
    iget v6, v0, LD6/x1;->b:I

    .line 269
    .line 270
    invoke-virtual {v1, v8, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    iget v0, v0, LD6/x1;->e:I

    .line 274
    .line 275
    invoke-virtual {v1, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    add-int/lit8 v2, v2, 0x1

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_6
    :goto_3
    const-string v0, "valid_ad_sizes"

    .line 285
    .line 286
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method
