.class public final LA7/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA7/N1;

.field public final synthetic c:LA7/m1;


# direct methods
.method public synthetic constructor <init>(LA7/m1;LA7/N1;I)V
    .locals 0

    .line 1
    iput p3, p0, LA7/q1;->a:I

    iput-object p2, p0, LA7/q1;->b:LA7/N1;

    iput-object p1, p0, LA7/q1;->c:LA7/m1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LA7/q1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/q1;->b:LA7/N1;

    .line 7
    .line 8
    iget-object v1, p0, LA7/q1;->c:LA7/m1;

    .line 9
    .line 10
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Failed to send consent settings to service"

    .line 19
    .line 20
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_0
    invoke-interface {v2, v0}, LA7/F;->f(LA7/N1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LA7/m1;->v0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "Failed to send consent settings to the service"

    .line 39
    .line 40
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :pswitch_0
    iget-object v0, p0, LA7/q1;->b:LA7/N1;

    .line 47
    .line 48
    iget-object v1, p0, LA7/q1;->c:LA7/m1;

    .line 49
    .line 50
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Failed to send measurementEnabled to service"

    .line 59
    .line 60
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :try_start_1
    invoke-interface {v2, v0}, LA7/F;->H(LA7/N1;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, LA7/m1;->v0()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_1
    move-exception v0

    .line 74
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "Failed to send measurementEnabled to the service"

    .line 79
    .line 80
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 81
    .line 82
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, LA7/q1;->b:LA7/N1;

    .line 87
    .line 88
    iget-object v1, p0, LA7/q1;->c:LA7/m1;

    .line 89
    .line 90
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 91
    .line 92
    if-nez v2, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "Failed to send app backgrounded"

    .line 99
    .line 100
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    :try_start_2
    invoke-interface {v2, v0}, LA7/F;->c(LA7/N1;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, LA7/m1;->v0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catch_2
    move-exception v0

    .line 114
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v2, "Failed to send app backgrounded to the service"

    .line 119
    .line 120
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 121
    .line 122
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    return-void

    .line 126
    :pswitch_2
    iget-object v0, p0, LA7/q1;->b:LA7/N1;

    .line 127
    .line 128
    iget-object v1, p0, LA7/q1;->c:LA7/m1;

    .line 129
    .line 130
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 131
    .line 132
    if-nez v2, :cond_3

    .line 133
    .line 134
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v1, "Discarding data. Failed to send app launch"

    .line 139
    .line 140
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    :try_start_3
    invoke-interface {v2, v0}, LA7/F;->b(LA7/N1;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, LA7/n0;

    .line 152
    .line 153
    invoke-virtual {v3}, LA7/n0;->k()LA7/H;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3}, LA7/H;->n0()Z

    .line 158
    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    invoke-virtual {v1, v2, v3, v0}, LA7/m1;->l0(LA7/F;Lf7/a;LA7/N1;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, LA7/m1;->v0()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catch_3
    move-exception v0

    .line 169
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "Failed to send app launch to the service"

    .line 174
    .line 175
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 176
    .line 177
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :goto_3
    return-void

    .line 181
    :pswitch_3
    iget-object v0, p0, LA7/q1;->b:LA7/N1;

    .line 182
    .line 183
    iget-object v1, p0, LA7/q1;->c:LA7/m1;

    .line 184
    .line 185
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 186
    .line 187
    if-nez v2, :cond_4

    .line 188
    .line 189
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "Failed to reset data on the service: not connected to service"

    .line 194
    .line 195
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_4
    :try_start_4
    invoke-interface {v2, v0}, LA7/F;->g(LA7/N1;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :catch_4
    move-exception v0

    .line 206
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const-string v3, "Failed to reset data on the service: remote exception"

    .line 211
    .line 212
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 213
    .line 214
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :goto_4
    invoke-virtual {v1}, LA7/m1;->v0()V

    .line 218
    .line 219
    .line 220
    :goto_5
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
