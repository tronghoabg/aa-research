.class public final Lcom/moloco/sdk/internal/ortb/model/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/i$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

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
    new-instance v1, Lcom/moloco/sdk/internal/ortb/model/i$b;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/moloco/sdk/internal/ortb/model/A;->Companion:Lcom/moloco/sdk/internal/ortb/model/i$b;

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
    sput-object v3, Lcom/moloco/sdk/internal/ortb/model/A;->h:[Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lef/u;Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;Le0/q;Le0/q;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x3d

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x3d

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/A;->a:Ljava/lang/String;

    .line 12
    .line 13
    and-int/lit8 p2, p1, 0x2

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/A;->b:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-object p3, p0, Lcom/moloco/sdk/internal/ortb/model/A;->b:Ljava/lang/String;

    .line 21
    .line 22
    :goto_0
    iget p2, p4, Lef/u;->a:I

    .line 23
    .line 24
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/A;->c:I

    .line 25
    .line 26
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/A;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 27
    .line 28
    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/A;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 29
    .line 30
    iget-wide p2, p7, Le0/q;->a:J

    .line 31
    .line 32
    iput-wide p2, p0, Lcom/moloco/sdk/internal/ortb/model/A;->f:J

    .line 33
    .line 34
    and-int/lit8 p1, p1, 0x40

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    iput-object v1, p0, Lcom/moloco/sdk/internal/ortb/model/A;->g:Le0/q;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iput-object p8, p0, Lcom/moloco/sdk/internal/ortb/model/A;->g:Le0/q;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/z;->b:LWf/d0;

    .line 45
    .line 46
    invoke-static {p1, v2, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method
