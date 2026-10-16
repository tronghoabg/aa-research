.class public final LA7/m;
.super Lcom/google/android/gms/internal/measurement/zzck;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA7/B0;


# direct methods
.method public constructor <init>(LA7/H;Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LA7/m;->a:I

    .line 1
    iput-object p1, p0, LA7/m;->b:LA7/B0;

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 2
    const-string v1, "google_app_measurement_local.db"

    invoke-direct {p0, p2, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/zzck;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public constructor <init>(LA7/i;Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA7/m;->a:I

    .line 3
    iput-object p1, p0, LA7/m;->b:LA7/B0;

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 4
    const-string v1, "google_app_measurement.db"

    invoke-direct {p0, p2, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/zzck;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method private final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 8

    .line 1
    iget v0, p0, LA7/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    iget-object v0, p0, LA7/m;->b:LA7/B0;

    .line 12
    .line 13
    check-cast v0, LA7/H;

    .line 14
    .line 15
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Opening the local database failed, dropping and recreating it"

    .line 20
    .line 21
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, LA7/n0;

    .line 29
    .line 30
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 31
    .line 32
    const-string v2, "google_app_measurement_local.db"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v3, "Failed to delete corrupted local db file"

    .line 49
    .line 50
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 51
    .line 52
    invoke-virtual {v1, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    :try_start_1
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    goto :goto_0

    .line 60
    :catch_1
    move-exception v1

    .line 61
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v2, "Failed to open local database. Events will bypass local storage"

    .line 66
    .line 67
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    :goto_0
    return-object v0

    .line 74
    :catch_2
    move-exception v0

    .line 75
    throw v0

    .line 76
    :pswitch_0
    iget-object v0, p0, LA7/m;->b:LA7/B0;

    .line 77
    .line 78
    check-cast v0, LA7/i;

    .line 79
    .line 80
    iget-object v1, v0, LA7/i;->e:LA2/d;

    .line 81
    .line 82
    iget-wide v2, v1, LA2/d;->b:J

    .line 83
    .line 84
    const-wide/16 v4, 0x0

    .line 85
    .line 86
    cmp-long v2, v2, v4

    .line 87
    .line 88
    if-nez v2, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    iget-object v2, v1, LA2/d;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ln7/b;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    iget-wide v6, v1, LA2/d;->b:J

    .line 103
    .line 104
    sub-long/2addr v2, v6

    .line 105
    const-wide/32 v6, 0x36ee80

    .line 106
    .line 107
    .line 108
    cmp-long v1, v2, v6

    .line 109
    .line 110
    if-ltz v1, :cond_3

    .line 111
    .line 112
    :goto_1
    :try_start_2
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 113
    .line 114
    .line 115
    move-result-object v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_3

    .line 116
    goto :goto_2

    .line 117
    :catch_3
    iget-object v1, v0, LA7/i;->e:LA2/d;

    .line 118
    .line 119
    iget-object v2, v1, LA2/d;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, Ln7/b;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    iput-wide v2, v1, LA2/d;->b:J

    .line 131
    .line 132
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-string v3, "Opening the database failed, dropping and recreating it"

    .line 137
    .line 138
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 139
    .line 140
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, LA7/n0;

    .line 146
    .line 147
    iget-object v2, v2, LA7/n0;->a:Landroid/content/Context;

    .line 148
    .line 149
    const-string v3, "google_app_measurement.db"

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_2

    .line 160
    .line 161
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v6, "Failed to delete corrupted db file"

    .line 166
    .line 167
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 168
    .line 169
    invoke-virtual {v2, v6, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_2
    :try_start_3
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iput-wide v4, v1, LA2/d;->b:J
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_4

    .line 177
    .line 178
    move-object v0, v2

    .line 179
    :goto_2
    return-object v0

    .line 180
    :catch_4
    move-exception v1

    .line 181
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const-string v2, "Failed to open freshly created database"

    .line 186
    .line 187
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 188
    .line 189
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    throw v1

    .line 193
    :cond_3
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    .line 194
    .line 195
    const-string v1, "Database open failed"

    .line 196
    .line 197
    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget v0, p0, LA7/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/m;->b:LA7/B0;

    .line 7
    .line 8
    check-cast v0, LA7/H;

    .line 9
    .line 10
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, LA7/I0;->e(LA7/N;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LA7/m;->b:LA7/B0;

    .line 19
    .line 20
    check-cast v0, LA7/i;

    .line 21
    .line 22
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, p1}, LA7/I0;->e(LA7/N;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    iget p1, p0, LA7/m;->a:I

    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 13

    .line 1
    iget v0, p0, LA7/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/m;->b:LA7/B0;

    .line 7
    .line 8
    check-cast v0, LA7/H;

    .line 9
    .line 10
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v5, "type,entry"

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const-string v3, "messages"

    .line 18
    .line 19
    const-string v4, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    invoke-static/range {v1 .. v6}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    move-object v8, p1

    .line 27
    iget-object p1, p0, LA7/m;->b:LA7/B0;

    .line 28
    .line 29
    check-cast p1, LA7/i;

    .line 30
    .line 31
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    sget-object v12, LA7/i;->f:[Ljava/lang/String;

    .line 36
    .line 37
    const-string v9, "events"

    .line 38
    .line 39
    const-string v10, "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;"

    .line 40
    .line 41
    const-string v11, "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp"

    .line 42
    .line 43
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const-string v11, "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count"

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    const-string v9, "events_snapshot"

    .line 54
    .line 55
    const-string v10, "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;"

    .line 56
    .line 57
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const-string v11, "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event"

    .line 65
    .line 66
    const-string v9, "conditional_properties"

    .line 67
    .line 68
    const-string v10, "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;"

    .line 69
    .line 70
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    sget-object v12, LA7/i;->g:[Ljava/lang/String;

    .line 78
    .line 79
    const-string v9, "user_attributes"

    .line 80
    .line 81
    const-string v10, "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;"

    .line 82
    .line 83
    const-string v11, "app_id,name,set_timestamp,value"

    .line 84
    .line 85
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    sget-object v12, LA7/i;->h:[Ljava/lang/String;

    .line 93
    .line 94
    const-string v9, "apps"

    .line 95
    .line 96
    const-string v10, "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;"

    .line 97
    .line 98
    const-string v11, "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp"

    .line 99
    .line 100
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    sget-object v12, LA7/i;->j:[Ljava/lang/String;

    .line 108
    .line 109
    const-string v9, "queue"

    .line 110
    .line 111
    const-string v10, "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);"

    .line 112
    .line 113
    const-string v11, "app_id,bundle_end_timestamp,data"

    .line 114
    .line 115
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const-string v11, "app_id,metadata_fingerprint,metadata"

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    const-string v9, "raw_events_metadata"

    .line 126
    .line 127
    const-string v10, "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));"

    .line 128
    .line 129
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    sget-object v12, LA7/i;->i:[Ljava/lang/String;

    .line 137
    .line 138
    const-string v9, "raw_events"

    .line 139
    .line 140
    const-string v10, "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);"

    .line 141
    .line 142
    const-string v11, "app_id,name,timestamp,metadata_fingerprint,data"

    .line 143
    .line 144
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    sget-object v12, LA7/i;->k:[Ljava/lang/String;

    .line 152
    .line 153
    const-string v9, "event_filters"

    .line 154
    .line 155
    const-string v10, "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));"

    .line 156
    .line 157
    const-string v11, "app_id,audience_id,filter_id,event_name,data"

    .line 158
    .line 159
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    sget-object v12, LA7/i;->l:[Ljava/lang/String;

    .line 167
    .line 168
    const-string v9, "property_filters"

    .line 169
    .line 170
    const-string v10, "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));"

    .line 171
    .line 172
    const-string v11, "app_id,audience_id,filter_id,property_name,data"

    .line 173
    .line 174
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    const-string v11, "app_id,audience_id,current_results"

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    const-string v9, "audience_filter_values"

    .line 185
    .line 186
    const-string v10, "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));"

    .line 187
    .line 188
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    sget-object v12, LA7/i;->m:[Ljava/lang/String;

    .line 196
    .line 197
    const-string v9, "app2"

    .line 198
    .line 199
    const-string v10, "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));"

    .line 200
    .line 201
    const-string v11, "app_id,first_open_count"

    .line 202
    .line 203
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    const-string v11, "app_id,event_id,children_to_process,main_event"

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    const-string v9, "main_event_params"

    .line 214
    .line 215
    const-string v10, "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));"

    .line 216
    .line 217
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    const-string v11, "app_id,parameters"

    .line 225
    .line 226
    const-string v9, "default_event_params"

    .line 227
    .line 228
    const-string v10, "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));"

    .line 229
    .line 230
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    sget-object v12, LA7/i;->n:[Ljava/lang/String;

    .line 238
    .line 239
    const-string v9, "consent_settings"

    .line 240
    .line 241
    const-string v10, "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));"

    .line 242
    .line 243
    const-string v11, "app_id,consent_state"

    .line 244
    .line 245
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_0

    .line 253
    .line 254
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    sget-object v12, LA7/i;->o:[Ljava/lang/String;

    .line 259
    .line 260
    const-string v9, "trigger_uris"

    .line 261
    .line 262
    const-string v10, "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);"

    .line 263
    .line 264
    const-string v11, "app_id,trigger_uri,source,timestamp_millis"

    .line 265
    .line 266
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    const-string v11, "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp"

    .line 274
    .line 275
    const/4 v12, 0x0

    .line 276
    const-string v9, "upload_queue"

    .line 277
    .line 278
    const-string v10, "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );"

    .line 279
    .line 280
    invoke-static/range {v7 .. v12}, LA7/I0;->f(LA7/N;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    iget p1, p0, LA7/m;->a:I

    return-void
.end method
