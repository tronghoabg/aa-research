.class public final Lcom/moloco/sdk/internal/ortb/model/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/z$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/moloco/sdk/internal/ortb/model/h;

.field public final b:Lcom/moloco/sdk/internal/ortb/model/h;

.field public final c:Lcom/moloco/sdk/internal/ortb/model/b;

.field public final d:Lcom/moloco/sdk/internal/ortb/model/f0;

.field public final e:Lcom/moloco/sdk/internal/ortb/model/A;

.field public final f:Z

.field public final g:Lcom/moloco/sdk/internal/ortb/model/q;

.field public final h:Lcom/moloco/sdk/internal/ortb/model/j;

.field public final i:Lcom/moloco/sdk/internal/ortb/model/F;

.field public final j:Lcom/moloco/sdk/internal/ortb/model/D;

.field public final k:Lcom/moloco/sdk/internal/ortb/model/m;

.field public final l:Lcom/moloco/sdk/internal/ortb/model/o;

.field public final m:Lcom/moloco/sdk/internal/ortb/model/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/z$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/h0;->Companion:Lcom/moloco/sdk/internal/ortb/model/z$b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/f0;Lcom/moloco/sdk/internal/ortb/model/A;ZLcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/j;Lcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/o;Lcom/moloco/sdk/internal/ortb/model/Z;)V
    .locals 3

    and-int/lit8 v0, p1, 0x2a

    const/16 v1, 0x2a

    const/4 v2, 0x0

    if-ne v1, v0, :cond_a

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 2
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

    :goto_0
    iput-object p3, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->b:Lcom/moloco/sdk/internal/ortb/model/h;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 3
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->c:Lcom/moloco/sdk/internal/ortb/model/b;

    goto :goto_1

    :cond_1
    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->c:Lcom/moloco/sdk/internal/ortb/model/b;

    :goto_1
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    .line 4
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->e:Lcom/moloco/sdk/internal/ortb/model/A;

    goto :goto_2

    :cond_2
    iput-object p6, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->e:Lcom/moloco/sdk/internal/ortb/model/A;

    :goto_2
    iput-boolean p7, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->f:Z

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    .line 5
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->g:Lcom/moloco/sdk/internal/ortb/model/q;

    goto :goto_3

    :cond_3
    iput-object p8, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->g:Lcom/moloco/sdk/internal/ortb/model/q;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    .line 6
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->h:Lcom/moloco/sdk/internal/ortb/model/j;

    goto :goto_4

    :cond_4
    iput-object p9, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->h:Lcom/moloco/sdk/internal/ortb/model/j;

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    .line 7
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    goto :goto_5

    :cond_5
    iput-object p10, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_6

    .line 8
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    goto :goto_6

    :cond_6
    iput-object p11, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    :goto_6
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_7

    .line 9
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->k:Lcom/moloco/sdk/internal/ortb/model/m;

    goto :goto_7

    :cond_7
    iput-object p12, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->k:Lcom/moloco/sdk/internal/ortb/model/m;

    :goto_7
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_8

    .line 10
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->l:Lcom/moloco/sdk/internal/ortb/model/o;

    goto :goto_8

    :cond_8
    move-object/from16 p2, p13

    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->l:Lcom/moloco/sdk/internal/ortb/model/o;

    :goto_8
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_9

    .line 11
    iput-object v2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    return-void

    :cond_9
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    return-void

    .line 12
    :cond_a
    sget-object p2, Lcom/moloco/sdk/internal/ortb/model/g0;->b:LWf/d0;

    .line 13
    invoke-static {p1, v1, p2}, LWf/b0;->k(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v2
.end method

.method public constructor <init>(Lcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/f0;Lcom/moloco/sdk/internal/ortb/model/q;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->b:Lcom/moloco/sdk/internal/ortb/model/h;

    .line 17
    iput-object p3, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->c:Lcom/moloco/sdk/internal/ortb/model/b;

    .line 18
    iput-object p4, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->e:Lcom/moloco/sdk/internal/ortb/model/A;

    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->f:Z

    .line 21
    iput-object p5, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->g:Lcom/moloco/sdk/internal/ortb/model/q;

    .line 22
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->h:Lcom/moloco/sdk/internal/ortb/model/j;

    .line 23
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    .line 24
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 25
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->k:Lcom/moloco/sdk/internal/ortb/model/m;

    .line 26
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->l:Lcom/moloco/sdk/internal/ortb/model/o;

    .line 27
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    return-void
.end method
