.class public final synthetic Lcom/moloco/sdk/internal/ortb/model/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/c;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/c;->a:Lcom/moloco/sdk/internal/ortb/model/c;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ortb.model.SdkEvents"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "on_ad_load_start"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "on_ad_load_failed"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "on_ad_load_success"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "on_ad_show_failed"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "on_ad_show_success"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "on_ad_clicked"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "on_ad_hidden"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "on_user_rewarded"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "on_rewarded_video_started"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "on_rewarded_video_completed"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/c;->b:LWf/d0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 12

    .line 1
    sget-object v0, LWf/q0;->a:LWf/q0;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/16 v10, 0xa

    .line 44
    .line 45
    new-array v10, v10, [Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    aput-object v1, v10, v11

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    aput-object v2, v10, v1

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    aput-object v3, v10, v1

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    aput-object v4, v10, v1

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    aput-object v5, v10, v1

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    aput-object v6, v10, v1

    .line 64
    .line 65
    const/4 v1, 0x6

    .line 66
    aput-object v7, v10, v1

    .line 67
    .line 68
    const/4 v1, 0x7

    .line 69
    aput-object v8, v10, v1

    .line 70
    .line 71
    const/16 v1, 0x8

    .line 72
    .line 73
    aput-object v9, v10, v1

    .line 74
    .line 75
    const/16 v1, 0x9

    .line 76
    .line 77
    aput-object v0, v10, v1

    .line 78
    .line 79
    return-object v10
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/c;->b:LWf/d0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v7, v4

    .line 11
    move-object v8, v7

    .line 12
    move-object v9, v8

    .line 13
    move-object v10, v9

    .line 14
    move-object v11, v10

    .line 15
    move-object v12, v11

    .line 16
    move-object v13, v12

    .line 17
    move-object v14, v13

    .line 18
    move-object v15, v14

    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    if-eqz v5, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    packed-switch v3, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance v0, LSf/i;

    .line 31
    .line 32
    invoke-direct {v0, v3}, LSf/i;-><init>(I)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    sget-object v3, LWf/q0;->a:LWf/q0;

    .line 37
    .line 38
    const/16 v2, 0x9

    .line 39
    .line 40
    invoke-interface {v1, v0, v2, v3, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v4, v2

    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    or-int/lit16 v6, v6, 0x200

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_1
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 51
    .line 52
    const/16 v3, 0x8

    .line 53
    .line 54
    invoke-interface {v1, v0, v3, v2, v15}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    move-object v15, v2

    .line 59
    check-cast v15, Ljava/lang/String;

    .line 60
    .line 61
    or-int/lit16 v6, v6, 0x100

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 65
    .line 66
    const/4 v3, 0x7

    .line 67
    invoke-interface {v1, v0, v3, v2, v14}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v14, v2

    .line 72
    check-cast v14, Ljava/lang/String;

    .line 73
    .line 74
    or-int/lit16 v6, v6, 0x80

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 78
    .line 79
    const/4 v3, 0x6

    .line 80
    invoke-interface {v1, v0, v3, v2, v13}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v13, v2

    .line 85
    check-cast v13, Ljava/lang/String;

    .line 86
    .line 87
    or-int/lit8 v6, v6, 0x40

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 91
    .line 92
    const/4 v3, 0x5

    .line 93
    invoke-interface {v1, v0, v3, v2, v12}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v12, v2

    .line 98
    check-cast v12, Ljava/lang/String;

    .line 99
    .line 100
    or-int/lit8 v6, v6, 0x20

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_5
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 104
    .line 105
    const/4 v3, 0x4

    .line 106
    invoke-interface {v1, v0, v3, v2, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v11, v2

    .line 111
    check-cast v11, Ljava/lang/String;

    .line 112
    .line 113
    or-int/lit8 v6, v6, 0x10

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_6
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 117
    .line 118
    const/4 v3, 0x3

    .line 119
    invoke-interface {v1, v0, v3, v2, v10}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    move-object v10, v2

    .line 124
    check-cast v10, Ljava/lang/String;

    .line 125
    .line 126
    or-int/lit8 v6, v6, 0x8

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_7
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 130
    .line 131
    const/4 v3, 0x2

    .line 132
    invoke-interface {v1, v0, v3, v2, v9}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    move-object v9, v2

    .line 137
    check-cast v9, Ljava/lang/String;

    .line 138
    .line 139
    or-int/lit8 v6, v6, 0x4

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :pswitch_8
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 143
    .line 144
    const/4 v3, 0x1

    .line 145
    invoke-interface {v1, v0, v3, v2, v8}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move-object v8, v2

    .line 150
    check-cast v8, Ljava/lang/String;

    .line 151
    .line 152
    or-int/lit8 v6, v6, 0x2

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :pswitch_9
    const/4 v3, 0x1

    .line 157
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-interface {v1, v0, v3, v2, v7}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move-object v7, v2

    .line 165
    check-cast v7, Ljava/lang/String;

    .line 166
    .line 167
    or-int/lit8 v6, v6, 0x1

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_a
    const/4 v3, 0x0

    .line 172
    move v5, v3

    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_0
    invoke-interface {v1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 176
    .line 177
    .line 178
    new-instance v5, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 179
    .line 180
    move-object/from16 v16, v4

    .line 181
    .line 182
    invoke-direct/range {v5 .. v16}, Lcom/moloco/sdk/internal/ortb/model/d;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object v5

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch -0x1
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

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/c;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/c;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->a:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz v3, :cond_1

    .line 25
    .line 26
    :goto_0
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 27
    .line 28
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v1, 0x1

    .line 32
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->b:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-eqz v3, :cond_3

    .line 42
    .line 43
    :goto_1
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 44
    .line 45
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    const/4 v1, 0x2

    .line 49
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->c:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    if-eqz v3, :cond_5

    .line 59
    .line 60
    :goto_2
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 61
    .line 62
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    const/4 v1, 0x3

    .line 66
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->d:Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    if-eqz v3, :cond_7

    .line 76
    .line 77
    :goto_3
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 78
    .line 79
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_7
    const/4 v1, 0x4

    .line 83
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->e:Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v2, :cond_8

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_8
    if-eqz v3, :cond_9

    .line 93
    .line 94
    :goto_4
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 95
    .line 96
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_9
    const/4 v1, 0x5

    .line 100
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->f:Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v2, :cond_a

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_a
    if-eqz v3, :cond_b

    .line 110
    .line 111
    :goto_5
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 112
    .line 113
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_b
    const/4 v1, 0x6

    .line 117
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->g:Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v2, :cond_c

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_c
    if-eqz v3, :cond_d

    .line 127
    .line 128
    :goto_6
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 129
    .line 130
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_d
    const/4 v1, 0x7

    .line 134
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->h:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v2, :cond_e

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_e
    if-eqz v3, :cond_f

    .line 144
    .line 145
    :goto_7
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 146
    .line 147
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_f
    const/16 v1, 0x8

    .line 151
    .line 152
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/d;->i:Ljava/lang/String;

    .line 157
    .line 158
    if-eqz v2, :cond_10

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_10
    if-eqz v3, :cond_11

    .line 162
    .line 163
    :goto_8
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 164
    .line 165
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_11
    const/16 v1, 0x9

    .line 169
    .line 170
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/d;->j:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v2, :cond_12

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_12
    if-eqz p2, :cond_13

    .line 180
    .line 181
    :goto_9
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 182
    .line 183
    invoke-interface {p1, v0, v1, v2, p2}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_13
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
