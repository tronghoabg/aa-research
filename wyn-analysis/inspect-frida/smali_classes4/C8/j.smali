.class public final LC8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    sparse-switch p1, :sswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, LC8/j;->a:J

    const-wide/16 v0, -0x1

    .line 11
    iput-wide v0, p0, LC8/j;->b:J

    return-void

    .line 12
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    iput-wide v0, p0, LC8/j;->a:J

    .line 14
    iput-wide v0, p0, LC8/j;->b:J

    return-void

    .line 15
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3c

    .line 16
    iput-wide v0, p0, LC8/j;->a:J

    .line 17
    sget-wide v0, Laa/h;->i:J

    iput-wide v0, p0, LC8/j;->b:J

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, LC8/j;->a:J

    .line 3
    iput-wide p3, p0, LC8/j;->b:J

    return-void
.end method

.method public constructor <init>(JJI)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-wide p1, p0, LC8/j;->a:J

    .line 20
    iput-wide p3, p0, LC8/j;->b:J

    return-void
.end method

.method public constructor <init>(LC8/j;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-wide v0, p1, LC8/j;->a:J

    .line 6
    iput-wide v0, p0, LC8/j;->a:J

    .line 7
    iget-wide v0, p1, LC8/j;->b:J

    .line 8
    iput-wide v0, p0, LC8/j;->b:J

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, LC8/j;->b:J

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, "Minimum interval between fetches has to be a non-negative number. "

    .line 13
    .line 14
    const-string v2, " is an invalid argument"

    .line 15
    .line 16
    invoke-static {p1, p2, v1, v2}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method
