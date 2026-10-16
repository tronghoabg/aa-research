.class public final synthetic Lr9/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/N;


# direct methods
.method public synthetic constructor <init>(Lr9/N;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/M;->a:I

    iput-object p1, p0, Lr9/M;->b:Lr9/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 9

    .line 1
    const-string v0, "Failed to decode Query data for target %s"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lr9/M;->b:Lr9/N;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget v6, p0, Lr9/M;->a:I

    .line 10
    .line 11
    check-cast p1, Landroid/database/Cursor;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v6, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v6

    .line 27
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-array v6, v3, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object v0, v6, v5

    .line 34
    .line 35
    aput-object p1, v6, v4

    .line 36
    .line 37
    new-instance p1, Ljb/c;

    .line 38
    .line 39
    invoke-direct {p1, v6, v3}, Ljb/c;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v2, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 43
    .line 44
    const-string v6, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?"

    .line 45
    .line 46
    invoke-virtual {v2, p1, v6, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const-string v6, "DELETE FROM mutations WHERE uid = ? AND batch_id = ?"

    .line 61
    .line 62
    invoke-virtual {v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6, v4, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    int-to-long v7, v1

    .line 70
    invoke-virtual {v6, v3, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_0

    .line 78
    .line 79
    move v6, v4

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    move v6, v5

    .line 82
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    new-array v8, v3, [Ljava/lang/Object;

    .line 87
    .line 88
    aput-object v0, v8, v5

    .line 89
    .line 90
    aput-object v7, v8, v4

    .line 91
    .line 92
    const-string v7, "Mutation batch (%s, %d) did not exist"

    .line 93
    .line 94
    invoke-static {v6, v7, v8}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-array v6, v3, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v0, v6, v5

    .line 104
    .line 105
    aput-object v1, v6, v4

    .line 106
    .line 107
    const-string v1, "DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?"

    .line 108
    .line 109
    invoke-virtual {v2, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    :goto_2
    throw v0

    .line 129
    :pswitch_0
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :try_start_2
    invoke-static {p1}, Lu9/j;->s([B)Lu9/j;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v7, v2, Lr9/N;->b:La2/v;

    .line 142
    .line 143
    invoke-virtual {v7, p1}, La2/v;->u(Lu9/j;)Lr9/S;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, Lr9/S;->a:Lp9/A;

    .line 148
    .line 149
    invoke-virtual {p1}, Lp9/A;->b()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object v2, v2, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 154
    .line 155
    const-string v7, "UPDATE targets SET canonical_id  = ? WHERE target_id = ?"

    .line 156
    .line 157
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    new-array v3, v3, [Ljava/lang/Object;

    .line 162
    .line 163
    aput-object p1, v3, v5

    .line 164
    .line 165
    aput-object v8, v3, v4

    .line 166
    .line 167
    invoke-virtual {v2, v7, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :catch_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    new-array v2, v4, [Ljava/lang/Object;

    .line 176
    .line 177
    aput-object p1, v2, v5

    .line 178
    .line 179
    invoke-static {v0, v2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    throw v1

    .line 183
    :pswitch_1
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    :try_start_3
    invoke-static {p1}, Lu9/j;->s([B)Lu9/j;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Lu9/h;

    .line 200
    .line 201
    invoke-virtual {p1}, Lu9/h;->a()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Lu9/j;

    .line 209
    .line 210
    iget-object v2, v2, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 211
    .line 212
    const-string v7, "UPDATE targets SET target_proto = ? WHERE target_id = ?"

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    new-array v3, v3, [Ljava/lang/Object;

    .line 223
    .line 224
    aput-object p1, v3, v5

    .line 225
    .line 226
    aput-object v8, v3, v4

    .line 227
    .line 228
    invoke-virtual {v2, v7, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_1

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :catch_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    new-array v2, v4, [Ljava/lang/Object;

    .line 237
    .line 238
    aput-object p1, v2, v5

    .line 239
    .line 240
    invoke-static {v0, v2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    throw v1

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
