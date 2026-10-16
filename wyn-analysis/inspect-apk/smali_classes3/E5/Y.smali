.class public final LE5/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LE5/Y;->a:J

    .line 10
    .line 11
    iput-wide v0, p0, LE5/Y;->b:J

    .line 12
    .line 13
    iput-wide v0, p0, LE5/Y;->c:J

    .line 14
    .line 15
    const v0, -0x800001

    .line 16
    .line 17
    .line 18
    iput v0, p0, LE5/Y;->d:F

    .line 19
    .line 20
    iput v0, p0, LE5/Y;->e:F

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()LE5/Z;
    .locals 9

    .line 1
    new-instance v0, LE5/Z;

    .line 2
    .line 3
    iget-wide v1, p0, LE5/Y;->a:J

    .line 4
    .line 5
    iget-wide v3, p0, LE5/Y;->b:J

    .line 6
    .line 7
    iget-wide v5, p0, LE5/Y;->c:J

    .line 8
    .line 9
    iget v7, p0, LE5/Y;->d:F

    .line 10
    .line 11
    iget v8, p0, LE5/Y;->e:F

    .line 12
    .line 13
    invoke-direct/range {v0 .. v8}, LE5/Z;-><init>(JJJFF)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public b()LN1/s;
    .locals 1

    .line 1
    new-instance v0, LN1/s;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LN1/s;-><init>(LE5/Y;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
