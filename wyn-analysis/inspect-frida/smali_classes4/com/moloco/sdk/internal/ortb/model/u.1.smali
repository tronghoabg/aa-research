.class public final Lcom/moloco/sdk/internal/ortb/model/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/e$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:Ljava/lang/String;

.field public final d:Lcom/moloco/sdk/internal/ortb/model/w;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/e$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/u;->Companion:Lcom/moloco/sdk/internal/ortb/model/e$b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/w;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    and-int/lit8 v0, p1, 0xb

    const/16 v1, 0xb

    const/4 v2, 0x0

    if-ne v1, v0, :cond_3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    iput p3, p0, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_0

    .line 2
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    :goto_0
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    .line 3
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    .line 4
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    return-void

    :cond_2
    iput-object p7, p0, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    return-void

    .line 5
    :cond_3
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/t;->b:LWf/d0;

    .line 6
    invoke-static {p1, v1, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v2
.end method

.method public constructor <init>(Ljava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/w;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "ext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 9
    iput p2, p0, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    .line 10
    iput-object p3, p0, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 12
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    .line 13
    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    return-void
.end method
