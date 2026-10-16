.class public final Lcom/google/android/gms/internal/ads/zzcsu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcsb;


# instance fields
.field private final zza:LM6/d;


# direct methods
.method public constructor <init>(LM6/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcsu;->zza:LM6/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza(Lorg/json/JSONObject;)V
    .locals 9

    .line 1
    const-string v0, "AvailableMemoryTier"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, -0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const-string v0, "AvailableMemoryTier"

    .line 13
    .line 14
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {}, LM6/b;->values()[LM6/b;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    array-length v5, v4

    .line 23
    move v6, v2

    .line 24
    :goto_0
    if-ge v6, v5, :cond_1

    .line 25
    .line 26
    aget-object v7, v4, v6

    .line 27
    .line 28
    iget v8, v7, LM6/b;->a:I

    .line 29
    .line 30
    if-ne v8, v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v7, v1

    .line 37
    :goto_1
    if-eqz v7, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcsu;->zza:LM6/d;

    .line 40
    .line 41
    iget-object v0, v0, LM6/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const-string v0, "AvailableProcessorTier"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    const-string v0, "AvailableProcessorTier"

    .line 55
    .line 56
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {}, LM6/c;->values()[LM6/c;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    array-length v5, v4

    .line 65
    move v6, v2

    .line 66
    :goto_2
    if-ge v6, v5, :cond_4

    .line 67
    .line 68
    aget-object v7, v4, v6

    .line 69
    .line 70
    iget v8, v7, LM6/c;->a:I

    .line 71
    .line 72
    if-ne v8, v0, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object v7, v1

    .line 79
    :goto_3
    if-eqz v7, :cond_5

    .line 80
    .line 81
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcsu;->zza:LM6/d;

    .line 82
    .line 83
    iget-object v0, v0, LM6/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 84
    .line 85
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    const-string v0, "AdvertisedMemoryTier"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    const-string v0, "AdvertisedMemoryTier"

    .line 97
    .line 98
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-static {}, LM6/a;->values()[LM6/a;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    array-length v3, v0

    .line 107
    move v4, v2

    .line 108
    :goto_4
    if-ge v4, v3, :cond_7

    .line 109
    .line 110
    aget-object v5, v0, v4

    .line 111
    .line 112
    iget v6, v5, LM6/a;->a:I

    .line 113
    .line 114
    if-ne v6, p1, :cond_6

    .line 115
    .line 116
    move-object v1, v5

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 122
    .line 123
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcsu;->zza:LM6/d;

    .line 124
    .line 125
    monitor-enter p1

    .line 126
    :try_start_0
    iget-object v0, p1, LM6/d;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p1, LM6/d;->a:Landroid/content/Context;

    .line 132
    .line 133
    const-string v3, "admob"

    .line 134
    .line 135
    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v2, "advertised_memory_tier"

    .line 144
    .line 145
    iget v1, v1, LM6/a;->a:I

    .line 146
    .line 147
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    monitor-exit p1

    .line 155
    return-void

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    throw v0

    .line 159
    :cond_8
    return-void
.end method
