.class public final Lcom/vungle/ads/internal/model/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/vungle/ads/internal/model/u1;

.field public static final synthetic b:LWf/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/model/u1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/vungle/ads/internal/model/u1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/vungle/ads/internal/model/u1;->a:Lcom/vungle/ads/internal/model/u1;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.vungle.ads.internal.model.ConfigPayload"

    .line 11
    .line 12
    const/16 v3, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "reuse_assets"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "config"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "endpoints"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "log_metrics"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "placements"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "user"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "config_extension"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "disable_ad_id"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "ri_enabled"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "session_timeout"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "wait_for_connectivity_for_tpat"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "sdk_session_timeout"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "signals_disabled"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "fpd_enabled"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "rta_debugging"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "config_last_validated_ts"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "auto_redirect"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    const-string v0, "enable_ot"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    sput-object v1, Lcom/vungle/ads/internal/model/u1;->b:LWf/d0;

    .line 109
    .line 110
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 20

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/model/y1;->a:Lcom/vungle/ads/internal/model/y1;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/vungle/ads/internal/model/c2;->a:Lcom/vungle/ads/internal/model/c2;

    .line 8
    .line 9
    invoke-static {v1}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lcom/vungle/ads/internal/model/f2;->a:Lcom/vungle/ads/internal/model/f2;

    .line 14
    .line 15
    invoke-static {v2}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lcom/vungle/ads/internal/model/p2;->a:Lcom/vungle/ads/internal/model/p2;

    .line 20
    .line 21
    invoke-static {v3}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, LWf/c;

    .line 26
    .line 27
    sget-object v5, Lcom/vungle/ads/internal/model/g3;->a:Lcom/vungle/ads/internal/model/g3;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-direct {v4, v5, v6}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lcom/vungle/ads/internal/model/s2;->a:Lcom/vungle/ads/internal/model/s2;

    .line 38
    .line 39
    invoke-static {v5}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v7, LWf/q0;->a:LWf/q0;

    .line 44
    .line 45
    invoke-static {v7}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    sget-object v8, LWf/f;->a:LWf/f;

    .line 50
    .line 51
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    sget-object v11, LWf/J;->a:LWf/J;

    .line 60
    .line 61
    invoke-static {v11}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    invoke-static {v11}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 82
    .line 83
    .line 84
    move-result-object v16

    .line 85
    sget-object v17, LWf/O;->a:LWf/O;

    .line 86
    .line 87
    invoke-static/range {v17 .. v17}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    sget-object v18, Lcom/vungle/ads/internal/model/v1;->a:Lcom/vungle/ads/internal/model/v1;

    .line 92
    .line 93
    invoke-static/range {v18 .. v18}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 94
    .line 95
    .line 96
    move-result-object v18

    .line 97
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    move/from16 v19, v6

    .line 102
    .line 103
    const/16 v6, 0x12

    .line 104
    .line 105
    new-array v6, v6, [Lkotlinx/serialization/KSerializer;

    .line 106
    .line 107
    aput-object v0, v6, v19

    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    aput-object v1, v6, v0

    .line 111
    .line 112
    const/4 v0, 0x2

    .line 113
    aput-object v2, v6, v0

    .line 114
    .line 115
    const/4 v0, 0x3

    .line 116
    aput-object v3, v6, v0

    .line 117
    .line 118
    const/4 v0, 0x4

    .line 119
    aput-object v4, v6, v0

    .line 120
    .line 121
    const/4 v0, 0x5

    .line 122
    aput-object v5, v6, v0

    .line 123
    .line 124
    const/4 v0, 0x6

    .line 125
    aput-object v7, v6, v0

    .line 126
    .line 127
    const/4 v0, 0x7

    .line 128
    aput-object v9, v6, v0

    .line 129
    .line 130
    const/16 v0, 0x8

    .line 131
    .line 132
    aput-object v10, v6, v0

    .line 133
    .line 134
    const/16 v0, 0x9

    .line 135
    .line 136
    aput-object v12, v6, v0

    .line 137
    .line 138
    const/16 v0, 0xa

    .line 139
    .line 140
    aput-object v13, v6, v0

    .line 141
    .line 142
    const/16 v0, 0xb

    .line 143
    .line 144
    aput-object v11, v6, v0

    .line 145
    .line 146
    const/16 v0, 0xc

    .line 147
    .line 148
    aput-object v14, v6, v0

    .line 149
    .line 150
    const/16 v0, 0xd

    .line 151
    .line 152
    aput-object v15, v6, v0

    .line 153
    .line 154
    const/16 v0, 0xe

    .line 155
    .line 156
    aput-object v16, v6, v0

    .line 157
    .line 158
    const/16 v0, 0xf

    .line 159
    .line 160
    aput-object v17, v6, v0

    .line 161
    .line 162
    const/16 v0, 0x10

    .line 163
    .line 164
    aput-object v18, v6, v0

    .line 165
    .line 166
    const/16 v0, 0x11

    .line 167
    .line 168
    aput-object v8, v6, v0

    .line 169
    .line 170
    return-object v6
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "decoder"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/vungle/ads/internal/model/u1;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v2, v4

    .line 16
    move-object v3, v2

    .line 17
    move-object v5, v3

    .line 18
    move-object v6, v5

    .line 19
    move-object v7, v6

    .line 20
    move-object v8, v7

    .line 21
    move-object v9, v8

    .line 22
    move-object v10, v9

    .line 23
    move-object v11, v10

    .line 24
    move-object v12, v11

    .line 25
    move-object v13, v12

    .line 26
    move-object v14, v13

    .line 27
    move-object v15, v14

    .line 28
    move-object/from16 v17, v15

    .line 29
    .line 30
    move-object/from16 v18, v17

    .line 31
    .line 32
    move-object/from16 v19, v18

    .line 33
    .line 34
    move-object/from16 v20, v19

    .line 35
    .line 36
    const/16 v21, 0x1

    .line 37
    .line 38
    const/16 v23, 0x0

    .line 39
    .line 40
    :goto_0
    if-eqz v21, :cond_0

    .line 41
    .line 42
    move-object/from16 v22, v2

    .line 43
    .line 44
    invoke-interface {v0, v1}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    move-object/from16 v24, v3

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    packed-switch v2, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    new-instance v0, LSf/i;

    .line 55
    .line 56
    invoke-direct {v0, v2}, LSf/i;-><init>(I)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :pswitch_0
    sget-object v2, LWf/f;->a:LWf/f;

    .line 61
    .line 62
    const/16 v3, 0x11

    .line 63
    .line 64
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const/high16 v2, 0x20000

    .line 69
    .line 70
    or-int v23, v23, v2

    .line 71
    .line 72
    move-object/from16 v2, v22

    .line 73
    .line 74
    move-object/from16 v3, v24

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_1
    sget-object v2, Lcom/vungle/ads/internal/model/v1;->a:Lcom/vungle/ads/internal/model/v1;

    .line 78
    .line 79
    const/16 v3, 0x10

    .line 80
    .line 81
    invoke-interface {v0, v1, v3, v2, v5}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/high16 v3, 0x10000

    .line 86
    .line 87
    move-object v5, v2

    .line 88
    :goto_1
    move-object/from16 v25, v4

    .line 89
    .line 90
    :goto_2
    move-object/from16 v16, v18

    .line 91
    .line 92
    move-object/from16 v2, v22

    .line 93
    .line 94
    :goto_3
    const/4 v4, 0x0

    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :pswitch_2
    sget-object v2, LWf/O;->a:LWf/O;

    .line 98
    .line 99
    const/16 v3, 0xf

    .line 100
    .line 101
    invoke-interface {v0, v1, v3, v2, v6}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    const v3, 0x8000

    .line 106
    .line 107
    .line 108
    move-object v6, v2

    .line 109
    goto :goto_1

    .line 110
    :pswitch_3
    sget-object v2, LWf/f;->a:LWf/f;

    .line 111
    .line 112
    const/16 v3, 0xe

    .line 113
    .line 114
    invoke-interface {v0, v1, v3, v2, v7}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/16 v3, 0x4000

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    goto :goto_1

    .line 122
    :pswitch_4
    sget-object v2, LWf/f;->a:LWf/f;

    .line 123
    .line 124
    const/16 v3, 0xd

    .line 125
    .line 126
    invoke-interface {v0, v1, v3, v2, v8}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const/16 v3, 0x2000

    .line 131
    .line 132
    move-object v8, v2

    .line 133
    goto :goto_1

    .line 134
    :pswitch_5
    sget-object v2, LWf/f;->a:LWf/f;

    .line 135
    .line 136
    const/16 v3, 0xc

    .line 137
    .line 138
    invoke-interface {v0, v1, v3, v2, v9}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/16 v3, 0x1000

    .line 143
    .line 144
    move-object v9, v2

    .line 145
    goto :goto_1

    .line 146
    :pswitch_6
    sget-object v2, LWf/J;->a:LWf/J;

    .line 147
    .line 148
    const/16 v3, 0xb

    .line 149
    .line 150
    invoke-interface {v0, v1, v3, v2, v10}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v3, 0x800

    .line 155
    .line 156
    move-object v10, v2

    .line 157
    goto :goto_1

    .line 158
    :pswitch_7
    sget-object v2, LWf/f;->a:LWf/f;

    .line 159
    .line 160
    const/16 v3, 0xa

    .line 161
    .line 162
    invoke-interface {v0, v1, v3, v2, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const/16 v3, 0x400

    .line 167
    .line 168
    move-object v11, v2

    .line 169
    goto :goto_1

    .line 170
    :pswitch_8
    sget-object v2, LWf/J;->a:LWf/J;

    .line 171
    .line 172
    const/16 v3, 0x9

    .line 173
    .line 174
    invoke-interface {v0, v1, v3, v2, v12}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const/16 v3, 0x200

    .line 179
    .line 180
    move-object v12, v2

    .line 181
    goto :goto_1

    .line 182
    :pswitch_9
    sget-object v2, LWf/f;->a:LWf/f;

    .line 183
    .line 184
    const/16 v3, 0x8

    .line 185
    .line 186
    invoke-interface {v0, v1, v3, v2, v13}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v3, 0x100

    .line 191
    .line 192
    move-object v13, v2

    .line 193
    goto :goto_1

    .line 194
    :pswitch_a
    sget-object v2, LWf/f;->a:LWf/f;

    .line 195
    .line 196
    const/4 v3, 0x7

    .line 197
    invoke-interface {v0, v1, v3, v2, v14}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const/16 v3, 0x80

    .line 202
    .line 203
    move-object v14, v2

    .line 204
    goto :goto_1

    .line 205
    :pswitch_b
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 206
    .line 207
    const/4 v3, 0x6

    .line 208
    invoke-interface {v0, v1, v3, v2, v15}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v3, 0x40

    .line 213
    .line 214
    move-object v15, v2

    .line 215
    goto :goto_1

    .line 216
    :pswitch_c
    sget-object v2, Lcom/vungle/ads/internal/model/s2;->a:Lcom/vungle/ads/internal/model/s2;

    .line 217
    .line 218
    const/4 v3, 0x5

    .line 219
    move-object/from16 v25, v4

    .line 220
    .line 221
    move-object/from16 v4, v24

    .line 222
    .line 223
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/16 v3, 0x20

    .line 228
    .line 229
    move-object/from16 v24, v2

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :pswitch_d
    move-object/from16 v25, v4

    .line 234
    .line 235
    move-object/from16 v4, v24

    .line 236
    .line 237
    const/16 v3, 0x10

    .line 238
    .line 239
    new-instance v2, LWf/c;

    .line 240
    .line 241
    sget-object v3, Lcom/vungle/ads/internal/model/g3;->a:Lcom/vungle/ads/internal/model/g3;

    .line 242
    .line 243
    move-object/from16 v26, v4

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    invoke-direct {v2, v3, v4}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v4, v22

    .line 250
    .line 251
    const/4 v3, 0x4

    .line 252
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    move-object/from16 v16, v18

    .line 257
    .line 258
    move-object/from16 v24, v26

    .line 259
    .line 260
    const/16 v3, 0x10

    .line 261
    .line 262
    goto/16 :goto_3

    .line 263
    .line 264
    :pswitch_e
    move-object/from16 v25, v4

    .line 265
    .line 266
    move-object/from16 v4, v22

    .line 267
    .line 268
    move-object/from16 v26, v24

    .line 269
    .line 270
    const/16 v3, 0x8

    .line 271
    .line 272
    sget-object v2, Lcom/vungle/ads/internal/model/p2;->a:Lcom/vungle/ads/internal/model/p2;

    .line 273
    .line 274
    const/4 v3, 0x3

    .line 275
    move-object/from16 v24, v4

    .line 276
    .line 277
    move-object/from16 v4, v17

    .line 278
    .line 279
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object/from16 v17, v2

    .line 284
    .line 285
    move-object/from16 v16, v18

    .line 286
    .line 287
    move-object/from16 v2, v24

    .line 288
    .line 289
    move-object/from16 v24, v26

    .line 290
    .line 291
    const/16 v3, 0x8

    .line 292
    .line 293
    goto/16 :goto_3

    .line 294
    .line 295
    :pswitch_f
    move-object/from16 v25, v4

    .line 296
    .line 297
    move-object/from16 v4, v17

    .line 298
    .line 299
    move-object/from16 v26, v24

    .line 300
    .line 301
    const/16 v27, 0x4

    .line 302
    .line 303
    move-object/from16 v24, v22

    .line 304
    .line 305
    sget-object v2, Lcom/vungle/ads/internal/model/f2;->a:Lcom/vungle/ads/internal/model/f2;

    .line 306
    .line 307
    move-object/from16 v4, v18

    .line 308
    .line 309
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    move-object/from16 v16, v2

    .line 314
    .line 315
    move-object/from16 v2, v24

    .line 316
    .line 317
    move-object/from16 v24, v26

    .line 318
    .line 319
    move/from16 v3, v27

    .line 320
    .line 321
    goto/16 :goto_3

    .line 322
    .line 323
    :pswitch_10
    move-object/from16 v25, v4

    .line 324
    .line 325
    move-object/from16 v4, v18

    .line 326
    .line 327
    move-object/from16 v26, v24

    .line 328
    .line 329
    move-object/from16 v24, v22

    .line 330
    .line 331
    sget-object v2, Lcom/vungle/ads/internal/model/c2;->a:Lcom/vungle/ads/internal/model/c2;

    .line 332
    .line 333
    move-object/from16 v16, v4

    .line 334
    .line 335
    move-object/from16 v4, v19

    .line 336
    .line 337
    const/4 v3, 0x1

    .line 338
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    move-object/from16 v19, v2

    .line 343
    .line 344
    move-object/from16 v2, v24

    .line 345
    .line 346
    move-object/from16 v24, v26

    .line 347
    .line 348
    const/4 v3, 0x2

    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :pswitch_11
    move-object/from16 v25, v4

    .line 352
    .line 353
    move-object/from16 v16, v18

    .line 354
    .line 355
    move-object/from16 v4, v19

    .line 356
    .line 357
    move-object/from16 v26, v24

    .line 358
    .line 359
    const/4 v3, 0x1

    .line 360
    move-object/from16 v24, v22

    .line 361
    .line 362
    sget-object v2, Lcom/vungle/ads/internal/model/y1;->a:Lcom/vungle/ads/internal/model/y1;

    .line 363
    .line 364
    move-object/from16 v3, v20

    .line 365
    .line 366
    const/4 v4, 0x0

    .line 367
    invoke-interface {v0, v1, v4, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    move-object/from16 v20, v2

    .line 372
    .line 373
    move-object/from16 v2, v24

    .line 374
    .line 375
    move-object/from16 v24, v26

    .line 376
    .line 377
    const/4 v3, 0x1

    .line 378
    :goto_4
    or-int v23, v23, v3

    .line 379
    .line 380
    move-object/from16 v18, v16

    .line 381
    .line 382
    move-object/from16 v3, v24

    .line 383
    .line 384
    move-object/from16 v4, v25

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :pswitch_12
    move-object/from16 v25, v4

    .line 389
    .line 390
    move-object/from16 v16, v18

    .line 391
    .line 392
    move-object/from16 v3, v20

    .line 393
    .line 394
    move-object/from16 v26, v24

    .line 395
    .line 396
    const/4 v4, 0x0

    .line 397
    move-object/from16 v24, v22

    .line 398
    .line 399
    move/from16 v21, v4

    .line 400
    .line 401
    move-object/from16 v2, v24

    .line 402
    .line 403
    move-object/from16 v4, v25

    .line 404
    .line 405
    move-object/from16 v3, v26

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_0
    move-object/from16 v24, v2

    .line 410
    .line 411
    move-object/from16 v26, v3

    .line 412
    .line 413
    move-object/from16 v25, v4

    .line 414
    .line 415
    move-object/from16 v16, v18

    .line 416
    .line 417
    move-object/from16 v3, v20

    .line 418
    .line 419
    invoke-interface {v0, v1}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 420
    .line 421
    .line 422
    new-instance v22, Lcom/vungle/ads/internal/model/v2;

    .line 423
    .line 424
    move-object/from16 v20, v3

    .line 425
    .line 426
    check-cast v20, Lcom/vungle/ads/internal/model/a2;

    .line 427
    .line 428
    check-cast v19, Lcom/vungle/ads/internal/model/e2;

    .line 429
    .line 430
    move-object/from16 v18, v16

    .line 431
    .line 432
    check-cast v18, Lcom/vungle/ads/internal/model/h2;

    .line 433
    .line 434
    move-object/from16 v27, v17

    .line 435
    .line 436
    check-cast v27, Lcom/vungle/ads/internal/model/r2;

    .line 437
    .line 438
    move-object/from16 v28, v24

    .line 439
    .line 440
    check-cast v28, Ljava/util/List;

    .line 441
    .line 442
    move-object/from16 v29, v26

    .line 443
    .line 444
    check-cast v29, Lcom/vungle/ads/internal/model/u2;

    .line 445
    .line 446
    move-object/from16 v30, v15

    .line 447
    .line 448
    check-cast v30, Ljava/lang/String;

    .line 449
    .line 450
    move-object/from16 v31, v14

    .line 451
    .line 452
    check-cast v31, Ljava/lang/Boolean;

    .line 453
    .line 454
    move-object/from16 v32, v13

    .line 455
    .line 456
    check-cast v32, Ljava/lang/Boolean;

    .line 457
    .line 458
    move-object/from16 v33, v12

    .line 459
    .line 460
    check-cast v33, Ljava/lang/Integer;

    .line 461
    .line 462
    move-object/from16 v34, v11

    .line 463
    .line 464
    check-cast v34, Ljava/lang/Boolean;

    .line 465
    .line 466
    move-object/from16 v35, v10

    .line 467
    .line 468
    check-cast v35, Ljava/lang/Integer;

    .line 469
    .line 470
    move-object/from16 v36, v9

    .line 471
    .line 472
    check-cast v36, Ljava/lang/Boolean;

    .line 473
    .line 474
    move-object/from16 v37, v8

    .line 475
    .line 476
    check-cast v37, Ljava/lang/Boolean;

    .line 477
    .line 478
    move-object/from16 v38, v7

    .line 479
    .line 480
    check-cast v38, Ljava/lang/Boolean;

    .line 481
    .line 482
    move-object/from16 v39, v6

    .line 483
    .line 484
    check-cast v39, Ljava/lang/Long;

    .line 485
    .line 486
    move-object/from16 v40, v5

    .line 487
    .line 488
    check-cast v40, Lcom/vungle/ads/internal/model/x1;

    .line 489
    .line 490
    move-object/from16 v41, v25

    .line 491
    .line 492
    check-cast v41, Ljava/lang/Boolean;

    .line 493
    .line 494
    move-object/from16 v26, v18

    .line 495
    .line 496
    move-object/from16 v25, v19

    .line 497
    .line 498
    move-object/from16 v24, v20

    .line 499
    .line 500
    invoke-direct/range {v22 .. v41}, Lcom/vungle/ads/internal/model/v2;-><init>(ILcom/vungle/ads/internal/model/a2;Lcom/vungle/ads/internal/model/e2;Lcom/vungle/ads/internal/model/h2;Lcom/vungle/ads/internal/model/r2;Ljava/util/List;Lcom/vungle/ads/internal/model/u2;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/x1;Ljava/lang/Boolean;)V

    .line 501
    .line 502
    .line 503
    return-object v22

    .line 504
    nop

    .line 505
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/vungle/ads/internal/model/u1;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/vungle/ads/internal/model/v2;

    .line 2
    .line 3
    const-string v0, "encoder"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "value"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/vungle/ads/internal/model/u1;->b:LWf/d0;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2, p1, v0}, Lcom/vungle/ads/internal/model/v2;->a(Lcom/vungle/ads/internal/model/v2;LVf/b;LWf/d0;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    return-object v0
.end method
