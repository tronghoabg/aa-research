.class public Lcom/bytedance/sdk/openadsdk/moa/bcc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static lw:Z = false

.field private static moa:Ljava/lang/reflect/Method;

.field private static oa:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static uef:Ljava/lang/reflect/Method;

.field private static yo:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/bcc;->oa()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static oa()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    sget-boolean v2, Lcom/bytedance/sdk/openadsdk/moa/bcc;->lw:Z

    .line 4
    .line 5
    if-nez v2, :cond_1

    .line 6
    .line 7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v3, 0x23

    .line 10
    .line 11
    if-lt v2, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/bcc;->yo()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    const-class v3, Landroid/app/ActivityManager;

    .line 20
    .line 21
    const-string v4, "getHistoricalProcessStartReasons"

    .line 22
    .line 23
    new-array v5, v0, [Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    aput-object v6, v5, v1

    .line 28
    .line 29
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    sput-object v3, Lcom/bytedance/sdk/openadsdk/moa/bcc;->uef:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    const-string v3, "android.app.ApplicationStartInfo"

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sput-object v3, Lcom/bytedance/sdk/openadsdk/moa/bcc;->oa:Ljava/lang/Class;

    .line 42
    .line 43
    const-string v4, "getReason"

    .line 44
    .line 45
    new-array v5, v1, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sput-object v3, Lcom/bytedance/sdk/openadsdk/moa/bcc;->moa:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    const/16 v3, 0x24

    .line 54
    .line 55
    if-lt v2, v3, :cond_0

    .line 56
    .line 57
    sget-object v2, Lcom/bytedance/sdk/openadsdk/moa/bcc;->oa:Ljava/lang/Class;

    .line 58
    .line 59
    const-string v3, "getStartComponent"

    .line 60
    .line 61
    new-array v4, v1, [Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sput-object v2, Lcom/bytedance/sdk/openadsdk/moa/bcc;->yo:Ljava/lang/reflect/Method;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/moa/bcc;->lw:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    return-void

    .line 75
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-array v1, v1, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

.method public static uef()Lorg/json/JSONObject;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v3, 0x23

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    if-lt v2, v3, :cond_2

    .line 9
    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/bcc;->yo()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/bcc;->oa()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-class v5, Landroid/app/ActivityManager;

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Landroid/app/ActivityManager;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    sget-object v5, Lcom/bytedance/sdk/openadsdk/moa/bcc;->uef:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    new-array v0, v0, [Ljava/lang/Object;

    .line 47
    .line 48
    aput-object v6, v0, v1

    .line 49
    .line 50
    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/List;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_1

    .line 63
    .line 64
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/16 v4, 0x24

    .line 69
    .line 70
    if-lt v2, v4, :cond_0

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    sget-object v2, Lcom/bytedance/sdk/openadsdk/moa/bcc;->yo:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    new-array v4, v1, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const-string v4, "start_component"

    .line 91
    .line 92
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object v4, v3

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 100
    .line 101
    sget-object v2, Lcom/bytedance/sdk/openadsdk/moa/bcc;->moa:Ljava/lang/reflect/Method;

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    new-array v4, v1, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const-string v2, "start_reason"

    .line 118
    .line 119
    invoke-virtual {v3, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    :cond_1
    return-object v3

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-array v1, v1, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    return-object v4
.end method

.method private static yo()Z
    .locals 3

    .line 1
    const-string v0, "s_i_e"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    return v1
.end method
