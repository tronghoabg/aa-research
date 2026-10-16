.class public Lcom/bytedance/sdk/openadsdk/core/settings/bcc;
.super Lcom/bytedance/sdk/openadsdk/core/settings/zjm;
.source "SourceFile"


# static fields
.field static final moa:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private lw:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public yo:Z


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v18, "pl"

    .line 4
    .line 5
    const-string v19, "tr"

    .line 6
    .line 7
    const-string v1, "ja"

    .line 8
    .line 9
    const-string v2, "en"

    .line 10
    .line 11
    const-string v3, "ko"

    .line 12
    .line 13
    const-string v4, "zh"

    .line 14
    .line 15
    const-string v5, "th"

    .line 16
    .line 17
    const-string v6, "vi"

    .line 18
    .line 19
    const-string v7, "id"

    .line 20
    .line 21
    const-string v8, "ru"

    .line 22
    .line 23
    const-string v9, "ar"

    .line 24
    .line 25
    const-string v10, "fr"

    .line 26
    .line 27
    const-string v11, "de"

    .line 28
    .line 29
    const-string v12, "it"

    .line 30
    .line 31
    const-string v13, "es"

    .line 32
    .line 33
    const-string v14, "hi"

    .line 34
    .line 35
    const-string v15, "pt"

    .line 36
    .line 37
    const-string v16, "zh-Hant"

    .line 38
    .line 39
    const-string v17, "ms"

    .line 40
    .line 41
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->moa:Ljava/util/ArrayList;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/settings/zjm$uef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/settings/zjm;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/zjm$uef;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->lw:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method

.method public static uef(Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 302
    :try_start_0
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0

    .line 303
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 304
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 305
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 306
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    return-object v0

    .line 307
    :catchall_0
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "tt_sdk_settings_sr_"

    .line 2
    const-string v1, ".prop"

    .line 3
    :try_start_0
    const-string v2, "tt_sdk_settings_sr.prop"

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/bytedance/sdk/component/utils/tpx;->uef(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/tpx;->yo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :cond_0
    return-object v2

    .line 6
    :catchall_0
    const-string v0, "tt_sdk_settings_sr"

    return-object v0
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 7
    const-string v3, "bus_con_adshow_check_enable"

    const-string v4, "bus_con_sec_type"

    const-string v5, "bus_con"

    const-string v6, "allow_blind_mode_request_ad"

    const-string v7, "splash_video_load_strategy"

    const-string v8, "video_cache_config"

    const-string v10, "read_video_from_cache"

    const-string v0, "gecko_hosts"

    const-string v11, "ad_revenue_enable"

    const-string v12, "support_rtl"

    const-string v13, "aes_key"

    const-string v14, "support_gzip"

    const-string v15, "fetch_tpl_second"

    const-string v9, "fetch_tpl_timeout_ctrl"

    move-object/from16 v16, v3

    const-string v3, "force_language"

    move-object/from16 v17, v4

    const-string v4, "target_region"

    move-object/from16 v18, v5

    const-string v5, "max_tpl_cnts"

    move-object/from16 v19, v6

    const-string v6, "insert_js_config"

    move-object/from16 v20, v7

    const-string v7, "support_tnc"

    move-object/from16 v21, v8

    const-string v8, "if_both_open"

    move-object/from16 v22, v10

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    move-result-object v10

    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->ivm()Lorg/json/JSONObject;

    move-result-object v23

    move-object/from16 v24, v0

    .line 9
    const-string v0, "digest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v25

    move-object/from16 v26, v11

    if-eqz v25, :cond_0

    if-eqz v23, :cond_0

    .line 10
    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v28, v12

    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v28, v12

    :cond_1
    const/4 v11, 0x0

    :goto_0
    iput-boolean v11, v1, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->yo:Z

    if-eqz v25, :cond_2

    .line 11
    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_1

    .line 12
    :cond_2
    invoke-interface {v10, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 13
    :goto_1
    const-string v0, "data_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v11

    const-string v0, "data_time"

    invoke-interface {v10, v0, v11, v12}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 14
    const-string v0, "req_inter_min"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    const-wide/16 v11, 0xa

    .line 15
    invoke-virtual {v2, v0, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v11

    const-wide/32 v29, 0xea60

    mul-long v11, v11, v29

    const-wide/16 v29, 0x0

    cmp-long v23, v11, v29

    if-ltz v23, :cond_3

    const-wide/32 v29, 0x5265c00

    cmp-long v23, v11, v29

    if-lez v23, :cond_4

    :cond_3
    const-wide/32 v11, 0x927c0

    .line 16
    :cond_4
    invoke-interface {v10, v0, v11, v12}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 17
    :cond_5
    const-string v0, "lp_new_style"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const v11, 0x7fffffff

    if-eqz v0, :cond_6

    .line 18
    const-string v0, "lp_new_style"

    invoke-virtual {v2, v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 19
    const-string v12, "landingpage_new_style"

    invoke-interface {v10, v12, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 20
    :cond_6
    const-string v0, "blank_detect_rate"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x1e

    .line 21
    invoke-virtual {v2, v0, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    if-ltz v12, :cond_7

    const/16 v11, 0x64

    if-le v12, v11, :cond_8

    :cond_7
    const/16 v12, 0x1e

    .line 22
    :cond_8
    invoke-interface {v10, v0, v12}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 23
    :cond_9
    const-string v0, "feq_policy"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 24
    const-string v11, "duration"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 25
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v29

    const-wide/16 v31, 0x3e8

    move-object/from16 v25, v13

    mul-long v12, v29, v31

    .line 26
    invoke-interface {v10, v11, v12, v13}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_2

    :cond_a
    move-object/from16 v25, v13

    .line 27
    :goto_2
    const-string v11, "max"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 28
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 29
    invoke-interface {v10, v11, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_3

    :cond_b
    move-object/from16 v25, v13

    .line 30
    :cond_c
    :goto_3
    const-string v0, "vbtt"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/4 v11, 0x5

    .line 31
    invoke-virtual {v2, v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    .line 32
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 33
    :cond_d
    const-string v0, "abtest"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 34
    const-string v11, "version"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 35
    const-string v11, "version"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 36
    const-string v12, "ab_test_version"

    invoke-interface {v10, v12, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 37
    :cond_e
    const-string v11, "param"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 38
    const-string v11, "param"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    const-string v11, "ab_test_param"

    invoke-interface {v10, v11, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_4

    .line 40
    :cond_f
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->bcc()V

    .line 41
    :cond_10
    :goto_4
    const-string v0, "log_rate_conf"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 42
    const-string v11, "global_rate"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_11

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 43
    invoke-virtual {v0, v11, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v12

    double-to-float v0, v12

    .line 44
    invoke-interface {v10, v11, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;F)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 45
    :cond_11
    const-string v0, "pyload_h5"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 46
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 47
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 48
    :cond_12
    const-string v0, "pure_pyload_h5"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 49
    const-string v0, "pure_pyload_h5"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    const-string v11, "playableLoadH5Url"

    invoke-interface {v10, v11, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 51
    :cond_13
    const-string v0, "ads_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_14

    .line 52
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 53
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 54
    :cond_14
    const-string v0, "settings_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_15

    .line 55
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 56
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 57
    :cond_15
    const-string v0, "app_log_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_16

    .line 58
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 59
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 60
    :cond_16
    const-string v0, "privacy_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 61
    const-string v0, "privacy_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    const-string v11, "policy_url"

    invoke-interface {v10, v11, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 63
    :cond_17
    const-string v0, "consent_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_18

    .line 64
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 65
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 66
    :cond_18
    const-string v0, "ivrv_downward"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_19

    const/4 v11, 0x0

    .line 67
    invoke-virtual {v2, v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    .line 68
    invoke-interface {v10, v0, v12}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 69
    :cond_19
    const-string v0, "dc"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1a

    .line 70
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 71
    invoke-interface {v10, v0, v11}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 72
    :cond_1a
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-virtual {v0, v2, v10}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;)V

    .line 73
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v11, 0x0

    .line 74
    invoke-virtual {v2, v8, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 75
    invoke-interface {v10, v8, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 76
    :cond_1b
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v8, 0x1

    .line 77
    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 78
    invoke-interface {v10, v7, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 79
    :cond_1c
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const-string v7, ""

    if-eqz v0, :cond_1d

    .line 80
    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-interface {v10, v6, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 82
    :cond_1d
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const/16 v0, 0x64

    .line 83
    invoke-virtual {v2, v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 84
    invoke-interface {v10, v5, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 85
    :cond_1e
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 86
    invoke-virtual {v2, v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-interface {v10, v4, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 88
    :cond_1f
    const-string v0, "app_common_config"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_28

    .line 89
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 90
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_20

    sget-object v5, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->moa:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 92
    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 93
    :cond_20
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/16 v0, 0xbb8

    .line 94
    invoke-virtual {v4, v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 95
    invoke-interface {v10, v9, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 96
    :cond_21
    invoke-virtual {v4, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v11, 0x0

    if-eqz v0, :cond_22

    .line 97
    invoke-virtual {v4, v15, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 98
    invoke-interface {v10, v15, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 99
    :cond_22
    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 100
    invoke-virtual {v4, v14, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 101
    invoke-interface {v10, v14, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_23
    move-object/from16 v0, v25

    .line 102
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 103
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 104
    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_24
    move-object/from16 v0, v28

    .line 105
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_25

    const/4 v11, 0x0

    .line 106
    invoke-virtual {v4, v0, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 107
    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_25
    move-object/from16 v0, v26

    .line 108
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_26

    const/4 v8, 0x1

    .line 109
    invoke-virtual {v4, v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 110
    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_26
    move-object/from16 v0, v24

    .line 111
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 112
    :try_start_0
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->lw:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 113
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_27

    .line 114
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-eqz v5, :cond_27

    const/4 v5, 0x0

    .line 115
    :goto_5
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_27

    .line 116
    iget-object v6, v1, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->lw:Ljava/util/Set;

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v27, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_7

    .line 117
    :cond_27
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->lw:Ljava/util/Set;

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->uef(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v5

    iput-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/settings/bcc;->lw:Ljava/util/Set;

    .line 118
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_28
    :goto_6
    move-object/from16 v3, v22

    goto :goto_8

    .line 119
    :goto_7
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "GeckoLog: settings json error "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    new-array v3, v11, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    .line 120
    :goto_8
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    const/4 v8, 0x1

    .line 121
    invoke-virtual {v2, v3, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 122
    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 123
    :cond_29
    const-string v0, "ad_slot_conf_list"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 124
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/yo;->uef(Lorg/json/JSONArray;)V

    .line 125
    const-string v0, "privacy"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_34

    .line 126
    const-string v3, "ad_enable"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 127
    const-string v3, "ad_enable"

    const v5, 0x7fffffff

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 128
    const-string v6, "privacy_ad_enable"

    invoke-interface {v10, v6, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_9

    :cond_2a
    const v5, 0x7fffffff

    .line 129
    :goto_9
    const-string v3, "personalized_ad"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 130
    const-string v3, "personalized_ad"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 131
    const-string v6, "privacy_personalized_ad"

    invoke-interface {v10, v6, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 132
    :cond_2b
    const-string v3, "sladar_enable"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2c

    .line 133
    const-string v3, "sladar_enable"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 134
    const-string v6, "privacy_sladar_enable"

    invoke-interface {v10, v6, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 135
    :cond_2c
    const-string v3, "app_log_enable"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 136
    const-string v3, "app_log_enable"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 137
    const-string v6, "privacy_app_log_enable"

    invoke-interface {v10, v6, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 138
    :cond_2d
    const-string v3, "debug_unlock"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 139
    const-string v3, "debug_unlock"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    .line 140
    const-string v5, "privacy_debug_unlock"

    invoke-interface {v10, v5, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 141
    :cond_2e
    const-string v3, "fields_allowed"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_30

    .line 142
    const-string v3, "fields_allowed"

    invoke-virtual {v0, v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 143
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2f

    .line 144
    const-string v5, "privacy_fields_allowed"

    invoke-interface {v10, v5, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_a

    .line 145
    :cond_2f
    const-string v3, "privacy_fields_allowed"

    invoke-interface {v10, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 146
    :cond_30
    :goto_a
    const-string v3, "app_reg"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_34

    .line 147
    const-string v3, "app_reg"

    const/4 v5, -0x1

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_31

    .line 148
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dxx;->uef()Lcom/bytedance/sdk/openadsdk/core/fz;

    move-result-object v3

    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/core/fz;->moa()I

    move-result v3

    const/4 v8, 0x1

    if-ne v3, v8, :cond_32

    const-string v3, "app_register_alert_enable"

    const/4 v11, 0x0

    invoke-static {v3, v11}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_32

    .line 149
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/settings/bcc$1;

    invoke-direct {v3, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/bcc$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/bcc;)V

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    goto :goto_b

    :cond_31
    const/4 v8, 0x1

    :cond_32
    :goto_b
    if-ne v0, v8, :cond_33

    const/4 v3, 0x1

    goto :goto_c

    :cond_33
    const/4 v3, 0x0

    .line 150
    :goto_c
    const-string v5, "privacy_app_reg"

    invoke-interface {v10, v5, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 151
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef(I)V

    :cond_34
    move-object/from16 v3, v21

    .line 152
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 153
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 154
    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 155
    :cond_35
    const-string v0, "loaded_recall_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_37

    .line 156
    const-string v0, "loaded_recall_time"

    const/4 v11, 0x0

    invoke-virtual {v2, v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_36

    const/4 v8, 0x1

    if-eq v0, v8, :cond_36

    const/4 v0, 0x0

    .line 157
    :cond_36
    const-string v3, "loadedCallbackOpportunity"

    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_37
    move-object/from16 v3, v20

    .line 158
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3a

    const/4 v11, 0x0

    .line 159
    invoke-virtual {v2, v3, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_38

    const/4 v5, 0x3

    if-le v0, v5, :cond_39

    :cond_38
    const/4 v0, 0x0

    .line 160
    :cond_39
    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 161
    :cond_3a
    const-string v0, "user_compliance_status"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 162
    const-string v0, "user_compliance_status"

    const/4 v5, -0x1

    invoke-virtual {v2, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 163
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->oa(I)V

    .line 164
    :cond_3b
    const-string v0, "user_compliance_status_reason"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 165
    const-string v0, "user_compliance_status_reason"

    invoke-virtual {v2, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef(Ljava/lang/String;)V

    .line 167
    :cond_3c
    const-string v0, "allow_req_time"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 168
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-string v0, "allow_req_time"

    invoke-virtual {v2, v0, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v5

    .line 169
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef(J)V

    :cond_3d
    move-object/from16 v3, v19

    .line 170
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3e

    const/4 v11, 0x0

    .line 171
    invoke-virtual {v2, v3, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 172
    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_3e
    move-object/from16 v3, v18

    .line 173
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4c

    move-object/from16 v5, v17

    .line 174
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3f

    const v6, 0x7fffffff

    .line 175
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 176
    invoke-interface {v10, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    :cond_3f
    move-object/from16 v5, v16

    .line 177
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_40

    const/4 v8, 0x1

    .line 178
    invoke-virtual {v0, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 179
    invoke-interface {v10, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 180
    :cond_40
    const-string v5, "bus_con_token_thread_count"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_41

    .line 181
    const-string v5, "bus_con_token_thread_count"

    const/4 v6, 0x4

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 182
    const-string v6, "bus_con_token_thread_count"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 183
    :cond_41
    const-string v5, "bus_con_video_keep_screen_on"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_42

    .line 184
    const-string v5, "bus_con_video_keep_screen_on"

    const/4 v8, 0x1

    invoke-virtual {v0, v5, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 185
    const-string v6, "bus_con_video_keep_screen_on"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 186
    :cond_42
    const-string v5, "bus_con_auto_click_delay"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_43

    .line 187
    const-string v5, "bus_con_auto_click_delay"

    const/16 v6, 0xbb8

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 188
    const-string v6, "bus_con_auto_click_delay"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 189
    :cond_43
    const-string v5, "bus_con_express_host"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_44

    .line 190
    const-string v5, "bus_con_express_host"

    const-string v6, "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 191
    const-string v6, "bus_con_express_host"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 192
    :cond_44
    const-string v5, "bus_con_check_clz"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_45

    .line 193
    const-string v5, "bus_con_check_clz"

    invoke-virtual {v0, v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 194
    const-string v6, "bus_con_check_clz"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 195
    :cond_45
    const-string v5, "bus_con_url_check"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_46

    .line 196
    const-string v5, "bus_con_url_check"

    const/4 v8, 0x1

    invoke-virtual {v0, v5, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 197
    const-string v6, "bus_con_url_check"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 198
    :cond_46
    const-string v5, "bus_con_behavior_count"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_47

    .line 199
    const-string v5, "bus_con_behavior_count"

    const/16 v6, 0x12c

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 200
    const-string v6, "bus_con_behavior_count"

    invoke-interface {v10, v6, v5}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 201
    :cond_47
    sget-object v5, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_48

    const/4 v11, 0x0

    .line 202
    invoke-virtual {v0, v5, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 203
    invoke-interface {v10, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Z)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 204
    :cond_48
    sget-object v5, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_49

    const/16 v6, 0x2710

    .line 205
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 206
    invoke-interface {v10, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 207
    :cond_49
    sget-object v5, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->yo:Ljava/lang/String;

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4a

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 208
    invoke-virtual {v0, v5, v8, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v8

    double-to-float v6, v8

    .line 209
    invoke-interface {v10, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;F)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 210
    :cond_4a
    const-string v5, "bus_con_slide_num"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4c

    .line 211
    const-string v5, "bus_con_slide_num"

    const/4 v6, 0x2

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-gtz v0, :cond_4b

    const/4 v0, 0x2

    .line 212
    :cond_4b
    const-string v5, "bus_con_slide_num"

    invoke-interface {v10, v5, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 213
    :cond_4c
    const-string v5, "perf_con"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5e

    .line 214
    :try_start_1
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_5e

    .line 215
    const-string v6, "perf_con_applog_send"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4d

    .line 216
    const-string v6, "perf_con_applog_send"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 217
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4d

    .line 218
    const-string v8, "perf_con_applog_send"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_d

    :catchall_1
    move-exception v0

    goto/16 :goto_e

    .line 219
    :cond_4d
    :goto_d
    const-string v6, "perf_con_apm_native"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4e

    .line 220
    const-string v6, "perf_con_apm_native"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 221
    const-string v8, "perf_con_apm_native"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 222
    :cond_4e
    const-string v6, "perf_con_webview_preload_cache"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4f

    .line 223
    const-string v6, "perf_con_webview_preload_cache"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 224
    const-string v8, "perf_con_webview_preload_cache"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 225
    :cond_4f
    const-string v6, "perf_con_webview_preload_cache_v3"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_50

    .line 226
    const-string v6, "perf_con_webview_preload_cache_v3"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 227
    const-string v8, "perf_con_webview_preload_cache_v3"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 228
    :cond_50
    const-string v6, "perf_con_webview_cache_count"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_51

    .line 229
    const-string v6, "perf_con_webview_cache_count"

    const/4 v11, 0x0

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 230
    const-string v8, "perf_con_webview_cache_count"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 231
    :cond_51
    const-string v6, "perf_con_webview_cache_count_v3"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_52

    .line 232
    const-string v6, "perf_con_webview_cache_count_v3"

    const/4 v11, 0x0

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 233
    const-string v8, "perf_con_webview_cache_count_v3"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 234
    :cond_52
    const-string v6, "perf_con_thread_stack_size"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_53

    .line 235
    const-string v6, "perf_con_thread_stack_size"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    const/high16 v8, -0x80000

    if-lt v6, v8, :cond_53

    if-gtz v6, :cond_53

    .line 236
    const-string v8, "perf_con_thread_stack_size"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 237
    :cond_53
    const-string v6, "perf_con_thread_pool_config"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_54

    .line 238
    const-string v6, "perf_con_thread_pool_config"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 239
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_54

    .line 240
    const-string v8, "perf_con_thread_pool_config"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 241
    :cond_54
    const-string v6, "perf_con_is_new_net_thread"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_55

    .line 242
    const-string v6, "perf_con_is_new_net_thread"

    const/4 v11, 0x0

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 243
    const-string v8, "perf_con_is_new_net_thread"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 244
    :cond_55
    const-string v6, "perf_con_adlog_expire_time"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_56

    .line 245
    const-string v6, "perf_con_adlog_expire_time"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 246
    const-string v6, "perf_con_adlog_expire_time"

    invoke-interface {v10, v6, v8, v9}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 247
    :cond_56
    const-string v6, "perf_con_adlog_turn_off_retry_ad"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_57

    .line 248
    const-string v6, "perf_con_adlog_turn_off_retry_ad"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 249
    const-string v6, "perf_con_adlog_turn_off_retry_ad"

    invoke-interface {v10, v6, v8, v9}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 250
    :cond_57
    const-string v6, "perf_con_adlog_turn_off_retry_stats"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_58

    .line 251
    const-string v6, "perf_con_adlog_turn_off_retry_stats"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 252
    const-string v6, "perf_con_adlog_turn_off_retry_stats"

    invoke-interface {v10, v6, v8, v9}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;J)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 253
    :cond_58
    const-string v6, "perf_con_applog_rate"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_59

    .line 254
    const-string v6, "perf_con_applog_rate"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 255
    const-string v8, "perf_con_applog_rate"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 256
    :cond_59
    const-string v6, "perf_con_track_url_strategy"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5a

    .line 257
    const-string v6, "perf_con_track_url_strategy"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 258
    const-string v8, "perf_con_track_url_strategy"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 259
    :cond_5a
    const-string v6, "perf_con_drawable_code"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5b

    .line 260
    const-string v6, "perf_con_drawable_code"

    const/4 v11, 0x0

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 261
    const-string v8, "perf_con_drawable_code"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 262
    :cond_5b
    const-string v6, "perf_con_close_button_delay_check_time"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5c

    .line 263
    const-string v6, "perf_con_close_button_delay_check_time"

    const/4 v8, -0x1

    invoke-virtual {v0, v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 264
    const-string v8, "perf_con_close_button_delay_check_time"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 265
    :cond_5c
    const-string v6, "perf_con_drop2rt_skip_label_list"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5d

    .line 266
    const-string v6, "perf_con_drop2rt_skip_label_list"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 267
    const-string v8, "perf_con_drop2rt_skip_label_list"

    invoke-interface {v10, v8, v6}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 268
    :cond_5d
    const-string v6, "perf_con_sync_gaid"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5e

    .line 269
    const-string v6, "perf_con_sync_gaid"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 270
    const-string v6, "perf_con_sync_gaid"

    invoke-interface {v10, v6, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_f

    .line 271
    :goto_e
    const-string v6, "SettingsDefaultRepository"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    :cond_5e
    :goto_f
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 273
    :try_start_2
    const-string v0, "app_common_config"

    invoke-virtual {v6, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 274
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v6, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 275
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v6, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_10

    :catch_0
    move-exception v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "coreSettingJson"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v27, 0x1

    aput-object v0, v3, v27

    const-string v0, "SettingsDefaultRepository"

    invoke-static {v0, v3}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    :goto_10
    const-string v0, "core_settings"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 278
    const-string v0, "dual_event_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5f

    .line 279
    const-string v0, "dual_event_url"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 280
    const-string v3, "dual_event_url"

    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 281
    :cond_5f
    const-string v0, "token_enable"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_60

    .line 282
    const-string v0, "token_enable"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 283
    const-string v3, "token_enable"

    invoke-interface {v10, v3, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;I)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 284
    :cond_60
    const-string v0, "token_adx_ids"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_62

    .line 285
    invoke-virtual {v2, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 286
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_61

    .line 287
    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_11

    .line 288
    :cond_61
    invoke-interface {v10, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 289
    :cond_62
    :goto_11
    const-string v0, "ads_url_backup"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_64

    .line 290
    invoke-virtual {v2, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 291
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_63

    .line 292
    invoke-interface {v10, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_12

    .line 293
    :cond_63
    invoke-interface {v10, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 294
    :cond_64
    :goto_12
    const-string v0, "dual_event_url_backup"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_66

    .line 295
    invoke-virtual {v2, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 296
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_65

    .line 297
    invoke-interface {v10, v0, v2}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    goto :goto_13

    .line 298
    :cond_65
    invoke-interface {v10, v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;

    .line 299
    :cond_66
    :goto_13
    invoke-interface {v10}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;->uef()V

    .line 300
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->pu()V

    .line 301
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/zjm;->lw()V

    return-void
.end method
