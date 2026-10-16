.class public final Lcom/moloco/sdk/internal/ortb/model/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/D$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Lcom/moloco/sdk/internal/ortb/model/X;

.field public final e:Lcom/moloco/sdk/internal/ortb/model/k;

.field public final f:J

.field public final g:Le0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lcom/moloco/sdk/internal/ortb/model/D$b;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/h;->Companion:Lcom/moloco/sdk/internal/ortb/model/D$b;

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
    const/4 v3, 0x7

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
    aput-object v0, v3, v4

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    aput-object v0, v3, v4

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    aput-object v1, v3, v4

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    aput-object v2, v3, v1

    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    aput-object v0, v3, v1

    .line 41
    .line 42
    const/4 v1, 0x6

    .line 43
    aput-object v0, v3, v1

    .line 44
    .line 45
    sput-object v3, Lcom/moloco/sdk/internal/ortb/model/h;->h:[Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(ILef/u;Lef/u;Lef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Le0/q;)V
    .locals 3

    and-int/lit8 v0, p1, 0x3f

    const/4 v1, 0x0

    const/16 v2, 0x3f

    if-ne v2, v0, :cond_1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget p2, p2, Lef/u;->a:I

    .line 3
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->a:I

    .line 4
    iget p2, p3, Lef/u;->a:I

    .line 5
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 6
    iget p2, p4, Lef/u;->a:I

    .line 7
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 8
    iget-wide p2, p7, Le0/q;->a:J

    .line 9
    iput-wide p2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_0

    .line 10
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    return-void

    :cond_0
    iput-object p8, p0, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    return-void

    .line 11
    :cond_1
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/g;->b:LWf/d0;

    .line 12
    invoke-static {p1, v2, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v1
.end method

.method public constructor <init>(J)V
    .locals 3

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/k;->b:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x5

    .line 14
    iput v2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->a:I

    const/16 v2, 0xa

    .line 15
    iput v2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    const/16 v2, 0x1e

    .line 16
    iput v2, p0, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 17
    iput-object v0, p0, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 18
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 19
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    return-void
.end method
