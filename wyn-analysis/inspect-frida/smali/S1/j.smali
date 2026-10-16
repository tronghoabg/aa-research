.class public final LS1/j;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final a:LS1/h;

.field public final b:LS1/k;

.field public final c:[B

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(LS1/h;LS1/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LS1/j;->d:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LS1/j;->e:Z

    .line 8
    .line 9
    iput-object p1, p0, LS1/j;->a:LS1/h;

    .line 10
    .line 11
    iput-object p2, p0, LS1/j;->b:LS1/k;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, LS1/j;->c:[B

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LS1/j;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LS1/j;->a:LS1/h;

    .line 6
    .line 7
    invoke-interface {v0}, LS1/h;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LS1/j;->e:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    .line 1
    iget-object v0, p0, LS1/j;->c:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, LS1/j;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return v3

    .line 2
    :cond_0
    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, LS1/j;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 4
    iget-boolean v0, p0, LS1/j;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 5
    iget-boolean v0, p0, LS1/j;->d:Z

    iget-object v2, p0, LS1/j;->a:LS1/h;

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, LS1/j;->b:LS1/k;

    invoke-interface {v2, v0}, LS1/h;->y(LS1/k;)J

    .line 7
    iput-boolean v1, p0, LS1/j;->d:Z

    .line 8
    :cond_0
    invoke-interface {v2, p1, p2, p3}, LN1/g;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    return p1
.end method
