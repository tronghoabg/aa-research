.class public final LK/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/t;


# static fields
.field public static final a:LK/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK/u;->a:LK/u;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LN/o;)J
    .locals 6

    .line 1
    const v0, 0x20d0860f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, LK/i;->a:LN/D;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Le0/q;

    .line 14
    .line 15
    iget-wide v0, v0, Le0/q;->a:J

    .line 16
    .line 17
    sget-object v2, LK/g;->a:LN/L0;

    .line 18
    .line 19
    invoke-virtual {p1, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, LK/e;

    .line 24
    .line 25
    invoke-virtual {v2}, LK/e;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v0, v1}, Le0/z;->l(J)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    float-to-double v2, v3

    .line 36
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 37
    .line 38
    cmpg-double v2, v2, v4

    .line 39
    .line 40
    if-gez v2, :cond_0

    .line 41
    .line 42
    sget-wide v0, Le0/q;->d:J

    .line 43
    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p1, v2}, LN/o;->p(Z)V

    .line 46
    .line 47
    .line 48
    return-wide v0
.end method

.method public final b(LN/o;)LM/g;
    .locals 4

    .line 1
    const v0, -0x549fdb56

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, LK/i;->a:LN/D;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Le0/q;

    .line 14
    .line 15
    iget-wide v0, v0, Le0/q;->a:J

    .line 16
    .line 17
    sget-object v2, LK/g;->a:LN/L0;

    .line 18
    .line 19
    invoke-virtual {p1, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, LK/e;

    .line 24
    .line 25
    invoke-virtual {v2}, LK/e;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {v0, v1}, Le0/z;->l(J)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    float-to-double v0, v0

    .line 36
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 37
    .line 38
    cmpl-double v0, v0, v2

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    .line 42
    sget-object v0, LM/v;->b:LM/g;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v0, LM/v;->c:LM/g;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object v0, LM/v;->d:LM/g;

    .line 49
    .line 50
    :goto_0
    const/4 v1, 0x0

    .line 51
    invoke-virtual {p1, v1}, LN/o;->p(Z)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method
