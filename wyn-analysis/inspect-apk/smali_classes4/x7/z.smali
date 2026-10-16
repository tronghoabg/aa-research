.class public abstract Lx7/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/d;

.field public static final b:Ld7/d;

.field public static final c:Ld7/d;

.field public static final d:Ld7/d;

.field public static final e:Ld7/d;

.field public static final f:Ld7/d;

.field public static final g:Ld7/d;

.field public static final h:Ld7/d;

.field public static final i:[Ld7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Ld7/d;

    .line 2
    .line 3
    const-string v1, "name_ulr_private"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ld7/d;

    .line 11
    .line 12
    const-string v4, "name_sleep_segment_request"

    .line 13
    .line 14
    invoke-direct {v1, v4, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lx7/z;->a:Ld7/d;

    .line 18
    .line 19
    new-instance v4, Ld7/d;

    .line 20
    .line 21
    const-string v5, "get_last_activity_feature_id"

    .line 22
    .line 23
    invoke-direct {v4, v5, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Ld7/d;

    .line 27
    .line 28
    const-string v6, "support_context_feature_id"

    .line 29
    .line 30
    invoke-direct {v5, v6, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Ld7/d;

    .line 34
    .line 35
    const-string v7, "get_current_location"

    .line 36
    .line 37
    const-wide/16 v8, 0x2

    .line 38
    .line 39
    invoke-direct {v6, v7, v8, v9}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    sput-object v6, Lx7/z;->b:Ld7/d;

    .line 43
    .line 44
    new-instance v7, Ld7/d;

    .line 45
    .line 46
    const-string v8, "get_last_location_with_request"

    .line 47
    .line 48
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    sput-object v7, Lx7/z;->c:Ld7/d;

    .line 52
    .line 53
    new-instance v8, Ld7/d;

    .line 54
    .line 55
    const-string v9, "set_mock_mode_with_callback"

    .line 56
    .line 57
    invoke-direct {v8, v9, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 58
    .line 59
    .line 60
    sput-object v8, Lx7/z;->d:Ld7/d;

    .line 61
    .line 62
    new-instance v9, Ld7/d;

    .line 63
    .line 64
    const-string v10, "set_mock_location_with_callback"

    .line 65
    .line 66
    invoke-direct {v9, v10, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 67
    .line 68
    .line 69
    sput-object v9, Lx7/z;->e:Ld7/d;

    .line 70
    .line 71
    new-instance v10, Ld7/d;

    .line 72
    .line 73
    const-string v11, "inject_location_with_callback"

    .line 74
    .line 75
    invoke-direct {v10, v11, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 76
    .line 77
    .line 78
    new-instance v11, Ld7/d;

    .line 79
    .line 80
    const-string v12, "location_updates_with_callback"

    .line 81
    .line 82
    invoke-direct {v11, v12, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 83
    .line 84
    .line 85
    sput-object v11, Lx7/z;->f:Ld7/d;

    .line 86
    .line 87
    new-instance v12, Ld7/d;

    .line 88
    .line 89
    const-string v13, "use_safe_parcelable_in_intents"

    .line 90
    .line 91
    invoke-direct {v12, v13, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    new-instance v13, Ld7/d;

    .line 95
    .line 96
    const-string v14, "flp_debug_updates"

    .line 97
    .line 98
    invoke-direct {v13, v14, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    new-instance v14, Ld7/d;

    .line 102
    .line 103
    const-string v15, "google_location_accuracy_enabled"

    .line 104
    .line 105
    invoke-direct {v14, v15, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    sput-object v14, Lx7/z;->g:Ld7/d;

    .line 109
    .line 110
    new-instance v15, Ld7/d;

    .line 111
    .line 112
    move-object/from16 v16, v0

    .line 113
    .line 114
    const-string v0, "geofences_with_callback"

    .line 115
    .line 116
    invoke-direct {v15, v0, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 117
    .line 118
    .line 119
    sput-object v15, Lx7/z;->h:Ld7/d;

    .line 120
    .line 121
    new-instance v0, Ld7/d;

    .line 122
    .line 123
    move-object/from16 v17, v1

    .line 124
    .line 125
    const-string v1, "location_enabled"

    .line 126
    .line 127
    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    const/16 v1, 0xf

    .line 131
    .line 132
    new-array v1, v1, [Ld7/d;

    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    aput-object v16, v1, v2

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    aput-object v17, v1, v2

    .line 139
    .line 140
    const/4 v2, 0x2

    .line 141
    aput-object v4, v1, v2

    .line 142
    .line 143
    const/4 v2, 0x3

    .line 144
    aput-object v5, v1, v2

    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    aput-object v6, v1, v2

    .line 148
    .line 149
    const/4 v2, 0x5

    .line 150
    aput-object v7, v1, v2

    .line 151
    .line 152
    const/4 v2, 0x6

    .line 153
    aput-object v8, v1, v2

    .line 154
    .line 155
    const/4 v2, 0x7

    .line 156
    aput-object v9, v1, v2

    .line 157
    .line 158
    const/16 v2, 0x8

    .line 159
    .line 160
    aput-object v10, v1, v2

    .line 161
    .line 162
    const/16 v2, 0x9

    .line 163
    .line 164
    aput-object v11, v1, v2

    .line 165
    .line 166
    const/16 v2, 0xa

    .line 167
    .line 168
    aput-object v12, v1, v2

    .line 169
    .line 170
    const/16 v2, 0xb

    .line 171
    .line 172
    aput-object v13, v1, v2

    .line 173
    .line 174
    const/16 v2, 0xc

    .line 175
    .line 176
    aput-object v14, v1, v2

    .line 177
    .line 178
    const/16 v2, 0xd

    .line 179
    .line 180
    aput-object v15, v1, v2

    .line 181
    .line 182
    const/16 v2, 0xe

    .line 183
    .line 184
    aput-object v0, v1, v2

    .line 185
    .line 186
    sput-object v1, Lx7/z;->i:[Ld7/d;

    .line 187
    .line 188
    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 2

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x15

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const-string v0, "unknown status code: "

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_1
    const-string p0, "RECONNECTION_TIMED_OUT"

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    const-string p0, "RECONNECTION_TIMED_OUT_DURING_UPDATE"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    const-string p0, "CONNECTION_SUSPENDED_DURING_CALL"

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_4
    const-string p0, "REMOTE_EXCEPTION"

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_5
    const-string p0, "DEAD_CLIENT"

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_6
    const-string p0, "API_NOT_CONNECTED"

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_7
    const-string p0, "CANCELED"

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_8
    const-string p0, "TIMEOUT"

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_9
    const-string p0, "INTERRUPTED"

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_a
    const-string p0, "ERROR"

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_b
    const-string p0, "DEVELOPER_ERROR"

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_c
    const-string p0, "INTERNAL_ERROR"

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_d
    const-string p0, "NETWORK_ERROR"

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_e
    const-string p0, "RESOLUTION_REQUIRED"

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_f
    const-string p0, "INVALID_ACCOUNT"

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_10
    const-string p0, "SIGN_IN_REQUIRED"

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_11
    const-string p0, "SERVICE_DISABLED"

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_12
    const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_13
    const-string p0, "SUCCESS"

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_14
    const-string p0, "SUCCESS_CACHE"

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static b(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x64

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq p0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x66

    .line 8
    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x68

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x69

    .line 16
    .line 17
    if-ne p0, v1, :cond_1

    .line 18
    .line 19
    move p0, v1

    .line 20
    :cond_0
    move v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v1, v0

    .line 23
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p0, v2, v0

    .line 30
    .line 31
    const-string p0, "priority %d must be a Priority.PRIORITY_* constant"

    .line 32
    .line 33
    invoke-static {v1, p0, v2}, Lcom/google/android/gms/common/internal/v;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static c(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-eq p0, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, 0x66

    .line 6
    .line 7
    if-eq p0, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x68

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x69

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const-string p0, "PASSIVE"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    const-string p0, "LOW_POWER"

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    const-string p0, "BALANCED_POWER_ACCURACY"

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_3
    const-string p0, "HIGH_ACCURACY"

    .line 33
    .line 34
    return-object p0
.end method

.method public static d(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const-string p0, "GRANULARITY_FINE"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :cond_1
    const-string p0, "GRANULARITY_COARSE"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_2
    const-string p0, "GRANULARITY_PERMISSION_LEVEL"

    .line 22
    .line 23
    return-object p0
.end method
