.class public final Lcom/google/android/recaptcha/internal/zzer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzfe;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzer;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzer;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzer;->zza:Lcom/google/android/recaptcha/internal/zzer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs zza(ILcom/google/android/recaptcha/internal/zzek;[Lcom/google/android/recaptcha/internal/zzrr;)V
    .locals 11
    .param p2    # Lcom/google/android/recaptcha/internal/zzek;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Lcom/google/android/recaptcha/internal/zzrr;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/recaptcha/internal/zzby;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    array-length v2, p3

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x4

    .line 6
    if-eqz v2, :cond_b

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzrm;->zzf()Lcom/google/android/recaptcha/internal/zzrj;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    move v6, v0

    .line 13
    :goto_0
    if-ge v6, v2, :cond_a

    .line 14
    .line 15
    aget-object v7, p3, v6

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzek;->zzc()Lcom/google/android/recaptcha/internal/zzel;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzel;->zza(Lcom/google/android/recaptcha/internal/zzrr;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    if-eqz v7, :cond_9

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzrl;->zzf()Lcom/google/android/recaptcha/internal/zzrk;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    instance-of v9, v7, Ljava/lang/Integer;

    .line 32
    .line 33
    if-eqz v9, :cond_0

    .line 34
    .line 35
    check-cast v7, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzt(I)Lcom/google/android/recaptcha/internal/zzrk;

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_0
    instance-of v9, v7, Ljava/lang/Short;

    .line 47
    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    check-cast v7, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Number;->shortValue()S

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzs(I)Lcom/google/android/recaptcha/internal/zzrk;

    .line 57
    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :cond_1
    instance-of v9, v7, Ljava/lang/Byte;

    .line 62
    .line 63
    if-eqz v9, :cond_2

    .line 64
    .line 65
    check-cast v7, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/Number;->byteValue()B

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    new-array v9, v1, [B

    .line 72
    .line 73
    aput-byte v7, v9, v0

    .line 74
    .line 75
    invoke-static {v9, v0, v1}, Lcom/google/android/recaptcha/internal/zziv;->zzk([BII)Lcom/google/android/recaptcha/internal/zziv;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zze(Lcom/google/android/recaptcha/internal/zziv;)Lcom/google/android/recaptcha/internal/zzrk;

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    instance-of v9, v7, Ljava/lang/Long;

    .line 84
    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    check-cast v7, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    invoke-virtual {v8, v9, v10}, Lcom/google/android/recaptcha/internal/zzrk;->zzu(J)Lcom/google/android/recaptcha/internal/zzrk;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    instance-of v9, v7, Ljava/lang/Double;

    .line 98
    .line 99
    if-eqz v9, :cond_4

    .line 100
    .line 101
    check-cast v7, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    invoke-virtual {v8, v9, v10}, Lcom/google/android/recaptcha/internal/zzrk;->zzq(D)Lcom/google/android/recaptcha/internal/zzrk;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    instance-of v9, v7, Ljava/lang/Float;

    .line 112
    .line 113
    if-eqz v9, :cond_5

    .line 114
    .line 115
    check-cast v7, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzr(F)Lcom/google/android/recaptcha/internal/zzrk;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    instance-of v9, v7, Ljava/lang/Boolean;

    .line 126
    .line 127
    if-eqz v9, :cond_6

    .line 128
    .line 129
    check-cast v7, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzd(Z)Lcom/google/android/recaptcha/internal/zzrk;

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_6
    instance-of v9, v7, Ljava/lang/Character;

    .line 140
    .line 141
    if-eqz v9, :cond_7

    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzrk;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    instance-of v9, v7, Ljava/lang/String;

    .line 152
    .line 153
    if-eqz v9, :cond_8

    .line 154
    .line 155
    check-cast v7, Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzv(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzrk;

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v8, v7}, Lcom/google/android/recaptcha/internal/zzrk;->zzv(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzrk;

    .line 166
    .line 167
    .line 168
    :goto_1
    invoke-virtual {v8}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    check-cast v7, Lcom/google/android/recaptcha/internal/zzrl;

    .line 173
    .line 174
    invoke-virtual {v5, v7}, Lcom/google/android/recaptcha/internal/zzrj;->zze(Lcom/google/android/recaptcha/internal/zzrl;)Lcom/google/android/recaptcha/internal/zzrj;

    .line 175
    .line 176
    .line 177
    add-int/2addr v6, v1

    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_9
    new-instance p1, Lcom/google/android/recaptcha/internal/zzby;

    .line 181
    .line 182
    invoke-direct {p1, v4, v4, v3}, Lcom/google/android/recaptcha/internal/zzby;-><init>(IILjava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_a
    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzek;->zzc()Lcom/google/android/recaptcha/internal/zzel;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {v5}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    check-cast p3, Lcom/google/android/recaptcha/internal/zzrm;

    .line 195
    .line 196
    invoke-virtual {p3}, Lcom/google/android/recaptcha/internal/zzig;->zzd()[B

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    array-length v1, p3

    .line 201
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzhz;->zzh()Lcom/google/android/recaptcha/internal/zzhz;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v2, p3, v0, v1}, Lcom/google/android/recaptcha/internal/zzhz;->zzi([BII)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    invoke-virtual {p2, p1, p3}, Lcom/google/android/recaptcha/internal/zzel;->zze(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_b
    new-instance p1, Lcom/google/android/recaptcha/internal/zzby;

    .line 214
    .line 215
    const/4 p2, 0x3

    .line 216
    invoke-direct {p1, v4, p2, v3}, Lcom/google/android/recaptcha/internal/zzby;-><init>(IILjava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    throw p1
.end method
