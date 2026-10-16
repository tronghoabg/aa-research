.class public Lcom/bytedance/sdk/openadsdk/utils/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile lw:Lcom/bytedance/sdk/component/xs/yo/lw;

.field private static moa:Ljava/lang/Boolean;

.field private static oa:Ljava/lang/Boolean;

.field public static uef:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ">;"
        }
    .end annotation
.end field

.field private static yo:Ljava/lang/Boolean;


# direct methods
.method public static lw()Lcom/bytedance/sdk/component/xs/yo/lw;
    .locals 5

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->lw:Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->lw:Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bytedance/sdk/component/xs/yo/lw;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    const-string v1, "net_multi_domain_config"

    .line 14
    .line 15
    sget-object v2, Lcom/bytedance/sdk/openadsdk/gzw/oa;->uef:Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v1, v3, v2}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lorg/json/JSONObject;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const-string v2, "enable"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-ne v2, v4, :cond_1

    .line 35
    .line 36
    move v3, v4

    .line 37
    :cond_1
    iput-boolean v3, v0, Lcom/bytedance/sdk/component/xs/yo/lw;->uef:Z

    .line 38
    .line 39
    const-string v2, "fail_count"

    .line 40
    .line 41
    const/16 v3, 0xa

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iput v2, v0, Lcom/bytedance/sdk/component/xs/yo/lw;->oa:I

    .line 48
    .line 49
    const-string v2, "interval"

    .line 50
    .line 51
    const-wide/32 v3, 0x1b7740

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    iput-wide v1, v0, Lcom/bytedance/sdk/component/xs/yo/lw;->yo:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->lw:Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 66
    .line 67
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->lw:Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 68
    .line 69
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->lw:Lcom/bytedance/sdk/component/xs/yo/lw;

    .line 73
    .line 74
    return-object v0
.end method

.method public static moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef:Ljava/lang/ref/SoftReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public static oa()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->yo:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    const-string v1, "net_opt_multiple_domain_retry"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v0

    .line 17
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->yo:Ljava/lang/Boolean;

    .line 22
    .line 23
    :cond_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->yo:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :catchall_0
    return v0
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method public static uef()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->oa:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 2
    :try_start_0
    const-string v0, "stability_sinking"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->oa:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 3
    :catchall_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->oa:Ljava/lang/Boolean;

    .line 4
    :cond_1
    :goto_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/oa;->oa:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static yo()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->moa:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    const-string v1, "iv_rv_load_show_new"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v0

    .line 17
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->moa:Ljava/lang/Boolean;

    .line 22
    .line 23
    :cond_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/oa;->moa:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :catchall_0
    return v0
.end method
