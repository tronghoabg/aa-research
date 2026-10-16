.class public final synthetic Lcom/moloco/sdk/internal/ilrd/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ilrd/n;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ilrd/n;->a:Lcom/moloco/sdk/internal/ilrd/n;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "lastEventReceivedTs"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "banner"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "mrec"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "native"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "interstitial"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "rewarded"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lcom/moloco/sdk/internal/ilrd/n;->b:LWf/d0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 3
    .line 4
    sget-object v1, LWf/O;->a:LWf/O;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LWf/J;->a:LWf/J;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aput-object v1, v0, v2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    aput-object v1, v0, v2

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    aput-object v1, v0, v2

    .line 25
    .line 26
    return-object v0
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ilrd/n;->b:LWf/d0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    move v6, v2

    .line 12
    move v7, v6

    .line 13
    move v8, v7

    .line 14
    move v9, v8

    .line 15
    move v10, v9

    .line 16
    move v13, v10

    .line 17
    move-wide v11, v3

    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    packed-switch v4, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance p1, LSf/i;

    .line 29
    .line 30
    invoke-direct {p1, v4}, LSf/i;-><init>(I)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :pswitch_0
    const/4 v4, 0x5

    .line 35
    invoke-interface {p1, v0, v4}, LVf/a;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    or-int/lit8 v6, v6, 0x20

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    const/4 v4, 0x4

    .line 43
    invoke-interface {p1, v0, v4}, LVf/a;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    or-int/lit8 v6, v6, 0x10

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_2
    const/4 v4, 0x3

    .line 51
    invoke-interface {p1, v0, v4}, LVf/a;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    or-int/lit8 v6, v6, 0x8

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_3
    const/4 v4, 0x2

    .line 59
    invoke-interface {p1, v0, v4}, LVf/a;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    or-int/lit8 v6, v6, 0x4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_4
    invoke-interface {p1, v0, v1}, LVf/a;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    or-int/lit8 v6, v6, 0x2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_5
    invoke-interface {p1, v0, v2}, LVf/a;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    .line 74
    .line 75
    .line 76
    move-result-wide v11

    .line 77
    or-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_6
    move v3, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-interface {p1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 83
    .line 84
    .line 85
    new-instance v5, Lcom/moloco/sdk/internal/ilrd/o;

    .line 86
    .line 87
    invoke-direct/range {v5 .. v13}, Lcom/moloco/sdk/internal/ilrd/o;-><init>(IIIIIJI)V

    .line 88
    .line 89
    .line 90
    return-object v5

    .line 91
    :pswitch_data_0
    .packed-switch -0x1
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

    sget-object v0, Lcom/moloco/sdk/internal/ilrd/n;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ilrd/o;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ilrd/n;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-wide v1, p2, Lcom/moloco/sdk/internal/ilrd/o;->a:J

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V

    .line 18
    .line 19
    .line 20
    iget v1, p2, Lcom/moloco/sdk/internal/ilrd/o;->b:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-interface {p1, v2, v1, v0}, LVf/b;->t(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 24
    .line 25
    .line 26
    iget v1, p2, Lcom/moloco/sdk/internal/ilrd/o;->c:I

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-interface {p1, v2, v1, v0}, LVf/b;->t(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 30
    .line 31
    .line 32
    iget v1, p2, Lcom/moloco/sdk/internal/ilrd/o;->d:I

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-interface {p1, v2, v1, v0}, LVf/b;->t(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 36
    .line 37
    .line 38
    iget v1, p2, Lcom/moloco/sdk/internal/ilrd/o;->e:I

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-interface {p1, v2, v1, v0}, LVf/b;->t(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 42
    .line 43
    .line 44
    iget p2, p2, Lcom/moloco/sdk/internal/ilrd/o;->f:I

    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    invoke-interface {p1, v1, p2, v0}, LVf/b;->t(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
