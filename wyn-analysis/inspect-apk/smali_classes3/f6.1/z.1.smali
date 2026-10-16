.class public final Lf6/z;
.super Lf6/x;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lf6/x;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 7

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move v6, p4

    .line 2
    invoke-direct/range {v0 .. v6}, Lf6/x;-><init>(Ljava/lang/Object;IIJI)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lf6/z;
    .locals 9

    .line 1
    new-instance v0, Lf6/z;

    .line 2
    .line 3
    iget-object v1, p0, Lf6/x;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v2, p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v2, Lf6/x;

    .line 14
    .line 15
    iget v4, p0, Lf6/x;->b:I

    .line 16
    .line 17
    iget v5, p0, Lf6/x;->c:I

    .line 18
    .line 19
    iget-wide v6, p0, Lf6/x;->d:J

    .line 20
    .line 21
    iget v8, p0, Lf6/x;->e:I

    .line 22
    .line 23
    move-object v3, p1

    .line 24
    invoke-direct/range {v2 .. v8}, Lf6/x;-><init>(Ljava/lang/Object;IIJI)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v2}, Lf6/x;-><init>(Lf6/x;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
