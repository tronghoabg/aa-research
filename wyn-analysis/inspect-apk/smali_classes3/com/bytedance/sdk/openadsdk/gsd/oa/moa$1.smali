.class final Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/gsd/oa/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qr()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ib()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->df()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    .line 24
    .line 25
    const-string v2, "show_urls"

    .line 26
    .line 27
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 28
    .line 29
    invoke-direct {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v0, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    :try_start_0
    const-string v3, "root_view"

    .line 58
    .line 59
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget v1, v1, Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;->uef:I

    .line 71
    .line 72
    const/4 v3, -0x1

    .line 73
    if-eq v1, v3, :cond_2

    .line 74
    .line 75
    const-string v5, "dynamic_show_type"

    .line 76
    .line 77
    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;

    .line 81
    .line 82
    iget v1, v1, Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;->oa:I

    .line 83
    .line 84
    if-eq v1, v3, :cond_3

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(I)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :catchall_0
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v5

    .line 96
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 97
    .line 98
    move-wide v7, v5

    .line 99
    move-object v5, v2

    .line 100
    move-wide v1, v7

    .line 101
    new-instance v6, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;

    .line 102
    .line 103
    invoke-direct {v6, p0, v0, v5}, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 104
    .line 105
    .line 106
    const-string v5, "mrc_show"

    .line 107
    .line 108
    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method
