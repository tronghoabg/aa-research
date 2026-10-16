.class public abstract Lnet/zetetic/database/AbstractWindowedCursor;
.super Lnet/zetetic/database/AbstractCursor;
.source "SourceFile"


# instance fields
.field public k:Lnet/zetetic/database/CursorWindow;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/zetetic/database/AbstractCursor;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/zetetic/database/AbstractCursor;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 2
    .line 3
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->z(II)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p2, Landroid/database/CharArrayBuffer;->data:[C

    .line 16
    .line 17
    array-length p1, p1

    .line 18
    iput p1, p2, Landroid/database/CharArrayBuffer;->sizeCopied:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string p2, "CharArrayBuffer should not be null"

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public final d()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 3
    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Landroid/database/StaleDataException;

    .line 20
    .line 21
    const-string v1, "Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method."

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/database/StaleDataException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    new-instance v0, Landroid/database/CursorIndexOutOfBoundsException;

    .line 28
    .line 29
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 30
    .line 31
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-direct {v0, v1, v2}, Landroid/database/CursorIndexOutOfBoundsException;-><init>(II)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final getBlob(I)[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->i(II)[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final getDouble(I)D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->o(II)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final getFloat(I)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->o(II)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    double-to-float p1, v0

    .line 13
    return p1
.end method

.method public final getInt(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->w(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    long-to-int p1, v0

    .line 13
    return p1
.end method

.method public final getLong(I)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->w(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final getShort(I)S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->w(II)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    long-to-int p1, v0

    .line 13
    int-to-short p1, p1

    .line 14
    return p1
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 5
    .line 6
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->z(II)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final getType(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 2
    .line 3
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->B(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final isNull(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 2
    .line 3
    iget v1, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lnet/zetetic/database/CursorWindow;->B(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method
