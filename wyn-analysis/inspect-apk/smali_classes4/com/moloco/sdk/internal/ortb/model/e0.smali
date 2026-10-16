.class public final synthetic Lcom/moloco/sdk/internal/ortb/model/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/e0;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/e0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/e0;->a:Lcom/moloco/sdk/internal/ortb/model/e0;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ortb.model.Mute"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "mute"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "padding"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "horizontal_alignment"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "vertical_alignment"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "foreground_color"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "control_size"

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "background_color"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/e0;->b:LWf/d0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/f0;->h:[Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    sget-object v3, LWf/x0;->a:LWf/x0;

    .line 6
    .line 7
    aget-object v4, v2, v1

    .line 8
    .line 9
    aget-object v2, v2, v0

    .line 10
    .line 11
    sget-object v5, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 12
    .line 13
    invoke-static {v3}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-static {v5}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const/4 v8, 0x7

    .line 22
    new-array v8, v8, [Lkotlinx/serialization/KSerializer;

    .line 23
    .line 24
    sget-object v9, LWf/f;->a:LWf/f;

    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    aput-object v9, v8, v10

    .line 28
    .line 29
    const/4 v9, 0x1

    .line 30
    aput-object v3, v8, v9

    .line 31
    .line 32
    aput-object v4, v8, v1

    .line 33
    .line 34
    aput-object v2, v8, v0

    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    aput-object v5, v8, v0

    .line 38
    .line 39
    const/4 v0, 0x5

    .line 40
    aput-object v6, v8, v0

    .line 41
    .line 42
    const/4 v0, 0x6

    .line 43
    aput-object v7, v8, v0

    .line 44
    .line 45
    return-object v8
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/e0;->b:LWf/d0;

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
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/f0;->h:[Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move v7, v4

    .line 15
    move v8, v7

    .line 16
    move-object v9, v5

    .line 17
    move-object v10, v9

    .line 18
    move-object v11, v10

    .line 19
    move-object v12, v11

    .line 20
    move-object v13, v12

    .line 21
    move-object v14, v13

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
    const/4 v15, 0x6

    .line 41
    invoke-interface {v1, v0, v15, v6, v14}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    move-object v14, v6

    .line 46
    check-cast v14, Le0/q;

    .line 47
    .line 48
    or-int/lit8 v7, v7, 0x40

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    sget-object v6, LWf/x0;->a:LWf/x0;

    .line 52
    .line 53
    const/4 v15, 0x5

    .line 54
    invoke-interface {v1, v0, v15, v6, v13}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    move-object v13, v6

    .line 59
    check-cast v13, Lef/u;

    .line 60
    .line 61
    or-int/lit8 v7, v7, 0x20

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    sget-object v6, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 65
    .line 66
    const/4 v15, 0x4

    .line 67
    invoke-interface {v1, v0, v15, v6, v12}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    move-object v12, v6

    .line 72
    check-cast v12, Le0/q;

    .line 73
    .line 74
    or-int/lit8 v7, v7, 0x10

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    const/4 v6, 0x3

    .line 78
    aget-object v15, v2, v6

    .line 79
    .line 80
    invoke-interface {v1, v0, v6, v15, v11}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    move-object v11, v6

    .line 85
    check-cast v11, Lcom/moloco/sdk/internal/ortb/model/k;

    .line 86
    .line 87
    or-int/lit8 v7, v7, 0x8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    const/4 v6, 0x2

    .line 91
    aget-object v15, v2, v6

    .line 92
    .line 93
    invoke-interface {v1, v0, v6, v15, v10}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    move-object v10, v6

    .line 98
    check-cast v10, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 99
    .line 100
    or-int/lit8 v7, v7, 0x4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_5
    sget-object v6, LWf/x0;->a:LWf/x0;

    .line 104
    .line 105
    invoke-interface {v1, v0, v3, v6, v9}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    move-object v9, v6

    .line 110
    check-cast v9, Lef/u;

    .line 111
    .line 112
    or-int/lit8 v7, v7, 0x2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_6
    invoke-interface {v1, v0, v4}, LVf/a;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    or-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_7
    move v5, v4

    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-interface {v1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 125
    .line 126
    .line 127
    new-instance v6, Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 128
    .line 129
    invoke-direct/range {v6 .. v14}, Lcom/moloco/sdk/internal/ortb/model/f0;-><init>(IZLef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Lef/u;Le0/q;)V

    .line 130
    .line 131
    .line 132
    return-object v6

    .line 133
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

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/e0;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/e0;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-boolean v1, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->a:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, v0, v2, v1}, LVf/b;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 18
    .line 19
    .line 20
    sget-object v1, LWf/x0;->a:LWf/x0;

    .line 21
    .line 22
    new-instance v2, Lef/u;

    .line 23
    .line 24
    iget v3, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->b:I

    .line 25
    .line 26
    invoke-direct {v2, v3}, Lef/u;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/f0;->h:[Lkotlinx/serialization/KSerializer;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    aget-object v4, v2, v3

    .line 37
    .line 38
    iget-object v5, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 39
    .line 40
    invoke-interface {p1, v0, v3, v4, v5}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    aget-object v2, v2, v3

    .line 45
    .line 46
    iget-object v4, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->d:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 47
    .line 48
    invoke-interface {p1, v0, v3, v2, v4}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 52
    .line 53
    new-instance v3, Le0/q;

    .line 54
    .line 55
    iget-wide v4, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->e:J

    .line 56
    .line 57
    invoke-direct {v3, v4, v5}, Le0/q;-><init>(J)V

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x4

    .line 61
    invoke-interface {p1, v0, v4, v2, v3}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 v3, 0x5

    .line 65
    invoke-interface {p1, v0, v3}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    iget-object v5, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->f:Lef/u;

    .line 70
    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    if-eqz v5, :cond_1

    .line 75
    .line 76
    :goto_0
    invoke-interface {p1, v0, v3, v1, v5}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    const/4 v1, 0x6

    .line 80
    invoke-interface {p1, v0, v1}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/f0;->g:Le0/q;

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    if-eqz p2, :cond_3

    .line 90
    .line 91
    :goto_1
    invoke-interface {p1, v0, v1, v2, p2}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
