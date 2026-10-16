.class public final Lcom/moloco/sdk/internal/ortb/model/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/y$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Lcom/moloco/sdk/internal/ortb/model/X;

.field public final d:Lcom/moloco/sdk/internal/ortb/model/k;

.field public final e:J

.field public final f:Lef/u;

.field public final g:Le0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lcom/moloco/sdk/internal/ortb/model/y$b;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/f0;->Companion:Lcom/moloco/sdk/internal/ortb/model/y$b;

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
    aput-object v1, v3, v4

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    aput-object v2, v3, v1

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    aput-object v0, v3, v1

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
    sput-object v3, Lcom/moloco/sdk/internal/ortb/model/f0;->h:[Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(IZLef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Lef/u;Le0/q;)V
    .locals 3

    and-int/lit8 v0, p1, 0x1f

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-ne v2, v0, :cond_2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->a:Z

    .line 2
    iget p2, p3, Lef/u;->a:I

    .line 3
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->b:I

    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->d:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 4
    iget-wide p2, p6, Le0/q;->a:J

    .line 5
    iput-wide p2, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->e:J

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_0

    .line 6
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->f:Lef/u;

    goto :goto_0

    :cond_0
    iput-object p7, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->f:Lef/u;

    :goto_0
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    .line 7
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->g:Le0/q;

    return-void

    :cond_1
    iput-object p8, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->g:Le0/q;

    return-void

    .line 8
    :cond_2
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/e0;->b:LWf/d0;

    .line 9
    invoke-static {p1, v2, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v1
.end method

.method public constructor <init>(J)V
    .locals 3

    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/k;->b:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 11
    iput-boolean v2, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->a:Z

    const/16 v2, 0xa

    .line 12
    iput v2, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->b:I

    .line 13
    iput-object v0, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 14
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->d:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 15
    iput-wide p1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->e:J

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->f:Lef/u;

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/f0;->g:Le0/q;

    return-void
.end method
