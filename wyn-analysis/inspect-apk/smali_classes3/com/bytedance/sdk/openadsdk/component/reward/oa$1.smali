.class final Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:Z

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->oa:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->yo:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tpq()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_7

    .line 32
    .line 33
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->yo()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->oa:Z

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/sy;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/sy;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 52
    .line 53
    invoke-virtual {v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/xs;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/xs;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 66
    .line 67
    invoke-virtual {v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->oa:Z

    .line 72
    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 84
    .line 85
    invoke-virtual {v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/ivm;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/ivm;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 98
    .line 99
    invoke-virtual {v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/ivm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->yo:Z

    .line 103
    .line 104
    if-eqz v3, :cond_7

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->oa:Z

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/sy;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/sy;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/xs;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/xs;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_5
    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa$1;->oa:Z

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/ivm;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/ivm;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/ivm;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    :catchall_0
    :cond_7
    :goto_1
    return-void
.end method
