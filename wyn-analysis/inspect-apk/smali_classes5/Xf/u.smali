.class public final LXf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:LXf/u;

.field public static final b:LXf/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LXf/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LXf/u;->a:LXf/u;

    .line 7
    .line 8
    sget-object v0, LXf/t;->b:LXf/t;

    .line 9
    .line 10
    sput-object v0, LXf/u;->b:LXf/t;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, LFe/c;->i(Lkotlinx/serialization/encoding/Decoder;)LXf/i;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlinx/serialization/json/c;

    .line 5
    .line 6
    sget-object v1, LWf/q0;->a:LWf/q0;

    .line 7
    .line 8
    sget-object v1, LXf/k;->a:LXf/k;

    .line 9
    .line 10
    invoke-static {v1}, Lff/B;->a(Lkotlinx/serialization/KSerializer;)LWf/E;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p1}, LWf/a;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/Map;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    sget-object v0, LXf/u;->b:LXf/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lkotlinx/serialization/json/c;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LFe/c;->j(Lkotlinx/serialization/encoding/Encoder;)LXf/m;

    .line 9
    .line 10
    .line 11
    sget-object v0, LWf/q0;->a:LWf/q0;

    .line 12
    .line 13
    sget-object v0, LXf/k;->a:LXf/k;

    .line 14
    .line 15
    invoke-static {v0}, Lff/B;->a(Lkotlinx/serialization/KSerializer;)LWf/E;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1, p2}, LWf/E;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
