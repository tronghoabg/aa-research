.class public final LA7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:LA7/r;


# direct methods
.method public synthetic constructor <init>(LA7/r;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    iput p5, p0, LA7/b;->a:I

    iput-object p2, p0, LA7/b;->b:Ljava/lang/String;

    iput-wide p3, p0, LA7/b;->c:J

    iput-object p1, p0, LA7/b;->d:LA7/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LA7/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/b;->d:LA7/r;

    .line 7
    .line 8
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LA7/b;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, LA7/r;->c:Lx/e;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-virtual {v4, v5}, LA7/i1;->k0(Z)LA7/j1;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/lit8 v3, v3, -0x1

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lx/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iget-object v3, v0, LA7/r;->b:Lx/e;

    .line 47
    .line 48
    invoke-virtual {v3, v1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Ljava/lang/Long;

    .line 53
    .line 54
    iget-wide v6, p0, LA7/b;->c:J

    .line 55
    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v3, "First ad unit exposure time was never set"

    .line 63
    .line 64
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 65
    .line 66
    invoke-virtual {v1, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    sub-long v8, v6, v8

    .line 75
    .line 76
    invoke-virtual {v3, v1}, Lx/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1, v8, v9, v4}, LA7/r;->k0(Ljava/lang/String;JLA7/j1;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {v2}, Lx/v;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    iget-wide v1, v0, LA7/r;->d:J

    .line 89
    .line 90
    const-wide/16 v8, 0x0

    .line 91
    .line 92
    cmp-long v3, v1, v8

    .line 93
    .line 94
    if-nez v3, :cond_1

    .line 95
    .line 96
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "First ad exposure time was never set"

    .line 101
    .line 102
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    sub-long/2addr v6, v1

    .line 109
    invoke-virtual {v0, v6, v7, v4}, LA7/r;->i0(JLA7/j1;)V

    .line 110
    .line 111
    .line 112
    iput-wide v8, v0, LA7/r;->d:J

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v2, v1, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v2, "Call to endAdUnitExposure for unknown ad unit id"

    .line 128
    .line 129
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 130
    .line 131
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    :goto_1
    return-void

    .line 135
    :pswitch_0
    iget-object v0, p0, LA7/b;->d:LA7/r;

    .line 136
    .line 137
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, LA7/b;->b:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v0, LA7/r;->c:Lx/e;

    .line 146
    .line 147
    invoke-virtual {v2}, Lx/v;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget-wide v4, p0, LA7/b;->c:J

    .line 152
    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    iput-wide v4, v0, LA7/r;->d:J

    .line 156
    .line 157
    :cond_5
    invoke-virtual {v2, v1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, Ljava/lang/Integer;

    .line 162
    .line 163
    const/4 v6, 0x1

    .line 164
    if-eqz v3, :cond_6

    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    add-int/2addr v0, v6

    .line 171
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v2, v1, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    iget v3, v2, Lx/v;->c:I

    .line 180
    .line 181
    const/16 v7, 0x64

    .line 182
    .line 183
    if-lt v3, v7, :cond_7

    .line 184
    .line 185
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const-string v1, "Too many ads visible"

    .line 190
    .line 191
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v2, v1, v3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    iget-object v0, v0, LA7/r;->b:Lx/e;

    .line 205
    .line 206
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v0, v1, v2}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    :goto_2
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
