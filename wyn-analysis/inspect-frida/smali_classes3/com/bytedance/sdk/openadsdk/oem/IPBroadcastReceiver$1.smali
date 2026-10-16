.class Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

.field final synthetic uef:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->oa:Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 2
    .line 3
    const-string v2, "errorCode"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-gez v2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 13
    .line 14
    const-string v4, "reason"

    .line 15
    .line 16
    invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v4, -0x4

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    if-ne v0, v4, :cond_0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    move v6, v0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_4

    .line 32
    :cond_1
    move v6, v3

    .line 33
    :goto_0
    const/4 v0, 0x5

    .line 34
    if-ne v2, v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 37
    .line 38
    const-string v4, "status"

    .line 39
    .line 40
    invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    const/4 v4, -0x2

    .line 45
    if-ne v0, v4, :cond_2

    .line 46
    .line 47
    :try_start_1
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 48
    .line 49
    const-string v5, "progress"

    .line 50
    .line 51
    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    :try_start_2
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->oa:Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;I)I

    .line 60
    .line 61
    .line 62
    :goto_1
    const/16 v4, 0x64

    .line 63
    .line 64
    if-ge v3, v4, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    move v4, v0

    .line 68
    move v5, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v4, v3

    .line 71
    move v5, v4

    .line 72
    :goto_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->uef:Landroid/content/Intent;

    .line 73
    .line 74
    const-string v3, "packageName"

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->oa:Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    .line 81
    .line 82
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;)Lcom/bytedance/sdk/openadsdk/oem/uef;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-lez v2, :cond_4

    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-interface {v3, v0, v2}, Lcom/bytedance/sdk/openadsdk/oem/uef;->uef(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;->oa:Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    .line 94
    .line 95
    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    const-string v11, "ip_listener_log"

    .line 110
    .line 111
    new-instance v0, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1$1;

    .line 112
    .line 113
    move-object v1, p0

    .line 114
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver$1;ILcom/bytedance/sdk/openadsdk/core/model/gzw;III)V

    .line 115
    .line 116
    .line 117
    move-object v12, v0

    .line 118
    move-object v9, v3

    .line 119
    invoke-static/range {v7 .. v12}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    .line 122
    :cond_5
    :goto_3
    return-void

    .line 123
    :goto_4
    const-string v1, "IPMiBroadcastReceiver"

    .line 124
    .line 125
    const-string v2, "handleXiaomiInstallResult error "

    .line 126
    .line 127
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
