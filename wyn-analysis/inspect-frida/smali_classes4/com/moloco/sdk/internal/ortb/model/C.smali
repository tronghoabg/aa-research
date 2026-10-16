.class public final synthetic Lcom/moloco/sdk/internal/ortb/model/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/C;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/C;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/C;->a:Lcom/moloco/sdk/internal/ortb/model/C;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ortb.model.CountDownTimer"

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "custom_timer_desc"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "is_default_timer"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "control_size"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "padding"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "horizontal_alignment"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "vertical_alignment"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "foreground_color"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "background_color"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/C;->b:LWf/d0;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 8

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x4

    .line 3
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/D;->i:[Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    sget-object v3, LWf/q0;->a:LWf/q0;

    .line 6
    .line 7
    invoke-static {v3}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, LWf/J;->a:LWf/J;

    .line 12
    .line 13
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    aget-object v5, v2, v1

    .line 18
    .line 19
    aget-object v2, v2, v0

    .line 20
    .line 21
    const/16 v6, 0x8

    .line 22
    .line 23
    new-array v6, v6, [Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    aput-object v3, v6, v7

    .line 27
    .line 28
    sget-object v3, LWf/f;->a:LWf/f;

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    aput-object v3, v6, v7

    .line 32
    .line 33
    sget-object v3, LWf/x0;->a:LWf/x0;

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    aput-object v3, v6, v7

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    aput-object v4, v6, v3

    .line 40
    .line 41
    aput-object v5, v6, v1

    .line 42
    .line 43
    aput-object v2, v6, v0

    .line 44
    .line 45
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    aput-object v0, v6, v1

    .line 49
    .line 50
    const/4 v1, 0x7

    .line 51
    aput-object v0, v6, v1

    .line 52
    .line 53
    return-object v6
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/C;->b:LWf/d0;

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
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/D;->i:[Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v8, v5

    .line 14
    move-object v10, v8

    .line 15
    move-object v11, v10

    .line 16
    move-object v12, v11

    .line 17
    move-object v13, v12

    .line 18
    move-object v14, v13

    .line 19
    move-object v15, v14

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    move v5, v3

    .line 23
    :goto_0
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    packed-switch v6, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance v0, LSf/i;

    .line 33
    .line 34
    invoke-direct {v0, v6}, LSf/i;-><init>(I)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_0
    sget-object v6, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 39
    .line 40
    const/4 v4, 0x7

    .line 41
    invoke-interface {v1, v0, v4, v6, v15}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v15, v4

    .line 46
    check-cast v15, Le0/q;

    .line 47
    .line 48
    or-int/lit16 v7, v7, 0x80

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    sget-object v4, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 52
    .line 53
    const/4 v6, 0x6

    .line 54
    invoke-interface {v1, v0, v6, v4, v14}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v14, v4

    .line 59
    check-cast v14, Le0/q;

    .line 60
    .line 61
    or-int/lit8 v7, v7, 0x40

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    const/4 v4, 0x5

    .line 65
    aget-object v6, v2, v4

    .line 66
    .line 67
    invoke-interface {v1, v0, v4, v6, v13}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v13, v4

    .line 72
    check-cast v13, Lcom/moloco/sdk/internal/ortb/model/k;

    .line 73
    .line 74
    or-int/lit8 v7, v7, 0x20

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    const/4 v4, 0x4

    .line 78
    aget-object v6, v2, v4

    .line 79
    .line 80
    invoke-interface {v1, v0, v4, v6, v12}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    move-object v12, v4

    .line 85
    check-cast v12, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 86
    .line 87
    or-int/lit8 v7, v7, 0x10

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    sget-object v4, LWf/J;->a:LWf/J;

    .line 91
    .line 92
    const/4 v6, 0x3

    .line 93
    invoke-interface {v1, v0, v6, v4, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    move-object v11, v4

    .line 98
    check-cast v11, Ljava/lang/Integer;

    .line 99
    .line 100
    or-int/lit8 v7, v7, 0x8

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_5
    sget-object v4, LWf/x0;->a:LWf/x0;

    .line 104
    .line 105
    const/4 v6, 0x2

    .line 106
    invoke-interface {v1, v0, v6, v4, v10}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v10, v4

    .line 111
    check-cast v10, Lef/u;

    .line 112
    .line 113
    or-int/lit8 v7, v7, 0x4

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_6
    invoke-interface {v1, v0, v3}, LVf/a;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    or-int/lit8 v7, v7, 0x2

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_7
    sget-object v4, LWf/q0;->a:LWf/q0;

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-interface {v1, v0, v6, v4, v8}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    move-object v8, v4

    .line 131
    check-cast v8, Ljava/lang/String;

    .line 132
    .line 133
    or-int/lit8 v7, v7, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :pswitch_8
    const/4 v6, 0x0

    .line 137
    move v5, v6

    .line 138
    goto :goto_0

    .line 139
    :cond_0
    invoke-interface {v1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 140
    .line 141
    .line 142
    new-instance v6, Lcom/moloco/sdk/internal/ortb/model/D;

    .line 143
    .line 144
    invoke-direct/range {v6 .. v15}, Lcom/moloco/sdk/internal/ortb/model/D;-><init>(ILjava/lang/String;ZLef/u;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Le0/q;)V

    .line 145
    .line 146
    .line 147
    return-object v6

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch -0x1
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

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/C;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ortb/model/D;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/C;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/D;->Companion:Lcom/moloco/sdk/internal/ortb/model/k$b;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->a:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-eqz v3, :cond_1

    .line 27
    .line 28
    :goto_0
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 29
    .line 30
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v1, 0x1

    .line 34
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-boolean v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->b:Z

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    if-eq v3, v1, :cond_3

    .line 44
    .line 45
    :goto_1
    invoke-interface {p1, v0, v1, v3}, LVf/b;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

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
    iget v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->c:I

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    const/16 v2, 0x1e

    .line 59
    .line 60
    if-eq v3, v2, :cond_5

    .line 61
    .line 62
    :goto_2
    sget-object v2, LWf/x0;->a:LWf/x0;

    .line 63
    .line 64
    new-instance v4, Lef/u;

    .line 65
    .line 66
    invoke-direct {v4, v3}, Lef/u;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v1, v2, v4}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    const/4 v1, 0x3

    .line 73
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->d:Ljava/lang/Integer;

    .line 78
    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    if-eqz v3, :cond_7

    .line 83
    .line 84
    :goto_3
    sget-object v2, LWf/J;->a:LWf/J;

    .line 85
    .line 86
    invoke-interface {p1, v0, v1, v2, v3}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_7
    const/4 v1, 0x4

    .line 90
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sget-object v3, Lcom/moloco/sdk/internal/ortb/model/D;->i:[Lkotlinx/serialization/KSerializer;

    .line 95
    .line 96
    iget-object v4, p2, Lcom/moloco/sdk/internal/ortb/model/D;->e:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 97
    .line 98
    if-eqz v2, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/X;->f:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 102
    .line 103
    if-eq v4, v2, :cond_9

    .line 104
    .line 105
    :goto_4
    aget-object v2, v3, v1

    .line 106
    .line 107
    invoke-interface {p1, v0, v1, v2, v4}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_9
    const/4 v1, 0x5

    .line 111
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iget-object v4, p2, Lcom/moloco/sdk/internal/ortb/model/D;->f:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 116
    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_a
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/k;->b:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 121
    .line 122
    if-eq v4, v2, :cond_b

    .line 123
    .line 124
    :goto_5
    aget-object v2, v3, v1

    .line 125
    .line 126
    invoke-interface {p1, v0, v1, v2, v4}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_b
    const/4 v1, 0x6

    .line 130
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    iget-wide v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->g:J

    .line 135
    .line 136
    if-eqz v2, :cond_c

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_c
    const-string v2, "#FF4285f4"

    .line 140
    .line 141
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-static {v2}, Le0/z;->b(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    invoke-static {v3, v4, v5, v6}, Le0/q;->b(JJ)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-nez v2, :cond_d

    .line 154
    .line 155
    :goto_6
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 156
    .line 157
    new-instance v5, Le0/q;

    .line 158
    .line 159
    invoke-direct {v5, v3, v4}, Le0/q;-><init>(J)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p1, v0, v1, v2, v5}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_d
    const/4 v1, 0x7

    .line 166
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    iget-wide v3, p2, Lcom/moloco/sdk/internal/ortb/model/D;->h:J

    .line 171
    .line 172
    if-eqz v2, :cond_e

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_e
    const-string p2, "#FFFFFFFF"

    .line 176
    .line 177
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-static {p2}, Le0/z;->b(I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v5

    .line 185
    invoke-static {v3, v4, v5, v6}, Le0/q;->b(JJ)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-nez p2, :cond_f

    .line 190
    .line 191
    :goto_7
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 192
    .line 193
    new-instance v2, Le0/q;

    .line 194
    .line 195
    invoke-direct {v2, v3, v4}, Le0/q;-><init>(J)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p1, v0, v1, p2, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_f
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
