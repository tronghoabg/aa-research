.class public final Lcom/moloco/sdk/internal/ortb/model/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/A$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:I

.field public final b:Lcom/moloco/sdk/internal/ortb/model/X;

.field public final c:Lcom/moloco/sdk/internal/ortb/model/k;

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lcom/moloco/sdk/internal/ortb/model/A$b;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/b;->Companion:Lcom/moloco/sdk/internal/ortb/model/A$b;

    .line 8
    .line 9
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/X;->Companion:Lcom/moloco/sdk/internal/ortb/model/u$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ortb/model/u$a;->serializer()Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lcom/moloco/sdk/internal/ortb/model/k;->Companion:Lcom/moloco/sdk/internal/ortb/model/F$a;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/moloco/sdk/internal/ortb/model/F$a;->serializer()Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x4

    .line 22
    new-array v3, v3, [Lkotlinx/serialization/KSerializer;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    aput-object v1, v3, v4

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aput-object v2, v3, v1

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    aput-object v0, v3, v1

    .line 35
    .line 36
    sput-object v3, Lcom/moloco/sdk/internal/ortb/model/b;->e:[Lkotlinx/serialization/KSerializer;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(ILef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;)V
    .locals 2

    and-int/lit8 v0, p1, 0xf

    const/16 v1, 0xf

    if-ne v1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget p1, p2, Lef/u;->a:I

    .line 3
    iput p1, p0, Lcom/moloco/sdk/internal/ortb/model/b;->a:I

    iput-object p3, p0, Lcom/moloco/sdk/internal/ortb/model/b;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/b;->c:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 4
    iget-wide p1, p5, Le0/q;->a:J

    .line 5
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/b;->d:J

    return-void

    .line 6
    :cond_0
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/a;->b:LWf/d0;

    .line 7
    invoke-static {p1, v1, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(J)V
    .locals 3

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/k;->d:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lcom/moloco/sdk/internal/ortb/model/b;->a:I

    .line 10
    iput-object v0, p0, Lcom/moloco/sdk/internal/ortb/model/b;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 11
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/b;->c:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 12
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/b;->d:J

    return-void
.end method
