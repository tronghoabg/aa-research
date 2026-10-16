.class public abstract Lhb/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/util/Map$Entry;

.field public d:Ljava/util/Map$Entry;

.field public final synthetic e:Ljava/util/AbstractMap;


# direct methods
.method public constructor <init>(Lhb/H;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhb/F;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 6
    iget-object v0, p1, Lhb/H;->c:Lhb/G;

    iget-object v0, v0, Lhb/G;->d:Lhb/G;

    iput-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 8
    iget p1, p1, Lhb/H;->e:I

    iput p1, p0, Lhb/F;->b:I

    return-void
.end method

.method public constructor <init>(Lna/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhb/F;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 2
    iget-object v0, p1, Lna/l;->f:Lna/k;

    iget-object v0, v0, Lna/k;->d:Lna/k;

    iput-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 4
    iget p1, p1, Lna/l;->e:I

    iput p1, p0, Lhb/F;->b:I

    return-void
.end method


# virtual methods
.method public a()Lhb/G;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 2
    .line 3
    check-cast v0, Lhb/G;

    .line 4
    .line 5
    iget-object v1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 6
    .line 7
    check-cast v1, Lhb/H;

    .line 8
    .line 9
    iget-object v2, v1, Lhb/H;->c:Lhb/G;

    .line 10
    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    iget v1, v1, Lhb/H;->e:I

    .line 14
    .line 15
    iget v2, p0, Lhb/F;->b:I

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lhb/G;->d:Lhb/G;

    .line 20
    .line 21
    iput-object v1, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 22
    .line 23
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public b()Lna/k;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 2
    .line 3
    check-cast v0, Lna/k;

    .line 4
    .line 5
    iget-object v1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 6
    .line 7
    check-cast v1, Lna/l;

    .line 8
    .line 9
    iget-object v2, v1, Lna/l;->f:Lna/k;

    .line 10
    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    iget v1, v1, Lna/l;->e:I

    .line 14
    .line 15
    iget v2, p0, Lhb/F;->b:I

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lna/k;->d:Lna/k;

    .line 20
    .line 21
    iput-object v1, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 22
    .line 23
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lhb/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 7
    .line 8
    check-cast v0, Lna/k;

    .line 9
    .line 10
    iget-object v1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 11
    .line 12
    check-cast v1, Lna/l;

    .line 13
    .line 14
    iget-object v1, v1, Lna/l;->f:Lna/k;

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lhb/F;->c:Ljava/util/Map$Entry;

    .line 23
    .line 24
    check-cast v0, Lhb/G;

    .line 25
    .line 26
    iget-object v1, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 27
    .line 28
    check-cast v1, Lhb/H;

    .line 29
    .line 30
    iget-object v1, v1, Lhb/H;->c:Lhb/G;

    .line 31
    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    :goto_1
    return v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lhb/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lhb/F;->b()Lna/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lhb/F;->a()Lhb/G;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Lhb/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 7
    .line 8
    check-cast v0, Lna/k;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 14
    .line 15
    check-cast v2, Lna/l;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Lna/l;->d(Lna/k;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 22
    .line 23
    iget v0, v2, Lna/l;->e:I

    .line 24
    .line 25
    iput v0, p0, Lhb/F;->b:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :pswitch_0
    iget-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 35
    .line 36
    check-cast v0, Lhb/G;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iget-object v2, p0, Lhb/F;->e:Ljava/util/AbstractMap;

    .line 42
    .line 43
    check-cast v2, Lhb/H;

    .line 44
    .line 45
    invoke-virtual {v2, v0, v1}, Lhb/H;->d(Lhb/G;Z)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lhb/F;->d:Ljava/util/Map$Entry;

    .line 50
    .line 51
    iget v0, v2, Lhb/H;->e:I

    .line 52
    .line 53
    iput v0, p0, Lhb/F;->b:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
