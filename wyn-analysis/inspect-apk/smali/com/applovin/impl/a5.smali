.class public Lcom/applovin/impl/a5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lcom/applovin/impl/a5;

.field public static final B:Lcom/applovin/impl/a5;

.field public static final C:Lcom/applovin/impl/a5;

.field public static final D:Lcom/applovin/impl/a5;

.field public static final E:Lcom/applovin/impl/a5;

.field public static final F:Lcom/applovin/impl/a5;

.field public static final G:Lcom/applovin/impl/a5;

.field public static final H:Lcom/applovin/impl/a5;

.field public static final I:Lcom/applovin/impl/a5;

.field public static final J:Lcom/applovin/impl/a5;

.field public static final K:Lcom/applovin/impl/a5;

.field public static final L:Lcom/applovin/impl/a5;

.field public static final M:Lcom/applovin/impl/a5;

.field public static final N:Lcom/applovin/impl/a5;

.field public static final O:Lcom/applovin/impl/a5;

.field public static final P:Lcom/applovin/impl/a5;

.field public static final Q:Lcom/applovin/impl/a5;

.field public static final R:Lcom/applovin/impl/a5;

.field public static final S:Lcom/applovin/impl/a5;

.field public static final T:Lcom/applovin/impl/a5;

.field public static final c:Lcom/applovin/impl/a5;

.field public static final d:Lcom/applovin/impl/a5;

.field public static final e:Lcom/applovin/impl/a5;

.field public static final f:Lcom/applovin/impl/a5;

.field public static final g:Lcom/applovin/impl/a5;

.field public static final h:Lcom/applovin/impl/a5;

.field public static final i:Lcom/applovin/impl/a5;

.field public static final j:Lcom/applovin/impl/a5;

.field public static final k:Lcom/applovin/impl/a5;

.field public static final l:Lcom/applovin/impl/a5;

.field public static final m:Lcom/applovin/impl/a5;

.field public static final n:Lcom/applovin/impl/a5;

.field public static final o:Lcom/applovin/impl/a5;

.field public static final p:Lcom/applovin/impl/a5;

.field public static final q:Lcom/applovin/impl/a5;

.field public static final r:Lcom/applovin/impl/a5;

.field public static final s:Lcom/applovin/impl/a5;

.field public static final t:Lcom/applovin/impl/a5;

.field public static final u:Lcom/applovin/impl/a5;

.field public static final v:Lcom/applovin/impl/a5;

.field public static final w:Lcom/applovin/impl/a5;

.field public static final x:Lcom/applovin/impl/a5;

.field public static final y:Lcom/applovin/impl/a5;

.field public static final z:Lcom/applovin/impl/a5;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/applovin/impl/a5;

    .line 2
    .line 3
    const-string v1, "com.applovin.sdk.impl.isFirstRun"

    .line 4
    .line 5
    const-class v2, Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/applovin/impl/a5;->c:Lcom/applovin/impl/a5;

    .line 11
    .line 12
    new-instance v0, Lcom/applovin/impl/a5;

    .line 13
    .line 14
    const-string v1, "com.applovin.sdk.launched_before"

    .line 15
    .line 16
    const-class v3, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/applovin/impl/a5;->d:Lcom/applovin/impl/a5;

    .line 22
    .line 23
    new-instance v0, Lcom/applovin/impl/a5;

    .line 24
    .line 25
    const-string v1, "com.applovin.sdk.launch_count"

    .line 26
    .line 27
    const-class v4, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/applovin/impl/a5;->e:Lcom/applovin/impl/a5;

    .line 33
    .line 34
    new-instance v0, Lcom/applovin/impl/a5;

    .line 35
    .line 36
    const-string v1, "com.applovin.sdk.last_launch_timestamp"

    .line 37
    .line 38
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/applovin/impl/a5;->f:Lcom/applovin/impl/a5;

    .line 42
    .line 43
    new-instance v0, Lcom/applovin/impl/a5;

    .line 44
    .line 45
    const-string v1, "com.applovin.sdk.latest_installed_version"

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/applovin/impl/a5;->g:Lcom/applovin/impl/a5;

    .line 51
    .line 52
    new-instance v0, Lcom/applovin/impl/a5;

    .line 53
    .line 54
    const-string v1, "com.applovin.sdk.install_date"

    .line 55
    .line 56
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/applovin/impl/a5;->h:Lcom/applovin/impl/a5;

    .line 60
    .line 61
    new-instance v0, Lcom/applovin/impl/a5;

    .line 62
    .line 63
    const-string v1, "com.applovin.sdk.av"

    .line 64
    .line 65
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lcom/applovin/impl/a5;->i:Lcom/applovin/impl/a5;

    .line 69
    .line 70
    new-instance v0, Lcom/applovin/impl/a5;

    .line 71
    .line 72
    const-string v1, "com.applovin.sdk.save_settings_with_sdk_key_agnostic_name"

    .line 73
    .line 74
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lcom/applovin/impl/a5;->j:Lcom/applovin/impl/a5;

    .line 78
    .line 79
    new-instance v0, Lcom/applovin/impl/a5;

    .line 80
    .line 81
    const-string v1, "com.applovin.sdk.user_id"

    .line 82
    .line 83
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lcom/applovin/impl/a5;->k:Lcom/applovin/impl/a5;

    .line 87
    .line 88
    new-instance v0, Lcom/applovin/impl/a5;

    .line 89
    .line 90
    const-string v1, "com.applovin.sdk.compass_random_token"

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/applovin/impl/a5;->l:Lcom/applovin/impl/a5;

    .line 96
    .line 97
    new-instance v0, Lcom/applovin/impl/a5;

    .line 98
    .line 99
    const-string v1, "com.applovin.sdk.applovin_random_token"

    .line 100
    .line 101
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lcom/applovin/impl/a5;->m:Lcom/applovin/impl/a5;

    .line 105
    .line 106
    new-instance v0, Lcom/applovin/impl/a5;

    .line 107
    .line 108
    const-string v1, "com.applovin.sdk.alart"

    .line 109
    .line 110
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lcom/applovin/impl/a5;->n:Lcom/applovin/impl/a5;

    .line 114
    .line 115
    new-instance v0, Lcom/applovin/impl/a5;

    .line 116
    .line 117
    const-string v1, "com.applovin.sdk.aleid"

    .line 118
    .line 119
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 120
    .line 121
    .line 122
    sput-object v0, Lcom/applovin/impl/a5;->o:Lcom/applovin/impl/a5;

    .line 123
    .line 124
    new-instance v0, Lcom/applovin/impl/a5;

    .line 125
    .line 126
    const-string v1, "com.applovin.sdk.device_test_group"

    .line 127
    .line 128
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    sput-object v0, Lcom/applovin/impl/a5;->p:Lcom/applovin/impl/a5;

    .line 132
    .line 133
    new-instance v0, Lcom/applovin/impl/a5;

    .line 134
    .line 135
    const-string v1, "com.applovin.sdk.compliance.has_user_consent"

    .line 136
    .line 137
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Lcom/applovin/impl/a5;->q:Lcom/applovin/impl/a5;

    .line 141
    .line 142
    new-instance v0, Lcom/applovin/impl/a5;

    .line 143
    .line 144
    const-string v1, "com.applovin.sdk.compliance.is_age_restricted_user"

    .line 145
    .line 146
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 147
    .line 148
    .line 149
    sput-object v0, Lcom/applovin/impl/a5;->r:Lcom/applovin/impl/a5;

    .line 150
    .line 151
    new-instance v0, Lcom/applovin/impl/a5;

    .line 152
    .line 153
    const-string v1, "com.applovin.sdk.compliance.is_do_not_sell"

    .line 154
    .line 155
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 156
    .line 157
    .line 158
    sput-object v0, Lcom/applovin/impl/a5;->s:Lcom/applovin/impl/a5;

    .line 159
    .line 160
    new-instance v0, Lcom/applovin/impl/a5;

    .line 161
    .line 162
    const-string v1, "com.applovin.sdk.has_seen_but_not_accepted_privacy_policy"

    .line 163
    .line 164
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/applovin/impl/a5;->t:Lcom/applovin/impl/a5;

    .line 168
    .line 169
    new-instance v0, Lcom/applovin/impl/a5;

    .line 170
    .line 171
    const-string v1, "IABTCF_CmpSdkID"

    .line 172
    .line 173
    const-class v5, Ljava/lang/Object;

    .line 174
    .line 175
    invoke-direct {v0, v1, v5}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lcom/applovin/impl/a5;->u:Lcom/applovin/impl/a5;

    .line 179
    .line 180
    new-instance v0, Lcom/applovin/impl/a5;

    .line 181
    .line 182
    const-string v1, "IABTCF_CmpSdkVersion"

    .line 183
    .line 184
    invoke-direct {v0, v1, v5}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 185
    .line 186
    .line 187
    sput-object v0, Lcom/applovin/impl/a5;->v:Lcom/applovin/impl/a5;

    .line 188
    .line 189
    new-instance v0, Lcom/applovin/impl/a5;

    .line 190
    .line 191
    const-string v1, "IABTCF_gdprApplies"

    .line 192
    .line 193
    invoke-direct {v0, v1, v5}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 194
    .line 195
    .line 196
    sput-object v0, Lcom/applovin/impl/a5;->w:Lcom/applovin/impl/a5;

    .line 197
    .line 198
    new-instance v0, Lcom/applovin/impl/a5;

    .line 199
    .line 200
    const-string v1, "IABTCF_TCString"

    .line 201
    .line 202
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 203
    .line 204
    .line 205
    sput-object v0, Lcom/applovin/impl/a5;->x:Lcom/applovin/impl/a5;

    .line 206
    .line 207
    new-instance v0, Lcom/applovin/impl/a5;

    .line 208
    .line 209
    const-string v1, "IABTCF_AddtlConsent"

    .line 210
    .line 211
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 212
    .line 213
    .line 214
    sput-object v0, Lcom/applovin/impl/a5;->y:Lcom/applovin/impl/a5;

    .line 215
    .line 216
    new-instance v0, Lcom/applovin/impl/a5;

    .line 217
    .line 218
    const-string v1, "IABTCF_VendorConsents"

    .line 219
    .line 220
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 221
    .line 222
    .line 223
    sput-object v0, Lcom/applovin/impl/a5;->z:Lcom/applovin/impl/a5;

    .line 224
    .line 225
    new-instance v0, Lcom/applovin/impl/a5;

    .line 226
    .line 227
    const-string v1, "IABTCF_VendorLegitimateInterests"

    .line 228
    .line 229
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Lcom/applovin/impl/a5;->A:Lcom/applovin/impl/a5;

    .line 233
    .line 234
    new-instance v0, Lcom/applovin/impl/a5;

    .line 235
    .line 236
    const-string v1, "IABTCF_PurposeConsents"

    .line 237
    .line 238
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 239
    .line 240
    .line 241
    sput-object v0, Lcom/applovin/impl/a5;->B:Lcom/applovin/impl/a5;

    .line 242
    .line 243
    new-instance v0, Lcom/applovin/impl/a5;

    .line 244
    .line 245
    const-string v1, "IABTCF_PurposeLegitimateInterests"

    .line 246
    .line 247
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 248
    .line 249
    .line 250
    sput-object v0, Lcom/applovin/impl/a5;->C:Lcom/applovin/impl/a5;

    .line 251
    .line 252
    new-instance v0, Lcom/applovin/impl/a5;

    .line 253
    .line 254
    const-string v1, "IABTCF_SpecialFeaturesOptIns"

    .line 255
    .line 256
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 257
    .line 258
    .line 259
    sput-object v0, Lcom/applovin/impl/a5;->D:Lcom/applovin/impl/a5;

    .line 260
    .line 261
    new-instance v0, Lcom/applovin/impl/a5;

    .line 262
    .line 263
    const-string v1, "com.applovin.sdk.impl.ad.persistence.queue"

    .line 264
    .line 265
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 266
    .line 267
    .line 268
    sput-object v0, Lcom/applovin/impl/a5;->E:Lcom/applovin/impl/a5;

    .line 269
    .line 270
    new-instance v0, Lcom/applovin/impl/a5;

    .line 271
    .line 272
    const-string v1, "com.applovin.sdk.mediation.signal_providers"

    .line 273
    .line 274
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 275
    .line 276
    .line 277
    sput-object v0, Lcom/applovin/impl/a5;->F:Lcom/applovin/impl/a5;

    .line 278
    .line 279
    new-instance v0, Lcom/applovin/impl/a5;

    .line 280
    .line 281
    const-string v1, "com.applovin.sdk.mediation.auto_init_adapters"

    .line 282
    .line 283
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    sput-object v0, Lcom/applovin/impl/a5;->G:Lcom/applovin/impl/a5;

    .line 287
    .line 288
    new-instance v0, Lcom/applovin/impl/a5;

    .line 289
    .line 290
    const-string v1, "com.applovin.sdk.persisted_data"

    .line 291
    .line 292
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 293
    .line 294
    .line 295
    sput-object v0, Lcom/applovin/impl/a5;->H:Lcom/applovin/impl/a5;

    .line 296
    .line 297
    new-instance v0, Lcom/applovin/impl/a5;

    .line 298
    .line 299
    const-string v1, "com.applovin.sdk.mediation.test_mode_enabled"

    .line 300
    .line 301
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 302
    .line 303
    .line 304
    sput-object v0, Lcom/applovin/impl/a5;->I:Lcom/applovin/impl/a5;

    .line 305
    .line 306
    new-instance v0, Lcom/applovin/impl/a5;

    .line 307
    .line 308
    const-string v1, "com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula"

    .line 309
    .line 310
    invoke-direct {v0, v1, v3}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 311
    .line 312
    .line 313
    sput-object v0, Lcom/applovin/impl/a5;->J:Lcom/applovin/impl/a5;

    .line 314
    .line 315
    new-instance v0, Lcom/applovin/impl/a5;

    .line 316
    .line 317
    const-string v1, "com.applovin.sdk.mediation.stats_per_ad_unit_since_install"

    .line 318
    .line 319
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 320
    .line 321
    .line 322
    sput-object v0, Lcom/applovin/impl/a5;->K:Lcom/applovin/impl/a5;

    .line 323
    .line 324
    new-instance v0, Lcom/applovin/impl/a5;

    .line 325
    .line 326
    const-string v1, "com.applovin.sdk.mediation.stats_per_ad_format_since_install"

    .line 327
    .line 328
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 329
    .line 330
    .line 331
    sput-object v0, Lcom/applovin/impl/a5;->L:Lcom/applovin/impl/a5;

    .line 332
    .line 333
    new-instance v0, Lcom/applovin/impl/a5;

    .line 334
    .line 335
    const-string v1, "com.applovin.sdk.user_agent"

    .line 336
    .line 337
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 338
    .line 339
    .line 340
    sput-object v0, Lcom/applovin/impl/a5;->M:Lcom/applovin/impl/a5;

    .line 341
    .line 342
    new-instance v0, Lcom/applovin/impl/a5;

    .line 343
    .line 344
    const-string v1, "com.applovin.sdk.last_fullscreen_ad_timestamp_ms"

    .line 345
    .line 346
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 347
    .line 348
    .line 349
    sput-object v0, Lcom/applovin/impl/a5;->N:Lcom/applovin/impl/a5;

    .line 350
    .line 351
    new-instance v0, Lcom/applovin/impl/a5;

    .line 352
    .line 353
    const-string v1, "com.applovin.sdk.last_fullscreen_ad_duration_ms"

    .line 354
    .line 355
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 356
    .line 357
    .line 358
    sput-object v0, Lcom/applovin/impl/a5;->O:Lcom/applovin/impl/a5;

    .line 359
    .line 360
    new-instance v0, Lcom/applovin/impl/a5;

    .line 361
    .line 362
    const-string v1, "com.applovin.sdk.app_killed_urls_from_last_ad"

    .line 363
    .line 364
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 365
    .line 366
    .line 367
    sput-object v0, Lcom/applovin/impl/a5;->P:Lcom/applovin/impl/a5;

    .line 368
    .line 369
    new-instance v0, Lcom/applovin/impl/a5;

    .line 370
    .line 371
    const-string v1, "com.applovin.sdk.app_killed_last_ad_data"

    .line 372
    .line 373
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 374
    .line 375
    .line 376
    sput-object v0, Lcom/applovin/impl/a5;->Q:Lcom/applovin/impl/a5;

    .line 377
    .line 378
    new-instance v0, Lcom/applovin/impl/a5;

    .line 379
    .line 380
    const-string v1, "com.applovin.sdk.app_killed_last_mediated_ad_tracking_info"

    .line 381
    .line 382
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 383
    .line 384
    .line 385
    sput-object v0, Lcom/applovin/impl/a5;->R:Lcom/applovin/impl/a5;

    .line 386
    .line 387
    new-instance v0, Lcom/applovin/impl/a5;

    .line 388
    .line 389
    const-string v1, "com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms"

    .line 390
    .line 391
    invoke-direct {v0, v1, v4}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 392
    .line 393
    .line 394
    sput-object v0, Lcom/applovin/impl/a5;->S:Lcom/applovin/impl/a5;

    .line 395
    .line 396
    new-instance v0, Lcom/applovin/impl/a5;

    .line 397
    .line 398
    const-string v1, "com.applovin.sdk.template_browser_package_name"

    .line 399
    .line 400
    invoke-direct {v0, v1, v2}, Lcom/applovin/impl/a5;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 401
    .line 402
    .line 403
    sput-object v0, Lcom/applovin/impl/a5;->T:Lcom/applovin/impl/a5;

    .line 404
    .line 405
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/applovin/impl/a5;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/applovin/impl/a5;->b:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/a5;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/a5;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Key{name=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/applovin/impl/a5;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', type="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/applovin/impl/a5;->b:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x7d

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
