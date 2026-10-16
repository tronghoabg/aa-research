.class public final Lcom/vungle/ads/internal/model/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/vungle/ads/internal/model/c;

.field public static final synthetic b:LWf/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/model/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/vungle/ads/internal/model/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/vungle/ads/internal/model/c;->a:Lcom/vungle/ads/internal/model/c;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.vungle.ads.internal.model.AdPayload"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ads"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "config"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "expiryWindowStart"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "mraidFiles"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "incentivizedTextSettings"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "assetsFullyDownloaded"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "indexFilePath"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lcom/vungle/ads/internal/model/c;->b:LWf/d0;

    .line 53
    .line 54
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
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, LWf/c;

    .line 4
    .line 5
    sget-object v3, Lcom/vungle/ads/internal/model/q;->a:Lcom/vungle/ads/internal/model/q;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-direct {v2, v3, v4}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lcom/vungle/ads/internal/model/u1;->a:Lcom/vungle/ads/internal/model/u1;

    .line 16
    .line 17
    invoke-static {v3}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v5, LWf/O;->a:LWf/O;

    .line 22
    .line 23
    invoke-static {v5}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    new-instance v6, LSf/a;

    .line 28
    .line 29
    sget-object v7, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 30
    .line 31
    const-class v8, Lj$/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    sget-object v8, LWf/q0;->a:LWf/q0;

    .line 38
    .line 39
    new-array v9, v0, [Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    aput-object v8, v9, v4

    .line 42
    .line 43
    aput-object v8, v9, v1

    .line 44
    .line 45
    invoke-direct {v6, v7, v9}, LSf/a;-><init>(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, LWf/E;

    .line 49
    .line 50
    invoke-direct {v7, v8, v8, v1}, LWf/E;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const/4 v9, 0x7

    .line 58
    new-array v9, v9, [Lkotlinx/serialization/KSerializer;

    .line 59
    .line 60
    aput-object v2, v9, v4

    .line 61
    .line 62
    aput-object v3, v9, v1

    .line 63
    .line 64
    aput-object v5, v9, v0

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    aput-object v6, v9, v0

    .line 68
    .line 69
    const/4 v0, 0x4

    .line 70
    aput-object v7, v9, v0

    .line 71
    .line 72
    sget-object v0, LWf/f;->a:LWf/f;

    .line 73
    .line 74
    const/4 v1, 0x5

    .line 75
    aput-object v0, v9, v1

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    aput-object v8, v9, v0

    .line 79
    .line 80
    return-object v9
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const-string v5, "decoder"

    .line 8
    .line 9
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v5, Lcom/vungle/ads/internal/model/c;->b:LWf/d0;

    .line 13
    .line 14
    invoke-interface {v0, v5}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v6, 0x0

    .line 19
    move v14, v3

    .line 20
    move/from16 v20, v14

    .line 21
    .line 22
    move v12, v4

    .line 23
    move-object v7, v6

    .line 24
    move-object v8, v7

    .line 25
    move-object v9, v8

    .line 26
    move-object v10, v9

    .line 27
    move-object v11, v10

    .line 28
    :goto_0
    if-eqz v12, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, v5}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 31
    .line 32
    .line 33
    move-result v13

    .line 34
    packed-switch v13, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    new-instance v0, LSf/i;

    .line 38
    .line 39
    invoke-direct {v0, v13}, LSf/i;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    sget-object v13, LWf/q0;->a:LWf/q0;

    .line 44
    .line 45
    const/4 v15, 0x6

    .line 46
    invoke-interface {v0, v5, v15, v13, v6}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    or-int/lit8 v14, v14, 0x40

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    const/4 v13, 0x5

    .line 54
    invoke-interface {v0, v5, v13}, LVf/a;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 55
    .line 56
    .line 57
    move-result v20

    .line 58
    or-int/lit8 v14, v14, 0x20

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    new-instance v13, LWf/E;

    .line 62
    .line 63
    sget-object v15, LWf/q0;->a:LWf/q0;

    .line 64
    .line 65
    invoke-direct {v13, v15, v15, v4}, LWf/E;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v5, v1, v13, v7}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    or-int/lit8 v14, v14, 0x10

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_3
    new-instance v13, LSf/a;

    .line 76
    .line 77
    sget-object v15, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 78
    .line 79
    move/from16 v16, v1

    .line 80
    .line 81
    const-class v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-virtual {v15, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-array v15, v2, [Lkotlinx/serialization/KSerializer;

    .line 88
    .line 89
    sget-object v17, LWf/q0;->a:LWf/q0;

    .line 90
    .line 91
    aput-object v17, v15, v3

    .line 92
    .line 93
    aput-object v17, v15, v4

    .line 94
    .line 95
    invoke-direct {v13, v1, v15}, LSf/a;-><init>(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V

    .line 96
    .line 97
    .line 98
    const/4 v1, 0x3

    .line 99
    invoke-interface {v0, v5, v1, v13, v8}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    or-int/lit8 v14, v14, 0x8

    .line 104
    .line 105
    :goto_1
    move/from16 v1, v16

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_4
    move/from16 v16, v1

    .line 109
    .line 110
    sget-object v1, LWf/O;->a:LWf/O;

    .line 111
    .line 112
    invoke-interface {v0, v5, v2, v1, v9}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    or-int/lit8 v14, v14, 0x4

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_5
    move/from16 v16, v1

    .line 120
    .line 121
    sget-object v1, Lcom/vungle/ads/internal/model/u1;->a:Lcom/vungle/ads/internal/model/u1;

    .line 122
    .line 123
    invoke-interface {v0, v5, v4, v1, v10}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    or-int/2addr v14, v2

    .line 128
    goto :goto_1

    .line 129
    :pswitch_6
    move/from16 v16, v1

    .line 130
    .line 131
    new-instance v1, LWf/c;

    .line 132
    .line 133
    sget-object v13, Lcom/vungle/ads/internal/model/q;->a:Lcom/vungle/ads/internal/model/q;

    .line 134
    .line 135
    invoke-direct {v1, v13, v3}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v0, v5, v3, v1, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    or-int/2addr v14, v4

    .line 143
    goto :goto_1

    .line 144
    :pswitch_7
    move v12, v3

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    invoke-interface {v0, v5}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 147
    .line 148
    .line 149
    new-instance v13, Lcom/vungle/ads/internal/model/h0;

    .line 150
    .line 151
    move-object v15, v11

    .line 152
    check-cast v15, Ljava/util/List;

    .line 153
    .line 154
    move-object/from16 v16, v10

    .line 155
    .line 156
    check-cast v16, Lcom/vungle/ads/internal/model/v2;

    .line 157
    .line 158
    move-object/from16 v17, v9

    .line 159
    .line 160
    check-cast v17, Ljava/lang/Long;

    .line 161
    .line 162
    move-object/from16 v18, v8

    .line 163
    .line 164
    check-cast v18, Lj$/util/concurrent/ConcurrentHashMap;

    .line 165
    .line 166
    move-object/from16 v19, v7

    .line 167
    .line 168
    check-cast v19, Ljava/util/Map;

    .line 169
    .line 170
    move-object/from16 v21, v6

    .line 171
    .line 172
    check-cast v21, Ljava/lang/String;

    .line 173
    .line 174
    invoke-direct/range {v13 .. v21}, Lcom/vungle/ads/internal/model/h0;-><init>(ILjava/util/List;Lcom/vungle/ads/internal/model/v2;Ljava/lang/Long;Lj$/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v13

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch -0x1
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

    sget-object v0, Lcom/vungle/ads/internal/model/c;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/vungle/ads/internal/model/h0;

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
    sget-object v0, Lcom/vungle/ads/internal/model/c;->b:LWf/d0;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2, p1, v0}, Lcom/vungle/ads/internal/model/h0;->a(Lcom/vungle/ads/internal/model/h0;LVf/b;LWf/d0;)V

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
