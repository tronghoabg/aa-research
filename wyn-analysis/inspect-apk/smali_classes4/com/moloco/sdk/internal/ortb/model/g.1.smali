.class public final synthetic Lcom/moloco/sdk/internal/ortb/model/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/g;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/g;->a:Lcom/moloco/sdk/internal/ortb/model/g;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ortb.model.SkipClose"

    .line 11
    .line 12
    const/4 v3, 0x7

    .line 13
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "delay_seconds"

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
    const-string v0, "control_size"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "horizontal_alignment"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "vertical_alignment"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "foreground_color"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "background_color"

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/g;->b:LWf/d0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/h;->h:[Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    aget-object v3, v2, v1

    .line 6
    .line 7
    aget-object v2, v2, v0

    .line 8
    .line 9
    sget-object v4, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 10
    .line 11
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v6, 0x7

    .line 16
    new-array v6, v6, [Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    sget-object v7, LWf/x0;->a:LWf/x0;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    aput-object v7, v6, v8

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    aput-object v7, v6, v8

    .line 25
    .line 26
    const/4 v8, 0x2

    .line 27
    aput-object v7, v6, v8

    .line 28
    .line 29
    aput-object v3, v6, v1

    .line 30
    .line 31
    aput-object v2, v6, v0

    .line 32
    .line 33
    const/4 v0, 0x5

    .line 34
    aput-object v4, v6, v0

    .line 35
    .line 36
    const/4 v0, 0x6

    .line 37
    aput-object v5, v6, v0

    .line 38
    .line 39
    return-object v6
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 16

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g;->b:LWf/d0;

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
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/h;->h:[Lkotlinx/serialization/KSerializer;

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
    move-object v8, v5

    .line 16
    move-object v9, v8

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
    sget-object v6, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 52
    .line 53
    const/4 v15, 0x5

    .line 54
    invoke-interface {v1, v0, v15, v6, v13}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    move-object v13, v6

    .line 59
    check-cast v13, Le0/q;

    .line 60
    .line 61
    or-int/lit8 v7, v7, 0x20

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    const/4 v6, 0x4

    .line 65
    aget-object v15, v2, v6

    .line 66
    .line 67
    invoke-interface {v1, v0, v6, v15, v12}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    move-object v12, v6

    .line 72
    check-cast v12, Lcom/moloco/sdk/internal/ortb/model/k;

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
    check-cast v11, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 86
    .line 87
    or-int/lit8 v7, v7, 0x8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_4
    sget-object v6, LWf/x0;->a:LWf/x0;

    .line 91
    .line 92
    const/4 v15, 0x2

    .line 93
    invoke-interface {v1, v0, v15, v6, v10}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    move-object v10, v6

    .line 98
    check-cast v10, Lef/u;

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
    sget-object v6, LWf/x0;->a:LWf/x0;

    .line 116
    .line 117
    invoke-interface {v1, v0, v4, v6, v8}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    move-object v8, v6

    .line 122
    check-cast v8, Lef/u;

    .line 123
    .line 124
    or-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_7
    move v5, v4

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    invoke-interface {v1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 130
    .line 131
    .line 132
    new-instance v6, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 133
    .line 134
    invoke-direct/range {v6 .. v14}, Lcom/moloco/sdk/internal/ortb/model/h;-><init>(ILef/u;Lef/u;Lef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Le0/q;)V

    .line 135
    .line 136
    .line 137
    return-object v6

    .line 138
    nop

    .line 139
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

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/g;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/h;->Companion:Lcom/moloco/sdk/internal/ortb/model/D$b;

    .line 15
    .line 16
    sget-object v1, LWf/x0;->a:LWf/x0;

    .line 17
    .line 18
    new-instance v2, Lef/u;

    .line 19
    .line 20
    iget v3, p2, Lcom/moloco/sdk/internal/ortb/model/h;->a:I

    .line 21
    .line 22
    invoke-direct {v2, v3}, Lef/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lef/u;

    .line 30
    .line 31
    iget v3, p2, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 32
    .line 33
    invoke-direct {v2, v3}, Lef/u;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lef/u;

    .line 41
    .line 42
    iget v3, p2, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 43
    .line 44
    invoke-direct {v2, v3}, Lef/u;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/h;->h:[Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    aget-object v3, v1, v2

    .line 55
    .line 56
    iget-object v4, p2, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 57
    .line 58
    invoke-interface {p1, v0, v2, v3, v4}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    aget-object v1, v1, v2

    .line 63
    .line 64
    iget-object v3, p2, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 65
    .line 66
    invoke-interface {p1, v0, v2, v1, v3}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 70
    .line 71
    new-instance v2, Le0/q;

    .line 72
    .line 73
    iget-wide v3, p2, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    .line 74
    .line 75
    invoke-direct {v2, v3, v4}, Le0/q;-><init>(J)V

    .line 76
    .line 77
    .line 78
    const/4 v3, 0x5

    .line 79
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x6

    .line 83
    invoke-interface {p1, v0, v2}, LVf/b;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget-object p2, p2, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    .line 88
    .line 89
    if-eqz v3, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    if-eqz p2, :cond_1

    .line 93
    .line 94
    :goto_0
    invoke-interface {p1, v0, v2, v1, p2}, LVf/b;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
