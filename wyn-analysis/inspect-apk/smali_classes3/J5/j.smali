.class public final LJ5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/w;


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, LJ5/j;->a:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LE5/T;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(JIIILJ5/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(ILY4/b;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, LY4/b;->B(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Lt6/i;IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, LJ5/j;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {p1, v0, v1, p2}, Lt6/i;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, -0x1

    .line 14
    if-ne p1, p2, :cond_1

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    return p2

    .line 19
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    return p1
.end method

.method public final e(ILY4/b;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, LY4/b;->B(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
