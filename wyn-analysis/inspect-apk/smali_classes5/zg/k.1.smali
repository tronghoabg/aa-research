.class public final Lzg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg/f;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lzg/k;->a:Ljava/lang/Object;

    .line 4
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lzg/k;->b:Ljava/lang/Cloneable;

    return-void
.end method

.method public constructor <init>(Lzg/l;Lzg/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzg/k;->b:Ljava/lang/Cloneable;

    iput-object p2, p0, Lzg/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Lzg/c;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lzg/k;->b:Ljava/lang/Cloneable;

    .line 2
    .line 3
    check-cast p1, Lzg/l;

    .line 4
    .line 5
    iget-object p1, p1, Lzg/l;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    new-instance v0, Lr9/k;

    .line 8
    .line 9
    iget-object v1, p0, Lzg/k;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lzg/f;

    .line 12
    .line 13
    const/4 v2, 0x7

    .line 14
    invoke-direct {v0, p0, v1, p2, v2}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onResponse(Lzg/c;Lzg/Q;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lzg/k;->b:Ljava/lang/Cloneable;

    .line 2
    .line 3
    check-cast p1, Lzg/l;

    .line 4
    .line 5
    iget-object p1, p1, Lzg/l;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    new-instance v0, Lr9/k;

    .line 8
    .line 9
    iget-object v1, p0, Lzg/k;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lzg/f;

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    invoke-direct {v0, p0, v1, p2, v2}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
