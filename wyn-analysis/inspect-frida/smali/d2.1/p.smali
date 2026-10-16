.class public final Ld2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ld2/p;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:LQ1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ld2/p;

    .line 2
    .line 3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Ld2/p;-><init>(JJJ)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ld2/p;->e:Ld2/p;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ld2/p;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Ld2/p;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Ld2/p;->c:J

    .line 9
    .line 10
    new-instance p1, LQ1/t;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, LQ1/t;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ld2/p;->d:LQ1/t;

    .line 17
    .line 18
    return-void
.end method
