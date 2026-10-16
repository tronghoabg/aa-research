.class public final LK8/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:LJ8/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzagv;)V
    .locals 10

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzc()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzb()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzb()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzh()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x0

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    iput v5, p0, LK8/S;->a:I

    .line 34
    .line 35
    iput-object v7, p0, LK8/S;->b:LJ8/a;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzd()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v8, -0x1

    .line 46
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    sparse-switch v9, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :sswitch_0
    const-string v9, "RECOVER_EMAIL"

    .line 55
    .line 56
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v8, v0

    .line 64
    goto :goto_1

    .line 65
    :sswitch_1
    const-string v9, "EMAIL_SIGNIN"

    .line 66
    .line 67
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v8, v4

    .line 75
    goto :goto_1

    .line 76
    :sswitch_2
    const-string v9, "VERIFY_AND_CHANGE_EMAIL"

    .line 77
    .line 78
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v8, v5

    .line 86
    goto :goto_1

    .line 87
    :sswitch_3
    const-string v9, "VERIFY_EMAIL"

    .line 88
    .line 89
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move v8, v1

    .line 97
    goto :goto_1

    .line 98
    :sswitch_4
    const-string v9, "PASSWORD_RESET"

    .line 99
    .line 100
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_6

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    move v8, v2

    .line 108
    goto :goto_1

    .line 109
    :sswitch_5
    const-string v9, "REVERT_SECOND_FACTOR_ADDITION"

    .line 110
    .line 111
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-nez v6, :cond_7

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    move v8, v3

    .line 119
    :goto_1
    packed-switch v8, :pswitch_data_0

    .line 120
    .line 121
    .line 122
    move v0, v5

    .line 123
    goto :goto_2

    .line 124
    :pswitch_0
    move v0, v1

    .line 125
    goto :goto_2

    .line 126
    :pswitch_1
    move v0, v4

    .line 127
    goto :goto_2

    .line 128
    :pswitch_2
    move v0, v2

    .line 129
    goto :goto_2

    .line 130
    :pswitch_3
    move v0, v3

    .line 131
    goto :goto_2

    .line 132
    :pswitch_4
    const/4 v0, 0x6

    .line 133
    :goto_2
    :pswitch_5
    iput v0, p0, LK8/S;->a:I

    .line 134
    .line 135
    if-eq v0, v4, :cond_c

    .line 136
    .line 137
    if-ne v0, v5, :cond_8

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzf()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    new-instance v7, LK8/P;

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzb()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p1}, Landroid/support/v4/media/session/b;->y0(Lcom/google/android/gms/internal/firebase-auth-api/zzags;)LJ8/t;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-object v0, v7, LJ8/a;->a:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzg()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    new-instance v7, LK8/N;

    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzc()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzb()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-direct {v7, v0, p1}, LK8/N;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zze()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_b

    .line 197
    .line 198
    new-instance v7, LK8/P;

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagv;->zzb()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iput-object p1, v7, LJ8/a;->a:Ljava/lang/String;

    .line 211
    .line 212
    :cond_b
    :goto_3
    iput-object v7, p0, LK8/S;->b:LJ8/a;

    .line 213
    .line 214
    return-void

    .line 215
    :cond_c
    :goto_4
    iput-object v7, p0, LK8/S;->b:LJ8/a;

    .line 216
    .line 217
    return-void

    .line 218
    nop

    .line 219
    :sswitch_data_0
    .sparse-switch
        -0x6fbac124 -> :sswitch_5
        -0x56916d75 -> :sswitch_4
        -0x4ffacbca -> :sswitch_3
        -0x4183d145 -> :sswitch_2
        0x33e669c5 -> :sswitch_1
        0x39d86cc1 -> :sswitch_0
    .end sparse-switch

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
