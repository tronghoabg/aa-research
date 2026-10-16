.class public final synthetic Lcom/moloco/sdk/internal/ilrd/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ilrd/p;

.field public static final b:LWf/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ilrd/p;->a:Lcom/moloco/sdk/internal/ilrd/p;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sessionId"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "impressionCounts"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "isExpired"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "sessionStartTs"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lcom/moloco/sdk/internal/ilrd/p;->b:LWf/d0;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 3
    .line 4
    sget-object v1, LWf/q0;->a:LWf/q0;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/moloco/sdk/internal/ilrd/n;->a:Lcom/moloco/sdk/internal/ilrd/n;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LWf/f;->a:LWf/f;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LWf/O;->a:LWf/O;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ilrd/p;->b:LWf/d0;

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
    const/4 v3, 0x0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    move v7, v2

    .line 13
    move v10, v7

    .line 14
    move-object v8, v3

    .line 15
    move-object v9, v8

    .line 16
    move-wide v11, v4

    .line 17
    move v3, v1

    .line 18
    :goto_0
    if-eqz v3, :cond_5

    .line 19
    .line 20
    invoke-interface {p1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, -0x1

    .line 25
    if-eq v4, v5, :cond_4

    .line 26
    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    if-eq v4, v1, :cond_2

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    if-eq v4, v5, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    if-ne v4, v5, :cond_0

    .line 36
    .line 37
    invoke-interface {p1, v0, v5}, LVf/a;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v11

    .line 41
    or-int/lit8 v7, v7, 0x8

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p1, LSf/i;

    .line 45
    .line 46
    invoke-direct {p1, v4}, LSf/i;-><init>(I)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    invoke-interface {p1, v0, v5}, LVf/a;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    or-int/lit8 v7, v7, 0x4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    sget-object v4, Lcom/moloco/sdk/internal/ilrd/n;->a:Lcom/moloco/sdk/internal/ilrd/n;

    .line 58
    .line 59
    invoke-interface {p1, v0, v1, v4, v9}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    move-object v9, v4

    .line 64
    check-cast v9, Lcom/moloco/sdk/internal/ilrd/o;

    .line 65
    .line 66
    or-int/lit8 v7, v7, 0x2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-interface {p1, v0, v2}, LVf/a;->l(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    or-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move v3, v2

    .line 77
    goto :goto_0

    .line 78
    :cond_5
    invoke-interface {p1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Lcom/moloco/sdk/internal/ilrd/q;

    .line 82
    .line 83
    invoke-direct/range {v6 .. v12}, Lcom/moloco/sdk/internal/ilrd/q;-><init>(ILjava/lang/String;Lcom/moloco/sdk/internal/ilrd/o;ZJ)V

    .line 84
    .line 85
    .line 86
    return-object v6
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/moloco/sdk/internal/ilrd/p;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/moloco/sdk/internal/ilrd/q;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/ilrd/p;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lcom/moloco/sdk/internal/ilrd/q;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, v0, v2, v1}, LVf/b;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lcom/moloco/sdk/internal/ilrd/n;->a:Lcom/moloco/sdk/internal/ilrd/n;

    .line 21
    .line 22
    iget-object v2, p2, Lcom/moloco/sdk/internal/ilrd/q;->b:Lcom/moloco/sdk/internal/ilrd/o;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-interface {p1, v0, v3, v1, v2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p2, Lcom/moloco/sdk/internal/ilrd/q;->c:Z

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-interface {p1, v0, v2, v1}, LVf/b;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 32
    .line 33
    .line 34
    iget-wide v1, p2, Lcom/moloco/sdk/internal/ilrd/q;->d:J

    .line 35
    .line 36
    const/4 p2, 0x3

    .line 37
    invoke-interface {p1, v0, p2, v1, v2}, LVf/b;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final synthetic typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method
