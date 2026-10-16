.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "remoteConfigList",
        "Lef/C;",
        "onSuccess",
        "(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "onError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic $contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $includeEmptyContextKey:Z

.field final synthetic $localLoadingStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$localLoadingStates:Ljava/util/Map;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$includeEmptyContextKey:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 7
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_8

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getRemoteConfigList()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    invoke-static {v0, v1, p1, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->copy$default(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/Iterable;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move-object v5, v4

    .line 74
    check-cast v5, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 75
    .line 76
    move-object v6, v2

    .line 77
    check-cast v6, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v6, v5}, Lff/o;->k0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-static {v3}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-boolean v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$includeEmptyContextKey:Z

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v3, v2

    .line 126
    check-cast v3, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 127
    .line 128
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_5

    .line 143
    .line 144
    move-object v1, v2

    .line 145
    :cond_6
    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 146
    .line 147
    if-eqz v1, :cond_7

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_7
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    .line 153
    .line 154
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    move-object p1, v0

    .line 162
    :goto_1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 167
    .line 168
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 11
    .param p1    # Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$localLoadingStates:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 43
    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    new-instance v5, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 47
    .line 48
    const/4 v9, 0x7

    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-direct/range {v5 .. v10}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    move-object v4, v5

    .line 57
    :cond_0
    invoke-virtual {v4, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 65
    .line 66
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
