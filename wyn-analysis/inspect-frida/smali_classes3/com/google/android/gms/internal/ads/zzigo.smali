.class final Lcom/google/android/gms/internal/ads/zzigo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic zza(Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)Lcom/google/android/gms/internal/ads/zzidl;
    .locals 2

    .line 1
    invoke-static {p0, p2}, Lcom/google/android/gms/internal/ads/zzigo;->zzb(Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzigo;->zzb(Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/android/gms/internal/ads/zzidl;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/internal/ads/zzidl;

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/gms/internal/ads/zzigq;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, p1, p0, v1}, Lcom/google/android/gms/internal/ads/zzigq;-><init>(Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzidl;[B)V

    .line 29
    .line 30
    .line 31
    move-object p0, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object p0
.end method

.method private static final zzb(Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzidl;->zzq()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzigo;->zzc(ILjava/util/ArrayDeque;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzigq;->zzn(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/google/android/gms/internal/ads/zzidl;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-lt v2, v1, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzigq;->zzn(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/google/android/gms/internal/ads/zzidl;

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lcom/google/android/gms/internal/ads/zzidl;

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-ge v2, v0, :cond_1

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/android/gms/internal/ads/zzidl;

    .line 74
    .line 75
    new-instance v4, Lcom/google/android/gms/internal/ads/zzigq;

    .line 76
    .line 77
    invoke-direct {v4, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzigq;-><init>(Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzidl;[B)V

    .line 78
    .line 79
    .line 80
    move-object v1, v4

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzigq;

    .line 83
    .line 84
    invoke-direct {v0, v1, p0, v3}, Lcom/google/android/gms/internal/ads/zzigq;-><init>(Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzidl;[B)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzigq;->zzb()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzigo;->zzc(ILjava/util/ArrayDeque;)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    add-int/lit8 p0, p0, 0x1

    .line 102
    .line 103
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzigq;->zzn(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lcom/google/android/gms/internal/ads/zzidl;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzidl;->zzb()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-ge v1, p0, :cond_2

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Lcom/google/android/gms/internal/ads/zzidl;

    .line 124
    .line 125
    new-instance v1, Lcom/google/android/gms/internal/ads/zzigq;

    .line 126
    .line 127
    invoke-direct {v1, p0, v0, v3}, Lcom/google/android/gms/internal/ads/zzigq;-><init>(Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzidl;[B)V

    .line 128
    .line 129
    .line 130
    move-object v0, v1

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_3
    :goto_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    instance-of v0, p0, Lcom/google/android/gms/internal/ads/zzigq;

    .line 141
    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    check-cast p0, Lcom/google/android/gms/internal/ads/zzigq;

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzigq;->zzo()Lcom/google/android/gms/internal/ads/zzidl;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzigo;->zzb(Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzigq;->zzF()Lcom/google/android/gms/internal/ads/zzidl;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzigo;->zzb(Lcom/google/android/gms/internal/ads/zzidl;Ljava/util/ArrayDeque;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const-string v0, "Has a new type of ByteString been created? Found "

    .line 172
    .line 173
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
.end method

.method private static final zzc(ILjava/util/ArrayDeque;)I
    .locals 0

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzigq;->zzb:[I

    .line 2
    .line 3
    invoke-static {p1, p0}, Ljava/util/Arrays;->binarySearch([II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    neg-int p0, p0

    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    :cond_0
    return p0
.end method
