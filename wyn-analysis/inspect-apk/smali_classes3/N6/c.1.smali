.class public final LN6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhcc;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzbzx;

.field public final synthetic c:Z

.field public final synthetic d:LN6/j;


# direct methods
.method public constructor <init>(LN6/j;Lcom/google/android/gms/internal/ads/zzbzx;ZI)V
    .locals 0

    .line 1
    iput p4, p0, LN6/c;->a:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, LN6/c;->b:Lcom/google/android/gms/internal/ads/zzbzx;

    .line 10
    .line 11
    iput-boolean p3, p0, LN6/c;->c:Z

    .line 12
    .line 13
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LN6/c;->d:LN6/j;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, LN6/c;->b:Lcom/google/android/gms/internal/ads/zzbzx;

    .line 23
    .line 24
    iput-boolean p3, p0, LN6/c;->c:Z

    .line 25
    .line 26
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LN6/c;->d:LN6/j;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, LN6/c;->b:Lcom/google/android/gms/internal/ads/zzbzx;

    .line 4
    .line 5
    const-string v2, "Internal error: "

    .line 6
    .line 7
    iget v3, p0, LN6/c;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/lit8 v3, v3, 0x10

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzbzx;->zzf(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p1

    .line 46
    sget v1, LG6/L;->b:I

    .line 47
    .line 48
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    add-int/lit8 v3, v3, 0x10

    .line 65
    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzbzx;->zzf(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_1
    move-exception p1

    .line 86
    sget v1, LG6/L;->b:I

    .line 87
    .line 88
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-boolean v3, p0, LN6/c;->c:Z

    .line 7
    .line 8
    iget-object v4, p0, LN6/c;->d:LN6/j;

    .line 9
    .line 10
    iget-object v5, p0, LN6/c;->b:Lcom/google/android/gms/internal/ads/zzbzx;

    .line 11
    .line 12
    iget v6, p0, LN6/c;->a:I

    .line 13
    .line 14
    packed-switch v6, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v5, p1}, Lcom/google/android/gms/internal/ads/zzbzx;->zze(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v5, v4, LN6/j;->m:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Landroid/net/Uri;

    .line 43
    .line 44
    iget-object v5, v4, LN6/j;->y:Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v6, v4, LN6/j;->z:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v3, v5, v6}, LN6/j;->V(Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 49
    .line 50
    .line 51
    move-result v5
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    iget-object v6, v4, LN6/j;->l:Lcom/google/android/gms/internal/ads/zzfsm;

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    :try_start_1
    iget-object v5, v4, LN6/j;->v:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v3, v5, v1}, LN6/j;->Y(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v6, v3, v2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfsm;->zzb(Ljava/lang/String;LH6/q;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzdfo;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zziC:Lcom/google/android/gms/internal/ads/zzbio;

    .line 73
    .line 74
    sget-object v7, LD6/s;->e:LD6/s;

    .line 75
    .line 76
    iget-object v7, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 77
    .line 78
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_1

    .line 89
    .line 90
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v6, v3, v2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfsm;->zzb(Ljava/lang/String;LH6/q;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzdfo;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_1
    sget v1, LG6/L;->b:I

    .line 99
    .line 100
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 105
    .line 106
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v7
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 117
    iget-object v8, v4, LN6/j;->x:Ljava/util/ArrayList;

    .line 118
    .line 119
    iget-object v9, v4, LN6/j;->w:Ljava/util/ArrayList;

    .line 120
    .line 121
    if-eqz v7, :cond_5

    .line 122
    .line 123
    :try_start_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Landroid/net/Uri;

    .line 128
    .line 129
    invoke-static {v7, v9, v8}, LN6/j;->V(Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_4

    .line 134
    .line 135
    iget-object v6, v4, LN6/j;->s:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-interface {v5, p1}, Lcom/google/android/gms/internal/ads/zzbzx;->zze(Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    iget-boolean v5, v4, LN6/j;->n:Z

    .line 144
    .line 145
    if-nez v5, :cond_6

    .line 146
    .line 147
    if-eqz v3, :cond_9

    .line 148
    .line 149
    :cond_6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_9

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Landroid/net/Uri;

    .line 164
    .line 165
    invoke-static {v3, v9, v8}, LN6/j;->V(Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 166
    .line 167
    .line 168
    move-result v5
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 169
    iget-object v6, v4, LN6/j;->l:Lcom/google/android/gms/internal/ads/zzfsm;

    .line 170
    .line 171
    if-eqz v5, :cond_8

    .line 172
    .line 173
    :try_start_4
    iget-object v5, v4, LN6/j;->v:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v3, v5, v1}, LN6/j;->Y(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v6, v3, v2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfsm;->zzb(Ljava/lang/String;LH6/q;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzdfo;)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :catch_1
    move-exception p1

    .line 188
    goto :goto_3

    .line 189
    :cond_8
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zziC:Lcom/google/android/gms/internal/ads/zzbio;

    .line 190
    .line 191
    sget-object v7, LD6/s;->e:LD6/s;

    .line 192
    .line 193
    iget-object v7, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 194
    .line 195
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_7

    .line 206
    .line 207
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v6, v3, v2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfsm;->zzb(Ljava/lang/String;LH6/q;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzdfo;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :goto_3
    sget v1, LG6/L;->b:I

    .line 216
    .line 217
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :cond_9
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
