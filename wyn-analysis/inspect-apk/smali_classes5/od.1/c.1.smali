.class public abstract Lod/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public B()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public abstract D(I)V
.end method

.method public final a(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lod/c;->z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt v0, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lod/q1;

    .line 2
    .line 3
    return v0
.end method

.method public abstract h(I)Lod/c;
.end method

.method public abstract i(II[B)V
.end method

.method public abstract o(Ljava/io/OutputStream;I)V
.end method

.method public abstract w(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract y()I
.end method

.method public abstract z()I
.end method
