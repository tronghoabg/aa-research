.class public final LWf/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final b:LWf/E0;


# instance fields
.field public final synthetic a:LWf/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LWf/E0;

    .line 2
    .line 3
    invoke-direct {v0}, LWf/E0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/E0;->b:LWf/E0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LWf/Y;

    .line 5
    .line 6
    invoke-direct {v0}, LWf/Y;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LWf/E0;->a:LWf/Y;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/E0;->a:LWf/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LWf/Y;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 7
    .line 8
    return-object p1
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/E0;->a:LWf/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/Y;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lef/C;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LWf/E0;->a:LWf/Y;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, LWf/Y;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
