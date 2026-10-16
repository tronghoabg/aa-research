.class public final synthetic Lcom/moloco/sdk/internal/ortb/model/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/g0;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/g0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/g0;->a:Lcom/moloco/sdk/internal/ortb/model/g0;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ortb.model.Player"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "skip"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "close"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v0, v3}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "progress_bar"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "mute"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "cta"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "is_all_area_clickable"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "auto_store"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "vast_privacy_icon"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "dec"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "countdown_timer"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "android_inline"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "auto_inline"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "inline_button"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/g0;->b:LWf/d0;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 13

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/a;->a:Lcom/moloco/sdk/internal/ortb/model/a;

    .line 8
    .line 9
    invoke-static {v2}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lcom/moloco/sdk/internal/ortb/model/z;->a:Lcom/moloco/sdk/internal/ortb/model/z;

    .line 14
    .line 15
    invoke-static {v3}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lcom/moloco/sdk/internal/ortb/model/p;->a:Lcom/moloco/sdk/internal/ortb/model/p;

    .line 20
    .line 21
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    sget-object v5, Lcom/moloco/sdk/internal/ortb/model/i;->a:Lcom/moloco/sdk/internal/ortb/model/i;

    .line 26
    .line 27
    invoke-static {v5}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    sget-object v6, Lcom/moloco/sdk/internal/ortb/model/E;->a:Lcom/moloco/sdk/internal/ortb/model/E;

    .line 32
    .line 33
    invoke-static {v6}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    sget-object v7, Lcom/moloco/sdk/internal/ortb/model/C;->a:Lcom/moloco/sdk/internal/ortb/model/C;

    .line 38
    .line 39
    invoke-static {v7}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v8, Lcom/moloco/sdk/internal/ortb/model/l;->a:Lcom/moloco/sdk/internal/ortb/model/l;

    .line 44
    .line 45
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    sget-object v9, Lcom/moloco/sdk/internal/ortb/model/n;->a:Lcom/moloco/sdk/internal/ortb/model/n;

    .line 50
    .line 51
    invoke-static {v9}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    sget-object v10, Lcom/moloco/sdk/internal/ortb/model/Y;->a:Lcom/moloco/sdk/internal/ortb/model/Y;

    .line 56
    .line 57
    invoke-static {v10}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    const/16 v11, 0xd

    .line 62
    .line 63
    new-array v11, v11, [Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    aput-object v1, v11, v12

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    aput-object v0, v11, v1

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    aput-object v2, v11, v0

    .line 73
    .line 74
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/e0;->a:Lcom/moloco/sdk/internal/ortb/model/e0;

    .line 75
    .line 76
    const/4 v1, 0x3

    .line 77
    aput-object v0, v11, v1

    .line 78
    .line 79
    const/4 v0, 0x4

    .line 80
    aput-object v3, v11, v0

    .line 81
    .line 82
    sget-object v0, LWf/f;->a:LWf/f;

    .line 83
    .line 84
    const/4 v1, 0x5

    .line 85
    aput-object v0, v11, v1

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v4, v11, v0

    .line 89
    .line 90
    const/4 v0, 0x7

    .line 91
    aput-object v5, v11, v0

    .line 92
    .line 93
    const/16 v0, 0x8

    .line 94
    .line 95
    aput-object v6, v11, v0

    .line 96
    .line 97
    const/16 v0, 0x9

    .line 98
    .line 99
    aput-object v7, v11, v0

    .line 100
    .line 101
    const/16 v0, 0xa

    .line 102
    .line 103
    aput-object v8, v11, v0

    .line 104
    .line 105
    const/16 v0, 0xb

    .line 106
    .line 107
    aput-object v9, v11, v0

    .line 108
    .line 109
    const/16 v0, 0xc

    .line 110
    .line 111
    aput-object v10, v11, v0

    .line 112
    .line 113
    return-object v11
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 20

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g0;->b:LWf/d0;

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
    move-object v5, v4

    .line 11
    move-object v6, v5

    .line 12
    move-object v7, v6

    .line 13
    move-object v8, v7

    .line 14
    move-object v9, v8

    .line 15
    move-object v10, v9

    .line 16
    move-object v11, v10

    .line 17
    move-object v12, v11

    .line 18
    move-object v13, v12

    .line 19
    move-object v14, v13

    .line 20
    move-object v15, v14

    .line 21
    const/4 v3, 0x0

    .line 22
    const/16 v16, 0x1

    .line 23
    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    :goto_0
    if-eqz v16, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    new-instance v0, LSf/i;

    .line 36
    .line 37
    invoke-direct {v0, v2}, LSf/i;-><init>(I)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :pswitch_0
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/Y;->a:Lcom/moloco/sdk/internal/ortb/model/Y;

    .line 42
    .line 43
    move-object/from16 v19, v7

    .line 44
    .line 45
    const/16 v7, 0xc

    .line 46
    .line 47
    invoke-interface {v1, v0, v7, v2, v12}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v12, v2

    .line 52
    check-cast v12, Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 53
    .line 54
    or-int/lit16 v3, v3, 0x1000

    .line 55
    .line 56
    :goto_1
    move-object/from16 v7, v19

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_1
    move-object/from16 v19, v7

    .line 60
    .line 61
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/n;->a:Lcom/moloco/sdk/internal/ortb/model/n;

    .line 62
    .line 63
    const/16 v7, 0xb

    .line 64
    .line 65
    invoke-interface {v1, v0, v7, v2, v6}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v6, v2

    .line 70
    check-cast v6, Lcom/moloco/sdk/internal/ortb/model/o;

    .line 71
    .line 72
    or-int/lit16 v3, v3, 0x800

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_2
    move-object/from16 v19, v7

    .line 76
    .line 77
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/l;->a:Lcom/moloco/sdk/internal/ortb/model/l;

    .line 78
    .line 79
    const/16 v7, 0xa

    .line 80
    .line 81
    invoke-interface {v1, v0, v7, v2, v5}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    move-object v5, v2

    .line 86
    check-cast v5, Lcom/moloco/sdk/internal/ortb/model/m;

    .line 87
    .line 88
    or-int/lit16 v3, v3, 0x400

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_3
    move-object/from16 v19, v7

    .line 92
    .line 93
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/C;->a:Lcom/moloco/sdk/internal/ortb/model/C;

    .line 94
    .line 95
    const/16 v7, 0x9

    .line 96
    .line 97
    invoke-interface {v1, v0, v7, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v4, v2

    .line 102
    check-cast v4, Lcom/moloco/sdk/internal/ortb/model/D;

    .line 103
    .line 104
    or-int/lit16 v3, v3, 0x200

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_4
    move-object/from16 v19, v7

    .line 108
    .line 109
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/E;->a:Lcom/moloco/sdk/internal/ortb/model/E;

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    invoke-interface {v1, v0, v7, v2, v15}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v15, v2

    .line 118
    check-cast v15, Lcom/moloco/sdk/internal/ortb/model/F;

    .line 119
    .line 120
    or-int/lit16 v3, v3, 0x100

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :pswitch_5
    move-object/from16 v19, v7

    .line 124
    .line 125
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/i;->a:Lcom/moloco/sdk/internal/ortb/model/i;

    .line 126
    .line 127
    const/4 v7, 0x7

    .line 128
    invoke-interface {v1, v0, v7, v2, v14}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v14, v2

    .line 133
    check-cast v14, Lcom/moloco/sdk/internal/ortb/model/j;

    .line 134
    .line 135
    or-int/lit16 v3, v3, 0x80

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_6
    move-object/from16 v19, v7

    .line 139
    .line 140
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/p;->a:Lcom/moloco/sdk/internal/ortb/model/p;

    .line 141
    .line 142
    const/4 v7, 0x6

    .line 143
    invoke-interface {v1, v0, v7, v2, v13}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object v13, v2

    .line 148
    check-cast v13, Lcom/moloco/sdk/internal/ortb/model/q;

    .line 149
    .line 150
    or-int/lit8 v3, v3, 0x40

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_7
    move-object/from16 v19, v7

    .line 154
    .line 155
    const/4 v2, 0x5

    .line 156
    invoke-interface {v1, v0, v2}, LVf/a;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 157
    .line 158
    .line 159
    move-result v17

    .line 160
    or-int/lit8 v3, v3, 0x20

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :pswitch_8
    move-object/from16 v19, v7

    .line 165
    .line 166
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/z;->a:Lcom/moloco/sdk/internal/ortb/model/z;

    .line 167
    .line 168
    const/4 v7, 0x4

    .line 169
    invoke-interface {v1, v0, v7, v2, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move-object v11, v2

    .line 174
    check-cast v11, Lcom/moloco/sdk/internal/ortb/model/A;

    .line 175
    .line 176
    or-int/lit8 v3, v3, 0x10

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :pswitch_9
    move-object/from16 v19, v7

    .line 180
    .line 181
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/e0;->a:Lcom/moloco/sdk/internal/ortb/model/e0;

    .line 182
    .line 183
    const/4 v7, 0x3

    .line 184
    invoke-interface {v1, v0, v7, v2, v10}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object v10, v2

    .line 189
    check-cast v10, Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 190
    .line 191
    or-int/lit8 v3, v3, 0x8

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :pswitch_a
    move-object/from16 v19, v7

    .line 196
    .line 197
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/a;->a:Lcom/moloco/sdk/internal/ortb/model/a;

    .line 198
    .line 199
    const/4 v7, 0x2

    .line 200
    invoke-interface {v1, v0, v7, v2, v9}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move-object v9, v2

    .line 205
    check-cast v9, Lcom/moloco/sdk/internal/ortb/model/b;

    .line 206
    .line 207
    or-int/lit8 v3, v3, 0x4

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :pswitch_b
    move-object/from16 v19, v7

    .line 212
    .line 213
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 214
    .line 215
    const/4 v7, 0x1

    .line 216
    invoke-interface {v1, v0, v7, v2, v8}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object v8, v2

    .line 221
    check-cast v8, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 222
    .line 223
    or-int/lit8 v3, v3, 0x2

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :pswitch_c
    move-object/from16 v19, v7

    .line 228
    .line 229
    const/4 v7, 0x1

    .line 230
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 231
    .line 232
    move-object/from16 v7, v19

    .line 233
    .line 234
    move/from16 v19, v3

    .line 235
    .line 236
    move-object v3, v7

    .line 237
    const/4 v7, 0x0

    .line 238
    invoke-interface {v1, v0, v7, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 243
    .line 244
    or-int/lit8 v3, v19, 0x1

    .line 245
    .line 246
    move-object v7, v2

    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :pswitch_d
    move/from16 v19, v3

    .line 250
    .line 251
    move-object v3, v7

    .line 252
    const/4 v7, 0x0

    .line 253
    move/from16 v16, v7

    .line 254
    .line 255
    move-object v7, v3

    .line 256
    move/from16 v3, v19

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_0
    move/from16 v19, v3

    .line 261
    .line 262
    move-object v3, v7

    .line 263
    invoke-interface {v1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v18, v6

    .line 267
    .line 268
    move/from16 v6, v19

    .line 269
    .line 270
    move-object/from16 v19, v12

    .line 271
    .line 272
    move/from16 v12, v17

    .line 273
    .line 274
    move-object/from16 v17, v5

    .line 275
    .line 276
    new-instance v5, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 277
    .line 278
    move-object/from16 v16, v4

    .line 279
    .line 280
    invoke-direct/range {v5 .. v19}, Lcom/moloco/sdk/internal/ortb/model/h0;-><init>(ILcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/f0;Lcom/moloco/sdk/internal/ortb/model/A;ZLcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/j;Lcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/o;Lcom/moloco/sdk/internal/ortb/model/Z;)V

    .line 281
    .line 282
    .line 283
    return-object v5

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch -0x1
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

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g0;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g0;->b:LWf/d0;

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
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

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
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 27
    .line 28
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 32
    .line 33
    iget-object v2, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->b:Lcom/moloco/sdk/internal/ortb/model/h;

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->c:Lcom/moloco/sdk/internal/ortb/model/b;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    if-eqz v3, :cond_3

    .line 50
    .line 51
    :goto_1
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/a;->a:Lcom/moloco/sdk/internal/ortb/model/a;

    .line 52
    .line 53
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/e0;->a:Lcom/moloco/sdk/internal/ortb/model/e0;

    .line 57
    .line 58
    iget-object v2, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->e:Lcom/moloco/sdk/internal/ortb/model/A;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    if-eqz v3, :cond_5

    .line 75
    .line 76
    :goto_2
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/z;->a:Lcom/moloco/sdk/internal/ortb/model/z;

    .line 77
    .line 78
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget-boolean v1, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->f:Z

    .line 82
    .line 83
    const/4 v2, 0x5

    .line 84
    invoke-interface {p1, v0, v2, v1}, LVf/b;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x6

    .line 88
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->g:Lcom/moloco/sdk/internal/ortb/model/q;

    .line 93
    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    if-eqz v3, :cond_7

    .line 98
    .line 99
    :goto_3
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/p;->a:Lcom/moloco/sdk/internal/ortb/model/p;

    .line 100
    .line 101
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    const/4 v1, 0x7

    .line 105
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->h:Lcom/moloco/sdk/internal/ortb/model/j;

    .line 110
    .line 111
    if-eqz v2, :cond_8

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    if-eqz v3, :cond_9

    .line 115
    .line 116
    :goto_4
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/i;->a:Lcom/moloco/sdk/internal/ortb/model/i;

    .line 117
    .line 118
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_9
    const/16 v1, 0x8

    .line 122
    .line 123
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    .line 128
    .line 129
    if-eqz v2, :cond_a

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_a
    if-eqz v3, :cond_b

    .line 133
    .line 134
    :goto_5
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/E;->a:Lcom/moloco/sdk/internal/ortb/model/E;

    .line 135
    .line 136
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_b
    const/16 v1, 0x9

    .line 140
    .line 141
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 146
    .line 147
    if-eqz v2, :cond_c

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_c
    if-eqz v3, :cond_d

    .line 151
    .line 152
    :goto_6
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/C;->a:Lcom/moloco/sdk/internal/ortb/model/C;

    .line 153
    .line 154
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_d
    const/16 v1, 0xa

    .line 158
    .line 159
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->k:Lcom/moloco/sdk/internal/ortb/model/m;

    .line 164
    .line 165
    if-eqz v2, :cond_e

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_e
    if-eqz v3, :cond_f

    .line 169
    .line 170
    :goto_7
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/l;->a:Lcom/moloco/sdk/internal/ortb/model/l;

    .line 171
    .line 172
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_f
    const/16 v1, 0xb

    .line 176
    .line 177
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->l:Lcom/moloco/sdk/internal/ortb/model/o;

    .line 182
    .line 183
    if-eqz v2, :cond_10

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_10
    if-eqz v3, :cond_11

    .line 187
    .line 188
    :goto_8
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/n;->a:Lcom/moloco/sdk/internal/ortb/model/n;

    .line 189
    .line 190
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_11
    const/16 v1, 0xc

    .line 194
    .line 195
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 200
    .line 201
    if-eqz v2, :cond_12

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_12
    if-eqz p2, :cond_13

    .line 205
    .line 206
    :goto_9
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/Y;->a:Lcom/moloco/sdk/internal/ortb/model/Y;

    .line 207
    .line 208
    invoke-interface {p1, v0, v1, v2, p2}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_13
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
