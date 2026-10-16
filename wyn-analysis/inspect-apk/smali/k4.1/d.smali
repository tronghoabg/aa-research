.class public abstract Lk4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh4/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lh4/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk4/d;->a:Lh4/b;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Lh4/h;)Z
    .locals 3

    .line 1
    iget v0, p0, Lh4/h;->v:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lh4/h;->t:Lh4/c;

    .line 16
    .line 17
    iget-object v0, v0, Lh4/c;->a:Li4/g;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object p0, p0, Lh4/h;->r:Li4/g;

    .line 22
    .line 23
    instance-of p0, p0, Li4/c;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p0, LE5/Q;

    .line 29
    .line 30
    const/16 v0, 0x9

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    return v1

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0
.end method
