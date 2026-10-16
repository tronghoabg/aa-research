.class public final LWe/i;
.super LHe/m;
.source "SourceFile"


# static fields
.field public static final b:LWe/l;


# instance fields
.field public final a:LWe/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "rx2.newthread-priority"

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, LWe/l;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, "RxNewThreadScheduler"

    .line 27
    .line 28
    invoke-direct {v1, v3, v0, v2}, LWe/l;-><init>(Ljava/lang/String;IZ)V

    .line 29
    .line 30
    .line 31
    sput-object v1, LWe/i;->b:LWe/l;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LWe/i;->b:LWe/l;

    .line 5
    .line 6
    iput-object v0, p0, LWe/i;->a:LWe/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LHe/l;
    .locals 2

    .line 1
    new-instance v0, LWe/j;

    .line 2
    .line 3
    iget-object v1, p0, LWe/i;->a:LWe/l;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LWe/j;-><init>(LWe/l;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
