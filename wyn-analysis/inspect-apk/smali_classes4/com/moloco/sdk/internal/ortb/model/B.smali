.class public final Lcom/moloco/sdk/internal/ortb/model/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:Lcom/moloco/sdk/internal/ortb/model/B;

.field public static final b:LWf/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/B;->a:Lcom/moloco/sdk/internal/ortb/model/B;

    .line 7
    .line 8
    const-string v0, "Color"

    .line 9
    .line 10
    invoke-static {v0}, LFe/g;->d(Ljava/lang/String;)LWf/h0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/B;->b:LWf/h0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, Lkotlinx/serialization/encoding/Decoder;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Le0/z;->b(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    new-instance p1, Le0/q;

    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Le0/q;-><init>(J)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/B;->b:LWf/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Le0/q;

    .line 2
    .line 3
    iget-wide p1, p2, Le0/q;->a:J

    .line 4
    .line 5
    new-instance p1, LEf/G;

    .line 6
    .line 7
    const-string p2, "Color encoding is not supported"

    .line 8
    .line 9
    invoke-direct {p1, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p1
.end method
