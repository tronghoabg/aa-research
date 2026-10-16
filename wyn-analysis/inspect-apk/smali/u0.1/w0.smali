.class public final Lu0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/d;
.implements Lokhttp3/Callback;


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LP/d;

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/ref/Reference;

    invoke-direct {v0, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 5
    iput-object v0, p0, Lu0/w0;->a:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lu0/w0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lu0/w0;->a:Ljava/lang/Object;

    iput-object p1, p0, Lu0/w0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lu0/w0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lu0/w0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lw/a;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/w0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(IIII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/w0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw/a;

    .line 4
    .line 5
    iget-object v1, v0, Lw/a;->d:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lw/a;->c:Landroid/graphics/Rect;

    .line 11
    .line 12
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    add-int/2addr p1, v2

    .line 15
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    add-int/2addr p2, v2

    .line 18
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    add-int/2addr p3, v2

    .line 21
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 22
    .line 23
    add-int/2addr p4, v1

    .line 24
    invoke-static {v0, p1, p2, p3, p4}, Lw/a;->a(Lw/a;IIII)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public d(Ljava/nio/ByteBuffer;Lmc/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu0/w0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/X7;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lu0/w0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Luc/b;

    .line 8
    .line 9
    iget-object v2, v0, LVa/X7;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Luc/n;

    .line 12
    .line 13
    invoke-interface {v2, p1}, Luc/n;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v2, Lba/a;

    .line 18
    .line 19
    const/16 v3, 0x1a

    .line 20
    .line 21
    invoke-direct {v2, v3, p0, p2}, Lba/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, p1, v2}, Luc/b;->e(Ljava/lang/Object;Lba/a;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception p1

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "BasicMessageChannel#"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, LVa/X7;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "Failed to handle message"

    .line 48
    .line 49
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p2, p1}, Lmc/g;->a(Ljava/nio/ByteBuffer;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lu0/w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lzg/f;

    .line 4
    .line 5
    iget-object v0, p0, Lu0/w0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lzg/w;

    .line 8
    .line 9
    invoke-interface {p1, v0, p2}, Lzg/f;->onFailure(Lzg/c;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lzg/a0;->o(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lu0/w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lzg/f;

    .line 4
    .line 5
    iget-object v0, p0, Lu0/w0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lzg/w;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, p2}, Lzg/w;->c(Lokhttp3/Response;)Lzg/Q;

    .line 10
    .line 11
    .line 12
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    invoke-interface {p1, v0, p2}, Lzg/f;->onResponse(Lzg/c;Lzg/Q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-static {p1}, Lzg/a0;->o(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_1
    move-exception p2

    .line 26
    invoke-static {p2}, Lzg/a0;->o(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-interface {p1, v0, p2}, Lzg/f;->onFailure(Lzg/c;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_2
    move-exception p1

    .line 34
    invoke-static {p1}, Lzg/a0;->o(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method
