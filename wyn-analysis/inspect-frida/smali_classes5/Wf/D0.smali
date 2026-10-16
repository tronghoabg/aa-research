.class public final LWf/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:LWf/D0;

.field public static final b:LWf/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LWf/D0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/D0;->a:LWf/D0;

    .line 7
    .line 8
    sget-object v0, LWf/p0;->a:LWf/p0;

    .line 9
    .line 10
    const-string v1, "kotlin.UShort"

    .line 11
    .line 12
    invoke-static {v1, v0}, LWf/b0;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)LWf/F;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, LWf/D0;->b:LWf/F;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LWf/D0;->b:LWf/F;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Decoder;->o(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Decoder;->p()S

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v0, Lef/z;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lef/z;-><init>(S)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    sget-object v0, LWf/D0;->b:LWf/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lef/z;

    .line 2
    .line 3
    iget-short p2, p2, Lef/z;->a:S

    .line 4
    .line 5
    sget-object v0, LWf/D0;->b:LWf/F;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p2}, Lkotlinx/serialization/encoding/Encoder;->q(S)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
