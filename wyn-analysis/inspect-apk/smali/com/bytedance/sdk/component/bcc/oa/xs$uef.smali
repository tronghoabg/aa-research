.class public Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/component/bcc/oa/xs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private bcc:Z

.field private cz:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private ivm:Z

.field private lw:J

.field private moa:I

.field private oa:I

.field private uef:Ljava/lang/String;

.field private xs:Ljava/util/concurrent/TimeUnit;

.field private yo:I

.field private zjm:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "cache"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    iput v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    .line 10
    .line 11
    const/16 v0, 0x64

    .line 12
    .line 13
    iput v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa:I

    .line 17
    .line 18
    const-wide/16 v1, 0x7530

    .line 19
    .line 20
    iput-wide v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw:J

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->ivm:Z

    .line 23
    .line 24
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    iput-object v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->xs:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->bcc:Z

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->cz:Ljava/util/concurrent/BlockingQueue;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->zjm:Ljava/util/concurrent/ThreadFactory;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->bcc:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Ljava/util/concurrent/ThreadFactory;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->zjm:Ljava/util/concurrent/ThreadFactory;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->cz:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw:J

    return-wide v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    return p0
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Ljava/util/concurrent/TimeUnit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->xs:Ljava/util/concurrent/TimeUnit;

    return-object p0
.end method

.method public static synthetic zjm(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->ivm:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 1
    return-object p0
.end method

.method public moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 1
    return-object p0
.end method

.method public oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    return-object p0
.end method

.method public oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->bcc:Z

    return-object p0
.end method

.method public uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    return-object p0
.end method

.method public uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw:J

    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef:Ljava/lang/String;

    return-object p0
.end method

.method public uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->ivm:Z

    return-object p0
.end method

.method public uef()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->zjm:Ljava/util/concurrent/ThreadFactory;

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Lcom/bytedance/sdk/component/bcc/oa/lw;

    iget-object v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/bcc/oa/lw;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->zjm:Ljava/util/concurrent/ThreadFactory;

    .line 8
    :cond_0
    iget v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    if-gez v0, :cond_1

    const/16 v0, 0x8

    .line 9
    iput v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    .line 10
    :cond_1
    iget v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    if-nez v0, :cond_2

    .line 11
    new-instance v0, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v0}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->cz:Ljava/util/concurrent/BlockingQueue;

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->cz:Ljava/util/concurrent/BlockingQueue;

    if-nez v0, :cond_3

    .line 13
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->cz:Ljava/util/concurrent/BlockingQueue;

    .line 14
    :cond_3
    iget v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_4

    .line 15
    iput v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    .line 16
    :cond_4
    iget v0, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    iget v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa:I

    if-ge v0, v1, :cond_5

    .line 17
    iput v1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo:I

    .line 18
    :cond_5
    new-instance v0, Lcom/bytedance/sdk/component/bcc/oa/xs;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/component/bcc/oa/xs;-><init>(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;Lcom/bytedance/sdk/component/bcc/oa/xs$1;)V

    return-object v0
.end method

.method public yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa:I

    return-object p0
.end method
