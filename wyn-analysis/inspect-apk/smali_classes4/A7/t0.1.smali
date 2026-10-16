.class public final synthetic LA7/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:LA7/s0;

.field public synthetic c:Landroid/os/Bundle;

.field public synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, LA7/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/t0;->b:LA7/s0;

    .line 7
    .line 8
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 9
    .line 10
    invoke-virtual {v0}, LA7/L1;->O()LA7/e;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, LA7/y;->e1:LA7/D;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v3, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0}, LA7/L1;->O()LA7/e;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v4, LA7/y;->g1:LA7/D;

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v4, p0, LA7/t0;->c:Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-object v6, p0, LA7/t0;->d:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 46
    .line 47
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v6}, LA7/i;->l1(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_0
    iget-object v1, v0, LA7/L1;->c:LA7/i;

    .line 56
    .line 57
    invoke-static {v1}, LA7/L1;->m(LA7/G1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v4, v6}, LA7/i;->V0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    iget-object v1, v0, LA7/L1;->c:LA7/i;

    .line 66
    .line 67
    invoke-static {v1}, LA7/L1;->m(LA7/G1;)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    :try_start_0
    invoke-virtual {v1}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v7, "select timestamp from raw_events where app_id=? and name = \'_f\' limit 1;"

    .line 76
    .line 77
    filled-new-array {v6}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v5, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 86
    .line 87
    .line 88
    move-result v5
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    if-nez v5, :cond_1

    .line 90
    .line 91
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_1
    :try_start_1
    invoke-interface {v3, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :try_start_2
    iget-object v5, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, LA7/n0;

    .line 103
    .line 104
    iget-object v5, v5, LA7/n0;->n:Ln7/b;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    .line 106
    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v9
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    const-wide/16 v11, 0x3a98

    .line 114
    .line 115
    add-long/2addr v7, v11

    .line 116
    cmp-long v5, v9, v7

    .line 117
    .line 118
    const/4 v7, 0x1

    .line 119
    if-gez v5, :cond_2

    .line 120
    .line 121
    move v5, v7

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    move v5, v2

    .line 124
    :goto_0
    :try_start_4
    const-string v8, "select count(*) from raw_events where app_id=? and name not like \'!_%\' escape \'!\' limit 1;"

    .line 125
    .line 126
    filled-new-array {v6}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    const-wide/16 v10, 0x0

    .line 131
    .line 132
    invoke-virtual {v1, v8, v9, v10, v11}, LA7/i;->p0(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 133
    .line 134
    .line 135
    move-result-wide v8
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    cmp-long v1, v8, v10

    .line 137
    .line 138
    if-lez v1, :cond_3

    .line 139
    .line 140
    move v2, v7

    .line 141
    :cond_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    goto :goto_5

    .line 147
    :catch_0
    move-exception v7

    .line 148
    goto :goto_3

    .line 149
    :goto_1
    move-object v7, v5

    .line 150
    goto :goto_2

    .line 151
    :catch_1
    move-exception v5

    .line 152
    goto :goto_1

    .line 153
    :goto_2
    move v5, v2

    .line 154
    goto :goto_3

    .line 155
    :catch_2
    move-exception v5

    .line 156
    goto :goto_1

    .line 157
    :catch_3
    move-exception v7

    .line 158
    goto :goto_2

    .line 159
    :goto_3
    :try_start_5
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 164
    .line 165
    const-string v8, "Error checking backfill conditions"

    .line 166
    .line 167
    invoke-virtual {v1, v8, v7}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    .line 169
    .line 170
    if-eqz v3, :cond_4

    .line 171
    .line 172
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 173
    .line 174
    .line 175
    :cond_4
    :goto_4
    if-eqz v5, :cond_6

    .line 176
    .line 177
    if-nez v2, :cond_6

    .line 178
    .line 179
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 180
    .line 181
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v6, v4}, LA7/i;->G0(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :goto_5
    if-eqz v3, :cond_5

    .line 189
    .line 190
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 191
    .line 192
    .line 193
    :cond_5
    throw v0

    .line 194
    :cond_6
    :goto_6
    return-void

    .line 195
    :pswitch_0
    iget-object v0, p0, LA7/t0;->b:LA7/s0;

    .line 196
    .line 197
    iget-object v1, p0, LA7/t0;->c:Landroid/os/Bundle;

    .line 198
    .line 199
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    iget-object v3, p0, LA7/t0;->d:Ljava/lang/String;

    .line 204
    .line 205
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 206
    .line 207
    if-eqz v2, :cond_7

    .line 208
    .line 209
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 210
    .line 211
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3}, LA7/i;->l1(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_7
    iget-object v2, v0, LA7/L1;->c:LA7/i;

    .line 219
    .line 220
    invoke-static {v2}, LA7/L1;->m(LA7/G1;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v1, v3}, LA7/i;->V0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 227
    .line 228
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v3, v1}, LA7/i;->G0(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 232
    .line 233
    .line 234
    :goto_7
    return-void

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
