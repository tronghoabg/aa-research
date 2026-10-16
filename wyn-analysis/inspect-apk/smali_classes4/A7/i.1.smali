.class public final LA7/i;
.super LA7/G1;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:[Ljava/lang/String;

.field public static final i:[Ljava/lang/String;

.field public static final j:[Ljava/lang/String;

.field public static final k:[Ljava/lang/String;

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;

.field public static final o:[Ljava/lang/String;


# instance fields
.field public final d:LA7/m;

.field public final e:LA2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 91

    .line 1
    const-string v10, "current_session_count"

    .line 2
    .line 3
    const-string v11, "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"

    .line 4
    .line 5
    const-string v0, "last_bundled_timestamp"

    .line 6
    .line 7
    const-string v1, "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;"

    .line 8
    .line 9
    const-string v2, "last_bundled_day"

    .line 10
    .line 11
    const-string v3, "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;"

    .line 12
    .line 13
    const-string v4, "last_sampled_complex_event_id"

    .line 14
    .line 15
    const-string v5, "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;"

    .line 16
    .line 17
    const-string v6, "last_sampling_rate"

    .line 18
    .line 19
    const-string v7, "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;"

    .line 20
    .line 21
    const-string v8, "last_exempt_from_sampling"

    .line 22
    .line 23
    const-string v9, "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LA7/i;->f:[Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "origin"

    .line 32
    .line 33
    const-string v1, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"

    .line 34
    .line 35
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LA7/i;->g:[Ljava/lang/String;

    .line 40
    .line 41
    const-string v89, "daily_registered_triggers_count"

    .line 42
    .line 43
    const-string v90, "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"

    .line 44
    .line 45
    const-string v1, "app_version"

    .line 46
    .line 47
    const-string v2, "ALTER TABLE apps ADD COLUMN app_version TEXT;"

    .line 48
    .line 49
    const-string v3, "app_store"

    .line 50
    .line 51
    const-string v4, "ALTER TABLE apps ADD COLUMN app_store TEXT;"

    .line 52
    .line 53
    const-string v5, "gmp_version"

    .line 54
    .line 55
    const-string v6, "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;"

    .line 56
    .line 57
    const-string v7, "dev_cert_hash"

    .line 58
    .line 59
    const-string v8, "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;"

    .line 60
    .line 61
    const-string v9, "measurement_enabled"

    .line 62
    .line 63
    const-string v10, "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;"

    .line 64
    .line 65
    const-string v11, "last_bundle_start_timestamp"

    .line 66
    .line 67
    const-string v12, "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;"

    .line 68
    .line 69
    const-string v13, "day"

    .line 70
    .line 71
    const-string v14, "ALTER TABLE apps ADD COLUMN day INTEGER;"

    .line 72
    .line 73
    const-string v15, "daily_public_events_count"

    .line 74
    .line 75
    const-string v16, "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;"

    .line 76
    .line 77
    const-string v17, "daily_events_count"

    .line 78
    .line 79
    const-string v18, "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;"

    .line 80
    .line 81
    const-string v19, "daily_conversions_count"

    .line 82
    .line 83
    const-string v20, "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;"

    .line 84
    .line 85
    const-string v21, "remote_config"

    .line 86
    .line 87
    const-string v22, "ALTER TABLE apps ADD COLUMN remote_config BLOB;"

    .line 88
    .line 89
    const-string v23, "config_fetched_time"

    .line 90
    .line 91
    const-string v24, "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;"

    .line 92
    .line 93
    const-string v25, "failed_config_fetch_time"

    .line 94
    .line 95
    const-string v26, "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;"

    .line 96
    .line 97
    const-string v27, "app_version_int"

    .line 98
    .line 99
    const-string v28, "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;"

    .line 100
    .line 101
    const-string v29, "firebase_instance_id"

    .line 102
    .line 103
    const-string v30, "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;"

    .line 104
    .line 105
    const-string v31, "daily_error_events_count"

    .line 106
    .line 107
    const-string v32, "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;"

    .line 108
    .line 109
    const-string v33, "daily_realtime_events_count"

    .line 110
    .line 111
    const-string v34, "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;"

    .line 112
    .line 113
    const-string v35, "health_monitor_sample"

    .line 114
    .line 115
    const-string v36, "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;"

    .line 116
    .line 117
    const-string v37, "android_id"

    .line 118
    .line 119
    const-string v38, "ALTER TABLE apps ADD COLUMN android_id INTEGER;"

    .line 120
    .line 121
    const-string v39, "adid_reporting_enabled"

    .line 122
    .line 123
    const-string v40, "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"

    .line 124
    .line 125
    const-string v41, "ssaid_reporting_enabled"

    .line 126
    .line 127
    const-string v42, "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"

    .line 128
    .line 129
    const-string v43, "admob_app_id"

    .line 130
    .line 131
    const-string v44, "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;"

    .line 132
    .line 133
    const-string v45, "linked_admob_app_id"

    .line 134
    .line 135
    const-string v46, "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"

    .line 136
    .line 137
    const-string v47, "dynamite_version"

    .line 138
    .line 139
    const-string v48, "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"

    .line 140
    .line 141
    const-string v49, "safelisted_events"

    .line 142
    .line 143
    const-string v50, "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"

    .line 144
    .line 145
    const-string v51, "ga_app_id"

    .line 146
    .line 147
    const-string v52, "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"

    .line 148
    .line 149
    const-string v53, "config_last_modified_time"

    .line 150
    .line 151
    const-string v54, "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"

    .line 152
    .line 153
    const-string v55, "e_tag"

    .line 154
    .line 155
    const-string v56, "ALTER TABLE apps ADD COLUMN e_tag TEXT;"

    .line 156
    .line 157
    const-string v57, "session_stitching_token"

    .line 158
    .line 159
    const-string v58, "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"

    .line 160
    .line 161
    const-string v59, "sgtm_upload_enabled"

    .line 162
    .line 163
    const-string v60, "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;"

    .line 164
    .line 165
    const-string v61, "target_os_version"

    .line 166
    .line 167
    const-string v62, "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"

    .line 168
    .line 169
    const-string v63, "session_stitching_token_hash"

    .line 170
    .line 171
    const-string v64, "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"

    .line 172
    .line 173
    const-string v65, "ad_services_version"

    .line 174
    .line 175
    const-string v66, "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;"

    .line 176
    .line 177
    const-string v67, "unmatched_first_open_without_ad_id"

    .line 178
    .line 179
    const-string v68, "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;"

    .line 180
    .line 181
    const-string v69, "npa_metadata_value"

    .line 182
    .line 183
    const-string v70, "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;"

    .line 184
    .line 185
    const-string v71, "attribution_eligibility_status"

    .line 186
    .line 187
    const-string v72, "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"

    .line 188
    .line 189
    const-string v73, "sgtm_preview_key"

    .line 190
    .line 191
    const-string v74, "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"

    .line 192
    .line 193
    const-string v75, "dma_consent_state"

    .line 194
    .line 195
    const-string v76, "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;"

    .line 196
    .line 197
    const-string v77, "daily_realtime_dcu_count"

    .line 198
    .line 199
    const-string v78, "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;"

    .line 200
    .line 201
    const-string v79, "bundle_delivery_index"

    .line 202
    .line 203
    const-string v80, "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;"

    .line 204
    .line 205
    const-string v81, "serialized_npa_metadata"

    .line 206
    .line 207
    const-string v82, "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;"

    .line 208
    .line 209
    const-string v83, "unmatched_pfo"

    .line 210
    .line 211
    const-string v84, "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;"

    .line 212
    .line 213
    const-string v85, "unmatched_uwa"

    .line 214
    .line 215
    const-string v86, "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"

    .line 216
    .line 217
    const-string v87, "ad_campaign_info"

    .line 218
    .line 219
    const-string v88, "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"

    .line 220
    .line 221
    filled-new-array/range {v1 .. v90}, [Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sput-object v0, LA7/i;->h:[Ljava/lang/String;

    .line 226
    .line 227
    const-string v0, "realtime"

    .line 228
    .line 229
    const-string v1, "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"

    .line 230
    .line 231
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sput-object v0, LA7/i;->i:[Ljava/lang/String;

    .line 236
    .line 237
    const-string v0, "retry_count"

    .line 238
    .line 239
    const-string v1, "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"

    .line 240
    .line 241
    const-string v2, "has_realtime"

    .line 242
    .line 243
    const-string v3, "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"

    .line 244
    .line 245
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sput-object v0, LA7/i;->j:[Ljava/lang/String;

    .line 250
    .line 251
    const-string v0, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"

    .line 252
    .line 253
    const-string v1, "session_scoped"

    .line 254
    .line 255
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sput-object v0, LA7/i;->k:[Ljava/lang/String;

    .line 260
    .line 261
    const-string v0, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"

    .line 262
    .line 263
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sput-object v0, LA7/i;->l:[Ljava/lang/String;

    .line 268
    .line 269
    const-string v0, "previous_install_count"

    .line 270
    .line 271
    const-string v1, "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"

    .line 272
    .line 273
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    sput-object v0, LA7/i;->m:[Ljava/lang/String;

    .line 278
    .line 279
    const-string v5, "storage_consent_at_bundling"

    .line 280
    .line 281
    const-string v6, "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"

    .line 282
    .line 283
    const-string v1, "consent_source"

    .line 284
    .line 285
    const-string v2, "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;"

    .line 286
    .line 287
    const-string v3, "dma_consent_settings"

    .line 288
    .line 289
    const-string v4, "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"

    .line 290
    .line 291
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, LA7/i;->n:[Ljava/lang/String;

    .line 296
    .line 297
    const-string v0, "idempotent"

    .line 298
    .line 299
    const-string v1, "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"

    .line 300
    .line 301
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sput-object v0, LA7/i;->o:[Ljava/lang/String;

    .line 306
    .line 307
    return-void
.end method

.method public constructor <init>(LA7/L1;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/G1;-><init>(LA7/L1;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LA2/d;

    .line 5
    .line 6
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/n0;

    .line 9
    .line 10
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 11
    .line 12
    invoke-direct {p1, v0}, LA2/d;-><init>(Ln7/b;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LA7/i;->e:LA2/d;

    .line 16
    .line 17
    new-instance p1, LA7/m;

    .line 18
    .line 19
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LA7/n0;

    .line 22
    .line 23
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-direct {p1, p0, v0}, LA7/m;-><init>(LA7/i;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LA7/i;->d:LA7/m;

    .line 29
    .line 30
    return-void
.end method

.method public static A0(Landroid/content/ContentValues;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v1, p1, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of v1, p1, Ljava/lang/Long;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v1, p1, Ljava/lang/Double;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p1, Ljava/lang/Double;

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p1, "Invalid value type"

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0
.end method


# virtual methods
.method public final B0(Lcom/google/android/gms/internal/measurement/zzfy$zzk;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzbj()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->l(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LA7/i;->q1()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LA7/n0;

    .line 30
    .line 31
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzm()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    sget-object v4, LA7/y;->F:LA7/D;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {v4, v5}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    sub-long v6, v0, v6

    .line 58
    .line 59
    cmp-long v2, v2, v6

    .line 60
    .line 61
    if-ltz v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzm()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-virtual {v4, v5}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    add-long/2addr v6, v0

    .line 78
    cmp-long v2, v2, v6

    .line 79
    .line 80
    if-lez v2, :cond_1

    .line 81
    .line 82
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzm()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v2, v2, LA7/N;->i:LA7/P;

    .line 107
    .line 108
    const-string v4, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    .line 109
    .line 110
    invoke-virtual {v2, v3, v0, v1, v4}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :try_start_0
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v0}, LA7/S1;->O0([B)[B

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    array-length v2, v0

    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 135
    .line 136
    const-string v3, "Saving bundle, size"

    .line 137
    .line 138
    invoke-virtual {v1, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, Landroid/content/ContentValues;

    .line 142
    .line 143
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v2, "app_id"

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzm()J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const-string v3, "bundle_end_timestamp"

    .line 164
    .line 165
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 166
    .line 167
    .line 168
    const-string v2, "data"

    .line 169
    .line 170
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 171
    .line 172
    .line 173
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    const-string v0, "has_realtime"

    .line 178
    .line 179
    invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzbq()Z

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    if-eqz p2, :cond_2

    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzg()I

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    const-string v0, "retry_count"

    .line 197
    .line 198
    invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 199
    .line 200
    .line 201
    :cond_2
    :try_start_1
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    const-string v0, "queue"

    .line 206
    .line 207
    invoke-virtual {p2, v0, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v0

    .line 211
    const-wide/16 v2, -0x1

    .line 212
    .line 213
    cmp-long p2, v0, v2

    .line 214
    .line 215
    if-nez p2, :cond_3

    .line 216
    .line 217
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 222
    .line 223
    const-string v0, "Failed to insert bundle (got -1). appId"

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {p2, v0, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :catch_0
    move-exception p2

    .line 238
    goto :goto_0

    .line 239
    :cond_3
    return-void

    .line 240
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 253
    .line 254
    const-string v1, "Error storing bundle. appId"

    .line 255
    .line 256
    invoke-virtual {v0, p1, v1, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :catch_1
    move-exception p2

    .line 261
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 274
    .line 275
    const-string v1, "Data loss. Failed to serialize bundle. appId"

    .line 276
    .line 277
    invoke-virtual {v0, p1, v1, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public final C0(Ljava/lang/Long;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LA7/n0;

    .line 17
    .line 18
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 19
    .line 20
    sget-object v2, LA7/y;->B0:LA7/D;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "SELECT COUNT(1) FROM upload_queue WHERE rowid = "

    .line 39
    .line 40
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, " AND retry_count =  2147483647 LIMIT 1"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, v0, v1}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    const-wide/16 v2, 0x0

    .line 60
    .line 61
    cmp-long v0, v0, v2

    .line 62
    .line 63
    if-lez v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "The number of upload retries exceeds the limit. Will remain unchanged."

    .line 70
    .line 71
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v2, "UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = "

    .line 83
    .line 84
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, " AND retry_count < 2147483647"

    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :catch_0
    move-exception p1

    .line 104
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "Error incrementing retry count. error"

    .line 109
    .line 110
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 111
    .line 112
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final D0(Ljava/lang/String;LA7/t;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/content/ContentValues;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "app_id"

    .line 16
    .line 17
    iget-object v2, p2, LA7/t;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "name"

    .line 23
    .line 24
    iget-object v3, p2, LA7/t;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-wide v3, p2, LA7/t;->c:J

    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v3, "lifetime_count"

    .line 36
    .line 37
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 38
    .line 39
    .line 40
    iget-wide v3, p2, LA7/t;->d:J

    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v3, "current_bundle_count"

    .line 47
    .line 48
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 49
    .line 50
    .line 51
    iget-wide v3, p2, LA7/t;->f:J

    .line 52
    .line 53
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v3, "last_fire_timestamp"

    .line 58
    .line 59
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 60
    .line 61
    .line 62
    iget-wide v3, p2, LA7/t;->g:J

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v3, "last_bundled_timestamp"

    .line 69
    .line 70
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "last_bundled_day"

    .line 74
    .line 75
    iget-object v3, p2, LA7/t;->h:Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "last_sampled_complex_event_id"

    .line 81
    .line 82
    iget-object v3, p2, LA7/t;->i:Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 85
    .line 86
    .line 87
    const-string v1, "last_sampling_rate"

    .line 88
    .line 89
    iget-object v3, p2, LA7/t;->j:Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 92
    .line 93
    .line 94
    iget-wide v3, p2, LA7/t;->e:J

    .line 95
    .line 96
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "current_session_count"

    .line 101
    .line 102
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 103
    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    iget-object p2, p2, LA7/t;->k:Ljava/lang/Boolean;

    .line 107
    .line 108
    if-eqz p2, :cond_0

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_0

    .line 115
    .line 116
    const-wide/16 v3, 0x1

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    move-object p2, v1

    .line 124
    :goto_0
    const-string v3, "last_exempt_from_sampling"

    .line 125
    .line 126
    invoke-virtual {v0, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 127
    .line 128
    .line 129
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    const/4 v3, 0x5

    .line 134
    invoke-virtual {p2, p1, v1, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 135
    .line 136
    .line 137
    move-result-wide p1

    .line 138
    const-wide/16 v0, -0x1

    .line 139
    .line 140
    cmp-long p1, p1, v0

    .line 141
    .line 142
    if-nez p1, :cond_1

    .line 143
    .line 144
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 149
    .line 150
    const-string p2, "Failed to insert/update event aggregates (got -1). appId"

    .line 151
    .line 152
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p1, p2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :catch_0
    move-exception p1

    .line 161
    goto :goto_1

    .line 162
    :cond_1
    return-void

    .line 163
    :goto_1
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 172
    .line 173
    const-string v1, "Error storing event aggregates. appId"

    .line 174
    .line 175
    invoke-virtual {p2, v0, v1, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final E0(Ljava/lang/String;LA7/F0;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, LA7/i;->g1(Ljava/lang/String;)LA7/F0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p1, v0}, LA7/i;->W0(Ljava/lang/String;LA7/F0;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroid/content/ContentValues;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "app_id"

    .line 23
    .line 24
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "storage_consent_at_bundling"

    .line 28
    .line 29
    invoke-virtual {p2}, LA7/F0;->m()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, LA7/i;->z0(Landroid/content/ContentValues;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final F0(Ljava/lang/String;LA7/E1;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LA7/n0;

    .line 13
    .line 14
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sget-object v2, LA7/y;->i0:LA7/D;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    sub-long v4, v0, v4

    .line 37
    .line 38
    iget-wide v6, p2, LA7/E1;->b:J

    .line 39
    .line 40
    cmp-long v4, v6, v4

    .line 41
    .line 42
    if-ltz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    add-long/2addr v4, v0

    .line 55
    cmp-long v2, v6, v4

    .line 56
    .line 57
    if-lez v2, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v2, v2, LA7/N;->i:LA7/P;

    .line 76
    .line 77
    const-string v5, "Storing trigger URI outside of the max retention time span. appId, now, timestamp"

    .line 78
    .line 79
    invoke-virtual {v2, v4, v0, v1, v5}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "Saving trigger URI"

    .line 87
    .line 88
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Landroid/content/ContentValues;

    .line 94
    .line 95
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v1, "app_id"

    .line 99
    .line 100
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v1, "trigger_uri"

    .line 104
    .line 105
    iget-object v2, p2, LA7/E1;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget p2, p2, LA7/E1;->c:I

    .line 111
    .line 112
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    const-string v1, "source"

    .line 117
    .line 118
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    const-string v1, "timestamp_millis"

    .line 126
    .line 127
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 128
    .line 129
    .line 130
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    const-string v1, "trigger_uris"

    .line 135
    .line 136
    invoke-virtual {p2, v1, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    const-wide/16 v2, -0x1

    .line 141
    .line 142
    cmp-long p2, v0, v2

    .line 143
    .line 144
    if-nez p2, :cond_2

    .line 145
    .line 146
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 151
    .line 152
    const-string v0, "Failed to insert trigger URI (got -1). appId"

    .line 153
    .line 154
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p2, v0, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :catch_0
    move-exception p2

    .line 163
    goto :goto_0

    .line 164
    :cond_2
    return-void

    .line 165
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 174
    .line 175
    const-string v1, "Error storing trigger URI. appId"

    .line 176
    .line 177
    invoke-virtual {v0, p1, v1, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final G0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    new-instance v1, LA7/l;

    .line 11
    .line 12
    move-object v5, p1

    .line 13
    invoke-direct {v1, p0, p1}, LA7/l;-><init>(LA7/i;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, LA7/l;->a()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v12

    .line 30
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_8

    .line 35
    .line 36
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LA7/j;

    .line 41
    .line 42
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, v0, LA7/j;->d:Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 47
    .line 48
    new-instance v11, Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzh()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_5

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzfy$zzh;

    .line 72
    .line 73
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzj()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_0

    .line 78
    .line 79
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zza()D

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    invoke-virtual {v11, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_0
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzk()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_1

    .line 96
    .line 97
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzb()F

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-virtual {v11, v7, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzl()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_2

    .line 114
    .line 115
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzd()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    invoke-virtual {v11, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzn()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_3

    .line 132
    .line 133
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzh()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v11, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzi()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_4

    .line 154
    .line 155
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzi()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v6}, LA7/S1;->P0(Ljava/util/List;)[Landroid/os/Bundle;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v11, v7, v6}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_4
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    const-string v8, "Unexpected parameter type for parameter"

    .line 176
    .line 177
    iget-object v7, v7, LA7/N;->f:LA7/P;

    .line 178
    .line 179
    invoke-virtual {v7, v8, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    const-string v2, "_o"

    .line 184
    .line 185
    invoke-virtual {v11, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v11, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    if-nez v4, :cond_6

    .line 196
    .line 197
    const-string v4, ""

    .line 198
    .line 199
    :cond_6
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    move-object/from16 v13, p2

    .line 207
    .line 208
    invoke-virtual {v2, v11, v13}, LA7/U1;->x0(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 209
    .line 210
    .line 211
    new-instance v2, LA7/u;

    .line 212
    .line 213
    iget-object v3, v0, LA7/j;->d:Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 214
    .line 215
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzc()J

    .line 224
    .line 225
    .line 226
    move-result-wide v9

    .line 227
    iget-object v3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v3, LA7/n0;

    .line 230
    .line 231
    invoke-direct/range {v2 .. v11}, LA7/u;-><init>(LA7/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 232
    .line 233
    .line 234
    iget-wide v3, v0, LA7/j;->a:J

    .line 235
    .line 236
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 240
    .line 241
    .line 242
    iget-object v5, v2, LA7/u;->d:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v5, Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v6, v2}, LA7/S1;->r0(LA7/u;)Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    new-instance v7, Landroid/content/ContentValues;

    .line 262
    .line 263
    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v8, "app_id"

    .line 267
    .line 268
    invoke-virtual {v7, v8, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string v8, "name"

    .line 272
    .line 273
    iget-object v9, v2, LA7/u;->e:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v9, Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v7, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-wide v8, v2, LA7/u;->b:J

    .line 281
    .line 282
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const-string v8, "timestamp"

    .line 287
    .line 288
    invoke-virtual {v7, v8, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 289
    .line 290
    .line 291
    iget-wide v8, v0, LA7/j;->b:J

    .line 292
    .line 293
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v8, "metadata_fingerprint"

    .line 298
    .line 299
    invoke-virtual {v7, v8, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 300
    .line 301
    .line 302
    const-string v2, "data"

    .line 303
    .line 304
    invoke-virtual {v7, v2, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 305
    .line 306
    .line 307
    iget-boolean v0, v0, LA7/j;->c:Z

    .line 308
    .line 309
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const-string v2, "realtime"

    .line 314
    .line 315
    invoke-virtual {v7, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 316
    .line 317
    .line 318
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const-string v2, "raw_events"

    .line 323
    .line 324
    const-string v6, "rowid = ?"

    .line 325
    .line 326
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    filled-new-array {v3}, [Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v0, v2, v7, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    int-to-long v2, v0

    .line 339
    const-wide/16 v6, 0x1

    .line 340
    .line 341
    cmp-long v0, v2, v6

    .line 342
    .line 343
    if-eqz v0, :cond_7

    .line 344
    .line 345
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 350
    .line 351
    const-string v4, "Failed to update raw event. appId, updatedRows"

    .line 352
    .line 353
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v0, v6, v4, v2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    .line 363
    .line 364
    goto :goto_3

    .line 365
    :catch_0
    move-exception v0

    .line 366
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 375
    .line 376
    const-string v4, "Error updating raw event. appId"

    .line 377
    .line 378
    invoke-virtual {v2, v3, v4, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_7
    :goto_3
    move-object v5, p1

    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :cond_8
    move-object/from16 v13, p2

    .line 385
    .line 386
    invoke-virtual {v1}, LA7/l;->a()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    move-object v5, p1

    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_9
    return-void
.end method

.method public final H0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfy$zzj;Ljava/lang/String;Ljava/util/Map;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, LA7/n0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v2, LA7/n0;->g:LA7/e;

    .line 25
    .line 26
    sget-object v3, LA7/y;->B0:LA7/D;

    .line 27
    .line 28
    invoke-virtual {v0, v1, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v3, 0x0

    .line 47
    const-string v4, "upload_queue"

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, LA7/H1;->b:LA7/L1;

    .line 52
    .line 53
    iget-object v5, v0, LA7/L1;->i:LA7/w1;

    .line 54
    .line 55
    iget-object v5, v5, LA7/w1;->f:LA7/a0;

    .line 56
    .line 57
    invoke-virtual {v5}, LA7/a0;->d()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    iget-object v7, v2, LA7/n0;->n:Ln7/b;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    sub-long v5, v7, v5

    .line 71
    .line 72
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    sget-object v9, LA7/y;->A:LA7/D;

    .line 77
    .line 78
    invoke-virtual {v9, v1}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    check-cast v9, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    cmp-long v5, v5, v9

    .line 89
    .line 90
    if-lez v5, :cond_1

    .line 91
    .line 92
    iget-object v0, v0, LA7/L1;->i:LA7/w1;

    .line 93
    .line 94
    iget-object v0, v0, LA7/w1;->f:LA7/a0;

    .line 95
    .line 96
    invoke-virtual {v0, v7, v8}, LA7/a0;->f(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p0}, LA7/i;->R0()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    new-array v6, v3, [Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-lez v0, :cond_1

    .line 126
    .line 127
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v5, v5, LA7/N;->n:LA7/P;

    .line 136
    .line 137
    const-string v6, "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted"

    .line 138
    .line 139
    invoke-virtual {v5, v6, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_2

    .line 160
    .line 161
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Ljava/util/Map$Entry;

    .line 166
    .line 167
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    check-cast v6, Ljava/lang/String;

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Ljava/lang/String;

    .line 178
    .line 179
    new-instance v7, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v6, "="

    .line 188
    .line 189
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    new-instance p4, Landroid/content/ContentValues;

    .line 208
    .line 209
    invoke-direct {p4}, Landroid/content/ContentValues;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v5, "app_id"

    .line 213
    .line 214
    invoke-virtual {p4, v5, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v5, "measurement_batch"

    .line 218
    .line 219
    invoke-virtual {p4, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 220
    .line 221
    .line 222
    const-string p2, "upload_uri"

    .line 223
    .line 224
    invoke-virtual {p4, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    new-instance p2, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result p3

    .line 236
    if-lez p3, :cond_3

    .line 237
    .line 238
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Ljava/lang/CharSequence;

    .line 243
    .line 244
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const/4 v5, 0x1

    .line 248
    :goto_1
    if-ge v5, p3, :cond_3

    .line 249
    .line 250
    const-string v6, "\r\n"

    .line 251
    .line 252
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    add-int/lit8 v5, v5, 0x1

    .line 260
    .line 261
    check-cast v6, Ljava/lang/CharSequence;

    .line 262
    .line 263
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    const-string p3, "upload_headers"

    .line 272
    .line 273
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static/range {p5 .. p5}, LA/f;->f(I)I

    .line 277
    .line 278
    .line 279
    move-result p2

    .line 280
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    const-string p3, "upload_type"

    .line 285
    .line 286
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 287
    .line 288
    .line 289
    iget-object p2, v2, LA7/n0;->n:Ln7/b;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 295
    .line 296
    .line 297
    move-result-wide p2

    .line 298
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    const-string p3, "creation_timestamp"

    .line 303
    .line 304
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    const-string p3, "retry_count"

    .line 312
    .line 313
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 314
    .line 315
    .line 316
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-virtual {p2, v4, v1, p4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 321
    .line 322
    .line 323
    move-result-wide p2

    .line 324
    const-wide/16 v0, -0x1

    .line 325
    .line 326
    cmp-long p2, p2, v0

    .line 327
    .line 328
    if-nez p2, :cond_4

    .line 329
    .line 330
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 335
    .line 336
    const-string p3, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId"

    .line 337
    .line 338
    invoke-virtual {p2, p3, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :catch_0
    move-exception v0

    .line 343
    move-object p2, v0

    .line 344
    goto :goto_3

    .line 345
    :cond_4
    :goto_2
    return-void

    .line 346
    :goto_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 347
    .line 348
    .line 349
    move-result-object p3

    .line 350
    const-string p4, "Error storing MeasurementBatch to upload_queue. appId"

    .line 351
    .line 352
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 353
    .line 354
    invoke-virtual {p3, p1, p4, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    return-void
.end method

.method public final I0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzfy$zzf;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p5}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LA7/n0;

    .line 24
    .line 25
    iget-object v1, v1, LA7/n0;->m:LA7/J;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    array-length v2, p5

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 37
    .line 38
    const-string v3, "Saving complex main event, appId, data size"

    .line 39
    .line 40
    invoke-virtual {v0, v1, v3, v2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Landroid/content/ContentValues;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "app_id"

    .line 49
    .line 50
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, "event_id"

    .line 54
    .line 55
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const-string p3, "children_to_process"

    .line 63
    .line 64
    invoke-virtual {v0, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 65
    .line 66
    .line 67
    const-string p2, "main_event"

    .line 68
    .line 69
    invoke-virtual {v0, p2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const-string p3, "main_event_params"

    .line 77
    .line 78
    const/4 p4, 0x0

    .line 79
    const/4 p5, 0x5

    .line 80
    invoke-virtual {p2, p3, p4, v0, p5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 81
    .line 82
    .line 83
    move-result-wide p2

    .line 84
    const-wide/16 p4, -0x1

    .line 85
    .line 86
    cmp-long p2, p2, p4

    .line 87
    .line 88
    if-nez p2, :cond_0

    .line 89
    .line 90
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 95
    .line 96
    const-string p3, "Failed to insert complex main event (got -1). appId"

    .line 97
    .line 98
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 99
    .line 100
    .line 101
    move-result-object p4

    .line 102
    invoke-virtual {p2, p3, p4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catch_0
    move-exception p2

    .line 107
    goto :goto_0

    .line 108
    :cond_0
    return-void

    .line 109
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 118
    .line 119
    const-string p4, "Error storing complex main event. appId"

    .line 120
    .line 121
    invoke-virtual {p3, p1, p4, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final J0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "conditional_properties"

    .line 18
    .line 19
    const-string v2, "app_id=? and name=?"

    .line 20
    .line 21
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, LA7/n0;

    .line 41
    .line 42
    iget-object v2, v2, LA7/n0;->m:LA7/J;

    .line 43
    .line 44
    invoke-virtual {v2, p2}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 49
    .line 50
    const-string v2, "Error deleting conditional property"

    .line 51
    .line 52
    invoke-virtual {v1, p1, p2, v0, v2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final K0(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string v0, ","

    .line 27
    .line 28
    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "("

    .line 33
    .line 34
    const-string v1, ")"

    .line 35
    .line 36
    invoke-static {v0, p1, v1}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "SELECT COUNT(1) FROM queue WHERE rowid IN "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, " AND retry_count =  2147483647 LIMIT 1"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {p0, v0, v1}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    cmp-long v0, v0, v2

    .line 67
    .line 68
    if-lez v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v1, "The number of upload retries exceeds the limit. Will remain unchanged."

    .line 75
    .line 76
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v2, "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "

    .line 88
    .line 89
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, " AND (retry_count IS NULL OR retry_count < 2147483647)"

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catch_0
    move-exception p1

    .line 109
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "Error incrementing retry count. error"

    .line 114
    .line 115
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 116
    .line 117
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    const-string v0, "Given Integer is zero"

    .line 124
    .line 125
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1
.end method

.method public final L0(LA7/d;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, LA7/d;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, LA7/d;->c:LA7/R1;

    .line 13
    .line 14
    iget-object v1, v1, LA7/R1;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, LA7/i;->d1(Ljava/lang/String;Ljava/lang/String;)LA7/T1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const-string v1, "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?"

    .line 23
    .line 24
    filled-new-array {v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0, v1, v2}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    const-wide/16 v3, 0x3e8

    .line 33
    .line 34
    cmp-long v1, v1, v3

    .line 35
    .line 36
    if-ltz v1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_0
    new-instance v1, Landroid/content/ContentValues;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "app_id"

    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v2, "origin"

    .line 51
    .line 52
    iget-object v3, p1, LA7/d;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p1, LA7/d;->c:LA7/R1;

    .line 58
    .line 59
    iget-object v2, v2, LA7/R1;->b:Ljava/lang/String;

    .line 60
    .line 61
    const-string v3, "name"

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, p1, LA7/d;->c:LA7/R1;

    .line 67
    .line 68
    invoke-virtual {v2}, LA7/R1;->zza()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2}, LA7/i;->A0(Landroid/content/ContentValues;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-boolean v2, p1, LA7/d;->e:Z

    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "active"

    .line 85
    .line 86
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 87
    .line 88
    .line 89
    const-string v2, "trigger_event_name"

    .line 90
    .line 91
    iget-object v3, p1, LA7/d;->f:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-wide v2, p1, LA7/d;->h:J

    .line 97
    .line 98
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v3, "trigger_timeout"

    .line 103
    .line 104
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 108
    .line 109
    .line 110
    iget-object v2, p1, LA7/d;->g:LA7/x;

    .line 111
    .line 112
    invoke-static {v2}, LA7/U1;->T0(Landroid/os/Parcelable;)[B

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const-string v3, "timed_out_event"

    .line 117
    .line 118
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 119
    .line 120
    .line 121
    iget-wide v2, p1, LA7/d;->d:J

    .line 122
    .line 123
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, "creation_timestamp"

    .line 128
    .line 129
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 133
    .line 134
    .line 135
    iget-object v2, p1, LA7/d;->i:LA7/x;

    .line 136
    .line 137
    invoke-static {v2}, LA7/U1;->T0(Landroid/os/Parcelable;)[B

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const-string v3, "triggered_event"

    .line 142
    .line 143
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 144
    .line 145
    .line 146
    iget-object v2, p1, LA7/d;->c:LA7/R1;

    .line 147
    .line 148
    iget-wide v2, v2, LA7/R1;->c:J

    .line 149
    .line 150
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const-string v3, "triggered_timestamp"

    .line 155
    .line 156
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 157
    .line 158
    .line 159
    iget-wide v2, p1, LA7/d;->j:J

    .line 160
    .line 161
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v3, "time_to_live"

    .line 166
    .line 167
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 171
    .line 172
    .line 173
    iget-object p1, p1, LA7/d;->k:LA7/x;

    .line 174
    .line 175
    invoke-static {p1}, LA7/U1;->T0(Landroid/os/Parcelable;)[B

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string v2, "expired_event"

    .line 180
    .line 181
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 182
    .line 183
    .line 184
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string v2, "conditional_properties"

    .line 189
    .line 190
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x5

    .line 192
    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    const-wide/16 v3, -0x1

    .line 197
    .line 198
    cmp-long p1, v1, v3

    .line 199
    .line 200
    if-nez p1, :cond_1

    .line 201
    .line 202
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 207
    .line 208
    const-string v1, "Failed to insert/update conditional user property (got -1)"

    .line 209
    .line 210
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {p1, v1, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :catch_0
    move-exception p1

    .line 219
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 228
    .line 229
    const-string v2, "Error storing conditional user property"

    .line 230
    .line 231
    invoke-virtual {v1, v0, v2, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 235
    return p1
.end method

.method public final M0(LA7/u;JZ)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, LA7/u;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, LA7/S1;->r0(LA7/u;)Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Landroid/content/ContentValues;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v3, "app_id"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v3, "name"

    .line 37
    .line 38
    iget-object v4, p1, LA7/u;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-wide v3, p1, LA7/u;->b:J

    .line 46
    .line 47
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v3, "timestamp"

    .line 52
    .line 53
    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "metadata_fingerprint"

    .line 61
    .line 62
    invoke-virtual {v2, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 63
    .line 64
    .line 65
    const-string p1, "data"

    .line 66
    .line 67
    invoke-virtual {v2, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "realtime"

    .line 75
    .line 76
    invoke-virtual {v2, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string p3, "raw_events"

    .line 85
    .line 86
    const/4 p4, 0x0

    .line 87
    invoke-virtual {p2, p3, p4, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 88
    .line 89
    .line 90
    move-result-wide p2

    .line 91
    const-wide/16 v1, -0x1

    .line 92
    .line 93
    cmp-long p2, p2, v1

    .line 94
    .line 95
    if-nez p2, :cond_0

    .line 96
    .line 97
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 102
    .line 103
    const-string p3, "Failed to insert raw event (got -1). appId"

    .line 104
    .line 105
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 106
    .line 107
    .line 108
    move-result-object p4

    .line 109
    invoke-virtual {p2, p3, p4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    return p1

    .line 113
    :catch_0
    move-exception p2

    .line 114
    goto :goto_0

    .line 115
    :cond_0
    const/4 p1, 0x1

    .line 116
    return p1

    .line 117
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 126
    .line 127
    const-string v0, "Error storing raw event. appId"

    .line 128
    .line 129
    invoke-virtual {p3, p4, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return p1
.end method

.method public final N0(LA7/T1;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, LA7/T1;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p1, LA7/T1;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, LA7/i;->d1(Ljava/lang/String;Ljava/lang/String;)LA7/T1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p1, LA7/T1;->b:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, LA7/U1;->k1(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const-string v2, "select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'"

    .line 26
    .line 27
    filled-new-array {v0}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0, v2, v4}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, LA7/n0;

    .line 38
    .line 39
    iget-object v2, v2, LA7/n0;->g:LA7/e;

    .line 40
    .line 41
    sget-object v6, LA7/y;->J:LA7/D;

    .line 42
    .line 43
    invoke-virtual {v2, v0, v6}, LA7/e;->i0(Ljava/lang/String;LA7/D;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/16 v6, 0x64

    .line 48
    .line 49
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/16 v6, 0x19

    .line 54
    .line 55
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-long v6, v2

    .line 60
    cmp-long v2, v4, v6

    .line 61
    .line 62
    if-ltz v2, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string v2, "_npa"

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    const-string v2, "select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'"

    .line 74
    .line 75
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {p0, v2, v4}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    const-wide/16 v6, 0x19

    .line 84
    .line 85
    cmp-long v2, v4, v6

    .line 86
    .line 87
    if-ltz v2, :cond_1

    .line 88
    .line 89
    :goto_0
    const/4 p1, 0x0

    .line 90
    return p1

    .line 91
    :cond_1
    new-instance v2, Landroid/content/ContentValues;

    .line 92
    .line 93
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v4, "app_id"

    .line 97
    .line 98
    invoke-virtual {v2, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v4, "origin"

    .line 102
    .line 103
    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v3, "name"

    .line 107
    .line 108
    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-wide v3, p1, LA7/T1;->d:J

    .line 112
    .line 113
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v3, "set_timestamp"

    .line 118
    .line 119
    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p1, LA7/T1;->e:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-static {v2, p1}, LA7/i;->A0(Landroid/content/ContentValues;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const-string v1, "user_attributes"

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x5

    .line 135
    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v1

    .line 139
    const-wide/16 v3, -0x1

    .line 140
    .line 141
    cmp-long p1, v1, v3

    .line 142
    .line 143
    if-nez p1, :cond_2

    .line 144
    .line 145
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 150
    .line 151
    const-string v1, "Failed to insert/update user property (got -1). appId"

    .line 152
    .line 153
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {p1, v1, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catch_0
    move-exception p1

    .line 162
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 171
    .line 172
    const-string v2, "Error storing user property. appId"

    .line 173
    .line 174
    invoke-virtual {v1, v0, v2, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 178
    return p1
.end method

.method public final O0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzfo$zzb;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzf()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 56
    .line 57
    const-string v2, "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, p3, v2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v3, Landroid/content/ContentValues;

    .line 68
    .line 69
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "app_id"

    .line 73
    .line 74
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-string v4, "audience_id"

    .line 82
    .line 83
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object p2, v2

    .line 102
    :goto_0
    const-string v4, "filter_id"

    .line 103
    .line 104
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 105
    .line 106
    .line 107
    const-string p2, "event_name"

    .line 108
    .line 109
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzf()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, p2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzm()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_3

    .line 121
    .line 122
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    goto :goto_1

    .line 131
    :cond_3
    move-object p2, v2

    .line 132
    :goto_1
    const-string p3, "session_scoped"

    .line 133
    .line 134
    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 135
    .line 136
    .line 137
    const-string p2, "data"

    .line 138
    .line 139
    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 140
    .line 141
    .line 142
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    const-string p3, "event_filters"

    .line 147
    .line 148
    const/4 v0, 0x5

    .line 149
    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 150
    .line 151
    .line 152
    move-result-wide p2

    .line 153
    const-wide/16 v2, -0x1

    .line 154
    .line 155
    cmp-long p2, p2, v2

    .line 156
    .line 157
    if-nez p2, :cond_4

    .line 158
    .line 159
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 164
    .line 165
    const-string p3, "Failed to insert event filter (got -1). appId"

    .line 166
    .line 167
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p2, p3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :catch_0
    move-exception p2

    .line 176
    goto :goto_3

    .line 177
    :cond_4
    :goto_2
    const/4 p1, 0x1

    .line 178
    return p1

    .line 179
    :goto_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 188
    .line 189
    const-string v0, "Error storing event filter. appId"

    .line 190
    .line 191
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return v1
.end method

.method public final P0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzfo$zze;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zze()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 56
    .line 57
    const-string v2, "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2, p3, v2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v3, Landroid/content/ContentValues;

    .line 68
    .line 69
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "app_id"

    .line 73
    .line 74
    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-string v4, "audience_id"

    .line 82
    .line 83
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object p2, v2

    .line 102
    :goto_0
    const-string v4, "filter_id"

    .line 103
    .line 104
    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 105
    .line 106
    .line 107
    const-string p2, "property_name"

    .line 108
    .line 109
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zze()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, p2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzj()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_3

    .line 121
    .line 122
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzh()Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    goto :goto_1

    .line 131
    :cond_3
    move-object p2, v2

    .line 132
    :goto_1
    const-string p3, "session_scoped"

    .line 133
    .line 134
    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 135
    .line 136
    .line 137
    const-string p2, "data"

    .line 138
    .line 139
    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 140
    .line 141
    .line 142
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    const-string p3, "property_filters"

    .line 147
    .line 148
    const/4 v0, 0x5

    .line 149
    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 150
    .line 151
    .line 152
    move-result-wide p2

    .line 153
    const-wide/16 v2, -0x1

    .line 154
    .line 155
    cmp-long p2, p2, v2

    .line 156
    .line 157
    if-nez p2, :cond_4

    .line 158
    .line 159
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 164
    .line 165
    const-string p3, "Failed to insert property filter (got -1). appId"

    .line 166
    .line 167
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p2, p3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    return v1

    .line 175
    :catch_0
    move-exception p2

    .line 176
    goto :goto_2

    .line 177
    :cond_4
    const/4 p1, 0x1

    .line 178
    return p1

    .line 179
    :goto_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 188
    .line 189
    const-string v0, "Error storing property filter. appId"

    .line 190
    .line 191
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return v1
.end method

.method public final Q0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "google_app_measurement.db"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public final R0()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-object v2, LA7/y;->G:LA7/D;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/Long;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-string v2, "(upload_type = 1 AND (ABS(creation_timestamp - "

    .line 28
    .line 29
    const-string v6, ") > CAST("

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v7, " AS INTEGER)))"

    .line 36
    .line 37
    invoke-static {v2, v4, v5, v7}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v4, LA7/y;->F:LA7/D;

    .line 42
    .line 43
    invoke-virtual {v4, v3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    const-string v5, "(upload_type != 1 AND (ABS(creation_timestamp - "

    .line 54
    .line 55
    invoke-static {v0, v1, v5, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, v3, v4, v7}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "("

    .line 64
    .line 65
    const-string v3, " OR "

    .line 66
    .line 67
    const-string v4, ")"

    .line 68
    .line 69
    invoke-static {v1, v2, v3, v0, v4}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
.end method

.method public final S0(Ljava/lang/String;)J
    .locals 14

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "first_open_count"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 20
    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    :try_start_0
    const-string v4, "select first_open_count from app2 where app_id=?"

    .line 25
    .line 26
    filled-new-array {p1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-wide/16 v6, -0x1

    .line 31
    .line 32
    invoke-virtual {p0, v4, v5, v6, v7}, LA7/i;->p0(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    cmp-long v8, v4, v6

    .line 37
    .line 38
    const-string v9, "app2"

    .line 39
    .line 40
    const-string v10, "app_id"

    .line 41
    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    :try_start_1
    new-instance v4, Landroid/content/ContentValues;

    .line 45
    .line 46
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v10, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {v4, v0, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 58
    .line 59
    .line 60
    const-string v8, "previous_install_count"

    .line 61
    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v4, v8, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v8, 0x5

    .line 71
    invoke-virtual {v1, v9, v5, v4, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    cmp-long v4, v4, v6

    .line 76
    .line 77
    if-nez v4, :cond_0

    .line 78
    .line 79
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 84
    .line 85
    const-string v5, "Failed to insert column (got -1). appId"

    .line 86
    .line 87
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v4, v8, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 95
    .line 96
    .line 97
    return-wide v6

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_1

    .line 100
    :catch_0
    move-exception v4

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    move-wide v4, v2

    .line 103
    :cond_1
    :try_start_2
    new-instance v8, Landroid/content/ContentValues;

    .line 104
    .line 105
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v10, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v10, 0x1

    .line 112
    .line 113
    add-long/2addr v10, v4

    .line 114
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v8, v0, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 119
    .line 120
    .line 121
    const-string v10, "app_id = ?"

    .line 122
    .line 123
    filled-new-array {p1}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-virtual {v1, v9, v8, v10, v11}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    int-to-long v8, v8

    .line 132
    cmp-long v2, v8, v2

    .line 133
    .line 134
    if-nez v2, :cond_2

    .line 135
    .line 136
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 141
    .line 142
    const-string v3, "Failed to update column (got 0). appId"

    .line 143
    .line 144
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-virtual {v2, v8, v3, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 152
    .line 153
    .line 154
    return-wide v6

    .line 155
    :catch_1
    move-exception v2

    .line 156
    move-wide v12, v4

    .line 157
    move-object v4, v2

    .line 158
    move-wide v2, v12

    .line 159
    goto :goto_0

    .line 160
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 164
    .line 165
    .line 166
    return-wide v4

    .line 167
    :goto_0
    :try_start_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 172
    .line 173
    const-string v6, "Error inserting column. appId"

    .line 174
    .line 175
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {v5, p1, v0, v4, v6}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 183
    .line 184
    .line 185
    return-wide v2

    .line 186
    :goto_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 187
    .line 188
    .line 189
    throw p1
.end method

.method public final T0(Ljava/lang/String;[Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance p2, Landroid/database/sqlite/SQLiteException;

    .line 30
    .line 31
    const-string v0, "Database returned empty set"

    .line 32
    .line 33
    invoke-direct {p2, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 42
    .line 43
    const-string v2, "Database error"

    .line 44
    .line 45
    invoke-virtual {v0, p1, v2, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    :goto_1
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    :cond_1
    throw p1
.end method

.method public final U0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, LA7/B0;->c0()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, LA7/G1;->h0()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v7, "app_id=?"

    .line 32
    .line 33
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v7
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    move-object/from16 v7, p2

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    const-string v8, " and origin=?"

    .line 48
    .line 49
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object/from16 v12, p0

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object/from16 v12, p0

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_0
    move-object/from16 v7, p2

    .line 64
    .line 65
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-nez v8, :cond_1

    .line 70
    .line 71
    new-instance v8, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v9, "*"

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    const-string v8, " and name glob ?"

    .line 92
    .line 93
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    new-array v8, v8, [Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    move-object v12, v3

    .line 107
    check-cast v12, [Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual/range {p0 .. p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    const-string v9, "user_attributes"

    .line 114
    .line 115
    const-string v3, "name"

    .line 116
    .line 117
    const-string v10, "set_timestamp"

    .line 118
    .line 119
    const-string v11, "value"

    .line 120
    .line 121
    const-string v13, "origin"

    .line 122
    .line 123
    filled-new-array {v3, v10, v11, v13}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    const-string v15, "rowid"

    .line 132
    .line 133
    const-string v16, "1001"

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    invoke-virtual/range {v8 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 142
    .line 143
    .line 144
    move-result v3
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    if-nez v3, :cond_2

    .line 146
    .line 147
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_2
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    const/16 v5, 0x3e8

    .line 156
    .line 157
    if-lt v3, v5, :cond_3

    .line 158
    .line 159
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 164
    .line 165
    const-string v3, "Read more than the max allowed user properties, ignoring excess"

    .line 166
    .line 167
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v0, v3, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v12, p0

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_3
    const/4 v3, 0x0

    .line 178
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    const/4 v3, 0x1

    .line 183
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 184
    .line 185
    .line 186
    move-result-wide v9
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    const/4 v3, 0x2

    .line 188
    move-object/from16 v12, p0

    .line 189
    .line 190
    :try_start_3
    invoke-virtual {v12, v2, v3}, LA7/i;->s0(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    if-nez v11, :cond_4

    .line 199
    .line 200
    invoke-virtual {v12}, LA7/B0;->zzj()LA7/N;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 205
    .line 206
    const-string v5, "(2)Read invalid user property value, ignoring it"

    .line 207
    .line 208
    invoke-static {v6}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-virtual {v3, v8, v7, v0, v5}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    goto :goto_5

    .line 218
    :catch_1
    move-exception v0

    .line 219
    goto :goto_4

    .line 220
    :cond_4
    new-instance v5, LA7/T1;

    .line 221
    .line 222
    invoke-direct/range {v5 .. v11}, LA7/T1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    if-nez v3, :cond_5

    .line 233
    .line 234
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 235
    .line 236
    .line 237
    return-object v1

    .line 238
    :cond_5
    move-object/from16 v6, p1

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :catch_2
    move-exception v0

    .line 242
    move-object/from16 v12, p0

    .line 243
    .line 244
    move-object/from16 v7, p2

    .line 245
    .line 246
    :goto_4
    :try_start_4
    invoke-virtual {v12}, LA7/B0;->zzj()LA7/N;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 251
    .line 252
    const-string v3, "(2)Error querying user properties"

    .line 253
    .line 254
    invoke-static/range {p1 .. p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v1, v4, v7, v0, v3}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 262
    .line 263
    if-eqz v2, :cond_6

    .line 264
    .line 265
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 266
    .line 267
    .line 268
    :cond_6
    return-object v0

    .line 269
    :goto_5
    if-eqz v2, :cond_7

    .line 270
    .line 271
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 272
    .line 273
    .line 274
    :cond_7
    throw v0
.end method

.method public final V0(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    new-instance v0, LA7/u;

    .line 8
    .line 9
    const-string v2, ""

    .line 10
    .line 11
    const-string v4, "dep"

    .line 12
    .line 13
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LA7/n0;

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    move-object v9, p1

    .line 22
    move-object v3, p2

    .line 23
    invoke-direct/range {v0 .. v9}, LA7/u;-><init>(LA7/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v0}, LA7/S1;->r0(LA7/u;)Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LA7/n0;

    .line 45
    .line 46
    iget-object v0, v0, LA7/n0;->m:LA7/J;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    array-length v1, p1

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object p2, p2, LA7/N;->n:LA7/P;

    .line 58
    .line 59
    const-string v2, "Saving default event parameters, appId, data size"

    .line 60
    .line 61
    invoke-virtual {p2, v0, v2, v1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Landroid/content/ContentValues;

    .line 65
    .line 66
    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v0, "app_id"

    .line 70
    .line 71
    invoke-virtual {p2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v0, "parameters"

    .line 75
    .line 76
    invoke-virtual {p2, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "default_event_params"

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v2, 0x5

    .line 87
    invoke-virtual {p1, v0, v1, p2, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide p1

    .line 91
    const-wide/16 v0, -0x1

    .line 92
    .line 93
    cmp-long p1, p1, v0

    .line 94
    .line 95
    if-nez p1, :cond_0

    .line 96
    .line 97
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 102
    .line 103
    const-string p2, "Failed to insert default event parameters (got -1). appId"

    .line 104
    .line 105
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p1, p2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_0
    move-exception v0

    .line 114
    move-object p1, v0

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    return-void

    .line 117
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 126
    .line 127
    const-string v1, "Error storing default event parameters. appId"

    .line 128
    .line 129
    invoke-virtual {p2, v0, v1, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final W0(Ljava/lang/String;LA7/F0;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/content/ContentValues;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "app_id"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "consent_state"

    .line 24
    .line 25
    invoke-virtual {p2}, LA7/F0;->m()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget p1, p2, LA7/F0;->b:I

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "consent_source"

    .line 39
    .line 40
    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, LA7/i;->z0(Landroid/content/ContentValues;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final X0(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    const-string v1, "select count(1) from audience_filter_values where app_id=?"

    .line 15
    .line 16
    filled-new-array {p1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0, v1, v2}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    iget-object v3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LA7/n0;

    .line 27
    .line 28
    iget-object v3, v3, LA7/n0;->g:LA7/e;

    .line 29
    .line 30
    sget-object v4, LA7/y;->I:LA7/D;

    .line 31
    .line 32
    invoke-virtual {v3, p1, v4}, LA7/e;->i0(Ljava/lang/String;LA7/D;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/16 v4, 0x7d0

    .line 37
    .line 38
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-long v5, v3

    .line 48
    cmp-long v1, v1, v5

    .line 49
    .line 50
    if-gtz v1, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-ge v4, v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/Integer;

    .line 69
    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    :goto_1
    return-void

    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    const-string p2, ","

    .line 88
    .line 89
    invoke-static {p2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v1, "("

    .line 94
    .line 95
    const-string v2, ")"

    .line 96
    .line 97
    invoke-static {v1, p2, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    const-string v1, "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "

    .line 102
    .line 103
    const-string v2, " order by rowid desc limit -1 offset ?)"

    .line 104
    .line 105
    invoke-static {v1, p2, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v1, "audience_filter_values"

    .line 118
    .line 119
    invoke-virtual {v0, v1, p2, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :catch_0
    move-exception p2

    .line 124
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 133
    .line 134
    const-string v1, "Database error querying filters. appId"

    .line 135
    .line 136
    invoke-virtual {v0, p1, v1, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final Y0(Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    filled-new-array {p1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    const-string v2, "select first_open_count from app2 where app_id=?"

    .line 17
    .line 18
    invoke-virtual {p0, v2, p1, v0, v1}, LA7/i;->p0(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0
.end method

.method public final Z0(Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    filled-new-array {p1}, [Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    const-string v2, "select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'"

    .line 11
    .line 12
    invoke-virtual {p0, v2, p1, v0, v1}, LA7/i;->p0(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final a1(Ljava/lang/String;Ljava/lang/String;)LA7/d;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v8, v0

    .line 6
    check-cast v8, LA7/n0;

    .line 7
    .line 8
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, LA7/B0;->c0()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, LA7/G1;->h0()V

    .line 18
    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    :try_start_0
    invoke-virtual {v1}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    const-string v11, "conditional_properties"

    .line 26
    .line 27
    const-string v12, "origin"

    .line 28
    .line 29
    const-string v13, "value"

    .line 30
    .line 31
    const-string v14, "active"

    .line 32
    .line 33
    const-string v15, "trigger_event_name"

    .line 34
    .line 35
    const-string v16, "trigger_timeout"

    .line 36
    .line 37
    const-string v17, "timed_out_event"

    .line 38
    .line 39
    const-string v18, "creation_timestamp"

    .line 40
    .line 41
    const-string v19, "triggered_event"

    .line 42
    .line 43
    const-string v20, "triggered_timestamp"

    .line 44
    .line 45
    const-string v21, "time_to_live"

    .line 46
    .line 47
    const-string v22, "expired_event"

    .line 48
    .line 49
    filled-new-array/range {v12 .. v22}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    const-string v13, "app_id=? and name=?"

    .line 54
    .line 55
    filled-new-array/range {p1 .. p2}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    invoke-virtual/range {v10 .. v17}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 65
    .line 66
    .line 67
    move-result-object v10
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 68
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 69
    .line 70
    .line 71
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 75
    .line 76
    .line 77
    return-object v9

    .line 78
    :cond_0
    const/4 v0, 0x0

    .line 79
    :try_start_2
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    const-string v2, ""

    .line 86
    .line 87
    :cond_1
    move-object v13, v2

    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v9, v10

    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :catch_0
    move-exception v0

    .line 94
    move-object/from16 v6, p2

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :goto_0
    const/4 v2, 0x1

    .line 99
    invoke-virtual {v1, v10, v2}, LA7/i;->s0(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const/4 v3, 0x2

    .line 104
    invoke-interface {v10, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    move/from16 v17, v2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    move/from16 v17, v0

    .line 114
    .line 115
    :goto_1
    const/4 v0, 0x3

    .line 116
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v18

    .line 120
    const/4 v0, 0x4

    .line 121
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 122
    .line 123
    .line 124
    move-result-wide v20

    .line 125
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/4 v2, 0x5

    .line 130
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    sget-object v3, LA7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 135
    .line 136
    invoke-virtual {v0, v2, v3}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    move-object/from16 v19, v0

    .line 141
    .line 142
    check-cast v19, LA7/x;

    .line 143
    .line 144
    const/4 v0, 0x6

    .line 145
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v15

    .line 149
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const/4 v2, 0x7

    .line 154
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v0, v2, v3}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    move-object/from16 v22, v0

    .line 163
    .line 164
    check-cast v22, LA7/x;

    .line 165
    .line 166
    const/16 v0, 0x8

    .line 167
    .line 168
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    const/16 v0, 0x9

    .line 173
    .line 174
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 175
    .line 176
    .line 177
    move-result-wide v23

    .line 178
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const/16 v2, 0xa

    .line 183
    .line 184
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v0, v2, v3}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object/from16 v25, v0

    .line 193
    .line 194
    check-cast v25, LA7/x;

    .line 195
    .line 196
    new-instance v14, LA7/R1;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 197
    .line 198
    move-wide v3, v6

    .line 199
    move-object v7, v13

    .line 200
    move-object v2, v14

    .line 201
    move-object/from16 v6, p2

    .line 202
    .line 203
    :try_start_3
    invoke-direct/range {v2 .. v7}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    move-object v14, v2

    .line 207
    move-object v13, v7

    .line 208
    new-instance v11, LA7/d;

    .line 209
    .line 210
    move-object/from16 v12, p1

    .line 211
    .line 212
    invoke-direct/range {v11 .. v25}, LA7/d;-><init>(Ljava/lang/String;Ljava/lang/String;LA7/R1;JZLjava/lang/String;LA7/x;JLA7/x;JLA7/x;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_3

    .line 220
    .line 221
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 226
    .line 227
    const-string v2, "Got multiple records for conditional property, expected one"

    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    iget-object v4, v8, LA7/n0;->m:LA7/J;

    .line 234
    .line 235
    invoke-virtual {v4, v6}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v0, v3, v2, v4}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :catch_1
    move-exception v0

    .line 244
    goto :goto_3

    .line 245
    :cond_3
    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 246
    .line 247
    .line 248
    return-object v11

    .line 249
    :catchall_1
    move-exception v0

    .line 250
    goto :goto_4

    .line 251
    :catch_2
    move-exception v0

    .line 252
    move-object/from16 v6, p2

    .line 253
    .line 254
    move-object v10, v9

    .line 255
    :goto_3
    :try_start_4
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 260
    .line 261
    const-string v3, "Error querying conditional property"

    .line 262
    .line 263
    invoke-static/range {p1 .. p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    iget-object v5, v8, LA7/n0;->m:LA7/J;

    .line 268
    .line 269
    invoke-virtual {v5, v6}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v2, v4, v5, v0, v3}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 274
    .line 275
    .line 276
    if-eqz v10, :cond_4

    .line 277
    .line 278
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 279
    .line 280
    .line 281
    :cond_4
    return-object v9

    .line 282
    :goto_4
    if-eqz v9, :cond_5

    .line 283
    .line 284
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 285
    .line 286
    .line 287
    :cond_5
    throw v0
.end method

.method public final b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;
    .locals 28

    .line 1
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, LA7/G1;->h0()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const-string v6, "last_sampled_complex_event_id"

    .line 16
    .line 17
    const-string v7, "last_sampling_rate"

    .line 18
    .line 19
    const-string v1, "lifetime_count"

    .line 20
    .line 21
    const-string v2, "current_bundle_count"

    .line 22
    .line 23
    const-string v3, "last_fire_timestamp"

    .line 24
    .line 25
    const-string v4, "last_bundled_timestamp"

    .line 26
    .line 27
    const-string v5, "last_bundled_day"

    .line 28
    .line 29
    const-string v8, "last_exempt_from_sampling"

    .line 30
    .line 31
    const-string v9, "current_session_count"

    .line 32
    .line 33
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v10, 0x0

    .line 50
    new-array v3, v10, [Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v4, v0

    .line 57
    check-cast v4, [Ljava/lang/String;

    .line 58
    .line 59
    const-string v5, "app_id=? and name=?"

    .line 60
    .line 61
    filled-new-array/range {p2 .. p3}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    move-object/from16 v3, p1

    .line 69
    .line 70
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 71
    .line 72
    .line 73
    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 75
    .line 76
    .line 77
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_0
    :try_start_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v14

    .line 88
    const/4 v0, 0x1

    .line 89
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v16

    .line 93
    const/4 v3, 0x2

    .line 94
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v20

    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    if-eqz v4, :cond_1

    .line 106
    .line 107
    move-wide/from16 v22, v5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    move-wide/from16 v22, v3

    .line 115
    .line 116
    :goto_0
    const/4 v3, 0x4

    .line 117
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    move-object/from16 v24, v1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object/from16 v24, v3

    .line 135
    .line 136
    :goto_1
    const/4 v3, 0x5

    .line 137
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_3

    .line 142
    .line 143
    move-object/from16 v25, v1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    move-object/from16 v25, v3

    .line 155
    .line 156
    :goto_2
    const/4 v3, 0x6

    .line 157
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_4

    .line 162
    .line 163
    move-object/from16 v26, v1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v3

    .line 170
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    move-object/from16 v26, v3

    .line 175
    .line 176
    :goto_3
    const/4 v3, 0x7

    .line 177
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_6

    .line 182
    .line 183
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    const-wide/16 v7, 0x1

    .line 188
    .line 189
    cmp-long v3, v3, v7

    .line 190
    .line 191
    if-nez v3, :cond_5

    .line 192
    .line 193
    move v10, v0

    .line 194
    :cond_5
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v27, v0

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    :goto_4
    move-object/from16 v6, p0

    .line 203
    .line 204
    :goto_5
    move-object v1, v2

    .line 205
    goto :goto_a

    .line 206
    :catch_0
    move-exception v0

    .line 207
    goto :goto_9

    .line 208
    :cond_6
    move-object/from16 v27, v1

    .line 209
    .line 210
    :goto_6
    const/16 v0, 0x8

    .line 211
    .line 212
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_7

    .line 217
    .line 218
    :goto_7
    move-wide/from16 v18, v5

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_7
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 222
    .line 223
    .line 224
    move-result-wide v5

    .line 225
    goto :goto_7

    .line 226
    :goto_8
    new-instance v11, LA7/t;

    .line 227
    .line 228
    move-object/from16 v12, p2

    .line 229
    .line 230
    move-object/from16 v13, p3

    .line 231
    .line 232
    invoke-direct/range {v11 .. v27}, LA7/t;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_8

    .line 240
    .line 241
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 246
    .line 247
    const-string v3, "Got multiple records for event aggregates, expected one. appId"

    .line 248
    .line 249
    invoke-static/range {p2 .. p2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-virtual {v0, v3, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 254
    .line 255
    .line 256
    :cond_8
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 257
    .line 258
    .line 259
    return-object v11

    .line 260
    :catchall_1
    move-exception v0

    .line 261
    move-object/from16 v6, p0

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :catch_1
    move-exception v0

    .line 265
    move-object v2, v1

    .line 266
    :goto_9
    :try_start_3
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 267
    .line 268
    .line 269
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 270
    :try_start_4
    iget-object v3, v3, LA7/N;->f:LA7/P;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 271
    .line 272
    :try_start_5
    const-string v4, "Error querying events. appId"

    .line 273
    .line 274
    invoke-static/range {p2 .. p2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 275
    .line 276
    .line 277
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 278
    move-object/from16 v6, p0

    .line 279
    .line 280
    :try_start_6
    iget-object v7, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v7, LA7/n0;

    .line 283
    .line 284
    iget-object v7, v7, LA7/n0;->m:LA7/J;

    .line 285
    .line 286
    move-object/from16 v13, p3

    .line 287
    .line 288
    invoke-virtual {v7, v13}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v3, v5, v7, v0, v4}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 293
    .line 294
    .line 295
    if-eqz v2, :cond_9

    .line 296
    .line 297
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 298
    .line 299
    .line 300
    :cond_9
    return-object v1

    .line 301
    :catchall_2
    move-exception v0

    .line 302
    goto :goto_5

    .line 303
    :catchall_3
    move-exception v0

    .line 304
    goto :goto_4

    .line 305
    :goto_a
    if-eqz v1, :cond_a

    .line 306
    .line 307
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 308
    .line 309
    .line 310
    :cond_a
    throw v0
.end method

.method public final c1(Ljava/lang/String;)LA7/E;
    .locals 50

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, LA7/H1;->b:LA7/L1;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, LA7/B0;->c0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, LA7/G1;->h0()V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :try_start_0
    invoke-virtual {v1}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "apps"

    .line 22
    .line 23
    const-string v6, "app_instance_id"

    .line 24
    .line 25
    const-string v7, "gmp_app_id"

    .line 26
    .line 27
    const-string v8, "resettable_device_id_hash"

    .line 28
    .line 29
    const-string v9, "last_bundle_index"

    .line 30
    .line 31
    const-string v10, "last_bundle_start_timestamp"

    .line 32
    .line 33
    const-string v11, "last_bundle_end_timestamp"

    .line 34
    .line 35
    const-string v12, "app_version"

    .line 36
    .line 37
    const-string v13, "app_store"

    .line 38
    .line 39
    const-string v14, "gmp_version"

    .line 40
    .line 41
    const-string v15, "dev_cert_hash"

    .line 42
    .line 43
    const-string v16, "measurement_enabled"

    .line 44
    .line 45
    const-string v17, "day"

    .line 46
    .line 47
    const-string v18, "daily_public_events_count"

    .line 48
    .line 49
    const-string v19, "daily_events_count"

    .line 50
    .line 51
    const-string v20, "daily_conversions_count"

    .line 52
    .line 53
    const-string v21, "config_fetched_time"

    .line 54
    .line 55
    const-string v22, "failed_config_fetch_time"

    .line 56
    .line 57
    const-string v23, "app_version_int"

    .line 58
    .line 59
    const-string v24, "firebase_instance_id"

    .line 60
    .line 61
    const-string v25, "daily_error_events_count"

    .line 62
    .line 63
    const-string v26, "daily_realtime_events_count"

    .line 64
    .line 65
    const-string v27, "health_monitor_sample"

    .line 66
    .line 67
    const-string v28, "android_id"

    .line 68
    .line 69
    const-string v29, "adid_reporting_enabled"

    .line 70
    .line 71
    const-string v30, "admob_app_id"

    .line 72
    .line 73
    const-string v31, "dynamite_version"

    .line 74
    .line 75
    const-string v32, "safelisted_events"

    .line 76
    .line 77
    const-string v33, "ga_app_id"

    .line 78
    .line 79
    const-string v34, "session_stitching_token"

    .line 80
    .line 81
    const-string v35, "sgtm_upload_enabled"

    .line 82
    .line 83
    const-string v36, "target_os_version"

    .line 84
    .line 85
    const-string v37, "session_stitching_token_hash"

    .line 86
    .line 87
    const-string v38, "ad_services_version"

    .line 88
    .line 89
    const-string v39, "unmatched_first_open_without_ad_id"

    .line 90
    .line 91
    const-string v40, "npa_metadata_value"

    .line 92
    .line 93
    const-string v41, "attribution_eligibility_status"

    .line 94
    .line 95
    const-string v42, "sgtm_preview_key"

    .line 96
    .line 97
    const-string v43, "dma_consent_state"

    .line 98
    .line 99
    const-string v44, "daily_realtime_dcu_count"

    .line 100
    .line 101
    const-string v45, "bundle_delivery_index"

    .line 102
    .line 103
    const-string v46, "serialized_npa_metadata"

    .line 104
    .line 105
    const-string v47, "unmatched_pfo"

    .line 106
    .line 107
    const-string v48, "unmatched_uwa"

    .line 108
    .line 109
    const-string v49, "ad_campaign_info"

    .line 110
    .line 111
    filled-new-array/range {v6 .. v49}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    const-string v7, "app_id=?"

    .line 116
    .line 117
    filled-new-array {v2}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-virtual/range {v4 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 125
    .line 126
    .line 127
    move-result-object v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 128
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 129
    .line 130
    .line 131
    move-result v5
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    if-nez v5, :cond_0

    .line 133
    .line 134
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 135
    .line 136
    .line 137
    return-object v3

    .line 138
    :cond_0
    :try_start_2
    new-instance v5, LA7/E;

    .line 139
    .line 140
    iget-object v6, v0, LA7/L1;->l:LA7/n0;

    .line 141
    .line 142
    invoke-direct {v5, v6, v2}, LA7/E;-><init>(LA7/n0;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v6, v5, LA7/E;->a:LA7/n0;

    .line 146
    .line 147
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 148
    .line 149
    .line 150
    move-result v7
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    sget-object v8, LA7/E0;->c:LA7/E0;

    .line 152
    .line 153
    iget-object v9, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v9, LA7/n0;

    .line 156
    .line 157
    const/4 v10, 0x0

    .line 158
    if-eqz v7, :cond_1

    .line 159
    .line 160
    :try_start_3
    iget-object v7, v9, LA7/n0;->g:LA7/e;

    .line 161
    .line 162
    sget-object v11, LA7/y;->Y0:LA7/D;

    .line 163
    .line 164
    invoke-virtual {v7, v3, v11}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_1

    .line 169
    .line 170
    invoke-virtual {v0, v2}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-virtual {v7, v8}, LA7/F0;->i(LA7/E0;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_2

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    move-object v3, v4

    .line 183
    goto/16 :goto_14

    .line 184
    .line 185
    :catch_0
    move-exception v0

    .line 186
    goto/16 :goto_13

    .line 187
    .line 188
    :cond_1
    :goto_0
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v5, v7}, LA7/E;->r(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_2
    const/4 v7, 0x1

    .line 196
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v5, v11}, LA7/E;->C(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    if-eqz v11, :cond_3

    .line 208
    .line 209
    iget-object v11, v9, LA7/n0;->g:LA7/e;

    .line 210
    .line 211
    sget-object v12, LA7/y;->Y0:LA7/D;

    .line 212
    .line 213
    invoke-virtual {v11, v3, v12}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-eqz v11, :cond_3

    .line 218
    .line 219
    invoke-virtual {v0, v2}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    sget-object v12, LA7/E0;->b:LA7/E0;

    .line 224
    .line 225
    invoke-virtual {v11, v12}, LA7/F0;->i(LA7/E0;)Z

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    if-eqz v11, :cond_4

    .line 230
    .line 231
    :cond_3
    const/4 v11, 0x2

    .line 232
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-virtual {v5, v11}, LA7/E;->G(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_4
    const/4 v11, 0x3

    .line 240
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 241
    .line 242
    .line 243
    move-result-wide v11

    .line 244
    invoke-virtual {v5, v11, v12}, LA7/E;->Q(J)V

    .line 245
    .line 246
    .line 247
    const/4 v11, 0x4

    .line 248
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 249
    .line 250
    .line 251
    move-result-wide v11

    .line 252
    invoke-virtual {v5, v11, v12}, LA7/E;->R(J)V

    .line 253
    .line 254
    .line 255
    const/4 v11, 0x5

    .line 256
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v11

    .line 260
    invoke-virtual {v5, v11, v12}, LA7/E;->P(J)V

    .line 261
    .line 262
    .line 263
    const/4 v11, 0x6

    .line 264
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    invoke-virtual {v5, v11}, LA7/E;->x(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const/4 v11, 0x7

    .line 272
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    invoke-virtual {v5, v11}, LA7/E;->v(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const/16 v11, 0x8

    .line 280
    .line 281
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v11

    .line 285
    invoke-virtual {v5, v11, v12}, LA7/E;->M(J)V

    .line 286
    .line 287
    .line 288
    const/16 v11, 0x9

    .line 289
    .line 290
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v11

    .line 294
    invoke-virtual {v5, v11, v12}, LA7/E;->J(J)V

    .line 295
    .line 296
    .line 297
    const/16 v11, 0xa

    .line 298
    .line 299
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    if-nez v12, :cond_6

    .line 304
    .line 305
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-eqz v11, :cond_5

    .line 310
    .line 311
    goto :goto_1

    .line 312
    :cond_5
    move v11, v10

    .line 313
    goto :goto_2

    .line 314
    :cond_6
    :goto_1
    move v11, v7

    .line 315
    :goto_2
    invoke-virtual {v5, v11}, LA7/E;->s(Z)V

    .line 316
    .line 317
    .line 318
    const/16 v11, 0xb

    .line 319
    .line 320
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v11

    .line 324
    invoke-virtual {v5, v11, v12}, LA7/E;->I(J)V

    .line 325
    .line 326
    .line 327
    const/16 v11, 0xc

    .line 328
    .line 329
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 330
    .line 331
    .line 332
    move-result-wide v11

    .line 333
    invoke-virtual {v5, v11, v12}, LA7/E;->F(J)V

    .line 334
    .line 335
    .line 336
    const/16 v11, 0xd

    .line 337
    .line 338
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v11

    .line 342
    invoke-virtual {v5, v11, v12}, LA7/E;->D(J)V

    .line 343
    .line 344
    .line 345
    const/16 v11, 0xe

    .line 346
    .line 347
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 348
    .line 349
    .line 350
    move-result-wide v11

    .line 351
    invoke-virtual {v5, v11, v12}, LA7/E;->z(J)V

    .line 352
    .line 353
    .line 354
    const/16 v11, 0xf

    .line 355
    .line 356
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 357
    .line 358
    .line 359
    move-result-wide v11

    .line 360
    invoke-virtual {v5, v11, v12}, LA7/E;->w(J)V

    .line 361
    .line 362
    .line 363
    const/16 v11, 0x10

    .line 364
    .line 365
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v11

    .line 369
    invoke-virtual {v5, v11, v12}, LA7/E;->L(J)V

    .line 370
    .line 371
    .line 372
    const/16 v11, 0x11

    .line 373
    .line 374
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 375
    .line 376
    .line 377
    move-result v12

    .line 378
    if-eqz v12, :cond_7

    .line 379
    .line 380
    const-wide/32 v11, -0x80000000

    .line 381
    .line 382
    .line 383
    goto :goto_3

    .line 384
    :cond_7
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    int-to-long v11, v11

    .line 389
    :goto_3
    invoke-virtual {v5, v11, v12}, LA7/E;->q(J)V

    .line 390
    .line 391
    .line 392
    const/16 v11, 0x12

    .line 393
    .line 394
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    invoke-virtual {v5, v11}, LA7/E;->A(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    const/16 v11, 0x13

    .line 402
    .line 403
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 404
    .line 405
    .line 406
    move-result-wide v11

    .line 407
    invoke-virtual {v5, v11, v12}, LA7/E;->B(J)V

    .line 408
    .line 409
    .line 410
    const/16 v11, 0x14

    .line 411
    .line 412
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 413
    .line 414
    .line 415
    move-result-wide v11

    .line 416
    invoke-virtual {v5, v11, v12}, LA7/E;->H(J)V

    .line 417
    .line 418
    .line 419
    const/16 v11, 0x15

    .line 420
    .line 421
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    invoke-virtual {v5, v11}, LA7/E;->E(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    const/16 v11, 0x17

    .line 429
    .line 430
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 431
    .line 432
    .line 433
    move-result v12

    .line 434
    if-nez v12, :cond_9

    .line 435
    .line 436
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    if-eqz v11, :cond_8

    .line 441
    .line 442
    goto :goto_4

    .line 443
    :cond_8
    move v11, v10

    .line 444
    goto :goto_5

    .line 445
    :cond_9
    :goto_4
    move v11, v7

    .line 446
    :goto_5
    iget-object v12, v6, LA7/n0;->j:LA7/k0;

    .line 447
    .line 448
    invoke-static {v12}, LA7/n0;->d(LA7/D0;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, LA7/k0;->c0()V

    .line 452
    .line 453
    .line 454
    iget-boolean v12, v5, LA7/E;->Q:Z

    .line 455
    .line 456
    iget-boolean v13, v5, LA7/E;->p:Z

    .line 457
    .line 458
    if-eq v13, v11, :cond_a

    .line 459
    .line 460
    move v13, v7

    .line 461
    goto :goto_6

    .line 462
    :cond_a
    move v13, v10

    .line 463
    :goto_6
    or-int/2addr v12, v13

    .line 464
    iput-boolean v12, v5, LA7/E;->Q:Z

    .line 465
    .line 466
    iput-boolean v11, v5, LA7/E;->p:Z

    .line 467
    .line 468
    const/16 v11, 0x18

    .line 469
    .line 470
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    invoke-virtual {v5, v11}, LA7/E;->b(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const/16 v11, 0x19

    .line 478
    .line 479
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    if-eqz v12, :cond_b

    .line 484
    .line 485
    const-wide/16 v11, 0x0

    .line 486
    .line 487
    goto :goto_7

    .line 488
    :cond_b
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 489
    .line 490
    .line 491
    move-result-wide v11

    .line 492
    :goto_7
    invoke-virtual {v5, v11, v12}, LA7/E;->K(J)V

    .line 493
    .line 494
    .line 495
    const/16 v11, 0x1a

    .line 496
    .line 497
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    if-nez v12, :cond_c

    .line 502
    .line 503
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v11

    .line 507
    const-string v12, ","

    .line 508
    .line 509
    const/4 v13, -0x1

    .line 510
    invoke-virtual {v11, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v11

    .line 514
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    invoke-virtual {v5, v11}, LA7/E;->c(Ljava/util/List;)V

    .line 519
    .line 520
    .line 521
    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    if-eqz v11, :cond_d

    .line 526
    .line 527
    iget-object v11, v9, LA7/n0;->g:LA7/e;

    .line 528
    .line 529
    sget-object v12, LA7/y;->Y0:LA7/D;

    .line 530
    .line 531
    invoke-virtual {v11, v3, v12}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    if-eqz v11, :cond_d

    .line 536
    .line 537
    invoke-virtual {v0, v2}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0, v8}, LA7/F0;->i(LA7/E0;)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_e

    .line 546
    .line 547
    :cond_d
    const/16 v0, 0x1c

    .line 548
    .line 549
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 554
    .line 555
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 559
    .line 560
    .line 561
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 562
    .line 563
    iget-object v11, v5, LA7/E;->u:Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v11, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v11

    .line 569
    xor-int/2addr v11, v7

    .line 570
    or-int/2addr v8, v11

    .line 571
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 572
    .line 573
    iput-object v0, v5, LA7/E;->u:Ljava/lang/String;

    .line 574
    .line 575
    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    if-eqz v0, :cond_12

    .line 580
    .line 581
    iget-object v0, v9, LA7/n0;->g:LA7/e;

    .line 582
    .line 583
    sget-object v8, LA7/y;->x0:LA7/D;

    .line 584
    .line 585
    invoke-virtual {v0, v3, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-eqz v0, :cond_12

    .line 590
    .line 591
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 592
    .line 593
    .line 594
    invoke-static {v2}, LA7/U1;->h1(Ljava/lang/String;)Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_12

    .line 599
    .line 600
    const/16 v0, 0x1d

    .line 601
    .line 602
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-nez v8, :cond_f

    .line 607
    .line 608
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_f

    .line 613
    .line 614
    move v0, v7

    .line 615
    goto :goto_8

    .line 616
    :cond_f
    move v0, v10

    .line 617
    :goto_8
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 618
    .line 619
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 623
    .line 624
    .line 625
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 626
    .line 627
    iget-boolean v11, v5, LA7/E;->v:Z

    .line 628
    .line 629
    if-eq v11, v0, :cond_10

    .line 630
    .line 631
    move v11, v7

    .line 632
    goto :goto_9

    .line 633
    :cond_10
    move v11, v10

    .line 634
    :goto_9
    or-int/2addr v8, v11

    .line 635
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 636
    .line 637
    iput-boolean v0, v5, LA7/E;->v:Z

    .line 638
    .line 639
    const/16 v0, 0x27

    .line 640
    .line 641
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 642
    .line 643
    .line 644
    move-result-wide v11

    .line 645
    invoke-virtual {v5, v11, v12}, LA7/E;->O(J)V

    .line 646
    .line 647
    .line 648
    iget-object v0, v9, LA7/n0;->g:LA7/e;

    .line 649
    .line 650
    sget-object v8, LA7/y;->y0:LA7/D;

    .line 651
    .line 652
    invoke-virtual {v0, v3, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_12

    .line 657
    .line 658
    const/16 v0, 0x24

    .line 659
    .line 660
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 665
    .line 666
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 670
    .line 671
    .line 672
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 673
    .line 674
    iget-object v11, v5, LA7/E;->D:Ljava/lang/String;

    .line 675
    .line 676
    if-eq v11, v0, :cond_11

    .line 677
    .line 678
    move v11, v7

    .line 679
    goto :goto_a

    .line 680
    :cond_11
    move v11, v10

    .line 681
    :goto_a
    or-int/2addr v8, v11

    .line 682
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 683
    .line 684
    iput-object v0, v5, LA7/E;->D:Ljava/lang/String;

    .line 685
    .line 686
    :cond_12
    const/16 v0, 0x1e

    .line 687
    .line 688
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 689
    .line 690
    .line 691
    move-result-wide v11

    .line 692
    invoke-virtual {v5, v11, v12}, LA7/E;->T(J)V

    .line 693
    .line 694
    .line 695
    const/16 v0, 0x1f

    .line 696
    .line 697
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 698
    .line 699
    .line 700
    move-result-wide v11

    .line 701
    invoke-virtual {v5, v11, v12}, LA7/E;->S(J)V

    .line 702
    .line 703
    .line 704
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-eqz v0, :cond_14

    .line 709
    .line 710
    iget-object v0, v9, LA7/n0;->g:LA7/e;

    .line 711
    .line 712
    sget-object v8, LA7/y;->H0:LA7/D;

    .line 713
    .line 714
    invoke-virtual {v0, v2, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    if-eqz v0, :cond_14

    .line 719
    .line 720
    const/16 v0, 0x20

    .line 721
    .line 722
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 723
    .line 724
    .line 725
    move-result v0

    .line 726
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 727
    .line 728
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 732
    .line 733
    .line 734
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 735
    .line 736
    iget v11, v5, LA7/E;->y:I

    .line 737
    .line 738
    if-eq v11, v0, :cond_13

    .line 739
    .line 740
    move v11, v7

    .line 741
    goto :goto_b

    .line 742
    :cond_13
    move v11, v10

    .line 743
    :goto_b
    or-int/2addr v8, v11

    .line 744
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 745
    .line 746
    iput v0, v5, LA7/E;->y:I

    .line 747
    .line 748
    const/16 v0, 0x23

    .line 749
    .line 750
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 751
    .line 752
    .line 753
    move-result-wide v11

    .line 754
    invoke-virtual {v5, v11, v12}, LA7/E;->u(J)V

    .line 755
    .line 756
    .line 757
    :cond_14
    const/16 v0, 0x21

    .line 758
    .line 759
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 760
    .line 761
    .line 762
    move-result v8

    .line 763
    if-nez v8, :cond_15

    .line 764
    .line 765
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    if-eqz v0, :cond_15

    .line 770
    .line 771
    move v0, v7

    .line 772
    goto :goto_c

    .line 773
    :cond_15
    move v0, v10

    .line 774
    :goto_c
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 775
    .line 776
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 780
    .line 781
    .line 782
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 783
    .line 784
    iget-boolean v11, v5, LA7/E;->z:Z

    .line 785
    .line 786
    if-eq v11, v0, :cond_16

    .line 787
    .line 788
    move v11, v7

    .line 789
    goto :goto_d

    .line 790
    :cond_16
    move v11, v10

    .line 791
    :goto_d
    or-int/2addr v8, v11

    .line 792
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 793
    .line 794
    iput-boolean v0, v5, LA7/E;->z:Z

    .line 795
    .line 796
    const/16 v0, 0x22

    .line 797
    .line 798
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 799
    .line 800
    .line 801
    move-result v8

    .line 802
    if-eqz v8, :cond_17

    .line 803
    .line 804
    move-object v0, v3

    .line 805
    goto :goto_f

    .line 806
    :cond_17
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-eqz v0, :cond_18

    .line 811
    .line 812
    move v0, v7

    .line 813
    goto :goto_e

    .line 814
    :cond_18
    move v0, v10

    .line 815
    :goto_e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    :goto_f
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 820
    .line 821
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 825
    .line 826
    .line 827
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 828
    .line 829
    iget-object v11, v5, LA7/E;->r:Ljava/lang/Boolean;

    .line 830
    .line 831
    invoke-static {v11, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v11

    .line 835
    xor-int/2addr v11, v7

    .line 836
    or-int/2addr v8, v11

    .line 837
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 838
    .line 839
    iput-object v0, v5, LA7/E;->r:Ljava/lang/Boolean;

    .line 840
    .line 841
    const/16 v0, 0x25

    .line 842
    .line 843
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    invoke-virtual {v5, v0}, LA7/E;->t(I)V

    .line 848
    .line 849
    .line 850
    const/16 v0, 0x26

    .line 851
    .line 852
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    invoke-virtual {v5, v0}, LA7/E;->p(I)V

    .line 857
    .line 858
    .line 859
    const/16 v0, 0x28

    .line 860
    .line 861
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 862
    .line 863
    .line 864
    move-result v8

    .line 865
    if-eqz v8, :cond_19

    .line 866
    .line 867
    const-string v0, ""

    .line 868
    .line 869
    goto :goto_10

    .line 870
    :cond_19
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    :goto_10
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 878
    .line 879
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 883
    .line 884
    .line 885
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 886
    .line 887
    iget-object v11, v5, LA7/E;->H:Ljava/lang/String;

    .line 888
    .line 889
    if-eq v11, v0, :cond_1a

    .line 890
    .line 891
    move v11, v7

    .line 892
    goto :goto_11

    .line 893
    :cond_1a
    move v11, v10

    .line 894
    :goto_11
    or-int/2addr v8, v11

    .line 895
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 896
    .line 897
    iput-object v0, v5, LA7/E;->H:Ljava/lang/String;

    .line 898
    .line 899
    iget-object v0, v9, LA7/n0;->g:LA7/e;

    .line 900
    .line 901
    sget-object v8, LA7/y;->W0:LA7/D;

    .line 902
    .line 903
    invoke-virtual {v0, v3, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 904
    .line 905
    .line 906
    move-result v0

    .line 907
    if-eqz v0, :cond_1c

    .line 908
    .line 909
    const/16 v0, 0x29

    .line 910
    .line 911
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 912
    .line 913
    .line 914
    move-result v8

    .line 915
    if-nez v8, :cond_1b

    .line 916
    .line 917
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 918
    .line 919
    .line 920
    move-result-wide v11

    .line 921
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 926
    .line 927
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 931
    .line 932
    .line 933
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 934
    .line 935
    iget-object v11, v5, LA7/E;->A:Ljava/lang/Long;

    .line 936
    .line 937
    invoke-static {v11, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v11

    .line 941
    xor-int/2addr v11, v7

    .line 942
    or-int/2addr v8, v11

    .line 943
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 944
    .line 945
    iput-object v0, v5, LA7/E;->A:Ljava/lang/Long;

    .line 946
    .line 947
    :cond_1b
    const/16 v0, 0x2a

    .line 948
    .line 949
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 950
    .line 951
    .line 952
    move-result v8

    .line 953
    if-nez v8, :cond_1c

    .line 954
    .line 955
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 956
    .line 957
    .line 958
    move-result-wide v11

    .line 959
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 964
    .line 965
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 969
    .line 970
    .line 971
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 972
    .line 973
    iget-object v11, v5, LA7/E;->B:Ljava/lang/Long;

    .line 974
    .line 975
    invoke-static {v11, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    move-result v11

    .line 979
    xor-int/2addr v11, v7

    .line 980
    or-int/2addr v8, v11

    .line 981
    iput-boolean v8, v5, LA7/E;->Q:Z

    .line 982
    .line 983
    iput-object v0, v5, LA7/E;->B:Ljava/lang/Long;

    .line 984
    .line 985
    :cond_1c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-eqz v0, :cond_1e

    .line 990
    .line 991
    iget-object v0, v9, LA7/n0;->g:LA7/e;

    .line 992
    .line 993
    sget-object v8, LA7/y;->U0:LA7/D;

    .line 994
    .line 995
    invoke-virtual {v0, v2, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    if-eqz v0, :cond_1e

    .line 1000
    .line 1001
    const/16 v0, 0x2b

    .line 1002
    .line 1003
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    iget-object v8, v6, LA7/n0;->j:LA7/k0;

    .line 1008
    .line 1009
    invoke-static {v8}, LA7/n0;->d(LA7/D0;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v8}, LA7/k0;->c0()V

    .line 1013
    .line 1014
    .line 1015
    iget-boolean v8, v5, LA7/E;->Q:Z

    .line 1016
    .line 1017
    iget-object v9, v5, LA7/E;->I:[B

    .line 1018
    .line 1019
    if-eq v9, v0, :cond_1d

    .line 1020
    .line 1021
    goto :goto_12

    .line 1022
    :cond_1d
    move v7, v10

    .line 1023
    :goto_12
    or-int/2addr v7, v8

    .line 1024
    iput-boolean v7, v5, LA7/E;->Q:Z

    .line 1025
    .line 1026
    iput-object v0, v5, LA7/E;->I:[B

    .line 1027
    .line 1028
    :cond_1e
    iget-object v0, v6, LA7/n0;->j:LA7/k0;

    .line 1029
    .line 1030
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 1034
    .line 1035
    .line 1036
    iput-boolean v10, v5, LA7/E;->Q:Z

    .line 1037
    .line 1038
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v0

    .line 1042
    if-eqz v0, :cond_1f

    .line 1043
    .line 1044
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 1049
    .line 1050
    const-string v6, "Got multiple records for app, expected one. appId"

    .line 1051
    .line 1052
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v7

    .line 1056
    invoke-virtual {v0, v6, v7}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1057
    .line 1058
    .line 1059
    :cond_1f
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 1060
    .line 1061
    .line 1062
    return-object v5

    .line 1063
    :catchall_1
    move-exception v0

    .line 1064
    goto :goto_14

    .line 1065
    :catch_1
    move-exception v0

    .line 1066
    move-object v4, v3

    .line 1067
    :goto_13
    :try_start_4
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 1072
    .line 1073
    const-string v6, "Error querying app. appId"

    .line 1074
    .line 1075
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    invoke-virtual {v5, v2, v6, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1080
    .line 1081
    .line 1082
    if-eqz v4, :cond_20

    .line 1083
    .line 1084
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 1085
    .line 1086
    .line 1087
    :cond_20
    return-object v3

    .line 1088
    :goto_14
    if-eqz v3, :cond_21

    .line 1089
    .line 1090
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 1091
    .line 1092
    .line 1093
    :cond_21
    throw v0
.end method

.method public final d1(Ljava/lang/String;Ljava/lang/String;)LA7/T1;
    .locals 10

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "user_attributes"

    .line 19
    .line 20
    const-string v0, "set_timestamp"

    .line 21
    .line 22
    const-string v4, "value"

    .line 23
    .line 24
    const-string v5, "origin"

    .line 25
    .line 26
    filled-new-array {v0, v4, v5}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "app_id=? and name=?"

    .line 31
    .line 32
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 40
    .line 41
    .line 42
    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 44
    .line 45
    .line 46
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :try_start_2
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v2, v0}, LA7/i;->s0(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    if-nez v9, :cond_1

    .line 64
    .line 65
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_1
    const/4 v0, 0x2

    .line 70
    :try_start_3
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v3, LA7/T1;
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    move-object v4, p1

    .line 77
    move-object v6, p2

    .line 78
    :try_start_4
    invoke-direct/range {v3 .. v9}, LA7/T1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 92
    .line 93
    const-string p2, "Got multiple records for user property, expected one. appId"

    .line 94
    .line 95
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, p2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    move-object p1, v0

    .line 105
    move-object v1, v2

    .line 106
    goto :goto_3

    .line 107
    :catch_0
    move-exception v0

    .line 108
    :goto_0
    move-object p1, v0

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 111
    .line 112
    .line 113
    return-object v3

    .line 114
    :catch_1
    move-exception v0

    .line 115
    move-object v4, p1

    .line 116
    move-object v6, p2

    .line 117
    goto :goto_0

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    move-object p1, v0

    .line 120
    goto :goto_3

    .line 121
    :catch_2
    move-exception v0

    .line 122
    move-object v4, p1

    .line 123
    move-object v6, p2

    .line 124
    move-object p1, v0

    .line 125
    move-object v2, v1

    .line 126
    :goto_2
    :try_start_5
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 131
    .line 132
    const-string v0, "Error querying user property. appId"

    .line 133
    .line 134
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v4, LA7/n0;

    .line 141
    .line 142
    iget-object v4, v4, LA7/n0;->m:LA7/J;

    .line 143
    .line 144
    invoke-virtual {v4, v6}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {p2, v3, v4, p1, v0}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    .line 150
    .line 151
    if-eqz v2, :cond_3

    .line 152
    .line 153
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 154
    .line 155
    .line 156
    :cond_3
    return-object v1

    .line 157
    :goto_3
    if-eqz v1, :cond_4

    .line 158
    .line 159
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 160
    .line 161
    .line 162
    :cond_4
    throw p1
.end method

.method public final e1(Ljava/lang/String;)LA7/F0;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    filled-new-array {p1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "select storage_consent_at_bundling from consent_settings where app_id=? limit 1;"

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, LA7/i;->u0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 v0, 0x64

    .line 21
    .line 22
    invoke-static {v0, p1}, LA7/F0;->c(ILjava/lang/String;)LA7/F0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final f1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "user_attributes"

    .line 18
    .line 19
    const-string v2, "app_id=? and name=?"

    .line 20
    .line 21
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, LA7/n0;

    .line 41
    .line 42
    iget-object v2, v2, LA7/n0;->m:LA7/J;

    .line 43
    .line 44
    invoke-virtual {v2, p2}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 49
    .line 50
    const-string v2, "Error deleting user property. appId"

    .line 51
    .line 52
    invoke-virtual {v1, p1, p2, v0, v2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final g1(Ljava/lang/String;)LA7/F0;
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    const-string v0, "select consent_state, consent_source from consent_settings where app_id=? limit 1;"

    .line 11
    .line 12
    filled-new-array {p1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 36
    .line 37
    const-string v2, "No data found"

    .line 38
    .line 39
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object v1, p1

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    :try_start_2
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-static {v2, v0}, LA7/F0;->c(ILjava/lang/String;)LA7/F0;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_1
    move-exception v0

    .line 70
    goto :goto_2

    .line 71
    :catch_1
    move-exception v0

    .line 72
    move-object p1, v1

    .line 73
    :goto_0
    :try_start_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 78
    .line 79
    const-string v3, "Error querying database."

    .line 80
    .line 81
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 90
    .line 91
    sget-object p1, LA7/F0;->c:LA7/F0;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_2
    return-object v1

    .line 95
    :goto_2
    if-eqz v1, :cond_3

    .line 96
    .line 97
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 98
    .line 99
    .line 100
    :cond_3
    throw v0
.end method

.method public final h1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "app_id=?"

    .line 15
    .line 16
    filled-new-array {p2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, p1, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 34
    .line 35
    const-string v1, "Error deleting snapshot. appId"

    .line 36
    .line 37
    invoke-virtual {v0, p2, v1, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final i1(Ljava/lang/String;)LA7/P1;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, LA7/B0;->c0()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, LA7/G1;->h0()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    move-object/from16 v3, p0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LA7/n0;

    .line 24
    .line 25
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 26
    .line 27
    sget-object v4, LA7/y;->B0:LA7/D;

    .line 28
    .line 29
    invoke-virtual {v0, v2, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    move-object/from16 v16, v2

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_0
    :try_start_0
    invoke-virtual {v3}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "upload_queue"

    .line 44
    .line 45
    const-string v6, "rowId"

    .line 46
    .line 47
    const-string v7, "app_id"

    .line 48
    .line 49
    const-string v8, "measurement_batch"

    .line 50
    .line 51
    const-string v9, "upload_uri"

    .line 52
    .line 53
    const-string v10, "upload_headers"

    .line 54
    .line 55
    const-string v11, "upload_type"

    .line 56
    .line 57
    const-string v12, "retry_count"

    .line 58
    .line 59
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v3}, LA7/i;->R0()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v8, "app_id=? AND NOT "

    .line 70
    .line 71
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    filled-new-array {v1}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    const-string v11, "creation_timestamp ASC"

    .line 86
    .line 87
    const-string v12, "1"

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    invoke-virtual/range {v4 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 92
    .line 93
    .line 94
    move-result-object v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 95
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 96
    .line 97
    .line 98
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    if-nez v0, :cond_1

    .line 100
    .line 101
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_1
    const/4 v0, 0x3

    .line 106
    :try_start_2
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_2

    .line 115
    .line 116
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 121
    .line 122
    const-string v5, "Upload uri is null or empty. Destination is unknown. Dropping batch. "

    .line 123
    .line 124
    invoke-virtual {v0, v5}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    .line 127
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 128
    .line 129
    .line 130
    return-object v2

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object v2, v4

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :catch_0
    move-exception v0

    .line 136
    move-object/from16 v16, v2

    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_2
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzj;->zzb()Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    const/4 v7, 0x2

    .line 145
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-static {v6, v8}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;

    .line 154
    .line 155
    invoke-static {v0}, LA/f;->g(I)[I

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const/4 v9, 0x5

    .line 160
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    aget v8, v8, v9

    .line 165
    .line 166
    const/4 v9, 0x1

    .line 167
    if-eq v8, v0, :cond_3

    .line 168
    .line 169
    if-ne v8, v9, :cond_5

    .line 170
    .line 171
    :cond_3
    const/4 v0, 0x6

    .line 172
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-lez v10, :cond_5

    .line 177
    .line 178
    new-instance v10, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;->zzd()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-eqz v12, :cond_4

    .line 196
    .line 197
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfy$zzk;

    .line 202
    .line 203
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzjt;->zzcd()Lcom/google/android/gms/internal/measurement/zzjt$zzb;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;

    .line 208
    .line 209
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    invoke-virtual {v12, v13}, Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;->zzi(I)Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 221
    .line 222
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfy$zzk;

    .line 223
    .line 224
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :catch_1
    move-exception v0

    .line 229
    move-object/from16 v16, v2

    .line 230
    .line 231
    goto/16 :goto_3

    .line 232
    .line 233
    :cond_4
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;->zzb()Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzj$zza;

    .line 237
    .line 238
    .line 239
    :cond_5
    new-instance v0, Ljava/util/HashMap;

    .line 240
    .line 241
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 242
    .line 243
    .line 244
    const/4 v10, 0x4

    .line 245
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    const/4 v11, 0x0

    .line 250
    if-eqz v10, :cond_7

    .line 251
    .line 252
    const-string v12, "\r\n"

    .line 253
    .line 254
    invoke-virtual {v10, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    array-length v12, v10

    .line 259
    move v13, v11

    .line 260
    :goto_1
    if-ge v13, v12, :cond_7

    .line 261
    .line 262
    aget-object v14, v10, v13

    .line 263
    .line 264
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-nez v15, :cond_7

    .line 269
    .line 270
    const-string v15, "="

    .line 271
    .line 272
    invoke-virtual {v14, v15, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v15
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 276
    move-object/from16 v16, v2

    .line 277
    .line 278
    :try_start_4
    array-length v2, v15

    .line 279
    if-eq v2, v7, :cond_6

    .line 280
    .line 281
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 286
    .line 287
    const-string v7, "Invalid upload header: "

    .line 288
    .line 289
    invoke-virtual {v2, v7, v14}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :catch_2
    move-exception v0

    .line 294
    goto :goto_4

    .line 295
    :catch_3
    move-exception v0

    .line 296
    goto :goto_3

    .line 297
    :cond_6
    aget-object v2, v15, v11

    .line 298
    .line 299
    aget-object v14, v15, v9

    .line 300
    .line 301
    invoke-virtual {v0, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    add-int/lit8 v13, v13, 0x1

    .line 305
    .line 306
    move-object/from16 v2, v16

    .line 307
    .line 308
    goto :goto_1

    .line 309
    :cond_7
    move-object/from16 v16, v2

    .line 310
    .line 311
    :goto_2
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 312
    .line 313
    .line 314
    move-result-wide v9

    .line 315
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 320
    .line 321
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfy$zzj;

    .line 322
    .line 323
    new-instance v6, LA7/P1;

    .line 324
    .line 325
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 326
    .line 327
    .line 328
    iput-wide v9, v6, LA7/P1;->a:J

    .line 329
    .line 330
    iput-object v2, v6, LA7/P1;->b:Lcom/google/android/gms/internal/measurement/zzfy$zzj;

    .line 331
    .line 332
    iput-object v5, v6, LA7/P1;->c:Ljava/lang/String;

    .line 333
    .line 334
    iput-object v0, v6, LA7/P1;->d:Ljava/util/HashMap;

    .line 335
    .line 336
    iput v8, v6, LA7/P1;->e:I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 337
    .line 338
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 339
    .line 340
    .line 341
    return-object v6

    .line 342
    :goto_3
    :try_start_5
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 347
    .line 348
    const-string v5, "Failed to queued MeasurementBatch from upload_queue. appId"

    .line 349
    .line 350
    invoke-virtual {v2, v1, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 351
    .line 352
    .line 353
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 354
    .line 355
    .line 356
    goto :goto_5

    .line 357
    :catchall_1
    move-exception v0

    .line 358
    move-object/from16 v16, v2

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :catch_4
    move-exception v0

    .line 362
    move-object/from16 v16, v2

    .line 363
    .line 364
    move-object/from16 v4, v16

    .line 365
    .line 366
    :goto_4
    :try_start_6
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 371
    .line 372
    const-string v5, "Error to querying MeasurementBatch from upload_queue. appId"

    .line 373
    .line 374
    invoke-virtual {v2, v1, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 375
    .line 376
    .line 377
    if-eqz v4, :cond_8

    .line 378
    .line 379
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 380
    .line 381
    .line 382
    :cond_8
    :goto_5
    return-object v16

    .line 383
    :goto_6
    if-eqz v2, :cond_9

    .line 384
    .line 385
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 386
    .line 387
    .line 388
    :cond_9
    throw v0
.end method

.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j1(Ljava/lang/String;)Ljava/util/List;
    .locals 11

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "user_attributes"

    .line 21
    .line 22
    const-string v4, "name"

    .line 23
    .line 24
    const-string v5, "origin"

    .line 25
    .line 26
    const-string v6, "set_timestamp"

    .line 27
    .line 28
    const-string v7, "value"

    .line 29
    .line 30
    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-string v5, "app_id=?"

    .line 35
    .line 36
    filled-new-array {p1}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string v9, "rowid"

    .line 41
    .line 42
    const-string v10, "1000"

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 51
    .line 52
    .line 53
    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 61
    :try_start_1
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    const-string v2, ""

    .line 73
    .line 74
    :cond_1
    move-object v5, v2

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    goto :goto_4

    .line 79
    :catch_0
    move-exception v0

    .line 80
    move-object v4, p1

    .line 81
    goto :goto_3

    .line 82
    :goto_1
    const/4 v2, 0x2

    .line 83
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    const/4 v2, 0x3

    .line 88
    invoke-virtual {p0, v1, v2}, LA7/i;->s0(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    if-nez v9, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 99
    .line 100
    const-string v3, "Read invalid user property value, ignoring it. appId"

    .line 101
    .line 102
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v2, v3, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v4, p1

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    new-instance v3, LA7/T1;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    move-object v4, p1

    .line 114
    :try_start_2
    invoke-direct/range {v3 .. v9}, LA7/T1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 121
    .line 122
    .line 123
    move-result p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    if-nez p1, :cond_3

    .line 125
    .line 126
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_3
    move-object p1, v4

    .line 131
    goto :goto_0

    .line 132
    :catch_1
    move-exception v0

    .line 133
    :goto_3
    :try_start_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 138
    .line 139
    const-string v2, "Error querying user properties. appId"

    .line 140
    .line 141
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {p1, v3, v2, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-object p1

    .line 156
    :goto_4
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 159
    .line 160
    .line 161
    :cond_5
    throw p1
.end method

.method public final k0()J
    .locals 6

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    const-string v4, "select rowid from raw_events order by rowid desc limit 1;"

    .line 9
    .line 10
    invoke-virtual {v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 15
    .line 16
    .line 17
    move-result v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 21
    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :try_start_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-wide v0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v3

    .line 36
    :try_start_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 41
    .line 42
    const-string v5, "Error querying raw events"

    .line 43
    .line 44
    invoke-virtual {v4, v5, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-wide v0

    .line 53
    :goto_0
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    :cond_2
    throw v0
.end method

.method public final k1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final l0()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, LA7/i;->d:LA7/m;

    .line 5
    .line 6
    invoke-virtual {v0}, LA7/m;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object v0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "Error opening database"

    .line 17
    .line 18
    iget-object v1, v1, LA7/N;->i:LA7/P;

    .line 19
    .line 20
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public final l1(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "delete from default_event_params where app_id=?"

    .line 12
    .line 13
    filled-new-array {p1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "Error clearing default event params"

    .line 27
    .line 28
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final m0()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v2, "select app_id from queue order by has_realtime desc, rowid asc limit 1;"

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    move-object v5, v1

    .line 37
    move-object v1, v0

    .line 38
    move-object v0, v5

    .line 39
    goto :goto_1

    .line 40
    :catch_1
    move-exception v2

    .line 41
    move-object v0, v1

    .line 42
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 47
    .line 48
    const-string v4, "Database error getting next bundle app id"

    .line 49
    .line 50
    invoke-virtual {v3, v4, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-object v1

    .line 59
    :goto_1
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    :cond_2
    throw v1
.end method

.method public final m1(Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "events_snapshot"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "name"

    .line 7
    .line 8
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "events"

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    new-array v5, v11, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v1, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v5, v1

    .line 27
    check-cast v5, [Ljava/lang/String;

    .line 28
    .line 29
    const-string v6, "app_id=?"

    .line 30
    .line 31
    filled-new-array {p1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 43
    .line 44
    .line 45
    move-result v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    :try_start_1
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    const-string v3, "events"

    .line 59
    .line 60
    invoke-virtual {p0, v3, p1, v1}, LA7/i;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0, v0, v1}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    goto :goto_2

    .line 73
    :catch_0
    move-exception v0

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    if-nez v1, :cond_0

    .line 80
    .line 81
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_1
    :try_start_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 90
    .line 91
    const-string v3, "Error creating snapshot. appId"

    .line 92
    .line 93
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v1, p1, v3, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    .line 100
    if-eqz v2, :cond_2

    .line 101
    .line 102
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void

    .line 106
    :goto_2
    if-eqz v2, :cond_3

    .line 107
    .line 108
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 109
    .line 110
    .line 111
    :cond_3
    throw p1
.end method

.method public final n0(Lcom/google/android/gms/internal/measurement/zzfy$zzk;)J
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, LA7/H1;->e0()LA7/S1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, LA7/S1;->l0([B)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance v3, Landroid/content/ContentValues;

    .line 30
    .line 31
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "app_id"

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "metadata_fingerprint"

    .line 48
    .line 49
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 50
    .line 51
    .line 52
    const-string v4, "metadata"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v4, "raw_events_metadata"

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-virtual {v0, v4, v5, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    return-wide v1

    .line 69
    :catch_0
    move-exception v0

    .line 70
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzz()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 83
    .line 84
    const-string v2, "Error storing raw event metadata. appId"

    .line 85
    .line 86
    invoke-virtual {v1, p1, v2, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method

.method public final n1(Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "events_snapshot"

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const-string v4, "name"

    .line 10
    .line 11
    const-string v5, "lifetime_count"

    .line 12
    .line 13
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    const-string v4, "events"

    .line 25
    .line 26
    const-string v5, "_f"

    .line 27
    .line 28
    invoke-virtual {v1, v4, v2, v5}, LA7/i;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-string v7, "_v"

    .line 33
    .line 34
    invoke-virtual {v1, v4, v2, v7}, LA7/i;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v1, v4, v2}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    :try_start_0
    invoke-virtual {v1}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    const-string v12, "events_snapshot"

    .line 48
    .line 49
    new-array v13, v10, [Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v13, v0

    .line 56
    check-cast v13, [Ljava/lang/String;

    .line 57
    .line 58
    const-string v14, "app_id=?"

    .line 59
    .line 60
    filled-new-array {v2}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v15

    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v16, 0x0

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    invoke-virtual/range {v11 .. v18}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 71
    .line 72
    .line 73
    move-result-object v11
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 74
    :try_start_1
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    .line 75
    .line 76
    .line 77
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    if-eqz v6, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1, v4, v6}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    if-eqz v8, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1, v4, v8}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    :goto_0
    invoke-virtual {v1, v3, v2}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    move v12, v10

    .line 99
    move v13, v12

    .line 100
    :cond_3
    :try_start_2
    invoke-interface {v11, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v14, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v14, LA7/n0;

    .line 107
    .line 108
    iget-object v14, v14, LA7/n0;->g:LA7/e;

    .line 109
    .line 110
    sget-object v15, LA7/y;->a1:LA7/D;

    .line 111
    .line 112
    invoke-virtual {v14, v9, v15}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 113
    .line 114
    .line 115
    move-result v14

    .line 116
    const/4 v15, 0x1

    .line 117
    if-eqz v14, :cond_5

    .line 118
    .line 119
    invoke-interface {v11, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v16

    .line 123
    const-wide/16 v18, 0x1

    .line 124
    .line 125
    cmp-long v14, v16, v18

    .line 126
    .line 127
    if-ltz v14, :cond_7

    .line 128
    .line 129
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    if-eqz v14, :cond_4

    .line 134
    .line 135
    :goto_1
    move v12, v15

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    if-eqz v14, :cond_7

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object v9, v11

    .line 146
    move v10, v12

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :catch_0
    move-exception v0

    .line 150
    move-object v9, v11

    .line 151
    move v10, v12

    .line 152
    goto :goto_5

    .line 153
    :cond_5
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    if-eqz v14, :cond_6

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_6
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-eqz v14, :cond_7

    .line 165
    .line 166
    :goto_2
    move v13, v15

    .line 167
    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 168
    .line 169
    invoke-virtual {v1, v3, v2, v0}, LA7/i;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    invoke-virtual {v1, v4, v0}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 182
    if-nez v0, :cond_3

    .line 183
    .line 184
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 185
    .line 186
    .line 187
    if-nez v12, :cond_9

    .line 188
    .line 189
    if-eqz v6, :cond_9

    .line 190
    .line 191
    invoke-virtual {v1, v4, v6}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_9
    if-nez v13, :cond_a

    .line 196
    .line 197
    if-eqz v8, :cond_a

    .line 198
    .line 199
    invoke-virtual {v1, v4, v8}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_4
    invoke-virtual {v1, v3, v2}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    move v13, v10

    .line 208
    move-object v9, v11

    .line 209
    goto :goto_7

    .line 210
    :catch_1
    move-exception v0

    .line 211
    move v13, v10

    .line 212
    move-object v9, v11

    .line 213
    goto :goto_5

    .line 214
    :catchall_2
    move-exception v0

    .line 215
    move v13, v10

    .line 216
    goto :goto_7

    .line 217
    :catch_2
    move-exception v0

    .line 218
    move v13, v10

    .line 219
    :goto_5
    :try_start_3
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 224
    .line 225
    const-string v7, "Error querying snapshot. appId"

    .line 226
    .line 227
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    invoke-virtual {v5, v11, v7, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 232
    .line 233
    .line 234
    if-eqz v9, :cond_b

    .line 235
    .line 236
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 237
    .line 238
    .line 239
    :cond_b
    if-nez v10, :cond_c

    .line 240
    .line 241
    if-eqz v6, :cond_c

    .line 242
    .line 243
    invoke-virtual {v1, v4, v6}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_c
    if-nez v13, :cond_d

    .line 248
    .line 249
    if-eqz v8, :cond_d

    .line 250
    .line 251
    invoke-virtual {v1, v4, v8}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 252
    .line 253
    .line 254
    :cond_d
    :goto_6
    invoke-virtual {v1, v3, v2}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :catchall_3
    move-exception v0

    .line 259
    :goto_7
    if-eqz v9, :cond_e

    .line 260
    .line 261
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 262
    .line 263
    .line 264
    :cond_e
    if-nez v10, :cond_10

    .line 265
    .line 266
    if-nez v6, :cond_f

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_f
    invoke-virtual {v1, v4, v6}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_10
    :goto_8
    if-nez v13, :cond_11

    .line 274
    .line 275
    if-eqz v8, :cond_11

    .line 276
    .line 277
    invoke-virtual {v1, v4, v8}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 278
    .line 279
    .line 280
    :cond_11
    :goto_9
    invoke-virtual {v1, v3, v2}, LA7/i;->h1(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0
.end method

.method public final o0(Ljava/lang/String;)J
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LA7/n0;

    .line 17
    .line 18
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 19
    .line 20
    sget-object v2, LA7/y;->q:LA7/D;

    .line 21
    .line 22
    invoke-virtual {v1, p1, v2}, LA7/e;->i0(Ljava/lang/String;LA7/D;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const v2, 0xf4240

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "raw_events"

    .line 43
    .line 44
    const-string v3, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    .line 45
    .line 46
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    int-to-long v0, p1

    .line 55
    return-wide v0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 66
    .line 67
    const-string v2, "Error deleting over the limit events. appId"

    .line 68
    .line 69
    invoke-virtual {v1, p1, v2, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    return-wide v0
.end method

.method public final o1(Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/n0;

    .line 11
    .line 12
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 13
    .line 14
    sget-object v2, LA7/y;->B0:LA7/D;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    invoke-virtual {p0}, LA7/i;->R0()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT "

    .line 29
    .line 30
    invoke-static {v2, v0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    filled-new-array {p1}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, v0, p1}, LA7/i;->T0(Ljava/lang/String;[Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    cmp-long p1, v2, v4

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_1
    return v1
.end method

.method public final p0(Ljava/lang/String;[Ljava/lang/String;J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    return-wide p3

    .line 33
    :goto_0
    :try_start_1
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 38
    .line 39
    const-string p4, "Database error"

    .line 40
    .line 41
    invoke-virtual {p3, p1, p4, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :goto_1
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 48
    .line 49
    .line 50
    :cond_1
    throw p1
.end method

.method public final p1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q0(JLjava/lang/String;JZZZZZZZ)LA7/k;
    .locals 13

    .line 1
    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    filled-new-array/range {p3 .. p3}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LA7/k;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "apps"

    .line 25
    .line 26
    const-string v5, "day"

    .line 27
    .line 28
    const-string v6, "daily_events_count"

    .line 29
    .line 30
    const-string v7, "daily_public_events_count"

    .line 31
    .line 32
    const-string v8, "daily_conversions_count"

    .line 33
    .line 34
    const-string v9, "daily_error_events_count"

    .line 35
    .line 36
    const-string v10, "daily_realtime_events_count"

    .line 37
    .line 38
    const-string v11, "daily_realtime_dcu_count"

    .line 39
    .line 40
    const-string v12, "daily_registered_triggers_count"

    .line 41
    .line 42
    filled-new-array/range {v5 .. v12}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "app_id=?"

    .line 47
    .line 48
    filled-new-array/range {p3 .. p3}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p1, p1, LA7/N;->i:LA7/P;

    .line 70
    .line 71
    const-string p2, "Not updating daily counts, app is not known. appId"

    .line 72
    .line 73
    invoke-static/range {p3 .. p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, p2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p1, v0

    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :catch_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :cond_0
    const/4 v4, 0x0

    .line 93
    :try_start_1
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    cmp-long v4, v4, p1

    .line 98
    .line 99
    if-nez v4, :cond_1

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    iput-wide v4, v1, LA7/k;->b:J

    .line 107
    .line 108
    const/4 v4, 0x2

    .line 109
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    iput-wide v4, v1, LA7/k;->a:J

    .line 114
    .line 115
    const/4 v4, 0x3

    .line 116
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    iput-wide v4, v1, LA7/k;->c:J

    .line 121
    .line 122
    const/4 v4, 0x4

    .line 123
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    iput-wide v4, v1, LA7/k;->d:J

    .line 128
    .line 129
    const/4 v4, 0x5

    .line 130
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    iput-wide v4, v1, LA7/k;->e:J

    .line 135
    .line 136
    const/4 v4, 0x6

    .line 137
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v4

    .line 141
    iput-wide v4, v1, LA7/k;->f:J

    .line 142
    .line 143
    const/4 v4, 0x7

    .line 144
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    iput-wide v4, v1, LA7/k;->g:J

    .line 149
    .line 150
    :cond_1
    if-eqz p6, :cond_2

    .line 151
    .line 152
    iget-wide v4, v1, LA7/k;->b:J

    .line 153
    .line 154
    add-long v4, v4, p4

    .line 155
    .line 156
    iput-wide v4, v1, LA7/k;->b:J

    .line 157
    .line 158
    :cond_2
    if-eqz p7, :cond_3

    .line 159
    .line 160
    iget-wide v4, v1, LA7/k;->a:J

    .line 161
    .line 162
    add-long v4, v4, p4

    .line 163
    .line 164
    iput-wide v4, v1, LA7/k;->a:J

    .line 165
    .line 166
    :cond_3
    if-eqz p8, :cond_4

    .line 167
    .line 168
    iget-wide v4, v1, LA7/k;->c:J

    .line 169
    .line 170
    add-long v4, v4, p4

    .line 171
    .line 172
    iput-wide v4, v1, LA7/k;->c:J

    .line 173
    .line 174
    :cond_4
    if-eqz p9, :cond_5

    .line 175
    .line 176
    iget-wide v4, v1, LA7/k;->d:J

    .line 177
    .line 178
    add-long v4, v4, p4

    .line 179
    .line 180
    iput-wide v4, v1, LA7/k;->d:J

    .line 181
    .line 182
    :cond_5
    if-eqz p10, :cond_6

    .line 183
    .line 184
    iget-wide v4, v1, LA7/k;->e:J

    .line 185
    .line 186
    add-long v4, v4, p4

    .line 187
    .line 188
    iput-wide v4, v1, LA7/k;->e:J

    .line 189
    .line 190
    :cond_6
    if-eqz p11, :cond_7

    .line 191
    .line 192
    iget-wide v4, v1, LA7/k;->f:J

    .line 193
    .line 194
    add-long v4, v4, p4

    .line 195
    .line 196
    iput-wide v4, v1, LA7/k;->f:J

    .line 197
    .line 198
    :cond_7
    if-eqz p12, :cond_8

    .line 199
    .line 200
    iget-wide v4, v1, LA7/k;->g:J

    .line 201
    .line 202
    add-long v4, v4, p4

    .line 203
    .line 204
    iput-wide v4, v1, LA7/k;->g:J

    .line 205
    .line 206
    :cond_8
    new-instance v4, Landroid/content/ContentValues;

    .line 207
    .line 208
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v5, "day"

    .line 212
    .line 213
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {v4, v5, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 218
    .line 219
    .line 220
    const-string p1, "daily_public_events_count"

    .line 221
    .line 222
    iget-wide v5, v1, LA7/k;->a:J

    .line 223
    .line 224
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 229
    .line 230
    .line 231
    const-string p1, "daily_events_count"

    .line 232
    .line 233
    iget-wide v5, v1, LA7/k;->b:J

    .line 234
    .line 235
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 240
    .line 241
    .line 242
    const-string p1, "daily_conversions_count"

    .line 243
    .line 244
    iget-wide v5, v1, LA7/k;->c:J

    .line 245
    .line 246
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 251
    .line 252
    .line 253
    const-string p1, "daily_error_events_count"

    .line 254
    .line 255
    iget-wide v5, v1, LA7/k;->d:J

    .line 256
    .line 257
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 262
    .line 263
    .line 264
    const-string p1, "daily_realtime_events_count"

    .line 265
    .line 266
    iget-wide v5, v1, LA7/k;->e:J

    .line 267
    .line 268
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 273
    .line 274
    .line 275
    const-string p1, "daily_realtime_dcu_count"

    .line 276
    .line 277
    iget-wide v5, v1, LA7/k;->f:J

    .line 278
    .line 279
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 284
    .line 285
    .line 286
    const-string p1, "daily_registered_triggers_count"

    .line 287
    .line 288
    iget-wide v5, v1, LA7/k;->g:J

    .line 289
    .line 290
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    invoke-virtual {v4, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 295
    .line 296
    .line 297
    const-string p1, "apps"

    .line 298
    .line 299
    const-string p2, "app_id=?"

    .line 300
    .line 301
    invoke-virtual {v3, p1, v4, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    .line 303
    .line 304
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 305
    .line 306
    .line 307
    return-object v1

    .line 308
    :goto_0
    :try_start_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 313
    .line 314
    const-string v0, "Error updating daily counts. appId"

    .line 315
    .line 316
    invoke-static/range {p3 .. p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {p2, v3, v0, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 321
    .line 322
    .line 323
    if-eqz v2, :cond_9

    .line 324
    .line 325
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 326
    .line 327
    .line 328
    :cond_9
    return-object v1

    .line 329
    :goto_1
    if-eqz v2, :cond_a

    .line 330
    .line 331
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 332
    .line 333
    .line 334
    :cond_a
    throw p1
.end method

.method public final q1()V
    .locals 10

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LA7/H1;->b:LA7/L1;

    .line 16
    .line 17
    iget-object v1, v0, LA7/L1;->i:LA7/w1;

    .line 18
    .line 19
    iget-object v1, v1, LA7/w1;->e:LA7/a0;

    .line 20
    .line 21
    invoke-virtual {v1}, LA7/a0;->d()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-object v3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, LA7/n0;

    .line 28
    .line 29
    iget-object v4, v3, LA7/n0;->n:Ln7/b;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    sub-long v1, v4, v1

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    sget-object v6, LA7/y;->A:LA7/D;

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual {v6, v7}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    cmp-long v1, v1, v8

    .line 58
    .line 59
    if-lez v1, :cond_1

    .line 60
    .line 61
    iget-object v0, v0, LA7/L1;->i:LA7/w1;

    .line 62
    .line 63
    iget-object v0, v0, LA7/w1;->e:LA7/a0;

    .line 64
    .line 65
    invoke-virtual {v0, v4, v5}, LA7/a0;->f(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, LA7/i;->Q0()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, v3, LA7/n0;->n:Ln7/b;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v1

    .line 93
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, LA7/y;->F:LA7/D;

    .line 98
    .line 99
    invoke-virtual {v2, v7}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v2, "queue"

    .line 118
    .line 119
    const-string v3, "abs(bundle_end_timestamp - ?) > cast(? as integer)"

    .line 120
    .line 121
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-lez v0, :cond_1

    .line 126
    .line 127
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 136
    .line 137
    const-string v2, "Deleted stale rows. rowsDeleted"

    .line 138
    .line 139
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_1
    :goto_0
    return-void
.end method

.method public final r0(JLjava/lang/String;ZZZZ)LA7/k;
    .locals 13

    .line 1
    const-wide/16 v4, 0x1

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v9, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-wide v1, p1

    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    move/from16 v8, p4

    .line 11
    .line 12
    move/from16 v10, p5

    .line 13
    .line 14
    move/from16 v11, p6

    .line 15
    .line 16
    move/from16 v12, p7

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v12}, LA7/i;->q0(JLjava/lang/String;JZZZZZZZ)LA7/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final r1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s0(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    if-eq v0, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 29
    .line 30
    const-string v0, "Loaded invalid unknown value type, ignoring it"

    .line 31
    .line 32
    invoke-virtual {p1, v0, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string p2, "Loaded invalid blob type value, ignoring it"

    .line 41
    .line 42
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getDouble(I)D

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string p2, "Loaded invalid null value from database"

    .line 76
    .line 77
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public final t0(J)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v1, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object p2, p2, LA7/N;->n:LA7/P;

    .line 37
    .line 38
    const-string v1, "No expired configs for apps with pending events"

    .line 39
    .line 40
    invoke-virtual {p2, v1}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    move-object v0, p1

    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception p2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p2, 0x0

    .line 53
    :try_start_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    return-object p2

    .line 61
    :catchall_1
    move-exception p2

    .line 62
    goto :goto_1

    .line 63
    :catch_1
    move-exception p2

    .line 64
    move-object p1, v0

    .line 65
    :goto_0
    :try_start_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 70
    .line 71
    const-string v2, "Error selecting expired configs"

    .line 72
    .line 73
    invoke-virtual {v1, v2, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-object v0

    .line 82
    :goto_1
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 85
    .line 86
    .line 87
    :cond_2
    throw p2
.end method

.method public final u0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {v1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    const-string p1, ""

    .line 33
    .line 34
    return-object p1

    .line 35
    :goto_0
    :try_start_1
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 40
    .line 41
    const-string v2, "Database error"

    .line 42
    .line 43
    invoke-virtual {v0, p1, v2, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_1
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 50
    .line 51
    .line 52
    :cond_1
    throw p1
.end method

.method public final v0(IILjava/lang/String;)Ljava/util/List;
    .locals 18

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LA7/B0;->c0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, LA7/G1;->h0()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v3

    .line 16
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 17
    .line 18
    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v3

    .line 24
    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 25
    .line 26
    .line 27
    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "queue"

    .line 36
    .line 37
    const-string v0, "rowid"

    .line 38
    .line 39
    const-string v7, "data"

    .line 40
    .line 41
    const-string v8, "retry_count"

    .line 42
    .line 43
    filled-new-array {v0, v7, v8}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v8, "app_id=?"

    .line 48
    .line 49
    filled-new-array/range {p3 .. p3}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const-string v12, "rowid"

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    invoke-virtual/range {v5 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_8

    .line 79
    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_2
    :try_start_1
    new-instance v5, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    move v6, v3

    .line 89
    :goto_2
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    :try_start_2
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual/range {p0 .. p0}, LA7/H1;->e0()LA7/S1;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v9, v0}, LA7/S1;->Q0([B)[B

    .line 102
    .line 103
    .line 104
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    :try_start_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_3

    .line 110
    .line 111
    array-length v9, v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    add-int/2addr v9, v6

    .line 113
    if-gt v9, v1, :cond_b

    .line 114
    .line 115
    :cond_3
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzw()Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-static {v9, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 124
    .line 125
    :try_start_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-nez v10, :cond_8

    .line 130
    .line 131
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    check-cast v10, Landroid/util/Pair;

    .line 136
    .line 137
    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfy$zzk;

    .line 140
    .line 141
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 146
    .line 147
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfy$zzk;

    .line 148
    .line 149
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzae()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzae()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_b

    .line 162
    .line 163
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzad()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzad()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    if-eqz v12, :cond_b

    .line 176
    .line 177
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzau()Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzau()Z

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    if-ne v12, v13, :cond_b

    .line 186
    .line 187
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzaf()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzaf()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-eqz v12, :cond_b

    .line 200
    .line 201
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzas()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v12
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 213
    const-string v13, "_npa"

    .line 214
    .line 215
    const-wide/16 v14, -0x1

    .line 216
    .line 217
    if-eqz v12, :cond_5

    .line 218
    .line 219
    :try_start_6
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfy$zzo;

    .line 224
    .line 225
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_4

    .line 234
    .line 235
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzc()J

    .line 236
    .line 237
    .line 238
    move-result-wide v16

    .line 239
    goto :goto_4

    .line 240
    :cond_4
    const/4 v2, 0x1

    .line 241
    goto :goto_3

    .line 242
    :cond_5
    move-wide/from16 v16, v14

    .line 243
    .line 244
    :goto_4
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzk;->zzas()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-eqz v10, :cond_7

    .line 257
    .line 258
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfy$zzo;

    .line 263
    .line 264
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    if-eqz v11, :cond_6

    .line 273
    .line 274
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzc()J

    .line 275
    .line 276
    .line 277
    move-result-wide v14

    .line 278
    :cond_7
    cmp-long v2, v16, v14

    .line 279
    .line 280
    if-nez v2, :cond_b

    .line 281
    .line 282
    :cond_8
    const/4 v2, 0x2

    .line 283
    invoke-interface {v4, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-nez v10, :cond_9

    .line 288
    .line 289
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;->zzi(I)Lcom/google/android/gms/internal/measurement/zzfy$zzk$zza;

    .line 294
    .line 295
    .line 296
    :cond_9
    array-length v0, v0

    .line 297
    add-int/2addr v6, v0

    .line 298
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 303
    .line 304
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzk;

    .line 305
    .line 306
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :catch_1
    move-exception v0

    .line 319
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 324
    .line 325
    const-string v7, "Failed to merge queued bundle. appId"

    .line 326
    .line 327
    invoke-static/range {p3 .. p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    invoke-virtual {v2, v8, v7, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto :goto_5

    .line 335
    :catch_2
    move-exception v0

    .line 336
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 341
    .line 342
    const-string v7, "Failed to unzip queued bundle. appId"

    .line 343
    .line 344
    invoke-static/range {p3 .. p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-virtual {v2, v8, v7, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :goto_5
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 352
    .line 353
    .line 354
    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 355
    if-eqz v0, :cond_b

    .line 356
    .line 357
    if-le v6, v1, :cond_a

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_a
    const/4 v2, 0x1

    .line 361
    goto/16 :goto_2

    .line 362
    .line 363
    :cond_b
    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 364
    .line 365
    .line 366
    return-object v5

    .line 367
    :goto_7
    :try_start_7
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 372
    .line 373
    const-string v2, "Error querying bundles. appId"

    .line 374
    .line 375
    invoke-static/range {p3 .. p3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v1, v3, v2, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 383
    .line 384
    if-eqz v4, :cond_c

    .line 385
    .line 386
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 387
    .line 388
    .line 389
    :cond_c
    return-object v0

    .line 390
    :goto_8
    if-eqz v4, :cond_d

    .line 391
    .line 392
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 393
    .line 394
    .line 395
    :cond_d
    throw v0
.end method

.method public final w0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "app_id=?"

    .line 22
    .line 23
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    const-string p2, " and origin=?"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p3, "*"

    .line 55
    .line 56
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string p2, " and name glob ?"

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    new-array p2, p2, [Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, [Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1, p2}, LA7/i;->x0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final x0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, LA7/B0;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, LA7/G1;->h0()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-virtual/range {p0 .. p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "conditional_properties"

    .line 18
    .line 19
    const-string v4, "app_id"

    .line 20
    .line 21
    const-string v5, "origin"

    .line 22
    .line 23
    const-string v6, "name"

    .line 24
    .line 25
    const-string v7, "value"

    .line 26
    .line 27
    const-string v8, "active"

    .line 28
    .line 29
    const-string v9, "trigger_event_name"

    .line 30
    .line 31
    const-string v10, "trigger_timeout"

    .line 32
    .line 33
    const-string v11, "timed_out_event"

    .line 34
    .line 35
    const-string v12, "creation_timestamp"

    .line 36
    .line 37
    const-string v13, "triggered_event"

    .line 38
    .line 39
    const-string v14, "triggered_timestamp"

    .line 40
    .line 41
    const-string v15, "time_to_live"

    .line 42
    .line 43
    const-string v16, "expired_event"

    .line 44
    .line 45
    filled-new-array/range {v4 .. v16}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v9, "rowid"

    .line 50
    .line 51
    const-string v10, "1001"

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    move-object/from16 v5, p1

    .line 56
    .line 57
    move-object/from16 v6, p2

    .line 58
    .line 59
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 64
    .line 65
    .line 66
    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/16 v3, 0x3e8

    .line 78
    .line 79
    if-lt v2, v3, :cond_1

    .line 80
    .line 81
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 86
    .line 87
    const-string v4, "Read more than the max allowed conditional properties, ignoring extra"

    .line 88
    .line 89
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v2, v4, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :cond_1
    const/4 v2, 0x0

    .line 105
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const/4 v3, 0x1

    .line 110
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    const/4 v6, 0x2

    .line 115
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    const/4 v6, 0x3

    .line 120
    move-object/from16 v11, p0

    .line 121
    .line 122
    invoke-virtual {v11, v1, v6}, LA7/i;->s0(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const/4 v6, 0x4

    .line 127
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_2

    .line 132
    .line 133
    move v2, v3

    .line 134
    :cond_2
    const/4 v3, 0x5

    .line 135
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const/4 v6, 0x6

    .line 140
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 141
    .line 142
    .line 143
    move-result-wide v12

    .line 144
    invoke-virtual {v11}, LA7/H1;->e0()LA7/S1;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const/4 v7, 0x7

    .line 149
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    sget-object v10, LA7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 154
    .line 155
    invoke-virtual {v6, v7, v10}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    move-object v14, v6

    .line 160
    check-cast v14, LA7/x;

    .line 161
    .line 162
    const/16 v6, 0x8

    .line 163
    .line 164
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 165
    .line 166
    .line 167
    move-result-wide v15

    .line 168
    invoke-virtual {v11}, LA7/H1;->e0()LA7/S1;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    const/16 v7, 0x9

    .line 173
    .line 174
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v6, v7, v10}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    move-object/from16 v17, v6

    .line 183
    .line 184
    check-cast v17, LA7/x;

    .line 185
    .line 186
    const/16 v6, 0xa

    .line 187
    .line 188
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    move/from16 p1, v2

    .line 193
    .line 194
    const/16 v2, 0xb

    .line 195
    .line 196
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 197
    .line 198
    .line 199
    move-result-wide v18

    .line 200
    invoke-virtual {v11}, LA7/H1;->e0()LA7/S1;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move-object/from16 p2, v3

    .line 205
    .line 206
    const/16 v3, 0xc

    .line 207
    .line 208
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v2, v3, v10}, LA7/S1;->q0([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, LA7/x;

    .line 217
    .line 218
    move-object v10, v5

    .line 219
    new-instance v5, LA7/R1;

    .line 220
    .line 221
    invoke-direct/range {v5 .. v10}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    new-instance v3, LA7/d;

    .line 225
    .line 226
    move/from16 v9, p1

    .line 227
    .line 228
    move-object v6, v5

    .line 229
    move-object v5, v10

    .line 230
    move-object v11, v14

    .line 231
    move-wide v7, v15

    .line 232
    move-object/from16 v14, v17

    .line 233
    .line 234
    move-wide/from16 v15, v18

    .line 235
    .line 236
    move-object/from16 v10, p2

    .line 237
    .line 238
    move-object/from16 v17, v2

    .line 239
    .line 240
    invoke-direct/range {v3 .. v17}, LA7/d;-><init>(Ljava/lang/String;Ljava/lang/String;LA7/R1;JZLjava/lang/String;LA7/x;JLA7/x;JLA7/x;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 247
    .line 248
    .line 249
    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 250
    if-nez v2, :cond_0

    .line 251
    .line 252
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :goto_1
    :try_start_2
    invoke-virtual/range {p0 .. p0}, LA7/B0;->zzj()LA7/N;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 261
    .line 262
    const-string v3, "Error querying conditional user property value"

    .line 263
    .line 264
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 268
    .line 269
    if-eqz v1, :cond_3

    .line 270
    .line 271
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 272
    .line 273
    .line 274
    :cond_3
    return-object v0

    .line 275
    :goto_2
    if-eqz v1, :cond_4

    .line 276
    .line 277
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 278
    .line 279
    .line 280
    :cond_4
    throw v0
.end method

.method public final y0(LA7/E;Z)V
    .locals 13

    .line 1
    const-string v0, "apps"

    .line 2
    .line 3
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, LA7/E;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Landroid/content/ContentValues;

    .line 17
    .line 18
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "app_id"

    .line 22
    .line 23
    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sget-object v4, LA7/E0;->c:LA7/E0;

    .line 31
    .line 32
    const-string v5, "app_instance_id"

    .line 33
    .line 34
    iget-object v6, p0, LA7/H1;->b:LA7/L1;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    iget-object v8, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, LA7/n0;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v3, v8, LA7/n0;->g:LA7/e;

    .line 44
    .line 45
    sget-object v9, LA7/y;->Y0:LA7/D;

    .line 46
    .line 47
    invoke-virtual {v3, v7, v9}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    invoke-virtual {v2, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v6, v1}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2, v4}, LA7/F0;->i(LA7/E0;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    :cond_1
    invoke-virtual {p1}, LA7/E;->g()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    const-string p2, "gmp_app_id"

    .line 77
    .line 78
    invoke-virtual {p1}, LA7/E;->j()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, p2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object v3, p1, LA7/E;->a:LA7/n0;

    .line 90
    .line 91
    if-eqz p2, :cond_3

    .line 92
    .line 93
    iget-object p2, v8, LA7/n0;->g:LA7/e;

    .line 94
    .line 95
    sget-object v5, LA7/y;->Y0:LA7/D;

    .line 96
    .line 97
    invoke-virtual {p2, v7, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-eqz p2, :cond_3

    .line 102
    .line 103
    invoke-virtual {v6, v1}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    sget-object v5, LA7/E0;->b:LA7/E0;

    .line 108
    .line 109
    invoke-virtual {p2, v5}, LA7/F0;->i(LA7/E0;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    :cond_3
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 116
    .line 117
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 121
    .line 122
    .line 123
    iget-object p2, p1, LA7/E;->e:Ljava/lang/String;

    .line 124
    .line 125
    const-string v5, "resettable_device_id_hash"

    .line 126
    .line 127
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 131
    .line 132
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 136
    .line 137
    .line 138
    iget-wide v9, p1, LA7/E;->g:J

    .line 139
    .line 140
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    const-string v5, "last_bundle_index"

    .line 145
    .line 146
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 147
    .line 148
    .line 149
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 150
    .line 151
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 155
    .line 156
    .line 157
    iget-wide v9, p1, LA7/E;->h:J

    .line 158
    .line 159
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    const-string v5, "last_bundle_start_timestamp"

    .line 164
    .line 165
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 166
    .line 167
    .line 168
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 169
    .line 170
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 174
    .line 175
    .line 176
    iget-wide v9, p1, LA7/E;->i:J

    .line 177
    .line 178
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    const-string v5, "last_bundle_end_timestamp"

    .line 183
    .line 184
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 185
    .line 186
    .line 187
    const-string p2, "app_version"

    .line 188
    .line 189
    invoke-virtual {p1}, LA7/E;->h()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v2, p2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 197
    .line 198
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 202
    .line 203
    .line 204
    iget-object p2, p1, LA7/E;->l:Ljava/lang/String;

    .line 205
    .line 206
    const-string v5, "app_store"

    .line 207
    .line 208
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 212
    .line 213
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 217
    .line 218
    .line 219
    iget-wide v9, p1, LA7/E;->m:J

    .line 220
    .line 221
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    const-string v5, "gmp_version"

    .line 226
    .line 227
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 228
    .line 229
    .line 230
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 231
    .line 232
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 236
    .line 237
    .line 238
    iget-wide v9, p1, LA7/E;->n:J

    .line 239
    .line 240
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    const-string v5, "dev_cert_hash"

    .line 245
    .line 246
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 247
    .line 248
    .line 249
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 250
    .line 251
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 255
    .line 256
    .line 257
    iget-boolean p2, p1, LA7/E;->o:Z

    .line 258
    .line 259
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    const-string v5, "measurement_enabled"

    .line 264
    .line 265
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 266
    .line 267
    .line 268
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 269
    .line 270
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 274
    .line 275
    .line 276
    iget-wide v9, p1, LA7/E;->J:J

    .line 277
    .line 278
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    const-string v5, "day"

    .line 283
    .line 284
    invoke-virtual {v2, v5, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 285
    .line 286
    .line 287
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 288
    .line 289
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 293
    .line 294
    .line 295
    iget-wide v9, p1, LA7/E;->K:J

    .line 296
    .line 297
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    const-string v9, "daily_public_events_count"

    .line 302
    .line 303
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 304
    .line 305
    .line 306
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 310
    .line 311
    .line 312
    iget-wide v9, p1, LA7/E;->L:J

    .line 313
    .line 314
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    const-string v9, "daily_events_count"

    .line 319
    .line 320
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 321
    .line 322
    .line 323
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 327
    .line 328
    .line 329
    iget-wide v9, p1, LA7/E;->M:J

    .line 330
    .line 331
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    const-string v9, "daily_conversions_count"

    .line 336
    .line 337
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 338
    .line 339
    .line 340
    iget-object v5, v3, LA7/n0;->j:LA7/k0;

    .line 341
    .line 342
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, LA7/k0;->c0()V

    .line 346
    .line 347
    .line 348
    iget-wide v9, p1, LA7/E;->R:J

    .line 349
    .line 350
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    const-string v9, "config_fetched_time"

    .line 355
    .line 356
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 357
    .line 358
    .line 359
    iget-object v5, v3, LA7/n0;->j:LA7/k0;

    .line 360
    .line 361
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5}, LA7/k0;->c0()V

    .line 365
    .line 366
    .line 367
    iget-wide v9, p1, LA7/E;->S:J

    .line 368
    .line 369
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    const-string v9, "failed_config_fetch_time"

    .line 374
    .line 375
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1}, LA7/E;->y()J

    .line 379
    .line 380
    .line 381
    move-result-wide v9

    .line 382
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    const-string v9, "app_version_int"

    .line 387
    .line 388
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 389
    .line 390
    .line 391
    const-string v5, "firebase_instance_id"

    .line 392
    .line 393
    invoke-virtual {p1}, LA7/E;->i()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    invoke-virtual {v2, v5, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 404
    .line 405
    .line 406
    iget-wide v9, p1, LA7/E;->N:J

    .line 407
    .line 408
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    const-string v9, "daily_error_events_count"

    .line 413
    .line 414
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 415
    .line 416
    .line 417
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 421
    .line 422
    .line 423
    iget-wide v9, p1, LA7/E;->O:J

    .line 424
    .line 425
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    const-string v9, "daily_realtime_events_count"

    .line 430
    .line 431
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 432
    .line 433
    .line 434
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 438
    .line 439
    .line 440
    iget-object v5, p1, LA7/E;->P:Ljava/lang/String;

    .line 441
    .line 442
    const-string v9, "health_monitor_sample"

    .line 443
    .line 444
    invoke-virtual {v2, v9, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    iget-object v5, v3, LA7/n0;->j:LA7/k0;

    .line 448
    .line 449
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5}, LA7/k0;->c0()V

    .line 453
    .line 454
    .line 455
    const-wide/16 v9, 0x0

    .line 456
    .line 457
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    const-string v11, "android_id"

    .line 462
    .line 463
    invoke-virtual {v2, v11, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 464
    .line 465
    .line 466
    iget-object v5, v3, LA7/n0;->j:LA7/k0;

    .line 467
    .line 468
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v5}, LA7/k0;->c0()V

    .line 472
    .line 473
    .line 474
    iget-boolean v5, p1, LA7/E;->p:Z

    .line 475
    .line 476
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    const-string v11, "adid_reporting_enabled"

    .line 481
    .line 482
    invoke-virtual {v2, v11, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 483
    .line 484
    .line 485
    const-string v5, "admob_app_id"

    .line 486
    .line 487
    invoke-virtual {p1}, LA7/E;->d()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    invoke-virtual {v2, v5, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p1}, LA7/E;->N()J

    .line 495
    .line 496
    .line 497
    move-result-wide v11

    .line 498
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    const-string v11, "dynamite_version"

    .line 503
    .line 504
    invoke-virtual {v2, v11, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 505
    .line 506
    .line 507
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-eqz v5, :cond_5

    .line 512
    .line 513
    iget-object v5, v8, LA7/n0;->g:LA7/e;

    .line 514
    .line 515
    sget-object v11, LA7/y;->Y0:LA7/D;

    .line 516
    .line 517
    invoke-virtual {v5, v7, v11}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    if-eqz v5, :cond_5

    .line 522
    .line 523
    invoke-virtual {v6, v1}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-virtual {v5, v4}, LA7/F0;->i(LA7/E0;)Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-eqz v4, :cond_6

    .line 532
    .line 533
    :cond_5
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 534
    .line 535
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 539
    .line 540
    .line 541
    iget-object v4, p1, LA7/E;->u:Ljava/lang/String;

    .line 542
    .line 543
    const-string v5, "session_stitching_token"

    .line 544
    .line 545
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    :cond_6
    invoke-virtual {p1}, LA7/E;->o()Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    const-string v5, "sgtm_upload_enabled"

    .line 557
    .line 558
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 559
    .line 560
    .line 561
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 562
    .line 563
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 567
    .line 568
    .line 569
    iget-wide v4, p1, LA7/E;->w:J

    .line 570
    .line 571
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    const-string v5, "target_os_version"

    .line 576
    .line 577
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 578
    .line 579
    .line 580
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 581
    .line 582
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 586
    .line 587
    .line 588
    iget-wide v4, p1, LA7/E;->x:J

    .line 589
    .line 590
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    const-string v5, "session_stitching_token_hash"

    .line 595
    .line 596
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 597
    .line 598
    .line 599
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-eqz v4, :cond_7

    .line 604
    .line 605
    iget-object v4, v8, LA7/n0;->g:LA7/e;

    .line 606
    .line 607
    sget-object v5, LA7/y;->H0:LA7/D;

    .line 608
    .line 609
    invoke-virtual {v4, v1, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 610
    .line 611
    .line 612
    move-result v4

    .line 613
    if-eqz v4, :cond_7

    .line 614
    .line 615
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 616
    .line 617
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 621
    .line 622
    .line 623
    iget v4, p1, LA7/E;->y:I

    .line 624
    .line 625
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    const-string v5, "ad_services_version"

    .line 630
    .line 631
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 632
    .line 633
    .line 634
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 635
    .line 636
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 640
    .line 641
    .line 642
    iget-wide v4, p1, LA7/E;->C:J

    .line 643
    .line 644
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 645
    .line 646
    .line 647
    move-result-object v4

    .line 648
    const-string v5, "attribution_eligibility_status"

    .line 649
    .line 650
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 651
    .line 652
    .line 653
    :cond_7
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 654
    .line 655
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 659
    .line 660
    .line 661
    iget-boolean v4, p1, LA7/E;->z:Z

    .line 662
    .line 663
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    const-string v5, "unmatched_first_open_without_ad_id"

    .line 668
    .line 669
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 670
    .line 671
    .line 672
    const-string v4, "npa_metadata_value"

    .line 673
    .line 674
    invoke-virtual {p1}, LA7/E;->U()Ljava/lang/Boolean;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    invoke-virtual {v2, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 679
    .line 680
    .line 681
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    if-eqz v4, :cond_8

    .line 686
    .line 687
    iget-object v4, v8, LA7/n0;->g:LA7/e;

    .line 688
    .line 689
    sget-object v5, LA7/y;->x0:LA7/D;

    .line 690
    .line 691
    invoke-virtual {v4, v1, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-eqz v4, :cond_8

    .line 696
    .line 697
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 698
    .line 699
    .line 700
    invoke-static {v1}, LA7/U1;->h1(Ljava/lang/String;)Z

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    if-eqz v4, :cond_8

    .line 705
    .line 706
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 707
    .line 708
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 712
    .line 713
    .line 714
    iget-wide v4, p1, LA7/E;->G:J

    .line 715
    .line 716
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    const-string v5, "bundle_delivery_index"

    .line 721
    .line 722
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 723
    .line 724
    .line 725
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    .line 726
    .line 727
    .line 728
    move-result v4

    .line 729
    if-eqz v4, :cond_9

    .line 730
    .line 731
    iget-object v4, v8, LA7/n0;->g:LA7/e;

    .line 732
    .line 733
    sget-object v5, LA7/y;->y0:LA7/D;

    .line 734
    .line 735
    invoke-virtual {v4, v1, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    if-eqz v4, :cond_9

    .line 740
    .line 741
    const-string v4, "sgtm_preview_key"

    .line 742
    .line 743
    invoke-virtual {p1}, LA7/E;->l()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    invoke-virtual {v2, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    :cond_9
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 754
    .line 755
    .line 756
    iget v4, p1, LA7/E;->E:I

    .line 757
    .line 758
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    const-string v5, "dma_consent_state"

    .line 763
    .line 764
    invoke-virtual {v2, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 765
    .line 766
    .line 767
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 771
    .line 772
    .line 773
    iget p2, p1, LA7/E;->F:I

    .line 774
    .line 775
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 776
    .line 777
    .line 778
    move-result-object p2

    .line 779
    const-string v4, "daily_realtime_dcu_count"

    .line 780
    .line 781
    invoke-virtual {v2, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 782
    .line 783
    .line 784
    const-string p2, "serialized_npa_metadata"

    .line 785
    .line 786
    invoke-virtual {p1}, LA7/E;->k()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    invoke-virtual {v2, p2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 794
    .line 795
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 799
    .line 800
    .line 801
    iget-object p2, p1, LA7/E;->t:Ljava/util/ArrayList;

    .line 802
    .line 803
    const-string v4, "safelisted_events"

    .line 804
    .line 805
    if-eqz p2, :cond_b

    .line 806
    .line 807
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    if-eqz v5, :cond_a

    .line 812
    .line 813
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 814
    .line 815
    .line 816
    move-result-object p2

    .line 817
    const-string v5, "Safelisted events should not be an empty list. appId"

    .line 818
    .line 819
    iget-object p2, p2, LA7/N;->i:LA7/P;

    .line 820
    .line 821
    invoke-virtual {p2, v5, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    goto :goto_1

    .line 825
    :cond_a
    const-string v5, ","

    .line 826
    .line 827
    invoke-static {v5, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object p2

    .line 831
    invoke-virtual {v2, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    :cond_b
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzny;->zza()Z

    .line 835
    .line 836
    .line 837
    move-result p2

    .line 838
    if-eqz p2, :cond_c

    .line 839
    .line 840
    iget-object p2, v8, LA7/n0;->g:LA7/e;

    .line 841
    .line 842
    sget-object v5, LA7/y;->u0:LA7/D;

    .line 843
    .line 844
    invoke-virtual {p2, v7, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 845
    .line 846
    .line 847
    move-result p2

    .line 848
    if-eqz p2, :cond_c

    .line 849
    .line 850
    invoke-virtual {v2, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 851
    .line 852
    .line 853
    move-result p2

    .line 854
    if-nez p2, :cond_c

    .line 855
    .line 856
    invoke-virtual {v2, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    :cond_c
    iget-object p2, v8, LA7/n0;->g:LA7/e;

    .line 860
    .line 861
    sget-object v4, LA7/y;->W0:LA7/D;

    .line 862
    .line 863
    invoke-virtual {p2, v7, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 864
    .line 865
    .line 866
    move-result p2

    .line 867
    if-eqz p2, :cond_d

    .line 868
    .line 869
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 870
    .line 871
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 875
    .line 876
    .line 877
    iget-object p2, p1, LA7/E;->A:Ljava/lang/Long;

    .line 878
    .line 879
    const-string v4, "unmatched_pfo"

    .line 880
    .line 881
    invoke-virtual {v2, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 882
    .line 883
    .line 884
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 885
    .line 886
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 890
    .line 891
    .line 892
    iget-object p2, p1, LA7/E;->B:Ljava/lang/Long;

    .line 893
    .line 894
    const-string v4, "unmatched_uwa"

    .line 895
    .line 896
    invoke-virtual {v2, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 897
    .line 898
    .line 899
    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    .line 900
    .line 901
    .line 902
    move-result p2

    .line 903
    if-eqz p2, :cond_e

    .line 904
    .line 905
    sget-object p2, LA7/y;->U0:LA7/D;

    .line 906
    .line 907
    iget-object v4, v8, LA7/n0;->g:LA7/e;

    .line 908
    .line 909
    invoke-virtual {v4, v1, p2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 910
    .line 911
    .line 912
    move-result p2

    .line 913
    if-eqz p2, :cond_e

    .line 914
    .line 915
    iget-object p2, v3, LA7/n0;->j:LA7/k0;

    .line 916
    .line 917
    invoke-static {p2}, LA7/n0;->d(LA7/D0;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {p2}, LA7/k0;->c0()V

    .line 921
    .line 922
    .line 923
    iget-object p1, p1, LA7/E;->I:[B

    .line 924
    .line 925
    const-string p2, "ad_campaign_info"

    .line 926
    .line 927
    invoke-virtual {v2, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 928
    .line 929
    .line 930
    :cond_e
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 931
    .line 932
    .line 933
    move-result-object p1

    .line 934
    const-string p2, "app_id = ?"

    .line 935
    .line 936
    filled-new-array {v1}, [Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    invoke-virtual {p1, v0, v2, p2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 941
    .line 942
    .line 943
    move-result p2

    .line 944
    int-to-long v3, p2

    .line 945
    cmp-long p2, v3, v9

    .line 946
    .line 947
    if-nez p2, :cond_f

    .line 948
    .line 949
    const/4 p2, 0x5

    .line 950
    invoke-virtual {p1, v0, v7, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 951
    .line 952
    .line 953
    move-result-wide p1

    .line 954
    const-wide/16 v2, -0x1

    .line 955
    .line 956
    cmp-long p1, p1, v2

    .line 957
    .line 958
    if-nez p1, :cond_f

    .line 959
    .line 960
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 961
    .line 962
    .line 963
    move-result-object p1

    .line 964
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 965
    .line 966
    const-string p2, "Failed to insert/update app (got -1). appId"

    .line 967
    .line 968
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    invoke-virtual {p1, p2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 973
    .line 974
    .line 975
    return-void

    .line 976
    :catch_0
    move-exception p1

    .line 977
    goto :goto_2

    .line 978
    :cond_f
    return-void

    .line 979
    :goto_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 980
    .line 981
    .line 982
    move-result-object p2

    .line 983
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 988
    .line 989
    const-string v1, "Error storing app. appId"

    .line 990
    .line 991
    invoke-virtual {p2, v0, v1, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    return-void
.end method

.method public final z0(Landroid/content/ContentValues;)V
    .locals 7

    .line 1
    const-string v0, "consent_settings"

    .line 2
    .line 3
    const-string v1, "app_id"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, LA7/N;->h:LA7/P;

    .line 20
    .line 21
    const-string v2, "Value of the primary key is not set."

    .line 22
    .line 23
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p1, v2, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v4, "app_id = ?"

    .line 34
    .line 35
    filled-new-array {v3}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v0, p1, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-long v3, v3

    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    cmp-long v3, v3, v5

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x5

    .line 52
    invoke-virtual {v2, v0, v3, p1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    const-wide/16 v4, -0x1

    .line 57
    .line 58
    cmp-long p1, v2, v4

    .line 59
    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 67
    .line 68
    const-string v2, "Failed to insert/update table (got -1). key"

    .line 69
    .line 70
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p1, v3, v2, v4}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void

    .line 82
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v0}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 95
    .line 96
    const-string v3, "Error storing into table. key"

    .line 97
    .line 98
    invoke-virtual {v2, v0, v1, p1, v3}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
