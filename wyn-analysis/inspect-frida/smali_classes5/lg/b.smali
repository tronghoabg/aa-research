.class public final Llg/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljg/a;

.field public final c:Ljg/b;

.field public d:J

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/applovin/impl/Z0;Lcom/unity3d/services/core/webview/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Llg/b;->a:I

    .line 8
    .line 9
    iput-object p1, p0, Llg/b;->b:Ljg/a;

    .line 10
    .line 11
    iput-object p2, p0, Llg/b;->c:Ljg/b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Llg/b;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Llg/b;->d:J

    .line 6
    .line 7
    int-to-long v2, p1

    .line 8
    add-long/2addr v0, v2

    .line 9
    iget p1, p0, Llg/b;->a:I

    .line 10
    .line 11
    int-to-long v2, p1

    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-lez p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Llg/b;->e:Z

    .line 18
    .line 19
    iget-object p1, p0, Llg/b;->b:Ljg/a;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Ljg/a;->accept(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Llg/b;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    :catch_0
    iget-object v0, p0, Llg/b;->c:Ljg/b;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljg/b;->h(Llg/b;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/io/OutputStream;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Llg/b;->c:Ljg/b;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljg/b;->h(Llg/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/OutputStream;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final write(I)V
    .locals 4

    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, Llg/b;->a(I)V

    .line 10
    iget-object v0, p0, Llg/b;->c:Ljg/b;

    invoke-interface {v0, p0}, Ljg/b;->h(Llg/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 11
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 12
    iget-wide v0, p0, Llg/b;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Llg/b;->d:J

    return-void
.end method

.method public final write([B)V
    .locals 4

    .line 1
    array-length v0, p1

    invoke-virtual {p0, v0}, Llg/b;->a(I)V

    .line 2
    iget-object v0, p0, Llg/b;->c:Ljg/b;

    invoke-interface {v0, p0}, Ljg/b;->h(Llg/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 3
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 4
    iget-wide v0, p0, Llg/b;->d:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Llg/b;->d:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 5
    invoke-virtual {p0, p3}, Llg/b;->a(I)V

    .line 6
    iget-object v0, p0, Llg/b;->c:Ljg/b;

    invoke-interface {v0, p0}, Ljg/b;->h(Llg/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 7
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 8
    iget-wide p1, p0, Llg/b;->d:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Llg/b;->d:J

    return-void
.end method
