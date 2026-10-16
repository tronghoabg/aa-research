.class public final LS5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/t;


# instance fields
.field public final synthetic a:LN2/b;


# direct methods
.method public constructor <init>(LN2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS5/a;->a:LN2/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(J)LJ5/s;
    .locals 11

    .line 1
    iget-object v0, p0, LS5/a;->a:LN2/b;

    .line 2
    .line 3
    iget-object v1, v0, LN2/b;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN2/i;

    .line 6
    .line 7
    iget v1, v1, LN2/i;->f:I

    .line 8
    .line 9
    int-to-long v1, v1

    .line 10
    mul-long/2addr v1, p1

    .line 11
    const-wide/32 v3, 0xf4240

    .line 12
    .line 13
    .line 14
    div-long/2addr v1, v3

    .line 15
    iget-wide v3, v0, LN2/b;->c:J

    .line 16
    .line 17
    iget-wide v7, v0, LN2/b;->b:J

    .line 18
    .line 19
    sub-long v5, v3, v7

    .line 20
    .line 21
    mul-long/2addr v5, v1

    .line 22
    iget-wide v0, v0, LN2/b;->e:J

    .line 23
    .line 24
    div-long/2addr v5, v0

    .line 25
    add-long/2addr v5, v7

    .line 26
    const-wide/16 v0, 0x7530

    .line 27
    .line 28
    sub-long/2addr v5, v0

    .line 29
    const-wide/16 v0, 0x1

    .line 30
    .line 31
    sub-long v9, v3, v0

    .line 32
    .line 33
    invoke-static/range {v5 .. v10}, Lu6/v;->i(JJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    new-instance v2, LJ5/s;

    .line 38
    .line 39
    new-instance v3, LJ5/u;

    .line 40
    .line 41
    invoke-direct {v3, p1, p2, v0, v1}, LJ5/u;-><init>(JJ)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v3, v3}, LJ5/s;-><init>(LJ5/u;LJ5/u;)V

    .line 45
    .line 46
    .line 47
    return-object v2
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final f()J
    .locals 6

    .line 1
    iget-object v0, p0, LS5/a;->a:LN2/b;

    .line 2
    .line 3
    iget-object v1, v0, LN2/b;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN2/i;

    .line 6
    .line 7
    iget-wide v2, v0, LN2/b;->e:J

    .line 8
    .line 9
    const-wide/32 v4, 0xf4240

    .line 10
    .line 11
    .line 12
    mul-long/2addr v2, v4

    .line 13
    iget v0, v1, LN2/i;->f:I

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    div-long/2addr v2, v0

    .line 17
    return-wide v2
.end method
