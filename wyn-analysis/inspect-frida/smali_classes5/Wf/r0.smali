.class public final LWf/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Lkotlinx/serialization/KSerializer;

.field public final b:Lkotlinx/serialization/KSerializer;

.field public final c:Lkotlinx/serialization/KSerializer;

.field public final d:LUf/g;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LWf/r0;->a:Lkotlinx/serialization/KSerializer;

    .line 5
    .line 6
    iput-object p2, p0, LWf/r0;->b:Lkotlinx/serialization/KSerializer;

    .line 7
    .line 8
    iput-object p3, p0, LWf/r0;->c:Lkotlinx/serialization/KSerializer;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    new-array p1, p1, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 12
    .line 13
    new-instance p2, LAf/r;

    .line 14
    .line 15
    const/16 p3, 0xc

    .line 16
    .line 17
    invoke-direct {p2, p0, p3}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const-string p3, "kotlin.Triple"

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, LFe/g;->r(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Ltf/l;)LUf/g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LWf/r0;->d:LUf/g;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LWf/r0;->d:LUf/g;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LWf/r0;->c:Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    iget-object v2, p0, LWf/r0;->b:Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    iget-object v3, p0, LWf/r0;->a:Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    sget-object v4, LWf/b0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    move-object v6, v5

    .line 17
    move-object v7, v6

    .line 18
    :goto_0
    invoke-interface {p1, v0}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    const/4 v9, -0x1

    .line 23
    if-eq v8, v9, :cond_3

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    if-eqz v8, :cond_2

    .line 27
    .line 28
    const/4 v10, 0x1

    .line 29
    if-eq v8, v10, :cond_1

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    if-ne v8, v7, :cond_0

    .line 33
    .line 34
    move-object v8, v1

    .line 35
    check-cast v8, Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    invoke-interface {p1, v0, v7, v8, v9}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, LSf/f;

    .line 43
    .line 44
    const-string v0, "Unexpected index "

    .line 45
    .line 46
    invoke-static {v8, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    move-object v6, v2

    .line 55
    check-cast v6, Lkotlinx/serialization/KSerializer;

    .line 56
    .line 57
    invoke-interface {p1, v0, v10, v6, v9}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v5, v3

    .line 63
    check-cast v5, Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-interface {p1, v0, v8, v5, v9}, LVf/a;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-interface {p1, v0}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 72
    .line 73
    .line 74
    if-eq v5, v4, :cond_6

    .line 75
    .line 76
    if-eq v6, v4, :cond_5

    .line 77
    .line 78
    if-eq v7, v4, :cond_4

    .line 79
    .line 80
    new-instance p1, Lef/q;

    .line 81
    .line 82
    invoke-direct {p1, v5, v6, v7}, Lef/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_4
    new-instance p1, LSf/f;

    .line 87
    .line 88
    const-string v0, "Element \'third\' is missing"

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_5
    new-instance p1, LSf/f;

    .line 95
    .line 96
    const-string v0, "Element \'second\' is missing"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_6
    new-instance p1, LSf/f;

    .line 103
    .line 104
    const-string v0, "Element \'first\' is missing"

    .line 105
    .line 106
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/r0;->d:LUf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lef/q;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LWf/r0;->d:LUf/g;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, LWf/r0;->a:Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    check-cast v1, Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iget-object v3, p2, Lef/q;->a:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {p1, v0, v2, v1, v3}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LWf/r0;->b:Lkotlinx/serialization/KSerializer;

    .line 25
    .line 26
    check-cast v1, Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    iget-object v3, p2, Lef/q;->b:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-interface {p1, v0, v2, v1, v3}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LWf/r0;->c:Lkotlinx/serialization/KSerializer;

    .line 35
    .line 36
    check-cast v1, Lkotlinx/serialization/KSerializer;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    iget-object p2, p2, Lef/q;->c:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-interface {p1, v0, v2, v1, p2}, LVf/b;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
